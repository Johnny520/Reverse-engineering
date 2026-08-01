.class public final Landroidx/compose/ui/node/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/compose/ui/focus/飘花落叶言子楪哲兰世苏;


# static fields
.field public static 飘花落叶言子楪世苏兰哲:Ljava/lang/Boolean;

.field public static final 飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/node/飘花落叶言子楪世兰苏哲;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/node/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/ui/node/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/node/飘花落叶言子楪世兰苏哲;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sput-object p0, Landroidx/compose/ui/node/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Boolean;

    .line 6
    .line 7
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰()Z
    .locals 0

    .line 1
    sget-object p0, Landroidx/compose/ui/node/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const-string p0, "canFocus is read before it is written"

    .line 11
    .line 12
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏兰哲(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    throw p0
.end method
