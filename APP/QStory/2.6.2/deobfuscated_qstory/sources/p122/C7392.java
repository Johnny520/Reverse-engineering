package p122;

import androidx.collection.C0276;
import bsh.C2632;
import kotlin.sequences.C5122;
import p123.C7398;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7392 extends C5122 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C7393 f20044;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f20045;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object f20046;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f20047;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7392(C7393 c7393) {
        Object obj = c7393.f20049;
        C7398 c7398 = c7393.f20048;
        super(obj, c7398);
        this.f20044 = c7393;
        this.f20045 = c7398.f20064;
    }

    @Override // kotlin.sequences.C5122, java.util.Iterator
    public final Object next() {
        if (this.f20044.f20048.f20064 != this.f20045) {
            C0276.m839();
            return null;
        }
        Object next = super.next();
        this.f20046 = next;
        this.f20047 = true;
        return next;
    }

    @Override // kotlin.sequences.C5122, java.util.Iterator
    public final void remove() {
        if (!this.f20047) {
            C2632.m5296();
            return;
        }
        Object obj = this.f20046;
        C7393 c7393 = this.f20044;
        c7393.remove(obj);
        this.f20046 = null;
        this.f20047 = false;
        this.f20045 = c7393.f20048.f20064;
        this.f14659--;
    }
}
