// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import t.ʻˑ.CLS3;
import t.ᵔʾ.CLS133;

public final class CLS106 {
    public final int FLD788;
    public final Object FLD789;
    public final Serializable FLD790;

    public CLS106() {
        this.FLD788 = 0;
        super();
        this.FLD790 = new HashMap();
        this.FLD789 = new HashMap();
    }

    // 此方法包含解密的字符串
    public CLS106(File file0) {
        this.FLD788 = 1;
        super();
        this.FLD790 = file0;
        Class class0 = CLS133.MTH2111("VFSFileClass1");
        if(class0 != null) {
            this.FLD789 = CLS3.MTH988(class0, new Object[]{file0.getAbsolutePath()});
        }
    }

    public CLS106(String s) {
        this.FLD788 = 1;
        this(new File(s));
    }

    // 此方法包含解密的字符串
    @Override
    public final String toString() {
        try {
            if(this.FLD788 != 1) {
                return super.toString();
            }
            Object object0 = this.FLD789;
            if(object0 != null) {
                return (String)CLS3.MTH991(object0, "toString", new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        try {
            return ((File)this.FLD790).toString();
        }
        catch(Throwable throwable1) {
            CLS133.MTH2113(throwable1);
            return "";
        }
    }

    public final void MTH1842(String s, String s1) {
        ((HashMap)this.FLD790).put(s, s1);
        ((HashMap)this.FLD789).put(s1, s);
    }

    // 此方法包含解密的字符串
    public final void MTH1843() {
        try {
            Object object0 = this.FLD789;
            if(object0 != null) {
                ((Boolean)CLS3.MTH991(object0, CLS133.MTH2100("VFSFileClass1createNewFileMethod", "createNewFile"), new Object[0])).booleanValue();
                return;
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        try {
            ((File)this.FLD790).createNewFile();
        }
        catch(Throwable throwable1) {
            CLS133.MTH2113(throwable1);
        }
    }

    // 此方法包含解密的字符串
    public final OutputStream MTH1844() {
        Object object0 = this.FLD789;
        if(object0 != null) {
            try {
                Class class0 = CLS133.MTH2111("FileOpClass");
                if(class0 != null) {
                    return (OutputStream)CLS3.MTH996(class0, CLS133.MTH2115("VFSFileOpGetOutputStreamMethod"), new Object[]{object0});
                }
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
        try {
            return new FileOutputStream(((File)this.FLD790));
        }
        catch(Throwable throwable1) {
            CLS133.MTH2113(throwable1);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public final String MTH1845() {
        try {
            Object object0 = this.FLD789;
            if(object0 != null) {
                return (String)CLS3.MTH991(object0, CLS133.MTH2100("VFSFileClass1getAbsolutePathMethod", "getAbsolutePath"), new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        try {
            return ((File)this.FLD790).getAbsolutePath();
        }
        catch(Throwable throwable1) {
            CLS133.MTH2113(throwable1);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public final boolean MTH1846() {
        try {
            Object object0 = this.FLD789;
            if(object0 != null) {
                return ((Boolean)CLS3.MTH991(object0, CLS133.MTH2100("VFSFileClass1deleteMethod", "delete"), new Object[0])).booleanValue() || new File(this.MTH1848()).delete();
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        try {
            return ((File)this.FLD790).delete();
        }
        catch(Throwable throwable1) {
            CLS133.MTH2113(throwable1);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public final InputStream MTH1847() {
        Object object0 = this.FLD789;
        if(object0 != null) {
            try {
                Class class0 = CLS133.MTH2111("FileOpClass");
                if(class0 != null) {
                    return (InputStream)CLS3.MTH996(class0, CLS133.MTH2115("VFSFileOpGetInputStreamMethod"), new Object[]{object0});
                }
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
        try {
            return new FileInputStream(((File)this.FLD790));
        }
        catch(Throwable throwable1) {
            CLS133.MTH2113(throwable1);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public final String MTH1848() {
        try {
            Object object0 = this.FLD789;
            if(object0 != null) {
                Object object1 = CLS3.MTH991(object0, CLS133.MTH2115("VFSFileOpGetRealPathMethod"), new Object[0]);
                Object object2 = CLS3.MTH989(object1, CLS133.MTH2115("getAccSnsPathField2"));
                return object2 == null ? ((File)this.FLD790).getAbsolutePath() : ((String)CLS3.MTH991(object2, CLS133.MTH2115("getAccSnsPathMethod4"), new Object[]{CLS3.MTH989(object1, CLS133.MTH2115("getAccSnsPathField1")), Boolean.TRUE}));
            }
            return ((File)this.FLD790).getAbsolutePath();
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
            return this.MTH1845();
        }
    }

    // 此方法包含解密的字符串
    public final String MTH1849() {
        try {
            Object object0 = this.FLD789;
            if(object0 != null) {
                return (String)CLS3.MTH991(object0, CLS133.MTH2100("VFSFileClass1getParentMethod", "getParent"), new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        try {
            return ((File)this.FLD790).getParent();
        }
        catch(Throwable throwable1) {
            CLS133.MTH2113(throwable1);
            return "";
        }
    }
}

