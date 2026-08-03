package p000;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: j6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2085j6 implements InterfaceC2518sw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7346a;

    /* JADX INFO: renamed from: b */
    public final C2543te f7347b;

    public /* synthetic */ C2085j6(C2543te r1, int r2) {
        this.f7346a = r2;
        this.f7347b = r1;
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo749a(Object r7, int r8, int r9, C2644vt r10) {
        switch(this.f7346a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C2543te r0 = this.f7347b;
        return r0.m5024a(new C2656w4((ParcelFileDescriptor) r7, r0.f8856d, r0.f8855c), r8, r9, r10, C2543te.f8851j);
    L6:
        C2543te r02 = this.f7347b;
        return r02.m5024a(new C2656w4((ByteBuffer) r7, r02.f8856d, r02.f8855c, 15), r8, r9, r10, C2543te.f8851j);
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final boolean mo750b(Object r3, C2644vt r4) {
        switch(this.f7346a) {
            case 0: goto L15;
            default: goto L4;
        };
    L4:
        ParcelFileDescriptor r32 = (ParcelFileDescriptor) r3;
        String r42 = Build.MANUFACTURER;
        if ("HUAWEI".equalsIgnoreCase(r42) == true) goto L9;
        if ("HONOR".equalsIgnoreCase(r42) == true) goto L9;
    L11:
        if ("robolectric".equals(Build.FINGERPRINT) == true) goto L13;
        return true;
    L13:
        return false;
    L9:
        if (r32.getStatSize() > 536870912) goto L13;
    L15:
        ByteBuffer r33 = (ByteBuffer) r3;
        return true;
    }
}
