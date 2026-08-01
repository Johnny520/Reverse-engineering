package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.C1343;
import androidx.compose.foundation.gestures.C1351;
import androidx.compose.foundation.layout.InterfaceC1505;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.input.pointer.AbstractC2457;
import androidx.compose.p001ui.input.pointer.C2462;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.InterfaceC2622;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.InterfaceC2230;
import com.alibaba.fastjson2.AbstractC3738;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p068.InterfaceC7383;
import p069.AbstractC7390;
import p128.C8155;
import p128.C8158;
import p221.C8731;
import p221.InterfaceC8725;
import p269.AbstractC9019;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1890 implements InterfaceC1922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f3447;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f3448;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC2230 f3449;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1872 f3450;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f3451 = 9205357640488583168L;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8725 f3452;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public long f3453;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public long f3454;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC2623 f3455;

    public C1890(Context context, InterfaceC8725 interfaceC8725, long j, InterfaceC1505 interfaceC1505) {
        this.f3452 = interfaceC8725;
        C1872 c1872 = new C1872(context, AbstractC2416.m3433(j));
        this.f3450 = c1872;
        this.f3449 = AbstractC2202.m3035(C6008.f15084, C2188.f4265);
        this.f3448 = true;
        this.f3454 = 0L;
        this.f3453 = -1L;
        C1891 c1891 = new C1891(this);
        C2487 c2487 = AbstractC2457.f5090;
        C2462 c2462 = new C2462(null, null, c1891);
        this.f3455 = Build.VERSION.SDK_INT >= 31 ? new C1856(c2462, this, c1872) : new C1856(c2462, this, c1872, interfaceC1505);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long m2513() {
        long jM14264 = this.f3451;
        if ((9223372034707292159L & jM14264) == 9205357640488583168L) {
            jM14264 = AbstractC9019.m14264(this.f3454);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM14264 >> 32)) / Float.intBitsToFloat((int) (this.f3454 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM14264 & 4294967295L)) / Float.intBitsToFloat((int) (this.f3454 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m2514() {
        boolean z;
        C1872 c1872 = this.f3450;
        EdgeEffect edgeEffect = c1872.f3377;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = c1872.f3376;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = c1872.f3375;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = c1872.f3382;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            m2520();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0131 A[PHI: r7
  0x0131: PHI (r7v9 float) = (r7v8 float), (r7v12 float) binds: [B:73:0x015f, B:62:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f1  */
    @Override // androidx.compose.foundation.InterfaceC1922
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo2515(long j, int i, C1351 c1351) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fM2524;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jM13085;
        boolean z;
        boolean zM2497;
        long j3;
        float f;
        float f2;
        boolean z2;
        int i3;
        boolean z3;
        if (C8155.m13072(this.f3454)) {
            C1343 c1343 = (C1343) c1351.f1855;
            return new C8158(c1343.m1825(c1343.f1841, j, c1343.f1844)).f19886;
        }
        boolean z4 = this.f3447;
        boolean z5 = true;
        C1872 c1872 = this.f3450;
        if (!z4) {
            if (C1872.m2498(c1872.f3375)) {
                m2523(0L);
            }
            if (C1872.m2498(c1872.f3382)) {
                m2524(0L);
            }
            if (C1872.m2498(c1872.f3377)) {
                m2521(0L);
            }
            if (C1872.m2498(c1872.f3376)) {
                m2519(0L);
            }
            this.f3447 = true;
        }
        int i4 = AbstractC1888.f3442;
        float f3 = i == 2 ? 4.0f : 1.0f;
        long jM13091 = C8158.m13091(f3, j);
        int i5 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i5) != 0.0f) {
            if (!C1872.m2498(c1872.f3377) || Float.intBitsToFloat(i5) >= 0.0f) {
                j2 = 4294967295L;
                if (C1872.m2498(c1872.f3376) && Float.intBitsToFloat(i5) > 0.0f) {
                    float fM2519 = m2519(jM13091);
                    if (!C1872.m2498(c1872.f3376)) {
                        c1872.m2502().finish();
                    }
                    fIntBitsToFloat = fM2519 == Float.intBitsToFloat((int) (jM13091 & 4294967295L)) ? Float.intBitsToFloat(i5) : fM2519 / f3;
                }
            } else {
                float fM2521 = m2521(jM13091);
                j2 = 4294967295L;
                if (!C1872.m2498(c1872.f3377)) {
                    c1872.m2499().finish();
                }
                fIntBitsToFloat = fM2521 == Float.intBitsToFloat((int) (jM13091 & 4294967295L)) ? Float.intBitsToFloat(i5) : fM2521 / f3;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                if (C1872.m2498(c1872.f3375) && Float.intBitsToFloat(i2) < 0.0f) {
                    fM2524 = m2523(jM13091);
                    if (!C1872.m2498(c1872.f3375)) {
                        c1872.m2501().finish();
                    }
                    if (fM2524 == Float.intBitsToFloat((int) (jM13091 >> 32))) {
                        fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                } else if (!C1872.m2498(c1872.f3382) || Float.intBitsToFloat(i2) <= 0.0f) {
                    fIntBitsToFloat2 = 0.0f;
                } else {
                    fM2524 = m2524(jM13091);
                    if (!C1872.m2498(c1872.f3382)) {
                        c1872.m2500().finish();
                    }
                    fIntBitsToFloat2 = fM2524 == Float.intBitsToFloat((int) (jM13091 >> 32)) ? Float.intBitsToFloat(i2) : fM2524 / f3;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!C8158.m13087(jFloatToRawIntBits, 0L)) {
                m2520();
            }
            jM13085 = C8158.m13085(j, jFloatToRawIntBits);
            C1343 c13432 = (C1343) c1351.f1855;
            long j4 = new C8158(c13432.m1825(c13432.f1841, jM13085, c13432.f1844)).f19886;
            long jM130852 = C8158.m13085(jM13085, j4);
            if ((Float.intBitsToFloat((int) (jM13085 >> 32)) == 0.0f || Float.intBitsToFloat((int) (jM13085 & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j4 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j4 & j2)) != 0.0f) && (C1872.m2498(c1872.f3375) || C1872.m2498(c1872.f3377) || C1872.m2498(c1872.f3382) || C1872.m2498(c1872.f3376)))) {
                m2514();
            }
            if (i != 1) {
                int i6 = (int) (jM130852 >> 32);
                if (Float.intBitsToFloat(i6) > 0.5f) {
                    j3 = jM130852;
                    m2523(j3);
                } else {
                    j3 = jM130852;
                    if (Float.intBitsToFloat(i6) < -0.5f) {
                        m2524(j3);
                    } else {
                        f = 0.5f;
                        f2 = -0.5f;
                        z2 = false;
                        i3 = (int) (j3 & j2);
                        if (Float.intBitsToFloat(i3) <= f) {
                            m2521(j3);
                        } else if (Float.intBitsToFloat(i3) < f2) {
                            m2519(j3);
                        } else {
                            z3 = false;
                            z = !z2 || z3;
                        }
                        z3 = true;
                        if (z2) {
                        }
                    }
                }
                z2 = true;
                f = 0.5f;
                f2 = -0.5f;
                i3 = (int) (j3 & j2);
                if (Float.intBitsToFloat(i3) <= f) {
                }
                z3 = true;
                if (z2) {
                }
            }
            if (!C8158.m13087(jM13085, 0L)) {
                if (!C1872.m2497(c1872.f3375) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zM2497 = false;
                } else {
                    EdgeEffect edgeEffectM2501 = c1872.m2501();
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
                    if (edgeEffectM2501 instanceof C1860) {
                        C1860 c1860 = (C1860) edgeEffectM2501;
                        float f4 = c1860.f3337 + fIntBitsToFloat3;
                        c1860.f3337 = f4;
                        if (Math.abs(f4) > c1860.f3338) {
                            c1860.onRelease();
                        }
                    } else {
                        edgeEffectM2501.onRelease();
                    }
                    zM2497 = C1872.m2497(c1872.f3375);
                }
                if (C1872.m2497(c1872.f3382) && Float.intBitsToFloat(i2) > 0.0f) {
                    EdgeEffect edgeEffectM2500 = c1872.m2500();
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
                    if (edgeEffectM2500 instanceof C1860) {
                        C1860 c18602 = (C1860) edgeEffectM2500;
                        float f5 = c18602.f3337 + fIntBitsToFloat4;
                        c18602.f3337 = f5;
                        if (Math.abs(f5) > c18602.f3338) {
                            c18602.onRelease();
                        }
                    } else {
                        edgeEffectM2500.onRelease();
                    }
                    zM2497 = zM2497 || C1872.m2497(c1872.f3382);
                }
                if (C1872.m2497(c1872.f3377) && Float.intBitsToFloat(i5) < 0.0f) {
                    EdgeEffect edgeEffectM2499 = c1872.m2499();
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i5);
                    if (edgeEffectM2499 instanceof C1860) {
                        C1860 c18603 = (C1860) edgeEffectM2499;
                        float f6 = c18603.f3337 + fIntBitsToFloat5;
                        c18603.f3337 = f6;
                        if (Math.abs(f6) > c18603.f3338) {
                            c18603.onRelease();
                        }
                    } else {
                        edgeEffectM2499.onRelease();
                    }
                    zM2497 = zM2497 || C1872.m2497(c1872.f3377);
                }
                if (C1872.m2497(c1872.f3376) && Float.intBitsToFloat(i5) > 0.0f) {
                    EdgeEffect edgeEffectM2502 = c1872.m2502();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i5);
                    if (edgeEffectM2502 instanceof C1860) {
                        C1860 c18604 = (C1860) edgeEffectM2502;
                        float f7 = c18604.f3337 + fIntBitsToFloat6;
                        c18604.f3337 = f7;
                        if (Math.abs(f7) > c18604.f3338) {
                            c18604.onRelease();
                        }
                    } else {
                        edgeEffectM2502.onRelease();
                    }
                    zM2497 = zM2497 || C1872.m2497(c1872.f3376);
                }
                if (!zM2497 && !z) {
                    z5 = false;
                }
                z = z5;
            }
            if (z) {
                m2520();
            }
            return C8158.m13084(jFloatToRawIntBits, j4);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!C8158.m13087(jFloatToRawIntBits, 0L)) {
        }
        jM13085 = C8158.m13085(j, jFloatToRawIntBits);
        C1343 c134322 = (C1343) c1351.f1855;
        long j42 = new C8158(c134322.m1825(c134322.f1841, jM13085, c134322.f1844)).f19886;
        long jM1308522 = C8158.m13085(jM13085, j42);
        if (Float.intBitsToFloat((int) (jM13085 >> 32)) == 0.0f) {
            m2514();
        } else {
            m2514();
        }
        if (i != 1) {
        }
        if (!C8158.m13087(jM13085, 0L)) {
        }
        if (z) {
        }
        return C8158.m13084(jFloatToRawIntBits, j42);
    }

    @Override // androidx.compose.foundation.InterfaceC1922
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo2516() {
        C1872 c1872 = this.f3450;
        EdgeEffect edgeEffect = c1872.f3377;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1907.m2537(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = c1872.f3376;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1907.m2537(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = c1872.f3375;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1907.m2537(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = c1872.f3382;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? AbstractC1907.m2537(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    @Override // androidx.compose.foundation.InterfaceC1922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2622 mo2517() {
        return this.f3455;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0129, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // androidx.compose.foundation.InterfaceC1922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2518(long j, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        AndroidEdgeEffectOverscrollEffect$applyToFling$1 androidEdgeEffectOverscrollEffect$applyToFling$1;
        long jM13908;
        if (continuationImpl instanceof AndroidEdgeEffectOverscrollEffect$applyToFling$1) {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = (AndroidEdgeEffectOverscrollEffect$applyToFling$1) continuationImpl;
            int i = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidEdgeEffectOverscrollEffect$applyToFling$1.label = i - Integer.MIN_VALUE;
            } else {
                androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, continuationImpl);
            }
        }
        Object objInvoke = androidEdgeEffectOverscrollEffect$applyToFling$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
        C6008 c6008 = C6008.f15084;
        C1872 c1872 = this.f3450;
        if (i2 == 0) {
            AbstractC6017.m10769(objInvoke);
            if (C8155.m13072(this.f3454)) {
                Object c8731 = new C8731(j);
                androidEdgeEffectOverscrollEffect$applyToFling$1.label = 1;
                if (interfaceC7383.invoke(c8731, androidEdgeEffectOverscrollEffect$applyToFling$1) != obj) {
                    return c6008;
                }
            } else {
                boolean zM2498 = C1872.m2498(c1872.f3375);
                InterfaceC8725 interfaceC8725 = this.f3452;
                long jM6871 = AbstractC3738.m6871((!zM2498 || C8731.m13910(j) >= 0.0f) ? (!C1872.m2498(c1872.f3382) || C8731.m13910(j) <= 0.0f) ? 0.0f : -AbstractC1910.m2542(c1872.m2500(), -C8731.m13910(j), Float.intBitsToFloat((int) (this.f3454 >> 32)), interfaceC8725) : AbstractC1910.m2542(c1872.m2501(), C8731.m13910(j), Float.intBitsToFloat((int) (this.f3454 >> 32)), interfaceC8725), (!C1872.m2498(c1872.f3377) || C8731.m13909(j) >= 0.0f) ? (!C1872.m2498(c1872.f3376) || C8731.m13909(j) <= 0.0f) ? 0.0f : -AbstractC1910.m2542(c1872.m2502(), -C8731.m13909(j), Float.intBitsToFloat((int) (this.f3454 & 4294967295L)), interfaceC8725) : AbstractC1910.m2542(c1872.m2499(), C8731.m13909(j), Float.intBitsToFloat((int) (this.f3454 & 4294967295L)), interfaceC8725));
                if (jM6871 != 0) {
                    m2520();
                }
                jM13908 = C8731.m13908(j, jM6871);
                Object c87312 = new C8731(jM13908);
                androidEdgeEffectOverscrollEffect$applyToFling$1.J$0 = jM13908;
                androidEdgeEffectOverscrollEffect$applyToFling$1.label = 2;
                objInvoke = interfaceC7383.invoke(c87312, androidEdgeEffectOverscrollEffect$applyToFling$1);
            }
            return obj;
        }
        if (i2 == 1) {
            AbstractC6017.m10769(objInvoke);
            return c6008;
        }
        if (i2 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jM13908 = androidEdgeEffectOverscrollEffect$applyToFling$1.J$0;
        AbstractC6017.m10769(objInvoke);
        long jM139082 = C8731.m13908(jM13908, ((C8731) objInvoke).f22216);
        this.f3447 = false;
        if (C8731.m13910(jM139082) > 0.0f) {
            EdgeEffect edgeEffectM2501 = c1872.m2501();
            int iM12617 = AbstractC7390.m12617(C8731.m13910(jM139082));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM2501.isFinished()) {
                edgeEffectM2501.onAbsorb(iM12617);
            }
        } else if (C8731.m13910(jM139082) < 0.0f) {
            EdgeEffect edgeEffectM2500 = c1872.m2500();
            int i3 = -AbstractC7390.m12617(C8731.m13910(jM139082));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM2500.isFinished()) {
                edgeEffectM2500.onAbsorb(i3);
            }
        }
        if (C8731.m13909(jM139082) > 0.0f) {
            EdgeEffect edgeEffectM2499 = c1872.m2499();
            int iM126172 = AbstractC7390.m12617(C8731.m13909(jM139082));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM2499.isFinished()) {
                edgeEffectM2499.onAbsorb(iM126172);
            }
        } else if (C8731.m13909(jM139082) < 0.0f) {
            EdgeEffect edgeEffectM2502 = c1872.m2502();
            int i4 = -AbstractC7390.m12617(C8731.m13909(jM139082));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM2502.isFinished()) {
                edgeEffectM2502.onAbsorb(i4);
            }
        }
        m2514();
        return c6008;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float m2519(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m2513() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f3454 & 4294967295L));
        EdgeEffect edgeEffectM2502 = this.f3450.m2502();
        float fM2536 = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fM2536 = AbstractC1907.m2536(edgeEffectM2502, fM2536, f);
        } else {
            edgeEffectM2502.onPull(fM2536, f);
        }
        return (i2 >= 31 ? AbstractC1907.m2537(edgeEffectM2502) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f3454)) * (-fM2536) : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m2520() {
        if (this.f3448) {
            ((AbstractC2182) this.f3449).setValue(C6008.f15084);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float m2521(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m2513() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f3454 & 4294967295L));
        EdgeEffect edgeEffectM2499 = this.f3450.m2499();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = AbstractC1907.m2536(edgeEffectM2499, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectM2499.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC1907.m2537(edgeEffectM2499) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f3454 & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m2522(long j) {
        boolean zM13074 = C8155.m13074(this.f3454, 0L);
        boolean zM130742 = C8155.m13074(j, this.f3454);
        this.f3454 = j;
        if (!zM130742) {
            int iM12617 = AbstractC7390.m12617(Float.intBitsToFloat((int) (j >> 32)));
            long jM12617 = (((long) AbstractC7390.m12617(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iM12617) << 32);
            C1872 c1872 = this.f3450;
            c1872.f3378 = jM12617;
            EdgeEffect edgeEffect = c1872.f3377;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jM12617 >> 32), (int) (jM12617 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c1872.f3376;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM12617 >> 32), (int) (jM12617 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c1872.f3375;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM12617 & 4294967295L), (int) (jM12617 >> 32));
            }
            EdgeEffect edgeEffect4 = c1872.f3382;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM12617 & 4294967295L), (int) (jM12617 >> 32));
            }
            EdgeEffect edgeEffect5 = c1872.f3381;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM12617 >> 32), (int) (jM12617 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c1872.f3384;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM12617 >> 32), (int) (jM12617 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c1872.f3385;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM12617 & 4294967295L), (int) (jM12617 >> 32));
            }
            EdgeEffect edgeEffect8 = c1872.f3383;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jM12617), (int) (jM12617 >> 32));
            }
        }
        if (zM13074 || zM130742) {
            return;
        }
        m2514();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float m2523(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m2513() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f3454 >> 32));
        EdgeEffect edgeEffectM2501 = this.f3450.m2501();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = AbstractC1907.m2536(edgeEffectM2501, fIntBitsToFloat2, f);
        } else {
            edgeEffectM2501.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? AbstractC1907.m2537(edgeEffectM2501) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f3454 >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final float m2524(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m2513() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f3454 >> 32));
        EdgeEffect edgeEffectM2500 = this.f3450.m2500();
        float fM2536 = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fM2536 = AbstractC1907.m2536(edgeEffectM2500, fM2536, fIntBitsToFloat);
        } else {
            edgeEffectM2500.onPull(fM2536, fIntBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC1907.m2537(edgeEffectM2500) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f3454 >> 32)) * (-fM2536) : Float.intBitsToFloat(i);
    }
}
