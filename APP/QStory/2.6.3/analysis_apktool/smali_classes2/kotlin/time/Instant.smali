.class public final Lkotlin/time/Instant;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lkotlin/time/Instant;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0007\u0018\u0000 -2\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001.B\u0019\u0008\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0086\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0086\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001a\u0010\"\u001a\u00020!2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\nH\u0096\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u000f\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008\'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010)\u001a\u0004\u0008*\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010+\u001a\u0004\u0008,\u0010%\u00a8\u0006/"
    }
    d2 = {
        "Lkotlin/time/Instant;",
        "",
        "Ljava/io/Serializable;",
        "Lkotlin/io/Serializable;",
        "",
        "epochSeconds",
        "",
        "nanosecondsOfSecond",
        "<init>",
        "(JI)V",
        "",
        "writeReplace",
        "()Ljava/lang/Object;",
        "Ljava/io/ObjectInputStream;",
        "Lkotlin/internal/ReadObjectParameterType;",
        "input",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "readObject",
        "(Ljava/io/ObjectInputStream;)V",
        "toEpochMilliseconds",
        "()J",
        "Lkotlin/time/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "duration",
        "plus-LRDsOJo",
        "(J)Lkotlin/time/Instant;",
        "plus",
        "minus-LRDsOJo",
        "minus",
        "other",
        "minus-UwyO8pc",
        "(Lkotlin/time/Instant;)J",
        "compareTo",
        "(Lkotlin/time/Instant;)I",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "J",
        "getEpochSeconds",
        "I",
        "getNanosecondsOfSecond",
        "Companion",
        "kotlin/time/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lkotlin/time/飘花落叶言子楪世兰苏哲;

.field private static final MAX:Lkotlin/time/Instant;

.field private static final MIN:Lkotlin/time/Instant;


# instance fields
.field private final epochSeconds:J

.field private final nanosecondsOfSecond:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lkotlin/time/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlin/time/Instant;->Companion:Lkotlin/time/飘花落叶言子楪世兰苏哲;

    .line 7
    .line 8
    new-instance v0, Lkotlin/time/Instant;

    .line 9
    .line 10
    const-wide v1, -0x701cefeb9bec00L

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v0, v1, v2, v3}, Lkotlin/time/Instant;-><init>(JI)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lkotlin/time/Instant;->MIN:Lkotlin/time/Instant;

    .line 20
    .line 21
    new-instance v0, Lkotlin/time/Instant;

    .line 22
    .line 23
    const-wide v1, 0x701cd2fa9578ffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const v3, 0x3b9ac9ff

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1, v2, v3}, Lkotlin/time/Instant;-><init>(JI)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lkotlin/time/Instant;->MAX:Lkotlin/time/Instant;

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(JI)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lkotlin/time/Instant;->epochSeconds:J

    .line 5
    .line 6
    iput p3, p0, Lkotlin/time/Instant;->nanosecondsOfSecond:I

    .line 7
    .line 8
    const-wide v0, -0x701cefeb9bec00L

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    cmp-long p0, v0, p1

    .line 14
    .line 15
    if-gtz p0, :cond_0

    .line 16
    .line 17
    const-wide v0, 0x701cd2fa957900L

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmp-long p0, p1, v0

    .line 23
    .line 24
    if-gez p0, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const-string p0, "Instant exceeds minimum or maximum instant"

    .line 28
    .line 29
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    throw p0
.end method

.method public static final synthetic access$getMAX$cp()Lkotlin/time/Instant;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/time/Instant;->MAX:Lkotlin/time/Instant;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getMIN$cp()Lkotlin/time/Instant;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/time/Instant;->MIN:Lkotlin/time/Instant;

    .line 2
    .line 3
    return-object v0
.end method

.method private final readObject(Ljava/io/ObjectInputStream;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/io/InvalidObjectException;

    .line 2
    .line 3
    const-string p1, "Deserialization is supported via proxy only"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 3

    .line 1
    sget v0, Lkotlin/time/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    new-instance v0, Lkotlin/time/InstantSerialized;

    .line 4
    .line 5
    invoke-virtual {p0}, Lkotlin/time/Instant;->getEpochSeconds()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {p0}, Lkotlin/time/Instant;->getNanosecondsOfSecond()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-direct {v0, v1, v2, p0}, Lkotlin/time/InstantSerialized;-><init>(JI)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 24
    check-cast p1, Lkotlin/time/Instant;

    invoke-virtual {p0, p1}, Lkotlin/time/Instant;->compareTo(Lkotlin/time/Instant;)I

    move-result p0

    return p0
.end method

.method public compareTo(Lkotlin/time/Instant;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lkotlin/time/Instant;->epochSeconds:J

    .line 5
    .line 6
    iget-wide v2, p1, Lkotlin/time/Instant;->epochSeconds:J

    .line 7
    .line 8
    invoke-static {v0, v1, v2, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(JJ)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    iget p0, p0, Lkotlin/time/Instant;->nanosecondsOfSecond:I

    .line 16
    .line 17
    iget p1, p1, Lkotlin/time/Instant;->nanosecondsOfSecond:I

    .line 18
    .line 19
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(II)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Lkotlin/time/Instant;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Lkotlin/time/Instant;->epochSeconds:J

    .line 8
    .line 9
    check-cast p1, Lkotlin/time/Instant;

    .line 10
    .line 11
    iget-wide v2, p1, Lkotlin/time/Instant;->epochSeconds:J

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget p0, p0, Lkotlin/time/Instant;->nanosecondsOfSecond:I

    .line 18
    .line 19
    iget p1, p1, Lkotlin/time/Instant;->nanosecondsOfSecond:I

    .line 20
    .line 21
    if-ne p0, p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 27
    return p0
.end method

.method public final getEpochSeconds()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lkotlin/time/Instant;->epochSeconds:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getNanosecondsOfSecond()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/time/Instant;->nanosecondsOfSecond:I

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lkotlin/time/Instant;->epochSeconds:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p0, p0, Lkotlin/time/Instant;->nanosecondsOfSecond:I

    .line 8
    .line 9
    mul-int/lit8 p0, p0, 0x33

    .line 10
    .line 11
    add-int/2addr p0, v0

    .line 12
    return p0
.end method

.method public final minus-LRDsOJo(J)Lkotlin/time/Instant;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lkotlin/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lkotlin/time/Instant;->plus-LRDsOJo(J)Lkotlin/time/Instant;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final minus-UwyO8pc(Lkotlin/time/Instant;)J
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlin/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    iget-wide v0, p0, Lkotlin/time/Instant;->epochSeconds:J

    .line 7
    .line 8
    iget-wide v2, p1, Lkotlin/time/Instant;->epochSeconds:J

    .line 9
    .line 10
    sub-long/2addr v0, v2

    .line 11
    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    .line 12
    .line 13
    invoke-static {v0, v1, v2}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(JLkotlin/time/DurationUnit;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iget p0, p0, Lkotlin/time/Instant;->nanosecondsOfSecond:I

    .line 18
    .line 19
    iget p1, p1, Lkotlin/time/Instant;->nanosecondsOfSecond:I

    .line 20
    .line 21
    sub-int/2addr p0, p1

    .line 22
    sget-object p1, Lkotlin/time/DurationUnit;->NANOSECONDS:Lkotlin/time/DurationUnit;

    .line 23
    .line 24
    invoke-static {p0, p1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(ILkotlin/time/DurationUnit;)J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    invoke-static {v0, v1, p0, p1}, Lkotlin/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide p0

    .line 32
    return-wide p0
.end method

.method public final plus-LRDsOJo(J)Lkotlin/time/Instant;
    .locals 11

    .line 1
    sget-object v0, Lkotlin/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    sget-object v0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    .line 4
    .line 5
    invoke-static {p1, p2, v0}, Lkotlin/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(JLkotlin/time/DurationUnit;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {p1, p2}, Lkotlin/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(J)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    cmp-long v5, v0, v3

    .line 16
    .line 17
    if-nez v5, :cond_0

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    iget-wide v5, p0, Lkotlin/time/Instant;->epochSeconds:J

    .line 23
    .line 24
    add-long v7, v5, v0

    .line 25
    .line 26
    xor-long v9, v5, v7

    .line 27
    .line 28
    cmp-long v9, v9, v3

    .line 29
    .line 30
    if-gez v9, :cond_2

    .line 31
    .line 32
    xor-long/2addr v0, v5

    .line 33
    cmp-long v0, v0, v3

    .line 34
    .line 35
    if-ltz v0, :cond_2

    .line 36
    .line 37
    cmp-long p0, p1, v3

    .line 38
    .line 39
    if-lez p0, :cond_1

    .line 40
    .line 41
    sget-object p0, Lkotlin/time/Instant;->MAX:Lkotlin/time/Instant;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    sget-object p0, Lkotlin/time/Instant;->MIN:Lkotlin/time/Instant;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_2
    iget p0, p0, Lkotlin/time/Instant;->nanosecondsOfSecond:I

    .line 48
    .line 49
    add-int/2addr p0, v2

    .line 50
    sget-object p1, Lkotlin/time/Instant;->Companion:Lkotlin/time/飘花落叶言子楪世兰苏哲;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v7, v8}, Lkotlin/time/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(IJ)Lkotlin/time/Instant;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public final toEpochMilliseconds()J
    .locals 12

    .line 1
    iget-wide v0, p0, Lkotlin/time/Instant;->epochSeconds:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    const v5, 0xf4240

    .line 8
    .line 9
    .line 10
    const-wide/16 v6, 0x3e8

    .line 11
    .line 12
    const-wide/16 v8, 0x1

    .line 13
    .line 14
    if-ltz v4, :cond_4

    .line 15
    .line 16
    cmp-long v4, v0, v8

    .line 17
    .line 18
    const-wide v8, 0x7fffffffffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    cmp-long v4, v0, v2

    .line 27
    .line 28
    if-eqz v4, :cond_2

    .line 29
    .line 30
    mul-long v10, v0, v6

    .line 31
    .line 32
    div-long v6, v10, v6

    .line 33
    .line 34
    cmp-long v0, v6, v0

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    move-wide v6, v10

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return-wide v8

    .line 41
    :cond_2
    move-wide v6, v2

    .line 42
    :goto_0
    iget p0, p0, Lkotlin/time/Instant;->nanosecondsOfSecond:I

    .line 43
    .line 44
    div-int/2addr p0, v5

    .line 45
    int-to-long v0, p0

    .line 46
    add-long v4, v6, v0

    .line 47
    .line 48
    xor-long v10, v6, v4

    .line 49
    .line 50
    cmp-long p0, v10, v2

    .line 51
    .line 52
    if-gez p0, :cond_3

    .line 53
    .line 54
    xor-long/2addr v0, v6

    .line 55
    cmp-long p0, v0, v2

    .line 56
    .line 57
    if-ltz p0, :cond_3

    .line 58
    .line 59
    return-wide v8

    .line 60
    :cond_3
    return-wide v4

    .line 61
    :cond_4
    add-long/2addr v0, v8

    .line 62
    cmp-long v4, v0, v8

    .line 63
    .line 64
    const-wide/high16 v8, -0x8000000000000000L

    .line 65
    .line 66
    if-nez v4, :cond_5

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_5
    cmp-long v4, v0, v2

    .line 70
    .line 71
    if-eqz v4, :cond_7

    .line 72
    .line 73
    mul-long v10, v0, v6

    .line 74
    .line 75
    div-long v6, v10, v6

    .line 76
    .line 77
    cmp-long v0, v6, v0

    .line 78
    .line 79
    if-nez v0, :cond_6

    .line 80
    .line 81
    move-wide v6, v10

    .line 82
    goto :goto_1

    .line 83
    :cond_6
    return-wide v8

    .line 84
    :cond_7
    move-wide v6, v2

    .line 85
    :goto_1
    iget p0, p0, Lkotlin/time/Instant;->nanosecondsOfSecond:I

    .line 86
    .line 87
    div-int/2addr p0, v5

    .line 88
    add-int/lit16 p0, p0, -0x3e8

    .line 89
    .line 90
    int-to-long v0, p0

    .line 91
    add-long v4, v6, v0

    .line 92
    .line 93
    xor-long v10, v6, v4

    .line 94
    .line 95
    cmp-long p0, v10, v2

    .line 96
    .line 97
    if-gez p0, :cond_8

    .line 98
    .line 99
    xor-long/2addr v0, v6

    .line 100
    cmp-long p0, v0, v2

    .line 101
    .line 102
    if-ltz p0, :cond_8

    .line 103
    .line 104
    return-wide v8

    .line 105
    :cond_8
    return-wide v4
.end method

.method public toString()Ljava/lang/String;
    .locals 25

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p0 .. p0}, Lkotlin/time/Instant;->getEpochSeconds()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    const-wide/32 v3, 0x15180

    .line 11
    .line 12
    .line 13
    div-long v5, v1, v3

    .line 14
    .line 15
    xor-long v7, v1, v3

    .line 16
    .line 17
    const-wide/16 v9, 0x0

    .line 18
    .line 19
    cmp-long v7, v7, v9

    .line 20
    .line 21
    const-wide/16 v11, -0x1

    .line 22
    .line 23
    if-gez v7, :cond_0

    .line 24
    .line 25
    mul-long v7, v5, v3

    .line 26
    .line 27
    cmp-long v7, v7, v1

    .line 28
    .line 29
    if-eqz v7, :cond_0

    .line 30
    .line 31
    add-long/2addr v5, v11

    .line 32
    :cond_0
    rem-long/2addr v1, v3

    .line 33
    xor-long v7, v1, v3

    .line 34
    .line 35
    neg-long v13, v1

    .line 36
    or-long/2addr v13, v1

    .line 37
    and-long/2addr v7, v13

    .line 38
    const/16 v13, 0x3f

    .line 39
    .line 40
    shr-long/2addr v7, v13

    .line 41
    and-long/2addr v3, v7

    .line 42
    add-long/2addr v1, v3

    .line 43
    long-to-int v1, v1

    .line 44
    const-wide/32 v2, 0xafa6c

    .line 45
    .line 46
    .line 47
    add-long/2addr v2, v5

    .line 48
    cmp-long v4, v2, v9

    .line 49
    .line 50
    const-wide/16 v7, 0x190

    .line 51
    .line 52
    const-wide/32 v13, 0x23ab1

    .line 53
    .line 54
    .line 55
    if-gez v4, :cond_1

    .line 56
    .line 57
    const-wide/32 v15, 0xafa6d

    .line 58
    .line 59
    .line 60
    add-long/2addr v5, v15

    .line 61
    div-long/2addr v5, v13

    .line 62
    const-wide/16 v15, 0x1

    .line 63
    .line 64
    sub-long/2addr v5, v15

    .line 65
    mul-long v15, v5, v7

    .line 66
    .line 67
    neg-long v4, v5

    .line 68
    mul-long/2addr v4, v13

    .line 69
    add-long/2addr v2, v4

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move-wide v15, v9

    .line 72
    :goto_0
    mul-long v4, v7, v2

    .line 73
    .line 74
    const-wide/16 v17, 0x24f

    .line 75
    .line 76
    add-long v4, v4, v17

    .line 77
    .line 78
    div-long/2addr v4, v13

    .line 79
    const-wide/16 v13, 0x16d

    .line 80
    .line 81
    mul-long v17, v13, v4

    .line 82
    .line 83
    const-wide/16 v19, 0x4

    .line 84
    .line 85
    div-long v21, v4, v19

    .line 86
    .line 87
    add-long v21, v21, v17

    .line 88
    .line 89
    const-wide/16 v17, 0x64

    .line 90
    .line 91
    div-long v23, v4, v17

    .line 92
    .line 93
    sub-long v21, v21, v23

    .line 94
    .line 95
    div-long v23, v4, v7

    .line 96
    .line 97
    add-long v23, v23, v21

    .line 98
    .line 99
    sub-long v21, v2, v23

    .line 100
    .line 101
    cmp-long v6, v21, v9

    .line 102
    .line 103
    if-gez v6, :cond_2

    .line 104
    .line 105
    add-long/2addr v4, v11

    .line 106
    mul-long/2addr v13, v4

    .line 107
    div-long v9, v4, v19

    .line 108
    .line 109
    add-long/2addr v9, v13

    .line 110
    div-long v11, v4, v17

    .line 111
    .line 112
    sub-long/2addr v9, v11

    .line 113
    div-long v6, v4, v7

    .line 114
    .line 115
    add-long/2addr v6, v9

    .line 116
    sub-long v21, v2, v6

    .line 117
    .line 118
    :cond_2
    move-wide/from16 v2, v21

    .line 119
    .line 120
    add-long/2addr v4, v15

    .line 121
    long-to-int v2, v2

    .line 122
    mul-int/lit8 v3, v2, 0x5

    .line 123
    .line 124
    add-int/lit8 v3, v3, 0x2

    .line 125
    .line 126
    div-int/lit16 v3, v3, 0x99

    .line 127
    .line 128
    add-int/lit8 v6, v3, 0x2

    .line 129
    .line 130
    rem-int/lit8 v6, v6, 0xc

    .line 131
    .line 132
    const/4 v7, 0x1

    .line 133
    add-int/2addr v6, v7

    .line 134
    mul-int/lit16 v8, v3, 0x132

    .line 135
    .line 136
    add-int/lit8 v8, v8, 0x5

    .line 137
    .line 138
    div-int/lit8 v8, v8, 0xa

    .line 139
    .line 140
    sub-int/2addr v2, v8

    .line 141
    add-int/2addr v2, v7

    .line 142
    div-int/lit8 v3, v3, 0xa

    .line 143
    .line 144
    int-to-long v8, v3

    .line 145
    add-long/2addr v4, v8

    .line 146
    long-to-int v3, v4

    .line 147
    div-int/lit16 v4, v1, 0xe10

    .line 148
    .line 149
    mul-int/lit16 v5, v4, 0xe10

    .line 150
    .line 151
    sub-int/2addr v1, v5

    .line 152
    div-int/lit8 v5, v1, 0x3c

    .line 153
    .line 154
    mul-int/lit8 v8, v5, 0x3c

    .line 155
    .line 156
    sub-int/2addr v1, v8

    .line 157
    invoke-virtual/range {p0 .. p0}, Lkotlin/time/Instant;->getNanosecondsOfSecond()I

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    const/16 v10, 0x3e8

    .line 166
    .line 167
    const/4 v11, 0x0

    .line 168
    const/16 v12, 0x2710

    .line 169
    .line 170
    if-ge v9, v10, :cond_4

    .line 171
    .line 172
    new-instance v9, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    if-ltz v3, :cond_3

    .line 178
    .line 179
    add-int/2addr v3, v12

    .line 180
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_3
    sub-int/2addr v3, v12

    .line 192
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    :goto_1
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_4
    if-lt v3, v12, :cond_5

    .line 207
    .line 208
    const/16 v9, 0x2b

    .line 209
    .line 210
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    :cond_5
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    :goto_2
    const/16 v3, 0x2d

    .line 217
    .line 218
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-static {v0, v0, v6}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-static {v0, v0, v2}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;I)V

    .line 228
    .line 229
    .line 230
    const/16 v2, 0x54

    .line 231
    .line 232
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-static {v0, v0, v4}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;I)V

    .line 236
    .line 237
    .line 238
    const/16 v2, 0x3a

    .line 239
    .line 240
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-static {v0, v0, v5}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-static {v0, v0, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;I)V

    .line 250
    .line 251
    .line 252
    if-eqz v8, :cond_7

    .line 253
    .line 254
    const/16 v1, 0x2e

    .line 255
    .line 256
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    :goto_3
    add-int/lit8 v1, v11, 0x1

    .line 260
    .line 261
    sget-object v2, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:[I

    .line 262
    .line 263
    aget v3, v2, v1

    .line 264
    .line 265
    rem-int v3, v8, v3

    .line 266
    .line 267
    if-nez v3, :cond_6

    .line 268
    .line 269
    move v11, v1

    .line 270
    goto :goto_3

    .line 271
    :cond_6
    rem-int/lit8 v1, v11, 0x3

    .line 272
    .line 273
    sub-int/2addr v11, v1

    .line 274
    aget v1, v2, v11

    .line 275
    .line 276
    div-int/2addr v8, v1

    .line 277
    rsub-int/lit8 v1, v11, 0x9

    .line 278
    .line 279
    aget v1, v2, v1

    .line 280
    .line 281
    add-int/2addr v8, v1

    .line 282
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    :cond_7
    const/16 v1, 0x5a

    .line 297
    .line 298
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    return-object v0
.end method
