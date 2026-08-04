package yyds;

import android.graphics.ImageDecoder;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: yyds.ᲈᛲᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2608 implements InterfaceC0814 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f12809;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1530 f12810 = new C1530(0);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ArrayList f12811;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f12812;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2267 f12813;

    public C2608(ArrayList arrayList, boolean z, C2267 c2267, boolean z2) {
        this.f12811 = arrayList;
        this.f12812 = z;
        this.f12813 = c2267;
        this.f12809 = z2;
    }

    @Override // yyds.InterfaceC0814
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo427(Object obj, C0822 c0822) {
        InputStream inputStream = (InputStream) obj;
        if (!this.f12809) {
            return true;
        }
        C2267 c2267 = this.f12813;
        return (c2267 == null || AbstractC1741.m3475(this.f12811, inputStream, c2267) == ImageHeaderParser$ImageType.UNKNOWN) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r0.m4271(r6);
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
    @Override // yyds.InterfaceC0814
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2162 mo428(Object obj, int i, int i2, C0822 c0822) throws Throwable {
        ByteBuffer byteBufferM930;
        C2267 c2267;
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        boolean z = this.f12809;
        boolean z2 = this.f12812;
        if (!z || (c2267 = this.f12813) == null) {
            byteBufferM930 = AbstractC0282.m930(inputStream, z2);
        } else {
            AtomicReference atomicReference = AbstractC0282.f1527;
            ArrayList<byte[]> arrayList = new ArrayList();
            boolean z3 = false;
            int i3 = 0;
            while (true) {
                bArr = null;
                try {
                    byte[] bArr2 = (byte[]) c2267.m4272(byte[].class, 16384);
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
                c2267.m4271(bArr3);
            }
            arrayList.clear();
            try {
                byteBufferM930 = AbstractC0282.m931(byteBufferAllocate);
            } catch (Throwable th3) {
                th = th3;
                z3 = true;
                if (!z3) {
                    if (bArr != null) {
                        c2267.m4271(bArr);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        c2267.m4271((byte[]) it.next());
                    }
                }
                throw th;
            }
        }
        return this.f12810.m3165(ImageDecoder.createSource(byteBufferM930), i, i2, c0822);
    }
}
