package bsh;

import androidx.activity.AbstractC0900;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class SimpleNode implements InterfaceC3452, Serializable {
    private static final long serialVersionUID = 1;
    protected InterfaceC3452[] children;
    Token firstToken;

    /* JADX INFO: renamed from: id */
    protected int f20id;
    Token lastToken;
    protected InterfaceC3452 parent;
    protected C3447 parser;
    private String sourceFile;
    private int cursor = 0;
    private int lastRet = -1;

    public SimpleNode(int i) {
        this.f20id = i;
    }

    @Override // java.util.ListIterator
    public void add(InterfaceC3452 interfaceC3452) {
        InterfaceC3452[] interfaceC3452Arr = new InterfaceC3452[jjtGetNumChildren() + 1];
        System.arraycopy(this.children, 0, interfaceC3452Arr, 0, this.cursor);
        InterfaceC3452[] interfaceC3452Arr2 = this.children;
        int i = this.cursor;
        System.arraycopy(interfaceC3452Arr2, i, interfaceC3452Arr, i + 1, (r0 - i) - 1);
        this.children = interfaceC3452Arr;
        int i2 = this.cursor;
        this.cursor = i2 + 1;
        interfaceC3452Arr[i2] = interfaceC3452;
        this.lastRet = -1;
        interfaceC3452.jjtSetParent(this);
    }

    @Override // bsh.InterfaceC3452
    public void dump(String str) {
        System.out.println(toString(str));
        if (this.children == null) {
            return;
        }
        int i = 0;
        while (true) {
            InterfaceC3452[] interfaceC3452Arr = this.children;
            if (i >= interfaceC3452Arr.length) {
                return;
            }
            InterfaceC3452 interfaceC3452 = interfaceC3452Arr[i];
            if (interfaceC3452 != null) {
                interfaceC3452.dump(str + " ");
            }
            i++;
        }
    }

    @Override // bsh.InterfaceC3452
    public Object eval(CallStack callStack, Interpreter interpreter) {
        throw new InterpreterError("Unimplemented or inappropriate for ".concat(getClass().getName()));
    }

    public int getId() {
        return this.f20id;
    }

    @Override // bsh.InterfaceC3452
    public int getLineNumber() {
        return this.firstToken.beginLine;
    }

    @Override // bsh.InterfaceC3452
    public String getSourceFile() {
        String str = this.sourceFile;
        if (str != null) {
            return str;
        }
        InterfaceC3452 interfaceC3452 = this.parent;
        return interfaceC3452 != null ? interfaceC3452.getSourceFile() : "<unknown file>";
    }

    @Override // bsh.InterfaceC3452
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

    @Override // bsh.InterfaceC3452
    public void jjtAddChild(InterfaceC3452 interfaceC3452, int i) {
        InterfaceC3452[] interfaceC3452Arr = this.children;
        if (interfaceC3452Arr == null) {
            this.children = new InterfaceC3452[i + 1];
        } else if (i >= interfaceC3452Arr.length) {
            InterfaceC3452[] interfaceC3452Arr2 = new InterfaceC3452[i + 1];
            System.arraycopy(interfaceC3452Arr, 0, interfaceC3452Arr2, 0, interfaceC3452Arr.length);
            this.children = interfaceC3452Arr2;
        }
        this.children[i] = interfaceC3452;
    }

    @Override // bsh.InterfaceC3452
    public InterfaceC3452 jjtGetChild(int i) {
        return this.children[i];
    }

    @Override // bsh.InterfaceC3452
    public InterfaceC3452[] jjtGetChildren() {
        if (this.children == null) {
            this.children = new InterfaceC3452[0];
        }
        return this.children;
    }

    @Override // bsh.InterfaceC3452
    public int jjtGetNumChildren() {
        return jjtGetChildren().length;
    }

    @Override // bsh.InterfaceC3452
    public InterfaceC3452 jjtGetParent() {
        return this.parent;
    }

    @Override // bsh.InterfaceC3452
    public void jjtSetParent(InterfaceC3452 interfaceC3452) {
        this.parent = interfaceC3452;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public InterfaceC3452 next() {
        if (!hasNext()) {
            C3466.m5896();
            return null;
        }
        InterfaceC3452[] interfaceC3452Arr = this.children;
        int i = this.cursor;
        this.cursor = i + 1;
        this.lastRet = i;
        return interfaceC3452Arr[i];
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.cursor;
    }

    @Override // java.util.ListIterator
    public InterfaceC3452 previous() {
        if (!hasPrevious()) {
            C3466.m5896();
            return null;
        }
        InterfaceC3452[] interfaceC3452Arr = this.children;
        int i = this.cursor - 1;
        this.cursor = i;
        this.lastRet = i;
        return interfaceC3452Arr[i];
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.cursor - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        int i = this.lastRet;
        if (i < 0) {
            C3466.m5901();
            return;
        }
        this.cursor = i;
        InterfaceC3452[] interfaceC3452Arr = this.children;
        int length = interfaceC3452Arr.length - 1;
        InterfaceC3452[] interfaceC3452Arr2 = new InterfaceC3452[length];
        System.arraycopy(interfaceC3452Arr, 0, interfaceC3452Arr2, 0, i);
        InterfaceC3452[] interfaceC3452Arr3 = this.children;
        int i2 = this.cursor;
        System.arraycopy(interfaceC3452Arr3, i2 + 1, interfaceC3452Arr2, i2, length - i2);
        this.children = interfaceC3452Arr2;
        this.lastRet = -1;
    }

    @Override // java.util.ListIterator
    public void set(InterfaceC3452 interfaceC3452) {
        int i = this.lastRet;
        if (i >= 0) {
            this.children[i] = interfaceC3452;
        } else {
            C3466.m5901();
        }
    }

    @Override // bsh.InterfaceC3452
    public void setSourceFile(String str) {
        this.sourceFile = str;
    }

    public String toString(String str) {
        StringBuilder sbM700 = AbstractC0900.m700(str);
        sbM700.append(toString());
        return sbM700.toString();
    }

    public String toString() {
        return InterfaceC3498.f8321[this.f20id];
    }

    @Override // bsh.InterfaceC3452
    public void jjtClose() {
    }

    @Override // bsh.InterfaceC3452
    public void jjtOpen() {
    }
}
