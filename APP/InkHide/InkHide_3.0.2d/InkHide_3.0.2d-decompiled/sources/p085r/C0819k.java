package p085r;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p052b1.AbstractC0503h;
import p083q.C0792f;
import p083q.C0793g;
import p093v.C1023h;

/* JADX INFO: renamed from: r.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0819k extends AbstractC0503h {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static Font m1495Q(FontFamily fontFamily, int i2) {
        FontStyle fontStyle = new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM1496R = m1496R(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            Font font2 = fontFamily.getFont(i3);
            int iM1496R2 = m1496R(fontStyle, font2.getStyle());
            if (iM1496R2 < iM1496R) {
                font = font2;
                iM1496R = iM1496R2;
            }
        }
        return font;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static int m1496R(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: l */
    public final Typeface mo1001l(Context context, C0792f c0792f, Resources resources, int i2) {
        try {
            FontFamily.Builder builder = null;
            for (C0793g c0793g : c0792f.f2638a) {
                try {
                    Font fontBuild = new Font.Builder(resources, c0793g.f2644f).setWeight(c0793g.f2640b).setSlant(c0793g.f2641c ? 1 : 0).setTtcIndex(c0793g.f2643e).setFontVariationSettings(c0793g.f2642d).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m1495Q(fontFamilyBuild, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: m */
    public final Typeface mo1002m(Context context, C1023h[] c1023hArr, int i2) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C1023h c1023h : c1023hArr) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c1023h.f3632a, "r", null);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c1023h.f3634c).setSlant(c1023h.f3635d ? 1 : 0).setTtcIndex(c1023h.f3633b).build();
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
                return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m1495Q(fontFamilyBuild, i2).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: n */
    public final Typeface mo1003n(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: o */
    public final Typeface mo1004o(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font fontBuild = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: t */
    public final C1023h mo1005t(int i2, C1023h[] c1023hArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
