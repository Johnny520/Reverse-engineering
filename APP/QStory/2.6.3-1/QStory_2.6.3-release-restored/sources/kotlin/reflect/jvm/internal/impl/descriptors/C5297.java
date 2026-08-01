package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.name.C5519;
import p062.InterfaceC7310;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5297 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5519 f13437;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13438;

    public /* synthetic */ C5297(C5519 c5519, int i) {
        this.f13438 = i;
        this.f13437 = c5519;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f13438;
        C5519 c5519 = this.f13437;
        switch (i) {
            case 0:
                C5519 c55192 = (C5519) obj;
                c55192.getClass();
                return Boolean.valueOf(!c55192.f14041.m9873() && c55192.m9879().equals(c5519));
            default:
                InterfaceC7310 interfaceC7310 = (InterfaceC7310) obj;
                interfaceC7310.getClass();
                return interfaceC7310.mo10076(c5519);
        }
    }
}
