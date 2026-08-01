.class public Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;
.super Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private classNames:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

.field private final signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;


# direct methods
.method public constructor <init>(ILnet/bytebuddy/jar/asm/signature/SignatureVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;-><init>(I)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->classNames:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p2, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 12
    .line 13
    iput-object p3, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V
    .locals 1

    const/high16 v0, 0x90000

    .line 16
    invoke-direct {p0, v0, p1, p2}, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;-><init>(ILnet/bytebuddy/jar/asm/signature/SignatureVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    return-void
.end method

.method private static synthetic stringConcat$0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p0, "$"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private static synthetic stringConcat$1(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "$"

    .line 2
    .line 3
    invoke-static {p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪兰苏哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public visitArrayType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitArrayType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public visitBaseType(C)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitBaseType(C)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public visitClassBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitClassBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public visitClassType(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->classNames:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 7
    .line 8
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapType(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v0, p0}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitClassType(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public visitEnd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitEnd()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->classNames:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    add-int/lit8 v0, v0, -0x1

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public visitExceptionType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitExceptionType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public visitFormalTypeParameter(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitFormalTypeParameter(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public visitInnerClassType(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->classNames:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, p1}, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->stringConcat$0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->classNames:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapType(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->stringConcat$1(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapType(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/16 v0, 0x24

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    :goto_0
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitInnerClassType(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public visitInterface()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitInterface()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public visitInterfaceBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitInterfaceBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public visitParameterType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitParameterType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public visitReturnType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitReturnType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public visitSuperclass()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitSuperclass()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public visitTypeArgument(C)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 1

    .line 7
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitTypeArgument(C)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    return-object p0
.end method

.method public visitTypeArgument()V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitTypeArgument()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public visitTypeVariable(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/commons/SignatureRemapper;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitTypeVariable(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
