package Yue;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥۢۢۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(21)
public class C7999 extends AbstractC4485 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Context f23788;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Uri f23789;

    public C7999(@InterfaceC6490 AbstractC4485 abstractC4485, Context context, Uri uri) {
        super(abstractC4485);
        this.f23788 = context;
        this.f23789 = uri;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static void m25218(@InterfaceC6490 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static Uri m25219(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ */
    public boolean mo1408() {
        return C4487.m1410(this.f23788, this.f23789);
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo1409() {
        return C4487.m1411(this.f23788, this.f23789);
    }

    @Override // Yue.AbstractC4485
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ */
    public AbstractC4485 mo13034(String str) {
        Uri uriM25219 = m25219(this.f23788, this.f23789, "vnd.android.document/directory", str);
        if (uriM25219 != null) {
            return new C7999(this, this.f23788, uriM25219);
        }
        return null;
    }

    @Override // Yue.AbstractC4485
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public AbstractC4485 mo13035(String str, String str2) {
        Uri uriM25219 = m25219(this.f23788, this.f23789, str, str2);
        if (uriM25219 != null) {
            return new C7999(this, this.f23788, uriM25219);
        }
        return null;
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo13036() {
        try {
            return DocumentsContract.deleteDocument(this.f23788.getContentResolver(), this.f23789);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo13037() {
        return C4487.m13057(this.f23788, this.f23789);
    }

    @Override // Yue.AbstractC4485
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public String mo13039() {
        return C4487.m13059(this.f23788, this.f23789);
    }

    @Override // Yue.AbstractC4485
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public String mo13041() {
        return C4487.m13061(this.f23788, this.f23789);
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public Uri mo13042() {
        return this.f23789;
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo13043() {
        return C4487.m13062(this.f23788, this.f23789);
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public boolean mo13044() {
        return C4487.m13063(this.f23788, this.f23789);
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public boolean mo13045() {
        return C4487.m13064(this.f23788, this.f23789);
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public long mo13046() {
        return C4487.m13065(this.f23788, this.f23789);
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public long mo13047() {
        return C4487.m13066(this.f23788, this.f23789);
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public AbstractC4485[] mo13048() {
        ContentResolver contentResolver = this.f23788.getContentResolver();
        Uri uri = this.f23789;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursorQuery.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f23789, cursorQuery.getString(0)));
                }
            } catch (Exception e) {
                Log.w("DocumentFile", "Failed query: " + e);
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            AbstractC4485[] abstractC4485Arr = new AbstractC4485[uriArr.length];
            for (int i = 0; i < uriArr.length; i++) {
                abstractC4485Arr[i] = new C7999(this, this.f23788, uriArr[i]);
            }
            return abstractC4485Arr;
        } finally {
            m25218(cursorQuery);
        }
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public boolean mo13049(String str) {
        try {
            Uri uriRenameDocument = DocumentsContract.renameDocument(this.f23788.getContentResolver(), this.f23789, str);
            if (uriRenameDocument != null) {
                this.f23789 = uriRenameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
