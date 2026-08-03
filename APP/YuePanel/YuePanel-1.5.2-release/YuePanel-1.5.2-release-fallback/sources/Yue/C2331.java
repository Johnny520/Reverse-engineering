package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2331 extends Yue.AbstractC0072 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C2331.C2332 f7597;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۦۣ$ۥ, reason: contains not printable characters */
    public static final class C2332 extends java.lang.ThreadLocal<java.util.Random> {
        public C2332() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ java.util.Random initialValue() {
                r1 = this;
                java.util.Random r0 = r1.m10709()
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.util.Random m10709() {
                r1 = this;
                java.util.Random r0 = new java.util.Random
                r0.<init>()
                return r0
        }
    }

    public C2331() {
            r1 = this;
            r1.<init>()
            Yue.ۥ۠ۡۦۣ$ۥ r0 = new Yue.ۥ۠ۡۦۣ$ۥ
            r0.<init>()
            r1.f7597 = r0
            return
    }

    @Override // Yue.AbstractC0072
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public java.util.Random mo443() {
            r2 = this;
            Yue.ۥ۠ۡۦۣ$ۥ r0 = r2.f7597
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = "implStorage.get()"
            Yue.C3329.m13905(r0, r1)
            java.util.Random r0 = (java.util.Random) r0
            return r0
    }
}
