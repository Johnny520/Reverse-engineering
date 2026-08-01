.class public final L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲世兰苏;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰世苏;

.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲世兰苏;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(IL飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰世苏;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p1, 0x1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p2, L飘花落叶言世子楪兰苏哲/飘花落叶言世楪子哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 9
    .line 10
    :cond_0
    iput-object p2, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 11
    .line 12
    and-int/lit8 p2, p1, 0x2

    .line 13
    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    sget-object p2, L飘花落叶言世子楪兰苏哲/飘花落叶言世楪子哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 17
    .line 18
    iput-object p2, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iput-object p3, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 22
    .line 23
    :goto_0
    and-int/lit8 p1, p1, 0x4

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    iput-object p1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰世苏;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    iput-object p4, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰世苏;

    .line 32
    .line 33
    return-void
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
    instance-of v1, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;

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
    check-cast p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;

    .line 12
    .line 13
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 14
    .line 15
    iget-object v3, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

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
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 25
    .line 26
    iget-object v3, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

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
    iget-object p0, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰世苏;

    .line 36
    .line 37
    iget-object p1, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰世苏;

    .line 38
    .line 39
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, v1, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/Map;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 15
    .line 16
    iget-object v2, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    move v2, v0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    iget-object v2, v2, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/Map;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    :goto_1
    add-int/2addr v1, v2

    .line 29
    mul-int/lit8 v1, v1, 0x1f

    .line 30
    .line 31
    iget-object p0, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰世苏;

    .line 32
    .line 33
    if-nez p0, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰世苏;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    :goto_2
    add-int/2addr v1, v0

    .line 41
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ClientCapabilities(experimental="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", sampling="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", roots="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰世苏;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 p0, 0x29

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
