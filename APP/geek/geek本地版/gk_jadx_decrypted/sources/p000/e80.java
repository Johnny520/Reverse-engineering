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
public final class e80 extends AbstractC0126ct {
    /* JADX INFO: renamed from: A */
    public static int m1002A(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX INFO: renamed from: z */
    public static Font m1003z(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM1002A = m1002A(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM1002A2 = m1002A(fontStyle, font2.getStyle());
            if (iM1002A2 < iM1002A) {
                font = font2;
                iM1002A = iM1002A2;
            }
        }
        return font;
    }

    @Override // p000.AbstractC0126ct
    /* JADX INFO: renamed from: g */
    public final Typeface mo643g(Context context, C0155dl c0155dl, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C0191el c0191el : c0155dl.f1604a) {
                try {
                    Font fontBuild = new Font.Builder(resources, c0191el.f1816f).setWeight(c0191el.f1812b).setSlant(c0191el.f1813c ? 1 : 0).setTtcIndex(c0191el.f1815e).setFontVariationSettings(c0191el.f1814d).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m1003z(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p000.AbstractC0126ct
    /* JADX INFO: renamed from: h */
    public final Typeface mo644h(Context context, C0265gl[] c0265glArr, int i) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C0265gl c0265gl : c0265glArr) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c0265gl.f2136a, "r", null);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c0265gl.f2138c).setSlant(c0265gl.f2139d ? 1 : 0).setTtcIndex(c0265gl.f2137b).build();
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
                return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m1003z(fontFamilyBuild, i).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // p000.AbstractC0126ct
    /* JADX INFO: renamed from: i */
    public final Typeface mo645i(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p000.AbstractC0126ct
    /* JADX INFO: renamed from: l */
    public final C0265gl mo828l(int i, C0265gl[] c0265glArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
