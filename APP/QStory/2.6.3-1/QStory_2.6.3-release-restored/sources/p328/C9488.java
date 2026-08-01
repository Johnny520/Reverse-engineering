package p328;

import android.content.Context;
import android.graphics.Color;
import com.android.p002dx.p005io.Opcodes;
import com.davemorrissey.labs.subscaleview.C0328R;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p069.AbstractC7390;
import p180.AbstractC8496;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲子世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9488 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int f24750 = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f24751;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f24752;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f24753;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f24754;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f24755;

    public C9488(Context context) {
        boolean zM12627 = AbstractC7390.m12627(context.getTheme(), C0328R.attr.elevationOverlayEnabled, false);
        Integer numM10605 = AbstractC5894.m10605(context, C0328R.attr.elevationOverlayColor);
        int iIntValue = numM10605 != null ? numM10605.intValue() : 0;
        Integer numM106052 = AbstractC5894.m10605(context, C0328R.attr.elevationOverlayAccentColor);
        int iIntValue2 = numM106052 != null ? numM106052.intValue() : 0;
        Integer numM106053 = AbstractC5894.m10605(context, C0328R.attr.colorSurface);
        int iIntValue3 = numM106053 != null ? numM106053.intValue() : 0;
        float f = context.getResources().getDisplayMetrics().density;
        this.f24755 = zM12627;
        this.f24754 = iIntValue;
        this.f24753 = iIntValue2;
        this.f24752 = iIntValue3;
        this.f24751 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m14917(float f, int i) {
        int i2;
        float fMin = (this.f24751 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM10583 = AbstractC5894.m10583(AbstractC8496.m13532(i, Opcodes.CONST_METHOD_TYPE), fMin, this.f24754);
        if (fMin > 0.0f && (i2 = this.f24753) != 0) {
            iM10583 = AbstractC8496.m13534(AbstractC8496.m13532(i2, f24750), iM10583);
        }
        return AbstractC8496.m13532(iM10583, iAlpha);
    }
}
