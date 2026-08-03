package Yue;

import Yue.C5053;
import Yue.C5058;
import Yue.InterfaceC7144;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Yue.ۥۢۢۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
@InterfaceC7113(29)
public class C8028 extends C8029 {
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static int m25373(@InterfaceC6391 FontStyle fontStyle, @InterfaceC6391 FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // Yue.C8029
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public Typeface mo4044(Context context, C5053.C5055 c5055, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C5053.C5056 c5056 : c5055.m1871()) {
                try {
                    Font fontBuild = new Font.Builder(resources, c5056.m1873()).setWeight(c5056.m15572()).setSlant(c5056.m15573() ? 1 : 0).setTtcIndex(c5056.m15570()).setFontVariationSettings(c5056.m15571()).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m25376(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // Yue.C8029
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public Typeface mo25351(Context context, @InterfaceC6490 CancellationSignal cancellationSignal, @InterfaceC6391 C5058.C5059[] c5059Arr, int i) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C5058.C5059 c5059 : c5059Arr) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c5059.m15585(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c5059.m15586()).setSlant(c5059.m15587() ? 1 : 0).setTtcIndex(c5059.m15584()).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m25376(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // Yue.C8029
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Typeface mo25374(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // Yue.C8029
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public Typeface mo25358(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // Yue.C8029
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public Typeface mo25352(@InterfaceC6391 Context context, @InterfaceC6391 Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    @Override // Yue.C8029
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public C5058.C5059 mo25375(C5058.C5059[] c5059Arr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final Font m25376(@InterfaceC6391 FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM25373 = m25373(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM253732 = m25373(fontStyle, font2.getStyle());
            if (iM253732 < iM25373) {
                font = font2;
                iM25373 = iM253732;
            }
        }
        return font;
    }
}
