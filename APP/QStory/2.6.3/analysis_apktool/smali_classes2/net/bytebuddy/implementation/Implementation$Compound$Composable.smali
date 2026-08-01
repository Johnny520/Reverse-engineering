.class public Lnet/bytebuddy/implementation/Implementation$Compound$Composable;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation$Composable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/Implementation$Compound;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Composable"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final composable:Lnet/bytebuddy/implementation/Implementation$Composable;

.field private final implementations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/Implementation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lnet/bytebuddy/implementation/Implementation$Composable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/implementation/Implementation;",
            ">;",
            "Lnet/bytebuddy/implementation/Implementation$Composable;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->implementations:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lnet/bytebuddy/implementation/Implementation;

    .line 26
    .line 27
    instance-of v1, v0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object v1, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->implementations:Ljava/util/List;

    .line 32
    .line 33
    check-cast v0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;

    .line 34
    .line 35
    iget-object v2, v0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->implementations:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->implementations:Ljava/util/List;

    .line 41
    .line 42
    iget-object v0, v0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->composable:Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 43
    .line 44
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    instance-of v1, v0, Lnet/bytebuddy/implementation/Implementation$Compound;

    .line 49
    .line 50
    iget-object v2, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->implementations:Ljava/util/List;

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    check-cast v0, Lnet/bytebuddy/implementation/Implementation$Compound;

    .line 55
    .line 56
    invoke-static {v0}, Lnet/bytebuddy/implementation/Implementation$Compound;->access$400(Lnet/bytebuddy/implementation/Implementation$Compound;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    instance-of p1, p2, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;

    .line 69
    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    iget-object p1, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->implementations:Ljava/util/List;

    .line 73
    .line 74
    check-cast p2, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;

    .line 75
    .line 76
    iget-object v0, p2, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->implementations:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 79
    .line 80
    .line 81
    iget-object p1, p2, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->composable:Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 82
    .line 83
    iput-object p1, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->composable:Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 84
    .line 85
    return-void

    .line 86
    :cond_3
    iput-object p2, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->composable:Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 87
    .line 88
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/implementation/Implementation;Lnet/bytebuddy/implementation/Implementation$Composable;)V
    .locals 0

    .line 89
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;-><init>(Ljava/util/List;Lnet/bytebuddy/implementation/Implementation$Composable;)V

    return-void
.end method

.method public static synthetic access$200(Lnet/bytebuddy/implementation/Implementation$Compound$Composable;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->implementations:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300(Lnet/bytebuddy/implementation/Implementation$Compound$Composable;)Lnet/bytebuddy/implementation/Implementation$Composable;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->composable:Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public andThen(Lnet/bytebuddy/implementation/Implementation$Composable;)Lnet/bytebuddy/implementation/Implementation$Composable;
    .locals 2

    .line 19
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;

    iget-object v1, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->implementations:Ljava/util/List;

    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->composable:Lnet/bytebuddy/implementation/Implementation$Composable;

    invoke-interface {p0, p1}, Lnet/bytebuddy/implementation/Implementation$Composable;->andThen(Lnet/bytebuddy/implementation/Implementation$Composable;)Lnet/bytebuddy/implementation/Implementation$Composable;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;-><init>(Ljava/util/List;Lnet/bytebuddy/implementation/Implementation$Composable;)V

    return-object v0
.end method

.method public andThen(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/implementation/Implementation;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Compound;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->implementations:Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->composable:Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Lnet/bytebuddy/implementation/Implementation$Composable;->andThen(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/implementation/Implementation;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {v1, p0}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/Implementation$Compound;-><init>(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 5

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->implementations:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    new-array v0, v0, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->implementations:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lnet/bytebuddy/implementation/Implementation;

    .line 29
    .line 30
    add-int/lit8 v4, v2, 0x1

    .line 31
    .line 32
    invoke-interface {v3, p1}, Lnet/bytebuddy/implementation/Implementation;->appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    aput-object v3, v0, v2

    .line 37
    .line 38
    move v2, v4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->composable:Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 41
    .line 42
    invoke-interface {p0, p1}, Lnet/bytebuddy/implementation/Implementation;->appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    aput-object p0, v0, v2

    .line 47
    .line 48
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Compound;

    .line 49
    .line 50
    invoke-direct {p0, v0}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    .line 51
    .line 52
    .line 53
    return-object p0
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->composable:Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->composable:Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->implementations:Ljava/util/List;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->implementations:Ljava/util/List;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
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
    iget-object v1, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->composable:Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->implementations:Ljava/util/List;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v1

    .line 27
    return p0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->implementations:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lnet/bytebuddy/implementation/Implementation;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Prepareable;->prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;->composable:Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 25
    .line 26
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Prepareable;->prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method
