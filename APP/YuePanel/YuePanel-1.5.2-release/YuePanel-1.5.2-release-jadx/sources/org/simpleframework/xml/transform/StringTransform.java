package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class StringTransform implements Transform<String> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: read(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // org.simpleframework.xml.transform.Transform
    public String read(String str) {
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;)Ljava/lang/String; */
    @Override // org.simpleframework.xml.transform.Transform
    public String write(String str) {
        return str;
    }
}
