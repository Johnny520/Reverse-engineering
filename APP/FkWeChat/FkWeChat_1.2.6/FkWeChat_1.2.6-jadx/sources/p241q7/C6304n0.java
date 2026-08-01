package p241q7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p024b9.AbstractC1043k;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: q7.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C6304n0 {

    /* JADX INFO: renamed from: a */
    public final C6319w f19778a;

    /* JADX INFO: renamed from: b */
    public final int f19779b;

    /* JADX INFO: renamed from: c */
    public AbstractC6296j0 f19780c;

    /* JADX INFO: renamed from: d */
    public List f19781d;

    public C6304n0(C6319w c6319w, int i10, AbstractC6296j0 abstractC6296j0) {
        c6319w.getClass();
        this.f19778a = c6319w;
        this.f19779b = i10;
        this.f19780c = abstractC6296j0;
    }

    /* JADX INFO: renamed from: a */
    public final void m24940a(C6304n0 c6304n0) {
        c6304n0.getClass();
        List arrayList = this.f19781d;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f19781d = arrayList;
        }
        arrayList.add(c6304n0);
    }

    /* JADX INFO: renamed from: b */
    public void m24941b(StringBuilder sb2, int i10) {
        sb2.getClass();
        sb2.append(AbstractC8611a0.m33065J("  ", i10) + this);
        sb2.append('\n');
        List list = this.f19781d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C6304n0) it.next()).m24941b(sb2, i10 + 1);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C6319w m24942c() {
        return this.f19778a;
    }

    /* JADX INFO: renamed from: d */
    public final int m24943d() {
        return this.f19779b;
    }

    /* JADX INFO: renamed from: e */
    public final void m24944e(AbstractC6296j0 abstractC6296j0) {
        this.f19780c = abstractC6296j0;
    }

    public String toString() {
        return this.f19778a + ", segment:" + this.f19779b + " -> " + this.f19780c;
    }

    public /* synthetic */ C6304n0(C6319w c6319w, int i10, AbstractC6296j0 abstractC6296j0, int i11, AbstractC1043k abstractC1043k) {
        this(c6319w, i10, (i11 & 4) != 0 ? null : abstractC6296j0);
    }
}
