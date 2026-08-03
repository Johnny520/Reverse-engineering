package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC2309
public final class C1770 implements Yue.InterfaceC1627 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1770 f5484 = null;

    static {
            Yue.ۥ۟ۨۥۣ r0 = new Yue.ۥ۟ۨۥۣ
            r0.<init>()
            Yue.C1770.f5484 = r0
            return
    }

    public C1770() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.InterfaceC1627
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.EnumC1628 mo7896(@Yue.InterfaceC4418 java.nio.file.Path r3, @Yue.InterfaceC4418 java.nio.file.Path r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r4, r0)
            Yue.ۥ۠ۧۡۦ r0 = Yue.C3614.f11524
            java.nio.file.LinkOption[] r5 = r0.m14610(r5)
            int r0 = r5.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = java.nio.file.Files.isDirectory(r3, r0)
            if (r0 == 0) goto L37
            java.nio.file.LinkOption r0 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[]{r0}
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = java.nio.file.Files.isDirectory(r4, r0)
            if (r0 != 0) goto L4e
        L37:
            int r0 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            java.nio.file.CopyOption[] r5 = (java.nio.file.CopyOption[]) r5
            int r0 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            java.nio.file.CopyOption[] r5 = (java.nio.file.CopyOption[]) r5
            java.nio.file.Path r3 = java.nio.file.Files.copy(r3, r4, r5)
            java.lang.String r4 = "copy(this, target, *options)"
            Yue.C3329.m13905(r3, r4)
        L4e:
            Yue.ۥ۟ۧۦۢ r3 = Yue.EnumC1628.f5087
            return r3
    }
}
