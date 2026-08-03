package p018b3;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import p000a.AbstractC0000a;
import p059e3.C0823d;

/* JADX INFO: renamed from: b3.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0176f extends AbstractC0000a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e1 */
    public static FontFamily m772e1(C0823d[] c0823dArr, ContentResolver contentResolver) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (C0823d c0823d : c0823dArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c0823d.f2468a, "r", null);
            } catch (IOException e6) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c0823d.f2470c).setSlant(c0823d.f2471d ? 1 : 0).setTtcIndex(c0823d.f2469b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th2) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f1 */
    public static int m773f1(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000a.AbstractC0000a
    /* JADX INFO: renamed from: D */
    public final Typeface mo104D(Context context, C0823d[] c0823dArr) {
        try {
            FontFamily fontFamilyM772e1 = m772e1(c0823dArr, context.getContentResolver());
            if (fontFamilyM772e1 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM772e1);
            FontStyle fontStyle = new FontStyle(400, 0);
            Font font = fontFamilyM772e1.getFont(0);
            int iM773f1 = m773f1(fontStyle, font.getStyle());
            for (int i9 = 1; i9 < fontFamilyM772e1.getSize(); i9++) {
                Font font2 = fontFamilyM772e1.getFont(i9);
                int iM773f12 = m773f1(fontStyle, font2.getStyle());
                if (iM773f12 < iM773f1) {
                    font = font2;
                    iM773f1 = iM773f12;
                }
            }
            return customFallbackBuilder.setStyle(font.getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }
}
