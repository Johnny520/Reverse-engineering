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
    public static final C0183EA f539a;

    /* JADX INFO: renamed from: b */
    public static String f540b;

    /* JADX INFO: renamed from: c */
    public static String f541c;

    /* JADX INFO: renamed from: d */
    public static long f542d;

    /* JADX INFO: renamed from: e */
    public static final ArrayList f543e;

    /* JADX INFO: renamed from: f */
    public static final SharedPreferences f544f;

    static {
        AbstractC0295Gu.m625r(-794637669234741L);
        AbstractC0295Gu.m625r(-793048531335221L);
        AbstractC0295Gu.m625r(-793091481008181L);
        AbstractC0295Gu.m625r(-793121545779253L);
        f539a = new C0183EA();
        f540b = AbstractC0295Gu.m625r(-793130135713845L);
        f541c = AbstractC0295Gu.m625r(-793134430681141L);
        f543e = new ArrayList();
        Context contextCurrentApplication = MainApplication.f5549a;
        if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
            contextCurrentApplication = AndroidAppHelper.currentApplication();
            AbstractC0295Gu.m625r(-836852902787125L);
        }
        f544f = contextCurrentApplication.getSharedPreferences(AbstractC0295Gu.m625r(-793138725648437L), 0);
    }

    /* JADX INFO: renamed from: a */
    public static String m373a() {
        String string = f544f.getString(AbstractC0295Gu.m625r(-796016353736757L), AbstractC0295Gu.m625r(-795509547595829L));
        return string == null ? AbstractC0295Gu.m625r(-795518137530421L) : string;
    }

    /* JADX INFO: renamed from: b */
    public static C0097CA m374b() {
        Object next;
        String strM373a = m373a();
        if (strM373a.equals(AbstractC0295Gu.m625r(-794225352374325L))) {
            return m376d();
        }
        Iterator it = m381i().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC0585Nj.m1134a(((C0097CA) next).f223a, strM373a)) {
                break;
            }
        }
        C0097CA c0097ca = (C0097CA) next;
        return c0097ca == null ? m376d() : c0097ca;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m375c() {
        Bitmap bitmapDecodeByteArray;
        String strM625r = AbstractC0295Gu.m625r(-738996367915061L);
        AbstractC0295Gu.m625r(-779686888077365L);
        try {
            byte[] bArrDecode = Base64.decode(strM625r, 0);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            bitmapDecodeByteArray = null;
        }
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new IllegalArgumentException(AbstractC0295Gu.m625r(-795969109096501L));
    }

    /* JADX INFO: renamed from: d */
    public static C0097CA m376d() {
        return new C0097CA(AbstractC0295Gu.m625r(-795771540600885L), AbstractC0295Gu.m625r(-794130863093813L), AbstractC0295Gu.m625r(-794152337930293L), AbstractC0295Gu.m625r(-794165222832181L), AbstractC0295Gu.m625r(-794182402701365L), AbstractC0295Gu.m625r(-794212467472437L), AbstractC0295Gu.m625r(-794216762439733L), AbstractC0295Gu.m625r(-794221057407029L), false, true);
    }

    /* JADX INFO: renamed from: e */
    public static String m377e(String str) {
        AbstractC0295Gu.m625r(-739352850200629L);
        StringBuilder sb = new StringBuilder();
        Context contextCurrentApplication = MainApplication.f5549a;
        if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
            contextCurrentApplication = AndroidAppHelper.currentApplication();
            AbstractC0295Gu.m625r(-836852902787125L);
        }
        sb.append(contextCurrentApplication.getFilesDir());
        sb.append(AbstractC0295Gu.m625r(-739387209938997L));
        sb.append(str);
        sb.append('/');
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m378f(String str) {
        AbstractC0295Gu.m625r(-738876108830773L);
        StringBuilder sb = new StringBuilder();
        Context contextCurrentApplication = MainApplication.f5549a;
        if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
            contextCurrentApplication = AndroidAppHelper.currentApplication();
            AbstractC0295Gu.m625r(-836852902787125L);
        }
        sb.append(contextCurrentApplication.getFilesDir());
        sb.append(AbstractC0295Gu.m625r(-738910468569141L));
        sb.append(str);
        sb.append(AbstractC0295Gu.m625r(-738949123274805L));
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m379g(String str) {
        AbstractC0295Gu.m625r(-794233942308917L);
        if (str.equals(AbstractC0295Gu.m625r(-794246827210805L))) {
            return true;
        }
        ArrayList arrayList = f543e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = ((C0054BA) it.next()).f126g;
            if (arrayList2 == null || !arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (AbstractC0585Nj.m1134a(((C0140DA) it2.next()).f364a, str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m380h() {
        return f541c.length() > 0 && System.currentTimeMillis() / ((long) 1000) < f542d;
    }

    /* JADX INFO: renamed from: i */
    public static ArrayList m381i() {
        File[] fileArrListFiles;
        Object objM4550a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m376d());
        StringBuilder sb = new StringBuilder();
        Context contextCurrentApplication = MainApplication.f5549a;
        if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
            contextCurrentApplication = AndroidAppHelper.currentApplication();
            AbstractC0295Gu.m625r(-836852902787125L);
        }
        sb.append(contextCurrentApplication.getFilesDir());
        sb.append(AbstractC0295Gu.m625r(-739314195494965L));
        File file = new File(sb.toString());
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    String name = file2.getName();
                    File file3 = new File(file2, AbstractC0295Gu.m625r(-794255417145397L));
                    File file4 = new File(file2, AbstractC0295Gu.m625r(-794298366818357L));
                    File file5 = new File(file2, AbstractC0295Gu.m625r(-794354201393205L));
                    if (file3.exists() && file4.exists() && file5.exists()) {
                        try {
                            String strM5244g0 = AbstractC2675wh.m5244g0(file4);
                            try {
                                C0029Am c0029Am = AbstractC2809zm.f9524a;
                                c0029Am.getClass();
                                objM4550a = c0029Am.m4550a(ThemeConfig.Companion.serializer(), strM5244g0);
                            } catch (Exception e) {
                                AbstractC0295Gu.m625r(-793868870088757L);
                                AbstractC0425Jv.m881a(ThemeConfig.class).m445b();
                                AbstractC0295Gu.m625r(-793984834205749L);
                                e.getMessage();
                                objM4550a = null;
                            }
                            ThemeConfig themeConfig = (ThemeConfig) objM4550a;
                            if (themeConfig == null) {
                                themeConfig = new ThemeConfig((String) null, (String) null, (String) null, (String) null, false, false, 63, (AbstractC0621Oc) null);
                            }
                            String name2 = themeConfig.getName();
                            String author = themeConfig.getAuthor();
                            String version = themeConfig.getVersion();
                            String description = themeConfig.getDescription();
                            String absolutePath = file5.getAbsolutePath();
                            AbstractC0295Gu.m625r(-794002014074933L);
                            String absolutePath2 = file4.getAbsolutePath();
                            AbstractC0295Gu.m625r(-794092208388149L);
                            String absolutePath3 = file3.getAbsolutePath();
                            AbstractC0295Gu.m625r(-794732158515253L);
                            arrayList.add(new C0097CA(name, name2, author, version, description, absolutePath, absolutePath2, absolutePath3, themeConfig.isFullBg(), themeConfig.getAutoDarkTheme()));
                        } catch (Exception e2) {
                            AbstractC0295Gu.m625r(-794822352828469L);
                            AbstractC0213Ey.m411i(-794882482370613L, -794934021978165L, e2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static void m382j(String str) {
        Object objM4550a;
        CustomerData customerData;
        AbstractC0295Gu.m625r(-794946906880053L);
        try {
            try {
                C0029Am c0029Am = AbstractC2809zm.f9524a;
                c0029Am.getClass();
                objM4550a = c0029Am.m4550a(ApiResponse.Companion.serializer(CustomerData.Companion.serializer()), str);
            } catch (Exception e) {
                AbstractC0295Gu.m625r(-794452985641013L);
                AbstractC0425Jv.m881a(ApiResponse.class).m445b();
                AbstractC0295Gu.m625r(-794568949758005L);
                e.getMessage();
                objM4550a = null;
            }
            ApiResponse apiResponse = (ApiResponse) objM4550a;
            if (apiResponse != null && apiResponse.getCode() == 0 && (customerData = (CustomerData) apiResponse.getData()) != null) {
                String strM2791I = C1456gf.m2791I();
                CustomerInfo customer = customerData.getCustomer();
                if (customer != null && AbstractC0585Nj.m1134a(customer.getId(), strM2791I)) {
                    boolean zM1134a = AbstractC0585Nj.m1134a(customer.getStatus(), AbstractC0295Gu.m625r(-794586129627189L));
                    SharedPreferences sharedPreferences = f544f;
                    ArrayList arrayList = f543e;
                    if (!zM1134a) {
                        arrayList.clear();
                        String strM625r = AbstractC0295Gu.m625r(-794620489365557L);
                        AbstractC0295Gu.m625r(-795573972105269L);
                        AbstractC0295Gu.m625r(-795586857007157L);
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(AbstractC0295Gu.m625r(-795621216745525L), strM625r);
                        editorEdit.apply();
                        return;
                    }
                    f540b = strM2791I;
                    arrayList.clear();
                    f541c = customerData.getAccessToken();
                    f542d = customerData.getExpires();
                    for (AuthorizedThemeData authorizedThemeData : customerData.getAuthorizedThemes()) {
                        List<ThemeVersionData> versions = authorizedThemeData.getVersions();
                        ArrayList arrayList2 = new ArrayList(AbstractC2539ta.m5019d0(versions, 10));
                        for (ThemeVersionData themeVersionData : versions) {
                            arrayList2.add(new C0140DA(themeVersionData.getId(), themeVersionData.getVersionName(), themeVersionData.getFileName(), themeVersionData.getFileExt(), themeVersionData.getFileSize(), themeVersionData.getCreatedAt()));
                        }
                        arrayList.add(new C0054BA(authorizedThemeData.getId(), authorizedThemeData.getName(), authorizedThemeData.getAuthor(), authorizedThemeData.getBaiduSkinDownloadUrl(), authorizedThemeData.getAuthType(), authorizedThemeData.getCreatedAt(), arrayList2));
                    }
                    if (m379g(m373a())) {
                        return;
                    }
                    String strM625r2 = AbstractC0295Gu.m625r(-794629079300149L);
                    AbstractC0295Gu.m625r(-795573972105269L);
                    AbstractC0295Gu.m625r(-795586857007157L);
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    editorEdit2.putString(AbstractC0295Gu.m625r(-795621216745525L), strM625r2);
                    editorEdit2.apply();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m383k(String str) {
        AbstractC0295Gu.m625r(-795651281516597L);
        AbstractC0295Gu.m625r(-795664166418485L);
        SharedPreferences.Editor editorEdit = f544f.edit();
        editorEdit.putString(AbstractC0295Gu.m625r(-795698526156853L), str).putString(AbstractC0295Gu.m625r(-795741475829813L), str);
        editorEdit.apply();
    }
}
