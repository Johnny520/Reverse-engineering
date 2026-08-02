package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.widget.ImageView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb3 implements in0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ac3.a(org.luckypray.dexkit.DexKitBridge):void, bc3.a(org.luckypray.dexkit.DexKitBridge):void, cc3.a(org.luckypray.dexkit.DexKitBridge):void, dd3.h():bd3, dd3.i():bd3, dd3.m(yc3, java.lang.String, java.lang.String[], in0):bd3, dd3.n():java.lang.Object, e2.j(java.lang.Object):java.lang.Object, ec3.a(org.luckypray.dexkit.DexKitBridge):void, mg3.a(org.luckypray.dexkit.DexKitBridge):void, nd3.g():void, sb.r(java.lang.Object):java.lang.Object, se.i(jc3, px, int):void, yb3.j(java.lang.Object):java.lang.Object, zb3.a(org.luckypray.dexkit.DexKitBridge):void] */
    public /* synthetic */ yb3(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03c3  */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Throwable] */
    @Override // defpackage.in0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        String str;
        long j;
        long j2;
        l5 l5Var;
        Class cls;
        Class<?> componentType;
        Class cls2;
        Class cls3;
        int i = 2;
        switch (this.h) {
            case 0:
                at atVar = (at) obj;
                atVar.getClass();
                atVar.c0("MicroMsg.VoiceLogic", "startRecord insert voicestg success");
                return a83.a;
            case 1:
                cj0 cj0Var = (cj0) obj;
                cj0Var.getClass();
                cj0Var.c0(new yb3(i));
                return a83.a;
            case 2:
                yg1 yg1Var = (yg1) obj;
                yg1Var.getClass();
                yg1Var.h0("getAmrFullPath cost: ");
                return a83.a;
            case 3:
                dj0 dj0Var = (dj0) obj;
                dj0Var.getClass();
                dj0Var.c0(new yb3(i));
                return a83.a;
            case 4:
                yg1 yg1Var2 = (yg1) obj;
                yg1Var2.getClass();
                yg1Var2.d0(0);
                yg1Var2.h0("MicroMsg.SceneVoiceService", "run() %s");
                return a83.a;
            case 5:
                dj0 dj0Var2 = (dj0) obj;
                dj0Var2.getClass();
                dj0Var2.c0(new yb3(4));
                return a83.a;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                yg1 yg1Var3 = (yg1) obj;
                yg1Var3.getClass();
                yg1Var3.h0("MicroMsg.SceneVoiceService", "Start Recv[%s] :%s", "Start Send :");
                return a83.a;
            case 7:
                dj0 dj0Var3 = (dj0) obj;
                dj0Var3.getClass();
                dj0Var3.c0(new yb3(6));
                return a83.a;
            case 8:
                cj0 cj0Var2 = (cj0) obj;
                cj0Var2.getClass();
                at atVar2 = new at();
                atVar2.d0("MicroMsg.VoiceStorage", "update failed, no values");
                a83 a83Var = a83.a;
                cj0Var2.u = atVar2;
                return a83Var;
            case 9:
                Context context = (Context) obj;
                context.getClass();
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return imageView;
            case 10:
                hd3 hd3Var = (hd3) obj;
                a83 a83Var2 = a83.a;
                hd3Var.getClass();
                vu2 vu2Var = vc3.f;
                vu2Var.getClass();
                yi1 yi1Var = hd3Var.a;
                by0 by0VarL0 = te.l0(yi1Var);
                if (by0VarL0 == null) {
                    l5Var = null;
                } else {
                    String str2 = by0VarL0.a;
                    id2 id2Var = (id2) ((xm0) vu2Var.a).a();
                    id2Var.getClass();
                    String str3 = id2Var.a;
                    if (!pv2.s0(str3)) {
                        boolean zW = wv2.W(str2, "@chatroom", false);
                        if (zW) {
                            str2 = by0VarL0.c;
                        }
                        if (str2 != null && !pv2.s0(str2)) {
                            long jLongValue = ((Number) ((xm0) vu2Var.b).a()).longValue();
                            yf2 yf2Var = new yf2("wechat", id2Var.a, by0VarL0.a, zW ? "group" : "private", null);
                            long j3 = yi1Var.j;
                            Long lValueOf = Long.valueOf(j3);
                            if (j3 == 0) {
                                lValueOf = null;
                            }
                            if (lValueOf == null || (strValueOf = String.valueOf(lValueOf.longValue())) == null) {
                                long j4 = yi1Var.f;
                                Long lValueOf2 = Long.valueOf(j4);
                                if (j4 == 0) {
                                    lValueOf2 = null;
                                }
                                if (lValueOf2 != null) {
                                    String strValueOf = String.valueOf(lValueOf2.longValue());
                                    str = strValueOf;
                                    j = yi1Var.i;
                                    if (j <= 0) {
                                        j2 = jLongValue;
                                    } else {
                                        if (j < 10000000000L) {
                                            j *= 1000;
                                        }
                                        j2 = j;
                                    }
                                    String str4 = by0VarL0.b;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    i41 i41VarC = l31.c(by0VarL0.b);
                                    i41VarC.getClass();
                                    l5Var = new l5(new ci2((String) ((xm0) vu2Var.c).a(), jLongValue, id2Var, yf2Var, new cl2(str2, str2.equals(str3)), new ti2(str, j2, str4, eu.O(new ei2(new d41(linkedHashMap)))), hd3Var.b), by0VarL0.d);
                                } else {
                                    str = null;
                                    j = yi1Var.i;
                                    if (j <= 0) {
                                    }
                                    String str42 = by0VarL0.b;
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    i41 i41VarC2 = l31.c(by0VarL0.b);
                                    i41VarC2.getClass();
                                    l5Var = new l5(new ci2((String) ((xm0) vu2Var.c).a(), jLongValue, id2Var, yf2Var, new cl2(str2, str2.equals(str3)), new ti2(str, j2, str42, eu.O(new ei2(new d41(linkedHashMap2)))), hd3Var.b), by0VarL0.d);
                                }
                            } else {
                                str = strValueOf;
                                j = yi1Var.i;
                                if (j <= 0) {
                                }
                                String str422 = by0VarL0.b;
                                LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                                i41 i41VarC22 = l31.c(by0VarL0.b);
                                i41VarC22.getClass();
                                l5Var = new l5(new ci2((String) ((xm0) vu2Var.c).a(), jLongValue, id2Var, yf2Var, new cl2(str2, str2.equals(str3)), new ti2(str, j2, str422, eu.O(new ei2(new d41(linkedHashMap22)))), hd3Var.b), by0VarL0.d);
                            }
                        }
                    }
                }
                if (l5Var != null && vc3.g.a(l5Var.b)) {
                    sq1 sq1Var = sq1.a;
                    ci2 ci2Var = l5Var.a;
                    if (sq1.f) {
                        pp1 pp1Var = pp1.a;
                        if (!pp1.f()) {
                            jn jnVar = sq1.o;
                            if (jnVar == null) {
                                t11.S("messageQueue");
                                throw null;
                            }
                            Object objS = jnVar.s(ci2Var);
                            if (objS instanceof oq) {
                                b5 b5Var = sq1.h;
                                if (b5Var == null) {
                                    t11.S("scriptLogger");
                                    throw null;
                                }
                                ph2 ph2Var = ph2.j;
                                String strJ = vi0.j("Unable to queue host message event ", ci2Var.a, ".");
                                nq nqVar = objS instanceof nq ? (nq) objS : null;
                                b5.x(b5Var, ph2Var, strJ, null, nqVar != null ? nqVar.a : null, 24);
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
                    Class<String> clsA = p40.A(d72.a(cls));
                    if (clsA == null) {
                        clsA = cls;
                    }
                    if (t11.l(obj2, clsA) && ((Class) list.get(1)).isArray() && (componentType = ((Class) list.get(1)).getComponentType()) != null) {
                        cls2 = Object.class;
                        Class<Object> clsA2 = p40.A(d72.a(cls2));
                        if (!componentType.equals(clsA2 != null ? clsA2 : Object.class)) {
                            Class<String> clsA3 = p40.A(d72.a(cls));
                            if (!componentType.equals(clsA3 != null ? clsA3 : String.class)) {
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
                Class<Cursor> clsA4 = p40.A(d72.a(cls3));
                cls3 = clsA4 != null ? clsA4 : Cursor.class;
                ConcurrentHashMap concurrentHashMap = dt.a;
                return Boolean.valueOf(cls3.isAssignableFrom(cls4));
            case 13:
                Cursor cursor = (Cursor) obj;
                cursor.getClass();
                return new cr0(p40.V(cursor, "username"), p40.V(cursor, "nickname"), p40.V(cursor, "pyInitial"), p40.V(cursor, "quanPin"), p40.V(cursor, "avatarUrl"));
            case 14:
                Class cls5 = (Class) obj;
                cls5.getClass();
                return Boolean.valueOf(cls5.getName().equals("com.tencent.wcdb.database.SQLiteDatabase"));
            case 15:
                Cursor cursor2 = (Cursor) obj;
                cursor2.getClass();
                return new mz(p40.V(cursor2, "username"), p40.V(cursor2, "nickname"), p40.V(cursor2, "alias"), p40.V(cursor2, "conRemark"), p40.V(cursor2, "pyInitial"), p40.V(cursor2, "quanPin"), p40.V(cursor2, "avatarUrl"), p40.V(cursor2, "encryptUsername"), p40.G(cursor2, "type"));
            case 16:
                Cursor cursor3 = (Cursor) obj;
                cursor3.getClass();
                return new qs1(p40.V(cursor3, "username"), p40.V(cursor3, "alias"), p40.V(cursor3, "nickname"), p40.V(cursor3, "avatarUrl"));
            case 17:
                List list2 = (List) obj;
                list2.getClass();
                return Boolean.valueOf(list2.size() == 2 && t11.l(list2.get(0), ContentValues.class) && t11.l(list2.get(1), Boolean.TYPE));
            case 18:
                jg3 jg3Var = (jg3) obj;
                a83 a83Var3 = a83.a;
                jg3Var.getClass();
                Object obj3 = jg3Var.a()[0];
                if (obj3 != null) {
                    id3 id3Var = id3.e;
                    hi0 hi0VarR = op0.y(obj3).r();
                    hi0VarR.b();
                    hi0VarR.b = "field_isSend";
                    Object objG0 = ((pi0) du.o0(hi0VarR.c())).g0();
                    objG0.getClass();
                    int iIntValue = ((Integer) objG0).intValue();
                    hi0 hi0VarR2 = op0.y(obj3).r();
                    hi0VarR2.b();
                    hi0VarR2.b = "field_status";
                    Object objG02 = ((pi0) du.o0(hi0VarR2.c())).g0();
                    objG02.getClass();
                    int iIntValue2 = ((Integer) objG02).intValue();
                    hi0 hi0VarR3 = op0.y(obj3).r();
                    hi0VarR3.b();
                    hi0VarR3.b = "field_talker";
                    Object objG03 = ((pi0) du.o0(hi0VarR3.c())).g0();
                    objG03.getClass();
                    String str5 = (String) objG03;
                    hi0 hi0VarR4 = op0.y(obj3).r();
                    hi0VarR4.b();
                    hi0VarR4.b = "field_lvbuffer";
                    byte[] bArr = (byte[]) ((pi0) du.o0(hi0VarR4.c())).g0();
                    hi0 hi0VarR5 = op0.y(obj3).r();
                    hi0VarR5.b();
                    hi0VarR5.b = "field_type";
                    Object objG04 = ((pi0) du.o0(hi0VarR5.c())).g0();
                    objG04.getClass();
                    int iIntValue3 = ((Integer) objG04).intValue();
                    hi0 hi0VarR6 = op0.y(obj3).r();
                    hi0VarR6.b();
                    hi0VarR6.b = "field_msgId";
                    Object objG05 = ((pi0) du.o0(hi0VarR6.c())).g0();
                    objG05.getClass();
                    long jLongValue2 = ((Long) objG05).longValue();
                    hi0 hi0VarR7 = op0.y(obj3).r();
                    hi0VarR7.b();
                    hi0VarR7.b = "field_bizChatId";
                    Object objG06 = ((pi0) du.o0(hi0VarR7.c())).g0();
                    objG06.getClass();
                    long jLongValue3 = ((Long) objG06).longValue();
                    hi0 hi0VarR8 = op0.y(obj3).r();
                    hi0VarR8.b();
                    hi0VarR8.b = "field_content";
                    Object objG07 = ((pi0) du.o0(hi0VarR8.c())).g0();
                    objG07.getClass();
                    String str6 = (String) objG07;
                    hi0 hi0VarR9 = op0.y(obj3).r();
                    hi0VarR9.b();
                    hi0VarR9.b = "field_createTime";
                    Object objG08 = ((pi0) du.o0(hi0VarR9.c())).g0();
                    objG08.getClass();
                    long jLongValue4 = ((Long) objG08).longValue();
                    hi0 hi0VarR10 = op0.y(obj3).r();
                    hi0VarR10.b();
                    hi0VarR10.b = "field_msgSvrId";
                    Long l = (Long) ((pi0) du.o0(hi0VarR10.c())).g0();
                    hi0 hi0VarR11 = op0.y(obj3).r();
                    hi0VarR11.b();
                    hi0VarR11.b = "field_flag";
                    Integer num = (Integer) ((pi0) du.o0(hi0VarR11.c())).g0();
                    hi0 hi0VarR12 = op0.y(obj3).r();
                    hi0VarR12.b();
                    hi0VarR12.b = "field_msgSeq";
                    Long l2 = (Long) ((pi0) du.o0(hi0VarR12.c())).g0();
                    id3Var.j(new hd3(new yi1(iIntValue, iIntValue2, str5, bArr, iIntValue3, jLongValue2, jLongValue3, str6, jLongValue4, l != null ? l.longValue() : 0L, num != null ? num.intValue() : 0, l2 != null ? l2.longValue() : 0L, 4096), obj3));
                }
                return a83Var3;
            case 19:
                jg3 jg3Var2 = (jg3) obj;
                a83 a83Var4 = a83.a;
                jg3Var2.getClass();
                Object result = jg3Var2.a.getResult();
                if ((result instanceof Map) && (!(result instanceof q41) || (result instanceof s41))) {
                    obj = (Map) result;
                }
                if (obj != null) {
                    nd3.e.j(new md3(mg.t0(jg3Var2.a()), xe1.e(obj)));
                }
                return a83Var4;
            case AIChatConfig.MaxContextRounds /* 20 */:
                nf3 nf3Var = (nf3) obj;
                nf3Var.getClass();
                return nf3Var;
            default:
                dj0 dj0Var4 = (dj0) obj;
                dj0Var4.getClass();
                dj0Var4.t = mg.t0(new String[]{"com.tencent.mm.sdk.platformtools"});
                yg1 yg1Var4 = new yg1();
                yg1Var4.j0("MicroMsg.SDK.XmlParser", "[ %s ]");
                a83 a83Var5 = a83.a;
                dj0Var4.u = yg1Var4;
                return a83Var5;
        }
    }
}
