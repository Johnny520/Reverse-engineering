package p164;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;
import p153.C7601;

/* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7669 extends C7667 {
    @Override // p164.C7667
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final Font mo12951(C7601 c7601) {
        Font fontM12903;
        Uri uri = c7601.f20623;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = c7601.f20619;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontM12903 = AbstractC7662.m12903(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontM12903;
                }
                try {
                    return new Font.Builder(fontM12903).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
