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
        C0341oa.m915(new byte[]{-66, 122, -98, -128, 72, -113, -87}, new byte[]{-35, 21, -16, -12, 45, -9});
        if (!(C0406ta.m1245(str))) {
            try {
                char c2 = '@';
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                if (packageInfo != null) {
                    int i2 = 11;
                    if (Build.VERSION.SDK_INT >= 28) {
                        Object obj = packageInfo.getClass().getDeclaredField(C0341oa.m915(new byte[]{89, 127, -113, -48, -95, 64, 77, 95, -122, -40, -89}, new byte[]{42, 22, -24, -66, -56, 46})).get(packageInfo);
                        if (obj == null) {
                            objInvoke = packageInfo.getClass().getDeclaredField(C0341oa.m915(new byte[]{3, -52, -128, -61, -81, -103, 5, -41, -126, -34}, new byte[]{112, -91, -25, -83, -50, -19})).get(packageInfo);
                            objArr = objInvoke instanceof Object[] ? (Object[]) objInvoke : null;
                        } else {
                            objInvoke = obj.getClass().getDeclaredMethod(C0341oa.m915(new byte[]{51, 89, 125, 53, 28, -92, 23, 83, 103, 0, 9, -95, 32, 79, 90, 29, 11, -95, 49, 78, 122}, new byte[]{84, 60, 9, 116, 108, -49}), new Class[0]).invoke(obj, new Object[0]);
                            if (objInvoke instanceof Object[]) {
                            }
                        }
                    } else {
                        objInvoke = packageInfo.getClass().getDeclaredField(C0341oa.m915(new byte[]{45, 77, -49, 113, -113, 79, 43, 86, -51, 108}, new byte[]{94, 36, -88, 31, -18, 59})).get(packageInfo);
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
                                    byte[] bArr = new byte[i2];
                                    bArr[0] = -60;
                                    bArr[1] = 79;
                                    bArr[2] = i2;
                                    bArr[3] = -27;
                                    bArr[4] = 91;
                                    bArr[5] = -90;
                                    bArr[6] = -15;
                                    bArr[7] = 82;
                                    bArr[8] = 59;
                                    bArr[9] = -3;
                                    bArr[10] = 86;
                                    Object objInvoke2 = cls.getDeclaredMethod(C0341oa.m915(bArr, new byte[]{-80, 32, 73, -100, 47, -61}), new Class[0]).invoke(obj2, new Object[0]);
                                    i = 11;
                                    c = '@';
                                    C0237h4.m1088(C0341oa.m915(new byte[]{70, 110, 12, -98, -59, -1, 73, 117, 14, -99, -111, -68, 74, 126, 64, -111, -124, -17, 92, 59, 20, -99, -59, -14, 71, 117, 77, -100, -112, -16, 68, 59, 20, -117, -107, -7, 8, 112, 15, -122, -119, -11, 70, 53, 34, -117, -111, -7, 105, 105, 18, -109, -100}, new byte[]{40, 27, 96, -14, -27, -100}), objInvoke2);
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
        C0341oa.m915(new byte[]{127, 105, -127}, new byte[]{30, 25, -15, -16, -67, -15});
        C0341oa.m915(new byte[]{-113, 91, -32, -20, -64, 82, -102, 116, -30, -22, -60}, new byte[]{-1, 58, -125, -121, -95, 53});
        String strM839 = m839(application, str);
        if (C0406ta.m1245(strM839)) {
            C0341oa.m915(new byte[]{-66, 76, 114}, new byte[]{-33, 60, 2, 102, 127, 2});
            C0341oa.m915(new byte[]{31, -126, 22, -51, 63, 44}, new byte[]{126, -9, 98, -91, 80, 94});
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
        C0341oa.m915(new byte[]{-40, 15, -25, 64, 2, -12, -5, 7, -29, 69, 33, -22, -50}, new byte[]{-85, 102, -128, 46, 64, -115});
        if (!(AbstractC0306m3.a.m896().length() > 0)) {
            return strM839;
        }
        byte b = -12;
        byte b2 = -61;
        try {
            try {
                C0316n c0316nM1155 = C0316n.m1155(new File(AbstractC0306m3.a.m896()));
                C0341oa.m915(new byte[]{-120, -68, 54, -12, -128, 79, -61, -32, 125, -69, -35}, new byte[]{-21, -50, 83, -107, -12, 42});
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
            C0237h4.m1089(C0341oa.m915(new byte[]{-89, 114, 26, -1, -92, 17, -106, 37, 61, -41, -70, 29, -91, 101, 29, -106, -6, 84, -18, 62}, new byte[]{-64, 23, 110, -66, -44, 122}), apkV2Singers);
            Iterator it = apkV2Singers.iterator();
            while (it.hasNext()) {
                List<CertificateMeta> certificateMetas = ((ApkV2Signer) it.next()).getCertificateMetas();
                C0237h4.m1089(C0341oa.m915(new byte[]{24, 52, b2, -5, -33, b, 11, 56, -47, -47, -39, -25, 11, 52, -6, -35, -50, -25, 12, 121, -103, -106, -108, -81}, new byte[]{127, 81, -73, -72, -70, -122}), certificateMetas);
                for (CertificateMeta certificateMeta : certificateMetas) {
                    String certMd52 = certificateMeta.getCertMd5();
                    C0237h4.m1089(C0341oa.m915(new byte[]{2, 55, 30, -45, 23, 112, 17, 31, 14, -91, 90, 44, 75, 124, 67}, new byte[]{101, 82, 106, -112, 114, 2}), certMd52);
                    if (certMd52.length() > 0) {
                        certMd5 = certificateMeta.getCertMd5();
                        C0237h4.m1089(C0341oa.m915(new byte[]{79, -86, 62, -14, -52, 113, 92, -126, 46, -124, -127, 45, 6, -31, 99}, new byte[]{40, -49, 74, -79, -87, 3}), certMd5);
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
