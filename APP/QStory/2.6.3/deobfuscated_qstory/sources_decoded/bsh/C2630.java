package bsh;

import io.ktor.util.C4211;
import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: renamed from: bsh.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2630 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f7891;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f7892;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f7893 = 0;

    public C2630(Object obj) {
        this.f7892 = obj;
        this.f7891 = Array.getLength(obj);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7893 < this.f7891;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object obj = this.f7892;
            int i = this.f7893;
            this.f7893 = i + 1;
            return Array.get(obj, i);
        } catch (Throwable th) {
            C4211.m8617(th.getMessage());
            return null;
        }
    }
}
