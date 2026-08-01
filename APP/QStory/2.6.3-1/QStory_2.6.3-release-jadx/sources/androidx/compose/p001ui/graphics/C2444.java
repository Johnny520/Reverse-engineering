package androidx.compose.p001ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import com.typesafe.config.impl.C4685;
import java.util.Arrays;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.serialization.json.internal.C6340;
import p104.C8006;
import p107.C8027;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2444 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f5059;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f5060;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f5061;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f5062;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f5063;

    public C2444(C8006 c8006) {
        this.f5063 = 2;
        this.f5061 = c8006;
        this.f5060 = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.f5059 = iArr;
        this.f5062 = -1;
    }

    public String toString() {
        switch (this.f5063) {
            case 2:
                return m3523();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m3519(float f) {
        ((Paint) this.f5061).setAlpha((int) Math.rint(f * 255.0f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m3520() {
        int i = this.f5062 * 2;
        this.f5060 = Arrays.copyOf((Object[]) this.f5060, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        AbstractC5179.m9400(0, 0, 14, (int[]) this.f5059, iArr);
        this.f5059 = iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int m3521() {
        Paint.Join strokeJoin = ((Paint) this.f5061).getStrokeJoin();
        int i = strokeJoin == null ? -1 : AbstractC2448.f5066[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int m3522() {
        Paint.Cap strokeCap = ((Paint) this.f5061).getStrokeCap();
        int i = strokeCap == null ? -1 : AbstractC2448.f5067[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String m3523() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f5062 + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.f5060)[i2];
            if (obj instanceof InterfaceC8020) {
                InterfaceC8020 interfaceC8020 = (InterfaceC8020) obj;
                boolean zM9466 = AbstractC5227.m9466(interfaceC8020.getKind(), C8027.f19555);
                int[] iArr = (int[]) this.f5059;
                if (!zM9466) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(interfaceC8020.mo12938(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f5059)[i2]);
                    sb.append("]");
                }
            } else if (obj == C6340.f15577) {
                sb.append("[<debug info disabled>]");
            } else if (obj != C6340.f15576) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object m3524(C4685 c4685) {
        if (((C4685) this.f5061).equals(c4685)) {
            return this.f5060;
        }
        C2444 c2444 = (C2444) this.f5059;
        if (c2444 != null) {
            return c2444.m3524(c4685);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m3525(int i) {
        ((Paint) this.f5061).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m3526(int i) {
        ((Paint) this.f5061).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m3527(float f) {
        ((Paint) this.f5061).setStrokeWidth(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void m3528(int i) {
        ((Paint) this.f5061).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m3529(long j) {
        ((Paint) this.f5061).setColor(AbstractC2416.m3433(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m3530(int i) {
        if (this.f5062 == i) {
            return;
        }
        this.f5062 = i;
        Paint paint = (Paint) this.f5061;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(AbstractC2416.m3447(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC2416.m3430(i)));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m3531(AbstractC2446 abstractC2446) {
        ((Paint) this.f5061).setPathEffect(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m3532(Shader shader) {
        this.f5060 = shader;
        ((Paint) this.f5061).setShader(shader);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void m3533(C2442 c2442) {
        this.f5059 = c2442;
        ((Paint) this.f5061).setColorFilter(c2442 != null ? c2442.f5057 : null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m3534(int i) {
        ((Paint) this.f5061).setFilterBitmap(!(i == 0));
    }

    public C2444(int i, C4685 c4685, Object obj, C2444 c2444) {
        this.f5063 = 1;
        this.f5062 = i;
        this.f5061 = c4685;
        this.f5060 = obj;
        this.f5059 = c2444;
    }

    public C2444(Paint paint) {
        this.f5063 = 0;
        this.f5061 = paint;
        this.f5062 = 3;
    }
}
