.class public Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$ForClassFileLocator;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForClassFileLocator"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

.field private final readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/ClassFileLocator;)V
    .locals 1

    .line 9
    sget-object v0, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;->FAST:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$ForClassFileLocator;-><init>(Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$ForClassFileLocator;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$ForClassFileLocator;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 7
    .line 8
    return-void
.end method

.method public static of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;
    .locals 1
    .param p0    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$ForClassFileLocator;

    .line 2
    .line 3
    invoke-static {p0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$ForClassFileLocator;-><init>(Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$ForClassFileLocator;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$ForClassFileLocator;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$ForClassFileLocator;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

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
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$ForClassFileLocator;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$ForClassFileLocator;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

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
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$ForClassFileLocator;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

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
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$ForClassFileLocator;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

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

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/pool/TypePool;
    .locals 1

    .line 1
    new-instance p1, Lnet/bytebuddy/pool/TypePool$Default;

    .line 2
    .line 3
    new-instance p2, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;

    .line 4
    .line 5
    invoke-direct {p2}, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$ForClassFileLocator;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$ForClassFileLocator;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 11
    .line 12
    invoke-direct {p1, p2, v0, p0, p3}, Lnet/bytebuddy/pool/TypePool$Default;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/pool/TypePool;)V

    .line 13
    .line 14
    .line 15
    return-object p1
.end method
