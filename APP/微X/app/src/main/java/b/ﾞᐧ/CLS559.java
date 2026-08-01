// Decompiled by JEB v5.42.0.202606242140

package b.ﾞᐧ;

import android.app.Activity;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˈˈ.CLS69;
import b.יﹳ.CLS166;
import java.io.OutputStream;

public final class CLS559 {
    public Object FLD5459;

    public CLS559() {
        this.FLD5459 = new CLS557();
    }

    // 此方法包含解密的字符串
    public CLS559(Activity activity0) {
        Class class0 = CLS27.MTH894("CompatToolbarClass");
        if(class0 == null) {
            return;
        }
        this.FLD5459 = CLS166.MTH3188(class0, new Object[]{activity0, null});
    }

    public CLS559(CLS557 ˆٴ0) {
        this.FLD5459 = ˆٴ0;
    }

    public final void MTH7483(OutputStream outputStream0) {
        int v = (int)((CLS557)this.FLD5459).FLD5443.FLD5445;
        int v1 = ((CLS557)this.FLD5459).FLD5443.FLD5457;
        int v2 = (int)((CLS557)this.FLD5459).FLD5443.FLD5447;
        int v3 = ((CLS557)this.FLD5459).FLD5443.FLD5453;
        int v4 = ((CLS557)this.FLD5459).FLD5443.FLD5446;
        long v5 = ((CLS557)this.FLD5459).FLD5443.FLD5452;
        long v6 = ((CLS557)this.FLD5459).FLD5443.FLD5458;
        long v7 = ((CLS557)this.FLD5459).FLD5443.FLD5456;
        int v8 = ((CLS557)this.FLD5459).FLD5443.FLD5449;
        try {
            outputStream0.write("RIFF".getBytes());
            outputStream0.write(new byte[]{((byte)(((int)v5))), ((byte)(((int)(v5 >> 8)))), ((byte)(((int)(v5 >> 16)))), ((byte)(((int)(v5 >> 24))))});
            outputStream0.write("WAVE".getBytes());
            outputStream0.write("fmt ".getBytes());
            outputStream0.write(new byte[]{((byte)(((int)v6))), ((byte)(((int)(v6 >> 8)))), ((byte)(((int)(v6 >> 16)))), ((byte)(((int)(v6 >> 24))))});
            outputStream0.write(new byte[]{((byte)v1), ((byte)(v1 >> 8))});
            outputStream0.write(new byte[]{((byte)v4), ((byte)(v4 >> 8))});
            outputStream0.write(new byte[]{((byte)v2), ((byte)(v2 >> 8)), ((byte)(v2 >> 16)), ((byte)(v2 >> 24))});
            outputStream0.write(new byte[]{((byte)v), ((byte)(v >> 8)), ((byte)(v >> 16)), ((byte)(v >> 24))});
            outputStream0.write(new byte[]{((byte)v8), ((byte)(v8 >> 8))});
            outputStream0.write(new byte[]{((byte)v3), ((byte)(v3 >> 8))});
            outputStream0.write("data".getBytes());
            outputStream0.write(new byte[]{((byte)(((int)v7))), ((byte)(((int)(v7 >> 8)))), ((byte)(((int)(v7 >> 16)))), ((byte)(((int)(v7 >> 24))))});
            outputStream0.write(((CLS557)this.FLD5459).FLD5444);
            outputStream0.flush();
            outputStream0.close();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH7484(String s) {
        Object object0 = this.FLD5459;
        if(object0 == null) {
            return;
        }
        CLS166.MTH3195(object0, "setTitle", new Object[]{s});
    }

    public final boolean MTH7485(String s) {
        try {
            if(!CLS31.MTH1003(s)) {
                return false;
            }
            this.MTH7483(new CLS69(s).MTH1553());
            return true;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return false;
        }
    }
}

