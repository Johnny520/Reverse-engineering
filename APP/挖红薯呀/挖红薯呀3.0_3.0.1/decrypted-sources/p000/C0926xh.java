package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: xh */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0926xh extends RuntimeException {

    /* JADX INFO: renamed from: d */
    public final dh0 f7345d;

    /* JADX INFO: renamed from: e */
    public final dh0 f7346e;

    /* JADX INFO: renamed from: f */
    public final tg0 f7347f;

    /* JADX INFO: renamed from: g */
    public final int f7348g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0926xh(dh0 dh0Var, dh0 dh0Var2, tg0 tg0Var, int i, Exception exc) {
        super(exc);
        this.f7345d = dh0Var;
        this.f7346e = dh0Var2;
        this.f7347f = tg0Var;
        this.f7348g = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final String getMessage() {
        List listM2782v;
        List listM5253W;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.f7348g);
        sb.append(":\n            |");
        q01 q01VarM4408n = v50.m4408n(new C0889wh(this, null));
        if (q01VarM4408n.hasNext()) {
            Object next = q01VarM4408n.next();
            if (q01VarM4408n.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (q01VarM4408n.hasNext()) {
                    arrayList.add(q01VarM4408n.next());
                }
                listM2782v = arrayList;
            } else {
                listM2782v = o30.m2782v(next);
            }
        } else {
            listM2782v = C0294hs.f2354d;
        }
        int size = listM2782v.size();
        if (50 >= size) {
            listM5253W = AbstractC0960ye.m5253W(listM2782v);
        } else {
            ArrayList arrayList2 = new ArrayList(50);
            if (listM2782v instanceof RandomAccess) {
                for (int i = size - 50; i < size; i++) {
                    arrayList2.add(listM2782v.get(i));
                }
            } else {
                ListIterator listIterator = listM2782v.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            listM5253W = arrayList2;
        }
        sb.append(AbstractC0960ye.m5245O(listM5253W, "\n", null, null, null, 62));
        sb.append("\n            ");
        String string = sb.toString();
        if (k41.m1769a0("|")) {
            C0921xc.m5131l("marginPrefix must be non-blank string.");
            return null;
        }
        List listM1771c0 = k41.m1771c0(string);
        int length = string.length();
        listM1771c0.size();
        int size2 = listM1771c0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        for (Object obj : listM1771c0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                o30.m2757A();
                throw null;
            }
            String str = (String) obj;
            if ((i2 == 0 || i2 == size2) && k41.m1769a0(str)) {
                str = null;
            } else {
                int length2 = str.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i4 = -1;
                        break;
                    }
                    if (!p30.m2978N(str.charAt(i4))) {
                        break;
                    }
                    i4++;
                }
                String strSubstring = (i4 != -1 && str.startsWith("|", i4)) ? str.substring("|".length() + i4) : null;
                if (strSubstring != null) {
                    str = strSubstring;
                }
            }
            if (str != null) {
                arrayList3.add(str);
            }
            i2 = i3;
        }
        StringBuilder sb2 = new StringBuilder(length);
        AbstractC0960ye.m5243M(arrayList3, sb2, "\n", "", "", "...", null);
        return sb2.toString();
    }
}
