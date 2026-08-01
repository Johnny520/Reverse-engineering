package p027;

import java.util.Iterator;
import p029.AbstractC7059;
import p031.AbstractC7065;
import p031.C7064;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7037 extends AbstractC7065 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f17470;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f17471 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7037(C7034 c7034, String str) {
        super(str);
        this.f17470 = c7034;
    }

    @Override // p031.AbstractC7065
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long mo12212() {
        switch (this.f17471) {
            case 0:
                C7034 c7034 = (C7034) this.f17470;
                long jNanoTime = System.nanoTime();
                long j = (jNanoTime - c7034.f17437) + 1;
                Iterator it = c7034.f17434.iterator();
                it.getClass();
                C7036 c7036 = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                C7036 c70362 = null;
                C7036 c70363 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    C7036 c70364 = (C7036) it.next();
                    c70364.getClass();
                    synchronized (c70364) {
                        if (c7034.m12201(c70364, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = c70364.f17461;
                            if (j3 < j) {
                                j = j3;
                                c70362 = c70364;
                            }
                            i++;
                            if (j3 < j2) {
                                j2 = j3;
                                c70363 = c70364;
                            }
                        }
                    }
                }
                if (c70362 != null) {
                    c7036 = c70362;
                } else if (i > 5) {
                    j = j2;
                    c7036 = c70363;
                } else {
                    j = -1;
                }
                if (c7036 == null) {
                    if (c70363 != null) {
                        return (j2 + c7034.f17437) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return c7034.f17437;
                    }
                    return -1L;
                }
                synchronized (c7036) {
                    if (c7036.f17463.isEmpty() && c7036.f17461 == j) {
                        c7036.f17469 = true;
                        c7034.f17434.remove(c7036);
                        AbstractC7059.m12255(c7036.f17455);
                        if (!c7034.f17434.isEmpty()) {
                            return 0L;
                        }
                        C7064 c7064 = c7034.f17436;
                        synchronized (c7064.f17536) {
                            if (c7064.m12275()) {
                                c7064.f17536.m12269(c7064);
                            }
                            break;
                        }
                        return 0L;
                    }
                    return 0L;
                }
            default:
                ((InterfaceC7372) this.f17470).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7037(String str, InterfaceC7372 interfaceC7372) {
        super(str);
        this.f17470 = interfaceC7372;
    }
}
