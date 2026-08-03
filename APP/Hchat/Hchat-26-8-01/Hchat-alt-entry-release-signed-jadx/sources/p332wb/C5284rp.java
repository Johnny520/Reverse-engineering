package p332wb;

import android.content.Context;
import android.widget.Toast;
import gg.AbstractC1415k;
import gg.C1414j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;
import p065eb.C0859c0;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import tf.AbstractC4167n;
import tf.AbstractC4178y;

/* JADX INFO: renamed from: wb.rp */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5284rp extends C1414j implements InterfaceC1220a {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Context f20510n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC3599t f20511o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f20512p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f20513q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f20514r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f20515s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f20516t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f20517u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InterfaceC1809a1 f20518v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC1809a1 f20519w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5284rp(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC3599t interfaceC3599t) {
        super(0, AbstractC0921a.m2246i(AbstractC1415k.class), "startUpload", "PluginMarketUploadDialog$startUpload(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.f20510n = context;
        this.f20511o = interfaceC3599t;
        this.f20512p = interfaceC1809a1;
        this.f20513q = interfaceC1809a12;
        this.f20514r = interfaceC1809a13;
        this.f20515s = interfaceC1809a14;
        this.f20516t = interfaceC1809a15;
        this.f20517u = interfaceC1809a16;
        this.f20518v = interfaceC1809a17;
        this.f20519w = interfaceC1809a18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab A[LOOP:2: B:29:0x00a5->B:31:0x00ab, LOOP_END] */
    @Override // p085fg.InterfaceC1220a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int iM8438a0;
        Iterator it;
        InterfaceC1809a1 interfaceC1809a1 = this.f20512p;
        if (!C5491y2.m9778H(interfaceC1809a1)) {
            InterfaceC1809a1 interfaceC1809a12 = this.f20513q;
            if (!((Set) interfaceC1809a12.getValue()).isEmpty()) {
                List list = (List) this.f20514r.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((Set) interfaceC1809a12.getValue()).contains(((C0859c0) obj).f2626a)) {
                        arrayList.add(obj);
                    }
                }
                boolean zIsEmpty = arrayList.isEmpty();
                Context context = this.f20510n;
                InterfaceC1809a1 interfaceC1809a13 = this.f20515s;
                if (zIsEmpty) {
                    iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(arrayList));
                    if (iM8438a0 < 16) {
                        iM8438a0 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        linkedHashMap.put(((C0859c0) it.next()).f2626a, new C5350tp(EnumC5317sp.f20705g, "等待上传"));
                    }
                    InterfaceC1809a1 interfaceC1809a14 = this.f20516t;
                    interfaceC1809a14.setValue(linkedHashMap);
                    interfaceC1809a1.setValue(Boolean.TRUE);
                    AbstractC3603v.m7563q(this.f20511o, null, new C4921gn(arrayList, context, interfaceC1809a14, interfaceC1809a13, this.f20517u, this.f20518v, this.f20519w, interfaceC1809a1, null), 3);
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        String str = (String) ((Map) interfaceC1809a13.getValue()).get(((C0859c0) it2.next()).f2626a);
                        if (str == null) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (AbstractC3149m.m6721t0(AbstractC3149m.m6703R0(str).toString())) {
                            Toast.makeText(context, "在线插件名不能为空", 0).show();
                            break;
                        }
                    }
                    iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(arrayList));
                    if (iM8438a0 < 16) {
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM8438a0);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                    }
                    InterfaceC1809a1 interfaceC1809a142 = this.f20516t;
                    interfaceC1809a142.setValue(linkedHashMap2);
                    interfaceC1809a1.setValue(Boolean.TRUE);
                    AbstractC3603v.m7563q(this.f20511o, null, new C4921gn(arrayList, context, interfaceC1809a142, interfaceC1809a13, this.f20517u, this.f20518v, this.f20519w, interfaceC1809a1, null), 3);
                }
            }
        }
        return C3967n.f12976a;
    }
}
