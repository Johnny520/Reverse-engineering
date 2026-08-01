// Decompiled by JEB v5.42.0.202606242140

package c.ʻٴ;

public final class CLS20 {
    public final CLS22 FLD106;
    public final int[] FLD107;

    public CLS20(CLS22 ﾞⁱ0, int[] arr_v) {
        if(arr_v.length == 0) {
            throw new IllegalArgumentException();
        }
        this.FLD106 = ﾞⁱ0;
        if(arr_v.length > 1 && arr_v[0] == 0) {
            int v;
            for(v = 1; v < arr_v.length && arr_v[v] == 0; ++v) {
            }
            if(v == arr_v.length) {
                this.FLD107 = new int[]{0};
                return;
            }
            int[] arr_v1 = new int[arr_v.length - v];
            this.FLD107 = arr_v1;
            System.arraycopy(arr_v, v, arr_v1, 0, arr_v1.length);
            return;
        }
        this.FLD107 = arr_v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.MTH759() * 8);
        for(int v = this.MTH759(); v >= 0; --v) {
            int v1 = this.MTH756(v);
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

    public int MTH756(int v) {
        return this.FLD107[this.FLD107.length - 1 - v];
    }

    public CLS20 MTH757() {
        int[] arr_v = new int[this.FLD107.length];
        for(int v = 0; v < this.FLD107.length; ++v) {
            arr_v[v] = this.FLD106.MTH779(0, this.FLD107[v]);
        }
        return new CLS20(this.FLD106, arr_v);
    }

    public boolean MTH758() {
        return this.FLD107[0] == 0;
    }

    public int MTH759() {
        return this.FLD107.length - 1;
    }

    public CLS20 MTH760(int v) {
        if(v == 0) {
            return this.FLD106.MTH777();
        }
        if(v == 1) {
            return this;
        }
        int[] arr_v = new int[this.FLD107.length];
        for(int v1 = 0; v1 < this.FLD107.length; ++v1) {
            arr_v[v1] = this.FLD106.MTH774(this.FLD107[v1], v);
        }
        return new CLS20(this.FLD106, arr_v);
    }

    public CLS20 MTH761(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        if(v1 == 0) {
            return this.FLD106.MTH777();
        }
        int[] arr_v = new int[v + this.FLD107.length];
        for(int v2 = 0; v2 < this.FLD107.length; ++v2) {
            arr_v[v2] = this.FLD106.MTH774(this.FLD107[v2], v1);
        }
        return new CLS20(this.FLD106, arr_v);
    }

    public CLS20 MTH762(CLS20 ʾʻ0) {
        if(!this.FLD106.equals(ʾʻ0.FLD106)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        return ʾʻ0.MTH758() ? this : this.MTH763(ʾʻ0.MTH757());
    }

    public CLS20 MTH763(CLS20 ʾʻ0) {
        if(!this.FLD106.equals(ʾʻ0.FLD106)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if(this.MTH758()) {
            return ʾʻ0;
        }
        if(ʾʻ0.MTH758()) {
            return this;
        }
        int[] arr_v = this.FLD107;
        int[] arr_v1 = ʾʻ0.FLD107;
        if(arr_v.length <= arr_v1.length) {
            int[] arr_v2 = arr_v;
            arr_v = arr_v1;
            arr_v1 = arr_v2;
        }
        int[] arr_v3 = new int[arr_v.length];
        int v = arr_v.length - arr_v1.length;
        System.arraycopy(arr_v, 0, arr_v3, 0, v);
        for(int v1 = v; v1 < arr_v.length; ++v1) {
            arr_v3[v1] = this.FLD106.MTH780(arr_v1[v1 - v], arr_v[v1]);
        }
        return new CLS20(this.FLD106, arr_v3);
    }

    public CLS20 MTH764(CLS20 ʾʻ0) {
        if(!this.FLD106.equals(ʾʻ0.FLD106)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if(!this.MTH758() && !ʾʻ0.MTH758()) {
            int[] arr_v = this.FLD107;
            int[] arr_v1 = ʾʻ0.FLD107;
            int[] arr_v2 = new int[arr_v.length + arr_v1.length - 1];
            for(int v = 0; v < arr_v.length; ++v) {
                int v1 = arr_v[v];
                for(int v2 = 0; v2 < arr_v1.length; ++v2) {
                    int v3 = v + v2;
                    int v4 = arr_v2[v3];
                    int v5 = this.FLD106.MTH774(v1, arr_v1[v2]);
                    arr_v2[v3] = this.FLD106.MTH780(v4, v5);
                }
            }
            return new CLS20(this.FLD106, arr_v2);
        }
        return this.FLD106.MTH777();
    }

    public int MTH765(int v) {
        if(v == 0) {
            return this.MTH756(0);
        }
        if(v == 1) {
            int[] arr_v = this.FLD107;
            int v3 = 0;
            for(int v2 = 0; v2 < arr_v.length; ++v2) {
                v3 = this.FLD106.MTH780(v3, arr_v[v2]);
            }
            return v3;
        }
        int v4 = this.FLD107[0];
        for(int v1 = 1; v1 < this.FLD107.length; ++v1) {
            int v5 = this.FLD106.MTH774(v, v4);
            v4 = this.FLD106.MTH780(v5, this.FLD107[v1]);
        }
        return v4;
    }
}

