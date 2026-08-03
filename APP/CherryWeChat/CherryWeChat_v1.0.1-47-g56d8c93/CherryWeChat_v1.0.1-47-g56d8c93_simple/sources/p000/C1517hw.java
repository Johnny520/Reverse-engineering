package p000;

import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.view.View;
import io.github.cherrywechat.application.MainApplication;
import io.github.cherrywechat.theme.ThemeProvider;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: hw */
/* JADX INFO: loaded from: classes.dex */
public class C1517hw implements InterfaceC1054Yg, InterfaceC2142kc, InterfaceC2476rx, InterfaceC1233bs {

    /* JADX INFO: renamed from: b */
    public static C1517hw f5366b;

    /* JADX INFO: renamed from: c */
    public static C1517hw f5367c;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5368a;

    public /* synthetic */ C1517hw(int r1) {
        this.f5368a = r1;
    }

    /* JADX INFO: renamed from: a */
    public static int m2889a(int r2, String r3) {
        AbstractC0295Gu.m625r(-791652666964021L);
        C0183EA.f539a.getClass();
        if (C0183EA.m374b().f232j == true) goto L5;
    L30:
        Integer r32 = (Integer) AbstractC0999XA.f3193a.get(r3);
        if (r32 != null) goto L33;
        return r2;
    L33:
        return r32.intValue();
    L5:
        if (m2895h() == false) goto L30;
        if (r3.equals(AbstractC0295Gu.m625r(-791674141800501L)) == true) goto L30;
        if (r3.equals(AbstractC0295Gu.m625r(-791802990819381L)) == true) goto L30;
        if (AbstractC2564tz.m5051L(r3, AbstractC0295Gu.m625r(-791923249903669L), false) == true) goto L30;
        int r0 = r3.hashCode();
        if (r0 == (-1002704833)) goto L26;
        if (r0 == 520448727) goto L23;
        if (r0 == 1114773987) goto L20;
        return -1;
    L20:
        if (r3.equals(AbstractC0295Gu.m625r(-792507365455925L)) == true) goto L30;
        return -1;
    L23:
        if (r3.equals(AbstractC0295Gu.m625r(-792619034605621L)) == true) goto L30;
        return -1;
    L26:
        if (r3.equals(AbstractC0295Gu.m625r(-792215307679797L)) == true) goto L30;
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m2890b(String r14) {
        if (r14 != null) goto L5;
        return null;
    L5:
        if (r14.length() == 0) goto L54;
        Context r1 = MainApplication.f5549a;
        if (r1 != null) goto L14;
        r1 = C1456gf.f5172p;
        if (r1 != null) goto L14;
        r1 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L14:
        Resources r12 = r1.getResources();
        AbstractC0295Gu.m625r(-836955982002229L);
        boolean r6 = m2895h();
        if (r6 == false) goto L27;
        int r9 = AbstractC2564tz.m5061V(r14, '/');
        if (r9 < 0) goto L19;
        StringBuilder r10 = new StringBuilder();
        int r92 = r9 + 1;
        String r11 = r14.substring(0, r92);
        AbstractC0295Gu.m625r(-793830215383093L);
        AbstractC2374ph.m4817n(r10, r11, -793344884078645L);
        String r93 = r14.substring(r92);
        AbstractC0295Gu.m625r(-793370653882421L);
        r10.append(r93);
        String r94 = r10.toString();
    L21:
        if (m2893e(r94) == false) goto L23;
        Drawable r95 = ThemeProvider.getDrawableForSize(r12, r94, AbstractC0295Gu.m616i(32), AbstractC0295Gu.m616i(32));
    L24:
        if (r95 == null) goto L27;
        return r95;
    L23:
        r95 = ThemeProvider.getDrawable(r12, r94);
        goto L24
    L19:
        r94 = AbstractC0295Gu.m625r(-793435078391861L).concat(r14);
    L27:
        if (m2893e(r14) == false) goto L29;
        Drawable r0 = ThemeProvider.getDrawableForSize(r12, r14, AbstractC0295Gu.m616i(32), AbstractC0295Gu.m616i(32));
    L30:
        if (r0 == null) goto L55;
        C0183EA.f539a.getClass();
        if (C0183EA.m374b().f232j == false) goto L51;
        if (r6 == false) goto L51;
        if (AbstractC2564tz.m5068c0(r14, '/').startsWith(AbstractC0295Gu.m625r(-793460848195637L)) == false) goto L38;
        int r13 = -1073741824;
    L40:
        if (m2893e(r14) == false) goto L50;
        AbstractC0295Gu.m625r(-793478028064821L);
        Bitmap r142 = ((BitmapDrawable) r0).getBitmap().copy(Bitmap.Config.ARGB_8888, true);
        Canvas r02 = new Canvas(r142);
        Paint r62 = new Paint();
        r62.setColor(r13);
        r62.setColorFilter(new PorterDuffColorFilter(r62.getColor(), PorterDuff.Mode.SRC_IN));
        r02.drawBitmap(r142, 0.0f, 0.0f, r62);
        Context r03 = MainApplication.f5549a;
        if (r03 != null) goto L48;
        r03 = C1456gf.f5172p;
        if (r03 != null) goto L48;
        r03 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L48:
        Resources r04 = r03.getResources();
        AbstractC0295Gu.m625r(-836955982002229L);
        return new BitmapDrawable(r04, r142);
    L50:
        r0.setColorFilter(new PorterDuffColorFilter(r13, PorterDuff.Mode.SRC_ATOP));
        goto L51
    L38:
        r13 = 536870912;
    L51:
        return r0;
    L55:
        return null;
    L29:
        r0 = ThemeProvider.getDrawable(r12, r14);
        goto L30
    L54:
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static Path m2891c(float r1, float r2, float r3, float r4) {
        Path r0 = new Path();
        r0.moveTo(r1, r2);
        r0.lineTo(r3, r4);
        return r0;
    }

    /* JADX INFO: renamed from: d */
    public static String m2892d(String r2, String r3) {
        AbstractC0295Gu.m625r(-792163768072245L);
        AbstractC0295Gu.m625r(-792185242908725L);
        String r22 = (String) AbstractC0999XA.f3194b.get(r2);
        if (r22 != null) goto L5;
        return r3;
    L5:
        return r22;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2893e(String r4) {
        if (AbstractC2564tz.m5051L(r4, AbstractC0295Gu.m625r(-793752905971765L), false) == true) goto L5;
    L10:
        return false;
    L5:
        if (AbstractC2564tz.m5051L(r4, AbstractC0295Gu.m625r(-793795855644725L), false) == true) goto L10;
        if (AbstractC2564tz.m5051L(r4, AbstractC0295Gu.m625r(-793813035513909L), false) == true) goto L10;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m2894f(Context r2) {
        AbstractC0295Gu.m625r(-793675596560437L);
        if ((r2.getResources().getConfiguration().uiMode & 48) != 32) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2895h() {
        Context r0 = MainApplication.f5549a;
        if (r0 != null) goto L10;
        r0 = C1456gf.f5172p;
        if (r0 != null) goto L10;
        r0 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L10:
        return m2894f(r0);
    }

    @Override // p000.InterfaceC1054Yg
    /* JADX INFO: renamed from: g */
    public Object mo235g() {
        return new C1070Yw(MessageDigest.getInstance("SHA-256"));
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    @Override // p000.InterfaceC2476rx
    public void onScrollLimit(int r1, int r2, int r3, boolean r4) {
    }

    @Override // p000.InterfaceC2476rx
    public void onScrollProgress(int r1, int r2, int r3, int r4) {
    }

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public InterfaceC1189as mo88p(C2428qs r4) {
        switch(this.f5368a) {
            case 9: goto L13;
            case 10: goto L11;
            case 11: goto L9;
            case 17: goto L7;
            default: goto L5;
        };
    L5:
        return new C2356pD(r4.m4872j(C1057Yj.class, InputStream.class));
    L7:
        return new C2392pz(r4.m4872j(C1057Yj.class, InputStream.class), 1);
    L9:
        return new C2392pz(r4.m4872j(Uri.class, InputStream.class), 0);
    L11:
        return new C2392pz(r4.m4872j(Uri.class, ParcelFileDescriptor.class), 0);
    L13:
        return new C2392pz(r4.m4872j(Uri.class, AssetFileDescriptor.class), 0);
    }

    public C1517hw(View r2, int r3) {
        this.f5368a = r3;
        switch(r3) {
            case 8: goto L7;
            default: goto L5;
        };
    L5:
        return;
    L7:
        if (Build.VERSION.SDK_INT < 30) goto L9;
        new C0170Dy(r2, 7);
        return;
    L9:
        new C1517hw(r2, 7);
    }
}
