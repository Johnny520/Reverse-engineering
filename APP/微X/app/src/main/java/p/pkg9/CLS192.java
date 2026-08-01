// Decompiled by JEB v5.42.0.202606242140

package p.pkg9;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import p.pkg1.CLS1;
import p.pkg1.CLS2;
import p.pkg1.CLS3.CLS78;
import p.pkg1.CLS3.CLS79;
import p.pkg1.CLS3;
import p.pkg1.CLS4;
import p.pkg1.CLS77;
import p.pkg3.CLS15;
import p.pkg6.CLS36;
import p.pkg7.CLS38;
import p.pkg7.CLS39;

public class CLS192 extends CLS57 {
    public static final class CLS191 extends CLS38 {
        public final CLS192 FLD387;

        public CLS191(CLS192 יٴ0, int v) {
            super(v);
            this.FLD387 = יٴ0;
        }

        @Override  // p.pkg7.CLS38
        public final void MTH868() {
            this.FLD387.FLD390 = null;
        }
    }

    public final CLS15 FLD388;
    public List FLD389;
    @Nullable
    public WeakReference FLD390;
    public static final String FLD391;
    public static final List FLD392;
    @Nullable
    public CLS64 FLD393;

    static {
        CLS192.FLD392 = Collections.emptyList();
        Pattern.compile("\\s+");
        CLS192.FLD391 = "/baseUri";
    }

    public CLS192() {
        throw null;
    }

    public CLS192(CLS15 ᴵᐧ0, @Nullable String s, @Nullable CLS64 ﾞᵢ0) {
        CLS39.MTH871(ᴵᐧ0);
        this.FLD389 = CLS57.FLD374;
        this.FLD393 = ﾞᵢ0;
        this.FLD388 = ᴵᐧ0;
        if(s != null) {
            this.MTH1052(s);
        }
    }

    @Override  // p.pkg9.CLS57
    public Object clone() {
        return this.MTH1037();
    }

    public final List MTH1036() {
        if(this.MTH969() == 0) {
            return CLS192.FLD392;
        }
        WeakReference weakReference0 = this.FLD390;
        if(weakReference0 != null) {
            List list0 = (List)weakReference0.get();
            if(list0 != null) {
                return list0;
            }
        }
        int v = this.FLD389.size();
        ArrayList arrayList0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            CLS57 ʼˉ0 = (CLS57)this.FLD389.get(v1);
            if(ʼˉ0 instanceof CLS192) {
                arrayList0.add(((CLS192)ʼˉ0));
            }
        }
        this.FLD390 = new WeakReference(arrayList0);
        return arrayList0;
    }

    public CLS192 MTH1037() {
        return (CLS192)((CLS57)this).super.MTH985();
    }

    public final CLS4 MTH1038(String s) {
        CLS39.MTH872(s);
        CLS79 ﹳˑ$ﾞᵢ0 = new CLS79(CLS1.MTH398(s).trim());
        CLS4 ﾞᵢ0 = new CLS4();
        CLS1.MTH400(((CLS2)new CLS77(this, ﾞᵢ0, ((CLS3)ﹳˑ$ﾞᵢ0))), ((CLS57)this));
        return ﾞᵢ0;
    }

    @Override  // p.pkg9.CLS57
    public final CLS64 MTH967() {
        if(this.FLD393 == null) {
            this.FLD393 = new CLS64();
        }
        return this.FLD393;
    }

    @Override  // p.pkg9.CLS57
    public final boolean MTH968() {
        return this.FLD393 != null;
    }

    @Override  // p.pkg9.CLS57
    public final int MTH969() {
        return this.FLD389.size();
    }

    @Override  // p.pkg9.CLS57
    public final String MTH970() [...] // 潜在的解密器

    public final boolean MTH1043(CLS62 ﾞˈ$ٴʼ0) {
        if(ﾞˈ$ٴʼ0.FLD405) {
            CLS15 ᴵᐧ0 = this.FLD388;
            if(!ᴵᐧ0.FLD173) {
                CLS192 יٴ0 = (CLS192)this.FLD373;
                return יٴ0 != null && יٴ0.FLD388.FLD173 ? !ᴵᐧ0.FLD185 == 0 || (((CLS192)this.FLD373) != null && !((CLS192)this.FLD373).FLD388.FLD185 || (this.FLD373 == null || this.FLD375 <= 0 ? null : ((CLS57)this.FLD373.MTH973().get(this.FLD375 - 1))) == null) : false;
            }
            return !ᴵᐧ0.FLD185 == 0 || (((CLS192)this.FLD373) != null && !((CLS192)this.FLD373).FLD388.FLD185 || (this.FLD373 == null || this.FLD375 <= 0 ? null : ((CLS57)this.FLD373.MTH973().get(this.FLD375 - 1))) == null);
        }
        return false;
    }

    @Override  // p.pkg9.CLS57
    public final void MTH971(Appendable appendable0, int v, CLS62 ﾞˈ$ٴʼ0) {
        if(this.MTH1043(ﾞˈ$ٴʼ0) && (!(appendable0 instanceof StringBuilder) || ((StringBuilder)appendable0).length() > 0)) {
            CLS57.MTH965(appendable0, v, ﾞˈ$ٴʼ0);
        }
        Appendable appendable1 = appendable0.append('<');
        CLS15 ᴵᐧ0 = this.FLD388;
        appendable1.append(ᴵᐧ0.FLD180);
        CLS64 ﾞᵢ0 = this.FLD393;
        if(ﾞᵢ0 != null) {
            ﾞᵢ0.MTH1107(appendable0, ﾞˈ$ٴʼ0);
        }
        if(this.FLD389.isEmpty() && ((ᴵᐧ0.FLD176 || ᴵᐧ0.FLD175) && (ﾞˈ$ٴʼ0.FLD407 != 1 || !ᴵᐧ0.FLD176))) {
            appendable0.append(" />");
            return;
        }
        appendable0.append('>');
    }

    @Override  // p.pkg9.CLS57
    public final List MTH973() {
        if(this.FLD389 == CLS57.FLD374) {
            this.FLD389 = new CLS191(this, 4);
        }
        return this.FLD389;
    }

    @Override  // p.pkg9.CLS57
    public final CLS57 MTH974() {
        this.FLD389.clear();
        return this;
    }

    @Override  // p.pkg9.CLS57
    public final CLS57 MTH975() {
        return (CLS192)((CLS57)this).super.MTH975();
    }

    public final CLS4 MTH1048(String s) {
        CLS39.MTH872(s);
        CLS78 ﹳˑ$ٴʼ0 = new CLS78(s);
        CLS4 ﾞᵢ0 = new CLS4();
        CLS1.MTH400(((CLS2)new CLS77(this, ﾞᵢ0, ((CLS3)ﹳˑ$ٴʼ0))), ((CLS57)this));
        return ﾞᵢ0;
    }

    @Override  // p.pkg9.CLS57
    public final void MTH978(Appendable appendable0, int v, CLS62 ﾞˈ$ٴʼ0) {
        CLS15 ᴵᐧ0 = this.FLD388;
        if(!this.FLD389.isEmpty() || !ᴵᐧ0.FLD176 && !ᴵᐧ0.FLD175) {
            if(ﾞˈ$ٴʼ0.FLD405 && !this.FLD389.isEmpty() && ᴵᐧ0.FLD173) {
                CLS57.MTH965(appendable0, v, ﾞˈ$ٴʼ0);
            }
            appendable0.append("</").append(ᴵᐧ0.FLD180).append('>');
        }
    }

    @Override  // p.pkg9.CLS57
    public String MTH979() {
        return this.FLD388.FLD180;
    }

    public final String MTH1051() {
        CLS207 ﾞˈ0;
        StringBuilder stringBuilder0 = CLS36.MTH850();
        int v = this.FLD389.size();
        for(int v1 = 0; true; ++v1) {
            ﾞˈ0 = null;
            if(v1 >= v) {
                break;
            }
            CLS57 ʼˉ0 = (CLS57)this.FLD389.get(v1);
            CLS57 ʼˉ1 = ʼˉ0.MTH975();
            if(ʼˉ1 instanceof CLS207) {
                ﾞˈ0 = (CLS207)ʼˉ1;
            }
            if(ﾞˈ0 == null) {
                ﾞˈ0 = new CLS207("");
            }
            CLS1.MTH400(((CLS2)new CLS189(stringBuilder0, ﾞˈ0.FLD412)), ʼˉ0);
        }
        String s = CLS36.MTH848(stringBuilder0);
        CLS57 ʼˉ2 = this.MTH975();
        if(ʼˉ2 instanceof CLS207) {
            ﾞˈ0 = (CLS207)ʼˉ2;
        }
        if(ﾞˈ0 == null) {
            ﾞˈ0 = new CLS207("");
        }
        return ﾞˈ0.FLD412.FLD405 ? s.trim() : s;
    }

    public final void MTH1052(String s) {
        this.MTH967().MTH1109(CLS192.FLD391, s);
    }

    @Override  // p.pkg9.CLS57
    public final CLS57 MTH981(@Nullable CLS57 ʼˉ0) {
        CLS57 ʼˉ1 = (CLS192)((CLS57)this).super.MTH981(ʼˉ0);
        ʼˉ1.FLD393 = this.FLD393 == null ? null : this.FLD393.MTH1114();
        CLS191 יٴ$ٴʼ0 = new CLS191(((CLS192)ʼˉ1), this.FLD389.size());
        ʼˉ1.FLD389 = יٴ$ٴʼ0;
        ((CLS38)יٴ$ٴʼ0).addAll(this.FLD389);
        return ʼˉ1;
    }

    @Override  // p.pkg9.CLS57
    @Nullable
    public final CLS57 MTH982() {
        return (CLS192)this.FLD373;
    }

    @Override  // p.pkg9.CLS57
    public CLS57 MTH985() {
        return this.MTH1037();
    }

    public final void MTH1056(CLS57 ʼˉ0) {
        CLS57 ʼˉ1 = ʼˉ0.FLD373;
        if(ʼˉ1 != null) {
            ʼˉ1.MTH966(ʼˉ0);
        }
        ʼˉ0.FLD373 = this;
        this.MTH973();
        this.FLD389.add(ʼˉ0);
        ʼˉ0.FLD375 = this.FLD389.size() - 1;
    }
}

