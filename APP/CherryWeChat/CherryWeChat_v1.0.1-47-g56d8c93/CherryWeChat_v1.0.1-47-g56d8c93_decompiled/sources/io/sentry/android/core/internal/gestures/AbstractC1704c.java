package io.sentry.android.core.internal.gestures;

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1704c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6166a;

    static {
        int[] iArr = new int[EnumC1705d.values().length];
        f6166a = iArr;
        try {
            iArr[EnumC1705d.Click.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6166a[EnumC1705d.Scroll.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6166a[EnumC1705d.Swipe.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6166a[EnumC1705d.Unknown.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
