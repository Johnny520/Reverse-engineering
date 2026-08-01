package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class PrimitiveScanner implements org.simpleframework.xml.core.Scanner {
    private final org.simpleframework.xml.core.Detail detail;
    private final org.simpleframework.xml.core.Section section;

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static class EmptySection implements org.simpleframework.xml.core.Section {
        private final java.util.List<java.lang.String> list;
        private final org.simpleframework.xml.core.Scanner scanner;

        public EmptySection(org.simpleframework.xml.core.Scanner r2) {
                r1 = this;
                r1.<init>()
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                r1.list = r0
                r1.scanner = r2
                return
        }

        @Override // org.simpleframework.xml.core.Section
        public java.lang.String getAttribute(java.lang.String r1) {
                r0 = this;
                r0 = 0
                return r0
        }

        @Override // org.simpleframework.xml.core.Section
        public org.simpleframework.xml.core.LabelMap getAttributes() {
                r1 = this;
                org.simpleframework.xml.core.LabelMap r0 = new org.simpleframework.xml.core.LabelMap
                org.simpleframework.xml.core.Scanner r1 = r1.scanner
                r0.<init>(r1)
                return r0
        }

        @Override // org.simpleframework.xml.core.Section
        public org.simpleframework.xml.core.Label getElement(java.lang.String r1) {
                r0 = this;
                r0 = 0
                return r0
        }

        @Override // org.simpleframework.xml.core.Section
        public org.simpleframework.xml.core.LabelMap getElements() {
                r1 = this;
                org.simpleframework.xml.core.LabelMap r0 = new org.simpleframework.xml.core.LabelMap
                org.simpleframework.xml.core.Scanner r1 = r1.scanner
                r0.<init>(r1)
                return r0
        }

        @Override // org.simpleframework.xml.core.Section
        public java.lang.String getName() {
                r0 = this;
                r0 = 0
                return r0
        }

        @Override // org.simpleframework.xml.core.Section
        public java.lang.String getPath(java.lang.String r1) {
                r0 = this;
                r0 = 0
                return r0
        }

        @Override // org.simpleframework.xml.core.Section
        public java.lang.String getPrefix() {
                r0 = this;
                r0 = 0
                return r0
        }

        @Override // org.simpleframework.xml.core.Section
        public org.simpleframework.xml.core.Section getSection(java.lang.String r1) {
                r0 = this;
                r0 = 0
                return r0
        }

        @Override // org.simpleframework.xml.core.Section
        public org.simpleframework.xml.core.Label getText() {
                r0 = this;
                r0 = 0
                return r0
        }

        @Override // org.simpleframework.xml.core.Section
        public boolean isSection(java.lang.String r1) {
                r0 = this;
                r0 = 0
                return r0
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<java.lang.String> iterator() {
                r0 = this;
                java.util.List<java.lang.String> r0 = r0.list
                java.util.Iterator r0 = r0.iterator()
                return r0
        }
    }

    public PrimitiveScanner(org.simpleframework.xml.core.Detail r2) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.PrimitiveScanner$EmptySection r0 = new org.simpleframework.xml.core.PrimitiveScanner$EmptySection
            r0.<init>(r1)
            r1.section = r0
            r1.detail = r2
            return
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Caller getCaller(org.simpleframework.xml.core.Context r2) {
            r1 = this;
            org.simpleframework.xml.core.Caller r0 = new org.simpleframework.xml.core.Caller
            r0.<init>(r1, r2)
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getCommit() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getComplete() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Decorator getDecorator() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Instantiator getInstantiator() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public java.lang.String getName() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.Order getOrder() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.ParameterMap getParameters() {
            r0 = this;
            org.simpleframework.xml.core.ParameterMap r0 = new org.simpleframework.xml.core.ParameterMap
            r0.<init>()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getPersist() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getReplace() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getResolve() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.Version getRevision() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Section getSection() {
            r0 = this;
            org.simpleframework.xml.core.Section r0 = r0.section
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Signature getSignature() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public java.util.List<org.simpleframework.xml.core.Signature> getSignatures() {
            r0 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Label getText() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public java.lang.Class getType() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            java.lang.Class r0 = r0.getType()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getValidate() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Label getVersion() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public boolean isEmpty() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public boolean isPrimitive() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner, org.simpleframework.xml.core.Policy
    public boolean isStrict() {
            r0 = this;
            r0 = 1
            return r0
    }
}
