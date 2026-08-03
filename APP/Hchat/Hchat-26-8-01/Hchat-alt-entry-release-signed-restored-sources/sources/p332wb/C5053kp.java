package p332wb;

import gb.C1383g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p065eb.C0859c0;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: wb.kp */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5053kp implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18513g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0859c0 f18514h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f18515i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5053kp(C0859c0 c0859c0, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f18513g = i9;
        this.f18514h = c0859c0;
        this.f18515i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        Map mapSingletonMap;
        Map mapSingletonMap2;
        Map mapSingletonMap3;
        switch (this.f18513g) {
            case 0:
                String str = this.f18514h.f2626a;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                InterfaceC1809a1 interfaceC1809a1 = this.f18515i;
                interfaceC1809a1.setValue(zBooleanValue ? AbstractC4156d0.m8354V((Set) interfaceC1809a1.getValue(), str) : AbstractC4156d0.m8351S((Set) interfaceC1809a1.getValue(), str));
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                InterfaceC1809a1 interfaceC1809a12 = this.f18515i;
                Map map = (Map) interfaceC1809a12.getValue();
                String str3 = this.f18514h.f2626a;
                String strM6701P0 = AbstractC3149m.m6701P0(100, str2);
                map.getClass();
                if (map.isEmpty()) {
                    mapSingletonMap = Collections.singletonMap(str3, strM6701P0);
                    mapSingletonMap.getClass();
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put(str3, strM6701P0);
                    mapSingletonMap = linkedHashMap;
                }
                interfaceC1809a12.setValue(mapSingletonMap);
                break;
            case 2:
                String str4 = (String) obj;
                str4.getClass();
                InterfaceC1809a1 interfaceC1809a13 = this.f18515i;
                Map map2 = (Map) interfaceC1809a13.getValue();
                String str5 = this.f18514h.f2626a;
                String strM6701P02 = AbstractC3149m.m6701P0(500, str4);
                map2.getClass();
                if (map2.isEmpty()) {
                    mapSingletonMap2 = Collections.singletonMap(str5, strM6701P02);
                    mapSingletonMap2.getClass();
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
                    linkedHashMap2.put(str5, strM6701P02);
                    mapSingletonMap2 = linkedHashMap2;
                }
                interfaceC1809a13.setValue(mapSingletonMap2);
                break;
            default:
                List list = (List) obj;
                list.getClass();
                InterfaceC1809a1 interfaceC1809a14 = this.f18515i;
                Map map3 = (Map) interfaceC1809a14.getValue();
                String str6 = this.f18514h.f2626a;
                Iterable iterable = (List) map3.get(str6);
                if (iterable == null) {
                    iterable = C4173t.f13710g;
                }
                ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(list, iterable);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListM8397F1) {
                    String str7 = ((C1383g) obj2).f4590a;
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = str7.toLowerCase(locale);
                    lowerCase.getClass();
                    if (hashSet.add(lowerCase)) {
                        arrayList.add(obj2);
                    }
                }
                Map map4 = (Map) interfaceC1809a14.getValue();
                map4.getClass();
                if (map4.isEmpty()) {
                    mapSingletonMap3 = Collections.singletonMap(str6, arrayList);
                    mapSingletonMap3.getClass();
                } else {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(map4);
                    linkedHashMap3.put(str6, arrayList);
                    mapSingletonMap3 = linkedHashMap3;
                }
                interfaceC1809a14.setValue(mapSingletonMap3);
                break;
        }
        return C3967n.f12976a;
    }
}
