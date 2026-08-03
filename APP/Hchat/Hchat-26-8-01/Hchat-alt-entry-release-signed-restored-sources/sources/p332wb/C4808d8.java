package p332wb;

import android.content.SharedPreferences;
import p085fg.InterfaceC1220a;
import p117i0.AbstractC1874r;

/* JADX INFO: renamed from: wb.d8 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4808d8 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16553g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f16554h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f16555i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f16556j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4808d8(SharedPreferences sharedPreferences, String str, String str2, int i9) {
        this.f16553g = i9;
        this.f16554h = sharedPreferences;
        this.f16555i = str;
        this.f16556j = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f16553g) {
            case 0:
                return AbstractC1874r.m4639u(AbstractC4955ho.m9420Q5(this.f16554h, "group_member_reply_join_text", this.f16555i, this.f16556j));
            case 1:
                return AbstractC1874r.m4639u(AbstractC4955ho.m9420Q5(this.f16554h, "group_member_reply_left_text", this.f16555i, this.f16556j));
            case 2:
                return AbstractC1874r.m4639u(AbstractC4955ho.m9420Q5(this.f16554h, "group_member_reply_join_card_title", this.f16555i, this.f16556j));
            case 3:
                return AbstractC1874r.m4639u(AbstractC4955ho.m9420Q5(this.f16554h, "group_member_reply_join_card_desc", this.f16555i, this.f16556j));
            case 4:
                return AbstractC1874r.m4639u(AbstractC4955ho.m9420Q5(this.f16554h, "group_member_reply_left_card_title", this.f16555i, this.f16556j));
            case 5:
                return AbstractC1874r.m4639u(AbstractC4955ho.m9420Q5(this.f16554h, "group_member_reply_left_card_desc", this.f16555i, this.f16556j));
            case 6:
                String str = this.f16555i;
                str.getClass();
                String strConcat = "group_rename_both_order_".concat(str);
                SharedPreferences sharedPreferences = this.f16554h;
                String str2 = this.f16556j;
                String string = sharedPreferences.getString(strConcat, str2);
                if (string != null) {
                    str2 = string;
                }
                return AbstractC1874r.m4639u(str2);
            case 7:
                String str3 = this.f16555i;
                str3.getClass();
                String strConcat2 = "group_rename_text_".concat(str3);
                SharedPreferences sharedPreferences2 = this.f16554h;
                String str4 = this.f16556j;
                String string2 = sharedPreferences2.getString(strConcat2, str4);
                if (string2 != null) {
                    str4 = string2;
                }
                return AbstractC1874r.m4639u(str4);
            case 8:
                String str5 = this.f16555i;
                str5.getClass();
                String strConcat3 = "group_rename_card_title_".concat(str5);
                SharedPreferences sharedPreferences3 = this.f16554h;
                String str6 = this.f16556j;
                String string3 = sharedPreferences3.getString(strConcat3, str6);
                if (string3 != null) {
                    str6 = string3;
                }
                return AbstractC1874r.m4639u(str6);
            default:
                String str7 = this.f16555i;
                str7.getClass();
                String strConcat4 = "group_rename_card_desc_".concat(str7);
                SharedPreferences sharedPreferences4 = this.f16554h;
                String str8 = this.f16556j;
                String string4 = sharedPreferences4.getString(strConcat4, str8);
                if (string4 != null) {
                    str8 = string4;
                }
                return AbstractC1874r.m4639u(str8);
        }
    }
}
