package bsh;

import java.io.Serializable;
import java.util.EmptyStackException;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CallStack implements Serializable {
    private static final long serialVersionUID = 1;
    private final Stack<NameSpace> stack = new Stack<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CallStack(NameSpace nameSpace) {
        push(nameSpace);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void clear() {
        this.stack.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CallStack copy() {
        CallStack callStack = new CallStack();
        callStack.stack.addAll(this.stack);
        return callStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int depth() {
        return this.stack.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NameSpace get(int i9) {
        int size = this.stack.size();
        return i9 >= size ? NameSpace.JAVACODE : ((NameSpace[]) this.stack.toArray(new NameSpace[size]))[(size - 1) - i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NameSpace pop() {
        try {
            return this.stack.pop();
        } catch (EmptyStackException unused) {
            C0353j.m1308f("pop on empty CallStack");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void push(NameSpace nameSpace) {
        this.stack.push(nameSpace);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized void set(int i9, NameSpace nameSpace) {
        this.stack.set((r0.size() - 1) - i9, nameSpace);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NameSpace swap(NameSpace nameSpace) {
        NameSpace nameSpacePop = this.stack.pop();
        this.stack.push(nameSpace);
        return nameSpacePop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized String toString() {
        StringBuilder sb2;
        try {
            sb2 = new StringBuilder();
            sb2.append("CallStack:\n");
            for (int size = this.stack.size() - 1; size >= 0; size += -1) {
                sb2.append("\t" + this.stack.get(size) + "\n");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NameSpace top() {
        return this.stack.peek();
    }

    public CallStack() {
    }
}
