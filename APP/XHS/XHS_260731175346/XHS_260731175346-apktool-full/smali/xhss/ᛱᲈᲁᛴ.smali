.class public final Lxhss/ᛱᲈᲁᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛸᛴᛶᛳ:Lxhss/ᛴᛵᛵᛶ;

.field public static ᲀᲇᛳᲁ:Lxhss/ᛱᲈᲁᛴ;

.field public static final ᲇᛶᛴᲀ:Landroid/graphics/PorterDuff$Mode;


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/util/WeakHashMap;

.field public ᛳᲁᲇᛸ:Landroid/util/TypedValue;

.field public ᛷᛴᛷᛱ:Lxhss/ᛳᛲᲀᲈ;

.field public ᛷᛵᛵᲈ:Ljava/util/WeakHashMap;

.field public ᲇᛴᲇᛵ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    sput-object v0, Lxhss/ᛱᲈᲁᛴ;->ᲇᛶᛴᲀ:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    new-instance v0, Lxhss/ᛴᛵᛵᛶ;

    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    invoke-direct {v0, v1}, Lxhss/ᲇᲀᲈᛲ;-><init>(I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lxhss/ᛱᲈᲁᛴ;->ᛸᛴᛶᛳ:Lxhss/ᛴᛵᛵᛶ;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lxhss/ᛱᲈᲁᛴ;->ᛱᛱᛲᲇ:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    return-void
.end method

.method public static declared-synchronized ᛳᲁᲇᛸ()Lxhss/ᛱᲈᲁᛴ;
    .locals 2

    .line 1
    const-class v0, Lxhss/ᛱᲈᲁᛴ;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lxhss/ᛱᲈᲁᛴ;->ᲀᲇᛳᲁ:Lxhss/ᛱᲈᲁᛴ;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lxhss/ᛱᲈᲁᛴ;

    .line 9
    .line 10
    invoke-direct {v1}, Lxhss/ᛱᲈᲁᛴ;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lxhss/ᛱᲈᲁᛴ;->ᲀᲇᛳᲁ:Lxhss/ᛱᲈᲁᛴ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v1
.end method

.method public static ᛸᛲᲀᛵ(Landroid/graphics/drawable/Drawable;Lxhss/ᛵᛳᛱᲇ;[I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v1, p0, :cond_7

    .line 10
    .line 11
    instance-of v1, p0, Landroid/graphics/drawable/LayerDrawable;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    new-array v1, v2, [I

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-boolean v0, p1, Lxhss/ᛵᛳᛱᲇ;->ᛱᛱᛲᲇ:Z

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    iget-boolean v1, p1, Lxhss/ᛵᛳᛱᲇ;->ᛷᛵᛵᲈ:Z

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    :goto_0
    const/4 v1, 0x0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    iget-object v0, p1, Lxhss/ᛵᛳᛱᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Landroid/content/res/ColorStateList;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    move-object v0, v1

    .line 52
    :goto_1
    iget-boolean v3, p1, Lxhss/ᛵᛳᛱᲇ;->ᛷᛵᛵᲈ:Z

    .line 53
    .line 54
    if-eqz v3, :cond_4

    .line 55
    .line 56
    iget-object p1, p1, Lxhss/ᛵᛳᛱᲇ;->ᲇᛴᲇᛵ:Ljava/io/Serializable;

    .line 57
    .line 58
    check-cast p1, Landroid/graphics/PorterDuff$Mode;

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    sget-object p1, Lxhss/ᛱᲈᲁᛴ;->ᲇᛶᛴᲀ:Landroid/graphics/PorterDuff$Mode;

    .line 62
    .line 63
    :goto_2
    if-eqz v0, :cond_6

    .line 64
    .line 65
    if-nez p1, :cond_5

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_5
    invoke-virtual {v0, p2, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    invoke-static {p2, p1}, Lxhss/ᛱᲈᲁᛴ;->ᲇᛶᛴᲀ(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :cond_6
    :goto_3
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 77
    .line 78
    .line 79
    :cond_7
    return-void
.end method

.method public static declared-synchronized ᲇᛶᛴᲀ(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 4

    .line 1
    const-class v0, Lxhss/ᛱᲈᲁᛴ;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lxhss/ᛱᲈᲁᛴ;->ᛸᛴᛶᛳ:Lxhss/ᛴᛵᛵᛶ;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/16 v2, 0x1f

    .line 10
    .line 11
    add-int v3, v2, p0

    .line 12
    .line 13
    mul-int/2addr v3, v2

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v3

    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Lxhss/ᲇᲀᲈᛲ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Landroid/graphics/PorterDuffColorFilter;

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    .line 32
    .line 33
    invoke-direct {v2, p0, p1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v3

    .line 41
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v1, p0, v2}, Lxhss/ᲇᲀᲈᛲ;->ᛱᛱᛲᲇ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Landroid/graphics/PorterDuffColorFilter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    :goto_0
    monitor-exit v0

    .line 55
    return-object v2

    .line 56
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    throw p0
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 11

    .line 1
    iget-object v0, p0, Lxhss/ᛱᲈᲁᛴ;->ᛳᲁᲇᛸ:Landroid/util/TypedValue;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/util/TypedValue;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lxhss/ᛱᲈᲁᛴ;->ᛳᲁᲇᛸ:Landroid/util/TypedValue;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {v1, p2, v0, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 18
    .line 19
    .line 20
    iget v1, v0, Landroid/util/TypedValue;->assetCookie:I

    .line 21
    .line 22
    int-to-long v3, v1

    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    shl-long/2addr v3, v1

    .line 26
    iget v5, v0, Landroid/util/TypedValue;->data:I

    .line 27
    .line 28
    int-to-long v5, v5

    .line 29
    or-long/2addr v3, v5

    .line 30
    monitor-enter p0

    .line 31
    :try_start_0
    iget-object v5, p0, Lxhss/ᛱᲈᲁᛴ;->ᛱᛱᛲᲇ:Ljava/util/WeakHashMap;

    .line 32
    .line 33
    invoke-virtual {v5, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, Lxhss/ᛲᛵᛶᲈ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    if-nez v5, :cond_1

    .line 41
    .line 42
    monitor-exit p0

    .line 43
    :goto_0
    move-object v5, v6

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    :try_start_1
    iget-object v7, v5, Lxhss/ᛲᛵᛶᲈ;->ᛳᲁᲇᛸ:[J

    .line 46
    .line 47
    iget v8, v5, Lxhss/ᛲᛵᛶᲈ;->ᛷᛴᛷᛱ:I

    .line 48
    .line 49
    invoke-static {v7, v8, v3, v4}, Lxhss/ᛵᛵᛲᲈ;->ᛱᛱᛲᲇ([JIJ)I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-ltz v7, :cond_2

    .line 54
    .line 55
    iget-object v8, v5, Lxhss/ᛲᛵᛶᲈ;->ᲇᛴᲇᛵ:[Ljava/lang/Object;

    .line 56
    .line 57
    aget-object v7, v8, v7

    .line 58
    .line 59
    sget-object v8, Lxhss/ᛷᛸᲀᲀ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 60
    .line 61
    if-ne v7, v8, :cond_3

    .line 62
    .line 63
    :cond_2
    move-object v7, v6

    .line 64
    :cond_3
    check-cast v7, Ljava/lang/ref/WeakReference;

    .line 65
    .line 66
    if-eqz v7, :cond_5

    .line 67
    .line 68
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    check-cast v7, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 73
    .line 74
    if-eqz v7, :cond_4

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v7, v5}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 81
    .line 82
    .line 83
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    monitor-exit p0

    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception p1

    .line 87
    goto/16 :goto_7

    .line 88
    .line 89
    :cond_4
    :try_start_2
    iget-object v7, v5, Lxhss/ᛲᛵᛶᲈ;->ᛳᲁᲇᛸ:[J

    .line 90
    .line 91
    iget v8, v5, Lxhss/ᛲᛵᛶᲈ;->ᛷᛴᛷᛱ:I

    .line 92
    .line 93
    invoke-static {v7, v8, v3, v4}, Lxhss/ᛵᛵᛲᲈ;->ᛱᛱᛲᲇ([JIJ)I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    if-ltz v7, :cond_5

    .line 98
    .line 99
    iget-object v8, v5, Lxhss/ᛲᛵᛶᲈ;->ᲇᛴᲇᛵ:[Ljava/lang/Object;

    .line 100
    .line 101
    aget-object v9, v8, v7

    .line 102
    .line 103
    sget-object v10, Lxhss/ᛷᛸᲀᲀ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 104
    .line 105
    if-eq v9, v10, :cond_5

    .line 106
    .line 107
    aput-object v10, v8, v7

    .line 108
    .line 109
    iput-boolean v2, v5, Lxhss/ᛲᛵᛶᲈ;->ᛱᛱᛲᲇ:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 110
    .line 111
    :cond_5
    monitor-exit p0

    .line 112
    goto :goto_0

    .line 113
    :goto_1
    if-eqz v5, :cond_6

    .line 114
    .line 115
    return-object v5

    .line 116
    :cond_6
    iget-object v5, p0, Lxhss/ᛱᲈᲁᛴ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛲᲀᲈ;

    .line 117
    .line 118
    if-nez v5, :cond_7

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_7
    const v5, 0x64070011

    .line 122
    .line 123
    .line 124
    if-ne p2, v5, :cond_8

    .line 125
    .line 126
    new-instance v6, Landroid/graphics/drawable/LayerDrawable;

    .line 127
    .line 128
    const p2, 0x64070010

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, p1, p2}, Lxhss/ᛱᲈᲁᛴ;->ᲇᛴᲇᛵ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    const v5, 0x64070012

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, p1, v5}, Lxhss/ᛱᲈᲁᛴ;->ᲇᛴᲇᛵ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    filled-new-array {p2, v5}, [Landroid/graphics/drawable/Drawable;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-direct {v6, p2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_8
    const v5, 0x64070034

    .line 151
    .line 152
    .line 153
    if-ne p2, v5, :cond_9

    .line 154
    .line 155
    const p2, 0x6406003b

    .line 156
    .line 157
    .line 158
    invoke-static {p0, p1, p2}, Lxhss/ᛳᛲᲀᲈ;->ᛳᲁᲇᛸ(Lxhss/ᛱᲈᲁᛴ;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    goto :goto_2

    .line 163
    :cond_9
    const v5, 0x64070033

    .line 164
    .line 165
    .line 166
    if-ne p2, v5, :cond_a

    .line 167
    .line 168
    const p2, 0x6406003c

    .line 169
    .line 170
    .line 171
    invoke-static {p0, p1, p2}, Lxhss/ᛳᛲᲀᲈ;->ᛳᲁᲇᛸ(Lxhss/ᛱᲈᲁᛴ;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    goto :goto_2

    .line 176
    :cond_a
    const v5, 0x64070035

    .line 177
    .line 178
    .line 179
    if-ne p2, v5, :cond_b

    .line 180
    .line 181
    const p2, 0x6406003d

    .line 182
    .line 183
    .line 184
    invoke-static {p0, p1, p2}, Lxhss/ᛳᛲᲀᲈ;->ᛳᲁᲇᛸ(Lxhss/ᛱᲈᲁᛴ;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    :cond_b
    :goto_2
    if-eqz v6, :cond_10

    .line 189
    .line 190
    iget p2, v0, Landroid/util/TypedValue;->changingConfigurations:I

    .line 191
    .line 192
    invoke-virtual {v6, p2}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    .line 193
    .line 194
    .line 195
    monitor-enter p0

    .line 196
    :try_start_3
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    if-eqz p2, :cond_f

    .line 201
    .line 202
    iget-object v0, p0, Lxhss/ᛱᲈᲁᛴ;->ᛱᛱᛲᲇ:Ljava/util/WeakHashMap;

    .line 203
    .line 204
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, Lxhss/ᛲᛵᛶᲈ;

    .line 209
    .line 210
    if-nez v0, :cond_e

    .line 211
    .line 212
    new-instance v0, Lxhss/ᛲᛵᛶᲈ;

    .line 213
    .line 214
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 215
    .line 216
    .line 217
    const/4 v5, 0x4

    .line 218
    :goto_3
    const/16 v7, 0x50

    .line 219
    .line 220
    if-ge v5, v1, :cond_d

    .line 221
    .line 222
    shl-int v8, v2, v5

    .line 223
    .line 224
    add-int/lit8 v8, v8, -0xc

    .line 225
    .line 226
    if-gt v7, v8, :cond_c

    .line 227
    .line 228
    move v7, v8

    .line 229
    goto :goto_4

    .line 230
    :cond_c
    add-int/lit8 v5, v5, 0x1

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_d
    :goto_4
    div-int/lit8 v7, v7, 0x8

    .line 234
    .line 235
    new-array v1, v7, [J

    .line 236
    .line 237
    iput-object v1, v0, Lxhss/ᛲᛵᛶᲈ;->ᛳᲁᲇᛸ:[J

    .line 238
    .line 239
    new-array v1, v7, [Ljava/lang/Object;

    .line 240
    .line 241
    iput-object v1, v0, Lxhss/ᛲᛵᛶᲈ;->ᲇᛴᲇᛵ:[Ljava/lang/Object;

    .line 242
    .line 243
    iget-object v1, p0, Lxhss/ᛱᲈᲁᛴ;->ᛱᛱᛲᲇ:Ljava/util/WeakHashMap;

    .line 244
    .line 245
    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    goto :goto_5

    .line 249
    :catchall_1
    move-exception p1

    .line 250
    goto :goto_6

    .line 251
    :cond_e
    :goto_5
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 252
    .line 253
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v3, v4, p1}, Lxhss/ᛲᛵᛶᲈ;->ᛷᛵᛵᲈ(JLjava/lang/ref/WeakReference;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 257
    .line 258
    .line 259
    monitor-exit p0

    .line 260
    return-object v6

    .line 261
    :cond_f
    monitor-exit p0

    .line 262
    return-object v6

    .line 263
    :goto_6
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 264
    throw p1

    .line 265
    :cond_10
    return-object v6

    .line 266
    :goto_7
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 267
    throw p1
.end method

.method public final declared-synchronized ᛷᛴᛷᛱ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lxhss/ᛱᲈᲁᛴ;->ᲇᛴᲇᛵ:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lxhss/ᛱᲈᲁᛴ;->ᲇᛴᲇᛵ:Z

    .line 9
    .line 10
    const v0, 0x6407004f

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, v0}, Lxhss/ᛱᲈᲁᛴ;->ᲇᛴᲇᛵ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_6

    .line 18
    .line 19
    const-string v1, "android.graphics.drawable.VectorDrawable"

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_6

    .line 34
    .line 35
    :goto_0
    invoke-virtual {p0, p1, p2}, Lxhss/ᛱᲈᲁᛴ;->ᛱᛱᛲᲇ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_4

    .line 48
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2, v0}, Lxhss/ᛱᲈᲁᛴ;->ᛸᛴᛶᛳ(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :cond_2
    if-eqz v0, :cond_5

    .line 55
    .line 56
    sget-object p1, Lxhss/ᛴᛵᛵᲈ;->ᛷᛵᛵᲈ:[I

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 67
    .line 68
    const/16 v1, 0x1f

    .line 69
    .line 70
    if-ge p2, v1, :cond_5

    .line 71
    .line 72
    const-string p2, "android.graphics.drawable.ColorStateListDrawable"

    .line 73
    .line 74
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_5

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    array-length p2, p1

    .line 87
    if-nez p2, :cond_3

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    sget-object p2, Lxhss/ᛴᛵᛵᲈ;->ᛱᛱᛲᲇ:[I

    .line 91
    .line 92
    invoke-virtual {v0, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    :goto_2
    sget-object p2, Lxhss/ᛴᛵᛵᲈ;->ᛷᛵᛵᲈ:[I

    .line 97
    .line 98
    invoke-virtual {v0, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 99
    .line 100
    .line 101
    :goto_3
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    .line 103
    .line 104
    :cond_5
    monitor-exit p0

    .line 105
    return-object v0

    .line 106
    :cond_6
    const/4 p1, 0x0

    .line 107
    :try_start_1
    iput-boolean p1, p0, Lxhss/ᛱᲈᲁᛴ;->ᲇᛴᲇᛵ:Z

    .line 108
    .line 109
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    const-string p2, "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."

    .line 112
    .line 113
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p1

    .line 117
    :goto_4
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    throw p1
.end method

.method public final ᛷᛵᛵᲈ(Landroid/content/Context;ILandroid/content/res/ColorStateList;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lxhss/ᛱᲈᲁᛴ;->ᛷᛵᛵᲈ:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/WeakHashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lxhss/ᛱᲈᲁᛴ;->ᛷᛵᛵᲈ:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lxhss/ᛶᛶᛸᛶ;

    .line 17
    .line 18
    const/16 v1, 0x20

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    const/4 v3, 0x1

    .line 22
    if-nez v0, :cond_3

    .line 23
    .line 24
    new-instance v0, Lxhss/ᛶᛶᛸᛶ;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    move v4, v2

    .line 30
    :goto_0
    const/16 v5, 0x28

    .line 31
    .line 32
    if-ge v4, v1, :cond_2

    .line 33
    .line 34
    shl-int v6, v3, v4

    .line 35
    .line 36
    add-int/lit8 v6, v6, -0xc

    .line 37
    .line 38
    if-gt v5, v6, :cond_1

    .line 39
    .line 40
    move v5, v6

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    :goto_1
    div-int/2addr v5, v2

    .line 46
    new-array v4, v5, [I

    .line 47
    .line 48
    iput-object v4, v0, Lxhss/ᛶᛶᛸᛶ;->ᛱᛱᛲᲇ:[I

    .line 49
    .line 50
    new-array v4, v5, [Ljava/lang/Object;

    .line 51
    .line 52
    iput-object v4, v0, Lxhss/ᛶᛶᛸᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 53
    .line 54
    iget-object p0, p0, Lxhss/ᛱᲈᲁᛴ;->ᛷᛵᛵᲈ:Ljava/util/WeakHashMap;

    .line 55
    .line 56
    invoke-virtual {p0, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_3
    iget p0, v0, Lxhss/ᛶᛶᛸᛶ;->ᲇᛴᲇᛵ:I

    .line 60
    .line 61
    if-eqz p0, :cond_a

    .line 62
    .line 63
    iget-object p1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛱᛱᛲᲇ:[I

    .line 64
    .line 65
    add-int/lit8 v4, p0, -0x1

    .line 66
    .line 67
    aget v4, p1, v4

    .line 68
    .line 69
    if-gt p2, v4, :cond_a

    .line 70
    .line 71
    invoke-static {p0, p2, p1}, Lxhss/ᛵᛵᛲᲈ;->ᛷᛵᛵᲈ(II[I)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-ltz p0, :cond_4

    .line 76
    .line 77
    iget-object p1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 78
    .line 79
    aput-object p3, p1, p0

    .line 80
    .line 81
    return-void

    .line 82
    :cond_4
    not-int p0, p0

    .line 83
    iget p1, v0, Lxhss/ᛶᛶᛸᛶ;->ᲇᛴᲇᛵ:I

    .line 84
    .line 85
    if-ge p0, p1, :cond_5

    .line 86
    .line 87
    iget-object v4, v0, Lxhss/ᛶᛶᛸᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 88
    .line 89
    aget-object v5, v4, p0

    .line 90
    .line 91
    sget-object v6, Lxhss/ᲈᲀᲀᛱ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 92
    .line 93
    if-ne v5, v6, :cond_5

    .line 94
    .line 95
    iget-object p1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛱᛱᛲᲇ:[I

    .line 96
    .line 97
    aput p2, p1, p0

    .line 98
    .line 99
    aput-object p3, v4, p0

    .line 100
    .line 101
    return-void

    .line 102
    :cond_5
    iget-object v4, v0, Lxhss/ᛶᛶᛸᛶ;->ᛱᛱᛲᲇ:[I

    .line 103
    .line 104
    array-length v4, v4

    .line 105
    if-lt p1, v4, :cond_8

    .line 106
    .line 107
    add-int/2addr p1, v3

    .line 108
    mul-int/2addr p1, v2

    .line 109
    move v4, v2

    .line 110
    :goto_2
    if-ge v4, v1, :cond_7

    .line 111
    .line 112
    shl-int v5, v3, v4

    .line 113
    .line 114
    add-int/lit8 v5, v5, -0xc

    .line 115
    .line 116
    if-gt p1, v5, :cond_6

    .line 117
    .line 118
    move p1, v5

    .line 119
    goto :goto_3

    .line 120
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_7
    :goto_3
    div-int/2addr p1, v2

    .line 124
    iget-object v1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛱᛱᛲᲇ:[I

    .line 125
    .line 126
    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    iput-object v1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛱᛱᛲᲇ:[I

    .line 131
    .line 132
    iget-object v1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 133
    .line 134
    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iput-object p1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 139
    .line 140
    :cond_8
    iget p1, v0, Lxhss/ᛶᛶᛸᛶ;->ᲇᛴᲇᛵ:I

    .line 141
    .line 142
    sub-int v1, p1, p0

    .line 143
    .line 144
    if-eqz v1, :cond_9

    .line 145
    .line 146
    iget-object v1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛱᛱᛲᲇ:[I

    .line 147
    .line 148
    add-int/lit8 v2, p0, 0x1

    .line 149
    .line 150
    invoke-static {v2, p0, p1, v1, v1}, Lxhss/ᛲᛷᲁᲁ;->ᲇᛸᛳᲁ(III[I[I)V

    .line 151
    .line 152
    .line 153
    iget-object p1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 154
    .line 155
    iget v1, v0, Lxhss/ᛶᛶᛸᛶ;->ᲇᛴᲇᛵ:I

    .line 156
    .line 157
    invoke-static {v2, p0, v1, p1, p1}, Lxhss/ᛲᛷᲁᲁ;->ᛳᲈᲈᛲ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_9
    iget-object p1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛱᛱᛲᲇ:[I

    .line 161
    .line 162
    aput p2, p1, p0

    .line 163
    .line 164
    iget-object p1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 165
    .line 166
    aput-object p3, p1, p0

    .line 167
    .line 168
    iget p0, v0, Lxhss/ᛶᛶᛸᛶ;->ᲇᛴᲇᛵ:I

    .line 169
    .line 170
    add-int/2addr p0, v3

    .line 171
    iput p0, v0, Lxhss/ᛶᛶᛸᛶ;->ᲇᛴᲇᛵ:I

    .line 172
    .line 173
    return-void

    .line 174
    :cond_a
    iget-object p1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛱᛱᛲᲇ:[I

    .line 175
    .line 176
    array-length p1, p1

    .line 177
    if-lt p0, p1, :cond_d

    .line 178
    .line 179
    add-int/lit8 p1, p0, 0x1

    .line 180
    .line 181
    mul-int/2addr p1, v2

    .line 182
    move v4, v2

    .line 183
    :goto_4
    if-ge v4, v1, :cond_c

    .line 184
    .line 185
    shl-int v5, v3, v4

    .line 186
    .line 187
    add-int/lit8 v5, v5, -0xc

    .line 188
    .line 189
    if-gt p1, v5, :cond_b

    .line 190
    .line 191
    move p1, v5

    .line 192
    goto :goto_5

    .line 193
    :cond_b
    add-int/lit8 v4, v4, 0x1

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_c
    :goto_5
    div-int/2addr p1, v2

    .line 197
    iget-object v1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛱᛱᛲᲇ:[I

    .line 198
    .line 199
    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    iput-object v1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛱᛱᛲᲇ:[I

    .line 204
    .line 205
    iget-object v1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 206
    .line 207
    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    iput-object p1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 212
    .line 213
    :cond_d
    iget-object p1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛱᛱᛲᲇ:[I

    .line 214
    .line 215
    aput p2, p1, p0

    .line 216
    .line 217
    iget-object p1, v0, Lxhss/ᛶᛶᛸᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 218
    .line 219
    aput-object p3, p1, p0

    .line 220
    .line 221
    add-int/2addr p0, v3

    .line 222
    iput p0, v0, Lxhss/ᛶᛶᛸᛶ;->ᲇᛴᲇᛵ:I

    .line 223
    .line 224
    return-void
.end method

.method public final ᛸᛴᛶᛳ(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Lxhss/ᛱᲈᲁᛴ;->ᲀᲇᛳᲁ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lxhss/ᛱᲈᲁᛴ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛲᲀᲈ;

    .line 15
    .line 16
    const/4 p3, 0x0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const p0, 0x64070042

    .line 21
    .line 22
    .line 23
    if-ne p2, p0, :cond_1

    .line 24
    .line 25
    sget-object p3, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 26
    .line 27
    :cond_1
    :goto_0
    if-eqz p3, :cond_2

    .line 28
    .line 29
    invoke-virtual {p1, p3}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-object p1

    .line 33
    :cond_3
    iget-object v0, p0, Lxhss/ᛱᲈᲁᛴ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛲᲀᲈ;

    .line 34
    .line 35
    const v1, 0x64030058

    .line 36
    .line 37
    .line 38
    const v2, 0x64030056

    .line 39
    .line 40
    .line 41
    if-eqz v0, :cond_6

    .line 42
    .line 43
    const v0, 0x6407003d

    .line 44
    .line 45
    .line 46
    const v3, 0x102000d

    .line 47
    .line 48
    .line 49
    const v4, 0x102000f

    .line 50
    .line 51
    .line 52
    const/high16 v5, 0x1020000

    .line 53
    .line 54
    if-ne p2, v0, :cond_4

    .line 55
    .line 56
    move-object p0, p3

    .line 57
    check-cast p0, Landroid/graphics/drawable/LayerDrawable;

    .line 58
    .line 59
    invoke-virtual {p0, v5}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-static {p1, v1}, Lxhss/ᛳᲁᛳᛸ;->ᛳᲁᲇᛸ(Landroid/content/Context;I)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    sget-object v5, Lxhss/ᛲᛳᲈᛲ;->ᛱᛱᛲᲇ:Landroid/graphics/PorterDuff$Mode;

    .line 68
    .line 69
    invoke-static {p2, v0, v5}, Lxhss/ᛳᛲᲀᲈ;->ᲀᲇᛳᲁ(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v4}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-static {p1, v1}, Lxhss/ᛳᲁᛳᛸ;->ᛳᲁᲇᛸ(Landroid/content/Context;I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-static {p2, v0, v5}, Lxhss/ᛳᛲᲀᲈ;->ᲀᲇᛳᲁ(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v3}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p1, v2}, Lxhss/ᛳᲁᛳᛸ;->ᛳᲁᲇᛸ(Landroid/content/Context;I)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-static {p0, p1, v5}, Lxhss/ᛳᛲᲀᲈ;->ᲀᲇᛳᲁ(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 92
    .line 93
    .line 94
    return-object p3

    .line 95
    :cond_4
    const v0, 0x64070034

    .line 96
    .line 97
    .line 98
    if-eq p2, v0, :cond_5

    .line 99
    .line 100
    const v0, 0x64070033

    .line 101
    .line 102
    .line 103
    if-eq p2, v0, :cond_5

    .line 104
    .line 105
    const v0, 0x64070035

    .line 106
    .line 107
    .line 108
    if-ne p2, v0, :cond_6

    .line 109
    .line 110
    :cond_5
    move-object p0, p3

    .line 111
    check-cast p0, Landroid/graphics/drawable/LayerDrawable;

    .line 112
    .line 113
    invoke-virtual {p0, v5}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-static {p1, v1}, Lxhss/ᛳᲁᛳᛸ;->ᛱᛱᛲᲇ(Landroid/content/Context;I)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    sget-object v1, Lxhss/ᛲᛳᲈᛲ;->ᛱᛱᛲᲇ:Landroid/graphics/PorterDuff$Mode;

    .line 122
    .line 123
    invoke-static {p2, v0, v1}, Lxhss/ᛳᛲᲀᲈ;->ᲀᲇᛳᲁ(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v4}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    invoke-static {p1, v2}, Lxhss/ᛳᲁᛳᛸ;->ᛳᲁᲇᛸ(Landroid/content/Context;I)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    invoke-static {p2, v0, v1}, Lxhss/ᛳᛲᲀᲈ;->ᲀᲇᛳᲁ(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v3}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {p1, v2}, Lxhss/ᛳᲁᛳᛸ;->ᛳᲁᲇᛸ(Landroid/content/Context;I)I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    invoke-static {p0, p1, v1}, Lxhss/ᛳᛲᲀᲈ;->ᲀᲇᛳᲁ(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 146
    .line 147
    .line 148
    return-object p3

    .line 149
    :cond_6
    iget-object p0, p0, Lxhss/ᛱᲈᲁᛴ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛲᲀᲈ;

    .line 150
    .line 151
    if-eqz p0, :cond_c

    .line 152
    .line 153
    sget-object v0, Lxhss/ᛲᛳᲈᛲ;->ᛱᛱᛲᲇ:Landroid/graphics/PorterDuff$Mode;

    .line 154
    .line 155
    iget-object v3, p0, Lxhss/ᛳᛲᲀᲈ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v3, [I

    .line 158
    .line 159
    invoke-static {v3, p2}, Lxhss/ᛳᛲᲀᲈ;->ᛷᛵᛵᲈ([II)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    const/4 v4, 0x1

    .line 164
    const/4 v5, -0x1

    .line 165
    if-eqz v3, :cond_7

    .line 166
    .line 167
    :goto_1
    move p0, v5

    .line 168
    goto :goto_2

    .line 169
    :cond_7
    iget-object v1, p0, Lxhss/ᛳᛲᲀᲈ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v1, [I

    .line 172
    .line 173
    invoke-static {v1, p2}, Lxhss/ᛳᛲᲀᲈ;->ᛷᛵᛵᲈ([II)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_8

    .line 178
    .line 179
    move v1, v2

    .line 180
    goto :goto_1

    .line 181
    :cond_8
    iget-object p0, p0, Lxhss/ᛳᛲᲀᲈ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p0, [I

    .line 184
    .line 185
    invoke-static {p0, p2}, Lxhss/ᛳᛲᲀᲈ;->ᛷᛵᛵᲈ([II)Z

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    const v1, 0x1010031

    .line 190
    .line 191
    .line 192
    if-eqz p0, :cond_9

    .line 193
    .line 194
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_9
    const p0, 0x64070026

    .line 198
    .line 199
    .line 200
    if-ne p2, p0, :cond_a

    .line 201
    .line 202
    const p0, 0x42233333    # 40.8f

    .line 203
    .line 204
    .line 205
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    const v1, 0x1010030

    .line 210
    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_a
    const p0, 0x64070014

    .line 214
    .line 215
    .line 216
    if-ne p2, p0, :cond_b

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_b
    const/4 v1, 0x0

    .line 220
    move v4, v1

    .line 221
    goto :goto_1

    .line 222
    :goto_2
    if-eqz v4, :cond_c

    .line 223
    .line 224
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    invoke-static {p1, v1}, Lxhss/ᛳᲁᛳᛸ;->ᛳᲁᲇᛸ(Landroid/content/Context;I)I

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    const-class v1, Lxhss/ᛲᛳᲈᛲ;

    .line 233
    .line 234
    monitor-enter v1

    .line 235
    :try_start_0
    invoke-static {p1, v0}, Lxhss/ᛱᲈᲁᛴ;->ᲇᛶᛴᲀ(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 236
    .line 237
    .line 238
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 239
    monitor-exit v1

    .line 240
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 241
    .line 242
    .line 243
    if-eq p0, v5, :cond_c

    .line 244
    .line 245
    invoke-virtual {p2, p0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 246
    .line 247
    .line 248
    goto :goto_3

    .line 249
    :catchall_0
    move-exception p0

    .line 250
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 251
    throw p0

    .line 252
    :cond_c
    :goto_3
    return-object p3
.end method

.method public final declared-synchronized ᲀᲇᛳᲁ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lxhss/ᛱᲈᲁᛴ;->ᛷᛵᛵᲈ:Ljava/util/WeakHashMap;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lxhss/ᛶᛶᛸᛶ;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-object v2, v0, Lxhss/ᛶᛶᛸᛶ;->ᛱᛱᛲᲇ:[I

    .line 16
    .line 17
    iget v3, v0, Lxhss/ᛶᛶᛸᛶ;->ᲇᛴᲇᛵ:I

    .line 18
    .line 19
    invoke-static {v3, p2, v2}, Lxhss/ᛵᛵᛲᲈ;->ᛷᛵᛵᲈ(II[I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-ltz v2, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, Lxhss/ᛶᛶᛸᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 26
    .line 27
    aget-object v0, v0, v2

    .line 28
    .line 29
    sget-object v2, Lxhss/ᲈᲀᲀᛱ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 30
    .line 31
    if-ne v0, v2, :cond_1

    .line 32
    .line 33
    :cond_0
    move-object v0, v1

    .line 34
    :cond_1
    check-cast v0, Landroid/content/res/ColorStateList;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move-object v0, v1

    .line 38
    :goto_0
    if-nez v0, :cond_5

    .line 39
    .line 40
    iget-object v0, p0, Lxhss/ᛱᲈᲁᛴ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛲᲀᲈ;

    .line 41
    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    invoke-virtual {v0, p1, p2}, Lxhss/ᛳᛲᲀᲈ;->ᲇᛴᲇᛵ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :goto_1
    if-eqz v1, :cond_4

    .line 50
    .line 51
    invoke-virtual {p0, p1, p2, v1}, Lxhss/ᛱᲈᲁᛴ;->ᛷᛵᛵᲈ(Landroid/content/Context;ILandroid/content/res/ColorStateList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_3

    .line 57
    :cond_4
    :goto_2
    move-object v0, v1

    .line 58
    :cond_5
    monitor-exit p0

    .line 59
    return-object v0

    .line 60
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    throw p1
.end method

.method public final declared-synchronized ᲇᛴᲇᛵ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lxhss/ᛱᲈᲁᛴ;->ᛷᛴᛷᛱ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit p0

    .line 7
    return-object p1

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    throw p1
.end method
