package bsh;

import io.ktor.util.C4210;
import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: renamed from: bsh.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2629 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f7889;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f7890;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f7891 = 0;

    public C2629(Object obj) {
        this.f7890 = obj;
        this.f7889 = Array.getLength(obj);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7891 < this.f7889;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object obj = this.f7890;
            int i = this.f7891;
            this.f7891 = i + 1;
            return Array.get(obj, i);
        } catch (Throwable th) {
            C4210.m8627(th.getMessage());
            return null;
        }
    }
}
