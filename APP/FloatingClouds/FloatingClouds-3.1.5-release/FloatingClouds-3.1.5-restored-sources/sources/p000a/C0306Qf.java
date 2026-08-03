package p000a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import p000a.C0332S6;

/* JADX INFO: renamed from: a.Qf */
/* JADX INFO: loaded from: classes.dex */
public final class C0306Qf extends C0323Rf {
    /* JADX INFO: renamed from: e */
    public static Font m851e(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM852f = m852f(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM852f2 = m852f(fontStyle, font2.getStyle());
            if (iM852f2 < iM852f) {
                font = font2;
                iM852f = iM852f2;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: f */
    public static int m852f(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p000a.C0323Rf
    /* JADX INFO: renamed from: a */
    public final Typeface mo690a(Context context, C0332S6.c cVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C0332S6.d dVar : cVar.f1186a) {
                try {
                    Font fontBuild = new Font.Builder(resources, dVar.f1192f).setWeight(dVar.f1188b).setSlant(dVar.f1189c ? 1 : 0).setTtcIndex(dVar.f1191e).setFontVariationSettings(dVar.f1190d).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m851e(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p000a.C0323Rf
    /* JADX INFO: renamed from: b */
    public final Typeface mo753b(Context context, C0350T6[] c0350t6Arr, int i) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C0350T6 c0350t6 : c0350t6Arr) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c0350t6.f1244a, "r", null);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c0350t6.f1246c).setSlant(c0350t6.f1247d ? 1 : 0).setTtcIndex(c0350t6.f1245b).build();
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
                return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m851e(fontFamilyBuild, i).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // p000a.C0323Rf
    /* JADX INFO: renamed from: c */
    public final Typeface mo754c(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p000a.C0323Rf
    /* JADX INFO: renamed from: d */
    public final C0350T6 mo853d(int i, C0350T6[] c0350t6Arr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
