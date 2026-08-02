package p000;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import nuke.module.wechat.p002ai.AIChatConfig;
import nuke.module.wechat.p002ai.AIModelInfo;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sl0 implements Comparator {

    /* JADX INFO: renamed from: b */
    public static final sl0 f10180b = new sl0(0);

    /* JADX INFO: renamed from: c */
    public static final sl0 f10181c = new sl0(1);

    /* JADX INFO: renamed from: d */
    public static final sl0 f10182d = new sl0(2);

    /* JADX INFO: renamed from: e */
    public static final sl0 f10183e = new sl0(3);

    /* JADX INFO: renamed from: f */
    public static final sl0 f10184f = new sl0(4);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10185a;

    public /* synthetic */ sl0(int i) {
        this.f10185a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10185a) {
            case 0:
                pl0 pl0Var = (pl0) obj;
                pl0 pl0Var2 = (pl0) obj2;
                if (rp0.m4547h0(pl0Var) && rp0.m4547h0(pl0Var2)) {
                    r61 r61VarM4933c0 = sp0.m4933c0(pl0Var);
                    r61 r61VarM4933c02 = sp0.m4933c0(pl0Var2);
                    if (!t11.m5086l(r61VarM4933c0, r61VarM4933c02)) {
                        Object[] objArr = new r61[16];
                        int i = 0;
                        while (r61VarM4933c0 != null) {
                            int i2 = i + 1;
                            if (objArr.length < i2) {
                                int length = objArr.length;
                                Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(objArr, 0, objArr2, 0, length);
                                objArr = objArr2;
                            }
                            if (i != 0) {
                                System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                            }
                            objArr[0] = r61VarM4933c0;
                            i++;
                            r61VarM4933c0 = r61VarM4933c0.m4389u();
                        }
                        Object[] objArr3 = new r61[16];
                        int i3 = 0;
                        while (r61VarM4933c02 != null) {
                            int i4 = i3 + 1;
                            if (objArr3.length < i4) {
                                int length2 = objArr3.length;
                                Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(objArr3, 0, objArr4, 0, length2);
                                objArr3 = objArr4;
                            }
                            if (i3 != 0) {
                                System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                            }
                            objArr3[0] = r61VarM4933c02;
                            i3++;
                            r61VarM4933c02 = r61VarM4933c02.m4389u();
                        }
                        int iMin = Math.min(i - 1, i3 - 1);
                        if (iMin >= 0) {
                            int i5 = 0;
                            while (t11.m5086l(objArr[i5], objArr3[i5])) {
                                if (i5 != iMin) {
                                    i5++;
                                }
                            }
                            return t11.m5089o(((r61) objArr[i5]).m4390v(), ((r61) objArr3[i5]).m4390v());
                        }
                        C0676s.m4653l("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (rp0.m4547h0(pl0Var)) {
                        return -1;
                    }
                    if (rp0.m4547h0(pl0Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                o62 o62VarM4207h = ((qn2) obj).m4207h();
                o62 o62VarM4207h2 = ((qn2) obj2).m4207h();
                int iCompare = Float.compare(o62VarM4207h.f7536a, o62VarM4207h2.f7536a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(o62VarM4207h.f7537b, o62VarM4207h2.f7537b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(o62VarM4207h.f7539d, o62VarM4207h2.f7539d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(o62VarM4207h.f7538c, o62VarM4207h2.f7538c);
            case 2:
                r61 r61Var = (r61) obj;
                r61 r61Var2 = (r61) obj2;
                int iM5089o = t11.m5089o(r61Var2.f9399w, r61Var.f9399w);
                return iM5089o != 0 ? iM5089o : t11.m5089o(r61Var.hashCode(), r61Var2.hashCode());
            case 3:
                o62 o62VarM4207h3 = ((qn2) obj).m4207h();
                o62 o62VarM4207h4 = ((qn2) obj2).m4207h();
                int iCompare4 = Float.compare(o62VarM4207h4.f7538c, o62VarM4207h3.f7538c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(o62VarM4207h3.f7537b, o62VarM4207h4.f7537b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(o62VarM4207h3.f7539d, o62VarM4207h4.f7539d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(o62VarM4207h4.f7536a, o62VarM4207h3.f7536a);
            case 4:
                ow1 ow1Var = (ow1) obj;
                ow1 ow1Var2 = (ow1) obj2;
                int iCompare7 = Float.compare(((o62) ow1Var.f7862h).f7537b, ((o62) ow1Var2.f7862h).f7537b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((o62) ow1Var.f7862h).f7539d, ((o62) ow1Var2.f7862h).f7539d);
            case 5:
                return Integer.valueOf(((C0652rd) obj).f9515b).compareTo(Integer.valueOf(((C0652rd) obj2).f9515b));
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return Integer.valueOf(((C0652rd) obj).f9515b).compareTo(Integer.valueOf(((C0652rd) obj2).f9515b));
            case 7:
                return Boolean.valueOf(((s62) obj).f9947d).compareTo(Boolean.valueOf(((s62) obj2).f9947d));
            case 8:
                return Boolean.valueOf(((g33) obj).f3301d).compareTo(Boolean.valueOf(((g33) obj2).f3301d));
            case 9:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int iMin2 = Math.min(str.length(), str2.length());
                int i6 = 4;
                while (true) {
                    if (i6 >= iMin2) {
                        int length3 = str.length();
                        int length4 = str2.length();
                        if (length3 == length4) {
                            return 0;
                        }
                        if (length3 >= length4) {
                            return 1;
                        }
                    } else {
                        char cCharAt = str.charAt(i6);
                        char cCharAt2 = str2.charAt(i6);
                        if (cCharAt == cCharAt2) {
                            i6++;
                        } else if (t11.m5089o(cCharAt, cCharAt2) >= 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            case 10:
                r61 r61Var3 = (r61) obj;
                r61 r61Var4 = (r61) obj2;
                int iM5089o2 = t11.m5089o(r61Var3.f9399w, r61Var4.f9399w);
                return iM5089o2 != 0 ? iM5089o2 : t11.m5089o(r61Var3.hashCode(), r61Var4.hashCode());
            case 11:
                return gf1.m1897o(((C0784us) obj).f11457j, ((C0784us) obj2).f11457j);
            case 12:
                return gf1.m1897o(((ug1) obj).f11292k, ((ug1) obj2).f11292k);
            case 13:
                return gf1.m1897o(((File) obj).getName(), ((File) obj2).getName());
            case 14:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 15:
                return ((xs1) obj).mo69b().compareTo(((xs1) obj2).mo69b());
            case 16:
                String id = ((AIModelInfo) obj).getId();
                Locale locale = Locale.ROOT;
                String lowerCase = id.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((AIModelInfo) obj2).getId().toLowerCase(locale);
                lowerCase2.getClass();
                return lowerCase.compareTo(lowerCase2);
            case 17:
                Method method = (Method) obj;
                Method method2 = (Method) obj2;
                return (method.getDeclaringClass() + method.getName() + Arrays.toString(method.getParameterTypes()) + method.getReturnType()).compareTo(method2.getDeclaringClass() + method2.getName() + Arrays.toString(method2.getParameterTypes()) + method2.getReturnType());
            case 18:
                return Long.valueOf(((Number) ((Map.Entry) obj).getValue()).longValue()).compareTo(Long.valueOf(((Number) ((Map.Entry) obj2).getValue()).longValue()));
            case 19:
                return gf1.m1897o((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case AIChatConfig.MaxContextRounds /* 20 */:
                return gf1.m1897o(((File) obj).getName(), ((File) obj2).getName());
            case 21:
                return gf1.m1897o(((z80) obj).f13783b.f10774c, ((z80) obj2).f13783b.f10774c);
            case 22:
                return gf1.m1897o(((File) obj).getName(), ((File) obj2).getName());
            case 23:
                return gf1.m1897o(((zf2) obj).f13876a.getName(), ((zf2) obj2).f13876a.getName());
            case 24:
                return gf1.m1897o(((me1) obj).f6584a, ((me1) obj2).f6584a);
            case 25:
                return gf1.m1897o(((tk2) obj).f10817a, ((tk2) obj2).f10817a);
            default:
                return Integer.valueOf(((jc3) obj).f4967d.ordinal()).compareTo(Integer.valueOf(((jc3) obj2).f4967d.ordinal()));
        }
    }
}
