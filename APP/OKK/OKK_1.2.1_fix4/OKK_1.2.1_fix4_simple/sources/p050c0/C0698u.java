package p050c0;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import android.view.Window;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.C1031R;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: c0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0698u extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2199b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Method f2200c;

    public /* synthetic */ C0698u(Method r1, int r2, boolean r3) {
        this.f2199b = r2;
        this.f2200c = r1;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b r9) {
        Method r1 = this.f2200c;
        int r2 = 1;
        int r3 = 0;
        Number r4 = null;
        View r42 = null;
        View r43 = null;
        Activity r44 = null;
        Activity r45 = null;
        switch(this.f2199b) {
            case 0: goto L97;
            case 1: goto L76;
            case 2: goto L109;
            case 3: goto L29;
            case 4: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        Object[] r5 = r9.f2670c;
        AbstractC0307g.m702d(r5, "args");
        int r02 = r5.length;
    L6:
        if (r3 >= r02) goto L16;
        Object r6 = r5[r3];
        if ((r6 instanceof CharSequence) == false) goto L11;
        String r62 = r6.toString();
    L14:
        if (r62 != null) goto L17;
        r3 = r3 + 1;
    L17:
        if (r62 != null) goto L20;
        return;
    L20:
        if (AbstractC0358S.m859I(r62) == false) goto L116;
        Object r92 = r9.f2669b;
        if ((r92 instanceof View) == false) goto L25;
        r42 = (View) r92;
    L25:
        if (r42 == null) goto L117;
        C0639a0.m1570a(r42);
        C0639a0.m1574c(AbstractC0324d.m725h("X2CTextView.", r1.getName()), r42.getClass().getName());
        return;
    L117:
        return;
    L116:
        return;
    L11:
        if ((r6 instanceof String) == false) goto L13;
        r62 = (String) r6;
        goto L14
    L13:
        r62 = null;
        goto L14
    L16:
        r62 = null;
        goto L17
    L29:
        Object[] r52 = r9.f2670c;
        AbstractC0307g.m702d(r52, "args");
        int r03 = r52.length;
    L30:
        if (r3 >= r03) goto L40;
        Object r63 = r52[r3];
        if ((r63 instanceof CharSequence) == false) goto L35;
        CharSequence r64 = (CharSequence) r63;
    L38:
        if (r64 != null) goto L41;
        r3 = r3 + 1;
    L41:
        if (r64 != null) goto L44;
        return;
    L44:
        if (r64.length() <= 80) goto L47;
        return;
    L47:
        if (AbstractC0358S.m859I(r64.toString()) == false) goto L120;
        Object r93 = r9.f2669b;
        if ((r93 instanceof View) == false) goto L52;
        r43 = (View) r93;
    L52:
        if (r43 == null) goto L121;
        C0639a0.m1570a(r43);
        C0639a0.m1574c(AbstractC0324d.m725h("MMNeat.", r1.getName()), r43.getClass().getName());
        return;
    L121:
        return;
    L120:
        return;
    L35:
        if ((r63 instanceof String) == false) goto L37;
        r64 = (CharSequence) r63;
        goto L38
    L37:
        r64 = null;
        goto L38
    L40:
        r64 = null;
        goto L41
    L76:
        Object r94 = r9.f2669b;
        if ((r94 instanceof Activity) == false) goto L79;
        r44 = (Activity) r94;
    L79:
        if (r44 == null) goto L130;
        C0707x r95 = C0689r.m1785a();
        if (r95.f2222a == true) goto L84;
        return;
    L84:
        if (r95.f2226e == false) goto L131;
        Window r96 = r44.getWindow();
        if (r96 == null) goto L91;
        View r97 = r96.getDecorView();
        if (r97 == null) goto L91;
        r97.post(new RunnableC0701v(r44, r3));
    L91:
        Window r98 = r44.getWindow();
        if (r98 == null) goto L128;
        View r99 = r98.getDecorView();
        if (r99 == null) goto L129;
        r99.postDelayed(new RunnableC0701v(r44, r2), 400);
        return;
    L129:
        return;
    L128:
        return;
    L131:
        return;
    L130:
        return;
    L97:
        Object r910 = r9.f2669b;
        if ((r910 instanceof Activity) == false) goto L100;
        r45 = (Activity) r910;
    L100:
        if (r45 == null) goto L133;
        C0707x r911 = C0689r.m1785a();
        if (r911.f2222a == true) goto L105;
        return;
    L105:
        if (r911.f2226e == false) goto L134;
        AtomicBoolean r912 = C0704w.f2213a;
        C0704w.m1793a(r45, "initView." + r1.getName());
        return;
    L134:
        return;
    L133:
        return;
    L109:
        Object[] r53 = r9.f2670c;     // Catch: Throwable -> L62
        AbstractC0307g.m702d(r53, "args");     // Catch: Throwable -> L62
        Object r54 = AbstractC0179j.m537n0(0, r53);     // Catch: Throwable -> L62
        if (r54 == null) goto L122;
        Object[] r65 = r9.f2670c;     // Catch: Throwable -> L62
        AbstractC0307g.m702d(r65, "args");     // Catch: Throwable -> L62
        Object r04 = AbstractC0179j.m537n0(1, r65);     // Catch: Throwable -> L62
        if ((r04 instanceof Number) == false) goto L64;
        r4 = (Number) r04;     // Catch: Throwable -> L62
    L64:
        if (r4 == null) goto L123;
        int r05 = r4.intValue();     // Catch: Throwable -> L62
        ClassLoader r12 = r1.getDeclaringClass().getClassLoader();     // Catch: Throwable -> L62
        if (r12 != null) goto L70;
        r12 = r54.getClass().getClassLoader();     // Catch: Throwable -> L62
        if (r12 != null) goto L70;
        return;
    L70:
        C0639a0 r46 = C0639a0.f1967a;     // Catch: Throwable -> L62
        C0639a0.m1572b(r9.f2669b, r54, r05, r12);     // Catch: Throwable -> L62
        return;
    L123:
        return;
    L122:
        return;
    L62:
        th = move-exception;
        if (C0639a0.f1974h.compareAndSet(false, true) == false) goto L125;
        C0639a0 r06 = C0639a0.f1967a;
        C0639a0.m1601p0("bind after err: " + Log.getStackTraceString(th));
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b r10) {
        Method r2 = this.f2200c;
        Activity r3 = null;
        Number r32 = null;
        Number r33 = null;
        switch(this.f2199b) {
            case 1: goto L66;
            case 2: goto L82;
            case 3: goto L4;
            case 4: goto L4;
            case 5: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        C0709x1 r5 = C0703v1.m1792a();
        if (r5.f2230a == false) goto L86;
        Object[] r6 = r10.f2670c;
        AbstractC0307g.m702d(r6, "args");
        Object r1 = AbstractC0179j.m537n0(0, r6);
        if ((r1 instanceof Bitmap) == false) goto L11;
        Bitmap r12 = (Bitmap) r1;
    L12:
        if (r12 != null) goto L15;
        return;
    L15:
        if (r12.isRecycled() == true) goto L88;
        Object r4 = r10.f2670c[2];
        if ((r4 instanceof Number) == false) goto L20;
        r32 = (Number) r4;
    L20:
        if (r32 == null) goto L84;
        float r34 = r32.floatValue();
        float r13 = Math.min(r12.getWidth(), r12.getHeight());
        if (r13 <= 1.0f) goto L89;
        float r42 = r5.f2231b;
        float r52 = r42 * r13;
        float r62 = r34 / r13;
        if (0.03f > r62) goto L30;
        if (r62 > 0.6f) goto L30;
    L33:
        if (Math.abs(r52 - r34) <= 0.01f) goto L85;
        r10.f2670c[2] = Float.valueOf(r52);
        C0706w1.m1798b(C0706w1.f2217a, "BitmapUtil." + r2.getName() + " " + r34 + "→" + r52, r42);
        return;
    L85:
        return;
    L30:
        if (r34 <= (r13 * 0.6f)) goto L33;
        return;
    L89:
        return;
    L84:
        return;
    L88:
        return;
    L11:
        r12 = null;
        goto L12
    L86:
        return;
    L66:
        Object r102 = r10.f2669b;
        if ((r102 instanceof Activity) == false) goto L69;
        r3 = (Activity) r102;
    L69:
        if (r3 == null) goto L98;
        C0707x r103 = C0689r.m1785a();
        if (r103.f2222a == false) goto L99;
        boolean r14 = r103.f2224c;
        boolean r53 = r103.f2223b;
        ?? r54 = r53;
        if (r14 == false) goto L77;
        r54 = (r53 ? 1 : 0) | 2;
    L77:
        int r55 = r54;
        if (r103.f2225d == false) goto L80;
        r55 = (r54 == true ? 1 : 0) | 4;
    L80:
        r3.getIntent().putExtra("intent.key.function.control", r55);
        r3.getIntent().putExtra("intent.key.need.show.privacy.agreement", false);
        AtomicBoolean r104 = C0704w.f2213a;
        C0704w.m1796d("onCreate inject functionControl=" + r55 + " (" + r2.getName() + ")");
        return;
    L99:
        return;
    L98:
        return;
    L82:
        Object[] r56 = r10.f2670c;     // Catch: Throwable -> L43
        AbstractC0307g.m702d(r56, "args");     // Catch: Throwable -> L43
        Object r57 = AbstractC0179j.m537n0(0, r56);     // Catch: Throwable -> L43
        if (r57 == null) goto L91;
        Object[] r63 = r10.f2670c;     // Catch: Throwable -> L43
        AbstractC0307g.m702d(r63, "args");     // Catch: Throwable -> L43
        Object r15 = AbstractC0179j.m537n0(1, r63);     // Catch: Throwable -> L43
        if ((r15 instanceof Number) == false) goto L45;
        r33 = (Number) r15;     // Catch: Throwable -> L43
    L45:
        if (r33 == null) goto L92;
        int r16 = r33.intValue();     // Catch: Throwable -> L43
        ClassLoader r22 = r2.getDeclaringClass().getClassLoader();     // Catch: Throwable -> L43
        if (r22 != null) goto L51;
        r22 = r57.getClass().getClassLoader();     // Catch: Throwable -> L43
        if (r22 != null) goto L51;
        return;
    L51:
        C0639a0 r35 = C0639a0.f1967a;     // Catch: Throwable -> L43
        View r36 = C0639a0.m1553I(r57);     // Catch: Throwable -> L43
        if (r36 == null) goto L94;
        ConcurrentHashMap r64 = AbstractC0637Z0.f1953a;     // Catch: Throwable -> L43
        Object r17 = AbstractC0637Z0.m1537c(r16, r10.f2669b);     // Catch: Throwable -> L43
        if (r17 == null) goto L95;
        Object r105 = r10.f2669b;     // Catch: Throwable -> L43
        r36.setTag(C1031R.id.abc_tag_message_holder, r57);     // Catch: Throwable -> L43
        if (r105 == null) goto L60;
        r36.setTag(C1031R.id.abc_tag_message_adapter, r105);     // Catch: Throwable -> L43
    L60:
        C0639a0.m1591k0(r36, r17, r22);     // Catch: Throwable -> L43
        return;
    L95:
        return;
    L94:
        return;
    L92:
        return;
    L91:
        return;
    L43:
        th = move-exception;
        if (C0639a0.f1974h.compareAndSet(false, true) == false) goto L96;
        C0639a0 r02 = C0639a0.f1967a;
        C0639a0.m1601p0("bind before err: " + Log.getStackTraceString(th));
        return;
    }

    public C0698u(int r1, Method r2) {
        this.f2199b = r1;
        switch(r1) {
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        C0639a0 r12 = C0639a0.f1967a;
        this.f2200c = r2;
        return;
    L6:
        C0706w1 r13 = C0706w1.f2217a;
        this.f2200c = r2;
        return;
    L8:
        C0639a0 r14 = C0639a0.f1967a;
        this.f2200c = r2;
    }
}
