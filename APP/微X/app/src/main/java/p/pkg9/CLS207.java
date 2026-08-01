// Decompiled by JEB v5.42.0.202606242140

package p.pkg9;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import javax.annotation.Nullable;
import p.pkg3.CLS15;
import p.pkg3.CLS181;
import p.pkg3.CLS18;
import p.pkg3.CLS9;
import p.pkg7.CLS40;

public final class CLS207 extends CLS192 {
    public static final class CLS62 implements Cloneable {
        @Nullable
        public int FLD403;
        public final int FLD404;
        public final boolean FLD405;
        public CLS59 FLD406;
        public final int FLD407;
        public final ThreadLocal FLD408;
        public final int FLD409;
        public Charset FLD410;

        public CLS62() {
            this.FLD406 = CLS59.FLD378;
            this.FLD410 = CLS40.FLD317;
            this.FLD408 = new ThreadLocal();
            this.FLD405 = true;
            this.FLD404 = 1;
            this.FLD409 = 30;
            this.FLD407 = 1;
        }

        @Override
        public final Object clone() {
            return this.MTH1087();
        }

        public final CLS62 MTH1087() {
            CLS62 ﾞˈ$ٴʼ0;
            try {
                ﾞˈ$ٴʼ0 = (CLS62)super.clone();
            }
            catch(CloneNotSupportedException cloneNotSupportedException0) {
                throw new RuntimeException(cloneNotSupportedException0);
            }
            String s = this.FLD410.name();
            ﾞˈ$ٴʼ0.getClass();
            ﾞˈ$ٴʼ0.FLD410 = Charset.forName(s);
            ﾞˈ$ٴʼ0.FLD406 = CLS59.valueOf(this.FLD406.name());
            return ﾞˈ$ٴʼ0;
        }

        public final CharsetEncoder MTH1088() {
            int v;
            CharsetEncoder charsetEncoder0 = this.FLD410.newEncoder();
            this.FLD408.set(charsetEncoder0);
            String s = charsetEncoder0.charset().name();
            if(s.equals("US-ASCII")) {
                v = 1;
            }
            else {
                v = s.startsWith("UTF-") ? 2 : 3;
            }
            this.FLD403 = v;
            return charsetEncoder0;
        }
    }

    public int FLD411;
    public CLS62 FLD412;
    public CLS18 FLD413;

    public CLS207(String s) {
        super(CLS15.MTH690("#root", CLS9.FLD44), s, null);
        this.FLD412 = new CLS62();
        this.FLD411 = 1;
        this.FLD413 = new CLS18(new CLS181());
    }

    @Override  // p.pkg9.CLS192
    public final Object clone() {
        CLS207 ﾞˈ0 = (CLS207)((CLS192)this).super.MTH1037();
        ﾞˈ0.FLD412 = this.FLD412.MTH1087();
        return ﾞˈ0;
    }

    @Override  // p.pkg9.CLS192
    public final CLS192 MTH1037() {
        CLS192 יٴ0 = (CLS207)((CLS192)this).super.MTH1037();
        יٴ0.FLD412 = this.FLD412.MTH1087();
        return יٴ0;
    }

    @Override  // p.pkg9.CLS192
    public final String MTH979() {
        return "#document";
    }

    @Override  // p.pkg9.CLS57
    public final String MTH983() {
        return ((CLS192)this).MTH1051();
    }

    @Override  // p.pkg9.CLS192
    public final CLS57 MTH985() {
        CLS57 ʼˉ0 = (CLS207)((CLS192)this).super.MTH1037();
        ʼˉ0.FLD412 = this.FLD412.MTH1087();
        return ʼˉ0;
    }
}

