package la;

import java.util.ArrayList;
import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: la.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4721a {

    /* JADX INFO: renamed from: f */
    public static final a f13951f = new a(null);

    /* JADX INFO: renamed from: a */
    public final int[] f13952a;

    /* JADX INFO: renamed from: b */
    public final int f13953b;

    /* JADX INFO: renamed from: c */
    public final int f13954c;

    /* JADX INFO: renamed from: d */
    public final int f13955d;

    /* JADX INFO: renamed from: e */
    public final List f13956e;

    public AbstractC4721a(int... iArr) {
        List listM20800o;
        iArr.getClass();
        this.f13952a = iArr;
        Integer numM20734g0 = AbstractC5106t.m20734g0(iArr, 0);
        this.f13953b = numM20734g0 != null ? numM20734g0.intValue() : -1;
        Integer numM20734g02 = AbstractC5106t.m20734g0(iArr, 1);
        this.f13954c = numM20734g02 != null ? numM20734g02.intValue() : -1;
        Integer numM20734g03 = AbstractC5106t.m20734g0(iArr, 2);
        this.f13955d = numM20734g03 != null ? numM20734g03.intValue() : -1;
        if (iArr.length <= 3) {
            listM20800o = AbstractC5114x.m20800o();
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
            }
            listM20800o = AbstractC5081g0.m20554X0(AbstractC5102r.m20651c(iArr).subList(3, iArr.length));
        }
        this.f13956e = listM20800o;
    }

    /* JADX INFO: renamed from: a */
    public final int m18843a() {
        return this.f13953b;
    }

    /* JADX INFO: renamed from: b */
    public final int m18844b() {
        return this.f13954c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18845c(int i10, int i11, int i12) {
        int i13 = this.f13953b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f13954c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f13955d >= i12;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m18846d(AbstractC4721a abstractC4721a) {
        abstractC4721a.getClass();
        return m18845c(abstractC4721a.f13953b, abstractC4721a.f13954c, abstractC4721a.f13955d);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18847e(int i10, int i11, int i12) {
        int i13 = this.f13953b;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.f13954c;
        if (i14 < i11) {
            return true;
        }
        return i14 <= i11 && this.f13955d <= i12;
    }

    public boolean equals(Object obj) {
        if (obj == null || !AbstractC1061t.m3842c(getClass(), obj.getClass())) {
            return false;
        }
        AbstractC4721a abstractC4721a = (AbstractC4721a) obj;
        return this.f13953b == abstractC4721a.f13953b && this.f13954c == abstractC4721a.f13954c && this.f13955d == abstractC4721a.f13955d && AbstractC1061t.m3842c(this.f13956e, abstractC4721a.f13956e);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m18848f(AbstractC4721a abstractC4721a) {
        abstractC4721a.getClass();
        int i10 = this.f13953b;
        return i10 == 0 ? abstractC4721a.f13953b == 0 && this.f13954c == abstractC4721a.f13954c : i10 == abstractC4721a.f13953b && this.f13954c <= abstractC4721a.f13954c;
    }

    /* JADX INFO: renamed from: g */
    public final int[] m18849g() {
        return this.f13952a;
    }

    public int hashCode() {
        int i10 = this.f13953b;
        int i11 = i10 + (i10 * 31) + this.f13954c;
        int i12 = i11 + (i11 * 31) + this.f13955d;
        return i12 + (i12 * 31) + this.f13956e.hashCode();
    }

    public String toString() {
        int[] iArrM18849g = m18849g();
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArrM18849g) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : AbstractC5081g0.m20585s0(arrayList, ".", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: la.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
