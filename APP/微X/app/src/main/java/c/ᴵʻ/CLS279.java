// Decompiled by JEB v5.42.0.202606242140

package c.ᴵʻ;

import c.ﾞʾ.CLS365;

public abstract class CLS279 {
    public final CLS365 FLD1095;
    public final CLS276 FLD1096;

    public CLS279(CLS365 ⁱˋ0) {
        this.FLD1095 = ⁱˋ0;
        this.FLD1096 = new CLS276(ⁱˋ0);
    }

    public final CLS365 MTH3572() {
        return this.FLD1095;
    }

    public abstract String MTH3573();

    public static CLS279 MTH3574(CLS365 ⁱˋ0) {
        if(ⁱˋ0.MTH5018(1)) {
            return new CLS838(ⁱˋ0);
        }
        if(!ⁱˋ0.MTH5018(2)) {
            return new CLS587(ⁱˋ0);
        }
        switch(CLS276.MTH3554(ⁱˋ0, 1, 4)) {
            case 4: {
                return new CLS851(ⁱˋ0);
            }
            case 5: {
                return new CLS852(ⁱˋ0);
            }
            default: {
                switch(CLS276.MTH3554(ⁱˋ0, 1, 5)) {
                    case 12: {
                        return new CLS835(ⁱˋ0);
                    }
                    case 13: {
                        return new CLS837(ⁱˋ0);
                    }
                    default: {
                        switch(CLS276.MTH3554(ⁱˋ0, 1, 7)) {
                            case 56: {
                                return new CLS848(ⁱˋ0, "310", "11");
                            }
                            case 57: {
                                return new CLS848(ⁱˋ0, "320", "11");
                            }
                            case 58: {
                                return new CLS848(ⁱˋ0, "310", "13");
                            }
                            case 59: {
                                return new CLS848(ⁱˋ0, "320", "13");
                            }
                            case 60: {
                                return new CLS848(ⁱˋ0, "310", "15");
                            }
                            case 61: {
                                return new CLS848(ⁱˋ0, "320", "15");
                            }
                            case 62: {
                                return new CLS848(ⁱˋ0, "310", "17");
                            }
                            case 0x3F: {
                                return new CLS848(ⁱˋ0, "320", "17");
                            }
                            default: {
                                throw new IllegalStateException("unknown decoder: " + ⁱˋ0);
                            }
                        }
                    }
                }
            }
        }
    }

    public final CLS276 MTH3575() {
        return this.FLD1096;
    }
}

