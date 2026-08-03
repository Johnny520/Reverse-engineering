package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4816 {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final long f10859;

    EnumC4816(long j) {
        this.f10859 = j;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static EnumC4816 m14619(long j) {
        EnumC4816[] enumC4816ArrValues = values();
        for (int i = 0; i < enumC4816ArrValues.length; i++) {
            if (enumC4816ArrValues[i].m14620() == j) {
                return enumC4816ArrValues[i];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public long m14620() {
        return this.f10859;
    }
}
