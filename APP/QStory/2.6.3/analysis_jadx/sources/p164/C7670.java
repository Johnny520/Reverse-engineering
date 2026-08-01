package p164;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;
import p153.C7602;

/* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7670 extends C7668 {
    @Override // p164.C7668
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public final Font mo12979(C7602 c7602) {
        Font fontM12932;
        Uri uri = c7602.f20618;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = c7602.f20614;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontM12932 = AbstractC7663.m12932(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontM12932;
                }
                try {
                    return new Font.Builder(fontM12932).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
