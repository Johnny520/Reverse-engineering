package io.sentry;

import io.sentry.rrweb.EnumC1987c;
import io.sentry.rrweb.EnumC1988d;

/* JADX INFO: renamed from: io.sentry.l1 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1920l1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6808a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f6809b;

    static {
        int[] iArr = new int[EnumC1987c.values().length];
        f6809b = iArr;
        try {
            iArr[EnumC1987c.IncrementalSnapshot.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6809b[EnumC1987c.Meta.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6809b[EnumC1987c.Custom.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC1988d.values().length];
        f6808a = iArr2;
        try {
            iArr2[EnumC1988d.MouseInteraction.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6808a[EnumC1988d.TouchMove.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
