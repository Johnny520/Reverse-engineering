package com.squareup.wire;

import java.io.Serializable;
import p024b9.AbstractC1043k;
import p107h6.AbstractC2882j;
import p107h6.C2880h;

/* JADX INFO: renamed from: com.squareup.wire.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1845a implements Serializable {

    /* JADX INFO: renamed from: r */
    public static final a f4889r = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: q */
    public final transient AbstractC2882j f4890q;

    /* JADX INFO: renamed from: a */
    public final byte[] m6536a() {
        return this.f4890q.m10370g(this);
    }

    public String toString() {
        return this.f4890q.m10375p(this);
    }

    public final Object writeReplace() {
        return new C2880h(m6536a(), getClass());
    }

    /* JADX INFO: renamed from: com.squareup.wire.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
