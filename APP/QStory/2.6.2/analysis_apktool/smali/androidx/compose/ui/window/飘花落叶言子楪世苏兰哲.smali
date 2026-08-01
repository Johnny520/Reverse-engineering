.class public final Landroidx/compose/ui/window/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroidx/compose/ui/layout/飘花落叶言子世兰苏楪哲;


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/window/飘花落叶言子楪世苏兰哲;

.field public static final 飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/window/飘花落叶言子楪世苏兰哲;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/window/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/ui/window/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/ui/window/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/window/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    new-instance v0, Landroidx/compose/ui/window/飘花落叶言子楪世苏兰哲;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Landroidx/compose/ui/window/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Landroidx/compose/ui/window/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/window/飘花落叶言子楪世苏兰哲;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;Ljava/util/List;J)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;
    .locals 6

    .line 1
    iget p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_2

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq p0, v1, :cond_1

    .line 15
    .line 16
    new-instance p0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    move v2, v0

    .line 30
    move v3, v2

    .line 31
    :goto_0
    if-ge v0, v1, :cond_0

    .line 32
    .line 33
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;

    .line 38
    .line 39
    invoke-interface {v4, p3, p4}, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;->飘花落叶言子世楪苏哲兰(J)Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget v5, v4, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 44
    .line 45
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    iget v5, v4, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 50
    .line 51
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    new-instance p2, Landroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$1$3;

    .line 62
    .line 63
    invoke-direct {p2, p0}, Landroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$1$3;-><init>(Ljava/util/List;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1, v2, v3, p2}, Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子苏世兰哲楪(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;IIL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;

    .line 76
    .line 77
    invoke-interface {p0, p3, p4}, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;->飘花落叶言子世楪苏哲兰(J)Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    iget p2, p0, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 82
    .line 83
    iget p3, p0, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 84
    .line 85
    new-instance p4, Landroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$1$2;

    .line 86
    .line 87
    invoke-direct {p4, p0}, Landroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$1$2;-><init>(Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;)V

    .line 88
    .line 89
    .line 90
    invoke-static {p1, p2, p3, p4}, Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子苏世兰哲楪(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;IIL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    goto :goto_1

    .line 95
    :cond_2
    sget-object p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$1$1;->INSTANCE:Landroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$1$1;

    .line 96
    .line 97
    invoke-static {p1, v0, v0, p0}, Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子苏世兰哲楪(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;IIL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    :goto_1
    return-object p0

    .line 102
    :pswitch_0
    new-instance p0, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    move v2, v0

    .line 116
    move v3, v2

    .line 117
    :goto_2
    if-ge v0, v1, :cond_3

    .line 118
    .line 119
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    check-cast v4, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;

    .line 124
    .line 125
    invoke-interface {v4, p3, p4}, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;->飘花落叶言子世楪苏哲兰(J)Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    iget v5, v4, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 130
    .line 131
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    iget v5, v4, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 136
    .line 137
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    add-int/lit8 v0, v0, 0x1

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_3
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    if-eqz p2, :cond_4

    .line 152
    .line 153
    invoke-static {p3, p4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(J)I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    invoke-static {p3, p4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(J)I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    :cond_4
    new-instance p2, Landroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1$1$1;

    .line 162
    .line 163
    invoke-direct {p2, p0}, Landroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1$1$1;-><init>(Ljava/util/List;)V

    .line 164
    .line 165
    .line 166
    invoke-static {p1, v2, v3, p2}, Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子苏世兰哲楪(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;IIL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    return-object p0

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
