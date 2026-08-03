package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.Set;
import okhttp3.HttpUrl;
import p085fg.InterfaceC1220a;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3156t;
import p276sf.C3967n;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.lc */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5073lc implements InterfaceC1220a {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ InterfaceC1809a1 f18588A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ InterfaceC1809a1 f18589B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ InterfaceC1809a1 f18590C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ InterfaceC1809a1 f18591D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC1809a1 f18592E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ String f18593F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC1809a1 f18594G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f18595H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC1809a1 f18596I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC1809a1 f18597J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ InterfaceC1809a1 f18598K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ InterfaceC1809a1 f18599L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC1809a1 f18600M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ InterfaceC1809a1 f18601N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ InterfaceC1809a1 f18602O;

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ InterfaceC1809a1 f18603P;

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ Object f18604Q;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18605g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f18606h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f18607i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f18608j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f18609k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f18610l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f18611m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f18612n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f18613o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f18614p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f18615q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f18616r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f18617s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f18618t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f18619u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InterfaceC1809a1 f18620v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC1809a1 f18621w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC1809a1 f18622x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC1809a1 f18623y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC1809a1 f18624z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5073lc(Context context, C1845j1 c1845j1, C1845j1 c1845j12, C1845j1 c1845j13, C1845j1 c1845j14, C1845j1 c1845j15, C1845j1 c1845j16, C1845j1 c1845j17, C1845j1 c1845j18, C1845j1 c1845j19, C1845j1 c1845j110, C1845j1 c1845j111, C1845j1 c1845j112, C1845j1 c1845j113, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, C1845j1 c1845j114, C1845j1 c1845j115, C1845j1 c1845j116, C1845j1 c1845j117, C1845j1 c1845j118, C1845j1 c1845j119, C1845j1 c1845j120, C1845j1 c1845j121, C1845j1 c1845j122, String str, C5518yt c5518yt, InterfaceC1809a1 interfaceC1809a111, int i9) {
        this.f18605g = i9;
        switch (i9) {
            case 2:
                this.f18606h = context;
                this.f18595H = c1845j1;
                this.f18591D = c1845j12;
                this.f18592E = c1845j13;
                this.f18594G = c1845j14;
                this.f18596I = c1845j15;
                this.f18597J = c1845j16;
                this.f18598K = c1845j17;
                this.f18599L = c1845j18;
                this.f18600M = c1845j19;
                this.f18601N = c1845j110;
                this.f18602O = c1845j111;
                this.f18607i = c1845j112;
                this.f18603P = c1845j113;
                this.f18608j = interfaceC1809a1;
                this.f18609k = interfaceC1809a12;
                this.f18610l = interfaceC1809a13;
                this.f18611m = interfaceC1809a14;
                this.f18612n = interfaceC1809a15;
                this.f18613o = interfaceC1809a16;
                this.f18614p = interfaceC1809a17;
                this.f18615q = interfaceC1809a18;
                this.f18616r = interfaceC1809a19;
                this.f18617s = interfaceC1809a110;
                this.f18618t = c1845j114;
                this.f18619u = c1845j115;
                this.f18620v = c1845j116;
                this.f18621w = c1845j117;
                this.f18622x = c1845j118;
                this.f18623y = c1845j119;
                this.f18624z = c1845j120;
                this.f18588A = c1845j121;
                this.f18589B = c1845j122;
                this.f18593F = str;
                this.f18604Q = c5518yt;
                this.f18590C = interfaceC1809a111;
                break;
            default:
                this.f18606h = context;
                this.f18595H = c1845j1;
                this.f18607i = c1845j12;
                this.f18596I = c1845j13;
                this.f18608j = c1845j14;
                this.f18597J = c1845j15;
                this.f18598K = c1845j16;
                this.f18599L = c1845j17;
                this.f18600M = c1845j18;
                this.f18601N = c1845j19;
                this.f18602O = c1845j110;
                this.f18603P = c1845j111;
                this.f18609k = c1845j112;
                this.f18610l = c1845j113;
                this.f18611m = interfaceC1809a1;
                this.f18612n = interfaceC1809a12;
                this.f18613o = interfaceC1809a13;
                this.f18614p = interfaceC1809a14;
                this.f18615q = interfaceC1809a15;
                this.f18616r = interfaceC1809a16;
                this.f18617s = interfaceC1809a17;
                this.f18618t = interfaceC1809a18;
                this.f18619u = interfaceC1809a19;
                this.f18620v = interfaceC1809a110;
                this.f18621w = c1845j114;
                this.f18622x = c1845j115;
                this.f18623y = c1845j116;
                this.f18624z = c1845j117;
                this.f18588A = c1845j118;
                this.f18589B = c1845j119;
                this.f18590C = c1845j120;
                this.f18591D = c1845j121;
                this.f18592E = c1845j122;
                this.f18593F = str;
                this.f18604Q = c5518yt;
                this.f18594G = interfaceC1809a111;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        switch (this.f18605g) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f18595H;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f18604Q;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                boolean zBooleanValue = ((Boolean) this.f18607i.getValue()).booleanValue();
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                String string = sharedPreferences.getString("group_member_reply_join_disabled_groups", HttpUrl.FRAGMENT_ENCODE_SET);
                if (string == null) {
                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                Set setM8411T1 = AbstractC4166m.m8411T1(AbstractC4955ho.m9715y6(string));
                String str2 = this.f18593F;
                if (zBooleanValue) {
                    setM8411T1.remove(str2);
                } else {
                    setM8411T1.add(str2);
                }
                SharedPreferences.Editor editorPutString = editorEdit.putString("group_member_reply_join_disabled_groups", AbstractC4955ho.m9316D5(setM8411T1));
                boolean zBooleanValue2 = ((Boolean) this.f18608j.getValue()).booleanValue();
                String string2 = sharedPreferences.getString("group_member_reply_left_disabled_groups", HttpUrl.FRAGMENT_ENCODE_SET);
                if (string2 != null) {
                    str = string2;
                }
                Set setM8411T12 = AbstractC4166m.m8411T1(AbstractC4955ho.m9715y6(str));
                if (zBooleanValue2) {
                    setM8411T12.remove(str2);
                } else {
                    setM8411T12.add(str2);
                }
                SharedPreferences.Editor editorPutString2 = editorPutString.putString("group_member_reply_left_disabled_groups", AbstractC4955ho.m9316D5(setM8411T12)).putString(AbstractC4955ho.m9396N5("group_member_reply_prompt_type", str2), (String) this.f18609k.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_both_order", str2), (String) this.f18610l.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_join_text", str2), (String) this.f18611m.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_left_text", str2), (String) this.f18612n.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_join_card_title", str2), (String) this.f18613o.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_join_card_desc", str2), (String) this.f18614p.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_left_card_title", str2), (String) this.f18615q.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_left_card_desc", str2), (String) this.f18616r.getValue()).putString(AbstractC4955ho.m9412P5(str2), (String) this.f18617s.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_media_order", str2), (String) this.f18618t.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_media_sequence", str2), (String) this.f18619u.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_join_image_paths", str2), (String) this.f18620v.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_left_image_paths", str2), (String) this.f18621w.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_join_voice_paths", str2), (String) this.f18622x.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_left_voice_paths", str2), (String) this.f18623y.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_join_emoji_paths", str2), (String) this.f18624z.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_left_emoji_paths", str2), (String) this.f18588A.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_join_video_paths", str2), (String) this.f18589B.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_left_video_paths", str2), (String) this.f18590C.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_join_file_paths", str2), (String) this.f18591D.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_left_file_paths", str2), (String) this.f18592E.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_join_favorite_paths", str2), (String) this.f18594G.getValue()).putString(AbstractC4955ho.m9396N5("group_member_reply_left_favorite_paths", str2), (String) this.f18596I.getValue()).putString(AbstractC4955ho.m9380L5(str2), (String) this.f18597J.getValue());
                String strM9396N5 = AbstractC4955ho.m9396N5("group_member_reply_prompt_delay_ms", str2);
                Integer numM6742f0 = AbstractC3156t.m6742f0((String) this.f18598K.getValue());
                if (numM6742f0 == null || (iIntValue = numM6742f0.intValue()) < 0) {
                    iIntValue = 0;
                }
                SharedPreferences.Editor editorPutInt = editorPutString2.putInt(strM9396N5, iIntValue);
                String strM9396N52 = AbstractC4955ho.m9396N5("group_member_reply_image_delay_ms", str2);
                Integer numM6742f02 = AbstractC3156t.m6742f0((String) this.f18599L.getValue());
                int i9 = 100;
                if (numM6742f02 != null) {
                    iIntValue2 = numM6742f02.intValue();
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                } else {
                    iIntValue2 = 100;
                }
                SharedPreferences.Editor editorPutInt2 = editorPutInt.putInt(strM9396N52, iIntValue2);
                String strM9396N53 = AbstractC4955ho.m9396N5("group_member_reply_voice_delay_ms", str2);
                Integer numM6742f03 = AbstractC3156t.m6742f0((String) this.f18600M.getValue());
                if (numM6742f03 != null) {
                    iIntValue3 = numM6742f03.intValue();
                    if (iIntValue3 < 0) {
                        iIntValue3 = 0;
                    }
                } else {
                    iIntValue3 = 100;
                }
                SharedPreferences.Editor editorPutInt3 = editorPutInt2.putInt(strM9396N53, iIntValue3);
                String strM9396N54 = AbstractC4955ho.m9396N5("group_member_reply_emoji_delay_ms", str2);
                Integer numM6742f04 = AbstractC3156t.m6742f0((String) this.f18601N.getValue());
                if (numM6742f04 != null) {
                    iIntValue4 = numM6742f04.intValue();
                    if (iIntValue4 < 0) {
                        iIntValue4 = 0;
                    }
                } else {
                    iIntValue4 = 100;
                }
                SharedPreferences.Editor editorPutInt4 = editorPutInt3.putInt(strM9396N54, iIntValue4);
                String strM9396N55 = AbstractC4955ho.m9396N5("group_member_reply_video_delay_ms", str2);
                Integer numM6742f05 = AbstractC3156t.m6742f0((String) this.f18602O.getValue());
                if (numM6742f05 != null) {
                    iIntValue5 = numM6742f05.intValue();
                    if (iIntValue5 < 0) {
                        iIntValue5 = 0;
                    }
                } else {
                    iIntValue5 = 100;
                }
                SharedPreferences.Editor editorPutInt5 = editorPutInt4.putInt(strM9396N55, iIntValue5);
                String strM9396N56 = AbstractC4955ho.m9396N5("group_member_reply_file_delay_ms", str2);
                Integer numM6742f06 = AbstractC3156t.m6742f0((String) this.f18603P.getValue());
                if (numM6742f06 != null) {
                    iIntValue6 = numM6742f06.intValue();
                    if (iIntValue6 < 0) {
                        iIntValue6 = 0;
                    }
                } else {
                    iIntValue6 = 100;
                }
                SharedPreferences.Editor editorPutInt6 = editorPutInt5.putInt(strM9396N56, iIntValue6);
                String strM9396N57 = AbstractC4955ho.m9396N5("group_member_reply_favorite_delay_ms", str2);
                Integer numM6742f07 = AbstractC3156t.m6742f0((String) interfaceC1809a1.getValue());
                if (numM6742f07 != null) {
                    int iIntValue7 = numM6742f07.intValue();
                    i9 = iIntValue7 < 0 ? 0 : iIntValue7;
                }
                editorPutInt6.putInt(strM9396N57, i9).apply();
                Toast.makeText(this.f18606h, "群专属设置已保存", 0).show();
                break;
            case 1:
                C5491y2.m9766A0(this.f18606h, (C1845j1) this.f18595H, this.f18607i, (C1845j1) this.f18596I, this.f18608j, (C1845j1) this.f18597J, (C1845j1) this.f18598K, (C1845j1) this.f18599L, (C1845j1) this.f18600M, (C1845j1) this.f18601N, (C1845j1) this.f18602O, (C1845j1) this.f18603P, this.f18609k, this.f18610l, this.f18611m, this.f18612n, this.f18613o, this.f18614p, this.f18615q, this.f18616r, this.f18617s, this.f18618t, this.f18619u, this.f18620v, this.f18621w, this.f18622x, this.f18623y, this.f18624z, this.f18588A, this.f18589B, this.f18590C, this.f18591D, this.f18592E, this.f18593F, (C5518yt) this.f18604Q, this.f18594G);
                break;
            default:
                C5491y2.m9766A0(this.f18606h, (C1845j1) this.f18595H, (C1845j1) this.f18591D, (C1845j1) this.f18592E, (C1845j1) this.f18594G, (C1845j1) this.f18596I, (C1845j1) this.f18597J, (C1845j1) this.f18598K, (C1845j1) this.f18599L, (C1845j1) this.f18600M, (C1845j1) this.f18601N, (C1845j1) this.f18602O, this.f18607i, (C1845j1) this.f18603P, this.f18608j, this.f18609k, this.f18610l, this.f18611m, this.f18612n, this.f18613o, this.f18614p, this.f18615q, this.f18616r, this.f18617s, this.f18618t, this.f18619u, this.f18620v, this.f18621w, this.f18622x, this.f18623y, this.f18624z, this.f18588A, this.f18589B, this.f18593F, (C5518yt) this.f18604Q, this.f18590C);
                break;
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C5073lc(SharedPreferences sharedPreferences, String str, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116, InterfaceC1809a1 interfaceC1809a117, InterfaceC1809a1 interfaceC1809a118, InterfaceC1809a1 interfaceC1809a119, InterfaceC1809a1 interfaceC1809a120, InterfaceC1809a1 interfaceC1809a121, InterfaceC1809a1 interfaceC1809a122, InterfaceC1809a1 interfaceC1809a123, InterfaceC1809a1 interfaceC1809a124, InterfaceC1809a1 interfaceC1809a125, InterfaceC1809a1 interfaceC1809a126, InterfaceC1809a1 interfaceC1809a127, InterfaceC1809a1 interfaceC1809a128, InterfaceC1809a1 interfaceC1809a129, InterfaceC1809a1 interfaceC1809a130, InterfaceC1809a1 interfaceC1809a131, InterfaceC1809a1 interfaceC1809a132, InterfaceC1809a1 interfaceC1809a133) {
        this.f18605g = 0;
        this.f18595H = sharedPreferences;
        this.f18593F = str;
        this.f18606h = context;
        this.f18607i = interfaceC1809a1;
        this.f18608j = interfaceC1809a12;
        this.f18609k = interfaceC1809a13;
        this.f18610l = interfaceC1809a14;
        this.f18611m = interfaceC1809a15;
        this.f18612n = interfaceC1809a16;
        this.f18613o = interfaceC1809a17;
        this.f18614p = interfaceC1809a18;
        this.f18615q = interfaceC1809a19;
        this.f18616r = interfaceC1809a110;
        this.f18617s = interfaceC1809a111;
        this.f18618t = interfaceC1809a112;
        this.f18619u = interfaceC1809a113;
        this.f18620v = interfaceC1809a114;
        this.f18621w = interfaceC1809a115;
        this.f18622x = interfaceC1809a116;
        this.f18623y = interfaceC1809a117;
        this.f18624z = interfaceC1809a118;
        this.f18588A = interfaceC1809a119;
        this.f18589B = interfaceC1809a120;
        this.f18590C = interfaceC1809a121;
        this.f18591D = interfaceC1809a122;
        this.f18592E = interfaceC1809a123;
        this.f18594G = interfaceC1809a124;
        this.f18596I = interfaceC1809a125;
        this.f18597J = interfaceC1809a126;
        this.f18598K = interfaceC1809a127;
        this.f18599L = interfaceC1809a128;
        this.f18600M = interfaceC1809a129;
        this.f18601N = interfaceC1809a130;
        this.f18602O = interfaceC1809a131;
        this.f18603P = interfaceC1809a132;
        this.f18604Q = interfaceC1809a133;
    }
}
