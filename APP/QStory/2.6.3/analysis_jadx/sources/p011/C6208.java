package p011;

import java.util.Iterator;
import p013.AbstractC6230;
import p015.AbstractC6236;
import p015.C6235;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6208 extends AbstractC6236 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f17125;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f17126 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6208(C6205 c6205, String str) {
        super(str);
        this.f17125 = c6205;
    }

    @Override // p015.AbstractC6236
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long mo11653() {
        switch (this.f17126) {
            case 0:
                C6205 c6205 = (C6205) this.f17125;
                long jNanoTime = System.nanoTime();
                long j = (jNanoTime - c6205.f17092) + 1;
                Iterator it = c6205.f17089.iterator();
                it.getClass();
                C6207 c6207 = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                C6207 c62072 = null;
                C6207 c62073 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    C6207 c62074 = (C6207) it.next();
                    c62074.getClass();
                    synchronized (c62074) {
                        if (c6205.m11642(c62074, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = c62074.f17116;
                            if (j3 < j) {
                                j = j3;
                                c62072 = c62074;
                            }
                            i++;
                            if (j3 < j2) {
                                j2 = j3;
                                c62073 = c62074;
                            }
                        }
                    }
                }
                if (c62072 != null) {
                    c6207 = c62072;
                } else if (i > 5) {
                    j = j2;
                    c6207 = c62073;
                } else {
                    j = -1;
                }
                if (c6207 == null) {
                    if (c62073 != null) {
                        return (j2 + c6205.f17092) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return c6205.f17092;
                    }
                    return -1L;
                }
                synchronized (c6207) {
                    if (c6207.f17118.isEmpty() && c6207.f17116 == j) {
                        c6207.f17124 = true;
                        c6205.f17089.remove(c6207);
                        AbstractC6230.m11696(c6207.f17110);
                        if (!c6205.f17089.isEmpty()) {
                            return 0L;
                        }
                        C6235 c6235 = c6205.f17091;
                        synchronized (c6235.f17191) {
                            if (c6235.m11716()) {
                                c6235.f17191.m11710(c6235);
                            }
                            break;
                        }
                        return 0L;
                    }
                    return 0L;
                }
            default:
                ((InterfaceC6543) this.f17125).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6208(String str, InterfaceC6543 interfaceC6543) {
        super(str);
        this.f17125 = interfaceC6543;
    }
}
