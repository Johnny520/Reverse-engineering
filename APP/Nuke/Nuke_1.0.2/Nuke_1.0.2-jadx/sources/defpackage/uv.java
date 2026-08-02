package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uv implements pc2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ uv(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pc2
    public final Bundle a() {
        ow1[] ow1VarArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return dw.a((dw) obj);
            case 1:
                Map mapC = ((gc2) obj).c();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : mapC.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            default:
                cj cjVar = (cj) obj;
                for (Map.Entry entry2 : we1.v0((LinkedHashMap) cjVar.d).entrySet()) {
                    cjVar.q((String) entry2.getKey(), ((ju2) entry2.getValue()).getValue());
                }
                for (Map.Entry entry3 : we1.v0((LinkedHashMap) cjVar.b).entrySet()) {
                    cjVar.q((String) entry3.getKey(), ((pc2) entry3.getValue()).a());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) cjVar.a;
                if (linkedHashMap.isEmpty()) {
                    ow1VarArr = new ow1[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new ow1((String) entry4.getKey(), entry4.getValue()));
                    }
                    ow1VarArr = (ow1[]) arrayList.toArray(new ow1[0]);
                }
                return tl.l((ow1[]) Arrays.copyOf(ow1VarArr, ow1VarArr.length));
        }
    }
}
