package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import p195.AbstractC7833;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2051 implements Appendable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f6077;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final StringBuilder f6078 = new StringBuilder(16);

    public C2051(C2068 c2068) {
        new ArrayList();
        this.f6077 = new ArrayList();
        new ArrayList();
        m3765(c2068);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof C2068;
        StringBuilder sb = this.f6078;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        C2068 c2068 = (C2068) charSequence;
        int length = sb.length();
        sb.append((CharSequence) c2068.f6128, i, i2);
        List listM3793 = AbstractC2067.m3793(c2068, i, i2, null);
        if (listM3793 != null) {
            int size = listM3793.size();
            for (int i3 = 0; i3 < size; i3++) {
                C2050 c2050 = (C2050) listM3793.get(i3);
                Object obj = c2050.f6076;
                this.f6077.add(new C2052(c2050.f6073, c2050.f6075 + length, obj, c2050.f6074 + length));
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2068 m3764() {
        StringBuilder sb = this.f6078;
        String string = sb.toString();
        ArrayList arrayList = this.f6077;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2052 c2052 = (C2052) arrayList.get(i);
            int length = sb.length();
            int i2 = c2052.f6080;
            if (i2 != Integer.MIN_VALUE) {
                length = i2;
            }
            if (length == Integer.MIN_VALUE) {
                AbstractC7833.m13169("Item.end should be set first");
            }
            Object obj = c2052.f6082;
            arrayList2.add(new C2050(c2052.f6079, c2052.f6081, obj, length));
        }
        return new C2068(string, arrayList2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3765(C2068 c2068) {
        StringBuilder sb = this.f6078;
        int length = sb.length();
        sb.append(c2068.f6128);
        List list = c2068.f6130;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C2050 c2050 = (C2050) list.get(i);
                Object obj = c2050.f6076;
                this.f6077.add(new C2052(c2050.f6073, c2050.f6075 + length, obj, c2050.f6074 + length));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C2068) {
            m3765((C2068) charSequence);
            return this;
        }
        this.f6078.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f6078.append(c);
        return this;
    }
}
