package androidx.compose.p001ui.text;

import java.util.ArrayList;
import java.util.List;
import p211.AbstractC8663;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2885 implements Appendable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f6423;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final StringBuilder f6424 = new StringBuilder(16);

    public C2885(C2902 c2902) {
        new ArrayList();
        this.f6423 = new ArrayList();
        new ArrayList();
        m4335(c2902);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof C2902;
        StringBuilder sb = this.f6424;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        C2902 c2902 = (C2902) charSequence;
        int length = sb.length();
        sb.append((CharSequence) c2902.f6474, i, i2);
        List listM4363 = AbstractC2901.m4363(c2902, i, i2, null);
        if (listM4363 != null) {
            int size = listM4363.size();
            for (int i3 = 0; i3 < size; i3++) {
                C2884 c2884 = (C2884) listM4363.get(i3);
                Object obj = c2884.f6422;
                this.f6423.add(new C2886(c2884.f6419, c2884.f6421 + length, obj, c2884.f6420 + length));
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2902 m4334() {
        StringBuilder sb = this.f6424;
        String string = sb.toString();
        ArrayList arrayList = this.f6423;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2886 c2886 = (C2886) arrayList.get(i);
            int length = sb.length();
            int i2 = c2886.f6426;
            if (i2 != Integer.MIN_VALUE) {
                length = i2;
            }
            if (length == Integer.MIN_VALUE) {
                AbstractC8663.m13756("Item.end should be set first");
            }
            Object obj = c2886.f6428;
            arrayList2.add(new C2884(c2886.f6425, c2886.f6427, obj, length));
        }
        return new C2902(string, arrayList2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4335(C2902 c2902) {
        StringBuilder sb = this.f6424;
        int length = sb.length();
        sb.append(c2902.f6474);
        List list = c2902.f6476;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C2884 c2884 = (C2884) list.get(i);
                Object obj = c2884.f6422;
                this.f6423.add(new C2886(c2884.f6419, c2884.f6421 + length, obj, c2884.f6420 + length));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C2902) {
            m4335((C2902) charSequence);
            return this;
        }
        this.f6424.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f6424.append(c);
        return this;
    }
}
