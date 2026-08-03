package org.simpleframework.xml.convert;

/* JADX INFO: loaded from: classes2.dex */
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
            boolean r1 = r1.isReference()
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    private org.simpleframework.xml.strategy.Value read(org.simpleframework.xml.strategy.Type r2, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.InputNode> r3, org.simpleframework.xml.strategy.Value r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.convert.ConverterScanner r0 = r1.scanner
            org.simpleframework.xml.convert.Converter r0 = r0.getConverter(r2, r4)
            org.simpleframework.xml.stream.Node r3 = r3.getNode()
            org.simpleframework.xml.stream.InputNode r3 = (org.simpleframework.xml.stream.InputNode) r3
            if (r0 == 0) goto L21
            java.lang.Object r3 = r0.read(r3)
            java.lang.Class r2 = r2.getType()
            if (r4 == 0) goto L1b
            r4.setValue(r3)
        L1b:
            org.simpleframework.xml.convert.Reference r0 = new org.simpleframework.xml.convert.Reference
            r0.<init>(r4, r3, r2)
            return r0
        L21:
            return r4
    }

    private boolean write(org.simpleframework.xml.strategy.Type r2, java.lang.Object r3, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.OutputNode> r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.convert.ConverterScanner r0 = r1.scanner
            org.simpleframework.xml.convert.Converter r2 = r0.getConverter(r2, r3)
            org.simpleframework.xml.stream.Node r4 = r4.getNode()
            org.simpleframework.xml.stream.OutputNode r4 = (org.simpleframework.xml.stream.OutputNode) r4
            if (r2 == 0) goto L13
            r2.write(r4, r3)
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // org.simpleframework.xml.strategy.Strategy
    public org.simpleframework.xml.strategy.Value read(org.simpleframework.xml.strategy.Type r2, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.InputNode> r3, java.util.Map r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.strategy.Strategy r0 = r1.strategy
            org.simpleframework.xml.strategy.Value r4 = r0.read(r2, r3, r4)
            boolean r0 = r1.isReference(r4)
            if (r0 == 0) goto Ld
            return r4
        Ld:
            org.simpleframework.xml.strategy.Value r2 = r1.read(r2, r3, r4)
            return r2
    }

    @Override // org.simpleframework.xml.strategy.Strategy
    public boolean write(org.simpleframework.xml.strategy.Type r2, java.lang.Object r3, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.OutputNode> r4, java.util.Map r5) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.strategy.Strategy r0 = r1.strategy
            boolean r5 = r0.write(r2, r3, r4, r5)
            if (r5 != 0) goto Ld
            boolean r2 = r1.write(r2, r3, r4)
            return r2
        Ld:
            return r5
    }
}
