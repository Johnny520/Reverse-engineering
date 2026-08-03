package p141jf;

import com.alibaba.fastjson2.writer.C0640b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import nc.C2958a;
import nc.C2959b;
import p000a.AbstractC0000a;
import p232pc.C3380b;
import p232pc.C3382d;
import p232pc.C3383e;
import p232pc.C3384f;
import p232pc.C3385g;
import p232pc.C3386h;
import p232pc.C3387i;
import p232pc.C3388j;

/* JADX INFO: renamed from: jf.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2125a {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2844b f7085a = AbstractC2846d.m6274b(AbstractC2125a.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static void m5347a(String str, ArrayList arrayList, List list) {
        String string;
        C2958a c2958a;
        C2958a c2958a2;
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2959b c2959b = (C2959b) it.next();
            int i9 = c2959b.f9706a;
            LinkedHashMap linkedHashMap = c2959b.f9708c;
            byte b10 = 3;
            if (i9 == 3) {
                String str2 = c2959b.f9707b;
                str2.getClass();
                switch (str2.hashCode()) {
                    case -1911645549:
                        b10 = str2.equals("Ldalvik/annotation/InnerClass;") ? (byte) 0 : (byte) -1;
                        break;
                    case -1104599473:
                        b10 = str2.equals("Ldalvik/annotation/AnnotationDefault;") ? (byte) 1 : (byte) -1;
                        break;
                    case -858881176:
                        b10 = str2.equals("Ldalvik/annotation/Throws;") ? (byte) 2 : (byte) -1;
                        break;
                    case 1338970954:
                        if (!str2.equals("Ldalvik/annotation/MethodParameters;")) {
                            b10 = -1;
                        }
                        break;
                    case 1664436329:
                        b10 = str2.equals("Ldalvik/annotation/Signature;") ? (byte) 4 : (byte) -1;
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                InterfaceC2844b interfaceC2844b = f7085a;
                switch (b10) {
                    case 0:
                        try {
                            String str3 = (String) ((linkedHashMap.isEmpty() || (c2958a = (C2958a) linkedHashMap.get("name")) == null || c2958a.f9704g != 10) ? null : c2958a.f9705h);
                            Object obj = 0;
                            if (!linkedHashMap.isEmpty() && (c2958a2 = (C2958a) linkedHashMap.get("accessFlags")) != null && c2958a2.f9704g == 6) {
                                obj = c2958a2.f9705h;
                            }
                            int iIntValue = ((Integer) obj).intValue();
                            if (str3 != null || iIntValue != 0) {
                                arrayList.add(new C3384f(Collections.singletonMap(str, new C3385g(iIntValue, str, str3))));
                            }
                        } catch (Exception e6) {
                            interfaceC2844b.mo6265s(c2959b, "Failed to parse annotation: {}", e6);
                        }
                        break;
                    case 1:
                        C2958a c2958a3 = (C2958a) linkedHashMap.get("value");
                        if (c2958a3 != null && c2958a3.f9704g == 18) {
                            arrayList.add(new C3380b(((C2959b) c2958a3.f9705h).f9708c));
                        }
                        break;
                    case 2:
                        try {
                            C2958a c2958a4 = (C2958a) linkedHashMap.get("value");
                            if (c2958a4 != null) {
                                arrayList.add(new C3383e((List) ((List) c2958a4.f9705h).stream().map(new C0640b(24)).collect(Collectors.toList())));
                            }
                        } catch (Exception e7) {
                            interfaceC2844b.mo6267u(e7);
                        }
                        break;
                    case 3:
                        try {
                            List listM33R = AbstractC0000a.m33R(c2959b, "names");
                            List listM33R2 = AbstractC0000a.m33R(c2959b, "accessFlags");
                            if (!listM33R.isEmpty() && listM33R.size() == listM33R2.size()) {
                                int size = listM33R.size();
                                ArrayList arrayList2 = new ArrayList(size);
                                for (int i10 = 0; i10 < size; i10++) {
                                    arrayList2.add(new C3386h(((Integer) ((C2958a) listM33R2.get(i10)).f9705h).intValue(), (String) ((C2958a) listM33R.get(i10)).f9705h));
                                }
                                arrayList.add(new C3387i(arrayList2));
                            }
                        } catch (Exception e10) {
                            interfaceC2844b.mo6265s(c2959b, "Failed to parse annotation: {}", e10);
                        }
                        break;
                    case 4:
                        List list2 = (List) ((C2958a) linkedHashMap.get("value")).f9705h;
                        if (list2.size() == 1) {
                            string = (String) ((C2958a) list2.get(0)).f9705h;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                sb2.append((String) ((C2958a) it2.next()).f9705h);
                            }
                            string = sb2.toString();
                        }
                        arrayList.add(new C3388j(string));
                        break;
                }
            }
        }
        C3382d c3382dM7166b = C3382d.m7166b(list);
        if (c3382dM7166b != null) {
            arrayList.add(c3382dM7166b);
        }
    }
}
