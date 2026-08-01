package p312;

import android.content.Context;
import android.graphics.Color;
import com.android.dx.io.Opcodes;
import com.davemorrissey.labs.subscaleview.R;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p053.AbstractC6561;
import p164.AbstractC7667;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲子世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8659 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int f24405 = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f24406;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f24407;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f24408;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f24409;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f24410;

    public C8659(Context context) {
        boolean zM12068 = AbstractC6561.m12068(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        Integer numM10046 = AbstractC5062.m10046(context, R.attr.elevationOverlayColor);
        int iIntValue = numM10046 != null ? numM10046.intValue() : 0;
        Integer numM100462 = AbstractC5062.m10046(context, R.attr.elevationOverlayAccentColor);
        int iIntValue2 = numM100462 != null ? numM100462.intValue() : 0;
        Integer numM100463 = AbstractC5062.m10046(context, R.attr.colorSurface);
        int iIntValue3 = numM100463 != null ? numM100463.intValue() : 0;
        float f = context.getResources().getDisplayMetrics().density;
        this.f24410 = zM12068;
        this.f24409 = iIntValue;
        this.f24408 = iIntValue2;
        this.f24407 = iIntValue3;
        this.f24406 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m14358(float f, int i) {
        int i2;
        float fMin = (this.f24406 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM10024 = AbstractC5062.m10024(AbstractC7667.m12973(i, Opcodes.CONST_METHOD_TYPE), fMin, this.f24409);
        if (fMin > 0.0f && (i2 = this.f24408) != 0) {
            iM10024 = AbstractC7667.m12975(AbstractC7667.m12973(i2, f24405), iM10024);
        }
        return AbstractC7667.m12973(iM10024, iAlpha);
    }
}
