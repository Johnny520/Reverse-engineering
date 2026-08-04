.class public final synthetic Lyyds/ᛷᛳᲇᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛷᛳᲇᛷ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛷᛳᲇᛷ;->ᲇᲈᛵᛷ:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lyyds/ᛷᛳᲇᛷ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Lyyds/ᛷᛳᲇᛷ;->ᲇᲈᛵᛷ:Landroid/content/Context;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v0, Lyyds/ᛳᛱᛳᲈ;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lyyds/ᛳᛱᛳᲈ;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Lyyds/ᛷᛴᲇᛲ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛴᛱᛷ;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {p0, v0, v1, v2}, Lyyds/ᛷᛴᲇᛲ;->ᛵᛶᛲᲀ(Landroid/content/Context;Ljava/util/concurrent/Executor;Lyyds/ᛳᛲᛴᛳ;Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    new-instance v3, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 22
    .line 23
    new-instance v9, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 24
    .line 25
    invoke-direct {v9}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x1

    .line 30
    const-wide/16 v6, 0x0

    .line 31
    .line 32
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 33
    .line 34
    invoke-direct/range {v3 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Lyyds/ᛷᛳᲇᛷ;

    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    invoke-direct {v0, p0, v1}, Lyyds/ᛷᛳᲇᛷ;-><init>(Landroid/content/Context;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 48
    .line 49
    const/16 v2, 0x21

    .line 50
    .line 51
    if-lt v0, v2, :cond_5

    .line 52
    .line 53
    new-instance v0, Landroid/content/ComponentName;

    .line 54
    .line 55
    const-string v2, "androidx.appcompat.app.AppLocalesMetadataHolderService"

    .line 56
    .line 57
    invoke-direct {v0, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2, v0}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eq v2, v1, :cond_5

    .line 69
    .line 70
    invoke-static {}, Lyyds/ᛸᛷᲁᲀ;->ᛲᲈᲁ()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    const-string v3, "locale"

    .line 75
    .line 76
    if-eqz v2, :cond_2

    .line 77
    .line 78
    sget-object v2, Lyyds/ᲇᛳᛷᛸ;->ᛲᛳᛶᲁ:Lyyds/ᲀᛳᛸᛴ;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance v4, Lyyds/ᛵᛴᛵᛴ;

    .line 84
    .line 85
    invoke-direct {v4, v2}, Lyyds/ᛵᛴᛵᛴ;-><init>(Lyyds/ᲀᛳᛸᛴ;)V

    .line 86
    .line 87
    .line 88
    :cond_0
    invoke-virtual {v4}, Lyyds/ᛵᛴᛵᛴ;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_1

    .line 93
    .line 94
    invoke-virtual {v4}, Lyyds/ᛵᛴᛵᛴ;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Lyyds/ᲇᛳᛷᛸ;

    .line 105
    .line 106
    if-eqz v2, :cond_0

    .line 107
    .line 108
    check-cast v2, Lyyds/ᲁᛲᲀᛷ;

    .line 109
    .line 110
    iget-object v2, v2, Lyyds/ᲁᛲᲀᛷ;->ᛲᛲᲈᲈ:Landroid/content/Context;

    .line 111
    .line 112
    if-eqz v2, :cond_0

    .line 113
    .line 114
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    goto :goto_0

    .line 119
    :cond_1
    const/4 v2, 0x0

    .line 120
    :goto_0
    if-eqz v2, :cond_3

    .line 121
    .line 122
    invoke-static {v2}, Lyyds/ᲇᛷᛳᲀ;->ᛲᲈᲁ(Ljava/lang/Object;)Landroid/os/LocaleList;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    new-instance v4, Lyyds/ᛸᛵᛴᛶ;

    .line 127
    .line 128
    new-instance v5, Lyyds/ᛸᛸᛵᛸ;

    .line 129
    .line 130
    invoke-direct {v5, v2}, Lyyds/ᛸᛸᛵᛸ;-><init>(Landroid/os/LocaleList;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {v4, v5}, Lyyds/ᛸᛵᛴᛶ;-><init>(Lyyds/ᛸᛸᛵᛸ;)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_2
    sget-object v4, Lyyds/ᲇᛳᛷᛸ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛵᛴᛶ;

    .line 138
    .line 139
    if-eqz v4, :cond_3

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    sget-object v4, Lyyds/ᛸᛵᛴᛶ;->ᛵᛸᛸᛷ:Lyyds/ᛸᛵᛴᛶ;

    .line 143
    .line 144
    :goto_1
    iget-object v2, v4, Lyyds/ᛸᛵᛴᛶ;->ᛲᲈᲁ:Lyyds/ᛸᛸᛵᛸ;

    .line 145
    .line 146
    iget-object v2, v2, Lyyds/ᛸᛸᛵᛸ;->ᛲᲈᲁ:Landroid/os/LocaleList;

    .line 147
    .line 148
    invoke-virtual {v2}, Landroid/os/LocaleList;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_4

    .line 153
    .line 154
    invoke-static {p0}, Lyyds/ᲁᲀᲈᛸ;->ᛱᛳᲇ(Landroid/content/Context;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    if-eqz v3, :cond_4

    .line 163
    .line 164
    invoke-static {v2}, Lyyds/ᲇᲁᛲᛱ;->ᛲᲈᲁ(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-static {v3, v2}, Lyyds/ᲇᛷᛳᲀ;->ᛵᛸᛸᛷ(Ljava/lang/Object;Landroid/os/LocaleList;)V

    .line 169
    .line 170
    .line 171
    :cond_4
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {p0, v0, v1, v1}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 176
    .line 177
    .line 178
    :cond_5
    sput-boolean v1, Lyyds/ᲇᛳᛷᛸ;->ᛱᲈᲁ:Z

    .line 179
    .line 180
    return-void

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
