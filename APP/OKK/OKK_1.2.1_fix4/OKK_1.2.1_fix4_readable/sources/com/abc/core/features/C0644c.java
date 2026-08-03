package com.abc.core.features;

import android.content.ContentValues;
import com.abc.core.hooks.ModuleLog;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.reflect.Field;
import p001A0.AbstractC0040p;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0644c extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2003b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MomentsCommentProtectHook f2004c;

    public C0644c(int i2) {
        this.f2003b = i2;
        switch (i2) {
            case 1:
                this.f2004c = MomentsCommentProtectHook.f2040a;
                break;
            case 2:
                this.f2004c = MomentsCommentProtectHook.f2040a;
                break;
            case 3:
                this.f2004c = MomentsCommentProtectHook.f2040a;
                break;
            default:
                this.f2004c = MomentsCommentProtectHook.f2040a;
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b c0760b) throws IllegalAccessException {
        Object obj;
        Field fieldM1647g;
        switch (this.f2003b) {
            case 1:
                this.f2004c.getClass();
                if (MomentsCommentProtectHook.m1649j() && (obj = c0760b.f2669b) != null && (fieldM1647g = MomentsCommentProtectHook.m1647g(obj.getClass(), "field_commentflag")) != null) {
                    fieldM1647g.setAccessible(true);
                    Object obj2 = fieldM1647g.get(obj);
                    Number number = obj2 instanceof Number ? (Number) obj2 : null;
                    if (number != null) {
                        int iIntValue = number.intValue();
                        if ((iIntValue & 1) != 0) {
                            fieldM1647g.set(obj, Integer.valueOf((iIntValue & (-2)) | 256));
                            Field fieldM1647g2 = MomentsCommentProtectHook.m1647g(obj.getClass(), "field_curActionBuf");
                            if (fieldM1647g2 != null) {
                                fieldM1647g2.setAccessible(true);
                                Object obj3 = fieldM1647g2.get(obj);
                                fieldM1647g2.set(obj, AbstractC0358S.m854D(obj3 instanceof byte[] ? (byte[]) obj3 : null));
                            }
                            MomentsCommentProtectHook.m1657r("rescued convertFrom flag=" + iIntValue);
                        }
                    }
                }
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b c0760b) {
        String string;
        switch (this.f2003b) {
            case 0:
                this.f2004c.getClass();
                if (MomentsCommentProtectHook.m1649j()) {
                    Object[] objArr = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr, "args");
                    Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                    if (objM537n0 != null && (string = objM537n0.toString()) != null && AbstractC0433r.m1029D0(string, "SnsComment", true)) {
                        Object[] objArr2 = c0760b.f2670c;
                        AbstractC0307g.m702d(objArr2, "args");
                        Object objM537n02 = AbstractC0179j.m537n0(1, objArr2);
                        ContentValues contentValues = objM537n02 instanceof ContentValues ? (ContentValues) objM537n02 : null;
                        if (contentValues != null) {
                            Integer asInteger = contentValues.getAsInteger("commentflag");
                            if (asInteger == null) {
                                asInteger = contentValues.getAsInteger("commentFlag");
                            }
                            if (asInteger != null) {
                                if (asInteger.intValue() == 1 || asInteger.intValue() == 2 || (1 & asInteger.intValue()) != 0) {
                                    int iIntValue = asInteger.intValue();
                                    contentValues.put("commentflag", Integer.valueOf((iIntValue & (-2)) | 256));
                                    Object obj = contentValues.get("curActionBuf");
                                    byte[] bArr = obj instanceof byte[] ? (byte[]) obj : null;
                                    if (bArr != null) {
                                        contentValues.put("curActionBuf", AbstractC0358S.m854D(bArr));
                                    }
                                    MomentsCommentProtectHook.m1657r("rewrote SnsComment update flag=" + iIntValue);
                                    ModuleLog.INSTANCE.m1813i("朋友圈评论 update 改写为[已删除]");
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            case 2:
                this.f2004c.getClass();
                if (MomentsCommentProtectHook.m1649j()) {
                    c0760b.m1946c(Boolean.TRUE);
                    MomentsCommentProtectHook.m1657r("BLOCKED setCommentDeleted");
                    ModuleLog.INSTANCE.m1813i("拦截 SnsComment setCommentDeleted");
                    break;
                }
                break;
            case 3:
                this.f2004c.getClass();
                if (MomentsCommentProtectHook.m1649j()) {
                    c0760b.m1946c(null);
                    try {
                        Object obj2 = c0760b.f2669b;
                        AbstractC0307g.m702d(obj2, "thisObject");
                        MomentsCommentProtectHook.m1642b(obj2);
                    } catch (Throwable th) {
                        AbstractC0040p.m116u(th);
                    }
                    MomentsCommentProtectHook.m1657r("BLOCKED setCommentDelFlag");
                    ModuleLog.INSTANCE.m1813i("拦截朋友圈评论软删除标志");
                    break;
                }
                break;
        }
    }
}
