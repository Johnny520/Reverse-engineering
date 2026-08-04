package yyds;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: yyds.ᲁᛵᛱᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2225 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final LinkedHashMap f10988;

    public C2225(int i) {
        switch (i) {
            case 1:
                this.f10988 = new LinkedHashMap();
                break;
            case 2:
                this.f10988 = new LinkedHashMap();
                break;
            default:
                this.f10988 = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m4223(C1024 c1024) {
        int i = c1024.f4671;
        int i2 = c1024.f4672;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.f10988;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i2))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + c1024);
        }
        treeMap2.put(Integer.valueOf(i2), c1024);
    }
}
