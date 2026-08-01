// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʿ;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

public class CLS822 extends CLS367 {
    public Uri FLD1662;
    public Context FLD1663;

    public CLS822(CLS367 ʾʻ0, Context context0, Uri uri0) {
        super(ʾʻ0);
        this.FLD1663 = context0;
        this.FLD1662 = uri0;
    }

    @Override  // c.ﾞʿ.CLS367
    public CLS367 MTH5049(String s) {
        throw new UnsupportedOperationException();
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5052() {
        try {
            return DocumentsContract.deleteDocument(this.FLD1663.getContentResolver(), this.FLD1662);
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    @Override  // c.ﾞʿ.CLS367
    public String MTH5053() {
        return CLS370.MTH5081(this.FLD1663, this.FLD1662);
    }

    @Override  // c.ﾞʿ.CLS367
    public CLS367 MTH5054(String s, String s1) {
        throw new UnsupportedOperationException();
    }

    @Override  // c.ﾞʿ.CLS367
    public String MTH5055() {
        return CLS370.MTH5073(this.FLD1663, this.FLD1662);
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5056() {
        return CLS370.MTH5075(this.FLD1663, this.FLD1662);
    }

    @Override  // c.ﾞʿ.CLS367
    public Uri MTH5057() {
        return this.FLD1662;
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5058(String s) {
        throw new UnsupportedOperationException();
    }

    @Override  // c.ﾞʿ.CLS367
    public long MTH5059() {
        return CLS370.MTH5079(this.FLD1663, this.FLD1662);
    }

    @Override  // c.ﾞʿ.CLS367
    public CLS367[] MTH5060() {
        throw new UnsupportedOperationException();
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5061() {
        return CLS370.MTH5078(this.FLD1663, this.FLD1662);
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5064() {
        return CLS370.MTH5080(this.FLD1663, this.FLD1662);
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5065() {
        return CLS370.MTH5071(this.FLD1663, this.FLD1662);
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5067() {
        return CLS370.MTH5082(this.FLD1663, this.FLD1662);
    }
}

