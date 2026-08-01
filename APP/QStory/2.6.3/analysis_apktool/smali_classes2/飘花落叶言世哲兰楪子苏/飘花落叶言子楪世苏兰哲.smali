.class public abstract L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

.field public static 飘花落叶言子楪世苏兰哲:Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;

.field public static final 飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    new-instance v0, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

    .line 9
    .line 10
    const/16 v1, 0x301

    .line 11
    .line 12
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v0, v1, v2}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

    .line 21
    .line 22
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/os/Message;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object p0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method
