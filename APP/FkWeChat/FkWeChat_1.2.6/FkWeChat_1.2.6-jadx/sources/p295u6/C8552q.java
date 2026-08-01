package p295u6;

import java.io.IOException;
import java.util.Iterator;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0188p;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6542k;
import p310v6.AbstractC8848i;
import p310v6.C8843d;
import p376zd.C9987e;
import sb.AbstractC7284j;
import sb.AbstractC7285k;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: u6.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8552q {

    /* JADX INFO: renamed from: a */
    public final C8843d f28537a;

    /* JADX INFO: renamed from: b */
    public int f28538b;

    /* JADX INFO: renamed from: c */
    public int f28539c;

    /* JADX INFO: renamed from: d */
    public C8550o f28540d;

    /* JADX INFO: renamed from: u6.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6542k implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public int f28541r;

        /* JADX INFO: renamed from: s */
        public int f28542s;

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f28543t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f28545v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f28545v = str;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = C8552q.this.new a(this.f28545v, interfaceC5976f);
            aVar.f28543t = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        
            r8 = r6.m32917n(r5);
            r7.f28543t = r4;
            r7.f28541r = r1;
            r7.f28542s = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
        
            if (r4.mo28871x(r8, r7) != r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0088 A[EDGE_INSN: B:27:0x0088->B:24:0x0088 BREAK  A[LOOP:0: B:13:0x0044->B:23:0x0080], SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006c -> B:20:0x006f). Please report as a decompilation issue!!! */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                int r1 = r7.f28542s
                r2 = -1
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 != r3) goto L16
                int r1 = r7.f28541r
                java.lang.Object r4 = r7.f28543t
                sb.j r4 = (sb.AbstractC7284j) r4
                p172l8.AbstractC4713t.m18808b(r8)
                goto L6f
            L16:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r8)
                r8 = 0
                return r8
            L1d:
                p172l8.AbstractC4713t.m18808b(r8)
                java.lang.Object r8 = r7.f28543t
                sb.j r8 = (sb.AbstractC7284j) r8
                u6.q r1 = p295u6.C8552q.this
                int r1 = r1.m32909f()
                if (r1 != 0) goto L2f
                l8.i0 r8 = p172l8.C4700i0.f13910a
                return r8
            L2f:
                java.lang.String r1 = r7.f28545v
                r4 = 3
                r5 = 0
                r6 = 0
                int r1 = p310v6.AbstractC8848i.m33977g(r1, r6, r6, r4, r5)
                int r1 = java.lang.Math.abs(r1)
                u6.q r4 = p295u6.C8552q.this
                int r4 = p295u6.C8552q.m32904a(r4)
                int r1 = r1 % r4
                r4 = r8
            L44:
                u6.q r8 = p295u6.C8552q.this
                u6.o r8 = p295u6.C8552q.m32905b(r8)
                int r5 = r1 * 6
                int r8 = r8.m32894c(r5)
                if (r8 == r2) goto L88
                u6.q r8 = p295u6.C8552q.this
                java.lang.String r6 = r7.f28545v
                boolean r8 = p295u6.C8552q.m32906c(r8, r6, r5)
                u6.q r6 = p295u6.C8552q.this
                if (r8 == 0) goto L80
                java.lang.CharSequence r8 = r6.m32917n(r5)
                r7.f28543t = r4
                r7.f28541r = r1
                r7.f28542s = r3
                java.lang.Object r8 = r4.mo28871x(r8, r7)
                if (r8 != r0) goto L6f
                return r0
            L6f:
                u6.q r8 = p295u6.C8552q.this
                u6.o r8 = p295u6.C8552q.m32905b(r8)
                int r1 = r1 * 6
                int r1 = r1 + 5
                int r1 = r8.m32894c(r1)
                if (r1 == r2) goto L88
                goto L44
            L80:
                int r1 = r1 + 1
                int r8 = p295u6.C8552q.m32904a(r6)
                int r1 = r1 % r8
                goto L44
            L88:
                l8.i0 r8 = p172l8.C4700i0.f13910a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p295u6.C8552q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC7284j abstractC7284j, InterfaceC5976f interfaceC5976f) {
            return ((a) create(abstractC7284j, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    public C8552q(C8843d c8843d) {
        c8843d.getClass();
        this.f28537a = c8843d;
        this.f28540d = (C8550o) AbstractC8553r.f28547b.mo9064B();
    }

    /* JADX INFO: renamed from: d */
    public final CharSequence m32907d(String str) {
        str.getClass();
        if (this.f28538b == 0) {
            return null;
        }
        int iAbs = Math.abs(AbstractC8848i.m33977g(str, 0, 0, 3, null));
        int i10 = this.f28539c;
        while (true) {
            int i11 = iAbs % i10;
            int i12 = i11 * 6;
            if (this.f28540d.m32894c(i12) == -1) {
                return null;
            }
            if (m32910g(str, i12)) {
                return m32917n(i12);
            }
            iAbs = i11 + 1;
            i10 = this.f28539c;
        }
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC7282h m32908e(String str) {
        str.getClass();
        return AbstractC7285k.m28874b(new a(str, null));
    }

    /* JADX INFO: renamed from: f */
    public final int m32909f() {
        return this.f28538b;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m32910g(CharSequence charSequence, int i10) {
        return AbstractC8848i.m33973c(this.f28537a, this.f28540d.m32894c(i10 + 1), this.f28540d.m32894c(i10 + 2), charSequence);
    }

    /* JADX INFO: renamed from: h */
    public final CharSequence m32911h(int i10) {
        return this.f28537a.subSequence(this.f28540d.m32894c(i10 + 1), this.f28540d.m32894c(i10 + 2));
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC7282h m32912i() {
        return this.f28540d.m32895d();
    }

    /* JADX INFO: renamed from: j */
    public final void m32913j(int i10, int i11, int i12, int i13) {
        int i14;
        if (m32916m()) {
            m32915l();
        }
        int iAbs = Math.abs(AbstractC8848i.m33976f(this.f28537a, i10, i11));
        CharSequence charSequenceSubSequence = this.f28537a.subSequence(i10, i11);
        int i15 = iAbs % this.f28539c;
        int i16 = -1;
        while (true) {
            i14 = i15 * 6;
            if (this.f28540d.m32894c(i14) == -1) {
                break;
            }
            if (m32910g(charSequenceSubSequence, i14)) {
                i16 = i15;
            }
            i15 = (i15 + 1) % this.f28539c;
        }
        this.f28540d.m32898g(i14, iAbs);
        this.f28540d.m32898g(i14 + 1, i10);
        this.f28540d.m32898g(i14 + 2, i11);
        this.f28540d.m32898g(i14 + 3, i12);
        this.f28540d.m32898g(i14 + 4, i13);
        this.f28540d.m32898g(i14 + 5, -1);
        if (i16 != -1) {
            this.f28540d.m32898g((i16 * 6) + 5, i15);
        }
        this.f28538b++;
    }

    /* JADX INFO: renamed from: k */
    public final void m32914k() {
        this.f28538b = 0;
        this.f28539c = 0;
        AbstractC8553r.f28547b.mo9065C0(this.f28540d);
        this.f28540d = (C8550o) AbstractC8553r.f28547b.mo9064B();
    }

    /* JADX INFO: renamed from: l */
    public final void m32915l() {
        int i10 = this.f28538b;
        C8550o c8550o = this.f28540d;
        this.f28538b = 0;
        this.f28539c = (this.f28539c * 2) | 128;
        C8550o c8550o2 = (C8550o) AbstractC8553r.f28547b.mo9064B();
        c8550o2.m32896e((c8550o.m32893b() * 2) | 1);
        this.f28540d = c8550o2;
        Iterator it = c8550o.m32895d().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            m32913j(c8550o.m32894c(iIntValue + 1), c8550o.m32894c(iIntValue + 2), c8550o.m32894c(iIntValue + 3), c8550o.m32894c(iIntValue + 4));
        }
        AbstractC8553r.f28547b.mo9065C0(c8550o);
        if (i10 == this.f28538b) {
            return;
        }
        C9987e.m38645a("Failed requirement.");
    }

    /* JADX INFO: renamed from: m */
    public final boolean m32916m() {
        return ((double) this.f28538b) >= ((double) this.f28539c) * 0.75d;
    }

    /* JADX INFO: renamed from: n */
    public final CharSequence m32917n(int i10) {
        return this.f28537a.subSequence(this.f28540d.m32894c(i10 + 3), this.f28540d.m32894c(i10 + 4));
    }

    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        AbstractC8553r.m32921c(this, _UrlKt.FRAGMENT_ENCODE_SET, sb2);
        return sb2.toString();
    }
}
