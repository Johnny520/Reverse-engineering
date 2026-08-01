package p142j9;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p098g9.InterfaceC2551e;
import p098g9.InterfaceC2560n;
import p110h9.AbstractC2903e;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: j9.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3685h {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3650a f10201a = AbstractC3655b.m13611a(C3660c.f10161q);

    /* JADX INFO: renamed from: b */
    public static final AbstractC3650a f10202b = AbstractC3655b.m13611a(C3665d.f10166q);

    /* JADX INFO: renamed from: c */
    public static final AbstractC3650a f10203c = AbstractC3655b.m13611a(C3670e.f10171q);

    /* JADX INFO: renamed from: d */
    public static final AbstractC3650a f10204d = AbstractC3655b.m13611a(C3675f.f10187q);

    /* JADX INFO: renamed from: e */
    public static final AbstractC3650a f10205e = AbstractC3655b.m13611a(C3680g.f10196q);

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2560n m13717a(Class cls) {
        cls.getClass();
        return AbstractC2903e.m10552b(m13729m(cls), AbstractC5114x.m20800o(), false, AbstractC5114x.m20800o());
    }

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap m13718b(Class cls) {
        cls.getClass();
        return new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2560n m13719c(Class cls) {
        cls.getClass();
        return AbstractC2903e.m10552b(m13729m(cls), AbstractC5114x.m20800o(), true, AbstractC5114x.m20800o());
    }

    /* JADX INFO: renamed from: d */
    public static final C3761y0 m13720d(Class cls) {
        cls.getClass();
        return new C3761y0(cls);
    }

    /* JADX INFO: renamed from: e */
    public static final C3754w1 m13721e(Class cls) {
        cls.getClass();
        return new C3754w1(cls);
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC2560n m13727k(Class cls, List list, boolean z10) {
        cls.getClass();
        list.getClass();
        return list.isEmpty() ? z10 ? (InterfaceC2560n) f10204d.mo13609a(cls) : (InterfaceC2560n) f10203c.mo13609a(cls) : m13728l(cls, list, z10);
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC2560n m13728l(Class cls, List list, boolean z10) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f10205e.mo13609a(cls);
        C4711r c4711rM18815a = AbstractC4717x.m18815a(list, Boolean.valueOf(z10));
        Object obj = concurrentHashMap.get(c4711rM18815a);
        if (obj == null) {
            InterfaceC2560n interfaceC2560nM10552b = AbstractC2903e.m10552b(m13729m(cls), list, z10, AbstractC5114x.m20800o());
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c4711rM18815a, interfaceC2560nM10552b);
            obj = objPutIfAbsent == null ? interfaceC2560nM10552b : objPutIfAbsent;
        }
        obj.getClass();
        return (InterfaceC2560n) obj;
    }

    /* JADX INFO: renamed from: m */
    public static final C3761y0 m13729m(Class cls) {
        cls.getClass();
        Object objMo13609a = f10201a.mo13609a(cls);
        objMo13609a.getClass();
        return (C3761y0) objMo13609a;
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC2551e m13730n(Class cls) {
        cls.getClass();
        return (InterfaceC2551e) f10202b.mo13609a(cls);
    }
}
