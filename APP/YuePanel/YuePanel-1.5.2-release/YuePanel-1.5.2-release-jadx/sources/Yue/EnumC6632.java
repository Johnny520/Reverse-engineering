package Yue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Yue.ۥۡۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.7")
@InterfaceC4771
public final class EnumC6632 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final EnumC6632 f17018 = new EnumC6632("INCLUDE_DIRECTORIES", 0);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final EnumC6632 f17019 = new EnumC6632("BREADTH_FIRST", 1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final EnumC6632 f17020 = new EnumC6632("FOLLOW_LINKS", 2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC6632[] f17021;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC4654 f17022;

    static {
        EnumC6632[] enumC6632ArrM3115 = m3115();
        f17021 = enumC6632ArrM3115;
        f17022 = C4655.m1607(enumC6632ArrM3115);
    }

    public EnumC6632(String str, int i) {
    }

    public static EnumC6632 valueOf(String str) {
        return (EnumC6632) Enum.valueOf(EnumC6632.class, str);
    }

    public static EnumC6632[] values() {
        return (EnumC6632[]) f17021.clone();
    }

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ EnumC6632[] m3115() {
        return new EnumC6632[]{f17018, f17019, f17020};
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC4654<EnumC6632> m21102() {
        return f17022;
    }
}
