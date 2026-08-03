package Yue;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Yue.ۥۣ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8405(markerClass = {InterfaceC4774.class})
@InterfaceC7470(version = "1.6")
public final class EnumC4559 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final EnumC4559 f9810 = new EnumC4559("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final EnumC4559 f9811 = new EnumC4559("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final EnumC4559 f9812 = new EnumC4559("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final EnumC4559 f9813 = new EnumC4559("SECONDS", 3, TimeUnit.SECONDS);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final EnumC4559 f9814 = new EnumC4559("MINUTES", 4, TimeUnit.MINUTES);

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final EnumC4559 f9815 = new EnumC4559("HOURS", 5, TimeUnit.HOURS);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final EnumC4559 f9816 = new EnumC4559("DAYS", 6, TimeUnit.DAYS);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4559[] f9817;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC4654 f9818;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final TimeUnit f9819;

    static {
        EnumC4559[] enumC4559ArrM1508 = m1508();
        f9817 = enumC4559ArrM1508;
        f9818 = C4655.m1607(enumC4559ArrM1508);
    }

    public EnumC4559(String str, int i, TimeUnit timeUnit) {
        this.f9819 = timeUnit;
    }

    public static EnumC4559 valueOf(String str) {
        return (EnumC4559) Enum.valueOf(EnumC4559.class, str);
    }

    public static EnumC4559[] values() {
        return (EnumC4559[]) f9817.clone();
    }

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ EnumC4559[] m1508() {
        return new EnumC4559[]{f9810, f9811, f9812, f9813, f9814, f9815, f9816};
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC4654<EnumC4559> m13597() {
        return f9818;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final TimeUnit m13598() {
        return this.f9819;
    }
}
