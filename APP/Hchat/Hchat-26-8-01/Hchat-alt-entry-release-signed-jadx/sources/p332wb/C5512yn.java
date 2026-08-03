package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import gg.AbstractC1415k;
import gg.C1414j;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.yn */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5512yn extends C1414j implements InterfaceC1220a {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ SharedPreferences f22220n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Context f22221o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1220a f22222p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f22223q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f22224r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f22225s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f22226t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f22227u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InterfaceC1809a1 f22228v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC1809a1 f22229w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC1809a1 f22230x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC1809a1 f22231y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5512yn(SharedPreferences sharedPreferences, Context context, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19) {
        super(0, AbstractC0921a.m2246i(AbstractC1415k.class), "save", "KeywordNotificationTemplatePage$save(Landroid/content/SharedPreferences;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.f22220n = sharedPreferences;
        this.f22221o = context;
        this.f22222p = interfaceC1220a;
        this.f22223q = interfaceC1809a1;
        this.f22224r = interfaceC1809a12;
        this.f22225s = interfaceC1809a13;
        this.f22226t = interfaceC1809a14;
        this.f22227u = interfaceC1809a15;
        this.f22228v = interfaceC1809a16;
        this.f22229w = interfaceC1809a17;
        this.f22230x = interfaceC1809a18;
        this.f22231y = interfaceC1809a19;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        this.f22220n.edit().putString("keyword_notify_keyword_title", (String) this.f22223q.getValue()).putString("keyword_notify_keyword_content", (String) this.f22224r.getValue()).putString("keyword_notify_keyword_toast", (String) this.f22225s.getValue()).putString("keyword_notify_at_me_title", (String) this.f22226t.getValue()).putString("keyword_notify_at_me_content", (String) this.f22227u.getValue()).putString("keyword_notify_at_me_toast", (String) this.f22228v.getValue()).putString("keyword_notify_at_all_title", (String) this.f22229w.getValue()).putString("keyword_notify_at_all_content", (String) this.f22230x.getValue()).putString("keyword_notify_at_all_toast", (String) this.f22231y.getValue()).apply();
        Toast.makeText(this.f22221o, "模板已保存", 0).show();
        this.f22222p.invoke();
        return C3967n.f12976a;
    }
}
