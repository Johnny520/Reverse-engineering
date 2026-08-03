package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ClassIdentifier {
    java.lang.Class<?> clas;

    public ClassIdentifier(java.lang.Class<?> r1) {
            r0 = this;
            r0.<init>()
            r0.clas = r1
            return
    }

    public java.lang.Class<?> getTargetClass() {
            r1 = this;
            java.lang.Class<?> r0 = r1.clas
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.Class<?> r0 = r2.clas
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Class Identifier: "
            java.lang.String r0 = r1.concat(r0)
            return r0
    }
}
