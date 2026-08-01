// Decompiled by JEB v5.42.0.202606242140

package c.ٴˑ;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

public class CLS801 extends CLS299 {
    public Context FLD1355;
    public Uri FLD1356;

    public CLS801(CLS299 ـᵎ0, Context context0, Uri uri0) {
        super(ـᵎ0);
        this.FLD1355 = context0;
        this.FLD1356 = uri0;
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4373() {
        return CLS294.MTH4338(this.FLD1355, this.FLD1356);
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4375() {
        try {
            return DocumentsContract.deleteDocument(this.FLD1355.getContentResolver(), this.FLD1356);
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4376() {
        return CLS294.MTH4348(this.FLD1355, this.FLD1356);
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4377() {
        return CLS294.MTH4341(this.FLD1355, this.FLD1356);
    }

    @Override  // c.ٴˑ.CLS299
    public String MTH4378() {
        return CLS294.MTH4340(this.FLD1355, this.FLD1356);
    }

    @Override  // c.ٴˑ.CLS299
    public Uri MTH4379() {
        return this.FLD1356;
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4381() {
        return CLS294.MTH4343(this.FLD1355, this.FLD1356);
    }

    @Override  // c.ٴˑ.CLS299
    public long MTH4382() {
        return CLS294.MTH4344(this.FLD1355, this.FLD1356);
    }

    @Override  // c.ٴˑ.CLS299
    public String MTH4384() {
        return CLS294.MTH4347(this.FLD1355, this.FLD1356);
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4385(String s) {
        throw new UnsupportedOperationException();
    }

    @Override  // c.ٴˑ.CLS299
    public CLS299 MTH4386(String s) {
        throw new UnsupportedOperationException();
    }

    @Override  // c.ٴˑ.CLS299
    public CLS299[] MTH4387() {
        throw new UnsupportedOperationException();
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4390() {
        return CLS294.MTH4350(this.FLD1355, this.FLD1356);
    }

    @Override  // c.ٴˑ.CLS299
    public CLS299 MTH4391(String s, String s1) {
        throw new UnsupportedOperationException();
    }
}

