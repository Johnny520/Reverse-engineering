package p012;

import java.util.Iterator;
import p013.C6181;
import p013.C6182;
import p017.AbstractC6238;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6166 extends AbstractC6167 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16810;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f16811 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6166(C6182 c6182, String str) {
        super(str);
        this.f16810 = c6182;
    }

    @Override // p012.AbstractC6167
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long mo11595() {
        switch (this.f16811) {
            case 0:
                ((InterfaceC6542) this.f16810).invoke();
                return -1L;
            default:
                C6182 c6182 = (C6182) this.f16810;
                long jNanoTime = System.nanoTime();
                long j = (jNanoTime - c6182.f16920) + 1;
                Iterator it = c6182.f16917.iterator();
                it.getClass();
                C6181 c6181 = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                C6181 c61812 = null;
                C6181 c61813 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    C6181 c61814 = (C6181) it.next();
                    c61814.getClass();
                    synchronized (c61814) {
                        if (c6182.m11633(c61814, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = c61814.f16908;
                            if (j3 < j) {
                                j = j3;
                                c61812 = c61814;
                            }
                            i++;
                            if (j3 < j2) {
                                j2 = j3;
                                c61813 = c61814;
                            }
                        }
                    }
                }
                if (c61812 != null) {
                    c6181 = c61812;
                } else if (i > 5) {
                    j = j2;
                    c6181 = c61813;
                } else {
                    j = -1;
                }
                if (c6181 == null) {
                    if (c61813 != null) {
                        return (j2 + c6182.f16920) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return c6182.f16920;
                    }
                    return -1L;
                }
                synchronized (c6181) {
                    if (c6181.f16910.isEmpty() && c6181.f16908 == j) {
                        c6181.f16916 = true;
                        c6182.f16917.remove(c6181);
                        AbstractC6238.m11704(c6181.f16902);
                        if (!c6182.f16917.isEmpty()) {
                            return 0L;
                        }
                        C6165 c6165 = c6182.f16919;
                        synchronized (c6165.f16809) {
                            if (c6165.m11594()) {
                                c6165.f16809.m11588(c6165);
                            }
                            break;
                        }
                        return 0L;
                    }
                    return 0L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6166(String str, InterfaceC6542 interfaceC6542) {
        super(str);
        this.f16810 = interfaceC6542;
    }
}
