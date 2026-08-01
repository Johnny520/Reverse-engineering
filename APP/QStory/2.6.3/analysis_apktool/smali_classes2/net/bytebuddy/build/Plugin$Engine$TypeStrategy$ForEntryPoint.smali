.class public Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy$ForEntryPoint;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForEntryPoint"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final entryPoint:Lnet/bytebuddy/build/EntryPoint;

.field private final methodNameTransformer:Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/build/EntryPoint;Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy$ForEntryPoint;->entryPoint:Lnet/bytebuddy/build/EntryPoint;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy$ForEntryPoint;->methodNameTransformer:Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public builder(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/ByteBuddy;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy$ForEntryPoint;->entryPoint:Lnet/bytebuddy/build/EntryPoint;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy$ForEntryPoint;->methodNameTransformer:Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;

    .line 4
    .line 5
    invoke-interface {v0, p2, p1, p3, p0}, Lnet/bytebuddy/build/EntryPoint;->transform(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
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
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy$ForEntryPoint;->entryPoint:Lnet/bytebuddy/build/EntryPoint;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy$ForEntryPoint;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy$ForEntryPoint;->entryPoint:Lnet/bytebuddy/build/EntryPoint;

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
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy$ForEntryPoint;->methodNameTransformer:Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy$ForEntryPoint;->methodNameTransformer:Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;

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
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy$ForEntryPoint;->entryPoint:Lnet/bytebuddy/build/EntryPoint;

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
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy$ForEntryPoint;->methodNameTransformer:Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;

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
