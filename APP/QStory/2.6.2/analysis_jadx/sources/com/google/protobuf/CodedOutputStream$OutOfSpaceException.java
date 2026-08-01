package com.google.protobuf;

import androidx.activity.AbstractC0053;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class CodedOutputStream$OutOfSpaceException extends IOException {
    private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
    private static final long serialVersionUID = -6947486886997889499L;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodedOutputStream$OutOfSpaceException(long j, long j2, int i, Throwable th) {
        this("Pos: " + j + ", limit: " + j2 + ", len: " + i, th);
        Locale locale = Locale.US;
    }

    public CodedOutputStream$OutOfSpaceException(String str) {
        super(AbstractC0053.m152("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
    }

    public CodedOutputStream$OutOfSpaceException(Throwable th) {
        super(MESSAGE, th);
    }

    public CodedOutputStream$OutOfSpaceException(String str, Throwable th) {
        super(AbstractC0053.m152("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
    }

    public CodedOutputStream$OutOfSpaceException(int i, int i2, int i3) {
        this(i, i2, i3, (Throwable) null);
    }

    public CodedOutputStream$OutOfSpaceException(int i, int i2, int i3, Throwable th) {
        this(i, i2, i3, th);
    }

    public CodedOutputStream$OutOfSpaceException(long j, long j2, int i) {
        this(j, j2, i, (Throwable) null);
    }

    public CodedOutputStream$OutOfSpaceException() {
        super(MESSAGE);
    }
}
