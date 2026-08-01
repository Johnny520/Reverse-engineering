.class public Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Compiled;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Compiled"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final implementations:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;",
            ">;"
        }
    .end annotation
.end field

.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

.field private final methods:Lnet/bytebuddy/description/method/MethodList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/description/method/MethodList<",
            "*>;"
        }
    .end annotation
.end field

.field private final supportsBridges:Z

.field private final typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/description/method/MethodList;Ljava/util/LinkedHashMap;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/implementation/LoadedTypeInitializer;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;",
            "Lnet/bytebuddy/description/method/MethodList<",
            "*>;",
            "Ljava/util/LinkedHashMap<",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->methods:Lnet/bytebuddy/description/method/MethodList;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->implementations:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    iput-boolean p6, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->supportsBridges:Z

    .line 15
    .line 16
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
    iget-boolean v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->supportsBridges:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->supportsBridges:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 52
    .line 53
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->methods:Lnet/bytebuddy/description/method/MethodList;

    .line 63
    .line 64
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->methods:Lnet/bytebuddy/description/method/MethodList;

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_7

    .line 71
    .line 72
    return v1

    .line 73
    :cond_7
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->implementations:Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    iget-object p1, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->implementations:Ljava/util/LinkedHashMap;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-nez p0, :cond_8

    .line 82
    .line 83
    return v1

    .line 84
    :cond_8
    return v0
.end method

.method public getInstrumentedMethods()Lnet/bytebuddy/description/method/MethodList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/method/MethodList<",
            "*>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/method/MethodList$Explicit;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->implementations:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/method/MethodList$Explicit;-><init>(Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isTypeInitializer()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {v0, p0}, Lnet/bytebuddy/matcher/FilterableList$AbstractBase;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Lnet/bytebuddy/description/method/MethodList;

    .line 30
    .line 31
    return-object p0
.end method

.method public getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLoadedTypeInitializer()Lnet/bytebuddy/implementation/LoadedTypeInitializer;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMethods()Lnet/bytebuddy/description/method/MethodList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/method/MethodList<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->methods:Lnet/bytebuddy/description/method/MethodList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTypeInitializer()Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3

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
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v2, v0

    .line 25
    mul-int/2addr v2, v1

    .line 26
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    add-int/2addr v0, v2

    .line 33
    mul-int/2addr v0, v1

    .line 34
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->methods:Lnet/bytebuddy/description/method/MethodList;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->implementations:Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/2addr v0, v2

    .line 49
    mul-int/2addr v0, v1

    .line 50
    iget-boolean p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->supportsBridges:Z

    .line 51
    .line 52
    add-int/2addr v0, p0

    .line 53
    return v0
.end method

.method public target(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->implementations:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record$ForNonImplementedMethod;

    .line 12
    .line 13
    invoke-direct {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record$ForNonImplementedMethod;-><init>(Lnet/bytebuddy/description/method/MethodDescription;)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    iget-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 18
    .line 19
    iget-boolean p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;->supportsBridges:Z

    .line 20
    .line 21
    invoke-virtual {v0, p1, p0}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->bind(Lnet/bytebuddy/description/type/TypeDescription;Z)Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
