.class public final Landroidx/core/view/飘花落叶言子世兰苏楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世哲苏兰:Landroidx/core/view/飘花落叶言子世楪苏兰哲;

.field public final synthetic 飘花落叶言子楪世苏兰哲:Landroid/view/View;

.field public 飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子哲兰世苏楪;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroidx/core/view/飘花落叶言子世楪苏兰哲;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/core/view/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世苏兰哲:Landroid/view/View;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/core/view/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/core/view/飘花落叶言子世楪苏兰哲;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Landroidx/core/view/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 5

    .line 1
    invoke-static {p1, p2}, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪苏世兰哲(Landroid/view/View;Landroid/view/WindowInsets;)Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/core/view/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/core/view/飘花落叶言子世楪苏兰哲;

    .line 8
    .line 9
    const/16 v3, 0x1e

    .line 10
    .line 11
    if-ge v1, v3, :cond_0

    .line 12
    .line 13
    iget-object v4, p0, Landroidx/core/view/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世苏兰哲:Landroid/view/View;

    .line 14
    .line 15
    invoke-static {p2, v4}, Landroidx/core/view/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世苏哲兰(Landroid/view/WindowInsets;Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, Landroidx/core/view/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 19
    .line 20
    invoke-virtual {v0, p2}, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    invoke-interface {v2, p1, v0}, Landroidx/core/view/飘花落叶言子世楪苏兰哲;->飘花落叶言子苏兰楪世哲(Landroid/view/View;Landroidx/core/view/飘花落叶言子哲兰世苏楪;)Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪苏世哲兰()Landroid/view/WindowInsets;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_0
    iput-object v0, p0, Landroidx/core/view/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 36
    .line 37
    invoke-interface {v2, p1, v0}, Landroidx/core/view/飘花落叶言子世楪苏兰哲;->飘花落叶言子苏兰楪世哲(Landroid/view/View;Landroidx/core/view/飘花落叶言子哲兰世苏楪;)Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-lt v1, v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪苏世哲兰()Landroid/view/WindowInsets;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_1
    sget-object p2, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪苏世哲兰()Landroid/view/WindowInsets;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method
