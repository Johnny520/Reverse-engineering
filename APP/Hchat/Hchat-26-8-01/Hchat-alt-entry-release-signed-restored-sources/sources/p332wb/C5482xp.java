package p332wb;

import android.content.Context;
import gb.C1384h;
import gb.C1391o;
import gg.AbstractC1415k;
import gg.C1414j;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.xp */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5482xp extends C1414j implements InterfaceC1231l {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC3599t f22017n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f22018o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f22019p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f22020q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Context f22021r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f22022s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f22023t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f22024u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InterfaceC1809a1 f22025v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC1809a1 f22026w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5482xp(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC3599t interfaceC3599t) {
        super(1, AbstractC0921a.m2246i(AbstractC1415k.class), "requestHistoryInstall", "ScriptPluginMarketPage$requestHistoryInstall(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lh/Hchat/hooks/items/script/market/PluginMarketHistoryVersion;)V", 0);
        this.f22017n = interfaceC3599t;
        this.f22018o = interfaceC1809a1;
        this.f22019p = interfaceC1809a12;
        this.f22020q = interfaceC1809a13;
        this.f22021r = context;
        this.f22022s = interfaceC1809a14;
        this.f22023t = interfaceC1809a15;
        this.f22024u = interfaceC1809a16;
        this.f22025v = interfaceC1809a17;
        this.f22026w = interfaceC1809a18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        C1384h c1384h = (C1384h) obj;
        c1384h.getClass();
        InterfaceC1809a1 interfaceC1809a1 = this.f22018o;
        C1391o c1391o = (C1391o) interfaceC1809a1.getValue();
        if (c1391o != null) {
            InterfaceC1809a1 interfaceC1809a12 = this.f22019p;
            if (((String) interfaceC1809a12.getValue()) == null) {
                InterfaceC1809a1 interfaceC1809a13 = this.f22020q;
                if (((String) interfaceC1809a13.getValue()) == null) {
                    interfaceC1809a12.setValue(c1384h.f4595a);
                    Context context = this.f22021r;
                    InterfaceC3599t interfaceC3599t = this.f22017n;
                    AbstractC3603v.m7563q(interfaceC3599t, null, new C4727aq(context, c1391o, c1384h, interfaceC1809a12, interfaceC3599t, interfaceC1809a13, this.f22022s, this.f22023t, this.f22024u, this.f22025v, interfaceC1809a1, this.f22026w, null), 3);
                }
            }
        }
        return C3967n.f12976a;
    }
}
