package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Yue.InterfaceC5401(Yue.EnumC0409.f948)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@Yue.InterfaceC6109(allowedTargets = {Yue.EnumC0410.f953})
public @interface InterfaceC5340 {

    /* JADX INFO: renamed from: Yue.ۥۡۦۥۦ$ۥ, reason: contains not printable characters */
    public enum EnumC5341 extends java.lang.Enum<Yue.InterfaceC5340.EnumC5341> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.InterfaceC5340.EnumC5341 f19925 = null;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static final Yue.InterfaceC5340.EnumC5341 f19926 = null;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final /* synthetic */ Yue.InterfaceC5340.EnumC5341[] f19927 = null;

        static {
                Yue.ۥۡۦۥۦ$ۥ r0 = new Yue.ۥۡۦۥۦ$ۥ
                java.lang.String r1 = "WARNING"
                r2 = 0
                r0.<init>(r1, r2)
                Yue.InterfaceC5340.EnumC5341.f19925 = r0
                Yue.ۥۡۦۥۦ$ۥ r0 = new Yue.ۥۡۦۥۦ$ۥ
                java.lang.String r1 = "ERROR"
                r2 = 1
                r0.<init>(r1, r2)
                Yue.InterfaceC5340.EnumC5341.f19926 = r0
                Yue.ۥۡۦۥۦ$ۥ[] r0 = m20170()
                Yue.InterfaceC5340.EnumC5341.f19927 = r0
                return
        }

        EnumC5341(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static Yue.InterfaceC5340.EnumC5341 valueOf(java.lang.String r1) {
                java.lang.Class<Yue.ۥۡۦۥۦ$ۥ> r0 = Yue.InterfaceC5340.EnumC5341.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                Yue.ۥۡۦۥۦ$ۥ r1 = (Yue.InterfaceC5340.EnumC5341) r1
                return r1
        }

        public static Yue.InterfaceC5340.EnumC5341[] values() {
                Yue.ۥۡۦۥۦ$ۥ[] r0 = Yue.InterfaceC5340.EnumC5341.f19927
                java.lang.Object r0 = r0.clone()
                Yue.ۥۡۦۥۦ$ۥ[] r0 = (Yue.InterfaceC5340.EnumC5341[]) r0
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ Yue.InterfaceC5340.EnumC5341[] m20170() {
                Yue.ۥۡۦۥۦ$ۥ r0 = Yue.InterfaceC5340.EnumC5341.f19925
                Yue.ۥۡۦۥۦ$ۥ r1 = Yue.InterfaceC5340.EnumC5341.f19926
                Yue.ۥۡۦۥۦ$ۥ[] r0 = new Yue.InterfaceC5340.EnumC5341[]{r0, r1}
                return r0
        }
    }

    Yue.InterfaceC5340.EnumC5341 level() default Yue.InterfaceC5340.EnumC5341.f19926;
}
