.class public final L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏哲世子兰;


# annotations
.annotation runtime L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰楪哲世;


# instance fields
.field public final 飘花落叶言子楪世兰苏哲:L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;

.field public final 飘花落叶言子楪世哲兰苏:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子苏哲兰世楪;

.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰楪哲世;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰楪哲世;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;L飘花落叶言世子楪兰苏哲/飘花落叶言子苏哲兰世楪;L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x7

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    if-ne v1, v0, :cond_2

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;

    .line 12
    .line 13
    iput-object p4, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子苏哲兰世楪;

    .line 14
    .line 15
    and-int/lit8 p2, p1, 0x8

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    sget-object p2, L飘花落叶言世子楪兰苏哲/飘花落叶言世楪子哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 20
    .line 21
    iput-object p2, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-object p5, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 25
    .line 26
    :goto_0
    and-int/lit8 p1, p1, 0x10

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    sget-object p1, Lio/modelcontextprotocol/kotlin/sdk/Method$Defined;->Initialize:Lio/modelcontextprotocol/kotlin/sdk/Method$Defined;

    .line 31
    .line 32
    iput-object p1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰苏哲:L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iput-object p6, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰苏哲:L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;

    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰楪世哲;

    .line 39
    .line 40
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰楪世哲;->getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p1, v1, p0}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏哲世兰(IIL飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;

    .line 12
    .line 13
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;

    .line 25
    .line 26
    iget-object v3, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子苏哲兰世楪;

    .line 36
    .line 37
    iget-object v3, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子苏哲兰世楪;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object p0, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 47
    .line 48
    iget-object p1, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 49
    .line 50
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-nez p0, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    return v0
.end method

.method public final getMethod()L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰苏哲:L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;

    .line 10
    .line 11
    invoke-virtual {v1}, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子苏哲兰世楪;

    .line 19
    .line 20
    invoke-virtual {v0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏哲兰世楪;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object p0, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 28
    .line 29
    iget-object p0, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/Map;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    add-int/2addr p0, v0

    .line 36
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "InitializeRequest(protocolVersion="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", capabilities="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", clientInfo="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子苏哲兰世楪;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", _meta="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 39
    .line 40
    const/16 v1, 0x29

    .line 41
    .line 42
    invoke-static {v0, p0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/StringBuilder;L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;C)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method
