package yyds;

import com.android.NativeUtil;
import java.io.FilterInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: yyds.ᛴᛵᛸᛳ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0861 extends FilterInputStream {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public long f3953;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final long f3954;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f3955;

    static {
        NativeUtil.classesInit0(128);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0861(InputStream inputStream, long j, String str) {
        super(inputStream);
        AbstractC2328.m4341(-146505202303854L);
        AbstractC2328.m4341(-146530972107630L);
        this.f3954 = j;
        this.f3955 = str;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final native int read();

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final native int read(byte[] bArr, int i, int i2);

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final native long skip(long j);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final native void m1956(long j);
}
