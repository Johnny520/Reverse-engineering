.class Lcom/typesafe/config/impl/AbstractConfigValue$NotPossibleToResolve;
.super Ljava/lang/Exception;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final traceString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;)V
    .locals 2

    .line 1
    const-string v0, "was not possible to resolve"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-lez p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    add-int/lit8 p1, p1, -0x2

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lcom/typesafe/config/impl/AbstractConfigValue$NotPossibleToResolve;->traceString:Ljava/lang/String;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public traceString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/AbstractConfigValue$NotPossibleToResolve;->traceString:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
