package p050c0;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.abc.core.hooks.ModuleLog;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p009E0.AbstractC0193x;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p033R0.InterfaceC0319a;
import p033R0.InterfaceC0320b;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0653f extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2030b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2031c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2032d;

    public /* synthetic */ C0653f(Object r1, Object r2, int r3) {
        this.f2030b = r3;
        this.f2031c = r1;
        this.f2032d = r2;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b r14) {
        int r2 = 0;
        View r3 = null;
        ImageView r32 = null;
        Activity r33 = null;
        Object r34 = null;
        switch(this.f2030b) {
            case 2: goto L86;
            case 3: goto L25;
            case 4: goto L15;
            case 5: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        C0709x1 r1 = C0703v1.m1792a();
        if (r1.f2230a == false) goto L136;
        Object[] r142 = r14.f2670c;
        AbstractC0307g.m702d(r142, "args");
        Object r143 = AbstractC0179j.m537n0(0, r142);
        if ((r143 instanceof ImageView) == false) goto L11;
        r32 = (ImageView) r143;
    L11:
        if (r32 == null) goto L137;
        C0706w1.m1797a((C0706w1) this.f2031c, r32.getDrawable(), r1.f2231b);
        r32.postInvalidate();
        return;
    L137:
        return;
    L136:
        return;
    L15:
        ((C0688q1) this.f2031c).getClass();
        if (C0688q1.m1771g() == false) goto L138;
        Object r144 = r14.f2669b;
        if ((r144 instanceof Activity) == false) goto L21;
        r33 = (Activity) r144;
    L21:
        if (r33 == null) goto L139;
        C0688q1.m1770f(r33, (ClassLoader) this.f2032d);
        return;
    L139:
        return;
    L138:
        return;
    L25:
        ((C0655f1) this.f2031c).getClass();
        if (C0655f1.m1637b() == false) goto L142;
        Object r145 = r14.f2669b;
        if ((r145 instanceof Activity) == false) goto L31;
        Activity r146 = (Activity) r145;
    L32:
        if (r146 == null) goto L143;
        ClassLoader r02 = (ClassLoader) this.f2032d;
        Object r7 = AbstractC0358S.m887g(r146, "getPreferenceScreen", new Object[0]);     // Catch: Throwable -> L37
    L40:
        if ((r7 instanceof C0140f) == false) goto L42;
        r7 = null;
    L42:
        if (r7 == null) goto L144;
        Object r8 = AbstractC0358S.m887g(r7, "i", new Object[]{"achat_profile_id"});     // Catch: Throwable -> L46
    L49:
        if ((r8 instanceof C0140f) == false) goto L51;
        r8 = null;
    L51:
        String r9 = C0655f1.m1638c(r146);     // Catch: Throwable -> L54
        if (AbstractC0425j.m1013R0(r9) == false) goto L56;
        r9 = "获取失败";
    L56:
        String r6 = "微信 ID: ".concat(r9);     // Catch: Throwable -> L54
        if (r8 == null) goto L128;
        AbstractC0307g.m701c(r6, "null cannot be cast to non-null type kotlin.CharSequence");     // Catch: Throwable -> L61
        AbstractC0358S.m887g(r8, "K", new Object[]{r6});     // Catch: Throwable -> L61
    L130:
        AbstractC0358S.m887g(r7, "notifyDataSetChanged", new Object[0]);     // Catch: Throwable -> L65
    L145:
        return;
    L65:
        th = move-exception;
        AbstractC0040p.m116u(th);     // Catch: Throwable -> L54
        return;
    L61:
        th = move-exception;
        AbstractC0040p.m116u(th);     // Catch: Throwable -> L54
        goto L130
    L128:
        Object r03 = AbstractC0358S.m906r(r02, "com.tencent.mm.ui.base.preference.Preference");     // Catch: Throwable -> L70
    L73:
        if ((r03 instanceof C0140f) == true) goto L76;
        r34 = r03;
    L76:
        Class r35 = (Class) r34;     // Catch: Throwable -> L54
        if (r35 == null) goto L140;
        Object r147 = r35.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{r146});     // Catch: Throwable -> L54
        AbstractC0358S.m887g(r147, "C", new Object[]{"achat_profile_id"});     // Catch: Throwable -> L54
        AbstractC0307g.m701c(r6, "null cannot be cast to non-null type kotlin.CharSequence");     // Catch: Throwable -> L54
        AbstractC0358S.m887g(r147, "K", new Object[]{r6});     // Catch: Throwable -> L54
        AbstractC0358S.m887g(r147, "H", new Object[]{"点击复制"});     // Catch: Throwable -> L54
        AbstractC0358S.m887g(r7, "d", new Object[]{r147, 1});     // Catch: Throwable -> L54
        AbstractC0358S.m887g(r7, "notifyDataSetChanged", new Object[0]);     // Catch: Throwable -> L54
        C0655f1.m1639d("injected profile id row: ".concat(r9));     // Catch: Throwable -> L54
        Object r148 = C0146l.f339a;     // Catch: Throwable -> L54
    L82:
        Throwable r149 = AbstractC0141g.m465a(r148);
        if (r149 == null) goto L141;
        C0655f1 r04 = C0655f1.f2038a;
        C0655f1.m1639d("inject fail: " + r149.getMessage());
        return;
    L141:
        return;
    L140:
        return;
    L70:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L54
    L46:
        th = move-exception;
        r8 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L54
        goto L49
    L144:
        return;
    L54:
        th = move-exception;
        r148 = AbstractC0040p.m116u(th);
    L37:
        th = move-exception;
        r7 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L54
        goto L40
    L143:
        return;
    L31:
        r146 = null;
        goto L32
    L142:
        return;
    L86:
        ((C0678n0) this.f2031c).getClass();
        if (C0678n0.m1725p() == false) goto L147;
        Object[] r4 = r14.f2670c;
        AbstractC0307g.m702d(r4, "args");
        int r5 = r4.length;
        int r62 = 0;
    L90:
        if (r62 >= r5) goto L95;
        Object r72 = r4[r62];
        if ((r72 instanceof Menu) == true) goto L97;
        r62 = r62 + 1;
    L97:
        if ((r72 instanceof Menu) == false) goto L99;
        Menu r73 = (Menu) r72;
    L100:
        if (r73 == null) goto L148;
        Object[] r1410 = r14.f2670c;
        AbstractC0307g.m702d(r1410, "args");
        int r05 = r1410.length;
    L103:
        if (r2 >= r05) goto L108;
        Object r42 = r1410[r2];
        if ((r42 instanceof View) == true) goto L110;
        r2 = r2 + 1;
    L110:
        if ((r42 instanceof View) == false) goto L112;
        r3 = (View) r42;
    L112:
        if (r3 == null) goto L149;
        TextView r1411 = C0678n0.m1712a((C0678n0) this.f2031c, r3);
        if (r1411 == null) goto L150;
        ((C0678n0) this.f2031c).getClass();
        C0666j0 r06 = C0678n0.m1730u(r3, r1411);
        if (r06 == null) goto L151;
        C0678n0.f2130o = r06;
        C0678n0.f2131p = new WeakReference(r1411);
        C0678n0.f2132q = r06.f2068b;
        C0678n0.f2133r = System.currentTimeMillis();
        C0678n0.m1713b((C0678n0) this.f2031c, r73);
        C0678n0 r1412 = (C0678n0) this.f2031c;
        long r12 = r06.f2067a;
        String r07 = r06.f2068b;
        r1412.getClass();
        C0678n0.m1711C("create menu bind msgId=" + r12 + " text=" + AbstractC0425j.m1021Z0(AbstractC0433r.m1032G0(r07, '\n', ' '), 32) + " method=" + ((String) this.f2032d));
        return;
    L151:
        return;
    L150:
        return;
    L149:
        return;
    L108:
        r42 = null;
        goto L110
    L148:
        return;
    L99:
        r73 = null;
        goto L100
    L95:
        r72 = null;
        goto L97
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b r13) {
        Object r02 = null;
        ContentValues r03 = null;
        byte[] r04 = null;
        r04 = null;
        r04 = null;
        r04 = null;
        r04 = null;
        r04 = null;
        int r1 = 0;
        Object r4 = this.f2032d;
        Object r5 = this.f2031c;
        switch(this.f2030b) {
            case 0: goto L31;
            case 1: goto L12;
            case 5: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        C0709x1 r05 = C0703v1.m1792a();
        if (r05.f2230a == false) goto L161;
        Object[] r132 = r13.f2670c;
        if (r132.length < 3) goto L160;
        float r06 = r05.f2231b;
        r132[2] = Float.valueOf(r06);
        C0706w1.m1798b((C0706w1) r5, (String) r4, r06);
        return;
    L160:
        return;
    L161:
        return;
    L12:
        C0686q r6 = C0683p.m1753a();
        if (r6.f2145a == false) goto L163;
        Object[] r7 = r13.f2670c;
        AbstractC0307g.m702d(r7, "args");
        int r2 = r7.length;
    L16:
        if (r1 >= r2) goto L21;
        Object r8 = r7[r1];
        if ((r8 instanceof ContentValues) == true) goto L23;
        r1 = r1 + 1;
    L23:
        if ((r8 instanceof ContentValues) == false) goto L25;
        r03 = (ContentValues) r8;
    L25:
        if (r03 == null) goto L164;
        AtomicBoolean r12 = C0677n.f2105a;
        if (C0677n.m1692a(AbstractC0425j.m1020Y0((String) r5) + "." + ((Method) r4).getName(), r03, r6) == false) goto L162;
        r13.m1946c(1);
        return;
    L162:
        return;
    L164:
        return;
    L21:
        r8 = null;
        goto L23
    L163:
        return;
    L31:
        ((C0656g) r5).getClass();
        if (C0656g.m1649j() == false) goto L168;
        Object[] r52 = r13.f2670c;
        AbstractC0307g.m702d(r52, "args");
        Object r22 = AbstractC0179j.m537n0(0, r52);
        if ((r22 instanceof byte[]) == false) goto L37;
        byte[] r23 = (byte[]) r22;
    L38:
        if (r23 == null) goto L169;
        Object r53 = AbstractC0358S.m920y(r13.f2669b, "field_attrBuf");     // Catch: Throwable -> L42
    L44:
        boolean r62 = r53 instanceof C0140f;
        Object r54 = r53;
        if (r62 == false) goto L48;
        r54 = null;
    L48:
        if ((r54 instanceof byte[]) == false) goto L50;
        byte[] r55 = (byte[]) r54;
    L51:
        if (r55 != null) goto L53;
        return;
    L53:
        if (r55.length != 0) goto L136;
        return;
    L136:
        Class r42 = AbstractC0358S.m906r((ClassLoader) r4, "com.tencent.mm.protocal.protobuf.SnsObject");     // Catch: Throwable -> L82
        Object r56 = C0656g.m1652m(r42, r55);     // Catch: Throwable -> L82
        if (r56 == null) goto L127;
        Object r43 = C0656g.m1652m(r42, r23);     // Catch: Throwable -> L82
        if (r43 == null) goto L127;
        List r57 = C0656g.m1653n(r56);     // Catch: Throwable -> L82
        if (r57 == null) goto L127;
        List r63 = C0656g.m1653n(r43);     // Catch: Throwable -> L82
        if (r63 == null) goto L127;
        if (r57.isEmpty() == true) goto L127;
        ArrayList r72 = new ArrayList();     // Catch: Throwable -> L82
        Iterator r82 = r63.iterator();     // Catch: Throwable -> L82
    L73:
        if (r82.hasNext() == false) goto L84;
        Object r9 = r82.next();     // Catch: Throwable -> L82
        if (r9 != null) goto L77;
        r9 = null;
    L77:
        if (r9 == null) goto L79;
        String r92 = C0656g.m1644d(r9);     // Catch: Throwable -> L82
    L80:
        if (r92 == null) goto L73;
        r72.add(r92);     // Catch: Throwable -> L82
        goto L73
    L79:
        r92 = null;
        goto L80
    L84:
        HashSet r83 = new HashSet(AbstractC0193x.m563g0(AbstractC0183n.m559k0(r72, 12)));     // Catch: Throwable -> L82
        AbstractC0181l.m551w0(r72, r83);     // Catch: Throwable -> L82
        Iterator r58 = r57.iterator();     // Catch: Throwable -> L82
        int r73 = 0;
    L86:
        if (r58.hasNext() == false) goto L105;
        Object r93 = r58.next();     // Catch: Throwable -> L82
        if (r93 != null) goto L90;
        r93 = null;
    L90:
        if (r93 == null) goto L86;
        String r10 = C0656g.m1644d(r93);     // Catch: Throwable -> L82
        if (r10 == null) goto L86;
        if (r83.contains(r10) == true) goto L86;
        C0656g.m1651l(r93);     // Catch: Throwable -> L82
        C0656g.m1643c(r93);     // Catch: Throwable -> L82
        if ((r63 instanceof InterfaceC0319a) == true) goto L100;
    L104:
        r63.add(r93);     // Catch: Throwable -> L82
        r83.add(r10);     // Catch: Throwable -> L82
        r73 = r73 + 1;     // Catch: Throwable -> L82
        goto L86
    L100:
        if ((r63 instanceof InterfaceC0320b) == true) goto L104;
        AbstractC0317q.m715d(r63, "kotlin.collections.MutableList");     // Catch: Throwable -> L82
        throw null;     // Catch: Throwable -> L82
    L105:
        if (r73 == 0) goto L127;
        int r3 = r63.size();     // Catch: Throwable -> L82
        AbstractC0358S.m893j0(r43, Integer.valueOf(r3), "CommentCount");     // Catch: Throwable -> L110
    L137:
        AbstractC0358S.m893j0(r43, Integer.valueOf(r3), "CommentUserListCount");     // Catch: Throwable -> L114
    L116:
        Object r32 = C0656g.m1654o(r43);     // Catch: Throwable -> L82
    L119:
        Throwable r44 = AbstractC0141g.m465a(r32);
        if (r44 == null) goto L123;
        C0656g r59 = C0656g.f2040a;
        C0656g.m1657r("mergeAttrBufComments: " + r44.getMessage());
    L123:
        if ((r32 instanceof C0140f) == true) goto L126;
        r02 = r32;
    L126:
        r04 = (byte[]) r02;
        goto L127
    L114:
        th = move-exception;
        AbstractC0040p.m116u(th);     // Catch: Throwable -> L82
    L110:
        th = move-exception;
        AbstractC0040p.m116u(th);     // Catch: Throwable -> L82
    L127:
        if (r04 == null) goto L171;
        if (r04 != r23) goto L131;
        return;
    L131:
        if (Arrays.equals(r04, r23) == true) goto L167;
        r13.f2670c[0] = r04;
        C0656g.m1657r("merged CommentUserList into setAttrBuf");
        ModuleLog.INSTANCE.m1813i("朋友圈评论防删: 合并回 CommentUserList + [已删除]");
        return;
    L167:
        return;
    L171:
        return;
    L82:
        th = move-exception;
        r32 = AbstractC0040p.m116u(th);
        goto L119
    L50:
        r55 = null;
    L42:
        th = move-exception;
        r53 = AbstractC0040p.m116u(th);
        goto L44
    L169:
        return;
    L37:
        r23 = null;
        goto L38
    }

    public C0653f(ClassLoader r1, int r2) {
        this.f2030b = r2;
        switch(r2) {
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        this.f2031c = C0656g.f2040a;
        this.f2032d = r1;
        return;
    L6:
        this.f2031c = C0688q1.f2163a;
        this.f2032d = r1;
    }

    public C0653f(String r2, Method r3) {
        this.f2030b = 1;
        AtomicBoolean r02 = C0677n.f2105a;
        this.f2031c = r2;
        this.f2032d = r3;
    }
}
