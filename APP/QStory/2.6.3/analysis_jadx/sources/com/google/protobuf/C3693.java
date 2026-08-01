package com.google.protobuf;

import io.ktor.util.C4211;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏子世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3693 extends C3697 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C3693 f11492 = new C3693(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Map f11493;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Map f11494;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Map f11495;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Map f11496;

    public C3693() {
        this.f11495 = new HashMap();
        this.f11494 = new HashMap();
        this.f11493 = new HashMap();
        this.f11496 = new HashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7946(C3616 c3616) {
        C3578 c3578;
        Map map;
        Map map2;
        Extension$ExtensionType extension$ExtensionType = c3616.f11257;
        if (extension$ExtensionType == Extension$ExtensionType.IMMUTABLE || extension$ExtensionType == Extension$ExtensionType.MUTABLE) {
            if (c3616.mo7791().m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                InterfaceC3453 interfaceC3453 = c3616.f11260;
                if (interfaceC3453 == null) {
                    C4211.m8605(c3616.mo7791().f11348, "Registered message-type extension had null default instance: ");
                    return;
                }
                c3578 = new C3578(c3616.mo7791(), interfaceC3453);
            } else {
                c3578 = new C3578(c3616.mo7791(), null);
            }
            Extension$ExtensionType extension$ExtensionType2 = c3616.f11257;
            C3657 c3657 = c3578.f11206;
            if (!c3657.f11355.hasExtendee()) {
                C5925.m11310("ExtensionRegistry.add() was given a FieldDescriptor for a regular (non-extension) field.");
                return;
            }
            int i = AbstractC3581.f11207[extension$ExtensionType2.ordinal()];
            if (i == 1) {
                map = this.f11495;
                map2 = this.f11493;
            } else {
                if (i != 2) {
                    return;
                }
                map = this.f11494;
                map2 = this.f11496;
            }
            map.put(c3657.f11348, c3578);
            map2.put(new C3577(c3657.f11346, c3657.f11355.getNumber()), c3578);
            if (c3657.f11346.m7876().getMessageSetWireFormat() && c3657.m7857() == Descriptors$FieldDescriptor$Type.MESSAGE && c3657.m7856() && c3657.m7862() == c3657.m7858()) {
                map.put(c3657.m7858().f11373, c3578);
            }
        }
    }

    public C3693(int i) {
        super(C3697.f11500);
        Map map = Collections.EMPTY_MAP;
        this.f11495 = map;
        this.f11494 = map;
        this.f11493 = map;
        this.f11496 = map;
    }
}
