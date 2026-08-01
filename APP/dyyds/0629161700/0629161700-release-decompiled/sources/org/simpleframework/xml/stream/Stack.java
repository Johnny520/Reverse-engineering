package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class Stack<T> extends java.util.ArrayList<T> {
    public Stack(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public T bottom() {
            r1 = this;
            int r0 = r1.size()
            if (r0 > 0) goto L8
            r1 = 0
            return r1
        L8:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    public T pop() {
            r1 = this;
            int r0 = r1.size()
            if (r0 > 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.remove(r0)
            return r1
    }

    public T push(T r1) {
            r0 = this;
            r0.add(r1)
            return r1
    }

    public T top() {
            r1 = this;
            int r0 = r1.size()
            if (r0 > 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            return r1
    }
}
