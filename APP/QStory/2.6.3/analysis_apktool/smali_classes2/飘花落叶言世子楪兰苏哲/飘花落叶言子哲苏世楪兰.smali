.class public final L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世楪兰苏;


# annotations
.annotation runtime L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏楪兰世;

.field public static final 飘花落叶言子楪世兰苏哲:[Lkotlin/飘花落叶言子楪苏世哲兰;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/String;

.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏楪兰世;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏楪兰世;

    .line 7
    .line 8
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 9
    .line 10
    new-instance v1, L飘花落叶言世子楪兰苏哲/飘花落叶言子世苏哲兰楪;

    .line 11
    .line 12
    const/4 v2, 0x7

    .line 13
    invoke-direct {v1, v2}, L飘花落叶言世子楪兰苏哲/飘花落叶言子世苏哲兰楪;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/LazyThreadSafetyMode;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x4

    .line 21
    new-array v1, v1, [Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    aput-object v0, v1, v2

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    const/4 v2, 0x0

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    const/4 v0, 0x2

    .line 31
    aput-object v2, v1, v0

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    aput-object v2, v1, v0

    .line 35
    .line 36
    sput-object v1, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世兰苏哲:[Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 37
    .line 38
    return-void
.end method

.method public constructor <init>(IL飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;Ljava/lang/String;L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;Ljava/lang/String;)V
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v1, v0, :cond_3

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p1, 0x1

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance p2, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰子世哲;

    .line 14
    .line 15
    sget-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言世楪子苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicLong;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-wide/16 v1, 0x1

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    invoke-direct {p2, v0, v1}, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰子世哲;-><init>(J)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iput-object p2, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;

    .line 30
    .line 31
    iput-object p3, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 32
    .line 33
    and-int/lit8 p2, p1, 0x4

    .line 34
    .line 35
    if-nez p2, :cond_1

    .line 36
    .line 37
    sget-object p2, L飘花落叶言世子楪兰苏哲/飘花落叶言世楪子哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 38
    .line 39
    iput-object p2, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iput-object p4, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;

    .line 43
    .line 44
    :goto_0
    and-int/lit8 p1, p1, 0x8

    .line 45
    .line 46
    if-nez p1, :cond_2

    .line 47
    .line 48
    const-string p1, "2.0"

    .line 49
    .line 50
    iput-object p1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    iput-object p5, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏楪世兰;

    .line 57
    .line 58
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏楪世兰;->getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p1, v1, p0}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏哲世兰(IIL飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;)V
    .locals 4

    .line 67
    new-instance v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰子世哲;

    .line 68
    sget-object v1, L飘花落叶言世子楪兰苏哲/飘花落叶言世楪子苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicLong;

    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v2, 0x1

    .line 70
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide v1

    .line 71
    invoke-direct {v0, v1, v2}, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰子世哲;-><init>(J)V

    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object v0, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;

    .line 75
    iput-object p1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 76
    iput-object p2, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;

    .line 77
    const-string p1, "2.0"

    iput-object p1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

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
    instance-of v1, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;

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
    check-cast p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;

    .line 12
    .line 13
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;

    .line 14
    .line 15
    iget-object v3, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;

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
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

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
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;

    .line 36
    .line 37
    iget-object v3, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;

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
    iget-object p0, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 47
    .line 48
    iget-object p1, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

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

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-object p0, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    add-int/2addr p0, v2

    .line 31
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "JSONRPCRequest(id="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", method="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", params="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", jsonrpc="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 39
    .line 40
    const/16 v1, 0x29

    .line 41
    .line 42
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method
