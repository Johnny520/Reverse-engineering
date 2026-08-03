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
    public static Font m1827X(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM1828a0 = m1828a0(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM1828a02 = m1828a0(fontStyle, font2.getStyle());
            if (iM1828a02 < iM1828a0) {
                font = font2;
                iM1828a0 = iM1828a02;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: a0 */
    public static int m1828a0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX INFO: renamed from: Y */
    public final FontFamily m1829Y(C1098Zh[] c1098ZhArr, ContentResolver contentResolver) {
        Font fontBuild;
        String str;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (C1098Zh c1098Zh : c1098ZhArr) {
            if (Objects.equals(c1098Zh.f3485a.getScheme(), "systemfont")) {
                fontBuild = mo1830Z(c1098Zh);
            } else {
                try {
                    Uri uri = c1098Zh.f3485a;
                    str = c1098Zh.f3489e;
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    fontBuild = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c1098Zh.f3487c).setSlant(c1098Zh.f3488d ? 1 : 0).setTtcIndex(c1098Zh.f3486b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        fontBuild = ttcIndex.build();
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: Z */
    public Font mo1830Z(C1098Zh c1098Zh) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: q */
    public final Typeface mo1762q(Context context, C0926Vh c0926Vh, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C0969Wh c0969Wh : c0926Vh.f2889a) {
                try {
                    Font fontBuild = new Font.Builder(resources, c0969Wh.f3024f).setWeight(c0969Wh.f3020b).setSlant(c0969Wh.f3021c ? 1 : 0).setTtcIndex(c0969Wh.f3023e).setFontVariationSettings(c0969Wh.f3022d).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m1827X(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: r */
    public final Typeface mo1763r(Context context, C1098Zh[] c1098ZhArr, int i) {
        try {
            FontFamily fontFamilyM1829Y = m1829Y(c1098ZhArr, context.getContentResolver());
            if (fontFamilyM1829Y == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM1829Y).setStyle(m1827X(fontFamilyM1829Y, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: s */
    public final Typeface mo1831s(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM1829Y = m1829Y((C1098Zh[]) list.get(0), contentResolver);
            if (fontFamilyM1829Y == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM1829Y);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyM1829Y2 = m1829Y((C1098Zh[]) list.get(i2), contentResolver);
                if (fontFamilyM1829Y2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM1829Y2);
                }
            }
            return customFallbackBuilder.setStyle(m1827X(fontFamilyM1829Y, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: t */
    public final Typeface mo1764t(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: w */
    public final C1098Zh mo1832w(C1098Zh[] c1098ZhArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
