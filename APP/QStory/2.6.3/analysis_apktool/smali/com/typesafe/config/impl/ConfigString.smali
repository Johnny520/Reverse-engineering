.class abstract Lcom/typesafe/config/impl/ConfigString;
.super Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/typesafe/config/impl/ConfigString$Unquoted;,
        Lcom/typesafe/config/impl/ConfigString$Quoted;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x2L


# instance fields
.field protected final value:Ljava/lang/String;


# direct methods
.method public constructor <init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/typesafe/config/impl/ConfigString;->value:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public render(Ljava/lang/StringBuilder;IZL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p4}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->hideEnvVariableValue(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->appendHiddenEnvVariableValue(Ljava/lang/StringBuilder;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lcom/typesafe/config/impl/ConfigString;->value:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public transformToString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/ConfigString;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic unwrapped()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/ConfigString;->unwrapped()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public unwrapped()Ljava/lang/String;
    .locals 0

    .line 6
    iget-object p0, p0, Lcom/typesafe/config/impl/ConfigString;->value:Ljava/lang/String;

    return-object p0
.end method

.method public valueType()Lcom/typesafe/config/ConfigValueType;
    .locals 0

    .line 1
    sget-object p0, Lcom/typesafe/config/ConfigValueType;->STRING:Lcom/typesafe/config/ConfigValueType;

    .line 2
    .line 3
    return-object p0
.end method

.method public wasQuoted()Z
    .locals 0

    .line 1
    instance-of p0, p0, Lcom/typesafe/config/impl/ConfigString$Quoted;

    .line 2
    .line 3
    return p0
.end method
