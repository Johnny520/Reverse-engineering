package kotlinx.coroutines;

import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.internal.C6187;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC6224 implements Runnable, Comparable, InterfaceC6230 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f15367 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f15368;

    public AbstractRunnableC6224(long j) {
        this.f15368 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f15368 - ((AbstractRunnableC6224) obj).f15368;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // kotlinx.coroutines.InterfaceC6230
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C5317 c5317 = AbstractC6231.f15382;
                if (obj == c5317) {
                    return;
                }
                C6223 c6223 = obj instanceof C6223 ? (C6223) obj : null;
                if (c6223 != null) {
                    synchronized (c6223) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C6187 ? (C6187) obj2 : null) != null) {
                            c6223.m10937(this.f15367);
                        }
                    }
                }
                this._heap = c5317;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f15368 + ']';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11015(C6223 c6223) {
        if (this._heap != AbstractC6231.f15382) {
            this._heap = c6223;
        } else {
            C6755.m11869("Failed requirement.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m11016(long j, C6223 c6223, AbstractC6219 abstractC6219) {
        synchronized (this) {
            if (this._heap == AbstractC6231.f15382) {
                return 2;
            }
            synchronized (c6223) {
                try {
                    AbstractRunnableC6224[] abstractRunnableC6224Arr = c6223.f15283;
                    AbstractRunnableC6224 abstractRunnableC6224 = abstractRunnableC6224Arr != null ? abstractRunnableC6224Arr[0] : null;
                    if (AbstractC6219.f15359.get(abstractC6219) == 1) {
                        return 1;
                    }
                    if (abstractRunnableC6224 == null) {
                        c6223.f15366 = j;
                    } else {
                        long j2 = abstractRunnableC6224.f15368;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c6223.f15366 > 0) {
                            c6223.f15366 = j;
                        }
                    }
                    long j3 = this.f15368;
                    long j4 = c6223.f15366;
                    if (j3 - j4 < 0) {
                        this.f15368 = j4;
                    }
                    c6223.m10938(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
