.class public abstract Lio/ktor/http/cio/internals/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "ktor.internal.cio.disable.chararray.pooling"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲兰苏;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    new-instance v0, Lio/ktor/http/cio/飘花落叶言子楪世兰苏哲;

    .line 24
    .line 25
    const/16 v1, 0x1000

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    invoke-direct {v0, v1, v2}, Lio/ktor/http/cio/飘花落叶言子楪世兰苏哲;-><init>(II)V

    .line 29
    .line 30
    .line 31
    :goto_1
    sput-object v0, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 32
    .line 33
    return-void
.end method
