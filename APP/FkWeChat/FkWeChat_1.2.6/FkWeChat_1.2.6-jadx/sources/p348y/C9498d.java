package p348y;

import p228p8.InterfaceC5976f;
import p250r1.C6457g;
import p257r8.AbstractC6535d;
import p349y0.C9508c;

/* JADX INFO: renamed from: y.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9498d implements InterfaceC9495a {

    /* JADX INFO: renamed from: a */
    public final C9508c f32265a = new C9508c(new C9502h[16], 0);

    /* JADX INFO: renamed from: y.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f32266q;

        /* JADX INFO: renamed from: r */
        public Object f32267r;

        /* JADX INFO: renamed from: s */
        public int f32268s;

        /* JADX INFO: renamed from: t */
        public int f32269t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f32270u;

        /* JADX INFO: renamed from: w */
        public int f32272w;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f32270u = obj;
            this.f32272w |= Integer.MIN_VALUE;
            return C9498d.this.mo36993a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0068 -> B:19:0x006b). Please report as a decompilation issue!!! */
    @Override // p348y.InterfaceC9495a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo36993a(p250r1.C6457g r9, p228p8.InterfaceC5976f r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p348y.C9498d.a
            if (r0 == 0) goto L13
            r0 = r10
            y.d$a r0 = (p348y.C9498d.a) r0
            int r1 = r0.f32272w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32272w = r1
            goto L18
        L13:
            y.d$a r0 = new y.d$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f32270u
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f32272w
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L36
            int r9 = r0.f32269t
            int r2 = r0.f32268s
            java.lang.Object r4 = r0.f32267r
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f32266q
            r1.g r5 = (p250r1.C6457g) r5
            p172l8.AbstractC4713t.m18808b(r10)
            r10 = r5
            goto L6b
        L36:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r9)
            r9 = 0
            return r9
        L3d:
            p172l8.AbstractC4713t.m18808b(r10)
            y0.c r10 = r8.f32265a
            java.lang.Object[] r2 = r10.f32299q
            int r10 = r10.m37039l()
            r4 = 0
            r7 = r10
            r10 = r9
            r9 = r7
            r7 = r4
            r4 = r2
            r2 = r7
        L4f:
            if (r2 >= r9) goto L6d
            r5 = r4[r2]
            y.h r5 = (p348y.C9502h) r5
            y.c r6 = new y.c
            r6.<init>()
            r0.f32266q = r10
            r0.f32267r = r4
            r0.f32268s = r2
            r0.f32269t = r9
            r0.f32272w = r3
            java.lang.Object r5 = p236q2.AbstractC6234b.m24563a(r5, r6, r0)
            if (r5 != r1) goto L6b
            return r1
        L6b:
            int r2 = r2 + r3
            goto L4f
        L6d:
            l8.i0 r9 = p172l8.C4700i0.f13910a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p348y.C9498d.mo36993a(r1.g, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public final C9508c m36997c() {
        return this.f32265a;
    }

    /* JADX INFO: renamed from: b */
    public static C6457g m36996b(C6457g c6457g) {
        return c6457g;
    }
}
