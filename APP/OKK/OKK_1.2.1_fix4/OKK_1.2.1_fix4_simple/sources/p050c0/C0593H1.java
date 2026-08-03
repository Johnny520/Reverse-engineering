package p050c0;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import p001A0.AbstractC0040p;
import p001A0.RunnableC0028d;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: c0.H1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0593H1 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1810b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0599J1 f1811c;

    public C0593H1(int r1) {
        this.f1810b = r1;
        switch(r1) {
            case 1: goto L14;
            case 2: goto L12;
            case 3: goto L10;
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        this.f1811c = C0599J1.f1831a;
        return;
    L6:
        this.f1811c = C0599J1.f1831a;
        return;
    L8:
        this.f1811c = C0599J1.f1831a;
        return;
    L10:
        this.f1811c = C0599J1.f1831a;
        return;
    L12:
        this.f1811c = C0599J1.f1831a;
        return;
    L14:
        this.f1811c = C0599J1.f1831a;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b r13) {
        boolean r2 = false;
        Activity r4 = null;
        Boolean r42 = null;
        Integer r43 = null;
        switch(this.f1810b) {
            case 0: goto L63;
            case 1: goto L40;
            case 2: goto L4;
            case 3: goto L4;
            case 4: goto L23;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        return;
    L40:
        Object r132 = r13.f2669b;
        if ((r132 instanceof Activity) == false) goto L43;
        r4 = (Activity) r132;
    L43:
        if (r4 != null) goto L46;
        return;
    L46:
        if (C0575B1.f1701a.m1393e() == false) goto L171;
        Object r133 = C0590G1.f1792a;
        if (C0590G1.m1459q(r4) == false) goto L172;
    L57:
        th = move-exception;
        Object r134 = AbstractC0040p.m116u(th);
    L59:
        Throwable r135 = AbstractC0141g.m465a(r134);
        if (r135 == null) goto L169;
        String r136 = AbstractC0324d.m725h("resume: ", r135.getMessage());
        this.f1811c.getClass();
        C0599J1.m1485c(r136);
        return;
    L169:
        return;
    L52:
        if (C0590G1.m1459q(r4) == true) goto L54;
        C0590G1.m1454l(r4);     // Catch: Throwable -> L57
    L55:
        r134 = C0146l.f339a;     // Catch: Throwable -> L57
        goto L59
    L54:
        C0590G1.m1466x(r4);     // Catch: Throwable -> L57
        C0590G1.m1443a(r4);     // Catch: Throwable -> L57
        goto L55
    L172:
        return;
    L171:
        return;
    L63:
        Object[] r6 = r13.f2670c;
        AbstractC0307g.m702d(r6, "args");
        Object r62 = AbstractC0179j.m537n0(0, r6);
        if ((r62 instanceof Integer) == false) goto L66;
        Integer r63 = (Integer) r62;
    L67:
        if (r63 != null) goto L70;
        return;
    L70:
        if (r63.intValue() != 658449) goto L178;
        Object[] r64 = r13.f2670c;
        AbstractC0307g.m702d(r64, "args");
        Object r65 = AbstractC0179j.m537n0(1, r64);
        if ((r65 instanceof Integer) == false) goto L75;
        Integer r66 = (Integer) r65;
    L76:
        if (r66 != null) goto L79;
        return;
    L79:
        if (r66.intValue() != (-1)) goto L180;
        Object[] r67 = r13.f2670c;
        AbstractC0307g.m702d(r67, "args");
        Object r02 = AbstractC0179j.m537n0(2, r67);
        if ((r02 instanceof Intent) == false) goto L84;
        Intent r03 = (Intent) r02;
    L85:
        if (r03 == null) goto L173;
        Uri r04 = r03.getData();
        if (r04 == null) goto L181;
        Object r137 = r13.f2669b;
        if ((r137 instanceof Activity) == false) goto L92;
        Activity r138 = (Activity) r137;
    L93:
        if (r138 == null) goto L182;
        C0575B1 r68 = C0575B1.f1701a;
        File r69 = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK");     // Catch: Throwable -> L99
        if (r69.exists() == true) goto L101;
        r69.mkdirs();     // Catch: Throwable -> L99
    L101:
        File r610 = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "theme_wallpaper.jpg");     // Catch: Throwable -> L99
        InputStream r05 = r138.getContentResolver().openInputStream(r04);     // Catch: Throwable -> L99
        if (r05 != null) goto L155;
    L135:
        Object r06 = Boolean.valueOf(r2);     // Catch: Throwable -> L99
    L138:
        Boolean r22 = Boolean.FALSE;
        boolean r3 = r06 instanceof C0140f;
        Object r07 = r06;
        if (r3 == false) goto L141;
        r07 = r22;
    L141:
        boolean r08 = ((Boolean) r07).booleanValue();
        this.f1811c.getClass();
        C0599J1.m1485c("pick ok=" + r08);
        if (r08 == false) goto L174;
        C0575B1 r09 = C0575B1.f1701a;
        C0661h1.f2048a.m1667g("theme_wallpaper_enabled", true, true);
        C0575B1.f1704d = true;
        C0575B1.f1703c = SystemClock.uptimeMillis();
        Window r139 = r138.getWindow();
        if (r139 == null) goto L175;
        View r1310 = r139.getDecorView();
        if (r1310 == null) goto L176;
        r1310.post(new RunnableC0028d());
        return;
    L176:
        return;
    L175:
        return;
    L174:
        return;
    L155:
        ByteArrayOutputStream r5 = new ByteArrayOutputStream(Math.max(8192, r05.available()));     // Catch: Throwable -> L120
        AbstractC0040p.m115t(r05, r5, 8192);     // Catch: Throwable -> L120
        byte[] r52 = r5.toByteArray();     // Catch: Throwable -> L120
        AbstractC0307g.m702d(r52, "toByteArray(...)");     // Catch: Throwable -> L120
        BitmapFactory.Options r8 = new BitmapFactory.Options();     // Catch: Throwable -> L120
        r8.inJustDecodeBounds = true;     // Catch: Throwable -> L120
        BitmapFactory.decodeByteArray(r52, 0, r52.length, r8);     // Catch: Throwable -> L120
        int r9 = r8.outWidth;     // Catch: Throwable -> L120
        int r82 = r8.outHeight;     // Catch: Throwable -> L120
        int r10 = 1;
    L105:
        if (r9 > 1440) goto L129;
        if (r82 > 1440) goto L129;
        if (r10 >= 1) goto L110;
        r10 = 1;
    L110:
        BitmapFactory.Options r32 = new BitmapFactory.Options();     // Catch: Throwable -> L120
        r32.inSampleSize = r10;     // Catch: Throwable -> L120
        Bitmap r33 = BitmapFactory.decodeByteArray(r52, 0, r52.length, r32);     // Catch: Throwable -> L120
        if (r33 != null) goto L114;
        AbstractC0040p.m108m(r05, null);     // Catch: Throwable -> L99
        goto L135
    L114:
        FileOutputStream r53 = new FileOutputStream(r610);     // Catch: Throwable -> L120
        r33.compress(Bitmap.CompressFormat.JPEG, 88, r53);     // Catch: Throwable -> L124
        AbstractC0040p.m108m(r53, null);     // Catch: Throwable -> L120
        if (r33 == C0575B1.f1708h) goto L122;
        C0575B1.f1708h = r33;     // Catch: Throwable -> L120
        C0575B1.f1709i = r610.getAbsolutePath();     // Catch: Throwable -> L120
    L122:
        AbstractC0040p.m108m(r05, null);     // Catch: Throwable -> L99
        String r010 = String.valueOf(System.currentTimeMillis());     // Catch: Throwable -> L99
        C0661h1 r34 = C0661h1.f2048a;     // Catch: Throwable -> L99
        String r54 = r610.getAbsolutePath();     // Catch: Throwable -> L99
        AbstractC0307g.m702d(r54, "getAbsolutePath(...)");     // Catch: Throwable -> L99
        r34.m1666f("theme_wallpaper_path", r54, false);     // Catch: Throwable -> L99
        r34.m1667g("theme_wallpaper_enabled", true, false);     // Catch: Throwable -> L99
        r34.m1666f("theme_wallpaper_updated", r010, false);     // Catch: Throwable -> L99
        C0575B1.f1704d = true;     // Catch: Throwable -> L99
        C0575B1.f1706f = r610.getAbsolutePath();     // Catch: Throwable -> L99
        C0575B1.f1707g = r010;     // Catch: Throwable -> L99
        C0575B1.f1710j = r010;     // Catch: Throwable -> L99
        C0575B1.f1703c = SystemClock.uptimeMillis();     // Catch: Throwable -> L99
        C0575B1.m1389f();     // Catch: Throwable -> L99
        r2 = true;
        goto L135
    L124:
        th = move-exception;
        throw th;     // Catch: Throwable -> L126
    L126:
        th = move-exception;
        AbstractC0040p.m108m(r53, th);     // Catch: Throwable -> L120
        throw th;     // Catch: Throwable -> L120
    L129:
        r10 = r10 * 2;     // Catch: Throwable -> L120
        r9 = r9 / 2;     // Catch: Throwable -> L120
        r82 = r82 / 2;     // Catch: Throwable -> L120
    L120:
        th = move-exception;
        throw th;     // Catch: Throwable -> L132
    L132:
        th = move-exception;
        AbstractC0040p.m108m(r05, th);     // Catch: Throwable -> L99
        throw th;     // Catch: Throwable -> L99
    L99:
        th = move-exception;
        r06 = AbstractC0040p.m116u(th);
        goto L138
    L182:
        return;
    L92:
        r138 = null;
        goto L93
    L181:
        return;
    L173:
        return;
    L84:
        r03 = null;
        goto L85
    L180:
        return;
    L75:
        r66 = null;
        goto L76
    L178:
        return;
    L66:
        r63 = null;
        goto L67
    L6:
        if (C0575B1.f1701a.m1393e() == false) goto L162;
        Object r011 = r13.f2672e;
        if ((r011 instanceof Boolean) == false) goto L11;
        r42 = (Boolean) r011;
    L11:
        if (r42 == null) goto L13;
        r2 = r42.booleanValue();
    L13:
        if (r2 == false) goto L163;
        Object r012 = r13.f2669b;
        AbstractC0307g.m702d(r012, "thisObject");
        this.f1811c.getClass();
        Activity r013 = C0599J1.m1484b(r012);
        if (r013 != null) goto L20;
        Object r014 = C0590G1.f1792a;
        r013 = C0590G1.m1468z();
        if (r013 != null) goto L20;
        return;
    L20:
        Object r23 = C0590G1.f1792a;
        C0590G1.m1439B(r013);
        Object r1311 = r13.f2669b;
        AbstractC0307g.m702d(r1311, "thisObject");
        C0599J1.m1483a(r1311);
        C0599J1.m1485c("NewChattingTabUI.f restore");
        return;
    L163:
        return;
    L162:
        return;
    L23:
        if (C0575B1.f1701a.m1393e() == false) goto L165;
        Object[] r35 = r13.f2670c;
        AbstractC0307g.m702d(r35, "args");
        Object r015 = AbstractC0179j.m537n0(0, r35);
        if ((r015 instanceof Integer) == false) goto L28;
        r43 = (Integer) r015;
    L28:
        if (r43 != null) goto L31;
        return;
    L31:
        if (r43.intValue() != 0) goto L167;
        Object r016 = r13.f2669b;
        AbstractC0307g.m702d(r016, "thisObject");
        this.f1811c.getClass();
        Activity r017 = C0599J1.m1484b(r016);
        if (r017 != null) goto L38;
        Object r018 = C0590G1.f1792a;
        r017 = C0590G1.m1468z();
        if (r017 != null) goto L38;
        return;
    L38:
        Object r24 = C0590G1.f1792a;
        C0590G1.m1464v(r017);
        Object r1312 = r13.f2669b;
        AbstractC0307g.m702d(r1312, "thisObject");
        C0599J1.m1483a(r1312);
        C0599J1.m1485c("NewChattingTabUI.q reveal after");
        return;
    L167:
        return;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b r7) {
        Activity r1 = null;
        Integer r12 = null;
        C0599J1 r4 = this.f1811c;
        switch(this.f1810b) {
            case 2: goto L43;
            case 3: goto L33;
            case 4: goto L15;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        return;
    L6:
        if (C0575B1.f1701a.m1393e() == false) goto L52;
        Object r02 = r7.f2669b;
        AbstractC0307g.m702d(r02, "thisObject");
        r4.getClass();
        Activity r03 = C0599J1.m1484b(r02);
        if (r03 != null) goto L10;
        Object r04 = C0590G1.f1792a;
        r03 = C0590G1.m1468z();
    L10:
        if (r03 == null) goto L12;
        Object r13 = C0590G1.f1792a;
        C0590G1.m1462t(r03);
    L12:
        Object r05 = r7.f2669b;
        AbstractC0307g.m702d(r05, "thisObject");
        C0599J1.m1483a(r05);
        r7.f2670c[0] = Boolean.FALSE;
        return;
    L52:
        return;
    L15:
        if (C0575B1.f1701a.m1393e() == false) goto L53;
        Object[] r06 = r7.f2670c;
        AbstractC0307g.m702d(r06, "args");
        Object r07 = AbstractC0179j.m537n0(0, r06);
        if ((r07 instanceof Integer) == false) goto L20;
        r12 = (Integer) r07;
    L20:
        if (r12 != null) goto L23;
        return;
    L23:
        if (r12.intValue() != 0) goto L55;
        Object r08 = r7.f2669b;
        AbstractC0307g.m702d(r08, "thisObject");
        r4.getClass();
        Activity r09 = C0599J1.m1484b(r08);
        if (r09 != null) goto L30;
        Object r010 = C0590G1.f1792a;
        r09 = C0590G1.m1468z();
        if (r09 != null) goto L30;
        return;
    L30:
        Object r14 = C0590G1.f1792a;
        C0590G1.m1464v(r09);
        Object r72 = r7.f2669b;
        AbstractC0307g.m702d(r72, "thisObject");
        C0599J1.m1483a(r72);
        C0599J1.m1485c("NewChattingTabUI.q reveal before");
        return;
    L55:
        return;
    L53:
        return;
    L33:
        if (C0575B1.f1701a.m1393e() == false) goto L57;
        Object r15 = r7.f2669b;
        AbstractC0307g.m702d(r15, "thisObject");
        r4.getClass();
        Activity r16 = C0599J1.m1484b(r15);
        if (r16 != null) goto L40;
        Object r17 = C0590G1.f1792a;
        r16 = C0590G1.m1468z();
        if (r16 != null) goto L40;
        return;
    L40:
        Object r2 = C0590G1.f1792a;
        C0590G1.m1463u(r16);
        r7.f2670c[2] = Boolean.FALSE;
        C0599J1.m1485c("NewChattingTabUI.r snapshot noAnim");
        return;
    L57:
        return;
    L43:
        if (C0575B1.f1701a.m1393e() == false) goto L59;
        Object r22 = r7.f2669b;
        if ((r22 instanceof Activity) == false) goto L48;
        r1 = (Activity) r22;
    L48:
        if (r1 == null) goto L60;
        Object r23 = C0590G1.f1792a;
        C0590G1.m1463u(r1);
        r7.f2670c[2] = Boolean.FALSE;
        r4.getClass();
        C0599J1.m1485c("LauncherUI.startChatting snapshot noAnim");
        return;
    L60:
        return;
    }
}
