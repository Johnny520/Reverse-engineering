package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.collection.C0276;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import p081.InterfaceC7026;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4449 extends AbstractC4436 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7026 f13074;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Type f13075;

    public C4449(Type type) {
        InterfaceC7026 c4451;
        type.getClass();
        this.f13075 = type;
        if (type instanceof Class) {
            c4451 = new C4451((Class) type);
        } else if (type instanceof TypeVariable) {
            c4451 = new C4437((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                C0276.m846("Not a classifier type (", type.getClass(), "): ", type);
                throw null;
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            c4451 = new C4451((Class) rawType);
        }
        this.f13074 = c4451;
    }

    @Override // p081.InterfaceC7027
    public final Collection getAnnotations() {
        return EmptyList.INSTANCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m8996() {
        Type type = this.f13075;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m8997() {
        /*
            r5 = this;
            java.lang.reflect.Type r5 = r5.f13075
            java.util.List r5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430.m8985(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.AbstractC4344.m8832(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L15:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r5.next()
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            r1.getClass()
            boolean r2 = r1 instanceof java.lang.Class
            if (r2 == 0) goto L37
            r3 = r1
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r4 = r3.isPrimitive()
            if (r4 == 0) goto L37
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰苏世哲 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰苏世哲
            r1.<init>(r3)
            goto L60
        L37:
            boolean r3 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r3 != 0) goto L5a
            if (r2 == 0) goto L47
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r2 = r2.isArray()
            if (r2 == 0) goto L47
            goto L5a
        L47:
            boolean r2 = r1 instanceof java.lang.reflect.WildcardType
            if (r2 == 0) goto L54
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子世楪苏兰哲 r2 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子世楪苏兰哲
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            r2.<init>(r1)
        L52:
            r1 = r2
            goto L60
        L54:
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏兰哲世 r2 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏兰哲世
            r2.<init>(r1)
            goto L52
        L5a:
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏哲世兰 r2 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏哲世兰
            r2.<init>(r1)
            goto L52
        L60:
            r0.add(r1)
            goto L15
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4449.m8997():java.util.ArrayList");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4436
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Type mo8981() {
        return this.f13075;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4436, p081.InterfaceC7027
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4429 mo8982(C4686 c4686) {
        c4686.getClass();
        return null;
    }
}
