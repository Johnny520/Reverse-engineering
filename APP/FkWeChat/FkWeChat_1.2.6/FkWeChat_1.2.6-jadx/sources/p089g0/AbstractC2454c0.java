package p089g0;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0473c5;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.InterfaceC0514i4;
import androidx.compose.runtime.InterfaceC0564p5;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.List;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p024b9.AbstractC1043k;
import p024b9.C1055q;
import p056e0.AbstractC1963b;
import p056e0.C1964c;
import p056e0.C1965d;
import p056e0.C1967f;
import p056e0.C1969h;
import p056e0.InterfaceC1968g;
import p057e1.AbstractC1984l;
import p118i0.AbstractC3106h;
import p118i0.AbstractC3111m;
import p118i0.C3101c;
import p118i0.InterfaceC3107i;
import p121i3.AbstractC3186p;
import p121i3.C3185o;
import p135j2.InterfaceC3527h;
import p135j2.InterfaceC3578w;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;
import p179m2.AbstractC4854i0;
import p180m3.AbstractC4942c;
import p180m3.C4961v;
import p202o.AbstractC5616y;
import p202o.C5603l;
import p202o.C5606o;
import p202o.C5607p;
import p221p1.AbstractC5934q;
import p251r2.AbstractC6465c;
import p265s1.AbstractC7133r1;
import p265s1.C7128q1;
import p274t.AbstractC7833f3;
import p274t.AbstractC7869n;
import p334x1.AbstractC9307c;

/* JADX INFO: renamed from: g0.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2454c0 {

    /* JADX INFO: renamed from: a */
    public static final C4961v f6637a = new C4961v(true, false, false, false, 14, (AbstractC1043k) null);

    /* JADX INFO: renamed from: g0.c0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ AbstractC1963b f6638q;

        public a(AbstractC1963b abstractC1963b) {
            this.f6638q = abstractC1963b;
        }

        /* JADX INFO: renamed from: a */
        public final String m8881a(InterfaceC0572r interfaceC0572r, int i10) {
            interfaceC0572r.mo2163V(666084174);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(666084174, i10, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:145)");
            }
            String strM7114b = ((C1965d) this.f6638q).m7114b();
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
            interfaceC0572r.mo2152K();
            return strM7114b;
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m8881a((InterfaceC0572r) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: renamed from: g0.c0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ AbstractC1963b f6639q;

        public b(AbstractC1963b abstractC1963b) {
            this.f6639q = abstractC1963b;
        }

        /* JADX INFO: renamed from: a */
        public final void m8882a(long j10, InterfaceC0572r interfaceC0572r, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= interfaceC0572r.mo2173i(j10) ? 4 : 2;
            }
            if (!interfaceC0572r.mo2144C((i10 & 19) != 18, i10 & 1)) {
                interfaceC0572r.mo2190z();
                return;
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-1930700965, i10, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:150)");
            }
            AbstractC2454c0.m8874k(((C1965d) this.f6639q).m7115c(), j10, interfaceC0572r, (i10 << 3) & Opcodes.IREM);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ Object mo236e(Object obj, Object obj2, Object obj3) {
            m8882a(((C7128q1) obj).m28139y(), (InterfaceC0572r) obj2, ((Number) obj3).intValue());
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: g0.c0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC3107i f6640q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC1968g f6641r;

        /* JADX INFO: renamed from: g0.c0$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public /* synthetic */ class a extends C1055q implements InterfaceC0173a {
            public a(Object obj) {
                super(0, obj, InterfaceC3107i.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0);
            }

            @Override // p010a9.InterfaceC0173a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final C1964c invoke() {
                return ((InterfaceC3107i) this.f3190r).mo10003P0();
            }
        }

        public c(InterfaceC3107i interfaceC3107i, InterfaceC1968g interfaceC1968g) {
            this.f6640q = interfaceC3107i;
            this.f6641r = interfaceC1968g;
        }

        /* JADX INFO: renamed from: c */
        public static final C1964c m8883c(InterfaceC0564p5 interfaceC0564p5) {
            return (C1964c) interfaceC0564p5.getValue();
        }

        /* JADX INFO: renamed from: a */
        public final void m8884a(InterfaceC0572r interfaceC0572r, int i10) {
            if (!interfaceC0572r.mo2144C((i10 & 3) != 2, i10 & 1)) {
                interfaceC0572r.mo2190z();
                return;
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(1315155414, i10, -1, "androidx.compose.foundation.text.contextmenu.internal.OpenContextMenu.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:124)");
            }
            boolean zMo2162U = interfaceC0572r.mo2162U(this.f6640q);
            InterfaceC3107i interfaceC3107i = this.f6640q;
            Object objMo2170f = interfaceC0572r.mo2170f();
            if (zMo2162U || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f = AbstractC0473c5.m1565d(new a(interfaceC3107i));
                interfaceC0572r.mo2153L(objMo2170f);
            }
            AbstractC2454c0.m8873j(this.f6641r, m8883c((InterfaceC0564p5) objMo2170f), interfaceC0572r, 0);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m8884a((InterfaceC0572r) obj, ((Number) obj2).intValue());
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m8864a(InterfaceC1968g interfaceC1968g) {
        interfaceC1968g.close();
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m8865b(AbstractC1963b abstractC1963b, InterfaceC1968g interfaceC1968g) {
        ((C1965d) abstractC1963b).m7116d().mo27m(interfaceC1968g);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static C4700i0 m8866c(C1964c c1964c, Context context, final InterfaceC1968g interfaceC1968g, C5606o c5606o) {
        C5606o c5606o2;
        List listM7112b = c1964c.m7112b();
        int size = listM7112b.size();
        int i10 = 0;
        while (i10 < size) {
            final AbstractC1963b abstractC1963b = (AbstractC1963b) listM7112b.get(i10);
            if (abstractC1963b instanceof C1965d) {
                c5606o2 = c5606o;
                C5606o.m22721e(c5606o2, new a(abstractC1963b), null, false, ((C1965d) abstractC1963b).m7115c() == 0 ? null : AbstractC1984l.m7162b(-1930700965, true, new b(abstractC1963b)), new InterfaceC0173a() { // from class: g0.z
                    @Override // p010a9.InterfaceC0173a
                    public final Object invoke() {
                        return AbstractC2454c0.m8865b(abstractC1963b, interfaceC1968g);
                    }
                }, 6, null);
            } else {
                c5606o2 = c5606o;
                if (abstractC1963b instanceof C1969h) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        C2497x0.f6747a.m8966k(c5606o2, context, (C1969h) abstractC1963b);
                    }
                } else if (abstractC1963b instanceof C1967f) {
                    c5606o2.m22725f();
                }
            }
            i10++;
            c5606o = c5606o2;
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: d */
    public static C4700i0 m8867d(InterfaceC1968g interfaceC1968g, InterfaceC3107i interfaceC3107i, InterfaceC0173a interfaceC0173a, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        m8875l(interfaceC1968g, interfaceC3107i, interfaceC0173a, interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: e */
    public static C4700i0 m8868e(int i10, long j10, int i11, InterfaceC0572r interfaceC0572r, int i12) {
        m8874k(i10, j10, interfaceC0572r, AbstractC0541m3.m1929a(i11 | 1));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: f */
    public static C4700i0 m8869f(InterfaceC1968g interfaceC1968g, C1964c c1964c, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        m8873j(interfaceC1968g, c1964c, interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: g */
    public static C4700i0 m8870g(int i10, long j10, int i11, InterfaceC0572r interfaceC0572r, int i12) {
        m8874k(i10, j10, interfaceC0572r, AbstractC0541m3.m1929a(i11 | 1));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: h */
    public static C4700i0 m8871h(InterfaceC4507m interfaceC4507m, InterfaceC0188p interfaceC0188p, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        m8876m(interfaceC4507m, interfaceC0188p, interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: i */
    public static C3185o m8872i(InterfaceC3107i interfaceC3107i, InterfaceC0173a interfaceC0173a) {
        return C3185o.m12043c(AbstractC3186p.m12061c(interfaceC3107i.mo10002C0((InterfaceC3578w) interfaceC0173a.invoke())));
    }

    /* JADX INFO: renamed from: j */
    public static final void m8873j(final InterfaceC1968g interfaceC1968g, final C1964c c1964c, InterfaceC0572r interfaceC0572r, final int i10) {
        int i11;
        final Context context;
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(1904307118);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? interfaceC0572rMo2181q.mo2162U(interfaceC1968g) : interfaceC0572rMo2181q.mo2175k(interfaceC1968g) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC0572rMo2181q.mo2175k(c1964c) ? 32 : 16;
        }
        boolean z10 = false;
        if (interfaceC0572rMo2181q.mo2144C((i11 & 19) != 18, i11 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(1904307118, i11, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:133)");
            }
            if (Build.VERSION.SDK_INT >= 28) {
                interfaceC0572rMo2181q.mo2163V(-1009462744);
                context = (Context) interfaceC0572rMo2181q.mo2142A(AbstractC4854i0.m19379d());
                interfaceC0572rMo2181q.mo2152K();
            } else {
                interfaceC0572rMo2181q.mo2163V(-1009413640);
                interfaceC0572rMo2181q.mo2152K();
                context = null;
            }
            boolean zMo2175k = interfaceC0572rMo2181q.mo2175k(c1964c);
            if ((i11 & 14) == 4 || ((i11 & 8) != 0 && interfaceC0572rMo2181q.mo2175k(interfaceC1968g))) {
                z10 = true;
            }
            boolean zMo2175k2 = zMo2175k | z10 | interfaceC0572rMo2181q.mo2175k(context);
            Object objMo2170f = interfaceC0572rMo2181q.mo2170f();
            if (zMo2175k2 || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f = new InterfaceC0184l() { // from class: g0.x
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj) {
                        return AbstractC2454c0.m8866c(c1964c, context, interfaceC1968g, (C5606o) obj);
                    }
                };
                interfaceC0572rMo2181q.mo2153L(objMo2170f);
            }
            AbstractC5616y.m22750h(null, null, (InterfaceC0184l) objMo2170f, interfaceC0572rMo2181q, 0, 3);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572rMo2181q.mo2190z();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: g0.y
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2454c0.m8869f(interfaceC1968g, c1964c, i10, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m8874k(final int i10, final long j10, InterfaceC0572r interfaceC0572r, final int i11) {
        int i12;
        InterfaceC0514i4 interfaceC0514i4Mo2188x;
        InterfaceC0188p interfaceC0188p;
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(-1240244237);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC0572rMo2181q.mo2172h(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC0572rMo2181q.mo2173i(j10) ? 32 : 16;
        }
        if (interfaceC0572rMo2181q.mo2144C((i12 & 19) != 18, i12 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-1240244237, i12, -1, "androidx.compose.foundation.text.contextmenu.internal.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:166)");
            }
            Context context = (Context) interfaceC0572rMo2181q.mo2142A(AbstractC4854i0.m19379d());
            boolean zMo2162U = ((i12 & 14) == 4) | interfaceC0572rMo2181q.mo2162U(context);
            Object objMo2170f = interfaceC0572rMo2181q.mo2170f();
            if (zMo2162U || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f = Integer.valueOf(context.obtainStyledAttributes(new int[]{i10}).getResourceId(0, -1));
                interfaceC0572rMo2181q.mo2153L(objMo2170f);
            }
            int iIntValue = ((Number) objMo2170f).intValue();
            if (iIntValue == -1) {
                if (AbstractC0468c0.m1556j()) {
                    AbstractC0468c0.m1558l();
                }
                interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
                if (interfaceC0514i4Mo2188x != null) {
                    interfaceC0188p = new InterfaceC0188p() { // from class: g0.a0
                        @Override // p010a9.InterfaceC0188p
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC2454c0.m8868e(i10, j10, i11, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    interfaceC0514i4Mo2188x.mo1756a(interfaceC0188p);
                }
                return;
            }
            AbstractC9307c abstractC9307cM25639c = AbstractC6465c.m25639c(iIntValue, interfaceC0572rMo2181q, 0);
            boolean z10 = (i12 & Opcodes.IREM) == 32;
            Object objMo2170f2 = interfaceC0572rMo2181q.mo2170f();
            if (z10 || objMo2170f2 == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f2 = j10 == 16 ? null : AbstractC7133r1.a.m28191b(AbstractC7133r1.f23666b, j10, 0, 2, null);
                interfaceC0572rMo2181q.mo2153L(objMo2170f2);
            }
            AbstractC7869n.m30422b(AbstractC5934q.m23854b(AbstractC7833f3.m30336r(InterfaceC4507m.f13080a, C5607p.f17535a.m22733g()), abstractC9307cM25639c, false, null, InterfaceC3527h.f9763a.m13128b(), 0.0f, (AbstractC7133r1) objMo2170f2, 22, null), interfaceC0572rMo2181q, 0);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572rMo2181q.mo2190z();
        }
        interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0188p = new InterfaceC0188p() { // from class: g0.b0
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2454c0.m8870g(i10, j10, i11, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                }
            };
            interfaceC0514i4Mo2188x.mo1756a(interfaceC0188p);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m8875l(final InterfaceC1968g interfaceC1968g, final InterfaceC3107i interfaceC3107i, final InterfaceC0173a interfaceC0173a, InterfaceC0572r interfaceC0572r, final int i10) {
        int i11;
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(-2040393164);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? interfaceC0572rMo2181q.mo2162U(interfaceC1968g) : interfaceC0572rMo2181q.mo2175k(interfaceC1968g) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? interfaceC0572rMo2181q.mo2162U(interfaceC3107i) : interfaceC0572rMo2181q.mo2175k(interfaceC3107i) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC0572rMo2181q.mo2175k(interfaceC0173a) ? 256 : 128;
        }
        boolean z10 = false;
        if (interfaceC0572rMo2181q.mo2144C((i11 & Opcodes.I2S) != 146, i11 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-2040393164, i11, -1, "androidx.compose.foundation.text.contextmenu.internal.OpenContextMenu (DefaultTextContextMenuDropdownProvider.android.kt:109)");
            }
            boolean z11 = (i11 & Opcodes.IREM) == 32 || ((i11 & 64) != 0 && interfaceC0572rMo2181q.mo2162U(interfaceC3107i));
            Object objMo2170f = interfaceC0572rMo2181q.mo2170f();
            if (z11 || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f = new C2459e0(new C5603l(new InterfaceC0173a() { // from class: g0.u
                    @Override // p010a9.InterfaceC0173a
                    public final Object invoke() {
                        return AbstractC2454c0.m8872i(interfaceC3107i, interfaceC0173a);
                    }
                }, (InterfaceC0188p) null, 2, (AbstractC1043k) null));
                interfaceC0572rMo2181q.mo2153L(objMo2170f);
            }
            C2459e0 c2459e0 = (C2459e0) objMo2170f;
            if ((i11 & 14) == 4 || ((i11 & 8) != 0 && interfaceC0572rMo2181q.mo2175k(interfaceC1968g))) {
                z10 = true;
            }
            Object objMo2170f2 = interfaceC0572rMo2181q.mo2170f();
            if (z10 || objMo2170f2 == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f2 = new InterfaceC0173a() { // from class: g0.v
                    @Override // p010a9.InterfaceC0173a
                    public final Object invoke() {
                        return AbstractC2454c0.m8864a(interfaceC1968g);
                    }
                };
                interfaceC0572rMo2181q.mo2153L(objMo2170f2);
            }
            AbstractC4942c.m19957a(c2459e0, (InterfaceC0173a) objMo2170f2, f6637a, AbstractC1984l.m7164d(1315155414, true, new c(interfaceC3107i, interfaceC1968g), interfaceC0572rMo2181q, 54), interfaceC0572rMo2181q, 3456, 0);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572rMo2181q.mo2190z();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: g0.w
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2454c0.m8867d(interfaceC1968g, interfaceC3107i, interfaceC0173a, i10, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m8876m(InterfaceC4507m interfaceC4507m, InterfaceC0188p interfaceC0188p, InterfaceC0572r interfaceC0572r, final int i10) {
        int i11;
        final InterfaceC4507m interfaceC4507m2;
        final InterfaceC0188p interfaceC0188p2;
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(1392105195);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC0572rMo2181q.mo2162U(interfaceC4507m) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC0572rMo2181q.mo2175k(interfaceC0188p) ? 32 : 16;
        }
        if (interfaceC0572rMo2181q.mo2144C((i11 & 19) != 18, i11 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(1392105195, i11, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideDefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:85)");
            }
            interfaceC4507m2 = interfaceC4507m;
            interfaceC0188p2 = interfaceC0188p;
            AbstractC3106h.m11632c(interfaceC4507m2, AbstractC3111m.m11643c(), C2486s.f6716a.m8952b(), interfaceC0188p2, interfaceC0572rMo2181q, (i11 & 14) | 432 | ((i11 << 6) & 7168));
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC4507m2 = interfaceC4507m;
            interfaceC0188p2 = interfaceC0188p;
            interfaceC0572rMo2181q.mo2190z();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: g0.t
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2454c0.m8871h(interfaceC4507m2, interfaceC0188p2, i10, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public static final C3101c m8880q(InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(1197778906, i10, -1, "androidx.compose.foundation.text.contextmenu.internal.defaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:98)");
        }
        C3101c c3101cM11637h = AbstractC3106h.m11637h(C2486s.f6716a.m8951a(), interfaceC0572r, 6);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c3101cM11637h;
    }
}
