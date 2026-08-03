package p000;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: k6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2129k6 implements InterfaceC2518sw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7472a;

    /* JADX INFO: renamed from: b */
    public final C0479L5 f7473b;

    public C2129k6(int r1) {
        this.f7472a = r1;
        switch(r1) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.f7473b = new C0479L5();
        return;
    L6:
        this.f7473b = new C0479L5();
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo749a(Object r2, int r3, int r4, C2644vt r5) {
        switch(this.f7472a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ImageDecoder.Source r22 = ImageDecoder.createSource(AbstractC2529t6.m5010b((InputStream) r2));
        return this.f7473b.m937c(r22, r3, r4, r5);
    L6:
        ImageDecoder.Source r23 = ImageDecoder.createSource((ByteBuffer) r2);
        return this.f7473b.m937c(r23, r3, r4, r5);
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo750b(Object r1, C2644vt r2) {
        switch(this.f7472a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        InputStream r12 = (InputStream) r1;
        return true;
    L7:
        ByteBuffer r13 = (ByteBuffer) r1;
        return true;
    }
}
