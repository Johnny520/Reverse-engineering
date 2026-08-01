.class public Lnet/bytebuddy/pool/TypePool$Default;
.super Lnet/bytebuddy/pool/TypePool$AbstractBase$Hierarchical;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Default"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;,
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;,
        Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;,
        Lnet/bytebuddy/pool/TypePool$Default$ParameterBag;,
        Lnet/bytebuddy/pool/TypePool$Default$GenericTypeRegistrant;,
        Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;,
        Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;,
        Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;,
        Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final IGNORE_METHOD:Lnet/bytebuddy/jar/asm/MethodVisitor;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# instance fields
.field protected final classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

.field protected final classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

.field protected final readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;)V
    .locals 1

    .line 12
    sget-object v0, Lnet/bytebuddy/pool/TypePool$Empty;->INSTANCE:Lnet/bytebuddy/pool/TypePool$Empty;

    invoke-direct {p0, p1, p2, p3, v0}, Lnet/bytebuddy/pool/TypePool$Default;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/pool/TypePool;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/pool/TypePool;)V
    .locals 6

    .line 1
    sget-object v4, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->IMPLICIT:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v3, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/pool/TypePool$Default;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/pool/TypePool;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/utility/AsmClassReader$Factory;)V
    .locals 6

    .line 13
    sget-object v5, Lnet/bytebuddy/pool/TypePool$Empty;->INSTANCE:Lnet/bytebuddy/pool/TypePool$Empty;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/pool/TypePool$Default;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/pool/TypePool;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/pool/TypePool;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1, p5}, Lnet/bytebuddy/pool/TypePool$AbstractBase$Hierarchical;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/pool/TypePool;)V

    .line 15
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 16
    iput-object p3, p0, Lnet/bytebuddy/pool/TypePool$Default;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 17
    iput-object p4, p0, Lnet/bytebuddy/pool/TypePool$Default;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    return-void
.end method

.method public static synthetic access$4100()Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/pool/TypePool$Default;->IGNORE_METHOD:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/pool/TypePool;
    .locals 0
    .param p0    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 14
    invoke-static {p0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/pool/TypePool$Default;->of(Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/pool/TypePool;

    move-result-object p0

    return-object p0
.end method

.method public static of(Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/pool/TypePool;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;

    .line 4
    .line 5
    invoke-direct {v1}, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v2, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;->FAST:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 9
    .line 10
    invoke-direct {v0, v1, p0, v2}, Lnet/bytebuddy/pool/TypePool$Default;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static ofBootLoader()Lnet/bytebuddy/pool/TypePool;
    .locals 1

    .line 1
    invoke-static {}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->ofBootLoader()Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lnet/bytebuddy/pool/TypePool$Default;->of(Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/pool/TypePool;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static ofPlatformLoader()Lnet/bytebuddy/pool/TypePool;
    .locals 1

    .line 1
    invoke-static {}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->ofPlatformLoader()Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lnet/bytebuddy/pool/TypePool$Default;->of(Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/pool/TypePool;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static ofSystemLoader()Lnet/bytebuddy/pool/TypePool;
    .locals 1

    .line 1
    invoke-static {}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->ofSystemLoader()Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lnet/bytebuddy/pool/TypePool$Default;->of(Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/pool/TypePool;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method


# virtual methods
.method public doDescribe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lnet/bytebuddy/dynamic/ClassFileLocator;->locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;->isResolved()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance p1, Lnet/bytebuddy/pool/TypePool$Resolution$Simple;

    .line 14
    .line 15
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 16
    .line 17
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;->resolve()[B

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v1, v0}, Lnet/bytebuddy/utility/AsmClassReader$Factory;->make([B)Lnet/bytebuddy/utility/AsmClassReader;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0, v0}, Lnet/bytebuddy/pool/TypePool$Default;->doParse(Lnet/bytebuddy/utility/AsmClassReader;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {p1, p0}, Lnet/bytebuddy/pool/TypePool$Resolution$Simple;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    new-instance p0, Lnet/bytebuddy/pool/TypePool$Resolution$Illegal;

    .line 34
    .line 35
    invoke-direct {p0, p1}, Lnet/bytebuddy/pool/TypePool$Resolution$Illegal;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :catch_0
    move-exception p0

    .line 40
    const-string p1, "Error while reading class file"

    .line 41
    .line 42
    invoke-static {p1, p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0
.end method

.method public doParse(Lnet/bytebuddy/utility/AsmClassReader;)Lnet/bytebuddy/description/type/TypeDescription;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 7
    .line 8
    invoke-virtual {p0}, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;->getFlags()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-interface {p1, v0, p0}, Lnet/bytebuddy/utility/AsmClassReader;->accept(Lnet/bytebuddy/jar/asm/ClassVisitor;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/pool/TypePool$AbstractBase$Hierarchical;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    return v1

    .line 16
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eq v2, v3, :cond_3

    .line 25
    .line 26
    return v1

    .line 27
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/pool/TypePool$Default;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 52
    .line 53
    iget-object p1, p1, Lnet/bytebuddy/pool/TypePool$Default;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/pool/TypePool$AbstractBase$Hierarchical;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v0

    .line 14
    mul-int/lit8 v1, v1, 0x1f

    .line 15
    .line 16
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    add-int/2addr v0, v1

    .line 23
    mul-int/lit8 v0, v0, 0x1f

    .line 24
    .line 25
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    add-int/2addr p0, v0

    .line 32
    return p0
.end method
