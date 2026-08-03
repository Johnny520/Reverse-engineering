package p119i2;

import java.util.ArrayList;
import java.util.List;
import p204o2.AbstractC3042a;

/* JADX INFO: renamed from: i2.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1920d implements Appendable {

    /* JADX INFO: renamed from: g */
    public final StringBuilder f6470g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f6471h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f6472i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1920d() {
        this.f6470g = new StringBuilder(16);
        this.f6471h = new ArrayList();
        this.f6472i = new ArrayList();
        new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4776a(C1926g c1926g) {
        StringBuilder sb2 = this.f6470g;
        int length = sb2.length();
        sb2.append(c1926g.f6529h);
        List list = c1926g.f6528g;
        if (list != null) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                C1922e c1922e = (C1922e) list.get(i9);
                Object obj = c1922e.f6503a;
                this.f6472i.add(new C1918c(c1922e.f6506d, c1922e.f6504b + length, c1922e.f6505c + length, obj));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i9, int i10) {
        boolean z9 = charSequence instanceof C1926g;
        StringBuilder sb2 = this.f6470g;
        if (!z9) {
            sb2.append(charSequence, i9, i10);
            return this;
        }
        C1926g c1926g = (C1926g) charSequence;
        int length = sb2.length();
        sb2.append((CharSequence) c1926g.f6529h, i9, i10);
        List listM4797a = AbstractC1928h.m4797a(c1926g, i9, i10, null);
        if (listM4797a != null) {
            int size = listM4797a.size();
            for (int i11 = 0; i11 < size; i11++) {
                C1922e c1922e = (C1922e) listM4797a.get(i11);
                Object obj = c1922e.f6503a;
                this.f6472i.add(new C1918c(c1922e.f6506d, c1922e.f6504b + length, c1922e.f6505c + length, obj));
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4777b() {
        ArrayList arrayList = this.f6471h;
        if (arrayList.isEmpty()) {
            AbstractC3042a.m6487b("Nothing to pop.");
        }
        ((C1918c) arrayList.remove(arrayList.size() - 1)).f6466c = this.f6470g.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4778c(int i9) {
        ArrayList arrayList = this.f6471h;
        if (i9 >= arrayList.size()) {
            AbstractC3042a.m6487b(i9 + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i9) {
            m4777b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m4779d(C1925f0 c1925f0) {
        C1918c c1918c = new C1918c(c1925f0, this.f6470g.length(), 0, 12);
        this.f6471h.add(c1918c);
        this.f6472i.add(c1918c);
        return r5.size() - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C1926g m4780e() {
        StringBuilder sb2 = this.f6470g;
        String string = sb2.toString();
        ArrayList arrayList = this.f6472i;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList2.add(((C1918c) arrayList.get(i9)).m4773a(sb2.length()));
        }
        return new C1926g(string, arrayList2);
    }

    public C1920d(C1926g c1926g) {
        this();
        m4776a(c1926g);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C1926g) {
            m4776a((C1926g) charSequence);
            return this;
        }
        this.f6470g.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) {
        this.f6470g.append(c10);
        return this;
    }
}
