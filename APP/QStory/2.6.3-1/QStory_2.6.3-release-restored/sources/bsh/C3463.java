package bsh;

import io.ktor.util.C5043;
import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: renamed from: bsh.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3463 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f8236;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f8237;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f8238 = 0;

    public C3463(Object obj) {
        this.f8237 = obj;
        this.f8236 = Array.getLength(obj);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8238 < this.f8236;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object obj = this.f8237;
            int i = this.f8238;
            this.f8238 = i + 1;
            return Array.get(obj, i);
        } catch (Throwable th) {
            C5043.m9176(th.getMessage());
            return null;
        }
    }
}
