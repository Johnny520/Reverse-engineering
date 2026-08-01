package com.esotericsoftware.kryo.util;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.serializers.C3906;
import com.esotericsoftware.reflectasm.ConstructorAccess;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import p410.InterfaceC9939;
import p411.InterfaceC9940;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class DefaultInstantiatorStrategy implements InterfaceC9939 {
    private InterfaceC9939 fallbackStrategy;

    public DefaultInstantiatorStrategy(InterfaceC9939 interfaceC9939) {
        this.fallbackStrategy = interfaceC9939;
    }

    public InterfaceC9939 getFallbackInstantiatorStrategy() {
        return this.fallbackStrategy;
    }

    @Override // p410.InterfaceC9939
    public InterfaceC9940 newInstantiatorOf(final Class cls) {
        final Constructor declaredConstructor;
        if (!Util.isAndroid && (cls.getEnclosingClass() == null || !cls.isMemberClass() || Modifier.isStatic(cls.getModifiers()))) {
            try {
                final ConstructorAccess constructorAccess = ConstructorAccess.get(cls);
                return new InterfaceC9940() { // from class: com.esotericsoftware.kryo.util.DefaultInstantiatorStrategy.1
                    @Override // p411.InterfaceC9940
                    public Object newInstance() {
                        try {
                            return constructorAccess.newInstance();
                        } catch (Exception e) {
                            C3906.m7455("Error constructing instance of class: ", Util.className(cls), e);
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
            return new InterfaceC9940() { // from class: com.esotericsoftware.kryo.util.DefaultInstantiatorStrategy.2
                @Override // p411.InterfaceC9940
                public Object newInstance() {
                    try {
                        return declaredConstructor.newInstance(null);
                    } catch (Exception e) {
                        C3906.m7455("Error constructing instance of class: ", Util.className(cls), e);
                        return null;
                    }
                }
            };
        } catch (Exception unused3) {
            InterfaceC9939 interfaceC9939 = this.fallbackStrategy;
            if (interfaceC9939 != null) {
                return interfaceC9939.newInstantiatorOf(cls);
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

    public void setFallbackInstantiatorStrategy(InterfaceC9939 interfaceC9939) {
        this.fallbackStrategy = interfaceC9939;
    }

    public DefaultInstantiatorStrategy() {
    }
}
