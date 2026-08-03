package p050c0;

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
    public final /* synthetic */ C0668k f2057c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f2058d;

    public /* synthetic */ C0662i(C0668k r1, String r2, int r3) {
        this.f2056b = r3;
        this.f2057c = r1;
        this.f2058d = r2;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public final void mo1386b(C0760b r12) {
        String r02 = this.f2058d;
        C0668k r1 = this.f2057c;
        String r2 = null;
        byte[] r22 = null;
        String r23 = null;
        switch(this.f2056b) {
            case 0: goto L108;
            case 1: goto L84;
            default: goto L5;
        };
    L5:
        if (C0683p.m1753a().f2150f == false) goto L123;
        Object[] r7 = r12.f2670c;
        AbstractC0307g.m702d(r7, "args");
        Object r72 = AbstractC0179j.m537n0(0, r7);
        if (r72 == null) goto L120;
        String r73 = r72.toString();
        if (r73 == null) goto L124;
        C0422g r8 = AbstractC0671l.f2092a;
        if (AbstractC0433r.m1029D0(r73, "SnsInfo", true) == false) goto L125;
        Object[] r4 = r12.f2670c;
        AbstractC0307g.m702d(r4, "args");
        Object r42 = AbstractC0179j.m537n0(1, r4);
        if ((r42 instanceof ContentValues) == false) goto L18;
        ContentValues r43 = (ContentValues) r42;
    L19:
        if (r43 == null) goto L126;
        Integer r74 = r43.getAsInteger("sourceType");
        if (r74 != null) goto L24;
        return;
    L24:
        if (r74.intValue() != 0) goto L122;
        r43.put("sourceType", 2);
        Object r122 = r12.f2669b;
        if (r122 == null) goto L28;
        ClassLoader r123 = r122.getClass().getClassLoader();
    L29:
        r1.getClass();
        Object r9 = r43.get("content");
        if ((r9 instanceof byte[]) == false) goto L32;
        byte[] r92 = (byte[]) r9;
    L33:
        if (r92 != null) goto L36;
    L81:
        C0668k.m1675k("BLOCKED sns delete-update via " + r02);
        return;
    L36:
        if (r92.length == 0) goto L81;
        if (r123 == null) goto L81;
        Class r124 = AbstractC0358S.m906r(r123, "com.tencent.mm.protocal.protobuf.TimeLineObject");     // Catch: Throwable -> L50
        Object r10 = r124.newInstance();     // Catch: Throwable -> L50
        Method r125 = C0668k.m1669b(r124);     // Catch: Throwable -> L50
        if (r125 == null) goto L75;
        r125.setAccessible(true);     // Catch: Throwable -> L50
        Object r126 = r125.invoke(r10, new Object[]{r92});     // Catch: Throwable -> L50
        if (r126 == null) goto L47;
        r10 = r126;
    L47:
        Object r127 = AbstractC0358S.m920y(r10, "ContentDesc");     // Catch: Throwable -> L50
        if ((r127 instanceof String) == false) goto L52;
        String r128 = (String) r127;     // Catch: Throwable -> L50
    L53:
        if (r128 == null) goto L75;
        if (AbstractC0433r.m1033H0(r128, "[已删除]", false) == true) goto L75;
        if (AbstractC0433r.m1033H0(r128, "(已删除)", false) == true) goto L75;
        if (AbstractC0433r.m1033H0(r128, "[已删除]", false) == false) goto L63;
    L66:
        AbstractC0358S.m893j0(r10, r128, "ContentDesc");     // Catch: Throwable -> L50
        Method r129 = C0668k.m1670c(r10.getClass());     // Catch: Throwable -> L50
        if (r129 == null) goto L75;
        r129.setAccessible(true);     // Catch: Throwable -> L50
        Object r1210 = r129.invoke(r10, null);     // Catch: Throwable -> L50
        if ((r1210 instanceof byte[]) == false) goto L72;
        r22 = (byte[]) r1210;     // Catch: Throwable -> L50
    L72:
        if (r22 == null) goto L75;
        r43.put("content", r22);     // Catch: Throwable -> L50
        C0668k.m1675k("marked ContentDesc deleted prefix");     // Catch: Throwable -> L50
        goto L75
    L63:
        if (AbstractC0433r.m1033H0(r128, "(已删除)", false) == false) goto L65;
        r128 = "[已删除]".concat(AbstractC0425j.m1016U0(r128, "(已删除)"));     // Catch: Throwable -> L50
        goto L66
    L65:
        r128 = "[已删除]".concat(r128);     // Catch: Throwable -> L50
        goto L66
    L52:
        r128 = null;
    L75:
        Object r1211 = C0146l.f339a;     // Catch: Throwable -> L50
    L78:
        Throwable r1212 = AbstractC0141g.m465a(r1211);
        if (r1212 == null) goto L81;
        C0668k r13 = C0668k.f2076a;
        C0668k.m1675k("ContentDesc mark skipped: " + r1212.getMessage());
    L50:
        th = move-exception;
        r1211 = AbstractC0040p.m116u(th);
        goto L78
    L32:
        r92 = null;
        goto L33
    L28:
        r123 = null;
        goto L29
    L122:
        return;
    L126:
        return;
    L18:
        r43 = null;
        goto L19
    L125:
        return;
    L124:
        return;
    L120:
        return;
    L123:
        return;
    L84:
        if (C0683p.m1753a().f2150f == false) goto L128;
        Object[] r75 = r12.f2670c;
        AbstractC0307g.m702d(r75, "args");
        Object r5 = AbstractC0179j.m537n0(0, r75);
        if (r5 == null) goto L89;
        String r52 = r5.toString();
    L90:
        Object[] r76 = r12.f2670c;
        AbstractC0307g.m702d(r76, "args");
        Object r6 = AbstractC0179j.m537n0(1, r76);
        if (r6 == null) goto L93;
        r23 = r6.toString();
    L93:
        C0422g r62 = AbstractC0671l.f2092a;
        if (AbstractC0433r.m1029D0(r52, "SnsInfo", true) == false) goto L129;
        if (r23 != null) goto L99;
        r23 = "";
    L99:
        if (AbstractC0671l.f2092a.f939a.matcher(r23).find() == false) goto L102;
    L105:
        r12.m1946c(Boolean.TRUE);
        r1.getClass();
        C0668k.m1675k("BLOCKED sns clear-visible-bit execSQL via " + r02);
        return;
    L102:
        if (AbstractC0425j.m1005J0(r23, "sourceType = sourceType & -3", true) == true) goto L105;
        if (AbstractC0425j.m1005J0(r23, "sourceType=sourceType&-3", true) == true) goto L105;
        return;
    L129:
        return;
    L89:
        r52 = null;
        goto L90
    L128:
        return;
    L108:
        if (C0683p.m1753a().f2150f == false) goto L130;
        Object[] r77 = r12.f2670c;
        AbstractC0307g.m702d(r77, "args");
        Object r63 = AbstractC0179j.m537n0(0, r77);
        if (r63 == null) goto L113;
        r2 = r63.toString();
    L113:
        C0422g r64 = AbstractC0671l.f2092a;
        if (AbstractC0433r.m1029D0(r2, "SnsInfo", true) == false) goto L131;
        r12.m1946c(0);
        r1.getClass();
        C0668k.m1675k("BLOCKED sns physical delete via " + r02);
        return;
    L131:
        return;
    }
}
