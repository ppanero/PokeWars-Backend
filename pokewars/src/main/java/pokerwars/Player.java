package pokewars;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Player {

  private @Id @GeneratedValue Long id;
  private String name;
  private Integer hp;
  private Enum status;
  private Enum role; // hero or enemy

  Player() {}

  Player(String name, Integer hp, Enum status, Enum role) {

    this.name = name;
    this.hp = hp;
    this.status = status;
    this.role = role;
  }

  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public Integer getHp() {
    return this.hp;
  }

  public Enum getStatus() {
    return this.status;
  }

  public Enum getRole() {
    return this.role;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setHp(Integer hp) {
    this.hp = hp;
  }

  public void setStatus(Enum status) {
    this.status = status;
  }

  public void setRole(Enum role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Player))
      return false;
    Player player = (Player) o;
    return Objects.equals(this.id, player.id) && Objects.equals(this.name, player.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name);
  }

  @Override
  public String toString() {
    return "Player{" + "id=" + this.id + ", name='" + this.name + '\'' + ", hp='" + this.hp + '\'' + '}';
  }
}