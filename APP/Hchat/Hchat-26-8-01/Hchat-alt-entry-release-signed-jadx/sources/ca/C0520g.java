package ca;

import android.app.Activity;
import bi.C0315c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1231l;
import p230p8.C3348c;
import p230p8.C3370v;
import p276sf.C3958e;
import p276sf.C3967n;
import p304uf.C4329c;
import p332wb.C5026jv;
import p332wb.C5491y2;
import p332wb.EnumC5092lv;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: ca.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0520g implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1602g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0517e0 f1603h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Activity f1604i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C3370v f1605j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0520g(C0517e0 c0517e0, Activity activity, C3370v c3370v, int i9) {
        this.f1602g = i9;
        this.f1603h = c0517e0;
        this.f1604i = activity;
        this.f1605j = c3370v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f1602g) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                C0517e0 c0517e0 = this.f1603h;
                Activity activity = this.f1604i;
                C3370v c3370v = this.f1605j;
                if (iIntValue == 0) {
                    c0517e0.m1526k(activity, c3370v, "转发到朋友圈", new C0528o(c0517e0, activity, 2));
                } else if (iIntValue == 1) {
                    c0517e0.getClass();
                    c0517e0.m1530p(activity, new C0520g(c0517e0, activity, c3370v, 2), "选择转发对象", "转发", false);
                } else if (iIntValue == 2) {
                    c0517e0.m1526k(activity, c3370v, "分享朋友圈", new C0528o(c0517e0, activity, 3));
                } else if (iIntValue == 3) {
                    c0517e0.getClass();
                    C5491y2.m9799Q1(activity, "选择群发通道", HttpUrl.FRAGMENT_ENCODE_SET, AbstractC0000a.m101y0(new C3958e("模块通道", "支持好友、群聊、公众号和标签"), new C3958e("微信原生群发助手", "仅选择好友并按原生队列发送")), new C0520g(c0517e0, activity, c3370v, 1), new C0315c(7), EnumC5092lv.f18824j);
                } else if (iIntValue == 4) {
                    c0517e0.getClass();
                    c0517e0.m1522e(activity, new C0525l(c0517e0, activity, new C0520g(c0517e0, activity, c3370v, 3)), "转发至标签", false);
                }
                return C3967n.f12976a;
            case 1:
                int i9 = ((Integer) obj).intValue() == 1 ? 1 : 0;
                boolean z9 = i9 == 1;
                String str = z9 ? "选择官方群发好友" : "选择群发对象";
                C0517e0 c0517e02 = this.f1603h;
                Activity activity2 = this.f1604i;
                c0517e02.m1530p(activity2, new C0524k(c0517e02, activity2, this.f1605j, i9, 0), str, "发送", z9);
                break;
            case 2:
                final List list = (List) obj;
                list.getClass();
                final int i10 = 0;
                final C0517e0 c0517e03 = this.f1603h;
                final Activity activity3 = this.f1604i;
                c0517e03.m1526k(activity3, this.f1605j, "转发给好友", new InterfaceC1231l() { // from class: ca.m
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1231l
                    public final Object invoke(Object obj2) {
                        C3348c c3348c = (C3348c) obj2;
                        switch (i10) {
                            case 0:
                                c3348c.getClass();
                                C4329c c4329cM7064a = c3348c.m7064a();
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((C5026jv) it.next()).f18249a);
                                }
                                c0517e03.m1528n(activity3, c4329cM7064a, arrayList, 0, "转发给好友");
                                break;
                            default:
                                c3348c.getClass();
                                c0517e03.m1528n(activity3, c3348c.m7064a(), list, 0, "转发至标签");
                                break;
                        }
                        return C3967n.f12976a;
                    }
                });
                break;
            default:
                final List list2 = (List) obj;
                list2.getClass();
                final int i11 = 1;
                final C0517e0 c0517e04 = this.f1603h;
                final Activity activity4 = this.f1604i;
                c0517e04.m1526k(activity4, this.f1605j, "转发至标签", new InterfaceC1231l() { // from class: ca.m
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1231l
                    public final Object invoke(Object obj2) {
                        C3348c c3348c = (C3348c) obj2;
                        switch (i11) {
                            case 0:
                                c3348c.getClass();
                                C4329c c4329cM7064a = c3348c.m7064a();
                                List list22 = list2;
                                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list22));
                                Iterator it = list22.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((C5026jv) it.next()).f18249a);
                                }
                                c0517e04.m1528n(activity4, c4329cM7064a, arrayList, 0, "转发给好友");
                                break;
                            default:
                                c3348c.getClass();
                                c0517e04.m1528n(activity4, c3348c.m7064a(), list2, 0, "转发至标签");
                                break;
                        }
                        return C3967n.f12976a;
                    }
                });
                break;
        }
        return C3967n.f12976a;
    }
}
