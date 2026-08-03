package p000;

/* JADX INFO: renamed from: eu */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1383eu extends Enum {

    /* JADX INFO: renamed from: a */
    public static final EnumC1383eu f4928a = null;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC1383eu[] f4929b = null;

    static {
        EnumC1383eu r0 = new EnumC1383eu("SRGB", 0);
        EnumC1383eu r1 = new EnumC1383eu("DISPLAY_P3", 1);
        f4928a = r1;
        f4929b = new EnumC1383eu[]{r0, r1};
    }

    public static EnumC1383eu valueOf(String r1) {
        return (EnumC1383eu) Enum.valueOf(EnumC1383eu.class, r1);
    }

    public static EnumC1383eu[] values() {
        return (EnumC1383eu[]) f4929b.clone();
    }
}
