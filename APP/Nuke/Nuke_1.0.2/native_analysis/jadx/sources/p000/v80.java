package p000;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v80 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f11817l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ sz0 f11818m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ String f11819n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f11820o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v80(sz0 sz0Var, String str, int i, t00 t00Var, int i2) {
        super(2, t00Var);
        this.f11817l = i2;
        this.f11818m = sz0Var;
        this.f11819n = str;
        this.f11820o = i;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f11817l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((v80) mo13p(t00Var, j20Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        switch (this.f11817l) {
            case 0:
                return new v80(this.f11818m, this.f11819n, this.f11820o, t00Var, 0);
            default:
                return new v80(this.f11818m, this.f11819n, this.f11820o, t00Var, 1);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) throws IOException {
        BufferedInputStream bufferedInputStream;
        int i = this.f11817l;
        Object objM6124h0 = null;
        String str = this.f11819n;
        sz0 sz0Var = this.f11818m;
        int i2 = this.f11820o;
        switch (i) {
            case 0:
                fg1.m1627T(obj);
                File fileM5025k = sz0.m5025k(sz0Var);
                File canonicalFile = new File(fileM5025k, str).getCanonicalFile();
                canonicalFile.getClass();
                sz0.m5024A(fileM5025k, canonicalFile);
                if (!canonicalFile.isFile() || Files.isSymbolicLink(canonicalFile.toPath())) {
                    o72 o72Var = oi2.f7689i;
                    c80.m678v("Script file does not exist or is not a regular file: ".concat(str));
                } else {
                    if (canonicalFile.length() > i2) {
                        throw new bh2(i2);
                    }
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(canonicalFile), 8192);
                    try {
                        objM6124h0 = xe1.m6124h0(bufferedInputStream, i2);
                        bufferedInputStream.close();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return objM6124h0;
            default:
                fg1.m1627T(obj);
                File fileM5025k2 = sz0.m5025k(sz0Var);
                File canonicalFile2 = new File(fileM5025k2, str).getCanonicalFile();
                canonicalFile2.getClass();
                sz0.m5024A(fileM5025k2, canonicalFile2);
                if (!canonicalFile2.isFile() || Files.isSymbolicLink(canonicalFile2.toPath())) {
                    o72 o72Var2 = oi2.f7689i;
                    c80.m678v(vi0.m5690i("Script file does not exist or is not a regular file: ", str));
                } else {
                    if (canonicalFile2.length() > i2) {
                        throw new bh2(i2);
                    }
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(canonicalFile2), 8192);
                    try {
                        byte[] bArrM6124h0 = xe1.m6124h0(bufferedInputStream, i2);
                        CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
                        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                        objM6124h0 = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArrM6124h0)).toString();
                        objM6124h0.getClass();
                        bufferedInputStream.close();
                    } finally {
                    }
                }
                return objM6124h0;
        }
    }
}
