package p092S0;

import java.util.ArrayList;
import java.util.List;
import p120Y0.AbstractC1732a;

/* JADX INFO: renamed from: S0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1266d implements Appendable {

    /* JADX INFO: renamed from: d */
    public final StringBuilder f4555d = new StringBuilder(16);

    /* JADX INFO: renamed from: e */
    public final ArrayList f4556e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1266d(C1269g c1269g) {
        new ArrayList();
        this.f4556e = new ArrayList();
        new ArrayList();
        m2353a(c1269g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2353a(C1269g c1269g) {
        StringBuilder sb = this.f4555d;
        int length = sb.length();
        sb.append(c1269g.f4563e);
        List list = c1269g.f4562d;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                C1267e c1267e = (C1267e) list.get(i5);
                this.f4556e.add(new C1265c(c1267e.f4557a, c1267e.f4558b + length, c1267e.f4559c + length, c1267e.f4560d));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C1269g) {
            m2353a((C1269g) charSequence);
            return this;
        }
        this.f4555d.append(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C1269g m2354b() {
        StringBuilder sb = this.f4555d;
        String string = sb.toString();
        ArrayList arrayList = this.f4556e;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C1265c c1265c = (C1265c) arrayList.get(i5);
            int length = sb.length();
            int i6 = c1265c.f4553c;
            if (i6 != Integer.MIN_VALUE) {
                length = i6;
            }
            if (length == Integer.MIN_VALUE) {
                AbstractC1732a.m3086b("Item.end should be set first");
            }
            arrayList2.add(new C1267e(c1265c.f4551a, c1265c.f4552b, length, c1265c.f4554d));
        }
        return new C1269g(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i5, int i6) {
        boolean z5 = charSequence instanceof C1269g;
        StringBuilder sb = this.f4555d;
        if (z5) {
            C1269g c1269g = (C1269g) charSequence;
            int length = sb.length();
            sb.append((CharSequence) c1269g.f4563e, i5, i6);
            List listM2356a = AbstractC1270h.m2356a(c1269g, i5, i6, null);
            if (listM2356a != null) {
                int size = listM2356a.size();
                for (int i7 = 0; i7 < size; i7++) {
                    C1267e c1267e = (C1267e) listM2356a.get(i7);
                    this.f4556e.add(new C1265c(c1267e.f4557a, c1267e.f4558b + length, c1267e.f4559c + length, c1267e.f4560d));
                }
            }
            return this;
        }
        sb.append(charSequence, i5, i6);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c5) {
        this.f4555d.append(c5);
        return this;
    }
}
