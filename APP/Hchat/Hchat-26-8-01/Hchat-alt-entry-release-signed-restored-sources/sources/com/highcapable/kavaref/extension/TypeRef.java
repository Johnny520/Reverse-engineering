package com.highcapable.kavaref.extension;

import com.highcapable.kavaref.extension.TypeRef;
import gg.AbstractC1416l;
import gg.AbstractC1426v;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1220a;
import p136j8.C2104o;
import p276sf.C3962i;
import p276sf.C3964k;
import p276sf.InterfaceC3956c;
import tf.AbstractC4165l;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TypeRef<T> {
    private final InterfaceC3956c rawType$delegate;
    private final InterfaceC3956c type$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypeRef() {
        final int i9 = 0;
        this.type$delegate = new C3962i(new InterfaceC1220a(this) { // from class: t6.b

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ TypeRef f13622h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13622h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(this.f13622h);
                    default:
                        return TypeRef.rawType_delegate$lambda$0(this.f13622h);
                }
            }
        });
        final int i10 = 1;
        this.rawType$delegate = new C3962i(new InterfaceC1220a(this) { // from class: t6.b

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ TypeRef f13622h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13622h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(this.f13622h);
                    default:
                        return TypeRef.rawType_delegate$lambda$0(this.f13622h);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Class rawType_delegate$lambda$0(TypeRef typeRef) {
        Type type = typeRef.getType();
        while (!(type instanceof Class)) {
            if (!(type instanceof ParameterizedType)) {
                throw new C3964k("Cannot cast type " + type + " to java.lang.Class object.");
            }
            type = ((ParameterizedType) type).getRawType();
        }
        return (Class) type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Type type_delegate$lambda$0(TypeRef typeRef) {
        Class cls;
        Type genericSuperclass = typeRef.getClass().getGenericSuperclass();
        cls = TypeRef.class;
        if (!(genericSuperclass instanceof ParameterizedType)) {
            Class<TypeRef> clsM51a0 = AbstractC0000a.m51a0(AbstractC1426v.m3834a(cls));
            if (AbstractC1416l.m3825a(genericSuperclass, clsM51a0 != null ? clsM51a0 : TypeRef.class)) {
                C2104o.m5276A("TypeRef must be created with a type argument: object : TypeRef<...>() {}.");
                return null;
            }
            C2104o.m5276A("Must only create direct subclasses of TypeRef.");
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type rawType = parameterizedType.getRawType();
        Class<TypeRef> clsM51a02 = AbstractC0000a.m51a0(AbstractC1426v.m3834a(cls));
        if (!AbstractC1416l.m3825a(rawType, clsM51a02 != null ? clsM51a02 : TypeRef.class)) {
            C2104o.m5276A("Must only create direct subclasses of TypeRef.");
            return null;
        }
        Type type = (Type) AbstractC4165l.m8391z0(parameterizedType.getActualTypeArguments());
        if (type != null) {
            return type;
        }
        C2104o.m5276A("Type argument cannot be null.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        return (obj instanceof TypeRef) && AbstractC1416l.m3825a(getType(), ((TypeRef) obj).getType());
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
