package p332wb;

import android.app.Activity;
import android.content.SharedPreferences;
import bi.AbstractC0316d;
import bi.C0314b;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import p036c9.C0467n0;
import p071f1.AbstractC0996c0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p136j8.AbstractC2091b;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p222p.AbstractC3208d;
import p222p.AbstractC3210d1;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.AbstractC3253s;
import p222p.C3213e1;
import p222p.C3216f1;
import p222p.C3220h;
import p222p.C3256t;
import p266s0.C3878h;
import p276sf.C3959f;
import p276sf.C3967n;
import p280t2.C4095k;
import p339x1.C5593d;
import p339x1.C5597e;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p346x9.AbstractC5737d;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5844f;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC4045s;

/* JADX INFO: renamed from: wb.kf */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5043kf implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18396g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f18397h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f18398i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f18399j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f18400k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5043kf(long j3, InterfaceC1220a interfaceC1220a, Activity activity, InterfaceC1231l interfaceC1231l) {
        this.f18397h = j3;
        this.f18398i = interfaceC1220a;
        this.f18399j = activity;
        this.f18400k = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        long jM2508d;
        Object c3959f;
        int i9 = this.f18396g;
        C3967n c3967n = C3967n.f12976a;
        Object obj3 = this.f18400k;
        Object obj4 = this.f18399j;
        Object obj5 = this.f18398i;
        long j3 = this.f18397h;
        switch (i9) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) obj5;
                List list = (List) obj4;
                String str = (String) obj3;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1836h0.m4519V();
                } else {
                    AbstractC4955ho.m9402O3(sharedPreferences, "keyword_notify_enable", "启用关键词通知", "收到匹配消息时提醒", false, c1836h0, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    AbstractC4955ho.m9296B1("关键词", AbstractC3199a.m6836i(list.size(), " 个"), null, c1836h0, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    String strM9264h = "暂无匹配记录";
                    if (j3 > 0) {
                        AtomicInteger atomicInteger = AbstractC5737d.f23377a;
                        if (j3 > 0) {
                            strM9264h = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(j3));
                            strM9264h.getClass();
                        }
                        strM9264h = AbstractC4855en.m9264h(strM9264h, " · ", str);
                    }
                    AbstractC4955ho.m9296B1("上次匹配", strM9264h, null, c1836h0, 6, 4);
                }
                break;
            default:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj5;
                Activity activity = (Activity) obj4;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) obj3;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c1836h02.m4519V();
                } else {
                    boolean zM4532e = c1836h02.m4532e(j3);
                    Object objM4514P = c1836h02.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    Long l10 = null;
                    Object obj6 = objM4514P;
                    if (zM4532e || objM4514P == c1823e) {
                        Calendar calendar = Calendar.getInstance();
                        Long lValueOf = Long.valueOf(j3);
                        if (j3 <= 0) {
                            lValueOf = null;
                        }
                        calendar.setTimeInMillis(lValueOf != null ? lValueOf.longValue() : System.currentTimeMillis());
                        c1836h02.m4545k0(calendar);
                        obj6 = calendar;
                    }
                    Calendar calendar2 = (Calendar) obj6;
                    boolean zM4534f = c1836h02.m4534f(calendar2);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (zM4534f || objM4514P2 == c1823e) {
                        objM4514P2 = AbstractC1874r.m4639u(String.valueOf(calendar2.get(1)));
                        c1836h02.m4545k0(objM4514P2);
                    }
                    InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P2;
                    boolean zM4534f2 = c1836h02.m4534f(calendar2);
                    Object objM4514P3 = c1836h02.m4514P();
                    if (zM4534f2 || objM4514P3 == c1823e) {
                        objM4514P3 = AbstractC1874r.m4639u(String.valueOf(calendar2.get(2) + 1));
                        c1836h02.m4545k0(objM4514P3);
                    }
                    InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) objM4514P3;
                    boolean zM4534f3 = c1836h02.m4534f(calendar2);
                    Object objM4514P4 = c1836h02.m4514P();
                    if (zM4534f3 || objM4514P4 == c1823e) {
                        objM4514P4 = AbstractC1874r.m4639u(String.valueOf(calendar2.get(5)));
                        c1836h02.m4545k0(objM4514P4);
                    }
                    InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) objM4514P4;
                    boolean zM4534f4 = c1836h02.m4534f(calendar2);
                    Object objM4514P5 = c1836h02.m4514P();
                    if (zM4534f4 || objM4514P5 == c1823e) {
                        objM4514P5 = AbstractC1874r.m4639u(String.valueOf(calendar2.get(11)));
                        c1836h02.m4545k0(objM4514P5);
                    }
                    InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) objM4514P5;
                    boolean zM4534f5 = c1836h02.m4534f(calendar2);
                    Object objM4514P6 = c1836h02.m4514P();
                    if (zM4534f5 || objM4514P6 == c1823e) {
                        objM4514P6 = AbstractC1874r.m4639u(String.valueOf(calendar2.get(12)));
                        c1836h02.m4545k0(objM4514P6);
                    }
                    InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) objM4514P6;
                    boolean zM4534f6 = c1836h02.m4534f(calendar2);
                    Object objM4514P7 = c1836h02.m4514P();
                    if (zM4534f6 || objM4514P7 == c1823e) {
                        objM4514P7 = AbstractC1874r.m4639u(String.valueOf(calendar2.get(13)));
                        c1836h02.m4545k0(objM4514P7);
                    }
                    InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) objM4514P7;
                    String str2 = (String) interfaceC1809a1.getValue();
                    String str3 = (String) interfaceC1809a12.getValue();
                    String str4 = (String) interfaceC1809a13.getValue();
                    String str5 = (String) interfaceC1809a14.getValue();
                    String str6 = (String) interfaceC1809a15.getValue();
                    String str7 = (String) interfaceC1809a16.getValue();
                    Integer numM6742f0 = AbstractC3156t.m6742f0(str2);
                    if (numM6742f0 != null) {
                        int iIntValue3 = numM6742f0.intValue();
                        Integer num = (1970 > iIntValue3 || iIntValue3 >= 2039) ? null : numM6742f0;
                        if (num != null) {
                            int iIntValue4 = num.intValue();
                            Integer numM6742f02 = AbstractC3156t.m6742f0(str3);
                            if (numM6742f02 != null) {
                                int iIntValue5 = numM6742f02.intValue();
                                if (1 > iIntValue5 || iIntValue5 >= 13) {
                                    numM6742f02 = null;
                                }
                                if (numM6742f02 != null) {
                                    int iIntValue6 = numM6742f02.intValue();
                                    Integer numM6742f03 = AbstractC3156t.m6742f0(str4);
                                    if (numM6742f03 != null) {
                                        int iIntValue7 = numM6742f03.intValue();
                                        if (1 > iIntValue7 || iIntValue7 >= 32) {
                                            numM6742f03 = null;
                                        }
                                        if (numM6742f03 != null) {
                                            int iIntValue8 = numM6742f03.intValue();
                                            Integer numM6742f04 = AbstractC3156t.m6742f0(str5);
                                            if (numM6742f04 != null) {
                                                int iIntValue9 = numM6742f04.intValue();
                                                if (iIntValue9 < 0 || iIntValue9 >= 24) {
                                                    numM6742f04 = null;
                                                }
                                                if (numM6742f04 != null) {
                                                    int iIntValue10 = numM6742f04.intValue();
                                                    Integer numM6742f05 = AbstractC3156t.m6742f0(str6);
                                                    if (numM6742f05 != null) {
                                                        int iIntValue11 = numM6742f05.intValue();
                                                        if (iIntValue11 < 0 || iIntValue11 >= 60) {
                                                            numM6742f05 = null;
                                                        }
                                                        if (numM6742f05 != null) {
                                                            int iIntValue12 = numM6742f05.intValue();
                                                            Integer numM6742f06 = AbstractC3156t.m6742f0(str7);
                                                            if (numM6742f06 != null) {
                                                                int iIntValue13 = numM6742f06.intValue();
                                                                if (iIntValue13 < 0 || iIntValue13 >= 60) {
                                                                    numM6742f06 = null;
                                                                }
                                                                if (numM6742f06 != null) {
                                                                    int iIntValue14 = numM6742f06.intValue();
                                                                    try {
                                                                        Calendar calendar3 = Calendar.getInstance();
                                                                        calendar3.setLenient(false);
                                                                        calendar3.clear();
                                                                        calendar3.set(iIntValue4, iIntValue6 - 1, iIntValue8, iIntValue10, iIntValue12, iIntValue14);
                                                                        c3959f = Long.valueOf(calendar3.getTimeInMillis());
                                                                    } catch (Throwable th2) {
                                                                        c3959f = new C3959f(th2);
                                                                    }
                                                                    if (c3959f instanceof C3959f) {
                                                                        c3959f = null;
                                                                    }
                                                                    Long l11 = (Long) c3959f;
                                                                    if (l11 != null) {
                                                                        long jLongValue = l11.longValue() / 1000;
                                                                        if (1 <= jLongValue && jLongValue < 2147483648L) {
                                                                            l10 = l11;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Long l12 = l10;
                    C5850l c5850l = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM6901d = AbstractC3222h1.m6901d(c5850l, 1.0f);
                    C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h02, 0);
                    int iHashCode = Long.hashCode(c1836h02.f6095T);
                    C3878h c3878hM4546l = c1836h02.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6901d);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y = C5601f.f22758b;
                    c1836h02.m4531d0();
                    if (c1836h02.f6094S) {
                        c1836h02.m4544k(c5660y);
                    } else {
                        c1836h02.m4551n0();
                    }
                    C5597e c5597e = C5601f.f22761e;
                    AbstractC1874r.m4615A(c5597e, c1836h02, c3256tM6935a);
                    C5597e c5597e2 = C5601f.f22760d;
                    AbstractC1874r.m4615A(c5597e2, c1836h02, c3878hM4546l);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    C5597e c5597e3 = C5601f.f22762f;
                    AbstractC1874r.m4615A(c5597e3, c1836h02, numValueOf);
                    C5593d c5593d = C5601f.f22763g;
                    AbstractC1874r.m4641w(c5593d, c1836h02);
                    C5597e c5597e4 = C5601f.f22759c;
                    AbstractC1874r.m4615A(c5597e4, c1836h02, interfaceC5853oM10543c);
                    InterfaceC5853o interfaceC5853oM6901d2 = AbstractC3222h1.m6901d(c5850l, 1.0f);
                    float f3 = 8;
                    C3220h c3220hM6921g = AbstractC3226j.m6921g(f3);
                    C5844f c5844f = C5840b.f23770p;
                    C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(c3220hM6921g, c5844f, c1836h02, 6);
                    int iHashCode2 = Long.hashCode(c1836h02.f6095T);
                    C3878h c3878hM4546l2 = c1836h02.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6901d2);
                    c1836h02.m4531d0();
                    if (c1836h02.f6094S) {
                        c1836h02.m4544k(c5660y);
                    } else {
                        c1836h02.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e, c1836h02, c3213e1M6892a);
                    AbstractC1874r.m4615A(c5597e2, c1836h02, c3878hM4546l2);
                    AbstractC2091b.m5169p(iHashCode2, c1836h02, c5597e3, c1836h02, c5593d);
                    AbstractC1874r.m4615A(c5597e4, c1836h02, interfaceC5853oM10543c2);
                    C5491y2 c5491y2 = C5491y2.f22068p;
                    String str8 = (String) interfaceC1809a1.getValue();
                    C3216f1 c3216f1 = C3216f1.f10272a;
                    InterfaceC5853o interfaceC5853oM6897a = c3216f1.m6897a(c5850l, true);
                    boolean zM4534f7 = c1836h02.m4534f(interfaceC1809a1);
                    Object objM4514P8 = c1836h02.m4514P();
                    if (zM4534f7 || objM4514P8 == c1823e) {
                        objM4514P8 = new C5086lp(interfaceC1809a1, 18);
                        c1836h02.m4545k0(objM4514P8);
                    }
                    c5491y2.m9897j("年", str8, 4, 2038, interfaceC5853oM6897a, (InterfaceC1231l) objM4514P8, c1836h02, 1576326);
                    String str9 = (String) interfaceC1809a12.getValue();
                    InterfaceC5853o interfaceC5853oM6897a2 = c3216f1.m6897a(c5850l, true);
                    boolean zM4534f8 = c1836h02.m4534f(interfaceC1809a12);
                    Object objM4514P9 = c1836h02.m4514P();
                    if (zM4534f8 || objM4514P9 == c1823e) {
                        objM4514P9 = new C5086lp(interfaceC1809a12, 19);
                        c1836h02.m4545k0(objM4514P9);
                    }
                    c5491y2.m9897j("月", str9, 2, 12, interfaceC5853oM6897a2, (InterfaceC1231l) objM4514P9, c1836h02, 1576326);
                    String str10 = (String) interfaceC1809a13.getValue();
                    InterfaceC5853o interfaceC5853oM6897a3 = c3216f1.m6897a(c5850l, true);
                    boolean zM4534f9 = c1836h02.m4534f(interfaceC1809a13);
                    Object objM4514P10 = c1836h02.m4514P();
                    if (zM4534f9 || objM4514P10 == c1823e) {
                        objM4514P10 = new C5086lp(interfaceC1809a13, 20);
                        c1836h02.m4545k0(objM4514P10);
                    }
                    c5491y2.m9897j("日", str10, 2, 31, interfaceC5853oM6897a3, (InterfaceC1231l) objM4514P10, c1836h02, 1576326);
                    c1836h02.m4553p(true);
                    InterfaceC5853o interfaceC5853oM6886p = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 10, 0.0f, 0.0f, 13);
                    C3213e1 c3213e1M6892a2 = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(f3), c5844f, c1836h02, 6);
                    int iHashCode3 = Long.hashCode(c1836h02.f6095T);
                    C3878h c3878hM4546l3 = c1836h02.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c3 = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6886p);
                    c1836h02.m4531d0();
                    if (c1836h02.f6094S) {
                        c1836h02.m4544k(c5660y);
                    } else {
                        c1836h02.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e, c1836h02, c3213e1M6892a2);
                    AbstractC1874r.m4615A(c5597e2, c1836h02, c3878hM4546l3);
                    AbstractC2091b.m5169p(iHashCode3, c1836h02, c5597e3, c1836h02, c5593d);
                    AbstractC1874r.m4615A(c5597e4, c1836h02, interfaceC5853oM10543c3);
                    String str11 = (String) interfaceC1809a14.getValue();
                    InterfaceC5853o interfaceC5853oM6897a4 = c3216f1.m6897a(c5850l, true);
                    boolean zM4534f10 = c1836h02.m4534f(interfaceC1809a14);
                    Object objM4514P11 = c1836h02.m4514P();
                    if (zM4534f10 || objM4514P11 == c1823e) {
                        objM4514P11 = new C5086lp(interfaceC1809a14, 21);
                        c1836h02.m4545k0(objM4514P11);
                    }
                    c5491y2.m9897j("时", str11, 2, 23, interfaceC5853oM6897a4, (InterfaceC1231l) objM4514P11, c1836h02, 1576326);
                    String str12 = (String) interfaceC1809a15.getValue();
                    InterfaceC5853o interfaceC5853oM6897a5 = c3216f1.m6897a(c5850l, true);
                    boolean zM4534f11 = c1836h02.m4534f(interfaceC1809a15);
                    Object objM4514P12 = c1836h02.m4514P();
                    if (zM4534f11 || objM4514P12 == c1823e) {
                        objM4514P12 = new C5086lp(interfaceC1809a15, 22);
                        c1836h02.m4545k0(objM4514P12);
                    }
                    c5491y2.m9897j("分", str12, 2, 59, interfaceC5853oM6897a5, (InterfaceC1231l) objM4514P12, c1836h02, 1576326);
                    String str13 = (String) interfaceC1809a16.getValue();
                    InterfaceC5853o interfaceC5853oM6897a6 = c3216f1.m6897a(c5850l, true);
                    boolean zM4534f12 = c1836h02.m4534f(interfaceC1809a16);
                    Object objM4514P13 = c1836h02.m4514P();
                    if (zM4534f12 || objM4514P13 == c1823e) {
                        objM4514P13 = new C5086lp(interfaceC1809a16, 23);
                        c1836h02.m4545k0(objM4514P13);
                    }
                    c5491y2.m9897j("秒", str13, 2, 59, interfaceC5853oM6897a6, (InterfaceC1231l) objM4514P13, c1836h02, 1576326);
                    c1836h02.m4553p(true);
                    String str14 = l12 != null ? String.format(Locale.US, "%04d-%02d-%02d %02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(Integer.parseInt((String) interfaceC1809a1.getValue())), Integer.valueOf(Integer.parseInt((String) interfaceC1809a12.getValue())), Integer.valueOf(Integer.parseInt((String) interfaceC1809a13.getValue())), Integer.valueOf(Integer.parseInt((String) interfaceC1809a14.getValue())), Integer.valueOf(Integer.parseInt((String) interfaceC1809a15.getValue())), Integer.valueOf(Integer.parseInt((String) interfaceC1809a16.getValue()))}, 6)) : "请输入有效的年、月、日、时、分、秒";
                    if (l12 != null) {
                        c1836h02.m4525a0(-1625262846);
                        jM2508d = ((C0314b) c1836h02.m4542j(AbstractC0316d.f944a)).m1238h();
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(-1625148673);
                        c1836h02.m4553p(false);
                        jM2508d = AbstractC0996c0.m2508d(4292030255L);
                    }
                    float f10 = 12;
                    AbstractC4045s.m8250n(str14, AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, f10, 0.0f, 0.0f, 13), jM2508d, AbstractC5700d.m10248D(13), null, null, 0L, new C4095k(3), 0L, 0, false, 0, 0, null, null, c1836h02, 24624, 0, 261096);
                    InterfaceC5853o interfaceC5853oM6886p2 = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, f10, 0.0f, 6, 5);
                    C3213e1 c3213e1M6892a3 = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(f3), c5844f, c1836h02, 6);
                    int iHashCode4 = Long.hashCode(c1836h02.f6095T);
                    C3878h c3878hM4546l4 = c1836h02.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c4 = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6886p2);
                    c1836h02.m4531d0();
                    if (c1836h02.f6094S) {
                        c1836h02.m4544k(c5660y);
                    } else {
                        c1836h02.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e, c1836h02, c3213e1M6892a3);
                    AbstractC1874r.m4615A(c5597e2, c1836h02, c3878hM4546l4);
                    AbstractC2091b.m5169p(iHashCode4, c1836h02, c5597e3, c1836h02, c5593d);
                    AbstractC1874r.m4615A(c5597e4, c1836h02, interfaceC5853oM10543c4);
                    c5491y2.m9899k("取消", interfaceC1220a, c3216f1.m6897a(c5850l, true), false, c1836h02, 24582, 8);
                    boolean zM4534f13 = c1836h02.m4534f(l12) | c1836h02.m4534f(interfaceC1220a) | c1836h02.m4538h(activity) | c1836h02.m4534f(interfaceC1231l);
                    Object objM4514P14 = c1836h02.m4514P();
                    if (zM4534f13 || objM4514P14 == c1823e) {
                        C0467n0 c0467n0 = new C0467n0(l12, interfaceC1220a, activity, interfaceC1231l, 29);
                        c1836h02.m4545k0(c0467n0);
                        objM4514P14 = c0467n0;
                    }
                    c5491y2.m9899k("确定", (InterfaceC1220a) objM4514P14, c3216f1.m6897a(c5850l, true), l12 != null, c1836h02, 24582, 0);
                    c1836h02.m4553p(true);
                    c1836h02.m4553p(true);
                }
                break;
        }
        return c3967n;
    }

    public /* synthetic */ C5043kf(SharedPreferences sharedPreferences, List list, long j3, String str) {
        this.f18398i = sharedPreferences;
        this.f18399j = list;
        this.f18397h = j3;
        this.f18400k = str;
    }
}
