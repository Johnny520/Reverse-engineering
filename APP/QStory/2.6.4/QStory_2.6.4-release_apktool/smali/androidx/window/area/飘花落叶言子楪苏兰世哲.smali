.class public final Landroidx/window/area/飘花落叶言子楪苏兰世哲;
.super Landroidx/window/area/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final synthetic 飘花落叶言子楪世兰苏哲:I


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/HashMap;

.field public 飘花落叶言子楪世哲苏兰:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

.field public final 飘花落叶言子楪世苏兰哲:Landroidx/window/extensions/area/WindowAreaComponent;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Landroidx/window/area/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    sget-object v1, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;->getSimpleName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Landroidx/window/extensions/area/WindowAreaComponent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/window/area/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Landroidx/window/extensions/area/WindowAreaComponent;

    .line 5
    .line 6
    sget-object p1, Landroidx/window/area/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    iput-object p1, p0, Landroidx/window/area/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 9
    .line 10
    new-instance p1, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Landroidx/window/area/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Ljava/util/HashMap;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Landroidx/window/area/飘花落叶言子楪世哲兰苏;Landroidx/window/area/飘花落叶言子楪世哲兰苏;Landroidx/window/layout/飘花落叶言子楪苏兰哲世;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/window/area/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "WINDOW_AREA_REAR_DISPLAY"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Landroidx/window/area/飘花落叶言子楪哲世苏兰;

    .line 10
    .line 11
    sget-object v3, Landroidx/window/area/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 12
    .line 13
    if-eq p2, v3, :cond_1

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    new-instance v2, Landroidx/window/area/飘花落叶言子楪哲世苏兰;

    .line 18
    .line 19
    invoke-static {}, Landroidx/core/view/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世兰苏哲()Landroid/os/Binder;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object p0, p0, Landroidx/window/area/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Landroidx/window/extensions/area/WindowAreaComponent;

    .line 24
    .line 25
    invoke-direct {v2, p3, v3, p0}, Landroidx/window/area/飘花落叶言子楪哲世苏兰;-><init>(Landroidx/window/layout/飘花落叶言子楪苏兰哲世;Landroid/os/Binder;Landroidx/window/extensions/area/WindowAreaComponent;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    new-instance p0, Landroidx/window/area/飘花落叶言子楪世兰苏哲;

    .line 29
    .line 30
    invoke-direct {p0, p1, p2}, Landroidx/window/area/飘花落叶言子楪世兰苏哲;-><init>(Landroidx/window/area/飘花落叶言子楪世哲兰苏;Landroidx/window/area/飘花落叶言子楪世哲兰苏;)V

    .line 31
    .line 32
    .line 33
    iget-object p2, v2, Landroidx/window/area/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {p2, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iput-object p3, v2, Landroidx/window/area/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/window/layout/飘花落叶言子楪苏兰哲世;

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    if-eqz v2, :cond_4

    .line 45
    .line 46
    iget-object p0, v2, Landroidx/window/area/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    :cond_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    check-cast v2, Landroidx/window/area/飘花落叶言子楪世兰苏哲;

    .line 70
    .line 71
    iget-object v2, v2, Landroidx/window/area/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 72
    .line 73
    if-eq v2, v3, :cond_2

    .line 74
    .line 75
    new-instance p3, Landroidx/window/area/飘花落叶言子楪世兰苏哲;

    .line 76
    .line 77
    invoke-direct {p3, p1, p2}, Landroidx/window/area/飘花落叶言子楪世兰苏哲;-><init>(Landroidx/window/area/飘花落叶言子楪世哲兰苏;Landroidx/window/area/飘花落叶言子楪世哲兰苏;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :cond_4
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(Landroidx/window/extensions/area/ExtensionWindowAreaStatus;)V
    .locals 9

    .line 1
    invoke-interface {p1}, Landroidx/window/extensions/area/ExtensionWindowAreaStatus;->getWindowAreaStatus()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sget-object v2, Landroidx/window/area/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 10
    .line 11
    sget-object v3, Landroidx/window/area/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 12
    .line 13
    sget-object v4, Landroidx/window/area/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 14
    .line 15
    sget-object v5, Landroidx/window/area/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 16
    .line 17
    const/4 v6, 0x2

    .line 18
    const/4 v7, 0x1

    .line 19
    const/4 v8, 0x3

    .line 20
    if-gt v1, v8, :cond_0

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    if-eq v0, v7, :cond_4

    .line 25
    .line 26
    if-eq v0, v6, :cond_2

    .line 27
    .line 28
    if-eq v0, v8, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    if-eqz v0, :cond_3

    .line 32
    .line 33
    if-eq v0, v7, :cond_4

    .line 34
    .line 35
    if-eq v0, v6, :cond_2

    .line 36
    .line 37
    if-eq v0, v8, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v2, v5

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object v2, v3

    .line 43
    goto :goto_1

    .line 44
    :cond_3
    :goto_0
    move-object v2, v4

    .line 45
    :cond_4
    :goto_1
    iput-object v2, p0, Landroidx/window/area/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 46
    .line 47
    sget-object v0, Landroidx/window/layout/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/window/layout/飘花落叶言子楪哲世苏兰;

    .line 48
    .line 49
    invoke-interface {p1}, Landroidx/window/extensions/area/ExtensionWindowAreaStatus;->getWindowAreaDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance v0, Landroidx/window/layout/飘花落叶言子楪苏兰哲世;

    .line 60
    .line 61
    new-instance v1, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪世苏兰哲;

    .line 62
    .line 63
    iget v2, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 64
    .line 65
    iget v3, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-direct {v1, v4, v4, v2, v3}, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪世苏兰哲;-><init>(IIII)V

    .line 69
    .line 70
    .line 71
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 72
    .line 73
    invoke-direct {v0, v1, p1}, Landroidx/window/layout/飘花落叶言子楪苏兰哲世;-><init>(L飘花落叶言子兰哲世苏楪/飘花落叶言子楪世苏兰哲;F)V

    .line 74
    .line 75
    .line 76
    sget-object p1, Landroidx/window/area/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 77
    .line 78
    iget-object v1, p0, Landroidx/window/area/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 79
    .line 80
    invoke-virtual {p0, p1, v1, v0}, Landroidx/window/area/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Landroidx/window/area/飘花落叶言子楪世哲兰苏;Landroidx/window/area/飘花落叶言子楪世哲兰苏;Landroidx/window/layout/飘花落叶言子楪苏兰哲世;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(I)V
    .locals 9

    .line 1
    sget-object v0, Landroidx/window/layout/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/window/layout/飘花落叶言子楪哲世苏兰;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/window/area/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Landroidx/window/extensions/area/WindowAreaComponent;

    .line 4
    .line 5
    invoke-interface {v1}, Landroidx/window/extensions/area/WindowAreaComponent;->getRearDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, Landroidx/window/layout/飘花落叶言子楪苏兰哲世;

    .line 16
    .line 17
    new-instance v2, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪世苏兰哲;

    .line 18
    .line 19
    iget v3, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 20
    .line 21
    iget v4, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-direct {v2, v5, v5, v3, v4}, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪世苏兰哲;-><init>(IIII)V

    .line 25
    .line 26
    .line 27
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 28
    .line 29
    invoke-direct {v0, v2, v1}, Landroidx/window/layout/飘花落叶言子楪苏兰哲世;-><init>(L飘花落叶言子兰哲世苏楪/飘花落叶言子楪世苏兰哲;F)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    sget-object v2, Landroidx/window/area/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 37
    .line 38
    sget-object v3, Landroidx/window/area/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 39
    .line 40
    sget-object v4, Landroidx/window/area/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 41
    .line 42
    sget-object v5, Landroidx/window/area/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 43
    .line 44
    const/4 v6, 0x2

    .line 45
    const/4 v7, 0x1

    .line 46
    const/4 v8, 0x3

    .line 47
    if-gt v1, v8, :cond_0

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    if-eq p1, v7, :cond_4

    .line 52
    .line 53
    if-eq p1, v6, :cond_2

    .line 54
    .line 55
    if-eq p1, v8, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    if-eqz p1, :cond_3

    .line 59
    .line 60
    if-eq p1, v7, :cond_4

    .line 61
    .line 62
    if-eq p1, v6, :cond_2

    .line 63
    .line 64
    if-eq p1, v8, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    move-object v2, v5

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move-object v2, v3

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    :goto_0
    move-object v2, v4

    .line 72
    :cond_4
    :goto_1
    sget-object p1, Landroidx/window/area/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 73
    .line 74
    invoke-virtual {p0, p1, v2, v0}, Landroidx/window/area/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Landroidx/window/area/飘花落叶言子楪世哲兰苏;Landroidx/window/area/飘花落叶言子楪世哲兰苏;Landroidx/window/layout/飘花落叶言子楪苏兰哲世;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method
