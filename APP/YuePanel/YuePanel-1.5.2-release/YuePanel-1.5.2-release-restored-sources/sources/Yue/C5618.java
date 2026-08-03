package Yue;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5618 {

    /* JADX INFO: renamed from: ۥ */
    public HashMap<Object, HashMap<String, float[]>> f1575 = new HashMap<>();

    /* JADX INFO: renamed from: ۥ */
    public float m2328(Object obj, String str, int i) {
        if (!this.f1575.containsKey(obj)) {
            return Float.NaN;
        }
        HashMap<String, float[]> map = this.f1575.get(obj);
        if (!map.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = map.get(str);
        if (fArr.length > i) {
            return fArr[i];
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m2329(Object obj, String str, int i, float f) {
        if (!this.f1575.containsKey(obj)) {
            HashMap<String, float[]> map = new HashMap<>();
            float[] fArr = new float[i + 1];
            fArr[i] = f;
            map.put(str, fArr);
            this.f1575.put(obj, map);
            return;
        }
        HashMap<String, float[]> map2 = this.f1575.get(obj);
        if (!map2.containsKey(str)) {
            float[] fArr2 = new float[i + 1];
            fArr2[i] = f;
            map2.put(str, fArr2);
            this.f1575.put(obj, map2);
            return;
        }
        float[] fArrCopyOf = map2.get(str);
        if (fArrCopyOf.length <= i) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i + 1);
        }
        fArrCopyOf[i] = f;
        map2.put(str, fArrCopyOf);
    }
}
