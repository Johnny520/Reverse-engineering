package kotlin.sequences;

import bsh.C3466;
import java.util.Iterator;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5958 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f15010;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f15011 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15012;

    public /* synthetic */ C5958(Object obj, int i) {
        this.f15012 = i;
        this.f15010 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15012) {
        }
        return this.f15011;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f15012;
        Object obj = this.f15010;
        switch (i) {
            case 0:
                if (!this.f15011) {
                    C3466.m5896();
                } else {
                    this.f15011 = false;
                }
                break;
            case 1:
                if (!this.f15011) {
                    C3466.m5896();
                } else {
                    this.f15011 = false;
                }
                break;
            default:
                if (!this.f15011) {
                    C3466.m5896();
                } else {
                    this.f15011 = false;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f15012) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
