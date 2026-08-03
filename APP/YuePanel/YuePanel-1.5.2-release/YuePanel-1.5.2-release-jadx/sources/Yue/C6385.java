package Yue;

import Yue.InterfaceC6382;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣۡۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6385 {

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ boolean f2050 = false;

    /* JADX INFO: renamed from: ۥ */
    public static InterfaceC6382.EnumC0967 m2835(InterfaceC6382 interfaceC6382, AbstractC6381 abstractC6381) {
        AbstractC6381 abstractC6381M19902 = abstractC6381;
        int i = 0;
        while (abstractC6381M19902 != null) {
            InterfaceC6382.EnumC0967 enumC0967Mo1559 = interfaceC6382.mo1559(abstractC6381M19902, i);
            if (enumC0967Mo1559 == InterfaceC6382.EnumC0967.STOP) {
                return enumC0967Mo1559;
            }
            if (enumC0967Mo1559 != InterfaceC6382.EnumC0967.CONTINUE || abstractC6381M19902.mo13689() <= 0) {
                while (abstractC6381M19902.m19914() == null && i > 0) {
                    InterfaceC6382.EnumC0967 enumC0967 = InterfaceC6382.EnumC0967.CONTINUE;
                    if ((enumC0967Mo1559 == enumC0967 || enumC0967Mo1559 == InterfaceC6382.EnumC0967.SKIP_CHILDREN) && (enumC0967Mo1559 = interfaceC6382.m2831(abstractC6381M19902, i)) == InterfaceC6382.EnumC0967.STOP) {
                        return enumC0967Mo1559;
                    }
                    AbstractC6381 abstractC6381M19921 = abstractC6381M19902.m19921();
                    i--;
                    if (enumC0967Mo1559 == InterfaceC6382.EnumC0967.REMOVE) {
                        abstractC6381M19902.m19924();
                    }
                    enumC0967Mo1559 = enumC0967;
                    abstractC6381M19902 = abstractC6381M19921;
                }
                if ((enumC0967Mo1559 == InterfaceC6382.EnumC0967.CONTINUE || enumC0967Mo1559 == InterfaceC6382.EnumC0967.SKIP_CHILDREN) && (enumC0967Mo1559 = interfaceC6382.m2831(abstractC6381M19902, i)) == InterfaceC6382.EnumC0967.STOP) {
                    return enumC0967Mo1559;
                }
                if (abstractC6381M19902 == abstractC6381) {
                    return enumC0967Mo1559;
                }
                AbstractC6381 abstractC6381M19914 = abstractC6381M19902.m19914();
                if (enumC0967Mo1559 == InterfaceC6382.EnumC0967.REMOVE) {
                    abstractC6381M19902.m19924();
                }
                abstractC6381M19902 = abstractC6381M19914;
            } else {
                abstractC6381M19902 = abstractC6381M19902.m19902(0);
                i++;
            }
        }
        return InterfaceC6382.EnumC0967.CONTINUE;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m2836(InterfaceC6382 interfaceC6382, C4607 c4607) {
        C8159.m26910(interfaceC6382);
        C8159.m26910(c4607);
        Iterator<C4605> it = c4607.iterator();
        while (it.hasNext() && m2835(interfaceC6382, it.next()) != InterfaceC6382.EnumC0967.STOP) {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m19939(InterfaceC6387 interfaceC6387, C4607 c4607) {
        C8159.m26910(interfaceC6387);
        C8159.m26910(c4607);
        Iterator<C4605> it = c4607.iterator();
        while (it.hasNext()) {
            m19940(interfaceC6387, it.next());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m19940(InterfaceC6387 interfaceC6387, AbstractC6381 abstractC6381) {
        C8159.m26910(interfaceC6387);
        C8159.m26910(abstractC6381);
        AbstractC6381 abstractC6381M19902 = abstractC6381;
        int i = 0;
        while (abstractC6381M19902 != null) {
            AbstractC6381 abstractC6381M19921 = abstractC6381M19902.m19921();
            int iMo13689 = abstractC6381M19921 != null ? abstractC6381M19921.mo13689() : 0;
            AbstractC6381 abstractC6381M19914 = abstractC6381M19902.m19914();
            interfaceC6387.mo891(abstractC6381M19902, i);
            if (abstractC6381M19921 != null && !abstractC6381M19902.m19908()) {
                if (iMo13689 == abstractC6381M19921.mo13689()) {
                    abstractC6381M19902 = abstractC6381M19921.m19902(abstractC6381M19902.m19931());
                } else if (abstractC6381M19914 == null) {
                    i--;
                    abstractC6381M19902 = abstractC6381M19921;
                } else {
                    abstractC6381M19902 = abstractC6381M19914;
                }
            }
            if (abstractC6381M19902.mo13689() > 0) {
                abstractC6381M19902 = abstractC6381M19902.m19902(0);
                i++;
            } else {
                while (abstractC6381M19902.m19914() == null && i > 0) {
                    interfaceC6387.mo892(abstractC6381M19902, i);
                    abstractC6381M19902 = abstractC6381M19902.m19921();
                    i--;
                }
                interfaceC6387.mo892(abstractC6381M19902, i);
                if (abstractC6381M19902 == abstractC6381) {
                    return;
                } else {
                    abstractC6381M19902 = abstractC6381M19902.m19914();
                }
            }
        }
    }
}
