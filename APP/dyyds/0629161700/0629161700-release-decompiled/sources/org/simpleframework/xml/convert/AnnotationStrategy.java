package org.simpleframework.xml.convert;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class AnnotationStrategy implements org.simpleframework.xml.strategy.Strategy {
    private final org.simpleframework.xml.convert.ConverterScanner scanner;
    private final org.simpleframework.xml.strategy.Strategy strategy;

    public AnnotationStrategy() {
            r1 = this;
            org.simpleframework.xml.strategy.TreeStrategy r0 = new org.simpleframework.xml.strategy.TreeStrategy
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public AnnotationStrategy(org.simpleframework.xml.strategy.Strategy r2) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.convert.ConverterScanner r0 = new org.simpleframework.xml.convert.ConverterScanner
            r0.<init>()
            r1.scanner = r0
            r1.strategy = r2
            return
    }

    private boolean isReference(org.simpleframework.xml.strategy.Value r1) {
            r0 = this;
            if (r1 == 0) goto La
            boolean r0 = r1.isReference()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private org.simpleframework.xml.strategy.Value read(org.simpleframework.xml.strategy.Type r1, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.InputNode> r2, org.simpleframework.xml.strategy.Value r3) {
            r0 = this;
            org.simpleframework.xml.convert.ConverterScanner r0 = r0.scanner
            org.simpleframework.xml.convert.Converter r0 = r0.getConverter(r1, r3)
            org.simpleframework.xml.stream.Node r2 = r2.getNode()
            org.simpleframework.xml.stream.InputNode r2 = (org.simpleframework.xml.stream.InputNode) r2
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.read(r2)
            java.lang.Class r1 = r1.getType()
            if (r3 == 0) goto L1b
            r3.setValue(r0)
        L1b:
            org.simpleframework.xml.convert.Reference r2 = new org.simpleframework.xml.convert.Reference
            r2.<init>(r3, r0, r1)
            return r2
        L21:
            return r3
    }

    private boolean write(org.simpleframework.xml.strategy.Type r1, java.lang.Object r2, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.OutputNode> r3) {
            r0 = this;
            org.simpleframework.xml.convert.ConverterScanner r0 = r0.scanner
            org.simpleframework.xml.convert.Converter r0 = r0.getConverter(r1, r2)
            org.simpleframework.xml.stream.Node r1 = r3.getNode()
            org.simpleframework.xml.stream.OutputNode r1 = (org.simpleframework.xml.stream.OutputNode) r1
            if (r0 == 0) goto L13
            r0.write(r1, r2)
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Strategy
    public org.simpleframework.xml.strategy.Value read(org.simpleframework.xml.strategy.Type r2, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.InputNode> r3, java.util.Map r4) {
            r1 = this;
            org.simpleframework.xml.strategy.Strategy r0 = r1.strategy
            org.simpleframework.xml.strategy.Value r4 = r0.read(r2, r3, r4)
            boolean r0 = r1.isReference(r4)
            if (r0 == 0) goto Ld
            return r4
        Ld:
            org.simpleframework.xml.strategy.Value r1 = r1.read(r2, r3, r4)
            return r1
    }

    @Override // org.simpleframework.xml.strategy.Strategy
    public boolean write(org.simpleframework.xml.strategy.Type r2, java.lang.Object r3, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.OutputNode> r4, java.util.Map r5) {
            r1 = this;
            org.simpleframework.xml.strategy.Strategy r0 = r1.strategy
            boolean r5 = r0.write(r2, r3, r4, r5)
            if (r5 != 0) goto Ld
            boolean r1 = r1.write(r2, r3, r4)
            return r1
        Ld:
            return r5
    }
}
