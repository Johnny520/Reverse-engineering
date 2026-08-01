.class public Lnet/bytebuddy/description/type/TypeVariableToken;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/description/ByteCodeElement$Token;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/description/ByteCodeElement$Token<",
        "Lnet/bytebuddy/description/type/TypeVariableToken;",
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

.field private final bounds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;"
        }
    .end annotation
.end field

.field private transient synthetic hashCode:I

.field private final symbol:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)V"
        }
    .end annotation

    .line 11
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/description/type/TypeVariableToken;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;",
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
    iput-object p1, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->symbol:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->bounds:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->annotations:Ljava/util/List;

    .line 9
    .line 10
    return-void
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/description/type/TypeVariableToken;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/description/type/TypeVariableToken;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeVariableToken;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getSymbol()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getUpperBounds()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v3, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForDetachment;

    .line 12
    .line 13
    invoke-direct {v3, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForDetachment;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/type/TypeList$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p0}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, v1, p1, p0}, Lnet/bytebuddy/description/type/TypeVariableToken;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method


# virtual methods
.method public bridge synthetic accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/ByteCodeElement$Token;
    .locals 0

    .line 19
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeVariableToken;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/type/TypeVariableToken;

    move-result-object p0

    return-object p0
.end method

.method public accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/type/TypeVariableToken;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/description/type/TypeVariableToken;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeVariableToken;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->symbol:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/TypeVariableToken;->getBounds()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2, p1}, Lnet/bytebuddy/description/type/TypeList$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->annotations:Ljava/util/List;

    .line 14
    .line 15
    invoke-direct {v0, v1, p1, p0}, Lnet/bytebuddy/description/type/TypeVariableToken;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
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
    instance-of v1, p1, Lnet/bytebuddy/description/type/TypeVariableToken;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lnet/bytebuddy/description/type/TypeVariableToken;

    .line 12
    .line 13
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->symbol:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lnet/bytebuddy/description/type/TypeVariableToken;->symbol:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->bounds:Ljava/util/List;

    .line 24
    .line 25
    iget-object v3, p1, Lnet/bytebuddy/description/type/TypeVariableToken;->bounds:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->annotations:Ljava/util/List;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/description/type/TypeVariableToken;->annotations:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {p0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    return v0

    .line 44
    :cond_2
    return v2
.end method

.method public getAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$Explicit;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->annotations:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationList$Explicit;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public getBounds()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->bounds:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public getSymbol()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->symbol:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 2
    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "hashCode"
    .end annotation

    .line 1
    iget v0, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->hashCode:I

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
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->symbol:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    mul-int/lit8 v0, v0, 0x1f

    .line 14
    .line 15
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->bounds:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-int/2addr v1, v0

    .line 22
    mul-int/lit8 v1, v1, 0x1f

    .line 23
    .line 24
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->annotations:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/2addr v0, v1

    .line 31
    :goto_0
    if-nez v0, :cond_1

    .line 32
    .line 33
    iget p0, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->hashCode:I

    .line 34
    .line 35
    return p0

    .line 36
    :cond_1
    iput v0, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->hashCode:I

    .line 37
    .line 38
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeVariableToken;->symbol:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
