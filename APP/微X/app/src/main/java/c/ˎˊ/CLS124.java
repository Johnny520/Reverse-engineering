// Decompiled by JEB v5.42.0.202606242140

package c.ˎˊ;

import java.util.List;

public final class CLS124 {
    public int FLD591;
    public final String FLD592;
    public final byte[] FLD593;
    public final int FLD594;
    public final int FLD595;
    public final String FLD596;
    public Integer FLD597;
    public Object FLD598;
    public Integer FLD599;
    public final List FLD600;

    public CLS124(byte[] arr_b, String s, List list0, String s1) {
        this(arr_b, s, list0, s1, -1, -1);
    }

    public CLS124(byte[] arr_b, String s, List list0, String s1, int v, int v1) {
        this.FLD593 = arr_b;
        this.FLD591 = arr_b == null ? 0 : arr_b.length * 8;
        this.FLD596 = s;
        this.FLD600 = list0;
        this.FLD592 = s1;
        this.FLD594 = v1;
        this.FLD595 = v;
    }

    public String MTH2399() {
        return this.FLD592;
    }

    public void MTH2400(int v) {
        this.FLD591 = v;
    }

    public byte[] MTH2401() {
        return this.FLD593;
    }

    public List MTH2402() {
        return this.FLD600;
    }

    public void MTH2403(Integer integer0) {
        this.FLD599 = integer0;
    }

    public boolean MTH2404() {
        return this.FLD594 >= 0 && this.FLD595 >= 0;
    }

    public void MTH2405(Integer integer0) {
        this.FLD597 = integer0;
    }

    public void MTH2406(Object object0) {
        this.FLD598 = object0;
    }

    public int MTH2407() {
        return this.FLD591;
    }

    public int MTH2408() {
        return this.FLD595;
    }

    public String MTH2409() {
        return this.FLD596;
    }

    public int MTH2410() {
        return this.FLD594;
    }

    public Object MTH2411() {
        return this.FLD598;
    }
}

