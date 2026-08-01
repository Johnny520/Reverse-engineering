package xhss;

/* JADX INFO: renamed from: xhss.ᲈᲇᲈᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1200 extends xhss.C0564 {
    @Override // xhss.C0564
    /* JADX INFO: renamed from: ᲈᛳᲀ */
    public final android.graphics.fonts.Font mo1037(xhss.C0486 r4) {
            r3 = this;
            android.net.Uri r3 = r4.f1789
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "systemfont"
            boolean r0 = java.util.Objects.equals(r0, r1)
            java.lang.String r4 = r4.f1788
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.String r3 = r3.getAuthority()
            goto L17
        L16:
            r3 = r1
        L17:
            if (r3 != 0) goto L1a
            goto L38
        L1a:
            r0 = 0
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r0)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r2, r0)
            if (r3 == 0) goto L2e
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L2e
            goto L2f
        L2e:
            r3 = r1
        L2f:
            if (r3 != 0) goto L32
            goto L38
        L32:
            android.graphics.fonts.Font r3 = xhss.AbstractC0101.m272(r3)
            if (r3 != 0) goto L39
        L38:
            return r1
        L39:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L40
            return r3
        L40:
            android.graphics.fonts.Font$Builder r0 = new android.graphics.fonts.Font$Builder     // Catch: java.io.IOException -> L4e
            r0.<init>(r3)     // Catch: java.io.IOException -> L4e
            android.graphics.fonts.Font$Builder r3 = r0.setFontVariationSettings(r4)     // Catch: java.io.IOException -> L4e
            android.graphics.fonts.Font r3 = r3.build()     // Catch: java.io.IOException -> L4e
            return r3
        L4e:
            java.lang.String r3 = "TypefaceCompatApi31Impl"
            java.lang.String r4 = "Failed to clone Font instance. Fall back to provider font."
            android.util.Log.e(r3, r4)
            return r1
    }
}
