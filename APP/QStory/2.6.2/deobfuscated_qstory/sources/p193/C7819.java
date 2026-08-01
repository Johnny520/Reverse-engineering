package p193;

import android.graphics.Paint;
import android.text.TextPaint;
import androidx.compose.runtime.C1362;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.C1570;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.C1609;
import androidx.compose.ui.graphics.drawscope.AbstractC1505;
import androidx.compose.ui.graphics.drawscope.C1509;
import androidx.compose.ui.graphics.drawscope.C1510;
import io.ktor.util.C4210;
import kotlin.jvm.internal.AbstractC4394;
import p112.C7325;
import p209.C7930;

/* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7819 extends TextPaint {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC1598 f21342;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C1599 f21343;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C1570 f21344;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21345;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7930 f21346;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1609 f21347;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C7325 f21348;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C1362 f21349;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public AbstractC1505 f21350;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13154(C1570 c1570) {
        if (c1570 == null || AbstractC4394.m8917(this.f21344, c1570)) {
            return;
        }
        this.f21344 = c1570;
        if (c1570.equals(C1570.f4615)) {
            clearShadowLayer();
            return;
        }
        C1570 c15702 = this.f21344;
        float f = c15702.f4616;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (c15702.f4617 >> 32)), Float.intBitsToFloat((int) (this.f21344.f4617 & 4294967295L)), AbstractC1581.m2863(this.f21344.f4618));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13155(AbstractC1505 abstractC1505) {
        if (abstractC1505 == null || AbstractC4394.m8917(this.f21350, abstractC1505)) {
            return;
        }
        this.f21350 = abstractC1505;
        if (abstractC1505.equals(C1510.f4294)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(abstractC1505 instanceof C1509)) {
            C4210.m8621();
            return;
        }
        m13159().m2958(1);
        C1509 c1509 = (C1509) abstractC1505;
        m13159().m2957(c1509.f4293);
        C1609 c1609M13159 = m13159();
        ((Paint) c1609M13159.f4715).setStrokeMiter(c1509.f4292);
        m13159().m2955(c1509.f4290);
        m13159().m2956(c1509.f4291);
        m13159().m2961(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13156(long j) {
        C1599 c1599 = this.f21343;
        if ((c1599 == null ? false : C1599.m2939(c1599.f4699, j)) || j == 16) {
            return;
        }
        this.f21343 = new C1599(j);
        setColor(AbstractC1581.m2863(j));
        this.f21349 = null;
        this.f21342 = null;
        this.f21348 = null;
        setShader(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13157(androidx.compose.ui.graphics.AbstractC1598 r4, long r5, float r7) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Ld
            r3.f21349 = r0
            r3.f21342 = r0
            r3.f21348 = r0
            r3.setShader(r0)
            return
        Ld:
            boolean r1 = r4 instanceof androidx.compose.ui.graphics.C1571
            if (r1 == 0) goto L1d
            androidx.compose.ui.graphics.飘花落叶言子世兰苏哲楪 r4 = (androidx.compose.ui.graphics.C1571) r4
            long r4 = r4.f4619
            long r4 = com.bumptech.glide.AbstractC3056.m6660(r7, r4)
            r3.m13156(r4)
            return
        L1d:
            boolean r1 = r4 instanceof androidx.compose.ui.graphics.AbstractC1574
            if (r1 == 0) goto L6d
            androidx.compose.ui.graphics.飘花落叶言子楪兰世苏哲 r1 = r3.f21342
            boolean r1 = kotlin.jvm.internal.AbstractC4394.m8917(r1, r4)
            if (r1 == 0) goto L37
            飘花落叶言子世哲兰楪苏.飘花落叶言子楪世兰苏哲 r1 = r3.f21348
            if (r1 != 0) goto L2f
            r1 = 0
            goto L35
        L2f:
            long r1 = r1.f19532
            boolean r1 = p112.C7325.m12488(r1, r5)
        L35:
            if (r1 != 0) goto L54
        L37:
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L54
            r3.f21342 = r4
            飘花落叶言子世哲兰楪苏.飘花落叶言子楪世兰苏哲 r1 = new 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世兰苏哲
            r1.<init>(r5)
            r3.f21348 = r1
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世兰苏哲 r1 = new io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世兰苏哲
            r1.<init>(r4, r5)
            androidx.compose.runtime.飘花落叶言子楪兰苏哲世 r4 = androidx.compose.runtime.AbstractC1367.m2486(r1)
            r3.f21349 = r4
        L54:
            androidx.compose.ui.graphics.飘花落叶言子楪苏世兰哲 r4 = r3.m13159()
            androidx.compose.runtime.飘花落叶言子楪兰苏哲世 r5 = r3.f21349
            if (r5 == 0) goto L63
            java.lang.Object r5 = r5.getValue()
            android.graphics.Shader r5 = (android.graphics.Shader) r5
            goto L64
        L63:
            r5 = r0
        L64:
            r4.m2962(r5)
            r3.f21343 = r0
            p193.AbstractC7829.m13165(r3, r7)
            return
        L6d:
            io.ktor.util.C4210.m8621()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p193.C7819.m13157(androidx.compose.ui.graphics.飘花落叶言子楪兰世苏哲, long, float):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13158(int i) {
        if (i == this.f21345) {
            return;
        }
        m13159().m2960(i);
        this.f21345 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1609 m13159() {
        C1609 c1609 = this.f21347;
        if (c1609 != null) {
            return c1609;
        }
        C1609 c16092 = new C1609(this);
        this.f21347 = c16092;
        return c16092;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13160(C7930 c7930) {
        if (c7930 == null || AbstractC4394.m8917(this.f21346, c7930)) {
            return;
        }
        this.f21346 = c7930;
        int i = c7930.f21965;
        setUnderlineText((i | 1) == i);
        int i2 = this.f21346.f21965;
        setStrikeThruText((i2 | 2) == i2);
    }
}
