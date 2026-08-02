package defpackage;

import android.graphics.ImageDecoder;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xz0 implements g92 {
    public final wk a = new wk(0);
    public final ArrayList b;
    public final boolean c;
    public final td1 d;
    public final boolean e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xz0(ArrayList arrayList, boolean z, td1 td1Var, boolean z2) {
        this.b = arrayList;
        this.c = z;
        this.d = td1Var;
        this.e = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r0.g(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.g92
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d92 a(Object obj, int i, int i2, ov1 ov1Var) throws Throwable {
        ByteBuffer byteBufferB;
        td1 td1Var;
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        boolean z = this.e;
        boolean z2 = this.c;
        if (!z || (td1Var = this.d) == null) {
            byteBufferB = lo.b(inputStream, z2);
        } else {
            AtomicReference atomicReference = lo.a;
            ArrayList<byte[]> arrayList = new ArrayList();
            boolean z3 = false;
            int i3 = 0;
            while (true) {
                bArr = null;
                try {
                    byte[] bArr2 = (byte[]) td1Var.c(16384, byte[].class);
                    int i4 = 0;
                    while (i4 < 16384) {
                        try {
                            int i5 = inputStream.read(bArr2, i4, 16384 - i4);
                            if (i5 == -1) {
                                break;
                            }
                            i4 += i5;
                        } catch (Throwable th) {
                            th = th;
                            bArr = bArr2;
                            if (!z3) {
                            }
                            throw th;
                        }
                    }
                    if (i4 == 0) {
                        break;
                    }
                    arrayList.add(bArr2);
                    i3 += i4;
                    if (i4 < 16384) {
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            ByteBuffer byteBufferAllocate = z2 ? ByteBuffer.allocate(i3) : ByteBuffer.allocateDirect(i3);
            for (byte[] bArr3 : arrayList) {
                int iMin = Math.min(i3, 16384);
                byteBufferAllocate.put(bArr3, 0, iMin);
                i3 -= iMin;
                td1Var.g(bArr3);
            }
            arrayList.clear();
            try {
                byteBufferB = lo.c(byteBufferAllocate);
            } catch (Throwable th3) {
                th = th3;
                z3 = true;
                if (!z3) {
                    if (bArr != null) {
                        td1Var.g(bArr);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        td1Var.g((byte[]) it.next());
                    }
                }
                throw th;
            }
        }
        return this.a.c(ImageDecoder.createSource(byteBufferB), i, i2, ov1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g92
    public final boolean b(Object obj, ov1 ov1Var) {
        InputStream inputStream = (InputStream) obj;
        if (!this.e) {
            return true;
        }
        td1 td1Var = this.d;
        return (td1Var == null || se.I(this.b, inputStream, td1Var) == ImageHeaderParser$ImageType.UNKNOWN) ? false : true;
    }
}
