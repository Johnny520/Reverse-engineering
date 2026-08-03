package net.bytebuddy.description.type;

/* JADX INFO: loaded from: classes2.dex */
public class TypeVariableToken implements net.bytebuddy.description.ByteCodeElement.Token<net.bytebuddy.description.type.TypeVariableToken> {
    private final java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> annotations;
    private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> bounds;
    private transient /* synthetic */ int hashCode;
    private final java.lang.String symbol;

    public TypeVariableToken(java.lang.String r2, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r3) {
            r1 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            r1.<init>(r2, r3, r0)
            return
    }

    public TypeVariableToken(java.lang.String r1, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r2, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3) {
            r0 = this;
            r0.<init>()
            r0.symbol = r1
            r0.bounds = r2
            r0.annotations = r3
            return
    }

    public static net.bytebuddy.description.type.TypeVariableToken of(net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r5) {
            net.bytebuddy.description.type.TypeVariableToken r0 = new net.bytebuddy.description.type.TypeVariableToken
            java.lang.String r1 = r4.getSymbol()
            net.bytebuddy.description.type.TypeList$Generic r2 = r4.getUpperBounds()
            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForDetachment r3 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForDetachment
            r3.<init>(r5)
            net.bytebuddy.description.type.TypeList$Generic r5 = r2.accept(r3)
            net.bytebuddy.description.annotation.AnnotationList r4 = r4.getDeclaredAnnotations()
            r0.<init>(r1, r5, r4)
            return r0
    }

    @Override // net.bytebuddy.description.ByteCodeElement.Token
    public /* bridge */ /* synthetic */ net.bytebuddy.description.ByteCodeElement.Token accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor r1) {
            r0 = this;
            net.bytebuddy.description.type.TypeVariableToken r1 = r0.accept(r1)
            return r1
    }

    @Override // net.bytebuddy.description.ByteCodeElement.Token
    public net.bytebuddy.description.type.TypeVariableToken accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r4) {
            r3 = this;
            net.bytebuddy.description.type.TypeVariableToken r0 = new net.bytebuddy.description.type.TypeVariableToken
            java.lang.String r1 = r3.symbol
            net.bytebuddy.description.type.TypeList$Generic r2 = r3.getBounds()
            net.bytebuddy.description.type.TypeList$Generic r4 = r2.accept(r4)
            java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2 = r3.annotations
            r0.<init>(r1, r4, r2)
            return r0
    }

    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof net.bytebuddy.description.type.TypeVariableToken
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            net.bytebuddy.description.type.TypeVariableToken r5 = (net.bytebuddy.description.type.TypeVariableToken) r5
            java.lang.String r1 = r4.symbol
            java.lang.String r3 = r5.symbol
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2b
            java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r4.bounds
            java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r3 = r5.bounds
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2b
            java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r4.annotations
            java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r5 = r5.annotations
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L2b
            goto L2c
        L2b:
            r0 = r2
        L2c:
            return r0
    }

    public net.bytebuddy.description.annotation.AnnotationList getAnnotations() {
            r2 = this;
            net.bytebuddy.description.annotation.AnnotationList$Explicit r0 = new net.bytebuddy.description.annotation.AnnotationList$Explicit
            java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.annotations
            r0.<init>(r1)
            return r0
    }

    public net.bytebuddy.description.type.TypeList.Generic getBounds() {
            r2 = this;
            net.bytebuddy.description.type.TypeList$Generic$Explicit r0 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
            java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.bounds
            r0.<init>(r1)
            return r0
    }

    public java.lang.String getSymbol() {
            r1 = this;
            java.lang.String r0 = r1.symbol
            return r0
    }

    @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
    public int hashCode() {
            r2 = this;
            int r0 = r2.hashCode
            if (r0 == 0) goto L6
            r0 = 0
            goto L1e
        L6:
            java.lang.String r0 = r2.symbol
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.bounds
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.annotations
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L1e:
            if (r0 != 0) goto L23
            int r0 = r2.hashCode
            goto L25
        L23:
            r2.hashCode = r0
        L25:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.symbol
            return r0
    }
}
