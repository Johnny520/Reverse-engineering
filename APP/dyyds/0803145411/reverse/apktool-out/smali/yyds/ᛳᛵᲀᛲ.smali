.class public final Lyyds/ᛳᛵᲀᛲ;
.super Lyyds/ᛳᛵᲀ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:I

.field public final synthetic ᲇᲇᲇᛱ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛳᛵᲀᛲ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛳᛵᲀᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛶᛷᛲᲁ()V
    .locals 6

    .line 1
    iget v0, p0, Lyyds/ᛳᛵᲀᛲ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛶᲈᛷᛸ;->ᛲᛴᛳᛲ:Lyyds/ᛶᲈᛷᛸ;

    .line 4
    .line 5
    iget-object v2, p0, Lyyds/ᛳᛵᲀᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v2, Lyyds/ᲇᛵᲈᲈ;

    .line 12
    .line 13
    iget-object v0, v2, Lyyds/ᲇᛵᲈᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛷᲀᛳᛱ;

    .line 14
    .line 15
    iput-boolean v3, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛵᲇᲀ:Z

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲈᛷᲈᛶ(Lyyds/ᛶᲈᛷᛸ;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v2, Lyyds/ᲇᛵᲈᲈ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 24
    .line 25
    .line 26
    iget-object v0, v2, Lyyds/ᲇᛵᲈᲈ;->ᲀᛲᛳᲀ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 27
    .line 28
    new-instance v1, Lyyds/ᛴᛶᛳᛸ;

    .line 29
    .line 30
    const/16 v2, 0x12

    .line 31
    .line 32
    invoke-direct {v1, v2, p0}, Lyyds/ᛴᛶᛳᛸ;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_0
    check-cast v2, Lyyds/ᲁᛷᲇᛸ;

    .line 40
    .line 41
    iget-object v0, v2, Lyyds/ᲁᛷᲇᛸ;->ᲀᛲᛳᲀ:Landroid/widget/EditText;

    .line 42
    .line 43
    iget-object v4, v2, Lyyds/ᲁᛷᲇᛸ;->ᛵᛶᛲᲀ:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v4, Lyyds/ᛵᲀᲀᛱ;

    .line 46
    .line 47
    iput-boolean v3, v4, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛵᲇᲀ:Z

    .line 48
    .line 49
    invoke-virtual {v4, v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲈᛷᲈᛶ(Lyyds/ᛶᲈᛷᛸ;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛸᛸᛷᛱ()V

    .line 53
    .line 54
    .line 55
    new-instance v1, Lyyds/ᛶᛵᲁᛵ;

    .line 56
    .line 57
    invoke-direct {v1}, Lyyds/ᛶᛵᲁᛵ;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Lyyds/ᛶᛵᲁᛵ;->ᲇᲈᛵᛷ()V

    .line 61
    .line 62
    .line 63
    iget-object v1, v4, Lyyds/ᛵᲀᲀᛱ;->ᛷᛸᲇᛶ:Lyyds/ᛵᲀᲀᛱ;

    .line 64
    .line 65
    iget-object v5, v4, Lyyds/ᛵᲀᲀᛱ;->ᲀᛲᛱᛱ:Lyyds/ᲁᛳᲀᛸ;

    .line 66
    .line 67
    if-nez v5, :cond_0

    .line 68
    .line 69
    new-instance v5, Lyyds/ᲁᛳᲀᛸ;

    .line 70
    .line 71
    invoke-direct {v5, v3, v2}, Lyyds/ᲁᛳᲀᛸ;-><init>(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iput-object v5, v4, Lyyds/ᛵᲀᲀᛱ;->ᲀᛲᛱᛱ:Lyyds/ᲁᛳᲀᛸ;

    .line 75
    .line 76
    :cond_0
    invoke-virtual {v5, v1}, Lyyds/ᲁᛳᲀᛸ;->ᛶᲈᛴᲈ(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object v1, v4, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v1, v4, Lyyds/ᛵᲀᲀᛱ;->ᛷᛸᲇᛶ:Lyyds/ᛵᲀᲀᛱ;

    .line 85
    .line 86
    instance-of v2, v1, Lyyds/ᲀᛸᲇᛴ;

    .line 87
    .line 88
    if-eqz v2, :cond_1

    .line 89
    .line 90
    iget-boolean v2, v4, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛳᲇ:Z

    .line 91
    .line 92
    if-eqz v2, :cond_1

    .line 93
    .line 94
    new-instance v1, Lyyds/ᛴᛶᛳᛸ;

    .line 95
    .line 96
    const/16 v2, 0xb

    .line 97
    .line 98
    invoke-direct {v1, v2, p0}, Lyyds/ᛴᛶᛳᛸ;-><init>(ILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    const-wide/16 v2, 0x12c

    .line 102
    .line 103
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    instance-of p0, v1, Lyyds/ᲀᛸᲇᛴ;

    .line 108
    .line 109
    if-eqz p0, :cond_2

    .line 110
    .line 111
    iget-object p0, v4, Lyyds/ᛵᲀᲀᛱ;->ᛲᲀᛵᛷ:Lyyds/ᲈᲇᛷᲈ;

    .line 112
    .line 113
    if-eqz p0, :cond_2

    .line 114
    .line 115
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Landroid/widget/EditText;->selectAll()V

    .line 122
    .line 123
    .line 124
    :cond_2
    :goto_0
    return-void

    .line 125
    :pswitch_1
    check-cast v2, Lyyds/ᲇᛵᲈᛵ;

    .line 126
    .line 127
    iget-object p0, v2, Lyyds/ᲇᛵᲈᛵ;->ᛶᲈᛴᲈ:Lyyds/ᛴᛱᛱᛸ;

    .line 128
    .line 129
    iput-boolean v3, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛵᲇᲀ:Z

    .line 130
    .line 131
    invoke-virtual {p0, v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲈᛷᲈᛶ(Lyyds/ᛶᲈᛷᛸ;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    new-instance v0, Lyyds/ᛶᛵᲁᛵ;

    .line 138
    .line 139
    invoke-direct {v0}, Lyyds/ᛶᛵᲁᛵ;-><init>()V

    .line 140
    .line 141
    .line 142
    iget-object v1, p0, Lyyds/ᛴᛱᛱᛸ;->ᛶᛴᛱᛲ:Lyyds/ᛴᛱᛱᛸ;

    .line 143
    .line 144
    invoke-virtual {v0}, Lyyds/ᛶᛵᲁᛵ;->ᲇᲈᛵᛷ()V

    .line 145
    .line 146
    .line 147
    iget-object v0, p0, Lyyds/ᛴᛱᛱᛸ;->ᛶᛴᛱᛲ:Lyyds/ᛴᛱᛱᛸ;

    .line 148
    .line 149
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛸᛸᛷᛱ()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Lyyds/ᛴᛱᛱᛸ;->ᲁᛵᲁᲁ()V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᲇᲇᲇᛱ()V
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛳᛵᲀᛲ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛳᛵᲀᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lyyds/ᲇᛵᲈᲈ;

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᲇᛵᲈᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛷᲀᛳᛱ;

    .line 12
    .line 13
    invoke-virtual {p0}, Lyyds/ᛷᲀᛳᛱ;->ᛶᲀᲈᲇ()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛳᛵᲀᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lyyds/ᲁᛷᲇᛸ;

    .line 20
    .line 21
    iget-object p0, p0, Lyyds/ᲁᛷᲇᛸ;->ᛵᛶᛲᲀ:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lyyds/ᛵᲀᲀᛱ;

    .line 24
    .line 25
    iput-boolean v1, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛵᲇᲀ:Z

    .line 26
    .line 27
    new-instance v0, Lyyds/ᛶᛵᲁᛵ;

    .line 28
    .line 29
    invoke-direct {v0}, Lyyds/ᛶᛵᲁᛵ;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lyyds/ᛶᛵᲁᛵ;->ᲀᛲᛳᲀ()V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lyyds/ᛶᲈᛷᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲈᛷᛸ;

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲈᛷᲈᛶ(Lyyds/ᛶᲈᛷᛸ;)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_1
    iget-object p0, p0, Lyyds/ᛳᛵᲀᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Lyyds/ᲇᛵᲈᛵ;

    .line 46
    .line 47
    iget-object v0, p0, Lyyds/ᲇᛵᲈᛵ;->ᛶᲈᛴᲈ:Lyyds/ᛴᛱᛱᛸ;

    .line 48
    .line 49
    iput-boolean v1, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛵᲇᲀ:Z

    .line 50
    .line 51
    new-instance v1, Lyyds/ᛶᛵᲁᛵ;

    .line 52
    .line 53
    invoke-direct {v1}, Lyyds/ᛶᛵᲁᛵ;-><init>()V

    .line 54
    .line 55
    .line 56
    iget-object v2, v0, Lyyds/ᛴᛱᛱᛸ;->ᛶᛴᛱᛲ:Lyyds/ᛴᛱᛱᛸ;

    .line 57
    .line 58
    invoke-virtual {v1}, Lyyds/ᛶᛵᲁᛵ;->ᲀᛲᛳᲀ()V

    .line 59
    .line 60
    .line 61
    iget-object v1, v0, Lyyds/ᛴᛱᛱᛸ;->ᛶᛴᛱᛲ:Lyyds/ᛴᛱᛱᛸ;

    .line 62
    .line 63
    sget-object v1, Lyyds/ᛶᲈᛷᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲈᛷᛸ;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲈᛷᲈᛶ(Lyyds/ᛶᲈᛷᛸ;)V

    .line 66
    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    iput-object v1, v0, Lyyds/ᛴᛱᛱᛸ;->ᛱᲀᲈᛲ:Lyyds/ᲇᛵᲈᛵ;

    .line 70
    .line 71
    iput-object v1, p0, Lyyds/ᲇᛵᲈᛵ;->ᛲᲈᲁ:Lyyds/ᛴᛶᲁᛶ;

    .line 72
    .line 73
    sget-object p0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 74
    .line 75
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
