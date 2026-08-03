package p244qb;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import p014b.C0126e;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import tf.C4173t;

/* JADX INFO: renamed from: qb.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3481b implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f11294g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3490k f11295h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Activity f11296i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ArrayList f11297j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0126e f11298k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3481b(C3490k c3490k, Activity activity, ArrayList arrayList, C0126e c0126e, int i9) {
        this.f11294g = i9;
        this.f11295h = c3490k;
        this.f11296i = activity;
        this.f11297j = arrayList;
        this.f11298k = c0126e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f11294g) {
            case 0:
                List list = (List) obj;
                list.getClass();
                this.f11295h.m7331w(this.f11296i, this.f11297j, false, this.f11298k, list);
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                C3490k c3490k = this.f11295h;
                Activity activity = this.f11296i;
                ArrayList arrayList = this.f11297j;
                C0126e c0126e = this.f11298k;
                if (iIntValue == 1) {
                    c3490k.m7331w(activity, arrayList, true, c0126e, C4173t.f13710g);
                } else {
                    c3490k.m7317I(activity, arrayList, c0126e, new C3481b(c3490k, activity, arrayList, c0126e, 0));
                }
                break;
        }
        return C3967n.f12976a;
    }
}
