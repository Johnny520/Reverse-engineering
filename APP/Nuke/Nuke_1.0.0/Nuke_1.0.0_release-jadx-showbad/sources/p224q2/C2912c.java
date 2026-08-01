package p224q2;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.InterfaceC2771C;
import p219p2.InterfaceC2890a;
import p230r2.C3136l;
import p252v2.C3352a;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: q2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2912c extends AbstractC2770B {

    /* JADX INFO: renamed from: a */
    public volatile AbstractC2770B f9201a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f9202b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f9203c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2785n f9204d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C3352a f9205e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2913d f9206f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2912c(C2913d c2913d, boolean z5, boolean z6, C2785n c2785n, C3352a c3352a) {
        this.f9206f = c2913d;
        this.f9202b = z5;
        this.f9203c = z6;
        this.f9204d = c2785n;
        this.f9205e = c3352a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[SYNTHETIC] */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4964b(C3390a c3390a) throws IOException {
        Iterator it;
        if (this.f9202b) {
            c3390a.m5636P();
            return null;
        }
        AbstractC2770B abstractC2770BM4973b = this.f9201a;
        if (abstractC2770BM4973b == null) {
            C2785n c2785n = this.f9204d;
            InterfaceC2771C interfaceC2771C = this.f9206f;
            C3352a c3352a = this.f9205e;
            C3136l c3136l = c2785n.f8798d;
            c3136l.getClass();
            ConcurrentHashMap concurrentHashMap = c3136l.f9875e;
            if (interfaceC2771C == C3136l.f9873f) {
                interfaceC2771C = c3136l;
                it = c2785n.f8799e.iterator();
                boolean z5 = false;
                while (true) {
                    if (it.hasNext()) {
                        InterfaceC2771C interfaceC2771C2 = (InterfaceC2771C) it.next();
                        if (z5) {
                            AbstractC2770B abstractC2770BMo4967a = interfaceC2771C2.mo4967a(c2785n, c3352a);
                            if (abstractC2770BMo4967a != null) {
                                abstractC2770BM4973b = abstractC2770BMo4967a;
                                break;
                            }
                        } else if (interfaceC2771C2 == interfaceC2771C) {
                            z5 = true;
                        }
                    } else {
                        if (z5) {
                            throw new IllegalArgumentException("GSON cannot serialize or deserialize " + c3352a);
                        }
                        abstractC2770BM4973b = c2785n.m4973b(c3352a);
                    }
                }
                this.f9201a = abstractC2770BM4973b;
            } else {
                Class cls = c3352a.f10417a;
                InterfaceC2771C interfaceC2771C3 = (InterfaceC2771C) concurrentHashMap.get(cls);
                if (interfaceC2771C3 != null) {
                    if (interfaceC2771C3 == interfaceC2771C) {
                    }
                    it = c2785n.f8799e.iterator();
                    boolean z52 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.f9201a = abstractC2770BM4973b;
                } else {
                    InterfaceC2890a interfaceC2890a = (InterfaceC2890a) cls.getAnnotation(InterfaceC2890a.class);
                    if (interfaceC2890a != null) {
                        Class clsValue = interfaceC2890a.value();
                        if (InterfaceC2771C.class.isAssignableFrom(clsValue)) {
                            InterfaceC2771C interfaceC2771C4 = (InterfaceC2771C) c3136l.f9874d.m3725c(new C3352a(clsValue), true).mo602c();
                            InterfaceC2771C interfaceC2771C5 = (InterfaceC2771C) concurrentHashMap.putIfAbsent(cls, interfaceC2771C4);
                            if (interfaceC2771C5 != null) {
                                interfaceC2771C4 = interfaceC2771C5;
                            }
                            if (interfaceC2771C4 == interfaceC2771C) {
                            }
                        }
                    }
                    it = c2785n.f8799e.iterator();
                    boolean z522 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.f9201a = abstractC2770BM4973b;
                }
            }
        }
        return abstractC2770BM4973b.mo4964b(c3390a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082 A[SYNTHETIC] */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        Iterator it;
        if (this.f9203c) {
            c3391b.m5666n();
            return;
        }
        AbstractC2770B abstractC2770BM4973b = this.f9201a;
        if (abstractC2770BM4973b == null) {
            C2785n c2785n = this.f9204d;
            InterfaceC2771C interfaceC2771C = this.f9206f;
            C3352a c3352a = this.f9205e;
            C3136l c3136l = c2785n.f8798d;
            c3136l.getClass();
            ConcurrentHashMap concurrentHashMap = c3136l.f9875e;
            if (interfaceC2771C == C3136l.f9873f) {
                interfaceC2771C = c3136l;
                it = c2785n.f8799e.iterator();
                boolean z5 = false;
                while (true) {
                    if (it.hasNext()) {
                        InterfaceC2771C interfaceC2771C2 = (InterfaceC2771C) it.next();
                        if (z5) {
                            AbstractC2770B abstractC2770BMo4967a = interfaceC2771C2.mo4967a(c2785n, c3352a);
                            if (abstractC2770BMo4967a != null) {
                                abstractC2770BM4973b = abstractC2770BMo4967a;
                                break;
                            }
                        } else if (interfaceC2771C2 == interfaceC2771C) {
                            z5 = true;
                        }
                    } else {
                        if (z5) {
                            throw new IllegalArgumentException("GSON cannot serialize or deserialize " + c3352a);
                        }
                        abstractC2770BM4973b = c2785n.m4973b(c3352a);
                    }
                }
                this.f9201a = abstractC2770BM4973b;
            } else {
                Class cls = c3352a.f10417a;
                InterfaceC2771C interfaceC2771C3 = (InterfaceC2771C) concurrentHashMap.get(cls);
                if (interfaceC2771C3 != null) {
                    if (interfaceC2771C3 == interfaceC2771C) {
                    }
                    it = c2785n.f8799e.iterator();
                    boolean z52 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.f9201a = abstractC2770BM4973b;
                } else {
                    InterfaceC2890a interfaceC2890a = (InterfaceC2890a) cls.getAnnotation(InterfaceC2890a.class);
                    if (interfaceC2890a != null) {
                        Class clsValue = interfaceC2890a.value();
                        if (InterfaceC2771C.class.isAssignableFrom(clsValue)) {
                            InterfaceC2771C interfaceC2771C4 = (InterfaceC2771C) c3136l.f9874d.m3725c(new C3352a(clsValue), true).mo602c();
                            InterfaceC2771C interfaceC2771C5 = (InterfaceC2771C) concurrentHashMap.putIfAbsent(cls, interfaceC2771C4);
                            if (interfaceC2771C5 != null) {
                                interfaceC2771C4 = interfaceC2771C5;
                            }
                            if (interfaceC2771C4 == interfaceC2771C) {
                            }
                        }
                    }
                    it = c2785n.f8799e.iterator();
                    boolean z522 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.f9201a = abstractC2770BM4973b;
                }
            }
        }
        abstractC2770BM4973b.mo4965c(c3391b, obj);
    }
}
