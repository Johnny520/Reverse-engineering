package p014C1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.dartcv.nuke.BuildConfig;
import p010B3.AbstractActivityC0224c;
import p048I1.InterfaceC0779d;
import p056K2.C0882h;
import p061L2.AbstractC0984x;
import p127Z2.AbstractC1784a;
import p135b.AbstractActivityC1823k;
import p152e0.C2000g;
import p178i3.C2318C;
import p178i3.InterfaceC2334o;

/* JADX INFO: renamed from: C1.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0239a implements InterfaceC0779d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f806a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f807b;

    public /* synthetic */ C0239a(int i5, Object obj) {
        this.f806a = i5;
        this.f807b = obj;
    }

    @Override // p048I1.InterfaceC0779d
    /* JADX INFO: renamed from: a */
    public final Bundle mo166a() {
        C0882h[] c0882hArr;
        switch (this.f806a) {
            case 0:
                C0240b c0240b = (C0240b) this.f807b;
                for (Map.Entry entry : AbstractC0984x.m2038J((LinkedHashMap) c0240b.f811d).entrySet()) {
                    c0240b.m441r(((C2318C) ((InterfaceC2334o) entry.getValue())).getValue(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : AbstractC0984x.m2038J((LinkedHashMap) c0240b.f809b).entrySet()) {
                    c0240b.m441r(((InterfaceC0779d) entry2.getValue()).mo166a(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0240b.f808a;
                if (linkedHashMap.isEmpty()) {
                    c0882hArr = new C0882h[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList.add(new C0882h((String) entry3.getKey(), entry3.getValue()));
                    }
                    c0882hArr = (C0882h[]) arrayList.toArray(new C0882h[0]);
                }
                return AbstractC1784a.m3224j((C0882h[]) Arrays.copyOf(c0882hArr, c0882hArr.length));
            case BuildConfig.VERSION_CODE /* 1 */:
                Map mapMo1276b = ((C2000g) this.f807b).mo1276b();
                Bundle bundle = new Bundle();
                for (Map.Entry entry4 : mapMo1276b.entrySet()) {
                    String str = (String) entry4.getKey();
                    List list = (List) entry4.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            default:
                return AbstractActivityC1823k.m3291a((AbstractActivityC0224c) this.f807b);
        }
    }
}
