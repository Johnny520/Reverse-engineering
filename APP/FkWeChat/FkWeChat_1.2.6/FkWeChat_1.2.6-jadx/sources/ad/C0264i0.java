package ad;

import java.util.Arrays;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5102r;
import p329wc.AbstractC9225m;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: ad.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0264i0 {

    /* JADX INFO: renamed from: a */
    public Object[] f646a = new Object[8];

    /* JADX INFO: renamed from: b */
    public int[] f647b;

    /* JADX INFO: renamed from: c */
    public int f648c;

    /* JADX INFO: renamed from: ad.i0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f649a = new a();
    }

    public C0264i0() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.f647b = iArr;
        this.f648c = -1;
    }

    /* JADX INFO: renamed from: a */
    public final String m775a() {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = this.f648c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f646a[i11];
            if (obj instanceof InterfaceC9218f) {
                InterfaceC9218f interfaceC9218f = (InterfaceC9218f) obj;
                boolean zM3842c = AbstractC1061t.m3842c(interfaceC9218f.mo35896j(), AbstractC9225m.b.f31487a);
                int[] iArr = this.f647b;
                if (!zM3842c) {
                    int i12 = iArr[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(interfaceC9218f.mo35892f(i12));
                    }
                } else if (iArr[i11] != -1) {
                    sb2.append("[");
                    sb2.append(this.f647b[i11]);
                    sb2.append("]");
                }
            } else if (obj != a.f649a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public final void m776b() {
        int i10 = this.f648c;
        int[] iArr = this.f647b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.f648c = i10 - 1;
        }
        int i11 = this.f648c;
        if (i11 != -1) {
            this.f648c = i11 - 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m777c(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        int i10 = this.f648c + 1;
        this.f648c = i10;
        if (i10 == this.f646a.length) {
            m779e();
        }
        this.f646a[i10] = interfaceC9218f;
    }

    /* JADX INFO: renamed from: d */
    public final void m778d() {
        int[] iArr = this.f647b;
        int i10 = this.f648c;
        if (iArr[i10] == -2) {
            this.f646a[i10] = a.f649a;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m779e() {
        int i10 = this.f648c * 2;
        this.f646a = Arrays.copyOf(this.f646a, i10);
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = -1;
        }
        AbstractC5102r.m20663o(this.f647b, iArr, 0, 0, 0, 14, null);
        this.f647b = iArr;
    }

    /* JADX INFO: renamed from: f */
    public final void m780f(Object obj) {
        int[] iArr = this.f647b;
        int i10 = this.f648c;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.f648c = i11;
            if (i11 == this.f646a.length) {
                m779e();
            }
        }
        Object[] objArr = this.f646a;
        int i12 = this.f648c;
        objArr[i12] = obj;
        this.f647b[i12] = -2;
    }

    /* JADX INFO: renamed from: g */
    public final void m781g(int i10) {
        this.f647b[this.f648c] = i10;
    }

    public String toString() {
        return m775a();
    }
}
