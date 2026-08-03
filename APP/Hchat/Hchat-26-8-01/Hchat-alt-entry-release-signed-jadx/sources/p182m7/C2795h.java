package p182m7;

import java.util.Iterator;
import p379z7.AbstractC6117m;
import p379z7.C6110f;

/* JADX INFO: renamed from: m7.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2795h extends AbstractC6117m {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String[] f9050i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9051j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2795h(C6110f c6110f, String[] strArr, int i9) {
        super(c6110f);
        this.f9050i = strArr;
        this.f9051j = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.AbstractC6117m
    /* JADX INFO: renamed from: b */
    public final Iterator mo5912b(Object obj) {
        return ((C2797j) obj).m6193Q(this.f9050i, this.f9051j);
    }
}
