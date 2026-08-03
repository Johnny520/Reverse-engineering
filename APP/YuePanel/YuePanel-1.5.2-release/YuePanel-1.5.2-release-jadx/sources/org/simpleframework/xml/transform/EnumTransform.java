package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class EnumTransform implements Transform<Enum> {
    private final Class type;

    public EnumTransform(Class cls) {
        this.type = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.simpleframework.xml.transform.Transform
    public Enum read(String str) throws Exception {
        return Enum.valueOf(this.type, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;)Ljava/lang/String; */
    @Override // org.simpleframework.xml.transform.Transform
    public String write(Enum r1) throws Exception {
        return r1.name();
    }
}
