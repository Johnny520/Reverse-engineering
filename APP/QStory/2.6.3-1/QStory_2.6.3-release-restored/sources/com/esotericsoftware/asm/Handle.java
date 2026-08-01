package com.esotericsoftware.asm;

import net.bytebuddy.pool.TypePool;

/* JADX INFO: loaded from: classes.dex */
public final class Handle {

    /* JADX INFO: renamed from: a */
    final int f198a;

    /* JADX INFO: renamed from: b */
    final String f199b;

    /* JADX INFO: renamed from: c */
    final String f200c;

    /* JADX INFO: renamed from: d */
    final String f201d;

    /* JADX INFO: renamed from: e */
    final boolean f202e;

    public Handle(int i, String str, String str2, String str3) {
        this(i, str, str2, str3, i == 9);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Handle)) {
            return false;
        }
        Handle handle = (Handle) obj;
        return this.f198a == handle.f198a && this.f202e == handle.f202e && this.f199b.equals(handle.f199b) && this.f200c.equals(handle.f200c) && this.f201d.equals(handle.f201d);
    }

    public String getDesc() {
        return this.f201d;
    }

    public String getName() {
        return this.f200c;
    }

    public String getOwner() {
        return this.f199b;
    }

    public int getTag() {
        return this.f198a;
    }

    public int hashCode() {
        return (this.f201d.hashCode() * this.f200c.hashCode() * this.f199b.hashCode()) + this.f198a + (this.f202e ? 64 : 0);
    }

    public boolean isInterface() {
        return this.f202e;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f199b);
        stringBuffer.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        stringBuffer.append(this.f200c);
        stringBuffer.append(this.f201d);
        stringBuffer.append(" (");
        stringBuffer.append(this.f198a);
        stringBuffer.append(this.f202e ? " itf" : "");
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public Handle(int i, String str, String str2, String str3, boolean z) {
        this.f198a = i;
        this.f199b = str;
        this.f200c = str2;
        this.f201d = str3;
        this.f202e = z;
    }
}
