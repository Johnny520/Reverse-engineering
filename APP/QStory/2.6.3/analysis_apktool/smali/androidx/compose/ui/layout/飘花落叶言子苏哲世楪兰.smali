.class public final Landroidx/compose/ui/layout/飘花落叶言子苏哲世楪兰;
.super Landroidx/compose/ui/node/飘花落叶言子世楪哲兰苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/layout/飘花落叶言子苏哲世楪兰;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/layout/飘花落叶言子苏哲世楪兰;

    .line 2
    .line 3
    const-string v1, "Undefined intrinsics block and it is required"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/compose/ui/node/飘花落叶言子世楪哲兰苏;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Landroidx/compose/ui/layout/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/layout/飘花落叶言子苏哲世楪兰;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;Ljava/util/List;J)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;
    .locals 6

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eq p0, v0, :cond_1

    .line 10
    .line 11
    new-instance p0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    move v2, v1

    .line 25
    move v3, v2

    .line 26
    :goto_0
    if-ge v1, v0, :cond_0

    .line 27
    .line 28
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;

    .line 33
    .line 34
    invoke-interface {v4, p3, p4}, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;->飘花落叶言子世楪苏哲兰(J)Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    iget v5, v4, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 39
    .line 40
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iget v5, v4, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 45
    .line 46
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-static {v2, p3, p4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(IJ)I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    invoke-static {v3, p3, p4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(IJ)I

    .line 61
    .line 62
    .line 63
    move-result p3

    .line 64
    new-instance p4, Landroidx/compose/ui/layout/RootMeasurePolicy$measure$3;

    .line 65
    .line 66
    invoke-direct {p4, p0}, Landroidx/compose/ui/layout/RootMeasurePolicy$measure$3;-><init>(Ljava/util/List;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1, p2, p3, p4}, Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子苏世兰哲楪(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;IIL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :cond_1
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;

    .line 79
    .line 80
    invoke-interface {p0, p3, p4}, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;->飘花落叶言子世楪苏哲兰(J)Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    iget p2, p0, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 85
    .line 86
    invoke-static {p2, p3, p4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(IJ)I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    iget v0, p0, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 91
    .line 92
    invoke-static {v0, p3, p4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(IJ)I

    .line 93
    .line 94
    .line 95
    move-result p3

    .line 96
    new-instance p4, Landroidx/compose/ui/layout/RootMeasurePolicy$measure$2;

    .line 97
    .line 98
    invoke-direct {p4, p0}, Landroidx/compose/ui/layout/RootMeasurePolicy$measure$2;-><init>(Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p1, p2, p3, p4}, Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子苏世兰哲楪(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;IIL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_2
    invoke-static {p3, p4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(J)I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    invoke-static {p3, p4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(J)I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    sget-object p3, Landroidx/compose/ui/layout/RootMeasurePolicy$measure$1;->INSTANCE:Landroidx/compose/ui/layout/RootMeasurePolicy$measure$1;

    .line 115
    .line 116
    invoke-static {p1, p0, p2, p3}, Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子苏世兰哲楪(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;IIL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0
.end method
