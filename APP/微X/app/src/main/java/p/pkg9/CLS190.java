// Decompiled by JEB v5.42.0.202606242140

package p.pkg9;

import java.util.List;
import p.pkg1.CLS1;
import p.pkg3.CLS10;
import p.pkg3.CLS181;

public abstract class CLS190 extends CLS57 {
    public Object FLD376;

    public final void MTH995() {
        Object object0 = this.FLD376;
        if(!(object0 instanceof CLS64)) {
            CLS64 ﾞᵢ0 = new CLS64();
            this.FLD376 = ﾞᵢ0;
            if(object0 != null) {
                ﾞᵢ0.MTH1109(((CLS57)this).MTH979(), ((String)object0));
            }
        }
    }

    @Override  // p.pkg9.CLS57
    public final CLS64 MTH967() {
        this.MTH995();
        return (CLS64)this.FLD376;
    }

    @Override  // p.pkg9.CLS57
    public final boolean MTH968() {
        return this.FLD376 instanceof CLS64;
    }

    @Override  // p.pkg9.CLS57
    public final int MTH969() {
        return 0;
    }

    // 去混淆评级： 低(20)
    @Override  // p.pkg9.CLS57
    public final String MTH970() {
        return this.FLD373 == null ? this.FLD373.MTH970() : "";
    }

    @Override  // p.pkg9.CLS57
    public final List MTH973() {
        return CLS57.FLD374;
    }

    @Override  // p.pkg9.CLS57
    public final CLS57 MTH974() {
        return this;
    }

    @Override  // p.pkg9.CLS57
    public final String MTH977(String s) {
        this.MTH995();
        return ((CLS57)this).super.MTH977(s);
    }

    @Override  // p.pkg9.CLS57
    public final CLS57 MTH981(CLS57 ʼˉ0) {
        CLS57 ʼˉ1 = (CLS190)((CLS57)this).super.MTH981(ʼˉ0);
        Object object0 = this.FLD376;
        if(object0 instanceof CLS64) {
            ʼˉ1.FLD376 = ((CLS64)object0).MTH1114();
        }
        return ʼˉ1;
    }

    @Override  // p.pkg9.CLS57
    public final String MTH984(String s) {
        if(!(this.FLD376 instanceof CLS64)) {
            return ((CLS57)this).MTH979().equals(s) ? ((String)this.FLD376) : "";
        }
        return ((CLS57)this).super.MTH984(s);
    }

    public final CLS190 MTH1005(String s, String s1) {
        if(!(this.FLD376 instanceof CLS64) && s.equals("#doctype")) {
            this.FLD376 = s1;
            return this;
        }
        this.MTH995();
        CLS57 ʼˉ0 = ((CLS57)this).MTH975();
        CLS207 ﾞˈ0 = ʼˉ0 instanceof CLS207 ? ((CLS207)ʼˉ0) : null;
        if(ﾞˈ0 == null || ﾞˈ0.FLD413 == null) {
            new CLS181();
            new CLS10();
        }
        String s2 = CLS1.MTH398(s.trim());
        CLS64 ﾞᵢ0 = this.MTH967();
        int v = ﾞᵢ0.MTH1113(s2);
        if(v == -1) {
            ﾞᵢ0.MTH1111(s1, s2);
        }
        else {
            ﾞᵢ0.FLD417[v] = s1;
            if(!ﾞᵢ0.FLD418[v].equals(s2)) {
                ﾞᵢ0.FLD418[v] = s2;
                return this;
            }
        }
        return this;
    }
}

