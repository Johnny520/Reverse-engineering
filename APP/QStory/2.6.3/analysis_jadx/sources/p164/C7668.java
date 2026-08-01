package p164;

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
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import p053.AbstractC6561;
import p153.C7602;
import p161.C7638;
import p161.C7639;

/* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C7668 extends AbstractC6561 {
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public static int m12977(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static Font m12978(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM12977 = m12977(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM129772 = m12977(fontStyle, font2.getStyle());
            if (iM129772 < iM12977) {
                font = font2;
                iM12977 = iM129772;
            }
        }
        return font;
    }

    @Override // p053.AbstractC6561
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final Typeface mo12070(Context context, Resources resources, int i, String str) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // p053.AbstractC6561
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final Typeface mo12071(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM12980 = m12980((C7602[]) list.get(0), contentResolver);
            if (fontFamilyM12980 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM12980);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyM129802 = m12980((C7602[]) list.get(i2), contentResolver);
                if (fontFamilyM129802 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM129802);
                }
            }
            return customFallbackBuilder.setStyle(m12978(fontFamilyM12980, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // p053.AbstractC6561
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Typeface mo12072(Context context, C7602[] c7602Arr, int i) {
        try {
            FontFamily fontFamilyM12980 = m12980(c7602Arr, context.getContentResolver());
            if (fontFamilyM12980 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM12980).setStyle(m12978(fontFamilyM12980, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // p053.AbstractC6561
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Typeface mo12073(Context context, C7639 c7639, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C7638 c7638 : c7639.f20732) {
                try {
                    Font fontBuild = new Font.Builder(resources, c7638.f20726).setWeight(c7638.f20730).setSlant(c7638.f20729 ? 1 : 0).setTtcIndex(c7638.f20727).setFontVariationSettings(c7638.f20728).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m12978(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public Font mo12979(C7602 c7602) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final FontFamily m12980(C7602[] c7602Arr, ContentResolver contentResolver) {
        Font fontBuild;
        String str;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (C7602 c7602 : c7602Arr) {
            if (Objects.equals(c7602.f20618.getScheme(), "systemfont")) {
                fontBuild = mo12979(c7602);
            } else {
                try {
                    Uri uri = c7602.f20618;
                    str = c7602.f20614;
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                    fontBuild = null;
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    fontBuild = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c7602.f20616).setSlant(c7602.f20615 ? 1 : 0).setTtcIndex(c7602.f20617);
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
}
