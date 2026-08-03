package p332wb;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import p000a.AbstractC0000a;
import p051db.C0765c;
import p065eb.C0899v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.gh */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4915gh implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17433g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f17434h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f17435i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f17436j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f17437k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4915gh(Context context, int i9, String str, InterfaceC1231l interfaceC1231l) {
        this.f17436j = context;
        this.f17435i = i9;
        this.f17437k = str;
        this.f17434h = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f17433g) {
            case 0:
                Context context = (Context) this.f17436j;
                String str = (String) this.f17437k;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity == null) {
                    Toast.makeText(context, "当前页面无法打开铃声选择器", 0).show();
                } else {
                    InterfaceC1231l interfaceC1231l = this.f17434h;
                    int i9 = this.f17435i;
                    C0899v0 c0899v0 = new C0899v0(interfaceC1231l, i9, context, 5);
                    if (i9 == 1) {
                        C5417vq.f21502a.m9755c(activity, c0899v0);
                    } else {
                        C5417vq.f21502a.m9756d(activity, str, c0899v0);
                    }
                }
                return C3967n.f12976a;
            case 1:
                C0765c c0765c = (C0765c) this.f17436j;
                List list = (List) this.f17437k;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                for (Object obj : list) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC0000a.m32Q0();
                        throw null;
                    }
                    ((Number) obj).longValue();
                    if (i10 != this.f17435i) {
                        arrayList.add(obj);
                    }
                    i10 = i11;
                }
                this.f17434h.invoke(AbstractC4955ho.m9637p7(c0765c, arrayList));
                break;
            default:
                this.f17434h.invoke(new C4737b3(AbstractC4955ho.m9365J6(this.f17435i), (String) this.f17437k, (InterfaceC1231l) this.f17436j, true, "|"));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4915gh(InterfaceC1231l interfaceC1231l, int i9, String str, InterfaceC1231l interfaceC1231l2) {
        this.f17434h = interfaceC1231l;
        this.f17435i = i9;
        this.f17437k = str;
        this.f17436j = interfaceC1231l2;
    }

    public /* synthetic */ C4915gh(InterfaceC1231l interfaceC1231l, C0765c c0765c, List list, int i9) {
        this.f17434h = interfaceC1231l;
        this.f17436j = c0765c;
        this.f17437k = list;
        this.f17435i = i9;
    }
}
