// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import b.ʾᵢ.CLS27;
import b.יﹳ.CLS166;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;

public final class CLS69 {
    public final int FLD232;
    public final Object FLD233;
    public final Serializable FLD234;

    public CLS69() {
        this.FLD232 = 0;
        super();
        this.FLD234 = new HashMap();
        this.FLD233 = new HashMap();
    }

    // 此方法包含解密的字符串
    public CLS69(File file0) {
        this.FLD232 = 1;
        super();
        this.FLD234 = file0;
        Class class0 = CLS27.MTH894("VFSFileClass1");
        if(class0 != null) {
            this.FLD233 = CLS166.MTH3188(class0, new Object[]{file0.getAbsolutePath()});
        }
    }

    public CLS69(String s) {
        this.FLD232 = 1;
        this(new File(s));
    }

    // 此方法包含解密的字符串
    @Override
    public final String toString() {
        try {
            if(this.FLD232 != 1) {
                return super.toString();
            }
            Object object0 = this.FLD233;
            if(object0 != null) {
                return (String)CLS166.MTH3195(object0, "toString", new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        try {
            return ((File)this.FLD234).toString();
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public final OutputStream MTH1553() {
        Object object0 = this.FLD233;
        if(object0 != null) {
            try {
                Class class0 = CLS27.MTH894("FileOpClass");
                if(class0 != null) {
                    return (OutputStream)CLS166.MTH3192(class0, CLS27.MTH897("VFSFileOpGetOutputStreamMethod"), new Object[]{object0});
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        try {
            return new FileOutputStream(((File)this.FLD234));
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public final InputStream MTH1554() {
        Object object0 = this.FLD233;
        if(object0 != null) {
            try {
                Class class0 = CLS27.MTH894("FileOpClass");
                if(class0 != null) {
                    return (InputStream)CLS166.MTH3192(class0, CLS27.MTH897("VFSFileOpGetInputStreamMethod"), new Object[]{object0});
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH906(throwable0.getMessage());
            }
        }
        try {
            return new FileInputStream(((File)this.FLD234));
        }
        catch(Throwable throwable1) {
            CLS27.MTH906(throwable1.getMessage());
            return null;
        }
    }

    // 此方法包含解密的字符串
    public final String MTH1555() {
        try {
            Object object0 = this.FLD233;
            if(object0 != null) {
                return (String)CLS166.MTH3195(object0, CLS27.MTH892("VFSFileClass1getNameMethod", "getName"), new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        try {
            return ((File)this.FLD234).getName();
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public final boolean MTH1556() {
        try {
            Object object0 = this.FLD233;
            if(object0 != null) {
                return ((Boolean)CLS166.MTH3195(object0, CLS27.MTH892("VFSFileClass1createNewFileMethod", "createNewFile"), new Object[0])).booleanValue();
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        try {
            return ((File)this.FLD234).createNewFile();
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public final String MTH1557() {
        try {
            Object object0 = this.FLD233;
            if(object0 != null) {
                return (String)CLS166.MTH3195(object0, CLS27.MTH892("VFSFileClass1getParentMethod", "getParent"), new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        try {
            return ((File)this.FLD234).getParent();
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public final long MTH1558() {
        try {
            Object object0 = this.FLD233;
            if(object0 != null) {
                return (long)(((Long)CLS166.MTH3195(object0, CLS27.MTH892("VFSFileClass1LengthMethod", "length"), new Object[0])));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        try {
            return ((File)this.FLD234).length();
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
            return 0L;
        }
    }

    public final Object MTH1559(Object object0) {
        return ((HashMap)this.FLD233).get(object0);
    }

    public final void MTH1560(String s, Object object0) {
        ((HashMap)this.FLD234).put(s, object0);
        ((HashMap)this.FLD233).put(object0, s);
    }

    public final boolean MTH1561() {
        return this.MTH1567().exists();
    }

    // 此方法包含解密的字符串
    public final boolean MTH1562() {
        try {
            Object object0 = this.FLD233;
            if(object0 != null) {
                return ((Boolean)CLS166.MTH3195(object0, CLS27.MTH892("VFSFileClass1ExistsMethod", "exists"), new Object[0])).booleanValue();
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        try {
            return ((File)this.FLD234).exists();
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public final String MTH1563() {
        try {
            Object object0 = this.FLD233;
            if(object0 != null) {
                Object object1 = CLS166.MTH3195(object0, CLS27.MTH897("VFSFileOpGetRealPathMethod"), new Object[0]);
                Object object2 = CLS166.MTH3194(object1, CLS27.MTH897("getAccSnsPathField2"));
                return object2 == null ? ((File)this.FLD234).getAbsolutePath() : ((String)CLS166.MTH3195(object2, CLS27.MTH897("getAccSnsPathMethod4"), new Object[]{CLS166.MTH3194(object1, CLS27.MTH897("getAccSnsPathField1")), Boolean.TRUE}));
            }
            return ((File)this.FLD234).getAbsolutePath();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return this.MTH1568();
        }
    }

    // 此方法包含解密的字符串
    public final boolean MTH1564() {
        try {
            Object object0 = this.FLD233;
            if(object0 != null) {
                return ((Boolean)CLS166.MTH3195(object0, CLS27.MTH892("VFSFileClass1deleteMethod", "delete"), new Object[0])).booleanValue() || new File(this.MTH1563()).delete();
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        try {
            return ((File)this.FLD234).delete();
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
            return false;
        }
    }

    public final Object MTH1565(Object object0) {
        return ((HashMap)this.FLD234).get(object0);
    }

    public final Set MTH1566() {
        return ((HashMap)this.FLD234).keySet();
    }

    public final File MTH1567() {
        return new File(this.MTH1563());
    }

    // 此方法包含解密的字符串
    public final String MTH1568() {
        try {
            Object object0 = this.FLD233;
            if(object0 != null) {
                return (String)CLS166.MTH3195(object0, CLS27.MTH892("VFSFileClass1getAbsolutePathMethod", "getAbsolutePath"), new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        try {
            return ((File)this.FLD234).getAbsolutePath();
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
            return "";
        }
    }
}

