package p036c9;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p010aa.C0035c;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import p332wb.C5026jv;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: c9.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0458l implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1342g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0035c f1343h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Activity f1344i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0458l(Activity activity, C0035c c0035c) {
        this.f1342g = 2;
        this.f1344i = activity;
        this.f1343h = c0035c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) throws PendingIntent.CanceledException {
        int i9 = this.f1342g;
        C3967n c3967n = C3967n.f12976a;
        Activity activity = this.f1344i;
        C0035c c0035c = this.f1343h;
        switch (i9) {
            case 0:
                C0502y c0502y = (C0502y) obj;
                c0502y.getClass();
                c0035c.invoke();
                Handler handler = C0419b0.f1202a;
                C0419b0.m1411i(activity, c0502y);
                break;
            case 1:
                C0502y c0502y2 = (C0502y) obj;
                c0502y2.getClass();
                c0035c.invoke();
                Handler handler2 = C0419b0.f1202a;
                C0419b0.m1411i(activity, c0502y2);
                break;
            case 2:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C5026jv) it.next()).f18249a);
                }
                boolean zM1496t = AbstractC0473o2.m1496t(activity, null, arrayList);
                Handler handler3 = C0419b0.f1202a;
                C0419b0.m1410h(activity, zM1496t ? AbstractC0921a.m2250m(list.size(), "已移出 ", " 个会话") : "移出会话失败");
                if (zM1496t) {
                    c0035c.invoke();
                }
                break;
            default:
                C0502y c0502y3 = (C0502y) obj;
                c0502y3.getClass();
                c0035c.invoke();
                Handler handler4 = C0419b0.f1202a;
                C0419b0.m1411i(activity, c0502y3);
                break;
        }
        return c3967n;
    }

    public /* synthetic */ C0458l(C0035c c0035c, Activity activity, int i9) {
        this.f1342g = i9;
        this.f1343h = c0035c;
        this.f1344i = activity;
    }
}
