package p312;

import android.content.Context;
import android.graphics.Color;
import com.android.dx.io.Opcodes;
import com.davemorrissey.labs.subscaleview.R;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p164.AbstractC7666;
import p251.AbstractC8174;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲子世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8667 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int f24414 = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f24415;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f24416;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f24417;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f24418;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f24419;

    public C8667(Context context) {
        boolean zM13596 = AbstractC8174.m13596(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        Integer numM9893 = AbstractC4921.m9893(context, R.attr.elevationOverlayColor);
        int iIntValue = numM9893 != null ? numM9893.intValue() : 0;
        Integer numM98932 = AbstractC4921.m9893(context, R.attr.elevationOverlayAccentColor);
        int iIntValue2 = numM98932 != null ? numM98932.intValue() : 0;
        Integer numM98933 = AbstractC4921.m9893(context, R.attr.colorSurface);
        int iIntValue3 = numM98933 != null ? numM98933.intValue() : 0;
        float f = context.getResources().getDisplayMetrics().density;
        this.f24419 = zM13596;
        this.f24418 = iIntValue;
        this.f24417 = iIntValue2;
        this.f24416 = iIntValue3;
        this.f24415 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m14340(float f, int i) {
        int i2;
        float fMin = (this.f24415 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM9884 = AbstractC4921.m9884(AbstractC7666.m12944(i, Opcodes.CONST_METHOD_TYPE), fMin, this.f24418);
        if (fMin > 0.0f && (i2 = this.f24417) != 0) {
            iM9884 = AbstractC7666.m12946(AbstractC7666.m12944(i2, f24414), iM9884);
        }
        return AbstractC7666.m12944(iM9884, iAlpha);
    }
}
