.class public final L飘花落叶言苏楪哲子世兰/飘花落叶言子楪世苏兰哲;
.super Ljava/util/TimerTask;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    sget-object p0, L飘花落叶言苏楪哲子世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪哲子世兰/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    sget-object p0, L飘花落叶言苏楪哲子世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitBridge;->close()V

    .line 9
    .line 10
    .line 11
    sput-object v0, L飘花落叶言苏楪哲子世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Lorg/luckypray/dexkit/DexKitBridge;

    .line 12
    .line 13
    :cond_0
    sget-object p0, L飘花落叶言苏楪哲子世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Ljava/util/Timer;

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/util/Timer;->cancel()V

    .line 18
    .line 19
    .line 20
    sput-object v0, L飘花落叶言苏楪哲子世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Ljava/util/Timer;

    .line 21
    .line 22
    :cond_1
    return-void
.end method
