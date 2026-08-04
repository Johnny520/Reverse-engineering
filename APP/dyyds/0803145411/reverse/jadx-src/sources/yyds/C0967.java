package yyds;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛴᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0967 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0967 f4447;

    static {
        AbstractC2328.m4341(-683655287178094L);
        f4447 = new C0967();
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static OutputStream m2103(Context context, String str) throws IOException {
        AbstractC2328.m4341(-681288760197998L);
        AbstractC2328.m4341(-681323119936366L);
        C2654 c2654M2107 = m2107(str);
        if (c2654M2107 == null) {
            return null;
        }
        Uri uri = c2654M2107.f13054;
        List listM1306 = AbstractC0473.m1306(c2654M2107.f13056, new char[]{'/'});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1306) {
            if (!AbstractC0473.m1313((String) obj)) {
                arrayList.add(obj);
            }
        }
        String str2 = (String) AbstractC1595.m3261(arrayList);
        if (str2 == null) {
            C0188.m800(AbstractC2328.m4341(-682603020190574L));
            return null;
        }
        List<String> listM3277 = AbstractC1595.m3277(arrayList);
        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri));
        AbstractC2328.m4341(-683212905546606L);
        for (String str3 : listM3277) {
            String strM4341 = AbstractC2328.m4341(-682774818882414L);
            f4447.getClass();
            Uri uriM2104 = m2104(context, uri, uriBuildDocumentUriUsingTree, str3, strM4341);
            if (uriM2104 == null) {
                uriBuildDocumentUriUsingTree = DocumentsContract.createDocument(context.getContentResolver(), uriBuildDocumentUriUsingTree, AbstractC2328.m4341(-682907962868590L), str3);
                if (uriBuildDocumentUriUsingTree == null) {
                    C0188.m796(str3, AbstractC2328.m4341(-683041106854766L));
                    return null;
                }
            } else {
                uriBuildDocumentUriUsingTree = uriM2104;
            }
        }
        Uri uriM21042 = m2104(context, uri, uriBuildDocumentUriUsingTree, str2, null);
        if (uriM21042 == null) {
            String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str2);
            if (strGuessContentTypeFromName == null) {
                strGuessContentTypeFromName = AbstractC2328.m4341(-682628789994350L);
            }
            uriM21042 = DocumentsContract.createDocument(context.getContentResolver(), uriBuildDocumentUriUsingTree, strGuessContentTypeFromName, str2);
            if (uriM21042 == null) {
                C0188.m800(AbstractC2328.m4341(-682736164176750L).concat(str2));
                return null;
            }
        }
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriM21042, AbstractC2328.m4341(-681361774642030L));
        if (outputStreamOpenOutputStream != null) {
            return outputStreamOpenOutputStream;
        }
        C0188.m800(AbstractC2328.m4341(-681378954511214L));
        return null;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Uri m2104(Context context, Uri uri, Uri uri2, String str, String str2) throws IOException {
        Cursor cursorQuery = context.getContentResolver().query(DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri2)), new String[]{AbstractC2328.m4341(-683346049532782L), AbstractC2328.m4341(-683397589140334L), AbstractC2328.m4341(-683457718682478L)}, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            int columnIndex = cursorQuery.getColumnIndex(AbstractC2328.m4341(-683500668355438L));
            int columnIndex2 = cursorQuery.getColumnIndex(AbstractC2328.m4341(-683552207962990L));
            int columnIndex3 = cursorQuery.getColumnIndex(AbstractC2328.m4341(-683612337505134L));
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndex2);
                String string2 = cursorQuery.getString(columnIndex3);
                if (!AbstractC1544.m3188(string, str) || (str2 != null && !AbstractC1544.m3188(string2, str2))) {
                }
                Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, cursorQuery.getString(columnIndex));
                cursorQuery.close();
                return uriBuildDocumentUriUsingTree;
            }
            cursorQuery.close();
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1367.m2774(cursorQuery, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static Uri m2105(Context context, C2654 c2654) {
        Uri uri = c2654.f13054;
        List listM1306 = AbstractC0473.m1306(c2654.f13056, new char[]{'/'});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1306) {
            if (!AbstractC0473.m1313((String) obj)) {
                arrayList.add(obj);
            }
        }
        String str = (String) AbstractC1595.m3261(arrayList);
        if (str != null) {
            List listM3277 = AbstractC1595.m3277(arrayList);
            Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri));
            AbstractC2328.m4341(-683212905546606L);
            Iterator it = listM3277.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                String strM4341 = AbstractC2328.m4341(-683079761560430L);
                f4447.getClass();
                uriBuildDocumentUriUsingTree = m2104(context, uri, uriBuildDocumentUriUsingTree, str2, strM4341);
                if (uriBuildDocumentUriUsingTree == null) {
                    uriBuildDocumentUriUsingTree = null;
                    break;
                }
            }
            if (uriBuildDocumentUriUsingTree != null) {
                return m2104(context, uri, uriBuildDocumentUriUsingTree, str, null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static String m2106(Uri uri) {
        Object c2658;
        String strConcat;
        AbstractC2328.m4341(-682212178166638L);
        if (AbstractC1544.m3188(uri.getScheme(), AbstractC2328.m4341(-682229358035822L))) {
            String path = uri.getPath();
            if (path != null) {
                return m2109(path);
            }
        } else {
            try {
                c2658 = DocumentsContract.getTreeDocumentId(uri);
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
            if (c2658 instanceof C2658) {
                c2658 = null;
            }
            String str = (String) c2658;
            if (str != null) {
                if (str.startsWith(AbstractC2328.m4341(-682250832872302L))) {
                    return m2109(AbstractC0473.m1310(str, AbstractC2328.m4341(-682272307708782L)));
                }
                List listM1296 = AbstractC0473.m1296(str, new String[]{AbstractC2328.m4341(-682293782545262L)}, 2);
                String strM4341 = (String) AbstractC1595.m3281(listM1296);
                if (strM4341 == null) {
                    strM4341 = AbstractC2328.m4341(-682302372479854L);
                }
                String strM43412 = (String) AbstractC1595.m3276(1, listM1296);
                if (strM43412 == null) {
                    strM43412 = AbstractC2328.m4341(-682306667447150L);
                }
                String strM1298 = AbstractC0473.m1298(strM43412, '/');
                if (strM4341.equalsIgnoreCase(AbstractC2328.m4341(-682310962414446L))) {
                    strConcat = Environment.getExternalStorageDirectory().getAbsolutePath();
                } else if (strM4341.equalsIgnoreCase(AbstractC2328.m4341(-682345322152814L))) {
                    strConcat = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).getAbsolutePath();
                } else if (!AbstractC0473.m1313(strM4341)) {
                    strConcat = AbstractC2328.m4341(-682366796989294L).concat(strM4341);
                }
                if (!AbstractC0473.m1313(strM1298)) {
                    strConcat = strConcat + '/' + strM1298;
                }
                return m2109(strConcat);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static C2654 m2107(String str) {
        String strM2109;
        C1509.f7142.getClass();
        C0668 c0668 = C1509.f7300;
        InterfaceC1989[] interfaceC1989Arr = C1509.f7179;
        String str2 = (String) c0668.m1579(interfaceC1989Arr[108]);
        if (AbstractC0473.m1313(str2)) {
            str2 = null;
        }
        if (str2 != null) {
            String str3 = (String) C1509.f7241.m1579(interfaceC1989Arr[109]);
            if (AbstractC0473.m1313(str3)) {
                str3 = null;
            }
            if (str3 != null && (strM2109 = m2109(str3)) != null) {
                String strM21092 = m2109(str);
                if (strM21092.startsWith(strM2109.concat("/"))) {
                    String strM1298 = AbstractC0473.m1298(AbstractC0473.m1310(strM21092, strM2109.concat("/")), '/');
                    if (!AbstractC0473.m1313(strM1298)) {
                        Uri uri = Uri.parse(str2);
                        AbstractC2328.m4341(-682555775550318L);
                        return new C2654(uri, strM2109, strM1298);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static void m2108(String str, Uri uri) {
        AbstractC2328.m4341(-681108371571566L);
        AbstractC2328.m4341(-681142731309934L);
        C1509 c1509 = C1509.f7142;
        String string = uri.toString();
        AbstractC2328.m4341(-681189975950190L);
        c1509.getClass();
        AbstractC2328.m4341(-27083636638574L);
        C0668 c0668 = C1509.f7300;
        InterfaceC1989[] interfaceC1989Arr = C1509.f7179;
        c0668.m1581(interfaceC1989Arr[108], string);
        String strM2109 = m2109(str);
        AbstractC2328.m4341(-27117996376942L);
        C1509.f7241.m1581(interfaceC1989Arr[109], strM2109);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static String m2109(String str) {
        return AbstractC0473.m1299(AbstractC0473.m1314(str).toString().replace('\\', '/'), '/');
    }
}
