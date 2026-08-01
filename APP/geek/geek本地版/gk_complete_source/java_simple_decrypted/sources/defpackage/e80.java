package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class e80 extends ct {
    public static int A(FontStyle r2, FontStyle r3) {
        int r0 = Math.abs(r2.getWeight() - r3.getWeight()) / 100;
        if (r2.getSlant() != r3.getSlant()) goto L5;
        int r22 = 0;
    L7:
        return r0 + r22;
    L5:
        r22 = 2;
        goto L7
    }

    public static Font z(FontFamily r5, int r6) {
        if ((r6 & 1) == 0) goto L5;
        int r1 = 700;
    L6:
        int r3 = 1;
        if ((r6 & 2) == 0) goto L9;
        int r62 = 1;
    L10:
        FontStyle r0 = new FontStyle(r1, r62);
        Font r63 = r5.getFont(0);
        int r12 = A(r0, r63.getStyle());
    L12:
        if (r3 >= r5.getSize()) goto L17;
        Font r2 = r5.getFont(r3);
        int r4 = A(r0, r2.getStyle());
        if (r4 >= r12) goto L16;
        r63 = r2;
        r12 = r4;
    L16:
        r3 = r3 + 1;
        goto L12
    L17:
        return r63;
    L9:
        r62 = 0;
        goto L10
    L5:
        r1 = 400;
        goto L6
    }

    @Override // defpackage.ct
    public final Typeface g(Context r7, dl r8, Resources r9, int r10) {
        el[] r82 = r8.a;     // Catch: Exception -> L16
        int r0 = r82.length;     // Catch: Exception -> L16
        int r1 = 0;
        FontFamily.Builder r2 = null;
    L4:
        if (r1 >= r0) goto L11;
        el r3 = r82[r1];     // Catch: Exception -> L16
        Font r32 = new Font.Builder(r9, r3.f).setWeight(r3.b).setSlant(r3.c ? 1 : 0).setTtcIndex(r3.e).setFontVariationSettings(r3.d).build();     // Catch: IOException -> L15 Exception -> L16
        if (r2 != null) goto L9;
        r2 = new FontFamily.Builder(r32);     // Catch: IOException -> L15 Exception -> L16
        goto L10
    L9:
        r2.addFont(r32);     // Catch: IOException -> L15 Exception -> L16
    L10:
        r1 = r1 + 1;
        goto L4
    L11:
        if (r2 == null) goto L24;
        FontFamily r83 = r2.build();     // Catch: Exception -> L16
        return new Typeface.CustomFallbackBuilder(r83).setStyle(z(r83, r10).getStyle()).build();
    L24:
        return null;
    L25:
        return null;
    }

    @Override // defpackage.ct
    public final Typeface h(Context r9, gl[] r10, int r11) {
        ContentResolver r92 = r9.getContentResolver();
        int r1 = r10.length;     // Catch: Exception -> L30
        int r2 = 0;
        FontFamily.Builder r3 = null;
    L4:
        if (r2 >= r1) goto L24;
        gl r4 = r10[r2];     // Catch: Exception -> L30
        ParcelFileDescriptor r5 = r92.openFileDescriptor(r4.a, "r", null);     // Catch: IOException -> L29 Exception -> L30
        if (r5 != null) goto L31;
        if (r5 == null) goto L23;
    L9:
        r5.close();     // Catch: IOException -> L29 Exception -> L30
        goto L23
    L31:
        Font r42 = new Font.Builder(r5).setWeight(r4.c).setSlant(r4.d ? 1 : 0).setTtcIndex(r4.b).build();     // Catch: Throwable -> L14
        if (r3 != null) goto L16;
        r3 = new FontFamily.Builder(r42);     // Catch: Throwable -> L14
        goto L9
    L16:
        r3.addFont(r42);     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        r5.close();     // Catch: Throwable -> L20
    L22:
        throw th;     // Catch: IOException -> L29 Exception -> L30
    L20:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L29 Exception -> L30
    L23:
        r2 = r2 + 1;
        goto L4
    L24:
        if (r3 == null) goto L28;
        FontFamily r93 = r3.build();     // Catch: Exception -> L30
        return new Typeface.CustomFallbackBuilder(r93).setStyle(z(r93, r11).getStyle()).build();
    L28:
        return null;
    }

    @Override // defpackage.ct
    public final Typeface i(Context r1, Resources r2, int r3, String r4, int r5) {
        Font r12 = new Font.Builder(r2, r3).build();     // Catch: Exception -> L4
        return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(r12).build()).setStyle(r12.getStyle()).build();
    L4:
        return null;
    }

    @Override // defpackage.ct
    public final gl l(int r1, gl[] r2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
