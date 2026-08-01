.class public Lcom/typesafe/config/ConfigException$UnresolvedSubstitution;
.super Lcom/typesafe/config/ConfigException$Parse;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/typesafe/config/ConfigException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UnresolvedSubstitution"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final detail:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/typesafe/config/ConfigException$UnresolvedSubstitution;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V
    .locals 0

    .line 14
    invoke-direct {p0, p2, p3, p1}, Lcom/typesafe/config/ConfigException$Parse;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    iget-object p1, p1, Lcom/typesafe/config/ConfigException$UnresolvedSubstitution;->detail:Ljava/lang/String;

    iput-object p1, p0, Lcom/typesafe/config/ConfigException$UnresolvedSubstitution;->detail:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 13
    invoke-direct {p0, p1, p2, v0}, Lcom/typesafe/config/ConfigException$UnresolvedSubstitution;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "Could not resolve substitution to a value: "

    .line 2
    .line 3
    invoke-static {v0, p2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, p1, v0, p3}, Lcom/typesafe/config/ConfigException$Parse;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lcom/typesafe/config/ConfigException$UnresolvedSubstitution;->detail:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public addExtraDetail(Ljava/lang/String;)Lcom/typesafe/config/ConfigException$UnresolvedSubstitution;
    .locals 3

    .line 1
    new-instance v0, Lcom/typesafe/config/ConfigException$UnresolvedSubstitution;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/typesafe/config/ConfigException;->origin()L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lcom/typesafe/config/ConfigException$UnresolvedSubstitution;->detail:Ljava/lang/String;

    .line 8
    .line 9
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {v0, p0, v1, p1}, Lcom/typesafe/config/ConfigException$UnresolvedSubstitution;-><init>(Lcom/typesafe/config/ConfigException$UnresolvedSubstitution;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
