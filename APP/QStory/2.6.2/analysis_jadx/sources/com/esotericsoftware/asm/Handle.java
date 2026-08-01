package com.esotericsoftware.asm;

import net.bytebuddy.pool.TypePool;

/* JADX INFO: loaded from: classes.dex */
public final class Handle {
    final int a;
    final String b;
    final String c;
    final String d;
    final boolean e;

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
        return this.a == handle.a && this.e == handle.e && this.b.equals(handle.b) && this.c.equals(handle.c) && this.d.equals(handle.d);
    }

    public String getDesc() {
        return this.d;
    }

    public String getName() {
        return this.c;
    }

    public String getOwner() {
        return this.b;
    }

    public int getTag() {
        return this.a;
    }

    public int hashCode() {
        return (this.d.hashCode() * this.c.hashCode() * this.b.hashCode()) + this.a + (this.e ? 64 : 0);
    }

    public boolean isInterface() {
        return this.e;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.b);
        stringBuffer.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        stringBuffer.append(this.c);
        stringBuffer.append(this.d);
        stringBuffer.append(" (");
        stringBuffer.append(this.a);
        stringBuffer.append(this.e ? " itf" : "");
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public Handle(int i, String str, String str2, String str3, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }
}
