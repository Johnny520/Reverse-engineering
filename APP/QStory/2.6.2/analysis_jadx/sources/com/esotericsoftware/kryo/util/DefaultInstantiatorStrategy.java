package com.esotericsoftware.kryo.util;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.serializers.C3073;
import com.esotericsoftware.reflectasm.ConstructorAccess;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import p395.InterfaceC9132;
import p399.InterfaceC9153;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class DefaultInstantiatorStrategy implements InterfaceC9153 {
    private InterfaceC9153 fallbackStrategy;

    public DefaultInstantiatorStrategy(InterfaceC9153 interfaceC9153) {
        this.fallbackStrategy = interfaceC9153;
    }

    public InterfaceC9153 getFallbackInstantiatorStrategy() {
        return this.fallbackStrategy;
    }

    @Override // p399.InterfaceC9153
    public InterfaceC9132 newInstantiatorOf(final Class cls) {
        final Constructor declaredConstructor;
        if (!Util.isAndroid && (cls.getEnclosingClass() == null || !cls.isMemberClass() || Modifier.isStatic(cls.getModifiers()))) {
            try {
                final ConstructorAccess constructorAccess = ConstructorAccess.get(cls);
                return new InterfaceC9132() { // from class: com.esotericsoftware.kryo.util.DefaultInstantiatorStrategy.1
                    @Override // p395.InterfaceC9132
                    public Object newInstance() {
                        try {
                            return constructorAccess.newInstance();
                        } catch (Exception e) {
                            C3073.m6909("Error constructing instance of class: ", Util.className(cls), e);
                            return null;
                        }
                    }
                };
            } catch (Exception unused) {
            }
        }
        try {
            try {
                declaredConstructor = cls.getConstructor(null);
            } catch (Exception unused2) {
                declaredConstructor = cls.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
            }
            return new InterfaceC9132() { // from class: com.esotericsoftware.kryo.util.DefaultInstantiatorStrategy.2
                @Override // p395.InterfaceC9132
                public Object newInstance() {
                    try {
                        return declaredConstructor.newInstance(null);
                    } catch (Exception e) {
                        C3073.m6909("Error constructing instance of class: ", Util.className(cls), e);
                        return null;
                    }
                }
            };
        } catch (Exception unused3) {
            InterfaceC9153 interfaceC9153 = this.fallbackStrategy;
            if (interfaceC9153 != null) {
                return interfaceC9153.newInstantiatorOf(cls);
            }
            if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
                throw new KryoException("Class cannot be created (non-static member class): " + Util.className(cls));
            }
            StringBuilder sb = new StringBuilder("Class cannot be created (missing no-arg constructor): " + Util.className(cls));
            if (cls.getSimpleName().equals("")) {
                sb.append("\nNote: This is an anonymous class, which is not serializable by default in Kryo. Possible solutions:\n1. Remove uses of anonymous classes, including double brace initialization, from the containing\nclass. This is the safest solution, as anonymous classes don't have predictable names for serialization.\n2. Register a FieldSerializer for the containing class and call FieldSerializer\nsetIgnoreSyntheticFields(false) on it. This is not safe but may be sufficient temporarily.");
            }
            throw new KryoException(sb.toString());
        }
    }

    public void setFallbackInstantiatorStrategy(InterfaceC9153 interfaceC9153) {
        this.fallbackStrategy = interfaceC9153;
    }

    public DefaultInstantiatorStrategy() {
    }
}
