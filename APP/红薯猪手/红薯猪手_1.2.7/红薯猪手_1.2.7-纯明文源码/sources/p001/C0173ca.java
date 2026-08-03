package p001;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import net.dongliu.apk.parser.ApkFile;
import net.dongliu.apk.parser.bean.ApkV2Signer;
import net.dongliu.apk.parser.bean.CertificateMeta;
import p001.AbstractC0306m3;

/* JADX INFO: renamed from: ۟.ca */
/* JADX INFO: loaded from: classes.dex */
public final class C0173ca {
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x036d */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX INFO: renamed from: ۥ */
    public static String m839(Context context, String str) {
        Object objInvoke;
        Object[] objArr;
        char c;
        int i;
        "context";
        if (!(C0406ta.m1245(str))) {
            try {
                char c2 = '@';
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                if (packageInfo != null) {
                    int i2 = 11;
                    if (Build.VERSION.SDK_INT >= 28) {
                        Object obj = packageInfo.getClass().getDeclaredField("signingInfo").get(packageInfo);
                        if (obj == null) {
                            objInvoke = packageInfo.getClass().getDeclaredField("signatures").get(packageInfo);
                            objArr = objInvoke instanceof Object[] ? (Object[]) objInvoke : null;
                        } else {
                            objInvoke = obj.getClass().getDeclaredMethod("getApkContentsSigners", new Class[0]).invoke(obj, new Object[0]);
                            if (objInvoke instanceof Object[]) {
                            }
                        }
                    } else {
                        objInvoke = packageInfo.getClass().getDeclaredField("signatures").get(packageInfo);
                        if (objInvoke instanceof Object[]) {
                        }
                    }
                    if (objArr != null) {
                        if (!(objArr.length == 0)) {
                            int length = objArr.length;
                            int i3 = 0;
                            while (i3 < length) {
                                Object obj2 = objArr[i3];
                                if (obj2 != null) {
                                    Class<?> cls = obj2.getClass();
                                    Object objInvoke2 = cls.getDeclaredMethod("toByteArray", new Class[0]).invoke(obj2, new Object[0]);
                                    i = 11;
                                    c = '@';
                                    C0237h4.m1088("null cannot be cast to non-null type kotlin.ByteArray", objInvoke2);
                                    String strM1104 = C0272jb.m1104((byte[]) objInvoke2);
                                    C0237h4.m865(strM1104);
                                    if (!C0406ta.m1245(strM1104)) {
                                        return strM1104;
                                    }
                                } else {
                                    c = c2;
                                    i = i2;
                                }
                                i3++;
                                c2 = c;
                                i2 = i;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ */
    public static String m840(Application application, String str) {
        String certMd5;
        Cursor cursorQuery;
        "app";
        "packageName";
        String strM839 = m839(application, str);
        if (C0406ta.m1245(strM839)) {
            "app";
            "author";
            try {
                cursorQuery = application.getContentResolver().query(Uri.parse("content://" + str + "/s"), null, null, null, null, null);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message != null) {
                    C0224g5.m856(message);
                }
            }
            if (cursorQuery != null) {
                cursorQuery.moveToFirst();
                String string = cursorQuery.getString(0);
                if (string == null) {
                    string = "";
                }
                cursorQuery.close();
                strM839 = string;
            } else {
                strM839 = "";
            }
        }
        "signByPackage";
        if (!(AbstractC0306m3.a.m896().length() > 0)) {
            return strM839;
        }
        byte b = -12;
        byte b2 = -61;
        try {
            try {
                C0316n c0316nM1155 = C0316n.m1155(new File(AbstractC0306m3.a.m896()));
                "create(...)";
                if (c0316nM1155.m1157() != 2) {
                    return strM839;
                }
                certMd5 = c0316nM1155.m1156().f1466;
                C0237h4.m865(certMd5);
                if (!(certMd5.length() > 0)) {
                    return strM839;
                }
            } catch (Exception unused) {
                return strM839;
            }
        } catch (Exception unused2) {
            List apkV2Singers = new ApkFile(new File(AbstractC0306m3.a.m896())).getApkV2Singers();
            C0237h4.m1089("getApkV2Singers(...)", apkV2Singers);
            Iterator it = apkV2Singers.iterator();
            while (it.hasNext()) {
                List<CertificateMeta> certificateMetas = ((ApkV2Signer) it.next()).getCertificateMetas();
                C0237h4.m1089("ge�Ce�G�fa]�K�jv]�\u0006�!,\u0015", certificateMetas);
                for (CertificateMeta certificateMeta : certificateMetas) {
                    String certMd52 = certificateMeta.getCertMd5();
                    C0237h4.m1089("getCertMd5(...)", certMd52);
                    if (certMd52.length() > 0) {
                        certMd5 = certificateMeta.getCertMd5();
                        C0237h4.m1089("getCertMd5(...)", certMd5);
                    } else {
                        b = -12;
                        b2 = -61;
                    }
                }
            }
            return strM839;
        }
        return certMd5;
    }
}
