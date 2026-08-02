package p000;

/* JADX INFO: renamed from: wp */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0855wp extends kj0 implements Comparable {

    /* JADX INFO: renamed from: j */
    public static final C0855wp f12603j = new C0855wp(0);

    @Override // p000.kj0, p000.t23
    /* JADX INFO: renamed from: b */
    public final String mo23b() {
        return m5949i("", "");
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0855wp c0855wp) {
        if (this != c0855wp) {
            int length = this.f5590i.length;
            int length2 = c0855wp.f5590i.length;
            int iMin = Math.min(length, length2);
            for (int i = 0; i < iMin; i++) {
                int iM5747a = ((C0818vp) m2693e(i)).compareTo((C0818vp) c0855wp.m2693e(i));
                if (iM5747a != 0) {
                    return iM5747a;
                }
            }
            if (length < length2) {
                return -1;
            }
            if (length > length2) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m5949i(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        Object[] objArr = this.f5590i;
        int length = objArr.length;
        sb.append(str);
        sb.append(str2);
        sb.append("catch ");
        for (int i = 0; i < length; i++) {
            C0818vp c0818vp = (C0818vp) m2693e(i);
            if (i != 0) {
                sb.append(",\n");
                sb.append(str);
                sb.append("  ");
            }
            if (i != length - 1) {
                sb.append(c0818vp.f12096h.f9342h.mo23b());
            } else {
                int length2 = objArr.length;
                if (length2 == 0 ? false : ((C0818vp) m2693e(length2 - 1)).f12096h.equals(r30.f9339k)) {
                    sb.append("<any>");
                }
            }
            sb.append(" -> ");
            int i2 = c0818vp.f12097i;
            sb.append(i2 == ((char) i2) ? pp0.m3898J(i2) : pp0.m3899K(i2));
        }
        return sb.toString();
    }
}
