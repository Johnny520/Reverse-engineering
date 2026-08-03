package p085v;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import com.abc.core.runtime.AbstractC0805P;
import java.io.IOException;
import p000A.C0011l;
import p083u.C1087f;
import p083u.C1088g;

/* JADX INFO: renamed from: v.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1109j extends AbstractC0805P {
    /* JADX INFO: renamed from: Y */
    public static Font m2616Y(FontFamily r5, int r6) {
        if ((r6 & 1) == 0) goto L5;
        int r1 = 700;
    L6:
        int r2 = 1;
        if ((r6 & 2) == 0) goto L9;
        int r62 = 1;
    L10:
        FontStyle r02 = new FontStyle(r1, r62);
        Font r63 = r5.getFont(0);
        int r12 = m2617Z(r02, r63.getStyle());
    L12:
        if (r2 >= r5.getSize()) goto L17;
        Font r3 = r5.getFont(r2);
        int r4 = m2617Z(r02, r3.getStyle());
        if (r4 >= r12) goto L16;
        r63 = r3;
        r12 = r4;
    L16:
        r2 = r2 + 1;
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

    /* JADX INFO: renamed from: Z */
    public static int m2617Z(FontStyle r2, FontStyle r3) {
        int r02 = Math.abs(r2.getWeight() - r3.getWeight()) / 100;
        if (r2.getSlant() != r3.getSlant()) goto L5;
        int r22 = 0;
    L7:
        return r02 + r22;
    L5:
        r22 = 2;
        goto L7
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: j */
    public final Typeface mo2070j(Context r7, C1087f r8, Resources r9, int r10) {
        C1088g[] r82 = r8.f4194a;     // Catch: Exception -> L16
        int r02 = r82.length;     // Catch: Exception -> L16
        int r1 = 0;
        FontFamily.Builder r2 = null;
    L4:
        if (r1 >= r02) goto L11;
        C1088g r3 = r82[r1];     // Catch: Exception -> L16
        Font r32 = new Font.Builder(r9, r3.f4200f).setWeight(r3.f4196b).setSlant(r3.f4197c ? 1 : 0).setTtcIndex(r3.f4199e).setFontVariationSettings(r3.f4198d).build();     // Catch: IOException -> L15 Exception -> L16
        if (r2 != null) goto L9;
        r2 = new FontFamily.Builder(r32);     // Catch: IOException -> L15 Exception -> L16
        goto L10
    L9:
        r2.addFont(r32);     // Catch: IOException -> L15 Exception -> L16
    L10:
        r1 = r1 + 1;
        goto L4
    L11:
        if (r2 != null) goto L13;
        return null;
    L13:
        FontFamily r83 = r2.build();     // Catch: Exception -> L16
        return new Typeface.CustomFallbackBuilder(r83).setStyle(m2616Y(r83, r10).getStyle()).build();
    L24:
        return null;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: k */
    public final Typeface mo2071k(Context r9, C0011l[] r10, int r11) {
        ContentResolver r92 = r9.getContentResolver();
        int r1 = r10.length;     // Catch: Exception -> L28
        int r2 = 0;
        FontFamily.Builder r3 = null;
    L4:
        if (r2 >= r1) goto L24;
        C0011l r4 = r10[r2];     // Catch: Exception -> L28
        ParcelFileDescriptor r5 = r92.openFileDescriptor(r4.f30a, "r", null);     // Catch: IOException -> L29 Exception -> L28
        if (r5 != null) goto L30;
        if (r5 == null) goto L23;
    L9:
        r5.close();     // Catch: IOException -> L29 Exception -> L28
        goto L23
    L30:
        Font r42 = new Font.Builder(r5).setWeight(r4.f32c).setSlant(r4.f33d ? 1 : 0).setTtcIndex(r4.f31b).build();     // Catch: Throwable -> L14
        if (r3 != null) goto L16;
        r3 = new FontFamily.Builder(r42);     // Catch: Throwable -> L14
        goto L9
    L16:
        r3.addFont(r42);     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        r5.close();     // Catch: Throwable -> L20
    L22:
        throw th;     // Catch: IOException -> L29 Exception -> L28
    L20:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L29 Exception -> L28
    L23:
        r2 = r2 + 1;
        goto L4
    L24:
        if (r3 != null) goto L26;
        return null;
    L26:
        FontFamily r93 = r3.build();     // Catch: Exception -> L28
        return new Typeface.CustomFallbackBuilder(r93).setStyle(m2616Y(r93, r11).getStyle()).build();
    L28:
        return null;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: l */
    public final Typeface mo2072l(Context r1, Resources r2, int r3, String r4, int r5) {
        Font r12 = new Font.Builder(r2, r3).build();     // Catch: Exception -> L4
        return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(r12).build()).setStyle(r12.getStyle()).build();
    L4:
        return null;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: m */
    public final C0011l mo2073m(int r1, C0011l[] r2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
