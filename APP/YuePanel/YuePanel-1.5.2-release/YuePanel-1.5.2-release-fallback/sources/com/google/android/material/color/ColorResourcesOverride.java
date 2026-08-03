package com.google.android.material.color;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public interface ColorResourcesOverride {
    @Yue.InterfaceC4544
    static com.google.android.material.color.ColorResourcesOverride getInstance() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r1 > r0) goto Lf
            r1 = 33
            if (r0 > r1) goto Lf
            com.google.android.material.color.ColorResourcesOverride r0 = com.google.android.material.color.ResourcesLoaderColorResourcesOverride.getInstance()
            return r0
        Lf:
            r1 = 34
            if (r0 < r1) goto L18
            com.google.android.material.color.ColorResourcesOverride r0 = com.google.android.material.color.ResourcesLoaderColorResourcesOverride.getInstance()
            return r0
        L18:
            r0 = 0
            return r0
    }

    boolean applyIfPossible(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 java.util.Map<java.lang.Integer, java.lang.Integer> r2);

    @Yue.InterfaceC4410
    android.content.Context wrapContextIfPossible(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 java.util.Map<java.lang.Integer, java.lang.Integer> r2);
}
