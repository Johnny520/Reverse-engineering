package net.bytebuddy.description;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeVariableSource extends net.bytebuddy.description.ModifierReviewable.OfAbstraction {

    @net.bytebuddy.utility.nullability.AlwaysNull
    public static final net.bytebuddy.description.TypeVariableSource UNDEFINED = null;

    public static abstract class AbstractBase extends net.bytebuddy.description.ModifierReviewable.AbstractBase implements net.bytebuddy.description.TypeVariableSource {
        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public net.bytebuddy.description.type.TypeDescription.Generic findExpectedVariable(java.lang.String r4) {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.findVariable(r4)
                if (r0 == 0) goto L7
                return r0
            L7:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot resolve "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " from "
                r1.append(r4)
                java.lang.String r4 = r3.toSafeString()
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription.Generic findVariable(java.lang.String r3) {
                r2 = this;
                net.bytebuddy.description.type.TypeList$Generic r0 = r2.getTypeVariables()
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r3)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.type.TypeList$Generic r0 = (net.bytebuddy.description.type.TypeList.Generic) r0
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L22
                net.bytebuddy.description.TypeVariableSource r0 = r2.getEnclosingSource()
                if (r0 != 0) goto L1d
                net.bytebuddy.description.type.TypeDescription$Generic r3 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                goto L21
            L1d:
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r0.findVariable(r3)
            L21:
                return r3
            L22:
                java.lang.Object r3 = r0.getOnly()
                net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                return r3
        }

        public abstract java.lang.String toSafeString();
    }

    public interface Visitor<T> {

        public enum NoOp extends java.lang.Enum<net.bytebuddy.description.TypeVariableSource.Visitor.NoOp> implements net.bytebuddy.description.TypeVariableSource.Visitor<net.bytebuddy.description.TypeVariableSource> {
            private static final /* synthetic */ net.bytebuddy.description.TypeVariableSource.Visitor.NoOp[] $VALUES = null;
            public static final net.bytebuddy.description.TypeVariableSource.Visitor.NoOp INSTANCE = null;

            static {
                    net.bytebuddy.description.TypeVariableSource$Visitor$NoOp r0 = new net.bytebuddy.description.TypeVariableSource$Visitor$NoOp
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.description.TypeVariableSource.Visitor.NoOp.INSTANCE = r0
                    net.bytebuddy.description.TypeVariableSource$Visitor$NoOp[] r0 = new net.bytebuddy.description.TypeVariableSource.Visitor.NoOp[]{r0}
                    net.bytebuddy.description.TypeVariableSource.Visitor.NoOp.$VALUES = r0
                    return
            }

            NoOp(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.description.TypeVariableSource.Visitor.NoOp valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.description.TypeVariableSource$Visitor$NoOp> r0 = net.bytebuddy.description.TypeVariableSource.Visitor.NoOp.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.description.TypeVariableSource$Visitor$NoOp r1 = (net.bytebuddy.description.TypeVariableSource.Visitor.NoOp) r1
                    return r1
            }

            public static net.bytebuddy.description.TypeVariableSource.Visitor.NoOp[] values() {
                    net.bytebuddy.description.TypeVariableSource$Visitor$NoOp[] r0 = net.bytebuddy.description.TypeVariableSource.Visitor.NoOp.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.description.TypeVariableSource$Visitor$NoOp[] r0 = (net.bytebuddy.description.TypeVariableSource.Visitor.NoOp[]) r0
                    return r0
            }

            @Override // net.bytebuddy.description.TypeVariableSource.Visitor
            public /* bridge */ /* synthetic */ net.bytebuddy.description.TypeVariableSource onMethod(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1) {
                    r0 = this;
                    net.bytebuddy.description.TypeVariableSource r1 = r0.onMethod2(r1)
                    return r1
            }

            @Override // net.bytebuddy.description.TypeVariableSource.Visitor
            /* JADX INFO: renamed from: onMethod, reason: avoid collision after fix types in other method */
            public net.bytebuddy.description.TypeVariableSource onMethod2(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1) {
                    r0 = this;
                    return r1
            }

            @Override // net.bytebuddy.description.TypeVariableSource.Visitor
            public /* bridge */ /* synthetic */ net.bytebuddy.description.TypeVariableSource onType(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    net.bytebuddy.description.TypeVariableSource r1 = r0.onType2(r1)
                    return r1
            }

            @Override // net.bytebuddy.description.TypeVariableSource.Visitor
            /* JADX INFO: renamed from: onType, reason: avoid collision after fix types in other method */
            public net.bytebuddy.description.TypeVariableSource onType2(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    return r1
            }
        }

        T onMethod(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1);

        T onType(net.bytebuddy.description.type.TypeDescription r1);
    }

    static {
            return
    }

    <T> T accept(net.bytebuddy.description.TypeVariableSource.Visitor<T> r1);

    net.bytebuddy.description.type.TypeDescription.Generic findExpectedVariable(java.lang.String r1);

    @net.bytebuddy.utility.nullability.MaybeNull
    net.bytebuddy.description.type.TypeDescription.Generic findVariable(java.lang.String r1);

    @net.bytebuddy.utility.nullability.MaybeNull
    net.bytebuddy.description.TypeVariableSource getEnclosingSource();

    net.bytebuddy.description.type.TypeList.Generic getTypeVariables();

    boolean isGenerified();

    boolean isInferrable();
}
