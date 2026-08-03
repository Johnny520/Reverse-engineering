package io.sentry.rrweb;

import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.rrweb.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1986b {

    /* JADX INFO: renamed from: a */
    public EnumC1987c f7115a;

    /* JADX INFO: renamed from: b */
    public long f7116b;

    public AbstractC1986b(EnumC1987c r3) {
        this.f7115a = r3;
        this.f7116b = System.currentTimeMillis();
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof AbstractC1986b) == true) goto L8;
        return false;
    L8:
        AbstractC1986b r82 = (AbstractC1986b) r8;
        if (this.f7116b == r82.f7116b) goto L11;
    L13:
        return false;
    L11:
        if (this.f7115a != r82.f7115a) goto L13;
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7115a, Long.valueOf(this.f7116b)});
    }
}
