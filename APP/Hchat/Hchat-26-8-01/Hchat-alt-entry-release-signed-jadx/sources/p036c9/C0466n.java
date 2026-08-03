package p036c9;

import ac.RunnableC0059l;
import android.app.Activity;
import android.os.Handler;
import bi.C0315c;
import gg.AbstractC1416l;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import p000a.AbstractC0000a;
import p010aa.C0035c;
import p049d9.AbstractC0754o;
import p085fg.InterfaceC1231l;
import p218og.AbstractC3156t;
import p276sf.C3958e;
import p276sf.C3967n;
import p304uf.C4329c;
import p332wb.C5491y2;
import p332wb.EnumC5092lv;

/* JADX INFO: renamed from: c9.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0466n implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1375g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Activity f1376h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0414a f1377i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0035c f1378j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f1379k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0466n(Activity activity, C0414a c0414a, C0035c c0035c, String str, int i9) {
        this.f1375g = i9;
        this.f1376h = activity;
        this.f1377i = c0414a;
        this.f1378j = c0035c;
        this.f1379k = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) throws NoSuchAlgorithmException {
        C3967n c3967n;
        int i9;
        C0035c c0035c;
        String str;
        Activity activity;
        C0035c c0035c2;
        String str2;
        int i10 = this.f1375g;
        C3967n c3967n2 = C3967n.f12976a;
        switch (i10) {
            case 0:
                String str3 = (String) obj;
                Handler handler = C0419b0.f1202a;
                str3.getClass();
                Activity activity2 = this.f1376h;
                List<C0414a> listM1485i = AbstractC0473o2.m1485i(activity2);
                boolean zIsEmpty = listM1485i.isEmpty();
                C0414a c0414a = this.f1377i;
                if (zIsEmpty) {
                    C0419b0.m1412j(activity2, C0414a.m1401a(c0414a, null, str3, null, 0, null, null, false, null, false, false, false, 4093), this.f1378j);
                } else {
                    for (C0414a c0414a2 : listM1485i) {
                        if (!AbstractC1416l.m3825a(c0414a2.f1179a, this.f1379k) && AbstractC1416l.m3825a(c0414a2.f1181c, c0414a.f1181c) && AbstractC3156t.m6734X(c0414a2.f1180b, str3)) {
                            C0419b0.m1410h(activity2, "同一层级已存在同名分组");
                        }
                    }
                    C0419b0.m1412j(activity2, C0414a.m1401a(c0414a, null, str3, null, 0, null, null, false, null, false, false, false, 4093), this.f1378j);
                }
                return c3967n2;
            default:
                int iIntValue = ((Integer) obj).intValue();
                Handler handler2 = C0419b0.f1202a;
                Activity activity3 = this.f1376h;
                C0414a c0414a3 = this.f1377i;
                C0035c c0035c3 = this.f1378j;
                String str4 = this.f1379k;
                if (iIntValue != 0) {
                    if (iIntValue == 1) {
                        c3967n = c3967n2;
                        activity = activity3;
                        c0035c2 = c0035c3;
                        str2 = str4;
                        i9 = 1;
                        C0414a c0414aM1405c = C0419b0.m1405c(activity, str2);
                        if (c0414aM1405c != null) {
                            String strM1421F = C0429d2.m1421F(str2);
                            boolean zM1947d = AbstractC0754o.m1947d(activity, strM1421F);
                            String str5 = c0414aM1405c.f1180b;
                            C4329c c4329cM7E = AbstractC0000a.m7E();
                            c4329cM7E.add(new C3958e(zM1947d ? "更换头像" : "选择头像", "从系统相册或文件中选择"));
                            if (zM1947d) {
                                c4329cM7E.add(new C3958e("恢复默认", "移除当前分组头像"));
                            }
                            activity3 = activity;
                            C5491y2.m9799Q1(activity3, "自定义头像", str5, AbstractC0000a.m90t(c4329cM7E), new C0470o(activity, strM1421F, str2, c0035c2, 0), new C0315c(6), EnumC5092lv.f18824j);
                        }
                        c0035c = c0035c2;
                        str = str2;
                    } else if (iIntValue == 2) {
                        c3967n = c3967n2;
                        i9 = 1;
                        C0414a c0414aM1405c2 = C0419b0.m1405c(activity3, str4);
                        if (c0414aM1405c2 != null) {
                            c0035c2 = c0035c3;
                            str2 = str4;
                            activity3 = activity3;
                            C5491y2.m9824c2(activity3, "命名", "修改当前聊天分组名称", c0414aM1405c2.f1180b, "分组名称", 50, false, new C0466n(activity3, c0414aM1405c2, c0035c3, str4, 0), new C0315c(6), 576);
                        } else {
                            str2 = str4;
                            c0035c2 = c0035c3;
                        }
                        activity = activity3;
                    } else if (iIntValue == 3) {
                        c3967n = c3967n2;
                        c0035c = c0035c3;
                        str = str4;
                        i9 = 1;
                        C0419b0.m1412j(activity3, C0414a.m1401a(c0414a3, null, null, null, 0, null, null, false, null, !c0414a3.f1187i, false, false, 3839), c0035c);
                    } else if (iIntValue == 4) {
                        c3967n = c3967n2;
                        c0035c = c0035c3;
                        str = str4;
                        i9 = 1;
                        C0419b0.m1412j(activity3, C0414a.m1401a(c0414a3, null, null, null, 0, null, null, false, null, false, !c0414a3.f1188j, false, 3583), c0035c);
                    } else if (iIntValue != 5) {
                        c3967n = c3967n2;
                        c0035c = c0035c3;
                        str = str4;
                        i9 = 1;
                    } else {
                        c3967n = c3967n2;
                        i9 = 1;
                        c0035c = c0035c3;
                        str = str4;
                        C0419b0.m1412j(activity3, C0414a.m1401a(c0414a3, null, null, null, 0, null, null, false, null, false, false, !c0414a3.f1190l, 2047), c0035c);
                    }
                    activity3 = activity;
                    c0035c = c0035c2;
                    str = str2;
                } else {
                    c3967n = c3967n2;
                    i9 = 1;
                    c0035c = c0035c3;
                    str = str4;
                    C0419b0.m1412j(activity3, C0414a.m1401a(c0414a3, null, null, null, 0, null, null, !c0414a3.f1185g, null, false, false, false, 4031), c0035c);
                }
                if (iIntValue != i9 && iIntValue != 2) {
                    C0419b0.f1202a.post(new RunnableC0059l(4, activity3, c0035c, str));
                }
                return c3967n;
        }
    }
}
