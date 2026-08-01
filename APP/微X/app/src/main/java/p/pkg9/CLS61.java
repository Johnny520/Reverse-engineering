// Decompiled by JEB v5.42.0.202606242140

package p.pkg9;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import p.pkg1.CLS1;
import p.pkg10.CLS66;
import p.pkg6.CLS36;
import p.pkg7.CLS39;

public final class CLS61 implements Cloneable, Map.Entry {
    public static final String[] FLD394;
    public static final Pattern FLD395;
    public static final Pattern FLD396;
    public final String FLD397;
    public static final Pattern FLD398;
    @Nullable
    public CLS64 FLD399;
    public static final Pattern FLD400;
    @Nullable
    public String FLD401;

    static {
        CLS61.FLD394 = new String[]{"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
        CLS61.FLD396 = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
        CLS61.FLD395 = Pattern.compile("[^-a-zA-Z0-9_:.]");
        CLS61.FLD400 = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"\'/=]+");
        CLS61.FLD398 = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"\'/=]");
    }

    public CLS61(String s, @Nullable String s1, @Nullable CLS64 ﾞᵢ0) {
        CLS39.MTH871(s);
        String s2 = s.trim();
        CLS39.MTH872(s2);
        this.FLD397 = s2;
        this.FLD401 = s1;
        this.FLD399 = ﾞᵢ0;
    }

    @Override
    public final Object clone() {
        try {
            return (CLS61)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new RuntimeException(cloneNotSupportedException0);
        }
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(CLS61.class == class0) {
                String s = ((CLS61)object0).FLD397;
                String s1 = this.FLD397;
                if(s1 != null) {
                    if(!s1.equals(s)) {
                        return false;
                    }
                }
                else if(s != null) {
                    return false;
                }
                String s2 = this.FLD401;
                String s3 = ((CLS61)object0).FLD401;
                return s2 == null ? s3 == null : s2.equals(s3);
            }
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.FLD397;
    }

    @Override
    public final Object getValue() {
        return this.FLD401 == null ? "" : this.FLD401;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.FLD397 == null ? 0 : this.FLD397.hashCode();
        String s = this.FLD401;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public final Object setValue(@Nullable Object object0) {
        String s = this.FLD401;
        CLS64 ﾞᵢ0 = this.FLD399;
        if(ﾞᵢ0 != null) {
            String s1 = this.FLD397;
            int v = ﾞᵢ0.MTH1115(s1);
            if(v != -1) {
                s = this.FLD399.MTH1105(s1);
                this.FLD399.FLD417[v] = (String)object0;
            }
        }
        this.FLD401 = (String)object0;
        return s == null ? "" : s;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = CLS36.MTH850();
        try {
            CLS62 ﾞˈ$ٴʼ0 = new CLS207("").FLD412;
            String s = this.FLD401;
            String s1 = CLS61.MTH1066(this.FLD397, ﾞˈ$ٴʼ0.FLD407);
            if(s1 != null) {
                CLS61.MTH1067(s1, s, stringBuilder0, ﾞˈ$ٴʼ0);
                return CLS36.MTH848(stringBuilder0);
            }
        }
        catch(IOException iOException0) {
            throw new CLS66(iOException0);
        }
        return CLS36.MTH848(stringBuilder0);
    }

    @Nullable
    public static String MTH1066(String s, int v) {
        if(v == 2) {
            Pattern pattern0 = CLS61.FLD396;
            if(!pattern0.matcher(s).matches()) {
                String s1 = CLS61.FLD395.matcher(s).replaceAll("");
                return pattern0.matcher(s1).matches() ? s1 : null;
            }
        }
        if(v == 1) {
            Pattern pattern1 = CLS61.FLD400;
            if(!pattern1.matcher(s).matches()) {
                String s2 = CLS61.FLD398.matcher(s).replaceAll("");
                return pattern1.matcher(s2).matches() ? s2 : null;
            }
        }
        return s;
    }

    public static void MTH1067(String s, @Nullable String s1, Appendable appendable0, CLS62 ﾞˈ$ٴʼ0) {
        appendable0.append(s);
        boolean z = true;
        if(ﾞˈ$ٴʼ0.FLD407 != 1) {
            z = false;
        }
        else if(s1 != null) {
            if(!s1.isEmpty() && !s1.equalsIgnoreCase(s)) {
                z = false;
            }
            else {
                String s2 = CLS1.MTH398(s);
                if(Arrays.binarySearch(CLS61.FLD394, s2) < 0) {
                    z = false;
                }
            }
        }
        if(!z) {
            appendable0.append("=\"");
            if(s1 == null) {
                s1 = "";
            }
            CLS60.MTH1029(appendable0, s1, ﾞˈ$ٴʼ0, true, false, false, false);
            appendable0.append('\"');
        }
    }
}

