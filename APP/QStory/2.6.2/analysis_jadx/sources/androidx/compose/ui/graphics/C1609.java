package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import com.typesafe.config.impl.C3852;
import java.util.Arrays;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.serialization.json.internal.C5507;
import p088.C7176;
import p091.C7197;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1609 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f4713;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f4714;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f4715;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f4716;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f4717;

    public C1609(C7176 c7176) {
        this.f4717 = 2;
        this.f4715 = c7176;
        this.f4714 = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.f4713 = iArr;
        this.f4716 = -1;
    }

    public String toString() {
        switch (this.f4717) {
            case 2:
                return m2953();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m2949(float f) {
        ((Paint) this.f4715).setAlpha((int) Math.rint(f * 255.0f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m2950() {
        int i = this.f4716 * 2;
        this.f4714 = Arrays.copyOf((Object[]) this.f4714, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        AbstractC4346.m8838(0, 0, 14, (int[]) this.f4713, iArr);
        this.f4713 = iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int m2951() {
        Paint.Join strokeJoin = ((Paint) this.f4715).getStrokeJoin();
        int i = strokeJoin == null ? -1 : AbstractC1613.f4720[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int m2952() {
        Paint.Cap strokeCap = ((Paint) this.f4715).getStrokeCap();
        int i = strokeCap == null ? -1 : AbstractC1613.f4721[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String m2953() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f4716 + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.f4714)[i2];
            if (obj instanceof InterfaceC7190) {
                InterfaceC7190 interfaceC7190 = (InterfaceC7190) obj;
                boolean zM8917 = AbstractC4394.m8917(interfaceC7190.getKind(), C7197.f19212);
                int[] iArr = (int[]) this.f4713;
                if (!zM8917) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(interfaceC7190.mo12352(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f4713)[i2]);
                    sb.append("]");
                }
            } else if (obj == C5507.f15232) {
                sb.append("[<debug info disabled>]");
            } else if (obj != C5507.f15231) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object m2954(C3852 c3852) {
        if (((C3852) this.f4715).equals(c3852)) {
            return this.f4714;
        }
        C1609 c1609 = (C1609) this.f4713;
        if (c1609 != null) {
            return c1609.m2954(c3852);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m2955(int i) {
        ((Paint) this.f4715).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m2956(int i) {
        ((Paint) this.f4715).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m2957(float f) {
        ((Paint) this.f4715).setStrokeWidth(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void m2958(int i) {
        ((Paint) this.f4715).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m2959(long j) {
        ((Paint) this.f4715).setColor(AbstractC1581.m2863(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m2960(int i) {
        if (this.f4716 == i) {
            return;
        }
        this.f4716 = i;
        Paint paint = (Paint) this.f4715;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(AbstractC1581.m2877(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC1581.m2860(i)));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m2961(AbstractC1611 abstractC1611) {
        ((Paint) this.f4715).setPathEffect(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m2962(Shader shader) {
        this.f4714 = shader;
        ((Paint) this.f4715).setShader(shader);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void m2963(C1607 c1607) {
        this.f4713 = c1607;
        ((Paint) this.f4715).setColorFilter(c1607 != null ? c1607.f4711 : null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m2964(int i) {
        ((Paint) this.f4715).setFilterBitmap(!(i == 0));
    }

    public C1609(int i, C3852 c3852, Object obj, C1609 c1609) {
        this.f4717 = 1;
        this.f4716 = i;
        this.f4715 = c3852;
        this.f4714 = obj;
        this.f4713 = c1609;
    }

    public C1609(Paint paint) {
        this.f4717 = 0;
        this.f4715 = paint;
        this.f4716 = 3;
    }
}
