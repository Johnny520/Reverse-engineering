.class public Lnet/bytebuddy/dynamic/DynamicType$Default$Unloaded;
.super Lnet/bytebuddy/dynamic/DynamicType$Default;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/dynamic/DynamicType$Unloaded;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/DynamicType$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Unloaded"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lnet/bytebuddy/dynamic/DynamicType$Default;",
        "Lnet/bytebuddy/dynamic/DynamicType$Unloaded<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final typeResolutionStrategy:Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Resolved;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;[BLnet/bytebuddy/implementation/LoadedTypeInitializer;Ljava/util/List;Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Resolved;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "[B",
            "Lnet/bytebuddy/implementation/LoadedTypeInitializer;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;",
            "Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Resolved;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lnet/bytebuddy/dynamic/DynamicType$Default;-><init>(Lnet/bytebuddy/description/type/TypeDescription;[BLnet/bytebuddy/implementation/LoadedTypeInitializer;Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    iput-object p5, p0, Lnet/bytebuddy/dynamic/DynamicType$Default$Unloaded;->typeResolutionStrategy:Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Resolved;

    .line 5
    .line 6
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
    invoke-super {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Default;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Default$Unloaded;->typeResolutionStrategy:Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Resolved;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/dynamic/DynamicType$Default$Unloaded;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/dynamic/DynamicType$Default$Unloaded;->typeResolutionStrategy:Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Resolved;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/dynamic/DynamicType$Default;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Default$Unloaded;->typeResolutionStrategy:Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Resolved;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/2addr p0, v0

    .line 14
    return p0
.end method

.method public include(Ljava/util/List;)Lnet/bytebuddy/dynamic/DynamicType$Unloaded;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Unloaded<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Default$Unloaded;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->binaryRepresentation:[B

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->auxiliaryTypes:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v4, p1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    iget-object v5, p0, Lnet/bytebuddy/dynamic/DynamicType$Default$Unloaded;->typeResolutionStrategy:Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Resolved;

    .line 16
    .line 17
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/dynamic/DynamicType$Default$Unloaded;-><init>(Lnet/bytebuddy/description/type/TypeDescription;[BLnet/bytebuddy/implementation/LoadedTypeInitializer;Ljava/util/List;Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Resolved;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public varargs include([Lnet/bytebuddy/dynamic/DynamicType;)Lnet/bytebuddy/dynamic/DynamicType$Unloaded;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Unloaded<",
            "TT;>;"
        }
    .end annotation

    .line 21
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Default$Unloaded;->include(Ljava/util/List;)Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    move-result-object p0

    return-object p0
.end method

.method public load(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/DynamicType$Loaded;
    .locals 2
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Loaded<",
            "TT;>;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lnet/bytebuddy/dynamic/loading/InjectionClassLoader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lnet/bytebuddy/dynamic/loading/InjectionClassLoader;

    .line 7
    .line 8
    invoke-virtual {v0}, Lnet/bytebuddy/dynamic/loading/InjectionClassLoader;->isSealed()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    sget-object p1, Lnet/bytebuddy/dynamic/loading/InjectionClassLoader$Strategy;->INSTANCE:Lnet/bytebuddy/dynamic/loading/InjectionClassLoader$Strategy;

    .line 15
    .line 16
    invoke-virtual {p0, v0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Default$Unloaded;->load(Ljava/lang/ClassLoader;Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Loaded;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->WRAPPER:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 22
    .line 23
    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/dynamic/DynamicType$Default$Unloaded;->load(Ljava/lang/ClassLoader;Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Loaded;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public load(Ljava/lang/ClassLoader;Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Loaded;
    .locals 6
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/ClassLoader;",
            ">(TS;",
            "Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy<",
            "-TS;>;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Loaded<",
            "TT;>;"
        }
    .end annotation

    .line 28
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Default$Loaded;

    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->binaryRepresentation:[B

    iget-object v3, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    iget-object v4, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->auxiliaryTypes:Ljava/util/List;

    iget-object v5, p0, Lnet/bytebuddy/dynamic/DynamicType$Default$Unloaded;->typeResolutionStrategy:Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Resolved;

    .line 29
    invoke-interface {v5, p0, p1, p2}, Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Resolved;->initialize(Lnet/bytebuddy/dynamic/DynamicType;Ljava/lang/ClassLoader;Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;)Ljava/util/Map;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/dynamic/DynamicType$Default$Loaded;-><init>(Lnet/bytebuddy/description/type/TypeDescription;[BLnet/bytebuddy/implementation/LoadedTypeInitializer;Ljava/util/List;Ljava/util/Map;)V

    return-object v0
.end method
