package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.C3253;
import com.google.gson.InterfaceC3249;
import com.google.gson.internal.AbstractC3221;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import p260.C8246;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8308 implements InterfaceC3249 {
    @Override // com.google.gson.InterfaceC3249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3251 mo7321(C3253 c3253, C8246 c8246) {
        Type type = c8246.f22814;
        boolean z = type instanceof GenericArrayType;
        if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new C8307(c3253, c3253.m7340(new C8246(genericComponentType)), AbstractC3221.m7314(genericComponentType));
    }
}
