package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ xk1 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ h0(xk1 xk1Var, int i) {
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
                xk1Var.setValue(str);
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                xk1Var.setValue(str2);
                break;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                xk1Var.setValue(str3);
                break;
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                xk1Var.setValue(str4);
                break;
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                xk1Var.setValue(str5);
                break;
            case 5:
                String str6 = (String) obj;
                str6.getClass();
                xk1Var.setValue(str6);
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                String str7 = (String) obj;
                str7.getClass();
                xk1Var.setValue(str7);
                break;
            case 7:
                c1 c1Var = (c1) obj;
                c1Var.getClass();
                xk1Var.setValue(c1Var);
                break;
            case 8:
                String str8 = (String) obj;
                str8.getClass();
                xk1Var.setValue(str8);
                break;
            case 9:
                String str9 = (String) obj;
                str9.getClass();
                xk1Var.setValue(str9);
                break;
            case 10:
                xk1Var.setValue((c61) obj);
                break;
            case 11:
                String str10 = (String) obj;
                str10.getClass();
                xk1Var.setValue(str10);
                break;
            case 12:
                String str11 = (String) obj;
                str11.getClass();
                xk1Var.setValue(str11);
                break;
            case 13:
                String str12 = (String) obj;
                str12.getClass();
                xk1Var.setValue(str12);
                break;
            case 14:
                String str13 = (String) obj;
                str13.getClass();
                StringBuilder sb = new StringBuilder();
                int length = str13.length();
                while (i2 < length) {
                    char cCharAt = str13.charAt(i2);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                    i2++;
                }
                xk1Var.setValue(pv2.H0(sb.toString(), 5));
                break;
            case 15:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                xk1Var.setValue(bool);
                break;
            case 16:
                String str14 = (String) obj;
                str14.getClass();
                xk1Var.setValue(str14);
                break;
            case 17:
                String str15 = (String) obj;
                str15.getClass();
                xk1Var.setValue(str15);
                break;
            case 18:
                Integer num = (Integer) obj;
                num.intValue();
                xk1Var.setValue(num);
                break;
            case 19:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                xk1Var.setValue(bool2);
                break;
            case AIChatConfig.MaxContextRounds /* 20 */:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                xk1Var.setValue(bool3);
                break;
            case 21:
                String str16 = (String) obj;
                str16.getClass();
                xk1Var.setValue(str16);
                break;
            case 22:
                String str17 = (String) obj;
                str17.getClass();
                xk1Var.setValue(str17);
                break;
            case 23:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                xk1Var.setValue(bool4);
                break;
            case 24:
                String str18 = (String) obj;
                str18.getClass();
                StringBuilder sb2 = new StringBuilder();
                int length2 = str18.length();
                while (i2 < length2) {
                    char cCharAt2 = str18.charAt(i2);
                    if (Character.isDigit(cCharAt2)) {
                        sb2.append(cCharAt2);
                    }
                    i2++;
                }
                xk1Var.setValue(pv2.H0(sb2.toString(), 5));
                break;
            case 25:
                xk1Var.setValue((c61) obj);
                break;
            case 26:
                String str19 = (String) obj;
                str19.getClass();
                xk1Var.setValue(str19);
                break;
            case 27:
                String str20 = (String) obj;
                str20.getClass();
                xk1Var.setValue(str20);
                break;
            case 28:
                String str21 = (String) obj;
                str21.getClass();
                StringBuilder sb3 = new StringBuilder();
                int length3 = str21.length();
                while (i2 < length3) {
                    char cCharAt3 = str21.charAt(i2);
                    if (Character.isDigit(cCharAt3)) {
                        sb3.append(cCharAt3);
                    }
                    i2++;
                }
                xk1Var.setValue(pv2.H0(sb3.toString(), 5));
                break;
            default:
                String str22 = (String) obj;
                str22.getClass();
                StringBuilder sb4 = new StringBuilder();
                int length4 = str22.length();
                while (i2 < length4) {
                    char cCharAt4 = str22.charAt(i2);
                    if (Character.isDigit(cCharAt4)) {
                        sb4.append(cCharAt4);
                    }
                    i2++;
                }
                xk1Var.setValue(pv2.H0(sb4.toString(), 5));
                break;
        }
        return a83Var;
    }
}
