.class public final synthetic Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    check-cast p3, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;

    .line 20
    .line 21
    if-eqz p3, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰哲楪:Landroidx/compose/ui/text/input/飘花落叶言子楪哲苏兰世;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Landroidx/compose/ui/text/input/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(I)I

    .line 27
    .line 28
    .line 29
    :goto_0
    if-eqz p3, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰哲楪:Landroidx/compose/ui/text/input/飘花落叶言子楪哲苏兰世;

    .line 33
    .line 34
    invoke-interface {v0, p2}, Landroidx/compose/ui/text/input/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(I)I

    .line 35
    .line 36
    .line 37
    :goto_1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰楪哲:Z

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    goto :goto_4

    .line 43
    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲楪兰:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 44
    .line 45
    iget-wide v2, v0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:J

    .line 46
    .line 47
    sget v0, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 48
    .line 49
    const/16 v0, 0x20

    .line 50
    .line 51
    shr-long v4, v2, v0

    .line 52
    .line 53
    long-to-int v0, v4

    .line 54
    if-ne p1, v0, :cond_3

    .line 55
    .line 56
    const-wide v4, 0xffffffffL

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    and-long/2addr v2, v4

    .line 62
    long-to-int v0, v2

    .line 63
    if-ne p2, v0, :cond_3

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_3
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-ltz v0, :cond_6

    .line 71
    .line 72
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-object v2, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲楪兰:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 77
    .line 78
    iget-object v2, v2, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 79
    .line 80
    iget-object v2, v2, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-gt v0, v2, :cond_6

    .line 87
    .line 88
    const/4 v0, 0x1

    .line 89
    if-nez p3, :cond_5

    .line 90
    .line 91
    if-ne p1, p2, :cond_4

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    iget-object p3, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世哲楪苏兰:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;

    .line 95
    .line 96
    invoke-virtual {p3, v0}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪苏兰哲世(Z)V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    :goto_2
    iget-object p3, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世哲楪苏兰:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;

    .line 101
    .line 102
    invoke-virtual {p3, v1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子世楪哲苏兰(Z)V

    .line 103
    .line 104
    .line 105
    sget-object v1, Landroidx/compose/foundation/text/HandleState;->None:Landroidx/compose/foundation/text/HandleState;

    .line 106
    .line 107
    invoke-virtual {p3, v1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪兰哲苏世(Landroidx/compose/foundation/text/HandleState;)V

    .line 108
    .line 109
    .line 110
    :goto_3
    iget-object p3, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 111
    .line 112
    iget-object p3, p3, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪兰苏哲世:Landroidx/compose/foundation/text/飘花落叶言子楪兰苏世哲;

    .line 113
    .line 114
    new-instance v1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 115
    .line 116
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲楪兰:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 117
    .line 118
    iget-object p0, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 119
    .line 120
    invoke-static {p1, p2}, Landroidx/compose/ui/text/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲(II)J

    .line 121
    .line 122
    .line 123
    move-result-wide p1

    .line 124
    const/4 v2, 0x0

    .line 125
    invoke-direct {v1, p0, p1, p2, v2}, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;-><init>(Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;JLandroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p3, v1}, Landroidx/compose/foundation/text/飘花落叶言子楪兰苏世哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move v1, v0

    .line 132
    goto :goto_4

    .line 133
    :cond_6
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世哲楪苏兰:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;

    .line 134
    .line 135
    invoke-virtual {p0, v1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子世楪哲苏兰(Z)V

    .line 136
    .line 137
    .line 138
    sget-object p1, Landroidx/compose/foundation/text/HandleState;->None:Landroidx/compose/foundation/text/HandleState;

    .line 139
    .line 140
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪兰哲苏世(Landroidx/compose/foundation/text/HandleState;)V

    .line 141
    .line 142
    .line 143
    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    return-object p0
.end method
