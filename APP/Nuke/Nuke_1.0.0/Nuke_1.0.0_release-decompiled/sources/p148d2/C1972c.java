package p148d2;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p078P1.C1147i;
import p088R1.InterfaceC1194D;
import p095T.C1352b0;
import p121Y1.C1736D;
import p142c2.C1892c;
import p195l2.AbstractC2498b;

/* JADX INFO: renamed from: d2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1972c implements InterfaceC1970a {

    /* JADX INFO: renamed from: e */
    public static final C1972c f6660e = new C1972c(0);

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6661d;

    public /* synthetic */ C1972c(int i5) {
        this.f6661d = i5;
    }

    @Override // p148d2.InterfaceC1970a
    /* JADX INFO: renamed from: b */
    public final InterfaceC1194D mo98b(InterfaceC1194D interfaceC1194D, C1147i c1147i) {
        byte[] bArrArray;
        switch (this.f6661d) {
            case 0:
                return interfaceC1194D;
            default:
                ByteBuffer byteBufferAsReadOnlyBuffer = ((C1892c) interfaceC1194D.get()).f6426d.f6425a.f6444a.f3264d.asReadOnlyBuffer();
                AtomicReference atomicReference = AbstractC2498b.f8007a;
                C1352b0 c1352b0 = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new C1352b0(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
                if (c1352b0 != null && c1352b0.f4786d == 0 && c1352b0.f4787e == ((byte[]) c1352b0.f4788f).length) {
                    bArrArray = byteBufferAsReadOnlyBuffer.array();
                } else {
                    ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                    byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
                    byteBufferAsReadOnlyBuffer2.get(bArr);
                    bArrArray = bArr;
                }
                return new C1736D(bArrArray);
        }
    }
}
