package p056f0;

import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0139e;
import p007D0.C0146l;
import p009E0.AbstractC0182m;
import p026N0.AbstractC0270k;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0431p;
import p050c0.C0605L1;
import p050c0.C0661h1;

/* JADX INFO: renamed from: f0.v */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0843v implements InterfaceC0275a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3046b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3047c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3048d;

    public /* synthetic */ C0843v(Object obj, Object obj2, Object obj3, int i2) {
        this.f3045a = i2;
        this.f3046b = obj;
        this.f3047c = obj2;
        this.f3048d = obj3;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        Object objM116u;
        Object next;
        List<C0797H> list;
        int i2 = 0;
        C0146l c0146l = C0146l.f339a;
        Object obj = this.f3048d;
        Object obj2 = this.f3047c;
        Object obj3 = this.f3046b;
        switch (this.f3045a) {
            case 0:
                Activity activity = (Activity) obj3;
                AbstractC0307g.m703e(activity, "$host");
                C0798I c0798i = (C0798I) obj2;
                AbstractC0307g.m703e(c0798i, "$lat");
                C0798I c0798i2 = (C0798I) obj;
                AbstractC0307g.m703e(c0798i2, "$lon");
                C0605L1 c0605l1 = C0605L1.f1854a;
                C0139e c0139eM1493h = C0605L1.m1493h(activity);
                C0810V c0810v = C0810V.f2933a;
                if (c0139eM1493h == null) {
                    C0810V.m2105z(activity, "无法获取当前位置，请开启系统定位权限");
                } else {
                    c0798i.f2899b.setText(C0605L1.m1488c(((Number) c0139eM1493h.f328a).doubleValue()));
                    c0798i2.f2899b.setText(C0605L1.m1488c(((Number) c0139eM1493h.f329b).doubleValue()));
                    C0810V.m2105z(activity, "已自动填入");
                }
                return c0146l;
            case 1:
                Activity activity2 = (Activity) obj3;
                AbstractC0307g.m703e(activity2, "$host");
                C0798I c0798i3 = (C0798I) obj2;
                AbstractC0307g.m703e(c0798i3, "$lat");
                C0798I c0798i4 = (C0798I) obj;
                AbstractC0307g.m703e(c0798i4, "$lon");
                C0810V c0810v2 = C0810V.f2933a;
                C0139e c0139eM1495b = C0605L1.f1854a.m1495b(activity2);
                EditText editText = c0798i3.f2899b;
                Double dM1024y0 = AbstractC0431p.m1024y0(editText.getText().toString());
                double dDoubleValue = dM1024y0 != null ? dM1024y0.doubleValue() : ((Number) c0139eM1495b.f328a).doubleValue();
                EditText editText2 = c0798i4.f2899b;
                Double dM1024y02 = AbstractC0431p.m1024y0(editText2.getText().toString());
                C0605L1.m1494i(true, dDoubleValue, dM1024y02 != null ? dM1024y02.doubleValue() : ((Number) c0139eM1495b.f329b).doubleValue(), activity2, false);
                try {
                    activity2.startActivityForResult(new Intent(activity2, Class.forName("com.tencent.mm.plugin.location.ui.RedirectUI", false, activity2.getClassLoader())).putExtra("map_view_type", 8), 44039);
                    C0810V.m2105z(activity2, "请在地图上选择位置");
                    if (!activity2.isFinishing()) {
                        activity2.getWindow().getDecorView().postDelayed(new RunnableC0845x(editText, editText2, activity2, 0), 500L);
                        break;
                    }
                    objM116u = c0146l;
                } catch (Throwable th) {
                    objM116u = AbstractC0040p.m116u(th);
                }
                if (AbstractC0141g.m465a(objM116u) != null) {
                    C0605L1 c0605l12 = C0605L1.f1854a;
                    File file = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "map_pick_request");
                    try {
                        File parentFile = file.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        AbstractC0270k.m693j0(file, "ts=" + System.currentTimeMillis() + "\n", AbstractC0416a.f921a);
                    } catch (Throwable th2) {
                        AbstractC0040p.m116u(th2);
                    }
                    try {
                        new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "map_pick_result").delete();
                    } catch (Throwable th3) {
                        AbstractC0040p.m116u(th3);
                    }
                    C0810V.m2105z(activity2, "已发送选点请求，请在微信中确认");
                    break;
                }
                return c0146l;
            case 2:
                Activity activity3 = (Activity) obj3;
                AbstractC0307g.m703e(activity3, "$host");
                C0798I c0798i5 = (C0798I) obj2;
                AbstractC0307g.m703e(c0798i5, "$lat");
                C0798I c0798i6 = (C0798I) obj;
                AbstractC0307g.m703e(c0798i6, "$lon");
                C0139e c0139eM1495b2 = C0605L1.f1854a.m1495b(activity3);
                Double dM1024y03 = AbstractC0431p.m1024y0(c0798i5.f2899b.getText().toString());
                double dDoubleValue2 = dM1024y03 != null ? dM1024y03.doubleValue() : ((Number) c0139eM1495b2.f328a).doubleValue();
                Double dM1024y04 = AbstractC0431p.m1024y0(c0798i6.f2899b.getText().toString());
                C0605L1.m1494i(true, dDoubleValue2, dM1024y04 != null ? dM1024y04.doubleValue() : ((Number) c0139eM1495b2.f329b).doubleValue(), activity3, false);
                C0810V c0810v3 = C0810V.f2933a;
                C0810V.m2105z(activity3, "已保存坐标并激活");
                return c0146l;
            default:
                EnumC0796G enumC0796G = (EnumC0796G) obj3;
                AbstractC0307g.m703e(enumC0796G, "$cat");
                List list2 = (List) obj2;
                AbstractC0307g.m703e(list2, "$sections");
                Map map = (Map) obj;
                AbstractC0307g.m703e(map, "$countLabels");
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((C0139e) next).f328a == enumC0796G) {
                        }
                    } else {
                        next = null;
                    }
                }
                C0139e c0139e = (C0139e) next;
                if (c0139e != null && (list = (List) c0139e.f329b) != null) {
                    if (!list.isEmpty()) {
                        for (C0797H c0797h : list) {
                            C0661h1 c0661h1 = C0661h1.f2048a;
                            if (C0661h1.m1661c(c0797h.f2894c, c0797h.f2895d) && (i2 = i2 + 1) < 0) {
                                AbstractC0182m.m557i0();
                                throw null;
                            }
                        }
                    }
                    TextView textView = (TextView) map.get(enumC0796G);
                    if (textView != null) {
                        textView.setText(i2 + " / " + list.size() + " 已开启");
                        textView.setTextColor(i2 > 0 ? C0810V.f2942j : C0810V.f2940h);
                    }
                }
                return c0146l;
        }
    }
}
