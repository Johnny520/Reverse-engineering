package p252r3;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import p292u3.AbstractC8503f;

/* JADX INFO: renamed from: r3.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C6481l extends AbstractC6482m {
    /* JADX INFO: renamed from: f */
    public static FontFamily m25674f(CancellationSignal cancellationSignal, AbstractC8503f.b[] bVarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (AbstractC8503f.b bVar : bVarArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(bVar.m32749d(), "r", cancellationSignal);
            } catch (IOException e10) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(bVar.m32750e()).setSlant(bVar.m32751f() ? 1 : 0).setTtcIndex(bVar.m32748c()).build();
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
        return builder.build();
    }

    /* JADX INFO: renamed from: g */
    public static int m25675g(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p252r3.AbstractC6482m
    /* JADX INFO: renamed from: a */
    public Typeface mo25660a(Context context, CancellationSignal cancellationSignal, AbstractC8503f.b[] bVarArr, int i10) {
        try {
            FontFamily fontFamilyM25674f = m25674f(cancellationSignal, bVarArr, context.getContentResolver());
            if (fontFamilyM25674f == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM25674f).setStyle(m25676e(fontFamilyM25674f, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Font m25676e(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM25675g = m25675g(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iM25675g2 = m25675g(fontStyle, font2.getStyle());
            if (iM25675g2 < iM25675g) {
                font = font2;
                iM25675g = iM25675g2;
            }
        }
        return font;
    }
}
