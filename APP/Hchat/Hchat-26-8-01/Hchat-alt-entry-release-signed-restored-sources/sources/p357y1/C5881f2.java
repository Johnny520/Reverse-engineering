package p357y1;

import java.util.List;
import p069f.AbstractC0942k;
import p069f.C0966x;
import p072f2.C1050m;
import p072f2.C1054q;

/* JADX INFO: renamed from: y1.f2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5881f2 {

    /* JADX INFO: renamed from: a */
    public final C1050m f23880a;

    /* JADX INFO: renamed from: b */
    public final C0966x f23881b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5881f2(C1054q c1054q, AbstractC0942k abstractC0942k) {
        this.f23880a = c1054q.f3350d;
        List listM2649j = C1054q.m2649j(4, c1054q);
        this.f23881b = new C0966x(listM2649j.size());
        int size = listM2649j.size();
        for (int i9 = 0; i9 < size; i9++) {
            C1054q c1054q2 = (C1054q) listM2649j.get(i9);
            if (abstractC0942k.m2312a(c1054q2.f3352f)) {
                this.f23881b.m2380a(c1054q2.f3352f);
            }
        }
    }
}
