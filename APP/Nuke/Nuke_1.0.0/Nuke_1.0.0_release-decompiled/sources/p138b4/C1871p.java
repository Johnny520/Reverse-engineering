package p138b4;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1776g;
import p133a4.C1806b;
import p133a4.C1807c;
import p133a4.C1808d;
import p173h4.AbstractC2263d;

/* JADX INFO: renamed from: b4.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1871p {

    /* JADX INFO: renamed from: a */
    public final long f6361a;

    /* JADX INFO: renamed from: b */
    public final C1807c f6362b;

    /* JADX INFO: renamed from: c */
    public final C1806b f6363c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentLinkedQueue f6364d;

    public C1871p(C1808d c1808d) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        AbstractC1665j.m2985e(c1808d, "taskRunner");
        AbstractC1665j.m2985e(timeUnit, "timeUnit");
        this.f6361a = timeUnit.toNanos(5L);
        this.f6362b = c1808d.m3283d();
        this.f6363c = new C1806b(this, AbstractC0231b.m403n(new StringBuilder(), AbstractC1776g.f6077b, " ConnectionPool connection closer"));
        this.f6364d = new ConcurrentLinkedQueue();
    }

    /* JADX INFO: renamed from: a */
    public final int m3363a(C1870o c1870o, long j5) {
        TimeZone timeZone = AbstractC1776g.f6076a;
        ArrayList arrayList = c1870o.f6359p;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i5);
            if (reference.get() != null) {
                i5++;
            } else {
                String str = "A connection to " + c1870o.f6346c.f5763a.f5782h + " was leaked. Did you forget to close a response body?";
                AbstractC2263d abstractC2263d = AbstractC2263d.f7404a;
                AbstractC2263d.f7404a.mo4117i(((C1867l) reference).f6324a, str);
                arrayList.remove(i5);
                if (arrayList.isEmpty()) {
                    c1870o.f6360q = j5 - this.f6361a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
