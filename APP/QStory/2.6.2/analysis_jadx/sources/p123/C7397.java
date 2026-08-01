package p123;

import androidx.collection.C0276;
import bsh.C2632;
import com.alibaba.fastjson2.AbstractC2904;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C7397 extends AbstractC7399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f20060;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C7398 f20061;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f20062;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f20063;

    public C7397(C7398 c7398, AbstractC7407[] abstractC7407Arr) {
        super(c7398.f20068, abstractC7407Arr);
        this.f20061 = c7398;
        this.f20063 = c7398.f20064;
    }

    @Override // p123.AbstractC7399, java.util.Iterator
    public final Object next() {
        if (this.f20061.f20064 != this.f20063) {
            C0276.m839();
            return null;
        }
        if (!this.f20071) {
            C2632.m5291();
            return null;
        }
        AbstractC7407 abstractC7407 = this.f20072[this.f20070];
        this.f20060 = abstractC7407.f20088[abstractC7407.f20087];
        this.f20062 = true;
        return super.next();
    }

    @Override // p123.AbstractC7399, java.util.Iterator
    public final void remove() {
        if (!this.f20062) {
            C2632.m5296();
            return;
        }
        boolean z = this.f20071;
        C7398 c7398 = this.f20061;
        if (!z) {
            AbstractC4387.m8900(c7398).remove(this.f20060);
        } else {
            if (!z) {
                C2632.m5291();
                return;
            }
            AbstractC7407 abstractC7407 = this.f20072[this.f20070];
            Object obj = abstractC7407.f20088[abstractC7407.f20087];
            AbstractC4387.m8900(c7398).remove(this.f20060);
            m12541(obj != null ? obj.hashCode() : 0, c7398.f20068, obj, 0);
        }
        this.f20060 = null;
        this.f20062 = false;
        this.f20063 = c7398.f20064;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12541(int i, C7406 c7406, Object obj, int i2) {
        int i3 = i2 * 5;
        AbstractC7407[] abstractC7407Arr = this.f20072;
        if (i3 <= 30) {
            int iM6243 = 1 << AbstractC2904.m6243(i, i3);
            if (c7406.m12565(iM6243)) {
                abstractC7407Arr[i2].m12570(c7406.f20082, Integer.bitCount(c7406.f20085) * 2, c7406.m12547(iM6243));
                this.f20070 = i2;
                return;
            } else {
                int iM12553 = c7406.m12553(iM6243);
                C7406 c7406M12554 = c7406.m12554(iM12553);
                abstractC7407Arr[i2].m12570(c7406.f20082, Integer.bitCount(c7406.f20085) * 2, iM12553);
                m12541(i, c7406M12554, obj, i2 + 1);
                return;
            }
        }
        AbstractC7407 abstractC7407 = abstractC7407Arr[i2];
        Object[] objArr = c7406.f20082;
        abstractC7407.m12570(objArr, objArr.length, 0);
        while (true) {
            AbstractC7407 abstractC74072 = abstractC7407Arr[i2];
            if (AbstractC4394.m8917(abstractC74072.f20088[abstractC74072.f20087], obj)) {
                this.f20070 = i2;
                return;
            } else {
                abstractC7407Arr[i2].f20087 += 2;
            }
        }
    }
}
