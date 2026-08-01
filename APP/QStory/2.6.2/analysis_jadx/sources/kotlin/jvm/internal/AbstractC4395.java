package kotlin.jvm.internal;

import java.util.Collections;
import kotlin.collections.AbstractC4346;
import kotlin.reflect.C5084;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.jvm.internal.C5077;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4395 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4396 f12971;

    static {
        C4396 c4396 = null;
        try {
            c4396 = (C4396) C5077.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c4396 == null) {
            c4396 = new C4396();
        }
        f12971 = c4396;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static InterfaceC5086 m8920(Class cls, C5084... c5084Arr) {
        C4396 c4396 = f12971;
        return c4396.mo8929(c4396.mo8927(cls), AbstractC4346.m8850(c5084Arr), false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC5086 m8921(Class cls, C5084 c5084) {
        C4396 c4396 = f12971;
        return c4396.mo8929(c4396.mo8927(cls), Collections.singletonList(c5084), false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC5086 m8922(Class cls) {
        C4396 c4396 = f12971;
        return c4396.mo8929(c4396.mo8927(cls), Collections.EMPTY_LIST, false);
    }
}
