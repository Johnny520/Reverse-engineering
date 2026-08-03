package p000;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: XB */
/* JADX INFO: loaded from: classes.dex */
public final class C1000XB extends C0957WB {
    @Override // p000.C0957WB
    /* JADX INFO: renamed from: Z */
    public final Font mo1830Z(C1098Zh c1098Zh) {
        Font fontM1710d;
        Uri uri = c1098Zh.f3485a;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = c1098Zh.f3489e;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontM1710d = AbstractC0871UB.m1710d(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontM1710d;
                }
                try {
                    return new Font.Builder(fontM1710d).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }
}
