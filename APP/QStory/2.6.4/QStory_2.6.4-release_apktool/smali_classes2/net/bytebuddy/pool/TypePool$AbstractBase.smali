.class public abstract Lnet/bytebuddy/pool/TypePool$AbstractBase;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/pool/TypePool;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AbstractBase"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/pool/TypePool$AbstractBase$ArrayTypeResolution;,
        Lnet/bytebuddy/pool/TypePool$AbstractBase$Hierarchical;,
        Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field protected static final PRIMITIVE_DESCRIPTORS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected static final PRIMITIVE_TYPES:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected final cacheProvider:Lnet/bytebuddy/pool/TypePool$CacheProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v9, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    sget-object v10, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    sget-object v3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    sget-object v4, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    sget-object v5, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 22
    .line 23
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    sget-object v8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    filled-new-array/range {v2 .. v10}, [Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const/4 v3, 0x0

    .line 34
    :goto_0
    const/16 v4, 0x9

    .line 35
    .line 36
    if-ge v3, v4, :cond_0

    .line 37
    .line 38
    aget-object v4, v2, v3

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-static {v4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    invoke-static {v4}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Lnet/bytebuddy/pool/TypePool$AbstractBase;->PRIMITIVE_TYPES:Ljava/util/Map;

    .line 70
    .line 71
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, Lnet/bytebuddy/pool/TypePool$AbstractBase;->PRIMITIVE_DESCRIPTORS:Ljava/util/Map;

    .line 76
    .line 77
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase;->cacheProvider:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase;->cacheProvider:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$CacheProvider;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;
    .locals 4

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_6

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :goto_0
    const-string v2, "["

    .line 12
    .line 13
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x1

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-lez v0, :cond_3

    .line 28
    .line 29
    sget-object v2, Lnet/bytebuddy/pool/TypePool$AbstractBase;->PRIMITIVE_DESCRIPTORS:Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/lang/String;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    move-object p1, v2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string v2, "L"

    .line 42
    .line 43
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    const-string v2, ";"

    .line 50
    .line 51
    invoke-virtual {p1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-static {v3, v3, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰世哲(IILjava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const-string p0, "Not a legitimate array type descriptor: "

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    :goto_1
    sget-object v1, Lnet/bytebuddy/pool/TypePool$AbstractBase;->PRIMITIVE_TYPES:Ljava/util/Map;

    .line 73
    .line 74
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Lnet/bytebuddy/description/type/TypeDescription;

    .line 79
    .line 80
    if-nez v1, :cond_4

    .line 81
    .line 82
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase;->cacheProvider:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 83
    .line 84
    invoke-interface {v1, p1}, Lnet/bytebuddy/pool/TypePool$CacheProvider;->find(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    goto :goto_2

    .line 89
    :cond_4
    new-instance v2, Lnet/bytebuddy/pool/TypePool$Resolution$Simple;

    .line 90
    .line 91
    invoke-direct {v2, v1}, Lnet/bytebuddy/pool/TypePool$Resolution$Simple;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 92
    .line 93
    .line 94
    move-object v1, v2

    .line 95
    :goto_2
    if-nez v1, :cond_5

    .line 96
    .line 97
    invoke-virtual {p0, p1}, Lnet/bytebuddy/pool/TypePool$AbstractBase;->doDescribe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {p0, p1, v1}, Lnet/bytebuddy/pool/TypePool$AbstractBase;->doCache(Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$Resolution;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    :cond_5
    invoke-static {v1, v0}, Lnet/bytebuddy/pool/TypePool$AbstractBase$ArrayTypeResolution;->of(Lnet/bytebuddy/pool/TypePool$Resolution;I)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :cond_6
    const-string p0, " contains the illegal character \'/\'"

    .line 111
    .line 112
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return-object v1
.end method

.method public doCache(Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$Resolution;)Lnet/bytebuddy/pool/TypePool$Resolution;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase;->cacheProvider:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/pool/TypePool$CacheProvider;->register(Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$Resolution;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public abstract doDescribe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;
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
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase;->cacheProvider:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/pool/TypePool$AbstractBase;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/pool/TypePool$AbstractBase;->cacheProvider:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase;->cacheProvider:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method
