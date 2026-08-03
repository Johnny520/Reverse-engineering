package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1215 extends Yue.C1214 {
    public C1215() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final <T> void m6239(java.util.List<T> r1, T r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.Collections.fill(r1, r2)
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final <T> void m6240(java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.Collections.shuffle(r1)
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final <T> void m6241(java.util.List<T> r1, java.util.Random r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "random"
            Yue.C3329.m13906(r2, r0)
            java.util.Collections.shuffle(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static <T extends java.lang.Comparable<? super T>> void m6242(@Yue.InterfaceC4418 java.util.List<T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto Lf
            java.util.Collections.sort(r2)
        Lf:
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final <T> void m6243(java.util.List<T> r1, Yue.InterfaceC2839<? super T, ? super T, java.lang.Integer> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r1 = "comparison"
            Yue.C3329.m13906(r2, r1)
            Yue.ۥۡۢۥ۟ r1 = new Yue.ۥۡۢۥ۟
            r2 = 0
            r0 = 1
            r1.<init>(r2, r0, r2)
            throw r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Use sortWith(comparator) instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.sortWith(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final <T> void m6244(java.util.List<T> r1, java.util.Comparator<? super T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r1 = "comparator"
            Yue.C3329.m13906(r2, r1)
            Yue.ۥۡۢۥ۟ r1 = new Yue.ۥۡۢۥ۟
            r2 = 0
            r0 = 1
            r1.<init>(r2, r0, r2)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static <T> void m6245(@Yue.InterfaceC4418 java.util.List<T> r2, @Yue.InterfaceC4418 java.util.Comparator<? super T> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r3, r0)
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto L14
            java.util.Collections.sort(r2, r3)
        L14:
            return
    }
}
