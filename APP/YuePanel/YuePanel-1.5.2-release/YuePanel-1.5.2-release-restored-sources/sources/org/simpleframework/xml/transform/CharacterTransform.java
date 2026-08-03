package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class CharacterTransform implements Transform<Character> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.simpleframework.xml.transform.Transform
    public Character read(String str) throws Exception {
        if (str.length() == 1) {
            return Character.valueOf(str.charAt(0));
        }
        throw new InvalidFormatException("Cannot convert '%s' to a character", str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;)Ljava/lang/String; */
    @Override // org.simpleframework.xml.transform.Transform
    public String write(Character ch) throws Exception {
        return ch.toString();
    }
}
