package p264s0;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0506h3;
import androidx.compose.runtime.AbstractC0552o0;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p010a9.InterfaceC0173a;
import p215oc.C5729x;
import p317w0.EnumC9023p0;
import p319w2.C9147v3;

/* JADX INFO: renamed from: s0.qe */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6910qe {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0506h3 f22621a = AbstractC0552o0.m1980h(new InterfaceC0173a() { // from class: s0.pe
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return AbstractC6910qe.m27432a();
        }
    });

    /* JADX INFO: renamed from: s0.qe$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22622a;

        static {
            int[] iArr = new int[EnumC9023p0.values().length];
            try {
                iArr[EnumC9023p0.f30687t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9023p0.f30688u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9023p0.f30689v.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC9023p0.f30690w.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC9023p0.f30691x.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC9023p0.f30692y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC9023p0.f30664C.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC9023p0.f30665D.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC9023p0.f30666E.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC9023p0.f30684q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC9023p0.f30685r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC9023p0.f30686s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC9023p0.f30693z.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC9023p0.f30662A.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC9023p0.f30663B.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC9023p0.f30670I.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC9023p0.f30671J.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EnumC9023p0.f30672K.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[EnumC9023p0.f30673L.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[EnumC9023p0.f30674M.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[EnumC9023p0.f30675N.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[EnumC9023p0.f30679R.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[EnumC9023p0.f30680S.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[EnumC9023p0.f30681T.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[EnumC9023p0.f30667F.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[EnumC9023p0.f30668G.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[EnumC9023p0.f30669H.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[EnumC9023p0.f30676O.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[EnumC9023p0.f30677P.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[EnumC9023p0.f30678Q.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            f22622a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C6878oe m27432a() {
        return new C6878oe(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    /* JADX INFO: renamed from: b */
    public static final C9147v3 m27433b(C6878oe c6878oe, EnumC9023p0 enumC9023p0) {
        switch (a.f22622a[enumC9023p0.ordinal()]) {
            case 1:
                return c6878oe.m27304g();
            case 2:
                return c6878oe.m27306i();
            case 3:
                return c6878oe.m27308k();
            case 4:
                return c6878oe.m27310m();
            case 5:
                return c6878oe.m27312o();
            case 6:
                return c6878oe.m27314q();
            case 7:
                return c6878oe.m27322y();
            case 8:
                return c6878oe.m27294A();
            case 9:
                return c6878oe.m27296C();
            case 10:
                return c6878oe.m27298a();
            case Opcodes.FCONST_0 /* 11 */:
                return c6878oe.m27300c();
            case Opcodes.FCONST_1 /* 12 */:
                return c6878oe.m27302e();
            case Opcodes.FCONST_2 /* 13 */:
                return c6878oe.m27316s();
            case Opcodes.DCONST_0 /* 14 */:
                return c6878oe.m27318u();
            case 15:
                return c6878oe.m27320w();
            case 16:
                return c6878oe.m27305h();
            case Opcodes.SIPUSH /* 17 */:
                return c6878oe.m27307j();
            case Opcodes.LDC /* 18 */:
                return c6878oe.m27309l();
            case 19:
                return c6878oe.m27311n();
            case 20:
                return c6878oe.m27313p();
            case Opcodes.ILOAD /* 21 */:
                return c6878oe.m27315r();
            case Opcodes.LLOAD /* 22 */:
                return c6878oe.m27323z();
            case Opcodes.FLOAD /* 23 */:
                return c6878oe.m27295B();
            case Opcodes.DLOAD /* 24 */:
                return c6878oe.m27297D();
            case Opcodes.ALOAD /* 25 */:
                return c6878oe.m27299b();
            case 26:
                return c6878oe.m27301d();
            case 27:
                return c6878oe.m27303f();
            case 28:
                return c6878oe.m27317t();
            case 29:
                return c6878oe.m27319v();
            case 30:
                return c6878oe.m27321x();
            default:
                C5729x.m23182a();
                return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC0506h3 m27434c() {
        return f22621a;
    }

    /* JADX INFO: renamed from: d */
    public static final C9147v3 m27435d(EnumC9023p0 enumC9023p0, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1049072145, i10, -1, "androidx.compose.material3.<get-value> (Typography.kt:524)");
        }
        C9147v3 c9147v3M27433b = m27433b(C6977v5.f22996a.m27583e(interfaceC0572r, 6), enumC9023p0);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c9147v3M27433b;
    }
}
