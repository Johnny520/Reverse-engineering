.class public final Lyyds/ᛷᛴᲀᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛱᲈᲁ:Lyyds/ᛱᲈᲁᛲ;

.field public static ᛶᛷᛲᲁ:Lyyds/ᛷᛴᲀᲈ;

.field public static final ᲇᲇᲇᛱ:Landroid/graphics/PorterDuff$Mode;


# instance fields
.field public ᛲᛴᛳᛲ:Lyyds/ᛷᛳᲈᛲ;

.field public ᛲᲈᲁ:Ljava/util/WeakHashMap;

.field public final ᛵᛸᛸᛷ:Ljava/util/WeakHashMap;

.field public ᲀᛲᛳᲀ:Landroid/util/TypedValue;

.field public ᲇᲈᛵᛷ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    sput-object v0, Lyyds/ᛷᛴᲀᲈ;->ᲇᲇᲇᛱ:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    new-instance v0, Lyyds/ᛱᲈᲁᛲ;

    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    invoke-direct {v0, v1}, Lyyds/ᛶᛲᛶᛲ;-><init>(I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lyyds/ᛷᛴᲀᲈ;->ᛱᲈᲁ:Lyyds/ᛱᲈᲁᛲ;

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
    iput-object v0, p0, Lyyds/ᛷᛴᲀᲈ;->ᛵᛸᛸᛷ:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    return-void
.end method

.method public static ᛲᛳᛶᲁ(Landroid/graphics/drawable/Drawable;Lyyds/ᲈᲀᛲᛴ;[I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lyyds/ᲀᲈᛸᛸ;->ᛲᲈᲁ:[I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-ne v1, p0, :cond_7

    .line 12
    .line 13
    instance-of v1, p0, Landroid/graphics/drawable/LayerDrawable;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    new-array v1, v2, [I

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-boolean v0, p1, Lyyds/ᲈᲀᛲᛴ;->ᛵᛸᛸᛷ:Z

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    iget-boolean v1, p1, Lyyds/ᲈᲀᛲᛴ;->ᛲᲈᲁ:Z

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    :goto_0
    const/4 v1, 0x0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iget-object v0, p1, Lyyds/ᲈᲀᛲᛴ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Landroid/content/res/ColorStateList;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move-object v0, v1

    .line 54
    :goto_1
    iget-boolean v3, p1, Lyyds/ᲈᲀᛲᛴ;->ᛲᲈᲁ:Z

    .line 55
    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    iget-object p1, p1, Lyyds/ᲈᲀᛲᛴ;->ᲇᲈᛵᛷ:Ljava/io/Serializable;

    .line 59
    .line 60
    check-cast p1, Landroid/graphics/PorterDuff$Mode;

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    sget-object p1, Lyyds/ᛷᛴᲀᲈ;->ᲇᲇᲇᛱ:Landroid/graphics/PorterDuff$Mode;

    .line 64
    .line 65
    :goto_2
    if-eqz v0, :cond_6

    .line 66
    .line 67
    if-nez p1, :cond_5

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_5
    invoke-virtual {v0, p2, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    invoke-static {p2, p1}, Lyyds/ᛷᛴᲀᲈ;->ᲇᲇᲇᛱ(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    :cond_6
    :goto_3
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_7
    const-string p0, "ResourceManagerInternal"

    .line 83
    .line 84
    const-string p1, "Mutated drawable is not the same instance as the input."

    .line 85
    .line 86
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public static declared-synchronized ᲀᛲᛳᲀ()Lyyds/ᛷᛴᲀᲈ;
    .locals 2

    .line 1
    const-class v0, Lyyds/ᛷᛴᲀᲈ;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lyyds/ᛷᛴᲀᲈ;->ᛶᛷᛲᲁ:Lyyds/ᛷᛴᲀᲈ;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lyyds/ᛷᛴᲀᲈ;

    .line 9
    .line 10
    invoke-direct {v1}, Lyyds/ᛷᛴᲀᲈ;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lyyds/ᛷᛴᲀᲈ;->ᛶᛷᛲᲁ:Lyyds/ᛷᛴᲀᲈ;
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

.method public static declared-synchronized ᲇᲇᲇᛱ(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 4

    .line 1
    const-class v0, Lyyds/ᛷᛴᲀᲈ;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lyyds/ᛷᛴᲀᲈ;->ᛱᲈᲁ:Lyyds/ᛱᲈᲁᛲ;

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
    invoke-virtual {v1, v2}, Lyyds/ᛶᛲᛶᛲ;->ᛱᲈᲁ(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {v1, p0, v2}, Lyyds/ᛶᛲᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
.method public final ᛱᲈᲁ(Landroid/content/Context;IZLandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 8

    .line 1
    invoke-virtual {p0, p1, p2}, Lyyds/ᛷᛴᲀᲈ;->ᛶᛷᛲᲁ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    sget-object p1, Lyyds/ᲀᲈᛸᛸ;->ᛲᲈᲁ:[I

    .line 9
    .line 10
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lyyds/ᛷᛴᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛳᲈᛲ;

    .line 18
    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const p0, 0x66080047

    .line 23
    .line 24
    .line 25
    if-ne p2, p0, :cond_1

    .line 26
    .line 27
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 28
    .line 29
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    return-object p1

    .line 35
    :cond_3
    iget-object v0, p0, Lyyds/ᛷᛴᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛳᲈᛲ;

    .line 36
    .line 37
    const v2, 0x660400c5

    .line 38
    .line 39
    .line 40
    const v3, 0x660400c3

    .line 41
    .line 42
    .line 43
    if-eqz v0, :cond_6

    .line 44
    .line 45
    const v0, 0x66080042

    .line 46
    .line 47
    .line 48
    const v4, 0x102000d

    .line 49
    .line 50
    .line 51
    const v5, 0x102000f

    .line 52
    .line 53
    .line 54
    const/high16 v6, 0x1020000

    .line 55
    .line 56
    if-ne p2, v0, :cond_4

    .line 57
    .line 58
    move-object p0, p4

    .line 59
    check-cast p0, Landroid/graphics/drawable/LayerDrawable;

    .line 60
    .line 61
    invoke-virtual {p0, v6}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-static {p1, v2}, Lyyds/ᲁᛶᛲᲁ;->ᲀᛲᛳᲀ(Landroid/content/Context;I)I

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    sget-object v0, Lyyds/ᛷᛴᛸᛱ;->ᛵᛸᛸᛷ:Landroid/graphics/PorterDuff$Mode;

    .line 70
    .line 71
    invoke-static {p2, p3, v0}, Lyyds/ᛷᛳᲈᛲ;->ᛶᛷᛲᲁ(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v5}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-static {p1, v2}, Lyyds/ᲁᛶᛲᲁ;->ᲀᛲᛳᲀ(Landroid/content/Context;I)I

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    invoke-static {p2, p3, v0}, Lyyds/ᛷᛳᲈᛲ;->ᛶᛷᛲᲁ(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v4}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p1, v3}, Lyyds/ᲁᛶᛲᲁ;->ᲀᛲᛳᲀ(Landroid/content/Context;I)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-static {p0, p1, v0}, Lyyds/ᛷᛳᲈᛲ;->ᛶᛷᛲᲁ(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 94
    .line 95
    .line 96
    return-object p4

    .line 97
    :cond_4
    const v0, 0x66080039

    .line 98
    .line 99
    .line 100
    if-eq p2, v0, :cond_5

    .line 101
    .line 102
    const v0, 0x66080038

    .line 103
    .line 104
    .line 105
    if-eq p2, v0, :cond_5

    .line 106
    .line 107
    const v0, 0x6608003a

    .line 108
    .line 109
    .line 110
    if-ne p2, v0, :cond_6

    .line 111
    .line 112
    :cond_5
    move-object p0, p4

    .line 113
    check-cast p0, Landroid/graphics/drawable/LayerDrawable;

    .line 114
    .line 115
    invoke-virtual {p0, v6}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-static {p1, v2}, Lyyds/ᲁᛶᛲᲁ;->ᛵᛸᛸᛷ(Landroid/content/Context;I)I

    .line 120
    .line 121
    .line 122
    move-result p3

    .line 123
    sget-object v0, Lyyds/ᛷᛴᛸᛱ;->ᛵᛸᛸᛷ:Landroid/graphics/PorterDuff$Mode;

    .line 124
    .line 125
    invoke-static {p2, p3, v0}, Lyyds/ᛷᛳᲈᛲ;->ᛶᛷᛲᲁ(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v5}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-static {p1, v3}, Lyyds/ᲁᛶᛲᲁ;->ᲀᛲᛳᲀ(Landroid/content/Context;I)I

    .line 133
    .line 134
    .line 135
    move-result p3

    .line 136
    invoke-static {p2, p3, v0}, Lyyds/ᛷᛳᲈᛲ;->ᛶᛷᛲᲁ(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, v4}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-static {p1, v3}, Lyyds/ᲁᛶᛲᲁ;->ᲀᛲᛳᲀ(Landroid/content/Context;I)I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    invoke-static {p0, p1, v0}, Lyyds/ᛷᛳᲈᛲ;->ᛶᛷᛲᲁ(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 148
    .line 149
    .line 150
    return-object p4

    .line 151
    :cond_6
    iget-object p0, p0, Lyyds/ᛷᛴᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛳᲈᛲ;

    .line 152
    .line 153
    const/4 v0, 0x0

    .line 154
    if-eqz p0, :cond_d

    .line 155
    .line 156
    sget-object v4, Lyyds/ᛷᛴᛸᛱ;->ᛵᛸᛸᛷ:Landroid/graphics/PorterDuff$Mode;

    .line 157
    .line 158
    iget-object v5, p0, Lyyds/ᛷᛳᲈᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v5, [I

    .line 161
    .line 162
    invoke-static {v5, p2}, Lyyds/ᛷᛳᲈᛲ;->ᛲᲈᲁ([II)Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    const/4 v6, 0x1

    .line 167
    const/4 v7, -0x1

    .line 168
    if-eqz v5, :cond_7

    .line 169
    .line 170
    :goto_1
    move p2, v6

    .line 171
    :goto_2
    move p0, v7

    .line 172
    goto :goto_3

    .line 173
    :cond_7
    iget-object v2, p0, Lyyds/ᛷᛳᲈᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v2, [I

    .line 176
    .line 177
    invoke-static {v2, p2}, Lyyds/ᛷᛳᲈᛲ;->ᛲᲈᲁ([II)Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-eqz v2, :cond_8

    .line 182
    .line 183
    move v2, v3

    .line 184
    goto :goto_1

    .line 185
    :cond_8
    iget-object p0, p0, Lyyds/ᛷᛳᲈᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast p0, [I

    .line 188
    .line 189
    invoke-static {p0, p2}, Lyyds/ᛷᛳᲈᛲ;->ᛲᲈᲁ([II)Z

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    const v2, 0x1010031

    .line 194
    .line 195
    .line 196
    if-eqz p0, :cond_9

    .line 197
    .line 198
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_9
    const p0, 0x6608002b

    .line 202
    .line 203
    .line 204
    if-ne p2, p0, :cond_a

    .line 205
    .line 206
    const p0, 0x42233333    # 40.8f

    .line 207
    .line 208
    .line 209
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 210
    .line 211
    .line 212
    move-result p0

    .line 213
    const v2, 0x1010030

    .line 214
    .line 215
    .line 216
    move p2, v6

    .line 217
    goto :goto_3

    .line 218
    :cond_a
    const p0, 0x66080019

    .line 219
    .line 220
    .line 221
    if-ne p2, p0, :cond_b

    .line 222
    .line 223
    goto :goto_1

    .line 224
    :cond_b
    move p2, v0

    .line 225
    move v2, p2

    .line 226
    goto :goto_2

    .line 227
    :goto_3
    if-eqz p2, :cond_d

    .line 228
    .line 229
    sget-object p2, Lyyds/ᲀᲈᛸᛸ;->ᛲᲈᲁ:[I

    .line 230
    .line 231
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 232
    .line 233
    .line 234
    move-result-object p2

    .line 235
    invoke-static {p1, v2}, Lyyds/ᲁᛶᛲᲁ;->ᲀᛲᛳᲀ(Landroid/content/Context;I)I

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    const-class v2, Lyyds/ᛷᛴᛸᛱ;

    .line 240
    .line 241
    monitor-enter v2

    .line 242
    :try_start_0
    invoke-static {p1, v4}, Lyyds/ᛷᛴᲀᲈ;->ᲇᲇᲇᛱ(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 243
    .line 244
    .line 245
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 246
    monitor-exit v2

    .line 247
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 248
    .line 249
    .line 250
    if-eq p0, v7, :cond_c

    .line 251
    .line 252
    invoke-virtual {p2, p0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 253
    .line 254
    .line 255
    :cond_c
    move v0, v6

    .line 256
    goto :goto_4

    .line 257
    :catchall_0
    move-exception p0

    .line 258
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 259
    throw p0

    .line 260
    :cond_d
    :goto_4
    if-nez v0, :cond_e

    .line 261
    .line 262
    if-eqz p3, :cond_e

    .line 263
    .line 264
    return-object v1

    .line 265
    :cond_e
    return-object p4
.end method

.method public final declared-synchronized ᛲᛴᛳᛲ(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lyyds/ᛷᛴᲀᲈ;->ᲇᲈᛵᛷ:Z

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
    iput-boolean v0, p0, Lyyds/ᛷᛴᲀᲈ;->ᲇᲈᛵᛷ:Z

    .line 9
    .line 10
    const v0, 0x66080054

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, v0}, Lyyds/ᛷᛴᲀᲈ;->ᲇᲈᛵᛷ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_4

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
    if-eqz v0, :cond_4

    .line 34
    .line 35
    :goto_0
    invoke-virtual {p0, p1, p2}, Lyyds/ᛷᛴᲀᲈ;->ᛵᛸᛸᛷ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

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
    goto :goto_2

    .line 48
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2, p3, v0}, Lyyds/ᛷᛴᲀᲈ;->ᛱᲈᲁ(Landroid/content/Context;IZLandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :cond_2
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-static {v0}, Lyyds/ᲀᲈᛸᛸ;->ᛲᲈᲁ(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    :cond_3
    monitor-exit p0

    .line 60
    return-object v0

    .line 61
    :cond_4
    const/4 p1, 0x0

    .line 62
    :try_start_1
    iput-boolean p1, p0, Lyyds/ᛷᛴᲀᲈ;->ᲇᲈᛵᛷ:Z

    .line 63
    .line 64
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string p2, "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."

    .line 67
    .line 68
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    throw p1
.end method

.method public final ᛲᲈᲁ(Landroid/content/Context;ILandroid/content/res/ColorStateList;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛴᲀᲈ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

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
    iput-object v0, p0, Lyyds/ᛷᛴᲀᲈ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lyyds/ᛲᛴᲀᛳ;

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
    new-instance v0, Lyyds/ᛲᛴᲀᛳ;

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
    iput-object v4, v0, Lyyds/ᛲᛴᲀᛳ;->ᲀᛲᛳᲀ:[I

    .line 49
    .line 50
    new-array v4, v5, [Ljava/lang/Object;

    .line 51
    .line 52
    iput-object v4, v0, Lyyds/ᛲᛴᲀᛳ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 53
    .line 54
    iget-object p0, p0, Lyyds/ᛷᛴᲀᲈ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 55
    .line 56
    invoke-virtual {p0, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_3
    iget p0, v0, Lyyds/ᛲᛴᲀᛳ;->ᛲᛴᛳᛲ:I

    .line 60
    .line 61
    if-eqz p0, :cond_a

    .line 62
    .line 63
    iget-object p1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲀᛲᛳᲀ:[I

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
    invoke-static {p0, p2, p1}, Lyyds/ᛷᛸ;->ᛵᛸᛸᛷ(II[I)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-ltz p0, :cond_4

    .line 76
    .line 77
    iget-object p1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

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
    iget p1, v0, Lyyds/ᛲᛴᲀᛳ;->ᛲᛴᛳᛲ:I

    .line 84
    .line 85
    if-ge p0, p1, :cond_5

    .line 86
    .line 87
    iget-object v4, v0, Lyyds/ᛲᛴᲀᛳ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 88
    .line 89
    aget-object v5, v4, p0

    .line 90
    .line 91
    sget-object v6, Lyyds/ᛲᲇᲁᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 92
    .line 93
    if-ne v5, v6, :cond_5

    .line 94
    .line 95
    iget-object p1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲀᛲᛳᲀ:[I

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
    iget-object v4, v0, Lyyds/ᛲᛴᲀᛳ;->ᲀᛲᛳᲀ:[I

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
    iget-object v1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲀᛲᛳᲀ:[I

    .line 125
    .line 126
    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    iput-object v1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲀᛲᛳᲀ:[I

    .line 131
    .line 132
    iget-object v1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 133
    .line 134
    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iput-object p1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 139
    .line 140
    :cond_8
    iget p1, v0, Lyyds/ᛲᛴᲀᛳ;->ᛲᛴᛳᛲ:I

    .line 141
    .line 142
    sub-int v1, p1, p0

    .line 143
    .line 144
    if-eqz v1, :cond_9

    .line 145
    .line 146
    iget-object v1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲀᛲᛳᲀ:[I

    .line 147
    .line 148
    add-int/lit8 v2, p0, 0x1

    .line 149
    .line 150
    invoke-static {v2, p0, p1, v1, v1}, Lyyds/ᲀᲀᛷᛸ;->ᛳᛸᛴᛶ(III[I[I)V

    .line 151
    .line 152
    .line 153
    iget-object p1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 154
    .line 155
    iget v1, v0, Lyyds/ᛲᛴᲀᛳ;->ᛲᛴᛳᛲ:I

    .line 156
    .line 157
    invoke-static {v2, p0, v1, p1, p1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_9
    iget-object p1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲀᛲᛳᲀ:[I

    .line 161
    .line 162
    aput p2, p1, p0

    .line 163
    .line 164
    iget-object p1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 165
    .line 166
    aput-object p3, p1, p0

    .line 167
    .line 168
    iget p0, v0, Lyyds/ᛲᛴᲀᛳ;->ᛲᛴᛳᛲ:I

    .line 169
    .line 170
    add-int/2addr p0, v3

    .line 171
    iput p0, v0, Lyyds/ᛲᛴᲀᛳ;->ᛲᛴᛳᛲ:I

    .line 172
    .line 173
    return-void

    .line 174
    :cond_a
    iget-object p1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲀᛲᛳᲀ:[I

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
    iget-object v1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲀᛲᛳᲀ:[I

    .line 198
    .line 199
    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    iput-object v1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲀᛲᛳᲀ:[I

    .line 204
    .line 205
    iget-object v1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 206
    .line 207
    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    iput-object p1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 212
    .line 213
    :cond_d
    iget-object p1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲀᛲᛳᲀ:[I

    .line 214
    .line 215
    aput p2, p1, p0

    .line 216
    .line 217
    iget-object p1, v0, Lyyds/ᛲᛴᲀᛳ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 218
    .line 219
    aput-object p3, p1, p0

    .line 220
    .line 221
    add-int/2addr p0, v3

    .line 222
    iput p0, v0, Lyyds/ᛲᛴᲀᛳ;->ᛲᛴᛳᛲ:I

    .line 223
    .line 224
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 10

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛴᲀᲈ;->ᲀᛲᛳᲀ:Landroid/util/TypedValue;

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
    iput-object v0, p0, Lyyds/ᛷᛴᲀᲈ;->ᲀᛲᛳᲀ:Landroid/util/TypedValue;

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
    iget v1, v0, Landroid/util/TypedValue;->data:I

    .line 27
    .line 28
    int-to-long v5, v1

    .line 29
    or-long/2addr v3, v5

    .line 30
    monitor-enter p0

    .line 31
    :try_start_0
    iget-object v1, p0, Lyyds/ᛷᛴᲀᲈ;->ᛵᛸᛸᛷ:Ljava/util/WeakHashMap;

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lyyds/ᲀᛵᛸᲀ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    monitor-exit p0

    .line 43
    :goto_0
    move-object v1, v5

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    :try_start_1
    invoke-virtual {v1, v3, v4}, Lyyds/ᲀᛵᛸᲀ;->ᛵᛸᛸᛷ(J)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    check-cast v6, Ljava/lang/ref/WeakReference;

    .line 50
    .line 51
    if-eqz v6, :cond_3

    .line 52
    .line 53
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 58
    .line 59
    if-eqz v6, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v6, v1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    .line 68
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    monitor-exit p0

    .line 70
    goto :goto_1

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    goto/16 :goto_5

    .line 73
    .line 74
    :cond_2
    :try_start_2
    iget-object v6, v1, Lyyds/ᲀᛵᛸᲀ;->ᲇᲈᛵᛷ:[J

    .line 75
    .line 76
    iget v7, v1, Lyyds/ᲀᛵᛸᲀ;->ᲇᲇᲇᛱ:I

    .line 77
    .line 78
    invoke-static {v6, v7, v3, v4}, Lyyds/ᛷᛸ;->ᲀᛲᛳᲀ([JIJ)I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-ltz v6, :cond_3

    .line 83
    .line 84
    iget-object v7, v1, Lyyds/ᲀᛵᛸᲀ;->ᛲᛴᛳᛲ:[Ljava/lang/Object;

    .line 85
    .line 86
    aget-object v8, v7, v6

    .line 87
    .line 88
    sget-object v9, Lyyds/ᛴᛸᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 89
    .line 90
    if-eq v8, v9, :cond_3

    .line 91
    .line 92
    aput-object v9, v7, v6

    .line 93
    .line 94
    iput-boolean v2, v1, Lyyds/ᲀᛵᛸᲀ;->ᲀᛲᛳᲀ:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 95
    .line 96
    :cond_3
    monitor-exit p0

    .line 97
    goto :goto_0

    .line 98
    :goto_1
    if-eqz v1, :cond_4

    .line 99
    .line 100
    return-object v1

    .line 101
    :cond_4
    iget-object v1, p0, Lyyds/ᛷᛴᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛳᲈᛲ;

    .line 102
    .line 103
    if-nez v1, :cond_5

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    const v1, 0x66080016

    .line 107
    .line 108
    .line 109
    if-ne p2, v1, :cond_6

    .line 110
    .line 111
    new-instance v5, Landroid/graphics/drawable/LayerDrawable;

    .line 112
    .line 113
    const p2, 0x66080015

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, p1, p2}, Lyyds/ᛷᛴᲀᲈ;->ᲇᲈᛵᛷ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    const v1, 0x66080017

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1, v1}, Lyyds/ᛷᛴᲀᲈ;->ᲇᲈᛵᛷ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    filled-new-array {p2, v1}, [Landroid/graphics/drawable/Drawable;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-direct {v5, p2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_6
    const v1, 0x66080039

    .line 136
    .line 137
    .line 138
    if-ne p2, v1, :cond_7

    .line 139
    .line 140
    const p2, 0x6607003b

    .line 141
    .line 142
    .line 143
    invoke-static {p0, p1, p2}, Lyyds/ᛷᛳᲈᛲ;->ᲀᛲᛳᲀ(Lyyds/ᛷᛴᲀᲈ;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    goto :goto_2

    .line 148
    :cond_7
    const v1, 0x66080038

    .line 149
    .line 150
    .line 151
    if-ne p2, v1, :cond_8

    .line 152
    .line 153
    const p2, 0x6607003c

    .line 154
    .line 155
    .line 156
    invoke-static {p0, p1, p2}, Lyyds/ᛷᛳᲈᛲ;->ᲀᛲᛳᲀ(Lyyds/ᛷᛴᲀᲈ;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    goto :goto_2

    .line 161
    :cond_8
    const v1, 0x6608003a

    .line 162
    .line 163
    .line 164
    if-ne p2, v1, :cond_9

    .line 165
    .line 166
    const p2, 0x6607003d

    .line 167
    .line 168
    .line 169
    invoke-static {p0, p1, p2}, Lyyds/ᛷᛳᲈᛲ;->ᲀᛲᛳᲀ(Lyyds/ᛷᛴᲀᲈ;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    :cond_9
    :goto_2
    if-eqz v5, :cond_c

    .line 174
    .line 175
    iget p2, v0, Landroid/util/TypedValue;->changingConfigurations:I

    .line 176
    .line 177
    invoke-virtual {v5, p2}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    .line 178
    .line 179
    .line 180
    monitor-enter p0

    .line 181
    :try_start_3
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    if-eqz p2, :cond_b

    .line 186
    .line 187
    iget-object v0, p0, Lyyds/ᛷᛴᲀᲈ;->ᛵᛸᛸᛷ:Ljava/util/WeakHashMap;

    .line 188
    .line 189
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    check-cast v0, Lyyds/ᲀᛵᛸᲀ;

    .line 194
    .line 195
    if-nez v0, :cond_a

    .line 196
    .line 197
    new-instance v0, Lyyds/ᲀᛵᛸᲀ;

    .line 198
    .line 199
    invoke-direct {v0}, Lyyds/ᲀᛵᛸᲀ;-><init>()V

    .line 200
    .line 201
    .line 202
    iget-object v1, p0, Lyyds/ᛷᛴᲀᲈ;->ᛵᛸᛸᛷ:Ljava/util/WeakHashMap;

    .line 203
    .line 204
    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    goto :goto_3

    .line 208
    :catchall_1
    move-exception p1

    .line 209
    goto :goto_4

    .line 210
    :cond_a
    :goto_3
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 211
    .line 212
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v3, v4, p1}, Lyyds/ᲀᛵᛸᲀ;->ᲀᛲᛳᲀ(JLjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 216
    .line 217
    .line 218
    monitor-exit p0

    .line 219
    return-object v5

    .line 220
    :cond_b
    monitor-exit p0

    .line 221
    return-object v5

    .line 222
    :goto_4
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 223
    throw p1

    .line 224
    :cond_c
    return-object v5

    .line 225
    :goto_5
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 226
    throw p1
.end method

.method public final declared-synchronized ᛶᛷᛲᲁ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lyyds/ᛷᛴᲀᲈ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

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
    check-cast v0, Lyyds/ᛲᛴᲀᛳ;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-object v2, v0, Lyyds/ᛲᛴᲀᛳ;->ᲀᛲᛳᲀ:[I

    .line 16
    .line 17
    iget v3, v0, Lyyds/ᛲᛴᲀᛳ;->ᛲᛴᛳᛲ:I

    .line 18
    .line 19
    invoke-static {v3, p2, v2}, Lyyds/ᛷᛸ;->ᛵᛸᛸᛷ(II[I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-ltz v2, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, Lyyds/ᛲᛴᲀᛳ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 26
    .line 27
    aget-object v0, v0, v2

    .line 28
    .line 29
    sget-object v2, Lyyds/ᛲᲇᲁᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

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
    iget-object v0, p0, Lyyds/ᛷᛴᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛳᲈᛲ;

    .line 41
    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    invoke-virtual {v0, p1, p2}, Lyyds/ᛷᛳᲈᛲ;->ᲇᲈᛵᛷ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :goto_1
    if-eqz v1, :cond_4

    .line 50
    .line 51
    invoke-virtual {p0, p1, p2, v1}, Lyyds/ᛷᛴᲀᲈ;->ᛲᲈᲁ(Landroid/content/Context;ILandroid/content/res/ColorStateList;)V
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

.method public final declared-synchronized ᲇᲈᛵᛷ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, Lyyds/ᛷᛴᲀᲈ;->ᛲᛴᛳᛲ(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    monitor-exit p0

    .line 8
    return-object p1

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw p1
.end method
