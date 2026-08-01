.class public final L飘花落叶言世楪苏哲子兰/飘花落叶言子楪世苏哲兰;
.super L飘花落叶言世楪兰子哲苏/飘花落叶言子楪哲世兰苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪世兰苏哲:Z

.field public final synthetic 飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashSet;

.field public final synthetic 飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲苏世兰;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲苏世兰;Ljava/util/LinkedHashSet;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世楪苏哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲苏世兰;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世楪苏哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    iput-boolean p3, p0, L飘花落叶言世楪苏哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Z

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(I)V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x2

    .line 7
    const/4 v5, 0x1

    .line 8
    if-eq p0, v5, :cond_3

    .line 9
    .line 10
    if-eq p0, v4, :cond_2

    .line 11
    .line 12
    if-eq p0, v0, :cond_1

    .line 13
    .line 14
    if-eq p0, v2, :cond_0

    .line 15
    .line 16
    const-string v6, "fakeOverride"

    .line 17
    .line 18
    aput-object v6, v1, v3

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string v6, "overridden"

    .line 22
    .line 23
    aput-object v6, v1, v3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const-string v6, "member"

    .line 27
    .line 28
    aput-object v6, v1, v3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const-string v6, "fromCurrent"

    .line 32
    .line 33
    aput-object v6, v1, v3

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    const-string v6, "fromSuper"

    .line 37
    .line 38
    aput-object v6, v1, v3

    .line 39
    .line 40
    :goto_0
    const-string v3, "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1"

    .line 41
    .line 42
    aput-object v3, v1, v5

    .line 43
    .line 44
    if-eq p0, v5, :cond_5

    .line 45
    .line 46
    if-eq p0, v4, :cond_5

    .line 47
    .line 48
    if-eq p0, v0, :cond_4

    .line 49
    .line 50
    if-eq p0, v2, :cond_4

    .line 51
    .line 52
    const-string p0, "addFakeOverride"

    .line 53
    .line 54
    aput-object p0, v1, v4

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_4
    const-string p0, "setOverriddenDescriptors"

    .line 58
    .line 59
    aput-object p0, v1, v4

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    const-string p0, "conflict"

    .line 63
    .line 64
    aput-object p0, v1, v4

    .line 65
    .line 66
    :goto_1
    const-string p0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 67
    .line 68
    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏(Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪世哲苏兰;Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 p0, 0x2

    .line 5
    invoke-static {p0}, L飘花落叶言世楪苏哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    throw p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪世哲苏兰;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Landroidx/compose/foundation/text/飘花落叶言子苏楪兰哲世;

    .line 4
    .line 5
    const/16 v1, 0x1d

    .line 6
    .line 7
    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/text/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, L飘花落叶言世楪兰子哲苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世(Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪世哲苏兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, L飘花落叶言世楪苏哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    invoke-static {p0}, L飘花落叶言世楪苏哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    throw p0
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪世哲苏兰;Ljava/util/Collection;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-boolean p0, p0, L飘花落叶言世楪苏哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Z

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪世哲苏兰;->getKind()Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;->FAKE_OVERRIDE:Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;

    .line 12
    .line 13
    if-eq p0, v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-interface {p1, p2}, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪世哲苏兰;->飘花落叶言子苏世哲兰楪(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    const/4 p0, 0x3

    .line 21
    invoke-static {p0}, L飘花落叶言世楪苏哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    throw p0
.end method
