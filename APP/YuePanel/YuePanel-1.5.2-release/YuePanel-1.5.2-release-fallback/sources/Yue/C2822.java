package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.7")
public class C2822 extends Yue.C2853 implements java.io.Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final java.lang.Class f9209;

    public C2822(java.lang.Class r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.f9209 = r2
            return
    }

    @Override // Yue.C2853
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof Yue.C2822
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            Yue.ۥۣ۠۠ۧ r2 = (Yue.C2822) r2
            java.lang.Class r0 = r1.f9209
            java.lang.Class r2 = r2.f9209
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // Yue.C2853, Yue.AbstractC0908
    public /* bridge */ /* synthetic */ Yue.InterfaceC3433 getReflected() {
            r1 = this;
            Yue.ۥ۠ۦۢۧ r0 = r1.getReflected()
            return r0
    }

    @Override // Yue.C2853, Yue.AbstractC0908
    public Yue.InterfaceC3441 getReflected() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Functional interface constructor does not support reflection"
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.C2853
    public int hashCode() {
            r1 = this;
            java.lang.Class r0 = r1.f9209
            int r0 = r0.hashCode()
            return r0
    }

    @Override // Yue.C2853
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "fun interface "
            r0.append(r1)
            java.lang.Class r1 = r2.f9209
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
