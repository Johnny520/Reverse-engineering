package p133a4;

import java.util.Iterator;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1776g;
import p138b4.C1870o;
import p138b4.C1871p;

/* JADX INFO: renamed from: a4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1806b extends AbstractC1805a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f6152e = 1;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f6153f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1806b(C1871p c1871p, String str) {
        super(str);
        this.f6153f = c1871p;
    }

    @Override // p133a4.AbstractC1805a
    /* JADX INFO: renamed from: a */
    public final long mo3274a() {
        C1870o c1870o;
        switch (this.f6152e) {
            case 0:
                ((InterfaceC1599a) this.f6153f).mo6a();
                return -1L;
            default:
                C1871p c1871p = (C1871p) this.f6153f;
                long jNanoTime = System.nanoTime();
                long j5 = (jNanoTime - c1871p.f6361a) + 1;
                Iterator it = c1871p.f6364d.iterator();
                AbstractC1665j.m2984d(it, "iterator(...)");
                long j6 = Long.MAX_VALUE;
                int i5 = 0;
                int i6 = 0;
                C1870o c1870o2 = null;
                C1870o c1870o3 = null;
                while (it.hasNext()) {
                    C1870o c1870o4 = (C1870o) it.next();
                    AbstractC1665j.m2982b(c1870o4);
                    synchronized (c1870o4) {
                        if (c1871p.m3363a(c1870o4, jNanoTime) > 0) {
                            i6++;
                        } else {
                            long j7 = j6;
                            long j8 = c1870o4.f6360q;
                            if (j8 < j5) {
                                j5 = j8;
                                c1870o2 = c1870o4;
                            }
                            i5++;
                            if (j8 < j7) {
                                j6 = j8;
                                c1870o3 = c1870o4;
                            } else {
                                j6 = j7;
                            }
                        }
                    }
                }
                long j9 = j6;
                if (c1870o2 != null) {
                    c1870o = c1870o2;
                } else if (i5 > 5) {
                    c1870o = c1870o3;
                    j5 = j9;
                } else {
                    j5 = -1;
                    c1870o = null;
                }
                if (c1870o == null) {
                    if (c1870o3 != null) {
                        return (j9 + c1871p.f6361a) - jNanoTime;
                    }
                    if (i6 > 0) {
                        return c1871p.f6361a;
                    }
                    return -1L;
                }
                synchronized (c1870o) {
                    if (c1870o.f6359p.isEmpty() && c1870o.f6360q == j5) {
                        c1870o.f6353j = true;
                        c1871p.f6364d.remove(c1870o);
                        AbstractC1776g.m3175b(c1870o.f6348e);
                        if (!c1871p.f6364d.isEmpty()) {
                            return 0L;
                        }
                        C1807c c1807c = c1871p.f6362b;
                        synchronized (c1807c.f6154a) {
                            if (c1807c.m3276a()) {
                                c1807c.f6154a.m3282c(c1807c);
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
    public C1806b(String str, InterfaceC1599a interfaceC1599a) {
        super(str);
        this.f6153f = interfaceC1599a;
    }
}
