package p118X3;

import com.bumptech.glide.AbstractC1926h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p056K2.C0882h;
import p061L2.AbstractC0972l;
import p061L2.C0962b;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;
import p123Y3.AbstractC1774e;

/* JADX INFO: renamed from: X3.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1707q implements Iterable, InterfaceC1766a {

    /* JADX INFO: renamed from: e */
    public static final C1707q f5858e = new C1707q(new String[0]);

    /* JADX INFO: renamed from: d */
    public final String[] f5859d;

    public C1707q(String[] strArr) {
        AbstractC1665j.m2985e(strArr, "namesAndValues");
        this.f5859d = strArr;
    }

    /* JADX INFO: renamed from: a */
    public final String m3038a(String str) {
        String[] strArr = this.f5859d;
        AbstractC1665j.m2985e(strArr, "namesAndValues");
        int length = strArr.length - 2;
        int iM3576s = AbstractC1926h.m3576s(length, 0, -2);
        if (iM3576s > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iM3576s) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    /* JADX INFO: renamed from: b */
    public final String m3039b(int i5) {
        String str = (String) AbstractC0972l.m2003a0(i5 * 2, this.f5859d);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i5 + ']');
    }

    /* JADX INFO: renamed from: c */
    public final C1706p m3040c() {
        C1706p c1706p = new C1706p(0);
        ArrayList arrayList = c1706p.f5857a;
        AbstractC1665j.m2985e(arrayList, "<this>");
        String[] strArr = this.f5859d;
        AbstractC1665j.m2985e(strArr, "elements");
        arrayList.addAll(AbstractC0972l.m1987K(strArr));
        return c1706p;
    }

    /* JADX INFO: renamed from: d */
    public final String m3041d(int i5) {
        String str = (String) AbstractC0972l.m2003a0((i5 * 2) + 1, this.f5859d);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i5 + ']');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1707q) {
            return Arrays.equals(this.f5859d, ((C1707q) obj).f5859d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5859d);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C0882h[] c0882hArr = new C0882h[size];
        for (int i5 = 0; i5 < size; i5++) {
            c0882hArr[i5] = new C0882h(m3039b(i5), m3041d(i5));
        }
        return new C0962b(c0882hArr);
    }

    public final int size() {
        return this.f5859d.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            String strM3039b = m3039b(i5);
            String strM3041d = m3041d(i5);
            sb.append(strM3039b);
            sb.append(": ");
            if (AbstractC1774e.m3169j(strM3039b)) {
                strM3041d = "██";
            }
            sb.append(strM3041d);
            sb.append("\n");
        }
        return sb.toString();
    }
}
