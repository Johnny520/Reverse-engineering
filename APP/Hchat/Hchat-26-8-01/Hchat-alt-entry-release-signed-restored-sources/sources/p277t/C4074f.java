package p277t;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import ca.C0529p;
import gg.AbstractC1415k;
import gg.C1414j;
import gg.C1425u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p000a.AbstractC0000a;
import p028c1.C0372b;
import p036c9.RunnableC0487t;
import p051db.C0765c;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p109hb.C1686j0;
import p109hb.C1687k;
import p109hb.C1688k0;
import p109hb.C1696s;
import p117i0.InterfaceC1809a1;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4955ho;
import p332wb.C5491y2;
import p332wb.InterfaceC5059kv;
import p339x1.AbstractC5614i1;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: t.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4074f extends C1414j implements InterfaceC1220a {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f13503n = 1;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f13504o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f13505p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f13506q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4074f(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        super(0, AbstractC0921a.m2246i(AbstractC1415k.class), "startSend", "SelectedMessagesMiuixPage$startSend(Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.f13504o = context;
        this.f13505p = interfaceC1809a1;
        this.f13506q = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f13503n) {
            case 0:
                return C4076h.m8262k1((C4076h) this.f13504o, (AbstractC5614i1) this.f13505p, (C0372b) this.f13506q);
            default:
                Context context = (Context) this.f13504o;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f13505p;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f13506q;
                String strM52a1 = AbstractC0000a.m52a1(((Number) interfaceC1809a1.getValue()).intValue(), AbstractC4955ho.m9445T6((C0765c) interfaceC1809a12.getValue()));
                C1696s c1696sM4273h = null;
                if (strM52a1 == null) {
                    strM52a1 = ((C0765c) interfaceC1809a12.getValue()).f2293f.isEmpty() ? "请选择群发对象" : null;
                }
                if (strM52a1 != null) {
                    Toast.makeText(context, strM52a1, 0).show();
                } else {
                    Activity activity = context instanceof Activity ? (Activity) context : null;
                    if (activity == null) {
                        Toast.makeText(context, "当前页面无法启动群发", 0).show();
                    } else {
                        int iIntValue = ((Number) interfaceC1809a1.getValue()).intValue();
                        ArrayList arrayListM9445T6 = AbstractC4955ho.m9445T6((C0765c) interfaceC1809a12.getValue());
                        List list = ((C0765c) interfaceC1809a12.getValue()).f2293f;
                        int i9 = ((C0765c) interfaceC1809a12.getValue()).f2297j;
                        int i10 = ((C0765c) interfaceC1809a12.getValue()).f2298k;
                        ArrayList arrayListM8E0 = AbstractC0000a.m8E0(arrayListM9445T6);
                        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            AbstractC2091b.m5171r((String) it.next(), arrayList);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (!AbstractC3149m.m6721t0((String) obj)) {
                                arrayList2.add(obj);
                            }
                        }
                        List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2));
                        String strM52a12 = AbstractC0000a.m52a1(iIntValue, arrayListM8E0);
                        if (strM52a12 != null) {
                            new Handler(Looper.getMainLooper()).post(new RunnableC0487t(activity, strM52a12, 7));
                        } else if (listM8407P1.isEmpty()) {
                            AbstractC0000a.m36S0(activity, "请选择群发对象");
                        } else {
                            C1688k0 c1688k0 = AbstractC0000a.f0g;
                            if (c1688k0 != null) {
                                C1425u c1425u = new C1425u();
                                boolean z9 = iIntValue == 1;
                                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                InterfaceC5059kv interfaceC5059kvM9813X1 = AbstractC4302b.m8640c(activity, "Hchat_selected_messages_config").getBoolean("selected_messages_background_silent_send", false) ? null : C5491y2.m9813X1(activity, new C0529p(atomicBoolean, c1425u, 4), z9 ? "微信原生群发助手" : "模块群发", "正在发送...");
                                C1686j0 c1686j0 = new C1686j0(0, atomicBoolean, interfaceC5059kvM9813X1, activity, z9);
                                boolean z10 = z9;
                                if (z10) {
                                    C1687k c1687k = c1688k0.f5612c;
                                    c1687k.getClass();
                                    ArrayList arrayListM4290c = C1687k.m4290c(arrayListM8E0);
                                    if (arrayListM4290c != null) {
                                        c1696sM4273h = c1687k.m4299f(arrayListM4290c, listM8407P1, c1686j0);
                                    }
                                } else {
                                    c1696sM4273h = c1688k0.f5610a.m4273h(arrayListM8E0, listM8407P1, i9, i10, c1686j0);
                                }
                                c1425u.f4738g = c1696sM4273h;
                                if (c1696sM4273h == null) {
                                    atomicBoolean.set(true);
                                    if (interfaceC5059kvM9813X1 != null) {
                                        interfaceC5059kvM9813X1.close();
                                    }
                                    AbstractC0000a.m36S0(activity, z10 ? "微信原生群发助手启动失败" : "模块群发启动失败");
                                } else {
                                    AbstractC0000a.m36S0(activity, z10 ? "已开始微信原生群发" : "已开始模块群发");
                                }
                            }
                        }
                    }
                }
                return C3967n.f12976a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4074f(C4076h c4076h, AbstractC5614i1 abstractC5614i1, C0372b c0372b) {
        super(0, AbstractC1415k.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.f13504o = c4076h;
        this.f13505p = abstractC5614i1;
        this.f13506q = c0372b;
    }
}
