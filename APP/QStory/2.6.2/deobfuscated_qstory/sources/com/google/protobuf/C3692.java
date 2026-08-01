package com.google.protobuf;

import io.ktor.util.C4210;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏子世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C3692 extends C3696 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C3692 f11487 = new C3692(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Map f11488;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Map f11489;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Map f11490;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Map f11491;

    public C3692() {
        this.f11490 = new HashMap();
        this.f11489 = new HashMap();
        this.f11488 = new HashMap();
        this.f11491 = new HashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7959(C3615 c3615) {
        C3577 c3577;
        Map map;
        Map map2;
        Extension$ExtensionType extension$ExtensionType = c3615.f11252;
        if (extension$ExtensionType == Extension$ExtensionType.IMMUTABLE || extension$ExtensionType == Extension$ExtensionType.MUTABLE) {
            if (c3615.mo7804().m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                InterfaceC3452 interfaceC3452 = c3615.f11255;
                if (interfaceC3452 == null) {
                    C4210.m8615(c3615.mo7804().f11343, "Registered message-type extension had null default instance: ");
                    return;
                }
                c3577 = new C3577(c3615.mo7804(), interfaceC3452);
            } else {
                c3577 = new C3577(c3615.mo7804(), null);
            }
            Extension$ExtensionType extension$ExtensionType2 = c3615.f11252;
            C3656 c3656 = c3577.f11201;
            if (!c3656.f11350.hasExtendee()) {
                C5919.m11249("ExtensionRegistry.add() was given a FieldDescriptor for a regular (non-extension) field.");
                return;
            }
            int i = AbstractC3580.f11202[extension$ExtensionType2.ordinal()];
            if (i == 1) {
                map = this.f11490;
                map2 = this.f11488;
            } else {
                if (i != 2) {
                    return;
                }
                map = this.f11489;
                map2 = this.f11491;
            }
            map.put(c3656.f11343, c3577);
            map2.put(new C3576(c3656.f11341, c3656.f11350.getNumber()), c3577);
            if (c3656.f11341.m7889().getMessageSetWireFormat() && c3656.m7870() == Descriptors$FieldDescriptor$Type.MESSAGE && c3656.m7869() && c3656.m7875() == c3656.m7871()) {
                map.put(c3656.m7871().f11368, c3577);
            }
        }
    }

    public C3692(int i) {
        super(C3696.f11495);
        Map map = Collections.EMPTY_MAP;
        this.f11490 = map;
        this.f11489 = map;
        this.f11488 = map;
        this.f11491 = map;
    }
}
