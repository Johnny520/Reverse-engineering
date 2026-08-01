.class final Landroidx/compose/ui/spatial/RectListDebugger_androidKt$RectListDebugger$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $modifier:Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/spatial/RectListDebugger_androidKt$RectListDebugger$1;->$modifier:Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    iput p2, p0, Landroidx/compose/ui/spatial/RectListDebugger_androidKt$RectListDebugger$1;->$$changed:I

    .line 4
    .line 5
    iput p3, p0, Landroidx/compose/ui/spatial/RectListDebugger_androidKt$RectListDebugger$1;->$$default:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 156
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/spatial/RectListDebugger_androidKt$RectListDebugger$1;->invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 7

    .line 1
    iget-object p2, p0, Landroidx/compose/ui/spatial/RectListDebugger_androidKt$RectListDebugger$1;->$modifier:Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    iget v0, p0, Landroidx/compose/ui/spatial/RectListDebugger_androidKt$RectListDebugger$1;->$$changed:I

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    or-int/2addr v0, v1

    .line 7
    invoke-static {v0}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰楪苏哲(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget p0, p0, Landroidx/compose/ui/spatial/RectListDebugger_androidKt$RectListDebugger$1;->$$default:I

    .line 12
    .line 13
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 14
    .line 15
    const v2, 0x3891d537

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 19
    .line 20
    .line 21
    and-int/lit8 v2, p0, 0x1

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    or-int/lit8 v4, v0, 0x6

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    and-int/lit8 v4, v0, 0x6

    .line 30
    .line 31
    if-nez v4, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    const/4 v4, 0x4

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move v4, v3

    .line 42
    :goto_0
    or-int/2addr v4, v0

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v4, v0

    .line 45
    :goto_1
    and-int/lit8 v5, v4, 0x3

    .line 46
    .line 47
    if-eq v5, v3, :cond_3

    .line 48
    .line 49
    move v3, v1

    .line 50
    goto :goto_2

    .line 51
    :cond_3
    const/4 v3, 0x0

    .line 52
    :goto_2
    and-int/2addr v4, v1

    .line 53
    invoke-virtual {p1, v4, v3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_6

    .line 58
    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    sget-object p2, Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;

    .line 62
    .line 63
    :cond_4
    sget-object v2, Landroidx/compose/ui/spatial/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/spatial/飘花落叶言子楪世苏兰哲;

    .line 64
    .line 65
    invoke-interface {p2, v2}, Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget-wide v3, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰苏哲楪:J

    .line 70
    .line 71
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-static {p1, v2}, Landroidx/compose/ui/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏兰哲世()Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲世兰;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    sget-object v5, Landroidx/compose/ui/node/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;

    .line 84
    .line 85
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    sget-object v5, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 89
    .line 90
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪哲兰世()V

    .line 91
    .line 92
    .line 93
    iget-boolean v6, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰苏楪哲:Z

    .line 94
    .line 95
    if-eqz v6, :cond_5

    .line 96
    .line 97
    invoke-virtual {p1, v5}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏兰世哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_5
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏哲楪世兰()V

    .line 102
    .line 103
    .line 104
    :goto_3
    sget-object v5, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 105
    .line 106
    sget-object v6, Landroidx/compose/ui/spatial/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/spatial/飘花落叶言子楪世苏哲兰;

    .line 107
    .line 108
    invoke-static {p1, v6, v5}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏楪兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 109
    .line 110
    .line 111
    sget-object v5, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 112
    .line 113
    invoke-static {p1, v4, v5}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏楪兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 114
    .line 115
    .line 116
    sget-object v4, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 117
    .line 118
    invoke-static {p1, v4}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏哲兰楪(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 119
    .line 120
    .line 121
    sget-object v4, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 122
    .line 123
    invoke-static {p1, v2, v4}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏楪兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 124
    .line 125
    .line 126
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    sget-object v3, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 131
    .line 132
    invoke-static {p1, v2, v3}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏楪兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲苏兰世(Z)V

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_6
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 140
    .line 141
    .line 142
    :goto_4
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-eqz p1, :cond_7

    .line 147
    .line 148
    new-instance v1, Landroidx/compose/ui/spatial/RectListDebugger_androidKt$RectListDebugger$1;

    .line 149
    .line 150
    invoke-direct {v1, p2, v0, p0}, Landroidx/compose/ui/spatial/RectListDebugger_androidKt$RectListDebugger$1;-><init>(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;II)V

    .line 151
    .line 152
    .line 153
    iput-object v1, p1, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 154
    .line 155
    :cond_7
    return-void
.end method
