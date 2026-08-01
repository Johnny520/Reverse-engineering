package p042W;

import androidx.fragment.app.AbstractC0421L;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p022L.AbstractC0174d;
import p037T.AbstractC0274y;
import p037T.C0261l;
import p037T.EnumC0273x;
import p041V.C0322o;
import p049a0.C0367a;
import p051b0.C0493b;
import p051b0.C0494c;

/* JADX INFO: renamed from: W.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0341m extends AbstractC0274y {

    /* JADX INFO: renamed from: c */
    public static final C0340l f762c = new C0340l(1, EnumC0273x.f639a);

    /* JADX INFO: renamed from: a */
    public final C0261l f763a;

    /* JADX INFO: renamed from: b */
    public final EnumC0273x f764b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0341m(C0261l c0261l, EnumC0273x enumC0273x) {
        this.f763a = c0261l;
        this.f764b = enumC0273x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: a */
    public final Object mo476a(C0493b c0493b) {
        Object arrayList;
        Serializable arrayList2;
        int iMo585x = c0493b.mo585x();
        int iM816d = AbstractC0421L.m816d(iMo585x);
        if (iM816d == 0) {
            c0493b.mo571a();
            arrayList = new ArrayList();
        } else if (iM816d != 2) {
            arrayList = null;
        } else {
            c0493b.mo572b();
            arrayList = new C0322o(true);
        }
        if (arrayList == null) {
            return m600c(c0493b, iMo585x);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c0493b.mo577k()) {
                String strMo582r = arrayList instanceof Map ? c0493b.mo582r() : null;
                int iMo585x2 = c0493b.mo585x();
                int iM816d2 = AbstractC0421L.m816d(iMo585x2);
                if (iM816d2 == 0) {
                    c0493b.mo571a();
                    arrayList2 = new ArrayList();
                } else if (iM816d2 != 2) {
                    arrayList2 = null;
                } else {
                    c0493b.mo572b();
                    arrayList2 = new C0322o(true);
                }
                boolean z2 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = m600c(c0493b, iMo585x2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strMo582r, arrayList2);
                }
                if (z2) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    c0493b.mo573e();
                } else {
                    c0493b.mo574f();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: b */
    public final void mo477b(C0494c c0494c, Object obj) throws IOException {
        if (obj == null) {
            c0494c.mo591i();
            return;
        }
        Class<?> cls = obj.getClass();
        C0261l c0261l = this.f763a;
        c0261l.getClass();
        AbstractC0274y abstractC0274yM481d = c0261l.m481d(new C0367a(cls));
        if (!(abstractC0274yM481d instanceof C0341m)) {
            abstractC0274yM481d.mo477b(c0494c, obj);
        } else {
            c0494c.mo587c();
            c0494c.mo589f();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Serializable m600c(C0493b c0493b, int i2) {
        int iM816d = AbstractC0421L.m816d(i2);
        if (iM816d == 5) {
            return c0493b.mo584v();
        }
        if (iM816d == 6) {
            return this.f764b.mo492a(c0493b);
        }
        if (iM816d == 7) {
            return Boolean.valueOf(c0493b.mo578n());
        }
        if (iM816d != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC0174d.m361q(i2)));
        }
        c0493b.mo583t();
        return null;
    }
}
