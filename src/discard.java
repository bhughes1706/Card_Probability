public class discard {
  protected discard next;
  private card card;

  discard(){
    next = null;
    card = null;
  }
  discard(card discarded){
    card = discarded;
  }
}