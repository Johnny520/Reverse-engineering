package p332wb;

import android.content.Context;
import android.widget.Toast;
import java.util.List;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.hl */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4952hl implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17628g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f17629h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f17630i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f17631j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f17632k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f17633l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4952hl(boolean z9, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, int i9) {
        this.f17628g = i9;
        this.f17629h = z9;
        this.f17630i = context;
        this.f17631j = interfaceC1809a1;
        this.f17632k = interfaceC1809a12;
        this.f17633l = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        switch (this.f17628g) {
            case 0:
                list.getClass();
                if (this.f17629h) {
                    this.f17631j.setValue(list);
                } else {
                    this.f17632k.setValue(list);
                }
                this.f17633l.setValue(null);
                Toast.makeText(this.f17630i, "回复步骤已更新", 0).show();
                break;
            default:
                list.getClass();
                if (this.f17629h) {
                    this.f17631j.setValue(list);
                } else {
                    this.f17632k.setValue(list);
                }
                this.f17633l.setValue(null);
                Toast.makeText(this.f17630i, "回复步骤已更新", 0).show();
                break;
        }
        return C3967n.f12976a;
    }
}
