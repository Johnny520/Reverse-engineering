.class public Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ModuleToken"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final exports:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Exports;",
            ">;"
        }
    .end annotation
.end field

.field private final mainClass:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final modifiers:I

.field private final name:Ljava/lang/String;

.field private final opens:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Opens;",
            ">;"
        }
    .end annotation
.end field

.field private final packages:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final provides:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Provides;",
            ">;"
        }
    .end annotation
.end field

.field private final requires:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Requires;",
            ">;"
        }
    .end annotation
.end field

.field private final uses:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final version:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V
    .locals 0
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Requires;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Exports;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Opens;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Provides;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->name:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->modifiers:I

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->version:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->mainClass:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->packages:Ljava/util/Set;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->requires:Ljava/util/Map;

    .line 15
    .line 16
    iput-object p7, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->exports:Ljava/util/Map;

    .line 17
    .line 18
    iput-object p8, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->opens:Ljava/util/Map;

    .line 19
    .line 20
    iput-object p9, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->uses:Ljava/util/Set;

    .line 21
    .line 22
    iput-object p10, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->provides:Ljava/util/Map;

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic access$1300(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyModuleDescription;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->toModuleDescription(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyModuleDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private toModuleDescription(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyModuleDescription;
    .locals 12

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyModuleDescription;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->name:Ljava/lang/String;

    .line 7
    .line 8
    iget v3, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->modifiers:I

    .line 9
    .line 10
    iget-object v4, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->version:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v5, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->mainClass:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v6, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->packages:Ljava/util/Set;

    .line 15
    .line 16
    iget-object v7, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->requires:Ljava/util/Map;

    .line 17
    .line 18
    iget-object v8, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->exports:Ljava/util/Map;

    .line 19
    .line 20
    iget-object v9, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->opens:Ljava/util/Map;

    .line 21
    .line 22
    iget-object v10, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->uses:Ljava/util/Set;

    .line 23
    .line 24
    iget-object v11, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->provides:Ljava/util/Map;

    .line 25
    .line 26
    move-object v1, p1

    .line 27
    invoke-direct/range {v0 .. v11}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyModuleDescription;-><init>(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V

    .line 28
    .line 29
    .line 30
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
    iget v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->modifiers:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->modifiers:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->name:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->name:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->version:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->version:Ljava/lang/String;

    .line 43
    .line 44
    if-eqz v3, :cond_5

    .line 45
    .line 46
    if-eqz v2, :cond_6

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_7

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    if-eqz v2, :cond_7

    .line 56
    .line 57
    :cond_6
    return v1

    .line 58
    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->mainClass:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->mainClass:Ljava/lang/String;

    .line 61
    .line 62
    if-eqz v3, :cond_8

    .line 63
    .line 64
    if-eqz v2, :cond_9

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_a

    .line 71
    .line 72
    return v1

    .line 73
    :cond_8
    if-eqz v2, :cond_a

    .line 74
    .line 75
    :cond_9
    return v1

    .line 76
    :cond_a
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->packages:Ljava/util/Set;

    .line 77
    .line 78
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->packages:Ljava/util/Set;

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_b

    .line 85
    .line 86
    return v1

    .line 87
    :cond_b
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->requires:Ljava/util/Map;

    .line 88
    .line 89
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->requires:Ljava/util/Map;

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_c

    .line 96
    .line 97
    return v1

    .line 98
    :cond_c
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->exports:Ljava/util/Map;

    .line 99
    .line 100
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->exports:Ljava/util/Map;

    .line 101
    .line 102
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-nez v2, :cond_d

    .line 107
    .line 108
    return v1

    .line 109
    :cond_d
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->opens:Ljava/util/Map;

    .line 110
    .line 111
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->opens:Ljava/util/Map;

    .line 112
    .line 113
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-nez v2, :cond_e

    .line 118
    .line 119
    return v1

    .line 120
    :cond_e
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->uses:Ljava/util/Set;

    .line 121
    .line 122
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->uses:Ljava/util/Set;

    .line 123
    .line 124
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-nez v2, :cond_f

    .line 129
    .line 130
    return v1

    .line 131
    :cond_f
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->provides:Ljava/util/Map;

    .line 132
    .line 133
    iget-object p1, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->provides:Ljava/util/Map;

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-nez p0, :cond_10

    .line 140
    .line 141
    return v1

    .line 142
    :cond_10
    return v0
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
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->name:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->modifiers:I

    .line 19
    .line 20
    add-int/2addr v0, v2

    .line 21
    mul-int/2addr v0, v1

    .line 22
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->version:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-int/2addr v0, v2

    .line 31
    :cond_0
    mul-int/2addr v0, v1

    .line 32
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->mainClass:Ljava/lang/String;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v0, v2

    .line 41
    :cond_1
    mul-int/2addr v0, v1

    .line 42
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->packages:Ljava/util/Set;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v0

    .line 49
    mul-int/2addr v2, v1

    .line 50
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->requires:Ljava/util/Map;

    .line 51
    .line 52
    invoke-static {v0, v2, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->exports:Ljava/util/Map;

    .line 57
    .line 58
    invoke-static {v2, v0, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->opens:Ljava/util/Map;

    .line 63
    .line 64
    invoke-static {v2, v0, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->uses:Ljava/util/Set;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    add-int/2addr v2, v0

    .line 75
    mul-int/2addr v2, v1

    .line 76
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;->provides:Ljava/util/Map;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    add-int/2addr p0, v2

    .line 83
    return p0
.end method
