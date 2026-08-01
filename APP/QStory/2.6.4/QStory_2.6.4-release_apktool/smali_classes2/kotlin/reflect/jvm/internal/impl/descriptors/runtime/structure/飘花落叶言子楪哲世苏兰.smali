.class public final Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪哲世苏兰;
.super Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪哲兰苏世;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世楪哲苏兰子/飘花落叶言子楪世哲兰苏;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/reflect/Constructor;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Constructor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/reflect/Constructor;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getTypeParameters()Ljava/util/ArrayList;
    .locals 5

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    array-length v1, p0

    .line 13
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    array-length v1, p0

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v1, :cond_0

    .line 19
    .line 20
    aget-object v3, p0, v2

    .line 21
    .line 22
    new-instance v4, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪兰哲苏世;

    .line 23
    .line 24
    invoke-direct {v4, v3}, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪兰哲苏世;-><init>(Ljava/lang/reflect/TypeVariable;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏兰哲()Ljava/lang/reflect/Member;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    return-object p0
.end method
