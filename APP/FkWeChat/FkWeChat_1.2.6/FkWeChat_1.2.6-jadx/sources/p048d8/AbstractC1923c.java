package p048d8;

import java.nio.charset.MalformedInputException;

/* JADX INFO: renamed from: d8.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1923c extends MalformedInputException {

    /* JADX INFO: renamed from: q */
    public final String f5383q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1923c(String str) {
        super(0);
        str.getClass();
        this.f5383q = str;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public String getMessage() {
        return this.f5383q;
    }
}
