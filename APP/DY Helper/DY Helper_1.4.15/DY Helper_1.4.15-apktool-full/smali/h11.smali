.class public final synthetic Lh11;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lb8;


# direct methods
.method public synthetic constructor <init>(Lb8;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh11;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lh11;->ζ:Lb8;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lh11;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lh11;->ζ:Lb8;

    .line 7
    .line 8
    iget-object p0, p0, Lb8;->ε:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v1, v0

    .line 26
    check-cast v1, Ln91;

    .line 27
    .line 28
    iget-object v1, v1, Ln91;->α:Lw2;

    .line 29
    .line 30
    iget-object v1, v1, Lw2;->ι:Lpp0;

    .line 31
    .line 32
    invoke-virtual {v1}, Lpp0;->γ()F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v3, 0x1

    .line 41
    sub-int/2addr v2, v3

    .line 42
    if-gt v3, v2, :cond_2

    .line 43
    .line 44
    :goto_0
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    move-object v5, v4

    .line 49
    check-cast v5, Ln91;

    .line 50
    .line 51
    iget-object v5, v5, Ln91;->α:Lw2;

    .line 52
    .line 53
    iget-object v5, v5, Lw2;->ι:Lpp0;

    .line 54
    .line 55
    invoke-virtual {v5}, Lpp0;->γ()F

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-static {v1, v5}, Ljava/lang/Float;->compare(FF)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-gez v6, :cond_1

    .line 64
    .line 65
    move-object v0, v4

    .line 66
    move v1, v5

    .line 67
    :cond_1
    if-eq v3, v2, :cond_2

    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    move-object p0, v0

    .line 73
    :goto_1
    check-cast p0, Ln91;

    .line 74
    .line 75
    if-eqz p0, :cond_3

    .line 76
    .line 77
    iget-object p0, p0, Ln91;->α:Lw2;

    .line 78
    .line 79
    iget-object p0, p0, Lw2;->ι:Lpp0;

    .line 80
    .line 81
    invoke-virtual {p0}, Lpp0;->γ()F

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    goto :goto_2

    .line 86
    :cond_3
    const/4 p0, 0x0

    .line 87
    :goto_2
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :pswitch_0
    iget-object p0, p0, Lh11;->ζ:Lb8;

    .line 93
    .line 94
    iget-object p0, p0, Lb8;->ε:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p0, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    const/4 p0, 0x0

    .line 105
    goto :goto_4

    .line 106
    :cond_4
    const/4 v0, 0x0

    .line 107
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    move-object v1, v0

    .line 112
    check-cast v1, Ln91;

    .line 113
    .line 114
    iget-object v1, v1, Ln91;->α:Lw2;

    .line 115
    .line 116
    invoke-virtual {v1}, Lw2;->γ()F

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    const/4 v3, 0x1

    .line 125
    sub-int/2addr v2, v3

    .line 126
    if-gt v3, v2, :cond_6

    .line 127
    .line 128
    :goto_3
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    move-object v5, v4

    .line 133
    check-cast v5, Ln91;

    .line 134
    .line 135
    iget-object v5, v5, Ln91;->α:Lw2;

    .line 136
    .line 137
    invoke-virtual {v5}, Lw2;->γ()F

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    invoke-static {v1, v5}, Ljava/lang/Float;->compare(FF)I

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-gez v6, :cond_5

    .line 146
    .line 147
    move-object v0, v4

    .line 148
    move v1, v5

    .line 149
    :cond_5
    if-eq v3, v2, :cond_6

    .line 150
    .line 151
    add-int/lit8 v3, v3, 0x1

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_6
    move-object p0, v0

    .line 155
    :goto_4
    check-cast p0, Ln91;

    .line 156
    .line 157
    if-eqz p0, :cond_7

    .line 158
    .line 159
    iget-object p0, p0, Ln91;->α:Lw2;

    .line 160
    .line 161
    invoke-virtual {p0}, Lw2;->γ()F

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    goto :goto_5

    .line 166
    :cond_7
    const/4 p0, 0x0

    .line 167
    :goto_5
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
