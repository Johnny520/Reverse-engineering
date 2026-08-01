// Decompiled by JEB v5.42.0.202606242140

package c.ʻﹶ;

public final class CLS31 {
    public final int[] FLD128;
    public final CLS29 FLD129;

    public CLS31(CLS29 ʻᵢ0, int[] arr_v) {
        if(arr_v.length == 0) {
            throw new IllegalArgumentException();
        }
        this.FLD129 = ʻᵢ0;
        if(arr_v.length > 1 && arr_v[0] == 0) {
            int v;
            for(v = 1; v < arr_v.length && arr_v[v] == 0; ++v) {
            }
            if(v == arr_v.length) {
                this.FLD128 = new int[]{0};
                return;
            }
            int[] arr_v1 = new int[arr_v.length - v];
            this.FLD128 = arr_v1;
            System.arraycopy(arr_v, v, arr_v1, 0, arr_v1.length);
            return;
        }
        this.FLD128 = arr_v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.MTH830() * 8);
        for(int v = this.MTH830(); v >= 0; --v) {
            int v1 = this.MTH826(v);
            if(v1 != 0) {
                if(v1 < 0) {
                    stringBuilder0.append(" - ");
                    v1 = -v1;
                }
                else if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(" + ");
                }
                if(v == 0 || v1 != 1) {
                    stringBuilder0.append(v1);
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

    public int MTH821(int v) {
        if(v == 0) {
            return this.MTH826(0);
        }
        if(v == 1) {
            int[] arr_v = this.FLD128;
            int v3 = 0;
            for(int v2 = 0; v2 < arr_v.length; ++v2) {
                v3 = this.FLD129.MTH806(v3, arr_v[v2]);
            }
            return v3;
        }
        int v4 = this.FLD128[0];
        for(int v1 = 1; v1 < this.FLD128.length; ++v1) {
            int v5 = this.FLD129.MTH807(v, v4);
            v4 = this.FLD129.MTH806(v5, this.FLD128[v1]);
        }
        return v4;
    }

    public boolean MTH822() {
        return this.FLD128[0] == 0;
    }

    public CLS31 MTH823(CLS31 ـᵎ0) {
        if(!this.FLD129.equals(ـᵎ0.FLD129)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if(this.MTH822()) {
            return ـᵎ0;
        }
        if(ـᵎ0.MTH822()) {
            return this;
        }
        int[] arr_v = this.FLD128;
        int[] arr_v1 = ـᵎ0.FLD128;
        if(arr_v.length <= arr_v1.length) {
            int[] arr_v2 = arr_v;
            arr_v = arr_v1;
            arr_v1 = arr_v2;
        }
        int[] arr_v3 = new int[arr_v.length];
        int v = arr_v.length - arr_v1.length;
        System.arraycopy(arr_v, 0, arr_v3, 0, v);
        for(int v1 = v; v1 < arr_v.length; ++v1) {
            arr_v3[v1] = this.FLD129.MTH806(arr_v1[v1 - v], arr_v[v1]);
        }
        return new CLS31(this.FLD129, arr_v3);
    }

    public CLS31 MTH824() {
        int[] arr_v = new int[this.FLD128.length];
        for(int v = 0; v < this.FLD128.length; ++v) {
            arr_v[v] = this.FLD129.MTH808(0, this.FLD128[v]);
        }
        return new CLS31(this.FLD129, arr_v);
    }

    public CLS31 MTH825(CLS31 ـᵎ0) {
        if(!this.FLD129.equals(ـᵎ0.FLD129)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        return ـᵎ0.MTH822() ? this : this.MTH823(ـᵎ0.MTH824());
    }

    public int MTH826(int v) {
        return this.FLD128[this.FLD128.length - 1 - v];
    }

    public CLS31 MTH827(CLS31 ـᵎ0) {
        if(!this.FLD129.equals(ـᵎ0.FLD129)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if(!this.MTH822() && !ـᵎ0.MTH822()) {
            int[] arr_v = this.FLD128;
            int[] arr_v1 = ـᵎ0.FLD128;
            int[] arr_v2 = new int[arr_v.length + arr_v1.length - 1];
            for(int v = 0; v < arr_v.length; ++v) {
                int v1 = arr_v[v];
                for(int v2 = 0; v2 < arr_v1.length; ++v2) {
                    int v3 = v + v2;
                    int v4 = arr_v2[v3];
                    int v5 = this.FLD129.MTH807(v1, arr_v1[v2]);
                    arr_v2[v3] = this.FLD129.MTH806(v4, v5);
                }
            }
            return new CLS31(this.FLD129, arr_v2);
        }
        return this.FLD129.MTH812();
    }

    public CLS31 MTH828(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        if(v1 == 0) {
            return this.FLD129.MTH812();
        }
        int[] arr_v = new int[v + this.FLD128.length];
        for(int v2 = 0; v2 < this.FLD128.length; ++v2) {
            arr_v[v2] = this.FLD129.MTH807(this.FLD128[v2], v1);
        }
        return new CLS31(this.FLD129, arr_v);
    }

    public CLS31 MTH829(int v) {
        if(v == 0) {
            return this.FLD129.MTH812();
        }
        if(v == 1) {
            return this;
        }
        int[] arr_v = new int[this.FLD128.length];
        for(int v1 = 0; v1 < this.FLD128.length; ++v1) {
            arr_v[v1] = this.FLD129.MTH807(this.FLD128[v1], v);
        }
        return new CLS31(this.FLD129, arr_v);
    }

    public int MTH830() {
        return this.FLD128.length - 1;
    }
}

