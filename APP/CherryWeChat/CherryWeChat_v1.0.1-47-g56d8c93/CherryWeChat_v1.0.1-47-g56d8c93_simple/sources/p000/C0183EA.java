package p000;

import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import io.github.cherrywechat.application.MainApplication;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.AuthorizedThemeData;
import io.github.cherrywechat.network.model.CustomerData;
import io.github.cherrywechat.network.model.CustomerInfo;
import io.github.cherrywechat.network.model.ThemeConfig;
import io.github.cherrywechat.network.model.ThemeVersionData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: EA */
/* JADX INFO: loaded from: classes.dex */
public final class C0183EA {

    /* JADX INFO: renamed from: a */
    public static final C0183EA f539a = null;

    /* JADX INFO: renamed from: b */
    public static String f540b;

    /* JADX INFO: renamed from: c */
    public static String f541c;

    /* JADX INFO: renamed from: d */
    public static long f542d;

    /* JADX INFO: renamed from: e */
    public static final ArrayList f543e = null;

    /* JADX INFO: renamed from: f */
    public static final SharedPreferences f544f = null;

    static {
        AbstractC0295Gu.m625r(-794637669234741L);
        AbstractC0295Gu.m625r(-793048531335221L);
        AbstractC0295Gu.m625r(-793091481008181L);
        AbstractC0295Gu.m625r(-793121545779253L);
        f539a = new C0183EA();
        f540b = AbstractC0295Gu.m625r(-793130135713845L);
        f541c = AbstractC0295Gu.m625r(-793134430681141L);
        f543e = new ArrayList();
        Context r0 = MainApplication.f5549a;
        if (r0 != null) goto L9;
        r0 = C1456gf.f5172p;
        if (r0 != null) goto L9;
        r0 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L9:
        f544f = r0.getSharedPreferences(AbstractC0295Gu.m625r(-793138725648437L), 0);
    }

    /* JADX INFO: renamed from: a */
    public static String m373a() {
        String r0 = AbstractC0295Gu.m625r(-796016353736757L);
        String r1 = AbstractC0295Gu.m625r(-795509547595829L);
        String r02 = f544f.getString(r0, r1);
        if (r02 == null) goto L5;
        return r02;
    L5:
        return AbstractC0295Gu.m625r(-795518137530421L);
    }

    /* JADX INFO: renamed from: b */
    public static C0097CA m374b() {
        String r0 = m373a();
        if (r0.equals(AbstractC0295Gu.m625r(-794225352374325L)) == true) goto L5;
        Iterator r1 = m381i().iterator();
    L8:
        if (r1.hasNext() == false) goto L12;
        Object r2 = r1.next();
        if (AbstractC0585Nj.m1134a(((C0097CA) r2).f223a, r0) == false) goto L8;
    L13:
        C0097CA r22 = (C0097CA) r2;
        if (r22 == null) goto L16;
        return r22;
    L16:
        return m376d();
    L12:
        r2 = null;
        goto L13
    L5:
        return m376d();
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m375c() {
        String r0 = AbstractC0295Gu.m625r(-738996367915061L);
        AbstractC0295Gu.m625r(-779686888077365L);
        byte[] r02 = Base64.decode(r0, 0);     // Catch: IllegalArgumentException -> L5
        Bitmap r03 = BitmapFactory.decodeByteArray(r02, 0, r02.length);     // Catch: IllegalArgumentException -> L5
    L7:
        if (r03 == null) goto L10;
        return r03;
    L10:
        throw new IllegalArgumentException(AbstractC0295Gu.m625r(-795969109096501L));
    L5:
        e = move-exception;
        e.printStackTrace();
        r03 = null;
        goto L7
    }

    /* JADX INFO: renamed from: d */
    public static C0097CA m376d() {
        return new C0097CA(AbstractC0295Gu.m625r(-795771540600885L), AbstractC0295Gu.m625r(-794130863093813L), AbstractC0295Gu.m625r(-794152337930293L), AbstractC0295Gu.m625r(-794165222832181L), AbstractC0295Gu.m625r(-794182402701365L), AbstractC0295Gu.m625r(-794212467472437L), AbstractC0295Gu.m625r(-794216762439733L), AbstractC0295Gu.m625r(-794221057407029L), false, true);
    }

    /* JADX INFO: renamed from: e */
    public static String m377e(String r4) {
        AbstractC0295Gu.m625r(-739352850200629L);
        StringBuilder r0 = new StringBuilder();
        Context r1 = MainApplication.f5549a;
        if (r1 != null) goto L9;
        r1 = C1456gf.f5172p;
        if (r1 != null) goto L9;
        r1 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L9:
        r0.append(r1.getFilesDir());
        r0.append(AbstractC0295Gu.m625r(-739387209938997L));
        r0.append(r4);
        r0.append('/');
        return r0.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m378f(String r4) {
        AbstractC0295Gu.m625r(-738876108830773L);
        StringBuilder r0 = new StringBuilder();
        Context r1 = MainApplication.f5549a;
        if (r1 != null) goto L9;
        r1 = C1456gf.f5172p;
        if (r1 != null) goto L9;
        r1 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L9:
        r0.append(r1.getFilesDir());
        r0.append(AbstractC0295Gu.m625r(-738910468569141L));
        r0.append(r4);
        r0.append(AbstractC0295Gu.m625r(-738949123274805L));
        return r0.toString();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m379g(String r3) {
        AbstractC0295Gu.m625r(-794233942308917L);
        if (r3.equals(AbstractC0295Gu.m625r(-794246827210805L)) == true) goto L25;
        ArrayList r0 = f543e;
        if (r0 != null) goto L7;
    L9:
        Iterator r02 = r0.iterator();
    L11:
        if (r02.hasNext() == false) goto L35;
        ArrayList r1 = ((C0054BA) r02.next()).f126g;
        if (r1 == null) goto L17;
        if (r1.isEmpty() == true) goto L11;
    L17:
        Iterator r12 = r1.iterator();
    L19:
        if (r12.hasNext() == false) goto L11;
        if (AbstractC0585Nj.m1134a(((C0140DA) r12.next()).f364a, r3) == false) goto L19;
        return true;
    L35:
        return false;
    L7:
        if (r0.isEmpty() == false) goto L9;
        return false;
    L25:
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m380h() {
        if (f541c.length() > 0) goto L5;
        return false;
    L5:
        if ((System.currentTimeMillis() / ((long) 1000)) >= f542d) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static ArrayList m381i() {
        ArrayList r1 = new ArrayList();
        r1.add(m376d());
        StringBuilder r2 = new StringBuilder();
        Context r3 = MainApplication.f5549a;
        if (r3 != null) goto L9;
        r3 = C1456gf.f5172p;
        if (r3 != null) goto L9;
        r3 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L9:
        r2.append(r3.getFilesDir());
        r2.append(AbstractC0295Gu.m625r(-739314195494965L));
        File r0 = new File(r2.toString());
        if (r0.exists() == true) goto L12;
    L41:
        return r1;
    L12:
        if (r0.isDirectory() == false) goto L41;
        File[] r22 = r0.listFiles();
        if (r22 == null) goto L41;
        int r32 = r22.length;
        int r4 = 0;
    L16:
        if (r4 >= r32) goto L41;
        File r02 = r22[r4];
        if (r02.isDirectory() == false) goto L40;
        String r7 = r02.getName();
        File r5 = new File(r02, AbstractC0295Gu.m625r(-794255417145397L));
        File r6 = new File(r02, AbstractC0295Gu.m625r(-794298366818357L));
        File r8 = new File(r02, AbstractC0295Gu.m625r(-794354201393205L));
        if (r5.exists() == false) goto L40;
        if (r6.exists() == false) goto L40;
        if (r8.exists() == false) goto L40;
        String r03 = AbstractC2675wh.m5244g0(r6);     // Catch: Exception -> L35
        C0029Am r9 = AbstractC2809zm.f9524a;     // Catch: Exception -> L28
        r9.getClass();     // Catch: Exception -> L28
        Object r04 = r9.m4550a(ThemeConfig.Companion.serializer(), r03);     // Catch: Exception -> L28
    L31:
        ThemeConfig r05 = (ThemeConfig) r04;     // Catch: Exception -> L35
        if (r05 != null) goto L37;
        r05 = new ThemeConfig(null, null, null, null, false, false, 63, null);     // Catch: Exception -> L35
    L37:
        String r82 = r05.getName();     // Catch: Exception -> L35
        String r92 = r05.getAuthor();     // Catch: Exception -> L35
        String r10 = r05.getVersion();     // Catch: Exception -> L35
        String r11 = r05.getDescription();     // Catch: Exception -> L35
        String r12 = r8.getAbsolutePath();     // Catch: Exception -> L35
        AbstractC0295Gu.m625r(-794002014074933L);     // Catch: Exception -> L35
        String r13 = r6.getAbsolutePath();     // Catch: Exception -> L35
        AbstractC0295Gu.m625r(-794092208388149L);     // Catch: Exception -> L35
        String r14 = r5.getAbsolutePath();     // Catch: Exception -> L35
        AbstractC0295Gu.m625r(-794732158515253L);     // Catch: Exception -> L35
        r1.add(new C0097CA(r7, r82, r92, r10, r11, r12, r13, r14, r05.isFullBg(), r05.getAutoDarkTheme()));     // Catch: Exception -> L35
        goto L40
    L28:
        e = move-exception;
        AbstractC0295Gu.m625r(-793868870088757L);     // Catch: Exception -> L35
        AbstractC0425Jv.m881a(ThemeConfig.class).m445b();     // Catch: Exception -> L35
        AbstractC0295Gu.m625r(-793984834205749L);     // Catch: Exception -> L35
        e.getMessage();     // Catch: Exception -> L35
        r04 = null;
    L35:
        e = move-exception;
        AbstractC0295Gu.m625r(-794822352828469L);
        AbstractC0213Ey.m411i(-794882482370613L, -794934021978165L, e);
    L40:
        r4 = r4 + 1;
        goto L16
    }

    /* JADX INFO: renamed from: j */
    public static void m382j(String r21) {
        AbstractC0295Gu.m625r(-794946906880053L);
        C0029Am r0 = AbstractC2809zm.f9524a;     // Catch: Exception -> L5
        r0.getClass();     // Catch: Exception -> L5
        Object r02 = r0.m4550a(ApiResponse.Companion.serializer(CustomerData.Companion.serializer()), r21);     // Catch: Exception -> L5
    L8:
        ApiResponse r03 = (ApiResponse) r02;     // Catch: Exception -> L39
        if (r03 != null) goto L12;
        return;
    L12:
        if (r03.getCode() != 0) goto L47;
        CustomerData r04 = (CustomerData) r03.getData();     // Catch: Exception -> L39
        if (r04 == null) goto L48;
        String r1 = C1456gf.m2791I();     // Catch: Exception -> L39
        CustomerInfo r2 = r04.getCustomer();     // Catch: Exception -> L39
        if (r2 != null) goto L21;
        return;
    L21:
        if (AbstractC0585Nj.m1134a(r2.getId(), r1) == false) goto L50;
        boolean r22 = AbstractC0585Nj.m1134a(r2.getStatus(), AbstractC0295Gu.m625r(-794586129627189L));     // Catch: Exception -> L39
        SharedPreferences r7 = f544f;
        ArrayList r10 = f543e;
        if (r22 == true) goto L27;
        r10.clear();     // Catch: Exception -> L39
        String r05 = AbstractC0295Gu.m625r(-794620489365557L);     // Catch: Exception -> L39
        AbstractC0295Gu.m625r(-795573972105269L);     // Catch: Exception -> L39
        AbstractC0295Gu.m625r(-795586857007157L);     // Catch: Exception -> L39
        SharedPreferences.Editor r12 = r7.edit();     // Catch: Exception -> L39
        r12.putString(AbstractC0295Gu.m625r(-795621216745525L), r05);     // Catch: Exception -> L39
        r12.apply();     // Catch: Exception -> L39
        return;
    L27:
        f540b = r1;     // Catch: Exception -> L39
        r10.clear();     // Catch: Exception -> L39
        f541c = r04.getAccessToken();     // Catch: Exception -> L39
        f542d = r04.getExpires();     // Catch: Exception -> L39
        Iterator<T> r06 = r04.getAuthorizedThemes().iterator();     // Catch: Exception -> L39
    L29:
        if (r06.hasNext() == false) goto L36;
        AuthorizedThemeData r13 = (AuthorizedThemeData) r06.next();     // Catch: Exception -> L39
        List<ThemeVersionData> r23 = r13.getVersions();     // Catch: Exception -> L39
        ArrayList r11 = new ArrayList(AbstractC2539ta.m5019d0(r23, 10));     // Catch: Exception -> L39
        Iterator<T> r24 = r23.iterator();     // Catch: Exception -> L39
    L32:
        if (r24.hasNext() == false) goto L34;
        ThemeVersionData r122 = (ThemeVersionData) r24.next();     // Catch: Exception -> L39
        r11.add(new C0140DA(r122.getId(), r122.getVersionName(), r122.getFileName(), r122.getFileExt(), r122.getFileSize(), r122.getCreatedAt()));     // Catch: Exception -> L39
        goto L32
    L34:
        r10.add(new C0054BA(r13.getId(), r13.getName(), r13.getAuthor(), r13.getBaiduSkinDownloadUrl(), r13.getAuthType(), r13.getCreatedAt(), r11));     // Catch: Exception -> L39
        goto L29
    L36:
        if (m379g(m373a()) == true) goto L52;
        String r07 = AbstractC0295Gu.m625r(-794629079300149L);     // Catch: Exception -> L39
        AbstractC0295Gu.m625r(-795573972105269L);     // Catch: Exception -> L39
        AbstractC0295Gu.m625r(-795586857007157L);     // Catch: Exception -> L39
        SharedPreferences.Editor r14 = r7.edit();     // Catch: Exception -> L39
        r14.putString(AbstractC0295Gu.m625r(-795621216745525L), r07);     // Catch: Exception -> L39
        r14.apply();     // Catch: Exception -> L39
        return;
    L52:
        return;
    L50:
        return;
    L48:
        return;
    L47:
        return;
    L39:
        e = move-exception;
        e.printStackTrace();
        return;
    L5:
        e = move-exception;
        AbstractC0295Gu.m625r(-794452985641013L);     // Catch: Exception -> L39
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L39
        AbstractC0295Gu.m625r(-794568949758005L);     // Catch: Exception -> L39
        e.getMessage();     // Catch: Exception -> L39
        r02 = null;
        goto L8
    }

    /* JADX INFO: renamed from: k */
    public static void m383k(String r4) {
        AbstractC0295Gu.m625r(-795651281516597L);
        AbstractC0295Gu.m625r(-795664166418485L);
        SharedPreferences.Editor r0 = f544f.edit();
        r0.putString(AbstractC0295Gu.m625r(-795698526156853L), r4).putString(AbstractC0295Gu.m625r(-795741475829813L), r4);
        r0.apply();
    }
}
