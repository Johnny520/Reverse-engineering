// Decompiled by JEB v5.42.0.202606242140

package t.ˈˈ;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

public final class CLS75 implements Externalizable {
    public ArrayList FLD572;
    public Rect FLD573;
    public ArrayList FLD574;
    public int[] FLD575;

    public CLS75() {
        this.FLD573 = new Rect();
    }

    @Override
    public final void readExternal(ObjectInput objectInput0) {
        byte[] arr_b = new byte[objectInput0.readInt()];
        objectInput0.read(arr_b);
        try {
            CLS75 ˊﾞ0 = CLS75.MTH1588(arr_b);
            this.FLD572 = ˊﾞ0.FLD572;
            this.FLD574 = ˊﾞ0.FLD574;
            this.FLD573 = ˊﾞ0.FLD573;
            this.FLD575 = ˊﾞ0.FLD575;
        }
        catch(CLS78 | CLS77 unused_ex) {
        }
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput0) {
        byte[] arr_b = this.MTH1590();
        objectOutput0.writeInt(arr_b.length);
        objectOutput0.write(arr_b);
    }

    public static CLS76 MTH1586(int v, CLS76 ٴـ0, int v1, ArrayList arrayList0) {
        if(v == 0xFF000000 && ٴـ0 == null) {
            ٴـ0 = new CLS76();
            ٴـ0.FLD576 = v1;
        }
        if(CLS75.MTH1587(v) && ٴـ0 != null) {
            ٴـ0.FLD577 = v1;
            arrayList0.add(ٴـ0);
            return null;
        }
        return ٴـ0;
    }

    public static boolean MTH1587(int v) {
        return Color.alpha(v) == 0;
    }

    public static CLS75 MTH1588(byte[] arr_b) {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b).order(ByteOrder.nativeOrder());
        CLS75 ˊﾞ0 = new CLS75();
        if(byteBuffer0.get() == 0) {
            throw new CLS77();
        }
        int v1 = byteBuffer0.get();
        if(v1 == 0 || (v1 & 1) != 0) {
            throw new CLS78("Div count should be aliquot 2 and more then 0, but was: " + v1);
        }
        int v2 = byteBuffer0.get();
        if(v2 == 0 || (v2 & 1) != 0) {
            throw new CLS78("Div count should be aliquot 2 and more then 0, but was: " + v2);
        }
        ˊﾞ0.FLD575 = new int[byteBuffer0.get()];
        byteBuffer0.getInt();
        byteBuffer0.getInt();
        Rect rect0 = ˊﾞ0.FLD573;
        rect0.left = byteBuffer0.getInt();
        Rect rect1 = ˊﾞ0.FLD573;
        rect1.right = byteBuffer0.getInt();
        Rect rect2 = ˊﾞ0.FLD573;
        rect2.top = byteBuffer0.getInt();
        Rect rect3 = ˊﾞ0.FLD573;
        rect3.bottom = byteBuffer0.getInt();
        byteBuffer0.getInt();
        ArrayList arrayList0 = new ArrayList(v1 >> 1);
        ˊﾞ0.FLD572 = arrayList0;
        for(int v3 = 0; v3 < v1 >> 1; ++v3) {
            CLS76 ٴـ0 = new CLS76();
            ٴـ0.FLD576 = byteBuffer0.getInt();
            ٴـ0.FLD577 = byteBuffer0.getInt();
            arrayList0.add(ٴـ0);
        }
        ArrayList arrayList1 = new ArrayList(v2 >> 1);
        ˊﾞ0.FLD574 = arrayList1;
        for(int v4 = 0; v4 < v2 >> 1; ++v4) {
            CLS76 ٴـ1 = new CLS76();
            ٴـ1.FLD576 = byteBuffer0.getInt();
            ٴـ1.FLD577 = byteBuffer0.getInt();
            arrayList1.add(ٴـ1);
        }
        for(int v = 0; true; ++v) {
            int[] arr_v = ˊﾞ0.FLD575;
            if(v >= arr_v.length) {
                break;
            }
            arr_v[v] = byteBuffer0.getInt();
        }
        return ˊﾞ0;
    }

    public static CLS75 MTH1589(Bitmap bitmap0) {
        CLS75 ˊﾞ0 = new CLS75();
        ArrayList arrayList0 = CLS75.MTH1594(bitmap0, 0);
        ˊﾞ0.FLD572 = arrayList0;
        if(arrayList0.size() == 0) {
            throw new CLS78("must be at least one horizontal stretchable region");
        }
        ArrayList arrayList1 = CLS75.MTH1591(bitmap0, 0);
        ˊﾞ0.FLD574 = arrayList1;
        if(arrayList1.size() == 0) {
            throw new CLS78("must be at least one vertical stretchable region");
        }
        int v = bitmap0.getWidth();
        int v1 = bitmap0.getHeight();
        ArrayList arrayList2 = CLS75.MTH1594(bitmap0, bitmap0.getHeight() - 1);
        if(arrayList2.size() > 1) {
            throw new CLS79("Raw padding is wrong. Should be only one horizontal padding region");
        }
        ArrayList arrayList3 = CLS75.MTH1591(bitmap0, bitmap0.getWidth() - 1);
        if(arrayList3.size() > 1) {
            throw new CLS79("Column padding is wrong. Should be only one vertical padding region");
        }
        if(arrayList2.size() == 0) {
            arrayList2.add(((CLS76)ˊﾞ0.FLD572.get(0)));
        }
        if(arrayList3.size() == 0) {
            arrayList3.add(((CLS76)ˊﾞ0.FLD574.get(0)));
        }
        Rect rect0 = new Rect();
        ˊﾞ0.FLD573 = rect0;
        rect0.left = ((CLS76)arrayList2.get(0)).FLD576;
        Rect rect1 = ˊﾞ0.FLD573;
        rect1.right = v - 2 - ((CLS76)arrayList2.get(0)).FLD577;
        Rect rect2 = ˊﾞ0.FLD573;
        rect2.top = ((CLS76)arrayList3.get(0)).FLD576;
        Rect rect3 = ˊﾞ0.FLD573;
        rect3.bottom = v1 - 2 - ((CLS76)arrayList3.get(0)).FLD577;
        int v2 = bitmap0.getWidth();
        int v3 = bitmap0.getHeight();
        ArrayList arrayList4 = CLS75.MTH1592(v2 - 2, ˊﾞ0.FLD572);
        ArrayList arrayList5 = CLS75.MTH1592(v3 - 2, ˊﾞ0.FLD574);
        ˊﾞ0.FLD575 = new int[arrayList5.size() * arrayList4.size()];
        int v4 = 0;
        for(Object object0: arrayList5) {
            CLS76 ٴـ0 = (CLS76)object0;
            for(Object object1: arrayList4) {
                int v5 = ((CLS76)object1).FLD576 + 1;
                int v6 = ٴـ0.FLD576 + 1;
                int v7 = ((CLS76)object1).FLD577 + 1;
                int v8 = ٴـ0.FLD577 + 1;
                int v9 = bitmap0.getPixel(v5, v6);
                int v10 = v5;
            alab1:
                while(true) {
                    boolean z = true;
                    if(v10 > v7) {
                        break;
                    }
                    for(int v11 = v6; v11 <= v8; ++v11) {
                        if(v9 != bitmap0.getPixel(v10, v11)) {
                            z = false;
                            break alab1;
                        }
                    }
                    ++v10;
                }
                if(z) {
                    int v12 = bitmap0.getPixel(v5, v6);
                    if(CLS75.MTH1587(v12)) {
                        v12 = 0;
                    }
                    ˊﾞ0.FLD575[v4] = v12;
                }
                else {
                    ˊﾞ0.FLD575[v4] = 1;
                }
                ++v4;
            }
        }
        return ˊﾞ0;
    }

    public final byte[] MTH1590() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(this.FLD575.length * 4 + (this.FLD574.size() * 8 + (this.FLD572.size() * 8 + 0x20))).order(ByteOrder.nativeOrder());
        byteBuffer0.put(1.byteValue());
        byteBuffer0.put(((int)(this.FLD572.size() * 2)).byteValue());
        byteBuffer0.put(((int)(this.FLD574.size() * 2)).byteValue());
        byteBuffer0.put(((int)this.FLD575.length).byteValue());
        byteBuffer0.putInt(0);
        byteBuffer0.putInt(0);
        if(this.FLD573 == null) {
            this.FLD573 = new Rect();
        }
        byteBuffer0.putInt(this.FLD573.left);
        byteBuffer0.putInt(this.FLD573.right);
        byteBuffer0.putInt(this.FLD573.top);
        byteBuffer0.putInt(this.FLD573.bottom);
        byteBuffer0.putInt(0);
        for(Object object0: this.FLD572) {
            byteBuffer0.putInt(((CLS76)object0).FLD576);
            byteBuffer0.putInt(((CLS76)object0).FLD577);
        }
        for(Object object1: this.FLD574) {
            byteBuffer0.putInt(((CLS76)object1).FLD576);
            byteBuffer0.putInt(((CLS76)object1).FLD577);
        }
        int[] arr_v = this.FLD575;
        for(int v = 0; v < arr_v.length; ++v) {
            byteBuffer0.putInt(arr_v[v]);
        }
        return byteBuffer0.array();
    }

    public static ArrayList MTH1591(Bitmap bitmap0, int v) {
        ArrayList arrayList0 = new ArrayList();
        CLS76 ٴـ0 = null;
        for(int v1 = 1; v1 < bitmap0.getHeight(); ++v1) {
            ٴـ0 = CLS75.MTH1586(bitmap0.getPixel(v, v1), ٴـ0, v1 - 1, arrayList0);
        }
        return arrayList0;
    }

    public static ArrayList MTH1592(int v, ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        if(arrayList0 != null && arrayList0.size() != 0) {
            for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                CLS76 ٴـ0 = (CLS76)arrayList0.get(v1);
                if(v1 == 0) {
                    int v2 = ٴـ0.FLD576;
                    if(v2 != 0) {
                        arrayList1.add(new CLS76(0, v2 - 1));
                    }
                }
                if(v1 > 0) {
                    arrayList1.add(new CLS76(((CLS76)arrayList0.get(v1 - 1)).FLD577, ٴـ0.FLD576 - 1));
                }
                arrayList1.add(new CLS76(ٴـ0.FLD576, ٴـ0.FLD577 - 1));
                if(v1 == arrayList0.size() - 1) {
                    int v3 = ٴـ0.FLD577;
                    if(v3 < v) {
                        arrayList1.add(new CLS76(v3, v - 1));
                    }
                }
            }
        }
        return arrayList1;
    }

    public static CLS75 MTH1593() {
        CLS75 ˊﾞ0 = new CLS75();
        ˊﾞ0.FLD575 = new int[0];
        ˊﾞ0.FLD573 = new Rect();
        ˊﾞ0.FLD574 = new ArrayList();
        ˊﾞ0.FLD572 = new ArrayList();
        return ˊﾞ0;
    }

    public static ArrayList MTH1594(Bitmap bitmap0, int v) {
        ArrayList arrayList0 = new ArrayList();
        CLS76 ٴـ0 = null;
        for(int v1 = 1; v1 < bitmap0.getWidth(); ++v1) {
            ٴـ0 = CLS75.MTH1586(bitmap0.getPixel(v1, v), ٴـ0, v1 - 1, arrayList0);
        }
        return arrayList0;
    }

    public static boolean MTH1595(Bitmap bitmap0) {
        if(bitmap0 == null) {
            return false;
        }
        if(bitmap0.getWidth() >= 3 && bitmap0.getHeight() >= 3) {
            int v = bitmap0.getHeight();
            int v1 = bitmap0.getWidth();
            if(!CLS75.MTH1587(bitmap0.getPixel(0, 0)) || !CLS75.MTH1587(bitmap0.getPixel(0, v - 1)) || !CLS75.MTH1587(bitmap0.getPixel(v1 - 1, 0)) || !CLS75.MTH1587(bitmap0.getPixel(v1 - 1, v - 1))) {
                return false;
            }
            int v2 = bitmap0.getWidth();
            int v3 = bitmap0.getHeight();
            for(int v4 = 1; v4 < v2 - 1; ++v4) {
                if(!CLS75.MTH1596(bitmap0.getPixel(v4, 0)) || !CLS75.MTH1596(bitmap0.getPixel(v4, v3 - 1))) {
                    return false;
                }
            }
            for(int v5 = 1; v5 < v3 - 1; ++v5) {
                if(!CLS75.MTH1596(bitmap0.getPixel(0, v5)) || !CLS75.MTH1596(bitmap0.getPixel(v2 - 1, v5))) {
                    return false;
                }
            }
            return CLS75.MTH1594(bitmap0, 0).size() != 0 && CLS75.MTH1594(bitmap0, v3 - 1).size() <= 1 && CLS75.MTH1591(bitmap0, 0).size() != 0 && CLS75.MTH1591(bitmap0, v2 - 1).size() <= 1;
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public static boolean MTH1596(int v) {
        return CLS75.MTH1587(v) ? true : v == 0xFF000000;
    }
}

