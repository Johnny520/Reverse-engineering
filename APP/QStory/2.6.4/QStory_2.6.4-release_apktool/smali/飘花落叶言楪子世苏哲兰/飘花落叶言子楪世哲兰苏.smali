.class public final L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;
.implements L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    new-instance v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public 飘花落叶言子楪世哲兰苏(Landroid/content/Context;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)Landroidx/window/layout/飘花落叶言子楪苏兰哲世;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const-class p0, Landroid/view/WindowManager;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Landroid/view/WindowManager;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 24
    .line 25
    new-instance p2, Landroidx/window/layout/飘花落叶言子楪苏兰哲世;

    .line 26
    .line 27
    invoke-interface {p0}, Landroid/view/WindowManager;->getCurrentWindowMetrics()Landroid/view/WindowMetrics;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Landroid/view/WindowMetrics;->getBounds()Landroid/graphics/Rect;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-direct {p2, p0, p1}, Landroidx/window/layout/飘花落叶言子楪苏兰哲世;-><init>(Landroid/graphics/Rect;F)V

    .line 39
    .line 40
    .line 41
    return-object p2
.end method

.method public 飘花落叶言子楪世哲苏兰(Landroid/app/Activity;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)Landroidx/window/layout/飘花落叶言子楪苏兰哲世;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Landroidx/window/layout/飘花落叶言子楪苏兰哲世;

    .line 8
    .line 9
    new-instance v0, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪世苏兰哲;

    .line 10
    .line 11
    sget-object v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, v1}, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪世苏兰哲;-><init>(Landroid/graphics/Rect;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p2, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-direct {p0, v0, p1}, Landroidx/window/layout/飘花落叶言子楪苏兰哲世;-><init>(L飘花落叶言子兰哲世苏楪/飘花落叶言子楪世苏兰哲;F)V

    .line 32
    .line 33
    .line 34
    return-object p0
.end method

.method public 飘花落叶言子楪世苏哲兰(Landroid/app/Activity;)Landroid/graphics/Rect;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-class p0, Landroid/view/WindowManager;

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Landroid/view/WindowManager;

    .line 11
    .line 12
    invoke-interface {p0}, Landroid/view/WindowManager;->getCurrentWindowMetrics()Landroid/view/WindowMetrics;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Landroid/view/WindowMetrics;->getBounds()Landroid/graphics/Rect;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-object p0
.end method
