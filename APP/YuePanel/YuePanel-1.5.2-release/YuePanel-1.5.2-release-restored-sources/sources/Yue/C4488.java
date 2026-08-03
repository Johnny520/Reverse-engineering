package Yue;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4488 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f922 = "tree";

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۨ$ۥ */
    public static final class C0416 {

        /* JADX INFO: renamed from: ۥ */
        public static final int f923 = 512;
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۨ$ۥ۟ */
    @InterfaceC7113(21)
    public static class C0417 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Uri m1414(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Uri m1415(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Uri m13080(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static Uri m13081(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static Uri m13082(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static String m13083(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static Uri m13084(@InterfaceC6391 ContentResolver contentResolver, @InterfaceC6391 Uri uri, @InterfaceC6391 String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۨ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(24)
    public static class C4489 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m1416(@InterfaceC6391 Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m1417(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static Uri m1412(@InterfaceC6391 String str, @InterfaceC6490 String str2) {
        return C0417.m1414(str, str2);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static Uri m1413(@InterfaceC6391 Uri uri, @InterfaceC6391 String str) {
        return C0417.m1415(uri, str);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Uri m13070(@InterfaceC6391 String str, @InterfaceC6391 String str2) {
        return DocumentsContract.buildDocumentUri(str, str2);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Uri m13071(@InterfaceC6391 Uri uri, @InterfaceC6391 String str) {
        return C0417.m13080(uri, str);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Uri m13072(@InterfaceC6391 String str, @InterfaceC6391 String str2) {
        return C0417.m13081(str, str2);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Uri m13073(@InterfaceC6391 ContentResolver contentResolver, @InterfaceC6391 Uri uri, @InterfaceC6391 String str, @InterfaceC6391 String str2) throws FileNotFoundException {
        return C0417.m13082(contentResolver, uri, str, str2);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static String m13074(@InterfaceC6391 Uri uri) {
        return DocumentsContract.getDocumentId(uri);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static String m13075(@InterfaceC6391 Uri uri) {
        return C0417.m13083(uri);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m13076(@InterfaceC6391 Context context, @InterfaceC6490 Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m13077(@InterfaceC6391 Uri uri) {
        return C4489.m1416(uri);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m13078(@InterfaceC6391 ContentResolver contentResolver, @InterfaceC6391 Uri uri, @InterfaceC6391 Uri uri2) throws FileNotFoundException {
        return C4489.m1417(contentResolver, uri, uri2);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static Uri m13079(@InterfaceC6391 ContentResolver contentResolver, @InterfaceC6391 Uri uri, @InterfaceC6391 String str) throws FileNotFoundException {
        return C0417.m13084(contentResolver, uri, str);
    }
}
