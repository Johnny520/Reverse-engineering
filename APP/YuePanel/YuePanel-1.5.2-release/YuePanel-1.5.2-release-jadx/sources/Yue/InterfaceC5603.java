package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5603 extends InterfaceC5583 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۤ$ۥ */
    public static final class C0806 {
        @InterfaceC7470(version = "1.1")
        /* JADX INFO: renamed from: ۥ */
        public static /* synthetic */ void m2311() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: Yue.ۥ۠ۦۤ$ۥ۟ */
    public static final class EnumC0807 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final EnumC0807 f13565 = new EnumC0807("INSTANCE", 0);

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static final EnumC0807 f13566 = new EnumC0807("EXTENSION_RECEIVER", 1);

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final EnumC0807 f13567 = new EnumC0807("VALUE", 2);

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static final /* synthetic */ EnumC0807[] f13568;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static final /* synthetic */ InterfaceC4654 f13569;

        static {
            EnumC0807[] enumC0807ArrM2312 = m2312();
            f13568 = enumC0807ArrM2312;
            f13569 = C4655.m1607(enumC0807ArrM2312);
        }

        public EnumC0807(String str, int i) {
        }

        public static EnumC0807 valueOf(String str) {
            return (EnumC0807) Enum.valueOf(EnumC0807.class, str);
        }

        public static EnumC0807[] values() {
            return (EnumC0807[]) f13568.clone();
        }

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ EnumC0807[] m2312() {
            return new EnumC0807[]{f13565, f13566, f13567};
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static InterfaceC4654<EnumC0807> m17381() {
            return f13569;
        }
    }

    int getIndex();

    @InterfaceC6489
    String getName();

    @InterfaceC6399
    InterfaceC5609 getType();

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    boolean m17378();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    EnumC0807 m17379();

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    boolean m17380();
}
