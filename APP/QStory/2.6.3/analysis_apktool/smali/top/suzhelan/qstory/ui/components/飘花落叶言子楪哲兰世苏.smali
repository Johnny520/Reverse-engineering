.class public final Ltop/suzhelan/qstory/ui/components/飘花落叶言子楪哲兰世苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰苏世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltop/suzhelan/qstory/ui/components/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Ltop/suzhelan/qstory/ui/components/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;

    .line 10
    .line 11
    check-cast p4, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    const/16 v0, 0xbd5

    .line 18
    .line 19
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v0, p4, 0x6

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    move-object v0, p3

    .line 27
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    const/4 p1, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 p1, 0x2

    .line 38
    :goto_0
    or-int/2addr p1, p4

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move p1, p4

    .line 41
    :goto_1
    and-int/lit8 p4, p4, 0x30

    .line 42
    .line 43
    if-nez p4, :cond_3

    .line 44
    .line 45
    move-object p4, p3

    .line 46
    check-cast p4, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 47
    .line 48
    invoke-virtual {p4, p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏(I)Z

    .line 49
    .line 50
    .line 51
    move-result p4

    .line 52
    if-eqz p4, :cond_2

    .line 53
    .line 54
    const/16 p4, 0x20

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/16 p4, 0x10

    .line 58
    .line 59
    :goto_2
    or-int/2addr p1, p4

    .line 60
    :cond_3
    and-int/lit16 p4, p1, 0x93

    .line 61
    .line 62
    const/16 v0, 0x92

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    const/4 v2, 0x0

    .line 66
    if-eq p4, v0, :cond_4

    .line 67
    .line 68
    move p4, v1

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    move p4, v2

    .line 71
    :goto_3
    and-int/2addr p1, v1

    .line 72
    check-cast p3, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 73
    .line 74
    invoke-virtual {p3, p1, p4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_7

    .line 79
    .line 80
    iget-object p1, p0, Ltop/suzhelan/qstory/ui/components/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 81
    .line 82
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲兰世苏;

    .line 87
    .line 88
    const p2, 0x61ebabc2

    .line 89
    .line 90
    .line 91
    invoke-virtual {p3, p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世哲兰(I)V

    .line 92
    .line 93
    .line 94
    const/16 p2, 0xbd7

    .line 95
    .line 96
    invoke-static {p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    const/16 p2, 0xbd8

    .line 100
    .line 101
    invoke-static {p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    iget-object p0, p0, Ltop/suzhelan/qstory/ui/components/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 105
    .line 106
    invoke-virtual {p3, p0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    invoke-virtual {p3, p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p4

    .line 114
    or-int/2addr p2, p4

    .line 115
    invoke-virtual {p3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p4

    .line 119
    if-nez p2, :cond_5

    .line 120
    .line 121
    sget-object p2, Landroidx/compose/runtime/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 122
    .line 123
    if-ne p4, p2, :cond_6

    .line 124
    .line 125
    :cond_5
    new-instance p4, Lkotlin/reflect/jvm/internal/飘花落叶言子楪哲苏世兰;

    .line 126
    .line 127
    const/16 p2, 0xf

    .line 128
    .line 129
    invoke-direct {p4, p0, p2, p1}, Lkotlin/reflect/jvm/internal/飘花落叶言子楪哲苏世兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p3, p4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_6
    check-cast p4, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 136
    .line 137
    invoke-static {p1, p4, p3, v2}, Ltop/suzhelan/qstory/ui/components/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲兰世苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p3, v2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲苏兰世(Z)V

    .line 141
    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_7
    invoke-virtual {p3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 145
    .line 146
    .line 147
    :goto_4
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 148
    .line 149
    return-object p0
.end method
