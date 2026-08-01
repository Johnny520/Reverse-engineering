package p107h6;

import java.util.List;
import p024b9.AbstractC1052o0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: h6.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2887o extends AbstractC2882j {

    /* JADX INFO: renamed from: a0 */
    public final AbstractC2882j f7616a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2887o(AbstractC2882j abstractC2882j) {
        super(abstractC2882j.m10371l(), AbstractC1052o0.m3807b(List.class), null, abstractC2882j.m10373n(), AbstractC5114x.m20800o());
        abstractC2882j.getClass();
        this.f7616a0 = abstractC2882j;
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public List mo10314a(C2885m c2885m) {
        c2885m.getClass();
        return AbstractC5112w.m20789e(this.f7616a0.mo10314a(c2885m));
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo10315d(C2886n c2886n, List list) {
        c2886n.getClass();
        list.getClass();
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo10316e(C2888p c2888p, List list) {
        c2888p.getClass();
        list.getClass();
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo10317h(C2886n c2886n, int i10, List list) {
        c2886n.getClass();
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f7616a0.mo10317h(c2886n, i10, list.get(i11));
        }
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo10318i(C2888p c2888p, int i10, List list) {
        c2888p.getClass();
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                this.f7616a0.mo10318i(c2888p, i10, list.get(size));
            }
        }
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo10319j(List list) {
        list.getClass();
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int mo10320k(int i10, List list) {
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int iMo10320k = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iMo10320k += this.f7616a0.mo10320k(i10, list.get(i11));
        }
        return iMo10320k;
    }
}
