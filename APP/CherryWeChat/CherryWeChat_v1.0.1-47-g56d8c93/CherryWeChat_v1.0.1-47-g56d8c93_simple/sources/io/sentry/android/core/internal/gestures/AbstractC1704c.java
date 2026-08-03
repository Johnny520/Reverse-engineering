package io.sentry.android.core.internal.gestures;

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1704c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6166a = null;

    static {
        int[] r0 = new int[EnumC1705d.values().length];
        f6166a = r0;
        r0[EnumC1705d.Click.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
    L12:
        f6166a[EnumC1705d.Scroll.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
    L14:
        f6166a[EnumC1705d.Swipe.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
    L18:
        f6166a[EnumC1705d.Unknown.ordinal()] = 4;     // Catch: NoSuchFieldError -> L11
        return;
    }
}
