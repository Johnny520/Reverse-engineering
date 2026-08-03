package p050c0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p007D0.C0146l;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p031Q0.C0312l;
import p034S.RunnableC0328h;
import p042W0.AbstractC0425j;
import p049b0.C0566p;
import p056f0.C0826f0;

/* JADX INFO: renamed from: c0.H */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0591H implements InterfaceC0286l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1805a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1806b;

    public /* synthetic */ C0591H() {
        this.f1805a = 5;
        this.f1806b = C0826f0.f2992a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object r9) {
        boolean r1 = false;
        Object r2 = null;
        switch(this.f1805a) {
            case 0: goto L93;
            case 1: goto L66;
            case 2: goto L51;
            case 3: goto L49;
            case 4: goto L44;
            default: goto L4;
        };
    L4:
        AbstractC0307g.m703e((C0826f0) this.f1806b, "$this_runCatching");
        if (r9 == null) goto L41;
        Object r02 = C0566p.m1376a(r9, new String[]{"j"});
        if (r02 != null) goto L10;
        r02 = r9;
    L10:
        Set r4 = C0826f0.f2995d;
        AbstractC0307g.m702d(r4, "markedModernItems");
        monitor-enter(r4);
    L18:
        th = move-exception;
        throw th;
    L13:
        if (r4.contains(r9) == true) goto L20;
        if (r4.contains(r02) == true) goto L20;
        boolean r03 = false;
    L21:
        monitor-exit(r4);
        if (r03 == false) goto L24;
    L23:
        r1 = true;
        goto L41
    L24:
        Object r04 = C0566p.m1376a(r9, new String[]{"v", "A6"});
        if ((r04 instanceof String) == false) goto L27;
        r2 = (String) r04;
    L27:
        if (r2 != null) goto L36;
        r2 = C0826f0.m2141g(r9);
        if (r2 != null) goto L36;
        Object r05 = C0566p.m1376a(r9, new String[]{"j"});
        if (r05 == null) goto L34;
        r9 = r05;
    L34:
        r2 = C0826f0.m2141g(r9);
    L36:
        if (AbstractC0307g.m699a(r2, "SettingGroup_Main_OKK") == true) goto L23;
        if (AbstractC0307g.m699a(r2, "abc_module_settings_entry") == false) goto L41;
    L20:
        r03 = true;
    L41:
        return Boolean.valueOf(r1);
    L44:
        EnumC0583E0 r92 = (EnumC0583E0) r9;
        EnumC0583E0 r22 = (EnumC0583E0) this.f1806b;
        AbstractC0307g.m703e(r22, "$s");
        AbstractC0307g.m703e(r92, "it");
        if (r92 != r22) goto L48;
        r1 = true;
    L48:
        return Boolean.valueOf(r1);
    L49:
        String r93 = (String) r9;
        C0613O0 r12 = (C0613O0) this.f1806b;
        AbstractC0307g.m703e(r12, "$identity");
        AbstractC0307g.m703e(r93, "name");
        C0688q1.f2169g.post(new RunnableC0328h(r12, r93, 3));
        return C0146l.f339a;
    L51:
        ClassLoader r06 = (ClassLoader) this.f1806b;
        ImageView r94 = (ImageView) r9;
        AbstractC0307g.m703e(r06, "$classLoader");
        AbstractC0307g.m703e(r94, "iv");
        C0580D0 r13 = C0580D0.f1723a;
        String r14 = C0580D0.m1409p(r06);
        if (AbstractC0425j.m1013R0(r14) == false) goto L55;
        r14 = C0580D0.f1736n;
    L55:
        if ((true ^ AbstractC0425j.m1013R0(r14)) == false) goto L65;
        Method r3 = C0580D0.f1742t;     // Catch: Throwable -> L62
        if (r3 != null) goto L59;
        r3 = C0580D0.m1408o(r06);     // Catch: Throwable -> L62
    L59:
        if (r3 == null) goto L65;
        r3.invoke(null, new Object[]{r94, r14});     // Catch: Throwable -> L62
    L62:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L65:
        return C0146l.f339a;
    L66:
        File r15 = (File) this.f1806b;
        AbstractC0307g.m703e((String) r9, "it");
        ConcurrentHashMap r95 = AbstractC0626U.f1936a;
        Bitmap r96 = BitmapFactory.decodeFile(r15.getAbsolutePath());     // Catch: Throwable -> L73
        if (r96 == null) goto L178;
        boolean r16 = NinePatch.isNinePatchChunk(r96.getNinePatchChunk());     // Catch: Throwable -> L73
        if (r16 == false) goto L75;
        byte[] r42 = r96.getNinePatchChunk();     // Catch: Throwable -> L73
    L76:
        if (r42 == null) goto L179;
        if (r16 == false) goto L80;
        Bitmap r07 = r96;
    L81:
        if (r16 == false) goto L83;
        Rect r97 = new Rect();     // Catch: Throwable -> L73
    L84:
        Object r17 = new C0622S(r07, r42, r97);     // Catch: Throwable -> L73
    L88:
        if ((r17 instanceof C0140f) == true) goto L92;
        r2 = r17;
    L92:
        return (C0622S) r2;
    L83:
        r97 = AbstractC0626U.m1531d(r96);     // Catch: Throwable -> L73
        goto L84
    L80:
        r07 = Bitmap.createBitmap(r96, 1, 1, r96.getWidth() - 2, r96.getHeight() - 2);     // Catch: Throwable -> L73
        AbstractC0307g.m700b(r07);     // Catch: Throwable -> L73
        goto L81
    L179:
        return null;
    L75:
        r42 = AbstractC0626U.m1529b(r96);     // Catch: Throwable -> L73
        goto L76
    L178:
        return null;
    L73:
        th = move-exception;
        r17 = AbstractC0040p.m116u(th);
        goto L88
    L93:
        View r98 = (View) r9;
        C0312l r43 = (C0312l) this.f1806b;
        AbstractC0307g.m703e(r43, "$count");
        AbstractC0307g.m703e(r98, "view");
        if ((r98 instanceof TextView) == false) goto L164;
        String r7 = "";
        if (r98.getId() != (-1)) goto L176;
        String r5 = "";
    L108:
        if (AbstractC0307g.m699a(r5, "icon_tv") == false) goto L164;
        Set r52 = AbstractC0597J.f1827a;
        TextView r99 = (TextView) r98;
        CharSequence r53 = r99.getText();
        if (r53 == null) goto L114;
        String r54 = r53.toString();
        if (r54 == null) goto L114;
        r2 = AbstractC0425j.m1022a1(r54).toString();
    L114:
        if (r2 == null) goto L118;
        r7 = r2;
    L118:
        if (r7.length() != 0) goto L120;
        boolean r23 = false;
    L121:
        if (r23 == false) goto L164;
        if (r99.isShown() == false) goto L125;
    L127:
        int[] r08 = new int[2];
        r99.getLocationOnScreen(r08);     // Catch: Throwable -> L131
        int r24 = r99.getResources().getDisplayMetrics().heightPixels;     // Catch: Throwable -> L131
        int r09 = r08[1];     // Catch: Throwable -> L131
        if (r99.getHeight() <= 0) goto L133;
        int r55 = r99.getHeight();     // Catch: Throwable -> L131
    L134:
        float r25 = r24;
        if (r09 <= (0.88f * r25)) goto L140;
        if (1 > r55) goto L140;
        if (r55 > ((int) (r25 * 0.08f))) goto L140;
        boolean r010 = true;
    L141:
        Object r011 = Boolean.valueOf(r010);     // Catch: Throwable -> L131
    L144:
        Object r26 = Boolean.FALSE;
        if ((r011 instanceof C0140f) == false) goto L147;
        r011 = r26;
    L147:
        boolean r012 = ((Boolean) r011).booleanValue();
    L148:
        if (r012 == false) goto L161;
        int r013 = r99.getVisibility();
        Set r27 = C0594I.f1816e;
        if (r013 == 8) goto L153;
    L158:
        r27.add(r99);
        r99.setVisibility(8);     // Catch: Throwable -> L165
        r99.setAlpha(0.0f);     // Catch: Throwable -> L165
        r99.setClickable(false);     // Catch: Throwable -> L165
        r99.setFocusable(false);     // Catch: Throwable -> L165
        r1 = true;
        goto L161
    L153:
        if (r99.getAlpha() != 0.0f) goto L155;
        boolean r014 = true;
    L156:
        if (r014 == false) goto L158;
        r27.add(r99);
        goto L161
    L155:
        r014 = false;
    L161:
        if (r1 == false) goto L164;
        r43.f594a++;
    L140:
        r010 = false;
        goto L141
    L133:
        r55 = r99.getMeasuredHeight();     // Catch: Throwable -> L131
    L131:
        th = move-exception;
        r011 = AbstractC0040p.m116u(th);
        goto L144
    L125:
        if (r99.getVisibility() == 0) goto L127;
        r012 = false;
        goto L148
    L120:
        r23 = AbstractC0597J.f1827a.contains(r7);
        goto L121
    L176:
        Object r56 = r98.getResources().getResourceEntryName(r98.getId());     // Catch: Throwable -> L101
    L104:
        if ((r56 instanceof C0140f) == false) goto L106;
        r56 = "";
    L106:
        r5 = (String) r56;
    L101:
        th = move-exception;
        r56 = AbstractC0040p.m116u(th);
    L164:
        return C0146l.f339a;
    }

    public /* synthetic */ C0591H(int r1, Object r2) {
        this.f1805a = r1;
        this.f1806b = r2;
    }
}
