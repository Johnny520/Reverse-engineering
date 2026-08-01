.class public final Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;
.super Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子世哲苏楪兰:[B


# instance fields
.field public 飘花落叶言子世哲楪兰苏:J

.field public 飘花落叶言子世哲楪苏兰:I

.field public 飘花落叶言子世苏兰哲楪:L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;

.field public 飘花落叶言子世苏兰楪哲:[B

.field public final 飘花落叶言子世苏哲兰楪:Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "Asia/Shanghai"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    const-string v0, "+08:00"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V
    .locals 3

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {p0, p1, v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;ZLjava/nio/charset/Charset;)V

    .line 5
    .line 6
    .line 7
    sget-object p1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:[Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    array-length v2, p1

    .line 18
    sub-int/2addr v2, v1

    .line 19
    and-int/2addr v0, v2

    .line 20
    aget-object p1, p1, v0

    .line 21
    .line 22
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏哲兰楪:Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

    .line 23
    .line 24
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, [B

    .line 32
    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    const/16 p1, 0x2000

    .line 36
    .line 37
    new-array p1, p1, [B

    .line 38
    .line 39
    :cond_0
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 40
    .line 41
    return-void
.end method

.method public static 飘花落叶言楪世子兰哲苏(I)I
    .locals 1

    .line 1
    const/16 v0, -0x10

    .line 2
    .line 3
    if-lt p0, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x2f

    .line 6
    .line 7
    if-gt p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/16 v0, -0x800

    .line 12
    .line 13
    if-lt p0, v0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x7ff

    .line 16
    .line 17
    if-gt p0, v0, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x2

    .line 20
    return p0

    .line 21
    :cond_1
    const/high16 v0, -0x40000

    .line 22
    .line 23
    if-lt p0, v0, :cond_2

    .line 24
    .line 25
    const v0, 0x3ffff

    .line 26
    .line 27
    .line 28
    if-gt p0, v0, :cond_2

    .line 29
    .line 30
    const/4 p0, 0x3

    .line 31
    return p0

    .line 32
    :cond_2
    const/4 p0, 0x5

    .line 33
    return p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/high16 v2, 0x800000

    .line 5
    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏哲兰楪:Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

    .line 11
    .line 12
    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p0, "<empty>"

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 9
    .line 10
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪兰苏:[Z

    .line 15
    .line 16
    new-instance v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;

    .line 17
    .line 18
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    array-length v3, v0

    .line 23
    invoke-direct {v1, v3, v2, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;-><init>(ILcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;[B)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏楪兰哲世()Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :try_start_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰世哲楪(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    return-object p0

    .line 42
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    aget-byte v1, v1, v2

    .line 51
    .line 52
    invoke-static {v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(B)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, ", bytes length "

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 65
    .line 66
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method

.method public final 飘花落叶言子兰世哲楪苏([B)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 8
    .line 9
    array-length v1, p1

    .line 10
    add-int/lit8 v2, v0, 0x6

    .line 11
    .line 12
    array-length v3, p1

    .line 13
    mul-int/lit8 v3, v3, 0x2

    .line 14
    .line 15
    add-int/2addr v3, v2

    .line 16
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 17
    .line 18
    array-length v4, v2

    .line 19
    if-le v3, v4, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :cond_1
    const/16 v3, 0xf

    .line 26
    .line 27
    if-gt v1, v3, :cond_2

    .line 28
    .line 29
    add-int/lit8 v3, v0, 0x1

    .line 30
    .line 31
    add-int/lit8 v1, v1, -0x6c

    .line 32
    .line 33
    int-to-byte v1, v1

    .line 34
    aput-byte v1, v2, v0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const/16 v3, -0x5c

    .line 38
    .line 39
    aput-byte v3, v2, v0

    .line 40
    .line 41
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    invoke-static {v0, v2, v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    :goto_0
    array-length v0, p1

    .line 48
    const/4 v1, 0x0

    .line 49
    :goto_1
    if-ge v1, v0, :cond_5

    .line 50
    .line 51
    aget-byte v4, p1, v1

    .line 52
    .line 53
    const/16 v5, -0x10

    .line 54
    .line 55
    if-lt v4, v5, :cond_3

    .line 56
    .line 57
    const/16 v5, 0x2f

    .line 58
    .line 59
    if-le v4, v5, :cond_4

    .line 60
    .line 61
    :cond_3
    add-int/lit8 v5, v3, 0x1

    .line 62
    .line 63
    shr-int/lit8 v6, v4, 0x8

    .line 64
    .line 65
    add-int/lit8 v6, v6, 0x38

    .line 66
    .line 67
    int-to-byte v6, v6

    .line 68
    aput-byte v6, v2, v3

    .line 69
    .line 70
    move v3, v5

    .line 71
    :cond_4
    add-int/lit8 v5, v3, 0x1

    .line 72
    .line 73
    int-to-byte v4, v4

    .line 74
    aput-byte v4, v2, v3

    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    move v3, v5

    .line 79
    goto :goto_1

    .line 80
    :cond_5
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 81
    .line 82
    return-void
.end method

.method public final 飘花落叶言子兰世哲苏楪(Ljava/time/LocalDate;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x5

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    const/16 p1, -0x51

    .line 17
    .line 18
    aput-byte p1, v1, v0

    .line 19
    .line 20
    add-int/lit8 v2, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/16 v3, -0x57

    .line 24
    .line 25
    aput-byte v3, v1, v0

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/time/LocalDate;->getYear()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    shl-int/lit8 v3, v3, 0x10

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/time/LocalDate;->getMonthValue()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    shl-int/lit8 v4, v4, 0x8

    .line 40
    .line 41
    or-int/2addr v3, v4

    .line 42
    invoke-virtual {p1}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    or-int/2addr p1, v3

    .line 47
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 48
    .line 49
    .line 50
    :goto_0
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 51
    .line 52
    return-void
.end method

.method public final 飘花落叶言子兰世楪哲苏(Ljava/lang/Long;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x9

    .line 4
    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    if-le v0, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    invoke-static {v2, v3, v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(J[BI)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 25
    .line 26
    return-void
.end method

.method public final 飘花落叶言子兰世楪苏哲(J)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x9

    .line 4
    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    if-le v0, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 15
    .line 16
    invoke-static {p1, p2, v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(J[BI)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 21
    .line 22
    return-void
.end method

.method public final 飘花落叶言子兰世苏哲楪(B)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x2

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    shl-int/lit8 p1, p1, 0x8

    .line 15
    .line 16
    or-int/lit16 p1, p1, 0xbd

    .line 17
    .line 18
    int-to-short p1, p1

    .line 19
    invoke-static {v1, v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲楪兰世([BIS)V

    .line 20
    .line 21
    .line 22
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 23
    .line 24
    return-void
.end method

.method public final 飘花落叶言子兰世苏楪哲([J)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    array-length v0, p1

    .line 8
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 9
    .line 10
    const/16 v2, 0x9

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-static {v0, v2, v1, v3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 18
    .line 19
    array-length v4, v3

    .line 20
    if-le v2, v4, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    :cond_1
    const/16 v2, 0xf

    .line 27
    .line 28
    if-gt v0, v2, :cond_2

    .line 29
    .line 30
    add-int/lit8 v2, v1, 0x1

    .line 31
    .line 32
    add-int/lit8 v0, v0, -0x6c

    .line 33
    .line 34
    int-to-byte v0, v0

    .line 35
    aput-byte v0, v3, v1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/16 v2, -0x5c

    .line 39
    .line 40
    aput-byte v2, v3, v1

    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    invoke-static {v1, v3, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    :goto_0
    const/4 v0, 0x0

    .line 49
    :goto_1
    array-length v1, p1

    .line 50
    if-ge v0, v1, :cond_3

    .line 51
    .line 52
    aget-wide v4, p1, v0

    .line 53
    .line 54
    invoke-static {v4, v5, v3, v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(J[BI)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 62
    .line 63
    return-void
.end method

.method public final 飘花落叶言子兰哲楪世苏([C)V
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子兰哲楪苏世()V
    .locals 1

    .line 1
    const/16 v0, -0x51

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子世苏哲兰(B)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子兰哲苏世楪(Ljava/time/OffsetTime;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x15

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    const/16 p1, -0x51

    .line 17
    .line 18
    aput-byte p1, v1, v0

    .line 19
    .line 20
    :goto_0
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const v2, -0x55f84dff

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v2, v0, 0x4

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/time/OffsetTime;->getHour()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    shl-int/lit8 v3, v3, 0x10

    .line 36
    .line 37
    const/high16 v4, 0x1000000

    .line 38
    .line 39
    or-int/2addr v3, v4

    .line 40
    invoke-virtual {p1}, Ljava/time/OffsetTime;->getMinute()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    shl-int/lit8 v4, v4, 0x8

    .line 45
    .line 46
    or-int/2addr v3, v4

    .line 47
    invoke-virtual {p1}, Ljava/time/OffsetTime;->getSecond()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    or-int/2addr v3, v4

    .line 52
    invoke-static {v2, v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x8

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/time/OffsetTime;->getNano()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {p1}, Ljava/time/OffsetTime;->getOffset()Ljava/time/ZoneOffset;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    add-int/lit8 v3, v2, 0x49

    .line 78
    .line 79
    int-to-byte v3, v3

    .line 80
    aput-byte v3, v1, v0

    .line 81
    .line 82
    add-int/lit8 v3, v0, 0x1

    .line 83
    .line 84
    const/4 v4, 0x0

    .line 85
    invoke-virtual {p1, v4, v2, v1, v3}, Ljava/lang/String;->getBytes(II[BI)V

    .line 86
    .line 87
    .line 88
    add-int/2addr v0, v2

    .line 89
    goto :goto_0

    .line 90
    :goto_1
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 91
    .line 92
    return-void
.end method

.method public final 飘花落叶言子兰哲苏楪世(Ljava/time/OffsetDateTime;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x15

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    const/16 p1, -0x51

    .line 17
    .line 18
    aput-byte p1, v1, v0

    .line 19
    .line 20
    :goto_0
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    invoke-virtual {p1}, Ljava/time/OffsetDateTime;->getYear()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    shl-int/lit8 v2, v2, 0x8

    .line 28
    .line 29
    const/high16 v3, -0x56000000

    .line 30
    .line 31
    or-int/2addr v2, v3

    .line 32
    invoke-virtual {p1}, Ljava/time/OffsetDateTime;->getMonthValue()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    or-int/2addr v2, v3

    .line 37
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v2, v0, 0x4

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/time/OffsetDateTime;->getDayOfMonth()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    shl-int/lit8 v3, v3, 0x18

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/time/OffsetDateTime;->getHour()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    shl-int/lit8 v4, v4, 0x10

    .line 53
    .line 54
    or-int/2addr v3, v4

    .line 55
    invoke-virtual {p1}, Ljava/time/OffsetDateTime;->getMinute()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    shl-int/lit8 v4, v4, 0x8

    .line 60
    .line 61
    or-int/2addr v3, v4

    .line 62
    invoke-virtual {p1}, Ljava/time/OffsetDateTime;->getSecond()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    or-int/2addr v3, v4

    .line 67
    invoke-static {v2, v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v0, v0, 0x8

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/time/OffsetDateTime;->getNano()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-virtual {p1}, Ljava/time/OffsetDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    add-int/lit8 v3, v2, 0x49

    .line 93
    .line 94
    int-to-byte v3, v3

    .line 95
    aput-byte v3, v1, v0

    .line 96
    .line 97
    add-int/lit8 v3, v0, 0x1

    .line 98
    .line 99
    const/4 v4, 0x0

    .line 100
    invoke-virtual {p1, v4, v2, v1, v3}, Ljava/lang/String;->getBytes(II[BI)V

    .line 101
    .line 102
    .line 103
    add-int/2addr v0, v2

    .line 104
    goto :goto_0

    .line 105
    :goto_1
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 106
    .line 107
    return-void
.end method

.method public final 飘花落叶言子兰楪世哲苏(S)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x3

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    const/16 v3, -0x44

    .line 15
    .line 16
    aput-byte v3, v1, v0

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    invoke-static {v1, v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲楪世兰([BIS)V

    .line 21
    .line 22
    .line 23
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 24
    .line 25
    return-void
.end method

.method public final 飘花落叶言子兰楪世苏哲(Ljava/time/Instant;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0xf

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    const/16 p1, -0x51

    .line 17
    .line 18
    aput-byte p1, v1, v0

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/16 v2, -0x52

    .line 24
    .line 25
    aput-byte v2, v1, v0

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/time/Instant;->getEpochSecond()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    invoke-static {v2, v3, v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(J[BI)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1}, Ljava/time/Instant;->getNano()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    :goto_0
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 46
    .line 47
    return-void
.end method

.method public final 飘花落叶言子兰楪哲世苏(Ljava/lang/Integer;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x5

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {v0, v2, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 23
    .line 24
    return-void
.end method

.method public final 飘花落叶言子兰楪哲苏世([I)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 8
    .line 9
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 10
    .line 11
    array-length v2, p1

    .line 12
    add-int/lit8 v3, v0, 0x6

    .line 13
    .line 14
    array-length v4, p1

    .line 15
    mul-int/lit8 v4, v4, 0x5

    .line 16
    .line 17
    add-int/2addr v4, v3

    .line 18
    array-length v3, v1

    .line 19
    if-le v4, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :cond_1
    const/16 v3, 0xf

    .line 26
    .line 27
    if-gt v2, v3, :cond_2

    .line 28
    .line 29
    add-int/lit8 v3, v0, 0x1

    .line 30
    .line 31
    add-int/lit8 v2, v2, -0x6c

    .line 32
    .line 33
    int-to-byte v2, v2

    .line 34
    aput-byte v2, v1, v0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const/16 v3, -0x5c

    .line 38
    .line 39
    aput-byte v3, v1, v0

    .line 40
    .line 41
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    :goto_0
    const/4 v0, 0x0

    .line 48
    :goto_1
    array-length v2, p1

    .line 49
    if-ge v0, v2, :cond_3

    .line 50
    .line 51
    aget v2, p1, v0

    .line 52
    .line 53
    invoke-static {v3, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 61
    .line 62
    return-void
.end method

.method public final 飘花落叶言子兰楪苏世哲([S)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    array-length v0, p1

    .line 8
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏哲兰世楪(I)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    array-length v1, p1

    .line 13
    if-ge v0, v1, :cond_1

    .line 14
    .line 15
    aget-short v1, p1, v0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子兰楪苏哲世(I)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子兰楪苏哲世(I)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x5

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    :cond_0
    invoke-static {v0, v2, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 19
    .line 20
    return-void
.end method

.method public final 飘花落叶言子兰苏世哲楪(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言子兰苏世楪哲(J)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 6
    .line 7
    add-int/lit8 v4, v3, 0x9

    .line 8
    .line 9
    iget-object v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 10
    .line 11
    array-length v6, v5

    .line 12
    if-le v4, v6, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    :cond_0
    const-wide/16 v6, 0x3e8

    .line 19
    .line 20
    rem-long v8, v1, v6

    .line 21
    .line 22
    const-wide/16 v10, 0x0

    .line 23
    .line 24
    cmp-long v8, v8, v10

    .line 25
    .line 26
    if-nez v8, :cond_2

    .line 27
    .line 28
    div-long v6, v1, v6

    .line 29
    .line 30
    const-wide/32 v8, -0x80000000

    .line 31
    .line 32
    .line 33
    cmp-long v12, v6, v8

    .line 34
    .line 35
    const-wide/32 v13, 0x7fffffff

    .line 36
    .line 37
    .line 38
    if-ltz v12, :cond_1

    .line 39
    .line 40
    cmp-long v12, v6, v13

    .line 41
    .line 42
    if-gtz v12, :cond_1

    .line 43
    .line 44
    long-to-int v1, v6

    .line 45
    const/16 v2, -0x54

    .line 46
    .line 47
    aput-byte v2, v5, v3

    .line 48
    .line 49
    add-int/lit8 v2, v3, 0x1

    .line 50
    .line 51
    invoke-static {v2, v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v3, v3, 0x5

    .line 55
    .line 56
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    const-wide/16 v15, 0x3c

    .line 60
    .line 61
    rem-long v17, v6, v15

    .line 62
    .line 63
    cmp-long v10, v17, v10

    .line 64
    .line 65
    if-nez v10, :cond_2

    .line 66
    .line 67
    div-long/2addr v6, v15

    .line 68
    cmp-long v8, v6, v8

    .line 69
    .line 70
    if-ltz v8, :cond_2

    .line 71
    .line 72
    cmp-long v8, v6, v13

    .line 73
    .line 74
    if-gtz v8, :cond_2

    .line 75
    .line 76
    long-to-int v1, v6

    .line 77
    const/16 v2, -0x53

    .line 78
    .line 79
    aput-byte v2, v5, v3

    .line 80
    .line 81
    add-int/lit8 v2, v3, 0x1

    .line 82
    .line 83
    invoke-static {v2, v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 84
    .line 85
    .line 86
    add-int/lit8 v3, v3, 0x5

    .line 87
    .line 88
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 89
    .line 90
    return-void

    .line 91
    :cond_2
    const/16 v6, -0x55

    .line 92
    .line 93
    aput-byte v6, v5, v3

    .line 94
    .line 95
    add-int/lit8 v3, v3, 0x1

    .line 96
    .line 97
    invoke-static {v1, v2, v5, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏世楪哲兰(J[BI)V

    .line 98
    .line 99
    .line 100
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 101
    .line 102
    return-void
.end method

.method public final 飘花落叶言子兰苏哲世楪([B)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子世兰哲苏([B)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言子兰苏哲楪世(J[B)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x6

    .line 4
    .line 5
    array-length v2, p3

    .line 6
    add-int/2addr v1, v2

    .line 7
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 8
    .line 9
    array-length v3, v2

    .line 10
    if-le v1, v3, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 17
    .line 18
    iget-wide v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 19
    .line 20
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNameAsSymbol:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 21
    .line 22
    iget-wide v5, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 23
    .line 24
    and-long/2addr v3, v5

    .line 25
    const-wide/16 v5, 0x0

    .line 26
    .line 27
    cmp-long v1, v3, v5

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    array-length p1, p3

    .line 33
    invoke-static {p3, v3, v2, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 34
    .line 35
    .line 36
    array-length p1, p3

    .line 37
    add-int/2addr v0, p1

    .line 38
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰哲楪:L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    iget v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世哲楪苏兰:I

    .line 46
    .line 47
    invoke-virtual {v1, v4, p1, p2}, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IJ)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世哲楪苏兰:I

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    if-eq p1, p2, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    add-int/2addr p2, v1

    .line 58
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世哲楪苏兰:I

    .line 59
    .line 60
    move v1, v3

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    new-instance v1, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;

    .line 63
    .line 64
    invoke-direct {v1}, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰哲楪:L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;

    .line 68
    .line 69
    iget v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世哲楪苏兰:I

    .line 70
    .line 71
    add-int/lit8 v5, v4, 0x1

    .line 72
    .line 73
    iput v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世哲楪苏兰:I

    .line 74
    .line 75
    invoke-virtual {v1, v4, p1, p2}, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(IJ)V

    .line 76
    .line 77
    .line 78
    move v1, v3

    .line 79
    move p1, v4

    .line 80
    :goto_0
    const/16 p2, 0x2f

    .line 81
    .line 82
    const/16 v4, -0x10

    .line 83
    .line 84
    const/16 v5, 0x7f

    .line 85
    .line 86
    if-nez v1, :cond_5

    .line 87
    .line 88
    add-int/lit8 v1, v0, 0x1

    .line 89
    .line 90
    aput-byte v5, v2, v0

    .line 91
    .line 92
    array-length v0, p3

    .line 93
    invoke-static {p3, v3, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 94
    .line 95
    .line 96
    array-length p3, p3

    .line 97
    add-int/2addr v1, p3

    .line 98
    if-lt p1, v4, :cond_4

    .line 99
    .line 100
    if-gt p1, p2, :cond_4

    .line 101
    .line 102
    add-int/lit8 p2, v1, 0x1

    .line 103
    .line 104
    int-to-byte p1, p1

    .line 105
    aput-byte p1, v2, v1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    invoke-static {v1, v2, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    :goto_1
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 113
    .line 114
    return-void

    .line 115
    :cond_5
    neg-int p1, p1

    .line 116
    add-int/lit8 p3, v0, 0x1

    .line 117
    .line 118
    aput-byte v5, v2, v0

    .line 119
    .line 120
    neg-int p1, p1

    .line 121
    if-lt p1, v4, :cond_6

    .line 122
    .line 123
    if-gt p1, p2, :cond_6

    .line 124
    .line 125
    add-int/lit8 v0, v0, 0x2

    .line 126
    .line 127
    int-to-byte p1, p1

    .line 128
    aput-byte p1, v2, p3

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_6
    invoke-static {p3, v2, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    :goto_2
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 136
    .line 137
    return-void
.end method

.method public final 飘花落叶言子兰苏楪世哲(Ljava/time/LocalDateTime;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0xd

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    const/16 p1, -0x51

    .line 17
    .line 18
    aput-byte p1, v1, v0

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->getYear()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    shl-int/lit8 v2, v2, 0x8

    .line 28
    .line 29
    const/high16 v3, -0x58000000

    .line 30
    .line 31
    or-int/2addr v2, v3

    .line 32
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->getMonthValue()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    or-int/2addr v2, v3

    .line 37
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v2, v0, 0x4

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    shl-int/lit8 v3, v3, 0x18

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->getHour()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    shl-int/lit8 v4, v4, 0x10

    .line 53
    .line 54
    or-int/2addr v3, v4

    .line 55
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->getMinute()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    shl-int/lit8 v4, v4, 0x8

    .line 60
    .line 61
    or-int/2addr v3, v4

    .line 62
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->getSecond()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    or-int/2addr v3, v4

    .line 67
    invoke-static {v2, v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v0, v0, 0x8

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->getNano()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    :goto_0
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 81
    .line 82
    return-void
.end method

.method public final 飘花落叶言子兰苏楪哲世(Ljava/time/LocalTime;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x9

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    const/16 p1, -0x51

    .line 17
    .line 18
    aput-byte p1, v1, v0

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p1}, Ljava/time/LocalTime;->getHour()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    shl-int/lit8 v2, v2, 0x10

    .line 28
    .line 29
    const/high16 v3, -0x59000000

    .line 30
    .line 31
    or-int/2addr v2, v3

    .line 32
    invoke-virtual {p1}, Ljava/time/LocalTime;->getMinute()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    shl-int/lit8 v3, v3, 0x8

    .line 37
    .line 38
    or-int/2addr v2, v3

    .line 39
    invoke-virtual {p1}, Ljava/time/LocalTime;->getSecond()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    or-int/2addr v2, v3

    .line 44
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x4

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/time/LocalTime;->getNano()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    :goto_0
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 58
    .line 59
    return-void
.end method

.method public final 飘花落叶言子哲世兰楪苏(IIIIII)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子哲世苏兰楪(IIIIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言子哲世兰苏楪(IIIIIIIIZ)V
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p1, "unsupported operation"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子哲世楪兰苏()V
    .locals 1

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v0, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子哲世楪苏兰(C)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x6

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    const/16 v2, -0x70

    .line 15
    .line 16
    aput-byte v2, v1, v0

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 25
    .line 26
    return-void
.end method

.method public final 飘花落叶言子哲世苏兰楪(IIIIII)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x9

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    const v3, 0xffff

    .line 15
    .line 16
    .line 17
    and-int/2addr p1, v3

    .line 18
    shl-int/lit8 p1, p1, 0x8

    .line 19
    .line 20
    const/high16 v3, -0x58000000

    .line 21
    .line 22
    or-int/2addr p1, v3

    .line 23
    or-int/2addr p1, p2

    .line 24
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 p1, v0, 0x4

    .line 28
    .line 29
    shl-int/lit8 p2, p3, 0x18

    .line 30
    .line 31
    shl-int/lit8 p3, p4, 0x10

    .line 32
    .line 33
    or-int/2addr p2, p3

    .line 34
    shl-int/lit8 p3, p5, 0x8

    .line 35
    .line 36
    or-int/2addr p2, p3

    .line 37
    or-int/2addr p2, p6

    .line 38
    invoke-static {p1, v1, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v0, v0, 0x8

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    aput-byte p1, v1, v0

    .line 45
    .line 46
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 47
    .line 48
    return-void
.end method

.method public final 飘花落叶言子哲世苏楪兰()V
    .locals 1

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v0, "unsupported operation"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子哲兰世楪苏(F)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x5

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    :cond_0
    invoke-static {v2, v0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏([BIF)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 19
    .line 20
    return-void
.end method

.method public final 飘花落叶言子哲兰楪世苏([D)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    move v3, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    array-length v3, p1

    .line 11
    mul-int/lit8 v3, v3, 0x9

    .line 12
    .line 13
    add-int/lit8 v3, v3, 0x5

    .line 14
    .line 15
    :goto_0
    add-int/2addr v3, v0

    .line 16
    array-length v4, v1

    .line 17
    if-le v3, v4, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_1
    if-nez p1, :cond_2

    .line 24
    .line 25
    const/16 p1, -0x51

    .line 26
    .line 27
    aput-byte p1, v1, v0

    .line 28
    .line 29
    add-int/2addr v0, v2

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    array-length v2, p1

    .line 32
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(I[BI)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    array-length v2, p1

    .line 37
    const/4 v3, 0x0

    .line 38
    :goto_1
    if-ge v3, v2, :cond_3

    .line 39
    .line 40
    aget-wide v4, p1, v3

    .line 41
    .line 42
    invoke-static {v1, v0, v4, v5}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰([BID)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    :goto_2
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 50
    .line 51
    return-void
.end method

.method public final 飘花落叶言子哲兰楪苏世(Ljava/lang/Enum;)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 10
    .line 11
    const-wide/16 v2, 0x6000

    .line 12
    .line 13
    and-long/2addr v2, v0

    .line 14
    const-wide/16 v4, 0x0

    .line 15
    .line 16
    cmp-long v2, v2, v4

    .line 17
    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteEnumUsingToString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 21
    .line 22
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 23
    .line 24
    and-long/2addr v0, v2

    .line 25
    cmp-long v0, v0, v4

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :goto_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 47
    .line 48
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 49
    .line 50
    add-int/lit8 v2, v1, 0x5

    .line 51
    .line 52
    array-length v3, v0

    .line 53
    if-le v2, v3, :cond_3

    .line 54
    .line 55
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :cond_3
    invoke-static {v1, v0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 64
    .line 65
    return-void
.end method

.method public final 飘花落叶言子哲兰苏世楪([B)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子哲楪苏世兰([B)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言子哲兰苏楪世([F)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    move v3, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    array-length v3, p1

    .line 11
    mul-int/lit8 v3, v3, 0x5

    .line 12
    .line 13
    add-int/lit8 v3, v3, 0x5

    .line 14
    .line 15
    :goto_0
    add-int/2addr v3, v0

    .line 16
    array-length v4, v1

    .line 17
    if-le v3, v4, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_1
    if-nez p1, :cond_2

    .line 24
    .line 25
    const/16 p1, -0x51

    .line 26
    .line 27
    aput-byte p1, v1, v0

    .line 28
    .line 29
    add-int/2addr v0, v2

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    array-length v2, p1

    .line 32
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(I[BI)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    array-length v2, p1

    .line 37
    const/4 v3, 0x0

    .line 38
    :goto_1
    if-ge v3, v2, :cond_3

    .line 39
    .line 40
    aget v4, p1, v3

    .line 41
    .line 42
    invoke-static {v1, v0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏([BIF)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    :goto_2
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 50
    .line 51
    return-void
.end method

.method public final 飘花落叶言子哲楪世兰苏(Ljava/math/BigInteger;J)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 8
    .line 9
    iget-object p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 10
    .line 11
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/math/BigInteger;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    add-int/lit8 v0, p2, 0xa

    .line 18
    .line 19
    array-length v1, p3

    .line 20
    if-le v0, v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    :cond_1
    const/16 v0, -0x46

    .line 27
    .line 28
    aput-byte v0, p3, p2

    .line 29
    .line 30
    add-int/lit8 p2, p2, 0x1

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/math/BigInteger;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    invoke-static {v0, v1, p3, p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(J[BI)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    add-int/lit8 v0, p2, 0x5

    .line 48
    .line 49
    array-length v1, p1

    .line 50
    add-int/2addr v0, v1

    .line 51
    array-length v1, p3

    .line 52
    if-le v0, v1, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    :cond_3
    const/16 v0, -0x45

    .line 59
    .line 60
    aput-byte v0, p3, p2

    .line 61
    .line 62
    add-int/lit8 p2, p2, 0x1

    .line 63
    .line 64
    array-length v0, p1

    .line 65
    invoke-static {p2, p3, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    const/4 v0, 0x0

    .line 70
    array-length v1, p1

    .line 71
    invoke-static {p1, v0, p3, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 72
    .line 73
    .line 74
    array-length p1, p1

    .line 75
    add-int/2addr p2, p1

    .line 76
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 77
    .line 78
    return-void
.end method

.method public final 飘花落叶言子哲楪世苏兰([B)V
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子哲楪兰世苏([Z)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    move v3, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    array-length v3, p1

    .line 11
    add-int/lit8 v3, v3, 0x5

    .line 12
    .line 13
    :goto_0
    add-int/2addr v3, v0

    .line 14
    array-length v4, v1

    .line 15
    if-le v3, v4, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_1
    if-nez p1, :cond_2

    .line 22
    .line 23
    const/16 p1, -0x51

    .line 24
    .line 25
    aput-byte p1, v1, v0

    .line 26
    .line 27
    add-int/2addr v0, v2

    .line 28
    goto :goto_3

    .line 29
    :cond_2
    array-length v2, p1

    .line 30
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(I[BI)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v2, 0x0

    .line 35
    :goto_1
    array-length v3, p1

    .line 36
    if-ge v2, v3, :cond_4

    .line 37
    .line 38
    add-int v3, v0, v2

    .line 39
    .line 40
    aget-boolean v4, p1, v2

    .line 41
    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    const/16 v4, -0x4f

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    const/16 v4, -0x50

    .line 48
    .line 49
    :goto_2
    aput-byte v4, v1, v3

    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_4
    array-length p1, p1

    .line 55
    add-int/2addr v0, p1

    .line 56
    :goto_3
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 57
    .line 58
    return-void
.end method

.method public final 飘花落叶言子哲楪苏世兰([B)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 8
    .line 9
    array-length v1, p1

    .line 10
    add-int/lit8 v2, v0, 0x6

    .line 11
    .line 12
    add-int/2addr v2, v1

    .line 13
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 14
    .line 15
    array-length v4, v3

    .line 16
    if-le v2, v4, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    :cond_1
    const/16 v2, -0x6f

    .line 23
    .line 24
    aput-byte v2, v3, v0

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    invoke-static {v0, v3, v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-static {p1, v2, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 34
    .line 35
    .line 36
    add-int/2addr v0, v1

    .line 37
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 38
    .line 39
    return-void
.end method

.method public final 飘花落叶言子哲楪苏兰世(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/16 p1, -0x4f

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/16 p1, -0x50

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子世苏哲兰(B)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final 飘花落叶言子哲苏世楪兰(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/math/BigDecimal;->precision()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-virtual {p1}, Ljava/math/BigDecimal;->scale()I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    iget p4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 16
    .line 17
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 18
    .line 19
    add-int/lit8 v1, p4, 0xf

    .line 20
    .line 21
    array-length v2, v0

    .line 22
    if-le v1, v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_1
    const/16 v1, 0x13

    .line 29
    .line 30
    const/16 v2, -0x47

    .line 31
    .line 32
    const/16 v3, -0x48

    .line 33
    .line 34
    if-ge p2, v1, :cond_4

    .line 35
    .line 36
    sget-wide v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲:J

    .line 37
    .line 38
    const-wide/16 v6, -0x1

    .line 39
    .line 40
    cmp-long p2, v4, v6

    .line 41
    .line 42
    if-eqz p2, :cond_4

    .line 43
    .line 44
    sget-object p2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 45
    .line 46
    invoke-virtual {p2, p1, v4, v5}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    if-nez p3, :cond_2

    .line 51
    .line 52
    aput-byte v3, v0, p4

    .line 53
    .line 54
    add-int/lit8 p4, p4, 0x1

    .line 55
    .line 56
    invoke-static {p1, p2, v0, p4}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(J[BI)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    aput-byte v2, v0, p4

    .line 64
    .line 65
    add-int/lit8 p4, p4, 0x1

    .line 66
    .line 67
    invoke-static {p4, v0, p3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    const-wide/32 v1, -0x80000000

    .line 72
    .line 73
    .line 74
    cmp-long p4, p1, v1

    .line 75
    .line 76
    if-ltz p4, :cond_3

    .line 77
    .line 78
    const-wide/32 v1, 0x7fffffff

    .line 79
    .line 80
    .line 81
    cmp-long p4, p1, v1

    .line 82
    .line 83
    if-gtz p4, :cond_3

    .line 84
    .line 85
    long-to-int p1, p1

    .line 86
    invoke-static {p3, v0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    goto :goto_0

    .line 91
    :cond_3
    invoke-static {p1, p2, v0, p3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(J[BI)I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    :goto_0
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 96
    .line 97
    return-void

    .line 98
    :cond_4
    invoke-virtual {p1}, Ljava/math/BigDecimal;->unscaledValue()Ljava/math/BigInteger;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-nez p3, :cond_5

    .line 103
    .line 104
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/math/BigInteger;)Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-eqz p2, :cond_5

    .line 109
    .line 110
    aput-byte v3, v0, p4

    .line 111
    .line 112
    add-int/lit8 p4, p4, 0x1

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/math/BigInteger;->longValue()J

    .line 115
    .line 116
    .line 117
    move-result-wide p1

    .line 118
    invoke-static {p1, p2, v0, p4}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(J[BI)I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 123
    .line 124
    return-void

    .line 125
    :cond_5
    aput-byte v2, v0, p4

    .line 126
    .line 127
    add-int/lit8 p4, p4, 0x1

    .line 128
    .line 129
    invoke-static {p4, v0, p3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲世兰苏(Ljava/math/BigInteger;)Z

    .line 134
    .line 135
    .line 136
    move-result p3

    .line 137
    if-eqz p3, :cond_6

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    invoke-static {p2, v0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    goto :goto_1

    .line 148
    :cond_6
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/math/BigInteger;)Z

    .line 149
    .line 150
    .line 151
    move-result p3

    .line 152
    if-eqz p3, :cond_7

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/math/BigInteger;->longValue()J

    .line 155
    .line 156
    .line 157
    move-result-wide p3

    .line 158
    invoke-static {p3, p4, v0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(J[BI)I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    :goto_1
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 163
    .line 164
    return-void

    .line 165
    :cond_7
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 166
    .line 167
    const-wide/16 p2, 0x0

    .line 168
    .line 169
    invoke-virtual {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子哲楪世兰苏(Ljava/math/BigInteger;J)V

    .line 170
    .line 171
    .line 172
    return-void
.end method

.method public final 飘花落叶言子哲苏兰楪世(D)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x9

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    invoke-static {v1, v0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰([BID)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 19
    .line 20
    return-void
.end method

.method public final 飘花落叶言子哲苏楪世兰(III)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子哲苏楪兰世(III)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言子哲苏楪兰世(III)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x5

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    const/16 v3, -0x57

    .line 15
    .line 16
    aput-byte v3, v1, v0

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    shl-int/lit8 p1, p1, 0x10

    .line 21
    .line 22
    shl-int/lit8 p2, p2, 0x8

    .line 23
    .line 24
    or-int/2addr p1, p2

    .line 25
    or-int/2addr p1, p3

    .line 26
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 27
    .line 28
    .line 29
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 30
    .line 31
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 6
    .line 7
    const/16 v0, -0x5b

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子世苏哲兰(B)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰()V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子苏兰世哲楪(Ljava/lang/Object;)V
    .locals 10

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    iget-wide v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 10
    .line 11
    sget-object v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v1, v3

    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    cmp-long v1, v1, v3

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v1, 0x0

    .line 25
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 30
    .line 31
    invoke-virtual {v0, v2, v2, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏兰哲世()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    const-wide/16 v7, 0x0

    .line 43
    .line 44
    move-object v4, p0

    .line 45
    move-object v5, p1

    .line 46
    invoke-interface/range {v3 .. v8}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    move-object v4, p0

    .line 51
    move-object v5, p1

    .line 52
    const/4 v7, 0x0

    .line 53
    const-wide/16 v8, 0x0

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    invoke-interface/range {v3 .. v9}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final 飘花落叶言子苏兰世楪哲(Ljava/util/Map;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏兰楪世哲()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏兰世哲楪(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏兰世哲楪(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子楪世兰哲苏()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final 飘花落叶言子苏兰哲世楪(J)V
    .locals 2

    .line 1
    sget-wide v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世苏楪哲兰:J

    .line 2
    .line 3
    and-long/2addr p1, v0

    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long p1, p1, v0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/16 p1, -0x6c

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/16 p1, -0x51

    .line 14
    .line 15
    :goto_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子世苏哲兰(B)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final 飘花落叶言子苏兰哲楪世()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-wide v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世苏楪哲兰:J

    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/16 v0, -0x6c

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/16 v0, -0x51

    .line 18
    .line 19
    :goto_0
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子世苏哲兰(B)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final 飘花落叶言子苏兰楪世哲()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    iget v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲兰苏:I

    .line 10
    .line 11
    if-gt v0, v1, :cond_0

    .line 12
    .line 13
    const/16 v0, -0x5a

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子世苏哲兰(B)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世哲楪兰()V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
.end method

.method public final 飘花落叶言子苏兰楪哲世(Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏哲兰世楪(I)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏兰世哲楪(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子苏哲兰世楪(I)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x6

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(I[BI)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 19
    .line 20
    return-void
.end method

.method public final 飘花落叶言子苏哲兰楪世()V
    .locals 1

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v0, "unsupported operation"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言楪世子兰苏哲(I)[B
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-virtual {p0, p1, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏楪哲兰世(II)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 13
    .line 14
    return-object p1
.end method

.method public final 飘花落叶言楪世子哲兰苏(Ljava/time/ZonedDateTime;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 8
    .line 9
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0xd

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_1
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->getYear()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    shl-int/lit8 v2, v2, 0x8

    .line 25
    .line 26
    const/high16 v3, -0x56000000

    .line 27
    .line 28
    or-int/2addr v2, v3

    .line 29
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    or-int/2addr v2, v3

    .line 34
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v2, v0, 0x4

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    shl-int/lit8 v3, v3, 0x18

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->getHour()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    shl-int/lit8 v4, v4, 0x10

    .line 50
    .line 51
    or-int/2addr v3, v4

    .line 52
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    shl-int/lit8 v4, v4, 0x8

    .line 57
    .line 58
    or-int/2addr v3, v4

    .line 59
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    or-int/2addr v3, v4

    .line 64
    invoke-static {v2, v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 v0, v0, 0x8

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->getNano()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->getZone()Ljava/time/ZoneId;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const-string v0, "Asia/Shanghai"

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_2

    .line 94
    .line 95
    sget-object p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世哲苏楪兰:[B

    .line 96
    .line 97
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子世兰哲苏([B)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_2
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final 飘花落叶言楪世子哲苏兰(Ljava/util/UUID;)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x12

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    const/16 p1, -0x51

    .line 17
    .line 18
    aput-byte p1, v1, v0

    .line 19
    .line 20
    add-int/lit8 v2, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/16 v3, 0x1091

    .line 24
    .line 25
    invoke-static {v1, v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲楪兰世([BIS)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v3, v0, 0x2

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    invoke-static {v4, v5, v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏世楪哲兰(J[BI)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v0, v0, 0xa

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    invoke-static {v3, v4, v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏世楪哲兰(J[BI)V

    .line 44
    .line 45
    .line 46
    :goto_0
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 47
    .line 48
    return-void
.end method

.method public final 飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 4
    .line 5
    iget-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-ne v1, v3, :cond_0

    .line 9
    .line 10
    add-int/lit8 v2, v1, 0x1

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    :cond_0
    add-int/lit8 v3, v1, 0x1

    .line 17
    .line 18
    const/16 v4, -0x6e

    .line 19
    .line 20
    aput-byte v4, v2, v1

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    iget-object v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰哲楪:L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;

    .line 27
    .line 28
    const/4 v7, -0x1

    .line 29
    if-eqz v6, :cond_7

    .line 30
    .line 31
    iget-object v8, v6, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:[J

    .line 32
    .line 33
    array-length v9, v8

    .line 34
    const/16 v10, 0x20

    .line 35
    .line 36
    ushr-long v10, v4, v10

    .line 37
    .line 38
    xor-long/2addr v10, v4

    .line 39
    long-to-int v10, v10

    .line 40
    const v11, 0x7fffffff

    .line 41
    .line 42
    .line 43
    and-int/2addr v10, v11

    .line 44
    rem-int v9, v10, v9

    .line 45
    .line 46
    aget-wide v11, v8, v9

    .line 47
    .line 48
    const-wide/16 v13, 0x0

    .line 49
    .line 50
    cmp-long v15, v11, v13

    .line 51
    .line 52
    if-nez v15, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    cmp-long v11, v11, v4

    .line 56
    .line 57
    if-nez v11, :cond_2

    .line 58
    .line 59
    iget-object v6, v6, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[I

    .line 60
    .line 61
    aget v6, v6, v9

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    array-length v8, v8

    .line 65
    add-int/lit8 v11, v8, -0x2

    .line 66
    .line 67
    rem-int/2addr v10, v11

    .line 68
    add-int/lit8 v10, v10, 0x1

    .line 69
    .line 70
    move v11, v9

    .line 71
    :cond_3
    sub-int/2addr v11, v10

    .line 72
    if-gez v11, :cond_4

    .line 73
    .line 74
    add-int/2addr v11, v8

    .line 75
    :cond_4
    iget-object v12, v6, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:[J

    .line 76
    .line 77
    aget-wide v15, v12, v11

    .line 78
    .line 79
    cmp-long v12, v15, v13

    .line 80
    .line 81
    if-nez v12, :cond_5

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    cmp-long v12, v4, v15

    .line 85
    .line 86
    if-nez v12, :cond_6

    .line 87
    .line 88
    iget-object v6, v6, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[I

    .line 89
    .line 90
    aget v6, v6, v11

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_6
    if-ne v11, v9, :cond_3

    .line 94
    .line 95
    :cond_7
    :goto_0
    move v6, v7

    .line 96
    :goto_1
    if-ne v6, v7, :cond_9

    .line 97
    .line 98
    iget-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰哲楪:L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;

    .line 99
    .line 100
    if-nez v1, :cond_8

    .line 101
    .line 102
    new-instance v1, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;

    .line 103
    .line 104
    invoke-direct {v1}, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 105
    .line 106
    .line 107
    iput-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰哲楪:L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;

    .line 108
    .line 109
    :cond_8
    iget-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰哲楪:L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;

    .line 110
    .line 111
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世哲楪苏兰:I

    .line 112
    .line 113
    add-int/lit8 v6, v2, 0x1

    .line 114
    .line 115
    iput v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世哲楪苏兰:I

    .line 116
    .line 117
    invoke-virtual {v1, v2, v4, v5}, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(IJ)V

    .line 118
    .line 119
    .line 120
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 121
    .line 122
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子兰楪苏哲世(I)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_9
    array-length v4, v2

    .line 130
    if-ne v3, v4, :cond_a

    .line 131
    .line 132
    add-int/lit8 v1, v1, 0x2

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    :cond_a
    invoke-static {v3, v2, v6}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 143
    .line 144
    return-void
.end method

.method public final 飘花落叶言楪世子苏哲兰(J[B)V
    .locals 9

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世哲楪兰苏:J

    .line 2
    .line 3
    cmp-long v0, v0, p1

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    move p1, v1

    .line 10
    move v3, v2

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰哲楪:L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世哲楪苏兰:I

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-virtual {v0, v3, p1, p2}, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IJ)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世哲楪苏兰:I

    .line 23
    .line 24
    if-eq v3, p1, :cond_1

    .line 25
    .line 26
    move p1, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    add-int/2addr p1, v1

    .line 29
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世哲楪苏兰:I

    .line 30
    .line 31
    :cond_2
    :goto_0
    move p1, v2

    .line 32
    goto :goto_1

    .line 33
    :cond_3
    add-int/lit8 v0, v3, 0x1

    .line 34
    .line 35
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世哲楪苏兰:I

    .line 36
    .line 37
    if-nez v3, :cond_4

    .line 38
    .line 39
    iput-wide p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世哲楪兰苏:J

    .line 40
    .line 41
    :cond_4
    if-nez v3, :cond_5

    .line 42
    .line 43
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 44
    .line 45
    iget-wide v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 46
    .line 47
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNameAsSymbol:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 48
    .line 49
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 50
    .line 51
    and-long/2addr v4, v6

    .line 52
    const-wide/16 v6, 0x0

    .line 53
    .line 54
    cmp-long v0, v4, v6

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    :cond_5
    new-instance v0, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    const/16 v4, 0x12

    .line 64
    .line 65
    iput v4, v0, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:I

    .line 66
    .line 67
    const/16 v4, 0x25

    .line 68
    .line 69
    new-array v5, v4, [J

    .line 70
    .line 71
    iput-object v5, v0, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:[J

    .line 72
    .line 73
    new-array v6, v4, [I

    .line 74
    .line 75
    iput-object v6, v0, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[I

    .line 76
    .line 77
    iput-boolean v1, v0, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Z

    .line 78
    .line 79
    const/16 v7, 0x20

    .line 80
    .line 81
    ushr-long v7, p1, v7

    .line 82
    .line 83
    xor-long/2addr v7, p1

    .line 84
    long-to-int v7, v7

    .line 85
    const v8, 0x7fffffff

    .line 86
    .line 87
    .line 88
    and-int/2addr v7, v8

    .line 89
    rem-int/2addr v7, v4

    .line 90
    aput-wide p1, v5, v7

    .line 91
    .line 92
    aput v3, v6, v7

    .line 93
    .line 94
    const/16 p1, 0x24

    .line 95
    .line 96
    iput p1, v0, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 97
    .line 98
    iput v1, v0, L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 99
    .line 100
    iput-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰哲楪:L飘花落叶言楪子苏兰哲世/飘花落叶言子楪世苏哲兰;

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :goto_1
    const/16 p2, -0x6e

    .line 104
    .line 105
    if-eqz p1, :cond_7

    .line 106
    .line 107
    neg-int p1, v3

    .line 108
    iget p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 109
    .line 110
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 111
    .line 112
    add-int/lit8 v2, p3, 0x7

    .line 113
    .line 114
    array-length v3, v0

    .line 115
    if-le v2, v3, :cond_6

    .line 116
    .line 117
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    :cond_6
    aput-byte p2, v0, p3

    .line 122
    .line 123
    add-int/2addr p3, v1

    .line 124
    neg-int p1, p1

    .line 125
    invoke-static {p3, v0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 130
    .line 131
    return-void

    .line 132
    :cond_7
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 133
    .line 134
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 135
    .line 136
    add-int/lit8 v4, v0, 0x2

    .line 137
    .line 138
    array-length v5, p3

    .line 139
    add-int/2addr v4, v5

    .line 140
    array-length v5, p1

    .line 141
    if-le v4, v5, :cond_8

    .line 142
    .line 143
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    :cond_8
    aput-byte p2, p1, v0

    .line 148
    .line 149
    add-int/lit8 p2, v0, 0x1

    .line 150
    .line 151
    array-length v4, p3

    .line 152
    invoke-static {p3, v2, p1, p2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 153
    .line 154
    .line 155
    array-length p2, p3

    .line 156
    add-int/2addr p2, v1

    .line 157
    add-int/2addr p2, v0

    .line 158
    const/16 p3, -0x10

    .line 159
    .line 160
    if-lt v3, p3, :cond_9

    .line 161
    .line 162
    const/16 p3, 0x2f

    .line 163
    .line 164
    if-gt v3, p3, :cond_9

    .line 165
    .line 166
    add-int/lit8 p3, p2, 0x1

    .line 167
    .line 168
    int-to-byte v0, v3

    .line 169
    aput-byte v0, p1, p2

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_9
    invoke-static {p2, p1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 173
    .line 174
    .line 175
    move-result p3

    .line 176
    :goto_2
    iput p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 177
    .line 178
    return-void
.end method

.method public final 飘花落叶言楪世苏子哲兰(I[C)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 6
    .line 7
    iget-object v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    const/16 v6, 0x2f

    .line 12
    .line 13
    if-ge v1, v6, :cond_4

    .line 14
    .line 15
    add-int/lit8 v7, v2, 0x1

    .line 16
    .line 17
    add-int v8, v7, v1

    .line 18
    .line 19
    array-length v9, v3

    .line 20
    if-le v8, v9, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    :cond_0
    add-int/lit8 v8, v1, 0x49

    .line 27
    .line 28
    int-to-byte v8, v8

    .line 29
    aput-byte v8, v3, v2

    .line 30
    .line 31
    move v2, v4

    .line 32
    :goto_0
    if-ge v2, v1, :cond_2

    .line 33
    .line 34
    aget-char v8, p2, v2

    .line 35
    .line 36
    const/16 v9, 0xff

    .line 37
    .line 38
    if-le v8, v9, :cond_1

    .line 39
    .line 40
    move v2, v4

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    add-int/lit8 v9, v7, 0x1

    .line 43
    .line 44
    int-to-byte v8, v8

    .line 45
    aput-byte v8, v3, v7

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    move v7, v9

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    move v2, v5

    .line 52
    :goto_1
    if-eqz v2, :cond_3

    .line 53
    .line 54
    iput v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    iget v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    invoke-static/range {p1 .. p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲苏楪兰(I[C)Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    move v15, v7

    .line 65
    move v7, v2

    .line 66
    move v2, v15

    .line 67
    :goto_2
    if-eqz v2, :cond_5

    .line 68
    .line 69
    move v8, v1

    .line 70
    goto :goto_3

    .line 71
    :cond_5
    mul-int/lit8 v8, v1, 0x3

    .line 72
    .line 73
    :goto_3
    add-int/2addr v8, v7

    .line 74
    add-int/lit8 v8, v8, 0x6

    .line 75
    .line 76
    array-length v9, v3

    .line 77
    if-le v8, v9, :cond_6

    .line 78
    .line 79
    invoke-virtual {v0, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    :cond_6
    if-eqz v2, :cond_9

    .line 84
    .line 85
    if-gt v1, v6, :cond_7

    .line 86
    .line 87
    add-int/lit8 v2, v7, 0x1

    .line 88
    .line 89
    add-int/lit8 v5, v1, 0x49

    .line 90
    .line 91
    int-to-byte v5, v5

    .line 92
    aput-byte v5, v3, v7

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_7
    const/16 v2, 0x79

    .line 96
    .line 97
    aput-byte v2, v3, v7

    .line 98
    .line 99
    const/16 v2, 0x7ff

    .line 100
    .line 101
    if-gt v1, v2, :cond_8

    .line 102
    .line 103
    add-int/lit8 v2, v7, 0x1

    .line 104
    .line 105
    add-int/lit16 v5, v1, 0x3800

    .line 106
    .line 107
    int-to-short v5, v5

    .line 108
    invoke-static {v3, v2, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲楪世兰([BIS)V

    .line 109
    .line 110
    .line 111
    add-int/lit8 v2, v7, 0x3

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_8
    add-int/2addr v7, v5

    .line 115
    invoke-static {v7, v3, v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    :goto_4
    if-ge v4, v1, :cond_11

    .line 120
    .line 121
    add-int/lit8 v5, v2, 0x1

    .line 122
    .line 123
    aget-char v6, p2, v4

    .line 124
    .line 125
    int-to-byte v6, v6

    .line 126
    aput-byte v6, v3, v2

    .line 127
    .line 128
    add-int/lit8 v4, v4, 0x1

    .line 129
    .line 130
    move v2, v5

    .line 131
    goto :goto_4

    .line 132
    :cond_9
    mul-int/lit8 v2, v1, 0x3

    .line 133
    .line 134
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰哲苏(I)I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    add-int v6, v7, v2

    .line 139
    .line 140
    add-int/2addr v6, v5

    .line 141
    sget-short v8, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:S

    .line 142
    .line 143
    array-length v8, v3

    .line 144
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    add-int/2addr v8, v6

    .line 149
    move v9, v6

    .line 150
    :goto_5
    const/16 v10, 0x80

    .line 151
    .line 152
    if-ge v9, v8, :cond_a

    .line 153
    .line 154
    aget-char v11, p2, v4

    .line 155
    .line 156
    if-ge v11, v10, :cond_a

    .line 157
    .line 158
    add-int/lit8 v10, v9, 0x1

    .line 159
    .line 160
    add-int/lit8 v4, v4, 0x1

    .line 161
    .line 162
    int-to-byte v11, v11

    .line 163
    aput-byte v11, v3, v9

    .line 164
    .line 165
    move v9, v10

    .line 166
    goto :goto_5

    .line 167
    :cond_a
    :goto_6
    if-ge v4, v1, :cond_f

    .line 168
    .line 169
    add-int/lit8 v8, v4, 0x1

    .line 170
    .line 171
    aget-char v11, p2, v4

    .line 172
    .line 173
    if-ge v11, v10, :cond_b

    .line 174
    .line 175
    add-int/lit8 v4, v9, 0x1

    .line 176
    .line 177
    int-to-byte v11, v11

    .line 178
    aput-byte v11, v3, v9

    .line 179
    .line 180
    move v9, v4

    .line 181
    :goto_7
    move v4, v8

    .line 182
    goto :goto_6

    .line 183
    :cond_b
    const/16 v12, 0x800

    .line 184
    .line 185
    if-ge v11, v12, :cond_c

    .line 186
    .line 187
    shr-int/lit8 v4, v11, 0x6

    .line 188
    .line 189
    or-int/lit16 v4, v4, 0xc0

    .line 190
    .line 191
    int-to-byte v4, v4

    .line 192
    aput-byte v4, v3, v9

    .line 193
    .line 194
    add-int/lit8 v4, v9, 0x1

    .line 195
    .line 196
    and-int/lit8 v11, v11, 0x3f

    .line 197
    .line 198
    or-int/2addr v11, v10

    .line 199
    int-to-byte v11, v11

    .line 200
    aput-byte v11, v3, v4

    .line 201
    .line 202
    add-int/lit8 v9, v9, 0x2

    .line 203
    .line 204
    goto :goto_7

    .line 205
    :cond_c
    const v12, 0xd800

    .line 206
    .line 207
    .line 208
    if-lt v11, v12, :cond_e

    .line 209
    .line 210
    const v12, 0xdfff

    .line 211
    .line 212
    .line 213
    if-gt v11, v12, :cond_e

    .line 214
    .line 215
    const v13, 0xdbff

    .line 216
    .line 217
    .line 218
    if-gt v11, v13, :cond_d

    .line 219
    .line 220
    sub-int v13, v1, v8

    .line 221
    .line 222
    if-lt v13, v5, :cond_d

    .line 223
    .line 224
    aget-char v13, p2, v8

    .line 225
    .line 226
    const v14, 0xdc00

    .line 227
    .line 228
    .line 229
    if-lt v13, v14, :cond_d

    .line 230
    .line 231
    if-gt v13, v12, :cond_d

    .line 232
    .line 233
    shl-int/lit8 v8, v11, 0xa

    .line 234
    .line 235
    add-int/2addr v8, v13

    .line 236
    const v11, -0x35fdc00

    .line 237
    .line 238
    .line 239
    add-int/2addr v8, v11

    .line 240
    shr-int/lit8 v11, v8, 0x12

    .line 241
    .line 242
    or-int/lit16 v11, v11, 0xf0

    .line 243
    .line 244
    int-to-byte v11, v11

    .line 245
    aput-byte v11, v3, v9

    .line 246
    .line 247
    add-int/lit8 v11, v9, 0x1

    .line 248
    .line 249
    shr-int/lit8 v12, v8, 0xc

    .line 250
    .line 251
    and-int/lit8 v12, v12, 0x3f

    .line 252
    .line 253
    or-int/2addr v12, v10

    .line 254
    int-to-byte v12, v12

    .line 255
    aput-byte v12, v3, v11

    .line 256
    .line 257
    add-int/lit8 v11, v9, 0x2

    .line 258
    .line 259
    shr-int/lit8 v12, v8, 0x6

    .line 260
    .line 261
    and-int/lit8 v12, v12, 0x3f

    .line 262
    .line 263
    or-int/2addr v12, v10

    .line 264
    int-to-byte v12, v12

    .line 265
    aput-byte v12, v3, v11

    .line 266
    .line 267
    add-int/lit8 v11, v9, 0x3

    .line 268
    .line 269
    and-int/lit8 v8, v8, 0x3f

    .line 270
    .line 271
    or-int/2addr v8, v10

    .line 272
    int-to-byte v8, v8

    .line 273
    aput-byte v8, v3, v11

    .line 274
    .line 275
    add-int/lit8 v4, v4, 0x2

    .line 276
    .line 277
    add-int/lit8 v9, v9, 0x4

    .line 278
    .line 279
    goto :goto_6

    .line 280
    :cond_d
    const-string v0, "malformed input off : "

    .line 281
    .line 282
    invoke-static {v8, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :cond_e
    shr-int/lit8 v4, v11, 0xc

    .line 291
    .line 292
    or-int/lit16 v4, v4, 0xe0

    .line 293
    .line 294
    int-to-byte v4, v4

    .line 295
    aput-byte v4, v3, v9

    .line 296
    .line 297
    add-int/lit8 v4, v9, 0x1

    .line 298
    .line 299
    shr-int/lit8 v12, v11, 0x6

    .line 300
    .line 301
    and-int/lit8 v12, v12, 0x3f

    .line 302
    .line 303
    or-int/2addr v12, v10

    .line 304
    int-to-byte v12, v12

    .line 305
    aput-byte v12, v3, v4

    .line 306
    .line 307
    add-int/lit8 v4, v9, 0x2

    .line 308
    .line 309
    and-int/lit8 v11, v11, 0x3f

    .line 310
    .line 311
    or-int/2addr v11, v10

    .line 312
    int-to-byte v11, v11

    .line 313
    aput-byte v11, v3, v4

    .line 314
    .line 315
    add-int/lit8 v9, v9, 0x3

    .line 316
    .line 317
    goto/16 :goto_7

    .line 318
    .line 319
    :cond_f
    sub-int/2addr v9, v7

    .line 320
    sub-int/2addr v9, v2

    .line 321
    sub-int/2addr v9, v5

    .line 322
    invoke-static {v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰哲苏(I)I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-eq v2, v1, :cond_10

    .line 327
    .line 328
    add-int/2addr v1, v7

    .line 329
    add-int/2addr v1, v5

    .line 330
    invoke-static {v3, v6, v3, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 331
    .line 332
    .line 333
    :cond_10
    const/16 v1, 0x7a

    .line 334
    .line 335
    aput-byte v1, v3, v7

    .line 336
    .line 337
    add-int/2addr v7, v5

    .line 338
    invoke-static {v7, v3, v9}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    add-int v2, v1, v9

    .line 343
    .line 344
    :cond_11
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 345
    .line 346
    return-void
.end method

.method public final 飘花落叶言楪子世兰哲苏([B)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    add-int/2addr v1, v0

    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    array-length v3, p1

    .line 16
    invoke-static {p1, v1, v2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    array-length p1, p1

    .line 20
    add-int/2addr v0, p1

    .line 21
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 22
    .line 23
    return-void
.end method

.method public final 飘花落叶言楪子世兰苏哲(Ljava/lang/String;)V
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p1, "unsupported operation"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言楪子世苏兰哲(C)V
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言楪子世苏哲兰(B)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-ne v0, v2, :cond_0

    .line 7
    .line 8
    add-int/lit8 v1, v0, 0x1

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    aput-byte p1, v1, v0

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 19
    .line 20
    return-void
.end method

.method public final 飘花落叶言楪子兰世哲苏([S)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    array-length v0, p1

    .line 8
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏哲兰世楪(I)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    array-length v1, p1

    .line 13
    if-ge v0, v1, :cond_1

    .line 14
    .line 15
    aget-short v1, p1, v0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子哲苏世兰(S)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-void
.end method

.method public final 飘花落叶言楪子兰世苏哲([Ljava/lang/String;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    array-length v0, p1

    .line 8
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏哲兰世楪(I)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    array-length v1, p1

    .line 13
    if-ge v0, v1, :cond_2

    .line 14
    .line 15
    aget-object v1, p1, v0

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子兰苏哲世()V

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    return-void
.end method

.method public final 飘花落叶言楪子兰哲世苏(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final 飘花落叶言楪子兰哲苏世(III)V
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p1, "unsupported operation"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言楪子兰苏世哲(I[C)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    if-ge v1, p1, :cond_1

    .line 4
    .line 5
    aget-char v2, p2, v1

    .line 6
    .line 7
    const/16 v3, 0xff

    .line 8
    .line 9
    if-le v2, v3, :cond_0

    .line 10
    .line 11
    new-instance v1, Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v1, p2, v0, p1}, Ljava/lang/String;-><init>([CII)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 24
    .line 25
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 26
    .line 27
    const/16 v3, 0x2f

    .line 28
    .line 29
    if-gt p1, v3, :cond_2

    .line 30
    .line 31
    add-int/lit8 v3, v1, 0x1

    .line 32
    .line 33
    add-int/lit8 v4, p1, 0x49

    .line 34
    .line 35
    int-to-byte v4, v4

    .line 36
    aput-byte v4, v2, v1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const/16 v3, 0x79

    .line 40
    .line 41
    aput-byte v3, v2, v1

    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    invoke-static {v1, v2, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    :goto_1
    if-ge v0, p1, :cond_3

    .line 50
    .line 51
    add-int/lit8 v1, v3, 0x1

    .line 52
    .line 53
    aget-char v4, p2, v0

    .line 54
    .line 55
    int-to-byte v4, v4

    .line 56
    aput-byte v4, v2, v3

    .line 57
    .line 58
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    move v3, v1

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 63
    .line 64
    return-void
.end method

.method public final 飘花落叶言楪子兰苏哲世()V
    .locals 1

    .line 1
    const/16 v0, -0x51

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子世苏哲兰(B)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言楪子哲世兰苏(Ljava/util/List;)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏哲兰世楪(I)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_6

    .line 18
    .line 19
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 20
    .line 21
    if-eqz v1, :cond_6

    .line 22
    .line 23
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 24
    .line 25
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 26
    .line 27
    move v4, v2

    .line 28
    :goto_0
    if-ge v4, v0, :cond_5

    .line 29
    .line 30
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Ljava/lang/String;

    .line 35
    .line 36
    if-nez v5, :cond_2

    .line 37
    .line 38
    array-length v5, v3

    .line 39
    if-ne v1, v5, :cond_1

    .line 40
    .line 41
    add-int/lit8 v3, v1, 0x1

    .line 42
    .line 43
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    :cond_1
    add-int/lit8 v5, v1, 0x1

    .line 48
    .line 49
    const/16 v6, -0x51

    .line 50
    .line 51
    aput-byte v6, v3, v1

    .line 52
    .line 53
    move v1, v5

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    sget-object v6, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 56
    .line 57
    invoke-interface {v6, v5}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_3

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    sget-object v6, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 65
    .line 66
    invoke-interface {v6, v5}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    check-cast v5, [B

    .line 71
    .line 72
    array-length v6, v5

    .line 73
    add-int/2addr v6, v1

    .line 74
    add-int/lit8 v6, v6, 0x6

    .line 75
    .line 76
    array-length v7, v3

    .line 77
    if-lt v6, v7, :cond_4

    .line 78
    .line 79
    array-length v3, v5

    .line 80
    add-int/2addr v3, v1

    .line 81
    add-int/lit8 v3, v3, 0x6

    .line 82
    .line 83
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    :cond_4
    invoke-static {v3, v1, v5}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏([BI[B)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_5
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 95
    .line 96
    return-void

    .line 97
    :cond_6
    :goto_2
    if-ge v2, v0, :cond_7

    .line 98
    .line 99
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    add-int/lit8 v2, v2, 0x1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_7
    return-void
.end method

.method public final 飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V
    .locals 13

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 8
    .line 9
    if-eqz v0, :cond_11

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, [B

    .line 16
    .line 17
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 26
    .line 27
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 28
    .line 29
    array-length v2, v0

    .line 30
    add-int/2addr v2, v1

    .line 31
    add-int/lit8 v2, v2, 0x6

    .line 32
    .line 33
    array-length v3, p1

    .line 34
    sub-int v3, v2, v3

    .line 35
    .line 36
    if-lez v3, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :cond_1
    invoke-static {p1, v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏([BI[B)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    array-length v1, v0

    .line 50
    const/16 v2, 0x80

    .line 51
    .line 52
    if-le v2, v1, :cond_3

    .line 53
    .line 54
    array-length v2, v0

    .line 55
    :cond_3
    and-int/lit8 v1, v2, 0x1

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    if-ne v1, v3, :cond_4

    .line 59
    .line 60
    add-int/lit8 v2, v2, -0x1

    .line 61
    .line 62
    :cond_4
    const/4 v1, 0x0

    .line 63
    move v4, v1

    .line 64
    move v5, v4

    .line 65
    :goto_0
    add-int/lit8 v6, v4, 0x2

    .line 66
    .line 67
    if-gt v6, v2, :cond_7

    .line 68
    .line 69
    aget-byte v7, v0, v4

    .line 70
    .line 71
    add-int/lit8 v4, v4, 0x1

    .line 72
    .line 73
    aget-byte v4, v0, v4

    .line 74
    .line 75
    if-eqz v7, :cond_5

    .line 76
    .line 77
    if-nez v4, :cond_6

    .line 78
    .line 79
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 80
    .line 81
    :cond_6
    move v4, v6

    .line 82
    goto :goto_0

    .line 83
    :cond_7
    array-length v4, v0

    .line 84
    if-eqz v4, :cond_9

    .line 85
    .line 86
    if-eqz v5, :cond_8

    .line 87
    .line 88
    shr-int/2addr v2, v3

    .line 89
    div-int/2addr v2, v5

    .line 90
    const/4 v4, 0x3

    .line 91
    if-lt v2, v4, :cond_9

    .line 92
    .line 93
    :cond_8
    move v2, v3

    .line 94
    goto :goto_1

    .line 95
    :cond_9
    move v2, v1

    .line 96
    :goto_1
    iget v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 97
    .line 98
    add-int/lit8 v6, v4, 0x6

    .line 99
    .line 100
    array-length v7, v0

    .line 101
    const/4 v8, 0x2

    .line 102
    invoke-static {v7, v8, v6, v3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    iget-object v7, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 107
    .line 108
    array-length v9, v7

    .line 109
    if-le v6, v9, :cond_a

    .line 110
    .line 111
    invoke-virtual {p0, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    :cond_a
    if-nez v2, :cond_f

    .line 116
    .line 117
    array-length v6, v0

    .line 118
    array-length v9, v0

    .line 119
    shr-int/lit8 v8, v9, 0x2

    .line 120
    .line 121
    add-int/2addr v6, v8

    .line 122
    invoke-static {v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰哲苏(I)I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    array-length v8, v0

    .line 127
    add-int v9, v4, v6

    .line 128
    .line 129
    add-int/2addr v9, v3

    .line 130
    invoke-static {v8, v9, v0, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏哲兰世(II[B[B)I

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    sub-int v10, v8, v4

    .line 135
    .line 136
    sub-int/2addr v10, v6

    .line 137
    add-int/lit8 v11, v10, -0x1

    .line 138
    .line 139
    array-length v12, v0

    .line 140
    if-le v11, v12, :cond_b

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_b
    const/4 v12, -0x1

    .line 144
    if-eq v8, v12, :cond_f

    .line 145
    .line 146
    mul-int/lit8 p1, v11, 0x2

    .line 147
    .line 148
    array-length v0, v0

    .line 149
    if-ne p1, v0, :cond_d

    .line 150
    .line 151
    const/16 p1, 0x2f

    .line 152
    .line 153
    if-gt v5, p1, :cond_c

    .line 154
    .line 155
    add-int/lit8 p1, v10, 0x48

    .line 156
    .line 157
    int-to-byte p1, p1

    .line 158
    aput-byte p1, v7, v4

    .line 159
    .line 160
    add-int/lit8 p1, v4, 0x1

    .line 161
    .line 162
    add-int/2addr v6, p1

    .line 163
    invoke-static {v7, v6, v7, p1, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_c
    const/16 p1, 0x79

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_d
    const/16 p1, 0x7a

    .line 171
    .line 172
    :goto_2
    invoke-static {v11}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰哲苏(I)I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eq v6, v0, :cond_e

    .line 177
    .line 178
    add-int/2addr v0, v4

    .line 179
    add-int/2addr v0, v3

    .line 180
    invoke-static {v7, v9, v7, v0, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 181
    .line 182
    .line 183
    :cond_e
    aput-byte p1, v7, v4

    .line 184
    .line 185
    add-int/lit8 p1, v4, 0x1

    .line 186
    .line 187
    invoke-static {p1, v7, v11}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    sub-int/2addr p1, v4

    .line 192
    add-int v10, p1, v11

    .line 193
    .line 194
    :goto_3
    add-int/2addr v4, v10

    .line 195
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 196
    .line 197
    return-void

    .line 198
    :cond_f
    move v3, v2

    .line 199
    :goto_4
    if-eqz v3, :cond_11

    .line 200
    .line 201
    sget-boolean p1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 202
    .line 203
    if-eqz p1, :cond_10

    .line 204
    .line 205
    const/16 p1, 0x7d

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_10
    const/16 p1, 0x7c

    .line 209
    .line 210
    :goto_5
    aput-byte p1, v7, v4

    .line 211
    .line 212
    add-int/lit8 p1, v4, 0x1

    .line 213
    .line 214
    array-length v2, v0

    .line 215
    invoke-static {p1, v7, v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    array-length v2, v0

    .line 220
    invoke-static {v0, v1, v7, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 221
    .line 222
    .line 223
    array-length v0, v0

    .line 224
    add-int/2addr v0, p1

    .line 225
    sub-int/2addr v0, v4

    .line 226
    add-int/2addr v0, v4

    .line 227
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 228
    .line 229
    return-void

    .line 230
    :cond_11
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)[C

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    if-nez p1, :cond_12

    .line 235
    .line 236
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子兰哲楪苏世()V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :cond_12
    array-length v0, p1

    .line 241
    invoke-virtual {p0, v0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世苏子哲兰(I[C)V

    .line 242
    .line 243
    .line 244
    return-void
.end method

.method public final 飘花落叶言楪子哲兰世苏([B)V
    .locals 2

    .line 1
    array-length v0, p1

    .line 2
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏哲兰世楪(I)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    array-length v1, p1

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    aget-byte v1, p1, v0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子苏哲世兰(B)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void
.end method

.method public final 飘花落叶言楪子哲兰苏世([J)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    array-length v0, p1

    .line 8
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子苏哲兰世楪(I)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    array-length v1, p1

    .line 13
    if-ge v0, v1, :cond_1

    .line 14
    .line 15
    aget-wide v1, p1, v0

    .line 16
    .line 17
    invoke-virtual {p0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子苏兰哲世(J)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-void
.end method

.method public final 飘花落叶言楪子哲苏世兰(S)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言楪子哲苏兰世(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言楪子苏世哲兰(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-ne v0, v2, :cond_0

    .line 7
    .line 8
    add-int/lit8 v1, v0, 0x1

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世子兰苏哲(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    const/16 v2, -0x6d

    .line 15
    .line 16
    aput-byte v2, v1, v0

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 21
    .line 22
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰苏哲:Ljava/lang/String;

    .line 23
    .line 24
    if-ne p1, v0, :cond_1

    .line 25
    .line 26
    const-string v0, "#-1"

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v0, p1

    .line 30
    :goto_0
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰苏哲:Ljava/lang/String;

    .line 34
    .line 35
    return-void
.end method

.method public final 飘花落叶言楪子苏兰世哲(I[C)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪世苏子哲兰(I[C)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言楪子苏兰哲世(J)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言楪子苏哲世兰(B)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言楪子苏哲兰世(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
