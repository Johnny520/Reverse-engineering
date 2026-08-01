package com.highcapable.kavaref.extension;

import com.highcapable.kavaref.extension.TypeRef;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p000.AbstractC0398kl;
import p000.C0921xc;
import p000.InterfaceC0298hw;
import p000.au0;
import p000.j50;
import p000.p30;
import p000.u60;
import p000.x51;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TypeRef<T> {
    private final u60 rawType$delegate;
    private final u60 type$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypeRef() {
        final int i = 0;
        this.type$delegate = new x51(new InterfaceC0298hw(this) { // from class: u91

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ TypeRef f6172e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f6172e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                int i2 = i;
                TypeRef typeRef = this.f6172e;
                switch (i2) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(typeRef);
                    default:
                        return TypeRef.rawType_delegate$lambda$0(typeRef);
                }
            }
        });
        final int i2 = 1;
        this.rawType$delegate = new x51(new InterfaceC0298hw(this) { // from class: u91

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ TypeRef f6172e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f6172e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                int i22 = i2;
                TypeRef typeRef = this.f6172e;
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
        return j50.m1676z(typeRef.getType());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Type type_delegate$lambda$0(TypeRef typeRef) {
        Class cls;
        Type genericSuperclass = typeRef.getClass().getGenericSuperclass();
        cls = TypeRef.class;
        if (!(genericSuperclass instanceof ParameterizedType)) {
            Class<TypeRef> clsM1929o = AbstractC0398kl.m1929o(au0.m211a(cls));
            if (p30.m3002l(genericSuperclass, clsM1929o != null ? clsM1929o : TypeRef.class)) {
                C0921xc.m5134o("TypeRef must be created with a type argument: object : TypeRef<...>() {}.");
                return null;
            }
            C0921xc.m5134o("Must only create direct subclasses of TypeRef.");
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type rawType = parameterizedType.getRawType();
        Class<TypeRef> clsM1929o2 = AbstractC0398kl.m1929o(au0.m211a(cls));
        if (!p30.m3002l(rawType, clsM1929o2 != null ? clsM1929o2 : TypeRef.class)) {
            C0921xc.m5134o("Must only create direct subclasses of TypeRef.");
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        Type type = actualTypeArguments.length == 0 ? null : actualTypeArguments[0];
        if (type != null) {
            return type;
        }
        C0921xc.m5134o("Type argument cannot be null.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        return (obj instanceof TypeRef) && p30.m3002l(getType(), ((TypeRef) obj).getType());
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
