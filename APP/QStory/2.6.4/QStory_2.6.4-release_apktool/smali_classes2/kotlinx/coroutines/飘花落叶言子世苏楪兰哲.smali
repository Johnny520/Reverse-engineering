.class public abstract Lkotlinx/coroutines/飘花落叶言子世苏楪兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/飘花落叶言子世苏兰楪哲;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "kotlinx.coroutines.main.delay"

    .line 2
    .line 3
    sget v1, Lkotlinx/coroutines/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 4
    .line 5
    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_1
    if-nez v0, :cond_1

    .line 20
    .line 21
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪苏兰哲:Lkotlinx/coroutines/飘花落叶言子世苏楪哲兰;

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_1
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 25
    .line 26
    sget-object v0, Lkotlinx/coroutines/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲兰子楪/飘花落叶言子楪世哲兰苏;

    .line 27
    .line 28
    iget-object v1, v0, L飘花落叶言世苏哲兰子楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏:L飘花落叶言世苏哲兰子楪/飘花落叶言子楪世哲兰苏;

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪苏兰哲:Lkotlinx/coroutines/飘花落叶言子世苏楪哲兰;

    .line 33
    .line 34
    :cond_2
    :goto_2
    sput-object v0, Lkotlinx/coroutines/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/飘花落叶言子世苏兰楪哲;

    .line 35
    .line 36
    return-void
.end method
