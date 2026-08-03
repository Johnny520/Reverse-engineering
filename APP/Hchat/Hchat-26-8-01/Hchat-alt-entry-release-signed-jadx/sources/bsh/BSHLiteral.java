package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class BSHLiteral extends SimpleNode {
    public static volatile boolean internStrings = true;
    private static final long serialVersionUID = 1;
    public Object value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHLiteral(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private char getEscapeChar(char c10) {
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 != 't') {
            return c10;
        }
        return '\t';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void add(Node node) {
        super.add(node);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void charSetup(String str) {
        int length = str.toCharArray().length;
        if (length == 0 || length > 4 || (length > 1 && str.charAt(0) != '\\')) {
            stringSetup(str);
            return;
        }
        try {
            char cCharAt = str.charAt(0);
            if (cCharAt == '\\') {
                char cCharAt2 = str.charAt(1);
                if (Character.isDigit(cCharAt2)) {
                    cCharAt = (char) Integer.parseInt(str.substring(1), 8);
                    if (255 < cCharAt) {
                        stringSetup(str);
                        return;
                    }
                } else {
                    cCharAt = getEscapeChar(cCharAt2);
                }
            }
            this.value = new Primitive(cCharAt);
        } catch (Exception unused) {
            stringSetup(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void dump(String str) {
        super.dump(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) {
        return this.value;
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
    public void stringSetup(String str) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            char cCharAt = str.charAt(i9);
            if (cCharAt == '\\') {
                int i10 = i9 + 1;
                char cCharAt2 = str.charAt(i10);
                if (!Character.isDigit(cCharAt2) || Integer.parseInt(String.valueOf(cCharAt2)) >= 8) {
                    cCharAt = getEscapeChar(cCharAt2);
                    i9 = i10;
                } else {
                    int iMin = Math.min(i9 + 3, length - 1);
                    int i11 = i10;
                    while (i11 < iMin) {
                        int i12 = i11 + 1;
                        char cCharAt3 = str.charAt(i12);
                        if (!Character.isDigit(cCharAt3) || Integer.parseInt(String.valueOf(cCharAt3)) >= 8) {
                            break;
                        } else {
                            i11 = i12;
                        }
                    }
                    String strSubstring = str.substring(i10, i11 + 1);
                    if (strSubstring.length() != 3 || Integer.parseInt(String.valueOf(cCharAt2)) <= 3) {
                        cCharAt = (char) Integer.parseInt(strSubstring, 8);
                        i9 = i11;
                    } else {
                        i9 = i11 - 1;
                        cCharAt = (char) Integer.parseInt(str.substring(i10, i11), 8);
                    }
                }
            }
            sb2.append(cCharAt);
            i9++;
        }
        String string = sb2.toString();
        if (internStrings) {
            string = string.intern();
        }
        this.value = string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.value;
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ String toString(String str) {
        return super.toString(str);
    }
}
