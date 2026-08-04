.class public final Lyyds/ᲁᛴᲁᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᲇᛵᲈᛵ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᲇᛵᲈᛵ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᲁᛴᲁᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲁᛴᲁᛸ;->ᲇᲈᛵᛷ:Lyyds/ᲇᛵᲈᛵ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᲁᛴᲁᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲁᛴᲁᛸ;->ᲇᲈᛵᛷ:Lyyds/ᲇᛵᲈᛵ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᲇᛵᲈᛵ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->callOnClick()Z

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lyyds/ᲇᛵᲈᛵ;->ᛶᲈᛴᲈ:Lyyds/ᛴᛱᛱᛸ;

    .line 15
    .line 16
    iget-object v0, v0, Lyyds/ᛴᛱᛱᛸ;->ᛲᛱᲁᛳ:Lyyds/ᛷᲈᲈᛶ;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0, p1}, Lyyds/ᲇᛵᲈᛵ;->ᛲᲈᲁ(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    return-void

    .line 25
    :pswitch_1
    iget-object p0, p0, Lyyds/ᲇᛵᲈᛵ;->ᛶᲈᛴᲈ:Lyyds/ᛴᛱᛱᛸ;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛸᲀᲁ(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x2

    .line 34
    iput p1, p0, Lyyds/ᛴᛱᛱᛸ;->ᛳᛷᛶᛲ:I

    .line 35
    .line 36
    iget-object p1, p0, Lyyds/ᛴᛱᛱᛸ;->ᛶᛴᛱᛲ:Lyyds/ᛴᛱᛱᛸ;

    .line 37
    .line 38
    iget-object v0, p0, Lyyds/ᛴᛱᛱᛸ;->ᛷᲇᛲᛱ:Lyyds/ᲁᛲᲇᛴ;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    instance-of v1, v0, Lyyds/ᛶᛷᛳᛷ;

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    check-cast v0, Lyyds/ᛶᛷᛳᛷ;

    .line 47
    .line 48
    invoke-interface {v0, p1}, Lyyds/ᛶᛷᛳᛷ;->ᛲᲈᲁ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ()V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    instance-of v1, v0, Lyyds/ᛵᛱᛱᛴ;

    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    check-cast v0, Lyyds/ᛵᛱᛱᛴ;

    .line 63
    .line 64
    invoke-interface {v0, p1}, Lyyds/ᛵᛱᛱᛴ;->ᛲᲈᲁ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_3

    .line 69
    .line 70
    invoke-virtual {p0}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ()V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-virtual {p0}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ()V

    .line 75
    .line 76
    .line 77
    :cond_3
    :goto_1
    return-void

    .line 78
    :pswitch_2
    iget-object p0, p0, Lyyds/ᲇᛵᲈᛵ;->ᛶᲈᛴᲈ:Lyyds/ᛴᛱᛱᛸ;

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {p1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛸᲀᲁ(Landroid/view/View;)V

    .line 84
    .line 85
    .line 86
    const/4 p1, 0x4

    .line 87
    iput p1, p0, Lyyds/ᛴᛱᛱᛸ;->ᛳᛷᛶᛲ:I

    .line 88
    .line 89
    iget-object p1, p0, Lyyds/ᛴᛱᛱᛸ;->ᲈᛷᲈᛶ:Lyyds/ᛵᛱᛱᛴ;

    .line 90
    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    instance-of v0, p1, Lyyds/ᛶᛷᛳᛷ;

    .line 94
    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    check-cast p1, Lyyds/ᛶᛷᛳᛷ;

    .line 98
    .line 99
    iget-object v0, p0, Lyyds/ᛴᛱᛱᛸ;->ᛶᛴᛱᛲ:Lyyds/ᛴᛱᛱᛸ;

    .line 100
    .line 101
    invoke-interface {p1, v0}, Lyyds/ᛶᛷᛳᛷ;->ᛲᲈᲁ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-nez p1, :cond_6

    .line 106
    .line 107
    invoke-virtual {p0}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ()V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    iget-object v0, p0, Lyyds/ᛴᛱᛱᛸ;->ᛶᛴᛱᛲ:Lyyds/ᛴᛱᛱᛸ;

    .line 112
    .line 113
    invoke-interface {p1, v0}, Lyyds/ᛵᛱᛱᛴ;->ᛲᲈᲁ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-nez p1, :cond_6

    .line 118
    .line 119
    invoke-virtual {p0}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ()V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_5
    invoke-virtual {p0}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ()V

    .line 124
    .line 125
    .line 126
    :cond_6
    :goto_2
    return-void

    .line 127
    :pswitch_3
    iget-object p0, p0, Lyyds/ᲇᛵᲈᛵ;->ᛶᲈᛴᲈ:Lyyds/ᛴᛱᛱᛸ;

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-static {p1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛸᲀᲁ(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    const/4 p1, 0x3

    .line 136
    iput p1, p0, Lyyds/ᛴᛱᛱᛸ;->ᛳᛷᛶᛲ:I

    .line 137
    .line 138
    iget-object p1, p0, Lyyds/ᛴᛱᛱᛸ;->ᛶᛴᛱᛲ:Lyyds/ᛴᛱᛱᛸ;

    .line 139
    .line 140
    iget-object v0, p0, Lyyds/ᛴᛱᛱᛸ;->ᛷᛶᛷᲀ:Lyyds/ᲁᛲᲇᛴ;

    .line 141
    .line 142
    if-eqz v0, :cond_8

    .line 143
    .line 144
    instance-of v1, v0, Lyyds/ᛶᛷᛳᛷ;

    .line 145
    .line 146
    if-eqz v1, :cond_7

    .line 147
    .line 148
    check-cast v0, Lyyds/ᛶᛷᛳᛷ;

    .line 149
    .line 150
    invoke-interface {v0, p1}, Lyyds/ᛶᛷᛳᛷ;->ᛲᲈᲁ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-nez p1, :cond_9

    .line 155
    .line 156
    invoke-virtual {p0}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ()V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    instance-of v1, v0, Lyyds/ᛵᛱᛱᛴ;

    .line 161
    .line 162
    if-eqz v1, :cond_9

    .line 163
    .line 164
    check-cast v0, Lyyds/ᛵᛱᛱᛴ;

    .line 165
    .line 166
    invoke-interface {v0, p1}, Lyyds/ᛵᛱᛱᛴ;->ᛲᲈᲁ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-nez p1, :cond_9

    .line 171
    .line 172
    invoke-virtual {p0}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ()V

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_8
    invoke-virtual {p0}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ()V

    .line 177
    .line 178
    .line 179
    :cond_9
    :goto_3
    return-void

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
