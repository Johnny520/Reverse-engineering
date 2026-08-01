package p209;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.p001ui.graphics.AbstractC2409;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2405;
import androidx.compose.p001ui.graphics.C2406;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.C2444;
import androidx.compose.p001ui.graphics.drawscope.AbstractC2340;
import androidx.compose.p001ui.graphics.drawscope.C2344;
import androidx.compose.p001ui.graphics.drawscope.C2345;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2197;
import com.bumptech.glide.AbstractC3887;
import io.ktor.util.C5043;
import io.modelcontextprotocol.kotlin.sdk.shared.C5134;
import kotlin.jvm.internal.AbstractC5227;
import p128.C8155;
import p225.C8760;

/* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8649 extends TextPaint {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC2433 f21684;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C2434 f21685;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C2405 f21686;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21687;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8760 f21688;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2444 f21689;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C8155 f21690;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C2197 f21691;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public AbstractC2340 f21692;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13741(C2405 c2405) {
        if (c2405 == null || AbstractC5227.m9466(this.f21686, c2405)) {
            return;
        }
        this.f21686 = c2405;
        if (c2405.equals(C2405.f4961)) {
            clearShadowLayer();
            return;
        }
        C2405 c24052 = this.f21686;
        float f = c24052.f4962;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (c24052.f4963 >> 32)), Float.intBitsToFloat((int) (this.f21686.f4963 & 4294967295L)), AbstractC2416.m3433(this.f21686.f4964));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13742(AbstractC2340 abstractC2340) {
        if (abstractC2340 == null || AbstractC5227.m9466(this.f21692, abstractC2340)) {
            return;
        }
        this.f21692 = abstractC2340;
        if (abstractC2340.equals(C2345.f4640)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(abstractC2340 instanceof C2344)) {
            C5043.m9170();
            return;
        }
        m13746().m3528(1);
        C2344 c2344 = (C2344) abstractC2340;
        m13746().m3527(c2344.f4639);
        C2444 c2444M13746 = m13746();
        ((Paint) c2444M13746.f5061).setStrokeMiter(c2344.f4638);
        m13746().m3525(c2344.f4636);
        m13746().m3526(c2344.f4637);
        m13746().m3531(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13743(long j) {
        C2434 c2434 = this.f21685;
        if ((c2434 == null ? false : C2434.m3509(c2434.f5045, j)) || j == 16) {
            return;
        }
        this.f21685 = new C2434(j);
        setColor(AbstractC2416.m3433(j));
        this.f21691 = null;
        this.f21684 = null;
        this.f21690 = null;
        setShader(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13744(AbstractC2433 abstractC2433, long j, float f) {
        if (abstractC2433 == null) {
            this.f21691 = null;
            this.f21684 = null;
            this.f21690 = null;
            setShader(null);
            return;
        }
        if (abstractC2433 instanceof C2406) {
            m13743(AbstractC3887.m7198(f, ((C2406) abstractC2433).f4965));
            return;
        }
        if (!(abstractC2433 instanceof AbstractC2409)) {
            C5043.m9170();
            return;
        }
        if (AbstractC5227.m9466(this.f21684, abstractC2433)) {
            C8155 c8155 = this.f21690;
            if (!(c8155 == null ? false : C8155.m13074(c8155.f19872, j))) {
            }
        } else if (j != 9205357640488583168L) {
            this.f21684 = abstractC2433;
            this.f21690 = new C8155(j);
            this.f21691 = AbstractC2202.m3056(new C5134(abstractC2433, j));
        }
        C2444 c2444M13746 = m13746();
        C2197 c2197 = this.f21691;
        c2444M13746.m3532(c2197 != null ? (Shader) c2197.getValue() : null);
        this.f21685 = null;
        AbstractC8659.m13752(this, f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13745(int i) {
        if (i == this.f21687) {
            return;
        }
        m13746().m3530(i);
        this.f21687 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2444 m13746() {
        C2444 c2444 = this.f21689;
        if (c2444 != null) {
            return c2444;
        }
        C2444 c24442 = new C2444(this);
        this.f21689 = c24442;
        return c24442;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13747(C8760 c8760) {
        if (c8760 == null || AbstractC5227.m9466(this.f21688, c8760)) {
            return;
        }
        this.f21688 = c8760;
        int i = c8760.f22307;
        setUnderlineText((i | 1) == i);
        int i2 = this.f21688.f22307;
        setStrikeThruText((i2 | 2) == i2);
    }
}
