.class public final Lyyds/ᛷᛲᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᲈᛳᛲ;

.field public final synthetic ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

.field public final synthetic ᲇᲇᲇᛱ:Lyyds/ᛴᲁᛱᲇ;

.field public final synthetic ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;ILyyds/ᲈᛳᛲ;Lyyds/ᛴᲁᛱᲇ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛷᛲᛸ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    iput p2, p0, Lyyds/ᛷᛲᛸ;->ᲇᲈᛵᛷ:I

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛷᛲᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛳᛲ;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᛷᛲᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛴᲁᛱᲇ;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛲᛸ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/ViewGroup;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    iget v2, p0, Lyyds/ᛷᛲᛸ;->ᲇᲈᛵᛷ:I

    .line 13
    .line 14
    iget-object v3, p0, Lyyds/ᛷᛲᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛳᛲ;

    .line 15
    .line 16
    iget v4, v3, Lyyds/ᲈᛳᛲ;->ᲇᲇᲇᛱ:I

    .line 17
    .line 18
    if-ne v2, v4, :cond_4

    .line 19
    .line 20
    iget-boolean v2, v3, Lyyds/ᲈᛳᛲ;->ᛲᛴᛳᛲ:Z

    .line 21
    .line 22
    if-eqz v2, :cond_4

    .line 23
    .line 24
    sget-object v2, Lyyds/ᲁᛱᛴᲁ;->ᛷᲈᲈᲁ:Ljava/util/Map;

    .line 25
    .line 26
    const-wide v3, -0x37b2fe68a836eL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    monitor-enter v2

    .line 35
    :try_start_0
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lyyds/ᲈᛳᛲ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 40
    .line 41
    monitor-exit v2

    .line 42
    iget-object v2, p0, Lyyds/ᛷᛲᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛳᛲ;

    .line 43
    .line 44
    if-eq v3, v2, :cond_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    :try_start_1
    sget-object v3, Lyyds/ᲁᛱᛴᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲁᛱᛴᲁ;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v2, v1}, Lyyds/ᲁᛱᛴᲁ;->ᛱᲀᲈᛲ(Landroid/view/ViewGroup;Lyyds/ᲈᛳᛲ;Z)Lyyds/ᲁᛱᛸᲇ;

    .line 53
    .line 54
    .line 55
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v2

    .line 58
    new-instance v3, Lyyds/ᲈᛵᛵᛴ;

    .line 59
    .line 60
    invoke-direct {v3, v2}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    move-object v2, v3

    .line 64
    :goto_0
    iget-object v3, p0, Lyyds/ᛷᛲᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛳᛲ;

    .line 65
    .line 66
    invoke-static {v2}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    if-eqz v4, :cond_1

    .line 71
    .line 72
    sget-object v5, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 73
    .line 74
    new-instance v6, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-wide v7, -0x37b46e68a836eL

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget-object v3, v3, Lyyds/ᲈᛳᛲ;->ᛲᲈᲁ:Lyyds/ᛴᛵᲈᛴ;

    .line 89
    .line 90
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v5, v3, v4}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    :cond_1
    instance-of v3, v2, Lyyds/ᲈᛵᛵᛴ;

    .line 101
    .line 102
    if-eqz v3, :cond_2

    .line 103
    .line 104
    const/4 v2, 0x0

    .line 105
    :cond_2
    check-cast v2, Lyyds/ᲁᛱᛸᲇ;

    .line 106
    .line 107
    sget-object v3, Lyyds/ᲁᛱᛸᲇ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛱᛸᲇ;

    .line 108
    .line 109
    if-ne v2, v3, :cond_3

    .line 110
    .line 111
    iget-object v2, p0, Lyyds/ᛷᛲᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛴᲁᛱᲇ;

    .line 112
    .line 113
    iget v3, v2, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 114
    .line 115
    add-int/lit8 v4, v3, -0x1

    .line 116
    .line 117
    iput v4, v2, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 118
    .line 119
    if-lez v3, :cond_3

    .line 120
    .line 121
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_3

    .line 126
    .line 127
    iget v2, p0, Lyyds/ᛷᛲᛸ;->ᲇᲈᛵᛷ:I

    .line 128
    .line 129
    iget-object v3, p0, Lyyds/ᛷᛲᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛳᛲ;

    .line 130
    .line 131
    iget v3, v3, Lyyds/ᲈᛳᛲ;->ᲇᲇᲇᛱ:I

    .line 132
    .line 133
    if-ne v2, v3, :cond_3

    .line 134
    .line 135
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_3
    iget v0, p0, Lyyds/ᛷᛲᛸ;->ᲇᲈᛵᛷ:I

    .line 140
    .line 141
    iget-object p0, p0, Lyyds/ᛷᛲᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛳᛲ;

    .line 142
    .line 143
    iget v2, p0, Lyyds/ᲈᛳᛲ;->ᲇᲇᲇᛱ:I

    .line 144
    .line 145
    if-ne v0, v2, :cond_5

    .line 146
    .line 147
    iput-boolean v1, p0, Lyyds/ᲈᛳᛲ;->ᛶᛷᛲᲁ:Z

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :catchall_1
    move-exception p0

    .line 151
    monitor-exit v2

    .line 152
    throw p0

    .line 153
    :cond_4
    :goto_1
    iget v0, p0, Lyyds/ᛷᛲᛸ;->ᲇᲈᛵᛷ:I

    .line 154
    .line 155
    iget-object p0, p0, Lyyds/ᛷᛲᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛳᛲ;

    .line 156
    .line 157
    iget v2, p0, Lyyds/ᲈᛳᛲ;->ᲇᲇᲇᛱ:I

    .line 158
    .line 159
    if-ne v0, v2, :cond_5

    .line 160
    .line 161
    iput-boolean v1, p0, Lyyds/ᲈᛳᛲ;->ᛶᛷᛲᲁ:Z

    .line 162
    .line 163
    :cond_5
    :goto_2
    return-void
.end method
