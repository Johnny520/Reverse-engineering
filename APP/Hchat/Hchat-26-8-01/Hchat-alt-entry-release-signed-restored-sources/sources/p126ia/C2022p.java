package p126ia;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p085fg.InterfaceC1231l;
import p136j8.C2098i;
import p218og.AbstractC3156t;
import p332wb.C5026jv;
import p332wb.C5099m5;
import p332wb.C5292s0;
import p332wb.C5330t5;

/* JADX INFO: renamed from: ia.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2022p implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6837g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Set f6838h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2022p(Set set, int i9) {
        this.f6837g = i9;
        this.f6838h = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        boolean zContains;
        boolean z9;
        switch (this.f6837g) {
            case 0:
                C5026jv c5026jv = (C5026jv) obj;
                c5026jv.getClass();
                String str = c5026jv.f18249a;
                return Boolean.valueOf(AbstractC3156t.m6740d0(str, "wxid_hchat_fake_like_", false) || this.f6838h.contains(str));
            case 1:
                C5292s0 c5292s0 = (C5292s0) obj;
                c5292s0.getClass();
                zContains = this.f6838h.contains(c5292s0.f20550a);
                break;
            case 2:
                C2098i c2098i = (C2098i) obj;
                c2098i.getClass();
                zContains = this.f6838h.contains(String.valueOf(c2098i.f7019a));
                break;
            case 3:
                C5292s0 c5292s02 = (C5292s0) obj;
                c5292s02.getClass();
                zContains = this.f6838h.contains(c5292s02.f20550a);
                break;
            case 4:
                C5330t5 c5330t5 = (C5330t5) obj;
                c5330t5.getClass();
                List list = c5330t5.f20753c;
                if (list.isEmpty()) {
                    z9 = false;
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (this.f6838h.contains((String) it.next())) {
                            z9 = true;
                        }
                    }
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            default:
                C5099m5 c5099m5 = (C5099m5) obj;
                c5099m5.getClass();
                zContains = this.f6838h.contains(c5099m5.f18836a.f20550a);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
