.class public final Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰苏哲:Z

.field public final 飘花落叶言子楪世哲兰苏:Landroidx/collection/飘花落叶言子世兰楪哲苏;

.field public final 飘花落叶言子楪世哲苏兰:Landroidx/collection/飘花落叶言子世兰楪哲苏;

.field public final 飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 7
    .line 8
    sget-object p1, Landroidx/collection/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 9
    .line 10
    new-instance p1, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 11
    .line 12
    invoke-direct {p1}, Landroidx/collection/飘花落叶言子世兰楪哲苏;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 16
    .line 17
    new-instance p1, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 18
    .line 19
    invoke-direct {p1}, Landroidx/collection/飘花落叶言子世兰楪哲苏;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Landroidx/compose/ui/focus/FocusInvalidationManager$scheduleInvalidation$1;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroidx/compose/ui/focus/FocusInvalidationManager$scheduleInvalidation$1;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 11
    .line 12
    iget-object v1, v1, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子哲苏兰世楪:Landroidx/collection/飘花落叶言子世哲苏楪兰;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-ltz v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v1, v0}, Landroidx/collection/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 26
    .line 27
    :cond_1
    return-void
.end method
