package bsh;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class BSHAutoCloseable extends BSHTypedVariableDeclaration {
    private static final long serialVersionUID = 1;
    public String name;
    public AutoCloseable ths;
    public Class<?> type;
    public String typeName;
    public Variable varThis;

    public BSHAutoCloseable(int i) {
        super(i);
    }

    private void renderTypeNode() {
        if (jjtGetNumChildren() == 1) {
            InterfaceC3452 bSHType = new BSHType(11);
            InterfaceC3452 interfaceC3452JjtGetChild = jjtGetChild(0);
            while (interfaceC3452JjtGetChild.jjtGetNumChildren() > 0) {
                interfaceC3452JjtGetChild = interfaceC3452JjtGetChild.jjtGetChild(0);
                if (interfaceC3452JjtGetChild instanceof BSHAmbiguousName) {
                    break;
                }
            }
            BSHAmbiguousName bSHAmbiguousName = new BSHAmbiguousName(14);
            bSHAmbiguousName.jjtSetParent(bSHType);
            bSHAmbiguousName.text = ((BSHAmbiguousName) interfaceC3452JjtGetChild).text;
            bSHType.jjtAddChild(bSHAmbiguousName, 0);
            bSHType.jjtSetParent(this);
            this.children = new InterfaceC3452[]{bSHType, this.children[0]};
        }
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void add(InterfaceC3452 interfaceC3452) {
        super.add(interfaceC3452);
    }

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
                    C6755.m11865();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(serialVersionUID, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ void dump(String str) {
        super.dump(str);
    }

    @Override // bsh.BSHTypedVariableDeclaration, bsh.SimpleNode, bsh.InterfaceC3452
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
        } catch (UtilEvalError e) {
            throw e.toEvalError("Unable to evaluate the try-with-resource " + getName() + ". With message:" + e.getMessage(), this, callStack);
        }
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ int getId() {
        return super.getId();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ int getLineNumber() {
        return super.getLineNumber();
    }

    public String getName() {
        return this.name;
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ String getSourceFile() {
        return super.getSourceFile();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ String getText() {
        return super.getText();
    }

    public Class<?> getType() {
        return this.type;
    }

    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ boolean hasNext() {
        return super.hasNext();
    }

    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ boolean hasPrevious() {
        return super.hasPrevious();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ void jjtAddChild(InterfaceC3452 interfaceC3452, int i) {
        super.jjtAddChild(interfaceC3452, i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ void jjtClose() {
        super.jjtClose();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ InterfaceC3452 jjtGetChild(int i) {
        return super.jjtGetChild(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ InterfaceC3452[] jjtGetChildren() {
        return super.jjtGetChildren();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ int jjtGetNumChildren() {
        return super.jjtGetNumChildren();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ InterfaceC3452 jjtGetParent() {
        return super.jjtGetParent();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ void jjtOpen() {
        super.jjtOpen();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ void jjtSetParent(InterfaceC3452 interfaceC3452) {
        super.jjtSetParent(interfaceC3452);
    }

    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ InterfaceC3452 next() {
        return super.next();
    }

    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ int nextIndex() {
        return super.nextIndex();
    }

    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ InterfaceC3452 previous() {
        return super.previous();
    }

    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ int previousIndex() {
        return super.previousIndex();
    }

    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ void remove() {
        super.remove();
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void set(InterfaceC3452 interfaceC3452) {
        super.set(interfaceC3452);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ void setSourceFile(String str) {
        super.setSourceFile(str);
    }

    @Override // bsh.BSHTypedVariableDeclaration, bsh.SimpleNode
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ String toString(String str) {
        return super.toString(str);
    }
}
