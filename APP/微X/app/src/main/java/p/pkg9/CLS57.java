// Decompiled by JEB v5.42.0.202606242140

package p.pkg9;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;
import p.pkg1.CLS1;
import p.pkg1.CLS2;
import p.pkg10.CLS66;
import p.pkg6.CLS36;
import p.pkg7.CLS37;
import p.pkg7.CLS39;

public abstract class CLS57 implements Cloneable {
    public static final class CLS189 implements CLS2 {
        public final Appendable FLD371;
        public final CLS62 FLD372;

        public CLS189(StringBuilder stringBuilder0, CLS62 ﾞˈ$ٴʼ0) {
            this.FLD371 = stringBuilder0;
            this.FLD372 = ﾞˈ$ٴʼ0;
            ﾞˈ$ٴʼ0.MTH1088();
        }

        @Override  // p.pkg1.CLS2
        public final void MTH404(CLS57 ʼˉ0, int v) {
            try {
                ʼˉ0.MTH971(this.FLD371, v, this.FLD372);
            }
            catch(IOException iOException0) {
                throw new CLS66(iOException0);
            }
        }

        @Override  // p.pkg1.CLS2
        public final void MTH405(CLS57 ʼˉ0, int v) {
            if(!ʼˉ0.MTH979().equals("#text")) {
                try {
                    ʼˉ0.MTH978(this.FLD371, v, this.FLD372);
                }
                catch(IOException iOException0) {
                    throw new CLS66(iOException0);
                }
            }
        }
    }

    @Nullable
    public CLS57 FLD373;
    public static final List FLD374;
    public int FLD375;

    static {
        CLS57.FLD374 = Collections.emptyList();
    }

    @Override
    public Object clone() {
        return this.MTH985();
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        return this == object0;
    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return this.MTH983();
    }

    public static void MTH965(Appendable appendable0, int v, CLS62 ﾞˈ$ٴʼ0) {
        String s;
        Appendable appendable1 = appendable0.append('\n');
        int v1 = v * ﾞˈ$ٴʼ0.FLD404;
        boolean z = true;
        if(v1 < 0) {
            throw new CLS37("width must be >= 0");
        }
        int v3 = ﾞˈ$ٴʼ0.FLD409;
        if(v3 < -1) {
            z = false;
        }
        CLS39.MTH870(z);
        if(v3 != -1) {
            v1 = Math.min(v1, v3);
        }
        if(v1 < 21) {
            s = CLS36.FLD313[v1];
        }
        else {
            char[] arr_c = new char[v1];
            for(int v2 = 0; v2 < v1; ++v2) {
                arr_c[v2] = ' ';
            }
            s = String.valueOf(arr_c);
        }
        appendable1.append(s);
    }

    public void MTH966(CLS57 ʼˉ0) {
        CLS39.MTH870(ʼˉ0.FLD373 == this);
        int v = ʼˉ0.FLD375;
        this.MTH973().remove(v);
        this.MTH976(v);
        ʼˉ0.FLD373 = null;
    }

    public abstract CLS64 MTH967();

    public abstract boolean MTH968();

    public abstract int MTH969();

    public abstract String MTH970();

    public abstract void MTH971(Appendable arg1, int arg2, CLS62 arg3);

    @Nullable
    public final CLS57 MTH972() {
        CLS57 ʼˉ0 = this.FLD373;
        if(ʼˉ0 == null) {
            return null;
        }
        List list0 = ʼˉ0.MTH973();
        int v = this.FLD375 + 1;
        return list0.size() <= v ? null : ((CLS57)list0.get(v));
    }

    public abstract List MTH973();

    public abstract CLS57 MTH974();

    public CLS57 MTH975() {
        CLS57 ʼˉ0;
        while((ʼˉ0 = this.FLD373) != null) {
            this = ʼˉ0;
        }
        return this;
    }

    public final void MTH976(int v) {
        int v1 = this.MTH969();
        if(v1 == 0) {
            return;
        }
        List list0 = this.MTH973();
        while(v < v1) {
            ((CLS57)list0.get(v)).FLD375 = v;
            ++v;
        }
    }

    public String MTH977(String s) {
        URL uRL1;
        URL uRL0;
        CLS39.MTH872(s);
        if(this.MTH968() && this.MTH967().MTH1113(s) != -1) {
            String s1 = this.MTH970();
            String s2 = this.MTH967().MTH1108(s);
            String s3 = CLS36.FLD311.matcher(s1).replaceAll("");
            String s4 = CLS36.FLD311.matcher(s2).replaceAll("");
            try {
                uRL0 = new URL(s3);
                uRL1 = CLS36.MTH849(uRL0, s4);
                return uRL1.toExternalForm();
            }
            catch(MalformedURLException unused_ex) {
                try {
                    uRL1 = new URL(s4);
                    return uRL1.toExternalForm();
                }
                catch(MalformedURLException unused_ex) {
                }
            }
            return CLS36.FLD314.matcher(s4).find() ? s4 : "";
        }
        return "";
    }

    public abstract void MTH978(Appendable arg1, int arg2, CLS62 arg3);

    public abstract String MTH979();

    public final boolean MTH980(String s) {
        CLS39.MTH871(s);
        if(!this.MTH968()) {
            return false;
        }
        if(s.startsWith("abs:")) {
            String s1 = s.substring(4);
            return this.MTH967().MTH1113(s1) == -1 || this.MTH977(s1).isEmpty() ? this.MTH967().MTH1113(s) != -1 : true;
        }
        return this.MTH967().MTH1113(s) != -1;
    }

    // 此方法包含解密的字符串
    public CLS57 MTH981(@Nullable CLS57 ʼˉ0) {
        CLS57 ʼˉ1;
        try {
            ʼˉ1 = (CLS57)super.clone();
            ʼˉ1.FLD373 = ʼˉ0;
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new RuntimeException(cloneNotSupportedException0);
        }
        ʼˉ1.FLD375 = ʼˉ0 == null ? 0 : this.FLD375;
        if(ʼˉ0 == null && !(this instanceof CLS207)) {
            CLS57 ʼˉ2 = this.MTH975();
            CLS207 ﾞˈ0 = ʼˉ2 instanceof CLS207 ? ((CLS207)ʼˉ2) : null;
            if(ﾞˈ0 != null) {
                CLS207 ﾞˈ1 = new CLS207("");
                CLS64 ﾞᵢ0 = ﾞˈ0.FLD393;
                if(ﾞᵢ0 != null) {
                    ﾞˈ1.FLD393 = ﾞᵢ0.MTH1114();
                }
                ﾞˈ1.FLD412 = ﾞˈ0.FLD412.MTH1087();
                ʼˉ1.FLD373 = ﾞˈ1;
                ((CLS192)ﾞˈ1).MTH973().add(ʼˉ1);
            }
        }
        return ʼˉ1;
    }

    @Nullable
    public CLS57 MTH982() {
        return this.FLD373;
    }

    public String MTH983() {
        StringBuilder stringBuilder0 = CLS36.MTH850();
        CLS57 ʼˉ0 = this.MTH975();
        CLS207 ﾞˈ0 = ʼˉ0 instanceof CLS207 ? ((CLS207)ʼˉ0) : null;
        if(ﾞˈ0 == null) {
            ﾞˈ0 = new CLS207("");
        }
        CLS1.MTH400(((CLS2)new CLS189(stringBuilder0, ﾞˈ0.FLD412)), this);
        return CLS36.MTH848(stringBuilder0);
    }

    public String MTH984(String s) {
        CLS39.MTH871(s);
        if(!this.MTH968()) {
            return "";
        }
        String s1 = this.MTH967().MTH1108(s);
        if(s1.length() > 0) {
            return s1;
        }
        return s.startsWith("abs:") ? this.MTH977(s.substring(4)) : "";
    }

    public CLS57 MTH985() {
        CLS57 ʼˉ0 = this.MTH981(null);
        LinkedList linkedList0 = new LinkedList();
        linkedList0.add(ʼˉ0);
        while(!linkedList0.isEmpty()) {
            CLS57 ʼˉ1 = (CLS57)linkedList0.remove();
            int v = ʼˉ1.MTH969();
            for(int v1 = 0; v1 < v; ++v1) {
                List list0 = ʼˉ1.MTH973();
                CLS57 ʼˉ2 = ((CLS57)list0.get(v1)).MTH981(ʼˉ1);
                list0.set(v1, ʼˉ2);
                linkedList0.add(ʼˉ2);
            }
        }
        return ʼˉ0;
    }

    public final void MTH986(int v, CLS57[] arr_ʼˉ) {
        boolean z1;
        CLS39.MTH871(arr_ʼˉ);
        if(arr_ʼˉ.length == 0) {
            return;
        }
        List list0 = this.MTH973();
        CLS57 ʼˉ0 = arr_ʼˉ[0].MTH982();
        if(ʼˉ0 != null && ʼˉ0.MTH969() == arr_ʼˉ.length) {
            List list1 = ʼˉ0.MTH973();
            for(int v2 = arr_ʼˉ.length; true; --v2) {
                boolean z = true;
                z1 = true;
                if(v2 <= 0) {
                    break;
                }
                if(arr_ʼˉ[v2 - 1] != list1.get(v2 - 1)) {
                    z = false;
                    break;
                }
            }
            if(z) {
                if(this.MTH969() != 0) {
                    z1 = false;
                }
                ʼˉ0.MTH974();
                list0.addAll(v, Arrays.asList(arr_ʼˉ));
                for(int v3 = arr_ʼˉ.length; v3 > 0; --v3) {
                    arr_ʼˉ[v3 - 1].FLD373 = this;
                }
                if(!z1 || arr_ʼˉ[0].FLD375 != 0) {
                    this.MTH976(v);
                }
                return;
            }
        }
        for(int v4 = 0; v4 < arr_ʼˉ.length; ++v4) {
            if(arr_ʼˉ[v4] == null) {
                throw new CLS37("Array must not contain any null objects");
            }
        }
        for(int v1 = 0; v1 < arr_ʼˉ.length; ++v1) {
            CLS57 ʼˉ1 = arr_ʼˉ[v1];
            ʼˉ1.getClass();
            CLS57 ʼˉ2 = ʼˉ1.FLD373;
            if(ʼˉ2 != null) {
                ʼˉ2.MTH966(ʼˉ1);
            }
            ʼˉ1.FLD373 = this;
        }
        list0.addAll(v, Arrays.asList(arr_ʼˉ));
        this.MTH976(v);
    }
}

