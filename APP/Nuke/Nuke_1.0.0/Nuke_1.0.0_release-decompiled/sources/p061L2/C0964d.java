package p061L2;

import com.bumptech.glide.AbstractC1925g;
import java.util.List;
import java.util.RandomAccess;
import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: L2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0964d extends AbstractC0965e implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public final AbstractC0965e f3035d;

    /* JADX INFO: renamed from: e */
    public final int f3036e;

    /* JADX INFO: renamed from: f */
    public final int f3037f;

    public C0964d(AbstractC0965e abstractC0965e, int i5, int i6) {
        this.f3035d = abstractC0965e;
        this.f3036e = i5;
        AbstractC1925g.m3532i(i5, i6, abstractC0965e.mo1974a());
        this.f3037f = i6 - i5;
    }

    @Override // p061L2.AbstractC0961a
    /* JADX INFO: renamed from: a */
    public final int mo1974a() {
        return this.f3037f;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        int i6 = this.f3037f;
        if (i5 < 0 || i5 >= i6) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
        }
        return this.f3035d.get(this.f3036e + i5);
    }

    @Override // p061L2.AbstractC0965e, java.util.List
    public final List subList(int i5, int i6) {
        AbstractC1925g.m3532i(i5, i6, this.f3037f);
        int i7 = this.f3036e;
        return new C0964d(this.f3035d, i5 + i7, i7 + i6);
    }
}
