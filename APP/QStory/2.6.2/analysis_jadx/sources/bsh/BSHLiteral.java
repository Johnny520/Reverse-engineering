package bsh;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class BSHLiteral extends SimpleNode {
    public static volatile boolean internStrings = true;
    public Object value;

    public BSHLiteral(int i) {
        super(i);
    }

    private char getEscapeChar(char c) {
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c != 't') {
            return c;
        }
        return '\t';
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void add(InterfaceC2618 interfaceC2618) {
        super.add(interfaceC2618);
    }

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

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public /* bridge */ /* synthetic */ void dump(String str) {
        super.dump(str);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) {
        return this.value;
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ int getId() {
        return super.getId();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public /* bridge */ /* synthetic */ int getLineNumber() {
        return super.getLineNumber();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public /* bridge */ /* synthetic */ String getSourceFile() {
        return super.getSourceFile();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public /* bridge */ /* synthetic */ String getText() {
        return super.getText();
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

    public void stringSetup(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                int i2 = i + 1;
                char cCharAt2 = str.charAt(i2);
                if (!Character.isDigit(cCharAt2) || Integer.parseInt(String.valueOf(cCharAt2)) >= 8) {
                    cCharAt = getEscapeChar(cCharAt2);
                    i = i2;
                } else {
                    int iMin = Math.min(i + 3, length - 1);
                    int i3 = i2;
                    while (i3 < iMin) {
                        int i4 = i3 + 1;
                        char cCharAt3 = str.charAt(i4);
                        if (!Character.isDigit(cCharAt3) || Integer.parseInt(String.valueOf(cCharAt3)) >= 8) {
                            break;
                        } else {
                            i3 = i4;
                        }
                    }
                    String strSubstring = str.substring(i2, i3 + 1);
                    if (strSubstring.length() != 3 || Integer.parseInt(String.valueOf(cCharAt2)) <= 3) {
                        cCharAt = (char) Integer.parseInt(strSubstring, 8);
                        i = i3;
                    } else {
                        i = i3 - 1;
                        cCharAt = (char) Integer.parseInt(str.substring(i2, i3), 8);
                    }
                }
            }
            sb.append(cCharAt);
            i++;
        }
        String string = sb.toString();
        if (internStrings) {
            string = string.intern();
        }
        this.value = string;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.value;
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ String toString(String str) {
        return super.toString(str);
    }
}
