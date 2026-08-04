package com.highcapable.kavaref.extension;

import com.highcapable.kavaref.extension.TypeRef;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import yyds.AbstractC0578;
import yyds.AbstractC1544;
import yyds.AbstractC1700;
import yyds.AbstractC2070;
import yyds.AbstractC2217;
import yyds.C0078;
import yyds.C0188;
import yyds.InterfaceC0826;
import yyds.InterfaceC2266;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TypeRef<T> {
    private final InterfaceC0826 rawType$delegate;
    private final InterfaceC0826 type$delegate;

    public TypeRef() {
        final int i = 0;
        this.type$delegate = new C0078(new InterfaceC2266(this) { // from class: yyds.ᛷᲀᲁᛶ

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ TypeRef f8329;

            {
                this.f8329 = this;
            }

            @Override // yyds.InterfaceC2266
            /* JADX INFO: renamed from: ᛲᲈᲁ */
            public final Object mo731() {
                int i2 = i;
                TypeRef typeRef = this.f8329;
                switch (i2) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(typeRef);
                    default:
                        return TypeRef.rawType_delegate$lambda$0(typeRef);
                }
            }
        });
        final int i2 = 1;
        this.rawType$delegate = new C0078(new InterfaceC2266(this) { // from class: yyds.ᛷᲀᲁᛶ

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ TypeRef f8329;

            {
                this.f8329 = this;
            }

            @Override // yyds.InterfaceC2266
            /* JADX INFO: renamed from: ᛲᲈᲁ */
            public final Object mo731() {
                int i22 = i2;
                TypeRef typeRef = this.f8329;
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
        return AbstractC2217.m4203(typeRef.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type type_delegate$lambda$0(TypeRef typeRef) {
        Class cls;
        Type genericSuperclass = typeRef.getClass().getGenericSuperclass();
        cls = TypeRef.class;
        if (!(genericSuperclass instanceof ParameterizedType)) {
            Class<TypeRef> clsM1450 = AbstractC0578.m1450(AbstractC1700.m3448(cls));
            if (AbstractC1544.m3188(genericSuperclass, clsM1450 != null ? clsM1450 : TypeRef.class)) {
                C0188.m800("TypeRef must be created with a type argument: object : TypeRef<...>() {}.");
                return null;
            }
            C0188.m800("Must only create direct subclasses of TypeRef.");
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type rawType = parameterizedType.getRawType();
        Class<TypeRef> clsM14502 = AbstractC0578.m1450(AbstractC1700.m3448(cls));
        if (!AbstractC1544.m3188(rawType, clsM14502 != null ? clsM14502 : TypeRef.class)) {
            C0188.m800("Must only create direct subclasses of TypeRef.");
            return null;
        }
        Type type = (Type) AbstractC2070.m3941(parameterizedType.getActualTypeArguments());
        if (type != null) {
            return type;
        }
        C0188.m800("Type argument cannot be null.");
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof TypeRef) && AbstractC1544.m3188(getType(), ((TypeRef) obj).getType());
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
