package androidx.collection;

import bsh.C2632;
import java.util.Iterator;
import p054.InterfaceC6566;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0261 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f941;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f942;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f943;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f944;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f945;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0261(C0257 c0257, int i) {
        this(c0257.f994);
        this.f942 = i;
        switch (i) {
            case 1:
                this.f941 = c0257;
                this(c0257.f994);
                break;
            default:
                this.f941 = c0257;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f943 < this.f945;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM861;
        if (!hasNext()) {
            C2632.m5291();
            return null;
        }
        int i = this.f943;
        int i2 = this.f942;
        Object obj = this.f941;
        switch (i2) {
            case 0:
                objM861 = ((C0257) obj).m861(i);
                break;
            case 1:
                objM861 = ((C0257) obj).m870(i);
                break;
            default:
                objM861 = ((C0275) obj).f980[i];
                break;
        }
        this.f943++;
        this.f944 = true;
        return objM861;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f944) {
            C5919.m11250("Call next() before removing an element.");
            return;
        }
        int i = this.f943 - 1;
        this.f943 = i;
        int i2 = this.f942;
        Object obj = this.f941;
        switch (i2) {
            case 0:
                ((C0257) obj).mo867(i);
                break;
            case 1:
                ((C0257) obj).mo867(i);
                break;
            default:
                ((C0275) obj).m836(i);
                break;
        }
        this.f945--;
        this.f944 = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0261(C0275 c0275) {
        this(c0275.f981);
        this.f942 = 2;
        this.f941 = c0275;
    }

    public C0261(int i) {
        this.f945 = i;
    }
}
