package bsh;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BSHAutoCloseable extends BSHTypedVariableDeclaration {
    private static final long serialVersionUID = 1;
    public String name;
    public AutoCloseable ths;
    public Class<?> type;
    public String typeName;
    public Variable varThis;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHAutoCloseable(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void renderTypeNode() {
        if (jjtGetNumChildren() == 1) {
            Node bSHType = new BSHType(11);
            Node nodeJjtGetChild = jjtGetChild(0);
            while (nodeJjtGetChild.jjtGetNumChildren() > 0) {
                nodeJjtGetChild = nodeJjtGetChild.jjtGetChild(0);
                if (nodeJjtGetChild instanceof BSHAmbiguousName) {
                    break;
                }
            }
            BSHAmbiguousName bSHAmbiguousName = new BSHAmbiguousName(14);
            bSHAmbiguousName.jjtSetParent(bSHType);
            bSHAmbiguousName.text = ((BSHAmbiguousName) nodeJjtGetChild).text;
            bSHType.jjtAddChild(bSHAmbiguousName, 0);
            bSHType.jjtSetParent(this);
            this.children = new Node[]{bSHType, this.children[0]};
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void add(Node node) {
        super.add(node);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void close() throws Exception {
        boolean zIsTerminated;
        Variable variable = this.varThis;
        if (variable != null) {
            this.ths = (AutoCloseable) variable.getValue();
        }
        AutoCloseable autoCloseable = this.ths;
        if (autoCloseable != null) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    C2104o.m5289o();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z9 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(serialVersionUID, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z9) {
                        executorService.shutdownNow();
                        z9 = true;
                    }
                }
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void dump(String str) {
        super.dump(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.BSHTypedVariableDeclaration, bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        renderTypeNode();
        this.type = evalType(callStack, interpreter);
        if (!AutoCloseable.class.isAssignableFrom(getType())) {
            throw new EvalException("The resource type " + this.type.getName() + " does not implement java.lang.AutoCloseable.", this, callStack);
        }
        this.name = getDeclarators()[0].name;
        super.eval(callStack, interpreter);
        try {
            this.varThis = callStack.top().getVariableImpl(getName(), true);
            return Primitive.VOID;
        } catch (UtilEvalError e6) {
            throw e6.toEvalError("Unable to evaluate the try-with-resource " + getName() + ". With message:" + e6.getMessage(), this, callStack);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ int getId() {
        return super.getId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ int getLineNumber() {
        return super.getLineNumber();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ String getSourceFile() {
        return super.getSourceFile();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ String getText() {
        return super.getText();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ boolean hasNext() {
        return super.hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ boolean hasPrevious() {
        return super.hasPrevious();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void jjtAddChild(Node node, int i9) {
        super.jjtAddChild(node, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void jjtClose() {
        super.jjtClose();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ Node jjtGetChild(int i9) {
        return super.jjtGetChild(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ Node[] jjtGetChildren() {
        return super.jjtGetChildren();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ int jjtGetNumChildren() {
        return super.jjtGetNumChildren();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ Node jjtGetParent() {
        return super.jjtGetParent();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void jjtOpen() {
        super.jjtOpen();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void jjtSetParent(Node node) {
        super.jjtSetParent(node);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ Node next() {
        return super.next();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ int nextIndex() {
        return super.nextIndex();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ Node previous() {
        return super.previous();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ int previousIndex() {
        return super.previousIndex();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ void remove() {
        super.remove();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void set(Node node) {
        super.set(node);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void setSourceFile(String str) {
        super.setSourceFile(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.BSHTypedVariableDeclaration, bsh.SimpleNode
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ String toString(String str) {
        return super.toString(str);
    }
}
