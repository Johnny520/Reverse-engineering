package p360yb;

import cc.C1513c;
import java.util.Map;
import p025bc.C1092c;
import p025bc.C1093d;
import p172l8.C4711r;
import p185m8.AbstractC5109u0;
import p360yb.InterfaceC9664g;
import p374zb.AbstractC9934h;

/* JADX INFO: renamed from: yb.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9658a {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC9663f m37776a() {
        return AbstractC9934h.m38502b();
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC9664g m37777b() {
        return C1092c.f3299u.m3984a();
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC9664g m37778c(C4711r... c4711rArr) {
        c4711rArr.getClass();
        C1092c c1092cM3984a = C1092c.f3299u.m3984a();
        c1092cM3984a.getClass();
        InterfaceC9664g.a aVarBuilder = c1092cM3984a.builder();
        AbstractC5109u0.m20777r(aVarBuilder, c4711rArr);
        return aVarBuilder.build();
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC9665h m37779d() {
        return C1513c.f4470u.m5929a();
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC9664g m37780e(Map map) {
        map.getClass();
        C1092c c1092c = map instanceof C1092c ? (C1092c) map : null;
        if (c1092c != null) {
            return c1092c;
        }
        C1093d c1093d = map instanceof C1093d ? (C1093d) map : null;
        InterfaceC9664g interfaceC9664gBuild = c1093d != null ? c1093d.build() : null;
        return interfaceC9664gBuild == null ? C1092c.f3299u.m3984a().m3982x(map) : interfaceC9664gBuild;
    }
}
