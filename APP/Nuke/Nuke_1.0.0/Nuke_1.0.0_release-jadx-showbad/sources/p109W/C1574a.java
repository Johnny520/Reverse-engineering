package p109W;

import com.bumptech.glide.AbstractC1925g;
import java.util.List;
import p061L2.AbstractC0965e;
import p114X.AbstractC1614c;

/* JADX INFO: renamed from: W.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1574a extends AbstractC0965e {

    /* JADX INFO: renamed from: d */
    public final AbstractC1614c f5487d;

    /* JADX INFO: renamed from: e */
    public final int f5488e;

    /* JADX INFO: renamed from: f */
    public final int f5489f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1574a(AbstractC1614c abstractC1614c, int i5, int i6) {
        this.f5487d = abstractC1614c;
        this.f5488e = i5;
        AbstractC1925g.m3533j(i5, i6, abstractC1614c.mo1974a());
        this.f5489f = i6 - i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0961a
    /* JADX INFO: renamed from: a */
    public final int mo1974a() {
        return this.f5489f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i5) {
        AbstractC1925g.m3530g(i5, this.f5489f);
        return this.f5487d.get(this.f5488e + i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0965e, java.util.List
    public final List subList(int i5, int i6) {
        AbstractC1925g.m3533j(i5, i6, this.f5489f);
        int i7 = this.f5488e;
        return new C1574a(this.f5487d, i5 + i7, i7 + i6);
    }
}
