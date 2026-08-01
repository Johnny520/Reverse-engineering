.class final Landroidx/compose/ui/layout/TestModifierUpdaterKt$TestModifierUpdaterLayout$2;
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

.field final synthetic $onAttached:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            "I)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/layout/TestModifierUpdaterKt$TestModifierUpdaterLayout$2;->$onAttached:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iput p2, p0, Landroidx/compose/ui/layout/TestModifierUpdaterKt$TestModifierUpdaterLayout$2;->$$changed:I

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 140
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/TestModifierUpdaterKt$TestModifierUpdaterLayout$2;->invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 6

    .line 1
    iget-object p2, p0, Landroidx/compose/ui/layout/TestModifierUpdaterKt$TestModifierUpdaterLayout$2;->$onAttached:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iget p0, p0, Landroidx/compose/ui/layout/TestModifierUpdaterKt$TestModifierUpdaterLayout$2;->$$changed:I

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    or-int/2addr p0, v0

    .line 7
    invoke-static {p0}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰楪苏哲(I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 12
    .line 13
    const v1, -0x63b8f634

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 17
    .line 18
    .line 19
    and-int/lit8 v1, p0, 0x6

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v1, v2

    .line 33
    :goto_0
    or-int/2addr v1, p0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v1, p0

    .line 36
    :goto_1
    and-int/lit8 v3, v1, 0x3

    .line 37
    .line 38
    if-eq v3, v2, :cond_2

    .line 39
    .line 40
    move v2, v0

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/4 v2, 0x0

    .line 43
    :goto_2
    and-int/2addr v1, v0

    .line 44
    invoke-virtual {p1, v1, v2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_5

    .line 49
    .line 50
    iget-wide v1, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰苏哲楪:J

    .line 51
    .line 52
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    sget-object v3, Landroidx/compose/runtime/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 61
    .line 62
    if-ne v2, v3, :cond_3

    .line 63
    .line 64
    sget-object v2, Landroidx/compose/ui/layout/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/layout/飘花落叶言子苏兰哲世楪;

    .line 65
    .line 66
    invoke-virtual {p1, v2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    check-cast v2, Landroidx/compose/ui/layout/飘花落叶言子世兰苏楪哲;

    .line 70
    .line 71
    sget-object v3, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲楪世兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 72
    .line 73
    const/16 v4, 0x7d

    .line 74
    .line 75
    const/4 v5, 0x0

    .line 76
    invoke-virtual {p1, v4, v0, v5, v5}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰苏楪哲(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iput-boolean v0, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Z

    .line 80
    .line 81
    iget-boolean v4, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰苏楪哲:Z

    .line 82
    .line 83
    if-eqz v4, :cond_4

    .line 84
    .line 85
    invoke-virtual {p1, v3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏兰世哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏哲楪世兰()V

    .line 90
    .line 91
    .line 92
    :goto_3
    sget-object v3, Landroidx/compose/ui/node/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    sget-object v3, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 98
    .line 99
    invoke-static {p1, v2, v3}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏楪兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    sget-object v2, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 107
    .line 108
    invoke-static {p1, v1, v2}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏楪兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 109
    .line 110
    .line 111
    new-instance v1, Landroidx/compose/ui/layout/TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1;

    .line 112
    .line 113
    invoke-direct {v1, p2}, Landroidx/compose/ui/layout/TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 114
    .line 115
    .line 116
    invoke-static {p1, v1}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲苏世(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲苏兰世(Z)V

    .line 120
    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_5
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 124
    .line 125
    .line 126
    :goto_4
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-eqz p1, :cond_6

    .line 131
    .line 132
    new-instance v0, Landroidx/compose/ui/layout/TestModifierUpdaterKt$TestModifierUpdaterLayout$2;

    .line 133
    .line 134
    invoke-direct {v0, p2, p0}, Landroidx/compose/ui/layout/TestModifierUpdaterKt$TestModifierUpdaterLayout$2;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;I)V

    .line 135
    .line 136
    .line 137
    iput-object v0, p1, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 138
    .line 139
    :cond_6
    return-void
.end method
