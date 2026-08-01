.class public final L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final synthetic 飘花落叶言子楪世苏兰哲:I


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Landroidx/window/core/VerificationMode;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/window/core/VerificationMode;->QUIET:Landroidx/window/core/VerificationMode;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/window/core/VerificationMode;

    .line 10
    .line 11
    return-void
.end method

.method public static final 飘花落叶言子楪世兰哲苏(Landroidx/window/sidecar/SidecarDisplayFeature;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 28
    return p0
.end method

.method public static final 飘花落叶言子楪世兰苏哲(Landroidx/window/sidecar/SidecarDisplayFeature;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/window/sidecar/SidecarDisplayFeature;->getType()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/window/sidecar/SidecarDisplayFeature;->getType()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 v0, 0x2

    .line 16
    if-ne p0, v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_1
    :goto_0
    return v1
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/util/List;Ljava/util/List;)Z
    .locals 5

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    if-nez p0, :cond_1

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_1
    if-nez p1, :cond_2

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eq v1, v2, :cond_3

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_3
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    move v2, v0

    .line 27
    :goto_0
    if-ge v2, v1, :cond_5

    .line 28
    .line 29
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Landroidx/window/sidecar/SidecarDisplayFeature;

    .line 34
    .line 35
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Landroidx/window/sidecar/SidecarDisplayFeature;

    .line 40
    .line 41
    invoke-static {v3, v4}, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDisplayFeature;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_4

    .line 46
    .line 47
    :goto_1
    return v0

    .line 48
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    :goto_2
    const/4 p0, 0x1

    .line 52
    return p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDisplayFeature;)Z
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    if-nez p0, :cond_1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    if-nez p1, :cond_2

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_2
    invoke-virtual {p0}, Landroidx/window/sidecar/SidecarDisplayFeature;->getType()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1}, Landroidx/window/sidecar/SidecarDisplayFeature;->getType()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eq v0, v1, :cond_3

    .line 24
    .line 25
    :goto_0
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_3
    invoke-virtual {p0}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p1}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0
.end method

.method public static final 飘花落叶言子楪苏世兰哲(Landroidx/window/sidecar/SidecarDisplayFeature;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 17
    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 24
    return p0
.end method

.method public static final 飘花落叶言子楪苏世哲兰(Landroidx/window/sidecar/SidecarDisplayFeature;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/window/sidecar/SidecarDisplayFeature;->getType()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_1
    :goto_0
    return v1
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏(Ljava/util/List;Landroidx/window/sidecar/SidecarDeviceState;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroidx/window/sidecar/SidecarDisplayFeature;

    .line 24
    .line 25
    invoke-virtual {p0, v1, p2}, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDeviceState;)Landroidx/window/layout/飘花落叶言子楪世哲苏兰;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-object v0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarDeviceState;)Landroidx/window/layout/飘花落叶言子楪苏兰世哲;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroidx/window/layout/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    sget-object p1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Landroidx/window/layout/飘花落叶言子楪苏兰世哲;-><init>(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, Landroidx/window/sidecar/SidecarDeviceState;

    .line 12
    .line 13
    invoke-direct {v0}, Landroidx/window/sidecar/SidecarDeviceState;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {p2}, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Landroidx/window/sidecar/SidecarDeviceState;)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-static {v0, p2}, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Landroidx/window/sidecar/SidecarDeviceState;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1, v0}, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/util/List;Landroidx/window/sidecar/SidecarDeviceState;)Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance p1, Landroidx/window/layout/飘花落叶言子楪苏兰世哲;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Landroidx/window/layout/飘花落叶言子楪苏兰世哲;-><init>(Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    return-object p1
.end method

.method public final 飘花落叶言子楪苏哲世兰(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDeviceState;)Landroidx/window/layout/飘花落叶言子楪世哲苏兰;
    .locals 3

    .line 1
    sget-object v0, Landroidx/window/layout/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/window/layout/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/window/core/VerificationMode;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v1, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪苏哲世兰;

    .line 12
    .line 13
    sget-object v2, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰哲世苏楪/飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    invoke-direct {v1, p1, p0, v2}, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪苏哲世兰;-><init>(Ljava/lang/Object;Landroidx/window/core/VerificationMode;L飘花落叶言子兰哲世苏楪/飘花落叶言子楪世苏哲兰;)V

    .line 16
    .line 17
    .line 18
    new-instance p0, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "Type must be either TYPE_FOLD or TYPE_HINGE"

    .line 24
    .line 25
    invoke-virtual {v1, v2, p0}, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v1, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪世哲苏兰;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v2, "Feature bounds must not be 0"

    .line 35
    .line 36
    invoke-virtual {p0, v2, v1}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance v1, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪世哲兰苏;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v2, "TYPE_FOLD must have 0 area"

    .line 46
    .line 47
    invoke-virtual {p0, v2, v1}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    new-instance v1, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪世兰苏哲;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v2, "Feature be pinned to either left or top"

    .line 57
    .line 58
    invoke-virtual {p0, v2, v1}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, Landroidx/window/sidecar/SidecarDisplayFeature;

    .line 67
    .line 68
    if-nez p0, :cond_0

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_0
    invoke-virtual {p0}, Landroidx/window/sidecar/SidecarDisplayFeature;->getType()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    const/4 v1, 0x2

    .line 76
    const/4 v2, 0x1

    .line 77
    if-eq p0, v2, :cond_2

    .line 78
    .line 79
    if-eq p0, v1, :cond_1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_1
    sget-object p0, Landroidx/window/layout/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroidx/window/layout/飘花落叶言子楪世苏兰哲;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    sget-object p0, Landroidx/window/layout/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/window/layout/飘花落叶言子楪世苏兰哲;

    .line 86
    .line 87
    :goto_0
    invoke-static {p2}, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Landroidx/window/sidecar/SidecarDeviceState;)I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    if-eqz p2, :cond_5

    .line 92
    .line 93
    if-eq p2, v2, :cond_5

    .line 94
    .line 95
    if-eq p2, v1, :cond_3

    .line 96
    .line 97
    const/4 v1, 0x3

    .line 98
    if-eq p2, v1, :cond_4

    .line 99
    .line 100
    const/4 v1, 0x4

    .line 101
    if-eq p2, v1, :cond_5

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    sget-object v0, Landroidx/window/layout/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/window/layout/飘花落叶言子楪世苏兰哲;

    .line 105
    .line 106
    :cond_4
    :goto_1
    new-instance p2, Landroidx/window/layout/飘花落叶言子楪世哲苏兰;

    .line 107
    .line 108
    new-instance v1, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪世苏兰哲;

    .line 109
    .line 110
    invoke-virtual {p1}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-direct {v1, p1}, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪世苏兰哲;-><init>(Landroid/graphics/Rect;)V

    .line 118
    .line 119
    .line 120
    invoke-direct {p2, v1, p0, v0}, Landroidx/window/layout/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言子兰哲世苏楪/飘花落叶言子楪世苏兰哲;Landroidx/window/layout/飘花落叶言子楪世苏兰哲;Landroidx/window/layout/飘花落叶言子楪世苏兰哲;)V

    .line 121
    .line 122
    .line 123
    return-object p2

    .line 124
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 125
    return-object p0
.end method
