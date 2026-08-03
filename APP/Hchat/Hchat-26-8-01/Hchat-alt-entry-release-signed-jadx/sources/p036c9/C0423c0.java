package p036c9;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.TimePicker;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p002a1.RunnableC0006d;
import p014b.C0126e;
import p068eh.AbstractC0921a;
import p071f1.C1017n;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p109hb.C1668a0;
import p109hb.C1684i0;
import p116i.AbstractC1742d;
import p116i.C1753g1;
import p116i.C1765k1;
import p116i.InterfaceC1803y;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p144k.AbstractC2192n;
import p146k1.AbstractC2233b;
import p218og.AbstractC3156t;
import p259r9.AbstractC3754e0;
import p266s0.AbstractC3879i;
import p266s0.C3873c;
import p269s3.AbstractC3924b;
import p276sf.C3967n;
import p308v1.C4427s0;
import p317vb.InterfaceC4544a;
import p332wb.AbstractC4955ho;
import p332wb.C4720aj;
import p332wb.C4859er;
import p332wb.C5233q7;
import p332wb.C5242qg;
import p332wb.C5441wh;
import p332wb.C5491y2;
import p345x8.C5726s;
import p356y0.InterfaceC5853o;
import sh.C4054v;

/* JADX INFO: renamed from: c9.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0423c0 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1209g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1210h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1211i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1212j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1213k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1214l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1215m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0423c0(Context context, InterfaceC4544a interfaceC4544a, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, InterfaceC1220a interfaceC1220a3, int i9) {
        this.f1209g = 8;
        this.f1211i = context;
        this.f1212j = interfaceC4544a;
        this.f1214l = interfaceC1220a;
        this.f1215m = interfaceC1220a2;
        this.f1213k = interfaceC1220a3;
        this.f1210h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03d7  */
    @Override // p085fg.InterfaceC1235p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        C1823e c1823e;
        boolean zM4538h;
        Object objM4514P;
        final int i9;
        C1823e c1823e2;
        switch (this.f1209g) {
            case 0:
                ((Integer) obj2).getClass();
                ((C0452j1) this.f1211i).m1462c((String) this.f1212j, (String) this.f1213k, (InterfaceC1220a) this.f1214l, (InterfaceC1220a) this.f1215m, (C1836h0) obj, AbstractC1874r.m4617C(this.f1210h | 1));
                break;
            case 1:
                final C1684i0 c1684i0 = (C1684i0) this.f1211i;
                final Activity activity = (Activity) this.f1212j;
                List list = (List) this.f1213k;
                List list2 = (List) this.f1214l;
                C0126e c0126e = (C0126e) this.f1215m;
                int iIntValue = ((Integer) obj).intValue();
                Set set = (Set) obj2;
                set.getClass();
                final C1668a0 c1668a0 = new C1668a0(c1684i0, iIntValue, set, activity, list, list2, this.f1210h, c0126e);
                c1684i0.getClass();
                final Calendar calendar = Calendar.getInstance();
                calendar.add(12, 5);
                new DatePickerDialog(activity, new DatePickerDialog.OnDateSetListener() { // from class: hb.d0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public final void onDateSet(DatePicker datePicker, final int i10, final int i11, final int i12) {
                        final C1684i0 c1684i02 = c1684i0;
                        final Activity activity2 = activity;
                        final Calendar calendar2 = calendar;
                        final C1668a0 c1668a02 = c1668a0;
                        new TimePickerDialog(activity2, new TimePickerDialog.OnTimeSetListener() { // from class: hb.v
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // android.app.TimePickerDialog.OnTimeSetListener
                            public final void onTimeSet(TimePicker timePicker, int i13, int i14) {
                                View decorView;
                                int i15 = calendar2.get(13);
                                C1703z c1703z = new C1703z(c1668a02, i10, i11, i12, i13, i14, 0);
                                c1684i02.getClass();
                                Activity activity3 = activity2;
                                C1676e0 c1676e0 = new C1676e0(activity3, i15, c1703z, 0);
                                Window window = activity3.getWindow();
                                if (window == null || (decorView = window.getDecorView()) == null) {
                                    c1676e0.invoke();
                                } else {
                                    decorView.postOnAnimation(new RunnableC0006d(activity3, 18, c1676e0));
                                }
                            }
                        }, calendar2.get(11), calendar2.get(12), true).show();
                    }
                }, calendar.get(1), calendar.get(2), calendar.get(5)).show();
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC1742d.m4367c((C1765k1) this.f1211i, (C1753g1) this.f1212j, this.f1213k, this.f1214l, (InterfaceC1803y) this.f1215m, (C1836h0) obj, AbstractC1874r.m4617C(this.f1210h | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC2192n.m5425b((AbstractC2233b) this.f1211i, (String) this.f1212j, (InterfaceC5853o) this.f1213k, (C4427s0) this.f1214l, (C1017n) this.f1215m, (C1836h0) obj, AbstractC1874r.m4617C(this.f1210h | 1));
                break;
            case 4:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f1211i;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f1214l;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1212j;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1213k;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f1215m;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
                    boolean zM4538h2 = c1836h0.m4538h(sharedPreferences);
                    Object objM4514P2 = c1836h0.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zM4538h2 || objM4514P2 == c1823e3) {
                        objM4514P2 = new C5242qg(sharedPreferences, interfaceC1809a1, 28);
                        c1836h0.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "朋友圈发布通知", "指定好友发布新朋友圈时提醒", false, (InterfaceC1231l) objM4514P2, c1836h0, 432, 8);
                    if (((Boolean) interfaceC1809a1.getValue()).booleanValue()) {
                        c1836h0.m4525a0(1409514838);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        int i10 = this.f1210h;
                        AbstractC4955ho.m9503b("提醒好友", i10 == 0 ? "未选择好友" : AbstractC0921a.m2250m(i10, "已选择 ", " 位好友"), interfaceC1220a, c1836h0, 6);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a12.getValue()).booleanValue();
                        boolean zM4538h3 = c1836h0.m4538h(sharedPreferences);
                        Object objM4514P3 = c1836h0.m4514P();
                        if (zM4538h3) {
                            c1823e = c1823e3;
                        } else {
                            c1823e = c1823e3;
                            if (objM4514P3 == c1823e) {
                            }
                            AbstractC4955ho.m9410P3(zBooleanValue2, "系统通知", "显示在系统通知栏", false, (InterfaceC1231l) objM4514P3, c1836h0, 432, 8);
                            AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                            boolean zBooleanValue3 = ((Boolean) interfaceC1809a13.getValue()).booleanValue();
                            zM4538h = c1836h0.m4538h(sharedPreferences);
                            objM4514P = c1836h0.m4514P();
                            if (!zM4538h || objM4514P == c1823e) {
                                objM4514P = new C5441wh(sharedPreferences, interfaceC1809a13, 0);
                                c1836h0.m4545k0(objM4514P);
                            }
                            AbstractC4955ho.m9410P3(zBooleanValue3, "Toast提醒", "在微信界面短暂显示提醒", false, (InterfaceC1231l) objM4514P, c1836h0, 432, 8);
                            c1836h0.m4553p(false);
                        }
                        objM4514P3 = new C5242qg(sharedPreferences, interfaceC1809a12, 29);
                        c1836h0.m4545k0(objM4514P3);
                        AbstractC4955ho.m9410P3(zBooleanValue2, "系统通知", "显示在系统通知栏", false, (InterfaceC1231l) objM4514P3, c1836h0, 432, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        boolean zBooleanValue32 = ((Boolean) interfaceC1809a13.getValue()).booleanValue();
                        zM4538h = c1836h0.m4538h(sharedPreferences);
                        objM4514P = c1836h0.m4514P();
                        if (!zM4538h) {
                            objM4514P = new C5441wh(sharedPreferences, interfaceC1809a13, 0);
                            c1836h0.m4545k0(objM4514P);
                            AbstractC4955ho.m9410P3(zBooleanValue32, "Toast提醒", "在微信界面短暂显示提醒", false, (InterfaceC1231l) objM4514P, c1836h0, 432, 8);
                            c1836h0.m4553p(false);
                        }
                    } else {
                        c1836h0.m4525a0(1410250964);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9694w1((Context) this.f1211i, (InterfaceC4544a) this.f1215m, (String) this.f1212j, (String) this.f1213k, (InterfaceC1220a) this.f1214l, (C1836h0) obj, AbstractC1874r.m4617C(this.f1210h | 1));
                break;
            case 6:
                final C5726s c5726s = (C5726s) this.f1211i;
                final InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f1212j;
                Context context = (Context) this.f1213k;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f1214l;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f1215m;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String strM9427R4 = AbstractC4955ho.m9427R4(c5726s.f23313b);
                    List listM9435S4 = AbstractC4955ho.m9435S4();
                    int i11 = c5726s.f23313b;
                    boolean zM4534f = c1836h02.m4534f(interfaceC1809a14);
                    final int i12 = this.f1210h;
                    boolean zM4530d = zM4534f | c1836h02.m4530d(i12) | c1836h02.m4538h(c5726s);
                    Object objM4514P4 = c1836h02.m4514P();
                    C1823e c1823e4 = C1851l.f6155a;
                    if (zM4530d || objM4514P4 == c1823e4) {
                        final int i13 = 0;
                        objM4514P4 = new InterfaceC1231l() { // from class: wb.cj
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj3) {
                                switch (i13) {
                                    case 0:
                                        int iIntValue4 = ((Integer) obj3).intValue();
                                        C5726s c5726s2 = c5726s;
                                        String str = HttpUrl.FRAGMENT_ENCODE_SET;
                                        if (iIntValue4 != 10 && iIntValue4 != 11 && iIntValue4 != 12) {
                                            int i14 = c5726s2.f23313b;
                                            String str2 = c5726s2.f23314c;
                                            if (iIntValue4 == i14 || (iIntValue4 != 13 && i14 != 13)) {
                                                str = str2;
                                            }
                                        }
                                        AbstractC4955ho.m9342H(interfaceC1809a14, i12, C5726s.m10397a(c5726s2, iIntValue4, str, 0L, false, 25));
                                        break;
                                    case 1:
                                        String str3 = (String) obj3;
                                        str3.getClass();
                                        Long lM6743g0 = AbstractC3156t.m6743g0(str3);
                                        AbstractC4955ho.m9342H(interfaceC1809a14, i12, C5726s.m10397a(c5726s, 0, null, lM6743g0 != null ? AbstractC3754e0.m7911s(lM6743g0.longValue(), 0L, 600000L) : 0L, false, 23));
                                        break;
                                    default:
                                        AbstractC4955ho.m9342H(interfaceC1809a14, i12, C5726s.m10397a(c5726s, 0, null, 0L, ((Boolean) obj3).booleanValue(), 15));
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h02.m4545k0(objM4514P4);
                    }
                    AbstractC4955ho.m9361J2("回复类型", strM9427R4, listM9435S4, i11, (InterfaceC1231l) objM4514P4, false, c1836h02, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    int i14 = c5726s.f23313b;
                    if (i14 == 10 || i14 == 11 || i14 == 12) {
                        i9 = i12;
                        c1823e2 = c1823e4;
                        c1836h02.m4525a0(51741180);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(51219357);
                        i9 = i12;
                        boolean zM4534f2 = c1836h02.m4534f(interfaceC1809a14) | c1836h02.m4530d(i9);
                        Object objM4514P5 = c1836h02.m4514P();
                        c1823e2 = c1823e4;
                        if (zM4534f2 || objM4514P5 == c1823e2) {
                            objM4514P5 = new C5233q7(i9, interfaceC1809a14, 2);
                            c1836h02.m4545k0(objM4514P5);
                        }
                        InterfaceC1231l interfaceC1231l = (InterfaceC1231l) objM4514P5;
                        Object objM4514P6 = c1836h02.m4514P();
                        if (objM4514P6 == c1823e2) {
                            objM4514P6 = new C4720aj(interfaceC1809a15, 1);
                            c1836h02.m4545k0(objM4514P6);
                        }
                        InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) objM4514P6;
                        Object objM4514P7 = c1836h02.m4514P();
                        if (objM4514P7 == c1823e2) {
                            objM4514P7 = new C4720aj(interfaceC1809a16, 2);
                            c1836h02.m4545k0(objM4514P7);
                        }
                        AbstractC4955ho.m9326F(context, c5726s, interfaceC1231l, interfaceC1231l2, (InterfaceC1231l) objM4514P7, c1836h02, 27648);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        c1836h02.m4553p(false);
                    }
                    String strValueOf = String.valueOf(c5726s.f23315d);
                    boolean zM4534f3 = c1836h02.m4534f(interfaceC1809a14) | c1836h02.m4530d(i9) | c1836h02.m4538h(c5726s);
                    Object objM4514P8 = c1836h02.m4514P();
                    if (zM4534f3 || objM4514P8 == c1823e2) {
                        final int i15 = 1;
                        objM4514P8 = new InterfaceC1231l() { // from class: wb.cj
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj3) {
                                switch (i15) {
                                    case 0:
                                        int iIntValue4 = ((Integer) obj3).intValue();
                                        C5726s c5726s2 = c5726s;
                                        String str = HttpUrl.FRAGMENT_ENCODE_SET;
                                        if (iIntValue4 != 10 && iIntValue4 != 11 && iIntValue4 != 12) {
                                            int i142 = c5726s2.f23313b;
                                            String str2 = c5726s2.f23314c;
                                            if (iIntValue4 == i142 || (iIntValue4 != 13 && i142 != 13)) {
                                                str = str2;
                                            }
                                        }
                                        AbstractC4955ho.m9342H(interfaceC1809a14, i9, C5726s.m10397a(c5726s2, iIntValue4, str, 0L, false, 25));
                                        break;
                                    case 1:
                                        String str3 = (String) obj3;
                                        str3.getClass();
                                        Long lM6743g0 = AbstractC3156t.m6743g0(str3);
                                        AbstractC4955ho.m9342H(interfaceC1809a14, i9, C5726s.m10397a(c5726s, 0, null, lM6743g0 != null ? AbstractC3754e0.m7911s(lM6743g0.longValue(), 0L, 600000L) : 0L, false, 23));
                                        break;
                                    default:
                                        AbstractC4955ho.m9342H(interfaceC1809a14, i9, C5726s.m10397a(c5726s, 0, null, 0L, ((Boolean) obj3).booleanValue(), 15));
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h02.m4545k0(objM4514P8);
                    }
                    C1823e c1823e5 = c1823e2;
                    AbstractC4955ho.m9695w2("发送前延迟", "单位 ms", strValueOf, (InterfaceC1231l) objM4514P8, c1836h02, 54);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    boolean z9 = c5726s.f23316e;
                    boolean zM4534f4 = c1836h02.m4534f(interfaceC1809a14) | c1836h02.m4530d(i9) | c1836h02.m4538h(c5726s);
                    Object objM4514P9 = c1836h02.m4514P();
                    if (zM4534f4 || objM4514P9 == c1823e5) {
                        final int i16 = 2;
                        objM4514P9 = new InterfaceC1231l() { // from class: wb.cj
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj3) {
                                switch (i16) {
                                    case 0:
                                        int iIntValue4 = ((Integer) obj3).intValue();
                                        C5726s c5726s2 = c5726s;
                                        String str = HttpUrl.FRAGMENT_ENCODE_SET;
                                        if (iIntValue4 != 10 && iIntValue4 != 11 && iIntValue4 != 12) {
                                            int i142 = c5726s2.f23313b;
                                            String str2 = c5726s2.f23314c;
                                            if (iIntValue4 == i142 || (iIntValue4 != 13 && i142 != 13)) {
                                                str = str2;
                                            }
                                        }
                                        AbstractC4955ho.m9342H(interfaceC1809a14, i9, C5726s.m10397a(c5726s2, iIntValue4, str, 0L, false, 25));
                                        break;
                                    case 1:
                                        String str3 = (String) obj3;
                                        str3.getClass();
                                        Long lM6743g0 = AbstractC3156t.m6743g0(str3);
                                        AbstractC4955ho.m9342H(interfaceC1809a14, i9, C5726s.m10397a(c5726s, 0, null, lM6743g0 != null ? AbstractC3754e0.m7911s(lM6743g0.longValue(), 0L, 600000L) : 0L, false, 23));
                                        break;
                                    default:
                                        AbstractC4955ho.m9342H(interfaceC1809a14, i9, C5726s.m10397a(c5726s, 0, null, 0L, ((Boolean) obj3).booleanValue(), 15));
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h02.m4545k0(objM4514P9);
                    }
                    int i17 = i9;
                    AbstractC4955ho.m9410P3(z9, "随机追加延迟", "发送前额外随机等待 0-2 秒", false, (InterfaceC1231l) objM4514P9, c1836h02, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    boolean z10 = i17 > 0;
                    boolean z11 = i17 < AbstractC0000a.m54b0((List) interfaceC1809a14.getValue());
                    boolean zM4534f5 = c1836h02.m4534f(interfaceC1809a14) | c1836h02.m4530d(i17);
                    Object objM4514P10 = c1836h02.m4514P();
                    if (zM4534f5 || objM4514P10 == c1823e5) {
                        objM4514P10 = new C4054v(i17, 1, interfaceC1809a14);
                        c1836h02.m4545k0(objM4514P10);
                    }
                    InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P10;
                    boolean zM4534f6 = c1836h02.m4534f(interfaceC1809a14) | c1836h02.m4530d(i17);
                    Object objM4514P11 = c1836h02.m4514P();
                    if (zM4534f6 || objM4514P11 == c1823e5) {
                        objM4514P11 = new C4054v(i17, 2, interfaceC1809a14);
                        c1836h02.m4545k0(objM4514P11);
                    }
                    InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P11;
                    boolean zM4534f7 = c1836h02.m4534f(interfaceC1809a14) | c1836h02.m4530d(i17);
                    Object objM4514P12 = c1836h02.m4514P();
                    if (zM4534f7 || objM4514P12 == c1823e5) {
                        objM4514P12 = new C4054v(i17, 3, interfaceC1809a14);
                        c1836h02.m4545k0(objM4514P12);
                    }
                    AbstractC4955ho.m9498a3(z10, z11, interfaceC1220a2, interfaceC1220a3, (InterfaceC1220a) objM4514P12, c1836h02, 0);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9489Z2((Context) this.f1211i, this.f1210h, (String) this.f1212j, (InterfaceC1231l) this.f1213k, (InterfaceC1231l) this.f1214l, (List) this.f1215m, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9633p3((Context) this.f1211i, (InterfaceC4544a) this.f1212j, (InterfaceC1220a) this.f1214l, (InterfaceC1220a) this.f1215m, (InterfaceC1220a) this.f1213k, (C1836h0) obj, AbstractC1874r.m4617C(this.f1210h | 1));
                break;
            case 9:
                C0416a1 c0416a1 = (C0416a1) this.f1211i;
                Activity activity2 = (Activity) this.f1212j;
                FrameLayout frameLayout = (FrameLayout) this.f1213k;
                FrameLayout frameLayout2 = (FrameLayout) this.f1214l;
                C4859er c4859er = (C4859er) this.f1215m;
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC1874r.m4619a(AbstractC3924b.f12884a.mo4582a(c0416a1), AbstractC3879i.m8071e(-145262632, new C3873c(activity2, frameLayout, frameLayout2, this.f1210h, c4859er, 11), c1836h03), c1836h03, 48);
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            default:
                C5491y2 c5491y2 = (C5491y2) this.f1211i;
                List list3 = (List) this.f1213k;
                String str = (String) this.f1212j;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f1215m;
                ((Integer) obj2).getClass();
                c5491y2.m9902l0(AbstractC1874r.m4617C(this.f1210h | 1), (InterfaceC1220a) this.f1214l, interfaceC1231l3, (C1836h0) obj, str, list3);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0423c0(Context context, int i9, String str, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, List list, int i10) {
        this.f1209g = 7;
        this.f1211i = context;
        this.f1210h = i9;
        this.f1212j = str;
        this.f1213k = interfaceC1231l;
        this.f1214l = interfaceC1231l2;
        this.f1215m = list;
    }

    public /* synthetic */ C0423c0(Context context, InterfaceC4544a interfaceC4544a, String str, String str2, InterfaceC1220a interfaceC1220a, int i9) {
        this.f1209g = 5;
        this.f1211i = context;
        this.f1215m = interfaceC4544a;
        this.f1212j = str;
        this.f1213k = str2;
        this.f1214l = interfaceC1220a;
        this.f1210h = i9;
    }

    public /* synthetic */ C0423c0(SharedPreferences sharedPreferences, int i9, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f1209g = 4;
        this.f1211i = sharedPreferences;
        this.f1210h = i9;
        this.f1214l = interfaceC1220a;
        this.f1212j = interfaceC1809a1;
        this.f1213k = interfaceC1809a12;
        this.f1215m = interfaceC1809a13;
    }

    public /* synthetic */ C0423c0(Object obj, Activity activity, Object obj2, Object obj3, int i9, Object obj4, int i10) {
        this.f1209g = i10;
        this.f1211i = obj;
        this.f1212j = activity;
        this.f1213k = obj2;
        this.f1214l = obj3;
        this.f1210h = i9;
        this.f1215m = obj4;
    }

    public /* synthetic */ C0423c0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9, int i10) {
        this.f1209g = i10;
        this.f1211i = obj;
        this.f1212j = obj2;
        this.f1213k = obj3;
        this.f1214l = obj4;
        this.f1215m = obj5;
        this.f1210h = i9;
    }

    public /* synthetic */ C0423c0(C5491y2 c5491y2, List list, String str, InterfaceC1231l interfaceC1231l, InterfaceC1220a interfaceC1220a, int i9) {
        this.f1209g = 10;
        this.f1211i = c5491y2;
        this.f1213k = list;
        this.f1212j = str;
        this.f1215m = interfaceC1231l;
        this.f1214l = interfaceC1220a;
        this.f1210h = i9;
    }

    public /* synthetic */ C0423c0(C5726s c5726s, InterfaceC1809a1 interfaceC1809a1, int i9, Context context, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f1209g = 6;
        this.f1211i = c5726s;
        this.f1212j = interfaceC1809a1;
        this.f1210h = i9;
        this.f1213k = context;
        this.f1214l = interfaceC1809a12;
        this.f1215m = interfaceC1809a13;
    }
}
