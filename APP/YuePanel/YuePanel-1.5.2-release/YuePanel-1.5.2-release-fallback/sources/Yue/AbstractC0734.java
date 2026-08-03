package Yue;

import java.lang.reflect.Member;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0734<T extends java.lang.reflect.Member> {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Field>> f2047 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> f2048 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Constructor<?>>> f2049 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2050;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2051;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.Class<?> f2052;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String f2053;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.util.List<T> f2054;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f2055;

    static {
            r0 = 816(0x330, float:1.143E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            Yue.AbstractC0734.f2047 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            Yue.AbstractC0734.f2048 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            Yue.AbstractC0734.f2049 = r0
            return
    }

    public AbstractC0734() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2054 = r0
            r0 = 0
            r1.f2055 = r0
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public abstract java.lang.String mo4558();

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public abstract Yue.AbstractC0734<T> mo4559();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m4560() {
            r4 = this;
            r0 = 1
            r4.f2055 = r0
            java.util.List<T extends java.lang.reflect.Member> r0 = r4.f2054
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Member r1 = (java.lang.reflect.Member) r1
            r2 = 0
            java.lang.String r2 = yue_xin_awa(r2)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            de.robv.android.xposed.XposedHelpers.callMethod(r1, r2, r3)
            goto L9
        L24:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public native java.util.List<java.lang.reflect.Constructor<?>> m4561();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public native java.util.List<java.lang.reflect.Field> m4562();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public native java.util.List<java.lang.reflect.Method> m4563();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public native T m4564();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public native java.lang.Class<?> m4565();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public native java.util.List<T> m4566();

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public native T m4567();

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public native Yue.AbstractC0734<T> m4568(java.lang.Class<?> r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public native void m4569(java.util.List<java.lang.reflect.Constructor<?>> r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public native void m4570(java.util.List<java.lang.reflect.Field> r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public native void m4571(java.util.List<java.lang.reflect.Method> r1);
}
