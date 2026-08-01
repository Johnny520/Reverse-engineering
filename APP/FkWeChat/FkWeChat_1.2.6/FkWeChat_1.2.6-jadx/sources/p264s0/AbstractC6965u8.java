package p264s0;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0506h3;
import androidx.compose.runtime.AbstractC0552o0;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p001a0.AbstractC0003a;
import p001a0.AbstractC0009g;
import p001a0.InterfaceC0004b;
import p010a9.InterfaceC0173a;
import p215oc.C5729x;
import p265s1.AbstractC7055b3;
import p265s1.InterfaceC7090i3;
import p317w0.EnumC8999d0;

/* JADX INFO: renamed from: s0.u8 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6965u8 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0506h3 f22946a = AbstractC0552o0.m1980h(new InterfaceC0173a() { // from class: s0.t8
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return AbstractC6965u8.m27556a();
        }
    });

    /* JADX INFO: renamed from: s0.u8$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22947a;

        static {
            int[] iArr = new int[EnumC8999d0.values().length];
            try {
                iArr[EnumC8999d0.f29861r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8999d0.f29862s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8999d0.f29860q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC8999d0.f29863t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC8999d0.f29864u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC8999d0.f29865v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC8999d0.f29866w.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC8999d0.f29867x.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC8999d0.f29869z.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC8999d0.f29868y.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC8999d0.f29854B.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC8999d0.f29855C.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC8999d0.f29856D.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC8999d0.f29857E.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC8999d0.f29853A.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f22947a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C6935s8 m27556a() {
        return new C6935s8(null, null, null, null, null, 31, null);
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC0003a m27557b(AbstractC0003a abstractC0003a, InterfaceC0004b interfaceC0004b) {
        return AbstractC0003a.m3c(abstractC0003a, interfaceC0004b, interfaceC0004b, null, null, 12, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ AbstractC0003a m27558c(AbstractC0003a abstractC0003a, InterfaceC0004b interfaceC0004b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0004b = C6920r8.f22665a.m27472a();
        }
        return m27557b(abstractC0003a, interfaceC0004b);
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC0003a m27559d(AbstractC0003a abstractC0003a, InterfaceC0004b interfaceC0004b) {
        return AbstractC0003a.m3c(abstractC0003a, interfaceC0004b, null, null, interfaceC0004b, 6, null);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ AbstractC0003a m27560e(AbstractC0003a abstractC0003a, InterfaceC0004b interfaceC0004b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0004b = C6920r8.f22665a.m27472a();
        }
        return m27559d(abstractC0003a, interfaceC0004b);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC7090i3 m27561f(C6935s8 c6935s8, EnumC8999d0 enumC8999d0) {
        switch (a.f22947a[enumC8999d0.ordinal()]) {
            case 1:
                return c6935s8.m27507b();
            case 2:
                return c6935s8.m27508c();
            case 3:
                return c6935s8.m27506a();
            case 4:
                return m27567l(c6935s8.m27507b(), null, 1, null);
            case 5:
                return c6935s8.m27509d();
            case 6:
                return m27567l(c6935s8.m27509d(), null, 1, null);
            case 7:
                return AbstractC0009g.m20f();
            case 8:
                return c6935s8.m27510e();
            case 9:
                return c6935s8.m27511f();
            case 10:
                return m27560e(c6935s8.m27510e(), null, 1, null);
            case Opcodes.FCONST_0 /* 11 */:
                return m27567l(c6935s8.m27510e(), null, 1, null);
            case Opcodes.FCONST_1 /* 12 */:
                return c6935s8.m27512g();
            case Opcodes.FCONST_2 /* 13 */:
                return AbstractC7055b3.m27770a();
            case Opcodes.DCONST_0 /* 14 */:
                return c6935s8.m27513h();
            case 15:
                return m27565j(c6935s8.m27510e(), null, 1, null);
            default:
                C5729x.m23182a();
                return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC0506h3 m27562g() {
        return f22946a;
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC7090i3 m27563h(EnumC8999d0 enumC8999d0, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(1629172543, i10, -1, "androidx.compose.material3.<get-value> (Shapes.kt:358)");
        }
        InterfaceC7090i3 interfaceC7090i3M27561f = m27561f(C6977v5.f22996a.m27582d(interfaceC0572r, 6), enumC8999d0);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC7090i3M27561f;
    }

    /* JADX INFO: renamed from: i */
    public static final AbstractC0003a m27564i(AbstractC0003a abstractC0003a, InterfaceC0004b interfaceC0004b) {
        return AbstractC0003a.m3c(abstractC0003a, null, interfaceC0004b, interfaceC0004b, null, 9, null);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ AbstractC0003a m27565j(AbstractC0003a abstractC0003a, InterfaceC0004b interfaceC0004b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0004b = C6920r8.f22665a.m27472a();
        }
        return m27564i(abstractC0003a, interfaceC0004b);
    }

    /* JADX INFO: renamed from: k */
    public static final AbstractC0003a m27566k(AbstractC0003a abstractC0003a, InterfaceC0004b interfaceC0004b) {
        return AbstractC0003a.m3c(abstractC0003a, null, null, interfaceC0004b, interfaceC0004b, 3, null);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ AbstractC0003a m27567l(AbstractC0003a abstractC0003a, InterfaceC0004b interfaceC0004b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0004b = C6920r8.f22665a.m27472a();
        }
        return m27566k(abstractC0003a, interfaceC0004b);
    }
}
