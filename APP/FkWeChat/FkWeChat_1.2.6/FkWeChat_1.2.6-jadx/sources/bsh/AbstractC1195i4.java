package bsh;

import java.io.Serializable;

/* JADX INFO: renamed from: bsh.i4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1195i4 implements InterfaceC1188h3, Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: q */
    public C1261t4 f3614q;

    /* JADX INFO: renamed from: r */
    public C1261t4 f3615r;

    /* JADX INFO: renamed from: s */
    public String f3616s;

    /* JADX INFO: renamed from: t */
    public InterfaceC1188h3 f3617t;

    /* JADX INFO: renamed from: u */
    public InterfaceC1188h3[] f3618u;

    /* JADX INFO: renamed from: v */
    public int f3619v;

    /* JADX INFO: renamed from: w */
    public int f3620w = 0;

    /* JADX INFO: renamed from: x */
    public int f3621x = -1;

    public AbstractC1195i4(int i10) {
        this.f3619v = i10;
    }

    @Override // bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: a */
    public String mo4038a() {
        String str = this.f3616s;
        if (str != null) {
            return str;
        }
        InterfaceC1188h3 interfaceC1188h3 = this.f3617t;
        return interfaceC1188h3 != null ? interfaceC1188h3.mo4038a() : "<unknown file>";
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(InterfaceC1188h3 interfaceC1188h3) {
        InterfaceC1188h3[] interfaceC1188h3Arr = new InterfaceC1188h3[mo4050r() + 1];
        System.arraycopy(this.f3618u, 0, interfaceC1188h3Arr, 0, this.f3620w);
        InterfaceC1188h3[] interfaceC1188h3Arr2 = this.f3618u;
        int i10 = this.f3620w;
        System.arraycopy(interfaceC1188h3Arr2, i10, interfaceC1188h3Arr, i10 + 1, (r0 - i10) - 1);
        this.f3618u = interfaceC1188h3Arr;
        int i11 = this.f3620w;
        this.f3620w = i11 + 1;
        interfaceC1188h3Arr[i11] = interfaceC1188h3;
        this.f3621x = -1;
        interfaceC1188h3.mo4046m(this);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC1188h3 next() {
        if (!hasNext()) {
            C1189h4.m4429a();
            return null;
        }
        InterfaceC1188h3[] interfaceC1188h3Arr = this.f3618u;
        int i10 = this.f3620w;
        this.f3620w = i10 + 1;
        this.f3621x = i10;
        return interfaceC1188h3Arr[i10];
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public InterfaceC1188h3 previous() {
        if (!hasPrevious()) {
            C1189h4.m4429a();
            return null;
        }
        InterfaceC1188h3[] interfaceC1188h3Arr = this.f3618u;
        int i10 = this.f3620w - 1;
        this.f3620w = i10;
        this.f3621x = i10;
        return interfaceC1188h3Arr[i10];
    }

    @Override // bsh.InterfaceC1188h3
    public int getLineNumber() {
        return this.f3614q.f3816r;
    }

    @Override // bsh.InterfaceC1188h3
    public String getText() {
        StringBuilder sb2 = new StringBuilder();
        for (C1261t4 c1261t4 = this.f3614q; c1261t4 != null; c1261t4 = c1261t4.f3821w) {
            sb2.append(c1261t4.f3820v);
            if (!c1261t4.f3820v.equals(".")) {
                sb2.append(" ");
            }
            if (c1261t4 == this.f3615r || c1261t4.f3820v.equals("{") || c1261t4.f3820v.equals(";")) {
                break;
            }
        }
        return sb2.toString();
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void set(InterfaceC1188h3 interfaceC1188h3) {
        int i10 = this.f3621x;
        if (i10 < 0) {
            throw new IllegalStateException();
        }
        this.f3618u[i10] = interfaceC1188h3;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f3620w < mo4050r();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f3620w > 0;
    }

    /* JADX INFO: renamed from: i */
    public String mo4044i(String str) {
        return str + toString();
    }

    @Override // bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: j */
    public void mo4045j(InterfaceC1188h3 interfaceC1188h3, int i10) {
        InterfaceC1188h3[] interfaceC1188h3Arr = this.f3618u;
        if (interfaceC1188h3Arr == null) {
            this.f3618u = new InterfaceC1188h3[i10 + 1];
        } else if (i10 >= interfaceC1188h3Arr.length) {
            InterfaceC1188h3[] interfaceC1188h3Arr2 = new InterfaceC1188h3[i10 + 1];
            System.arraycopy(interfaceC1188h3Arr, 0, interfaceC1188h3Arr2, 0, interfaceC1188h3Arr.length);
            this.f3618u = interfaceC1188h3Arr2;
        }
        this.f3618u[i10] = interfaceC1188h3;
    }

    @Override // bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: m */
    public void mo4046m(InterfaceC1188h3 interfaceC1188h3) {
        this.f3617t = interfaceC1188h3;
    }

    @Override // bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: n */
    public void mo4047n(String str) {
        this.f3616s = str;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f3620w;
    }

    @Override // bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        throw new C1211l2("Unimplemented or inappropriate for ".concat(getClass().getName()));
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f3620w - 1;
    }

    @Override // bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: q */
    public InterfaceC1188h3[] mo4049q() {
        if (this.f3618u == null) {
            this.f3618u = new InterfaceC1188h3[0];
        }
        return this.f3618u;
    }

    @Override // bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: r */
    public int mo4050r() {
        return mo4049q().length;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        int i10 = this.f3621x;
        if (i10 < 0) {
            throw new IllegalStateException();
        }
        this.f3620w = i10;
        InterfaceC1188h3[] interfaceC1188h3Arr = this.f3618u;
        int length = interfaceC1188h3Arr.length - 1;
        InterfaceC1188h3[] interfaceC1188h3Arr2 = new InterfaceC1188h3[length];
        System.arraycopy(interfaceC1188h3Arr, 0, interfaceC1188h3Arr2, 0, i10);
        InterfaceC1188h3[] interfaceC1188h3Arr3 = this.f3618u;
        int i11 = this.f3620w;
        System.arraycopy(interfaceC1188h3Arr3, i11 + 1, interfaceC1188h3Arr2, i11, length - i11);
        this.f3618u = interfaceC1188h3Arr2;
        this.f3621x = -1;
    }

    @Override // bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: s */
    public InterfaceC1188h3 mo4051s(int i10) {
        return this.f3618u[i10];
    }

    public String toString() {
        return InterfaceC1242q3.f3785e[this.f3619v];
    }

    @Override // bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: u */
    public void mo4053u(String str) {
        System.out.println(mo4044i(str));
        if (this.f3618u == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            InterfaceC1188h3[] interfaceC1188h3Arr = this.f3618u;
            if (i10 >= interfaceC1188h3Arr.length) {
                return;
            }
            InterfaceC1188h3 interfaceC1188h3 = interfaceC1188h3Arr[i10];
            if (interfaceC1188h3 != null) {
                interfaceC1188h3.mo4053u(str + " ");
            }
            i10++;
        }
    }

    @Override // bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: w */
    public InterfaceC1188h3 mo4054w() {
        return this.f3617t;
    }

    @Override // bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: e */
    public void mo4040e() {
    }

    @Override // bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: t */
    public void mo4052t() {
    }
}
