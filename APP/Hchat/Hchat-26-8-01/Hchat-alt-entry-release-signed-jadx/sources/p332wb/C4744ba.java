package p332wb;

import android.content.Context;
import android.widget.Toast;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import ua.C4298i;

/* JADX INFO: renamed from: wb.ba */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4744ba implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15999g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f16000h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f16001i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f16002j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4744ba(Context context, InterfaceC1231l interfaceC1231l, InterfaceC1809a1 interfaceC1809a1) {
        this.f16000h = context;
        this.f16001i = interfaceC1231l;
        this.f16002j = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f15999g) {
            case 0:
                InterfaceC1809a1 interfaceC1809a1 = this.f16002j;
                C4298i c4298i = (C4298i) interfaceC1809a1.getValue();
                String str = ((C4298i) interfaceC1809a1.getValue()).f14301b;
                if (AbstractC3149m.m6721t0(str)) {
                    str = "收款模板";
                }
                this.f16001i.invoke(C4298i.m8633a(c4298i, str, false, 0, 0L, 0L, 0L, null, 0, null, null, false, 0, null, 0, 0, null, false, 0, 0, false, AbstractC4955ho.m9475X4(((C4298i) interfaceC1809a1.getValue()).f14321v), false, false, false, 0, false, null, null, null, false, null, -2097155, 1));
                Toast.makeText(this.f16000h, "收款模板已保存", 0).show();
                break;
            default:
                InterfaceC1809a1 interfaceC1809a12 = this.f16002j;
                if (AbstractC3149m.m6721t0((String) interfaceC1809a12.getValue())) {
                    Toast.makeText(this.f16000h, "请先选择模型", 0).show();
                } else {
                    this.f16001i.invoke((String) interfaceC1809a12.getValue());
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4744ba(InterfaceC1231l interfaceC1231l, Context context, InterfaceC1809a1 interfaceC1809a1) {
        this.f16001i = interfaceC1231l;
        this.f16000h = context;
        this.f16002j = interfaceC1809a1;
    }
}
