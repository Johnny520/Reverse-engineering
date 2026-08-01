.class public Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Active;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/dynamic/TypeResolutionStrategy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/TypeResolutionStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Active"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Active$Resolved;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final nexusAccessor:Lnet/bytebuddy/dynamic/NexusAccessor;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/NexusAccessor;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/dynamic/NexusAccessor;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Active;-><init>(Lnet/bytebuddy/dynamic/NexusAccessor;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/dynamic/NexusAccessor;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Active;->nexusAccessor:Lnet/bytebuddy/dynamic/NexusAccessor;

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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Active;->nexusAccessor:Lnet/bytebuddy/dynamic/NexusAccessor;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Active;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Active;->nexusAccessor:Lnet/bytebuddy/dynamic/NexusAccessor;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/NexusAccessor;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Active;->nexusAccessor:Lnet/bytebuddy/dynamic/NexusAccessor;

    .line 12
    .line 13
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/NexusAccessor;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public resolve()Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Resolved;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Active$Resolved;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Active;->nexusAccessor:Lnet/bytebuddy/dynamic/NexusAccessor;

    .line 4
    .line 5
    new-instance v1, Ljava/util/Random;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/Random;->nextInt()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Active$Resolved;-><init>(Lnet/bytebuddy/dynamic/NexusAccessor;I)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
