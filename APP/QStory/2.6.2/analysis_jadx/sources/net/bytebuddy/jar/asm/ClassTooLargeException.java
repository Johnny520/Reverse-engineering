package net.bytebuddy.jar.asm;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ClassTooLargeException extends IndexOutOfBoundsException {
    private static final long serialVersionUID = 160715609518896765L;
    private final String className;
    private final int constantPoolCount;

    public ClassTooLargeException(String str, int i) {
        super(stringConcat$0(str));
        this.className = str;
        this.constantPoolCount = i;
    }

    private static /* synthetic */ String stringConcat$0(String str) {
        return AbstractC0053.m152("Class too large: ", str);
    }

    public String getClassName() {
        return this.className;
    }

    public int getConstantPoolCount() {
        return this.constantPoolCount;
    }
}
