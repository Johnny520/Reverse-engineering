// Decompiled by JEB v5.42.0.202606242140

package c.ˏـ;

import java.util.ArrayList;
import java.util.List;

public final class CLS117 {
    public final List FLD464;
    public final List FLD465;

    public CLS117() {
        this.FLD464 = new ArrayList();
        this.FLD465 = new ArrayList();
    }

    public String MTH1740(String s) {
        this.MTH1742();
        int v = Integer.parseInt(s.substring(0, 3));
        int v1 = this.FLD464.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            int[] arr_v = (int[])this.FLD464.get(v2);
            int v3 = arr_v[0];
            if(v < v3) {
                return null;
            }
            if(arr_v.length != 1) {
                v3 = arr_v[1];
            }
            if(v <= v3) {
                return (String)this.FLD465.get(v2);
            }
        }
        return null;
    }

    public final void MTH1741(int[] arr_v, String s) {
        this.FLD464.add(arr_v);
        this.FLD465.add(s);
    }

    public final void MTH1742() {
        synchronized(this) {
            if(!this.FLD464.isEmpty()) {
                return;
            }
            this.MTH1741(new int[]{0, 19}, "US/CA");
            this.MTH1741(new int[]{30, 39}, "US");
            this.MTH1741(new int[]{60, 0x8B}, "US/CA");
            this.MTH1741(new int[]{300, 379}, "FR");
            this.MTH1741(new int[]{380}, "BG");
            this.MTH1741(new int[]{0x17F}, "SI");
            this.MTH1741(new int[]{385}, "HR");
            this.MTH1741(new int[]{387}, "BA");
            this.MTH1741(new int[]{400, 440}, "DE");
            this.MTH1741(new int[]{450, 459}, "JP");
            this.MTH1741(new int[]{460, 469}, "RU");
            this.MTH1741(new int[]{471}, "TW");
            this.MTH1741(new int[]{474}, "EE");
            this.MTH1741(new int[]{475}, "LV");
            this.MTH1741(new int[]{476}, "AZ");
            this.MTH1741(new int[]{477}, "LT");
            this.MTH1741(new int[]{478}, "UZ");
            this.MTH1741(new int[]{0x1DF}, "LK");
            this.MTH1741(new int[]{480}, "PH");
            this.MTH1741(new int[]{481}, "BY");
            this.MTH1741(new int[]{482}, "UA");
            this.MTH1741(new int[]{484}, "MD");
            this.MTH1741(new int[]{485}, "AM");
            this.MTH1741(new int[]{486}, "GE");
            this.MTH1741(new int[]{487}, "KZ");
            this.MTH1741(new int[]{489}, "HK");
            this.MTH1741(new int[]{490, 0x1F3}, "JP");
            this.MTH1741(new int[]{500, 509}, "GB");
            this.MTH1741(new int[]{520}, "GR");
            this.MTH1741(new int[]{0x210}, "LB");
            this.MTH1741(new int[]{529}, "CY");
            this.MTH1741(new int[]{531}, "MK");
            this.MTH1741(new int[]{535}, "MT");
            this.MTH1741(new int[]{539}, "IE");
            this.MTH1741(new int[]{540, 549}, "BE/LU");
            this.MTH1741(new int[]{560}, "PT");
            this.MTH1741(new int[]{569}, "IS");
            this.MTH1741(new int[]{570, 579}, "DK");
            this.MTH1741(new int[]{590}, "PL");
            this.MTH1741(new int[]{594}, "RO");
            this.MTH1741(new int[]{599}, "HU");
            this.MTH1741(new int[]{600, 601}, "ZA");
            this.MTH1741(new int[]{603}, "GH");
            this.MTH1741(new int[]{608}, "BH");
            this.MTH1741(new int[]{609}, "MU");
            this.MTH1741(new int[]{611}, "MA");
            this.MTH1741(new int[]{613}, "DZ");
            this.MTH1741(new int[]{616}, "KE");
            this.MTH1741(new int[]{618}, "CI");
            this.MTH1741(new int[]{619}, "TN");
            this.MTH1741(new int[]{621}, "SY");
            this.MTH1741(new int[]{622}, "EG");
            this.MTH1741(new int[]{0x270}, "LY");
            this.MTH1741(new int[]{625}, "JO");
            this.MTH1741(new int[]{626}, "IR");
            this.MTH1741(new int[]{627}, "KW");
            this.MTH1741(new int[]{628}, "SA");
            this.MTH1741(new int[]{629}, "AE");
            this.MTH1741(new int[]{640, 649}, "FI");
            this.MTH1741(new int[]{690, 695}, "CN");
            this.MTH1741(new int[]{700, 709}, "NO");
            this.MTH1741(new int[]{729}, "IL");
            this.MTH1741(new int[]{730, 739}, "SE");
            this.MTH1741(new int[]{740}, "GT");
            this.MTH1741(new int[]{741}, "SV");
            this.MTH1741(new int[]{742}, "HN");
            this.MTH1741(new int[]{743}, "NI");
            this.MTH1741(new int[]{744}, "CR");
            this.MTH1741(new int[]{745}, "PA");
            this.MTH1741(new int[]{746}, "DO");
            this.MTH1741(new int[]{750}, "MX");
            this.MTH1741(new int[]{0x2F2, 0x2F3}, "CA");
            this.MTH1741(new int[]{0x2F7}, "VE");
            this.MTH1741(new int[]{760, 0x301}, "CH");
            this.MTH1741(new int[]{770}, "CO");
            this.MTH1741(new int[]{0x305}, "UY");
            this.MTH1741(new int[]{0x307}, "PE");
            this.MTH1741(new int[]{0x309}, "BO");
            this.MTH1741(new int[]{0x30B}, "AR");
            this.MTH1741(new int[]{780}, "CL");
            this.MTH1741(new int[]{0x310}, "PY");
            this.MTH1741(new int[]{785}, "PE");
            this.MTH1741(new int[]{786}, "EC");
            this.MTH1741(new int[]{789, 790}, "BR");
            this.MTH1741(new int[]{800, 839}, "IT");
            this.MTH1741(new int[]{840, 849}, "ES");
            this.MTH1741(new int[]{850}, "CU");
            this.MTH1741(new int[]{858}, "SK");
            this.MTH1741(new int[]{859}, "CZ");
            this.MTH1741(new int[]{860}, "YU");
            this.MTH1741(new int[]{865}, "MN");
            this.MTH1741(new int[]{867}, "KP");
            this.MTH1741(new int[]{868, 869}, "TR");
            this.MTH1741(new int[]{870, 0x36F}, "NL");
            this.MTH1741(new int[]{880}, "KR");
            this.MTH1741(new int[]{885}, "TH");
            this.MTH1741(new int[]{888}, "SG");
            this.MTH1741(new int[]{890}, "IN");
            this.MTH1741(new int[]{893}, "VN");
            this.MTH1741(new int[]{0x380}, "PK");
            this.MTH1741(new int[]{899}, "ID");
            this.MTH1741(new int[]{900, 919}, "AT");
            this.MTH1741(new int[]{930, 939}, "AU");
            this.MTH1741(new int[]{940, 949}, "AZ");
            this.MTH1741(new int[]{955}, "MY");
            this.MTH1741(new int[]{958}, "MO");
        }
    }
}

