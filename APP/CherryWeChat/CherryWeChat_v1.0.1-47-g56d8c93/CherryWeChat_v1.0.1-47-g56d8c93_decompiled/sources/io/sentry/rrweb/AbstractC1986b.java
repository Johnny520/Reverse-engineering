package io.sentry.rrweb;

import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.rrweb.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1986b {

    /* JADX INFO: renamed from: a */
    public EnumC1987c f7115a;

    /* JADX INFO: renamed from: b */
    public long f7116b = System.currentTimeMillis();

    public AbstractC1986b(EnumC1987c enumC1987c) {
        this.f7115a = enumC1987c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1986b)) {
            return false;
        }
        AbstractC1986b abstractC1986b = (AbstractC1986b) obj;
        return this.f7116b == abstractC1986b.f7116b && this.f7115a == abstractC1986b.f7115a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7115a, Long.valueOf(this.f7116b)});
    }
}
