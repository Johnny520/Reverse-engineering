package p332wb;

import android.content.Context;
import android.widget.Toast;
import java.util.ArrayList;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.w8 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5432w8 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21598g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ArrayList f21599h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f21600i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f21601j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5432w8(ArrayList arrayList, Context context, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f21598g = i9;
        this.f21599h = arrayList;
        this.f21600i = context;
        this.f21601j = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f21598g) {
            case 0:
                if (this.f21599h.isEmpty()) {
                    Toast.makeText(this.f21600i, "请先选择规则", 0).show();
                } else {
                    this.f21601j.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                if (this.f21599h.isEmpty()) {
                    Toast.makeText(this.f21600i, "请先选择适用聊天", 0).show();
                } else {
                    this.f21601j.setValue(Boolean.TRUE);
                }
                break;
            case 2:
                if (this.f21599h.isEmpty()) {
                    Toast.makeText(this.f21600i, "请先选择监听群", 0).show();
                } else {
                    this.f21601j.setValue(Boolean.TRUE);
                }
                break;
            case 3:
                if (this.f21599h.isEmpty()) {
                    Toast.makeText(this.f21600i, "请先选择规则", 0).show();
                } else {
                    this.f21601j.setValue(Boolean.TRUE);
                }
                break;
            case 4:
                if (this.f21599h.isEmpty()) {
                    Toast.makeText(this.f21600i, "请先选择名单", 0).show();
                } else {
                    this.f21601j.setValue(Boolean.TRUE);
                }
                break;
            case 5:
                if (this.f21599h.isEmpty()) {
                    Toast.makeText(this.f21600i, "请先选择适用聊天", 0).show();
                } else {
                    this.f21601j.setValue(Boolean.TRUE);
                }
                break;
            case 6:
                if (this.f21599h.isEmpty()) {
                    Toast.makeText(this.f21600i, "请先选择会话规则", 0).show();
                } else {
                    this.f21601j.setValue(Boolean.TRUE);
                }
                break;
            default:
                if (this.f21599h.isEmpty()) {
                    Toast.makeText(this.f21600i, "请先选择监听群", 0).show();
                } else {
                    this.f21601j.setValue(Boolean.TRUE);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
