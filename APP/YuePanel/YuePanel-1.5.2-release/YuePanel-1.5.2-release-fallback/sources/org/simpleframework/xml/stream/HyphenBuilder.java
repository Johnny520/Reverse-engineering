package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class HyphenBuilder implements org.simpleframework.xml.stream.Style {

    /* JADX INFO: renamed from: org.simpleframework.xml.stream.HyphenBuilder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

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
                java.lang.StringBuilder r2 = r1.builder
                r3 = 45
                r2.append(r3)
            L11:
                return
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void parse(char[] r1, int r2, int r3) {
                r0 = this;
                char r3 = r1[r2]
                char r3 = r0.toLower(r3)
                r1[r2] = r3
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
            java.lang.String r3 = r1.process()
            return r3
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
            java.lang.String r3 = r1.process()
            return r3
        Ld:
            return r0
    }
}
