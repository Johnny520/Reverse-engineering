package Yue;

import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥۣۢۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C8160 extends IllegalArgumentException {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final String f24185 = C8159.class.getName();

    public C8160(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        try {
            super.fillInStackTrace();
            StackTraceElement[] stackTrace = getStackTrace();
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!stackTraceElement.getClassName().equals(f24185)) {
                    arrayList.add(stackTraceElement);
                }
            }
            setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }
}
