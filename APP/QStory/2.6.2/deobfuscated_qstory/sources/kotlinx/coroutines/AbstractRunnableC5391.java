package kotlinx.coroutines;

import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlinx.coroutines.internal.C5354;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC5391 implements Runnable, Comparable, InterfaceC5397 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f15022 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f15023;

    public AbstractRunnableC5391(long j) {
        this.f15023 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f15023 - ((AbstractRunnableC5391) obj).f15023;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // kotlinx.coroutines.InterfaceC5397
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C4484 c4484 = AbstractC5398.f15037;
                if (obj == c4484) {
                    return;
                }
                C5390 c5390 = obj instanceof C5390 ? (C5390) obj : null;
                if (c5390 != null) {
                    synchronized (c5390) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C5354 ? (C5354) obj2 : null) != null) {
                            c5390.m10374(this.f15022);
                        }
                    }
                }
                this._heap = c4484;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f15023 + ']';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m10452(C5390 c5390) {
        if (this._heap != AbstractC5398.f15037) {
            this._heap = c5390;
        } else {
            C5919.m11249("Failed requirement.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m10453(long j, C5390 c5390, AbstractC5386 abstractC5386) {
        synchronized (this) {
            if (this._heap == AbstractC5398.f15037) {
                return 2;
            }
            synchronized (c5390) {
                try {
                    AbstractRunnableC5391[] abstractRunnableC5391Arr = c5390.f14938;
                    AbstractRunnableC5391 abstractRunnableC5391 = abstractRunnableC5391Arr != null ? abstractRunnableC5391Arr[0] : null;
                    if (AbstractC5386.f15014.get(abstractC5386) == 1) {
                        return 1;
                    }
                    if (abstractRunnableC5391 == null) {
                        c5390.f15021 = j;
                    } else {
                        long j2 = abstractRunnableC5391.f15023;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c5390.f15021 > 0) {
                            c5390.f15021 = j;
                        }
                    }
                    long j3 = this.f15023;
                    long j4 = c5390.f15021;
                    if (j3 - j4 < 0) {
                        this.f15023 = j4;
                    }
                    c5390.m10375(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
