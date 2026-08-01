// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS363;
import b.ﾞˎ.CLS1626;
import java.util.ArrayList;
import java.util.Collections;

public final class CLS1550 implements CLS16 {
    public final int FLD4821;
    public final CLS1626 FLD4822;
    public final CLS363 FLD4823;

    public CLS1550(CLS363 ﾞٴ0, CLS1626 ـﹳ0, int v) {
        this.FLD4821 = v;
        this.FLD4823 = ﾞٴ0;
        this.FLD4822 = ـﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS1626 ـﹳ0 = this.FLD4822;
        CLS363 ﾞٴ0 = this.FLD4823;
        int v = 0;
        switch(this.FLD4821) {
            case 0: {
                if(!TextUtils.isEmpty(s)) {
                    String[] arr_s = s.split(",");
                    ArrayList arrayList2 = new ArrayList();
                    CLS1290 ʽ0 = new CLS1290(ﾞٴ0, arrayList2, 0);
                    for(int v3 = 0; v3 < arr_s.length; ++v3) {
                        String s1 = arr_s[v3];
                        String s2 = s1.trim();
                        if(!TextUtils.isEmpty(s1)) {
                            if(CLS502.MTH6934(s2, new String[]{"-"})) {
                                String[] arr_s1 = s2.split("-");
                                if(arr_s1.length == 2) {
                                    int v4 = Integer.parseInt(arr_s1[0]);
                                    int v5 = Integer.parseInt(arr_s1[1]);
                                    while(v4 <= v5) {
                                        ʽ0.MTH791(v4);
                                        ++v4;
                                    }
                                }
                            }
                            else {
                                ʽ0.MTH791(Integer.parseInt(s2));
                            }
                        }
                    }
                    if(!arrayList2.isEmpty()) {
                        ﾞٴ0.MTH5259(arrayList2);
                        ﾞٴ0.notifyDataSetChanged();
                        ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
                    }
                }
                return;
            }
            case 1: {
                try {
                    int v6 = Integer.parseInt(s);
                    ArrayList arrayList3 = new ArrayList(ﾞٴ0.FLD3447);
                    if(!arrayList3.isEmpty()) {
                        int v7 = Math.max(0, Math.min(arrayList3.size(), v6));
                        Collections.shuffle(arrayList3);
                        ArrayList arrayList4 = new ArrayList();
                        while(v < v7) {
                            arrayList4.add("");
                            ++v;
                        }
                        if(!arrayList4.isEmpty()) {
                            ﾞٴ0.MTH5263();
                            ﾞٴ0.MTH5259(arrayList4);
                            ﾞٴ0.notifyDataSetChanged();
                            ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
                            return;
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 2: {
                if(!TextUtils.isEmpty(s)) {
                    String[] arr_s2 = s.split(",");
                    ArrayList arrayList5 = new ArrayList();
                    CLS1290 ʽ1 = new CLS1290(ﾞٴ0, arrayList5, 1);
                    for(int v8 = 0; v8 < arr_s2.length; ++v8) {
                        String s3 = arr_s2[v8];
                        String s4 = s3.trim();
                        if(!TextUtils.isEmpty(s3)) {
                            if(CLS502.MTH6934(s4, new String[]{"-"})) {
                                String[] arr_s3 = s4.split("-");
                                if(arr_s3.length == 2) {
                                    int v9 = Integer.parseInt(arr_s3[0]);
                                    int v10 = Integer.parseInt(arr_s3[1]);
                                    while(v9 <= v10) {
                                        ʽ1.MTH791(v9);
                                        ++v9;
                                    }
                                }
                            }
                            else {
                                ʽ1.MTH791(Integer.parseInt(s4));
                            }
                        }
                    }
                    if(!arrayList5.isEmpty()) {
                        ﾞٴ0.MTH5259(arrayList5);
                        ﾞٴ0.notifyDataSetChanged();
                        ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
                    }
                }
                return;
            }
            default: {
                try {
                    int v1 = Integer.parseInt(s);
                    ArrayList arrayList0 = new ArrayList(ﾞٴ0.FLD3447);
                    if(!arrayList0.isEmpty()) {
                        int v2 = Math.max(0, Math.min(arrayList0.size(), v1));
                        Collections.shuffle(arrayList0);
                        ArrayList arrayList1 = new ArrayList();
                        while(v < v2) {
                            arrayList1.add("");
                            ++v;
                        }
                        if(!arrayList1.isEmpty()) {
                            ﾞٴ0.MTH5263();
                            ﾞٴ0.MTH5259(arrayList1);
                            ﾞٴ0.notifyDataSetChanged();
                            ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

