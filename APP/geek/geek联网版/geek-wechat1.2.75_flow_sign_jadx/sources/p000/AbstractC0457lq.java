package p000;

/* JADX INFO: renamed from: lq */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0457lq {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f3039a;

    static {
        int[] iArr = new int[EnumC0494mq.values().length];
        try {
            iArr[EnumC0494mq.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC0494mq.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC0494mq.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC0494mq.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC0494mq.ON_RESUME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EnumC0494mq.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[EnumC0494mq.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f3039a = iArr;
    }
}
