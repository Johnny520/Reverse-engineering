.class public abstract L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;


# static fields
.field public static final synthetic 飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;


# instance fields
.field private volatile synthetic top:J

.field public final 飘花落叶言子楪兰世苏哲:[I

.field public final 飘花落叶言子楪哲兰世苏:I

.field public final 飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicReferenceArray;

.field public final 飘花落叶言子楪哲苏兰世:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const-string v1, "top"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-lez p1, :cond_1

    .line 5
    .line 6
    const v0, 0x1fffffff

    .line 7
    .line 8
    .line 9
    if-gt p1, v0, :cond_0

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->top:J

    .line 14
    .line 15
    mul-int/lit8 p1, p1, 0x4

    .line 16
    .line 17
    add-int/lit8 p1, p1, -0x1

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    mul-int/lit8 p1, p1, 0x2

    .line 24
    .line 25
    iput p1, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 26
    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    iput v0, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:I

    .line 34
    .line 35
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 36
    .line 37
    add-int/lit8 p1, p1, 0x1

    .line 38
    .line 39
    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 43
    .line 44
    new-array p1, p1, [I

    .line 45
    .line 46
    iput-object p1, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:[I

    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    const-string p0, "capacity should be less or equal to 536870911 but it is "

    .line 50
    .line 51
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    throw p0

    .line 60
    :cond_1
    const-string p0, "capacity should be positive but it is "

    .line 61
    .line 62
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    throw p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    :cond_0
    invoke-virtual {p0}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void
.end method

.method public final 飘花落叶言子世兰哲楪苏(Ljava/lang/Object;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const v1, -0x61c88647

    .line 12
    .line 13
    .line 14
    mul-int/2addr v0, v1

    .line 15
    iget v1, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:I

    .line 16
    .line 17
    ushr-int/2addr v0, v1

    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_0
    const/16 v2, 0x8

    .line 22
    .line 23
    if-ge v1, v2, :cond_5

    .line 24
    .line 25
    iget-object v2, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 26
    .line 27
    :goto_1
    const/4 v3, 0x0

    .line 28
    invoke-virtual {v2, v0, v3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    if-lez v0, :cond_1

    .line 35
    .line 36
    :goto_2
    iget-wide v6, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->top:J

    .line 37
    .line 38
    const/16 p1, 0x20

    .line 39
    .line 40
    shr-long v1, v6, p1

    .line 41
    .line 42
    const-wide v3, 0xffffffffL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    and-long/2addr v1, v3

    .line 48
    const-wide/16 v8, 0x1

    .line 49
    .line 50
    add-long/2addr v1, v8

    .line 51
    and-long/2addr v3, v6

    .line 52
    long-to-int v3, v3

    .line 53
    shl-long/2addr v1, p1

    .line 54
    int-to-long v4, v0

    .line 55
    or-long v8, v1, v4

    .line 56
    .line 57
    iget-object p1, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:[I

    .line 58
    .line 59
    aput v3, p1, v0

    .line 60
    .line 61
    sget-object v4, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 62
    .line 63
    move-object v5, p0

    .line 64
    invoke-virtual/range {v4 .. v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_0

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_0
    move-object p0, v5

    .line 72
    goto :goto_2

    .line 73
    :cond_1
    const-string p0, "index should be positive"

    .line 74
    .line 75
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    move-object v5, p0

    .line 80
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-eqz p0, :cond_4

    .line 85
    .line 86
    add-int/lit8 v0, v0, -0x1

    .line 87
    .line 88
    if-nez v0, :cond_3

    .line 89
    .line 90
    iget p0, v5, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 91
    .line 92
    move v0, p0

    .line 93
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    move-object p0, v5

    .line 96
    goto :goto_0

    .line 97
    :cond_4
    move-object p0, v5

    .line 98
    goto :goto_1

    .line 99
    :cond_5
    :goto_3
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/Object;
    .locals 10

    .line 1
    :goto_0
    iget-wide v2, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->top:J

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long v0, v2, v0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    :goto_1
    move v6, v1

    .line 11
    move-object v1, p0

    .line 12
    goto :goto_2

    .line 13
    :cond_0
    const/16 v0, 0x20

    .line 14
    .line 15
    shr-long v4, v2, v0

    .line 16
    .line 17
    const-wide v6, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr v4, v6

    .line 23
    const-wide/16 v8, 0x1

    .line 24
    .line 25
    add-long/2addr v4, v8

    .line 26
    and-long/2addr v6, v2

    .line 27
    long-to-int v6, v6

    .line 28
    if-nez v6, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    iget-object v1, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:[I

    .line 32
    .line 33
    aget v1, v1, v6

    .line 34
    .line 35
    shl-long/2addr v4, v0

    .line 36
    int-to-long v0, v1

    .line 37
    or-long/2addr v4, v0

    .line 38
    sget-object v0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 39
    .line 40
    move-object v1, p0

    .line 41
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_3

    .line 46
    .line 47
    :goto_2
    const/4 p0, 0x0

    .line 48
    if-nez v6, :cond_2

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_2
    iget-object v0, v1, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 52
    .line 53
    invoke-virtual {v0, v6, p0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_3
    move-object p0, v1

    .line 59
    goto :goto_0
.end method

.method public abstract 飘花落叶言子楪世哲苏兰()Ljava/lang/Object;
.end method

.method public 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p1
.end method

.method public final 飘花落叶言子楪哲兰世苏()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v0}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public 飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method
