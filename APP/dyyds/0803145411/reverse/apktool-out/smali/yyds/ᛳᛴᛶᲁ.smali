.class public final synthetic Lyyds/ᛳᛴᛶᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛱᲈᛲ;
.implements Lyyds/ᲁᛳᲀᲇ;
.implements Lyyds/ᛲᛸᛲᛶ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛳᛴᛶᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛳᛴᛶᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᛳᛴᛶᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public ᛲᲈᲁ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)V
    .locals 10

    .line 1
    iget v0, p0, Lyyds/ᛳᛴᛶᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Lyyds/ᛳᛴᛶᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛳᛴᛶᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    check-cast v3, Lyyds/ᛷᛴᛱᛱ;

    .line 15
    .line 16
    check-cast p1, Lyyds/ᛴᛱᛱᛸ;

    .line 17
    .line 18
    invoke-virtual {p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    sget-object p0, Lyyds/ᛵᛴᲇ;->ᛲᲈᲁ:Lyyds/ᛵᛴᲇ;

    .line 25
    .line 26
    const-wide p0, -0x1ff14e68a836eL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    sget-object p0, Lyyds/ᛵᛴᲇ;->ᲇᲇᲇᛱ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 35
    .line 36
    invoke-virtual {p0, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void

    .line 40
    :pswitch_0
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 41
    .line 42
    check-cast v3, Lyyds/ᲈᛷᲈᛶ;

    .line 43
    .line 44
    check-cast p1, Lyyds/ᛴᛱᛱᛸ;

    .line 45
    .line 46
    invoke-virtual {p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_1

    .line 51
    .line 52
    sget-object p0, Lyyds/ᛳᛳᲇᲀ;->ᛲᲈᲁ:Lyyds/ᛳᛳᲇᲀ;

    .line 53
    .line 54
    const-wide p0, -0x1ef30e68a836eL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    sget-object p0, Lyyds/ᛳᛳᲇᲀ;->ᛱᲈᲁ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 63
    .line 64
    invoke-virtual {p0, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_1
    return-void

    .line 68
    :pswitch_1
    check-cast p0, Lyyds/ᛴᲁᛱᲇ;

    .line 69
    .line 70
    check-cast v3, Lyyds/ᛷᛴᲈᲀ;

    .line 71
    .line 72
    check-cast p1, Lyyds/ᛴᛱᛱᛸ;

    .line 73
    .line 74
    iget p1, p1, Lyyds/ᛴᛱᛱᛸ;->ᛳᛷᛶᛲ:I

    .line 75
    .line 76
    const/4 v0, 0x2

    .line 77
    if-ne p1, v0, :cond_2

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    move v2, v1

    .line 81
    :goto_0
    if-eqz v2, :cond_4

    .line 82
    .line 83
    iget p1, p0, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 84
    .line 85
    invoke-static {}, Lyyds/ᛷᲇᛳᲈ;->ᛲᲈᲁ()Ljava/util/ArrayList;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {v4, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    const/16 v0, 0x8

    .line 108
    .line 109
    if-le p1, v0, :cond_3

    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    invoke-virtual {v4, v0, p1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 120
    .line 121
    .line 122
    :cond_3
    invoke-static {}, Lyyds/ᲀᛸ;->ᛲᲈᲁ()Lcom/tencent/mmkv/MMKV;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    const-wide v0, -0x8476e68a836eL

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    const-wide v5, -0x848ae68a836eL

    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    const/4 v8, 0x0

    .line 145
    const/16 v9, 0x3e

    .line 146
    .line 147
    const/4 v6, 0x0

    .line 148
    const/4 v7, 0x0

    .line 149
    invoke-static/range {v4 .. v9}, Lyyds/ᛷᛷᛶᲇ;->ᲈᛷᲈᛶ(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛷᛴᲈᲀ;I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {p1, v0, v1}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 154
    .line 155
    .line 156
    :cond_4
    if-eqz v2, :cond_5

    .line 157
    .line 158
    iget p0, p0, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 159
    .line 160
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    goto :goto_1

    .line 165
    :cond_5
    const/4 p0, 0x0

    .line 166
    :goto_1
    invoke-interface {v3, p0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    nop

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ᛵᛸᛸᛷ(ILjava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛳᛴᛶᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/TextView;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛳᛴᛶᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, [Ljava/lang/String;

    .line 8
    .line 9
    check-cast p2, Lyyds/ᛵᛱᲀᛱ;

    .line 10
    .line 11
    sget-object p2, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛱᲁᛸᛲ:Lyyds/ᛳᲀᛲ;

    .line 17
    .line 18
    sget-object v2, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 19
    .line 20
    const/16 v3, 0xbd

    .line 21
    .line 22
    aget-object v2, v2, v3

    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v1, v2, p1}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛳᛷᛶᛲ()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-ltz p1, :cond_0

    .line 39
    .line 40
    array-length p2, p0

    .line 41
    if-ge p1, p2, :cond_0

    .line 42
    .line 43
    aget-object p0, p0, p1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 p1, 0x0

    .line 47
    aget-object p0, p0, p1

    .line 48
    .line 49
    :goto_0
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    const-wide p0, -0x7ef1e68a836eL

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public ᲇᲈᛵᛷ(Landroid/view/View;Lyyds/ᲈᛶᲈᛴ;)Lyyds/ᲈᛶᲈᛴ;
    .locals 1

    .line 1
    iget-object p1, p0, Lyyds/ᛳᛴᛶᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lyyds/ᲁᛲᛱᛳ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛳᛴᛶᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lyyds/ᲇᲁᲈᛳ;

    .line 8
    .line 9
    iget-boolean v0, p1, Lyyds/ᲁᛲᛱᛳ;->ᛲᲈᲁ:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object p2

    .line 14
    :cond_0
    new-instance v0, Lyyds/ᲇᲁᲈᛳ;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lyyds/ᲇᲁᲈᛳ;-><init>(Lyyds/ᲇᲁᲈᛳ;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2, v0}, Lyyds/ᲁᛲᛱᛳ;->ᛵᛸᛸᛷ(Lyyds/ᲈᛶᲈᛴ;Lyyds/ᲇᲁᲈᛳ;)V

    .line 20
    .line 21
    .line 22
    return-object p2
.end method
