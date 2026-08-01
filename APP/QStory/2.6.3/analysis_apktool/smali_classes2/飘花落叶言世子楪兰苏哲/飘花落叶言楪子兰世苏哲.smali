.class public final L飘花落叶言世子楪兰苏哲/飘花落叶言楪子兰世苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲兰苏世;

.field public static final 飘花落叶言子楪世兰苏哲:[Lkotlin/飘花落叶言子楪苏世哲兰;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/Double;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/Double;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/Double;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲兰苏世;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪子兰世苏哲;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲兰苏世;

    .line 7
    .line 8
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 9
    .line 10
    new-instance v1, L飘花落叶言世子楪兰苏哲/飘花落叶言子世苏哲兰楪;

    .line 11
    .line 12
    const/16 v2, 0x12

    .line 13
    .line 14
    invoke-direct {v1, v2}, L飘花落叶言世子楪兰苏哲/飘花落叶言子世苏哲兰楪;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/LazyThreadSafetyMode;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x4

    .line 22
    new-array v1, v1, [Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    aput-object v0, v1, v2

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    const/4 v2, 0x0

    .line 29
    aput-object v2, v1, v0

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    aput-object v2, v1, v0

    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    aput-object v2, v1, v0

    .line 36
    .line 37
    sput-object v1, L飘花落叶言世子楪兰苏哲/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪世兰苏哲:[Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>(ILjava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V
    .locals 6

    .line 1
    and-int/lit8 v0, p1, 0xf

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0xf

    .line 5
    .line 6
    if-ne v2, v0, :cond_6

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 12
    .line 13
    iput-object p3, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Double;

    .line 14
    .line 15
    iput-object p4, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Double;

    .line 16
    .line 17
    iput-object p5, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Double;

    .line 18
    .line 19
    const-string p0, "costPriority must be in 0.0 <= x <= 1.0 value range"

    .line 20
    .line 21
    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    .line 22
    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    if-eqz p3, :cond_1

    .line 26
    .line 27
    invoke-virtual {p3}, Ljava/lang/Number;->doubleValue()D

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    cmpl-double p3, v4, v2

    .line 32
    .line 33
    if-ltz p3, :cond_0

    .line 34
    .line 35
    cmpg-double p3, v4, p1

    .line 36
    .line 37
    if-gtz p3, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v1

    .line 44
    :cond_1
    :goto_0
    if-eqz p4, :cond_3

    .line 45
    .line 46
    invoke-virtual {p4}, Ljava/lang/Number;->doubleValue()D

    .line 47
    .line 48
    .line 49
    move-result-wide p3

    .line 50
    cmpl-double v0, p3, v2

    .line 51
    .line 52
    if-ltz v0, :cond_2

    .line 53
    .line 54
    cmpg-double p3, p3, p1

    .line 55
    .line 56
    if-gtz p3, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :cond_3
    :goto_1
    if-eqz p5, :cond_5

    .line 64
    .line 65
    invoke-virtual {p5}, Ljava/lang/Number;->doubleValue()D

    .line 66
    .line 67
    .line 68
    move-result-wide p3

    .line 69
    cmpl-double p0, p3, v2

    .line 70
    .line 71
    if-ltz p0, :cond_4

    .line 72
    .line 73
    cmpg-double p0, p3, p1

    .line 74
    .line 75
    if-gtz p0, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    const-string p0, "intelligencePriority must be in 0.0 <= x <= 1.0 value range"

    .line 79
    .line 80
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v1

    .line 84
    :cond_5
    :goto_2
    return-void

    .line 85
    :cond_6
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲兰世苏;

    .line 86
    .line 87
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲兰世苏;->getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p1, v2, p0}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏哲世兰(IIL飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 92
    .line 93
    .line 94
    throw v1
.end method
