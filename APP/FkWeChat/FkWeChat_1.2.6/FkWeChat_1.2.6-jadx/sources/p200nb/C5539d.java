package p200nb;

import java.util.Arrays;
import java.util.Iterator;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5069c;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: nb.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5539d extends AbstractC5538c {

    /* JADX INFO: renamed from: s */
    public static final a f17313s = new a(null);

    /* JADX INFO: renamed from: q */
    public Object[] f17314q;

    /* JADX INFO: renamed from: r */
    public int f17315r;

    /* JADX INFO: renamed from: nb.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC5069c {

        /* JADX INFO: renamed from: s */
        public int f17316s = -1;

        public b() {
        }

        @Override // p185m8.AbstractC5069c
        /* JADX INFO: renamed from: g */
        public void mo20488g() {
            do {
                int i10 = this.f17316s + 1;
                this.f17316s = i10;
                if (i10 >= C5539d.this.f17314q.length) {
                    break;
                }
            } while (C5539d.this.f17314q[this.f17316s] == null);
            if (this.f17316s >= C5539d.this.f17314q.length) {
                m20489l();
                return;
            }
            Object obj = C5539d.this.f17314q[this.f17316s];
            obj.getClass();
            m20490o(obj);
        }
    }

    public C5539d(Object[] objArr, int i10) {
        super(null);
        this.f17314q = objArr;
        this.f17315r = i10;
    }

    /* JADX INFO: renamed from: l */
    private final void m22569l(int i10) {
        Object[] objArr = this.f17314q;
        if (objArr.length > i10) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i10);
        this.f17314q = Arrays.copyOf(this.f17314q, length);
    }

    @Override // p200nb.AbstractC5538c
    /* JADX INFO: renamed from: a */
    public int mo22566a() {
        return this.f17315r;
    }

    @Override // p200nb.AbstractC5538c
    /* JADX INFO: renamed from: c */
    public void mo22567c(int i10, Object obj) {
        obj.getClass();
        m22569l(i10);
        if (this.f17314q[i10] == null) {
            this.f17315r = mo22566a() + 1;
        }
        this.f17314q[i10] = obj;
    }

    @Override // p200nb.AbstractC5538c
    public Object get(int i10) {
        return AbstractC5106t.m20736h0(this.f17314q, i10);
    }

    @Override // p200nb.AbstractC5538c, java.lang.Iterable
    public Iterator iterator() {
        return new b();
    }

    /* JADX INFO: renamed from: nb.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    public C5539d() {
        this(new Object[20], 0);
    }
}
