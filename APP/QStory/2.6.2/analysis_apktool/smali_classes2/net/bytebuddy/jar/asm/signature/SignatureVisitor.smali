.class public abstract Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final EXTENDS:C = '+'

.field public static final INSTANCEOF:C = '='

.field public static final SUPER:C = '-'


# instance fields
.field protected final api:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x90000

    .line 5
    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/high16 v0, 0x80000

    .line 9
    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/high16 v0, 0x70000

    .line 13
    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    .line 16
    const/high16 v0, 0x60000

    .line 17
    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    .line 20
    const/high16 v0, 0x50000

    .line 21
    .line 22
    if-eq p1, v0, :cond_1

    .line 23
    .line 24
    const/high16 v0, 0x40000

    .line 25
    .line 26
    if-eq p1, v0, :cond_1

    .line 27
    .line 28
    const/high16 v0, 0x10a0000

    .line 29
    .line 30
    if-ne p1, v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->stringConcat$0(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    throw p0

    .line 42
    :cond_1
    :goto_0
    iput p1, p0, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->api:I

    .line 43
    .line 44
    return-void
.end method

.method private static synthetic stringConcat$0(I)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Unsupported api "

    .line 2
    .line 3
    invoke-static {p0, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public visitArrayType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 0

    .line 1
    return-object p0
.end method

.method public visitBaseType(C)V
    .locals 0

    .line 1
    return-void
.end method

.method public visitClassBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 0

    .line 1
    return-object p0
.end method

.method public visitClassType(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public visitEnd()V
    .locals 0

    .line 1
    return-void
.end method

.method public visitExceptionType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 0

    .line 1
    return-object p0
.end method

.method public visitFormalTypeParameter(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public visitInnerClassType(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public visitInterface()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 0

    .line 1
    return-object p0
.end method

.method public visitInterfaceBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 0

    .line 1
    return-object p0
.end method

.method public visitParameterType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 0

    .line 1
    return-object p0
.end method

.method public visitReturnType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 0

    .line 1
    return-object p0
.end method

.method public visitSuperclass()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 0

    .line 1
    return-object p0
.end method

.method public visitTypeArgument(C)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 0

    .line 1
    return-object p0
.end method

.method public visitTypeArgument()V
    .locals 0

    .line 2
    return-void
.end method

.method public visitTypeVariable(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method
