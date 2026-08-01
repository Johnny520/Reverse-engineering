package bsh;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
            InterfaceC2618 bSHType = new BSHType(11);
            InterfaceC2618 interfaceC2618JjtGetChild = jjtGetChild(0);
            while (interfaceC2618JjtGetChild.jjtGetNumChildren() > 0) {
                interfaceC2618JjtGetChild = interfaceC2618JjtGetChild.jjtGetChild(0);
                if (interfaceC2618JjtGetChild instanceof BSHAmbiguousName) {
                    break;
                }
            }
            BSHAmbiguousName bSHAmbiguousName = new BSHAmbiguousName(14);
            bSHAmbiguousName.jjtSetParent(bSHType);
            bSHAmbiguousName.text = ((BSHAmbiguousName) interfaceC2618JjtGetChild).text;
            bSHType.jjtAddChild(bSHAmbiguousName, 0);
            bSHType.jjtSetParent(this);
            this.children = new InterfaceC2618[]{bSHType, this.children[0]};
        }
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void add(InterfaceC2618 interfaceC2618) {
        super.add(interfaceC2618);
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
                    C5919.m11245();
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

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public /* bridge */ /* synthetic */ void dump(String str) {
        super.dump(str);
    }

    @Override // bsh.BSHTypedVariableDeclaration, bsh.SimpleNode, bsh.InterfaceC2618
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

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public /* bridge */ /* synthetic */ int getLineNumber() {
        return super.getLineNumber();
    }

    public String getName() {
        return this.name;
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public /* bridge */ /* synthetic */ String getSourceFile() {
        return super.getSourceFile();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
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

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public /* bridge */ /* synthetic */ void jjtAddChild(InterfaceC2618 interfaceC2618, int i) {
        super.jjtAddChild(interfaceC2618, i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public /* bridge */ /* synthetic */ void jjtClose() {
        super.jjtClose();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public /* bridge */ /* synthetic */ InterfaceC2618 jjtGetChild(int i) {
        return super.jjtGetChild(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public /* bridge */ /* synthetic */ InterfaceC2618[] jjtGetChildren() {
        return super.jjtGetChildren();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public /* bridge */ /* synthetic */ int jjtGetNumChildren() {
        return super.jjtGetNumChildren();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public /* bridge */ /* synthetic */ InterfaceC2618 jjtGetParent() {
        return super.jjtGetParent();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public /* bridge */ /* synthetic */ void jjtOpen() {
        super.jjtOpen();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public /* bridge */ /* synthetic */ void jjtSetParent(InterfaceC2618 interfaceC2618) {
        super.jjtSetParent(interfaceC2618);
    }

    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ InterfaceC2618 next() {
        return super.next();
    }

    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ int nextIndex() {
        return super.nextIndex();
    }

    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ InterfaceC2618 previous() {
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
    public /* bridge */ /* synthetic */ void set(InterfaceC2618 interfaceC2618) {
        super.set(interfaceC2618);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
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
