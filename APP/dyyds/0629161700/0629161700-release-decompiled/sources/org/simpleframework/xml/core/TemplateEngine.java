package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class TemplateEngine {
    private org.simpleframework.xml.filter.Filter filter;
    private org.simpleframework.xml.core.Template name;
    private int off;
    private org.simpleframework.xml.core.Template source;
    private org.simpleframework.xml.core.Template text;

    public TemplateEngine(org.simpleframework.xml.filter.Filter r2) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.Template r0 = new org.simpleframework.xml.core.Template
            r0.<init>()
            r1.source = r0
            org.simpleframework.xml.core.Template r0 = new org.simpleframework.xml.core.Template
            r0.<init>()
            r1.name = r0
            org.simpleframework.xml.core.Template r0 = new org.simpleframework.xml.core.Template
            r0.<init>()
            r1.text = r0
            r1.filter = r2
            return
    }

    private void name() {
            r3 = this;
        L0:
            int r0 = r3.off
            org.simpleframework.xml.core.Template r1 = r3.source
            int r2 = r1.count
            if (r0 >= r2) goto L1e
            char[] r1 = r1.buf
            int r2 = r0 + 1
            r3.off = r2
            char r0 = r1[r0]
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 != r1) goto L18
            r3.replace()
            goto L1e
        L18:
            org.simpleframework.xml.core.Template r1 = r3.name
            r1.append(r0)
            goto L0
        L1e:
            org.simpleframework.xml.core.Template r0 = r3.name
            int r0 = r0.length()
            if (r0 <= 0) goto L34
            org.simpleframework.xml.core.Template r0 = r3.text
            java.lang.String r1 = "${"
            r0.append(r1)
            org.simpleframework.xml.core.Template r0 = r3.text
            org.simpleframework.xml.core.Template r3 = r3.name
            r0.append(r3)
        L34:
            return
    }

    private void parse() {
            r6 = this;
        L0:
            int r0 = r6.off
            org.simpleframework.xml.core.Template r1 = r6.source
            int r2 = r1.count
            if (r0 >= r2) goto L2e
            char[] r1 = r1.buf
            int r3 = r0 + 1
            r6.off = r3
            char r4 = r1[r0]
            r5 = 36
            if (r4 != r5) goto L28
            if (r3 >= r2) goto L28
            int r2 = r0 + 2
            r6.off = r2
            char r1 = r1[r3]
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 != r2) goto L24
            r6.name()
            goto L0
        L24:
            int r0 = r0 + 1
            r6.off = r0
        L28:
            org.simpleframework.xml.core.Template r0 = r6.text
            r0.append(r4)
            goto L0
        L2e:
            return
    }

    private void replace() {
            r1 = this;
            org.simpleframework.xml.core.Template r0 = r1.name
            int r0 = r0.length()
            if (r0 <= 0) goto Ld
            org.simpleframework.xml.core.Template r0 = r1.name
            r1.replace(r0)
        Ld:
            org.simpleframework.xml.core.Template r1 = r1.name
            r1.clear()
            return
    }

    private void replace(java.lang.String r3) {
            r2 = this;
            org.simpleframework.xml.filter.Filter r0 = r2.filter
            java.lang.String r0 = r0.replace(r3)
            org.simpleframework.xml.core.Template r1 = r2.text
            if (r0 != 0) goto L1c
            java.lang.String r0 = "${"
            r1.append(r0)
            org.simpleframework.xml.core.Template r0 = r2.text
            r0.append(r3)
            org.simpleframework.xml.core.Template r2 = r2.text
            java.lang.String r3 = "}"
            r2.append(r3)
            return
        L1c:
            r1.append(r0)
            return
    }

    private void replace(org.simpleframework.xml.core.Template r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            r0.replace(r1)
            return
    }

    public void clear() {
            r1 = this;
            org.simpleframework.xml.core.Template r0 = r1.name
            r0.clear()
            org.simpleframework.xml.core.Template r0 = r1.text
            r0.clear()
            org.simpleframework.xml.core.Template r0 = r1.source
            r0.clear()
            r0 = 0
            r1.off = r0
            return
    }

    public java.lang.String process(java.lang.String r2) {
            r1 = this;
            r0 = 36
            int r0 = r2.indexOf(r0)
            if (r0 >= 0) goto L9
            return r2
        L9:
            org.simpleframework.xml.core.Template r0 = r1.source     // Catch: java.lang.Throwable -> L1b
            r0.append(r2)     // Catch: java.lang.Throwable -> L1b
            r1.parse()     // Catch: java.lang.Throwable -> L1b
            org.simpleframework.xml.core.Template r2 = r1.text     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1b
            r1.clear()
            return r2
        L1b:
            r2 = move-exception
            r1.clear()
            throw r2
    }
}
