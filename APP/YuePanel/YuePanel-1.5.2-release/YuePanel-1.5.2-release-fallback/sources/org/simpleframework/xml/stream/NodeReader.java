package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
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

    private void fillText(org.simpleframework.xml.stream.InputNode r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.stream.EventReader r2 = r1.reader
            org.simpleframework.xml.stream.EventNode r2 = r2.peek()
            boolean r0 = r2.isText()
            if (r0 == 0) goto L15
            java.lang.String r2 = r2.getValue()
            java.lang.StringBuilder r0 = r1.text
            r0.append(r2)
        L15:
            return
    }

    private boolean isName(org.simpleframework.xml.stream.EventNode r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r1 = r1.getName()
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r1 = r1.equals(r2)
            return r1
    }

    private java.lang.String readBuffer(org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
            r2 = this;
            java.lang.StringBuilder r3 = r2.text
            int r3 = r3.length()
            if (r3 <= 0) goto L15
            java.lang.StringBuilder r3 = r2.text
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r0 = r2.text
            r1 = 0
            r0.setLength(r1)
            return r3
        L15:
            r3 = 0
            return r3
    }

    private org.simpleframework.xml.stream.InputNode readStart(org.simpleframework.xml.stream.InputNode r3, org.simpleframework.xml.stream.EventNode r4) throws java.lang.Exception {
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
            org.simpleframework.xml.stream.InputStack r3 = r2.stack
            java.lang.Object r3 = r3.push(r0)
            org.simpleframework.xml.stream.InputNode r3 = (org.simpleframework.xml.stream.InputNode) r3
            return r3
        L22:
            return r0
    }

    private java.lang.String readText(org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
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
            java.lang.String r3 = r2.readBuffer(r3)
            return r3
    }

    public boolean isEmpty(org.simpleframework.xml.stream.InputNode r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.stream.InputStack r0 = r1.stack
            java.lang.Object r0 = r0.top()
            if (r0 != r2) goto L16
            org.simpleframework.xml.stream.EventReader r2 = r1.reader
            org.simpleframework.xml.stream.EventNode r2 = r2.peek()
            boolean r2 = r2.isEnd()
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public boolean isRoot(org.simpleframework.xml.stream.InputNode r2) {
            r1 = this;
            org.simpleframework.xml.stream.InputStack r0 = r1.stack
            java.lang.Object r0 = r0.bottom()
            if (r0 != r2) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    public org.simpleframework.xml.stream.InputNode readElement(org.simpleframework.xml.stream.InputNode r4) throws java.lang.Exception {
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
            org.simpleframework.xml.stream.InputNode r4 = r3.readStart(r4, r0)
            return r4
        L2c:
            org.simpleframework.xml.stream.EventReader r0 = r3.reader
            org.simpleframework.xml.stream.EventNode r0 = r0.next()
            goto L10
        L33:
            return r1
    }

    public org.simpleframework.xml.stream.InputNode readElement(org.simpleframework.xml.stream.InputNode r4, java.lang.String r5) throws java.lang.Exception {
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
            org.simpleframework.xml.stream.InputNode r4 = r3.readElement(r4)
            return r4
        L42:
            org.simpleframework.xml.stream.EventReader r0 = r3.reader
            r0.next()
            org.simpleframework.xml.stream.EventReader r0 = r3.reader
            org.simpleframework.xml.stream.EventNode r0 = r0.peek()
            goto L10
        L4e:
            return r1
    }

    public org.simpleframework.xml.stream.InputNode readRoot() throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.stream.InputStack r0 = r2.stack
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L18
            org.simpleframework.xml.stream.InputNode r0 = r2.readElement(r1)
            if (r0 == 0) goto L10
            return r0
        L10:
            org.simpleframework.xml.stream.NodeException r0 = new org.simpleframework.xml.stream.NodeException
            java.lang.String r1 = "Document has no root element"
            r0.<init>(r1)
            throw r0
        L18:
            return r1
    }

    public java.lang.String readValue(org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
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
            java.lang.String r3 = r2.readText(r3)
            return r3
    }

    public void skipElement(org.simpleframework.xml.stream.InputNode r2) throws java.lang.Exception {
            r1 = this;
        L0:
            org.simpleframework.xml.stream.InputNode r0 = r1.readElement(r2)
            if (r0 == 0) goto L7
            goto L0
        L7:
            return
    }
}
