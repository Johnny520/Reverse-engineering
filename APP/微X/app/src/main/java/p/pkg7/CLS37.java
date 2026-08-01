// Decompiled by JEB v5.42.0.202606242140

package p.pkg7;

import java.util.ArrayList;

public final class CLS37 extends IllegalArgumentException {
    public static final String FLD316;

    // 此方法包含解密的字符串
    static {
        CLS37.FLD316 = "p.\u05D9\u0674.\uFE73\u02D1";
    }

    public CLS37(String s) {
        super(s);
    }

    // 此方法包含解密的字符串
    @Override
    public final Throwable fillInStackTrace() {
        synchronized(this) {
            super.fillInStackTrace();
            StackTraceElement[] arr_stackTraceElement = this.getStackTrace();
            ArrayList arrayList0 = new ArrayList();
            for(int v1 = 0; v1 < arr_stackTraceElement.length; ++v1) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v1];
                if(!stackTraceElement0.getClassName().equals("p.\u05D9\u0674.\uFE73\u02D1")) {
                    arrayList0.add(stackTraceElement0);
                }
            }
            this.setStackTrace(((StackTraceElement[])arrayList0.toArray(new StackTraceElement[0])));
            return this;
        }
    }
}

