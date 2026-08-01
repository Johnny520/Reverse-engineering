package p008B1;

import p002A1.EnumC0140m;

/* JADX INFO: renamed from: B1.e */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0217e {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f763a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int[] iArr = new int[EnumC0140m.values().length];
        try {
            iArr[EnumC0140m.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC0140m.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC0140m.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC0140m.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f763a = iArr;
    }
}
