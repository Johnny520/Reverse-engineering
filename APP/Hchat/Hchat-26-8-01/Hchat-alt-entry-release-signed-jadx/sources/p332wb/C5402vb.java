package p332wb;

import ac.AbstractC0063p;
import android.content.SharedPreferences;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p126ia.C2007a0;
import p126ia.C2030x;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.vb */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5402vb implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21355g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f21356h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f21357i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f21358j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5402vb(SharedPreferences sharedPreferences, String str, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f21355g = i9;
        this.f21356h = sharedPreferences;
        this.f21357i = str;
        this.f21358j = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f21355g) {
            case 0:
                SharedPreferences sharedPreferences = this.f21356h;
                String str = this.f21357i;
                InterfaceC1809a1 interfaceC1809a1 = this.f21358j;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                interfaceC1809a1.setValue(bool);
                sharedPreferences.edit().putBoolean(str, zBooleanValue).commit();
                break;
            case 1:
                SharedPreferences sharedPreferences2 = this.f21356h;
                String str2 = this.f21357i;
                InterfaceC1809a1 interfaceC1809a12 = this.f21358j;
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                interfaceC1809a12.setValue(bool2);
                sharedPreferences2.edit().putBoolean(str2, zBooleanValue2).commit();
                break;
            case 2:
                SharedPreferences sharedPreferences3 = this.f21356h;
                String str3 = (String) obj;
                AbstractC4855en.m9258b(str3, this.f21358j, str3, sharedPreferences3).putString(this.f21357i, str3).apply();
                break;
            case 3:
                SharedPreferences sharedPreferences4 = this.f21356h;
                String str4 = this.f21357i;
                InterfaceC1809a1 interfaceC1809a13 = this.f21358j;
                Boolean bool3 = (Boolean) obj;
                boolean zBooleanValue3 = bool3.booleanValue();
                interfaceC1809a13.setValue(bool3);
                sharedPreferences4.edit().putBoolean(str4, zBooleanValue3).commit();
                break;
            case 4:
            case 6:
            case 7:
            case 8:
                Boolean bool4 = (Boolean) obj;
                AbstractC4855en.m9269m(this.f21358j, bool4, this.f21356h, this.f21357i, bool4.booleanValue());
                break;
            case 5:
                SharedPreferences sharedPreferences5 = this.f21356h;
                String str5 = this.f21357i;
                InterfaceC1809a1 interfaceC1809a14 = this.f21358j;
                Boolean bool5 = (Boolean) obj;
                boolean zBooleanValue4 = bool5.booleanValue();
                interfaceC1809a14.setValue(bool5);
                sharedPreferences5.edit().putBoolean(str5, zBooleanValue4).commit();
                C2007a0 c2007a0 = AbstractC0063p.f216b;
                if (c2007a0 != null) {
                    c2007a0.m4959r(new C2030x(c2007a0, 1));
                }
                return C3967n.f12976a;
            case 9:
                String str6 = (String) obj;
                AbstractC4855en.m9258b(str6, this.f21358j, str6, this.f21356h).putString(AbstractC4955ho.m9396N5("group_member_reply_prompt_type", this.f21357i), str6).apply();
                break;
            case 10:
                String str7 = (String) obj;
                AbstractC4855en.m9258b(str7, this.f21358j, str7, this.f21356h).putString(AbstractC4955ho.m9396N5("group_member_reply_both_order", this.f21357i), str7).apply();
                break;
            case 11:
                String str8 = (String) obj;
                AbstractC4855en.m9258b(str8, this.f21358j, str8, this.f21356h).putString(AbstractC4955ho.m9380L5(this.f21357i), str8).apply();
                break;
            case 12:
                String str9 = (String) obj;
                AbstractC4855en.m9258b(str9, this.f21358j, str9, this.f21356h).putString(AbstractC4955ho.m9412P5(this.f21357i), str9).apply();
                break;
            default:
                String str10 = (String) obj;
                AbstractC4855en.m9258b(str10, this.f21358j, str10, this.f21356h).putString(AbstractC4955ho.m9396N5("group_member_reply_media_order", this.f21357i), str10).apply();
                break;
        }
        return C3967n.f12976a;
    }
}
