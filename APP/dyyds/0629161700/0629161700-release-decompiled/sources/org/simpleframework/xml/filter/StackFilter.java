package org.simpleframework.xml.filter;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class StackFilter implements org.simpleframework.xml.filter.Filter {
    private java.util.Stack<org.simpleframework.xml.filter.Filter> stack;

    public StackFilter() {
            r1 = this;
            r1.<init>()
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r1.stack = r0
            return
    }

    public void push(org.simpleframework.xml.filter.Filter r1) {
            r0 = this;
            java.util.Stack<org.simpleframework.xml.filter.Filter> r0 = r0.stack
            r0.push(r1)
            return
    }

    @Override // org.simpleframework.xml.filter.Filter
    public java.lang.String replace(java.lang.String r3) {
            r2 = this;
            java.util.Stack<org.simpleframework.xml.filter.Filter> r0 = r2.stack
            int r0 = r0.size()
        L6:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L19
            java.util.Stack<org.simpleframework.xml.filter.Filter> r1 = r2.stack
            java.lang.Object r1 = r1.get(r0)
            org.simpleframework.xml.filter.Filter r1 = (org.simpleframework.xml.filter.Filter) r1
            java.lang.String r1 = r1.replace(r3)
            if (r1 == 0) goto L6
            return r1
        L19:
            r2 = 0
            return r2
    }
}
