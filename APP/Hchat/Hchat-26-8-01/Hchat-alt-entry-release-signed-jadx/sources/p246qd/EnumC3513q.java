package p246qd;

/* JADX INFO: renamed from: qd.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC3513q {
    BOOLEAN("Z", "boolean", AbstractC3506j.m7360x("java.lang.Boolean")),
    CHAR("C", "char", AbstractC3506j.m7360x("java.lang.Character")),
    BYTE("B", "byte", AbstractC3506j.m7360x("java.lang.Byte")),
    SHORT("S", "short", AbstractC3506j.m7360x("java.lang.Short")),
    INT("I", "int", AbstractC3506j.m7360x("java.lang.Integer")),
    FLOAT("F", "float", AbstractC3506j.m7360x("java.lang.Float")),
    LONG("J", "long", AbstractC3506j.m7360x("java.lang.Long")),
    DOUBLE("D", "double", AbstractC3506j.m7360x("java.lang.Double")),
    OBJECT("L", "OBJECT", AbstractC3506j.f11394k),
    ARRAY("[", "ARRAY", AbstractC3506j.f11402s),
    VOID("V", "void", AbstractC3506j.m7360x("java.lang.Void"));


    /* JADX INFO: renamed from: g */
    public final String f11436g;

    /* JADX INFO: renamed from: h */
    public final String f11437h;

    /* JADX INFO: renamed from: i */
    public final AbstractC3506j f11438i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC3513q(String str, String str2, AbstractC3506j abstractC3506j) {
        this.f11436g = str;
        this.f11437h = str2;
        this.f11438i = abstractC3506j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public final String toString() {
        return this.f11437h;
    }
}
