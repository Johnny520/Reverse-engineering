package p052d0;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import java.io.File;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0146l;
import p029P0.InterfaceC0275a;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p050c0.C0575B1;
import p050c0.C0590G1;
import p050c0.C0599J1;
import p050c0.C0639a0;
import p050c0.C0651e0;
import p050c0.C0661h1;
import p050c0.RunnableC0701v;
import p056f0.C0810V;

/* JADX INFO: renamed from: d0.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0742c implements InterfaceC0275a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2579a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f2580b;

    public /* synthetic */ C0742c(Activity r1, int r2) {
        this.f2579a = r2;
        this.f2580b = r1;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        int r02 = 9;
        switch(this.f2579a) {
            case 0: goto L100;
            case 1: goto L98;
            case 2: goto L96;
            case 3: goto L94;
            case 4: goto L88;
            case 5: goto L79;
            case 6: goto L72;
            case 7: goto L66;
            case 8: goto L60;
            case 9: goto L54;
            case 10: goto L48;
            case 11: goto L46;
            case 12: goto L44;
            case 13: goto L35;
            case 14: goto L33;
            case 15: goto L17;
            case 16: goto L10;
            case 17: goto L8;
            case 18: goto L6;
            default: goto L4;
        };
    L4:
        Activity r03 = this.f2580b;
        AbstractC0307g.m703e(r03, "$host");
        C0639a0 r1 = C0639a0.f1967a;
        C0639a0.m1589j0(r03, true);
        return C0146l.f339a;
    L6:
        Activity r04 = this.f2580b;
        AbstractC0307g.m703e(r04, "$host");
        C0639a0 r12 = C0639a0.f1967a;
        C0639a0.m1589j0(r04, false);
        return C0146l.f339a;
    L8:
        Activity r05 = this.f2580b;
        AbstractC0307g.m703e(r05, "$host");
        C0575B1 r3 = C0575B1.f1701a;
        C0575B1.f1703c = 0;
        C0575B1.m1390g(true);
        C0661h1.f2048a.m1667g("theme_wallpaper_enabled", true, false);
        Object r13 = C0590G1.f1792a;
        C0590G1.m1466x(r05);
        String r14 = C0590G1.m1452j();
        C0810V r2 = C0810V.f2933a;
        C0810V.m2105z(r05, r14);
        return C0146l.f339a;
    L10:
        Activity r06 = this.f2580b;
        AbstractC0307g.m703e(r06, "$host");
        C0575B1 r32 = C0575B1.f1701a;
        new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "theme_wallpaper.jpg").delete();     // Catch: Throwable -> L13
    L15:
        C0661h1 r33 = C0661h1.f2048a;
        r33.m1666f("theme_wallpaper_path", "", true);
        String r4 = String.valueOf(System.currentTimeMillis());
        r33.m1666f("theme_wallpaper_updated", r4, true);
        C0575B1.f1706f = "";
        C0575B1.f1707g = r4;
        C0575B1.f1708h = null;
        C0575B1.f1709i = "";
        C0575B1.f1710j = "";
        C0575B1.f1703c = SystemClock.uptimeMillis();
        C0575B1.m1389f();
        C0575B1 r42 = C0575B1.f1701a;
        r33.m1667g("theme_wallpaper_enabled", false, true);
        C0575B1.f1704d = false;
        C0575B1.f1703c = SystemClock.uptimeMillis();
        C0575B1.m1389f();
        Object r15 = C0590G1.f1792a;
        C0590G1.m1465w();
        C0810V r16 = C0810V.f2933a;
        C0810V.m2105z(r06, "已清除壁纸，恢复默认");
        return C0146l.f339a;
    L13:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L15
    L17:
        C0146l r07 = C0146l.f339a;
        Activity r17 = this.f2580b;
        AbstractC0307g.m703e(r17, "$host");
        C0599J1 r22 = C0599J1.f1831a;
        Object r23 = C0590G1.f1792a;
        C0590G1.m1466x(r17);
        Activity r24 = C0590G1.m1468z();
        if (r24 != null) goto L20;
        r24 = r17;
    L20:
        Intent r34 = new Intent("android.intent.action.GET_CONTENT");
        r34.setType("image/*");
        r34.addCategory("android.intent.category.OPENABLE");
        r24.startActivityForResult(Intent.createChooser(r34, "选择壁纸"), 658449);     // Catch: Throwable -> L23
        Object r25 = r07;
    L26:
        if (AbstractC0141g.m465a(r25) != null) goto L102;
    L31:
        C0810V r26 = C0810V.f2933a;
        C0810V.m2105z(r17, "选择完成后点「应用壁纸」");
        return r07;
    L102:
        r17.startActivityForResult(r34, 658449);     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L23:
        th = move-exception;
        r25 = AbstractC0040p.m116u(th);
        goto L26
    L33:
        Activity r08 = this.f2580b;
        AbstractC0307g.m703e(r08, "$host");
        C0651e0 r18 = C0651e0.f2022a;
        C0651e0.m1635d("/storage/emulated/0/Android/media/com.tencent.mm/OKK/download");
        C0810V r19 = C0810V.f2933a;
        C0810V.m2105z(r08, "已恢复默认：/storage/emulated/0/Android/media/com.tencent.mm/OKK/download");
        return C0146l.f339a;
    L35:
        C0146l r09 = C0146l.f339a;
        Activity r110 = this.f2580b;
        AbstractC0307g.m703e(r110, "$host");
        Intent r27 = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        r27.addFlags(3);
        r110.startActivityForResult(r27, 658720);     // Catch: Throwable -> L38
        Object r28 = r09;
    L41:
        if (AbstractC0141g.m465a(r28) == null) goto L43;
        C0810V r29 = C0810V.f2933a;
        C0810V.m2105z(r110, "无法打开目录选择器");
    L43:
        return r09;
    L38:
        th = move-exception;
        r28 = AbstractC0040p.m116u(th);
        goto L41
    L44:
        Activity r010 = this.f2580b;
        AbstractC0307g.m703e(r010, "$activity");
        AbstractC0358S.m868R(r010, new C0742c(r010, 7));
        return C0146l.f339a;
    L46:
        Activity r011 = this.f2580b;
        AbstractC0307g.m703e(r011, "$activity");
        AbstractC0358S.m868R(r011, new C0742c(r011, 5));
        return C0146l.f339a;
    L48:
        Activity r012 = this.f2580b;
        AbstractC0307g.m703e(r012, "$activity");
        InterfaceC0286l r111 = AbstractC0358S.f731k;
        if (r111 == null) goto L51;
        r111.invoke(r012);
    L53:
        return C0146l.f339a;
    L51:
        Toast.makeText(r012, "设置入口未就绪", 0).show();
        goto L53
    L54:
        Activity r013 = this.f2580b;
        AbstractC0307g.m703e(r013, "$activity");
        InterfaceC0286l r112 = AbstractC0358S.f735o;
        if (r112 == null) goto L57;
        r112.invoke(r013);
    L59:
        return C0146l.f339a;
    L57:
        Toast.makeText(r013, "设置入口未就绪", 0).show();
        goto L59
    L60:
        Activity r014 = this.f2580b;
        AbstractC0307g.m703e(r014, "$activity");
        InterfaceC0286l r113 = AbstractC0358S.f734n;
        if (r113 == null) goto L63;
        r113.invoke(r014);
    L65:
        return C0146l.f339a;
    L63:
        Toast.makeText(r014, "设置入口未就绪", 0).show();
        goto L65
    L66:
        Activity r015 = this.f2580b;
        AbstractC0307g.m703e(r015, "$activity");
        InterfaceC0286l r114 = AbstractC0358S.f732l;
        if (r114 == null) goto L69;
        r114.invoke(r015);
    L71:
        return C0146l.f339a;
    L69:
        Toast.makeText(r015, "设置入口未就绪", 0).show();
        goto L71
    L72:
        Activity r115 = this.f2580b;
        AbstractC0307g.m703e(r115, "$activity");
        AbstractC0358S.m898n(false);
        Window r210 = r115.getWindow();
        if (r210 == null) goto L78;
        View r211 = r210.getDecorView();
        if (r211 == null) goto L78;
        r211.post(new RunnableC0701v(r115, r02));
    L78:
        return C0146l.f339a;
    L79:
        C0146l r016 = C0146l.f339a;
        Activity r116 = this.f2580b;
        AbstractC0307g.m703e(r116, "$activity");
        r116.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/OKK_Group")).addFlags(268435456));     // Catch: Throwable -> L82
        Object r212 = r016;
    L85:
        if (AbstractC0141g.m465a(r212) == null) goto L87;
        Toast.makeText(r116, "无法打开链接", 0).show();
    L87:
        return r016;
    L82:
        th = move-exception;
        r212 = AbstractC0040p.m116u(th);
        goto L85
    L88:
        Activity r017 = this.f2580b;
        AbstractC0307g.m703e(r017, "$activity");
        InterfaceC0286l r117 = AbstractC0358S.f733m;
        if (r117 == null) goto L91;
        r117.invoke(r017);
    L93:
        return C0146l.f339a;
    L91:
        Toast.makeText(r017, "设置入口未就绪", 0).show();
        goto L93
    L94:
        Activity r018 = this.f2580b;
        AbstractC0307g.m703e(r018, "$activity");
        AbstractC0358S.m868R(r018, new C0742c(r018, 8));
        return C0146l.f339a;
    L96:
        Activity r019 = this.f2580b;
        AbstractC0307g.m703e(r019, "$activity");
        AbstractC0358S.m868R(r019, new C0742c(r019, 4));
        return C0146l.f339a;
    L98:
        Activity r118 = this.f2580b;
        AbstractC0307g.m703e(r118, "$activity");
        AbstractC0358S.m868R(r118, new C0742c(r118, r02));
        return C0146l.f339a;
    L100:
        Activity r020 = this.f2580b;
        AbstractC0307g.m703e(r020, "$activity");
        AbstractC0358S.m868R(r020, new C0742c(r020, 10));
        return C0146l.f339a;
    }
}
