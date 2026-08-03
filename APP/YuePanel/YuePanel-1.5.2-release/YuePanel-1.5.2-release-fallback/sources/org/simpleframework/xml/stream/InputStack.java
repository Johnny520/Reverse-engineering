package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class InputStack extends org.simpleframework.xml.stream.Stack<org.simpleframework.xml.stream.InputNode> {
    public InputStack() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public boolean isRelevant(org.simpleframework.xml.stream.InputNode r1) {
            r0 = this;
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto Lf
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }
}
