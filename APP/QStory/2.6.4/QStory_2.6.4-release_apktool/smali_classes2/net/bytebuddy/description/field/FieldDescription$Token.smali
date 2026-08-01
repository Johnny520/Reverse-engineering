.class public Lnet/bytebuddy/description/field/FieldDescription$Token;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/description/ByteCodeElement$Token;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/field/FieldDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Token"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/description/ByteCodeElement$Token<",
        "Lnet/bytebuddy/description/field/FieldDescription$Token;",
        ">;"
    }
.end annotation


# instance fields
.field private final annotations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;"
        }
    .end annotation
.end field

.field private transient synthetic hashCode:I

.field private final modifiers:I

.field private final name:Ljava/lang/String;

.field private final type:Lnet/bytebuddy/description/type/TypeDescription$Generic;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;)V
    .locals 1

    .line 13
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0, p1, p2, p3, v0}, Lnet/bytebuddy/description/field/FieldDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->name:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->modifiers:I

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->type:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->annotations:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge synthetic accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/ByteCodeElement$Token;
    .locals 0

    .line 21
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/field/FieldDescription$Token;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/field/FieldDescription$Token;

    move-result-object p0

    return-object p0
.end method

.method public accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/field/FieldDescription$Token;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/description/field/FieldDescription$Token;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->name:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->modifiers:I

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->type:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 8
    .line 9
    invoke-interface {v3, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 14
    .line 15
    iget-object p0, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->annotations:Ljava/util/List;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, p1, p0}, Lnet/bytebuddy/description/field/FieldDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public asSignatureToken(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/field/FieldDescription$SignatureToken;
    .locals 4

    .line 1
    new-instance v0, Lnet/bytebuddy/description/field/FieldDescription$SignatureToken;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->name:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->type:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 6
    .line 7
    new-instance v2, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Reducing;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    new-array v3, v3, [Lnet/bytebuddy/description/type/TypeVariableToken;

    .line 11
    .line 12
    invoke-direct {v2, p1, v3}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Reducing;-><init>(Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeVariableToken;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0, v2}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 20
    .line 21
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/description/field/FieldDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    check-cast p1, Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 20
    .line 21
    iget v2, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->modifiers:I

    .line 22
    .line 23
    iget v3, p1, Lnet/bytebuddy/description/field/FieldDescription$Token;->modifiers:I

    .line 24
    .line 25
    if-ne v2, v3, :cond_2

    .line 26
    .line 27
    iget-object v2, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->name:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v3, p1, Lnet/bytebuddy/description/field/FieldDescription$Token;->name:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget-object v2, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->type:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 38
    .line 39
    iget-object v3, p1, Lnet/bytebuddy/description/field/FieldDescription$Token;->type:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    iget-object p0, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->annotations:Ljava/util/List;

    .line 48
    .line 49
    iget-object p1, p1, Lnet/bytebuddy/description/field/FieldDescription$Token;->annotations:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {p0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_2

    .line 56
    .line 57
    return v0

    .line 58
    :cond_2
    :goto_0
    return v1
.end method

.method public getAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$Explicit;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->annotations:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationList$Explicit;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->modifiers:I

    .line 2
    .line 3
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->type:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3
    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "hashCode"
    .end annotation

    .line 1
    iget v0, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->hashCode:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->name:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0x1f

    .line 14
    .line 15
    mul-int/2addr v0, v1

    .line 16
    iget v2, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->modifiers:I

    .line 17
    .line 18
    add-int/2addr v0, v2

    .line 19
    mul-int/2addr v0, v1

    .line 20
    iget-object v2, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->type:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 21
    .line 22
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription$Generic;II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->annotations:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    add-int/2addr v0, v1

    .line 33
    :goto_0
    if-nez v0, :cond_1

    .line 34
    .line 35
    iget p0, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->hashCode:I

    .line 36
    .line 37
    return p0

    .line 38
    :cond_1
    iput v0, p0, Lnet/bytebuddy/description/field/FieldDescription$Token;->hashCode:I

    .line 39
    .line 40
    return v0
.end method
