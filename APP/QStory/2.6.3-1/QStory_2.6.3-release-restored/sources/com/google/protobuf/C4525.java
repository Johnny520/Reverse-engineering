package com.google.protobuf;

import io.ktor.util.C5043;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏子世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C4525 extends C4529 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4525 f11837 = new C4525(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Map f11838;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Map f11839;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Map f11840;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Map f11841;

    public C4525() {
        this.f11840 = new HashMap();
        this.f11839 = new HashMap();
        this.f11838 = new HashMap();
        this.f11841 = new HashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m8505(C4448 c4448) {
        C4410 c4410;
        Map map;
        Map map2;
        Extension$ExtensionType extension$ExtensionType = c4448.f11602;
        if (extension$ExtensionType == Extension$ExtensionType.IMMUTABLE || extension$ExtensionType == Extension$ExtensionType.MUTABLE) {
            if (c4448.mo8350().m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                InterfaceC4285 interfaceC4285 = c4448.f11605;
                if (interfaceC4285 == null) {
                    C5043.m9164(c4448.mo8350().f11693, "Registered message-type extension had null default instance: ");
                    return;
                }
                c4410 = new C4410(c4448.mo8350(), interfaceC4285);
            } else {
                c4410 = new C4410(c4448.mo8350(), null);
            }
            Extension$ExtensionType extension$ExtensionType2 = c4448.f11602;
            C4489 c4489 = c4410.f11551;
            if (!c4489.f11700.hasExtendee()) {
                C6755.m11869("ExtensionRegistry.add() was given a FieldDescriptor for a regular (non-extension) field.");
                return;
            }
            int i = AbstractC4413.f11552[extension$ExtensionType2.ordinal()];
            if (i == 1) {
                map = this.f11840;
                map2 = this.f11838;
            } else {
                if (i != 2) {
                    return;
                }
                map = this.f11839;
                map2 = this.f11841;
            }
            map.put(c4489.f11693, c4410);
            map2.put(new C4409(c4489.f11691, c4489.f11700.getNumber()), c4410);
            if (c4489.f11691.m8435().getMessageSetWireFormat() && c4489.m8416() == Descriptors$FieldDescriptor$Type.MESSAGE && c4489.m8415() && c4489.m8421() == c4489.m8417()) {
                map.put(c4489.m8417().f11718, c4410);
            }
        }
    }

    public C4525(int i) {
        super(C4529.f11845);
        Map map = Collections.EMPTY_MAP;
        this.f11840 = map;
        this.f11839 = map;
        this.f11838 = map;
        this.f11841 = map;
    }
}
