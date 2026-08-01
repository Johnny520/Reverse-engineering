.class public Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Ambiguous"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final left:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field

.field private final parameters:I

.field private final priority:I

.field private final right:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;",
            "Ljava/lang/reflect/Constructor<",
            "*>;II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->left:Ljava/lang/reflect/Constructor;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->right:Ljava/lang/reflect/Constructor;

    .line 7
    .line 8
    iput p3, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->priority:I

    .line 9
    .line 10
    iput p4, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->parameters:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
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
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget v2, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->priority:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->priority:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget v2, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->parameters:I

    .line 30
    .line 31
    iget v3, p1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->parameters:I

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->left:Ljava/lang/reflect/Constructor;

    .line 37
    .line 38
    iget-object v3, p1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->left:Ljava/lang/reflect/Constructor;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_5

    .line 45
    .line 46
    return v1

    .line 47
    :cond_5
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->right:Ljava/lang/reflect/Constructor;

    .line 48
    .line 49
    iget-object p1, p1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->right:Ljava/lang/reflect/Constructor;

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_6

    .line 56
    .line 57
    return v1

    .line 58
    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->left:Ljava/lang/reflect/Constructor;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->right:Ljava/lang/reflect/Constructor;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget v1, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->priority:I

    .line 30
    .line 31
    add-int/2addr v0, v1

    .line 32
    mul-int/lit8 v0, v0, 0x1f

    .line 33
    .line 34
    iget p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->parameters:I

    .line 35
    .line 36
    add-int/2addr v0, p0

    .line 37
    return v0
.end method

.method public instantiate()Lnet/bytebuddy/build/Plugin;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Ambiguous constructors "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->left:Ljava/lang/reflect/Constructor;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, " and "

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->right:Ljava/lang/reflect/Constructor;

    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public replaceBy(Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;)Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->getConstructor()Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Priority;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Priority;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    move v2, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {v0}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Priority;->value()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    :goto_0
    iget v3, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->priority:I

    .line 23
    .line 24
    if-le v2, v3, :cond_1

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_1
    if-nez v0, :cond_2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    invoke-interface {v0}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Priority;->value()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    :goto_1
    iget v0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->priority:I

    .line 35
    .line 36
    if-ge v1, v0, :cond_3

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_3
    invoke-virtual {p1}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->getConstructor()Ljava/lang/reflect/Constructor;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    array-length v0, v0

    .line 48
    iget v1, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;->parameters:I

    .line 49
    .line 50
    if-le v0, v1, :cond_4

    .line 51
    .line 52
    :goto_2
    return-object p1

    .line 53
    :cond_4
    :goto_3
    return-object p0
.end method
