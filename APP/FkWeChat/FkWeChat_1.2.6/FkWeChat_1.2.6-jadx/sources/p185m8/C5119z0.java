package p185m8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import p080f9.AbstractC2368o;
import p376zd.C10010p0;
import p376zd.C10028y0;
import p376zd.C10030z0;

/* JADX INFO: renamed from: m8.z0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5119z0 extends AbstractC5078f implements RandomAccess {

    /* JADX INFO: renamed from: r */
    public final Object[] f15425r;

    /* JADX INFO: renamed from: s */
    public final int f15426s;

    /* JADX INFO: renamed from: t */
    public int f15427t;

    /* JADX INFO: renamed from: u */
    public int f15428u;

    /* JADX INFO: renamed from: m8.z0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC5069c {

        /* JADX INFO: renamed from: s */
        public int f15429s;

        /* JADX INFO: renamed from: t */
        public int f15430t;

        public a() {
            this.f15429s = C5119z0.this.size();
            this.f15430t = C5119z0.this.f15427t;
        }

        @Override // p185m8.AbstractC5069c
        /* JADX INFO: renamed from: g */
        public void mo20488g() {
            if (this.f15429s == 0) {
                m20489l();
                return;
            }
            m20490o(C5119z0.this.f15425r[this.f15430t]);
            this.f15430t = (this.f15430t + 1) % C5119z0.this.f15426s;
            this.f15429s--;
        }
    }

    public C5119z0(Object[] objArr, int i10) {
        objArr.getClass();
        this.f15425r = objArr;
        if (i10 < 0) {
            C10030z0.m38853a("ring buffer filled size should not be negative but it is ", i10);
            throw null;
        }
        if (i10 > objArr.length) {
            C10028y0.m38849a("ring buffer filled size: ", i10, " cannot be larger than the buffer size: ", objArr.length);
            throw null;
        }
        this.f15426s = objArr.length;
        this.f15428u = i10;
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f15428u;
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public Object get(int i10) {
        AbstractC5078f.f15387q.m20521b(i10, size());
        return this.f15425r[(this.f15427t + i10) % this.f15426s];
    }

    @Override // p185m8.AbstractC5078f, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new a();
    }

    /* JADX INFO: renamed from: p */
    public final void m20819p(Object obj) {
        if (m20821r()) {
            C10010p0.m38820a("ring buffer is full");
        } else {
            this.f15425r[(this.f15427t + size()) % this.f15426s] = obj;
            this.f15428u = size() + 1;
        }
    }

    /* JADX INFO: renamed from: q */
    public final C5119z0 m20820q(int i10) {
        int i11 = this.f15426s;
        int iM8582i = AbstractC2368o.m8582i(i11 + (i11 >> 1) + 1, i10);
        return new C5119z0(this.f15427t == 0 ? Arrays.copyOf(this.f15425r, iM8582i) : toArray(new Object[iM8582i]), size());
    }

    /* JADX INFO: renamed from: r */
    public final boolean m20821r() {
        return size() == this.f15426s;
    }

    /* JADX INFO: renamed from: s */
    public final void m20822s(int i10) {
        if (i10 < 0) {
            C10030z0.m38853a("n shouldn't be negative but it is ", i10);
            return;
        }
        if (i10 > size()) {
            C10028y0.m38849a("n shouldn't be greater than the buffer size: n = ", i10, ", size = ", size());
            return;
        }
        if (i10 > 0) {
            int i11 = this.f15427t;
            int i12 = (i11 + i10) % this.f15426s;
            Object[] objArr = this.f15425r;
            if (i11 > i12) {
                AbstractC5102r.m20672x(objArr, null, i11, this.f15426s);
                AbstractC5102r.m20672x(this.f15425r, null, 0, i12);
            } else {
                AbstractC5102r.m20672x(objArr, null, i11, i12);
            }
            this.f15427t = i12;
            this.f15428u = size() - i10;
        }
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        objArr.getClass();
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f15427t; i11 < size && i12 < this.f15426s; i12++) {
            objArr[i11] = this.f15425r[i12];
            i11++;
        }
        while (i11 < size) {
            objArr[i11] = this.f15425r[i10];
            i11++;
            i10++;
        }
        return AbstractC5112w.m20791g(size, objArr);
    }

    public C5119z0(int i10) {
        this(new Object[i10], 0);
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
