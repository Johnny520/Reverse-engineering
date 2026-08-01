.class public final L飘花落叶言楪哲子苏世兰/飘花落叶言子楪哲兰苏世;
.super Lcom/google/gson/飘花落叶言子楪哲苏兰世;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言楪哲子苏世兰/飘花落叶言子楪哲苏兰世;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Lcom/google/gson/飘花落叶言子楪哲世兰苏;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/gson/ToNumberPolicy;->LAZILY_PARSED_NUMBER:Lcom/google/gson/ToNumberPolicy;

    .line 2
    .line 3
    new-instance v1, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪哲兰苏世;

    .line 4
    .line 5
    invoke-direct {v1, v0}, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪哲兰苏世;-><init>(Lcom/google/gson/飘花落叶言子楪哲世兰苏;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪哲苏兰世;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v1, v2}, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪哲苏兰世;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪哲子苏世兰/飘花落叶言子楪哲苏兰世;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Lcom/google/gson/飘花落叶言子楪哲世兰苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lcom/google/gson/飘花落叶言子楪哲世兰苏;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏兰哲;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪哲苏兰(Ljava/lang/Number;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰楪哲苏()Lcom/google/gson/stream/JsonToken;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    aget v1, v1, v2

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-eq v1, v2, :cond_2

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eq v1, v2, :cond_1

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p0, Lcom/google/gson/JsonSyntaxException;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v2, "Expecting number, got: "

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世(Z)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v0, "; at path "

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {p0, p1}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_1
    :goto_0
    iget-object p0, p0, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lcom/google/gson/飘花落叶言子楪哲世兰苏;

    .line 57
    .line 58
    invoke-interface {p0, p1}, Lcom/google/gson/飘花落叶言子楪哲世兰苏;->readNumber(L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;)Ljava/lang/Number;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_2
    invoke-virtual {p1}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲()V

    .line 64
    .line 65
    .line 66
    const/4 p0, 0x0

    .line 67
    return-object p0
.end method
