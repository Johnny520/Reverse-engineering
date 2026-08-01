.class public final Lvh1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/Object;

.field public final β:Ln5;

.field public final γ:I

.field public δ:I


# direct methods
.method public constructor <init>(Ljava/util/List;Ln5;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvh1;->α:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lvh1;->β:Ln5;

    .line 7
    .line 8
    invoke-virtual {p0}, Lvh1;->α()Landroid/view/MotionEvent;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getClassification()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move p2, v0

    .line 21
    :goto_0
    iput p2, p0, Lvh1;->γ:I

    .line 22
    .line 23
    invoke-virtual {p0}, Lvh1;->α()Landroid/view/MotionEvent;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getButtonState()I

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, Lvh1;->α()Landroid/view/MotionEvent;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    if-eqz p2, :cond_2

    .line 37
    .line 38
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getMetaState()I

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-virtual {p0}, Lvh1;->α()Landroid/view/MotionEvent;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const/4 v1, 0x3

    .line 46
    const/4 v2, 0x2

    .line 47
    const/4 v3, 0x1

    .line 48
    if-eqz p2, :cond_10

    .line 49
    .line 50
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getClassification()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-ne p1, v1, :cond_3

    .line 55
    .line 56
    move p1, v3

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    move p1, v0

    .line 59
    :goto_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getClassification()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    const/4 v5, 0x5

    .line 64
    if-ne v4, v5, :cond_4

    .line 65
    .line 66
    move v4, v3

    .line 67
    goto :goto_2

    .line 68
    :cond_4
    move v4, v0

    .line 69
    :goto_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    const/16 v6, 0xa

    .line 74
    .line 75
    if-eqz p2, :cond_e

    .line 76
    .line 77
    const/16 v7, 0xc

    .line 78
    .line 79
    if-eq p2, v3, :cond_c

    .line 80
    .line 81
    const/16 v8, 0x8

    .line 82
    .line 83
    if-eq p2, v2, :cond_9

    .line 84
    .line 85
    packed-switch p2, :pswitch_data_0

    .line 86
    .line 87
    .line 88
    goto/16 :goto_9

    .line 89
    .line 90
    :pswitch_0
    move v0, v5

    .line 91
    goto/16 :goto_9

    .line 92
    .line 93
    :pswitch_1
    const/4 v0, 0x4

    .line 94
    goto/16 :goto_9

    .line 95
    .line 96
    :pswitch_2
    const/4 v0, 0x6

    .line 97
    goto/16 :goto_9

    .line 98
    .line 99
    :pswitch_3
    if-eqz p1, :cond_5

    .line 100
    .line 101
    :goto_3
    move v0, v7

    .line 102
    goto :goto_9

    .line 103
    :cond_5
    if-eqz v4, :cond_6

    .line 104
    .line 105
    :goto_4
    move v0, v8

    .line 106
    goto :goto_9

    .line 107
    :cond_6
    :goto_5
    move v0, v2

    .line 108
    goto :goto_9

    .line 109
    :pswitch_4
    if-eqz p1, :cond_7

    .line 110
    .line 111
    :goto_6
    move v0, v6

    .line 112
    goto :goto_9

    .line 113
    :cond_7
    if-eqz v4, :cond_8

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_8
    :goto_7
    move v0, v3

    .line 117
    goto :goto_9

    .line 118
    :cond_9
    :pswitch_5
    if-eqz p1, :cond_a

    .line 119
    .line 120
    const/16 v0, 0xb

    .line 121
    .line 122
    goto :goto_9

    .line 123
    :cond_a
    if-eqz v4, :cond_b

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_b
    move v0, v1

    .line 127
    goto :goto_9

    .line 128
    :cond_c
    if-eqz p1, :cond_d

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_d
    if-eqz v4, :cond_6

    .line 132
    .line 133
    const/16 v0, 0x9

    .line 134
    .line 135
    goto :goto_9

    .line 136
    :cond_e
    if-eqz p1, :cond_f

    .line 137
    .line 138
    goto :goto_6

    .line 139
    :cond_f
    if-eqz v4, :cond_8

    .line 140
    .line 141
    const/4 v0, 0x7

    .line 142
    goto :goto_9

    .line 143
    :cond_10
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    :goto_8
    if-ge v0, p2, :cond_b

    .line 148
    .line 149
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    check-cast v4, Lai1;

    .line 154
    .line 155
    invoke-static {v4}, Lj81;->θ(Lai1;)Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-eqz v5, :cond_11

    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_11
    invoke-static {v4}, Lj81;->η(Lai1;)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-eqz v4, :cond_12

    .line 167
    .line 168
    goto :goto_7

    .line 169
    :cond_12
    add-int/lit8 v0, v0, 0x1

    .line 170
    .line 171
    goto :goto_8

    .line 172
    :goto_9
    iput v0, p0, Lvh1;->δ:I

    .line 173
    .line 174
    return-void

    .line 175
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_4
        :pswitch_3
        :pswitch_5
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final α()Landroid/view/MotionEvent;
    .locals 0

    .line 1
    iget-object p0, p0, Lvh1;->β:Ln5;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ln5;->η:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ln5;

    .line 8
    .line 9
    iget-object p0, p0, Ln5;->η:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Landroid/view/MotionEvent;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method
