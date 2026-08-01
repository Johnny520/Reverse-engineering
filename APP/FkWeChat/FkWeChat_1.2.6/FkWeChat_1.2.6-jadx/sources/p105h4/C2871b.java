package p105h4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import p024b9.AbstractC1043k;
import p113hc.InterfaceC2995s;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p181m4.AbstractC4974k;
import p181m4.C4970g;
import p185m8.AbstractC5109u0;
import p278t3.AbstractC8099b;

/* JADX INFO: renamed from: h4.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2871b {

    /* JADX INFO: renamed from: a */
    public final Map f7523a;

    /* JADX INFO: renamed from: b */
    public final Map f7524b;

    /* JADX INFO: renamed from: c */
    public final Map f7525c;

    /* JADX INFO: renamed from: d */
    public final Map f7526d;

    /* JADX INFO: renamed from: e */
    public final C4970g.b f7527e;

    public C2871b(Map map) {
        map.getClass();
        this.f7523a = AbstractC5109u0.m20784y(map);
        this.f7524b = new LinkedHashMap();
        this.f7525c = new LinkedHashMap();
        this.f7526d = new LinkedHashMap();
        this.f7527e = new C4970g.b() { // from class: h4.a
            @Override // p181m4.C4970g.b
            /* JADX INFO: renamed from: a */
            public final Bundle mo2609a() {
                return C2871b.m10311a(this.f7522a);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m10311a(C2871b c2871b) {
        C4711r[] c4711rArr;
        for (Map.Entry entry : AbstractC5109u0.m20780u(c2871b.f7526d).entrySet()) {
            c2871b.m10313c((String) entry.getKey(), ((InterfaceC2995s) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : AbstractC5109u0.m20780u(c2871b.f7524b).entrySet()) {
            c2871b.m10313c((String) entry2.getKey(), ((C4970g.b) entry2.getValue()).mo2609a());
        }
        Map map = c2871b.f7523a;
        if (map.isEmpty()) {
            c4711rArr = new C4711r[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry3 : map.entrySet()) {
                arrayList.add(AbstractC4717x.m18815a((String) entry3.getKey(), entry3.getValue()));
            }
            c4711rArr = (C4711r[]) arrayList.toArray(new C4711r[0]);
        }
        Bundle bundleM31314a = AbstractC8099b.m31314a((C4711r[]) Arrays.copyOf(c4711rArr, c4711rArr.length));
        AbstractC4974k.m20079a(bundleM31314a);
        return bundleM31314a;
    }

    /* JADX INFO: renamed from: b */
    public final C4970g.b m10312b() {
        return this.f7527e;
    }

    /* JADX INFO: renamed from: c */
    public final void m10313c(String str, Object obj) {
        str.getClass();
        this.f7523a.put(str, obj);
        InterfaceC2995s interfaceC2995s = (InterfaceC2995s) this.f7525c.get(str);
        if (interfaceC2995s != null) {
            interfaceC2995s.setValue(obj);
        }
        InterfaceC2995s interfaceC2995s2 = (InterfaceC2995s) this.f7526d.get(str);
        if (interfaceC2995s2 != null) {
            interfaceC2995s2.setValue(obj);
        }
    }

    public /* synthetic */ C2871b(Map map, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? AbstractC5109u0.m20768i() : map);
    }
}
