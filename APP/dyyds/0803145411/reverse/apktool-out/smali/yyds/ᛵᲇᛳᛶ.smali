.class public final Lyyds/ᛵᲇᛳᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛵᲇᛳᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 4

    .line 1
    iget p0, p0, Lyyds/ᛵᲇᛳᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-wide v2, -0x3d839e68a836eL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    :try_start_0
    instance-of p0, p1, Landroid/view/ViewGroup;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    move-object v1, p1

    .line 21
    check-cast v1, Landroid/view/ViewGroup;

    .line 22
    .line 23
    :cond_0
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    sget-object p0, Lyyds/ᲁᛱᛴᲁ;->ᛷᲈᲈᲁ:Ljava/util/Map;

    .line 27
    .line 28
    const-wide v2, -0x3d83ee68a836eL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    :try_start_1
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lyyds/ᲈᛳᛲ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    :try_start_2
    monitor-exit p0

    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    iget-boolean p0, p1, Lyyds/ᲈᛳᛲ;->ᛲᛴᛳᛲ:Z

    .line 48
    .line 49
    if-eqz p0, :cond_3

    .line 50
    .line 51
    sget-object p0, Lyyds/ᲁᛱᛴᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲁᛱᛴᲁ;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {v1, p1, v0}, Lyyds/ᲁᛱᛴᲁ;->ᛱᛳᛶᛳ(Landroid/view/ViewGroup;Lyyds/ᲈᛳᛲ;Z)V

    .line 57
    .line 58
    .line 59
    :cond_3
    :goto_0
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    monitor-exit p0

    .line 64
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 65
    :catchall_1
    move-exception p0

    .line 66
    new-instance p1, Lyyds/ᲈᛵᛵᛴ;

    .line 67
    .line 68
    invoke-direct {p1, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    move-object p0, p1

    .line 72
    :goto_1
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-eqz p0, :cond_4

    .line 77
    .line 78
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 79
    .line 80
    const-wide v0, -0x3d855e68a836eL

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    :cond_4
    return-void

    .line 93
    :pswitch_0
    const-wide v2, -0x34abde68a836eL

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    instance-of p0, p1, Landroid/view/ViewGroup;

    .line 102
    .line 103
    if-eqz p0, :cond_5

    .line 104
    .line 105
    move-object v1, p1

    .line 106
    check-cast v1, Landroid/view/ViewGroup;

    .line 107
    .line 108
    :cond_5
    if-nez v1, :cond_6

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_6
    sget-object p0, Lyyds/ᛸᛵᲈᛷ;->ᛳᲁᲁᲇ:Ljava/util/Map;

    .line 112
    .line 113
    const-wide v2, -0x34ac2e68a836eL

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    monitor-enter p0

    .line 122
    :try_start_3
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    check-cast p1, Lyyds/ᲀᲁᲀᛷ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 127
    .line 128
    monitor-exit p0

    .line 129
    if-nez p1, :cond_7

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_7
    sget-object p0, Lyyds/ᛸᛵᲈᛷ;->ᲇᲇᲇᛱ:Lyyds/ᛸᛵᲈᛷ;

    .line 133
    .line 134
    const/4 v2, 0x1

    .line 135
    invoke-virtual {p0, v1, p1, v0, v2}, Lyyds/ᛸᛵᲈᛷ;->ᛱᛳᛶᛳ(Landroid/view/ViewGroup;Lyyds/ᲀᲁᲀᛷ;ZZ)V

    .line 136
    .line 137
    .line 138
    :goto_2
    return-void

    .line 139
    :catchall_2
    move-exception p1

    .line 140
    monitor-exit p0

    .line 141
    throw p1

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 4

    .line 1
    iget p0, p0, Lyyds/ᛵᲇᛳᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-wide v2, -0x3d863e68a836eL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    :try_start_0
    instance-of p0, p1, Landroid/view/ViewGroup;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    move-object v1, p1

    .line 21
    check-cast v1, Landroid/view/ViewGroup;

    .line 22
    .line 23
    :cond_0
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    sget-object p0, Lyyds/ᲁᛱᛴᲁ;->ᛷᲈᲈᲁ:Ljava/util/Map;

    .line 27
    .line 28
    const-wide v2, -0x3d868e68a836eL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    :try_start_1
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lyyds/ᲈᛳᛲ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    :try_start_2
    monitor-exit p0

    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    sget-object p0, Lyyds/ᲁᛱᛴᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲁᛱᛴᲁ;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget p0, p1, Lyyds/ᲈᛳᛲ;->ᲇᲇᲇᛱ:I

    .line 53
    .line 54
    add-int/lit8 p0, p0, 0x1

    .line 55
    .line 56
    iput p0, p1, Lyyds/ᲈᛳᛲ;->ᲇᲇᲇᛱ:I

    .line 57
    .line 58
    iput-boolean v0, p1, Lyyds/ᲈᛳᛲ;->ᛶᛷᛲᲁ:Z

    .line 59
    .line 60
    new-instance p0, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-static {v1, p0}, Lyyds/ᲁᛱᛴᲁ;->ᲀᛴᲁᲈ(Landroid/view/ViewGroup;Ljava/util/ArrayList;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Lyyds/ᛷᲈᲈᛲ;

    .line 83
    .line 84
    invoke-static {p1}, Lyyds/ᲁᛱᛴᲁ;->ᛲᲀᛵᛷ(Lyyds/ᛷᲈᲈᛲ;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    :goto_1
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    monitor-exit p0

    .line 93
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 94
    :catchall_1
    move-exception p0

    .line 95
    new-instance p1, Lyyds/ᲈᛵᛵᛴ;

    .line 96
    .line 97
    invoke-direct {p1, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    move-object p0, p1

    .line 101
    :goto_2
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-eqz p0, :cond_4

    .line 106
    .line 107
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 108
    .line 109
    const-wide v0, -0x3d87fe68a836eL

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    :cond_4
    return-void

    .line 122
    :pswitch_0
    const-wide v2, -0x34adee68a836eL

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    sget-object p0, Lyyds/ᛸᛵᲈᛷ;->ᲇᛱᛲ:Ljava/util/Map;

    .line 131
    .line 132
    const-wide v2, -0x34ae3e68a836eL

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    monitor-enter p0

    .line 141
    :try_start_3
    instance-of v2, p1, Landroid/view/ViewGroup;

    .line 142
    .line 143
    if-eqz v2, :cond_5

    .line 144
    .line 145
    move-object v1, p1

    .line 146
    check-cast v1, Landroid/view/ViewGroup;

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :catchall_2
    move-exception p1

    .line 150
    goto :goto_5

    .line 151
    :cond_5
    :goto_3
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    check-cast p1, Lyyds/ᲀᛲᲈᛴ;

    .line 156
    .line 157
    if-eqz p1, :cond_6

    .line 158
    .line 159
    monitor-enter p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 160
    :try_start_4
    iput-boolean v0, p1, Lyyds/ᲀᛲᲈᛴ;->ᛲᛴᛳᛲ:Z

    .line 161
    .line 162
    iput v0, p1, Lyyds/ᲀᛲᲈᛴ;->ᲇᲈᛵᛷ:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 163
    .line 164
    :try_start_5
    monitor-exit p1

    .line 165
    goto :goto_4

    .line 166
    :catchall_3
    move-exception v0

    .line 167
    monitor-exit p1

    .line 168
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 169
    :cond_6
    :goto_4
    monitor-exit p0

    .line 170
    return-void

    .line 171
    :goto_5
    monitor-exit p0

    .line 172
    throw p1

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
