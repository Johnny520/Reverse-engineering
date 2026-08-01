package kotlin.jvm.internal;

import java.util.Collections;
import kotlin.collections.AbstractC5179;
import kotlin.reflect.C5917;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.jvm.internal.C5910;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5228 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5229 f13320;

    static {
        C5229 c5229 = null;
        try {
            c5229 = (C5229) C5910.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c5229 == null) {
            c5229 = new C5229();
        }
        f13320 = c5229;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static InterfaceC5919 m9469(Class cls, C5917... c5917Arr) {
        C5229 c5229 = f13320;
        return c5229.mo9478(c5229.mo9476(cls), AbstractC5179.m9405(c5917Arr), false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC5919 m9470(Class cls, C5917 c5917) {
        C5229 c5229 = f13320;
        return c5229.mo9478(c5229.mo9476(cls), Collections.singletonList(c5917), false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC5919 m9471(Class cls) {
        C5229 c5229 = f13320;
        return c5229.mo9478(c5229.mo9476(cls), Collections.EMPTY_LIST, false);
    }
}
