package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.km.KmVariance;
import kotlin.reflect.jvm.internal.impl.km.Visibility;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5034 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14516;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14517;

    static {
        int[] iArr = new int[KmVariance.values().length];
        try {
            iArr[KmVariance.IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KmVariance.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KmVariance.INVARIANT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f14517 = iArr;
        int[] iArr2 = new int[Visibility.values().length];
        try {
            iArr2[Visibility.INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[Visibility.PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[Visibility.PROTECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[Visibility.PUBLIC.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[Visibility.PRIVATE_TO_THIS.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[Visibility.LOCAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        f14516 = iArr2;
    }
}
