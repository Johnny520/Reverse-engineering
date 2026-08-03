package io.sentry;

import io.sentry.rrweb.EnumC1987c;
import io.sentry.rrweb.EnumC1988d;

/* JADX INFO: renamed from: io.sentry.l1 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1920l1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6808a = null;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f6809b = null;

    static {
        int[] r0 = new int[EnumC1987c.values().length];
        f6809b = r0;
        r0[EnumC1987c.IncrementalSnapshot.ordinal()] = 1;     // Catch: NoSuchFieldError -> L11
    L16:
        f6809b[EnumC1987c.Meta.ordinal()] = 2;     // Catch: NoSuchFieldError -> L12
    L18:
        f6809b[EnumC1987c.Custom.ordinal()] = 3;     // Catch: NoSuchFieldError -> L13
    L7:
        int[] r2 = new int[EnumC1988d.values().length];
        f6808a = r2;
        r2[EnumC1988d.MouseInteraction.ordinal()] = 1;     // Catch: NoSuchFieldError -> L14
    L24:
        f6808a[EnumC1988d.TouchMove.ordinal()] = 2;     // Catch: NoSuchFieldError -> L15
        return;
    }
}
