package com.highcapable.kavaref.extension;

import com.highcapable.kavaref.extension.TypeRef;
import defpackage.d72;
import defpackage.hx2;
import defpackage.j71;
import defpackage.mg;
import defpackage.p40;
import defpackage.s;
import defpackage.t11;
import defpackage.x53;
import defpackage.xm0;
import defpackage.z41;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
public abstract class TypeRef<T> {
    private final j71 rawType$delegate;
    private final j71 type$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypeRef() {
        final int i = 0;
        this.type$delegate = new hx2(new xm0(this) { // from class: g63
            public final /* synthetic */ TypeRef i;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.i = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.xm0
            public final Object a() {
                int i2 = i;
                TypeRef typeRef = this.i;
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
            public final /* synthetic */ TypeRef i;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.i = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.xm0
            public final Object a() {
                int i22 = i2;
                TypeRef typeRef = this.i;
                switch (i22) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(typeRef);
                    default:
                        return TypeRef.rawType_delegate$lambda$0(typeRef);
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
                throw new x53("Cannot cast type " + type + " to java.lang.Class object.");
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
            Class<TypeRef> clsA = p40.A(d72.a(cls));
            if (t11.l(genericSuperclass, clsA != null ? clsA : TypeRef.class)) {
                s.l("TypeRef must be created with a type argument: object : TypeRef<...>() {}.");
                return null;
            }
            s.l("Must only create direct subclasses of TypeRef.");
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type rawType = parameterizedType.getRawType();
        Class<TypeRef> clsA2 = p40.A(d72.a(cls));
        if (!t11.l(rawType, clsA2 != null ? clsA2 : TypeRef.class)) {
            s.l("Must only create direct subclasses of TypeRef.");
            return null;
        }
        Type type = (Type) mg.l0(parameterizedType.getActualTypeArguments());
        if (type != null) {
            return type;
        }
        s.l("Type argument cannot be null.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        return (obj instanceof TypeRef) && t11.l(getType(), ((TypeRef) obj).getType());
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
