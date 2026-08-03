package p332wb;

import p025bc.AbstractC0255e;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p129ig.AbstractC2043a;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.hd */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4944hd implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17592g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f17593h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4944hd(InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f17592g = i9;
        this.f17593h = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        String str;
        int i9;
        switch (this.f17592g) {
            case 0:
            case 1:
            case 2:
                str = (String) obj;
                i9 = 8;
                AbstractC0255e.m1029r(str, str, i9, this.f17593h);
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                this.f17593h.setValue(str2);
                break;
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                this.f17593h.setValue(str3);
                break;
            case 5:
                String str4 = (String) obj;
                str4.getClass();
                StringBuilder sb2 = new StringBuilder();
                int length = str4.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = str4.charAt(i10);
                    if (Character.isDigit(cCharAt) || cCharAt == '.' || cCharAt == ',') {
                        sb2.append(cCharAt);
                    }
                }
                this.f17593h.setValue(sb2.toString());
                break;
            case 6:
                String str5 = (String) obj;
                str5.getClass();
                this.f17593h.setValue(str5);
                break;
            case 7:
                String str6 = (String) obj;
                str6.getClass();
                StringBuilder sb3 = new StringBuilder();
                int length2 = str6.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    char cCharAt2 = str6.charAt(i11);
                    if (Character.isDigit(cCharAt2) || cCharAt2 == '.' || cCharAt2 == ',') {
                        sb3.append(cCharAt2);
                    }
                }
                this.f17593h.setValue(sb3.toString());
                break;
            case 8:
                String str7 = (String) obj;
                str7.getClass();
                this.f17593h.setValue(str7);
                break;
            case 9:
                String str8 = (String) obj;
                str8.getClass();
                StringBuilder sb4 = new StringBuilder();
                int length3 = str8.length();
                for (int i12 = 0; i12 < length3; i12++) {
                    char cCharAt3 = str8.charAt(i12);
                    if (Character.isDigit(cCharAt3) || cCharAt3 == '.' || cCharAt3 == ',') {
                        sb4.append(cCharAt3);
                    }
                }
                this.f17593h.setValue(sb4.toString());
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                str = (String) obj;
                i9 = 19;
                AbstractC0255e.m1029r(str, str, i9, this.f17593h);
                break;
            case 18:
                this.f17593h.setValue(Float.valueOf(AbstractC2043a.m5018X(AbstractC3754e0.m7907q(((Float) obj).floatValue(), 0.1f, 0.5f) * 100.0f) / 100.0f));
                break;
            case 19:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.f17593h.setValue(bool);
                break;
            case 20:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.f17593h.setValue(bool2);
                break;
            case 21:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                this.f17593h.setValue(bool3);
                break;
            case 22:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                this.f17593h.setValue(bool4);
                break;
            case 23:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                this.f17593h.setValue(bool5);
                break;
            case 24:
                String str9 = (String) obj;
                str9.getClass();
                this.f17593h.setValue(str9);
                break;
            case 25:
                String str10 = (String) obj;
                str10.getClass();
                this.f17593h.setValue(str10);
                break;
            case 26:
                String str11 = (String) obj;
                str11.getClass();
                this.f17593h.setValue(str11);
                break;
            case 27:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                this.f17593h.setValue(bool6);
                break;
            case 28:
                String str12 = (String) obj;
                str12.getClass();
                this.f17593h.setValue(str12);
                break;
            default:
                String str13 = (String) obj;
                str13.getClass();
                this.f17593h.setValue(str13);
                break;
        }
        return C3967n.f12976a;
    }
}
