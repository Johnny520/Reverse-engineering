package p139;

import androidx.collection.C1123;
import bsh.C3466;
import com.bumptech.glide.AbstractC3897;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8227 extends AbstractC8229 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f20400;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C8228 f20401;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f20402;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f20403;

    public C8227(C8228 c8228, AbstractC8237[] abstractC8237Arr) {
        super(c8228.f20408, abstractC8237Arr);
        this.f20401 = c8228;
        this.f20403 = c8228.f20404;
    }

    @Override // p139.AbstractC8229, java.util.Iterator
    public final Object next() {
        if (this.f20401.f20404 != this.f20403) {
            C1123.m1400();
            return null;
        }
        if (!this.f20411) {
            C3466.m5896();
            return null;
        }
        AbstractC8237 abstractC8237 = this.f20412[this.f20410];
        this.f20400 = abstractC8237.f20428[abstractC8237.f20427];
        this.f20402 = true;
        return super.next();
    }

    @Override // p139.AbstractC8229, java.util.Iterator
    public final void remove() {
        if (!this.f20402) {
            C3466.m5901();
            return;
        }
        boolean z = this.f20411;
        C8228 c8228 = this.f20401;
        if (!z) {
            AbstractC5220.m9449(c8228).remove(this.f20400);
        } else {
            if (!z) {
                C3466.m5896();
                return;
            }
            AbstractC8237 abstractC8237 = this.f20412[this.f20410];
            Object obj = abstractC8237.f20428[abstractC8237.f20427];
            AbstractC5220.m9449(c8228).remove(this.f20400);
            m13127(obj != null ? obj.hashCode() : 0, c8228.f20408, obj, 0);
        }
        this.f20400 = null;
        this.f20402 = false;
        this.f20403 = c8228.f20404;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13127(int i, C8236 c8236, Object obj, int i2) {
        int i3 = i2 * 5;
        AbstractC8237[] abstractC8237Arr = this.f20412;
        if (i3 <= 30) {
            int iM7371 = 1 << AbstractC3897.m7371(i, i3);
            if (c8236.m13151(iM7371)) {
                abstractC8237Arr[i2].m13156(c8236.f20422, Integer.bitCount(c8236.f20425) * 2, c8236.m13133(iM7371));
                this.f20410 = i2;
                return;
            } else {
                int iM13139 = c8236.m13139(iM7371);
                C8236 c8236M13140 = c8236.m13140(iM13139);
                abstractC8237Arr[i2].m13156(c8236.f20422, Integer.bitCount(c8236.f20425) * 2, iM13139);
                m13127(i, c8236M13140, obj, i2 + 1);
                return;
            }
        }
        AbstractC8237 abstractC8237 = abstractC8237Arr[i2];
        Object[] objArr = c8236.f20422;
        abstractC8237.m13156(objArr, objArr.length, 0);
        while (true) {
            AbstractC8237 abstractC82372 = abstractC8237Arr[i2];
            if (AbstractC5227.m9466(abstractC82372.f20428[abstractC82372.f20427], obj)) {
                this.f20410 = i2;
                return;
            } else {
                abstractC8237Arr[i2].f20427 += 2;
            }
        }
    }
}
