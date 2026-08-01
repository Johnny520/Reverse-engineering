.class public final L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;

.field public final 飘花落叶言子楪世兰苏哲:Z

.field public 飘花落叶言子楪世哲兰苏:Z

.field public 飘花落叶言子楪世哲苏兰:I

.field public 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:[B

.field public 飘花落叶言子楪苏世哲兰:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    .line 20
    new-array v0, v0, [B

    iput-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:[B

    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Z

    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Z

    return-void
.end method

.method public constructor <init>([BIIZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:[B

    .line 8
    .line 9
    iput p2, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 10
    .line 11
    iput p3, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 12
    .line 13
    iput-boolean p4, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Z

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;I)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:[B

    .line 5
    .line 6
    iget-boolean v1, p1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Z

    .line 7
    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    iget v1, p1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 11
    .line 12
    add-int v2, v1, p2

    .line 13
    .line 14
    const/16 v3, 0x2000

    .line 15
    .line 16
    if-le v2, v3, :cond_2

    .line 17
    .line 18
    iget-boolean v4, p1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Z

    .line 19
    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    iget v4, p1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 23
    .line 24
    sub-int/2addr v2, v4

    .line 25
    if-gt v2, v3, :cond_0

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    invoke-static {v0, v4, v0, v1, v2}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏兰哲楪([BI[BII)V

    .line 29
    .line 30
    .line 31
    iget v1, p1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 32
    .line 33
    iget v2, p1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 34
    .line 35
    sub-int/2addr v1, v2

    .line 36
    iput v1, p1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    iput v1, p1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    :goto_0
    iget v1, p1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 51
    .line 52
    iget v2, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 53
    .line 54
    add-int v3, v2, p2

    .line 55
    .line 56
    iget-object v4, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:[B

    .line 57
    .line 58
    invoke-static {v4, v1, v0, v2, v3}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏楪哲兰([BI[BII)V

    .line 59
    .line 60
    .line 61
    iget v0, p1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 62
    .line 63
    add-int/2addr v0, p2

    .line 64
    iput v0, p1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 65
    .line 66
    iget p1, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 67
    .line 68
    add-int/2addr p1, p2

    .line 69
    iput p1, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    const-string p0, "only owner can write"

    .line 73
    .line 74
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰()L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Z

    .line 3
    .line 4
    new-instance v1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;

    .line 5
    .line 6
    iget v2, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 7
    .line 8
    iget v3, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 9
    .line 10
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:[B

    .line 11
    .line 12
    invoke-direct {v1, p0, v2, v3, v0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;-><init>([BIIZ)V

    .line 13
    .line 14
    .line 15
    return-object v1
.end method

.method public final 飘花落叶言子楪世苏兰哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p0, p1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;

    .line 5
    .line 6
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;

    .line 7
    .line 8
    iput-object v0, p1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;

    .line 9
    .line 10
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;

    .line 16
    .line 17
    iput-object p1, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;

    .line 18
    .line 19
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;
    .locals 4

    .line 1
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq v0, p0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move-object v0, v1

    .line 8
    :goto_0
    iget-object v2, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;

    .line 14
    .line 15
    iput-object v3, v2, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;

    .line 16
    .line 17
    iget-object v2, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;

    .line 23
    .line 24
    iput-object v3, v2, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;

    .line 25
    .line 26
    iput-object v1, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;

    .line 27
    .line 28
    iput-object v1, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世哲苏;

    .line 29
    .line 30
    return-object v0
.end method
