.class public final L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰苏哲;
.implements L飘花落叶言子兰哲世楪苏/飘花落叶言子楪苏世哲兰;


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰哲苏;

.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰哲苏;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    new-instance v0, L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰哲苏;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public 飘花落叶言子楪世哲兰苏(Landroid/content/Context;)F
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
    invoke-virtual {p0}, Landroid/view/WindowMetrics;->getDensity()F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public 飘花落叶言子楪世哲苏兰(Landroid/content/Context;L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰苏哲;)Landroidx/window/layout/飘花落叶言子楪苏兰哲世;
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
    invoke-virtual {p1}, Landroid/content/Context;->isUiContext()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const-class p2, Landroid/view/WindowManager;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Landroid/view/WindowManager;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Landroid/view/WindowManager;

    .line 31
    .line 32
    :goto_0
    new-instance p1, Landroidx/window/layout/飘花落叶言子楪苏兰哲世;

    .line 33
    .line 34
    invoke-interface {p0}, Landroid/view/WindowManager;->getCurrentWindowMetrics()Landroid/view/WindowMetrics;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p2}, Landroid/view/WindowMetrics;->getBounds()Landroid/graphics/Rect;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-interface {p0}, Landroid/view/WindowManager;->getCurrentWindowMetrics()Landroid/view/WindowMetrics;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Landroid/view/WindowMetrics;->getDensity()F

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-direct {p1, p2, p0}, Landroidx/window/layout/飘花落叶言子楪苏兰哲世;-><init>(Landroid/graphics/Rect;F)V

    .line 54
    .line 55
    .line 56
    return-object p1
.end method

.method public 飘花落叶言子楪世苏兰哲(Landroid/app/Activity;L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰苏哲;)Landroidx/window/layout/飘花落叶言子楪苏兰哲世;
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
    new-instance v0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;

    .line 10
    .line 11
    sget-object v1, L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {}, L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世苏兰哲;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1, p1}, L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, v1}, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;-><init>(Landroid/graphics/Rect;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p2, p1}, L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-direct {p0, v0, p1}, Landroidx/window/layout/飘花落叶言子楪苏兰哲世;-><init>(L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;F)V

    .line 32
    .line 33
    .line 34
    return-object p0
.end method
