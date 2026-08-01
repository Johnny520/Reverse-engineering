package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.name.C5523;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5423 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5422 f13736;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13737;

    public /* synthetic */ C5423(C5422 c5422, int i) {
        this.f13737 = i;
        this.f13736 = c5422;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f13737;
        C5422 c5422 = this.f13736;
        C5523 c5523 = (C5523) obj;
        switch (i) {
            case 0:
                c5523.getClass();
                return c5422.m9757(c5523);
            default:
                c5523.getClass();
                return c5422.m9755(c5523);
        }
    }
}
