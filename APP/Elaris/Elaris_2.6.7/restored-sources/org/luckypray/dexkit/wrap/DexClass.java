package org.luckypray.dexkit.wrap;

import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.wrap.ISerializable;
import p000.AbstractC0260i5;
import p000.AbstractC0319ld;
import p000.AbstractC0431r2;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class DexClass implements ISerializable {
    public static final Companion Companion = new Companion(null);
    private final String typeName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexClass(String str) {
        str.getClass();
        this.typeName = DexSignUtil.getTypeName(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final DexClass deserialize(String str) {
        return Companion.deserialize(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DexClass) {
            return AbstractC0260i5.m643p(this.typeName, ((DexClass) obj).typeName);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getClassName() {
        return this.typeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Class<?> getInstance(ClassLoader classLoader) {
        classLoader.getClass();
        return InstanceUtil.INSTANCE.getClassInstance(classLoader, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSimpleName() {
        String str = this.typeName;
        str.getClass();
        int iLastIndexOf = str.lastIndexOf(46, str.length() - 1);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1, str.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTypeName() {
        return this.typeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.typeName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isArray() {
        return AbstractC0319ld.m756J(this.typeName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.wrap.ISerializable
    public String serialize() {
        return ISerializable.DefaultImpls.serialize(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return DexSignUtil.getTypeSign(this.typeName);
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.wrap.DexClass.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final DexClass deserialize(String str) {
            str.getClass();
            return new DexClass(str);
        }

        private Companion() {
        }
    }

    public DexClass(Class<?> cls) {
        cls.getClass();
        this.typeName = DexSignUtil.getTypeName(cls);
    }
}
