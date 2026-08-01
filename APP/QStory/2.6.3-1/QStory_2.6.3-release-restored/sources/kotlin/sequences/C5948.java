package kotlin.sequences;

import bsh.C3466;
import java.util.Iterator;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5948 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5959 f14992;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f14993;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Iterator f14994;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f14995;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14996;

    public C5948(C5947 c5947) {
        this.f14996 = 0;
        this.f14992 = c5947;
        this.f14994 = c5947.f14991.iterator();
        this.f14995 = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14996) {
            case 0:
                if (this.f14995 == -1) {
                    m10665();
                }
                return this.f14995 == 1;
            default:
                int i = this.f14995;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return m10664();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14996) {
            case 0:
                if (this.f14995 == -1) {
                    m10665();
                }
                if (this.f14995 == 0) {
                    C3466.m5896();
                } else {
                    Object obj = this.f14993;
                    this.f14993 = null;
                    this.f14995 = -1;
                }
                break;
            default:
                int i = this.f14995;
                if (i == 2) {
                    C3466.m5896();
                } else if (i == 0 && !m10664()) {
                    C3466.m5896();
                } else {
                    this.f14995 = 0;
                    Iterator it = (Iterator) this.f14993;
                    it.getClass();
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14996) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean m10664() {
        Iterator it;
        Iterator it2 = (Iterator) this.f14993;
        if (it2 != null && it2.hasNext()) {
            this.f14995 = 1;
            return true;
        }
        do {
            Iterator it3 = this.f14994;
            if (!it3.hasNext()) {
                this.f14995 = 2;
                this.f14993 = null;
                return false;
            }
            Object next = it3.next();
            C5956 c5956 = (C5956) this.f14992;
            it = (Iterator) c5956.f15007.invoke(c5956.f15008.invoke(next));
        } while (!it.hasNext());
        this.f14993 = it;
        this.f14995 = 1;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m10665() {
        Object next;
        C5947 c5947 = (C5947) this.f14992;
        do {
            Iterator it = this.f14994;
            if (!it.hasNext()) {
                this.f14995 = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) c5947.f14989.invoke(next)).booleanValue() != c5947.f14990);
        this.f14993 = next;
        this.f14995 = 1;
    }

    public C5948(C5956 c5956) {
        this.f14996 = 1;
        this.f14992 = c5956;
        this.f14994 = c5956.f15009.iterator();
    }
}
