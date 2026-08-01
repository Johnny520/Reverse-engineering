package kotlin.sequences;

import bsh.C2632;
import java.util.Iterator;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5115 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5126 f14647;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f14648;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Iterator f14649;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f14650;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14651;

    public C5115(C5114 c5114) {
        this.f14651 = 0;
        this.f14647 = c5114;
        this.f14649 = c5114.f14646.iterator();
        this.f14650 = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14651) {
            case 0:
                if (this.f14650 == -1) {
                    m10102();
                }
                return this.f14650 == 1;
            default:
                int i = this.f14650;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return m10101();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14651) {
            case 0:
                if (this.f14650 == -1) {
                    m10102();
                }
                if (this.f14650 == 0) {
                    C2632.m5291();
                } else {
                    Object obj = this.f14648;
                    this.f14648 = null;
                    this.f14650 = -1;
                }
                break;
            default:
                int i = this.f14650;
                if (i == 2) {
                    C2632.m5291();
                } else if (i == 0 && !m10101()) {
                    C2632.m5291();
                } else {
                    this.f14650 = 0;
                    Iterator it = (Iterator) this.f14648;
                    it.getClass();
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14651) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean m10101() {
        Iterator it;
        Iterator it2 = (Iterator) this.f14648;
        if (it2 != null && it2.hasNext()) {
            this.f14650 = 1;
            return true;
        }
        do {
            Iterator it3 = this.f14649;
            if (!it3.hasNext()) {
                this.f14650 = 2;
                this.f14648 = null;
                return false;
            }
            Object next = it3.next();
            C5123 c5123 = (C5123) this.f14647;
            it = (Iterator) c5123.f14662.invoke(c5123.f14663.invoke(next));
        } while (!it.hasNext());
        this.f14648 = it;
        this.f14650 = 1;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m10102() {
        Object next;
        C5114 c5114 = (C5114) this.f14647;
        do {
            Iterator it = this.f14649;
            if (!it.hasNext()) {
                this.f14650 = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) c5114.f14644.invoke(next)).booleanValue() != c5114.f14645);
        this.f14648 = next;
        this.f14650 = 1;
    }

    public C5115(C5123 c5123) {
        this.f14651 = 1;
        this.f14647 = c5123;
        this.f14649 = c5123.f14664.iterator();
    }
}
