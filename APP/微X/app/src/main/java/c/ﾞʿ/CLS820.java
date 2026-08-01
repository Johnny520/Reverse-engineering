// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʿ;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

public class CLS820 extends CLS367 {
    public Uri FLD1659;
    public Context FLD1660;

    public CLS820(CLS367 ʾʻ0, Context context0, Uri uri0) {
        super(ʾʻ0);
        this.FLD1660 = context0;
        this.FLD1659 = uri0;
    }

    @Override  // c.ﾞʿ.CLS367
    public CLS367 MTH5049(String s) {
        Uri uri0 = CLS820.MTH5091(this.FLD1660, this.FLD1659, "vnd.android.document/directory", s);
        return uri0 != null ? new CLS820(((CLS367)this), this.FLD1660, uri0) : null;
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5052() {
        try {
            return DocumentsContract.deleteDocument(this.FLD1660.getContentResolver(), this.FLD1659);
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    @Override  // c.ﾞʿ.CLS367
    public String MTH5053() {
        return CLS370.MTH5081(this.FLD1660, this.FLD1659);
    }

    @Override  // c.ﾞʿ.CLS367
    public CLS367 MTH5054(String s, String s1) {
        Uri uri0 = CLS820.MTH5091(this.FLD1660, this.FLD1659, s, s1);
        return uri0 != null ? new CLS820(((CLS367)this), this.FLD1660, uri0) : null;
    }

    @Override  // c.ﾞʿ.CLS367
    public String MTH5055() {
        return CLS370.MTH5073(this.FLD1660, this.FLD1659);
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5056() {
        return CLS370.MTH5075(this.FLD1660, this.FLD1659);
    }

    @Override  // c.ﾞʿ.CLS367
    public Uri MTH5057() {
        return this.FLD1659;
    }

    public static Uri MTH5091(Context context0, Uri uri0, String s, String s1) {
        try {
            return DocumentsContract.createDocument(context0.getContentResolver(), uri0, s, s1);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5058(String s) {
        try {
            Uri uri0 = DocumentsContract.renameDocument(this.FLD1660.getContentResolver(), this.FLD1659, s);
            if(uri0 != null) {
                this.FLD1659 = uri0;
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    public static void MTH5093(AutoCloseable autoCloseable0) {
        if(autoCloseable0 != null) {
            try {
                autoCloseable0.close();
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
            catch(Exception unused_ex) {
                return;
            }
            throw runtimeException0;
        }
    }

    @Override  // c.ﾞʿ.CLS367
    public long MTH5059() {
        return CLS370.MTH5079(this.FLD1660, this.FLD1659);
    }

    @Override  // c.ﾞʿ.CLS367
    public CLS367[] MTH5060() {
        ContentResolver contentResolver0 = this.FLD1660.getContentResolver();
        Uri uri0 = DocumentsContract.buildChildDocumentsUriUsingTree(this.FLD1659, DocumentsContract.getDocumentId(this.FLD1659));
        ArrayList arrayList0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            cursor0 = contentResolver0.query(uri0, new String[]{"document_id"}, null, null, null);
            while(cursor0.moveToNext()) {
                String s = cursor0.getString(0);
                arrayList0.add(DocumentsContract.buildDocumentUriUsingTree(this.FLD1659, s));
            }
        }
        catch(Exception exception0) {
            Log.w("DocumentFile", "Failed query: " + exception0);
        }
        finally {
            CLS820.MTH5093(cursor0);
        }
        Uri[] arr_uri = (Uri[])arrayList0.toArray(new Uri[arrayList0.size()]);
        CLS367[] arr_ʾʻ = new CLS367[arr_uri.length];
        for(int v = 0; v < arr_uri.length; ++v) {
            arr_ʾʻ[v] = new CLS820(((CLS367)this), this.FLD1660, arr_uri[v]);
        }
        return arr_ʾʻ;
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5061() {
        return CLS370.MTH5078(this.FLD1660, this.FLD1659);
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5064() {
        return CLS370.MTH5080(this.FLD1660, this.FLD1659);
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5065() {
        return CLS370.MTH5071(this.FLD1660, this.FLD1659);
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5067() {
        return CLS370.MTH5082(this.FLD1660, this.FLD1659);
    }
}

