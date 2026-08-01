package p000;

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
public final class k80 extends AbstractC0387ju {
    /* JADX INFO: renamed from: y */
    public static Font m1665y(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM1666z = m1666z(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM1666z2 = m1666z(fontStyle, font2.getStyle());
            if (iM1666z2 < iM1666z) {
                font = font2;
                iM1666z = iM1666z2;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: z */
    public static int m1666z(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p000.AbstractC0387ju
    /* JADX INFO: renamed from: g */
    public final Typeface mo1486g(Context context, C0228fl c0228fl, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C0265gl c0265gl : c0228fl.f1805a) {
                try {
                    Font fontBuild = new Font.Builder(resources, c0265gl.f2027f).setWeight(c0265gl.f2023b).setSlant(c0265gl.f2024c ? 1 : 0).setTtcIndex(c0265gl.f2026e).setFontVariationSettings(c0265gl.f2025d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m1665y(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p000.AbstractC0387ju
    /* JADX INFO: renamed from: h */
    public final Typeface mo1487h(Context context, C0338il[] c0338ilArr, int i) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C0338il c0338il : c0338ilArr) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c0338il.f2548a, "r", null);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c0338il.f2550c).setSlant(c0338il.f2551d ? 1 : 0).setTtcIndex(c0338il.f2549b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            }
            if (builder != null) {
                FontFamily fontFamilyBuild = builder.build();
                return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m1665y(fontFamilyBuild, i).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // p000.AbstractC0387ju
    /* JADX INFO: renamed from: i */
    public final Typeface mo1488i(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p000.AbstractC0387ju
    /* JADX INFO: renamed from: l */
    public final C0338il mo1634l(int i, C0338il[] c0338ilArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
