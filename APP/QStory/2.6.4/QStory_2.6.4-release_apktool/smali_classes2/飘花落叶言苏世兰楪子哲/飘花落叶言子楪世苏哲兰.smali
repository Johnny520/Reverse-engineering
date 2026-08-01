.class public final synthetic L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3

    .line 1
    iget v0, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/HashMap;

    .line 9
    .line 10
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Landroid/app/Activity;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, p1, v0}, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Landroid/app/Activity;Z)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    sget-object v0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/HashMap;

    .line 20
    .line 21
    new-instance v0, Landroid/os/Handler;

    .line 22
    .line 23
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;

    .line 31
    .line 32
    const/16 v2, 0x19

    .line 33
    .line 34
    invoke-direct {v1, p0, v2, p1}, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const-wide/16 p0, 0x32

    .line 38
    .line 39
    invoke-virtual {v0, v1, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
