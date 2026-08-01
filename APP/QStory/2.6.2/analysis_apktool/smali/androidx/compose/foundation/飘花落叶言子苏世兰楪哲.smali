.class public abstract Landroidx/compose/foundation/飘花落叶言子苏世兰楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/semantics/飘花落叶言子楪兰苏哲世;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/semantics/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    const-string v1, "MagnifierPositionInRoot"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/compose/ui/semantics/飘花落叶言子楪兰苏哲世;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Landroidx/compose/foundation/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/semantics/飘花落叶言子楪兰苏哲世;

    .line 9
    .line 10
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method
