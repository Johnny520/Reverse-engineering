package p332wb;

import android.content.Context;
import android.widget.Toast;
import java.util.List;
import okio.C3193a;
import p085fg.InterfaceC1231l;
import p154k9.AbstractC2363g;
import p154k9.C2361e;
import p154k9.C2362f;
import p276sf.C3967n;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.da */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4810da implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16575g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f16576h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f16577i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4810da(InterfaceC1231l interfaceC1231l, Context context, int i9) {
        this.f16575g = i9;
        this.f16576h = interfaceC1231l;
        this.f16577i = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f16575g) {
            case 0:
                AbstractC2363g abstractC2363g = (AbstractC2363g) obj;
                abstractC2363g.getClass();
                if (abstractC2363g instanceof C2362f) {
                    this.f16576h.invoke(((C2362f) abstractC2363g).f7763a);
                } else if (abstractC2363g.equals(C2361e.f7762b)) {
                    Toast.makeText(this.f16577i, "图标读取失败", 0).show();
                } else if (!abstractC2363g.equals(C2361e.f7761a)) {
                    C3193a.m6822k();
                }
                break;
            case 1:
                List list = (List) obj;
                list.getClass();
                if (!list.isEmpty()) {
                    this.f16576h.invoke(AbstractC4166m.m8392A1(list, "|", null, null, null, 62));
                    AbstractC4855en.m9271o("已选择 ", list.size(), " 个文件", this.f16577i, 0);
                }
                break;
            default:
                List list2 = (List) obj;
                list2.getClass();
                if (!list2.isEmpty()) {
                    this.f16576h.invoke(AbstractC4166m.m8392A1(list2, "|", null, null, null, 62));
                    AbstractC4855en.m9271o("已选择 ", list2.size(), " 个文件", this.f16577i, 0);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
