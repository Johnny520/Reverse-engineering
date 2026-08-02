package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.widget.ImageView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb3 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13395h;

    public /* synthetic */ yb3(int i) {
        this.f13395h = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03c3  */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Throwable] */
    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5j(Object obj) {
        String str;
        long j;
        long j2;
        C0412l5 c0412l5;
        Class cls;
        Class<?> componentType;
        Class cls2;
        Class cls3;
        int i = 2;
        switch (this.f13395h) {
            case 0:
                C0030at c0030at = (C0030at) obj;
                c0030at.getClass();
                c0030at.m271c0("MicroMsg.VoiceLogic", "startRecord insert voicestg success");
                return a83.f116a;
            case 1:
                cj0 cj0Var = (cj0) obj;
                cj0Var.getClass();
                cj0Var.m845c0(new yb3(i));
                return a83.f116a;
            case 2:
                yg1 yg1Var = (yg1) obj;
                yg1Var.getClass();
                yg1Var.m6275h0("getAmrFullPath cost: ");
                return a83.f116a;
            case 3:
                dj0 dj0Var = (dj0) obj;
                dj0Var.getClass();
                dj0Var.m1030c0(new yb3(i));
                return a83.f116a;
            case 4:
                yg1 yg1Var2 = (yg1) obj;
                yg1Var2.getClass();
                yg1Var2.m6271d0(0);
                yg1Var2.m6275h0("MicroMsg.SceneVoiceService", "run() %s");
                return a83.f116a;
            case 5:
                dj0 dj0Var2 = (dj0) obj;
                dj0Var2.getClass();
                dj0Var2.m1030c0(new yb3(4));
                return a83.f116a;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                yg1 yg1Var3 = (yg1) obj;
                yg1Var3.getClass();
                yg1Var3.m6275h0("MicroMsg.SceneVoiceService", "Start Recv[%s] :%s", "Start Send :");
                return a83.f116a;
            case 7:
                dj0 dj0Var3 = (dj0) obj;
                dj0Var3.getClass();
                dj0Var3.m1030c0(new yb3(6));
                return a83.f116a;
            case 8:
                cj0 cj0Var2 = (cj0) obj;
                cj0Var2.getClass();
                C0030at c0030at2 = new C0030at();
                c0030at2.m272d0("MicroMsg.VoiceStorage", "update failed, no values");
                a83 a83Var = a83.f116a;
                cj0Var2.f1585u = c0030at2;
                return a83Var;
            case 9:
                Context context = (Context) obj;
                context.getClass();
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return imageView;
            case 10:
                hd3 hd3Var = (hd3) obj;
                a83 a83Var2 = a83.f116a;
                hd3Var.getClass();
                vu2 vu2Var = vc3.f11905f;
                vu2Var.getClass();
                yi1 yi1Var = hd3Var.f3962a;
                by0 by0VarM5221l0 = AbstractC0731te.m5221l0(yi1Var);
                if (by0VarM5221l0 == null) {
                    c0412l5 = null;
                } else {
                    String str2 = by0VarM5221l0.f1074a;
                    id2 id2Var = (id2) ((xm0) vu2Var.f12178a).mo6a();
                    id2Var.getClass();
                    String str3 = id2Var.f4573a;
                    if (!pv2.m4006s0(str3)) {
                        boolean zM6005W = wv2.m6005W(str2, "@chatroom", false);
                        if (zM6005W) {
                            str2 = by0VarM5221l0.f1076c;
                        }
                        if (str2 != null && !pv2.m4006s0(str2)) {
                            long jLongValue = ((Number) ((xm0) vu2Var.f12179b).mo6a()).longValue();
                            yf2 yf2Var = new yf2("wechat", id2Var.f4573a, by0VarM5221l0.f1074a, zM6005W ? "group" : "private", null);
                            long j3 = yi1Var.f13477j;
                            Long lValueOf = Long.valueOf(j3);
                            if (j3 == 0) {
                                lValueOf = null;
                            }
                            if (lValueOf == null || (strValueOf = String.valueOf(lValueOf.longValue())) == null) {
                                long j4 = yi1Var.f13473f;
                                Long lValueOf2 = Long.valueOf(j4);
                                if (j4 == 0) {
                                    lValueOf2 = null;
                                }
                                if (lValueOf2 != null) {
                                    String strValueOf = String.valueOf(lValueOf2.longValue());
                                    str = strValueOf;
                                    j = yi1Var.f13476i;
                                    if (j <= 0) {
                                        j2 = jLongValue;
                                    } else {
                                        if (j < 10000000000L) {
                                            j *= 1000;
                                        }
                                        j2 = j;
                                    }
                                    String str4 = by0VarM5221l0.f1075b;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    i41 i41VarM2795c = l31.m2795c(by0VarM5221l0.f1075b);
                                    i41VarM2795c.getClass();
                                    c0412l5 = new C0412l5(new ci2((String) ((xm0) vu2Var.f12180c).mo6a(), jLongValue, id2Var, yf2Var, new cl2(str2, str2.equals(str3)), new ti2(str, j2, str4, AbstractC0179eu.m1434O(new ei2(new d41(linkedHashMap)))), hd3Var.f3963b), by0VarM5221l0.f1077d);
                                } else {
                                    str = null;
                                    j = yi1Var.f13476i;
                                    if (j <= 0) {
                                    }
                                    String str42 = by0VarM5221l0.f1075b;
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    i41 i41VarM2795c2 = l31.m2795c(by0VarM5221l0.f1075b);
                                    i41VarM2795c2.getClass();
                                    c0412l5 = new C0412l5(new ci2((String) ((xm0) vu2Var.f12180c).mo6a(), jLongValue, id2Var, yf2Var, new cl2(str2, str2.equals(str3)), new ti2(str, j2, str42, AbstractC0179eu.m1434O(new ei2(new d41(linkedHashMap2)))), hd3Var.f3963b), by0VarM5221l0.f1077d);
                                }
                            } else {
                                str = strValueOf;
                                j = yi1Var.f13476i;
                                if (j <= 0) {
                                }
                                String str422 = by0VarM5221l0.f1075b;
                                LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                                i41 i41VarM2795c22 = l31.m2795c(by0VarM5221l0.f1075b);
                                i41VarM2795c22.getClass();
                                c0412l5 = new C0412l5(new ci2((String) ((xm0) vu2Var.f12180c).mo6a(), jLongValue, id2Var, yf2Var, new cl2(str2, str2.equals(str3)), new ti2(str, j2, str422, AbstractC0179eu.m1434O(new ei2(new d41(linkedHashMap22)))), hd3Var.f3963b), by0VarM5221l0.f1077d);
                            }
                        }
                    }
                }
                if (c0412l5 != null && vc3.f11906g.m6383a(c0412l5.f5936b)) {
                    sq1 sq1Var = sq1.f10305a;
                    ci2 ci2Var = c0412l5.f5935a;
                    if (sq1.f10310f) {
                        pp1 pp1Var = pp1.f8445a;
                        if (!pp1.m3934f()) {
                            C0356jn c0356jn = sq1.f10319o;
                            if (c0356jn == null) {
                                t11.m5067S("messageQueue");
                                throw null;
                            }
                            Object objMo2225s = c0356jn.mo2225s(ci2Var);
                            if (objMo2225s instanceof C0552oq) {
                                C0043b5 c0043b5 = sq1.f10312h;
                                if (c0043b5 == null) {
                                    t11.m5067S("scriptLogger");
                                    throw null;
                                }
                                ph2 ph2Var = ph2.f8353j;
                                String strM5691j = vi0.m5691j("Unable to queue host message event ", ci2Var.f1572a, ".");
                                C0509nq c0509nq = objMo2225s instanceof C0509nq ? (C0509nq) objMo2225s : null;
                                C0043b5.m409x(c0043b5, ph2Var, strM5691j, null, c0509nq != null ? c0509nq.f7280a : null, 24);
                            }
                        }
                    }
                }
                return a83Var2;
            case 11:
                List list = (List) obj;
                list.getClass();
                if (list.size() == 2) {
                    Object obj2 = list.get(0);
                    cls = String.class;
                    Class<String> clsM3691A = p40.m3691A(d72.m967a(cls));
                    if (clsM3691A == null) {
                        clsM3691A = cls;
                    }
                    if (t11.m5086l(obj2, clsM3691A) && ((Class) list.get(1)).isArray() && (componentType = ((Class) list.get(1)).getComponentType()) != null) {
                        cls2 = Object.class;
                        Class<Object> clsM3691A2 = p40.m3691A(d72.m967a(cls2));
                        if (!componentType.equals(clsM3691A2 != null ? clsM3691A2 : Object.class)) {
                            Class<String> clsM3691A3 = p40.m3691A(d72.m967a(cls));
                            if (!componentType.equals(clsM3691A3 != null ? clsM3691A3 : String.class)) {
                            }
                        }
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 12:
                Class<?> cls4 = (Class) obj;
                cls4.getClass();
                cls3 = Cursor.class;
                Class<Cursor> clsM3691A4 = p40.m3691A(d72.m967a(cls3));
                cls3 = clsM3691A4 != null ? clsM3691A4 : Cursor.class;
                ConcurrentHashMap concurrentHashMap = AbstractC0141dt.f2190a;
                return Boolean.valueOf(cls3.isAssignableFrom(cls4));
            case 13:
                Cursor cursor = (Cursor) obj;
                cursor.getClass();
                return new cr0(p40.m3711V(cursor, "username"), p40.m3711V(cursor, "nickname"), p40.m3711V(cursor, "pyInitial"), p40.m3711V(cursor, "quanPin"), p40.m3711V(cursor, "avatarUrl"));
            case 14:
                Class cls5 = (Class) obj;
                cls5.getClass();
                return Boolean.valueOf(cls5.getName().equals("com.tencent.wcdb.database.SQLiteDatabase"));
            case 15:
                Cursor cursor2 = (Cursor) obj;
                cursor2.getClass();
                return new C0479mz(p40.m3711V(cursor2, "username"), p40.m3711V(cursor2, "nickname"), p40.m3711V(cursor2, "alias"), p40.m3711V(cursor2, "conRemark"), p40.m3711V(cursor2, "pyInitial"), p40.m3711V(cursor2, "quanPin"), p40.m3711V(cursor2, "avatarUrl"), p40.m3711V(cursor2, "encryptUsername"), p40.m3697G(cursor2, "type"));
            case 16:
                Cursor cursor3 = (Cursor) obj;
                cursor3.getClass();
                return new qs1(p40.m3711V(cursor3, "username"), p40.m3711V(cursor3, "alias"), p40.m3711V(cursor3, "nickname"), p40.m3711V(cursor3, "avatarUrl"));
            case 17:
                List list2 = (List) obj;
                list2.getClass();
                return Boolean.valueOf(list2.size() == 2 && t11.m5086l(list2.get(0), ContentValues.class) && t11.m5086l(list2.get(1), Boolean.TYPE));
            case 18:
                jg3 jg3Var = (jg3) obj;
                a83 a83Var3 = a83.f116a;
                jg3Var.getClass();
                Object obj3 = jg3Var.m2496a()[0];
                if (obj3 != null) {
                    id3 id3Var = id3.f4575e;
                    hi0 hi0VarM3241r = op0.m3602y(obj3).m3241r();
                    hi0VarM3241r.m6411b();
                    hi0VarM3241r.f13871b = "field_isSend";
                    Object objM3867g0 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r.m2194c())).m3867g0();
                    objM3867g0.getClass();
                    int iIntValue = ((Integer) objM3867g0).intValue();
                    hi0 hi0VarM3241r2 = op0.m3602y(obj3).m3241r();
                    hi0VarM3241r2.m6411b();
                    hi0VarM3241r2.f13871b = "field_status";
                    Object objM3867g02 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r2.m2194c())).m3867g0();
                    objM3867g02.getClass();
                    int iIntValue2 = ((Integer) objM3867g02).intValue();
                    hi0 hi0VarM3241r3 = op0.m3602y(obj3).m3241r();
                    hi0VarM3241r3.m6411b();
                    hi0VarM3241r3.f13871b = "field_talker";
                    Object objM3867g03 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r3.m2194c())).m3867g0();
                    objM3867g03.getClass();
                    String str5 = (String) objM3867g03;
                    hi0 hi0VarM3241r4 = op0.m3602y(obj3).m3241r();
                    hi0VarM3241r4.m6411b();
                    hi0VarM3241r4.f13871b = "field_lvbuffer";
                    byte[] bArr = (byte[]) ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r4.m2194c())).m3867g0();
                    hi0 hi0VarM3241r5 = op0.m3602y(obj3).m3241r();
                    hi0VarM3241r5.m6411b();
                    hi0VarM3241r5.f13871b = "field_type";
                    Object objM3867g04 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r5.m2194c())).m3867g0();
                    objM3867g04.getClass();
                    int iIntValue3 = ((Integer) objM3867g04).intValue();
                    hi0 hi0VarM3241r6 = op0.m3602y(obj3).m3241r();
                    hi0VarM3241r6.m6411b();
                    hi0VarM3241r6.f13871b = "field_msgId";
                    Object objM3867g05 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r6.m2194c())).m3867g0();
                    objM3867g05.getClass();
                    long jLongValue2 = ((Long) objM3867g05).longValue();
                    hi0 hi0VarM3241r7 = op0.m3602y(obj3).m3241r();
                    hi0VarM3241r7.m6411b();
                    hi0VarM3241r7.f13871b = "field_bizChatId";
                    Object objM3867g06 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r7.m2194c())).m3867g0();
                    objM3867g06.getClass();
                    long jLongValue3 = ((Long) objM3867g06).longValue();
                    hi0 hi0VarM3241r8 = op0.m3602y(obj3).m3241r();
                    hi0VarM3241r8.m6411b();
                    hi0VarM3241r8.f13871b = "field_content";
                    Object objM3867g07 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r8.m2194c())).m3867g0();
                    objM3867g07.getClass();
                    String str6 = (String) objM3867g07;
                    hi0 hi0VarM3241r9 = op0.m3602y(obj3).m3241r();
                    hi0VarM3241r9.m6411b();
                    hi0VarM3241r9.f13871b = "field_createTime";
                    Object objM3867g08 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r9.m2194c())).m3867g0();
                    objM3867g08.getClass();
                    long jLongValue4 = ((Long) objM3867g08).longValue();
                    hi0 hi0VarM3241r10 = op0.m3602y(obj3).m3241r();
                    hi0VarM3241r10.m6411b();
                    hi0VarM3241r10.f13871b = "field_msgSvrId";
                    Long l = (Long) ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r10.m2194c())).m3867g0();
                    hi0 hi0VarM3241r11 = op0.m3602y(obj3).m3241r();
                    hi0VarM3241r11.m6411b();
                    hi0VarM3241r11.f13871b = "field_flag";
                    Integer num = (Integer) ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r11.m2194c())).m3867g0();
                    hi0 hi0VarM3241r12 = op0.m3602y(obj3).m3241r();
                    hi0VarM3241r12.m6411b();
                    hi0VarM3241r12.f13871b = "field_msgSeq";
                    Long l2 = (Long) ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r12.m2194c())).m3867g0();
                    id3Var.m5153j(new hd3(new yi1(iIntValue, iIntValue2, str5, bArr, iIntValue3, jLongValue2, jLongValue3, str6, jLongValue4, l != null ? l.longValue() : 0L, num != null ? num.intValue() : 0, l2 != null ? l2.longValue() : 0L, 4096), obj3));
                }
                return a83Var3;
            case 19:
                jg3 jg3Var2 = (jg3) obj;
                a83 a83Var4 = a83.f116a;
                jg3Var2.getClass();
                Object result = jg3Var2.f5028a.getResult();
                if ((result instanceof Map) && (!(result instanceof q41) || (result instanceof s41))) {
                    obj = (Map) result;
                }
                if (obj != null) {
                    nd3.f7114e.m5153j(new md3(AbstractC0460mg.m3105t0(jg3Var2.m2496a()), xe1.m6117e(obj)));
                }
                return a83Var4;
            case AIChatConfig.MaxContextRounds /* 20 */:
                nf3 nf3Var = (nf3) obj;
                nf3Var.getClass();
                return nf3Var;
            default:
                dj0 dj0Var4 = (dj0) obj;
                dj0Var4.getClass();
                dj0Var4.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.sdk.platformtools"});
                yg1 yg1Var4 = new yg1();
                yg1Var4.m6277j0("MicroMsg.SDK.XmlParser", "[ %s ]");
                a83 a83Var5 = a83.f116a;
                dj0Var4.f2078u = yg1Var4;
                return a83Var5;
        }
    }
}
