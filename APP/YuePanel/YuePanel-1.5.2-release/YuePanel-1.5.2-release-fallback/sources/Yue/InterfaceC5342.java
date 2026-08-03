package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Yue.InterfaceC5792(version = "1.3")
@Yue.InterfaceC5401(Yue.EnumC0409.f948)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@Yue.InterfaceC6109(allowedTargets = {Yue.EnumC0410.f953})
public @interface InterfaceC5342 {

    /* JADX INFO: renamed from: Yue.ۥۡۦۥۧ$ۥ, reason: contains not printable characters */
    public enum EnumC5343 extends java.lang.Enum<Yue.InterfaceC5342.EnumC5343> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.InterfaceC5342.EnumC5343 f19928 = null;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static final Yue.InterfaceC5342.EnumC5343 f19929 = null;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final /* synthetic */ Yue.InterfaceC5342.EnumC5343[] f19930 = null;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static final /* synthetic */ Yue.InterfaceC2168 f19931 = null;

        static {
                Yue.ۥۡۦۥۧ$ۥ r0 = new Yue.ۥۡۦۥۧ$ۥ
                java.lang.String r1 = "WARNING"
                r2 = 0
                r0.<init>(r1, r2)
                Yue.InterfaceC5342.EnumC5343.f19928 = r0
                Yue.ۥۡۦۥۧ$ۥ r0 = new Yue.ۥۡۦۥۧ$ۥ
                java.lang.String r1 = "ERROR"
                r2 = 1
                r0.<init>(r1, r2)
                Yue.InterfaceC5342.EnumC5343.f19929 = r0
                Yue.ۥۡۦۥۧ$ۥ[] r0 = m20171()
                Yue.InterfaceC5342.EnumC5343.f19930 = r0
                Yue.ۥ۠ۡ۟ۧ r0 = Yue.C2169.m10153(r0)
                Yue.InterfaceC5342.EnumC5343.f19931 = r0
                return
        }

        EnumC5343(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static Yue.InterfaceC5342.EnumC5343 valueOf(java.lang.String r1) {
                java.lang.Class<Yue.ۥۡۦۥۧ$ۥ> r0 = Yue.InterfaceC5342.EnumC5343.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                Yue.ۥۡۦۥۧ$ۥ r1 = (Yue.InterfaceC5342.EnumC5343) r1
                return r1
        }

        public static Yue.InterfaceC5342.EnumC5343[] values() {
                Yue.ۥۡۦۥۧ$ۥ[] r0 = Yue.InterfaceC5342.EnumC5343.f19930
                java.lang.Object r0 = r0.clone()
                Yue.ۥۡۦۥۧ$ۥ[] r0 = (Yue.InterfaceC5342.EnumC5343[]) r0
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ Yue.InterfaceC5342.EnumC5343[] m20171() {
                Yue.ۥۡۦۥۧ$ۥ r0 = Yue.InterfaceC5342.EnumC5343.f19928
                Yue.ۥۡۦۥۧ$ۥ r1 = Yue.InterfaceC5342.EnumC5343.f19929
                Yue.ۥۡۦۥۧ$ۥ[] r0 = new Yue.InterfaceC5342.EnumC5343[]{r0, r1}
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static Yue.InterfaceC2168<Yue.InterfaceC5342.EnumC5343> m20172() {
                Yue.ۥ۠ۡ۟ۧ r0 = Yue.InterfaceC5342.EnumC5343.f19931
                return r0
        }
    }

    Yue.InterfaceC5342.EnumC5343 level() default Yue.InterfaceC5342.EnumC5343.f19929;

    java.lang.String message() default "";
}
