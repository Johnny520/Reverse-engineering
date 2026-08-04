.class public final Lyyds/ᛴᛸᛵᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:Lyyds/ᛲᲇᲁᛲ;

.field public final ᛲᛲᲈᲈ:Lyyds/ᛱᲇᲀᛶ;

.field public ᛲᛳᛶᲁ:Lyyds/ᛳᛴᛲᲀ;

.field public final ᛲᛴᛳᛲ:Landroid/view/WindowManager$LayoutParams;

.field public final ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

.field public ᛵᛸᛸᛷ:Landroid/app/Activity;

.field public ᛶᛷᛲᲁ:Ljava/lang/String;

.field public ᛷᛲᲈᛱ:Lyyds/ᛴᲁᛴᲈ;

.field public final ᛷᛵᲇᲀ:Ljava/lang/Object;

.field public ᛷᲈᲈᲁ:Lyyds/ᛵᛵᛵᛲ;

.field public ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

.field public ᲇᲇᲇᛱ:Z

.field public final ᲇᲈᛵᛷ:Landroid/view/WindowManager;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛷᛵᲇᲀ:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v1, Lyyds/ᛱᲇᲀᛶ;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {v1, p0, v2}, Lyyds/ᛱᲇᲀᛶ;-><init>(Lyyds/ᛴᛸᛵᲈ;I)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lyyds/ᛱᲇᲀᛶ;

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-direct {v1, p0, v2}, Lyyds/ᛱᲇᲀᛶ;-><init>(Lyyds/ᛴᛸᛵᲈ;I)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛲᲈᲈ:Lyyds/ᛱᲇᲀᛶ;

    .line 31
    .line 32
    iput-object p1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛵᛸᛸᛷ:Landroid/app/Activity;

    .line 33
    .line 34
    new-instance v1, Lyyds/ᛳᲀᛵᛵ;

    .line 35
    .line 36
    invoke-direct {v1, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 40
    .line 41
    const-string v1, "window"

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Landroid/view/WindowManager;

    .line 48
    .line 49
    iput-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᲇᲈᛵᛷ:Landroid/view/WindowManager;

    .line 50
    .line 51
    new-instance v1, Landroid/view/WindowManager$LayoutParams;

    .line 52
    .line 53
    invoke-direct {v1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛴᛳᛲ:Landroid/view/WindowManager$LayoutParams;

    .line 57
    .line 58
    const/4 v2, -0x2

    .line 59
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 60
    .line 61
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 62
    .line 63
    const/4 v2, -0x3

    .line 64
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 65
    .line 66
    const v2, 0x1030004

    .line 67
    .line 68
    .line 69
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iput-object v2, v1, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛴᛳᛲ:Landroid/view/WindowManager$LayoutParams;

    .line 78
    .line 79
    const/16 v2, 0x28

    .line 80
    .line 81
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 82
    .line 83
    sget-object v1, Lyyds/ᛵᲇᛵᲀ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 84
    .line 85
    const-class v1, Lyyds/ᛵᲇᛵᲀ;

    .line 86
    .line 87
    monitor-enter v1

    .line 88
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, Lyyds/ᛴᛸᛵᲈ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    if-nez v2, :cond_0

    .line 95
    .line 96
    monitor-exit v1

    .line 97
    goto :goto_0

    .line 98
    :cond_0
    :try_start_1
    sget-object v2, Lyyds/ᛵᲇᛵᲀ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    .line 102
    .line 103
    monitor-exit v1

    .line 104
    :goto_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    iget v3, v2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 121
    .line 122
    and-int/lit16 v3, v3, 0x400

    .line 123
    .line 124
    if-nez v3, :cond_1

    .line 125
    .line 126
    invoke-virtual {v1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    and-int/lit8 v3, v3, 0x4

    .line 131
    .line 132
    if-eqz v3, :cond_2

    .line 133
    .line 134
    :cond_1
    iget-object v3, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛴᛳᛲ:Landroid/view/WindowManager$LayoutParams;

    .line 135
    .line 136
    iget v4, v3, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 137
    .line 138
    or-int/lit16 v4, v4, 0x400

    .line 139
    .line 140
    iput v4, v3, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 141
    .line 142
    invoke-virtual {p0}, Lyyds/ᛴᛸᛵᲈ;->ᛵᛸᛸᛷ()V

    .line 143
    .line 144
    .line 145
    :cond_2
    iget v3, v2, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    .line 146
    .line 147
    iget-object v4, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛴᛳᛲ:Landroid/view/WindowManager$LayoutParams;

    .line 148
    .line 149
    iput v3, v4, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    .line 150
    .line 151
    invoke-virtual {p0}, Lyyds/ᛴᛸᛵᲈ;->ᛵᛸᛸᛷ()V

    .line 152
    .line 153
    .line 154
    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->systemUiVisibility:I

    .line 155
    .line 156
    if-eqz v2, :cond_3

    .line 157
    .line 158
    iget-object v3, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛴᛳᛲ:Landroid/view/WindowManager$LayoutParams;

    .line 159
    .line 160
    iput v2, v3, Landroid/view/WindowManager$LayoutParams;->systemUiVisibility:I

    .line 161
    .line 162
    invoke-virtual {p0}, Lyyds/ᛴᛸᛵᲈ;->ᛵᛸᛸᛷ()V

    .line 163
    .line 164
    .line 165
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_4

    .line 170
    .line 171
    iget-object v2, p0, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 172
    .line 173
    invoke-virtual {v1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    invoke-virtual {v2, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 178
    .line 179
    .line 180
    :cond_4
    new-instance v1, Lyyds/ᛲᲇᲁᛲ;

    .line 181
    .line 182
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 183
    .line 184
    .line 185
    iput-object p1, v1, Lyyds/ᛲᲇᲁᛲ;->ᛲᲈᲁ:Landroid/app/Activity;

    .line 186
    .line 187
    iput-object v0, v1, Lyyds/ᛲᲇᲁᛲ;->ᛵᛸᛸᛷ:Ljava/lang/ref/WeakReference;

    .line 188
    .line 189
    iput-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛱᲈᲁ:Lyyds/ᛲᲇᲁᛲ;

    .line 190
    .line 191
    invoke-virtual {p1, v1}, Landroid/app/Activity;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :catchall_0
    move-exception p0

    .line 196
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 197
    throw p0
.end method


# virtual methods
.method public final ᛱᲈᲁ(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛴᛳᛲ:Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    const/16 v1, 0x33

    .line 4
    .line 5
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 6
    .line 7
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 8
    .line 9
    iput p2, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 10
    .line 11
    invoke-virtual {p0}, Lyyds/ᛴᛸᛵᲈ;->ᛵᛸᛸᛷ()V

    .line 12
    .line 13
    .line 14
    new-instance p1, Lyyds/ᛱᲇᲀᛶ;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p0, p2}, Lyyds/ᛱᲇᲀᛶ;-><init>(Lyyds/ᛴᛸᛵᲈ;I)V

    .line 18
    .line 19
    .line 20
    sget-object p2, Lyyds/ᲀᲁᲀᛱ;->ᛲᲈᲁ:Landroid/os/Handler;

    .line 21
    .line 22
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    sget-object p2, Lyyds/ᲀᲁᲀᛱ;->ᛲᲈᲁ:Landroid/os/Handler;

    .line 27
    .line 28
    iget-object p0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛷᛵᲇᲀ:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {p2, p1, p0, v0, v1}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final ᛲᛳᛶᲁ()V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_7

    .line 11
    .line 12
    iget-boolean v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲇᲇᲇᛱ:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lyyds/ᛴᛸᛵᲈ;->ᛷᲈᲈᲁ()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛵᛸᛸᛷ:Landroid/app/Activity;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_6

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    :try_start_0
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 40
    .line 41
    .line 42
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    iget-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᲇᲈᛵᛷ:Landroid/view/WindowManager;

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    :try_start_1
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 48
    .line 49
    invoke-interface {v1, v0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 50
    .line 51
    .line 52
    :cond_3
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 53
    .line 54
    iget-object v2, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛴᛳᛲ:Landroid/view/WindowManager$LayoutParams;

    .line 55
    .line 56
    invoke-interface {v1, v0, v2}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 57
    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    iput-boolean v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲇᲇᲇᛱ:Z

    .line 61
    .line 62
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛳᛶᲁ:Lyyds/ᛳᛴᛲᲀ;

    .line 63
    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    iput-object p0, v0, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᛵᲈ;

    .line 67
    .line 68
    iget-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 69
    .line 70
    iput-object v1, v0, Lyyds/ᛳᛴᛲᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛵ;

    .line 71
    .line 72
    if-nez v1, :cond_4

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    invoke-virtual {v1, v0}, Lyyds/ᛳᲀᛵᛵ;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 76
    .line 77
    .line 78
    iget-object v1, v0, Lyyds/ᛳᛴᛲᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛵ;

    .line 79
    .line 80
    new-instance v2, Lyyds/ᛲᛳᛵᛱ;

    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    invoke-direct {v2, v3, v0}, Lyyds/ᛲᛳᛵᛱ;-><init>(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 87
    .line 88
    .line 89
    :cond_5
    :goto_0
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛵᛵᛵᛲ;

    .line 90
    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    invoke-interface {v0, p0}, Lyyds/ᛵᛵᛵᛲ;->ᲇᲈᛵᛷ(Lyyds/ᛴᛸᛵᲈ;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 94
    .line 95
    .line 96
    :cond_6
    :goto_1
    return-void

    .line 97
    :catch_0
    move-exception p0

    .line 98
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_7
    const-string p0, "WindowParams and view cannot be empty"

    .line 103
    .line 104
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final ᛲᛴᛳᛲ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛴᛳᛲ:Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 6
    .line 7
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 8
    .line 9
    and-int/lit8 v1, v1, -0x9

    .line 10
    .line 11
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 12
    .line 13
    invoke-virtual {p0}, Lyyds/ᛴᛸᛵᲈ;->ᛵᛸᛸᛷ()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lyyds/ᛴᛸᛵᲈ;->ᛵᛸᛸᛷ()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final ᛲᲈᲁ()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲇᲇᲇᛱ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    :try_start_0
    iget-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᲇᲈᛵᛷ:Landroid/view/WindowManager;

    .line 8
    .line 9
    iget-object v2, p0, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 10
    .line 11
    invoke-interface {v1, v2}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛵᛵᛵᛲ;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Lyyds/ᛵᛵᛵᛲ;->ᛲᲈᲁ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    goto :goto_2

    .line 24
    :catch_0
    move-exception v1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    iput-boolean v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲇᲇᲇᛱ:Z

    .line 27
    .line 28
    return-void

    .line 29
    :goto_1
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    .line 32
    iput-boolean v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲇᲇᲇᛱ:Z

    .line 33
    .line 34
    return-void

    .line 35
    :goto_2
    iput-boolean v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲇᲇᲇᛱ:Z

    .line 36
    .line 37
    throw v1
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲇᲇᲇᛱ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-object v0, Lyyds/ᲀᲁᲀᛱ;->ᛲᲈᲁ:Landroid/os/Handler;

    .line 7
    .line 8
    iget-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛲᲈᲈ:Lyyds/ᛱᲇᲀᛶ;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛷᛵᲇᲀ:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-virtual {v0, v1, p0, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final ᛶᛷᛲᲁ(Lyyds/ᛳᛴᛲᲀ;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛳᛶᲁ:Lyyds/ᛳᛴᛲᲀ;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛴᛳᛲ:Landroid/view/WindowManager$LayoutParams;

    .line 4
    .line 5
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 6
    .line 7
    and-int/lit8 v1, v1, -0x11

    .line 8
    .line 9
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 10
    .line 11
    invoke-virtual {p0}, Lyyds/ᛴᛸᛵᲈ;->ᛵᛸᛸᛷ()V

    .line 12
    .line 13
    .line 14
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 15
    .line 16
    and-int/lit16 v1, v1, -0x201

    .line 17
    .line 18
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 19
    .line 20
    invoke-virtual {p0}, Lyyds/ᛴᛸᛵᲈ;->ᛵᛸᛸᛷ()V

    .line 21
    .line 22
    .line 23
    iget-boolean v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲇᲇᲇᛱ:Z

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Lyyds/ᛴᛸᛵᲈ;->ᛷᲈᲈᲁ()V

    .line 28
    .line 29
    .line 30
    iput-object p0, p1, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᛵᲈ;

    .line 31
    .line 32
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 33
    .line 34
    iput-object v0, p1, Lyyds/ᛳᛴᛲᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛵ;

    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0, p1}, Lyyds/ᛳᲀᛵᛵ;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p1, Lyyds/ᛳᛴᛲᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛵ;

    .line 43
    .line 44
    new-instance v1, Lyyds/ᛲᛳᛵᛱ;

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-direct {v1, v2, p1}, Lyyds/ᛲᛳᛵᛱ;-><init>(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 51
    .line 52
    .line 53
    :cond_1
    :goto_0
    iget-object p1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛵᛸᛸᛷ:Landroid/app/Activity;

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    move-object p1, v0

    .line 64
    :goto_1
    if-eqz p1, :cond_3

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :cond_3
    if-eqz v0, :cond_7

    .line 71
    .line 72
    iget-object p1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛷᛲᲈᛱ:Lyyds/ᛴᲁᛴᲈ;

    .line 73
    .line 74
    if-nez p1, :cond_4

    .line 75
    .line 76
    new-instance p1, Lyyds/ᛴᲁᛴᲈ;

    .line 77
    .line 78
    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 79
    .line 80
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    iput v0, p1, Lyyds/ᛴᲁᛴᲈ;->ᲀᛲᛳᲀ:I

    .line 84
    .line 85
    iput-object p1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛷᛲᲈᛱ:Lyyds/ᛴᲁᛴᲈ;

    .line 86
    .line 87
    :cond_4
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛵᛸᛸᛷ:Landroid/app/Activity;

    .line 88
    .line 89
    if-nez v0, :cond_5

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-eqz v0, :cond_6

    .line 97
    .line 98
    invoke-virtual {v0, p1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 99
    .line 100
    .line 101
    :cond_6
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 102
    .line 103
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iput-object v0, p1, Lyyds/ᛴᲁᛴᲈ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 107
    .line 108
    :cond_7
    :goto_2
    return-void
.end method

.method public final ᛷᲈᲈᲁ()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲇᲇᲇᛱ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲇᲈᛵᛷ:Landroid/view/WindowManager;

    .line 7
    .line 8
    iget-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛴᛳᛲ:Landroid/view/WindowManager$LayoutParams;

    .line 11
    .line 12
    invoke-interface {v0, v1, p0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catch_0
    move-exception p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final ᲀᛲᛳᲀ()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛷᛵᲇᲀ:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲀᲁᲀᛱ;->ᛲᲈᲁ:Landroid/os/Handler;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲇᲇᲇᛱ:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lyyds/ᛴᛸᛵᲈ;->ᛲᲈᲁ()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛷᛲᲈᛱ:Lyyds/ᛴᲁᛴᲈ;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_4

    .line 19
    .line 20
    iget-object v2, p0, Lyyds/ᛴᛸᛵᲈ;->ᛵᛸᛸᛷ:Landroid/app/Activity;

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    iget-object v2, v0, Lyyds/ᛴᲁᛴᲈ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->clear()V

    .line 39
    .line 40
    .line 41
    :cond_3
    iput-object v1, v0, Lyyds/ᛴᲁᛴᲈ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 42
    .line 43
    :goto_0
    iput-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛷᛲᲈᛱ:Lyyds/ᛴᲁᛴᲈ;

    .line 44
    .line 45
    :cond_4
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛵᛵᛵᛲ;

    .line 46
    .line 47
    if-eqz v0, :cond_5

    .line 48
    .line 49
    invoke-interface {v0}, Lyyds/ᛵᛵᛵᛲ;->ᛶᛷᛲᲁ()V

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛵᛵᛵᛲ;

    .line 53
    .line 54
    :cond_5
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛱᲈᲁ:Lyyds/ᛲᲇᲁᛲ;

    .line 55
    .line 56
    if-eqz v0, :cond_7

    .line 57
    .line 58
    iget-object v2, v0, Lyyds/ᛲᲇᲁᛲ;->ᛲᲈᲁ:Landroid/app/Activity;

    .line 59
    .line 60
    if-nez v2, :cond_6

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_6
    invoke-virtual {v2, v0}, Landroid/app/Activity;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 64
    .line 65
    .line 66
    :goto_1
    iput-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛱᲈᲁ:Lyyds/ᛲᲇᲁᛲ;

    .line 67
    .line 68
    :cond_7
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛳᛶᲁ:Lyyds/ᛳᛴᛲᲀ;

    .line 69
    .line 70
    if-eqz v0, :cond_9

    .line 71
    .line 72
    iput-object v1, v0, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᛵᲈ;

    .line 73
    .line 74
    iget-object v2, v0, Lyyds/ᛳᛴᛲᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛵ;

    .line 75
    .line 76
    if-eqz v2, :cond_8

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Lyyds/ᛳᲀᛵᛵ;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 79
    .line 80
    .line 81
    iput-object v1, v0, Lyyds/ᛳᛴᛲᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛵ;

    .line 82
    .line 83
    :cond_8
    iput-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛳᛶᲁ:Lyyds/ᛳᛴᛲᲀ;

    .line 84
    .line 85
    :cond_9
    iput-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛵᛸᛸᛷ:Landroid/app/Activity;

    .line 86
    .line 87
    iput-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 88
    .line 89
    iget-object p0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 90
    .line 91
    sget-object v0, Lyyds/ᛵᲇᛵᲀ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 92
    .line 93
    const-class v0, Lyyds/ᛵᲇᛵᲀ;

    .line 94
    .line 95
    monitor-enter v0

    .line 96
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->clear()V

    .line 97
    .line 98
    .line 99
    sget-object v1, Lyyds/ᛵᲇᛵᲀ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    .line 103
    .line 104
    monitor-exit v0

    .line 105
    return-void

    .line 106
    :catchall_0
    move-exception p0

    .line 107
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    throw p0
.end method

.method public final ᲇᲇᲇᛱ()V
    .locals 2

    .line 1
    const v0, 0x1030003

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛴᛳᛲ:Landroid/view/WindowManager$LayoutParams;

    .line 5
    .line 6
    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᛴᛸᛵᲈ;->ᛵᛸᛸᛷ()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final ᲇᲈᛵᛷ(Landroid/view/ViewGroup;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    move-object v0, p1

    .line 31
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 35
    .line 36
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 37
    .line 38
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 39
    .line 40
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 41
    .line 42
    :cond_2
    iget-object v0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛴᛳᛲ:Landroid/view/WindowManager$LayoutParams;

    .line 43
    .line 44
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 45
    .line 46
    if-nez v1, :cond_5

    .line 47
    .line 48
    instance-of v2, p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 49
    .line 50
    const/4 v3, -0x1

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    move-object v2, p1

    .line 54
    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 55
    .line 56
    iget v2, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 57
    .line 58
    if-eq v2, v3, :cond_4

    .line 59
    .line 60
    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    instance-of v2, p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 64
    .line 65
    if-eqz v2, :cond_4

    .line 66
    .line 67
    move-object v2, p1

    .line 68
    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 69
    .line 70
    iget v2, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 71
    .line 72
    if-eq v2, v3, :cond_4

    .line 73
    .line 74
    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 75
    .line 76
    :goto_0
    move v1, v2

    .line 77
    :cond_4
    if-nez v1, :cond_5

    .line 78
    .line 79
    const/16 v1, 0x11

    .line 80
    .line 81
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 82
    .line 83
    :cond_5
    if-eqz p1, :cond_7

    .line 84
    .line 85
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 86
    .line 87
    const/4 v2, -0x2

    .line 88
    if-ne v1, v2, :cond_6

    .line 89
    .line 90
    iget v3, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 91
    .line 92
    if-ne v3, v2, :cond_6

    .line 93
    .line 94
    iget v1, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 95
    .line 96
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 97
    .line 98
    iget p1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 99
    .line 100
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_6
    iput v1, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 104
    .line 105
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 106
    .line 107
    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 108
    .line 109
    :cond_7
    :goto_1
    invoke-virtual {p0}, Lyyds/ᛴᛸᛵᲈ;->ᛵᛸᛸᛷ()V

    .line 110
    .line 111
    .line 112
    return-void
.end method
