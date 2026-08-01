// Decompiled by JEB v5.42.0.202606242140

package c.ˆᵢ;

public final class CLS79 {
    public final int[] FLD420;
    public final CLS80 FLD421;

    public CLS79(CLS80 ˆٴ0, int[] arr_v) {
        if(arr_v.length == 0) {
            throw new IllegalArgumentException();
        }
        this.FLD421 = ˆٴ0;
        if(arr_v.length > 1 && arr_v[0] == 0) {
            int v;
            for(v = 1; v < arr_v.length && arr_v[v] == 0; ++v) {
            }
            if(v == arr_v.length) {
                this.FLD420 = new int[]{0};
                return;
            }
            int[] arr_v1 = new int[arr_v.length - v];
            this.FLD420 = arr_v1;
            System.arraycopy(arr_v, v, arr_v1, 0, arr_v1.length);
            return;
        }
        this.FLD420 = arr_v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.MTH1885() * 8);
        for(int v = this.MTH1885(); v >= 0; --v) {
            int v1 = this.MTH1886(v);
            if(v1 != 0) {
                if(v1 < 0) {
                    stringBuilder0.append(" - ");
                    v1 = -v1;
                }
                else if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(" + ");
                }
                if(v == 0 || v1 != 1) {
                    int v2 = this.FLD421.MTH1893(v1);
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

    public CLS79[] MTH1877(CLS79 ʻᵢ0) {
        if(!this.FLD421.equals(ʻᵢ0.FLD421)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if(ʻᵢ0.MTH1883()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        CLS79 ʻᵢ1 = this.FLD421.MTH1896();
        int v = ʻᵢ0.MTH1886(ʻᵢ0.MTH1885());
        int v1 = this.FLD421.MTH1897(v);
        CLS79 ʻᵢ2;
        for(ʻᵢ2 = this; ʻᵢ2.MTH1885() >= ʻᵢ0.MTH1885() && !ʻᵢ2.MTH1883(); ʻᵢ2 = ʻᵢ2.MTH1879(ʻᵢ3)) {
            int v2 = ʻᵢ2.MTH1885() - ʻᵢ0.MTH1885();
            int v3 = ʻᵢ2.MTH1886(ʻᵢ2.MTH1885());
            int v4 = this.FLD421.MTH1894(v3, v1);
            CLS79 ʻᵢ3 = ʻᵢ0.MTH1881(v2, v4);
            ʻᵢ1 = ʻᵢ1.MTH1879(this.FLD421.MTH1890(v2, v4));
        }
        return new CLS79[]{ʻᵢ1, ʻᵢ2};
    }

    public int[] MTH1878() {
        return this.FLD420;
    }

    public CLS79 MTH1879(CLS79 ʻᵢ0) {
        if(!this.FLD421.equals(ʻᵢ0.FLD421)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if(this.MTH1883()) {
            return ʻᵢ0;
        }
        if(ʻᵢ0.MTH1883()) {
            return this;
        }
        int[] arr_v = this.FLD420;
        int[] arr_v1 = ʻᵢ0.FLD420;
        if(arr_v.length <= arr_v1.length) {
            int[] arr_v2 = arr_v;
            arr_v = arr_v1;
            arr_v1 = arr_v2;
        }
        int[] arr_v3 = new int[arr_v.length];
        int v = arr_v.length - arr_v1.length;
        System.arraycopy(arr_v, 0, arr_v3, 0, v);
        for(int v1 = v; v1 < arr_v.length; ++v1) {
            arr_v3[v1] = CLS80.MTH1892(arr_v1[v1 - v], arr_v[v1]);
        }
        return new CLS79(this.FLD421, arr_v3);
    }

    public CLS79 MTH1880(CLS79 ʻᵢ0) {
        if(!this.FLD421.equals(ʻᵢ0.FLD421)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if(!this.MTH1883() && !ʻᵢ0.MTH1883()) {
            int[] arr_v = this.FLD420;
            int[] arr_v1 = ʻᵢ0.FLD420;
            int[] arr_v2 = new int[arr_v.length + arr_v1.length - 1];
            for(int v = 0; v < arr_v.length; ++v) {
                int v1 = arr_v[v];
                for(int v2 = 0; v2 < arr_v1.length; ++v2) {
                    arr_v2[v + v2] = CLS80.MTH1892(arr_v2[v + v2], this.FLD421.MTH1894(v1, arr_v1[v2]));
                }
            }
            return new CLS79(this.FLD421, arr_v2);
        }
        return this.FLD421.MTH1896();
    }

    public CLS79 MTH1881(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        if(v1 == 0) {
            return this.FLD421.MTH1896();
        }
        int[] arr_v = new int[v + this.FLD420.length];
        for(int v2 = 0; v2 < this.FLD420.length; ++v2) {
            arr_v[v2] = this.FLD421.MTH1894(this.FLD420[v2], v1);
        }
        return new CLS79(this.FLD421, arr_v);
    }

    public int MTH1882(int v) {
        if(v == 0) {
            return this.MTH1886(0);
        }
        if(v == 1) {
            int[] arr_v = this.FLD420;
            int v3 = 0;
            for(int v2 = 0; v2 < arr_v.length; ++v2) {
                v3 = CLS80.MTH1892(v3, arr_v[v2]);
            }
            return v3;
        }
        int v4 = this.FLD420[0];
        for(int v1 = 1; v1 < this.FLD420.length; ++v1) {
            v4 = CLS80.MTH1892(this.FLD421.MTH1894(v, v4), this.FLD420[v1]);
        }
        return v4;
    }

    public boolean MTH1883() {
        return this.FLD420[0] == 0;
    }

    public CLS79 MTH1884(int v) {
        if(v == 0) {
            return this.FLD421.MTH1896();
        }
        if(v == 1) {
            return this;
        }
        int[] arr_v = new int[this.FLD420.length];
        for(int v1 = 0; v1 < this.FLD420.length; ++v1) {
            arr_v[v1] = this.FLD421.MTH1894(this.FLD420[v1], v);
        }
        return new CLS79(this.FLD421, arr_v);
    }

    public int MTH1885() {
        return this.FLD420.length - 1;
    }

    public int MTH1886(int v) {
        return this.FLD420[this.FLD420.length - 1 - v];
    }
}

