package Yue;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.File;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4485 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f918 = "DocumentFile";

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6490
    public final AbstractC4485 f919;

    public AbstractC4485(@InterfaceC6490 AbstractC4485 abstractC4485) {
        this.f919 = abstractC4485;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static AbstractC4485 m13030(@InterfaceC6391 File file) {
        return new C7008(null, file);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static AbstractC4485 m13031(@InterfaceC6391 Context context, @InterfaceC6391 Uri uri) {
        return new C7471(null, context, uri);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static AbstractC4485 m13032(@InterfaceC6391 Context context, @InterfaceC6391 Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(context, uri)) {
            treeDocumentId = DocumentsContract.getDocumentId(uri);
        }
        return new C7999(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m13033(@InterfaceC6391 Context context, @InterfaceC6490 Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract boolean mo1408();

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract boolean mo1409();

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract AbstractC4485 mo13034(@InterfaceC6391 String str);

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract AbstractC4485 mo13035(@InterfaceC6391 String str, @InterfaceC6391 String str2);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public abstract boolean mo13036();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public abstract boolean mo13037();

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public AbstractC4485 m13038(@InterfaceC6391 String str) {
        for (AbstractC4485 abstractC4485 : mo13048()) {
            if (str.equals(abstractC4485.mo13039())) {
                return abstractC4485;
            }
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public abstract String mo13039();

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public AbstractC4485 m13040() {
        return this.f919;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public abstract String mo13041();

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public abstract Uri mo13042();

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public abstract boolean mo13043();

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public abstract boolean mo13044();

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public abstract boolean mo13045();

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public abstract long mo13046();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public abstract long mo13047();

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public abstract AbstractC4485[] mo13048();

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public abstract boolean mo13049(@InterfaceC6391 String str);
}
