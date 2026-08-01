package kotlin.sequences;

import bsh.C2633;
import java.util.Iterator;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5126 implements Iterator, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14665;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f14666 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14667;

    public /* synthetic */ C5126(Object obj, int i) {
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
                    C2633.m5336();
                } else {
                    this.f14666 = false;
                }
                break;
            case 1:
                if (!this.f14666) {
                    C2633.m5336();
                } else {
                    this.f14666 = false;
                }
                break;
            default:
                if (!this.f14666) {
                    C2633.m5336();
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
