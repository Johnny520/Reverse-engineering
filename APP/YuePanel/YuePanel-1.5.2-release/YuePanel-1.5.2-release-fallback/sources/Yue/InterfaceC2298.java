package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Yue.InterfaceC1816(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @Yue.InterfaceC5313(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
@Yue.InterfaceC5401(Yue.EnumC0409.f948)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@Yue.InterfaceC6109(allowedTargets = {Yue.EnumC0410.f953})
public @interface InterfaceC2298 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۤ۟$ۥ, reason: contains not printable characters */
    public enum EnumC2299 extends java.lang.Enum<Yue.InterfaceC2298.EnumC2299> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.InterfaceC2298.EnumC2299 f7564 = null;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static final Yue.InterfaceC2298.EnumC2299 f7565 = null;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final /* synthetic */ Yue.InterfaceC2298.EnumC2299[] f7566 = null;

        static {
                Yue.ۥ۠ۡۤ۟$ۥ r0 = new Yue.ۥ۠ۡۤ۟$ۥ
                java.lang.String r1 = "WARNING"
                r2 = 0
                r0.<init>(r1, r2)
                Yue.InterfaceC2298.EnumC2299.f7564 = r0
                Yue.ۥ۠ۡۤ۟$ۥ r0 = new Yue.ۥ۠ۡۤ۟$ۥ
                java.lang.String r1 = "ERROR"
                r2 = 1
                r0.<init>(r1, r2)
                Yue.InterfaceC2298.EnumC2299.f7565 = r0
                Yue.ۥ۠ۡۤ۟$ۥ[] r0 = m10655()
                Yue.InterfaceC2298.EnumC2299.f7566 = r0
                return
        }

        EnumC2299(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static Yue.InterfaceC2298.EnumC2299 valueOf(java.lang.String r1) {
                java.lang.Class<Yue.ۥ۠ۡۤ۟$ۥ> r0 = Yue.InterfaceC2298.EnumC2299.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                Yue.ۥ۠ۡۤ۟$ۥ r1 = (Yue.InterfaceC2298.EnumC2299) r1
                return r1
        }

        public static Yue.InterfaceC2298.EnumC2299[] values() {
                Yue.ۥ۠ۡۤ۟$ۥ[] r0 = Yue.InterfaceC2298.EnumC2299.f7566
                java.lang.Object r0 = r0.clone()
                Yue.ۥ۠ۡۤ۟$ۥ[] r0 = (Yue.InterfaceC2298.EnumC2299[]) r0
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ Yue.InterfaceC2298.EnumC2299[] m10655() {
                Yue.ۥ۠ۡۤ۟$ۥ r0 = Yue.InterfaceC2298.EnumC2299.f7564
                Yue.ۥ۠ۡۤ۟$ۥ r1 = Yue.InterfaceC2298.EnumC2299.f7565
                Yue.ۥ۠ۡۤ۟$ۥ[] r0 = new Yue.InterfaceC2298.EnumC2299[]{r0, r1}
                return r0
        }
    }

    Yue.InterfaceC2298.EnumC2299 level() default Yue.InterfaceC2298.EnumC2299.f7565;
}
