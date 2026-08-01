.class public Lnet/bytebuddy/jar/asm/signature/SignatureWriter;
.super Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private argumentStack:I

.field private hasFormals:Z

.field private hasParameters:Z

.field private final stringBuilder:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;-><init>(Ljava/lang/StringBuilder;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 1
    const/high16 v0, 0x90000

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;-><init>(I)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->argumentStack:I

    .line 8
    .line 9
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 10
    .line 11
    return-void
.end method

.method private endArguments()V
    .locals 3

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->argumentStack:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const/16 v2, 0x3e

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    :cond_0
    iget v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->argumentStack:I

    .line 15
    .line 16
    ushr-int/2addr v0, v1

    .line 17
    iput v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->argumentStack:I

    .line 18
    .line 19
    return-void
.end method

.method private endFormals()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->hasFormals:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->hasFormals:Z

    .line 7
    .line 8
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const/16 v0, 0x3e

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public visitArrayType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x5b

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public visitBaseType(C)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public visitClassBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 0

    .line 1
    return-object p0
.end method

.method public visitClassType(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x4c

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget p1, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->argumentStack:I

    .line 14
    .line 15
    shl-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    iput p1, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->argumentStack:I

    .line 18
    .line 19
    return-void
.end method

.method public visitEnd()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->endArguments()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const/16 v0, 0x3b

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public visitExceptionType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x5e

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public visitFormalTypeParameter(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->hasFormals:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->hasFormals:Z

    .line 7
    .line 8
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const/16 v1, 0x3c

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const/16 p1, 0x3a

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public visitInnerClassType(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->endArguments()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const/16 v1, 0x2e

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget p1, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->argumentStack:I

    .line 17
    .line 18
    shl-int/lit8 p1, p1, 0x1

    .line 19
    .line 20
    iput p1, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->argumentStack:I

    .line 21
    .line 22
    return-void
.end method

.method public visitInterface()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 0

    .line 1
    return-object p0
.end method

.method public visitInterfaceBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x3a

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public visitParameterType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 2

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->endFormals()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->hasParameters:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->hasParameters:Z

    .line 10
    .line 11
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const/16 v1, 0x28

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    :cond_0
    return-object p0
.end method

.method public visitReturnType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 2

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->endFormals()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->hasParameters:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const/16 v1, 0x28

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const/16 v1, 0x29

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public visitSuperclass()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->endFormals()V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public visitTypeArgument(C)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 2

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->argumentStack:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    or-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    iput v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->argumentStack:I

    .line 10
    .line 11
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const/16 v1, 0x3c

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    :cond_0
    const/16 v0, 0x3d

    .line 19
    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    :cond_1
    iget p1, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->argumentStack:I

    .line 28
    .line 29
    const/high16 v0, -0x80000000

    .line 30
    .line 31
    and-int/2addr p1, v0

    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_2
    new-instance p1, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;

    .line 36
    .line 37
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {p1, p0}, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;-><init>(Ljava/lang/StringBuilder;)V

    .line 40
    .line 41
    .line 42
    return-object p1
.end method

.method public visitTypeArgument()V
    .locals 2

    .line 43
    iget v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->argumentStack:I

    and-int/lit8 v1, v0, 0x1

    if-nez v1, :cond_0

    or-int/lit8 v0, v0, 0x1

    .line 44
    iput v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->argumentStack:I

    .line 45
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    const/16 v1, 0x3c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    const/16 v0, 0x2a

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public visitTypeVariable(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x54

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const/16 p1, 0x3b

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    return-void
.end method
