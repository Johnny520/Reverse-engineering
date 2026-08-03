package p085v;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import p000A.C0011l;
import p056f0.AbstractC0805P;
import p083u.C1087f;
import p083u.C1088g;

/* JADX INFO: renamed from: v.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1109j extends AbstractC0805P {
    /* JADX INFO: renamed from: Y */
    public static Font m2616Y(FontFamily fontFamily, int i2) {
        FontStyle fontStyle = new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM2617Z = m2617Z(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            Font font2 = fontFamily.getFont(i3);
            int iM2617Z2 = m2617Z(fontStyle, font2.getStyle());
            if (iM2617Z2 < iM2617Z) {
                font = font2;
                iM2617Z = iM2617Z2;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: Z */
    public static int m2617Z(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: j */
    public final Typeface mo2070j(Context context, C1087f c1087f, Resources resources, int i2) {
        try {
            FontFamily.Builder builder = null;
            for (C1088g c1088g : c1087f.f4194a) {
                try {
                    Font fontBuild = new Font.Builder(resources, c1088g.f4200f).setWeight(c1088g.f4196b).setSlant(c1088g.f4197c ? 1 : 0).setTtcIndex(c1088g.f4199e).setFontVariationSettings(c1088g.f4198d).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m2616Y(fontFamilyBuild, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: k */
    public final Typeface mo2071k(Context context, C0011l[] c0011lArr, int i2) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C0011l c0011l : c0011lArr) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c0011l.f30a, "r", null);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c0011l.f32c).setSlant(c0011l.f33d ? 1 : 0).setTtcIndex(c0011l.f31b).build();
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
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m2616Y(fontFamilyBuild, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: l */
    public final Typeface mo2072l(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font fontBuild = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: m */
    public final C0011l mo2073m(int i2, C0011l[] c0011lArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
