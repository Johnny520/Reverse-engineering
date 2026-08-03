package p332wb;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import java.util.List;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p142jg.AbstractC2133a;
import p142jg.AbstractC2136d;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.pc */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5205pc implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19956g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f19957h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f19958i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f19959j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5205pc(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f19956g = i9;
        this.f19957h = context;
        this.f19958i = interfaceC1809a1;
        this.f19959j = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        int i9 = this.f19956g;
        C3967n c3967n = C3967n.f12976a;
        InterfaceC1809a1 interfaceC1809a1 = this.f19959j;
        InterfaceC1809a1 interfaceC1809a12 = this.f19958i;
        Context context = this.f19957h;
        switch (i9) {
            case 0:
                interfaceC1809a1.setValue((String) interfaceC1809a12.getValue());
                Toast.makeText(context, "已选择模型: " + ((String) interfaceC1809a12.getValue()), 0).show();
                break;
            case 1:
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    C5172oc c5172oc = new C5172oc(context, interfaceC1809a12, interfaceC1809a1);
                    if (((Number) interfaceC1809a12.getValue()).intValue() != 1) {
                        C5417vq.f21502a.m9756d(activity, (String) interfaceC1809a1.getValue(), c5172oc);
                    } else {
                        C5417vq.f21502a.m9755c(activity, c5172oc);
                    }
                } else {
                    Toast.makeText(context, "当前页面无法打开铃声选择器", 0).show();
                }
                break;
            default:
                List list = AbstractC4955ho.f17706u;
                AbstractC2133a abstractC2133a = AbstractC2136d.f7122g;
                int size = list.size();
                AbstractC2133a abstractC2133a2 = AbstractC2136d.f7122g;
                interfaceC1809a12.setValue((String) list.get(abstractC2133a2.m5360g(size)));
                List list2 = AbstractC4955ho.f17707v;
                interfaceC1809a1.setValue((String) list2.get(abstractC2133a2.m5360g(list2.size())));
                Toast.makeText(context, "已随机填充本群文本", 0).show();
                break;
        }
        return c3967n;
    }
}
