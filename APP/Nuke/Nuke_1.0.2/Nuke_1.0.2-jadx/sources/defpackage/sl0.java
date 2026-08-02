package defpackage;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import nuke.module.wechat.ai.AIChatConfig;
import nuke.module.wechat.ai.AIModelInfo;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sl0 implements Comparator {
    public static final sl0 b = new sl0(0);
    public static final sl0 c = new sl0(1);
    public static final sl0 d = new sl0(2);
    public static final sl0 e = new sl0(3);
    public static final sl0 f = new sl0(4);
    public final /* synthetic */ int a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [cj.<init>(sd, m13, java.util.List, e70, xl0):void, dq1.o(dq1, hg2, u00):java.lang.Object, eh1.<clinit>():void, mb1.<clinit>():void, ps.<clinit>():void, sb.r(java.lang.Object):java.lang.Object, sd.<init>(java.util.List, java.lang.String):void, se.<clinit>():void, sl0.<clinit>():void, sz0.s(java.io.File, java.io.File, pb1):void, v70.b(org.luckypray.dexkit.DexKitBridge, in0):void, v70.c(org.luckypray.dexkit.DexKitBridge, in0):void] */
    public /* synthetic */ sl0(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                pl0 pl0Var = (pl0) obj;
                pl0 pl0Var2 = (pl0) obj2;
                if (rp0.h0(pl0Var) && rp0.h0(pl0Var2)) {
                    r61 r61VarC0 = sp0.c0(pl0Var);
                    r61 r61VarC02 = sp0.c0(pl0Var2);
                    if (!t11.l(r61VarC0, r61VarC02)) {
                        Object[] objArr = new r61[16];
                        int i = 0;
                        while (r61VarC0 != null) {
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
                            objArr[0] = r61VarC0;
                            i++;
                            r61VarC0 = r61VarC0.u();
                        }
                        Object[] objArr3 = new r61[16];
                        int i3 = 0;
                        while (r61VarC02 != null) {
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
                            objArr3[0] = r61VarC02;
                            i3++;
                            r61VarC02 = r61VarC02.u();
                        }
                        int iMin = Math.min(i - 1, i3 - 1);
                        if (iMin >= 0) {
                            int i5 = 0;
                            while (t11.l(objArr[i5], objArr3[i5])) {
                                if (i5 != iMin) {
                                    i5++;
                                }
                            }
                            return t11.o(((r61) objArr[i5]).v(), ((r61) objArr3[i5]).v());
                        }
                        s.l("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (rp0.h0(pl0Var)) {
                        return -1;
                    }
                    if (rp0.h0(pl0Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                o62 o62VarH = ((qn2) obj).h();
                o62 o62VarH2 = ((qn2) obj2).h();
                int iCompare = Float.compare(o62VarH.a, o62VarH2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(o62VarH.b, o62VarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(o62VarH.d, o62VarH2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(o62VarH.c, o62VarH2.c);
            case 2:
                r61 r61Var = (r61) obj;
                r61 r61Var2 = (r61) obj2;
                int iO = t11.o(r61Var2.w, r61Var.w);
                return iO != 0 ? iO : t11.o(r61Var.hashCode(), r61Var2.hashCode());
            case 3:
                o62 o62VarH3 = ((qn2) obj).h();
                o62 o62VarH4 = ((qn2) obj2).h();
                int iCompare4 = Float.compare(o62VarH4.c, o62VarH3.c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(o62VarH3.b, o62VarH4.b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(o62VarH3.d, o62VarH4.d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(o62VarH4.a, o62VarH3.a);
            case 4:
                ow1 ow1Var = (ow1) obj;
                ow1 ow1Var2 = (ow1) obj2;
                int iCompare7 = Float.compare(((o62) ow1Var.h).b, ((o62) ow1Var2.h).b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((o62) ow1Var.h).d, ((o62) ow1Var2.h).d);
            case 5:
                return Integer.valueOf(((rd) obj).b).compareTo(Integer.valueOf(((rd) obj2).b));
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return Integer.valueOf(((rd) obj).b).compareTo(Integer.valueOf(((rd) obj2).b));
            case 7:
                return Boolean.valueOf(((s62) obj).d).compareTo(Boolean.valueOf(((s62) obj2).d));
            case 8:
                return Boolean.valueOf(((g33) obj).d).compareTo(Boolean.valueOf(((g33) obj2).d));
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
                        } else if (t11.o(cCharAt, cCharAt2) >= 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            case 10:
                r61 r61Var3 = (r61) obj;
                r61 r61Var4 = (r61) obj2;
                int iO2 = t11.o(r61Var3.w, r61Var4.w);
                return iO2 != 0 ? iO2 : t11.o(r61Var3.hashCode(), r61Var4.hashCode());
            case 11:
                return gf1.o(((us) obj).j, ((us) obj2).j);
            case 12:
                return gf1.o(((ug1) obj).k, ((ug1) obj2).k);
            case 13:
                return gf1.o(((File) obj).getName(), ((File) obj2).getName());
            case 14:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 15:
                return ((xs1) obj).b().compareTo(((xs1) obj2).b());
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
                return gf1.o((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case AIChatConfig.MaxContextRounds /* 20 */:
                return gf1.o(((File) obj).getName(), ((File) obj2).getName());
            case 21:
                return gf1.o(((z80) obj).b.c, ((z80) obj2).b.c);
            case 22:
                return gf1.o(((File) obj).getName(), ((File) obj2).getName());
            case 23:
                return gf1.o(((zf2) obj).a.getName(), ((zf2) obj2).a.getName());
            case 24:
                return gf1.o(((me1) obj).a, ((me1) obj2).a);
            case 25:
                return gf1.o(((tk2) obj).a, ((tk2) obj2).a);
            default:
                return Integer.valueOf(((jc3) obj).d.ordinal()).compareTo(Integer.valueOf(((jc3) obj2).d.ordinal()));
        }
    }
}
