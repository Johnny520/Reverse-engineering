package p119i1;

import java.util.ArrayList;
import java.util.Iterator;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p172l8.C4700i0;
import p185m8.AbstractC5116y;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6542k;
import sb.AbstractC7284j;
import sb.AbstractC7285k;

/* JADX INFO: renamed from: i1.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3147q implements Iterable, InterfaceC1400a {

    /* JADX INFO: renamed from: u */
    public static final a f8395u = new a(null);

    /* JADX INFO: renamed from: v */
    public static final C3147q f8396v = new C3147q(0, 0, 0, null);

    /* JADX INFO: renamed from: q */
    public final long f8397q;

    /* JADX INFO: renamed from: r */
    public final long f8398r;

    /* JADX INFO: renamed from: s */
    public final long f8399s;

    /* JADX INFO: renamed from: t */
    public final long[] f8400t;

    /* JADX INFO: renamed from: i1.q$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6542k implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public Object f8401r;

        /* JADX INFO: renamed from: s */
        public int f8402s;

        /* JADX INFO: renamed from: t */
        public int f8403t;

        /* JADX INFO: renamed from: u */
        public int f8404u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f8405v;

        public b(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            b bVar = C3147q.this.new b(interfaceC5976f);
            bVar.f8405v = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
        
            if (r15.mo28871x(r4, r20) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
        
            if (r13.mo28871x(r4, r20) == r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:19:0x007c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009a -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b4 -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d2 -> B:43:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f1 -> B:42:0x00f2). Please report as a decompilation issue!!! */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p119i1.C3147q.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC7284j abstractC7284j, InterfaceC5976f interfaceC5976f) {
            return ((b) create(abstractC7284j, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    public C3147q(long j10, long j11, long j12, long[] jArr) {
        this.f8397q = j10;
        this.f8398r = j11;
        this.f8399s = j12;
        this.f8400t = jArr;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return AbstractC7285k.m28874b(new b(null)).iterator();
    }

    /* JADX INFO: renamed from: p */
    public final C3147q m11845p(C3147q c3147q) {
        C3147q c3147qM11846q;
        C3147q c3147q2 = f8396v;
        if (c3147q == c3147q2) {
            return this;
        }
        if (this == c3147q2) {
            return c3147q2;
        }
        long j10 = c3147q.f8399s;
        long j11 = this.f8399s;
        if (j10 == j11) {
            long[] jArr = c3147q.f8400t;
            long[] jArr2 = this.f8400t;
            if (jArr == jArr2) {
                return new C3147q((~c3147q.f8397q) & this.f8397q, (~c3147q.f8398r) & this.f8398r, j11, jArr2);
            }
        }
        long[] jArr3 = c3147q.f8400t;
        if (jArr3 != null) {
            c3147qM11846q = this;
            for (long j12 : jArr3) {
                c3147qM11846q = c3147qM11846q.m11846q(j12);
            }
        } else {
            c3147qM11846q = this;
        }
        if (c3147q.f8398r != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((c3147q.f8398r & (1 << i10)) != 0) {
                    c3147qM11846q = c3147qM11846q.m11846q(c3147q.f8399s + ((long) i10));
                }
            }
        }
        if (c3147q.f8397q != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((c3147q.f8397q & (1 << i11)) != 0) {
                    c3147qM11846q = c3147qM11846q.m11846q(c3147q.f8399s + ((long) i11) + ((long) 64));
                }
            }
        }
        return c3147qM11846q;
    }

    /* JADX INFO: renamed from: q */
    public final C3147q m11846q(long j10) {
        long[] jArr;
        int iM11859a;
        long j11 = j10 - this.f8399s;
        long j12 = 0;
        if (AbstractC1061t.m3844e(j11, j12) >= 0 && AbstractC1061t.m3844e(j11, 64) < 0) {
            long j13 = 1 << ((int) j11);
            long j14 = this.f8398r;
            if ((j14 & j13) != 0) {
                return new C3147q(this.f8397q, j14 & (~j13), this.f8399s, this.f8400t);
            }
        } else if (AbstractC1061t.m3844e(j11, 64) >= 0 && AbstractC1061t.m3844e(j11, 128) < 0) {
            long j15 = 1 << (((int) j11) - 64);
            long j16 = this.f8397q;
            if ((j16 & j15) != 0) {
                return new C3147q(j16 & (~j15), this.f8398r, this.f8399s, this.f8400t);
            }
        } else if (AbstractC1061t.m3844e(j11, j12) < 0 && (jArr = this.f8400t) != null && (iM11859a = AbstractC3149r.m11859a(jArr, j10)) >= 0) {
            return new C3147q(this.f8397q, this.f8398r, this.f8399s, AbstractC3149r.m11863e(jArr, iM11859a));
        }
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m11847r(long j10) {
        long[] jArr;
        long j11 = j10 - this.f8399s;
        long j12 = 0;
        return (AbstractC1061t.m3844e(j11, j12) < 0 || AbstractC1061t.m3844e(j11, (long) 64) >= 0) ? (AbstractC1061t.m3844e(j11, (long) 64) < 0 || AbstractC1061t.m3844e(j11, (long) 128) >= 0) ? AbstractC1061t.m3844e(j11, j12) <= 0 && (jArr = this.f8400t) != null && AbstractC3149r.m11859a(jArr, j10) >= 0 : ((1 << (((int) j11) - 64)) & this.f8397q) != 0 : ((1 << ((int) j11)) & this.f8398r) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final long m11848s(long j10) {
        long[] jArr = this.f8400t;
        if (jArr != null) {
            return jArr[0];
        }
        long j11 = this.f8398r;
        if (j11 != 0) {
            return this.f8399s + ((long) Long.numberOfTrailingZeros(j11));
        }
        long j12 = this.f8397q;
        return j12 != 0 ? this.f8399s + ((long) 64) + ((long) Long.numberOfTrailingZeros(j12)) : j10;
    }

    /* JADX INFO: renamed from: t */
    public final C3147q m11849t(C3147q c3147q) {
        C3147q c3147qM11850u;
        C3147q c3147q2 = f8396v;
        if (c3147q == c3147q2) {
            return this;
        }
        if (this == c3147q2) {
            return c3147q;
        }
        long j10 = c3147q.f8399s;
        long j11 = this.f8399s;
        if (j10 == j11) {
            long[] jArr = c3147q.f8400t;
            long[] jArr2 = this.f8400t;
            if (jArr == jArr2) {
                return new C3147q(c3147q.f8397q | this.f8397q, c3147q.f8398r | this.f8398r, j11, jArr2);
            }
        }
        int i10 = 0;
        if (this.f8400t == null) {
            long[] jArr3 = this.f8400t;
            if (jArr3 != null) {
                for (long j12 : jArr3) {
                    c3147q = c3147q.m11850u(j12);
                }
            }
            if (this.f8398r != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if ((this.f8398r & (1 << i11)) != 0) {
                        c3147q = c3147q.m11850u(this.f8399s + ((long) i11));
                    }
                }
            }
            if (this.f8397q != 0) {
                while (i10 < 64) {
                    if ((this.f8397q & (1 << i10)) != 0) {
                        c3147q = c3147q.m11850u(this.f8399s + ((long) i10) + ((long) 64));
                    }
                    i10++;
                }
            }
            return c3147q;
        }
        long[] jArr4 = c3147q.f8400t;
        if (jArr4 != null) {
            c3147qM11850u = this;
            for (long j13 : jArr4) {
                c3147qM11850u = c3147qM11850u.m11850u(j13);
            }
        } else {
            c3147qM11850u = this;
        }
        if (c3147q.f8398r != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((c3147q.f8398r & (1 << i12)) != 0) {
                    c3147qM11850u = c3147qM11850u.m11850u(c3147q.f8399s + ((long) i12));
                }
            }
        }
        if (c3147q.f8397q != 0) {
            while (i10 < 64) {
                if ((c3147q.f8397q & (1 << i10)) != 0) {
                    c3147qM11850u = c3147qM11850u.m11850u(c3147q.f8399s + ((long) i10) + ((long) 64));
                }
                i10++;
            }
        }
        return c3147qM11850u;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        sb2.append(AbstractC3118c.m11688d(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public final C3147q m11850u(long j10) {
        long j11;
        long j12;
        long[] jArrM11838b;
        long j13 = j10 - this.f8399s;
        long j14 = 0;
        if (AbstractC1061t.m3844e(j13, j14) < 0 || AbstractC1061t.m3844e(j13, 64) >= 0) {
            long j15 = 64;
            if (AbstractC1061t.m3844e(j13, j15) < 0 || AbstractC1061t.m3844e(j13, 128) >= 0) {
                long j16 = 128;
                if (AbstractC1061t.m3844e(j13, j16) < 0) {
                    long[] jArr = this.f8400t;
                    if (jArr == null) {
                        return new C3147q(this.f8397q, this.f8398r, this.f8399s, new long[]{j10});
                    }
                    int iM11859a = AbstractC3149r.m11859a(jArr, j10);
                    if (iM11859a < 0) {
                        return new C3147q(this.f8397q, this.f8398r, this.f8399s, AbstractC3149r.m11862d(jArr, -(iM11859a + 1), j10));
                    }
                } else if (!m11847r(j10)) {
                    long j17 = this.f8397q;
                    long j18 = this.f8398r;
                    long j19 = this.f8399s;
                    long j20 = 1;
                    long j21 = ((j10 + j20) / j15) * j15;
                    if (AbstractC1061t.m3844e(j21, j14) < 0) {
                        j21 = (Long.MAX_VALUE - j16) + j20;
                    }
                    C3145p c3145p = null;
                    long j22 = j17;
                    while (true) {
                        if (AbstractC1061t.m3844e(j19, j21) >= 0) {
                            j11 = j18;
                            j12 = j19;
                            break;
                        }
                        if (j18 != 0) {
                            if (c3145p == null) {
                                c3145p = new C3145p(this.f8400t);
                            }
                            int i10 = 0;
                            while (i10 < 64) {
                                long j23 = j18;
                                if ((j18 & (1 << i10)) != 0) {
                                    c3145p.m11837a(((long) i10) + j19);
                                }
                                i10++;
                                j18 = j23;
                            }
                        }
                        if (j22 == 0) {
                            j12 = j21;
                            j11 = 0;
                            break;
                        }
                        j19 += j15;
                        j18 = j22;
                        j22 = 0;
                    }
                    if (c3145p == null || (jArrM11838b = c3145p.m11838b()) == null) {
                        jArrM11838b = this.f8400t;
                    }
                    return new C3147q(j22, j11, j12, jArrM11838b).m11850u(j10);
                }
            } else {
                long j24 = 1 << (((int) j13) - 64);
                long j25 = this.f8397q;
                if ((j25 & j24) == 0) {
                    return new C3147q(j25 | j24, this.f8398r, this.f8399s, this.f8400t);
                }
            }
        } else {
            long j26 = 1 << ((int) j13);
            long j27 = this.f8398r;
            if ((j27 & j26) == 0) {
                return new C3147q(this.f8397q, j27 | j26, this.f8399s, this.f8400t);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: i1.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3147q m11851a() {
            return C3147q.f8396v;
        }

        public a() {
        }
    }
}
