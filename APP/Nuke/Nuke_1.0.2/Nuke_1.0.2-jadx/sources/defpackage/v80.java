package defpackage;

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
    public final /* synthetic */ int l;
    public final /* synthetic */ sz0 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ int o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v80(sz0 sz0Var, String str, int i, t00 t00Var, int i2) {
        super(2, t00Var);
        this.l = i2;
        this.m = sz0Var;
        this.n = str;
        this.o = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((v80) p(t00Var, j20Var)).r(a83Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        switch (this.l) {
            case 0:
                return new v80(this.m, this.n, this.o, t00Var, 0);
            default:
                return new v80(this.m, this.n, this.o, t00Var, 1);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) throws IOException {
        BufferedInputStream bufferedInputStream;
        int i = this.l;
        Object objH0 = null;
        String str = this.n;
        sz0 sz0Var = this.m;
        int i2 = this.o;
        switch (i) {
            case 0:
                fg1.T(obj);
                File fileK = sz0.k(sz0Var);
                File canonicalFile = new File(fileK, str).getCanonicalFile();
                canonicalFile.getClass();
                sz0.A(fileK, canonicalFile);
                if (!canonicalFile.isFile() || Files.isSymbolicLink(canonicalFile.toPath())) {
                    o72 o72Var = oi2.i;
                    c80.v("Script file does not exist or is not a regular file: ".concat(str));
                } else {
                    if (canonicalFile.length() > i2) {
                        throw new bh2(i2);
                    }
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(canonicalFile), 8192);
                    try {
                        objH0 = xe1.h0(bufferedInputStream, i2);
                        bufferedInputStream.close();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return objH0;
            default:
                fg1.T(obj);
                File fileK2 = sz0.k(sz0Var);
                File canonicalFile2 = new File(fileK2, str).getCanonicalFile();
                canonicalFile2.getClass();
                sz0.A(fileK2, canonicalFile2);
                if (!canonicalFile2.isFile() || Files.isSymbolicLink(canonicalFile2.toPath())) {
                    o72 o72Var2 = oi2.i;
                    c80.v(vi0.i("Script file does not exist or is not a regular file: ", str));
                } else {
                    if (canonicalFile2.length() > i2) {
                        throw new bh2(i2);
                    }
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(canonicalFile2), 8192);
                    try {
                        byte[] bArrH0 = xe1.h0(bufferedInputStream, i2);
                        CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
                        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                        objH0 = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArrH0)).toString();
                        objH0.getClass();
                        bufferedInputStream.close();
                    } finally {
                    }
                }
                return objH0;
        }
    }
}
