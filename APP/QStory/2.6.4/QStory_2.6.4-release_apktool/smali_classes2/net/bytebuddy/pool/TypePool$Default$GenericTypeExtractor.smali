.class public Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;
.super Lnet/bytebuddy/pool/TypePool$Default$GenericTypeRegistrant$RejectingSignatureVisitor;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/pool/TypePool$Default$GenericTypeRegistrant;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GenericTypeExtractor"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$ForSignature;,
        Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken;
    }
.end annotation


# instance fields
.field private final genericTypeRegistrant:Lnet/bytebuddy/pool/TypePool$Default$GenericTypeRegistrant;

.field private incompleteToken:Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken;
    .annotation runtime Lnet/bytebuddy/utility/nullability/UnknownNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$GenericTypeRegistrant;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeRegistrant$RejectingSignatureVisitor;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;->genericTypeRegistrant:Lnet/bytebuddy/pool/TypePool$Default$GenericTypeRegistrant;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public register(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;->genericTypeRegistrant:Lnet/bytebuddy/pool/TypePool$Default$GenericTypeRegistrant;

    .line 2
    .line 3
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$ForGenericArray;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$ForGenericArray;-><init>(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, v0}, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeRegistrant;->register(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public visitArrayType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default$GenericTypeRegistrant;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public visitBaseType(C)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;->genericTypeRegistrant:Lnet/bytebuddy/pool/TypePool$Default$GenericTypeRegistrant;

    .line 2
    .line 3
    invoke-static {p1}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType;->of(C)Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeRegistrant;->register(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public visitClassType(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken$ForTopLevelType;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken$ForTopLevelType;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;->incompleteToken:Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken;

    .line 7
    .line 8
    return-void
.end method

.method public visitEnd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;->genericTypeRegistrant:Lnet/bytebuddy/pool/TypePool$Default$GenericTypeRegistrant;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;->incompleteToken:Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken;

    .line 4
    .line 5
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken;->toToken()Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {v0, p0}, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeRegistrant;->register(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public visitInnerClassType(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken$ForInnerClass;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;->incompleteToken:Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken$ForInnerClass;-><init>(Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;->incompleteToken:Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken;

    .line 9
    .line 10
    return-void
.end method

.method public visitTypeArgument(C)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 1

    .line 1
    const/16 v0, 0x2b

    .line 2
    .line 3
    if-eq p1, v0, :cond_2

    .line 4
    .line 5
    const/16 v0, 0x2d

    .line 6
    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x3d

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;->incompleteToken:Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken;

    .line 14
    .line 15
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken;->appendDirectBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string p0, "Unknown wildcard: "

    .line 21
    .line 22
    invoke-static {p1, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;->incompleteToken:Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken;

    .line 28
    .line 29
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken;->appendLowerBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_2
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;->incompleteToken:Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken;

    .line 35
    .line 36
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken;->appendUpperBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public visitTypeArgument()V
    .locals 0

    .line 41
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;->incompleteToken:Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken;

    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken;->appendPlaceholder()V

    return-void
.end method

.method public visitTypeVariable(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;->genericTypeRegistrant:Lnet/bytebuddy/pool/TypePool$Default$GenericTypeRegistrant;

    .line 2
    .line 3
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$ForTypeVariable;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$ForTypeVariable;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, v0}, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeRegistrant;->register(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
