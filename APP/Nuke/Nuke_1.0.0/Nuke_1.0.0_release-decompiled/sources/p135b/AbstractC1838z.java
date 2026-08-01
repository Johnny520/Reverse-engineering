package p135b;

import p002A1.EnumC0140m;

/* JADX INFO: renamed from: b.z */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1838z {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6239a;

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
            iArr[EnumC0140m.ON_DESTROY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f6239a = iArr;
    }
}
