package p299ub;

import bsh.C1189h4;
import java.util.Iterator;
import p010a9.InterfaceC0188p;
import p036c9.InterfaceC1400a;
import p080f9.AbstractC2368o;
import p080f9.C2363j;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: ub.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8616d implements InterfaceC7282h {

    /* JADX INFO: renamed from: a */
    public final CharSequence f28662a;

    /* JADX INFO: renamed from: b */
    public final int f28663b;

    /* JADX INFO: renamed from: c */
    public final int f28664c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0188p f28665d;

    /* JADX INFO: renamed from: ub.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public int f28666q = -1;

        /* JADX INFO: renamed from: r */
        public int f28667r;

        /* JADX INFO: renamed from: s */
        public int f28668s;

        /* JADX INFO: renamed from: t */
        public C2363j f28669t;

        /* JADX INFO: renamed from: u */
        public int f28670u;

        public a() {
            int iM8586m = AbstractC2368o.m8586m(C8616d.this.f28663b, 0, C8616d.this.f28662a.length());
            this.f28667r = iM8586m;
            this.f28668s = iM8586m;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX INFO: renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void m33089g() {
            /*
                r6 = this;
                int r0 = r6.f28668s
                r1 = 0
                if (r0 >= 0) goto Lb
                r6.f28666q = r1
                r0 = 0
                r6.f28669t = r0
                return
            Lb:
                ub.d r0 = p299ub.C8616d.this
                int r0 = p299ub.C8616d.m33087d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L22
                int r0 = r6.f28670u
                int r0 = r0 + r3
                r6.f28670u = r0
                ub.d r4 = p299ub.C8616d.this
                int r4 = p299ub.C8616d.m33087d(r4)
                if (r0 >= r4) goto L30
            L22:
                int r0 = r6.f28668s
                ub.d r4 = p299ub.C8616d.this
                java.lang.CharSequence r4 = p299ub.C8616d.m33086c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L46
            L30:
                f9.j r0 = new f9.j
                int r1 = r6.f28667r
                ub.d r4 = p299ub.C8616d.this
                java.lang.CharSequence r4 = p299ub.C8616d.m33086c(r4)
                int r4 = p299ub.AbstractC8621f0.m33140h0(r4)
                r0.<init>(r1, r4)
                r6.f28669t = r0
                r6.f28668s = r2
                goto L9b
            L46:
                ub.d r0 = p299ub.C8616d.this
                a9.p r0 = p299ub.C8616d.m33085b(r0)
                ub.d r4 = p299ub.C8616d.this
                java.lang.CharSequence r4 = p299ub.C8616d.m33086c(r4)
                int r5 = r6.f28668s
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                l8.r r0 = (p172l8.C4711r) r0
                if (r0 != 0) goto L76
                f9.j r0 = new f9.j
                int r1 = r6.f28667r
                ub.d r4 = p299ub.C8616d.this
                java.lang.CharSequence r4 = p299ub.C8616d.m33086c(r4)
                int r4 = p299ub.AbstractC8621f0.m33140h0(r4)
                r0.<init>(r1, r4)
                r6.f28669t = r0
                r6.f28668s = r2
                goto L9b
            L76:
                java.lang.Object r2 = r0.m18792a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m18793b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f28667r
                f9.j r4 = p080f9.AbstractC2368o.m8592s(r4, r2)
                r6.f28669t = r4
                int r2 = r2 + r0
                r6.f28667r = r2
                if (r0 != 0) goto L98
                r1 = r3
            L98:
                int r2 = r2 + r1
                r6.f28668s = r2
            L9b:
                r6.f28666q = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p299ub.C8616d.a.m33089g():void");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f28666q == -1) {
                m33089g();
            }
            return this.f28666q == 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public C2363j next() {
            if (this.f28666q == -1) {
                m33089g();
            }
            if (this.f28666q == 0) {
                C1189h4.m4429a();
                return null;
            }
            C2363j c2363j = this.f28669t;
            c2363j.getClass();
            this.f28669t = null;
            this.f28666q = -1;
            return c2363j;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8616d(CharSequence charSequence, int i10, int i11, InterfaceC0188p interfaceC0188p) {
        charSequence.getClass();
        interfaceC0188p.getClass();
        this.f28662a = charSequence;
        this.f28663b = i10;
        this.f28664c = i11;
        this.f28665d = interfaceC0188p;
    }

    @Override // sb.InterfaceC7282h
    public Iterator iterator() {
        return new a();
    }
}
