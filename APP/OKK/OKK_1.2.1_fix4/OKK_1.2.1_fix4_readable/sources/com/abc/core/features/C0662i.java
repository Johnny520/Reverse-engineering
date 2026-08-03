package com.abc.core.features;

import android.content.ContentValues;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.reflect.Method;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;
import p042W0.C0422g;

/* JADX INFO: renamed from: c0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0662i extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2056b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MomentsHook f2057c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f2058d;

    public /* synthetic */ C0662i(MomentsHook momentsHook, String str, int i2) {
        this.f2056b = i2;
        this.f2057c = momentsHook;
        this.f2058d = str;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public final void mo1386b(C0760b c0760b) {
        String string;
        Integer asInteger;
        Object objM116u;
        String str = this.f2058d;
        MomentsHook momentsHook = this.f2057c;
        switch (this.f2056b) {
            case 0:
                if (C0683p.m1753a().f2150f) {
                    Object[] objArr = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr, "args");
                    Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                    String string2 = objM537n0 != null ? objM537n0.toString() : null;
                    C0422g c0422g = AbstractC0671l.f2092a;
                    if (AbstractC0433r.m1029D0(string2, "SnsInfo", true)) {
                        c0760b.m1946c(0);
                        momentsHook.getClass();
                        MomentsHook.m1675k("BLOCKED sns physical delete via " + str);
                        break;
                    }
                }
                break;
            case 1:
                if (C0683p.m1753a().f2150f) {
                    Object[] objArr2 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr2, "args");
                    Object objM537n02 = AbstractC0179j.m537n0(0, objArr2);
                    String string3 = objM537n02 != null ? objM537n02.toString() : null;
                    Object[] objArr3 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr3, "args");
                    Object objM537n03 = AbstractC0179j.m537n0(1, objArr3);
                    String string4 = objM537n03 != null ? objM537n03.toString() : null;
                    C0422g c0422g2 = AbstractC0671l.f2092a;
                    if (AbstractC0433r.m1029D0(string3, "SnsInfo", true)) {
                        if (string4 == null) {
                            string4 = "";
                        }
                        if (AbstractC0671l.f2092a.f939a.matcher(string4).find() || AbstractC0425j.m1005J0(string4, "sourceType = sourceType & -3", true) || AbstractC0425j.m1005J0(string4, "sourceType=sourceType&-3", true)) {
                            c0760b.m1946c(Boolean.TRUE);
                            momentsHook.getClass();
                            MomentsHook.m1675k("BLOCKED sns clear-visible-bit execSQL via " + str);
                            break;
                        }
                    }
                }
                break;
            default:
                if (C0683p.m1753a().f2150f) {
                    Object[] objArr4 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr4, "args");
                    Object objM537n04 = AbstractC0179j.m537n0(0, objArr4);
                    if (objM537n04 != null && (string = objM537n04.toString()) != null) {
                        C0422g c0422g3 = AbstractC0671l.f2092a;
                        if (AbstractC0433r.m1029D0(string, "SnsInfo", true)) {
                            Object[] objArr5 = c0760b.f2670c;
                            AbstractC0307g.m702d(objArr5, "args");
                            Object objM537n05 = AbstractC0179j.m537n0(1, objArr5);
                            ContentValues contentValues = objM537n05 instanceof ContentValues ? (ContentValues) objM537n05 : null;
                            if (contentValues != null && (asInteger = contentValues.getAsInteger("sourceType")) != null && asInteger.intValue() == 0) {
                                contentValues.put("sourceType", (Integer) 2);
                                Object obj = c0760b.f2669b;
                                ClassLoader classLoader = obj != null ? obj.getClass().getClassLoader() : null;
                                momentsHook.getClass();
                                Object obj2 = contentValues.get("content");
                                byte[] bArr = obj2 instanceof byte[] ? (byte[]) obj2 : null;
                                if (bArr != null && bArr.length != 0 && classLoader != null) {
                                    try {
                                        Class clsM906r = AbstractC0358S.m906r(classLoader, "com.tencent.mm.protocal.protobuf.TimeLineObject");
                                        Object objNewInstance = clsM906r.newInstance();
                                        Method methodM1669b = MomentsHook.m1669b(clsM906r);
                                        if (methodM1669b != null) {
                                            methodM1669b.setAccessible(true);
                                            Object objInvoke = methodM1669b.invoke(objNewInstance, bArr);
                                            if (objInvoke != null) {
                                                objNewInstance = objInvoke;
                                            }
                                            Object objM920y = AbstractC0358S.m920y(objNewInstance, "ContentDesc");
                                            String strConcat = objM920y instanceof String ? (String) objM920y : null;
                                            if (strConcat != null && !AbstractC0433r.m1033H0(strConcat, "[已删除]", false) && !AbstractC0433r.m1033H0(strConcat, "(已删除)", false)) {
                                                if (!AbstractC0433r.m1033H0(strConcat, "[已删除]", false)) {
                                                    strConcat = AbstractC0433r.m1033H0(strConcat, "(已删除)", false) ? "[已删除]".concat(AbstractC0425j.m1016U0(strConcat, "(已删除)")) : "[已删除]".concat(strConcat);
                                                }
                                                AbstractC0358S.m893j0(objNewInstance, strConcat, "ContentDesc");
                                                Method methodM1670c = MomentsHook.m1670c(objNewInstance.getClass());
                                                if (methodM1670c != null) {
                                                    methodM1670c.setAccessible(true);
                                                    Object objInvoke2 = methodM1670c.invoke(objNewInstance, null);
                                                    byte[] bArr2 = objInvoke2 instanceof byte[] ? (byte[]) objInvoke2 : null;
                                                    if (bArr2 != null) {
                                                        contentValues.put("content", bArr2);
                                                        MomentsHook.m1675k("marked ContentDesc deleted prefix");
                                                    }
                                                }
                                            }
                                        }
                                        objM116u = C0146l.f339a;
                                    } catch (Throwable th) {
                                        objM116u = AbstractC0040p.m116u(th);
                                    }
                                    Throwable thM465a = AbstractC0141g.m465a(objM116u);
                                    if (thM465a != null) {
                                        MomentsHook momentsHook2 = MomentsHook.f2076a;
                                        MomentsHook.m1675k("ContentDesc mark skipped: " + thM465a.getMessage());
                                    }
                                }
                                MomentsHook.m1675k("BLOCKED sns delete-update via " + str);
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }
}
