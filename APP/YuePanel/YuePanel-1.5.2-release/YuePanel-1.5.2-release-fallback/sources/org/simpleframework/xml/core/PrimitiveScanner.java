package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class PrimitiveScanner implements org.simpleframework.xml.core.Scanner {
    private final org.simpleframework.xml.core.Detail detail;
    private final org.simpleframework.xml.core.Section section;

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
                r1 = 0
                return r1
        }

        @Override // org.simpleframework.xml.core.Section
        public org.simpleframework.xml.core.LabelMap getAttributes() {
                r2 = this;
                org.simpleframework.xml.core.LabelMap r0 = new org.simpleframework.xml.core.LabelMap
                org.simpleframework.xml.core.Scanner r1 = r2.scanner
                r0.<init>(r1)
                return r0
        }

        @Override // org.simpleframework.xml.core.Section
        public org.simpleframework.xml.core.Label getElement(java.lang.String r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // org.simpleframework.xml.core.Section
        public org.simpleframework.xml.core.LabelMap getElements() {
                r2 = this;
                org.simpleframework.xml.core.LabelMap r0 = new org.simpleframework.xml.core.LabelMap
                org.simpleframework.xml.core.Scanner r1 = r2.scanner
                r0.<init>(r1)
                return r0
        }

        @Override // org.simpleframework.xml.core.Section
        public java.lang.String getName() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // org.simpleframework.xml.core.Section
        public java.lang.String getPath(java.lang.String r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // org.simpleframework.xml.core.Section
        public java.lang.String getPrefix() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // org.simpleframework.xml.core.Section
        public org.simpleframework.xml.core.Section getSection(java.lang.String r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // org.simpleframework.xml.core.Section
        public org.simpleframework.xml.core.Label getText() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // org.simpleframework.xml.core.Section
        public boolean isSection(java.lang.String r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<java.lang.String> iterator() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.list
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
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getComplete() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Decorator getDecorator() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Instantiator getInstantiator() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public java.lang.String getName() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.Order getOrder() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.ParameterMap getParameters() {
            r1 = this;
            org.simpleframework.xml.core.ParameterMap r0 = new org.simpleframework.xml.core.ParameterMap
            r0.<init>()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getPersist() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getReplace() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getResolve() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.Version getRevision() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Section getSection() {
            r1 = this;
            org.simpleframework.xml.core.Section r0 = r1.section
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Signature getSignature() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public java.util.List<org.simpleframework.xml.core.Signature> getSignatures() {
            r1 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Label getText() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public java.lang.Class getType() {
            r1 = this;
            org.simpleframework.xml.core.Detail r0 = r1.detail
            java.lang.Class r0 = r0.getType()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getValidate() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Label getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public boolean isPrimitive() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner, org.simpleframework.xml.core.Policy
    public boolean isStrict() {
            r1 = this;
            r0 = 1
            return r0
    }
}
