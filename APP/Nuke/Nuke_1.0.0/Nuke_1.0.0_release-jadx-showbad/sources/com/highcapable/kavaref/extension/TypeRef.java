package com.highcapable.kavaref.extension;

import com.highcapable.kavaref.extension.TypeRef;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p049I2.AbstractC0797o;
import p056K2.InterfaceC0879e;
import p061L2.AbstractC0972l;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1676u;
import p127Z2.AbstractC1784a;
import p168h.InterfaceC2191a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC2191a
public abstract class TypeRef<T> {
    private final InterfaceC0879e rawType$delegate;
    private final InterfaceC0879e type$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypeRef() {
        final int i5 = 0;
        this.type$delegate = AbstractC0797o.m1396u(new InterfaceC1599a(this) { // from class: B2.b

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ TypeRef f768e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f768e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                switch (i5) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(this.f768e);
                    default:
                        return TypeRef.rawType_delegate$lambda$1(this.f768e);
                }
            }
        });
        final int i6 = 1;
        this.rawType$delegate = AbstractC0797o.m1396u(new InterfaceC1599a(this) { // from class: B2.b

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ TypeRef f768e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f768e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                switch (i6) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(this.f768e);
                    default:
                        return TypeRef.rawType_delegate$lambda$1(this.f768e);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Class rawType_delegate$lambda$1(TypeRef typeRef) {
        return AbstractC1784a.m3207U(typeRef.getType());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Type type_delegate$lambda$0(TypeRef typeRef) {
        Class cls;
        Type genericSuperclass = typeRef.getClass().getGenericSuperclass();
        cls = TypeRef.class;
        if (!(genericSuperclass instanceof ParameterizedType)) {
            Class<TypeRef> clsM3240z = AbstractC1784a.m3240z(AbstractC1676u.m2995a(cls));
            if (AbstractC1665j.m2981a(genericSuperclass, clsM3240z != null ? clsM3240z : TypeRef.class)) {
                throw new IllegalStateException("TypeRef must be created with a type argument: object : TypeRef<...>() {}.");
            }
            throw new IllegalStateException("Must only create direct subclasses of TypeRef.");
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type rawType = parameterizedType.getRawType();
        Class<TypeRef> clsM3240z2 = AbstractC1784a.m3240z(AbstractC1676u.m2995a(cls));
        if (!AbstractC1665j.m2981a(rawType, clsM3240z2 != null ? clsM3240z2 : TypeRef.class)) {
            throw new IllegalStateException("Must only create direct subclasses of TypeRef.");
        }
        Type type = (Type) AbstractC0972l.m2001Y(parameterizedType.getActualTypeArguments());
        if (type != null) {
            return type;
        }
        throw new IllegalStateException("Type argument cannot be null.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        return (obj instanceof TypeRef) && AbstractC1665j.m2981a(getType(), ((TypeRef) obj).getType());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Class<T> getRawType() {
        return (Class) this.rawType$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Type getType() {
        return (Type) this.type$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return getType().hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return getType().toString();
    }
}
