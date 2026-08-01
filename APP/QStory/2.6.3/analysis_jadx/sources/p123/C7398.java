package p123;

import androidx.collection.C0276;
import bsh.C2633;
import com.bumptech.glide.AbstractC3065;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C7398 extends AbstractC7400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f20055;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C7399 f20056;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f20057;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f20058;

    public C7398(C7399 c7399, AbstractC7408[] abstractC7408Arr) {
        super(c7399.f20063, abstractC7408Arr);
        this.f20056 = c7399;
        this.f20058 = c7399.f20059;
    }

    @Override // p123.AbstractC7400, java.util.Iterator
    public final Object next() {
        if (this.f20056.f20059 != this.f20058) {
            C0276.m840();
            return null;
        }
        if (!this.f20066) {
            C2633.m5336();
            return null;
        }
        AbstractC7408 abstractC7408 = this.f20067[this.f20065];
        this.f20055 = abstractC7408.f20083[abstractC7408.f20082];
        this.f20057 = true;
        return super.next();
    }

    @Override // p123.AbstractC7400, java.util.Iterator
    public final void remove() {
        if (!this.f20057) {
            C2633.m5341();
            return;
        }
        boolean z = this.f20066;
        C7399 c7399 = this.f20056;
        if (!z) {
            AbstractC4388.m8890(c7399).remove(this.f20055);
        } else {
            if (!z) {
                C2633.m5336();
                return;
            }
            AbstractC7408 abstractC7408 = this.f20067[this.f20065];
            Object obj = abstractC7408.f20083[abstractC7408.f20082];
            AbstractC4388.m8890(c7399).remove(this.f20055);
            m12568(obj != null ? obj.hashCode() : 0, c7399.f20063, obj, 0);
        }
        this.f20055 = null;
        this.f20057 = false;
        this.f20058 = c7399.f20059;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12568(int i, C7407 c7407, Object obj, int i2) {
        int i3 = i2 * 5;
        AbstractC7408[] abstractC7408Arr = this.f20067;
        if (i3 <= 30) {
            int iM6811 = 1 << AbstractC3065.m6811(i, i3);
            if (c7407.m12592(iM6811)) {
                abstractC7408Arr[i2].m12597(c7407.f20077, Integer.bitCount(c7407.f20080) * 2, c7407.m12574(iM6811));
                this.f20065 = i2;
                return;
            } else {
                int iM12580 = c7407.m12580(iM6811);
                C7407 c7407M12581 = c7407.m12581(iM12580);
                abstractC7408Arr[i2].m12597(c7407.f20077, Integer.bitCount(c7407.f20080) * 2, iM12580);
                m12568(i, c7407M12581, obj, i2 + 1);
                return;
            }
        }
        AbstractC7408 abstractC7408 = abstractC7408Arr[i2];
        Object[] objArr = c7407.f20077;
        abstractC7408.m12597(objArr, objArr.length, 0);
        while (true) {
            AbstractC7408 abstractC74082 = abstractC7408Arr[i2];
            if (AbstractC4395.m8907(abstractC74082.f20083[abstractC74082.f20082], obj)) {
                this.f20065 = i2;
                return;
            } else {
                abstractC7408Arr[i2].f20082 += 2;
            }
        }
    }
}
