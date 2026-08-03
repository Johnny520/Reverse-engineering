package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class OutputStack extends java.util.ArrayList<org.simpleframework.xml.stream.OutputNode> {
    private final java.util.Set active;

    public class Sequence implements java.util.Iterator<org.simpleframework.xml.stream.OutputNode> {
        private int cursor;
        final /* synthetic */ org.simpleframework.xml.stream.OutputStack this$0;

        public Sequence(org.simpleframework.xml.stream.OutputStack r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                int r1 = r1.size()
                r0.cursor = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                int r0 = r1.cursor
                if (r0 <= 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ org.simpleframework.xml.stream.OutputNode next() {
                r1 = this;
                org.simpleframework.xml.stream.OutputNode r0 = r1.next2()
                return r0
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
        public org.simpleframework.xml.stream.OutputNode next2() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L15
                org.simpleframework.xml.stream.OutputStack r0 = r2.this$0
                int r1 = r2.cursor
                int r1 = r1 + (-1)
                r2.cursor = r1
                java.lang.Object r0 = r0.get(r1)
                org.simpleframework.xml.stream.OutputNode r0 = (org.simpleframework.xml.stream.OutputNode) r0
                return r0
            L15:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                org.simpleframework.xml.stream.OutputStack r0 = r2.this$0
                int r1 = r2.cursor
                r0.purge(r1)
                return
        }
    }

    public OutputStack(java.util.Set r1) {
            r0 = this;
            r0.<init>()
            r0.active = r1
            return
    }

    public org.simpleframework.xml.stream.OutputNode bottom() {
            r1 = this;
            int r0 = r1.size()
            if (r0 > 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            org.simpleframework.xml.stream.OutputNode r0 = (org.simpleframework.xml.stream.OutputNode) r0
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<org.simpleframework.xml.stream.OutputNode> iterator() {
            r1 = this;
            org.simpleframework.xml.stream.OutputStack$Sequence r0 = new org.simpleframework.xml.stream.OutputStack$Sequence
            r0.<init>(r1)
            return r0
    }

    public org.simpleframework.xml.stream.OutputNode pop() {
            r1 = this;
            int r0 = r1.size()
            if (r0 > 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 + (-1)
            org.simpleframework.xml.stream.OutputNode r0 = r1.purge(r0)
            return r0
    }

    public org.simpleframework.xml.stream.OutputNode purge(int r2) {
            r1 = this;
            java.lang.Object r2 = r1.remove(r2)
            org.simpleframework.xml.stream.OutputNode r2 = (org.simpleframework.xml.stream.OutputNode) r2
            if (r2 == 0) goto Ld
            java.util.Set r0 = r1.active
            r0.remove(r2)
        Ld:
            return r2
    }

    public org.simpleframework.xml.stream.OutputNode push(org.simpleframework.xml.stream.OutputNode r2) {
            r1 = this;
            java.util.Set r0 = r1.active
            r0.add(r2)
            r1.add(r2)
            return r2
    }

    public org.simpleframework.xml.stream.OutputNode top() {
            r1 = this;
            int r0 = r1.size()
            if (r0 > 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.get(r0)
            org.simpleframework.xml.stream.OutputNode r0 = (org.simpleframework.xml.stream.OutputNode) r0
            return r0
    }
}
