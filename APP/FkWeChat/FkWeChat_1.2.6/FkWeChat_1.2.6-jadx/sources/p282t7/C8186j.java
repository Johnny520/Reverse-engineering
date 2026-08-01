package p282t7;

import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: t7.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8186j {

    /* JADX INFO: renamed from: a */
    public final String f27484a;

    /* JADX INFO: renamed from: b */
    public final int f27485b;

    public C8186j(String str) {
        str.getClass();
        this.f27484a = str;
        int length = str.length();
        int lowerCase = 0;
        for (int i10 = 0; i10 < length; i10++) {
            lowerCase = (lowerCase * 31) + Character.toLowerCase(str.charAt(i10));
        }
        this.f27485b = lowerCase;
    }

    /* JADX INFO: renamed from: a */
    public final String m31860a() {
        return this.f27484a;
    }

    public boolean equals(Object obj) {
        String str;
        C8186j c8186j = obj instanceof C8186j ? (C8186j) obj : null;
        return (c8186j == null || (str = c8186j.f27484a) == null || !AbstractC8611a0.m33061F(str, this.f27484a, true)) ? false : true;
    }

    public int hashCode() {
        return this.f27485b;
    }

    public String toString() {
        return this.f27484a;
    }
}
