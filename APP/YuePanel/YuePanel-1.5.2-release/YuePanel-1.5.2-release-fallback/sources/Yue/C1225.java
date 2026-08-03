package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1225 {
    public C1225() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C2108 m6558(Yue.AbstractC2179 r1, Yue.C2104 r2) {
            r1.mo6687()
            java.util.stream.Stream r0 = r2.m9920()
            java.util.function.Predicate r1 = r1.m10169(r2)
            java.util.stream.Stream r1 = r0.filter(r1)
            Yue.ۥ۟ۥۢۡ r2 = new Yue.ۥ۟ۥۢۡ
            r2.<init>()
            java.util.stream.Collector r2 = java.util.stream.Collectors.toCollection(r2)
            java.lang.Object r1 = r1.collect(r2)
            Yue.ۥ۠۠ۥۧ r1 = (Yue.C2108) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C2104 m6559(Yue.AbstractC2179 r1, Yue.C2104 r2) {
            r1.mo6687()
            java.util.stream.Stream r0 = r2.m9920()
            java.util.function.Predicate r1 = r1.m10169(r2)
            java.util.stream.Stream r1 = r0.filter(r1)
            java.util.Optional r1 = r1.findFirst()
            r2 = 0
            java.lang.Object r1 = r1.orElse(r2)
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            return r1
    }
}
