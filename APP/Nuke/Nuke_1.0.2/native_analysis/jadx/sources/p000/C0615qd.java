package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: qd */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0615qd implements Appendable {

    /* JADX INFO: renamed from: h */
    public final StringBuilder f8897h = new StringBuilder(16);

    /* JADX INFO: renamed from: i */
    public final ArrayList f8898i;

    public C0615qd(C0690sd c0690sd) {
        new ArrayList();
        this.f8898i = new ArrayList();
        new ArrayList();
        m4137a(c0690sd);
    }

    /* JADX INFO: renamed from: a */
    public final void m4137a(C0690sd c0690sd) {
        StringBuilder sb = this.f8897h;
        int length = sb.length();
        sb.append(c0690sd.f10051i);
        List list = c0690sd.f10050h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C0652rd c0652rd = (C0652rd) list.get(i);
                this.f8898i.add(new C0576pd(c0652rd.f9515b + length, c0652rd.f9516c + length, c0652rd.f9514a, c0652rd.f9517d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof C0690sd;
        StringBuilder sb = this.f8897h;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        C0690sd c0690sd = (C0690sd) charSequence;
        int length = sb.length();
        sb.append((CharSequence) c0690sd.f10051i, i, i2);
        List listM5162a = AbstractC0730td.m5162a(c0690sd, i, i2, null);
        if (listM5162a != null) {
            int size = listM5162a.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0652rd c0652rd = (C0652rd) listM5162a.get(i3);
                this.f8898i.add(new C0576pd(c0652rd.f9515b + length, c0652rd.f9516c + length, c0652rd.f9514a, c0652rd.f9517d));
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C0690sd m4138b() {
        StringBuilder sb = this.f8897h;
        String string = sb.toString();
        ArrayList arrayList = this.f8898i;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0576pd c0576pd = (C0576pd) arrayList.get(i);
            int length = sb.length();
            int i2 = c0576pd.f8259c;
            if (i2 != Integer.MIN_VALUE) {
                length = i2;
            }
            if (length == Integer.MIN_VALUE) {
                lz0.m2989b("Item.end should be set first");
            }
            arrayList2.add(new C0652rd(c0576pd.f8258b, length, c0576pd.f8257a, c0576pd.f8260d));
        }
        return new C0690sd(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C0690sd) {
            m4137a((C0690sd) charSequence);
            return this;
        }
        this.f8897h.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f8897h.append(c);
        return this;
    }
}
