package bsh;

import androidx.activity.AbstractC0053;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class SimpleNode implements InterfaceC2619, Serializable {
    private static final long serialVersionUID = 1;
    protected InterfaceC2619[] children;
    Token firstToken;
    protected int id;
    Token lastToken;
    protected InterfaceC2619 parent;
    protected C2614 parser;
    private String sourceFile;
    private int cursor = 0;
    private int lastRet = -1;

    public SimpleNode(int i) {
        this.id = i;
    }

    @Override // java.util.ListIterator
    public void add(InterfaceC2619 interfaceC2619) {
        InterfaceC2619[] interfaceC2619Arr = new InterfaceC2619[jjtGetNumChildren() + 1];
        System.arraycopy(this.children, 0, interfaceC2619Arr, 0, this.cursor);
        InterfaceC2619[] interfaceC2619Arr2 = this.children;
        int i = this.cursor;
        System.arraycopy(interfaceC2619Arr2, i, interfaceC2619Arr, i + 1, (r0 - i) - 1);
        this.children = interfaceC2619Arr;
        int i2 = this.cursor;
        this.cursor = i2 + 1;
        interfaceC2619Arr[i2] = interfaceC2619;
        this.lastRet = -1;
        interfaceC2619.jjtSetParent(this);
    }

    @Override // bsh.InterfaceC2619
    public void dump(String str) {
        System.out.println(toString(str));
        if (this.children == null) {
            return;
        }
        int i = 0;
        while (true) {
            InterfaceC2619[] interfaceC2619Arr = this.children;
            if (i >= interfaceC2619Arr.length) {
                return;
            }
            InterfaceC2619 interfaceC2619 = interfaceC2619Arr[i];
            if (interfaceC2619 != null) {
                interfaceC2619.dump(str + " ");
            }
            i++;
        }
    }

    @Override // bsh.InterfaceC2619
    public Object eval(CallStack callStack, Interpreter interpreter) {
        throw new InterpreterError("Unimplemented or inappropriate for ".concat(getClass().getName()));
    }

    public int getId() {
        return this.id;
    }

    @Override // bsh.InterfaceC2619
    public int getLineNumber() {
        return this.firstToken.beginLine;
    }

    @Override // bsh.InterfaceC2619
    public String getSourceFile() {
        String str = this.sourceFile;
        if (str != null) {
            return str;
        }
        InterfaceC2619 interfaceC2619 = this.parent;
        return interfaceC2619 != null ? interfaceC2619.getSourceFile() : "<unknown file>";
    }

    @Override // bsh.InterfaceC2619
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

    @Override // bsh.InterfaceC2619
    public void jjtAddChild(InterfaceC2619 interfaceC2619, int i) {
        InterfaceC2619[] interfaceC2619Arr = this.children;
        if (interfaceC2619Arr == null) {
            this.children = new InterfaceC2619[i + 1];
        } else if (i >= interfaceC2619Arr.length) {
            InterfaceC2619[] interfaceC2619Arr2 = new InterfaceC2619[i + 1];
            System.arraycopy(interfaceC2619Arr, 0, interfaceC2619Arr2, 0, interfaceC2619Arr.length);
            this.children = interfaceC2619Arr2;
        }
        this.children[i] = interfaceC2619;
    }

    @Override // bsh.InterfaceC2619
    public InterfaceC2619 jjtGetChild(int i) {
        return this.children[i];
    }

    @Override // bsh.InterfaceC2619
    public InterfaceC2619[] jjtGetChildren() {
        if (this.children == null) {
            this.children = new InterfaceC2619[0];
        }
        return this.children;
    }

    @Override // bsh.InterfaceC2619
    public int jjtGetNumChildren() {
        return jjtGetChildren().length;
    }

    @Override // bsh.InterfaceC2619
    public InterfaceC2619 jjtGetParent() {
        return this.parent;
    }

    @Override // bsh.InterfaceC2619
    public void jjtSetParent(InterfaceC2619 interfaceC2619) {
        this.parent = interfaceC2619;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public InterfaceC2619 next() {
        if (!hasNext()) {
            C2633.m5336();
            return null;
        }
        InterfaceC2619[] interfaceC2619Arr = this.children;
        int i = this.cursor;
        this.cursor = i + 1;
        this.lastRet = i;
        return interfaceC2619Arr[i];
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.cursor;
    }

    @Override // java.util.ListIterator
    public InterfaceC2619 previous() {
        if (!hasPrevious()) {
            C2633.m5336();
            return null;
        }
        InterfaceC2619[] interfaceC2619Arr = this.children;
        int i = this.cursor - 1;
        this.cursor = i;
        this.lastRet = i;
        return interfaceC2619Arr[i];
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.cursor - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        int i = this.lastRet;
        if (i < 0) {
            C2633.m5341();
            return;
        }
        this.cursor = i;
        InterfaceC2619[] interfaceC2619Arr = this.children;
        int length = interfaceC2619Arr.length - 1;
        InterfaceC2619[] interfaceC2619Arr2 = new InterfaceC2619[length];
        System.arraycopy(interfaceC2619Arr, 0, interfaceC2619Arr2, 0, i);
        InterfaceC2619[] interfaceC2619Arr3 = this.children;
        int i2 = this.cursor;
        System.arraycopy(interfaceC2619Arr3, i2 + 1, interfaceC2619Arr2, i2, length - i2);
        this.children = interfaceC2619Arr2;
        this.lastRet = -1;
    }

    @Override // java.util.ListIterator
    public void set(InterfaceC2619 interfaceC2619) {
        int i = this.lastRet;
        if (i >= 0) {
            this.children[i] = interfaceC2619;
        } else {
            C2633.m5341();
        }
    }

    @Override // bsh.InterfaceC2619
    public void setSourceFile(String str) {
        this.sourceFile = str;
    }

    public String toString(String str) {
        StringBuilder sbM140 = AbstractC0053.m140(str);
        sbM140.append(toString());
        return sbM140.toString();
    }

    public String toString() {
        return InterfaceC2665.f7976[this.id];
    }

    @Override // bsh.InterfaceC2619
    public void jjtClose() {
    }

    @Override // bsh.InterfaceC2619
    public void jjtOpen() {
    }
}
