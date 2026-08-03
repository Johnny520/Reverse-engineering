package p117i0;

import java.util.ArrayList;
import java.util.List;
import ng.C3013k;
import p000a.AbstractC0000a;
import p069f.C0933f0;
import p069f.C0964v;
import p080fb.AbstractC1184v0;
import p218og.AbstractC3150n;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: i0.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1843j extends RuntimeException {

    /* JADX INFO: renamed from: g */
    public final C0933f0 f6133g;

    /* JADX INFO: renamed from: h */
    public final C0933f0 f6134h;

    /* JADX INFO: renamed from: i */
    public final C0964v f6135i;

    /* JADX INFO: renamed from: j */
    public final int f6136j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1843j(C0933f0 c0933f0, C0933f0 c0933f02, C0964v c0964v, int i9, Exception exc) {
        super(exc);
        this.f6133g = c0933f0;
        this.f6134h = c0933f02;
        this.f6135i = c0964v;
        this.f6136j = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final String getMessage() {
        List listM99x0;
        StringBuilder sb2 = new StringBuilder("\n            |Failed to execute op number ");
        sb2.append(this.f6136j);
        sb2.append(":\n            |");
        C3013k c3013kM3175B = AbstractC1184v0.m3175B(new C1839i(this, null));
        if (c3013kM3175B.hasNext()) {
            Object next = c3013kM3175B.next();
            if (c3013kM3175B.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c3013kM3175B.hasNext()) {
                    arrayList.add(c3013kM3175B.next());
                }
                listM99x0 = arrayList;
            } else {
                listM99x0 = AbstractC0000a.m99x0(next);
            }
        } else {
            listM99x0 = C4173t.f13710g;
        }
        sb2.append(AbstractC4166m.m8392A1(AbstractC4166m.m8404M1(50, listM99x0), "\n", null, null, null, 62));
        sb2.append("\n            ");
        return AbstractC3150n.m6729S(sb2.toString());
    }
}
