package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class NodeReader {
    private final org.simpleframework.xml.stream.EventReader reader;
    private final org.simpleframework.xml.stream.InputStack stack;
    private final java.lang.StringBuilder text;

    public NodeReader(org.simpleframework.xml.stream.EventReader r2) {
            r1 = this;
            r1.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.text = r0
            org.simpleframework.xml.stream.InputStack r0 = new org.simpleframework.xml.stream.InputStack
            r0.<init>()
            r1.stack = r0
            r1.reader = r2
            return
    }

    private void fillText(org.simpleframework.xml.stream.InputNode r2) {
            r1 = this;
            org.simpleframework.xml.stream.EventReader r2 = r1.reader
            org.simpleframework.xml.stream.EventNode r2 = r2.peek()
            boolean r0 = r2.isText()
            if (r0 == 0) goto L15
            java.lang.String r2 = r2.getValue()
            java.lang.StringBuilder r1 = r1.text
            r1.append(r2)
        L15:
            return
    }

    private boolean isName(org.simpleframework.xml.stream.EventNode r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r0 = r1.getName()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            boolean r0 = r0.equals(r2)
            return r0
    }

    private java.lang.String readBuffer(org.simpleframework.xml.stream.InputNode r2) {
            r1 = this;
            java.lang.StringBuilder r2 = r1.text
            int r2 = r2.length()
            if (r2 <= 0) goto L15
            java.lang.StringBuilder r2 = r1.text
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = r1.text
            r0 = 0
            r1.setLength(r0)
            return r2
        L15:
            r1 = 0
            return r1
    }

    private org.simpleframework.xml.stream.InputNode readStart(org.simpleframework.xml.stream.InputNode r3, org.simpleframework.xml.stream.EventNode r4) {
            r2 = this;
            org.simpleframework.xml.stream.InputElement r0 = new org.simpleframework.xml.stream.InputElement
            r0.<init>(r3, r2, r4)
            java.lang.StringBuilder r3 = r2.text
            int r3 = r3.length()
            if (r3 <= 0) goto L13
            java.lang.StringBuilder r3 = r2.text
            r1 = 0
            r3.setLength(r1)
        L13:
            boolean r3 = r4.isStart()
            if (r3 == 0) goto L22
            org.simpleframework.xml.stream.InputStack r2 = r2.stack
            java.lang.Object r2 = r2.push(r0)
            org.simpleframework.xml.stream.InputNode r2 = (org.simpleframework.xml.stream.InputNode) r2
            return r2
        L22:
            return r0
    }

    private java.lang.String readText(org.simpleframework.xml.stream.InputNode r3) {
            r2 = this;
            org.simpleframework.xml.stream.EventReader r0 = r2.reader
            org.simpleframework.xml.stream.EventNode r0 = r0.peek()
        L6:
            org.simpleframework.xml.stream.InputStack r1 = r2.stack
            java.lang.Object r1 = r1.top()
            if (r1 != r3) goto L23
            boolean r0 = r0.isText()
            if (r0 == 0) goto L23
            r2.fillText(r3)
            org.simpleframework.xml.stream.EventReader r0 = r2.reader
            r0.next()
            org.simpleframework.xml.stream.EventReader r0 = r2.reader
            org.simpleframework.xml.stream.EventNode r0 = r0.peek()
            goto L6
        L23:
            java.lang.String r2 = r2.readBuffer(r3)
            return r2
    }

    public boolean isEmpty(org.simpleframework.xml.stream.InputNode r2) {
            r1 = this;
            org.simpleframework.xml.stream.InputStack r0 = r1.stack
            java.lang.Object r0 = r0.top()
            if (r0 != r2) goto L16
            org.simpleframework.xml.stream.EventReader r1 = r1.reader
            org.simpleframework.xml.stream.EventNode r1 = r1.peek()
            boolean r1 = r1.isEnd()
            if (r1 == 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public boolean isRoot(org.simpleframework.xml.stream.InputNode r1) {
            r0 = this;
            org.simpleframework.xml.stream.InputStack r0 = r0.stack
            java.lang.Object r0 = r0.bottom()
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public org.simpleframework.xml.stream.InputNode readElement(org.simpleframework.xml.stream.InputNode r4) {
            r3 = this;
            org.simpleframework.xml.stream.InputStack r0 = r3.stack
            boolean r0 = r0.isRelevant(r4)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            org.simpleframework.xml.stream.EventReader r0 = r3.reader
            org.simpleframework.xml.stream.EventNode r0 = r0.next()
        L10:
            if (r0 == 0) goto L33
            boolean r2 = r0.isEnd()
            if (r2 == 0) goto L21
            org.simpleframework.xml.stream.InputStack r0 = r3.stack
            java.lang.Object r0 = r0.pop()
            if (r0 != r4) goto L2c
            return r1
        L21:
            boolean r2 = r0.isStart()
            if (r2 == 0) goto L2c
            org.simpleframework.xml.stream.InputNode r3 = r3.readStart(r4, r0)
            return r3
        L2c:
            org.simpleframework.xml.stream.EventReader r0 = r3.reader
            org.simpleframework.xml.stream.EventNode r0 = r0.next()
            goto L10
        L33:
            return r1
    }

    public org.simpleframework.xml.stream.InputNode readElement(org.simpleframework.xml.stream.InputNode r4, java.lang.String r5) {
            r3 = this;
            org.simpleframework.xml.stream.InputStack r0 = r3.stack
            boolean r0 = r0.isRelevant(r4)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            org.simpleframework.xml.stream.EventReader r0 = r3.reader
            org.simpleframework.xml.stream.EventNode r0 = r0.peek()
        L10:
            if (r0 == 0) goto L4e
            boolean r2 = r0.isText()
            if (r2 == 0) goto L1c
            r3.fillText(r4)
            goto L42
        L1c:
            boolean r2 = r0.isEnd()
            if (r2 == 0) goto L31
            org.simpleframework.xml.stream.InputStack r0 = r3.stack
            java.lang.Object r0 = r0.top()
            if (r0 != r4) goto L2b
            return r1
        L2b:
            org.simpleframework.xml.stream.InputStack r0 = r3.stack
            r0.pop()
            goto L42
        L31:
            boolean r2 = r0.isStart()
            if (r2 == 0) goto L42
            boolean r5 = r3.isName(r0, r5)
            if (r5 == 0) goto L4e
            org.simpleframework.xml.stream.InputNode r3 = r3.readElement(r4)
            return r3
        L42:
            org.simpleframework.xml.stream.EventReader r0 = r3.reader
            r0.next()
            org.simpleframework.xml.stream.EventReader r0 = r3.reader
            org.simpleframework.xml.stream.EventNode r0 = r0.peek()
            goto L10
        L4e:
            return r1
    }

    public org.simpleframework.xml.stream.InputNode readRoot() {
            r2 = this;
            org.simpleframework.xml.stream.InputStack r0 = r2.stack
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L18
            org.simpleframework.xml.stream.InputNode r2 = r2.readElement(r1)
            if (r2 == 0) goto L10
            return r2
        L10:
            org.simpleframework.xml.stream.NodeException r2 = new org.simpleframework.xml.stream.NodeException
            java.lang.String r0 = "Document has no root element"
            r2.<init>(r0)
            throw r2
        L18:
            return r1
    }

    public java.lang.String readValue(org.simpleframework.xml.stream.InputNode r3) {
            r2 = this;
            org.simpleframework.xml.stream.InputStack r0 = r2.stack
            boolean r0 = r0.isRelevant(r3)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.StringBuilder r0 = r2.text
            int r0 = r0.length()
            if (r0 > 0) goto L31
            org.simpleframework.xml.stream.EventReader r0 = r2.reader
            org.simpleframework.xml.stream.EventNode r0 = r0.peek()
            boolean r0 = r0.isEnd()
            if (r0 == 0) goto L31
            org.simpleframework.xml.stream.InputStack r0 = r2.stack
            java.lang.Object r0 = r0.top()
            if (r0 != r3) goto L27
            return r1
        L27:
            org.simpleframework.xml.stream.InputStack r0 = r2.stack
            r0.pop()
            org.simpleframework.xml.stream.EventReader r0 = r2.reader
            r0.next()
        L31:
            java.lang.String r2 = r2.readText(r3)
            return r2
    }

    public void skipElement(org.simpleframework.xml.stream.InputNode r2) {
            r1 = this;
        L0:
            org.simpleframework.xml.stream.InputNode r0 = r1.readElement(r2)
            if (r0 == 0) goto L7
            goto L0
        L7:
            return
    }
}
