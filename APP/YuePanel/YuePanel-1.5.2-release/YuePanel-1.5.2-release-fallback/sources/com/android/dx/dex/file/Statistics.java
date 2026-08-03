package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class Statistics {
    private final java.util.HashMap<java.lang.String, com.android.dx.dex.file.Statistics.Data> dataMap;

    public static class Data {
        private int count;
        private int largestSize;
        private final java.lang.String name;
        private int smallestSize;
        private int totalSize;

        public Data(com.android.dx.dex.file.Item r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                int r1 = r1.writeSize()
                r0.name = r2
                r2 = 1
                r0.count = r2
                r0.totalSize = r1
                r0.largestSize = r1
                r0.smallestSize = r1
                return
        }

        public static /* synthetic */ java.lang.String access$000(com.android.dx.dex.file.Statistics.Data r0) {
                java.lang.String r0 = r0.name
                return r0
        }

        public void add(com.android.dx.dex.file.Item r2) {
                r1 = this;
                int r2 = r2.writeSize()
                int r0 = r1.count
                int r0 = r0 + 1
                r1.count = r0
                int r0 = r1.totalSize
                int r0 = r0 + r2
                r1.totalSize = r0
                int r0 = r1.largestSize
                if (r2 <= r0) goto L15
                r1.largestSize = r2
            L15:
                int r0 = r1.smallestSize
                if (r2 >= r0) goto L1b
                r1.smallestSize = r2
            L1b:
                return
        }

        public java.lang.String toHuman() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "  "
                r1.append(r2)
                java.lang.String r2 = r4.name
                r1.append(r2)
                java.lang.String r2 = ": "
                r1.append(r2)
                int r2 = r4.count
                r1.append(r2)
                java.lang.String r2 = " item"
                r1.append(r2)
                int r2 = r4.count
                r3 = 1
                if (r2 != r3) goto L2b
                java.lang.String r2 = ""
                goto L2d
            L2b:
                java.lang.String r2 = "s"
            L2d:
                r1.append(r2)
                java.lang.String r2 = "; "
                r1.append(r2)
                int r2 = r4.totalSize
                r1.append(r2)
                java.lang.String r2 = " bytes total\n"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = r4.smallestSize
                int r2 = r4.largestSize
                java.lang.String r3 = "    "
                if (r1 != r2) goto L68
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                int r2 = r4.smallestSize
                r1.append(r2)
                java.lang.String r2 = " bytes/item\n"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                goto L98
            L68:
                int r1 = r4.totalSize
                int r2 = r4.count
                int r1 = r1 / r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r3)
                int r3 = r4.smallestSize
                r2.append(r3)
                java.lang.String r3 = ".."
                r2.append(r3)
                int r3 = r4.largestSize
                r2.append(r3)
                java.lang.String r3 = " bytes/item; average "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = "\n"
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.append(r1)
            L98:
                java.lang.String r0 = r0.toString()
                return r0
        }

        public void writeAnnotation(com.android.dx.util.AnnotatedOutput r2) {
                r1 = this;
                java.lang.String r0 = r1.toHuman()
                r2.annotate(r0)
                return
        }
    }

    public Statistics() {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 50
            r0.<init>(r1)
            r2.dataMap = r0
            return
    }

    public void add(com.android.dx.dex.file.Item r4) {
            r3 = this;
            java.lang.String r0 = r4.typeName()
            java.util.HashMap<java.lang.String, com.android.dx.dex.file.Statistics$Data> r1 = r3.dataMap
            java.lang.Object r1 = r1.get(r0)
            com.android.dx.dex.file.Statistics$Data r1 = (com.android.dx.dex.file.Statistics.Data) r1
            if (r1 != 0) goto L19
            java.util.HashMap<java.lang.String, com.android.dx.dex.file.Statistics$Data> r1 = r3.dataMap
            com.android.dx.dex.file.Statistics$Data r2 = new com.android.dx.dex.file.Statistics$Data
            r2.<init>(r4, r0)
            r1.put(r0, r2)
            goto L1c
        L19:
            r1.add(r4)
        L1c:
            return
    }

    public void addAll(com.android.dx.dex.file.Section r2) {
            r1 = this;
            java.util.Collection r2 = r2.items()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            com.android.dx.dex.file.Item r0 = (com.android.dx.dex.file.Item) r0
            r1.add(r0)
            goto L8
        L18:
            return
    }

    public java.lang.String toHuman() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Statistics:\n"
            r0.append(r1)
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            java.util.HashMap<java.lang.String, com.android.dx.dex.file.Statistics$Data> r2 = r5.dataMap
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()
            com.android.dx.dex.file.Statistics$Data r3 = (com.android.dx.dex.file.Statistics.Data) r3
            java.lang.String r4 = com.android.dx.dex.file.Statistics.Data.access$000(r3)
            r1.put(r4, r3)
            goto L19
        L2d:
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()
            com.android.dx.dex.file.Statistics$Data r2 = (com.android.dx.dex.file.Statistics.Data) r2
            java.lang.String r2 = r2.toHuman()
            r0.append(r2)
            goto L35
        L49:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void writeAnnotation(com.android.dx.util.AnnotatedOutput r5) {
            r4 = this;
            java.util.HashMap<java.lang.String, com.android.dx.dex.file.Statistics$Data> r0 = r4.dataMap
            int r0 = r0.size()
            if (r0 != 0) goto L9
            return
        L9:
            r0 = 0
            java.lang.String r1 = "\nstatistics:\n"
            r5.annotate(r0, r1)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.util.HashMap<java.lang.String, com.android.dx.dex.file.Statistics$Data> r1 = r4.dataMap
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            com.android.dx.dex.file.Statistics$Data r2 = (com.android.dx.dex.file.Statistics.Data) r2
            java.lang.String r3 = com.android.dx.dex.file.Statistics.Data.access$000(r2)
            r0.put(r3, r2)
            goto L1e
        L32:
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            com.android.dx.dex.file.Statistics$Data r1 = (com.android.dx.dex.file.Statistics.Data) r1
            r1.writeAnnotation(r5)
            goto L3a
        L4a:
            return
    }
}
