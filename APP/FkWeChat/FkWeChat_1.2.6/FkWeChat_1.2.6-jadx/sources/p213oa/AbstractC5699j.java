package p213oa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p080f9.AbstractC2368o;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5116y;

/* JADX INFO: renamed from: oa.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5699j {
    /* JADX INFO: renamed from: k */
    public static final C5691b m23062k(String str) {
        C5692c c5692cM23039b = C5698i.f17977a.m23039b();
        C5695f c5695fM23027j = C5695f.m23027j(str);
        c5695fM23027j.getClass();
        return new C5691b(c5692cM23039b, c5695fM23027j);
    }

    /* JADX INFO: renamed from: l */
    public static final C5691b m23063l(String str) {
        C5692c c5692cM23043f = C5698i.f17977a.m23043f();
        C5695f c5695fM23027j = C5695f.m23027j(str);
        c5695fM23027j.getClass();
        return new C5691b(c5692cM23043f, c5695fM23027j);
    }

    /* JADX INFO: renamed from: m */
    public static final C5691b m23064m(String str) {
        C5692c c5692cM23040c = C5698i.f17977a.m23040c();
        C5695f c5695fM23027j = C5695f.m23027j(str);
        c5695fM23027j.getClass();
        return new C5691b(c5692cM23040c, c5695fM23027j);
    }

    /* JADX INFO: renamed from: n */
    public static final C5691b m23065n(String str) {
        C5692c c5692cM23041d = C5698i.f17977a.m23041d();
        C5695f c5695fM23027j = C5695f.m23027j(str);
        c5695fM23027j.getClass();
        return new C5691b(c5692cM23041d, c5695fM23027j);
    }

    /* JADX INFO: renamed from: o */
    public static final C5691b m23066o(String str) {
        C5692c c5692cM23042e = C5698i.f17977a.m23042e();
        C5695f c5695fM23027j = C5695f.m23027j(str);
        c5695fM23027j.getClass();
        return new C5691b(c5692cM23042e, c5695fM23027j);
    }

    /* JADX INFO: renamed from: p */
    public static final Map m23067p(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2368o.m8578e(AbstractC5107t0.m20763e(AbstractC5116y.m20814z(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            C4711r c4711rM18815a = AbstractC4717x.m18815a(entry.getValue(), entry.getKey());
            linkedHashMap.put(c4711rM18815a.m18795e(), c4711rM18815a.m18796f());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: q */
    public static final C5691b m23068q(C5695f c5695f) {
        C5698i c5698i = C5698i.f17977a;
        C5692c c5692cM22986f = c5698i.m23038a().m22986f();
        C5695f c5695fM23027j = C5695f.m23027j(c5695f.m23032h() + c5698i.m23038a().m22988h().m23032h());
        c5695fM23027j.getClass();
        return new C5691b(c5692cM22986f, c5695fM23027j);
    }

    /* JADX INFO: renamed from: r */
    public static final C5691b m23069r(String str) {
        C5692c c5692cM23044g = C5698i.f17977a.m23044g();
        C5695f c5695fM23027j = C5695f.m23027j(str);
        c5695fM23027j.getClass();
        return new C5691b(c5692cM23044g, c5695fM23027j);
    }

    /* JADX INFO: renamed from: s */
    public static final C5691b m23070s(String str) {
        C5692c c5692cM23045h = C5698i.f17977a.m23045h();
        C5695f c5695fM23027j = C5695f.m23027j(str);
        c5695fM23027j.getClass();
        return new C5691b(c5692cM23045h, c5695fM23027j);
    }

    /* JADX INFO: renamed from: t */
    public static final C5691b m23071t(C5691b c5691b) {
        C5692c c5692cM23043f = C5698i.f17977a.m23043f();
        C5695f c5695fM23027j = C5695f.m23027j("U" + c5691b.m22988h().m23032h());
        c5695fM23027j.getClass();
        return new C5691b(c5692cM23043f, c5695fM23027j);
    }
}
