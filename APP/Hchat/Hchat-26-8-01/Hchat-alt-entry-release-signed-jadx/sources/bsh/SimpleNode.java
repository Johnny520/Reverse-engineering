package bsh;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class SimpleNode implements Node, Serializable {
    private static final long serialVersionUID = 1;
    protected Node[] children;
    transient Token firstToken;

    /* JADX INFO: renamed from: id */
    protected int f988id;
    transient Token lastToken;
    protected Node parent;
    protected transient Parser parser;
    private String sourceFile;
    private int cursor = 0;
    private int lastRet = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SimpleNode(int i9) {
        this.f988id = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)V */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.ListIterator
    public void add(Node node) {
        Node[] nodeArr = new Node[jjtGetNumChildren() + 1];
        System.arraycopy(this.children, 0, nodeArr, 0, this.cursor);
        Node[] nodeArr2 = this.children;
        int i9 = this.cursor;
        System.arraycopy(nodeArr2, i9, nodeArr, i9 + 1, (r0 - i9) - 1);
        this.children = nodeArr;
        int i10 = this.cursor;
        this.cursor = i10 + 1;
        nodeArr[i10] = node;
        this.lastRet = -1;
        node.jjtSetParent(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Node
    public void dump(String str) {
        System.out.println(toString(str));
        if (this.children == null) {
            return;
        }
        int i9 = 0;
        while (true) {
            Node[] nodeArr = this.children;
            if (i9 >= nodeArr.length) {
                return;
            }
            Node node = nodeArr[i9];
            if (node != null) {
                node.dump(str + " ");
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) {
        throw new InterpreterError("Unimplemented or inappropriate for ".concat(getClass().getName()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Node
    public int getId() {
        return this.f988id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Node
    public int getLineNumber() {
        Token token = this.firstToken;
        if (token != null) {
            return token.beginLine;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Node
    public String getSourceFile() {
        String str = this.sourceFile;
        if (str != null) {
            return str;
        }
        Node node = this.parent;
        return node != null ? node.getSourceFile() : "<unknown file>";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Node
    public String getText() {
        Token token;
        Token token2 = this.firstToken;
        if (token2 == null) {
            return toString();
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            sb2.append(token2.image);
            if (token2 == this.lastToken || token2.image.equals("{") || token2.image.equals(";") || (token = token2.next) == null) {
                break;
            }
            if (token.beginLine > token2.endLine || token.beginColumn > token2.endColumn + 1) {
                sb2.append(" ");
            }
            token2 = token;
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.cursor < jjtGetNumChildren();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.cursor > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Node
    public void jjtAddChild(Node node, int i9) {
        Node[] nodeArr = this.children;
        if (nodeArr == null) {
            this.children = new Node[i9 + 1];
        } else if (i9 >= nodeArr.length) {
            Node[] nodeArr2 = new Node[i9 + 1];
            System.arraycopy(nodeArr, 0, nodeArr2, 0, nodeArr.length);
            this.children = nodeArr2;
        }
        this.children[i9] = node;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Node
    public Node jjtGetChild(int i9) {
        return this.children[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Node
    public Node[] jjtGetChildren() {
        if (this.children == null) {
            this.children = new Node[0];
        }
        return this.children;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Node
    public int jjtGetNumChildren() {
        return jjtGetChildren().length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Node
    public Node jjtGetParent() {
        return this.parent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Node
    public void jjtSetParent(Node node) {
        this.parent = node;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
    @Override // java.util.ListIterator, java.util.Iterator
    public Node next() {
        if (!hasNext()) {
            C0353j.m1307e();
            return null;
        }
        Node[] nodeArr = this.children;
        int i9 = this.cursor;
        this.cursor = i9 + 1;
        this.lastRet = i9;
        return nodeArr[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: previous()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.ListIterator
    public Node previous() {
        if (!hasPrevious()) {
            C0353j.m1307e();
            return null;
        }
        Node[] nodeArr = this.children;
        int i9 = this.cursor - 1;
        this.cursor = i9;
        this.lastRet = i9;
        return nodeArr[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.cursor - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        int i9 = this.lastRet;
        if (i9 < 0) {
            throw new IllegalStateException();
        }
        this.cursor = i9;
        Node[] nodeArr = this.children;
        int length = nodeArr.length - 1;
        Node[] nodeArr2 = new Node[length];
        System.arraycopy(nodeArr, 0, nodeArr2, 0, i9);
        Node[] nodeArr3 = this.children;
        int i10 = this.cursor;
        System.arraycopy(nodeArr3, i10 + 1, nodeArr2, i10, length - i10);
        this.children = nodeArr2;
        this.lastRet = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;)V */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.ListIterator
    public void set(Node node) {
        int i9 = this.lastRet;
        if (i9 < 0) {
            throw new IllegalStateException();
        }
        this.children[i9] = node;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Node
    public void setSourceFile(String str) {
        this.sourceFile = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Node
    public String toString(String str) {
        return str + toString();
    }

    public String toString() {
        return ParserTreeConstants.jjtNodeName[this.f988id];
    }

    @Override // bsh.Node
    public void jjtClose() {
    }

    @Override // bsh.Node
    public void jjtOpen() {
    }
}
