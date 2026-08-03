package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4405 {
    public C4405() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C1948.C1949 m17316(Yue.AbstractC4398 r1) {
            Yue.ۥ۠۟ۧۥ r1 = r1.m17287()
            if (r1 == 0) goto Lb
        L6:
            Yue.ۥ۠۟ۧۥ$ۥ r1 = r1.m8955()
            goto L13
        Lb:
            Yue.ۥ۠۟ۧۥ r1 = new Yue.ۥ۠۟ۧۥ
            java.lang.String r0 = ""
            r1.<init>(r0)
            goto L6
        L13:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C4700 m17317(Yue.AbstractC4398 r1) {
            Yue.ۥ۠۟ۧۥ r1 = r1.m17287()
            if (r1 == 0) goto L11
            Yue.ۥۣۡۧۦ r0 = r1.m8958()
            if (r0 == 0) goto L11
            Yue.ۥۣۡۧۦ r1 = r1.m8958()
            goto L1b
        L11:
            Yue.ۥۣۡۧۦ r1 = new Yue.ۥۣۡۧۦ
            Yue.ۥ۠ۤۧۡ r0 = new Yue.ۥ۠ۤۧۡ
            r0.<init>()
            r1.<init>(r0)
        L1b:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static <T extends Yue.AbstractC4398> java.util.List<T> m17318(java.lang.String r2, Yue.C2104 r3, java.lang.Class<T> r4) {
            Yue.C6657.m25632(r2)
            Yue.C6657.m25635(r3)
            Yue.C6657.m25635(r4)
            Yue.ۥۢۥ۠ۥ r0 = new Yue.ۥۢۥ۠ۥ
            r0.<init>()
            r1 = 0
            Yue.ۥۢۥ۠ۥ r0 = r0.m26919(r1)
            org.w3c.dom.Document r3 = r0.m26918(r3)
            org.w3c.dom.Node r3 = r0.m26914(r3)
            org.w3c.dom.NodeList r2 = r0.m26922(r2, r3)
            java.util.List r2 = r0.m26923(r2, r4)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <T extends Yue.AbstractC4398> java.util.Spliterator<T> m17319(java.util.Iterator<T> r1) {
            r0 = 273(0x111, float:3.83E-43)
            java.util.Spliterator r1 = java.util.Spliterators.spliteratorUnknownSize(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static <T extends Yue.AbstractC4398> java.util.stream.Stream<T> m17320(Yue.AbstractC4398 r1, java.lang.Class<T> r2) {
            Yue.ۥۣۡۢۦ r0 = new Yue.ۥۣۡۢۦ
            r0.<init>(r1, r2)
            java.util.Spliterator r1 = m17319(r0)
            r2 = 0
            java.util.stream.Stream r1 = java.util.stream.StreamSupport.stream(r1, r2)
            return r1
    }
}
