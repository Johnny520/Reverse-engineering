package com.abc.core.features;

import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0647d extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2010b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2011c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2012d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Serializable f2013e;

    public C0647d(Class r2) {
        this.f2010b = 3;
        AvatarHook r02 = AvatarHook.f2217a;
        this.f2012d = r2;
        this.f2011c = r02;
        this.f2013e = "u.a";
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public final void mo1386b(C0760b r12) {
        switch(this.f2010b) {
            case 0: goto L98;
            case 1: goto L76;
            case 2: goto L38;
            default: goto L4;
        };
    L4:
        C0709x1 r02 = RoundAvatarHook.m1792a();
        if (r02.f2230a == false) goto L146;
        Object[] r1 = r12.f2670c;
        AbstractC0307g.m702d(r1, "args");
        int r3 = 0;
        Object r13 = AbstractC0179j.m537n0(0, r1);
        if ((r13 instanceof ImageView) == false) goto L10;
        ImageView r14 = (ImageView) r13;
    L11:
        if (r14 == null) goto L147;
        Object[] r4 = r12.f2670c;
        AbstractC0307g.m702d(r4, "args");
        Object r42 = AbstractC0179j.m537n0(1, r4);
        if ((r42 instanceof String) == false) goto L16;
        String r43 = (String) r42;
    L17:
        if (r43 == null) goto L148;
        Method r6 = AvatarHook.f2221e;
        if (r6 != null) goto L140;
        Method[] r62 = ((Class) this.f2012d).getDeclaredMethods();
        AbstractC0307g.m702d(r62, "getDeclaredMethods(...)");
        AvatarHook r7 = (AvatarHook) this.f2011c;
        int r8 = r62.length;
    L22:
        if (r3 >= r8) goto L27;
        Method r9 = r62[r3];
        AbstractC0307g.m700b(r9);
        r7.getClass();
        if (AvatarHook.m1801f(r9) == true) goto L28;
        r3 = r3 + 1;
    L28:
        if (r9 == null) goto L30;
        r9.setAccessible(true);
        AvatarHook.f2221e = r9;
        r6 = r9;
    L31:
        if (r6 != null) goto L140;
        return;
    L30:
        r6 = null;
        goto L31
    L27:
        r9 = null;
    L140:
        r6.invoke(null, new Object[]{r14, r43, Float.valueOf(r02.f2231b), Boolean.FALSE});     // Catch: Throwable -> L35
        r12.m1946c(null);     // Catch: Throwable -> L35
        AvatarHook.m1798b((AvatarHook) this.f2011c, (String) this.f2013e, r02.f2231b);     // Catch: Throwable -> L35
        return;
    L35:
        th = move-exception;
        AvatarHook r03 = (AvatarHook) this.f2011c;
        String r122 = "a→b fail: " + th.getMessage();
        r03.getClass();
        AvatarHook.m1804i(r122);
        return;
    L148:
        return;
    L16:
        r43 = null;
        goto L17
    L147:
        return;
    L10:
        r14 = null;
        goto L11
    L146:
        return;
    L38:
        ((MessageEditHook) this.f2012d).getClass();
        if (MessageEditHook.m1725p() == false) goto L152;
        Object[] r04 = r12.f2670c;
        AbstractC0307g.m702d(r04, "args");
        int r15 = r04.length;
        int r2 = 0;
    L43:
        if (r2 >= r15) goto L48;
        Object r44 = r04[r2];
        if ((r44 instanceof MenuItem) == true) goto L50;
        r2 = r2 + 1;
    L50:
        if ((r44 instanceof MenuItem) == false) goto L52;
        MenuItem r45 = (MenuItem) r44;
    L53:
        if (r45 != null) goto L56;
        return;
    L56:
        if (r45.getItemId() != 1212368196) goto L154;
        WeakReference r05 = MessageEditHook.f2131p;
        if (r05 == null) goto L151;
        TextView r06 = (TextView) r05.get();
        if (r06 == null) goto L155;
        ((MessageEditHook) this.f2012d).getClass();
        if (MessageEditHook.m1723n(r06) == false) goto L156;
        C0666j0 r16 = MessageEditHook.f2130o;
        ((MessageEditHook) this.f2012d).getClass();
        if (MessageEditHook.m1724o(r16) == false) goto L157;
        MessageEditHook.f2131p = new WeakReference(r06);
        MessageEditHook r22 = (MessageEditHook) this.f2012d;
        if (r16 == null) goto L73;
        String r17 = r16.f2068b;
        if (r17 == null) goto L73;
    L74:
        MessageEditHook.f2132q = r17;
        MessageEditHook.f2133r = System.currentTimeMillis();
        ((MessageEditHook) this.f2012d).getClass();
        MessageEditHook.m1709A(r06);
        MessageEditHook r07 = (MessageEditHook) this.f2012d;
        String r18 = "edit menu selected class=" + ((Method) this.f2011c).getDeclaringClass().getName() + " method=" + ((String) this.f2013e);
        r07.getClass();
        MessageEditHook.m1711C(r18);
        r12.m1946c(null);
        return;
    L73:
        r22.getClass();
        r17 = MessageEditHook.m1734y(r06);
        goto L74
    L157:
        return;
    L156:
        return;
    L155:
        return;
    L151:
        return;
    L154:
        return;
    L52:
        r45 = null;
        goto L53
    L48:
        r44 = null;
        goto L50
    L152:
        return;
    L76:
        ((MessageEditHook) this.f2012d).getClass();
        if (MessageEditHook.m1725p() == false) goto L159;
        Object r08 = r12.f2669b;
        if ((r08 instanceof MenuItem) == false) goto L82;
        MenuItem r09 = (MenuItem) r08;
    L83:
        if (r09 != null) goto L86;
        return;
    L86:
        if (r09.getItemId() != 1212368196) goto L161;
        WeakReference r010 = MessageEditHook.f2131p;
        if (r010 == null) goto L158;
        TextView r011 = (TextView) r010.get();
        if (r011 == null) goto L162;
        ((MessageEditHook) this.f2012d).getClass();
        if (MessageEditHook.m1723n(r011) == false) goto L163;
        ((MessageEditHook) this.f2012d).getClass();
        MessageEditHook.m1709A(r011);
        r12.m1946c(Boolean.TRUE);
        MessageEditHook r123 = (MessageEditHook) this.f2012d;
        String r012 = "edit menu item dispatched via " + ((Class) this.f2013e).getName() + "." + ((Method) this.f2011c).getName();
        r123.getClass();
        MessageEditHook.m1711C(r012);
        return;
    L163:
        return;
    L162:
        return;
    L158:
        return;
    L161:
        return;
    L82:
        r09 = null;
        goto L83
    L159:
        return;
    L98:
        ((MomentsCommentProtectHook) this.f2012d).getClass();
        if (MomentsCommentProtectHook.m1649j() == false) goto L165;
        Object[] r013 = r12.f2670c;
        AbstractC0307g.m702d(r013, "args");
        Object r014 = AbstractC0179j.m537n0(0, r013);
        if (r014 == null) goto L104;
        String r015 = r014.toString();
    L105:
        Object[] r32 = r12.f2670c;
        AbstractC0307g.m702d(r32, "args");
        Object r33 = AbstractC0179j.m537n0(1, r32);
        if (r33 == null) goto L108;
        String r34 = r33.toString();
    L110:
        if (AbstractC0433r.m1029D0(r015, "SnsComment", true) == true) goto L117;
        if (r015 == null) goto L117;
        if (AbstractC0425j.m1005J0(r015, "SnsComment", true) == false) goto L117;
        r34 = r015;
        r015 = null;
    L117:
        if (AbstractC0433r.m1029D0(r015, "SnsComment", true) == true) goto L119;
    L121:
        if (r015 == null) goto L125;
        if (AbstractC0425j.m1013R0(r015) == true) goto L125;
    L127:
        if (r34 != null) goto L130;
        r34 = "";
    L130:
        if (AbstractC0425j.m1005J0(r34, "delete from SnsComment", true) == false) goto L164;
    L131:
        Method r016 = (Method) this.f2011c;
        Class<?> r19 = r016.getReturnType();
        Class r35 = Boolean.TYPE;
        if (AbstractC0307g.m699a(r19, r35) == false) goto L134;
    L137:
        r12.m1946c(Boolean.TRUE);
    L138:
        MomentsCommentProtectHook.m1657r("BLOCKED execSQL via " + ((String) this.f2013e));
        return;
    L134:
        if (AbstractC0307g.m699a(r016.getReturnType(), r35) == true) goto L137;
        r12.m1946c(null);
        goto L138
    L164:
        return;
    L125:
        if (AbstractC0358S.m855E(r34) == false) goto L127;
    L119:
        if (AbstractC0358S.m855E(r34) == false) goto L121;
    L108:
        r34 = null;
        goto L110
    L104:
        r015 = null;
        goto L105
    }

    public C0647d(Class r2, Method r3) {
        this.f2010b = 1;
        this.f2012d = MessageEditHook.f2116a;
        this.f2013e = r2;
        this.f2011c = r3;
    }

    public C0647d(Method r2) {
        this.f2010b = 0;
        this.f2012d = MomentsCommentProtectHook.f2040a;
        this.f2011c = r2;
        this.f2013e = "DexKit:execSQL";
    }

    public C0647d(MessageEditHook r2, Method r3, String r4) {
        this.f2010b = 2;
        this.f2012d = r2;
        this.f2011c = r3;
        this.f2013e = r4;
    }
}
