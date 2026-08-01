package p000;

/* JADX INFO: renamed from: hq */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0307hq {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f2296a;

    static {
        int[] iArr = new int[EnumC0347iq.values().length];
        try {
            iArr[EnumC0347iq.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC0347iq.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC0347iq.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC0347iq.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC0347iq.ON_RESUME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EnumC0347iq.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[EnumC0347iq.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f2296a = iArr;
    }
}
