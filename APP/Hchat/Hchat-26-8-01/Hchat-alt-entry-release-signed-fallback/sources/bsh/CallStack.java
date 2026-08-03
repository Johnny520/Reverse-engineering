package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CallStack implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final java.util.Stack<bsh.NameSpace> stack;

    public CallStack() {
            r1 = this;
            r1.<init>()
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r1.stack = r0
            return
    }

    public CallStack(bsh.NameSpace r2) {
            r1 = this;
            r1.<init>()
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r1.stack = r0
            r1.push(r2)
            return
    }

    public void clear() {
            r1 = this;
            java.util.Stack<bsh.NameSpace> r0 = r1.stack
            r0.clear()
            return
    }

    public bsh.CallStack copy() {
            r3 = this;
            bsh.CallStack r0 = new bsh.CallStack
            r0.<init>()
            java.util.Stack<bsh.NameSpace> r1 = r0.stack
            java.util.Stack<bsh.NameSpace> r2 = r3.stack
            r1.addAll(r2)
            return r0
    }

    public int depth() {
            r1 = this;
            java.util.Stack<bsh.NameSpace> r0 = r1.stack
            int r0 = r0.size()
            return r0
    }

    public bsh.NameSpace get(int r4) {
            r3 = this;
            java.util.Stack<bsh.NameSpace> r0 = r3.stack
            int r0 = r0.size()
            if (r4 < r0) goto Lb
            bsh.NameSpace r4 = bsh.NameSpace.JAVACODE
            return r4
        Lb:
            java.util.Stack<bsh.NameSpace> r1 = r3.stack
            bsh.NameSpace[] r2 = new bsh.NameSpace[r0]
            java.lang.Object[] r1 = r1.toArray(r2)
            bsh.NameSpace[] r1 = (bsh.NameSpace[]) r1
            int r0 = r0 + (-1)
            int r0 = r0 - r4
            r4 = r1[r0]
            return r4
    }

    public bsh.NameSpace pop() {
            r1 = this;
            java.util.Stack<bsh.NameSpace> r0 = r1.stack     // Catch: java.util.EmptyStackException -> L9
            java.lang.Object r0 = r0.pop()     // Catch: java.util.EmptyStackException -> L9
            bsh.NameSpace r0 = (bsh.NameSpace) r0     // Catch: java.util.EmptyStackException -> L9
            return r0
        L9:
            java.lang.String r0 = "pop on empty CallStack"
            bsh.j.f(r0)
            r0 = 0
            return r0
    }

    public void push(bsh.NameSpace r2) {
            r1 = this;
            java.util.Stack<bsh.NameSpace> r0 = r1.stack
            r0.push(r2)
            return
    }

    public synchronized void set(int r3, bsh.NameSpace r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.Stack<bsh.NameSpace> r0 = r2.stack     // Catch: java.lang.Throwable -> Lf
            int r1 = r0.size()     // Catch: java.lang.Throwable -> Lf
            int r1 = r1 + (-1)
            int r1 = r1 - r3
            r0.set(r1, r4)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return
        Lf:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    public bsh.NameSpace swap(bsh.NameSpace r3) {
            r2 = this;
            java.util.Stack<bsh.NameSpace> r0 = r2.stack
            java.lang.Object r0 = r0.pop()
            bsh.NameSpace r0 = (bsh.NameSpace) r0
            java.util.Stack<bsh.NameSpace> r1 = r2.stack
            r1.push(r3)
            return r0
    }

    public synchronized java.lang.String toString() {
            r4 = this;
            monitor-enter(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r0.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "CallStack:\n"
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.util.Stack<bsh.NameSpace> r1 = r4.stack     // Catch: java.lang.Throwable -> L37
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L37
            int r1 = r1 + (-1)
        L13:
            if (r1 < 0) goto L39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r2.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = "\t"
            r2.append(r3)     // Catch: java.lang.Throwable -> L37
            java.util.Stack<bsh.NameSpace> r3 = r4.stack     // Catch: java.lang.Throwable -> L37
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L37
            r2.append(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L37
            r0.append(r2)     // Catch: java.lang.Throwable -> L37
            int r1 = r1 + (-1)
            goto L13
        L37:
            r0 = move-exception
            goto L3f
        L39:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r4)
            return r0
        L3f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            throw r0
    }

    public bsh.NameSpace top() {
            r1 = this;
            java.util.Stack<bsh.NameSpace> r0 = r1.stack
            java.lang.Object r0 = r0.peek()
            bsh.NameSpace r0 = (bsh.NameSpace) r0
            return r0
    }
}
