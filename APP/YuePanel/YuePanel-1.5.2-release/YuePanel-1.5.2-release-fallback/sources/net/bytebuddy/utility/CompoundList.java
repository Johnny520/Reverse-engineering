package net.bytebuddy.utility;

/* JADX INFO: loaded from: classes2.dex */
public class CompoundList {
    private CompoundList() {
            r2 = this;
            r2.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This class is a utility class and not supposed to be instantiated"
            r0.<init>(r1)
            throw r0
    }

    public static <S> java.util.List<S> of(S r2, java.util.List<? extends S> r3) {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lb
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r2)
            r0.addAll(r3)
            return r0
    }

    public static <S> java.util.List<S> of(java.util.List<? extends S> r2, S r3) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            java.util.List r2 = java.util.Collections.singletonList(r3)
            return r2
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.addAll(r2)
            r0.add(r3)
            return r0
    }

    public static <S> java.util.List<S> of(java.util.List<? extends S> r3, java.util.List<? extends S> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.addAll(r3)
            r0.addAll(r4)
            return r0
    }

    public static <S> java.util.List<S> of(java.util.List<? extends S> r3, java.util.List<? extends S> r4, java.util.List<? extends S> r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            int r2 = r5.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.addAll(r3)
            r0.addAll(r4)
            r0.addAll(r5)
            return r0
    }
}
