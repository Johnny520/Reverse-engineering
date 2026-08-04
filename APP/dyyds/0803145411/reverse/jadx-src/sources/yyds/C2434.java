package yyds;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲇᛴᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2434 extends AbstractC2383 {

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f11994;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2434(C0644 c0644, int i) {
        super(c0644);
        this.f11994 = i;
    }

    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo1661(Object obj) {
        int i = 0;
        switch (this.f11994) {
            case 0:
                List list = (List) obj;
                Long[] lArr = new Long[list.size()];
                for (Object obj2 : list) {
                    if (obj2 != null) {
                        if (obj2 instanceof Float) {
                            lArr[i] = (Long) obj2;
                        } else {
                            lArr[i] = Long.valueOf(((Number) obj2).longValue());
                        }
                        i++;
                    }
                }
                return lArr;
            case 1:
                List list2 = (List) obj;
                float[] fArr = new float[list2.size()];
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    fArr[i] = ((Number) it.next()).floatValue();
                    i++;
                }
                return fArr;
            case 2:
                List list3 = (List) obj;
                Float[] fArr2 = new Float[list3.size()];
                for (Object obj3 : list3) {
                    if (obj3 != null) {
                        if (obj3 instanceof Float) {
                            fArr2[i] = (Float) obj3;
                        } else {
                            fArr2[i] = Float.valueOf(((Number) obj3).floatValue());
                        }
                        i++;
                    }
                }
                return fArr2;
            case 3:
                List list4 = (List) obj;
                double[] dArr = new double[list4.size()];
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    dArr[i] = ((Number) it2.next()).doubleValue();
                    i++;
                }
                return dArr;
            case 4:
                List list5 = (List) obj;
                Double[] dArr2 = new Double[list5.size()];
                for (Object obj4 : list5) {
                    if (obj4 != null) {
                        if (obj4 instanceof Double) {
                            dArr2[i] = (Double) obj4;
                        } else {
                            dArr2[i] = Double.valueOf(((Number) obj4).doubleValue());
                        }
                        i++;
                    }
                }
                return dArr2;
            case 5:
                List list6 = (List) obj;
                boolean[] zArr = new boolean[list6.size()];
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    zArr[i] = ((Boolean) it3.next()).booleanValue();
                    i++;
                }
                return zArr;
            case 6:
                List list7 = (List) obj;
                Boolean[] boolArr = new Boolean[list7.size()];
                int i2 = 0;
                for (Object obj5 : list7) {
                    if (obj5 != null) {
                        if (obj5 instanceof Boolean) {
                            boolArr[i2] = (Boolean) obj5;
                        } else {
                            if (!(obj5 instanceof Number)) {
                                throw new RuntimeException("can not convert " + obj5 + " toBoolean");
                            }
                            boolArr[i2] = Boolean.valueOf(((Number) obj5).intValue() != 0);
                        }
                        i2++;
                    }
                }
                return boolArr;
            case 7:
                List list8 = (List) obj;
                int[] iArr = new int[list8.size()];
                Iterator it4 = list8.iterator();
                while (it4.hasNext()) {
                    iArr[i] = ((Number) it4.next()).intValue();
                    i++;
                }
                return iArr;
            case 8:
                List list9 = (List) obj;
                Integer[] numArr = new Integer[list9.size()];
                for (Object obj6 : list9) {
                    if (obj6 != null) {
                        if (obj6 instanceof Integer) {
                            numArr[i] = (Integer) obj6;
                        } else {
                            numArr[i] = Integer.valueOf(((Number) obj6).intValue());
                        }
                        i++;
                    }
                }
                return numArr;
            case 9:
                List list10 = (List) obj;
                byte[] bArr = new byte[list10.size()];
                Iterator it5 = list10.iterator();
                while (it5.hasNext()) {
                    bArr[i] = ((Number) it5.next()).byteValue();
                    i++;
                }
                return bArr;
            case 10:
                List list11 = (List) obj;
                Byte[] bArr2 = new Byte[list11.size()];
                for (Object obj7 : list11) {
                    if (obj7 != null) {
                        if (obj7 instanceof Byte) {
                            bArr2[i] = (Byte) obj7;
                        } else {
                            bArr2[i] = Byte.valueOf(((Number) obj7).byteValue());
                        }
                        i++;
                    }
                }
                return bArr2;
            case 11:
                List list12 = (List) obj;
                char[] cArr = new char[list12.size()];
                Iterator it6 = list12.iterator();
                int i3 = 0;
                while (it6.hasNext()) {
                    cArr[i3] = it6.next().toString().charAt(0);
                    i3++;
                }
                return cArr;
            case 12:
                List list13 = (List) obj;
                Character[] chArr = new Character[list13.size()];
                int i4 = 0;
                for (Object obj8 : list13) {
                    if (obj8 != null) {
                        chArr[i4] = Character.valueOf(obj8.toString().charAt(0));
                        i4++;
                    }
                }
                return chArr;
            default:
                List list14 = (List) obj;
                long[] jArr = new long[list14.size()];
                Iterator it7 = list14.iterator();
                while (it7.hasNext()) {
                    jArr[i] = ((Number) it7.next()).intValue();
                    i++;
                }
                return jArr;
        }
    }
}
