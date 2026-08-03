package p036c9;

import android.app.Activity;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import p366ya.AbstractC6019i;

/* JADX INFO: renamed from: c9.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0484s implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1435g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f1436h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Activity f1437i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0484s(Activity activity, List list) {
        this.f1437i = activity;
        this.f1436h = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        int i9 = this.f1435g;
        Activity activity = this.f1437i;
        List<String> list = this.f1436h;
        switch (i9) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Handler handler = C0419b0.f1202a;
                C0419b0.m1406d(activity, "发送", AbstractC0921a.m2250m(list.size(), "正在发送到 ", " 个会话..."), new C0446i(list, 0, str), new C0450j(activity, 0));
                return C3967n.f12976a;
            default:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.getClass();
                int i10 = 0;
                for (String str2 : list) {
                    if (!atomicBoolean.get() && AbstractC6019i.m10785f(activity, str2, false)) {
                        i10++;
                    }
                }
                return new C0502y("已读", i10, list.size(), false);
        }
    }

    public /* synthetic */ C0484s(List list, Activity activity) {
        this.f1436h = list;
        this.f1437i = activity;
    }
}
