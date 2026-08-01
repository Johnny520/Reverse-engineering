package p321w4;

import com.alibaba.fastjson2.internal.asm.ASMUtils;
import okhttp3.internal.http2.Settings;
import p321w4.AbstractC9171a;

/* JADX INFO: renamed from: w4.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C9174d extends AbstractC9173c {

    /* JADX INFO: renamed from: c */
    public int f31259c;

    /* JADX INFO: renamed from: d */
    public final C9184n f31260d;

    /* JADX INFO: renamed from: e */
    public int f31261e;

    /* JADX INFO: renamed from: f */
    public int f31262f;

    /* JADX INFO: renamed from: g */
    public int f31263g;

    /* JADX INFO: renamed from: h */
    public int f31264h;

    /* JADX INFO: renamed from: i */
    public int[] f31265i;

    /* JADX INFO: renamed from: j */
    public C9177g f31266j;

    /* JADX INFO: renamed from: k */
    public C9177g f31267k;

    /* JADX INFO: renamed from: l */
    public C9182l f31268l;

    /* JADX INFO: renamed from: m */
    public C9182l f31269m;

    /* JADX INFO: renamed from: n */
    public int f31270n;

    /* JADX INFO: renamed from: o */
    public C9172b f31271o;

    /* JADX INFO: renamed from: p */
    public int f31272p;

    /* JADX INFO: renamed from: q */
    public int f31273q;

    /* JADX INFO: renamed from: r */
    public int f31274r;

    /* JADX INFO: renamed from: s */
    public int f31275s;

    /* JADX INFO: renamed from: t */
    public C9172b f31276t;

    /* JADX INFO: renamed from: u */
    public int f31277u;

    public C9174d(int i10) {
        super(393216);
        this.f31260d = new C9184n(this);
        if ((i10 & 2) != 0) {
            this.f31277u = 4;
        } else if ((i10 & 1) != 0) {
            this.f31277u = 1;
        } else {
            this.f31277u = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC9171a[] m35630a() {
        AbstractC9171a.a aVar = new AbstractC9171a.a();
        aVar.m35617a(null);
        for (C9177g c9177g = this.f31266j; c9177g != null; c9177g = (C9177g) c9177g.f31282b) {
            c9177g.m35637a(aVar);
        }
        for (C9182l c9182l = this.f31268l; c9182l != null; c9182l = (C9182l) c9182l.f31317b) {
            c9182l.m35681m(aVar);
        }
        return aVar.m35618b();
    }

    /* JADX INFO: renamed from: b */
    public String m35631b(String str, String str2) {
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            Class<?> cls = Class.forName(str.replace('/', '.'), false, classLoader);
            try {
                Class<?> cls2 = Class.forName(str2.replace('/', '.'), false, classLoader);
                if (cls.isAssignableFrom(cls2)) {
                    return str;
                }
                if (cls2.isAssignableFrom(cls)) {
                    return str2;
                }
                if (cls.isInterface() || cls2.isInterface()) {
                    return ASMUtils.TYPE_OBJECT;
                }
                do {
                    cls = cls.getSuperclass();
                } while (!cls.isAssignableFrom(cls2));
                return cls.getName().replace('.', '/');
            } catch (Exception e10) {
                throw new TypeNotPresentException(str2, e10);
            }
        } catch (Exception e11) {
            throw new TypeNotPresentException(str, e11);
        }
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m35632c(byte[] bArr, boolean z10) {
        m35630a();
        this.f31266j = null;
        this.f31267k = null;
        this.f31268l = null;
        this.f31269m = null;
        this.f31277u = z10 ? 3 : 0;
        return m35633d();
    }

    /* JADX INFO: renamed from: d */
    public byte[] m35633d() {
        int i10;
        int i11;
        int iM35727u = (this.f31264h * 2) + 24;
        int i12 = 0;
        for (C9177g c9177g = this.f31266j; c9177g != null; c9177g = (C9177g) c9177g.f31282b) {
            i12++;
            iM35727u += c9177g.m35638b();
        }
        int i13 = 0;
        for (C9182l c9182l = this.f31268l; c9182l != null; c9182l = (C9182l) c9182l.f31317b) {
            i13++;
            iM35727u += c9182l.m35684p();
        }
        C9172b c9172b = this.f31271o;
        if (c9172b != null) {
            iM35727u += c9172b.f31256b + 8;
            this.f31260d.m35721o("InnerClasses");
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.f31272p != 0) {
            i10++;
            iM35727u += 10;
            this.f31260d.m35721o("EnclosingMethod");
        }
        if ((this.f31261e & 4096) != 0 && (this.f31259c & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 49) {
            i10++;
            iM35727u += 6;
            this.f31260d.m35721o("Synthetic");
        }
        if (this.f31274r != 0) {
            i10++;
            iM35727u += 8;
            this.f31260d.m35721o("Signature");
        }
        if (this.f31275s != 0) {
            i10++;
            iM35727u += 8;
            this.f31260d.m35721o("SourceFile");
        }
        C9172b c9172b2 = this.f31276t;
        if (c9172b2 != null) {
            i10++;
            iM35727u += c9172b2.f31256b + 6;
            this.f31260d.m35721o("SourceDebugExtension");
        }
        if ((this.f31261e & 131072) != 0) {
            i10++;
            iM35727u += 6;
            this.f31260d.m35721o("Deprecated");
        }
        if (this.f31260d.m35727u() > 0) {
            i10++;
            iM35727u += this.f31260d.m35727u();
        }
        int iM35731y = iM35727u + this.f31260d.m35731y();
        if (this.f31260d.m35730x() > 65535) {
            throw new IndexOutOfBoundsException("Class file too large!");
        }
        C9172b c9172b3 = new C9172b(iM35731y);
        c9172b3.m35626h(-889275714).m35626h(this.f31259c);
        this.f31260d.m35705J(c9172b3);
        c9172b3.m35628j((~((this.f31259c & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 49 ? 4096 : 0)) & this.f31261e).m35628j(this.f31262f).m35628j(this.f31263g);
        c9172b3.m35628j(this.f31264h);
        for (int i14 = 0; i14 < this.f31264h; i14++) {
            c9172b3.m35628j(this.f31265i[i14]);
        }
        c9172b3.m35628j(i12);
        for (C9177g c9177g2 = this.f31266j; c9177g2 != null; c9177g2 = (C9177g) c9177g2.f31282b) {
            c9177g2.m35639c(c9172b3);
        }
        c9172b3.m35628j(i13);
        boolean zM35687s = false;
        boolean zM35686r = false;
        for (C9182l c9182l2 = this.f31268l; c9182l2 != null; c9182l2 = (C9182l) c9182l2.f31317b) {
            zM35687s |= c9182l2.m35687s();
            zM35686r |= c9182l2.m35686r();
            c9182l2.m35690v(c9172b3);
        }
        c9172b3.m35628j(i10);
        if (this.f31271o != null) {
            C9172b c9172bM35628j = c9172b3.m35628j(this.f31260d.m35721o("InnerClasses")).m35626h(this.f31271o.f31256b + 2).m35628j(this.f31270n);
            C9172b c9172b4 = this.f31271o;
            c9172bM35628j.m35625g(c9172b4.f31255a, 0, c9172b4.f31256b);
        }
        if (this.f31272p != 0) {
            c9172b3.m35628j(this.f31260d.m35721o("EnclosingMethod")).m35626h(4).m35628j(this.f31272p).m35628j(this.f31273q);
        }
        if ((this.f31261e & 4096) != 0 && (this.f31259c & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 49) {
            c9172b3.m35628j(this.f31260d.m35721o("Synthetic")).m35626h(0);
        }
        if (this.f31274r != 0) {
            i11 = 2;
            c9172b3.m35628j(this.f31260d.m35721o("Signature")).m35626h(2).m35628j(this.f31274r);
        } else {
            i11 = 2;
        }
        if (this.f31275s != 0) {
            c9172b3.m35628j(this.f31260d.m35721o("SourceFile")).m35626h(i11).m35628j(this.f31275s);
        }
        C9172b c9172b5 = this.f31276t;
        if (c9172b5 != null) {
            int i15 = c9172b5.f31256b;
            c9172b3.m35628j(this.f31260d.m35721o("SourceDebugExtension")).m35626h(i15).m35625g(this.f31276t.f31255a, 0, i15);
        }
        if ((this.f31261e & 131072) != 0) {
            c9172b3.m35628j(this.f31260d.m35721o("Deprecated")).m35626h(0);
        }
        this.f31260d.m35704I(c9172b3);
        byte[] bArr = c9172b3.f31255a;
        return zM35686r ? m35632c(bArr, zM35687s) : bArr;
    }

    /* JADX INFO: renamed from: e */
    public final void m35634e(int i10, int i11, String str, String str2, String str3, String[] strArr) {
        this.f31259c = i10;
        this.f31261e = i11;
        C9184n c9184n = this.f31260d;
        int i12 = i10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f31262f = c9184n.m35706K(i12, str);
        if (str2 != null) {
            this.f31274r = this.f31260d.m35721o(str2);
        }
        this.f31263g = str3 == null ? 0 : this.f31260d.m35708b(str3).f31356a;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f31264h = length;
            this.f31265i = new int[length];
            for (int i13 = 0; i13 < this.f31264h; i13++) {
                this.f31265i[i13] = this.f31260d.m35708b(strArr[i13]).f31356a;
            }
        }
        if (this.f31277u != 1 || i12 < 51) {
            return;
        }
        this.f31277u = 2;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC9176f m35635f(int i10, String str, String str2, String str3, Object obj) {
        C9177g c9177g = new C9177g(this.f31260d, i10, str, str2, str3, obj);
        if (this.f31266j == null) {
            this.f31266j = c9177g;
        } else {
            this.f31267k.f31282b = c9177g;
        }
        this.f31267k = c9177g;
        return c9177g;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC9181k m35636g(int i10, String str, String str2, String str3, String[] strArr) {
        C9182l c9182l = new C9182l(this.f31260d, i10, str, str2, str3, strArr, this.f31277u);
        if (this.f31268l == null) {
            this.f31268l = c9182l;
        } else {
            this.f31269m.f31317b = c9182l;
        }
        this.f31269m = c9182l;
        return c9182l;
    }
}
