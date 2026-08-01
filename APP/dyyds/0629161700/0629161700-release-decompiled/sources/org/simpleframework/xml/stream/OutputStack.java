package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class OutputStack extends java.util.ArrayList<org.simpleframework.xml.stream.OutputNode> {
    private final java.util.Set active;

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
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
                r0 = this;
                int r0 = r0.cursor
                if (r0 <= 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ org.simpleframework.xml.stream.OutputNode next() {
                r0 = this;
                org.simpleframework.xml.stream.OutputNode r0 = r0.next2()
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
                java.lang.Object r2 = r0.get(r1)
                org.simpleframework.xml.stream.OutputNode r2 = (org.simpleframework.xml.stream.OutputNode) r2
                return r2
            L15:
                r2 = 0
                return r2
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                org.simpleframework.xml.stream.OutputStack r0 = r1.this$0
                int r1 = r1.cursor
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
            r1 = 0
            return r1
        L8:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            org.simpleframework.xml.stream.OutputNode r1 = (org.simpleframework.xml.stream.OutputNode) r1
            return r1
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
            r1 = 0
            return r1
        L8:
            int r0 = r0 + (-1)
            org.simpleframework.xml.stream.OutputNode r1 = r1.purge(r0)
            return r1
    }

    public org.simpleframework.xml.stream.OutputNode purge(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.remove(r1)
            org.simpleframework.xml.stream.OutputNode r1 = (org.simpleframework.xml.stream.OutputNode) r1
            if (r1 == 0) goto Ld
            java.util.Set r0 = r0.active
            r0.remove(r1)
        Ld:
            return r1
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
            r1 = 0
            return r1
        L8:
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            org.simpleframework.xml.stream.OutputNode r1 = (org.simpleframework.xml.stream.OutputNode) r1
            return r1
    }
}
