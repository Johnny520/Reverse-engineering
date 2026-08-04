.class public final synthetic Lyyds/ᛳᛵᲇᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic ᛲᲈᲁ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛳᛵᲇᛷ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛳᛵᲇᛷ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    const/4 p3, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    instance-of p0, p1, Landroid/view/ViewGroup;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    move-object p3, p1

    .line 13
    check-cast p3, Landroid/view/ViewGroup;

    .line 14
    .line 15
    :cond_0
    if-nez p3, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    sget-object p0, Lyyds/ᛳᛶᛶᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛶᛶᛴ;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object p0, Lyyds/ᛳᛶᛶᛴ;->ᛶᛷᛲᲁ:Ljava/util/Map;

    .line 24
    .line 25
    const-wide p1, -0x38b52e68a836eL

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    monitor-enter p0

    .line 34
    :try_start_0
    invoke-interface {p0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lyyds/ᛵᛶᛳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    monitor-exit p0

    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    iget-object p0, p1, Lyyds/ᛵᛶᛳ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 45
    .line 46
    if-eqz p0, :cond_4

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 53
    .line 54
    if-nez p0, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-static {p3, p0}, Lyyds/ᛳᛶᛶᛴ;->ᛸᛸᛷᛱ(Landroid/view/ViewGroup;Landroid/graphics/drawable/Drawable;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p3}, Landroid/view/View;->invalidate()V

    .line 61
    .line 62
    .line 63
    :cond_4
    :goto_0
    return-void

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    monitor-exit p0

    .line 66
    throw p1

    .line 67
    :pswitch_0
    sget-object p0, Lyyds/ᲁᛱᛴᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲁᛱᛴᲁ;

    .line 68
    .line 69
    :try_start_1
    instance-of p4, p1, Landroid/view/ViewGroup;

    .line 70
    .line 71
    if-eqz p4, :cond_5

    .line 72
    .line 73
    move-object p3, p1

    .line 74
    check-cast p3, Landroid/view/ViewGroup;

    .line 75
    .line 76
    :cond_5
    if-nez p3, :cond_6

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_6
    sget-object p1, Lyyds/ᲁᛱᛴᲁ;->ᛷᲈᲈᲁ:Ljava/util/Map;

    .line 80
    .line 81
    const-wide p4, -0x2ea75e68a836eL

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    invoke-static {p4, p5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    monitor-enter p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 90
    :try_start_2
    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p4

    .line 94
    check-cast p4, Lyyds/ᲈᛳᛲ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 95
    .line 96
    :try_start_3
    monitor-exit p1

    .line 97
    if-nez p4, :cond_7

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_7
    iget-boolean p1, p4, Lyyds/ᲈᛳᛲ;->ᛲᛴᛳᛲ:Z

    .line 101
    .line 102
    if-eqz p1, :cond_8

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-static {p3, p4, p2}, Lyyds/ᲁᛱᛴᲁ;->ᛱᛳᛶᛳ(Landroid/view/ViewGroup;Lyyds/ᲈᛳᛲ;Z)V

    .line 108
    .line 109
    .line 110
    :cond_8
    :goto_1
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :catchall_1
    move-exception p0

    .line 114
    monitor-exit p1

    .line 115
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 116
    :catchall_2
    move-exception p0

    .line 117
    new-instance p1, Lyyds/ᲈᛵᛵᛴ;

    .line 118
    .line 119
    invoke-direct {p1, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    move-object p0, p1

    .line 123
    :goto_2
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    if-eqz p0, :cond_9

    .line 128
    .line 129
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 130
    .line 131
    const-wide p2, -0x2ea7be68a836eL

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    invoke-static {p2, p3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-virtual {p1, p2, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    :cond_9
    return-void

    .line 144
    :pswitch_1
    instance-of p0, p1, Landroid/view/ViewGroup;

    .line 145
    .line 146
    if-eqz p0, :cond_a

    .line 147
    .line 148
    move-object p3, p1

    .line 149
    check-cast p3, Landroid/view/ViewGroup;

    .line 150
    .line 151
    :cond_a
    if-nez p3, :cond_b

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_b
    sget-object p0, Lyyds/ᛸᛵᲈᛷ;->ᛳᲁᲁᲇ:Ljava/util/Map;

    .line 155
    .line 156
    const-wide p4, -0x3951ee68a836eL

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    invoke-static {p4, p5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    monitor-enter p0

    .line 165
    :try_start_4
    invoke-interface {p0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    check-cast p1, Lyyds/ᲀᲁᲀᛷ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 170
    .line 171
    monitor-exit p0

    .line 172
    if-nez p1, :cond_c

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_c
    sget-object p0, Lyyds/ᛸᛵᲈᛷ;->ᲇᲇᲇᛱ:Lyyds/ᛸᛵᲈᛷ;

    .line 176
    .line 177
    invoke-virtual {p0, p3, p1, p2, p2}, Lyyds/ᛸᛵᲈᛷ;->ᛱᛳᛶᛳ(Landroid/view/ViewGroup;Lyyds/ᲀᲁᲀᛷ;ZZ)V

    .line 178
    .line 179
    .line 180
    :goto_3
    return-void

    .line 181
    :catchall_3
    move-exception p1

    .line 182
    monitor-exit p0

    .line 183
    throw p1

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
