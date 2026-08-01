package p180;

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
import p069.AbstractC7390;
import p169.C8431;
import p177.C8467;
import p177.C8468;

/* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8497 extends AbstractC7390 {
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public static int m13536(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static Font m13537(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM13536 = m13536(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM135362 = m13536(fontStyle, font2.getStyle());
            if (iM135362 < iM13536) {
                font = font2;
                iM13536 = iM135362;
            }
        }
        return font;
    }

    @Override // p069.AbstractC7390
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final Typeface mo12629(Context context, Resources resources, int i, String str) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // p069.AbstractC7390
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final Typeface mo12630(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM13539 = m13539((C8431[]) list.get(0), contentResolver);
            if (fontFamilyM13539 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM13539);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyM135392 = m13539((C8431[]) list.get(i2), contentResolver);
                if (fontFamilyM135392 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM135392);
                }
            }
            return customFallbackBuilder.setStyle(m13537(fontFamilyM13539, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // p069.AbstractC7390
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Typeface mo12631(Context context, C8431[] c8431Arr, int i) {
        try {
            FontFamily fontFamilyM13539 = m13539(c8431Arr, context.getContentResolver());
            if (fontFamilyM13539 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM13539).setStyle(m13537(fontFamilyM13539, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // p069.AbstractC7390
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Typeface mo12632(Context context, C8468 c8468, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C8467 c8467 : c8468.f21077) {
                try {
                    Font fontBuild = new Font.Builder(resources, c8467.f21071).setWeight(c8467.f21075).setSlant(c8467.f21074 ? 1 : 0).setTtcIndex(c8467.f21072).setFontVariationSettings(c8467.f21073).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m13537(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public Font mo13538(C8431 c8431) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final FontFamily m13539(C8431[] c8431Arr, ContentResolver contentResolver) {
        Font fontBuild;
        String str;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (C8431 c8431 : c8431Arr) {
            if (Objects.equals(c8431.f20963.getScheme(), "systemfont")) {
                fontBuild = mo13538(c8431);
            } else {
                try {
                    Uri uri = c8431.f20963;
                    str = c8431.f20959;
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
                        Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c8431.f20961).setSlant(c8431.f20960 ? 1 : 0).setTtcIndex(c8431.f20962);
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
