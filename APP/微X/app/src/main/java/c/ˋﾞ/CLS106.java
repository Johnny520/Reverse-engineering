// Decompiled by JEB v5.42.0.202606242140

package c.ˋﾞ;

public final class CLS106 {
    public final CLS105 FLD367;
    public final int[] FLD368;

    public CLS106(CLS105 ⁱˋ0, int[] arr_v) {
        if(arr_v.length == 0) {
            throw new IllegalArgumentException();
        }
        this.FLD367 = ⁱˋ0;
        if(arr_v.length > 1 && arr_v[0] == 0) {
            int v;
            for(v = 1; v < arr_v.length && arr_v[v] == 0; ++v) {
            }
            if(v == arr_v.length) {
                this.FLD368 = new int[]{0};
                return;
            }
            int[] arr_v1 = new int[arr_v.length - v];
            this.FLD368 = arr_v1;
            System.arraycopy(arr_v, v, arr_v1, 0, arr_v1.length);
            return;
        }
        this.FLD368 = arr_v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.MTH1430() * 8);
        for(int v = this.MTH1430(); v >= 0; --v) {
            int v1 = this.MTH1429(v);
            if(v1 != 0) {
                if(v1 < 0) {
                    stringBuilder0.append(" - ");
                    v1 = -v1;
                }
                else if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(" + ");
                }
                if(v == 0 || v1 != 1) {
                    int v2 = this.FLD367.MTH1415(v1);
                    if(v2 == 0) {
                        stringBuilder0.append('1');
                    }
                    else if(v2 == 1) {
                        stringBuilder0.append('a');
                    }
                    else {
                        stringBuilder0.append("a^");
                        stringBuilder0.append(v2);
                    }
                }
                if(v != 0) {
                    if(v == 1) {
                        stringBuilder0.append('x');
                    }
                    else {
                        stringBuilder0.append("x^");
                        stringBuilder0.append(v);
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    public int MTH1426(int v) {
        if(v == 0) {
            return this.MTH1429(0);
        }
        if(v == 1) {
            int[] arr_v = this.FLD368;
            int v3 = 0;
            for(int v2 = 0; v2 < arr_v.length; ++v2) {
                v3 = CLS105.MTH1421(v3, arr_v[v2]);
            }
            return v3;
        }
        int v4 = this.FLD368[0];
        for(int v1 = 1; v1 < this.FLD368.length; ++v1) {
            v4 = CLS105.MTH1421(this.FLD367.MTH1420(v, v4), this.FLD368[v1]);
        }
        return v4;
    }

    public CLS106 MTH1427(CLS106 ﾞⁱ0) {
        if(!this.FLD367.equals(ﾞⁱ0.FLD367)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if(!this.MTH1434() && !ﾞⁱ0.MTH1434()) {
            int[] arr_v = this.FLD368;
            int[] arr_v1 = ﾞⁱ0.FLD368;
            int[] arr_v2 = new int[arr_v.length + arr_v1.length - 1];
            for(int v = 0; v < arr_v.length; ++v) {
                int v1 = arr_v[v];
                for(int v2 = 0; v2 < arr_v1.length; ++v2) {
                    arr_v2[v + v2] = CLS105.MTH1421(arr_v2[v + v2], this.FLD367.MTH1420(v1, arr_v1[v2]));
                }
            }
            return new CLS106(this.FLD367, arr_v2);
        }
        return this.FLD367.MTH1422();
    }

    public int[] MTH1428() {
        return this.FLD368;
    }

    public int MTH1429(int v) {
        return this.FLD368[this.FLD368.length - 1 - v];
    }

    public int MTH1430() {
        return this.FLD368.length - 1;
    }

    public CLS106 MTH1431(int v) {
        if(v == 0) {
            return this.FLD367.MTH1422();
        }
        if(v == 1) {
            return this;
        }
        int[] arr_v = new int[this.FLD368.length];
        for(int v1 = 0; v1 < this.FLD368.length; ++v1) {
            arr_v[v1] = this.FLD367.MTH1420(this.FLD368[v1], v);
        }
        return new CLS106(this.FLD367, arr_v);
    }

    public CLS106 MTH1432(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        if(v1 == 0) {
            return this.FLD367.MTH1422();
        }
        int[] arr_v = new int[v + this.FLD368.length];
        for(int v2 = 0; v2 < this.FLD368.length; ++v2) {
            arr_v[v2] = this.FLD367.MTH1420(this.FLD368[v2], v1);
        }
        return new CLS106(this.FLD367, arr_v);
    }

    public CLS106 MTH1433(CLS106 ﾞⁱ0) {
        if(!this.FLD367.equals(ﾞⁱ0.FLD367)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if(this.MTH1434()) {
            return ﾞⁱ0;
        }
        if(ﾞⁱ0.MTH1434()) {
            return this;
        }
        int[] arr_v = this.FLD368;
        int[] arr_v1 = ﾞⁱ0.FLD368;
        if(arr_v.length <= arr_v1.length) {
            int[] arr_v2 = arr_v;
            arr_v = arr_v1;
            arr_v1 = arr_v2;
        }
        int[] arr_v3 = new int[arr_v.length];
        int v = arr_v.length - arr_v1.length;
        System.arraycopy(arr_v, 0, arr_v3, 0, v);
        for(int v1 = v; v1 < arr_v.length; ++v1) {
            arr_v3[v1] = CLS105.MTH1421(arr_v1[v1 - v], arr_v[v1]);
        }
        return new CLS106(this.FLD367, arr_v3);
    }

    public boolean MTH1434() {
        return this.FLD368[0] == 0;
    }

    public CLS106[] MTH1435(CLS106 ﾞⁱ0) {
        if(!this.FLD367.equals(ﾞⁱ0.FLD367)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if(ﾞⁱ0.MTH1434()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        CLS106 ﾞⁱ1 = this.FLD367.MTH1422();
        int v = ﾞⁱ0.MTH1429(ﾞⁱ0.MTH1430());
        int v1 = this.FLD367.MTH1419(v);
        CLS106 ﾞⁱ2;
        for(ﾞⁱ2 = this; ﾞⁱ2.MTH1430() >= ﾞⁱ0.MTH1430() && !ﾞⁱ2.MTH1434(); ﾞⁱ2 = ﾞⁱ2.MTH1433(ﾞⁱ3)) {
            int v2 = ﾞⁱ2.MTH1430() - ﾞⁱ0.MTH1430();
            int v3 = ﾞⁱ2.MTH1429(ﾞⁱ2.MTH1430());
            int v4 = this.FLD367.MTH1420(v3, v1);
            CLS106 ﾞⁱ3 = ﾞⁱ0.MTH1432(v2, v4);
            ﾞⁱ1 = ﾞⁱ1.MTH1433(this.FLD367.MTH1423(v2, v4));
        }
        return new CLS106[]{ﾞⁱ1, ﾞⁱ2};
    }
}

