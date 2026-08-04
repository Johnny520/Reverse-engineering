package yyds;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲈᛵᲁᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2669 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C2805 f13106;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public volatile AbstractC2720 f13107;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ boolean f13108;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ boolean f13109;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C2175 f13110;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0114 f13111;

    public C2669(C2175 c2175, boolean z, boolean z2, C0114 c0114, C2805 c2805) {
        this.f13110 = c2175;
        this.f13108 = z;
        this.f13109 = z2;
        this.f13111 = c0114;
        this.f13106 = c2805;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085 A[SYNTHETIC] */
    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo484(C1942 c1942) throws IOException {
        Iterator it;
        if (this.f13108) {
            c1942.m3754();
            return null;
        }
        AbstractC2720 abstractC2720M521 = this.f13107;
        if (abstractC2720M521 == null) {
            C0114 c0114 = this.f13111;
            InterfaceC0652 interfaceC0652 = this.f13110;
            C2805 c2805 = this.f13106;
            C2556 c2556 = c0114.f799;
            if (interfaceC0652 == C2556.f12624) {
                c2556.getClass();
            } else {
                Class cls = c2805.f13682;
                InterfaceC0652 interfaceC06522 = (InterfaceC0652) c2556.f12626.get(cls);
                if (interfaceC06522 != null) {
                    if (interfaceC06522 == interfaceC0652) {
                    }
                    it = c0114.f793.iterator();
                    boolean z = false;
                    while (true) {
                        if (it.hasNext()) {
                            InterfaceC0652 interfaceC06523 = (InterfaceC0652) it.next();
                            if (z) {
                                AbstractC2720 abstractC2720Mo976 = interfaceC06523.mo976(c0114, c2805);
                                if (abstractC2720Mo976 != null) {
                                    abstractC2720M521 = abstractC2720Mo976;
                                    break;
                                }
                            } else if (interfaceC06523 == interfaceC0652) {
                                z = true;
                            }
                        } else {
                            if (z) {
                                C0188.m795(c2805, "GSON cannot serialize or deserialize ");
                                return null;
                            }
                            abstractC2720M521 = c0114.m521(c2805);
                        }
                    }
                    this.f13107 = abstractC2720M521;
                } else {
                    InterfaceC0048 interfaceC0048 = (InterfaceC0048) cls.getAnnotation(InterfaceC0048.class);
                    if (interfaceC0048 != null) {
                        Class clsValue = interfaceC0048.value();
                        if (InterfaceC0652.class.isAssignableFrom(clsValue)) {
                            InterfaceC0652 interfaceC06524 = (InterfaceC0652) c2556.f12625.m4051(new C2805(clsValue), true).mo807();
                            InterfaceC0652 interfaceC06525 = (InterfaceC0652) c2556.f12626.putIfAbsent(cls, interfaceC06524);
                            if (interfaceC06525 != null) {
                                interfaceC06524 = interfaceC06525;
                            }
                            if (interfaceC06524 == interfaceC0652) {
                            }
                        }
                    }
                    it = c0114.f793.iterator();
                    boolean z2 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.f13107 = abstractC2720M521;
                }
            }
            interfaceC0652 = c2556;
            it = c0114.f793.iterator();
            boolean z22 = false;
            while (true) {
                if (it.hasNext()) {
                }
            }
            this.f13107 = abstractC2720M521;
        }
        return abstractC2720M521.mo484(c1942);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084 A[SYNTHETIC] */
    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo485(C1405 c1405, Object obj) {
        Iterator it;
        if (this.f13109) {
            c1405.m2857();
            return;
        }
        AbstractC2720 abstractC2720M521 = this.f13107;
        if (abstractC2720M521 == null) {
            C0114 c0114 = this.f13111;
            InterfaceC0652 interfaceC0652 = this.f13110;
            C2805 c2805 = this.f13106;
            C2556 c2556 = c0114.f799;
            if (interfaceC0652 == C2556.f12624) {
                c2556.getClass();
            } else {
                Class cls = c2805.f13682;
                InterfaceC0652 interfaceC06522 = (InterfaceC0652) c2556.f12626.get(cls);
                if (interfaceC06522 != null) {
                    if (interfaceC06522 == interfaceC0652) {
                    }
                    it = c0114.f793.iterator();
                    boolean z = false;
                    while (true) {
                        if (it.hasNext()) {
                            InterfaceC0652 interfaceC06523 = (InterfaceC0652) it.next();
                            if (z) {
                                AbstractC2720 abstractC2720Mo976 = interfaceC06523.mo976(c0114, c2805);
                                if (abstractC2720Mo976 != null) {
                                    abstractC2720M521 = abstractC2720Mo976;
                                    break;
                                }
                            } else if (interfaceC06523 == interfaceC0652) {
                                z = true;
                            }
                        } else {
                            if (z) {
                                C0188.m795(c2805, "GSON cannot serialize or deserialize ");
                                return;
                            }
                            abstractC2720M521 = c0114.m521(c2805);
                        }
                    }
                    this.f13107 = abstractC2720M521;
                } else {
                    InterfaceC0048 interfaceC0048 = (InterfaceC0048) cls.getAnnotation(InterfaceC0048.class);
                    if (interfaceC0048 != null) {
                        Class clsValue = interfaceC0048.value();
                        if (InterfaceC0652.class.isAssignableFrom(clsValue)) {
                            InterfaceC0652 interfaceC06524 = (InterfaceC0652) c2556.f12625.m4051(new C2805(clsValue), true).mo807();
                            InterfaceC0652 interfaceC06525 = (InterfaceC0652) c2556.f12626.putIfAbsent(cls, interfaceC06524);
                            if (interfaceC06525 != null) {
                                interfaceC06524 = interfaceC06525;
                            }
                            if (interfaceC06524 == interfaceC0652) {
                            }
                        }
                    }
                    it = c0114.f793.iterator();
                    boolean z2 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.f13107 = abstractC2720M521;
                }
            }
            interfaceC0652 = c2556;
            it = c0114.f793.iterator();
            boolean z22 = false;
            while (true) {
                if (it.hasNext()) {
                }
            }
            this.f13107 = abstractC2720M521;
        }
        abstractC2720M521.mo485(c1405, obj);
    }
}
