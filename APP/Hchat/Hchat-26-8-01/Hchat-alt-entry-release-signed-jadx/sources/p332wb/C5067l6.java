package p332wb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;
import android.widget.Toast;
import gg.C1421q;
import gg.C1425u;
import java.io.Serializable;
import java.util.ArrayList;
import p036c9.C0416a1;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p251r.AbstractC3617b0;
import p266s0.AbstractC3879i;
import p269s3.AbstractC3924b;
import p276sf.C3967n;
import tf.C4175v;

/* JADX INFO: renamed from: wb.l6 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5067l6 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18556g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f18557h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f18558i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f18559j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f18560k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f18561l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f18562m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f18563n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f18564o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Serializable f18565p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f18566q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f18567r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f18568s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f18569t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f18570u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5067l6(Context context, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, String str, String str2, String str3, boolean z9) {
        this.f18557h = z9;
        this.f18558i = context;
        this.f18559j = sharedPreferences;
        this.f18560k = str;
        this.f18561l = str2;
        this.f18562m = interfaceC1809a1;
        this.f18563n = interfaceC1809a12;
        this.f18564o = interfaceC1809a13;
        this.f18565p = str3;
        this.f18566q = interfaceC1809a14;
        this.f18567r = interfaceC1809a15;
        this.f18568s = interfaceC1809a16;
        this.f18569t = interfaceC1809a17;
        this.f18570u = interfaceC1809a18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        String str;
        switch (this.f18556g) {
            case 0:
                C1845j1 c1845j1 = (C1845j1) this.f18558i;
                C0416a1 c0416a1 = (C0416a1) this.f18563n;
                Activity activity = (Activity) this.f18564o;
                C1845j1 c1845j12 = (C1845j1) this.f18559j;
                C1845j1 c1845j13 = (C1845j1) this.f18560k;
                C1421q c1421q = (C1421q) this.f18565p;
                C5166o6 c5166o6 = (C5166o6) this.f18566q;
                C1425u c1425u = (C1425u) this.f18567r;
                ArrayList arrayList = (ArrayList) this.f18569t;
                C1425u c1425u2 = (C1425u) this.f18568s;
                ViewGroup viewGroup = (ViewGroup) this.f18570u;
                C1845j1 c1845j14 = (C1845j1) this.f18561l;
                C1845j1 c1845j15 = (C1845j1) this.f18562m;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC1874r.m4619a(AbstractC3924b.f12884a.mo4582a(c0416a1), AbstractC3879i.m8071e(-1039006602, new C5133n6(activity, c1845j12, c1845j13, (AbstractC5459x2) c1845j1.getValue(), c1421q, c5166o6, c1425u, arrayList, c1425u2, viewGroup, c0416a1, AbstractC3617b0.m7603a(c1836h0), c1845j14, c1845j15, c1845j1, this.f18557h), c1836h0), c1836h0, 48);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                final Context context = (Context) this.f18558i;
                final SharedPreferences sharedPreferences = (SharedPreferences) this.f18559j;
                final String str2 = (String) this.f18560k;
                final String str3 = (String) this.f18561l;
                final InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f18563n;
                final InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f18564o;
                final String str4 = (String) this.f18565p;
                final InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f18566q;
                final InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f18567r;
                final InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f18568s;
                final InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f18569t;
                final InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f18570u;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    final boolean z9 = this.f18557h;
                    String str5 = z9 ? "清除伪集赞" : "清除伪评论";
                    String str6 = z9 ? "清空已保存的本地点赞，保留当前功能设置" : "清空已保存的本地评论，保留当前功能设置";
                    boolean zM4538h = c1836h02.m4538h(context) | c1836h02.m4536g(z9) | c1836h02.m4538h(sharedPreferences);
                    Object objM4514P = c1836h02.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4538h || objM4514P == c1823e) {
                        objM4514P = new C4844ec(context, z9, sharedPreferences);
                        c1836h02.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9503b(str5, str6, (InterfaceC1220a) objM4514P, c1836h02, 0);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    String str7 = z9 ? "关闭伪集赞并清空已保存的本地点赞" : "关闭伪评论并清空已保存的本地评论";
                    boolean zM4538h2 = c1836h02.m4538h(sharedPreferences) | c1836h02.m4534f(str2) | c1836h02.m4536g(false) | c1836h02.m4534f(str3) | c1836h02.m4536g(z9) | c1836h02.m4538h(context);
                    String str8 = str7;
                    final InterfaceC1809a1 interfaceC1809a18 = this.f18562m;
                    boolean zM4534f = zM4538h2 | c1836h02.m4534f(interfaceC1809a18) | c1836h02.m4534f(interfaceC1809a1) | c1836h02.m4536g(false) | c1836h02.m4534f(interfaceC1809a12) | c1836h02.m4534f(str4) | c1836h02.m4534f(interfaceC1809a13) | c1836h02.m4536g(false) | c1836h02.m4534f(interfaceC1809a14) | c1836h02.m4534f(interfaceC1809a15) | c1836h02.m4534f(interfaceC1809a16) | c1836h02.m4534f(interfaceC1809a17);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (zM4534f || objM4514P2 == c1823e) {
                        str = str8;
                        objM4514P2 = new InterfaceC1220a() { // from class: wb.fc
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                SharedPreferences sharedPreferences2 = sharedPreferences;
                                SharedPreferences.Editor editorPutBoolean = sharedPreferences2.edit().putBoolean(str2, false).putBoolean(str3, true);
                                boolean z10 = z9;
                                if (z10) {
                                    editorPutBoolean.remove("fake_like_use_non_friends").remove("fake_like_random_order").remove("fake_like_auto_select").remove("fake_like_auto_select_count").remove("fake_like_excluded_ids").remove("fake_like_hide_menu").remove("fake_like_menu_text");
                                } else {
                                    editorPutBoolean.remove("fake_comment_use_non_friends").remove("fake_comment_hide_menu").remove("fake_comment_menu_text");
                                }
                                boolean zCommit = editorPutBoolean.commit();
                                Context context2 = context;
                                if (zCommit) {
                                    Boolean bool = Boolean.FALSE;
                                    interfaceC1809a18.setValue(bool);
                                    interfaceC1809a1.setValue(bool);
                                    interfaceC1809a12.setValue(str4);
                                    interfaceC1809a13.setValue(bool);
                                    if (z10) {
                                        interfaceC1809a14.setValue(bool);
                                        interfaceC1809a15.setValue(bool);
                                        interfaceC1809a16.setValue("50");
                                        interfaceC1809a17.setValue(C4175v.f13712g);
                                    }
                                    AbstractC4955ho.m9437S6(context2, sharedPreferences2, "已恢复默认", z10);
                                } else {
                                    Toast.makeText(context2, "恢复默认失败", 0).show();
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h02.m4545k0(objM4514P2);
                    } else {
                        str = str8;
                    }
                    AbstractC4955ho.m9503b("恢复默认", str, (InterfaceC1220a) objM4514P2, c1836h02, 6);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5067l6(C1845j1 c1845j1, C0416a1 c0416a1, Activity activity, C1845j1 c1845j12, C1845j1 c1845j13, C1421q c1421q, C5166o6 c5166o6, C1425u c1425u, ArrayList arrayList, C1425u c1425u2, ViewGroup viewGroup, C1845j1 c1845j14, C1845j1 c1845j15, boolean z9) {
        this.f18558i = c1845j1;
        this.f18563n = c0416a1;
        this.f18564o = activity;
        this.f18559j = c1845j12;
        this.f18560k = c1845j13;
        this.f18565p = c1421q;
        this.f18566q = c5166o6;
        this.f18567r = c1425u;
        this.f18569t = arrayList;
        this.f18568s = c1425u2;
        this.f18570u = viewGroup;
        this.f18561l = c1845j14;
        this.f18562m = c1845j15;
        this.f18557h = z9;
    }
}
