package p036c9;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p024b9.RunnableC0217c;
import p051db.C0768f;
import p054dg.AbstractC0793l;
import p063e9.C0832c;
import p065eb.C0884o;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p211o9.C3104q;
import p218og.AbstractC3149m;
import p251r.C3641z;
import p261rb.C3797m;
import p266s0.AbstractC3879i;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p288tb.C4143c;
import p315v8.C4521a;
import p317vb.InterfaceC4544a;
import p332wb.AbstractC4955ho;
import p332wb.C4805d5;
import p332wb.C4813dd;
import p332wb.C4818di;
import p332wb.C4883fi;
import p332wb.C5040kc;
import p332wb.C5079li;
import p332wb.C5402vb;
import p332wb.C5435wb;
import p332wb.C5468xb;
import p332wb.C5475xi;
import p332wb.C5491y2;
import p345x8.C5709b;

/* JADX INFO: renamed from: c9.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0427d0 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1226g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1227h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1228i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1229j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1230k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1231l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1232m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f1233n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f1234o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0427d0(SharedPreferences sharedPreferences, Context context, C0832c c0832c, InterfaceC1231l interfaceC1231l, C0832c c0832c2, C0832c c0832c3, List list, InterfaceC1220a interfaceC1220a) {
        this.f1226g = 9;
        this.f1227h = sharedPreferences;
        this.f1230k = context;
        this.f1231l = c0832c;
        this.f1232m = interfaceC1231l;
        this.f1233n = c0832c2;
        this.f1234o = c0832c3;
        this.f1228i = list;
        this.f1229j = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r12v27, resolved type: i0.h0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v75, types: [boolean, int] */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9;
        String str;
        String str2;
        switch (this.f1226g) {
            case 0:
                ((Integer) obj2).getClass();
                ((C0452j1) this.f1227h).m1470k((List) this.f1228i, (InterfaceC1220a) this.f1229j, (InterfaceC1220a) this.f1230k, (InterfaceC1220a) this.f1231l, (InterfaceC1220a) this.f1232m, (InterfaceC1220a) this.f1233n, (InterfaceC1220a) this.f1234o, (C1836h0) obj, AbstractC1874r.m4617C(12582913));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((C0452j1) this.f1227h).m1461b((List) this.f1228i, (String) this.f1231l, (String) this.f1232m, (InterfaceC1231l) this.f1233n, (InterfaceC1231l) this.f1234o, (InterfaceC1220a) this.f1229j, (InterfaceC1220a) this.f1230k, (C1836h0) obj, AbstractC1874r.m4617C(12582913));
                break;
            case 2:
                Activity activity = (Activity) this.f1227h;
                String str3 = (String) this.f1228i;
                String str4 = (String) this.f1229j;
                String str5 = (String) this.f1230k;
                String str6 = (String) this.f1231l;
                C0482r0 c0482r0 = (C0482r0) this.f1232m;
                C0768f c0768f = (C0768f) this.f1233n;
                C5475xi c5475xi = (C5475xi) this.f1234o;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C5491y2.f22062j.m9907o(activity, AbstractC3879i.m8071e(-1041887312, new C4805d5(str3, str4, str5, str6, c0482r0, c0768f, c5475xi, 0), c1836h0), c1836h0, 432);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f1227h).m9921y((String) this.f1228i, (String) this.f1230k, (String) this.f1231l, (String) this.f1232m, (C0482r0) this.f1233n, (InterfaceC1236q) this.f1234o, (InterfaceC1220a) this.f1229j, (C1836h0) obj, AbstractC1874r.m4617C(12582913));
                break;
            case 4:
                final C4143c c4143c = (C4143c) this.f1227h;
                final InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1228i;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1229j;
                final Context context = (Context) this.f1230k;
                final InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f1231l;
                final InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f1232m;
                final Handler handler = (Handler) this.f1233n;
                final InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f1234o;
                final Uri uri = (Uri) obj;
                final String str7 = (String) obj2;
                uri.getClass();
                str7.getClass();
                if (!((Boolean) interfaceC1809a1.getValue()).booleanValue()) {
                    String str8 = (String) interfaceC1809a12.getValue();
                    if (AbstractC3149m.m6721t0(str8) || !AbstractC0921a.m2262y(str8)) {
                        str8 = null;
                    }
                    final String str9 = str8;
                    if (str9 == null) {
                        AbstractC4955ho.m9557h(context, interfaceC1809a13, "请先选择输入文件");
                    } else {
                        String strM9331F4 = AbstractC4955ho.m9331F4(AbstractC4955ho.m9548g(interfaceC1809a14), str9, c4143c);
                        if (strM9331F4 != null) {
                            AbstractC4955ho.m9557h(context, interfaceC1809a13, strM9331F4);
                        } else {
                            interfaceC1809a1.setValue(Boolean.TRUE);
                            interfaceC1809a13.setValue("正在转换并保存");
                            new Thread(new Runnable() { // from class: wb.ja
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object c3959f;
                                    int iAutoToSilk;
                                    Uri uri2 = uri;
                                    String str10 = str7;
                                    InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a15;
                                    String str11 = str9;
                                    File file = new File(str11);
                                    Context context2 = context;
                                    File file2 = new File(context2.getCacheDir(), "audio_transform_output");
                                    file2.mkdirs();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a14;
                                    int iM9548g = AbstractC4955ho.m9548g(interfaceC1809a17);
                                    File file3 = new File(file2, "audio_" + jCurrentTimeMillis + (iM9548g != 2 ? iM9548g != 3 ? ".silk" : ".m4a" : ".mp3"));
                                    try {
                                        int iIntValue2 = ((Number) interfaceC1809a17.getValue()).intValue();
                                        C4143c c4143c2 = c4143c;
                                        if (iIntValue2 != 0) {
                                            iAutoToSilk = iIntValue2 != 2 ? iIntValue2 != 3 ? -2 : c4143c2.silkToM4a(str11, file3.getAbsolutePath(), C4143c.DEFAULT_HZ) : c4143c2.silkToMp3(str11, file3.getAbsolutePath(), C4143c.DEFAULT_HZ);
                                        } else if (c4143c2.getFileType(str11) == 1) {
                                            AbstractC0793l.m2021a0(file, file3);
                                            iAutoToSilk = 0;
                                        } else {
                                            iAutoToSilk = c4143c2.autoToSilk(str11, file3.getAbsolutePath(), C4143c.DEFAULT_HZ);
                                        }
                                        if (iAutoToSilk != 0) {
                                            c3959f = new C3958e(Boolean.FALSE, "转换失败：" + c4143c2.getErrorMessage(iAutoToSilk));
                                        } else if (!file3.isFile() || file3.length() <= 0) {
                                            c3959f = new C3958e(Boolean.FALSE, "转换失败：输出文件为空");
                                        } else if (AbstractC4955ho.m9518c5(context2, file3, uri2)) {
                                            c3959f = new C3958e(Boolean.TRUE, "已保存为 " + ((Object) (AbstractC3149m.m6721t0(str10) ? AbstractC4955ho.m9315D4(((Number) interfaceC1809a17.getValue()).intValue(), (String) interfaceC1809a16.getValue()) : str10)));
                                        } else {
                                            c3959f = new C3958e(Boolean.FALSE, "保存失败：无法写入目标文件");
                                        }
                                    } catch (Throwable th2) {
                                        c3959f = new C3959f(th2);
                                    }
                                    Throwable thM8182b = C3960g.m8182b(c3959f);
                                    if (thM8182b != null) {
                                        Boolean bool = Boolean.FALSE;
                                        String message = thM8182b.getMessage();
                                        if (message == null) {
                                            message = "未知错误";
                                        }
                                        c3959f = new C3958e(bool, "转换异常：".concat(message));
                                    }
                                    C3958e c3958e = (C3958e) c3959f;
                                    if (file3.exists()) {
                                        try {
                                            file3.delete();
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    handler.post(new RunnableC0217c(c3958e, interfaceC1809a1, context2, interfaceC1809a13, 19));
                                }
                            }, "Hchat-AudioTransform-Save").start();
                        }
                    }
                }
                return C3967n.f12976a;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9593l((C4521a) this.f1227h, (C3641z) this.f1228i, (InterfaceC1220a) this.f1229j, (InterfaceC1231l) this.f1230k, (InterfaceC1235p) this.f1231l, (InterfaceC1231l) this.f1232m, (InterfaceC1231l) this.f1233n, (InterfaceC1231l) this.f1234o, (C1836h0) obj, AbstractC1874r.m4617C(1797505));
                break;
            case 6:
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f1227h;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f1228i;
                String str10 = (String) this.f1229j;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f1230k;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f1231l;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f1232m;
                Context context2 = (Context) this.f1233n;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f1234o;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) interfaceC1809a16.getValue()).booleanValue();
                    boolean zM4534f = c1836h02.m4534f(interfaceC1809a16) | c1836h02.m4538h(sharedPreferences) | c1836h02.m4534f(str10);
                    Object objM4514P = c1836h02.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4534f || objM4514P == c1823e) {
                        objM4514P = new C5402vb(sharedPreferences, str10, interfaceC1809a16, 0);
                        c1836h02.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "使用非好友", "仅在伪集赞选择器中额外加入群成员", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a17.getValue()).booleanValue();
                    boolean zM4534f2 = c1836h02.m4534f(interfaceC1809a17) | c1836h02.m4538h(sharedPreferences);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (zM4534f2 || objM4514P2 == c1823e) {
                        objM4514P2 = new C5435wb(sharedPreferences, interfaceC1809a17, 0);
                        c1836h02.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue2, "随机排序", "保存时随机排列点赞人的显示顺序", false, (InterfaceC1231l) objM4514P2, c1836h02, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    boolean zBooleanValue3 = ((Boolean) interfaceC1809a18.getValue()).booleanValue();
                    boolean zM4534f3 = c1836h02.m4534f(interfaceC1809a18) | c1836h02.m4538h(sharedPreferences);
                    Object objM4514P3 = c1836h02.m4514P();
                    if (zM4534f3 || objM4514P3 == c1823e) {
                        objM4514P3 = new C5435wb(sharedPreferences, interfaceC1809a18, 1);
                        c1836h02.m4545k0(objM4514P3);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue3, "自动勾选好友", "长按伪集赞后自动勾选指定人数", false, (InterfaceC1231l) objM4514P3, c1836h02, 432, 8);
                    if (((Boolean) interfaceC1809a18.getValue()).booleanValue()) {
                        c1836h02.m4525a0(1330804603);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        String str11 = (String) interfaceC1809a19.getValue();
                        boolean zM4534f4 = c1836h02.m4534f(interfaceC1809a19) | c1836h02.m4538h(sharedPreferences);
                        Object objM4514P4 = c1836h02.m4514P();
                        if (zM4534f4 || objM4514P4 == c1823e) {
                            objM4514P4 = new C5435wb(interfaceC1809a19, sharedPreferences);
                            c1836h02.m4545k0(objM4514P4);
                        }
                        AbstractC4955ho.m9695w2("自动勾选数量", "最少 1 人，不设上限", str11, (InterfaceC1231l) objM4514P4, c1836h02, 54);
                        c1836h02 = c1836h02;
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(1331604155);
                        c1836h02.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    String strM2250m = ((Set) interfaceC1809a110.getValue()).isEmpty() ? "未设置" : AbstractC0921a.m2250m(((Set) interfaceC1809a110.getValue()).size(), "已排除 ", " 人");
                    boolean zM4538h = c1836h02.m4538h(context2) | c1836h02.m4534f(interfaceC1809a16) | c1836h02.m4534f(interfaceC1809a110) | c1836h02.m4538h(sharedPreferences);
                    Object objM4514P5 = c1836h02.m4514P();
                    if (zM4538h || objM4514P5 == c1823e) {
                        objM4514P5 = new C5468xb(context2, interfaceC1809a16, interfaceC1809a110, sharedPreferences);
                        c1836h02.m4545k0(objM4514P5);
                    }
                    AbstractC4955ho.m9503b("设置排除名单", strM2250m, (InterfaceC1220a) objM4514P5, c1836h02, 6);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 7:
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f1227h;
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f1228i;
                String str12 = (String) this.f1229j;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f1230k;
                String str13 = (String) this.f1231l;
                Context context3 = (Context) this.f1232m;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f1233n;
                String str14 = (String) this.f1234o;
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zBooleanValue4 = ((Boolean) interfaceC1809a111.getValue()).booleanValue();
                    boolean zM4534f5 = c1836h03.m4534f(interfaceC1809a111) | c1836h03.m4538h(sharedPreferences2) | c1836h03.m4534f(str12);
                    Object objM4514P6 = c1836h03.m4514P();
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zM4534f5 || objM4514P6 == c1823e2) {
                        objM4514P6 = new C5402vb(sharedPreferences2, str12, interfaceC1809a111, 7);
                        c1836h03.m4545k0(objM4514P6);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue4, "通知震动", "触发该类型通知时震动", false, (InterfaceC1231l) objM4514P6, c1836h03, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                    boolean zBooleanValue5 = ((Boolean) interfaceC1809a112.getValue()).booleanValue();
                    boolean zM4534f6 = c1836h03.m4534f(interfaceC1809a112) | c1836h03.m4538h(sharedPreferences2) | c1836h03.m4534f(str13);
                    Object objM4514P7 = c1836h03.m4514P();
                    if (zM4534f6 || objM4514P7 == c1823e2) {
                        objM4514P7 = new C5402vb(sharedPreferences2, str13, interfaceC1809a112, 8);
                        c1836h03.m4545k0(objM4514P7);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue5, "通知铃声", "触发该类型通知时播放系统或自定义铃声", false, (InterfaceC1231l) objM4514P7, c1836h03, 432, 8);
                    if (((Boolean) interfaceC1809a112.getValue()).booleanValue()) {
                        c1836h03.m4525a0(-1480388998);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        String strM9421Q6 = AbstractC4955ho.m9421Q6(context3, (String) interfaceC1809a113.getValue(), 0);
                        boolean zM4538h2 = c1836h03.m4538h(context3) | c1836h03.m4534f(interfaceC1809a113) | c1836h03.m4538h(sharedPreferences2) | c1836h03.m4534f(str14);
                        Object objM4514P8 = c1836h03.m4514P();
                        if (zM4538h2 || objM4514P8 == c1823e2) {
                            objM4514P8 = new C5079li(context3, interfaceC1809a113, sharedPreferences2, str14);
                            c1836h03.m4545k0(objM4514P8);
                        }
                        AbstractC4955ho.m9503b("选择系统铃声", strM9421Q6, (InterfaceC1220a) objM4514P8, c1836h03, 6);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        String strM9421Q62 = AbstractC3149m.m6721t0((String) interfaceC1809a113.getValue()) ? "未选择" : AbstractC4955ho.m9421Q6(context3, (String) interfaceC1809a113.getValue(), 1);
                        boolean zM4538h3 = c1836h03.m4538h(context3) | c1836h03.m4534f(interfaceC1809a113) | c1836h03.m4538h(sharedPreferences2) | c1836h03.m4534f(str14);
                        Object objM4514P9 = c1836h03.m4514P();
                        if (zM4538h3 || objM4514P9 == c1823e2) {
                            objM4514P9 = new C5079li(context3, sharedPreferences2, str14, interfaceC1809a113);
                            c1836h03.m4545k0(objM4514P9);
                        }
                        AbstractC4955ho.m9503b("从文件选择铃声", strM9421Q62, (InterfaceC1220a) objM4514P9, c1836h03, 6);
                        if (AbstractC3149m.m6721t0((String) interfaceC1809a113.getValue())) {
                            c1836h03.m4525a0(-1478559564);
                            c1836h03.m4553p(false);
                        } else {
                            c1836h03.m4525a0(-1478843059);
                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                            boolean zM4534f7 = c1836h03.m4534f(interfaceC1809a113) | c1836h03.m4538h(sharedPreferences2) | c1836h03.m4534f(str14) | c1836h03.m4538h(context3);
                            Object objM4514P10 = c1836h03.m4514P();
                            if (zM4534f7 || objM4514P10 == c1823e2) {
                                objM4514P10 = new C5079li(sharedPreferences2, str14, context3, interfaceC1809a113);
                                c1836h03.m4545k0(objM4514P10);
                            }
                            AbstractC4955ho.m9503b("清空铃声", "恢复跟随系统", (InterfaceC1220a) objM4514P10, c1836h03, 54);
                            c1836h03.m4553p(false);
                        }
                        c1836h03.m4553p(false);
                    } else {
                        c1836h03.m4525a0(-1478549644);
                        c1836h03.m4553p(false);
                    }
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 8:
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f1227h;
                List list = (List) this.f1228i;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f1229j;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f1230k;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f1231l;
                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) this.f1232m;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f1233n;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f1234o;
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(sharedPreferences3, "auto_reply_enable", "启用自动回复", "开启后按规则回复收到的消息", false, c1836h04, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    boolean zBooleanValue6 = ((Boolean) interfaceC1809a114.getValue()).booleanValue();
                    boolean zM4538h4 = c1836h04.m4538h(sharedPreferences3);
                    Object objM4514P11 = c1836h04.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zM4538h4 || objM4514P11 == c1823e3) {
                        objM4514P11 = new C4818di(sharedPreferences3, interfaceC1809a114, 7);
                        c1836h04.m4545k0(objM4514P11);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue6, "排除指定会话", "开启后不回复指定会话的消息", false, (InterfaceC1231l) objM4514P11, c1836h04, 432, 8);
                    if (((Boolean) interfaceC1809a114.getValue()).booleanValue()) {
                        c1836h04.m4525a0(-1135774443);
                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                        String str15 = (String) interfaceC1809a115.getValue();
                        boolean zM4538h5 = c1836h04.m4538h(sharedPreferences3);
                        Object objM4514P12 = c1836h04.m4514P();
                        if (zM4538h5 || objM4514P12 == c1823e3) {
                            objM4514P12 = new C4818di(sharedPreferences3, interfaceC1809a115, 8);
                            c1836h04.m4545k0(objM4514P12);
                        }
                        AbstractC4955ho.m9304C1("排除会话 ID", "多个 ID 用逗号、分号或换行分隔", str15, 2, (InterfaceC1231l) objM4514P12, c1836h04, 3126, 0);
                        c1836h04.m4553p(false);
                    } else {
                        c1836h04.m4525a0(-1135452508);
                        c1836h04.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    if (list.isEmpty()) {
                        str = "暂无规则";
                    } else {
                        int size = list.size();
                        if (list.isEmpty()) {
                            i9 = 0;
                        } else {
                            Iterator it = list.iterator();
                            i9 = 0;
                            while (it.hasNext()) {
                                if (((C5709b) it.next()).f23201c && (i9 = i9 + 1) < 0) {
                                    AbstractC0000a.m30P0();
                                    throw null;
                                }
                            }
                        }
                        str = size + " 条规则，" + i9 + " 条启用";
                    }
                    AbstractC4955ho.m9503b("回复规则", str, interfaceC1220a, c1836h04, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    AbstractC4955ho.m9503b("好友请求处理", "自动同意好友申请并按步骤发送欢迎内容", interfaceC1220a2, c1836h04, 54);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    AbstractC4955ho.m9503b("通过后欢迎语", "对方通过你的好友请求后发送欢迎内容", interfaceC1220a3, c1836h04, 54);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    AbstractC4955ho.m9503b("AI 配置", "配置小智AI和智聊AI，多智聊模型可切换", interfaceC1220a4, c1836h04, 54);
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 9:
                SharedPreferences sharedPreferences4 = (SharedPreferences) this.f1227h;
                Context context4 = (Context) this.f1230k;
                C0832c c0832c = (C0832c) this.f1231l;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f1232m;
                C0832c c0832c2 = (C0832c) this.f1233n;
                C0832c c0832c3 = (C0832c) this.f1234o;
                List list2 = (List) this.f1228i;
                InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) this.f1229j;
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i10 = 0;
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(sharedPreferences4, "custom_notification_enable", "启用自定义通知", "开启后按会话专属规则或默认规则接管微信通知", false, c1836h05, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    String strM9536e5 = AbstractC4955ho.m9536e5(context4, c0832c);
                    boolean zM4534f8 = c1836h05.m4534f(interfaceC1231l);
                    Object objM4514P13 = c1836h05.m4514P();
                    C1823e c1823e4 = C1851l.f6155a;
                    if (zM4534f8 || objM4514P13 == c1823e4) {
                        objM4514P13 = new C0471o0(interfaceC1231l, 3);
                        c1836h05.m4545k0(objM4514P13);
                    }
                    AbstractC4955ho.m9503b("默认私聊通知", strM9536e5, (InterfaceC1220a) objM4514P13, c1836h05, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    String strM9536e52 = AbstractC4955ho.m9536e5(context4, c0832c2);
                    boolean zM4534f9 = c1836h05.m4534f(interfaceC1231l);
                    Object objM4514P14 = c1836h05.m4514P();
                    if (zM4534f9 || objM4514P14 == c1823e4) {
                        objM4514P14 = new C0471o0(interfaceC1231l, 4);
                        c1836h05.m4545k0(objM4514P14);
                    }
                    AbstractC4955ho.m9503b("默认群聊通知", strM9536e52, (InterfaceC1220a) objM4514P14, c1836h05, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    String strM9536e53 = AbstractC4955ho.m9536e5(context4, c0832c3);
                    boolean zM4534f10 = c1836h05.m4534f(interfaceC1231l);
                    Object objM4514P15 = c1836h05.m4514P();
                    if (zM4534f10 || objM4514P15 == c1823e4) {
                        objM4514P15 = new C0471o0(interfaceC1231l, 5);
                        c1836h05.m4545k0(objM4514P15);
                    }
                    AbstractC4955ho.m9503b("默认公众号通知", strM9536e53, (InterfaceC1220a) objM4514P15, c1836h05, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    if (list2.isEmpty()) {
                        str2 = "未配置会话";
                    } else {
                        int size2 = list2.size();
                        if (!list2.isEmpty()) {
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (((C0832c) it2.next()).f2515f && (i10 = i10 + 1) < 0) {
                                    AbstractC0000a.m30P0();
                                    throw null;
                                }
                            }
                        }
                        str2 = size2 + " 个会话，" + i10 + " 个启用";
                    }
                    boolean zM4534f11 = c1836h05.m4534f(interfaceC1220a5);
                    Object objM4514P16 = c1836h05.m4514P();
                    if (zM4534f11 || objM4514P16 == c1823e4) {
                        objM4514P16 = new C5040kc(interfaceC1220a5, 14);
                        c1836h05.m4545k0(objM4514P16);
                    }
                    AbstractC4955ho.m9503b("会话规则", str2, (InterfaceC1220a) objM4514P16, c1836h05, 6);
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 10:
                SharedPreferences sharedPreferences5 = (SharedPreferences) this.f1227h;
                Context context5 = (Context) this.f1228i;
                Set set = (Set) this.f1231l;
                InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) this.f1229j;
                Set set2 = (Set) this.f1232m;
                InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) this.f1230k;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f1233n;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f1234o;
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zBooleanValue7 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                    boolean zM4538h6 = c1836h06.m4538h(sharedPreferences5) | c1836h06.m4538h(context5);
                    Object objM4514P17 = c1836h06.m4514P();
                    Object obj3 = C1851l.f6155a;
                    if (zM4538h6 || objM4514P17 == obj3) {
                        objM4514P17 = new C4883fi(sharedPreferences5, interfaceC1809a116, interfaceC1809a117, context5);
                        c1836h06.m4545k0(objM4514P17);
                    }
                    ?? r32 = 0;
                    AbstractC4955ho.m9410P3(zBooleanValue7, "启用僵尸粉检测", "使用微信转账下单接口核验好友关系，不会确认付款", false, (InterfaceC1231l) objM4514P17, c1836h06, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    AbstractC4955ho.m9296B1("状态", ((C3797m) interfaceC1809a117.getValue()).f12466a ? ((C3797m) interfaceC1809a117.getValue()).f12468c : "检测接口定位中", null, c1836h06, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    int size3 = ((C3797m) interfaceC1809a117.getValue()).f12472g.size();
                    int i11 = ((C3797m) interfaceC1809a117.getValue()).f12470e;
                    int iM7990a = ((C3797m) interfaceC1809a117.getValue()).m7990a();
                    int iM7991b = ((C3797m) interfaceC1809a117.getValue()).m7991b();
                    StringBuilder sbM2256s = AbstractC0921a.m2256s(size3, i11, "已检测 ", "/", "，异常 ");
                    sbM2256s.append(iM7990a);
                    sbM2256s.append("，失败 ");
                    sbM2256s.append(iM7991b);
                    AbstractC4955ho.m9296B1("进度", sbM2256s.toString(), null, c1836h06, 6, 4);
                    if (((C3797m) interfaceC1809a117.getValue()).f12474i || ((C3797m) interfaceC1809a117.getValue()).f12475j > 0) {
                        c1836h06.m4525a0(1634330819);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        int i12 = ((C3797m) interfaceC1809a117.getValue()).f12476k;
                        int i13 = ((C3797m) interfaceC1809a117.getValue()).f12475j;
                        int i14 = ((C3797m) interfaceC1809a117.getValue()).f12477l;
                        int i15 = ((C3797m) interfaceC1809a117.getValue()).f12478m;
                        StringBuilder sbM2256s2 = AbstractC0921a.m2256s(i12, i13, "已处理 ", "/", "，已提交 ");
                        sbM2256s2.append(i14);
                        sbM2256s2.append("，失败 ");
                        sbM2256s2.append(i15);
                        AbstractC4955ho.m9296B1("删除进度", sbM2256s2.toString(), null, c1836h06, 6, 4);
                        r32 = 0;
                        c1836h06.m4553p(false);
                    } else {
                        c1836h06.m4525a0(1634640261);
                        c1836h06.m4553p(false);
                    }
                    if (AbstractC3149m.m6721t0(((C3797m) interfaceC1809a117.getValue()).f12469d)) {
                        c1836h06.m4525a0(1634822789);
                        c1836h06.m4553p(r32);
                    } else {
                        c1836h06.m4525a0(1634703625);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, r32, 1);
                        AbstractC4955ho.m9296B1("当前好友", ((C3797m) interfaceC1809a117.getValue()).f12469d, null, c1836h06, 6, 4);
                        c1836h06.m4553p(r32);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, r32, 1);
                    AbstractC4955ho.m9503b("检测范围", set.isEmpty() ? "全部好友" : AbstractC0921a.m2250m(set.size(), "已选择 ", " 位好友"), interfaceC1220a6, c1836h06, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    AbstractC4955ho.m9503b("排除好友", set2.isEmpty() ? "未排除" : AbstractC0921a.m2250m(set2.size(), "已排除 ", " 位好友"), interfaceC1220a7, c1836h06, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    String str16 = (((C3797m) interfaceC1809a117.getValue()).f12467b || ((C3797m) interfaceC1809a117.getValue()).f12474i) ? "停止当前任务" : "开始 / 继续检测";
                    String str17 = ((C3797m) interfaceC1809a117.getValue()).f12474i ? "停止后不再删除剩余好友" : ((C3797m) interfaceC1809a117.getValue()).f12467b ? "暂停后保留当前队列" : "按当前范围继续未完成进度";
                    boolean zM4538h7 = c1836h06.m4538h(context5);
                    Object objM4514P18 = c1836h06.m4514P();
                    if (zM4538h7 || objM4514P18 == obj3) {
                        objM4514P18 = new C4813dd(context5, interfaceC1809a117);
                        c1836h06.m4545k0(objM4514P18);
                    }
                    AbstractC4955ho.m9503b(str16, str17, (InterfaceC1220a) objM4514P18, c1836h06, 0);
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    boolean zM4538h8 = c1836h06.m4538h(context5);
                    Object objM4514P19 = c1836h06.m4514P();
                    if (zM4538h8 || objM4514P19 == obj3) {
                        objM4514P19 = new C4813dd(context5, interfaceC1809a117, 9);
                        c1836h06.m4545k0(objM4514P19);
                    }
                    AbstractC4955ho.m9503b("重置检测进度", "清空断点、结果和运行日志", (InterfaceC1220a) objM4514P19, c1836h06, 54);
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            case 11:
                List list3 = (List) this.f1228i;
                C3104q c3104q = (C3104q) this.f1227h;
                ArrayList arrayList = (ArrayList) this.f1229j;
                List list4 = (List) this.f1230k;
                String str18 = (String) this.f1231l;
                String str19 = (String) this.f1232m;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f1233n;
                Context context6 = (Context) this.f1234o;
                C1836h0 c1836h07 = (C1836h0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    c1836h07.m4519V();
                } else if (list3.isEmpty()) {
                    c1836h07.m4525a0(-595834116);
                    AbstractC4955ho.m9657s0("暂无模板。先返回回复模板管理新增模板。", c1836h07, 6);
                    c1836h07.m4553p(false);
                } else {
                    c1836h07.m4525a0(-595698987);
                    String strM9608m5 = c3104q != null ? AbstractC4955ho.m9608m5(c3104q) : "不使用模板，配置本群专属设置";
                    String str20 = c3104q != null ? c3104q.f10045a : null;
                    if (str20 == null) {
                        str20 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    boolean zM4538h9 = c1836h07.m4538h(list4) | c1836h07.m4534f(str18) | c1836h07.m4534f(str19) | c1836h07.m4534f(interfaceC1231l2) | c1836h07.m4538h(context6);
                    Object objM4514P20 = c1836h07.m4514P();
                    if (zM4538h9 || objM4514P20 == C1851l.f6155a) {
                        C0884o c0884o = new C0884o(list4, str18, str19, interfaceC1231l2, context6);
                        c1836h07.m4545k0(c0884o);
                        objM4514P20 = c0884o;
                    }
                    AbstractC4955ho.m9353I2("选择模板", strM9608m5, arrayList, str20, (InterfaceC1231l) objM4514P20, false, c1836h07, 6, 32);
                    c1836h07.m4553p(false);
                }
                return C3967n.f12976a;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9716z((InterfaceC4544a) this.f1227h, (SharedPreferences) this.f1234o, (List) this.f1228i, (InterfaceC1220a) this.f1229j, (InterfaceC1220a) this.f1230k, (InterfaceC1220a) this.f1231l, (InterfaceC1220a) this.f1232m, (InterfaceC1220a) this.f1233n, (C1836h0) obj, AbstractC1874r.m4617C(14376961));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9336G1((List) this.f1228i, (String) this.f1227h, (InterfaceC1231l) this.f1232m, (C3641z) this.f1233n, (InterfaceC1220a) this.f1229j, (InterfaceC1220a) this.f1230k, (InterfaceC1231l) this.f1234o, (InterfaceC1220a) this.f1231l, (C1836h0) obj, AbstractC1874r.m4617C(1794433));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0427d0(SharedPreferences sharedPreferences, Context context, Set set, InterfaceC1220a interfaceC1220a, Set set2, InterfaceC1220a interfaceC1220a2, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f1226g = 10;
        this.f1227h = sharedPreferences;
        this.f1228i = context;
        this.f1231l = set;
        this.f1229j = interfaceC1220a;
        this.f1232m = set2;
        this.f1230k = interfaceC1220a2;
        this.f1233n = interfaceC1809a1;
        this.f1234o = interfaceC1809a12;
    }

    public /* synthetic */ C0427d0(C0452j1 c0452j1, List list, String str, String str2, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, int i9) {
        this.f1226g = 1;
        this.f1227h = c0452j1;
        this.f1228i = list;
        this.f1231l = str;
        this.f1232m = str2;
        this.f1233n = interfaceC1231l;
        this.f1234o = interfaceC1231l2;
        this.f1229j = interfaceC1220a;
        this.f1230k = interfaceC1220a2;
    }

    public /* synthetic */ C0427d0(Object obj, Object obj2, InterfaceC1220a interfaceC1220a, InterfaceC3955b interfaceC3955b, InterfaceC3955b interfaceC3955b2, InterfaceC3955b interfaceC3955b3, InterfaceC3955b interfaceC3955b4, InterfaceC3955b interfaceC3955b5, int i9, int i10) {
        this.f1226g = i10;
        this.f1227h = obj;
        this.f1228i = obj2;
        this.f1229j = interfaceC1220a;
        this.f1230k = interfaceC3955b;
        this.f1231l = interfaceC3955b2;
        this.f1232m = interfaceC3955b3;
        this.f1233n = interfaceC3955b4;
        this.f1234o = interfaceC3955b5;
    }

    public /* synthetic */ C0427d0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i9) {
        this.f1226g = i9;
        this.f1227h = obj;
        this.f1228i = obj2;
        this.f1229j = obj3;
        this.f1230k = obj4;
        this.f1231l = obj5;
        this.f1232m = obj6;
        this.f1233n = obj7;
        this.f1234o = obj8;
    }

    public /* synthetic */ C0427d0(List list, String str, InterfaceC1231l interfaceC1231l, C3641z c3641z, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, InterfaceC1231l interfaceC1231l2, InterfaceC1220a interfaceC1220a3, int i9) {
        this.f1226g = 13;
        this.f1228i = list;
        this.f1227h = str;
        this.f1232m = interfaceC1231l;
        this.f1233n = c3641z;
        this.f1229j = interfaceC1220a;
        this.f1230k = interfaceC1220a2;
        this.f1234o = interfaceC1231l2;
        this.f1231l = interfaceC1220a3;
    }

    public /* synthetic */ C0427d0(List list, C3104q c3104q, ArrayList arrayList, List list2, String str, String str2, InterfaceC1231l interfaceC1231l, Context context) {
        this.f1226g = 11;
        this.f1228i = list;
        this.f1227h = c3104q;
        this.f1229j = arrayList;
        this.f1230k = list2;
        this.f1231l = str;
        this.f1232m = str2;
        this.f1233n = interfaceC1231l;
        this.f1234o = context;
    }

    public /* synthetic */ C0427d0(InterfaceC4544a interfaceC4544a, SharedPreferences sharedPreferences, List list, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, InterfaceC1220a interfaceC1220a3, InterfaceC1220a interfaceC1220a4, InterfaceC1220a interfaceC1220a5, int i9) {
        this.f1226g = 12;
        this.f1227h = interfaceC4544a;
        this.f1234o = sharedPreferences;
        this.f1228i = list;
        this.f1229j = interfaceC1220a;
        this.f1230k = interfaceC1220a2;
        this.f1231l = interfaceC1220a3;
        this.f1232m = interfaceC1220a4;
        this.f1233n = interfaceC1220a5;
    }

    public /* synthetic */ C0427d0(C5491y2 c5491y2, String str, String str2, String str3, String str4, C0482r0 c0482r0, InterfaceC1236q interfaceC1236q, InterfaceC1220a interfaceC1220a, int i9) {
        this.f1226g = 3;
        this.f1227h = c5491y2;
        this.f1228i = str;
        this.f1230k = str2;
        this.f1231l = str3;
        this.f1232m = str4;
        this.f1233n = c0482r0;
        this.f1234o = interfaceC1236q;
        this.f1229j = interfaceC1220a;
    }
}
