package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class HyphenBuilder implements org.simpleframework.xml.stream.Style {

    /* JADX INFO: renamed from: org.simpleframework.xml.stream.HyphenBuilder$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public class Parser extends org.simpleframework.xml.stream.Splitter {
        final /* synthetic */ org.simpleframework.xml.stream.HyphenBuilder this$0;

        private Parser(org.simpleframework.xml.stream.HyphenBuilder r1, java.lang.String r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        public /* synthetic */ Parser(org.simpleframework.xml.stream.HyphenBuilder r1, java.lang.String r2, org.simpleframework.xml.stream.HyphenBuilder.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void commit(char[] r2, int r3, int r4) {
                r1 = this;
                java.lang.StringBuilder r0 = r1.builder
                r0.append(r2, r3, r4)
                int r3 = r3 + r4
                int r2 = r1.count
                if (r3 >= r2) goto L11
                java.lang.StringBuilder r1 = r1.builder
                r2 = 45
                r1.append(r2)
            L11:
                return
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void parse(char[] r1, int r2, int r3) {
                r0 = this;
                char r3 = r1[r2]
                char r0 = r0.toLower(r3)
                r1[r2] = r0
                return
        }
    }

    public HyphenBuilder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.simpleframework.xml.stream.Style
    public java.lang.String getAttribute(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto Ld
            org.simpleframework.xml.stream.HyphenBuilder$Parser r1 = new org.simpleframework.xml.stream.HyphenBuilder$Parser
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
            org.simpleframework.xml.stream.HyphenBuilder$Parser r1 = new org.simpleframework.xml.stream.HyphenBuilder$Parser
            r1.<init>(r2, r3, r0)
            java.lang.String r2 = r1.process()
            return r2
        Ld:
            return r0
    }
}
