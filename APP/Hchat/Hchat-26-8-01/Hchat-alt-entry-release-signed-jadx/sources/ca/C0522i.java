package ca;

import android.app.Activity;
import bi.C0315c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p051db.C0763a;
import p085fg.InterfaceC1231l;
import p276sf.C3958e;
import p276sf.C3967n;
import p332wb.C5026jv;
import p332wb.C5491y2;
import p332wb.EnumC5092lv;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: ca.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0522i implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1610g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0517e0 f1611h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Activity f1612i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f1613j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0522i(C0517e0 c0517e0, long j3, Activity activity) {
        this.f1610g = 3;
        this.f1611h = c0517e0;
        this.f1613j = j3;
        this.f1612i = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f1610g) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                C0517e0 c0517e0 = this.f1611h;
                Activity activity = this.f1612i;
                long j3 = this.f1613j;
                if (iIntValue == 0) {
                    c0517e0.getClass();
                    c0517e0.m1523f(j3, activity, new C0528o(activity, c0517e0), "转发到朋友圈");
                } else if (iIntValue == 1) {
                    c0517e0.getClass();
                    c0517e0.m1530p(activity, new C0522i(c0517e0, activity, j3, 1), "选择转发对象", "转发", false);
                } else if (iIntValue == 2) {
                    c0517e0.getClass();
                    c0517e0.m1523f(j3, activity, new C0528o(c0517e0, activity, 0), "分享收藏");
                } else if (iIntValue == 3) {
                    c0517e0.getClass();
                    C5491y2.m9799Q1(activity, "选择群发通道", HttpUrl.FRAGMENT_ENCODE_SET, AbstractC0000a.m101y0(new C3958e("模块通道", "支持好友、群聊、公众号和标签"), new C3958e("微信原生群发助手", "仅选择好友并按原生队列发送")), new C0522i(c0517e0, j3, activity), new C0315c(7), EnumC5092lv.f18824j);
                } else if (iIntValue == 4) {
                    c0517e0.getClass();
                    c0517e0.m1522e(activity, new C0525l(c0517e0, activity, new C0522i(c0517e0, activity, j3, 2)), "转发至标签", false);
                }
                return C3967n.f12976a;
            case 1:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C5026jv) it.next()).f18249a);
                }
                C0517e0 c0517e02 = this.f1611h;
                c0517e02.getClass();
                c0517e02.m1528n(this.f1612i, AbstractC0000a.m99x0(new C0763a(7, String.valueOf(this.f1613j))), arrayList, 0, "转发给好友");
                break;
            case 2:
                List list2 = (List) obj;
                list2.getClass();
                C0517e0 c0517e03 = this.f1611h;
                c0517e03.getClass();
                c0517e03.m1528n(this.f1612i, AbstractC0000a.m99x0(new C0763a(7, String.valueOf(this.f1613j))), list2, 0, "转发至标签");
                break;
            default:
                final int i9 = ((Integer) obj).intValue() == 1 ? 1 : 0;
                final C0517e0 c0517e04 = this.f1611h;
                c0517e04.getClass();
                final long j4 = this.f1613j;
                String strM52a1 = AbstractC0000a.m52a1(i9, AbstractC0000a.m99x0(new C0763a(7, String.valueOf(j4))));
                final Activity activity2 = this.f1612i;
                if (strM52a1 != null) {
                    c0517e04.m1532r(activity2, strM52a1);
                } else {
                    boolean z9 = i9 == 1;
                    c0517e04.m1530p(activity2, new InterfaceC1231l() { // from class: ca.u
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1231l
                        public final Object invoke(Object obj2) {
                            List list3 = (List) obj2;
                            list3.getClass();
                            ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list3));
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((C5026jv) it2.next()).f18249a);
                            }
                            C0517e0 c0517e05 = c0517e04;
                            c0517e05.getClass();
                            c0517e05.m1528n(activity2, AbstractC0000a.m99x0(new C0763a(7, String.valueOf(j4))), arrayList2, i9, "群发助手");
                            return C3967n.f12976a;
                        }
                    }, z9 ? "选择官方群发好友" : "选择群发对象", "发送", z9);
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0522i(C0517e0 c0517e0, Activity activity, long j3, int i9) {
        this.f1610g = i9;
        this.f1611h = c0517e0;
        this.f1612i = activity;
        this.f1613j = j3;
    }
}
