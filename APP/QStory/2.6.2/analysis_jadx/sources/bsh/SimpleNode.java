package bsh;

import androidx.activity.AbstractC0053;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class SimpleNode implements InterfaceC2618, Serializable {
    private static final long serialVersionUID = 1;
    protected InterfaceC2618[] children;
    Token firstToken;
    protected int id;
    Token lastToken;
    protected InterfaceC2618 parent;
    protected C2613 parser;
    private String sourceFile;
    private int cursor = 0;
    private int lastRet = -1;

    public SimpleNode(int i) {
        this.id = i;
    }

    @Override // java.util.ListIterator
    public void add(InterfaceC2618 interfaceC2618) {
        InterfaceC2618[] interfaceC2618Arr = new InterfaceC2618[jjtGetNumChildren() + 1];
        System.arraycopy(this.children, 0, interfaceC2618Arr, 0, this.cursor);
        InterfaceC2618[] interfaceC2618Arr2 = this.children;
        int i = this.cursor;
        System.arraycopy(interfaceC2618Arr2, i, interfaceC2618Arr, i + 1, (r0 - i) - 1);
        this.children = interfaceC2618Arr;
        int i2 = this.cursor;
        this.cursor = i2 + 1;
        interfaceC2618Arr[i2] = interfaceC2618;
        this.lastRet = -1;
        interfaceC2618.jjtSetParent(this);
    }

    @Override // bsh.InterfaceC2618
    public void dump(String str) {
        System.out.println(toString(str));
        if (this.children == null) {
            return;
        }
        int i = 0;
        while (true) {
            InterfaceC2618[] interfaceC2618Arr = this.children;
            if (i >= interfaceC2618Arr.length) {
                return;
            }
            InterfaceC2618 interfaceC2618 = interfaceC2618Arr[i];
            if (interfaceC2618 != null) {
                interfaceC2618.dump(str + " ");
            }
            i++;
        }
    }

    @Override // bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) {
        throw new InterpreterError("Unimplemented or inappropriate for ".concat(getClass().getName()));
    }

    public int getId() {
        return this.id;
    }

    @Override // bsh.InterfaceC2618
    public int getLineNumber() {
        return this.firstToken.beginLine;
    }

    @Override // bsh.InterfaceC2618
    public String getSourceFile() {
        String str = this.sourceFile;
        if (str != null) {
            return str;
        }
        InterfaceC2618 interfaceC2618 = this.parent;
        return interfaceC2618 != null ? interfaceC2618.getSourceFile() : "<unknown file>";
    }

    @Override // bsh.InterfaceC2618
    public String getText() {
        Token token;
        StringBuilder sb = new StringBuilder();
        Token token2 = this.firstToken;
        while (token2 != null) {
            sb.append(token2.image);
            if (token2 == this.lastToken || token2.image.equals("{") || token2.image.equals(";") || (token = token2.next) == null) {
                break;
            }
            if (token.beginLine > token2.endLine || token.beginColumn > token2.endColumn + 1) {
                sb.append(" ");
            }
            token2 = token;
        }
        return sb.toString();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.cursor < jjtGetNumChildren();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.cursor > 0;
    }

    @Override // bsh.InterfaceC2618
    public void jjtAddChild(InterfaceC2618 interfaceC2618, int i) {
        InterfaceC2618[] interfaceC2618Arr = this.children;
        if (interfaceC2618Arr == null) {
            this.children = new InterfaceC2618[i + 1];
        } else if (i >= interfaceC2618Arr.length) {
            InterfaceC2618[] interfaceC2618Arr2 = new InterfaceC2618[i + 1];
            System.arraycopy(interfaceC2618Arr, 0, interfaceC2618Arr2, 0, interfaceC2618Arr.length);
            this.children = interfaceC2618Arr2;
        }
        this.children[i] = interfaceC2618;
    }

    @Override // bsh.InterfaceC2618
    public InterfaceC2618 jjtGetChild(int i) {
        return this.children[i];
    }

    @Override // bsh.InterfaceC2618
    public InterfaceC2618[] jjtGetChildren() {
        if (this.children == null) {
            this.children = new InterfaceC2618[0];
        }
        return this.children;
    }

    @Override // bsh.InterfaceC2618
    public int jjtGetNumChildren() {
        return jjtGetChildren().length;
    }

    @Override // bsh.InterfaceC2618
    public InterfaceC2618 jjtGetParent() {
        return this.parent;
    }

    @Override // bsh.InterfaceC2618
    public void jjtSetParent(InterfaceC2618 interfaceC2618) {
        this.parent = interfaceC2618;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public InterfaceC2618 next() {
        if (!hasNext()) {
            C2632.m5291();
            return null;
        }
        InterfaceC2618[] interfaceC2618Arr = this.children;
        int i = this.cursor;
        this.cursor = i + 1;
        this.lastRet = i;
        return interfaceC2618Arr[i];
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.cursor;
    }

    @Override // java.util.ListIterator
    public InterfaceC2618 previous() {
        if (!hasPrevious()) {
            C2632.m5291();
            return null;
        }
        InterfaceC2618[] interfaceC2618Arr = this.children;
        int i = this.cursor - 1;
        this.cursor = i;
        this.lastRet = i;
        return interfaceC2618Arr[i];
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.cursor - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        int i = this.lastRet;
        if (i < 0) {
            C2632.m5296();
            return;
        }
        this.cursor = i;
        InterfaceC2618[] interfaceC2618Arr = this.children;
        int length = interfaceC2618Arr.length - 1;
        InterfaceC2618[] interfaceC2618Arr2 = new InterfaceC2618[length];
        System.arraycopy(interfaceC2618Arr, 0, interfaceC2618Arr2, 0, i);
        InterfaceC2618[] interfaceC2618Arr3 = this.children;
        int i2 = this.cursor;
        System.arraycopy(interfaceC2618Arr3, i2 + 1, interfaceC2618Arr2, i2, length - i2);
        this.children = interfaceC2618Arr2;
        this.lastRet = -1;
    }

    @Override // java.util.ListIterator
    public void set(InterfaceC2618 interfaceC2618) {
        int i = this.lastRet;
        if (i >= 0) {
            this.children[i] = interfaceC2618;
        } else {
            C2632.m5296();
        }
    }

    @Override // bsh.InterfaceC2618
    public void setSourceFile(String str) {
        this.sourceFile = str;
    }

    public String toString(String str) {
        StringBuilder sbM149 = AbstractC0053.m149(str);
        sbM149.append(toString());
        return sbM149.toString();
    }

    public String toString() {
        return InterfaceC2664.f7974[this.id];
    }

    @Override // bsh.InterfaceC2618
    public void jjtClose() {
    }

    @Override // bsh.InterfaceC2618
    public void jjtOpen() {
    }
}
