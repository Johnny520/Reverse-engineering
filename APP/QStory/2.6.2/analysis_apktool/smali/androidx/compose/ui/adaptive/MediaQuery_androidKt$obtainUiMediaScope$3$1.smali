.class final Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$3$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
        "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u54f2\u82cf\u4e16;",
        "invoke",
        "(Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;)Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u54f2\u82cf\u4e16;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $scope:Landroidx/compose/ui/adaptive/飘花落叶言子楪世哲兰苏;

.field final synthetic $view:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroidx/compose/ui/adaptive/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$3$1;->$view:Landroid/view/View;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$3$1;->$scope:Landroidx/compose/ui/adaptive/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final invoke$lambda$0(Landroidx/compose/ui/adaptive/飘花落叶言子楪世哲兰苏;Landroid/view/View;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/core/view/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰(Landroid/view/View;)Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    iget-object p1, p1, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子哲苏兰世楪;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroidx/core/view/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪兰苏世哲(I)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/adaptive/飘花落叶言子楪世哲兰苏;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$3$1;->invoke$lambda$0(Landroidx/compose/ui/adaptive/飘花落叶言子楪世哲兰苏;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/runtime/飘花落叶言子世楪苏哲兰;)Landroidx/compose/runtime/飘花落叶言子楪兰哲苏世;
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$3$1;->$view:Landroid/view/View;

    .line 2
    .line 3
    new-instance v0, Landroidx/compose/ui/adaptive/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, v1, p1}, Landroidx/compose/ui/adaptive/飘花落叶言子楪世苏兰哲;-><init>(Landroidx/compose/ui/adaptive/飘花落叶言子楪世哲兰苏;Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$3$1;->$view:Landroid/view/View;

    .line 17
    .line 18
    new-instance p1, Landroidx/activity/compose/飘花落叶言子楪苏世哲兰;

    .line 19
    .line 20
    const/4 v1, 0x7

    .line 21
    invoke-direct {p1, p0, v1, v0}, Landroidx/activity/compose/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 25
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子世楪苏哲兰;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$3$1;->invoke(Landroidx/compose/runtime/飘花落叶言子世楪苏哲兰;)Landroidx/compose/runtime/飘花落叶言子楪兰哲苏世;

    move-result-object p0

    return-object p0
.end method
