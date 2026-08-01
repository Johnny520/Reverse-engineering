.class public final Landroidx/compose/foundation/text/飘花落叶言子世苏哲楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Landroidx/compose/foundation/text/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/compose/foundation/text/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 8
    .line 9
    iput-object p2, p0, Landroidx/compose/foundation/text/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/focus/飘花落叶言子楪苏哲兰世;Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/compose/foundation/text/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲苏兰世:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/text/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/compose/foundation/text/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Landroidx/compose/foundation/text/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/text/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object p0, p0, Landroidx/compose/foundation/text/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世苏兰哲;

    .line 14
    .line 15
    iget-object p1, p1, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/view/KeyEvent;

    .line 16
    .line 17
    check-cast p0, Landroidx/compose/ui/focus/飘花落叶言子楪苏哲兰世;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :cond_0
    const/16 v5, 0x201

    .line 28
    .line 29
    invoke-virtual {v0, v5}, Landroid/view/InputDevice;->supportsSource(I)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-nez v5, :cond_1

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_1
    invoke-virtual {v0}, Landroid/view/InputDevice;->isVirtual()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getSource()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const v5, 0x2000001

    .line 48
    .line 49
    .line 50
    if-eq v0, v5, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-static {p1}, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Landroid/view/KeyEvent;)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    const/4 v5, 0x2

    .line 58
    if-ne v0, v5, :cond_9

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getSource()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/16 v5, 0x101

    .line 65
    .line 66
    if-ne v0, v5, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    const/16 v0, 0x13

    .line 70
    .line 71
    invoke-static {v0, p1}, Landroidx/compose/foundation/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏哲世兰(ILandroid/view/KeyEvent;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    const/4 p1, 0x5

    .line 78
    check-cast p0, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;

    .line 79
    .line 80
    invoke-virtual {p0, p1, v4}, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏哲世兰(IZ)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    goto :goto_0

    .line 85
    :cond_4
    const/16 v0, 0x14

    .line 86
    .line 87
    invoke-static {v0, p1}, Landroidx/compose/foundation/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏哲世兰(ILandroid/view/KeyEvent;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    const/4 p1, 0x6

    .line 94
    check-cast p0, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;

    .line 95
    .line 96
    invoke-virtual {p0, p1, v4}, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏哲世兰(IZ)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    goto :goto_0

    .line 101
    :cond_5
    const/16 v0, 0x15

    .line 102
    .line 103
    invoke-static {v0, p1}, Landroidx/compose/foundation/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏哲世兰(ILandroid/view/KeyEvent;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_6

    .line 108
    .line 109
    const/4 p1, 0x3

    .line 110
    check-cast p0, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;

    .line 111
    .line 112
    invoke-virtual {p0, p1, v4}, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏哲世兰(IZ)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    goto :goto_0

    .line 117
    :cond_6
    const/16 v0, 0x16

    .line 118
    .line 119
    invoke-static {v0, p1}, Landroidx/compose/foundation/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏哲世兰(ILandroid/view/KeyEvent;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_7

    .line 124
    .line 125
    check-cast p0, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;

    .line 126
    .line 127
    invoke-virtual {p0, v2, v4}, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏哲世兰(IZ)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    goto :goto_0

    .line 132
    :cond_7
    const/16 p0, 0x17

    .line 133
    .line 134
    invoke-static {p0, p1}, Landroidx/compose/foundation/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏哲世兰(ILandroid/view/KeyEvent;)Z

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    if-eqz p0, :cond_9

    .line 139
    .line 140
    iget-object p0, v1, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/platform/飘花落叶言子哲苏世兰楪;

    .line 141
    .line 142
    if-eqz p0, :cond_8

    .line 143
    .line 144
    check-cast p0, Landroidx/compose/ui/platform/飘花落叶言子苏世兰哲楪;

    .line 145
    .line 146
    invoke-virtual {p0}, Landroidx/compose/ui/platform/飘花落叶言子苏世兰哲楪;->飘花落叶言子楪世苏兰哲()V

    .line 147
    .line 148
    .line 149
    :cond_8
    move v3, v4

    .line 150
    :cond_9
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    return-object p0

    .line 155
    :pswitch_0
    check-cast p1, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世苏兰哲;

    .line 156
    .line 157
    iget-object p1, p1, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/view/KeyEvent;

    .line 158
    .line 159
    invoke-virtual {v1}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世苏哲兰()Landroidx/compose/foundation/text/HandleState;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    sget-object v1, Landroidx/compose/foundation/text/HandleState;->Selection:Landroidx/compose/foundation/text/HandleState;

    .line 164
    .line 165
    if-ne v0, v1, :cond_a

    .line 166
    .line 167
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-ne v0, v2, :cond_a

    .line 172
    .line 173
    invoke-static {p1}, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Landroid/view/KeyEvent;)I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-ne p1, v4, :cond_a

    .line 178
    .line 179
    check-cast p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;

    .line 180
    .line 181
    const/4 p1, 0x0

    .line 182
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪苏兰世哲(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V

    .line 183
    .line 184
    .line 185
    move v3, v4

    .line 186
    :cond_a
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    return-object p0

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
