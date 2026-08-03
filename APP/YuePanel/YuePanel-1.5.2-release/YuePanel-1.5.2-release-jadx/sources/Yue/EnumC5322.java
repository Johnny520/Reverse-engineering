package Yue;

import Yue.AbstractC7853;
import Yue.C4483;
import com.google.flatbuffers.reflection.BaseType;
import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Yue.ۥ۠ۤۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC5322 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final EnumC5322 f12910 = new C5331("Initial", 0);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final EnumC5322 f12911 = new EnumC5322("BeforeHtml", 1) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۠ۡ
        {
            C5331 c5331 = null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        private boolean m16457(AbstractC7853 abstractC7853, C5321 c5321) {
            c5321.m25211("html");
            c5321.m16439(EnumC5322.f12912);
            return c5321.mo16359(abstractC7853);
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            if (abstractC7853.m24931()) {
                c5321.m16372(this);
                return false;
            }
            if (abstractC7853.m24930()) {
                c5321.m16397(abstractC7853.m24922());
                return true;
            }
            if (EnumC5322.m16447(abstractC7853)) {
                c5321.m16395(abstractC7853.m24921());
                return true;
            }
            if (abstractC7853.m24934() && abstractC7853.m24925().m24970().equals("html")) {
                c5321.m16398(abstractC7853.m24925());
                c5321.m16439(EnumC5322.f12912);
                return true;
            }
            if ((!abstractC7853.m24933() || !C7615.m23812(abstractC7853.m24924().m24970(), C5346.f12939)) && abstractC7853.m24933()) {
                c5321.m16372(this);
                return false;
            }
            return m16457(abstractC7853, c5321);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final EnumC5322 f12912 = new EnumC5322("BeforeHead", 2) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۠ۢ
        {
            C5331 c5331 = null;
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            if (EnumC5322.m16447(abstractC7853)) {
                c5321.m16395(abstractC7853.m24921());
                return true;
            }
            if (abstractC7853.m24930()) {
                c5321.m16397(abstractC7853.m24922());
                return true;
            }
            if (abstractC7853.m24931()) {
                c5321.m16372(this);
                return false;
            }
            if (abstractC7853.m24934() && abstractC7853.m24925().m24970().equals("html")) {
                return EnumC5322.f12916.mo16448(abstractC7853, c5321);
            }
            if (abstractC7853.m24934() && abstractC7853.m24925().m24970().equals("head")) {
                c5321.m16436(c5321.m16398(abstractC7853.m24925()));
                c5321.m16439(EnumC5322.f12913);
                return true;
            }
            if (abstractC7853.m24933() && C7615.m23812(abstractC7853.m24924().m24970(), C5346.f12939)) {
                c5321.m25211("head");
                return c5321.mo16359(abstractC7853);
            }
            if (abstractC7853.m24933()) {
                c5321.m16372(this);
                return false;
            }
            c5321.m25211("head");
            return c5321.mo16359(abstractC7853);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final EnumC5322 f12913 = new EnumC5322("InHead", 3) { // from class: Yue.ۥ۠ۤۧۢ.ۥۣ۟۟۠
        {
            C5331 c5331 = null;
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            if (EnumC5322.m16447(abstractC7853)) {
                c5321.m16395(abstractC7853.m24921());
                return true;
            }
            int i = C5337.f1444[abstractC7853.f23476.ordinal()];
            if (i == 1) {
                c5321.m16397(abstractC7853.m24922());
            } else {
                if (i == 2) {
                    c5321.m16372(this);
                    return false;
                }
                if (i == 3) {
                    AbstractC7853.C7859 c7859M24925 = abstractC7853.m24925();
                    String strM24970 = c7859M24925.m24970();
                    if (strM24970.equals("html")) {
                        return EnumC5322.f12916.mo16448(abstractC7853, c5321);
                    }
                    if (C7615.m23812(strM24970, C5346.f1445)) {
                        C4605 c4605M16399 = c5321.m16399(c7859M24925);
                        if (strM24970.equals("base") && c4605M16399.mo17595("href")) {
                            c5321.m16410(c4605M16399);
                        }
                    } else if (strM24970.equals("meta")) {
                        c5321.m16399(c7859M24925);
                    } else if (strM24970.equals(C6468.f16546)) {
                        EnumC5322.m16446(c7859M24925, c5321);
                    } else if (C7615.m23812(strM24970, C5346.f1446)) {
                        EnumC5322.m16445(c7859M24925, c5321);
                    } else if (strM24970.equals("noscript")) {
                        c5321.m16398(c7859M24925);
                        c5321.m16439(EnumC5322.f12914);
                    } else if (strM24970.equals("script")) {
                        c5321.f23778.m25025(EnumC7866.f23546);
                        c5321.m16409();
                        c5321.m16439(EnumC5322.f12917);
                        c5321.m16398(c7859M24925);
                    } else {
                        if (strM24970.equals("head")) {
                            c5321.m16372(this);
                            return false;
                        }
                        if (!strM24970.equals("template")) {
                            return m16458(abstractC7853, c5321);
                        }
                        c5321.m16398(c7859M24925);
                        c5321.m16403();
                        c5321.m16373(false);
                        EnumC5322 enumC5322 = EnumC5322.f12927;
                        c5321.m16439(enumC5322);
                        c5321.m16423(enumC5322);
                    }
                } else {
                    if (i != 4) {
                        return m16458(abstractC7853, c5321);
                    }
                    String strM249702 = abstractC7853.m24924().m24970();
                    if (strM249702.equals("head")) {
                        c5321.m25209();
                        c5321.m16439(EnumC5322.f12915);
                    } else {
                        if (C7615.m23812(strM249702, C5346.f12937)) {
                            return m16458(abstractC7853, c5321);
                        }
                        if (!strM249702.equals("template")) {
                            c5321.m16372(this);
                            return false;
                        }
                        if (c5321.m16413(strM249702)) {
                            c5321.m16377(true);
                            if (!c5321.m4010(strM249702)) {
                                c5321.m16372(this);
                            }
                            c5321.m16416(strM249702);
                            c5321.m16363();
                            c5321.m16419();
                            c5321.m16432();
                        } else {
                            c5321.m16372(this);
                        }
                    }
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final boolean m16458(AbstractC7853 abstractC7853, AbstractC7998 abstractC7998) {
            abstractC7998.m25210("head");
            return abstractC7998.mo16359(abstractC7853);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final EnumC5322 f12914 = new EnumC5322("InHeadNoscript", 4) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۠ۤ
        {
            C5331 c5331 = null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        private boolean m16459(AbstractC7853 abstractC7853, C5321 c5321) {
            c5321.m16372(this);
            c5321.m16395(new AbstractC7853.C7854().m24940(abstractC7853.toString()));
            return true;
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            if (abstractC7853.m24931()) {
                c5321.m16372(this);
                return true;
            }
            if (abstractC7853.m24934() && abstractC7853.m24925().m24970().equals("html")) {
                return c5321.m16421(abstractC7853, EnumC5322.f12916);
            }
            if (abstractC7853.m24933() && abstractC7853.m24924().m24970().equals("noscript")) {
                c5321.m25209();
                c5321.m16439(EnumC5322.f12913);
                return true;
            }
            if (EnumC5322.m16447(abstractC7853) || abstractC7853.m24930() || (abstractC7853.m24934() && C7615.m23812(abstractC7853.m24925().m24970(), C5346.f12940))) {
                return c5321.m16421(abstractC7853, EnumC5322.f12913);
            }
            if (abstractC7853.m24933() && abstractC7853.m24924().m24970().equals("br")) {
                return m16459(abstractC7853, c5321);
            }
            if ((!abstractC7853.m24934() || !C7615.m23812(abstractC7853.m24925().m24970(), C5346.f12970)) && !abstractC7853.m24933()) {
                return m16459(abstractC7853, c5321);
            }
            c5321.m16372(this);
            return false;
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final EnumC5322 f12915 = new EnumC5322("AfterHead", 5) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۠ۥ
        {
            C5331 c5331 = null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        private boolean m16460(AbstractC7853 abstractC7853, C5321 c5321) {
            c5321.m25211(C5905.f14739);
            c5321.m16373(true);
            return c5321.mo16359(abstractC7853);
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            if (EnumC5322.m16447(abstractC7853)) {
                c5321.m16395(abstractC7853.m24921());
                return true;
            }
            if (abstractC7853.m24930()) {
                c5321.m16397(abstractC7853.m24922());
                return true;
            }
            if (abstractC7853.m24931()) {
                c5321.m16372(this);
                return true;
            }
            if (!abstractC7853.m24934()) {
                if (!abstractC7853.m24933()) {
                    m16460(abstractC7853, c5321);
                    return true;
                }
                String strM24970 = abstractC7853.m24924().m24970();
                if (C7615.m23812(strM24970, C5346.f12938)) {
                    m16460(abstractC7853, c5321);
                    return true;
                }
                if (strM24970.equals("template")) {
                    c5321.m16421(abstractC7853, EnumC5322.f12913);
                    return true;
                }
                c5321.m16372(this);
                return false;
            }
            AbstractC7853.C7859 c7859M24925 = abstractC7853.m24925();
            String strM249702 = c7859M24925.m24970();
            if (strM249702.equals("html")) {
                return c5321.m16421(abstractC7853, EnumC5322.f12916);
            }
            if (strM249702.equals(C5905.f14739)) {
                c5321.m16398(c7859M24925);
                c5321.m16373(false);
                c5321.m16439(EnumC5322.f12916);
                return true;
            }
            if (strM249702.equals("frameset")) {
                c5321.m16398(c7859M24925);
                c5321.m16439(EnumC5322.f12929);
                return true;
            }
            if (!C7615.m23812(strM249702, C5346.f12941)) {
                if (strM249702.equals("head")) {
                    c5321.m16372(this);
                    return false;
                }
                m16460(abstractC7853, c5321);
                return true;
            }
            c5321.m16372(this);
            C4605 c4605M16383 = c5321.m16383();
            c5321.m25213(c4605M16383);
            c5321.m16421(abstractC7853, EnumC5322.f12913);
            c5321.m16427(c4605M16383);
            return true;
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final EnumC5322 f12916 = new EnumC5322("InBody", 6) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۠ۦ

        /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
        public static final int f12936 = 24;

        {
            C5331 c5331 = null;
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            switch (C5337.f1444[abstractC7853.f23476.ordinal()]) {
                case 1:
                    c5321.m16397(abstractC7853.m24922());
                    return true;
                case 2:
                    c5321.m16372(this);
                    return false;
                case 3:
                    return m16464(abstractC7853, c5321);
                case 4:
                    return m16462(abstractC7853, c5321);
                case 5:
                    AbstractC7853.C7854 c7854M24921 = abstractC7853.m24921();
                    if (c7854M24921.m24941().equals(EnumC5322.f12934)) {
                        c5321.m16372(this);
                        return false;
                    }
                    if (c5321.m16374() && EnumC5322.m16447(c7854M24921)) {
                        c5321.m16425();
                        c5321.m16395(c7854M24921);
                        return true;
                    }
                    c5321.m16425();
                    c5321.m16395(c7854M24921);
                    c5321.m16373(false);
                    return true;
                case 6:
                    if (c5321.m16438() > 0) {
                        return c5321.m16421(abstractC7853, EnumC5322.f12927);
                    }
                    if (!c5321.m16414(C5346.f12951)) {
                        return true;
                    }
                    c5321.m16372(this);
                    return true;
                default:
                    return true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        
            return true;
         */
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean m16461(AbstractC7853 abstractC7853, C5321 c5321) {
            String str = abstractC7853.m24924().f23491;
            ArrayList<C4605> arrayListM16385 = c5321.m16385();
            if (c5321.m16382(str) != null) {
                int size = arrayListM16385.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    C4605 c4605 = arrayListM16385.get(size);
                    if (c4605.m19913(str)) {
                        c5321.m16376(str);
                        if (!c5321.m4010(str)) {
                            c5321.m16372(this);
                        }
                        c5321.m16416(str);
                    } else {
                        if (C5321.m16351(c4605)) {
                            c5321.m16372(this);
                            return false;
                        }
                        size--;
                    }
                }
            } else {
                c5321.m16372(this);
                return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final boolean m16462(AbstractC7853 abstractC7853, C5321 c5321) {
            AbstractC7853.C7858 c7858M24924 = abstractC7853.m24924();
            String strM24970 = c7858M24924.m24970();
            strM24970.hashCode();
            byte b = -1;
            switch (strM24970.hashCode()) {
                case -1321546630:
                    if (strM24970.equals("template")) {
                        b = 0;
                    }
                    break;
                case 112:
                    if (strM24970.equals("p")) {
                        b = 1;
                    }
                    break;
                case 3152:
                    if (strM24970.equals("br")) {
                        b = 2;
                    }
                    break;
                case 3200:
                    if (strM24970.equals("dd")) {
                        b = 3;
                    }
                    break;
                case 3216:
                    if (strM24970.equals("dt")) {
                        b = 4;
                    }
                    break;
                case 3273:
                    if (strM24970.equals("h1")) {
                        b = 5;
                    }
                    break;
                case 3274:
                    if (strM24970.equals("h2")) {
                        b = 6;
                    }
                    break;
                case 3275:
                    if (strM24970.equals("h3")) {
                        b = 7;
                    }
                    break;
                case 3276:
                    if (strM24970.equals("h4")) {
                        b = 8;
                    }
                    break;
                case 3277:
                    if (strM24970.equals("h5")) {
                        b = 9;
                    }
                    break;
                case 3278:
                    if (strM24970.equals("h6")) {
                        b = 10;
                    }
                    break;
                case 3453:
                    if (strM24970.equals("li")) {
                        b = 11;
                    }
                    break;
                case 3029410:
                    if (strM24970.equals(C5905.f14739)) {
                        b = 12;
                    }
                    break;
                case 3148996:
                    if (strM24970.equals("form")) {
                        b = 13;
                    }
                    break;
                case 3213227:
                    if (strM24970.equals("html")) {
                        b = 14;
                    }
                    break;
                case 3536714:
                    if (strM24970.equals("span")) {
                        b = 15;
                    }
                    break;
                case 1869063452:
                    if (strM24970.equals("sarcasm")) {
                        b = BaseType.Union;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    c5321.m16421(abstractC7853, EnumC5322.f12913);
                    return true;
                case 1:
                    if (!c5321.m16386(strM24970)) {
                        c5321.m16372(this);
                        c5321.m25211(strM24970);
                        return c5321.mo16359(c7858M24924);
                    }
                    c5321.m16376(strM24970);
                    if (!c5321.m4010(strM24970)) {
                        c5321.m16372(this);
                    }
                    c5321.m16416(strM24970);
                    return true;
                case 2:
                    c5321.m16372(this);
                    c5321.m25211("br");
                    return false;
                case 3:
                case 4:
                    if (!c5321.m16388(strM24970)) {
                        c5321.m16372(this);
                        return false;
                    }
                    c5321.m16376(strM24970);
                    if (!c5321.m4010(strM24970)) {
                        c5321.m16372(this);
                    }
                    c5321.m16416(strM24970);
                    return true;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    String[] strArr = C5346.f12943;
                    if (!c5321.m16390(strArr)) {
                        c5321.m16372(this);
                        return false;
                    }
                    c5321.m16376(strM24970);
                    if (!c5321.m4010(strM24970)) {
                        c5321.m16372(this);
                    }
                    c5321.m16417(strArr);
                    return true;
                case 11:
                    if (!c5321.m16387(strM24970)) {
                        c5321.m16372(this);
                        return false;
                    }
                    c5321.m16376(strM24970);
                    if (!c5321.m4010(strM24970)) {
                        c5321.m16372(this);
                    }
                    c5321.m16416(strM24970);
                    return true;
                case 12:
                    if (!c5321.m16388(C5905.f14739)) {
                        c5321.m16372(this);
                        return false;
                    }
                    if (c5321.m16414(C5346.f12951)) {
                        c5321.m16372(this);
                    }
                    c5321.m25206(c5321.m16382(C5905.f14739));
                    c5321.m16439(EnumC5322.f12928);
                    return true;
                case 13:
                    if (!c5321.m16413("template")) {
                        C5063 c5063M16381 = c5321.m16381();
                        c5321.m16434(null);
                        if (c5063M16381 == null || !c5321.m16388(strM24970)) {
                            c5321.m16372(this);
                            return false;
                        }
                        c5321.m16375();
                        if (!c5321.m4010(strM24970)) {
                            c5321.m16372(this);
                        }
                        c5321.m16427(c5063M16381);
                    } else {
                        if (!c5321.m16388(strM24970)) {
                            c5321.m16372(this);
                            return false;
                        }
                        c5321.m16375();
                        if (!c5321.m4010(strM24970)) {
                            c5321.m16372(this);
                        }
                        c5321.m16416(strM24970);
                    }
                    return true;
                case 14:
                    if (!c5321.m16413(C5905.f14739)) {
                        c5321.m16372(this);
                        return false;
                    }
                    if (c5321.m16414(C5346.f12951)) {
                        c5321.m16372(this);
                    }
                    c5321.m16439(EnumC5322.f12928);
                    return c5321.mo16359(abstractC7853);
                case 15:
                case 16:
                    return m16461(abstractC7853, c5321);
                default:
                    if (C7615.m23812(strM24970, C5346.f12952)) {
                        return m16463(abstractC7853, c5321);
                    }
                    if (C7615.m23812(strM24970, C5346.f12950)) {
                        if (!c5321.m16388(strM24970)) {
                            c5321.m16372(this);
                            return false;
                        }
                        c5321.m16375();
                        if (!c5321.m4010(strM24970)) {
                            c5321.m16372(this);
                        }
                        c5321.m16416(strM24970);
                    } else {
                        if (!C7615.m23812(strM24970, C5346.f12946)) {
                            return m16461(abstractC7853, c5321);
                        }
                        if (!c5321.m16388("name")) {
                            if (!c5321.m16388(strM24970)) {
                                c5321.m16372(this);
                                return false;
                            }
                            c5321.m16375();
                            if (!c5321.m4010(strM24970)) {
                                c5321.m16372(this);
                            }
                            c5321.m16416(strM24970);
                            c5321.m16363();
                        }
                    }
                    return true;
            }
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x00d2 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6, types: [int] */
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final boolean m16463(AbstractC7853 abstractC7853, C5321 c5321) {
            String strM24970 = abstractC7853.m24924().m24970();
            ArrayList<C4605> arrayListM16385 = c5321.m16385();
            boolean z = false;
            int i = 0;
            while (i < 8) {
                C4605 c4605M16378 = c5321.m16378(strM24970);
                if (c4605M16378 == null) {
                    return m16461(abstractC7853, c5321);
                }
                if (!c5321.m16412(c4605M16378)) {
                    c5321.m16372(this);
                    c5321.m16426(c4605M16378);
                    return true;
                }
                if (!c5321.m16388(c4605M16378.mo13700())) {
                    c5321.m16372(this);
                    return z;
                }
                if (c5321.m4009() != c4605M16378) {
                    c5321.m16372(this);
                }
                int size = arrayListM16385.size();
                C4605 c4605 = null;
                int iM16420 = -1;
                boolean z2 = z;
                int i2 = 1;
                C4605 c46052 = null;
                while (true) {
                    if (i2 >= size || i2 >= 64) {
                        break;
                    }
                    C4605 c46053 = arrayListM16385.get(i2);
                    if (c46053 != c4605M16378) {
                        if (z2 && C5321.m16351(c46053)) {
                            c4605 = c46053;
                            break;
                        }
                    } else {
                        c46052 = arrayListM16385.get(i2 - 1);
                        iM16420 = c5321.m16420(c46053);
                        z2 = true;
                    }
                    i2++;
                }
                if (c4605 == null) {
                    c5321.m16416(c4605M16378.mo13700());
                    c5321.m16426(c4605M16378);
                    return true;
                }
                C4605 c4605M16360 = c4605;
                C4605 c46054 = c4605M16360;
                for (?? r8 = z; r8 < 3; r8++) {
                    if (c5321.m16412(c4605M16360)) {
                        c4605M16360 = c5321.m16360(c4605M16360);
                    }
                    if (!c5321.m16407(c4605M16360)) {
                        c5321.m16427(c4605M16360);
                    } else {
                        if (c4605M16360 == c4605M16378) {
                            break;
                        }
                        C4605 c46055 = new C4605(c5321.m25215(c4605M16360.mo9885(), C6616.f16979), c5321.m16379());
                        c5321.m16429(c4605M16360, c46055);
                        c5321.m16430(c4605M16360, c46055);
                        if (c46054 == c4605) {
                            iM16420 = c5321.m16420(c46055) + 1;
                        }
                        if (c46054.mo13701() != null) {
                            c46054.m19924();
                        }
                        c46055.m13710(c46054);
                        c4605M16360 = c46055;
                        c46054 = c4605M16360;
                    }
                }
                if (c46052 != null) {
                    if (C7615.m23812(c46052.mo13700(), C5346.f12953)) {
                        if (c46054.mo13701() != null) {
                            c46054.m19924();
                        }
                        c5321.m16402(c46054);
                    } else {
                        if (c46054.mo13701() != null) {
                            c46054.m19924();
                        }
                        c46052.m13710(c46054);
                    }
                }
                C4605 c46056 = new C4605(c4605M16378.m13813(), c5321.m16379());
                c46056.mo13685().m9187(c4605M16378.mo13685());
                c46056.m13711(c4605.m19903());
                c4605.m13710(c46056);
                c5321.m16426(c4605M16378);
                c5321.m16424(c46056, iM16420);
                c5321.m16427(c4605M16378);
                c5321.m16404(c4605, c46056);
                i++;
                z = false;
            }
            return true;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final boolean m16464(AbstractC7853 abstractC7853, C5321 c5321) {
            byte b;
            C4605 c4605M16382;
            C5063 c5063M16381;
            AbstractC7853.C7859 c7859M24925 = abstractC7853.m24925();
            String strM24970 = c7859M24925.m24970();
            strM24970.hashCode();
            switch (strM24970.hashCode()) {
                case -1644953643:
                    b = strM24970.equals("frameset") ? (byte) 0 : (byte) -1;
                    break;
                case -1377687758:
                    b = strM24970.equals("button") ? (byte) 1 : (byte) -1;
                    break;
                case -1191214428:
                    b = strM24970.equals("iframe") ? (byte) 2 : (byte) -1;
                    break;
                case -1134665583:
                    b = strM24970.equals("keygen") ? (byte) 3 : (byte) -1;
                    break;
                case -1010136971:
                    b = strM24970.equals("option") ? (byte) 4 : (byte) -1;
                    break;
                case -1003243718:
                    b = strM24970.equals("textarea") ? (byte) 5 : (byte) -1;
                    break;
                case -906021636:
                    b = strM24970.equals("select") ? (byte) 6 : (byte) -1;
                    break;
                case -891985998:
                    b = strM24970.equals("strike") ? (byte) 7 : (byte) -1;
                    break;
                case -891980137:
                    b = strM24970.equals("strong") ? (byte) 8 : (byte) -1;
                    break;
                case -80773204:
                    b = strM24970.equals("optgroup") ? (byte) 9 : (byte) -1;
                    break;
                case 97:
                    b = strM24970.equals(C6608.f2171) ? (byte) 10 : (byte) -1;
                    break;
                case 98:
                    b = strM24970.equals("b") ? (byte) 11 : (byte) -1;
                    break;
                case 105:
                    b = strM24970.equals("i") ? (byte) 12 : (byte) -1;
                    break;
                case 115:
                    b = strM24970.equals("s") ? (byte) 13 : (byte) -1;
                    break;
                case 117:
                    b = strM24970.equals("u") ? (byte) 14 : (byte) -1;
                    break;
                case 3152:
                    b = strM24970.equals("br") ? (byte) 15 : (byte) -1;
                    break;
                case 3200:
                    b = strM24970.equals("dd") ? BaseType.Union : (byte) -1;
                    break;
                case 3216:
                    b = strM24970.equals("dt") ? BaseType.Array : (byte) -1;
                    break;
                case 3240:
                    b = strM24970.equals("em") ? BaseType.Vector64 : (byte) -1;
                    break;
                case 3273:
                    b = strM24970.equals("h1") ? BaseType.MaxBaseType : (byte) -1;
                    break;
                case 3274:
                    b = strM24970.equals("h2") ? (byte) 20 : (byte) -1;
                    break;
                case 3275:
                    b = strM24970.equals("h3") ? (byte) 21 : (byte) -1;
                    break;
                case 3276:
                    b = strM24970.equals("h4") ? (byte) 22 : (byte) -1;
                    break;
                case 3277:
                    b = strM24970.equals("h5") ? (byte) 23 : (byte) -1;
                    break;
                case 3278:
                    b = strM24970.equals("h6") ? (byte) 24 : (byte) -1;
                    break;
                case 3338:
                    b = strM24970.equals("hr") ? (byte) 25 : (byte) -1;
                    break;
                case 3453:
                    b = strM24970.equals("li") ? (byte) 26 : (byte) -1;
                    break;
                case 3632:
                    b = strM24970.equals("rb") ? (byte) 27 : (byte) -1;
                    break;
                case 3646:
                    b = strM24970.equals("rp") ? (byte) 28 : (byte) -1;
                    break;
                case 3650:
                    b = strM24970.equals("rt") ? (byte) 29 : (byte) -1;
                    break;
                case 3712:
                    b = strM24970.equals("tt") ? (byte) 30 : (byte) -1;
                    break;
                case 97536:
                    b = strM24970.equals("big") ? (byte) 31 : (byte) -1;
                    break;
                case 104387:
                    b = strM24970.equals("img") ? (byte) 32 : (byte) -1;
                    break;
                case 111267:
                    b = strM24970.equals("pre") ? (byte) 33 : (byte) -1;
                    break;
                case 113249:
                    b = strM24970.equals("rtc") ? (byte) 34 : (byte) -1;
                    break;
                case 114276:
                    b = strM24970.equals("svg") ? (byte) 35 : (byte) -1;
                    break;
                case 117511:
                    b = strM24970.equals("wbr") ? (byte) 36 : (byte) -1;
                    break;
                case 118811:
                    b = strM24970.equals("xmp") ? (byte) 37 : (byte) -1;
                    break;
                case 3002509:
                    b = strM24970.equals("area") ? (byte) 38 : (byte) -1;
                    break;
                case 3029410:
                    b = strM24970.equals(C5905.f14739) ? (byte) 39 : (byte) -1;
                    break;
                case 3059181:
                    b = strM24970.equals("code") ? (byte) 40 : (byte) -1;
                    break;
                case 3148879:
                    b = strM24970.equals("font") ? (byte) 41 : (byte) -1;
                    break;
                case 3148996:
                    b = strM24970.equals("form") ? C4750.f10567 : (byte) -1;
                    break;
                case 3213227:
                    b = strM24970.equals("html") ? (byte) 43 : (byte) -1;
                    break;
                case 3344136:
                    b = strM24970.equals("math") ? (byte) 44 : (byte) -1;
                    break;
                case 3386833:
                    b = strM24970.equals("nobr") ? (byte) 45 : (byte) -1;
                    break;
                case 3536714:
                    b = strM24970.equals("span") ? (byte) 46 : (byte) -1;
                    break;
                case 96620249:
                    b = strM24970.equals("embed") ? C4750.f10554 : (byte) -1;
                    break;
                case 100313435:
                    b = strM24970.equals("image") ? (byte) 48 : (byte) -1;
                    break;
                case 100358090:
                    b = strM24970.equals("input") ? (byte) 49 : (byte) -1;
                    break;
                case 109548807:
                    b = strM24970.equals("small") ? (byte) 50 : (byte) -1;
                    break;
                case 110115790:
                    b = strM24970.equals("table") ? (byte) 51 : (byte) -1;
                    break;
                case 181975684:
                    b = strM24970.equals("listing") ? (byte) 52 : (byte) -1;
                    break;
                case 1973234167:
                    b = strM24970.equals("plaintext") ? (byte) 53 : (byte) -1;
                    break;
                case 2091304424:
                    b = strM24970.equals("isindex") ? (byte) 54 : (byte) -1;
                    break;
                case 2115613112:
                    b = strM24970.equals("noembed") ? (byte) 55 : (byte) -1;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    c5321.m16372(this);
                    ArrayList<C4605> arrayListM16385 = c5321.m16385();
                    if (arrayListM16385.size() == 1) {
                        return false;
                    }
                    if ((arrayListM16385.size() > 2 && !arrayListM16385.get(1).m19913(C5905.f14739)) || !c5321.m16374()) {
                        return false;
                    }
                    C4605 c4605 = arrayListM16385.get(1);
                    if (c4605.mo13701() != null) {
                        c4605.m19924();
                    }
                    while (arrayListM16385.size() > 1) {
                        arrayListM16385.remove(arrayListM16385.size() - 1);
                    }
                    c5321.m16398(c7859M24925);
                    c5321.m16439(EnumC5322.f12929);
                    return true;
                case 1:
                    if (c5321.m16386("button")) {
                        c5321.m16372(this);
                        c5321.m25210("button");
                        c5321.mo16359(c7859M24925);
                    } else {
                        c5321.m16425();
                        c5321.m16398(c7859M24925);
                        c5321.m16373(false);
                    }
                    return true;
                case 2:
                    c5321.m16373(false);
                    EnumC5322.m16445(c7859M24925, c5321);
                    return true;
                case 3:
                case 15:
                case 32:
                case 36:
                case 38:
                case 47:
                    c5321.m16425();
                    c5321.m16399(c7859M24925);
                    c5321.m16373(false);
                    return true;
                case 4:
                case 9:
                    if (c5321.m4010("option")) {
                        c5321.m25210("option");
                    }
                    c5321.m16425();
                    c5321.m16398(c7859M24925);
                    return true;
                case 5:
                    c5321.m16398(c7859M24925);
                    if (!c7859M24925.m24966()) {
                        c5321.f23778.m25025(EnumC7866.f23543);
                        c5321.m16409();
                        c5321.m16373(false);
                        c5321.m16439(EnumC5322.f12917);
                    }
                    return true;
                case 6:
                    c5321.m16425();
                    c5321.m16398(c7859M24925);
                    c5321.m16373(false);
                    if (!c7859M24925.f23492) {
                        EnumC5322 enumC5322M16437 = c5321.m16437();
                        if (enumC5322M16437.equals(EnumC5322.f12918) || enumC5322M16437.equals(EnumC5322.f12920) || enumC5322M16437.equals(EnumC5322.f12922) || enumC5322M16437.equals(EnumC5322.f12923) || enumC5322M16437.equals(EnumC5322.f12924)) {
                            c5321.m16439(EnumC5322.f12926);
                        } else {
                            c5321.m16439(EnumC5322.f12925);
                        }
                    }
                    return true;
                case 7:
                case 8:
                case 11:
                case 12:
                case 13:
                case 14:
                case 18:
                case 30:
                case 31:
                case 40:
                case 41:
                case 50:
                    c5321.m16425();
                    c5321.m16422(c5321.m16398(c7859M24925));
                    return true;
                case 10:
                    if (c5321.m16378(C6608.f2171) != null) {
                        c5321.m16372(this);
                        c5321.m25210(C6608.f2171);
                        C4605 c4605M163822 = c5321.m16382(C6608.f2171);
                        if (c4605M163822 != null) {
                            c5321.m16426(c4605M163822);
                            c5321.m16427(c4605M163822);
                        }
                    }
                    c5321.m16425();
                    c5321.m16422(c5321.m16398(c7859M24925));
                    return true;
                case 16:
                case 17:
                    c5321.m16373(false);
                    ArrayList<C4605> arrayListM163852 = c5321.m16385();
                    int size = arrayListM163852.size();
                    int i = size - 1;
                    int i2 = i >= 24 ? size - 25 : 0;
                    while (true) {
                        if (i >= i2) {
                            C4605 c46052 = arrayListM163852.get(i);
                            if (C7615.m23812(c46052.mo13700(), C5346.f12945)) {
                                c5321.m25210(c46052.mo13700());
                            } else if (!C5321.m16351(c46052) || C7615.m23812(c46052.mo13700(), C5346.f12944)) {
                                i--;
                            }
                        }
                    }
                    if (c5321.m16386("p")) {
                        c5321.m25210("p");
                    }
                    c5321.m16398(c7859M24925);
                    return true;
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    if (c5321.m16386("p")) {
                        c5321.m25210("p");
                    }
                    if (C7615.m23812(c5321.m4009().mo13700(), C5346.f12943)) {
                        c5321.m16372(this);
                        c5321.m25209();
                    }
                    c5321.m16398(c7859M24925);
                    return true;
                case 25:
                    if (c5321.m16386("p")) {
                        c5321.m25210("p");
                    }
                    c5321.m16399(c7859M24925);
                    c5321.m16373(false);
                    return true;
                case 26:
                    c5321.m16373(false);
                    ArrayList<C4605> arrayListM163853 = c5321.m16385();
                    int size2 = arrayListM163853.size() - 1;
                    while (true) {
                        if (size2 > 0) {
                            C4605 c46053 = arrayListM163853.get(size2);
                            if (c46053.m19913("li")) {
                                c5321.m25210("li");
                            } else if (!C5321.m16351(c46053) || C7615.m23812(c46053.mo13700(), C5346.f12944)) {
                                size2--;
                            }
                        }
                    }
                    if (c5321.m16386("p")) {
                        c5321.m25210("p");
                    }
                    c5321.m16398(c7859M24925);
                    return true;
                case 27:
                case 34:
                    if (c5321.m16388("ruby")) {
                        c5321.m16375();
                        if (!c5321.m4010("ruby")) {
                            c5321.m16372(this);
                        }
                    }
                    c5321.m16398(c7859M24925);
                    return true;
                case 28:
                case 29:
                    if (c5321.m16388("ruby")) {
                        c5321.m16376("rtc");
                        if (!c5321.m4010("rtc") && !c5321.m4010("ruby")) {
                            c5321.m16372(this);
                        }
                    }
                    c5321.m16398(c7859M24925);
                    return true;
                case 33:
                case 52:
                    if (c5321.m16386("p")) {
                        c5321.m25210("p");
                    }
                    c5321.m16398(c7859M24925);
                    c5321.f3184.m10420("\n");
                    c5321.m16373(false);
                    return true;
                case 35:
                    c5321.m16425();
                    c5321.m16400(c7859M24925, C6617.f16983);
                    return true;
                case 37:
                    if (c5321.m16386("p")) {
                        c5321.m25210("p");
                    }
                    c5321.m16425();
                    c5321.m16373(false);
                    EnumC5322.m16445(c7859M24925, c5321);
                    return true;
                case 39:
                    c5321.m16372(this);
                    ArrayList<C4605> arrayListM163854 = c5321.m16385();
                    if (arrayListM163854.size() == 1) {
                        return false;
                    }
                    if ((arrayListM163854.size() > 2 && !arrayListM163854.get(1).m19913(C5905.f14739)) || c5321.m16413("template")) {
                        return false;
                    }
                    c5321.m16373(false);
                    if (c7859M24925.m24965() && (c4605M16382 = c5321.m16382(C5905.f14739)) != null) {
                        for (C3454 c3454 : c7859M24925.f23493) {
                            if (!c4605M16382.mo17595(c3454.getKey())) {
                                c4605M16382.mo13685().m9207(c3454);
                            }
                        }
                    }
                    return true;
                case 42:
                    if (c5321.m16381() != null && !c5321.m16413("template")) {
                        c5321.m16372(this);
                        return false;
                    }
                    if (c5321.m16386("p")) {
                        c5321.m16368("p");
                    }
                    c5321.m16401(c7859M24925, true, true);
                    return true;
                case 43:
                    c5321.m16372(this);
                    if (c5321.m16413("template")) {
                        return false;
                    }
                    if (c5321.m16385().size() > 0) {
                        C4605 c46054 = c5321.m16385().get(0);
                        if (c7859M24925.m24965()) {
                            for (C3454 c34542 : c7859M24925.f23493) {
                                if (!c46054.mo17595(c34542.getKey())) {
                                    c46054.mo13685().m9207(c34542);
                                }
                            }
                        }
                    }
                    return true;
                case 44:
                    c5321.m16425();
                    c5321.m16400(c7859M24925, C6617.f16982);
                    return true;
                case 45:
                    c5321.m16425();
                    if (c5321.m16388("nobr")) {
                        c5321.m16372(this);
                        c5321.m25210("nobr");
                        c5321.m16425();
                    }
                    c5321.m16422(c5321.m16398(c7859M24925));
                    return true;
                case 46:
                    c5321.m16425();
                    c5321.m16398(c7859M24925);
                    return true;
                case 48:
                    if (c5321.m16382("svg") == null) {
                        return c5321.mo16359(c7859M24925.m24967("img"));
                    }
                    c5321.m16398(c7859M24925);
                    return true;
                case 49:
                    c5321.m16425();
                    if (!c5321.m16399(c7859M24925).mo17594("type").equalsIgnoreCase("hidden")) {
                        c5321.m16373(false);
                    }
                    return true;
                case 51:
                    if (c5321.m16380().m13005() != C4483.EnumC0415.quirks && c5321.m16386("p")) {
                        c5321.m25210("p");
                    }
                    c5321.m16398(c7859M24925);
                    c5321.m16373(false);
                    c5321.m16439(EnumC5322.f12918);
                    return true;
                case 53:
                    if (c5321.m16386("p")) {
                        c5321.m25210("p");
                    }
                    c5321.m16398(c7859M24925);
                    c5321.f23778.m25025(EnumC7866.f23547);
                    return true;
                case 54:
                    c5321.m16372(this);
                    if (c5321.m16381() != null) {
                        return false;
                    }
                    c5321.m25211("form");
                    if (c7859M24925.m24963("action") && (c5063M16381 = c5321.m16381()) != null && c7859M24925.m24963("action")) {
                        c5063M16381.mo13685().m9208("action", c7859M24925.f23493.m9195("action"));
                    }
                    c5321.m25211("hr");
                    c5321.m25211(C6468.f16552);
                    c5321.mo16359(new AbstractC7853.C7854().m24940(c7859M24925.m24963("prompt") ? c7859M24925.f23493.m9195("prompt") : "This is a searchable index. Enter search keywords: "));
                    C3456 c3456 = new C3456();
                    if (c7859M24925.m24965()) {
                        for (C3454 c34543 : c7859M24925.f23493) {
                            if (!C7615.m23812(c34543.getKey(), C5346.f12948)) {
                                c3456.m9207(c34543);
                            }
                        }
                    }
                    c3456.m9208("name", "isindex");
                    c5321.m25212("input", c3456);
                    c5321.m25210(C6468.f16552);
                    c5321.m25211("hr");
                    c5321.m25210("form");
                    return true;
                case 55:
                    EnumC5322.m16445(c7859M24925, c5321);
                    return true;
                default:
                    if (!C7719.m24534(strM24970)) {
                        c5321.m16398(c7859M24925);
                    } else if (C7615.m23812(strM24970, C5346.f12942)) {
                        if (c5321.m16386("p")) {
                            c5321.m25210("p");
                        }
                        c5321.m16398(c7859M24925);
                    } else {
                        if (C7615.m23812(strM24970, C5346.f12941)) {
                            return c5321.m16421(abstractC7853, EnumC5322.f12913);
                        }
                        if (C7615.m23812(strM24970, C5346.f12946)) {
                            c5321.m16425();
                            c5321.m16398(c7859M24925);
                            c5321.m16403();
                            c5321.m16373(false);
                        } else {
                            if (!C7615.m23812(strM24970, C5346.f12947)) {
                                if (C7615.m23812(strM24970, C5346.f12949)) {
                                    c5321.m16372(this);
                                    return false;
                                }
                                c5321.m16425();
                                c5321.m16398(c7859M24925);
                                return true;
                            }
                            c5321.m16399(c7859M24925);
                        }
                    }
                    return true;
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final EnumC5322 f12917 = new EnumC5322("Text", 7) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۠ۧ
        {
            C5331 c5331 = null;
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            if (abstractC7853.m24929()) {
                c5321.m16395(abstractC7853.m24921());
                return true;
            }
            if (abstractC7853.m24932()) {
                c5321.m16372(this);
                c5321.m25209();
                c5321.m16439(c5321.m16415());
                return c5321.mo16359(abstractC7853);
            }
            if (!abstractC7853.m24933()) {
                return true;
            }
            c5321.m25209();
            c5321.m16439(c5321.m16415());
            return true;
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final EnumC5322 f12918 = new EnumC5322("InTable", 8) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۠ۨ
        {
            C5331 c5331 = null;
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            if (abstractC7853.m24929() && C7615.m23812(c5321.m4009().mo13700(), C5346.f12962)) {
                c5321.m16433();
                c5321.m16409();
                c5321.m16439(EnumC5322.f12919);
                return c5321.mo16359(abstractC7853);
            }
            if (abstractC7853.m24930()) {
                c5321.m16397(abstractC7853.m24922());
                return true;
            }
            if (abstractC7853.m24931()) {
                c5321.m16372(this);
                return false;
            }
            if (!abstractC7853.m24934()) {
                if (!abstractC7853.m24933()) {
                    if (!abstractC7853.m24932()) {
                        return m16465(abstractC7853, c5321);
                    }
                    if (c5321.m4010("html")) {
                        c5321.m16372(this);
                    }
                    return true;
                }
                String strM24970 = abstractC7853.m24924().m24970();
                if (strM24970.equals("table")) {
                    if (!c5321.m16394(strM24970)) {
                        c5321.m16372(this);
                        return false;
                    }
                    c5321.m16416("table");
                    c5321.m16432();
                } else {
                    if (C7615.m23812(strM24970, C5346.f12961)) {
                        c5321.m16372(this);
                        return false;
                    }
                    if (!strM24970.equals("template")) {
                        return m16465(abstractC7853, c5321);
                    }
                    c5321.m16421(abstractC7853, EnumC5322.f12913);
                }
                return true;
            }
            AbstractC7853.C7859 c7859M24925 = abstractC7853.m24925();
            String strM249702 = c7859M24925.m24970();
            if (strM249702.equals("caption")) {
                c5321.m16366();
                c5321.m16403();
                c5321.m16398(c7859M24925);
                c5321.m16439(EnumC5322.f12920);
            } else if (strM249702.equals("colgroup")) {
                c5321.m16366();
                c5321.m16398(c7859M24925);
                c5321.m16439(EnumC5322.f12921);
            } else {
                if (strM249702.equals("col")) {
                    c5321.m16366();
                    c5321.m25211("colgroup");
                    return c5321.mo16359(abstractC7853);
                }
                if (C7615.m23812(strM249702, C5346.f12954)) {
                    c5321.m16366();
                    c5321.m16398(c7859M24925);
                    c5321.m16439(EnumC5322.f12922);
                } else {
                    if (C7615.m23812(strM249702, C5346.f12955)) {
                        c5321.m16366();
                        c5321.m25211("tbody");
                        return c5321.mo16359(abstractC7853);
                    }
                    if (strM249702.equals("table")) {
                        c5321.m16372(this);
                        if (!c5321.m16394(strM249702)) {
                            return false;
                        }
                        c5321.m16416(strM249702);
                        if (c5321.m16432()) {
                            return c5321.mo16359(abstractC7853);
                        }
                        c5321.m16398(c7859M24925);
                        return true;
                    }
                    if (C7615.m23812(strM249702, C5346.f12956)) {
                        return c5321.m16421(abstractC7853, EnumC5322.f12913);
                    }
                    if (strM249702.equals("input")) {
                        if (!c7859M24925.m24965() || !c7859M24925.f23493.m9195("type").equalsIgnoreCase("hidden")) {
                            return m16465(abstractC7853, c5321);
                        }
                        c5321.m16399(c7859M24925);
                    } else {
                        if (!strM249702.equals("form")) {
                            return m16465(abstractC7853, c5321);
                        }
                        c5321.m16372(this);
                        if (c5321.m16381() != null || c5321.m16413("template")) {
                            return false;
                        }
                        c5321.m16401(c7859M24925, false, false);
                    }
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public boolean m16465(AbstractC7853 abstractC7853, C5321 c5321) {
            c5321.m16372(this);
            c5321.m16435(true);
            c5321.m16421(abstractC7853, EnumC5322.f12916);
            c5321.m16435(false);
            return true;
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final EnumC5322 f12919 = new EnumC5322("InTableText", 9) { // from class: Yue.ۥ۠ۤۧۢ.ۥ
        {
            C5331 c5331 = null;
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            if (abstractC7853.f23476 == AbstractC7853.EnumC7861.Character) {
                AbstractC7853.C7854 c7854M24921 = abstractC7853.m24921();
                if (c7854M24921.m24941().equals(EnumC5322.f12934)) {
                    c5321.m16372(this);
                    return false;
                }
                c5321.m16361(c7854M24921);
                return true;
            }
            if (c5321.m16384().size() > 0) {
                AbstractC7853 abstractC78532 = c5321.f23782;
                for (AbstractC7853.C7854 c7854 : c5321.m16384()) {
                    c5321.f23782 = c7854;
                    if (EnumC5322.m16447(c7854)) {
                        c5321.m16395(c7854);
                    } else {
                        c5321.m16372(this);
                        if (C7615.m23812(c5321.m4009().mo13700(), C5346.f12962)) {
                            c5321.m16435(true);
                            c5321.m16421(c7854, EnumC5322.f12916);
                            c5321.m16435(false);
                        } else {
                            c5321.m16421(c7854, EnumC5322.f12916);
                        }
                    }
                }
                c5321.f23782 = abstractC78532;
                c5321.m16433();
            }
            c5321.m16439(c5321.m16415());
            return c5321.mo16359(abstractC7853);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final EnumC5322 f12920 = new EnumC5322("InCaption", 10) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟
        {
            C5331 c5331 = null;
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            if (abstractC7853.m24933() && abstractC7853.m24924().m24970().equals("caption")) {
                if (!c5321.m16394("caption")) {
                    c5321.m16372(this);
                    return false;
                }
                c5321.m16375();
                if (!c5321.m4010("caption")) {
                    c5321.m16372(this);
                }
                c5321.m16416("caption");
                c5321.m16363();
                c5321.m16439(EnumC5322.f12918);
                return true;
            }
            if ((!abstractC7853.m24934() || !C7615.m23812(abstractC7853.m24925().m24970(), C5346.f12960)) && (!abstractC7853.m24933() || !abstractC7853.m24924().m24970().equals("table"))) {
                if (!abstractC7853.m24933() || !C7615.m23812(abstractC7853.m24924().m24970(), C5346.f12971)) {
                    return c5321.m16421(abstractC7853, EnumC5322.f12916);
                }
                c5321.m16372(this);
                return false;
            }
            if (!c5321.m16394("caption")) {
                c5321.m16372(this);
                return false;
            }
            c5321.m16377(false);
            if (!c5321.m4010("caption")) {
                c5321.m16372(this);
            }
            c5321.m16416("caption");
            c5321.m16363();
            EnumC5322 enumC5322 = EnumC5322.f12918;
            c5321.m16439(enumC5322);
            enumC5322.mo16448(abstractC7853, c5321);
            return true;
        }
    };

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final EnumC5322 f12921 = new EnumC5322("InColumnGroup", 11) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟
        {
            C5331 c5331 = null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        private boolean m16449(AbstractC7853 abstractC7853, C5321 c5321) {
            if (!c5321.m4010("colgroup")) {
                c5321.m16372(this);
                return false;
            }
            c5321.m25209();
            c5321.m16439(EnumC5322.f12918);
            c5321.mo16359(abstractC7853);
            return true;
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            AbstractC7853.C7859 c7859M24925;
            if (EnumC5322.m16447(abstractC7853)) {
                c5321.m16395(abstractC7853.m24921());
                return true;
            }
            int i = C5337.f1444[abstractC7853.f23476.ordinal()];
            if (i == 1) {
                c5321.m16397(abstractC7853.m24922());
            } else if (i == 2) {
                c5321.m16372(this);
            } else if (i == 3) {
                c7859M24925 = abstractC7853.m24925();
                String strM24970 = c7859M24925.m24970();
                strM24970.hashCode();
                switch (strM24970) {
                    case "template":
                        c5321.m16421(abstractC7853, EnumC5322.f12913);
                        break;
                    case "col":
                        c5321.m16399(c7859M24925);
                        break;
                    case "html":
                        return c5321.m16421(abstractC7853, EnumC5322.f12916);
                    default:
                        return m16449(abstractC7853, c5321);
                }
            } else {
                if (i != 4) {
                    if (i == 6 && c5321.m4010("html")) {
                        return true;
                    }
                    return m16449(abstractC7853, c5321);
                }
                String strM249702 = abstractC7853.m24924().m24970();
                strM249702.hashCode();
                if (strM249702.equals("template")) {
                    c5321.m16421(abstractC7853, EnumC5322.f12913);
                } else {
                    if (!strM249702.equals("colgroup")) {
                        return m16449(abstractC7853, c5321);
                    }
                    if (!c5321.m4010(strM249702)) {
                        c5321.m16372(this);
                        return false;
                    }
                    c5321.m25209();
                    c5321.m16439(EnumC5322.f12918);
                }
            }
            return true;
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final EnumC5322 f12922 = new EnumC5322("InTableBody", 12) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۟
        {
            C5331 c5331 = null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        private boolean m16450(AbstractC7853 abstractC7853, C5321 c5321) {
            return c5321.m16421(abstractC7853, EnumC5322.f12918);
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            int i = C5337.f1444[abstractC7853.f23476.ordinal()];
            if (i == 3) {
                AbstractC7853.C7859 c7859M24925 = abstractC7853.m24925();
                String strM24970 = c7859M24925.m24970();
                if (strM24970.equals("tr")) {
                    c5321.m16365();
                    c5321.m16398(c7859M24925);
                    c5321.m16439(EnumC5322.f12923);
                    return true;
                }
                if (!C7615.m23812(strM24970, C5346.f12957)) {
                    return C7615.m23812(strM24970, C5346.f12963) ? m16451(abstractC7853, c5321) : m16450(abstractC7853, c5321);
                }
                c5321.m16372(this);
                c5321.m25211("tr");
                return c5321.mo16359(c7859M24925);
            }
            if (i != 4) {
                return m16450(abstractC7853, c5321);
            }
            String strM249702 = abstractC7853.m24924().m24970();
            if (!C7615.m23812(strM249702, C5346.f12969)) {
                if (strM249702.equals("table")) {
                    return m16451(abstractC7853, c5321);
                }
                if (!C7615.m23812(strM249702, C5346.f12964)) {
                    return m16450(abstractC7853, c5321);
                }
                c5321.m16372(this);
                return false;
            }
            if (!c5321.m16394(strM249702)) {
                c5321.m16372(this);
                return false;
            }
            c5321.m16365();
            c5321.m25209();
            c5321.m16439(EnumC5322.f12918);
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final boolean m16451(AbstractC7853 abstractC7853, C5321 c5321) {
            if (!c5321.m16394("tbody") && !c5321.m16394("thead") && !c5321.m16388("tfoot")) {
                c5321.m16372(this);
                return false;
            }
            c5321.m16365();
            c5321.m25210(c5321.m4009().mo13700());
            return c5321.mo16359(abstractC7853);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final EnumC5322 f12923 = new EnumC5322("InRow", 13) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۟۟
        {
            C5331 c5331 = null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        private boolean m16452(AbstractC7853 abstractC7853, C5321 c5321) {
            return c5321.m16421(abstractC7853, EnumC5322.f12918);
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            if (abstractC7853.m24934()) {
                AbstractC7853.C7859 c7859M24925 = abstractC7853.m24925();
                String strM24970 = c7859M24925.m24970();
                if (C7615.m23812(strM24970, C5346.f12957)) {
                    c5321.m16367();
                    c5321.m16398(c7859M24925);
                    c5321.m16439(EnumC5322.f12924);
                    c5321.m16403();
                    return true;
                }
                if (!C7615.m23812(strM24970, C5346.f12965)) {
                    return m16452(abstractC7853, c5321);
                }
                if (!c5321.m16394("tr")) {
                    c5321.m16372(this);
                    return false;
                }
                c5321.m16367();
                c5321.m25209();
                c5321.m16439(EnumC5322.f12922);
                return c5321.mo16359(abstractC7853);
            }
            if (!abstractC7853.m24933()) {
                return m16452(abstractC7853, c5321);
            }
            String strM249702 = abstractC7853.m24924().m24970();
            if (strM249702.equals("tr")) {
                if (!c5321.m16394(strM249702)) {
                    c5321.m16372(this);
                    return false;
                }
                c5321.m16367();
                c5321.m25209();
                c5321.m16439(EnumC5322.f12922);
                return true;
            }
            if (strM249702.equals("table")) {
                if (!c5321.m16394("tr")) {
                    c5321.m16372(this);
                    return false;
                }
                c5321.m16367();
                c5321.m25209();
                c5321.m16439(EnumC5322.f12922);
                return c5321.mo16359(abstractC7853);
            }
            if (!C7615.m23812(strM249702, C5346.f12954)) {
                if (!C7615.m23812(strM249702, C5346.f12966)) {
                    return m16452(abstractC7853, c5321);
                }
                c5321.m16372(this);
                return false;
            }
            if (!c5321.m16394(strM249702)) {
                c5321.m16372(this);
                return false;
            }
            if (!c5321.m16394("tr")) {
                return false;
            }
            c5321.m16367();
            c5321.m25209();
            c5321.m16439(EnumC5322.f12922);
            return c5321.mo16359(abstractC7853);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final EnumC5322 f12924 = new EnumC5322("InCell", 14) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۟۠
        {
            C5331 c5331 = null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        private boolean m16453(AbstractC7853 abstractC7853, C5321 c5321) {
            return c5321.m16421(abstractC7853, EnumC5322.f12916);
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            if (!abstractC7853.m24933()) {
                if (!abstractC7853.m24934() || !C7615.m23812(abstractC7853.m24925().m24970(), C5346.f12960)) {
                    return m16453(abstractC7853, c5321);
                }
                if (c5321.m16394("td") || c5321.m16394("th")) {
                    m16454(c5321);
                    return c5321.mo16359(abstractC7853);
                }
                c5321.m16372(this);
                return false;
            }
            String strM24970 = abstractC7853.m24924().m24970();
            if (!C7615.m23812(strM24970, C5346.f12957)) {
                if (C7615.m23812(strM24970, C5346.f12958)) {
                    c5321.m16372(this);
                    return false;
                }
                if (!C7615.m23812(strM24970, C5346.f12959)) {
                    return m16453(abstractC7853, c5321);
                }
                if (c5321.m16394(strM24970)) {
                    m16454(c5321);
                    return c5321.mo16359(abstractC7853);
                }
                c5321.m16372(this);
                return false;
            }
            if (!c5321.m16394(strM24970)) {
                c5321.m16372(this);
                c5321.m16439(EnumC5322.f12923);
                return false;
            }
            c5321.m16375();
            if (!c5321.m4010(strM24970)) {
                c5321.m16372(this);
            }
            c5321.m16416(strM24970);
            c5321.m16363();
            c5321.m16439(EnumC5322.f12923);
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m16454(C5321 c5321) {
            if (c5321.m16394("td")) {
                c5321.m25210("td");
            } else {
                c5321.m25210("th");
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final EnumC5322 f12925 = new EnumC5322("InSelect", 15) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۟ۡ
        {
            C5331 c5331 = null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        private boolean m16455(AbstractC7853 abstractC7853, C5321 c5321) {
            c5321.m16372(this);
            return false;
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            String strM24970;
            switch (C5337.f1444[abstractC7853.f23476.ordinal()]) {
                case 1:
                    c5321.m16397(abstractC7853.m24922());
                    return true;
                case 2:
                    c5321.m16372(this);
                    return false;
                case 3:
                    AbstractC7853.C7859 c7859M24925 = abstractC7853.m24925();
                    String strM249702 = c7859M24925.m24970();
                    if (strM249702.equals("html")) {
                        return c5321.m16421(c7859M24925, EnumC5322.f12916);
                    }
                    if (strM249702.equals("option")) {
                        if (c5321.m4010("option")) {
                            c5321.m25210("option");
                        }
                        c5321.m16398(c7859M24925);
                    } else {
                        if (!strM249702.equals("optgroup")) {
                            if (strM249702.equals("select")) {
                                c5321.m16372(this);
                                return c5321.m25210("select");
                            }
                            if (!C7615.m23812(strM249702, C5346.f12967)) {
                                return (strM249702.equals("script") || strM249702.equals("template")) ? c5321.m16421(abstractC7853, EnumC5322.f12913) : m16455(abstractC7853, c5321);
                            }
                            c5321.m16372(this);
                            if (!c5321.m16391("select")) {
                                return false;
                            }
                            c5321.m25210("select");
                            return c5321.mo16359(c7859M24925);
                        }
                        if (c5321.m4010("option")) {
                            c5321.m25210("option");
                        }
                        if (c5321.m4010("optgroup")) {
                            c5321.m25210("optgroup");
                        }
                        c5321.m16398(c7859M24925);
                    }
                    return true;
                case 4:
                    strM24970 = abstractC7853.m24924().m24970();
                    strM24970.hashCode();
                    switch (strM24970) {
                        case "template":
                            return c5321.m16421(abstractC7853, EnumC5322.f12913);
                        case "option":
                            if (c5321.m4010("option")) {
                                c5321.m25209();
                            } else {
                                c5321.m16372(this);
                            }
                            return true;
                        case "select":
                            if (!c5321.m16391(strM24970)) {
                                c5321.m16372(this);
                                return false;
                            }
                            c5321.m16416(strM24970);
                            c5321.m16432();
                            return true;
                        case "optgroup":
                            if (c5321.m4010("option") && c5321.m16360(c5321.m4009()) != null && c5321.m16360(c5321.m4009()).m19913("optgroup")) {
                                c5321.m25210("option");
                            }
                            if (c5321.m4010("optgroup")) {
                                c5321.m25209();
                            } else {
                                c5321.m16372(this);
                            }
                            return true;
                        default:
                            return m16455(abstractC7853, c5321);
                    }
                case 5:
                    AbstractC7853.C7854 c7854M24921 = abstractC7853.m24921();
                    if (c7854M24921.m24941().equals(EnumC5322.f12934)) {
                        c5321.m16372(this);
                        return false;
                    }
                    c5321.m16395(c7854M24921);
                    return true;
                case 6:
                    if (!c5321.m4010("html")) {
                        c5321.m16372(this);
                    }
                    return true;
                default:
                    return m16455(abstractC7853, c5321);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final EnumC5322 f12926 = new EnumC5322("InSelectInTable", 16) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۟ۢ
        {
            C5331 c5331 = null;
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            if (abstractC7853.m24934() && C7615.m23812(abstractC7853.m24925().m24970(), C5346.f12968)) {
                c5321.m16372(this);
                c5321.m16416("select");
                c5321.m16432();
                return c5321.mo16359(abstractC7853);
            }
            if (!abstractC7853.m24933() || !C7615.m23812(abstractC7853.m24924().m24970(), C5346.f12968)) {
                return c5321.m16421(abstractC7853, EnumC5322.f12925);
            }
            c5321.m16372(this);
            if (!c5321.m16394(abstractC7853.m24924().m24970())) {
                return false;
            }
            c5321.m16416("select");
            c5321.m16432();
            return c5321.mo16359(abstractC7853);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final EnumC5322 f12927 = new EnumC5322("InTemplate", 17) { // from class: Yue.ۥ۠ۤۧۢ.ۥۣ۟۟۟
        {
            C5331 c5331 = null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            switch (C5337.f1444[abstractC7853.f23476.ordinal()]) {
                case 1:
                case 2:
                case 5:
                    c5321.m16421(abstractC7853, EnumC5322.f12916);
                    return true;
                case 3:
                    String strM24970 = abstractC7853.m24925().m24970();
                    if (C7615.m23812(strM24970, C5346.f12972)) {
                        c5321.m16421(abstractC7853, EnumC5322.f12913);
                        return true;
                    }
                    if (C7615.m23812(strM24970, C5346.f12973)) {
                        c5321.m16419();
                        EnumC5322 enumC5322 = EnumC5322.f12918;
                        c5321.m16423(enumC5322);
                        c5321.m16439(enumC5322);
                        return c5321.mo16359(abstractC7853);
                    }
                    if (strM24970.equals("col")) {
                        c5321.m16419();
                        EnumC5322 enumC53222 = EnumC5322.f12921;
                        c5321.m16423(enumC53222);
                        c5321.m16439(enumC53222);
                        return c5321.mo16359(abstractC7853);
                    }
                    if (strM24970.equals("tr")) {
                        c5321.m16419();
                        EnumC5322 enumC53223 = EnumC5322.f12922;
                        c5321.m16423(enumC53223);
                        c5321.m16439(enumC53223);
                        return c5321.mo16359(abstractC7853);
                    }
                    if (strM24970.equals("td") || strM24970.equals("th")) {
                        c5321.m16419();
                        EnumC5322 enumC53224 = EnumC5322.f12923;
                        c5321.m16423(enumC53224);
                        c5321.m16439(enumC53224);
                        return c5321.mo16359(abstractC7853);
                    }
                    c5321.m16419();
                    EnumC5322 enumC53225 = EnumC5322.f12916;
                    c5321.m16423(enumC53225);
                    c5321.m16439(enumC53225);
                    return c5321.mo16359(abstractC7853);
                case 4:
                    if (abstractC7853.m24924().m24970().equals("template")) {
                        c5321.m16421(abstractC7853, EnumC5322.f12913);
                        return true;
                    }
                    c5321.m16372(this);
                    return false;
                case 6:
                    if (!c5321.m16413("template")) {
                        return true;
                    }
                    c5321.m16372(this);
                    c5321.m16416("template");
                    c5321.m16363();
                    c5321.m16419();
                    c5321.m16432();
                    if (c5321.m16437() == EnumC5322.f12927 || c5321.m16438() >= 12) {
                        return true;
                    }
                    return c5321.mo16359(abstractC7853);
                default:
                    return true;
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final EnumC5322 f12928 = new EnumC5322("AfterBody", 18) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۟ۤ
        {
            C5331 c5331 = null;
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            C4605 c4605M16382 = c5321.m16382("html");
            if (EnumC5322.m16447(abstractC7853)) {
                if (c4605M16382 != null) {
                    c5321.m16396(abstractC7853.m24921(), c4605M16382);
                    return true;
                }
                c5321.m16421(abstractC7853, EnumC5322.f12916);
                return true;
            }
            if (abstractC7853.m24930()) {
                c5321.m16397(abstractC7853.m24922());
                return true;
            }
            if (abstractC7853.m24931()) {
                c5321.m16372(this);
                return false;
            }
            if (abstractC7853.m24934() && abstractC7853.m24925().m24970().equals("html")) {
                return c5321.m16421(abstractC7853, EnumC5322.f12916);
            }
            if (!abstractC7853.m24933() || !abstractC7853.m24924().m24970().equals("html")) {
                if (abstractC7853.m24932()) {
                    return true;
                }
                c5321.m16372(this);
                c5321.m16431();
                return c5321.mo16359(abstractC7853);
            }
            if (c5321.m16406()) {
                c5321.m16372(this);
                return false;
            }
            if (c4605M16382 != null) {
                c5321.m25206(c4605M16382);
            }
            c5321.m16439(EnumC5322.f12931);
            return true;
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final EnumC5322 f12929 = new EnumC5322("InFrameset", 19) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۟ۦ
        {
            C5331 c5331 = null;
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            AbstractC7853.C7859 c7859M24925;
            if (EnumC5322.m16447(abstractC7853)) {
                c5321.m16395(abstractC7853.m24921());
            } else if (abstractC7853.m24930()) {
                c5321.m16397(abstractC7853.m24922());
            } else {
                if (abstractC7853.m24931()) {
                    c5321.m16372(this);
                    return false;
                }
                if (abstractC7853.m24934()) {
                    c7859M24925 = abstractC7853.m24925();
                    String strM24970 = c7859M24925.m24970();
                    strM24970.hashCode();
                    switch (strM24970) {
                        case "frameset":
                            c5321.m16398(c7859M24925);
                            break;
                        case "html":
                            return c5321.m16421(c7859M24925, EnumC5322.f12916);
                        case "frame":
                            c5321.m16399(c7859M24925);
                            break;
                        case "noframes":
                            return c5321.m16421(c7859M24925, EnumC5322.f12913);
                        default:
                            c5321.m16372(this);
                            return false;
                    }
                } else if (abstractC7853.m24933() && abstractC7853.m24924().m24970().equals("frameset")) {
                    if (c5321.m4010("html")) {
                        c5321.m16372(this);
                        return false;
                    }
                    c5321.m25209();
                    if (!c5321.m16406() && !c5321.m4010("frameset")) {
                        c5321.m16439(EnumC5322.f12930);
                    }
                } else {
                    if (!abstractC7853.m24932()) {
                        c5321.m16372(this);
                        return false;
                    }
                    if (!c5321.m4010("html")) {
                        c5321.m16372(this);
                    }
                }
            }
            return true;
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final EnumC5322 f12930 = new EnumC5322("AfterFrameset", 20) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۟ۧ
        {
            C5331 c5331 = null;
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            if (EnumC5322.m16447(abstractC7853)) {
                c5321.m16395(abstractC7853.m24921());
                return true;
            }
            if (abstractC7853.m24930()) {
                c5321.m16397(abstractC7853.m24922());
                return true;
            }
            if (abstractC7853.m24931()) {
                c5321.m16372(this);
                return false;
            }
            if (abstractC7853.m24934() && abstractC7853.m24925().m24970().equals("html")) {
                return c5321.m16421(abstractC7853, EnumC5322.f12916);
            }
            if (abstractC7853.m24933() && abstractC7853.m24924().m24970().equals("html")) {
                c5321.m16439(EnumC5322.f12932);
                return true;
            }
            if (abstractC7853.m24934() && abstractC7853.m24925().m24970().equals("noframes")) {
                return c5321.m16421(abstractC7853, EnumC5322.f12913);
            }
            if (abstractC7853.m24932()) {
                return true;
            }
            c5321.m16372(this);
            return false;
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final EnumC5322 f12931 = new EnumC5322("AfterAfterBody", 21) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۟ۨ
        {
            C5331 c5331 = null;
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            if (abstractC7853.m24930()) {
                c5321.m16397(abstractC7853.m24922());
                return true;
            }
            if (abstractC7853.m24931() || (abstractC7853.m24934() && abstractC7853.m24925().m24970().equals("html"))) {
                return c5321.m16421(abstractC7853, EnumC5322.f12916);
            }
            if (EnumC5322.m16447(abstractC7853)) {
                c5321.m16396(abstractC7853.m24921(), c5321.m16380());
                return true;
            }
            if (abstractC7853.m24932()) {
                return true;
            }
            c5321.m16372(this);
            c5321.m16431();
            return c5321.mo16359(abstractC7853);
        }
    };

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final EnumC5322 f12932 = new EnumC5322("AfterAfterFrameset", 22) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۠
        {
            C5331 c5331 = null;
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            if (abstractC7853.m24930()) {
                c5321.m16397(abstractC7853.m24922());
                return true;
            }
            if (abstractC7853.m24931() || EnumC5322.m16447(abstractC7853) || (abstractC7853.m24934() && abstractC7853.m24925().m24970().equals("html"))) {
                return c5321.m16421(abstractC7853, EnumC5322.f12916);
            }
            if (abstractC7853.m24932()) {
                return true;
            }
            if (abstractC7853.m24934() && abstractC7853.m24925().m24970().equals("noframes")) {
                return c5321.m16421(abstractC7853, EnumC5322.f12913);
            }
            c5321.m16372(this);
            return false;
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final EnumC5322 f12933 = new EnumC5322("ForeignContent", 23) { // from class: Yue.ۥ۠ۤۧۢ.ۥ۟۟۠۟
        {
            C5331 c5331 = null;
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            int i = C5337.f1444[abstractC7853.f23476.ordinal()];
            if (i == 1) {
                c5321.m16397(abstractC7853.m24922());
            } else if (i == 2) {
                c5321.m16372(this);
            } else if (i == 3) {
                AbstractC7853.C7859 c7859M24925 = abstractC7853.m24925();
                if (C7615.m23811(c7859M24925.f23491, C5346.f12974)) {
                    return m16456(abstractC7853, c5321);
                }
                if (c7859M24925.f23491.equals("font") && (c7859M24925.m24964("color") || c7859M24925.m24964("face") || c7859M24925.m24964("size"))) {
                    return m16456(abstractC7853, c5321);
                }
                c5321.m16400(c7859M24925, c5321.m4009().m13813().m24557());
            } else if (i == 4) {
                AbstractC7853.C7858 c7858M24924 = abstractC7853.m24924();
                if (c7858M24924.f23491.equals("br") || c7858M24924.f23491.equals("p")) {
                    return m16456(abstractC7853, c5321);
                }
                if (c7858M24924.f23491.equals("script") && c5321.m25202("script", C6617.f16983)) {
                    c5321.m25209();
                    return true;
                }
                ArrayList<C4605> arrayListM16385 = c5321.m16385();
                if (arrayListM16385.isEmpty()) {
                    C8159.m26913("Stack unexpectedly empty");
                }
                int size = arrayListM16385.size() - 1;
                C4605 c4605 = arrayListM16385.get(size);
                if (!c4605.m19913(c7858M24924.f23491)) {
                    c5321.m16372(this);
                }
                while (size != 0) {
                    if (c4605.m19913(c7858M24924.f23491)) {
                        c5321.m16418(c4605.mo13700());
                        return true;
                    }
                    size--;
                    c4605 = arrayListM16385.get(size);
                    if (c4605.m13813().m24557().equals(C6617.f16980)) {
                        return m16456(abstractC7853, c5321);
                    }
                }
            } else if (i == 5) {
                AbstractC7853.C7854 c7854M24921 = abstractC7853.m24921();
                if (c7854M24921.m24941().equals(EnumC5322.f12934)) {
                    c5321.m16372(this);
                } else if (EnumC5322.m16447(c7854M24921)) {
                    c5321.m16395(c7854M24921);
                } else {
                    c5321.m16395(c7854M24921);
                    c5321.m16373(false);
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public boolean m16456(AbstractC7853 abstractC7853, C5321 c5321) {
            return c5321.m16437().mo16448(abstractC7853, c5321);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC5322[] f12935 = m2111();

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final String f12934 = String.valueOf((char) 0);

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۢ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public enum C5331 extends EnumC5322 {
        public C5331(String str, int i) {
            super(str, i, null);
        }

        @Override // Yue.EnumC5322
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321) {
            if (EnumC5322.m16447(abstractC7853)) {
                return true;
            }
            if (abstractC7853.m24930()) {
                c5321.m16397(abstractC7853.m24922());
            } else {
                if (!abstractC7853.m24931()) {
                    c5321.m16439(EnumC5322.f12911);
                    return c5321.mo16359(abstractC7853);
                }
                AbstractC7853.C7856 c7856M24923 = abstractC7853.m24923();
                C4486 c4486 = new C4486(c5321.f23783.m20992(c7856M24923.m24946()), c7856M24923.m24948(), c7856M24923.m24949());
                c4486.m13053(c7856M24923.m24947());
                c5321.m16380().m13710(c4486);
                c5321.m25207(c4486);
                if (c7856M24923.m24950()) {
                    c5321.m16380().m13006(C4483.EnumC0415.quirks);
                }
                c5321.m16439(EnumC5322.f12911);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۢ$ۥ۟۟۠۠, reason: contains not printable characters */
    public static /* synthetic */ class C5337 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f1444;

        static {
            int[] iArr = new int[AbstractC7853.EnumC7861.values().length];
            f1444 = iArr;
            try {
                iArr[AbstractC7853.EnumC7861.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1444[AbstractC7853.EnumC7861.Doctype.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1444[AbstractC7853.EnumC7861.StartTag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1444[AbstractC7853.EnumC7861.EndTag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1444[AbstractC7853.EnumC7861.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1444[AbstractC7853.EnumC7861.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۢ$ۥ۟۟ۡ, reason: contains not printable characters */
    public static final class C5346 {

        /* JADX INFO: renamed from: ۥ */
        public static final String[] f1445 = {"base", "basefont", "bgsound", "command", "link"};

        /* JADX INFO: renamed from: ۥ۟ */
        public static final String[] f1446 = {"noframes", "style"};

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final String[] f12937 = {C5905.f14739, "br", "html"};

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final String[] f12938 = {C5905.f14739, "br", "html"};

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final String[] f12939 = {C5905.f14739, "br", "head", "html"};

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final String[] f12940 = {"basefont", "bgsound", "link", "meta", "noframes", "style"};

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final String[] f12941 = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", C6468.f16546};

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final String[] f12942 = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", C7683.f23124, "nav", "ol", "p", "section", "summary", "ul"};

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final String[] f12943 = {"h1", "h2", "h3", "h4", "h5", "h6"};

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final String[] f12944 = {"address", "div", "p"};

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final String[] f12945 = {"dd", "dt"};

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final String[] f12946 = {"applet", "marquee", "object"};

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static final String[] f12947 = {"param", "source", "track"};

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static final String[] f12948 = {"action", "name", "prompt"};

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static final String[] f12949 = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static final String[] f12950 = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", C7683.f23124, "nav", "ol", "pre", "section", "summary", "ul"};

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static final String[] f12951 = {C5905.f14739, "dd", "dt", "html", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static final String[] f12952 = {C6608.f2171, "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static final String[] f12953 = {"table", "tbody", "tfoot", "thead", "tr"};

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final String[] f12954 = {"tbody", "tfoot", "thead"};

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static final String[] f12955 = {"td", "th", "tr"};

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final String[] f12956 = {"script", "style", "template"};

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static final String[] f12957 = {"td", "th"};

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static final String[] f12958 = {C5905.f14739, "caption", "col", "colgroup", "html"};

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static final String[] f12959 = {"table", "tbody", "tfoot", "thead", "tr"};

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static final String[] f12960 = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static final String[] f12961 = {C5905.f14739, "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static final String[] f12962 = {"table", "tbody", "tfoot", "thead", "tr"};

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static final String[] f12963 = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public static final String[] f12964 = {C5905.f14739, "caption", "col", "colgroup", "html", "td", "th", "tr"};

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public static final String[] f12965 = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public static final String[] f12966 = {C5905.f14739, "caption", "col", "colgroup", "html", "td", "th"};

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public static final String[] f12967 = {"input", "keygen", "textarea"};

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public static final String[] f12968 = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public static final String[] f12969 = {"tbody", "tfoot", "thead"};

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public static final String[] f12970 = {"head", "noscript"};

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public static final String[] f12971 = {C5905.f14739, "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public static final String[] f12972 = {"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", C6468.f16546};

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public static final String[] f12973 = {"caption", "colgroup", "tbody", "tfoot", "thead"};

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public static final String[] f12974 = {"b", "big", "blockquote", C5905.f14739, "br", "center", "code", "dd", "div", "dl", "dt", "em", "embed", "h1", "h2", "h3", "h4", "h5", "h6", "head", "hr", "i", "img", "li", "listing", C7683.f23124, "meta", "nobr", "ol", "p", "pre", "ruby", "s", "small", "span", "strike", "strong", "sub", "sup", "table", "tt", "u", "ul", "var"};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC5322(String str, int i) {
    }

    public static EnumC5322 valueOf(String str) {
        return (EnumC5322) Enum.valueOf(EnumC5322.class, str);
    }

    public static EnumC5322[] values() {
        return (EnumC5322[]) f12935.clone();
    }

    /* JADX INFO: renamed from: ۥ */
    public static /* synthetic */ EnumC5322[] m2111() {
        return new EnumC5322[]{f12910, f12911, f12912, f12913, f12914, f12915, f12916, f12917, f12918, f12919, f12920, f12921, f12922, f12923, f12924, f12925, f12926, f12927, f12928, f12929, f12930, f12931, f12932, f12933};
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m16445(AbstractC7853.C7859 c7859, C5321 c5321) {
        c5321.f23778.m25025(EnumC7866.f23545);
        c5321.m16409();
        c5321.m16439(f12917);
        c5321.m16398(c7859);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m16446(AbstractC7853.C7859 c7859, C5321 c5321) {
        c5321.f23778.m25025(EnumC7866.f23543);
        c5321.m16409();
        c5321.m16439(f12917);
        c5321.m16398(c7859);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m16447(AbstractC7853 abstractC7853) {
        if (abstractC7853.m24929()) {
            return C7615.m23815(abstractC7853.m24921().m24941());
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public abstract boolean mo16448(AbstractC7853 abstractC7853, C5321 c5321);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int) A[MD:(java.lang.String, int):void (m)] (LINE:2) call: Yue.ۥ۠ۤۧۢ.<init>(java.lang.String, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ EnumC5322(String str, int i, C5331 c5331) {
        this(str, i);
    }
}
