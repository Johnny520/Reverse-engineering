// Decompiled by JEB v5.42.0.202606242140

package d.ᵎʻ;

import d.ˎˏ.CLS4;
import d.יʻ.CLS69;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.HashMap;

public final class CLS119 {
    public final Object FLD667;
    public final int FLD668;
    public Object FLD669;

    public CLS119() {
        this.FLD668 = 0;
        super();
        this.FLD667 = new HashMap();
        this.FLD669 = new HashMap();
    }

    // 此方法包含解密的字符串
    public CLS119(File file0) {
        this.FLD668 = 1;
        super();
        this.FLD667 = file0;
        Class class0 = CLS69.MTH811("VFSFileClass1");
        if(class0 != null) {
            this.FLD669 = CLS4.MTH383(class0, new Object[]{file0.getAbsolutePath()});
        }
    }

    public CLS119(Object object0) {
        this.FLD668 = 2;
        super();
        this.FLD667 = object0;
    }

    public CLS119(String s) {
        this.FLD668 = 1;
        this(new File(s));
    }

    // 此方法包含解密的字符串
    @Override
    public final String toString() {
        try {
            if(this.FLD668 != 1) {
                return super.toString();
            }
            Object object0 = this.FLD669;
            if(object0 != null) {
                return (String)CLS4.MTH389(object0, "toString", new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        try {
            return ((File)this.FLD667).toString();
        }
        catch(Throwable throwable1) {
            CLS69.MTH797(throwable1);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public final Object[] MTH1165() {
        Object object2;
        Object object0 = this.FLD669;
        if(((Object[])object0) != null) {
            return (Object[])object0;
        }
        try {
            Object object1 = this.FLD667;
            Field field0 = object1.getClass().getDeclaredField("args");
            object2 = null;
            if(field0 != null) {
                field0.setAccessible(true);
                object2 = field0.get(object1);
            }
        }
        catch(Throwable unused_ex) {
        }
        this.FLD669 = (Object[])object2;
        return (Object[])object2;
    }

    // 此方法包含解密的字符串
    public final String MTH1166() {
        try {
            Object object0 = this.FLD669;
            if(object0 != null) {
                Object object1 = CLS4.MTH389(object0, CLS69.MTH802("VFSFileOpGetRealPathMethod"), new Object[0]);
                Object object2 = CLS4.MTH392(object1, CLS69.MTH802("getAccSnsPathField2"));
                return object2 == null ? ((File)this.FLD667).getAbsolutePath() : ((String)CLS4.MTH389(object2, CLS69.MTH802("getAccSnsPathMethod4"), new Object[]{CLS4.MTH392(object1, CLS69.MTH802("getAccSnsPathField1")), Boolean.TRUE}));
            }
            return ((File)this.FLD667).getAbsolutePath();
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            return this.MTH1167();
        }
    }

    // 此方法包含解密的字符串
    public final String MTH1167() {
        try {
            Object object0 = this.FLD669;
            if(object0 != null) {
                return (String)CLS4.MTH389(object0, CLS69.MTH800("VFSFileClass1getAbsolutePathMethod", "getAbsolutePath"), new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        try {
            return ((File)this.FLD667).getAbsolutePath();
        }
        catch(Throwable throwable1) {
            CLS69.MTH797(throwable1);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public final OutputStream MTH1168() {
        try {
            if(this.FLD669 != null) {
                Class class0 = CLS69.MTH811("FileOpClass");
                if(class0 != null) {
                    return (OutputStream)CLS4.MTH385(class0, CLS69.MTH802("VFSFileOpGetOutputStreamMethod"), new Object[]{this.FLD669});
                }
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        try {
            return new FileOutputStream(((File)this.FLD667));
        }
        catch(Throwable throwable1) {
            CLS69.MTH797(throwable1);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public final InputStream MTH1169() {
        try {
            if(this.FLD669 != null) {
                Class class0 = CLS69.MTH811("FileOpClass");
                if(class0 != null) {
                    return (InputStream)CLS4.MTH385(class0, CLS69.MTH802("VFSFileOpGetInputStreamMethod"), new Object[]{this.FLD669});
                }
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        try {
            return new FileInputStream(((File)this.FLD667));
        }
        catch(Throwable throwable1) {
            CLS69.MTH797(throwable1);
            return null;
        }
    }
}

