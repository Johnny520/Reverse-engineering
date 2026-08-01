package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.collection.C1123;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import p097.InterfaceC7856;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5282 extends AbstractC5269 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7856 f13423;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Type f13424;

    public C5282(Type type) {
        InterfaceC7856 c5284;
        type.getClass();
        this.f13424 = type;
        if (type instanceof Class) {
            c5284 = new C5284((Class) type);
        } else if (type instanceof TypeVariable) {
            c5284 = new C5270((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                C1123.m1407("Not a classifier type (", type.getClass(), "): ", type);
                throw null;
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            c5284 = new C5284((Class) rawType);
        }
        this.f13423 = c5284;
    }

    @Override // p097.InterfaceC7857
    public final Collection getAnnotations() {
        return EmptyList.INSTANCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m9545() {
        Type type = this.f13424;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            typeParameters.getClass();
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m9546() {
        AbstractC5269 c5271;
        List<Type> listM9534 = AbstractC5263.m9534(this.f13424);
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM9534, 10));
        for (Type type : listM9534) {
            type.getClass();
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                c5271 = cls.isPrimitive() ? new C5271(cls) : ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new C5283(type) : type instanceof WildcardType ? new C5259((WildcardType) type) : new C5282(type);
            }
            arrayList.add(c5271);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5269
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Type mo9530() {
        return this.f13424;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5269, p097.InterfaceC7857
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C5262 mo9531(C5519 c5519) {
        c5519.getClass();
        return null;
    }
}
