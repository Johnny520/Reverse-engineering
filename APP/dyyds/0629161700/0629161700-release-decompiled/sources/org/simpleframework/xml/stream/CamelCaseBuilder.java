package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class CamelCaseBuilder implements org.simpleframework.xml.stream.Style {
    protected final boolean attribute;
    protected final boolean element;

    /* JADX INFO: renamed from: org.simpleframework.xml.stream.CamelCaseBuilder$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public class Attribute extends org.simpleframework.xml.stream.Splitter {
        private boolean capital;
        final /* synthetic */ org.simpleframework.xml.stream.CamelCaseBuilder this$0;

        private Attribute(org.simpleframework.xml.stream.CamelCaseBuilder r1, java.lang.String r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        public /* synthetic */ Attribute(org.simpleframework.xml.stream.CamelCaseBuilder r1, java.lang.String r2, org.simpleframework.xml.stream.CamelCaseBuilder.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void commit(char[] r1, int r2, int r3) {
                r0 = this;
                java.lang.StringBuilder r0 = r0.builder
                r0.append(r1, r2, r3)
                return
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void parse(char[] r1, int r2, int r3) {
                r0 = this;
                org.simpleframework.xml.stream.CamelCaseBuilder r3 = r0.this$0
                boolean r3 = r3.attribute
                if (r3 != 0) goto La
                boolean r3 = r0.capital
                if (r3 == 0) goto L12
            La:
                char r3 = r1[r2]
                char r3 = r0.toUpper(r3)
                r1[r2] = r3
            L12:
                r1 = 1
                r0.capital = r1
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public class Element extends org.simpleframework.xml.stream.CamelCaseBuilder.Attribute {
        private boolean capital;
        final /* synthetic */ org.simpleframework.xml.stream.CamelCaseBuilder this$0;

        private Element(org.simpleframework.xml.stream.CamelCaseBuilder r2, java.lang.String r3) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        public /* synthetic */ Element(org.simpleframework.xml.stream.CamelCaseBuilder r1, java.lang.String r2, org.simpleframework.xml.stream.CamelCaseBuilder.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // org.simpleframework.xml.stream.CamelCaseBuilder.Attribute, org.simpleframework.xml.stream.Splitter
        public void parse(char[] r1, int r2, int r3) {
                r0 = this;
                org.simpleframework.xml.stream.CamelCaseBuilder r3 = r0.this$0
                boolean r3 = r3.element
                if (r3 != 0) goto La
                boolean r3 = r0.capital
                if (r3 == 0) goto L12
            La:
                char r3 = r1[r2]
                char r3 = r0.toUpper(r3)
                r1[r2] = r3
            L12:
                r1 = 1
                r0.capital = r1
                return
        }
    }

    public CamelCaseBuilder(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.attribute = r2
            r0.element = r1
            return
    }

    @Override // org.simpleframework.xml.stream.Style
    public java.lang.String getAttribute(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto Ld
            org.simpleframework.xml.stream.CamelCaseBuilder$Attribute r1 = new org.simpleframework.xml.stream.CamelCaseBuilder$Attribute
            r1.<init>(r2, r3, r0)
            java.lang.String r2 = r1.process()
            return r2
        Ld:
            return r0
    }

    @Override // org.simpleframework.xml.stream.Style
    public java.lang.String getElement(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto Ld
            org.simpleframework.xml.stream.CamelCaseBuilder$Element r1 = new org.simpleframework.xml.stream.CamelCaseBuilder$Element
            r1.<init>(r2, r3, r0)
            java.lang.String r2 = r1.process()
            return r2
        Ld:
            return r0
    }
}
