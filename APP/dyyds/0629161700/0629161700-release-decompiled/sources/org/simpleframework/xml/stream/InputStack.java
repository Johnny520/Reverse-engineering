package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }
}
