package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import com.typesafe.config.impl.C3853;
import java.util.Arrays;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.serialization.json.internal.C5508;
import p088.C7177;
import p091.C7198;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1609 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f4714;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f4715;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f4716;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f4717;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f4718;

    public C1609(C7177 c7177) {
        this.f4718 = 2;
        this.f4716 = c7177;
        this.f4715 = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.f4714 = iArr;
        this.f4717 = -1;
    }

    public String toString() {
        switch (this.f4718) {
            case 2:
                return m2963();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m2959(float f) {
        ((Paint) this.f4716).setAlpha((int) Math.rint(f * 255.0f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m2960() {
        int i = this.f4717 * 2;
        this.f4715 = Arrays.copyOf((Object[]) this.f4715, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        AbstractC4347.m8841(0, 0, 14, (int[]) this.f4714, iArr);
        this.f4714 = iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int m2961() {
        Paint.Join strokeJoin = ((Paint) this.f4716).getStrokeJoin();
        int i = strokeJoin == null ? -1 : AbstractC1613.f4721[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int m2962() {
        Paint.Cap strokeCap = ((Paint) this.f4716).getStrokeCap();
        int i = strokeCap == null ? -1 : AbstractC1613.f4722[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String m2963() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f4717 + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.f4715)[i2];
            if (obj instanceof InterfaceC7191) {
                InterfaceC7191 interfaceC7191 = (InterfaceC7191) obj;
                boolean zM8907 = AbstractC4395.m8907(interfaceC7191.getKind(), C7198.f19210);
                int[] iArr = (int[]) this.f4714;
                if (!zM8907) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(interfaceC7191.mo12379(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f4714)[i2]);
                    sb.append("]");
                }
            } else if (obj == C5508.f15232) {
                sb.append("[<debug info disabled>]");
            } else if (obj != C5508.f15231) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object m2964(C3853 c3853) {
        if (((C3853) this.f4716).equals(c3853)) {
            return this.f4715;
        }
        C1609 c1609 = (C1609) this.f4714;
        if (c1609 != null) {
            return c1609.m2964(c3853);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m2965(int i) {
        ((Paint) this.f4716).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m2966(int i) {
        ((Paint) this.f4716).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m2967(float f) {
        ((Paint) this.f4716).setStrokeWidth(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void m2968(int i) {
        ((Paint) this.f4716).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m2969(long j) {
        ((Paint) this.f4716).setColor(AbstractC1581.m2873(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m2970(int i) {
        if (this.f4717 == i) {
            return;
        }
        this.f4717 = i;
        Paint paint = (Paint) this.f4716;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(AbstractC1581.m2887(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC1581.m2870(i)));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m2971(AbstractC1611 abstractC1611) {
        ((Paint) this.f4716).setPathEffect(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m2972(Shader shader) {
        this.f4715 = shader;
        ((Paint) this.f4716).setShader(shader);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void m2973(C1607 c1607) {
        this.f4714 = c1607;
        ((Paint) this.f4716).setColorFilter(c1607 != null ? c1607.f4712 : null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m2974(int i) {
        ((Paint) this.f4716).setFilterBitmap(!(i == 0));
    }

    public C1609(int i, C3853 c3853, Object obj, C1609 c1609) {
        this.f4718 = 1;
        this.f4717 = i;
        this.f4716 = c3853;
        this.f4715 = obj;
        this.f4714 = c1609;
    }

    public C1609(Paint paint) {
        this.f4718 = 0;
        this.f4716 = paint;
        this.f4717 = 3;
    }
}
