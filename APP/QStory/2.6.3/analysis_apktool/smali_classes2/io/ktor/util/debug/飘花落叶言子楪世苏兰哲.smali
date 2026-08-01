.class public abstract Lio/ktor/util/debug/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/window/area/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lio/ktor/util/debug/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 12
    .line 13
    return-void
.end method

.method public static final 飘花落叶言子楪世苏兰哲()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Ljava/lang/management/ManagementFactory;->getRuntimeMXBean()Ljava/lang/management/RuntimeMXBean;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-interface {v1}, Ljava/lang/management/RuntimeMXBean;->getInputArguments()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "jdwp"

    .line 15
    .line 16
    invoke-static {v1, v2, v0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪兰哲世(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :catchall_0
    return v0
.end method

.method public static 飘花落叶言子楪世苏哲兰()Z
    .locals 1

    .line 1
    sget-object v0, Lio/ktor/util/debug/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method
