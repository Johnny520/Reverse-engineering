package p200nb;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p010a9.InterfaceC0184l;
import p098g9.InterfaceC2549c;

/* JADX INFO: renamed from: nb.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5561z {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f17418a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f17419b = new AtomicInteger(0);

    /* JADX INFO: renamed from: g */
    public static final int m22600g(AbstractC5561z abstractC5561z, String str) {
        str.getClass();
        return abstractC5561z.f17419b.getAndIncrement();
    }

    /* JADX INFO: renamed from: b */
    public final Map m22601b() {
        return this.f17418a;
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo9583c(ConcurrentHashMap concurrentHashMap, String str, InterfaceC0184l interfaceC0184l);

    /* JADX INFO: renamed from: d */
    public final C5549n m22602d(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        return new C5549n(m22603e(interfaceC2549c));
    }

    /* JADX INFO: renamed from: e */
    public final int m22603e(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        String strMo3792u = interfaceC2549c.mo3792u();
        strMo3792u.getClass();
        return m22604f(strMo3792u);
    }

    /* JADX INFO: renamed from: f */
    public final int m22604f(String str) {
        str.getClass();
        return mo9583c(this.f17418a, str, new C5560y(this));
    }

    /* JADX INFO: renamed from: h */
    public final Collection m22605h() {
        Collection collectionValues = this.f17418a.values();
        collectionValues.getClass();
        return collectionValues;
    }
}
