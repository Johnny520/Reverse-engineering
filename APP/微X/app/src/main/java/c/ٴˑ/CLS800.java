// Decompiled by JEB v5.42.0.202606242140

package c.ٴˑ;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

public class CLS800 extends CLS299 {
    public Context FLD1352;
    public Uri FLD1353;

    public CLS800(CLS299 ـᵎ0, Context context0, Uri uri0) {
        super(ـᵎ0);
        this.FLD1352 = context0;
        this.FLD1353 = uri0;
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4373() {
        return CLS294.MTH4338(this.FLD1352, this.FLD1353);
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4375() {
        try {
            return DocumentsContract.deleteDocument(this.FLD1352.getContentResolver(), this.FLD1353);
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4376() {
        return CLS294.MTH4348(this.FLD1352, this.FLD1353);
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4377() {
        return CLS294.MTH4341(this.FLD1352, this.FLD1353);
    }

    @Override  // c.ٴˑ.CLS299
    public String MTH4378() {
        return CLS294.MTH4340(this.FLD1352, this.FLD1353);
    }

    public static Uri MTH4361(Context context0, Uri uri0, String s, String s1) {
        try {
            return DocumentsContract.createDocument(context0.getContentResolver(), uri0, s, s1);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override  // c.ٴˑ.CLS299
    public Uri MTH4379() {
        return this.FLD1353;
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4381() {
        return CLS294.MTH4343(this.FLD1352, this.FLD1353);
    }

    @Override  // c.ٴˑ.CLS299
    public long MTH4382() {
        return CLS294.MTH4344(this.FLD1352, this.FLD1353);
    }

    @Override  // c.ٴˑ.CLS299
    public String MTH4384() {
        return CLS294.MTH4347(this.FLD1352, this.FLD1353);
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4385(String s) {
        try {
            Uri uri0 = DocumentsContract.renameDocument(this.FLD1352.getContentResolver(), this.FLD1353, s);
            if(uri0 != null) {
                this.FLD1353 = uri0;
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    public static void MTH4367(AutoCloseable autoCloseable0) {
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

    @Override  // c.ٴˑ.CLS299
    public CLS299 MTH4386(String s) {
        Uri uri0 = CLS800.MTH4361(this.FLD1352, this.FLD1353, "vnd.android.document/directory", s);
        return uri0 != null ? new CLS800(((CLS299)this), this.FLD1352, uri0) : null;
    }

    @Override  // c.ٴˑ.CLS299
    public CLS299[] MTH4387() {
        ContentResolver contentResolver0 = this.FLD1352.getContentResolver();
        Uri uri0 = DocumentsContract.buildChildDocumentsUriUsingTree(this.FLD1353, DocumentsContract.getDocumentId(this.FLD1353));
        ArrayList arrayList0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            cursor0 = contentResolver0.query(uri0, new String[]{"document_id"}, null, null, null);
            while(cursor0.moveToNext()) {
                String s = cursor0.getString(0);
                arrayList0.add(DocumentsContract.buildDocumentUriUsingTree(this.FLD1353, s));
            }
        }
        catch(Exception exception0) {
            Log.w("DocumentFile", "Failed query: " + exception0);
        }
        finally {
            CLS800.MTH4367(cursor0);
        }
        Uri[] arr_uri = (Uri[])arrayList0.toArray(new Uri[arrayList0.size()]);
        CLS299[] arr_ـᵎ = new CLS299[arr_uri.length];
        for(int v = 0; v < arr_uri.length; ++v) {
            arr_ـᵎ[v] = new CLS800(((CLS299)this), this.FLD1352, arr_uri[v]);
        }
        return arr_ـᵎ;
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4390() {
        return CLS294.MTH4350(this.FLD1352, this.FLD1353);
    }

    @Override  // c.ٴˑ.CLS299
    public CLS299 MTH4391(String s, String s1) {
        Uri uri0 = CLS800.MTH4361(this.FLD1352, this.FLD1353, s, s1);
        return uri0 != null ? new CLS800(((CLS299)this), this.FLD1352, uri0) : null;
    }
}

