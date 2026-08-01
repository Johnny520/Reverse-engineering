package qa;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p280t5.C8130u;
import p376zd.C9987e;

/* JADX INFO: renamed from: qa.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6348e implements Iterable {

    /* JADX INFO: renamed from: q */
    public static final AbstractC6348e f19966q = new C6359p(new byte[0]);

    /* JADX INFO: renamed from: qa.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a extends Iterator {
        /* JADX INFO: renamed from: c */
        byte mo25033c();
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC6348e m25035a(Iterator it, int i10) {
        if (i10 == 1) {
            return (AbstractC6348e) it.next();
        }
        int i11 = i10 >>> 1;
        return m25035a(it, i11).m25043c(m25035a(it, i10 - i11));
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC6348e m25036d(Iterable iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add((AbstractC6348e) it.next());
            }
        }
        return arrayList.isEmpty() ? f19966q : m25035a(arrayList.iterator(), arrayList.size());
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC6348e m25037e(byte[] bArr) {
        return m25038h(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC6348e m25038h(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new C6359p(bArr2);
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC6348e m25039l(String str) {
        try {
            return new C6359p(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            C8130u.m31512a("UTF-8 not supported?", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static b m25040t() {
        return new b(128);
    }

    /* JADX INFO: renamed from: A */
    public void m25041A(OutputStream outputStream, int i10, int i11) {
        if (i10 < 0) {
            C6347d.m25034a(30, "Source offset < 0: ", i10);
            return;
        }
        if (i11 < 0) {
            C6347d.m25034a(23, "Length < 0: ", i11);
            return;
        }
        int i12 = i10 + i11;
        if (i12 > size()) {
            C6347d.m25034a(39, "Source end offset exceeded: ", i12);
        } else if (i11 > 0) {
            mo25042B(outputStream, i10, i11);
        }
    }

    /* JADX INFO: renamed from: B */
    public abstract void mo25042B(OutputStream outputStream, int i10, int i11);

    /* JADX INFO: renamed from: c */
    public AbstractC6348e m25043c(AbstractC6348e abstractC6348e) {
        int size = size();
        int size2 = abstractC6348e.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return C6364u.m25279F(this, abstractC6348e);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: o */
    public void m25044o(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            C6347d.m25034a(30, "Source offset < 0: ", i10);
            return;
        }
        if (i11 < 0) {
            C6347d.m25034a(30, "Target offset < 0: ", i11);
            return;
        }
        if (i12 < 0) {
            C6347d.m25034a(23, "Length < 0: ", i12);
            return;
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            C6347d.m25034a(34, "Source end offset < 0: ", i13);
            return;
        }
        int i14 = i11 + i12;
        if (i14 > bArr.length) {
            C6347d.m25034a(34, "Target end offset < 0: ", i14);
        } else if (i12 > 0) {
            mo25031p(bArr, i10, i11, i12);
        }
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo25031p(byte[] bArr, int i10, int i11, int i12);

    /* JADX INFO: renamed from: q */
    public abstract int mo25045q();

    /* JADX INFO: renamed from: r */
    public abstract boolean mo25046r();

    /* JADX INFO: renamed from: s */
    public abstract boolean mo25047s();

    public abstract int size();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* JADX INFO: renamed from: u */
    public abstract int mo25048u(int i10, int i11, int i12);

    /* JADX INFO: renamed from: v */
    public abstract int mo25049v(int i10, int i11, int i12);

    /* JADX INFO: renamed from: w */
    public abstract int mo25050w();

    /* JADX INFO: renamed from: x */
    public byte[] m25051x() {
        int size = size();
        if (size == 0) {
            return AbstractC6354k.f20021a;
        }
        byte[] bArr = new byte[size];
        mo25031p(bArr, 0, 0, size);
        return bArr;
    }

    /* JADX INFO: renamed from: y */
    public abstract String mo25052y(String str);

    /* JADX INFO: renamed from: z */
    public String m25053z() {
        try {
            return mo25052y("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C8130u.m31512a("UTF-8 not supported?", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: qa.e$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends OutputStream {

        /* JADX INFO: renamed from: v */
        public static final byte[] f19967v = new byte[0];

        /* JADX INFO: renamed from: q */
        public final int f19968q;

        /* JADX INFO: renamed from: r */
        public final ArrayList f19969r;

        /* JADX INFO: renamed from: s */
        public int f19970s;

        /* JADX INFO: renamed from: t */
        public byte[] f19971t;

        /* JADX INFO: renamed from: u */
        public int f19972u;

        public b(int i10) {
            if (i10 < 0) {
                C9987e.m38645a("Buffer size < 0");
                throw null;
            }
            this.f19968q = i10;
            this.f19969r = new ArrayList();
            this.f19971t = new byte[i10];
        }

        /* JADX INFO: renamed from: c */
        public final byte[] m25054c(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        /* JADX INFO: renamed from: d */
        public final void m25055d(int i10) {
            this.f19969r.add(new C6359p(this.f19971t));
            int length = this.f19970s + this.f19971t.length;
            this.f19970s = length;
            this.f19971t = new byte[Math.max(this.f19968q, Math.max(i10, length >>> 1))];
            this.f19972u = 0;
        }

        /* JADX INFO: renamed from: e */
        public final void m25056e() {
            int i10 = this.f19972u;
            byte[] bArr = this.f19971t;
            if (i10 >= bArr.length) {
                this.f19969r.add(new C6359p(this.f19971t));
                this.f19971t = f19967v;
            } else if (i10 > 0) {
                this.f19969r.add(new C6359p(m25054c(bArr, i10)));
            }
            this.f19970s += this.f19972u;
            this.f19972u = 0;
        }

        /* JADX INFO: renamed from: f */
        public synchronized int m25057f() {
            return this.f19970s + this.f19972u;
        }

        /* JADX INFO: renamed from: h */
        public synchronized AbstractC6348e m25058h() {
            m25056e();
            return AbstractC6348e.m25036d(this.f19969r);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(m25057f()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = this.f19971t;
                int length = bArr2.length;
                int i12 = this.f19972u;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.f19972u += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    m25055d(i13);
                    System.arraycopy(bArr, i10 + length2, this.f19971t, 0, i13);
                    this.f19972u = i13;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            try {
                if (this.f19972u == this.f19971t.length) {
                    m25055d(1);
                }
                byte[] bArr = this.f19971t;
                int i11 = this.f19972u;
                this.f19972u = i11 + 1;
                bArr[i11] = (byte) i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
