package p150k1;

import java.util.List;

/* JADX INFO: renamed from: k1.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3922o extends RuntimeException {

    /* JADX INFO: renamed from: q */
    public final C3907a f11385q;

    public C3922o(C3907a c3907a) {
        this.f11385q = c3907a;
        if (c3907a.m15562b()) {
            return;
        }
        List listM15588e = AbstractC3912e.m15588e(c3907a);
        int size = listM15588e.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
        for (int i10 = 0; i10 < size; i10++) {
            stackTraceElementArr[i10] = new StackTraceElement("$$compose", "m$" + ((C3911d) listM15588e.get(i10)).m15581c(), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (!this.f11385q.m15562b()) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Composition stack when thrown:\n");
        AbstractC3912e.m15586c(sb2, this.f11385q);
        return sb2.toString();
    }
}
