.class public Lcom/typesafe/config/ConfigException$BadPath;
.super Lcom/typesafe/config/ConfigException;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/typesafe/config/ConfigException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BadPath"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, p1, p2, v0}, Lcom/typesafe/config/ConfigException$BadPath;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 16
    const-string v0, "Invalid path \'"

    const-string v1, "\': "

    .line 17
    invoke-static {v0, p1, v1, p2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 18
    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/typesafe/config/ConfigException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1, v0, p2}, Lcom/typesafe/config/ConfigException$BadPath;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 15
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/typesafe/config/ConfigException$BadPath;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const-string v0, "Invalid path \'"

    .line 4
    .line 5
    const-string v1, "\': "

    .line 6
    .line 7
    invoke-static {v0, p2, v1, p3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    :cond_0
    invoke-direct {p0, p1, p3, p4}, Lcom/typesafe/config/ConfigException;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
