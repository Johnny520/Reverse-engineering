.class public Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor$OfTypeArgument;
.super Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OfTypeArgument"
.end annotation


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;-><init>(Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic onGenericArray(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Object;
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor$OfTypeArgument;->onGenericArray(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    move-result-object p0

    return-object p0
.end method

.method public onGenericArray(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 4
    .line 5
    const/16 v2, 0x3d

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitTypeArgument(C)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;-><init>(Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 18
    .line 19
    return-object p0
.end method

.method public bridge synthetic onNonGenericType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Object;
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor$OfTypeArgument;->onNonGenericType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    move-result-object p0

    return-object p0
.end method

.method public onNonGenericType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 4
    .line 5
    const/16 v2, 0x3d

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitTypeArgument(C)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;-><init>(Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 18
    .line 19
    return-object p0
.end method

.method public bridge synthetic onParameterizedType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Object;
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor$OfTypeArgument;->onParameterizedType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    move-result-object p0

    return-object p0
.end method

.method public onParameterizedType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 4
    .line 5
    const/16 v2, 0x3d

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitTypeArgument(C)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;-><init>(Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 18
    .line 19
    return-object p0
.end method

.method public bridge synthetic onTypeVariable(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Object;
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor$OfTypeArgument;->onTypeVariable(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    move-result-object p0

    return-object p0
.end method

.method public onTypeVariable(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 4
    .line 5
    const/16 v2, 0x3d

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitTypeArgument(C)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;-><init>(Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 18
    .line 19
    return-object p0
.end method

.method public bridge synthetic onWildcard(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Object;
    .locals 0

    .line 89
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor$OfTypeArgument;->onWildcard(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    move-result-object p0

    return-object p0
.end method

.method public onWildcard(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
    .locals 3

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getUpperBounds()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getLowerBounds()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 20
    .line 21
    const-class v2, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-interface {v1, v2}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    iget-object p1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 30
    .line 31
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitTypeArgument()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    invoke-interface {p1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 46
    .line 47
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;

    .line 48
    .line 49
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 50
    .line 51
    const/16 v2, 0x2d

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitTypeArgument(C)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;-><init>(Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 69
    .line 70
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;

    .line 71
    .line 72
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 73
    .line 74
    const/16 v2, 0x2b

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitTypeArgument(C)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;-><init>(Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    :goto_0
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;->signatureVisitor:Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 87
    .line 88
    return-object p0
.end method
