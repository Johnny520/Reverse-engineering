package kotlin.sequences;

import bsh.C2632;
import java.util.Iterator;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5125 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14665;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f14666 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14667;

    public /* synthetic */ C5125(Object obj, int i) {
        this.f14667 = i;
        this.f14665 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14667) {
        }
        return this.f14666;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f14667;
        Object obj = this.f14665;
        switch (i) {
            case 0:
                if (!this.f14666) {
                    C2632.m5291();
                } else {
                    this.f14666 = false;
                }
                break;
            case 1:
                if (!this.f14666) {
                    C2632.m5291();
                } else {
                    this.f14666 = false;
                }
                break;
            default:
                if (!this.f14666) {
                    C2632.m5291();
                } else {
                    this.f14666 = false;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14667) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
