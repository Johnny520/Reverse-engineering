package com.google.gson.internal;

import com.google.gson.AbstractC4083;
import com.google.gson.C4085;
import com.google.gson.InterfaceC4081;
import io.ktor.util.C5043;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import p275.C9073;
import p275.C9074;
import p276.C9075;
import p283.InterfaceC9095;
import p287.C9153;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4055 extends AbstractC4083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ C4054 f11220;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C9075 f11221;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ C4085 f11222;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ boolean f11223;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ boolean f11224;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public volatile AbstractC4083 f11225;

    public C4055(C4054 c4054, boolean z, boolean z2, C4085 c4085, C9075 c9075) {
        this.f11220 = c4054;
        this.f11224 = z;
        this.f11223 = z2;
        this.f11222 = c4085;
        this.f11221 = c9075;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082 A[SYNTHETIC] */
    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo7881(C9073 c9073, Object obj) {
        Iterator it;
        if (this.f11223) {
            c9073.m14337();
            return;
        }
        AbstractC4083 abstractC4083M7899 = this.f11225;
        if (abstractC4083M7899 == null) {
            C4085 c4085 = this.f11222;
            InterfaceC4081 interfaceC4081 = this.f11220;
            C9075 c9075 = this.f11221;
            C9153 c9153 = c4085.f11287;
            c9153.getClass();
            ConcurrentHashMap concurrentHashMap = c9153.f23302;
            if (interfaceC4081 == C9153.f23301) {
                interfaceC4081 = c9153;
                it = c4085.f11286.iterator();
                boolean z = false;
                while (true) {
                    if (it.hasNext()) {
                        InterfaceC4081 interfaceC40812 = (InterfaceC4081) it.next();
                        if (z) {
                            AbstractC4083 abstractC4083Mo7880 = interfaceC40812.mo7880(c4085, c9075);
                            if (abstractC4083Mo7880 != null) {
                                abstractC4083M7899 = abstractC4083Mo7880;
                                break;
                            }
                        } else if (interfaceC40812 == interfaceC4081) {
                            z = true;
                        }
                    } else {
                        if (z) {
                            C5043.m9163(c9075, "GSON cannot serialize or deserialize ");
                            return;
                        }
                        abstractC4083M7899 = c4085.m7899(c9075);
                    }
                }
                this.f11225 = abstractC4083M7899;
            } else {
                Class cls = c9075.f23160;
                InterfaceC4081 interfaceC40813 = (InterfaceC4081) concurrentHashMap.get(cls);
                if (interfaceC40813 != null) {
                    if (interfaceC40813 == interfaceC4081) {
                    }
                    it = c4085.f11286.iterator();
                    boolean z2 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.f11225 = abstractC4083M7899;
                } else {
                    InterfaceC9095 interfaceC9095 = (InterfaceC9095) cls.getAnnotation(InterfaceC9095.class);
                    if (interfaceC9095 != null) {
                        Class clsValue = interfaceC9095.value();
                        if (InterfaceC4081.class.isAssignableFrom(clsValue)) {
                            InterfaceC4081 interfaceC40814 = (InterfaceC4081) c9153.f23303.m14108(new C9075(clsValue), true).mo5042();
                            InterfaceC4081 interfaceC40815 = (InterfaceC4081) concurrentHashMap.putIfAbsent(cls, interfaceC40814);
                            if (interfaceC40815 != null) {
                                interfaceC40814 = interfaceC40815;
                            }
                            if (interfaceC40814 == interfaceC4081) {
                            }
                        }
                    }
                    it = c4085.f11286.iterator();
                    boolean z22 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.f11225 = abstractC4083M7899;
                }
            }
        }
        abstractC4083M7899.mo7881(c9073, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[SYNTHETIC] */
    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7882(C9074 c9074) throws IOException {
        Iterator it;
        if (this.f11224) {
            c9074.m14370();
            return null;
        }
        AbstractC4083 abstractC4083M7899 = this.f11225;
        if (abstractC4083M7899 == null) {
            C4085 c4085 = this.f11222;
            InterfaceC4081 interfaceC4081 = this.f11220;
            C9075 c9075 = this.f11221;
            C9153 c9153 = c4085.f11287;
            c9153.getClass();
            ConcurrentHashMap concurrentHashMap = c9153.f23302;
            if (interfaceC4081 == C9153.f23301) {
                interfaceC4081 = c9153;
                it = c4085.f11286.iterator();
                boolean z = false;
                while (true) {
                    if (it.hasNext()) {
                        InterfaceC4081 interfaceC40812 = (InterfaceC4081) it.next();
                        if (z) {
                            AbstractC4083 abstractC4083Mo7880 = interfaceC40812.mo7880(c4085, c9075);
                            if (abstractC4083Mo7880 != null) {
                                abstractC4083M7899 = abstractC4083Mo7880;
                                break;
                            }
                        } else if (interfaceC40812 == interfaceC4081) {
                            z = true;
                        }
                    } else {
                        if (z) {
                            C5043.m9163(c9075, "GSON cannot serialize or deserialize ");
                            return null;
                        }
                        abstractC4083M7899 = c4085.m7899(c9075);
                    }
                }
                this.f11225 = abstractC4083M7899;
            } else {
                Class cls = c9075.f23160;
                InterfaceC4081 interfaceC40813 = (InterfaceC4081) concurrentHashMap.get(cls);
                if (interfaceC40813 != null) {
                    if (interfaceC40813 == interfaceC4081) {
                    }
                    it = c4085.f11286.iterator();
                    boolean z2 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.f11225 = abstractC4083M7899;
                } else {
                    InterfaceC9095 interfaceC9095 = (InterfaceC9095) cls.getAnnotation(InterfaceC9095.class);
                    if (interfaceC9095 != null) {
                        Class clsValue = interfaceC9095.value();
                        if (InterfaceC4081.class.isAssignableFrom(clsValue)) {
                            InterfaceC4081 interfaceC40814 = (InterfaceC4081) c9153.f23303.m14108(new C9075(clsValue), true).mo5042();
                            InterfaceC4081 interfaceC40815 = (InterfaceC4081) concurrentHashMap.putIfAbsent(cls, interfaceC40814);
                            if (interfaceC40815 != null) {
                                interfaceC40814 = interfaceC40815;
                            }
                            if (interfaceC40814 == interfaceC4081) {
                            }
                        }
                    }
                    it = c4085.f11286.iterator();
                    boolean z22 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.f11225 = abstractC4083M7899;
                }
            }
        }
        return abstractC4083M7899.mo7882(c9074);
    }
}
