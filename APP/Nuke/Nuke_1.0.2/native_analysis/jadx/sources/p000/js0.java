package p000;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class js0 implements Iterable, q41 {

    /* JADX INFO: renamed from: i */
    public static final js0 f5193i = new js0(new String[0]);

    /* JADX INFO: renamed from: h */
    public final String[] f5194h;

    public js0(String[] strArr) {
        strArr.getClass();
        this.f5194h = strArr;
    }

    /* JADX INFO: renamed from: a */
    public final String m2557a(String str) {
        String[] strArr = this.f5194h;
        strArr.getClass();
        int length = strArr.length - 2;
        int iM3693C = p40.m3693C(length, 0, -2);
        if (iM3693C > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iM3693C) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    /* JADX INFO: renamed from: b */
    public final String m2558b(int i) {
        String str = (String) AbstractC0460mg.m3099n0(i * 2, this.f5194h);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    /* JADX INFO: renamed from: c */
    public final ye0 m2559c() {
        ye0 ye0Var = new ye0(1);
        AbstractC0325iu.m2394h0(ye0Var.f13428a, this.f5194h);
        return ye0Var;
    }

    /* JADX INFO: renamed from: d */
    public final String m2560d(int i) {
        String str = (String) AbstractC0460mg.m3099n0((i * 2) + 1, this.f5194h);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof js0) {
            return Arrays.equals(this.f5194h, ((js0) obj).f5194h);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5194h);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        ow1[] ow1VarArr = new ow1[size];
        for (int i = 0; i < size; i++) {
            ow1VarArr[i] = new ow1(m2558b(i), m2560d(i));
        }
        return new C0717t2(ow1VarArr);
    }

    public final int size() {
        return this.f5194h.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM2558b = m2558b(i);
            String strM2560d = m2560d(i);
            sb.append(strM2558b);
            sb.append(": ");
            if (ug3.m5502j(strM2558b)) {
                strM2560d = "██";
            }
            sb.append(strM2560d);
            sb.append("\n");
        }
        return sb.toString();
    }
}
