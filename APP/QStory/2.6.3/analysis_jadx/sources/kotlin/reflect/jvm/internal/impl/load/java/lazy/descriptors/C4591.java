package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.name.C4691;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4591 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4590 f13391;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13392;

    public /* synthetic */ C4591(C4590 c4590, int i) {
        this.f13392 = i;
        this.f13391 = c4590;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f13392;
        C4590 c4590 = this.f13391;
        C4691 c4691 = (C4691) obj;
        switch (i) {
            case 0:
                c4691.getClass();
                return c4590.m9198(c4691);
            default:
                c4691.getClass();
                return c4590.m9196(c4691);
        }
    }
}
