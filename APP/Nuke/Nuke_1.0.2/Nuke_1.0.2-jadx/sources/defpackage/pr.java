package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pr implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ xk1 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ pr(xk1 xk1Var, int i) {
        this.h = i;
        this.i = xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        int i2 = 0;
        a83 a83Var = a83.a;
        xk1 xk1Var = this.i;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                while (i2 < length) {
                    char cCharAt = str.charAt(i2);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                    i2++;
                }
                xk1Var.setValue(pv2.H0(sb.toString(), 8));
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                xk1Var.setValue(bool);
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                xk1Var.setValue(bool2);
                break;
            case 3:
                gr grVar = (gr) obj;
                grVar.getClass();
                xk1Var.setValue(grVar);
                break;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                xk1Var.setValue(str2);
                break;
            case 5:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                xk1Var.setValue(bool3);
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                er erVar = (er) obj;
                erVar.getClass();
                xk1Var.setValue(erVar);
                break;
            case 7:
                ir irVar = (ir) obj;
                irVar.getClass();
                xk1Var.setValue(irVar);
                break;
            case 8:
                String str3 = (String) obj;
                str3.getClass();
                StringBuilder sb2 = new StringBuilder();
                int length2 = str3.length();
                while (i2 < length2) {
                    char cCharAt2 = str3.charAt(i2);
                    if (Character.isDigit(cCharAt2)) {
                        sb2.append(cCharAt2);
                    }
                    i2++;
                }
                xk1Var.setValue(sb2.toString());
                break;
            case 9:
                String str4 = (String) obj;
                str4.getClass();
                xk1Var.setValue(str4);
                break;
            case 10:
                String str5 = (String) obj;
                str5.getClass();
                xk1Var.setValue(str5);
                break;
            case 11:
                String str6 = (String) obj;
                str6.getClass();
                StringBuilder sb3 = new StringBuilder();
                int length3 = str6.length();
                while (i2 < length3) {
                    char cCharAt3 = str6.charAt(i2);
                    if (Character.isDigit(cCharAt3)) {
                        sb3.append(cCharAt3);
                    }
                    i2++;
                }
                xk1Var.setValue(sb3.toString());
                break;
            case 12:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                xk1Var.setValue(bool4);
                break;
            case 13:
                c61 c61Var = (c61) obj;
                c61Var.getClass();
                xk1Var.setValue(new rs1(c61Var.M(0L)));
                break;
            case 14:
                xk1Var.setValue(new h11(((h11) obj).a));
                break;
            case 15:
                xk1Var.setValue(new h11(((h11) obj).a));
                break;
            case 16:
                c61 c61Var2 = (c61) obj;
                c61Var2.getClass();
                xk1Var.setValue(c61Var2);
                break;
            case 17:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                xk1Var.setValue(bool5);
                break;
            case 18:
                kl0 kl0Var = (kl0) obj;
                kl0Var.getClass();
                xk1Var.setValue(Boolean.valueOf(kl0Var.a()));
                break;
            case 19:
                String str7 = (String) obj;
                str7.getClass();
                xk1Var.setValue(str7);
                break;
            case AIChatConfig.MaxContextRounds /* 20 */:
                xk1Var.setValue((c61) obj);
                break;
            case 21:
                String str8 = (String) obj;
                str8.getClass();
                xk1Var.setValue(str8);
                break;
            case 22:
                Float f = (Float) obj;
                f.getClass();
                break;
            case 23:
                break;
            case 24:
                ((in0) xk1Var.getValue()).j((rs1) obj);
                break;
            case 25:
                xk1Var.setValue(new h11(((h11) obj).a));
                break;
            case 26:
                xk1Var.setValue(new h11(((h11) obj).a));
                break;
            default:
                String str9 = (String) obj;
                str9.getClass();
                xk1Var.setValue(str9);
                break;
        }
        return a83Var;
    }
}
