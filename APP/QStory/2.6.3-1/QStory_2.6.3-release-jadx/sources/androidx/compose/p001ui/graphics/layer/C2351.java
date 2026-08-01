package androidx.compose.p001ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import androidx.appcompat.app.C0955;
import androidx.appcompat.app.C0960;
import androidx.collection.AbstractC1132;
import androidx.collection.C1082;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.lazy.C1589;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.AbstractC2424;
import androidx.compose.p001ui.graphics.AbstractC2429;
import androidx.compose.p001ui.graphics.AbstractC2438;
import androidx.compose.p001ui.graphics.C2411;
import androidx.compose.p001ui.graphics.C2420;
import androidx.compose.p001ui.graphics.C2421;
import androidx.compose.p001ui.graphics.C2430;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.C2444;
import androidx.compose.p001ui.graphics.C2449;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.AbstractC2340;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.unit.LayoutDirection;
import io.ktor.util.C5043;
import java.util.Locale;
import kotlin.C6008;
import p068.InterfaceC7387;
import p128.C8155;
import p128.C8157;
import p128.C8158;
import p221.InterfaceC8725;
import p267.AbstractC9004;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2351 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2361 f4695;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Outline f4696;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2349 f4701;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f4702;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f4703;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f4704;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public RectF f4705;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public long f4706;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public long f4707;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f4708;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C2449 f4709;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f4710;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C2342 f4712;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C2444 f4713;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public AbstractC2416 f4716;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C2449 f4717;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f4719;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC8725 f4700 = AbstractC2340.f4627;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public LayoutDirection f4699 = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC7387 f4698 = new InterfaceC7387() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC2339) obj);
            return C6008.f15084;
        }

        public final void invoke(InterfaceC2339 interfaceC2339) {
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC7387 f4697 = new InterfaceC7387() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$clipDrawBlock$1
        {
            super(1);
        }

        public final void invoke(InterfaceC2339 interfaceC2339) {
            C2351 c2351 = this.this$0;
            C2449 c2449 = c2351.f4717;
            if (!c2351.f4708 || !c2351.f4704 || c2449 == null) {
                c2351.m3354(interfaceC2339);
                return;
            }
            C0955 c0955Mo3266 = interfaceC2339.mo3266();
            long jM928 = c0955Mo3266.m928();
            c0955Mo3266.m946().mo3237();
            try {
                ((C0955) ((C0960) c0955Mo3266.f664).f702).m946().mo3242(c2449);
                c2351.m3354(interfaceC2339);
            } finally {
                c0955Mo3266.m946().mo3249();
                c0955Mo3266.m921(jM928);
            }
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC2339) obj);
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f4715 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public long f4714 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public long f4718 = 9205357640488583168L;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1589 f4711 = new C1589();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        f4695 = lowerCase.equals("robolectric") ? C2362.f4763 : Build.VERSION.SDK_INT >= 28 ? C2362.f4762 : C2360.f4761;
    }

    public C2351(InterfaceC2349 interfaceC2349) {
        this.f4701 = interfaceC2349;
        interfaceC2349.mo3286(false);
        this.f4702 = 0L;
        this.f4706 = 0L;
        this.f4707 = 9205357640488583168L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3352(float f) {
        InterfaceC2349 interfaceC2349 = this.f4701;
        if (interfaceC2349.mo3300() == f) {
            return;
        }
        interfaceC2349.mo3302(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC2416 m3353() {
        AbstractC2416 c2420;
        AbstractC2416 abstractC2416 = this.f4716;
        C2449 c2449 = this.f4717;
        if (abstractC2416 != null) {
            return abstractC2416;
        }
        if (c2449 != null) {
            C2421 c2421 = new C2421(c2449);
            this.f4716 = c2421;
            return c2421;
        }
        long jM1700 = AbstractC1298.m1700(this.f4706);
        long j = this.f4714;
        long j2 = this.f4718;
        if (j2 != 9205357640488583168L) {
            jM1700 = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM1700 >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM1700 & 4294967295L)) + fIntBitsToFloat2;
        float f = this.f4719;
        if (f > 0.0f) {
            c2420 = new C2411(AbstractC9004.m14191(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            c2420 = new C2420(new C8157(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f4716 = c2420;
        return c2420;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3354(InterfaceC2339 interfaceC2339) {
        C1589 c1589 = this.f4711;
        c1589.f2499 = (C2351) c1589.f2500;
        C1082 c1082 = (C1082) c1589.f2498;
        if (c1082 != null && c1082.m1432()) {
            C1082 c10822 = (C1082) c1589.f2497;
            if (c10822 == null) {
                C1082 c10823 = AbstractC1132.f1342;
                c10822 = new C1082();
                c1589.f2497 = c10822;
            }
            c10822.m1308(c1082);
            c1082.m1300();
        }
        c1589.f2501 = true;
        this.f4698.invoke(interfaceC2339);
        c1589.f2501 = false;
        C2351 c2351 = (C2351) c1589.f2499;
        if (c2351 != null) {
            c2351.f4710--;
            c2351.m3356();
        }
        C1082 c10824 = (C1082) c1589.f2497;
        if (c10824 == null || !c10824.m1432()) {
            return;
        }
        Object[] objArr = c10824.f1345;
        long[] jArr = c10824.f1346;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            r9.f4710--;
                            ((C2351) objArr[(i << 3) + i3]).m3356();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        c10824.m1300();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3355(InterfaceC2436 interfaceC2436, C2351 c2351) {
        boolean z;
        boolean z2;
        Canvas canvas;
        boolean z3;
        float f;
        if (this.f4703) {
            return;
        }
        m3357();
        InterfaceC2349 interfaceC2349 = this.f4701;
        if (!interfaceC2349.mo3311()) {
            try {
                interfaceC2349.mo3280(this.f4700, this.f4699, this, this.f4697);
            } catch (Throwable unused) {
            }
        }
        boolean z4 = interfaceC2349.mo3290() > 0.0f;
        if (z4) {
            interfaceC2436.mo3244();
        }
        Canvas canvasM3475 = AbstractC2429.m3475(interfaceC2436);
        boolean zIsHardwareAccelerated = canvasM3475.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j = this.f4702;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & 4294967295L);
            long j2 = this.f4706;
            float f4 = ((int) (j2 >> 32)) + f2;
            float f5 = ((int) (j2 & 4294967295L)) + f3;
            float fMo3300 = interfaceC2349.mo3300();
            C2442 c2442Mo3315 = interfaceC2349.mo3315();
            int iMo3281 = interfaceC2349.mo3281();
            if (fMo3300 < 1.0f || iMo3281 != 3 || c2442Mo3315 != null || interfaceC2349.mo3318() == 1) {
                C2444 c2444M3456 = this.f4713;
                if (c2444M3456 == null) {
                    c2444M3456 = AbstractC2416.m3456();
                    this.f4713 = c2444M3456;
                }
                c2444M3456.m3519(fMo3300);
                c2444M3456.m3530(iMo3281);
                c2444M3456.m3533(c2442Mo3315);
                canvasM3475 = canvasM3475;
                f = f2;
                canvasM3475.saveLayer(f, f3, f4, f5, (Paint) c2444M3456.f5061);
            } else {
                canvasM3475.save();
                canvasM3475 = canvasM3475;
                f = f2;
            }
            canvasM3475.translate(f, f3);
            canvasM3475.concat(interfaceC2349.mo3292());
        }
        boolean z5 = !zIsHardwareAccelerated && this.f4704;
        if (z5) {
            interfaceC2436.mo3237();
            AbstractC2416 abstractC2416M3353 = m3353();
            if (abstractC2416M3353 instanceof C2420) {
                InterfaceC2436.m3515(interfaceC2436, ((C2420) abstractC2416M3353).f5017);
            } else if (abstractC2416M3353 instanceof C2411) {
                C2449 c2449M3517 = this.f4709;
                if (c2449M3517 != null) {
                    c2449M3517.f5070.rewind();
                } else {
                    c2449M3517 = AbstractC2438.m3517();
                    this.f4709 = c2449M3517;
                }
                C2449.m3537(c2449M3517, ((C2411) abstractC2416M3353).f5001);
                interfaceC2436.mo3242(c2449M3517);
            } else {
                if (!(abstractC2416M3353 instanceof C2421)) {
                    C5043.m9170();
                    return;
                }
                interfaceC2436.mo3242(((C2421) abstractC2416M3353).f5018);
            }
        }
        if (c2351 != null) {
            C1589 c1589 = c2351.f4711;
            if (!c1589.f2501) {
                AbstractC2424.m3468("Only add dependencies during a tracking");
            }
            C1082 c1082 = (C1082) c1589.f2498;
            if (c1082 != null) {
                c1082.m1301(this);
            } else if (((C2351) c1589.f2500) != null) {
                C1082 c10822 = AbstractC1132.f1342;
                C1082 c10823 = new C1082();
                C2351 c23512 = (C2351) c1589.f2500;
                c23512.getClass();
                c10823.m1301(c23512);
                c10823.m1301(this);
                c1589.f2498 = c10823;
                c1589.f2500 = null;
            } else {
                c1589.f2500 = this;
            }
            C1082 c10824 = (C1082) c1589.f2497;
            if (c10824 != null) {
                z3 = !c10824.m1306(this);
            } else if (((C2351) c1589.f2499) != this) {
                z3 = true;
            } else {
                c1589.f2499 = null;
                z3 = false;
            }
            if (z3) {
                this.f4710++;
            }
        }
        if (((C2430) interfaceC2436).f5035.isHardwareAccelerated()) {
            z = z4;
            z2 = z5;
            canvas = canvasM3475;
            interfaceC2349.mo3277(interfaceC2436);
        } else {
            C2342 c2342 = this.f4712;
            if (c2342 == null) {
                c2342 = new C2342();
                this.f4712 = c2342;
            }
            C0955 c0955 = c2342.f4629;
            InterfaceC8725 interfaceC8725 = this.f4700;
            LayoutDirection layoutDirection = this.f4699;
            long jM1700 = AbstractC1298.m1700(this.f4706);
            InterfaceC8725 interfaceC8725M949 = c0955.m949();
            LayoutDirection layoutDirectionM930 = c0955.m930();
            InterfaceC2436 interfaceC2436M946 = c0955.m946();
            z2 = z5;
            canvas = canvasM3475;
            long jM928 = c0955.m928();
            z = z4;
            C2351 c23513 = (C2351) c0955.f665;
            c0955.m924(interfaceC8725);
            c0955.m920(layoutDirection);
            c0955.m925(interfaceC2436);
            c0955.m921(jM1700);
            c0955.f665 = this;
            interfaceC2436.mo3237();
            try {
                m3354(c2342);
            } finally {
                interfaceC2436.mo3249();
                c0955.m924(interfaceC8725M949);
                c0955.m920(layoutDirectionM930);
                c0955.m925(interfaceC2436M946);
                c0955.m921(jM928);
                c0955.f665 = c23513;
            }
        }
        if (z2) {
            interfaceC2436.mo3249();
        }
        if (z) {
            interfaceC2436.mo3251();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3356() {
        if (this.f4703 && this.f4710 == 0) {
            C1589 c1589 = this.f4711;
            C2351 c2351 = (C2351) c1589.f2500;
            if (c2351 != null) {
                c2351.f4710--;
                c2351.m3356();
                c1589.f2500 = null;
            }
            C1082 c1082 = (C1082) c1589.f2498;
            if (c1082 != null) {
                Object[] objArr = c1082.f1345;
                long[] jArr = c1082.f1346;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r11.f4710--;
                                    ((C2351) objArr[(i << 3) + i3]).m3356();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                c1082.m1300();
            }
            this.f4701.mo3317();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3357() {
        Outline outline;
        if (this.f4715) {
            boolean z = this.f4704;
            Outline outline2 = null;
            InterfaceC2349 interfaceC2349 = this.f4701;
            if (z || interfaceC2349.mo3290() > 0.0f) {
                C2449 c2449 = this.f4717;
                if (c2449 != null) {
                    RectF rectF = this.f4705;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f4705 = rectF;
                    }
                    boolean z2 = c2449 instanceof C2449;
                    if (!z2) {
                        C6755.m11867("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = c2449.f5070;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f4696;
                        if (outline == null) {
                            outline = new Outline();
                            this.f4696 = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                C6755.m11867("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                C6755.m11867("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        this.f4708 = !outline.canClip();
                    } else {
                        Outline outline3 = this.f4696;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f4708 = true;
                        outline = null;
                    }
                    this.f4717 = c2449;
                    if (outline != null) {
                        outline.setAlpha(interfaceC2349.mo3300());
                        outline2 = outline;
                    }
                    interfaceC2349.mo3314(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f4708 && this.f4704) {
                        interfaceC2349.mo3286(false);
                        interfaceC2349.mo3317();
                    } else {
                        interfaceC2349.mo3286(this.f4704);
                    }
                } else {
                    interfaceC2349.mo3286(this.f4704);
                    Outline outline4 = this.f4696;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f4696 = outline4;
                    }
                    Outline outline5 = outline4;
                    long jM1700 = AbstractC1298.m1700(this.f4706);
                    long j = this.f4714;
                    long j2 = this.f4718;
                    if (j2 != 9205357640488583168L) {
                        jM1700 = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jM1700 >> 32);
                    int i5 = (int) (jM1700 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.f4719);
                    outline5.setAlpha(interfaceC2349.mo3300());
                    interfaceC2349.mo3314(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                interfaceC2349.mo3286(false);
                interfaceC2349.mo3314(null, 0L);
            }
        }
        this.f4715 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3358(float f, long j, long j2) {
        if (C8158.m13087(this.f4714, j) && C8155.m13074(this.f4718, j2) && this.f4719 == f && this.f4717 == null) {
            return;
        }
        this.f4716 = null;
        this.f4717 = null;
        this.f4715 = true;
        this.f4708 = false;
        this.f4714 = j;
        this.f4718 = j2;
        this.f4719 = f;
        m3357();
    }
}
