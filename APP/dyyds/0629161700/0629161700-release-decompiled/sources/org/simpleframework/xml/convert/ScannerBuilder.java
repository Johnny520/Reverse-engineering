package org.simpleframework.xml.convert;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ScannerBuilder extends org.simpleframework.xml.util.ConcurrentCache<org.simpleframework.xml.convert.Scanner> {

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static class Entry extends org.simpleframework.xml.util.ConcurrentCache<java.lang.annotation.Annotation> implements org.simpleframework.xml.convert.Scanner {
        private final java.lang.Class root;

        public Entry(java.lang.Class r1) {
                r0 = this;
                r0.<init>()
                r0.root = r1
                return
        }

        private <T extends java.lang.annotation.Annotation> T find(java.lang.Class<T> r2) {
                r1 = this;
                java.lang.Class r1 = r1.root
            L2:
                if (r1 == 0) goto L10
                java.lang.annotation.Annotation r0 = r1.getAnnotation(r2)
                if (r0 == 0) goto Lb
                return r0
            Lb:
                java.lang.Class r1 = r1.getSuperclass()
                goto L2
            L10:
                r1 = 0
                return r1
        }

        @Override // org.simpleframework.xml.convert.Scanner
        public <T extends java.lang.annotation.Annotation> T scan(java.lang.Class<T> r2) {
                r1 = this;
                boolean r0 = r1.contains(r2)
                if (r0 != 0) goto L11
                java.lang.annotation.Annotation r0 = r1.find(r2)
                if (r2 == 0) goto L11
                if (r0 == 0) goto L11
                r1.put(r2, r0)
            L11:
                java.lang.Object r1 = r1.get(r2)
                java.lang.annotation.Annotation r1 = (java.lang.annotation.Annotation) r1
                return r1
        }
    }

    public ScannerBuilder() {
            r0 = this;
            r0.<init>()
            return
    }

    public org.simpleframework.xml.convert.Scanner build(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Object r0 = r1.get(r2)
            org.simpleframework.xml.convert.Scanner r0 = (org.simpleframework.xml.convert.Scanner) r0
            if (r0 != 0) goto L10
            org.simpleframework.xml.convert.ScannerBuilder$Entry r0 = new org.simpleframework.xml.convert.ScannerBuilder$Entry
            r0.<init>(r2)
            r1.put(r2, r0)
        L10:
            return r0
    }
}
