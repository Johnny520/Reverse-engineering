package p332wb;

import java.util.List;
import p025bc.AbstractC0255e;
import p071f1.InterfaceC0998d0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import p293u2.C4241k;
import p293u2.C4242l;
import p308v1.InterfaceC4428t;

/* JADX INFO: renamed from: wb.lp */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5086lp implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18769g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f18770h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5086lp(InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f18769g = i9;
        this.f18770h = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        String str;
        int i9;
        switch (this.f18769g) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.f18770h.setValue(bool);
                break;
            case 1:
                str = (String) obj;
                i9 = 1000;
                AbstractC0255e.m1029r(str, str, i9, this.f18770h);
                break;
            case 2:
            case 17:
                str = (String) obj;
                i9 = 32;
                AbstractC0255e.m1029r(str, str, i9, this.f18770h);
                break;
            case 3:
                this.f18770h.setValue(Float.valueOf((int) (((C4242l) obj).f13918a & 4294967295L)));
                break;
            case 4:
                InterfaceC0998d0 interfaceC0998d0 = (InterfaceC0998d0) obj;
                interfaceC0998d0.getClass();
                interfaceC0998d0.mo2549s(((Number) this.f18770h.getValue()).floatValue());
                break;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                this.f18770h.setValue(str2);
                break;
            case 6:
                String str3 = (String) obj;
                str3.getClass();
                this.f18770h.setValue(str3);
                break;
            case 7:
                String str4 = (String) obj;
                str4.getClass();
                this.f18770h.setValue(str4);
                break;
            case 8:
                String str5 = (String) obj;
                str5.getClass();
                this.f18770h.setValue(str5);
                break;
            case 9:
                List list = (List) obj;
                list.getClass();
                this.f18770h.setValue(list);
                break;
            case 10:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.f18770h.setValue(bool2);
                break;
            case 11:
                String str6 = (String) obj;
                str6.getClass();
                StringBuilder sb2 = new StringBuilder();
                int length = str6.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = str6.charAt(i10);
                    if (Character.isDigit(cCharAt)) {
                        sb2.append(cCharAt);
                    }
                }
                this.f18770h.setValue(sb2.toString());
                break;
            case 12:
                String str7 = (String) obj;
                str7.getClass();
                this.f18770h.setValue(str7);
                break;
            case 13:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                this.f18770h.setValue(bool3);
                break;
            case 14:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                this.f18770h.setValue(bool4);
                break;
            case 15:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                this.f18770h.setValue(bool5);
                break;
            case 16:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                this.f18770h.setValue(bool6);
                break;
            case 18:
                String str8 = (String) obj;
                str8.getClass();
                this.f18770h.setValue(str8);
                break;
            case 19:
                String str9 = (String) obj;
                str9.getClass();
                this.f18770h.setValue(str9);
                break;
            case 20:
                String str10 = (String) obj;
                str10.getClass();
                this.f18770h.setValue(str10);
                break;
            case 21:
                String str11 = (String) obj;
                str11.getClass();
                this.f18770h.setValue(str11);
                break;
            case 22:
                String str12 = (String) obj;
                str12.getClass();
                this.f18770h.setValue(str12);
                break;
            case 23:
                String str13 = (String) obj;
                str13.getClass();
                this.f18770h.setValue(str13);
                break;
            case 24:
                String str14 = (String) obj;
                str14.getClass();
                this.f18770h.setValue(str14);
                break;
            case 25:
                String str15 = (String) obj;
                str15.getClass();
                this.f18770h.setValue(str15);
                break;
            case 26:
                InterfaceC4428t interfaceC4428t = (InterfaceC4428t) obj;
                interfaceC4428t.getClass();
                this.f18770h.setValue(Integer.valueOf((int) (interfaceC4428t.mo8858F() & 4294967295L)));
                break;
            case 27:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f18770h.getValue();
                if (interfaceC1220a != null) {
                    interfaceC1220a.invoke();
                }
                break;
            case 28:
                this.f18770h.setValue(new C4242l(((C4242l) obj).f13918a));
                break;
            default:
                InterfaceC4428t interfaceC4428t2 = (InterfaceC4428t) obj;
                interfaceC4428t2.getClass();
                InterfaceC4428t interfaceC4428tMo8863b0 = interfaceC4428t2.mo8863b0();
                if (interfaceC4428tMo8863b0 != null) {
                    long jMo8867m = interfaceC4428tMo8863b0.mo8867m(0L);
                    int i11 = (int) (jMo8867m >> 32);
                    int i12 = (int) (jMo8867m & 4294967295L);
                    this.f18770h.setValue(new C4241k((int) Float.intBitsToFloat(i11), (int) Float.intBitsToFloat(i12), ((int) Float.intBitsToFloat(i11)) + ((int) (interfaceC4428tMo8863b0.mo8858F() >> 32)), ((int) Float.intBitsToFloat(i12)) + ((int) (4294967295L & interfaceC4428tMo8863b0.mo8858F()))));
                }
                break;
        }
        return C3967n.f12976a;
    }
}
