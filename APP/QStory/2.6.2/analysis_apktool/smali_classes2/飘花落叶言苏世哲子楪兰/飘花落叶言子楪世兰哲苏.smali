.class public final L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世兰哲苏;
.super Landroid/os/CountDownTimer;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:L飘花落叶言苏世哲子楪兰/飘花落叶言子楪苏世哲兰;


# direct methods
.method public constructor <init>(L飘花落叶言苏世哲子楪兰/飘花落叶言子楪苏世哲兰;)V
    .locals 4

    .line 1
    iput-object p1, p0, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世哲子楪兰/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    const-wide/16 v0, 0x2710

    .line 4
    .line 5
    const-wide/16 v2, 0x3e8

    .line 6
    .line 7
    invoke-direct {p0, v0, v1, v2, v3}, Landroid/os/CountDownTimer;-><init>(JJ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onFinish()V
    .locals 1

    .line 1
    iget-object p0, p0, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世哲子楪兰/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 20
    .line 21
    invoke-virtual {v0}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final onTick(J)V
    .locals 0

    .line 1
    return-void
.end method
