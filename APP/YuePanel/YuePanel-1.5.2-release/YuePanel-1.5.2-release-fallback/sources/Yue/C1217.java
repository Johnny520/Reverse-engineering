package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1217 extends Yue.C1216 {
    public C1217() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final /* synthetic */ int m6279(java.util.List r0, int r1) {
            int r0 = m6284(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final /* synthetic */ int m6280(java.util.List r0, int r1) {
            int r0 = m6285(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final /* synthetic */ int m6281(java.util.List r0, int r1) {
            int r0 = m6286(r0, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static final <T> java.util.List<T> m6282(@Yue.InterfaceC4418 java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۡۧ۟ r0 = new Yue.ۥۡۧ۟
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "asReversedMutable")
    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final <T> java.util.List<T> m6283(@Yue.InterfaceC4418 java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۡۧ r0 = new Yue.ۥۡۧ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static final int m6284(java.util.List<?> r4, int r5) {
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            int r1 = Yue.C1208.m6212(r4)
            r2 = 0
            r0.<init>(r2, r1)
            boolean r0 = r0.m13745(r5)
            if (r0 == 0) goto L16
            int r4 = Yue.C1208.m6212(r4)
            int r4 = r4 - r5
            return r4
        L16:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Element index "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r5 = " must be in range ["
            r1.append(r5)
            Yue.ۥ۠ۥۣۨ r5 = new Yue.ۥ۠ۥۣۨ
            int r4 = Yue.C1208.m6212(r4)
            r5.<init>(r2, r4)
            r1.append(r5)
            java.lang.String r4 = "]."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final int m6285(java.util.List<?> r0, int r1) {
            int r0 = Yue.C1208.m6212(r0)
            int r0 = r0 - r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final int m6286(java.util.List<?> r4, int r5) {
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            int r1 = r4.size()
            r2 = 0
            r0.<init>(r2, r1)
            boolean r0 = r0.m13745(r5)
            if (r0 == 0) goto L16
            int r4 = r4.size()
            int r4 = r4 - r5
            return r4
        L16:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Position index "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r5 = " must be in range ["
            r1.append(r5)
            Yue.ۥ۠ۥۣۨ r5 = new Yue.ۥ۠ۥۣۨ
            int r4 = r4.size()
            r5.<init>(r2, r4)
            r1.append(r5)
            java.lang.String r4 = "]."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
