package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3579 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۧ۟ۡ$ۥ, reason: contains not printable characters */
    public /* synthetic */ class C3580 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f11387 = null;

        static {
                Yue.ۥ۠ۧ۟ۤ[] r0 = Yue.EnumC3583.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Yue.ۥ۠ۧ۟ۤ r1 = Yue.EnumC3583.f11389     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                Yue.ۥ۠ۧ۟ۤ r1 = Yue.EnumC3583.f11390     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                Yue.ۥ۠ۧ۟ۤ r1 = Yue.EnumC3583.f11391     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                Yue.C3579.C3580.f11387 = r0
                return
        }
    }

    public C3579() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static <T> Yue.InterfaceC3574<T> m14505(@Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r3) {
            java.lang.String r0 = "initializer"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥۢ۠ۦۧ r0 = new Yue.ۥۢ۠ۦۧ
            r1 = 0
            r2 = 2
            r0.<init>(r3, r1, r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static <T> Yue.InterfaceC3574<T> m14506(@Yue.InterfaceC4418 Yue.EnumC3583 r2, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r3) {
            java.lang.String r0 = "mode"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "initializer"
            Yue.C3329.m13906(r3, r0)
            int[] r0 = Yue.C3579.C3580.f11387
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 2
            if (r2 == r0) goto L2d
            if (r2 == r1) goto L27
            r0 = 3
            if (r2 != r0) goto L21
            Yue.ۥۣۢ۠ۧ r2 = new Yue.ۥۣۢ۠ۧ
            r2.<init>(r3)
            goto L33
        L21:
            Yue.ۥۣۣۡۢ r2 = new Yue.ۥۣۣۡۢ
            r2.<init>()
            throw r2
        L27:
            Yue.ۥۡۧۢۦ r2 = new Yue.ۥۡۧۢۦ
            r2.<init>(r3)
            goto L33
        L2d:
            Yue.ۥۢ۠ۦۧ r2 = new Yue.ۥۢ۠ۦۧ
            r0 = 0
            r2.<init>(r3, r0, r1, r0)
        L33:
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC3574<T> m14507(@Yue.InterfaceC4543 java.lang.Object r1, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r2) {
            java.lang.String r0 = "initializer"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۢ۠ۦۧ r0 = new Yue.ۥۢ۠ۦۧ
            r0.<init>(r2, r1)
            return r0
    }
}
