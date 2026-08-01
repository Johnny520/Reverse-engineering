// Decompiled by JEB v5.42.0.202606242140

package p.pkg3;

public final class CLS7 {
    public final String FLD29;
    public final String FLD30;

    public CLS7(CLS13 ٴʼ0, String s) {
        ٴʼ0.getClass();
        this.FLD29 = ٴʼ0.MTH515();
        this.FLD30 = s;
    }

    public CLS7(CLS13 ٴʼ0, String s, Object[] arr_object) {
        ٴʼ0.getClass();
        this.FLD29 = ٴʼ0.MTH515();
        this.FLD30 = String.format(s, arr_object);
    }

    @Override
    public final String toString() {
        return "<" + this.FLD29 + ">: " + this.FLD30;
    }
}

