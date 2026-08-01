package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import top.anjao2024.xp1whs.MainActivity;

/* JADX INFO: renamed from: xg */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0925xg implements jx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7342a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7343b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0925xg(int i, Object obj) {
        this.f7342a = i;
        this.f7343b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.jx0
    /* JADX INFO: renamed from: a */
    public final Bundle mo1264a() {
        Map mapSingletonMap;
        uo0[] uo0VarArr;
        int i = this.f7342a;
        Object obj = this.f7343b;
        switch (i) {
            case 0:
                return AbstractActivityC0246gh.m1241a((MainActivity) obj);
            case 1:
                Map mapMo216c = ((ax0) obj).mo216c();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : mapMo216c.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            default:
                C0681r9 c0681r9 = (C0681r9) obj;
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0681r9.f5330d;
                linkedHashMap.getClass();
                int size = linkedHashMap.size();
                Map mapSingletonMap2 = C0330is.f2614d;
                if (size == 0) {
                    mapSingletonMap = mapSingletonMap2;
                } else if (size != 1) {
                    mapSingletonMap = new LinkedHashMap(linkedHashMap);
                } else {
                    Map.Entry entry2 = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                    mapSingletonMap = Collections.singletonMap(entry2.getKey(), entry2.getValue());
                    mapSingletonMap.getClass();
                }
                for (Map.Entry entry3 : mapSingletonMap.entrySet()) {
                    c0681r9.m3434i(((z31) entry3.getValue()).getValue(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) c0681r9.f5328b;
                linkedHashMap2.getClass();
                int size2 = linkedHashMap2.size();
                if (size2 != 0) {
                    if (size2 != 1) {
                        mapSingletonMap2 = new LinkedHashMap(linkedHashMap2);
                    } else {
                        Map.Entry entry4 = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                        mapSingletonMap2 = Collections.singletonMap(entry4.getKey(), entry4.getValue());
                        mapSingletonMap2.getClass();
                    }
                }
                for (Map.Entry entry5 : mapSingletonMap2.entrySet()) {
                    c0681r9.m3434i(((jx0) entry5.getValue()).mo1264a(), (String) entry5.getKey());
                }
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) c0681r9.f5327a;
                if (linkedHashMap3.isEmpty()) {
                    uo0VarArr = new uo0[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap3.size());
                    for (Map.Entry entry6 : linkedHashMap3.entrySet()) {
                        arrayList.add(new uo0((String) entry6.getKey(), entry6.getValue()));
                    }
                    uo0VarArr = (uo0[]) arrayList.toArray(new uo0[0]);
                }
                return AbstractC0398kl.m1922h((uo0[]) Arrays.copyOf(uo0VarArr, uo0VarArr.length));
        }
    }
}
