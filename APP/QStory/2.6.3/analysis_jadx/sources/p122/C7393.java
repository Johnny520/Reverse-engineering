package p122;

import androidx.collection.C0276;
import bsh.C2633;
import kotlin.sequences.C5123;
import p123.C7399;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7393 extends C5123 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C7394 f20039;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f20040;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object f20041;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f20042;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7393(C7394 c7394) {
        Object obj = c7394.f20044;
        C7399 c7399 = c7394.f20043;
        super(obj, c7399);
        this.f20039 = c7394;
        this.f20040 = c7399.f20059;
    }

    @Override // kotlin.sequences.C5123, java.util.Iterator
    public final Object next() {
        if (this.f20039.f20043.f20059 != this.f20040) {
            C0276.m840();
            return null;
        }
        Object next = super.next();
        this.f20041 = next;
        this.f20042 = true;
        return next;
    }

    @Override // kotlin.sequences.C5123, java.util.Iterator
    public final void remove() {
        if (!this.f20042) {
            C2633.m5341();
            return;
        }
        Object obj = this.f20041;
        C7394 c7394 = this.f20039;
        c7394.remove(obj);
        this.f20041 = null;
        this.f20042 = false;
        this.f20040 = c7394.f20043.f20059;
        this.f14659--;
    }
}
