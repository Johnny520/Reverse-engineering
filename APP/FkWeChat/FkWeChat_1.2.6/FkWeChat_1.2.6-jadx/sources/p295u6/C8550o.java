package p295u6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p010a9.InterfaceC0188p;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6542k;
import sb.AbstractC7284j;
import sb.AbstractC7285k;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: u6.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8550o {

    /* JADX INFO: renamed from: a */
    public List f28529a = new ArrayList();

    /* JADX INFO: renamed from: u6.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6542k implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public Object f28530r;

        /* JADX INFO: renamed from: s */
        public Object f28531s;

        /* JADX INFO: renamed from: t */
        public int f28532t;

        /* JADX INFO: renamed from: u */
        public int f28533u;

        /* JADX INFO: renamed from: v */
        public int f28534v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f28535w;

        public a(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = C8550o.this.new a(interfaceC5976f);
            aVar.f28535w = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003f -> B:12:0x0049). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0053 -> B:21:0x0076). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006c -> B:20:0x0071). Please report as a decompilation issue!!! */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                int r1 = r9.f28534v
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 != r3) goto L20
                int r1 = r9.f28533u
                int r4 = r9.f28532t
                java.lang.Object r5 = r9.f28531s
                int[] r5 = (int[]) r5
                java.lang.Object r6 = r9.f28530r
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r9.f28535w
                sb.j r7 = (sb.AbstractC7284j) r7
                p172l8.AbstractC4713t.m18808b(r10)
                goto L71
            L20:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r10)
                r10 = 0
                return r10
            L27:
                p172l8.AbstractC4713t.m18808b(r10)
                java.lang.Object r10 = r9.f28535w
                sb.j r10 = (sb.AbstractC7284j) r10
                u6.o r1 = p295u6.C8550o.this
                java.util.List r1 = p295u6.C8550o.m32892a(r1)
                java.util.Iterator r1 = r1.iterator()
                r4 = r2
            L39:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L7e
                java.lang.Object r5 = r1.next()
                int[] r5 = (int[]) r5
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r2
            L49:
                int r7 = r6.length
                if (r1 >= r7) goto L7b
                u6.o r7 = p295u6.C8550o.this
                int r7 = r7.m32894c(r5)
                r8 = -1
                if (r7 == r8) goto L76
                java.lang.Integer r7 = p257r8.AbstractC6533b.m25848d(r5)
                r9.f28535w = r10
                r9.f28530r = r4
                r9.f28531s = r6
                r9.f28532t = r5
                r9.f28533u = r1
                r9.f28534v = r3
                java.lang.Object r7 = r10.mo28871x(r7, r9)
                if (r7 != r0) goto L6c
                return r0
            L6c:
                r7 = r6
                r6 = r4
                r4 = r5
                r5 = r7
                r7 = r10
            L71:
                r10 = r5
                r5 = r4
                r4 = r6
                r6 = r10
                r10 = r7
            L76:
                int r1 = r1 + 6
                int r5 = r5 + 6
                goto L49
            L7b:
                r1 = r4
                r4 = r5
                goto L39
            L7e:
                l8.i0 r10 = p172l8.C4700i0.f13910a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p295u6.C8550o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC7284j abstractC7284j, InterfaceC5976f interfaceC5976f) {
            return ((a) create(abstractC7284j, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m32893b() {
        return this.f28529a.size();
    }

    /* JADX INFO: renamed from: c */
    public final int m32894c(int i10) {
        return ((int[]) this.f28529a.get(i10 / 768))[i10 % 768];
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC7282h m32895d() {
        return AbstractC7285k.m28874b(new a(null));
    }

    /* JADX INFO: renamed from: e */
    public final void m32896e(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f28529a.add(AbstractC8553r.f28546a.mo9064B());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m32897f() {
        Iterator it = this.f28529a.iterator();
        while (it.hasNext()) {
            AbstractC8553r.f28546a.mo9065C0((int[]) it.next());
        }
        this.f28529a.clear();
    }

    /* JADX INFO: renamed from: g */
    public final void m32898g(int i10, int i11) {
        ((int[]) this.f28529a.get(i10 / 768))[i10 % 768] = i11;
    }
}
