package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: WB */
/* JADX INFO: loaded from: classes.dex */
public class C0957WB extends AbstractC1293cr {
    /* JADX INFO: renamed from: X */
    public static Font m1827X(FontFamily r5, int r6) {
        if ((r6 & 1) == 0) goto L5;
        int r1 = 700;
    L6:
        int r3 = 1;
        if ((r6 & 2) == 0) goto L9;
        int r62 = 1;
    L10:
        FontStyle r0 = new FontStyle(r1, r62);
        Font r63 = r5.getFont(0);
        int r12 = m1828a0(r0, r63.getStyle());
    L12:
        if (r3 >= r5.getSize()) goto L17;
        Font r2 = r5.getFont(r3);
        int r4 = m1828a0(r0, r2.getStyle());
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

    /* JADX INFO: renamed from: a0 */
    public static int m1828a0(FontStyle r2, FontStyle r3) {
        int r0 = Math.abs(r2.getWeight() - r3.getWeight()) / 100;
        if (r2.getSlant() != r3.getSlant()) goto L5;
        int r22 = 0;
    L7:
        return r0 + r22;
    L5:
        r22 = 2;
        goto L7
    }

    /* JADX INFO: renamed from: Y */
    public final FontFamily m1829Y(C1098Zh[] r10, ContentResolver r11) {
        int r0 = r10.length;
        int r2 = 0;
        FontFamily.Builder r3 = null;
    L3:
        if (r2 >= r0) goto L31;
        C1098Zh r4 = r10[r2];
        if (Objects.equals(r4.f3485a.getScheme(), "systemfont") == false) goto L40;
        Font r42 = mo1830Z(r4);
    L25:
        if (r42 == null) goto L30;
        if (r3 != null) goto L29;
        r3 = new FontFamily.Builder(r42);
        goto L30
    L29:
        r3.addFont(r42);
    L30:
        r2 = r2 + 1;
        goto L3
    L40:
        Uri r5 = r4.f3485a;     // Catch: IOException -> L35
        String r6 = r4.f3489e;     // Catch: IOException -> L35
        ParcelFileDescriptor r52 = r11.openFileDescriptor(r5, "r", null);     // Catch: IOException -> L35
        if (r52 != null) goto L38;
        if (r52 == null) goto L11;
        r52.close();     // Catch: IOException -> L35
        goto L11
    L38:
        Font.Builder r43 = new Font.Builder(r52).setWeight(r4.f3487c).setSlant(r4.f3488d ? 1 : 0).setTtcIndex(r4.f3486b);     // Catch: Throwable -> L15
        if (TextUtils.isEmpty(r6) == true) goto L17;
        r43.setFontVariationSettings(r6);     // Catch: Throwable -> L15
    L17:
        r42 = r43.build();     // Catch: Throwable -> L15
        r52.close();     // Catch: IOException -> L35
        goto L25
    L15:
        th = move-exception;
        r52.close();     // Catch: Throwable -> L22
    L24:
        throw th;     // Catch: IOException -> L35
    L22:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L35
    L11:
        r42 = null;
        goto L25
    L31:
        if (r3 != null) goto L34;
        return null;
    L34:
        return r3.build();
    }

    /* JADX INFO: renamed from: Z */
    public Font mo1830Z(C1098Zh r2) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: q */
    public final Typeface mo1762q(Context r7, C0926Vh r8, Resources r9, int r10) {
        C0969Wh[] r82 = r8.f2889a;     // Catch: Exception -> L16
        int r0 = r82.length;     // Catch: Exception -> L16
        int r1 = 0;
        FontFamily.Builder r2 = null;
    L4:
        if (r1 >= r0) goto L11;
        C0969Wh r3 = r82[r1];     // Catch: Exception -> L16
        Font r32 = new Font.Builder(r9, r3.f3024f).setWeight(r3.f3020b).setSlant(r3.f3021c ? 1 : 0).setTtcIndex(r3.f3023e).setFontVariationSettings(r3.f3022d).build();     // Catch: IOException -> L15 Exception -> L16
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
        return new Typeface.CustomFallbackBuilder(r83).setStyle(m1827X(r83, r10).getStyle()).build();
    L24:
        return null;
    L25:
        return null;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: r */
    public final Typeface mo1763r(Context r1, C1098Zh[] r2, int r3) {
        FontFamily r12 = m1829Y(r2, r1.getContentResolver());     // Catch: Exception -> L10
        if (r12 == null) goto L8;
        return new Typeface.CustomFallbackBuilder(r12).setStyle(m1827X(r12, r3).getStyle()).build();
    L8:
        return null;
    L13:
        return null;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: s */
    public final Typeface mo1831s(Context r5, List r6, int r7) {
        ContentResolver r52 = r5.getContentResolver();
        FontFamily r0 = m1829Y((C1098Zh[]) r6.get(0), r52);     // Catch: Exception -> L17
        if (r0 == null) goto L15;
        Typeface.CustomFallbackBuilder r1 = new Typeface.CustomFallbackBuilder(r0);     // Catch: Exception -> L17
        int r2 = 1;
    L8:
        if (r2 >= r6.size()) goto L13;
        FontFamily r3 = m1829Y((C1098Zh[]) r6.get(r2), r52);     // Catch: Exception -> L17
        if (r3 == null) goto L12;
        r1.addCustomFallback(r3);     // Catch: Exception -> L17
    L12:
        r2 = r2 + 1;     // Catch: Exception -> L17
        goto L8
    L13:
        return r1.setStyle(m1827X(r0, r7).getStyle()).build();
    L15:
        return null;
    L23:
        return null;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: t */
    public final Typeface mo1764t(Context r1, Resources r2, int r3, String r4, int r5) {
        Font r12 = new Font.Builder(r2, r3).build();     // Catch: Exception -> L4
        return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(r12).build()).setStyle(r12.getStyle()).build();
    L4:
        return null;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: w */
    public final C1098Zh mo1832w(C1098Zh[] r1, int r2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
