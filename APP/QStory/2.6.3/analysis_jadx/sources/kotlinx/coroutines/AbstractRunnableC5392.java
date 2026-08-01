package kotlinx.coroutines;

import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlinx.coroutines.internal.C5355;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC5392 implements Runnable, Comparable, InterfaceC5398 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f15022 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f15023;

    public AbstractRunnableC5392(long j) {
        this.f15023 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f15023 - ((AbstractRunnableC5392) obj).f15023;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // kotlinx.coroutines.InterfaceC5398
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C4485 c4485 = AbstractC5399.f15037;
                if (obj == c4485) {
                    return;
                }
                C5391 c5391 = obj instanceof C5391 ? (C5391) obj : null;
                if (c5391 != null) {
                    synchronized (c5391) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C5355 ? (C5355) obj2 : null) != null) {
                            c5391.m10378(this.f15022);
                        }
                    }
                }
                this._heap = c4485;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f15023 + ']';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m10456(C5391 c5391) {
        if (this._heap != AbstractC5399.f15037) {
            this._heap = c5391;
        } else {
            C5925.m11310("Failed requirement.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m10457(long j, C5391 c5391, AbstractC5387 abstractC5387) {
        synchronized (this) {
            if (this._heap == AbstractC5399.f15037) {
                return 2;
            }
            synchronized (c5391) {
                try {
                    AbstractRunnableC5392[] abstractRunnableC5392Arr = c5391.f14938;
                    AbstractRunnableC5392 abstractRunnableC5392 = abstractRunnableC5392Arr != null ? abstractRunnableC5392Arr[0] : null;
                    if (AbstractC5387.f15014.get(abstractC5387) == 1) {
                        return 1;
                    }
                    if (abstractRunnableC5392 == null) {
                        c5391.f15021 = j;
                    } else {
                        long j2 = abstractRunnableC5392.f15023;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c5391.f15021 > 0) {
                            c5391.f15021 = j;
                        }
                    }
                    long j3 = this.f15023;
                    long j4 = c5391.f15021;
                    if (j3 - j4 < 0) {
                        this.f15023 = j4;
                    }
                    c5391.m10379(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
