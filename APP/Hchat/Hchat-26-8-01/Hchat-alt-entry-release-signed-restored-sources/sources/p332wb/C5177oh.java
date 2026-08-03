package p332wb;

import p025bc.AbstractC0255e;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import ua.C4298i;

/* JADX INFO: renamed from: wb.oh */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5177oh implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19409g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f19410h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5177oh(InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f19409g = i9;
        this.f19410h = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f19409g) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f19410h.setValue(bool);
                break;
            case 1:
                this.f19410h.setValue(((Boolean) obj).booleanValue() ? "exclude" : "block");
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                this.f19410h.setValue(str);
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                this.f19410h.setValue(str2);
                break;
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                this.f19410h.setValue(str3);
                break;
            case 5:
                EnumC4966i2 enumC4966i2 = (EnumC4966i2) obj;
                enumC4966i2.getClass();
                this.f19410h.setValue(enumC4966i2);
                break;
            case 6:
                String str4 = (String) obj;
                str4.getClass();
                this.f19410h.setValue(str4);
                break;
            case 7:
                Integer num = (Integer) obj;
                num.intValue();
                this.f19410h.setValue(num);
                break;
            case 8:
                String str5 = (String) obj;
                AbstractC0255e.m1029r(str5, str5, 19, this.f19410h);
                break;
            case 9:
                String str6 = (String) obj;
                str6.getClass();
                this.f19410h.setValue(str6);
                break;
            case 10:
                String str7 = (String) obj;
                str7.getClass();
                this.f19410h.setValue(str7);
                break;
            case 11:
                String str8 = (String) obj;
                str8.getClass();
                this.f19410h.setValue(str8);
                break;
            case 12:
                int iIntValue = ((Integer) obj).intValue();
                InterfaceC1809a1 interfaceC1809a1 = this.f19410h;
                interfaceC1809a1.setValue(C4298i.m8633a((C4298i) interfaceC1809a1.getValue(), null, false, 0, 0L, 0L, 0L, null, iIntValue, null, null, false, 0, null, 0, 0, null, false, 0, 0, false, null, false, false, false, 0, false, null, null, null, false, null, -257, 1));
                break;
            case 13:
                String str9 = (String) obj;
                str9.getClass();
                InterfaceC1809a1 interfaceC1809a12 = this.f19410h;
                interfaceC1809a12.setValue(C4298i.m8633a((C4298i) interfaceC1809a12.getValue(), null, false, 0, 0L, 0L, 0L, null, 0, null, null, false, 0, null, 0, 0, null, false, 0, AbstractC4955ho.m9723z6(((C4298i) interfaceC1809a12.getValue()).f14319t, str9), false, null, false, false, false, 0, false, null, null, null, false, null, -524289, 1));
                break;
            case 14:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                InterfaceC1809a1 interfaceC1809a13 = this.f19410h;
                interfaceC1809a13.setValue(C4298i.m8633a((C4298i) interfaceC1809a13.getValue(), null, false, 0, 0L, 0L, 0L, null, 0, null, null, zBooleanValue, 0, null, 0, 0, null, false, 0, 0, false, null, false, false, false, 0, false, null, null, null, false, null, -2049, 1));
                break;
            case 15:
                int iIntValue2 = ((Integer) obj).intValue();
                InterfaceC1809a1 interfaceC1809a14 = this.f19410h;
                interfaceC1809a14.setValue(C4298i.m8633a((C4298i) interfaceC1809a14.getValue(), null, false, 0, 0L, 0L, 0L, null, 0, null, null, false, iIntValue2, null, 0, 0, null, false, 0, 0, false, null, false, false, false, 0, false, null, null, null, false, null, -4097, 1));
                break;
            case 16:
                String str10 = (String) obj;
                str10.getClass();
                InterfaceC1809a1 interfaceC1809a15 = this.f19410h;
                C4298i c4298i = (C4298i) interfaceC1809a15.getValue();
                StringBuilder sb2 = new StringBuilder();
                int length = str10.length();
                for (int i9 = 0; i9 < length; i9++) {
                    char cCharAt = str10.charAt(i9);
                    if (Character.isDigit(cCharAt) || cCharAt == '.') {
                        sb2.append(cCharAt);
                    }
                }
                interfaceC1809a15.setValue(C4298i.m8633a(c4298i, null, false, 0, 0L, 0L, 0L, null, 0, null, null, false, 0, sb2.toString(), 0, 0, null, false, 0, 0, false, null, false, false, false, 0, false, null, null, null, false, null, -8193, 1));
                break;
            case 17:
                int iIntValue3 = ((Integer) obj).intValue();
                InterfaceC1809a1 interfaceC1809a16 = this.f19410h;
                interfaceC1809a16.setValue(C4298i.m8633a((C4298i) interfaceC1809a16.getValue(), null, false, 0, 0L, 0L, 0L, null, 0, null, null, false, 0, null, iIntValue3, 0, null, false, 0, 0, false, null, false, false, false, 0, false, null, null, null, false, null, -16385, 1));
                break;
            case 18:
                int iIntValue4 = ((Integer) obj).intValue();
                InterfaceC1809a1 interfaceC1809a17 = this.f19410h;
                interfaceC1809a17.setValue(C4298i.m8633a((C4298i) interfaceC1809a17.getValue(), null, false, 0, 0L, 0L, 0L, null, 0, null, null, false, 0, null, 0, iIntValue4, null, false, 0, 0, false, null, false, false, false, 0, false, null, null, null, false, null, -32769, 1));
                break;
            case 19:
                String str11 = (String) obj;
                str11.getClass();
                InterfaceC1809a1 interfaceC1809a18 = this.f19410h;
                interfaceC1809a18.setValue(C4298i.m8633a((C4298i) interfaceC1809a18.getValue(), null, false, 0, 0L, 0L, 0L, null, 0, null, null, false, 0, null, 0, 0, str11, false, 0, 0, false, null, false, false, false, 0, false, null, null, null, false, null, -65537, 1));
                break;
            case 20:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                InterfaceC1809a1 interfaceC1809a19 = this.f19410h;
                interfaceC1809a19.setValue(C4298i.m8633a((C4298i) interfaceC1809a19.getValue(), null, false, 0, 0L, 0L, 0L, null, 0, null, null, false, 0, null, 0, 0, null, zBooleanValue2, 0, 0, false, null, false, false, false, 0, false, null, null, null, false, null, -131073, 1));
                break;
            case 21:
                String str12 = (String) obj;
                str12.getClass();
                InterfaceC1809a1 interfaceC1809a110 = this.f19410h;
                interfaceC1809a110.setValue(C4298i.m8633a((C4298i) interfaceC1809a110.getValue(), null, false, 0, 0L, 0L, 0L, null, 0, null, null, false, 0, null, 0, 0, null, false, AbstractC4955ho.m9723z6(((C4298i) interfaceC1809a110.getValue()).f14318s, str12), 0, false, null, false, false, false, 0, false, null, null, null, false, null, -262145, 1));
                break;
            case 22:
                String str13 = (String) obj;
                str13.getClass();
                this.f19410h.setValue(str13);
                break;
            case 23:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.f19410h.setValue(bool2);
                break;
            case 24:
                String str14 = (String) obj;
                str14.getClass();
                this.f19410h.setValue(str14);
                break;
            case 25:
                String str15 = (String) obj;
                str15.getClass();
                this.f19410h.setValue(str15);
                break;
            case 26:
                String str16 = (String) obj;
                str16.getClass();
                this.f19410h.setValue(str16);
                break;
            case 27:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                this.f19410h.setValue(bool3);
                break;
            case 28:
                EnumC4966i2 enumC4966i22 = (EnumC4966i2) obj;
                enumC4966i22.getClass();
                this.f19410h.setValue(enumC4966i22);
                break;
            default:
                String str17 = (String) obj;
                str17.getClass();
                this.f19410h.setValue(str17);
                break;
        }
        return C3967n.f12976a;
    }
}
