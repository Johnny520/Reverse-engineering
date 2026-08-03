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
    public static final Companion Companion = null;
    private final String typeName;

    public static final class Companion {
        private Companion() {
        }

        public final DexClass deserialize(String r2) {
            AbstractC0307g.m703e(r2, "descriptor");
            return new DexClass(r2);
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public DexClass(String r2) {
        AbstractC0307g.m703e(r2, "descriptor");
        this.typeName = DexSignUtil.getTypeName(r2);
    }

    public static final DexClass deserialize(String r1) {
        return Companion.deserialize(r1);
    }

    public boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof DexClass) == true) goto L10;
        return false;
    L10:
        return AbstractC0307g.m699a(this.typeName, ((DexClass) r2).typeName);
    }

    public final String getClassName() {
        return this.typeName;
    }

    public final Class<?> getInstance(ClassLoader r2) throws ClassNotFoundException {
        AbstractC0307g.m703e(r2, "classLoader");
        return InstanceUtil.INSTANCE.getClassInstance(r2, this);
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

    public DexClass(Class<?> r2) {
        AbstractC0307g.m703e(r2, "clazz");
        this.typeName = DexSignUtil.getTypeName(r2);
    }
}
