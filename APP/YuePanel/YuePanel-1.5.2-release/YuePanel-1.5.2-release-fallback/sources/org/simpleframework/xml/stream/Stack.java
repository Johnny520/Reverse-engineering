package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
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
            r0 = 0
            return r0
        L8:
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            return r0
    }

    public T pop() {
            r1 = this;
            int r0 = r1.size()
            if (r0 > 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.remove(r0)
            return r0
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
            r0 = 0
            return r0
        L8:
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.get(r0)
            return r0
    }
}
