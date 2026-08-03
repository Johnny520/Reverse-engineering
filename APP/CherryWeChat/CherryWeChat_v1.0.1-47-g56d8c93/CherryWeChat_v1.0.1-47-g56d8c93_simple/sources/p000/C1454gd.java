package p000;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;

/* JADX INFO: renamed from: gd */
/* JADX INFO: loaded from: classes.dex */
public final class C1454gd implements ImageDecoder.OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a */
    public final C2377pk f5150a;

    /* JADX INFO: renamed from: b */
    public final int f5151b;

    /* JADX INFO: renamed from: c */
    public final int f5152c;

    /* JADX INFO: renamed from: d */
    public final EnumC0191Ec f5153d;

    /* JADX INFO: renamed from: e */
    public final C2457re f5154e;

    /* JADX INFO: renamed from: f */
    public final boolean f5155f;

    /* JADX INFO: renamed from: g */
    public final EnumC1383eu f5156g;

    public C1454gd(int r2, int r3, C2644vt r4) {
        this.f5150a = C2377pk.m4818a();
        this.f5151b = r2;
        this.f5152c = r3;
        this.f5153d = (EnumC0191Ec) r4.m5177c(C2543te.f8847f);
        this.f5154e = (C2457re) r4.m5177c(C2457re.f8661g);
        C2601ut r22 = C2543te.f8850i;
        if (r4.m5177c(r22) != null) goto L5;
    L7:
        boolean r23 = false;
    L8:
        this.f5155f = r23;
        this.f5156g = (EnumC1383eu) r4.m5177c(C2543te.f8848g);
        return;
    L5:
        if (((Boolean) r4.m5177c(r22)).booleanValue() == false) goto L7;
        r23 = true;
        goto L8
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder r6, ImageDecoder.ImageInfo r7, ImageDecoder.Source r8) {
        C2377pk r82 = this.f5150a;
        int r0 = this.f5151b;
        int r1 = this.f5152c;
        if (r82.m4820c(r0, r1, this.f5155f, false) == false) goto L5;
        r6.setAllocator(3);
    L7:
        if (this.f5153d != EnumC0191Ec.f577b) goto L9;
        r6.setMemorySizePolicy(0);
    L9:
        r6.setOnPartialImageListener(new C1410fd());
        Size r83 = r7.getSize();
        if (r0 != Integer.MIN_VALUE) goto L12;
        r0 = r83.getWidth();
    L12:
        if (r1 != Integer.MIN_VALUE) goto L14;
        r1 = r83.getHeight();
    L14:
        float r02 = this.f5154e.m4949b(r83.getWidth(), r83.getHeight(), r0, r1);
        int r12 = Math.round(r83.getWidth() * r02);
        int r03 = Math.round(r02 * r83.getHeight());
        if (Log.isLoggable("ImageDecoder", 2) == false) goto L17;
        r83.getWidth();
        r83.getHeight();
    L17:
        r6.setTargetSize(r12, r03);
        EnumC1383eu r84 = this.f5156g;
        if (r84 != null) goto L20;
        return;
    L20:
        if (r84 == EnumC1383eu.f4928a) goto L22;
    L26:
        ColorSpace.Named r72 = ColorSpace.Named.SRGB;
    L27:
        r6.setTargetColorSpace(ColorSpace.get(r72));
        return;
    L22:
        if (r7.getColorSpace() == null) goto L26;
        if (r7.getColorSpace().isWideGamut() == false) goto L26;
        r72 = ColorSpace.Named.DISPLAY_P3;
        goto L27
    L5:
        r6.setAllocator(1);
        goto L7
    }
}
