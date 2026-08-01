// Decompiled by JEB v5.42.0.202606242140

package p.pkg3;

import javax.annotation.Nullable;
import p.pkg1.CLS1;
import p.pkg7.CLS37;
import p.pkg9.CLS64;

public abstract class CLS12 {
    public static final class CLS85 extends CLS12 {
        public final StringBuilder FLD68;
        public boolean FLD69;
        public final StringBuilder FLD70;
        public String FLD71;
        public final StringBuilder FLD72;

        public CLS85() {
            this.FLD72 = new StringBuilder();
            this.FLD71 = null;
            this.FLD68 = new StringBuilder();
            this.FLD70 = new StringBuilder();
            this.FLD69 = false;
            this.FLD87 = 1;
        }

        @Override
        public final String toString() {
            return "<!doctype " + this.FLD72.toString() + ">";
        }

        @Override  // p.pkg3.CLS12
        public final void MTH507() {
            CLS12.MTH511(this.FLD72);
            this.FLD71 = null;
            CLS12.MTH511(this.FLD68);
            CLS12.MTH511(this.FLD70);
            this.FLD69 = false;
        }
    }

    public static final class CLS199 extends CLS87 {
        public CLS199() {
            this.FLD87 = 3;
        }

        @Override
        public final String toString() {
            return "</" + (this.FLD83 == null ? "[unset]" : this.FLD83) + ">";
        }
    }

    public static final class CLS86 extends CLS12 {
        public CLS86() {
            this.FLD87 = 6;
        }

        @Override
        public final String toString() {
            return "";
        }

        @Override  // p.pkg3.CLS12
        public final void MTH507() {
        }
    }

    public static final class CLS200 extends CLS89 {
        public CLS200(String s) {
            this.FLD86 = s;
        }

        @Override  // p.pkg3.CLS12$CLS89
        public final String toString() {
            return "<![CDATA[" + this.FLD86 + "]]>";
        }
    }

    public static abstract class CLS87 extends CLS12 {
        public final StringBuilder FLD73;
        @Nullable
        public CLS64 FLD74;
        public boolean FLD75;
        @Nullable
        public String FLD76;
        public boolean FLD77;
        public boolean FLD78;
        public boolean FLD79;
        @Nullable
        public String FLD80;
        @Nullable
        public String FLD81;
        public final StringBuilder FLD82;
        @Nullable
        public String FLD83;

        public CLS87() {
            this.FLD73 = new StringBuilder();
            this.FLD75 = false;
            this.FLD82 = new StringBuilder();
            this.FLD78 = false;
            this.FLD77 = false;
            this.FLD79 = false;
        }

        public final boolean MTH482() {
            return this.FLD74 != null;
        }

        public final void MTH483(String s) {
            String s1 = s.replace('\u0000', '\uFFFD');
            String s2 = this.FLD83;
            if(s2 != null) {
                s1 = s2 + s1;
            }
            this.FLD83 = s1;
            this.FLD81 = CLS1.MTH398(s1.trim());
        }

        @Override  // p.pkg3.CLS12
        public void MTH507() {
            this.MTH485();
        }

        public CLS87 MTH485() {
            this.FLD83 = null;
            this.FLD81 = null;
            CLS12.MTH511(this.FLD73);
            this.FLD76 = null;
            this.FLD75 = false;
            CLS12.MTH511(this.FLD82);
            this.FLD80 = null;
            this.FLD77 = false;
            this.FLD78 = false;
            this.FLD79 = false;
            this.FLD74 = null;
            return this;
        }

        public final String MTH486() {
            if(this.FLD83 == null || this.FLD83.length() == 0) {
                throw new CLS37("Must be false");
            }
            return this.FLD83;
        }

        public final void MTH487(String s) {
            this.FLD78 = true;
            String s1 = this.FLD80;
            StringBuilder stringBuilder0 = this.FLD82;
            if(s1 != null) {
                stringBuilder0.append(s1);
                this.FLD80 = null;
            }
            if(stringBuilder0.length() == 0) {
                this.FLD80 = s;
                return;
            }
            stringBuilder0.append(s);
        }

        public final void MTH488(char c) {
            this.FLD78 = true;
            String s = this.FLD80;
            StringBuilder stringBuilder0 = this.FLD82;
            if(s != null) {
                stringBuilder0.append(s);
                this.FLD80 = null;
            }
            stringBuilder0.append(c);
        }

        public final void MTH489(String s) {
            this.FLD83 = s;
            this.FLD81 = CLS1.MTH398(s.trim());
        }

        public final void MTH490(int[] arr_v) {
            this.FLD78 = true;
            String s = this.FLD80;
            StringBuilder stringBuilder0 = this.FLD82;
            if(s != null) {
                stringBuilder0.append(s);
                this.FLD80 = null;
            }
            for(int v = 0; v < arr_v.length; ++v) {
                stringBuilder0.appendCodePoint(arr_v[v]);
            }
        }

        public final void MTH491(char c) {
            this.FLD75 = true;
            String s = this.FLD76;
            StringBuilder stringBuilder0 = this.FLD73;
            if(s != null) {
                stringBuilder0.append(s);
                this.FLD76 = null;
            }
            stringBuilder0.append(c);
        }

        public final void MTH492() {
            String s1;
            if(this.FLD74 == null) {
                this.FLD74 = new CLS64();
            }
            StringBuilder stringBuilder0 = this.FLD82;
            StringBuilder stringBuilder1 = this.FLD73;
            if(this.FLD75 && this.FLD74.FLD416 < 0x200) {
                String s = (stringBuilder1.length() <= 0 ? this.FLD76 : stringBuilder1.toString()).trim();
                if(s.length() > 0) {
                    if(!this.FLD78) {
                        s1 = this.FLD77 ? "" : null;
                    }
                    else if(stringBuilder0.length() > 0) {
                        s1 = stringBuilder0.toString();
                    }
                    else {
                        s1 = this.FLD80;
                    }
                    this.FLD74.MTH1111(s1, s);
                }
            }
            CLS12.MTH511(stringBuilder1);
            this.FLD76 = null;
            this.FLD75 = false;
            CLS12.MTH511(stringBuilder0);
            this.FLD80 = null;
            this.FLD78 = false;
            this.FLD77 = false;
        }
    }

    public static final class CLS88 extends CLS12 {
        public String FLD84;
        public final StringBuilder FLD85;

        public CLS88() {
            this.FLD85 = new StringBuilder();
            this.FLD87 = 4;
        }

        @Override
        public final String toString() {
            return "<!--" + (this.FLD84 == null ? this.FLD85.toString() : this.FLD84) + "-->";
        }

        @Override  // p.pkg3.CLS12
        public final void MTH507() {
            CLS12.MTH511(this.FLD85);
            this.FLD84 = null;
        }

        public final void MTH496(String s) {
            String s1 = this.FLD84;
            StringBuilder stringBuilder0 = this.FLD85;
            if(s1 != null) {
                stringBuilder0.append(s1);
                this.FLD84 = null;
            }
            if(stringBuilder0.length() == 0) {
                this.FLD84 = s;
                return;
            }
            stringBuilder0.append(s);
        }

        public final void MTH497(char c) {
            String s = this.FLD84;
            StringBuilder stringBuilder0 = this.FLD85;
            if(s != null) {
                stringBuilder0.append(s);
                this.FLD84 = null;
            }
            stringBuilder0.append(c);
        }
    }

    public static final class CLS201 extends CLS87 {
        public CLS201() {
            this.FLD87 = 2;
        }

        @Override
        public final String toString() {
            StringBuilder stringBuilder0;
            String s = "[unset]";
            if(!((CLS87)this).MTH482() || this.FLD74.FLD416 <= 0) {
                stringBuilder0 = new StringBuilder("<");
                String s2 = this.FLD83;
                if(s2 != null) {
                    s = s2;
                }
            }
            else {
                stringBuilder0 = new StringBuilder("<");
                String s1 = this.FLD83;
                if(s1 != null) {
                    s = s1;
                }
                stringBuilder0.append(s);
                stringBuilder0.append(" ");
                s = this.FLD74.toString();
            }
            stringBuilder0.append(s);
            stringBuilder0.append(">");
            return stringBuilder0.toString();
        }

        @Override  // p.pkg3.CLS12$CLS87
        public final void MTH507() {
            this.MTH485();
        }

        @Override  // p.pkg3.CLS12$CLS87
        public final CLS87 MTH485() {
            ((CLS87)this).super.MTH485();
            this.FLD74 = null;
            return this;
        }
    }

    public static class CLS89 extends CLS12 {
        public String FLD86;

        public CLS89() {
            this.FLD87 = 5;
        }

        @Override
        public String toString() {
            return this.FLD86;
        }

        @Override  // p.pkg3.CLS12
        public final void MTH507() {
            this.FLD86 = null;
        }
    }

    public int FLD87;

    public final boolean MTH506() {
        return this.FLD87 == 3;
    }

    public abstract void MTH507();

    public final boolean MTH508() {
        return this.FLD87 == 2;
    }

    public final boolean MTH509() {
        return this.FLD87 == 4;
    }

    public final boolean MTH510() {
        return this.FLD87 == 6;
    }

    public static void MTH511(StringBuilder stringBuilder0) {
        if(stringBuilder0 != null) {
            stringBuilder0.delete(0, stringBuilder0.length());
        }
    }

    public final boolean MTH512() {
        return this.FLD87 == 1;
    }
}

