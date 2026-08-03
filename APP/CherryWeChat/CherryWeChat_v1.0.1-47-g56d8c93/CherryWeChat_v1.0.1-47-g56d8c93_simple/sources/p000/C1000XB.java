package p000;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: XB */
/* JADX INFO: loaded from: classes.dex */
public final class C1000XB extends C0957WB {
    @Override // p000.C0957WB
    /* JADX INFO: renamed from: Z */
    public final Font mo1830Z(C1098Zh r5) {
        Uri r0 = r5.f3485a;
        boolean r1 = Objects.equals(r0.getScheme(), "systemfont");
        String r52 = r5.f3489e;
        if (r1 == false) goto L5;
        String r02 = r0.getAuthority();
    L6:
        if (r02 == null) goto L24;
        Typeface r03 = Typeface.create(r02, 0);
        Typeface r12 = Typeface.create(Typeface.DEFAULT, 0);
        if (r03 != null) goto L11;
    L13:
        r03 = null;
    L14:
        if (r03 == null) goto L24;
        Font r04 = AbstractC0871UB.m1710d(r03);
        if (r04 == null) goto L24;
        if (TextUtils.isEmpty(r52) == false) goto L26;
        return r04;
    L26:
        return new Font.Builder(r04).setFontVariationSettings(r52).build();
    L11:
        if (r03.equals(r12) == true) goto L13;
    L24:
        return null;
    L5:
        r02 = null;
        goto L6
    }
}
