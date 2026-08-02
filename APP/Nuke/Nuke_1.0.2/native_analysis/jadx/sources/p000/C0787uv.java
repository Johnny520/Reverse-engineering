package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: uv */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0787uv implements pc2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11508a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f11509b;

    public /* synthetic */ C0787uv(int i, Object obj) {
        this.f11508a = i;
        this.f11509b = obj;
    }

    @Override // p000.pc2
    /* JADX INFO: renamed from: a */
    public final Bundle mo3037a() {
        ow1[] ow1VarArr;
        int i = this.f11508a;
        Object obj = this.f11509b;
        switch (i) {
            case 0:
                return AbstractActivityC0144dw.m1200a((AbstractActivityC0144dw) obj);
            case 1:
                Map mapMo977c = ((gc2) obj).mo977c();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : mapMo977c.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            default:
                C0093cj c0093cj = (C0093cj) obj;
                for (Map.Entry entry2 : we1.m5881v0((LinkedHashMap) c0093cj.f1582d).entrySet()) {
                    c0093cj.m842q((String) entry2.getKey(), ((ju2) entry2.getValue()).getValue());
                }
                for (Map.Entry entry3 : we1.m5881v0((LinkedHashMap) c0093cj.f1580b).entrySet()) {
                    c0093cj.m842q((String) entry3.getKey(), ((pc2) entry3.getValue()).mo3037a());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0093cj.f1579a;
                if (linkedHashMap.isEmpty()) {
                    ow1VarArr = new ow1[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new ow1((String) entry4.getKey(), entry4.getValue()));
                    }
                    ow1VarArr = (ow1[]) arrayList.toArray(new ow1[0]);
                }
                return AbstractC0738tl.m5313l((ow1[]) Arrays.copyOf(ow1VarArr, ow1VarArr.length));
        }
    }
}
