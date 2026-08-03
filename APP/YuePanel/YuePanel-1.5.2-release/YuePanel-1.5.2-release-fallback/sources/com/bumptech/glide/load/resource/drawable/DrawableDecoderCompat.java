package com.bumptech.glide.load.resource.drawable;

/* JADX INFO: loaded from: classes.dex */
public final class DrawableDecoderCompat {
    private static volatile boolean shouldCallAppCompatResources = true;

    static {
            return
    }

    private DrawableDecoderCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context r0, @Yue.InterfaceC2004 int r1, @Yue.InterfaceC4544 android.content.res.Resources.Theme r2) {
            android.graphics.drawable.Drawable r0 = getDrawable(r0, r0, r1, r2)
            return r0
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context r1, android.content.Context r2, @Yue.InterfaceC2004 int r3) {
            r0 = 0
            android.graphics.drawable.Drawable r1 = getDrawable(r1, r2, r3, r0)
            return r1
    }

    private static android.graphics.drawable.Drawable getDrawable(android.content.Context r1, android.content.Context r2, @Yue.InterfaceC2004 int r3, @Yue.InterfaceC4544 android.content.res.Resources.Theme r4) {
            boolean r0 = com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat.shouldCallAppCompatResources     // Catch: java.lang.IllegalStateException -> L9 java.lang.NoClassDefFoundError -> L1e android.content.res.Resources.NotFoundException -> L21
            if (r0 == 0) goto L21
            android.graphics.drawable.Drawable r1 = loadDrawableV7(r2, r3, r4)     // Catch: java.lang.IllegalStateException -> L9 java.lang.NoClassDefFoundError -> L1e android.content.res.Resources.NotFoundException -> L21
            return r1
        L9:
            r4 = move-exception
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = r2.getPackageName()
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1d
            android.graphics.drawable.Drawable r1 = Yue.C1584.m7766(r2, r3)
            return r1
        L1d:
            throw r4
        L1e:
            r1 = 0
            com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat.shouldCallAppCompatResources = r1
        L21:
            if (r4 == 0) goto L24
            goto L28
        L24:
            android.content.res.Resources$Theme r4 = r2.getTheme()
        L28:
            android.graphics.drawable.Drawable r1 = loadDrawableV4(r2, r3, r4)
            return r1
    }

    private static android.graphics.drawable.Drawable loadDrawableV4(android.content.Context r0, @Yue.InterfaceC2004 int r1, @Yue.InterfaceC4544 android.content.res.Resources.Theme r2) {
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r0 = Yue.C5362.m20228(r0, r1, r2)
            return r0
    }

    private static android.graphics.drawable.Drawable loadDrawableV7(android.content.Context r1, @Yue.InterfaceC2004 int r2, @Yue.InterfaceC4544 android.content.res.Resources.Theme r3) {
            if (r3 == 0) goto L13
            Yue.ۥ۟ۧۤۡ r0 = new Yue.ۥ۟ۧۤۡ
            r0.<init>(r1, r3)
            android.content.res.Resources r1 = r3.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            r0.m7804(r1)
            r1 = r0
        L13:
            android.graphics.drawable.Drawable r1 = Yue.C0479.m1737(r1, r2)
            return r1
    }
}
