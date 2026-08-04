package yyds;

import com.android.NativeUtil;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: yyds.ᛵᛴᲈᲈ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1087 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public long f4998;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final long f4999;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f5000;

    static {
        NativeUtil.classesInit0(200);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1087(OutputStream outputStream, long j, String str) {
        super(outputStream);
        AbstractC2328.m4341(-174499799139182L);
        AbstractC2328.m4341(-174529863910254L);
        this.f4999 = j;
        this.f5000 = str;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final native void write(int i);

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final native void write(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final native void m2294(long j);
}
