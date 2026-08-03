package com.bumptech.glide.util.pool;

/* JADX INFO: loaded from: classes.dex */
public abstract class StateVerifier {
    private static final boolean DEBUG = false;

    /* JADX INFO: renamed from: com.bumptech.glide.util.pool.StateVerifier$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class DebugStateVerifier extends com.bumptech.glide.util.pool.StateVerifier {
        private volatile java.lang.RuntimeException recycledAtStackTraceException;

        public DebugStateVerifier() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public void setRecycled(boolean r2) {
                r1 = this;
                if (r2 == 0) goto Lc
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.String r0 = "Released"
                r2.<init>(r0)
                r1.recycledAtStackTraceException = r2
                goto Lf
            Lc:
                r2 = 0
                r1.recycledAtStackTraceException = r2
            Lf:
                return
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public void throwIfRecycled() {
                r3 = this;
                java.lang.RuntimeException r0 = r3.recycledAtStackTraceException
                if (r0 != 0) goto L5
                return
            L5:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Already released"
                java.lang.RuntimeException r2 = r3.recycledAtStackTraceException
                r0.<init>(r1, r2)
                throw r0
        }
    }

    public static class DefaultStateVerifier extends com.bumptech.glide.util.pool.StateVerifier {
        private volatile boolean isReleased;

        public DefaultStateVerifier() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public void setRecycled(boolean r1) {
                r0 = this;
                r0.isReleased = r1
                return
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public void throwIfRecycled() {
                r2 = this;
                boolean r0 = r2.isReleased
                if (r0 != 0) goto L5
                return
            L5:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Already released"
                r0.<init>(r1)
                throw r0
        }
    }

    private StateVerifier() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ StateVerifier(com.bumptech.glide.util.pool.StateVerifier.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.util.pool.StateVerifier newInstance() {
            com.bumptech.glide.util.pool.StateVerifier$DefaultStateVerifier r0 = new com.bumptech.glide.util.pool.StateVerifier$DefaultStateVerifier
            r0.<init>()
            return r0
    }

    public abstract void setRecycled(boolean r1);

    public abstract void throwIfRecycled();
}
