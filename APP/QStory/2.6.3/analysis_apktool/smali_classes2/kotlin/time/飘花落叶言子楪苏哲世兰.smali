.class public final Lkotlin/time/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlin/time/飘花落叶言子楪苏哲兰世;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:J


# direct methods
.method public constructor <init>(JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lkotlin/time/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:J

    .line 5
    .line 6
    iput p3, p0, Lkotlin/time/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final toInstant()Lkotlin/time/Instant;
    .locals 4

    .line 1
    sget-object v0, Lkotlin/time/Instant;->Companion:Lkotlin/time/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lkotlin/time/Instant;->access$getMIN$cp()Lkotlin/time/Instant;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lkotlin/time/Instant;->getEpochSeconds()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-wide v2, p0, Lkotlin/time/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:J

    .line 15
    .line 16
    cmp-long v0, v2, v0

    .line 17
    .line 18
    if-ltz v0, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lkotlin/time/Instant;->access$getMAX$cp()Lkotlin/time/Instant;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lkotlin/time/Instant;->getEpochSeconds()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    cmp-long v0, v2, v0

    .line 29
    .line 30
    if-gtz v0, :cond_0

    .line 31
    .line 32
    iget p0, p0, Lkotlin/time/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:I

    .line 33
    .line 34
    invoke-static {p0, v2, v3}, Lkotlin/time/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(IJ)Lkotlin/time/Instant;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_0
    new-instance p0, Lkotlin/time/InstantFormatException;

    .line 40
    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v1, "The parsed date is outside the range representable by Instant (Unix epoch second "

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const/16 v1, 0x29

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {p0, v0}, Lkotlin/time/InstantFormatException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p0
.end method
