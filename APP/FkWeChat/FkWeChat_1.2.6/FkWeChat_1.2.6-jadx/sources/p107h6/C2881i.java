package p107h6;

import java.util.List;
import p024b9.AbstractC1052o0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: h6.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2881i extends AbstractC2882j {

    /* JADX INFO: renamed from: a0 */
    public final AbstractC2882j f7550a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2881i(AbstractC2882j abstractC2882j) {
        super(EnumC2875c.f7538u, AbstractC1052o0.m3807b(List.class), null, abstractC2882j.m10373n(), AbstractC5114x.m20800o());
        abstractC2882j.getClass();
        this.f7550a0 = abstractC2882j;
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public List mo10314a(C2885m c2885m) {
        c2885m.getClass();
        return AbstractC5112w.m20789e(this.f7550a0.mo10314a(c2885m));
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo10315d(C2886n c2886n, List list) {
        c2886n.getClass();
        list.getClass();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f7550a0.mo10315d(c2886n, list.get(i10));
        }
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo10316e(C2888p c2888p, List list) {
        c2888p.getClass();
        list.getClass();
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                this.f7550a0.mo10316e(c2888p, list.get(size));
            }
        }
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo10317h(C2886n c2886n, int i10, List list) {
        c2886n.getClass();
        if (list == null || list.isEmpty()) {
            return;
        }
        super.mo10317h(c2886n, i10, list);
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo10318i(C2888p c2888p, int i10, List list) {
        c2888p.getClass();
        if (list == null || list.isEmpty()) {
            return;
        }
        super.mo10318i(c2888p, i10, list);
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo10319j(List list) {
        list.getClass();
        int size = list.size();
        int iMo10319j = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iMo10319j += this.f7550a0.mo10319j(list.get(i10));
        }
        return iMo10319j;
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int mo10320k(int i10, List list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return super.mo10320k(i10, list);
    }
}
