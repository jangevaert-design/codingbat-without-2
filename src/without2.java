public class without2 {
  public String without2(String str) {
    int len = str.length();
    if (len > 1 && str.substring(0,2).equals(str.substring(len - 2, len))) {
      return str.substring(2, len);
    } else {
      return str;
    }
  }
}
