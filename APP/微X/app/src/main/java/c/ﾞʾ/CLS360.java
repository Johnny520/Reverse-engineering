// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʾ;

import java.util.List;

public final class CLS360 {
    public final String FLD1625;
    public final int FLD1626;
    public final String FLD1627;
    public final List FLD1628;
    public Integer FLD1629;
    public Object FLD1630;
    public final int FLD1631;
    public final byte[] FLD1632;
    public Integer FLD1633;
    public int FLD1634;

    public CLS360(byte[] arr_b, String s, List list0, String s1) {
        this(arr_b, s, list0, s1, -1, -1);
    }

    public CLS360(byte[] arr_b, String s, List list0, String s1, int v, int v1) {
        this.FLD1632 = arr_b;
        this.FLD1634 = arr_b == null ? 0 : arr_b.length * 8;
        this.FLD1625 = s;
        this.FLD1628 = list0;
        this.FLD1627 = s1;
        this.FLD1626 = v1;
        this.FLD1631 = v;
    }

    public int MTH4963() {
        return this.FLD1634;
    }

    public boolean MTH4964() {
        return this.FLD1626 >= 0 && this.FLD1631 >= 0;
    }

    public void MTH4965(int v) {
        this.FLD1634 = v;
    }

    public byte[] MTH4966() {
        return this.FLD1632;
    }

    public void MTH4967(Object object0) {
        this.FLD1630 = object0;
    }

    public Object MTH4968() {
        return this.FLD1630;
    }

    public void MTH4969(Integer integer0) {
        this.FLD1629 = integer0;
    }

    public int MTH4970() {
        return this.FLD1626;
    }

    public String MTH4971() {
        return this.FLD1625;
    }

    public void MTH4972(Integer integer0) {
        this.FLD1633 = integer0;
    }

    public List MTH4973() {
        return this.FLD1628;
    }

    public int MTH4974() {
        return this.FLD1631;
    }

    public String MTH4975() {
        return this.FLD1627;
    }
}

