package kotlin.jvm.internal;

import java.util.Collections;
import kotlin.collections.AbstractC4347;
import kotlin.reflect.C5085;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.C5078;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4397 f12975;

    static {
        C4397 c4397 = null;
        try {
            c4397 = (C4397) C5078.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c4397 == null) {
            c4397 = new C4397();
        }
        f12975 = c4397;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static InterfaceC5087 m8910(Class cls, C5085... c5085Arr) {
        C4397 c4397 = f12975;
        return c4397.mo8919(c4397.mo8917(cls), AbstractC4347.m8846(c5085Arr), false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC5087 m8911(Class cls, C5085 c5085) {
        C4397 c4397 = f12975;
        return c4397.mo8919(c4397.mo8917(cls), Collections.singletonList(c5085), false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC5087 m8912(Class cls) {
        C4397 c4397 = f12975;
        return c4397.mo8919(c4397.mo8917(cls), Collections.EMPTY_LIST, false);
    }
}
