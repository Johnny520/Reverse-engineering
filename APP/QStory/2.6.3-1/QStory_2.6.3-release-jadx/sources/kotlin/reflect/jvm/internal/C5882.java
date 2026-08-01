package kotlin.reflect.jvm.internal;

import java.util.HashSet;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5655;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5882 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5882 f14917 = new C5882(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5882 f14918 = new C5882(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14919;

    public /* synthetic */ C5882(int i) {
        this.f14919 = i;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        C5655 c5655 = (C5655) obj;
        ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) obj2;
        switch (this.f14919) {
            case 0:
                HashSet hashSet = C5836.f14768;
                c5655.getClass();
                protoBuf$Property.getClass();
                break;
            default:
                int i = C5824.f14748;
                c5655.getClass();
                protoBuf$Property.getClass();
                break;
        }
        return c5655.m10121(protoBuf$Property, true);
    }
}
