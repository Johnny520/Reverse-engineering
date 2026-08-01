// Decompiled by JEB v5.42.0.202606242140

package c.ʽˉ;

import c.ˎˊ.CLS118;

public abstract class CLS41 {
    public final CLS44 FLD157;
    public final CLS118 FLD158;

    public CLS41(CLS118 ˆٴ0) {
        this.FLD158 = ˆٴ0;
        this.FLD157 = new CLS44(ˆٴ0);
    }

    public final CLS44 MTH941() {
        return this.FLD157;
    }

    public static CLS41 MTH942(CLS118 ˆٴ0) {
        if(ˆٴ0.MTH2357(1)) {
            return new CLS829(ˆٴ0);
        }
        if(!ˆٴ0.MTH2357(2)) {
            return new CLS409(ˆٴ0);
        }
        switch(CLS44.MTH972(ˆٴ0, 1, 4)) {
            case 4: {
                return new CLS851(ˆٴ0);
            }
            case 5: {
                return new CLS850(ˆٴ0);
            }
            default: {
                switch(CLS44.MTH972(ˆٴ0, 1, 5)) {
                    case 12: {
                        return new CLS828(ˆٴ0);
                    }
                    case 13: {
                        return new CLS830(ˆٴ0);
                    }
                    default: {
                        switch(CLS44.MTH972(ˆٴ0, 1, 7)) {
                            case 56: {
                                return new CLS843(ˆٴ0, "310", "11");
                            }
                            case 57: {
                                return new CLS843(ˆٴ0, "320", "11");
                            }
                            case 58: {
                                return new CLS843(ˆٴ0, "310", "13");
                            }
                            case 59: {
                                return new CLS843(ˆٴ0, "320", "13");
                            }
                            case 60: {
                                return new CLS843(ˆٴ0, "310", "15");
                            }
                            case 61: {
                                return new CLS843(ˆٴ0, "320", "15");
                            }
                            case 62: {
                                return new CLS843(ˆٴ0, "310", "17");
                            }
                            case 0x3F: {
                                return new CLS843(ˆٴ0, "320", "17");
                            }
                            default: {
                                throw new IllegalStateException("unknown decoder: " + ˆٴ0);
                            }
                        }
                    }
                }
            }
        }
    }

    public final CLS118 MTH943() {
        return this.FLD158;
    }

    public abstract String MTH944();
}

