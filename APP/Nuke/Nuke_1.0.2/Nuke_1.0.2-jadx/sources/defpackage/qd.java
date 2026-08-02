package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qd implements Appendable {
    public final StringBuilder h = new StringBuilder(16);
    public final ArrayList i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qd(sd sdVar) {
        new ArrayList();
        this.i = new ArrayList();
        new ArrayList();
        a(sdVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(sd sdVar) {
        StringBuilder sb = this.h;
        int length = sb.length();
        sb.append(sdVar.i);
        List list = sdVar.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                rd rdVar = (rd) list.get(i);
                this.i.add(new pd(rdVar.b + length, rdVar.c + length, rdVar.a, rdVar.d));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof sd;
        StringBuilder sb = this.h;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        sd sdVar = (sd) charSequence;
        int length = sb.length();
        sb.append((CharSequence) sdVar.i, i, i2);
        List listA = td.a(sdVar, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                rd rdVar = (rd) listA.get(i3);
                this.i.add(new pd(rdVar.b + length, rdVar.c + length, rdVar.a, rdVar.d));
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final sd b() {
        StringBuilder sb = this.h;
        String string = sb.toString();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            pd pdVar = (pd) arrayList.get(i);
            int length = sb.length();
            int i2 = pdVar.c;
            if (i2 != Integer.MIN_VALUE) {
                length = i2;
            }
            if (length == Integer.MIN_VALUE) {
                lz0.b("Item.end should be set first");
            }
            arrayList2.add(new rd(pdVar.b, length, pdVar.a, pdVar.d));
        }
        return new sd(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof sd) {
            a((sd) charSequence);
            return this;
        }
        this.h.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.h.append(c);
        return this;
    }
}
