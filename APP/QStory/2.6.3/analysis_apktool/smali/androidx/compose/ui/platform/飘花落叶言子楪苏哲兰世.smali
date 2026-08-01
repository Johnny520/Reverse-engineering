.class public final Landroidx/compose/ui/platform/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroidx/compose/ui/platform/飘花落叶言子苏楪兰哲世;


# instance fields
.field public 飘花落叶言子楪世苏兰哲:Landroid/content/ClipboardManager;

.field public final 飘花落叶言子楪世苏哲兰:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰()Landroid/content/ClipboardManager;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Landroid/content/ClipboardManager;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/ui/platform/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/content/Context;

    .line 6
    .line 7
    const-string v1, "clipboard"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast v0, Landroid/content/ClipboardManager;

    .line 17
    .line 18
    iput-object v0, p0, Landroidx/compose/ui/platform/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Landroid/content/ClipboardManager;

    .line 19
    .line 20
    :cond_0
    return-object v0
.end method
