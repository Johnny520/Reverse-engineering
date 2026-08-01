package p088s0;

import com.p055lu.wxmask.bean.MaskItemBean;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p009E0.C0109i;
import p011F0.AbstractC0129q;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p069i.C0709q1;
import p090t0.AbstractC1008c;

/* JADX INFO: renamed from: s0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0980b implements InterfaceC0204l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3513a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0709q1 f3514b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0980b(C0709q1 c0709q1, int i2) {
        this.f3513a = i2;
        this.f3514b = c0709q1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8c(Object obj) {
        C0985g c0985g;
        switch (this.f3513a) {
            case 0:
                AbstractC0223g.m418e((AbstractC1008c) obj, "it");
                C0709q1 c0709q1 = this.f3514b;
                if (((AtomicBoolean) c0709q1.f2401g).compareAndSet(false, true)) {
                    ((ExecutorService) c0709q1.f2399e).shutdownNow();
                    ((C0984f) c0709q1.f2400f).evictAll();
                }
                return C0109i.f404a;
            default:
                MaskItemBean maskItemBean = (MaskItemBean) obj;
                AbstractC0223g.m418e(maskItemBean, "maskItemBean");
                C0709q1 c0709q12 = this.f3514b;
                C0985g c0985g2 = (C0985g) c0709q12.f2397c;
                if (c0985g2 == null) {
                    AbstractC0223g.m420g("listAdapter");
                    throw null;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = c0985g2.f2596b;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        if (AbstractC0223g.m414a(((MaskItemBean) it.next()).getMaskId(), maskItemBean.getMaskId())) {
                        }
                    }
                    c0985g = (C0985g) c0709q12.f2397c;
                    if (c0985g != null) {
                        AbstractC0223g.m420g("listAdapter");
                        throw null;
                    }
                    AbstractC0129q.m292f0(c0985g.f2596b, new MaskItemBean[]{maskItemBean});
                    C0985g c0985g3 = (C0985g) c0709q12.f2397c;
                    if (c0985g3 == null) {
                        AbstractC0223g.m420g("listAdapter");
                        throw null;
                    }
                    c0985g3.notifyDataSetChanged();
                } else {
                    c0985g = (C0985g) c0709q12.f2397c;
                    if (c0985g != null) {
                    }
                }
                return C0109i.f404a;
        }
    }
}
