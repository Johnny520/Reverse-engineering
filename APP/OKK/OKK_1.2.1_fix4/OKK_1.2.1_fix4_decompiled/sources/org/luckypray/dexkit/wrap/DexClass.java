package org.luckypray.dexkit.wrap;

import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.wrap.ISerializable;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: loaded from: classes.dex */
public final class DexClass implements ISerializable {
    public static final Companion Companion = new Companion(null);
    private final String typeName;

    public static final class Companion {
        private Companion() {
        }

        public final DexClass deserialize(String str) {
            AbstractC0307g.m703e(str, "descriptor");
            return new DexClass(str);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public DexClass(String str) {
        AbstractC0307g.m703e(str, "descriptor");
        this.typeName = DexSignUtil.getTypeName(str);
    }

    public static final DexClass deserialize(String str) {
        return Companion.deserialize(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DexClass) {
            return AbstractC0307g.m699a(this.typeName, ((DexClass) obj).typeName);
        }
        return false;
    }

    public final String getClassName() {
        return this.typeName;
    }

    public final Class<?> getInstance(ClassLoader classLoader) throws ClassNotFoundException {
        AbstractC0307g.m703e(classLoader, "classLoader");
        return InstanceUtil.INSTANCE.getClassInstance(classLoader, this);
    }

    public final String getSimpleName() {
        return AbstractC0425j.m1020Y0(this.typeName);
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public int hashCode() {
        return this.typeName.hashCode();
    }

    public final boolean isArray() {
        return AbstractC0433r.m1028C0(this.typeName, "[]");
    }

    @Override // org.luckypray.dexkit.wrap.ISerializable
    public String serialize() {
        return ISerializable.DefaultImpls.serialize(this);
    }

    public String toString() {
        return DexSignUtil.getTypeSign(this.typeName);
    }

    public DexClass(Class<?> cls) {
        AbstractC0307g.m703e(cls, "clazz");
        this.typeName = DexSignUtil.getTypeName(cls);
    }
}
