package net.bytebuddy.jar.asm;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        return AbstractC0053.m157("Class too large: ", str);
    }

    public String getClassName() {
        return this.className;
    }

    public int getConstantPoolCount() {
        return this.constantPoolCount;
    }
}
