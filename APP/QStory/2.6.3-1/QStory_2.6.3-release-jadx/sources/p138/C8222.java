package p138;

import androidx.collection.C1123;
import bsh.C3466;
import kotlin.sequences.C5955;
import p139.C8228;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8222 extends C5955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C8223 f20384;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f20385;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object f20386;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f20387;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8222(C8223 c8223) {
        Object obj = c8223.f20389;
        C8228 c8228 = c8223.f20388;
        super(obj, c8228);
        this.f20384 = c8223;
        this.f20385 = c8228.f20404;
    }

    @Override // kotlin.sequences.C5955, java.util.Iterator
    public final Object next() {
        if (this.f20384.f20388.f20404 != this.f20385) {
            C1123.m1400();
            return null;
        }
        Object next = super.next();
        this.f20386 = next;
        this.f20387 = true;
        return next;
    }

    @Override // kotlin.sequences.C5955, java.util.Iterator
    public final void remove() {
        if (!this.f20387) {
            C3466.m5901();
            return;
        }
        Object obj = this.f20386;
        C8223 c8223 = this.f20384;
        c8223.remove(obj);
        this.f20386 = null;
        this.f20387 = false;
        this.f20385 = c8223.f20388.f20404;
        this.f15004--;
    }
}
