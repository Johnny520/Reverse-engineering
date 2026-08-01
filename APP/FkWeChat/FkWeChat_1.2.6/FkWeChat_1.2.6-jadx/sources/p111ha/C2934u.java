package p111ha;

import p111ha.AbstractC2932s;
import p186m9.EnumC5132m;
import p215oc.C5729x;
import p299ub.AbstractC8621f0;
import p343xa.C9474d;
import p343xa.EnumC9476f;

/* JADX INFO: renamed from: ha.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2934u implements InterfaceC2933t {

    /* JADX INFO: renamed from: a */
    public static final C2934u f7764a = new C2934u();

    /* JADX INFO: renamed from: ha.u$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7765a;

        static {
            int[] iArr = new int[EnumC5132m.values().length];
            try {
                iArr[EnumC5132m.f15466w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5132m.f15467x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5132m.f15468y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5132m.f15469z.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC5132m.f15458A.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC5132m.f15459B.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC5132m.f15460C.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC5132m.f15461D.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f7765a = iArr;
        }
    }

    @Override // p111ha.InterfaceC2933t
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC2932s mo10717d(AbstractC2932s abstractC2932s) {
        abstractC2932s.getClass();
        if (!(abstractC2932s instanceof AbstractC2932s.d)) {
            return abstractC2932s;
        }
        AbstractC2932s.d dVar = (AbstractC2932s.d) abstractC2932s;
        if (dVar.m10713i() == null) {
            return abstractC2932s;
        }
        String strM36908f = C9474d.m36904c(dVar.m10713i().m36917k()).m36908f();
        strM36908f.getClass();
        return mo10716c(strM36908f);
    }

    @Override // p111ha.InterfaceC2933t
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC2932s mo10715b(String str) {
        EnumC9476f enumC9476f;
        str.getClass();
        str.length();
        char cCharAt = str.charAt(0);
        EnumC9476f[] enumC9476fArrValues = EnumC9476f.values();
        int length = enumC9476fArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                enumC9476f = null;
                break;
            }
            enumC9476f = enumC9476fArrValues[i10];
            if (enumC9476f.m36914h().charAt(0) == cCharAt) {
                break;
            }
            i10++;
        }
        if (enumC9476f != null) {
            return new AbstractC2932s.d(enumC9476f);
        }
        if (cCharAt == 'V') {
            return new AbstractC2932s.d(null);
        }
        if (cCharAt == '[') {
            return new AbstractC2932s.a(mo10715b(str.substring(1)));
        }
        if (cCharAt == 'L') {
            AbstractC8621f0.m33132d0(str, ';', false, 2, null);
        }
        return new AbstractC2932s.c(str.substring(1, str.length() - 1));
    }

    @Override // p111ha.InterfaceC2933t
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC2932s.c mo10716c(String str) {
        str.getClass();
        return new AbstractC2932s.c(str);
    }

    @Override // p111ha.InterfaceC2933t
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC2932s mo10719f(EnumC5132m enumC5132m) {
        enumC5132m.getClass();
        switch (a.f7765a[enumC5132m.ordinal()]) {
            case 1:
                return AbstractC2932s.f7752a.m10704a();
            case 2:
                return AbstractC2932s.f7752a.m10706c();
            case 3:
                return AbstractC2932s.f7752a.m10705b();
            case 4:
                return AbstractC2932s.f7752a.m10711h();
            case 5:
                return AbstractC2932s.f7752a.m10709f();
            case 6:
                return AbstractC2932s.f7752a.m10708e();
            case 7:
                return AbstractC2932s.f7752a.m10710g();
            case 8:
                return AbstractC2932s.f7752a.m10707d();
            default:
                C5729x.m23182a();
                return null;
        }
    }

    @Override // p111ha.InterfaceC2933t
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC2932s mo10718e() {
        return mo10716c("java/lang/Class");
    }

    @Override // p111ha.InterfaceC2933t
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String mo10714a(AbstractC2932s abstractC2932s) {
        String strM36914h;
        abstractC2932s.getClass();
        if (abstractC2932s instanceof AbstractC2932s.a) {
            return "[" + mo10714a(((AbstractC2932s.a) abstractC2932s).m10703i());
        }
        if (abstractC2932s instanceof AbstractC2932s.d) {
            EnumC9476f enumC9476fM10713i = ((AbstractC2932s.d) abstractC2932s).m10713i();
            return (enumC9476fM10713i == null || (strM36914h = enumC9476fM10713i.m36914h()) == null) ? "V" : strM36914h;
        }
        if (!(abstractC2932s instanceof AbstractC2932s.c)) {
            C5729x.m23182a();
            return null;
        }
        return "L" + ((AbstractC2932s.c) abstractC2932s).m10712i() + ';';
    }
}
