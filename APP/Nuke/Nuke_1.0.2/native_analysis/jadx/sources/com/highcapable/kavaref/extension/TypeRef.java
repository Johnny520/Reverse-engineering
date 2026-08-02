package com.highcapable.kavaref.extension;

import com.highcapable.kavaref.extension.TypeRef;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p000.AbstractC0460mg;
import p000.C0676s;
import p000.d72;
import p000.hx2;
import p000.j71;
import p000.p40;
import p000.t11;
import p000.x53;
import p000.xm0;
import p000.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
public abstract class TypeRef<T> {
    private final j71 rawType$delegate;
    private final j71 type$delegate;

    public TypeRef() {
        final int i = 0;
        this.type$delegate = new hx2(new xm0(this) { // from class: g63

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ TypeRef f3332i;

            {
                this.f3332i = this;
            }

            @Override // p000.xm0
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                int i2 = i;
                TypeRef typeRef = this.f3332i;
                switch (i2) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(typeRef);
                    default:
                        return TypeRef.rawType_delegate$lambda$0(typeRef);
                }
            }
        });
        final int i2 = 1;
        this.rawType$delegate = new hx2(new xm0(this) { // from class: g63

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ TypeRef f3332i;

            {
                this.f3332i = this;
            }

            @Override // p000.xm0
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                int i22 = i2;
                TypeRef typeRef = this.f3332i;
                switch (i22) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(typeRef);
                    default:
                        return TypeRef.rawType_delegate$lambda$0(typeRef);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class rawType_delegate$lambda$0(TypeRef typeRef) {
        Type type = typeRef.getType();
        while (!(type instanceof Class)) {
            if (!(type instanceof ParameterizedType)) {
                throw new x53("Cannot cast type " + type + " to java.lang.Class object.");
            }
            type = ((ParameterizedType) type).getRawType();
        }
        return (Class) type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type type_delegate$lambda$0(TypeRef typeRef) {
        Class cls;
        Type genericSuperclass = typeRef.getClass().getGenericSuperclass();
        cls = TypeRef.class;
        if (!(genericSuperclass instanceof ParameterizedType)) {
            Class<TypeRef> clsM3691A = p40.m3691A(d72.m967a(cls));
            if (t11.m5086l(genericSuperclass, clsM3691A != null ? clsM3691A : TypeRef.class)) {
                C0676s.m4653l("TypeRef must be created with a type argument: object : TypeRef<...>() {}.");
                return null;
            }
            C0676s.m4653l("Must only create direct subclasses of TypeRef.");
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type rawType = parameterizedType.getRawType();
        Class<TypeRef> clsM3691A2 = p40.m3691A(d72.m967a(cls));
        if (!t11.m5086l(rawType, clsM3691A2 != null ? clsM3691A2 : TypeRef.class)) {
            C0676s.m4653l("Must only create direct subclasses of TypeRef.");
            return null;
        }
        Type type = (Type) AbstractC0460mg.m3097l0(parameterizedType.getActualTypeArguments());
        if (type != null) {
            return type;
        }
        C0676s.m4653l("Type argument cannot be null.");
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof TypeRef) && t11.m5086l(getType(), ((TypeRef) obj).getType());
    }

    public final Class<T> getRawType() {
        return (Class) this.rawType$delegate.getValue();
    }

    public final Type getType() {
        return (Type) this.type$delegate.getValue();
    }

    public int hashCode() {
        return getType().hashCode();
    }

    public String toString() {
        return getType().toString();
    }
}
