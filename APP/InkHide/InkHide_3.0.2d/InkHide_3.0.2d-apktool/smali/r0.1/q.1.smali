.class public final Lr0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# instance fields
.field public final a:Landroid/util/LruCache;

.field public final b:Ljava/util/Set;

.field public volatile c:Z

.field public d:Ljava/lang/reflect/Field;

.field public e:Ljava/lang/reflect/Field;

.field public f:Ljava/lang/reflect/Field;

.field public g:Ljava/lang/reflect/Field;

.field public h:Ljava/lang/reflect/Field;

.field public i:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/util/LruCache;

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lr0/q;->a:Landroid/util/LruCache;

    .line 12
    .line 13
    new-instance v0, Ljava/util/WeakHashMap;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lr0/q;->b:Ljava/util/Set;

    .line 23
    .line 24
    return-void
.end method

.method public static final a(Lr0/q;Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lz0/l;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    instance-of v1, p1, Landroid/view/View;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    move-object v1, p1

    .line 17
    check-cast v1, Landroid/view/View;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object v1, v2

    .line 21
    :goto_0
    if-nez v1, :cond_2

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const/16 v4, 0x2d0

    .line 29
    .line 30
    if-eqz v3, :cond_4

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-eqz v3, :cond_4

    .line 37
    .line 38
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 39
    .line 40
    if-ge v3, v4, :cond_3

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    move v4, v3

    .line 44
    :cond_4
    :goto_1
    new-instance v3, Ljava/io/File;

    .line 45
    .line 46
    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v3, v4}, Lr0/q;->c(Ljava/io/File;I)Landroid/graphics/Bitmap;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-nez v0, :cond_5

    .line 54
    .line 55
    :goto_2
    const/4 p0, 0x0

    .line 56
    return p0

    .line 57
    :cond_5
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {p0, v3}, Lr0/q;->d(Ljava/lang/Class;)V

    .line 62
    .line 63
    .line 64
    iget-object v3, p0, Lr0/q;->d:Ljava/lang/reflect/Field;

    .line 65
    .line 66
    if-eqz v3, :cond_6

    .line 67
    .line 68
    invoke-virtual {v3, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_3

    .line 72
    :catchall_0
    move-exception p0

    .line 73
    goto :goto_6

    .line 74
    :cond_6
    :goto_3
    iget-object v3, p0, Lr0/q;->e:Ljava/lang/reflect/Field;

    .line 75
    .line 76
    if-eqz v3, :cond_7

    .line 77
    .line 78
    invoke-virtual {v3, p1, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_7
    iget-object v3, p0, Lr0/q;->f:Ljava/lang/reflect/Field;

    .line 82
    .line 83
    if-eqz v3, :cond_8

    .line 84
    .line 85
    invoke-virtual {v3, p1, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_8
    iget-object v0, p0, Lr0/q;->g:Ljava/lang/reflect/Field;

    .line 89
    .line 90
    if-eqz v0, :cond_9

    .line 91
    .line 92
    const/4 v3, 0x1

    .line 93
    invoke-virtual {v0, p1, v3}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    .line 94
    .line 95
    .line 96
    :cond_9
    iget-object v0, p0, Lr0/q;->h:Ljava/lang/reflect/Field;

    .line 97
    .line 98
    if-eqz v0, :cond_a

    .line 99
    .line 100
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    goto :goto_4

    .line 105
    :cond_a
    move-object v0, v2

    .line 106
    :goto_4
    instance-of v3, v0, Landroid/widget/SpinnerAdapter;

    .line 107
    .line 108
    if-eqz v3, :cond_b

    .line 109
    .line 110
    move-object v2, v0

    .line 111
    check-cast v2, Landroid/widget/SpinnerAdapter;

    .line 112
    .line 113
    :cond_b
    instance-of v0, v2, Landroid/widget/BaseAdapter;

    .line 114
    .line 115
    if-eqz v0, :cond_c

    .line 116
    .line 117
    check-cast v2, Landroid/widget/BaseAdapter;

    .line 118
    .line 119
    invoke-virtual {v2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 120
    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_c
    if-eqz v2, :cond_d

    .line 124
    .line 125
    iget-object p0, p0, Lr0/q;->i:Ljava/lang/reflect/Method;

    .line 126
    .line 127
    if-eqz p0, :cond_d

    .line 128
    .line 129
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    :cond_d
    :goto_5
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 137
    .line 138
    .line 139
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    .line 141
    goto :goto_7

    .line 142
    :goto_6
    new-instance p1, LE0/d;

    .line 143
    .line 144
    invoke-direct {p1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    move-object p0, p1

    .line 148
    :goto_7
    invoke-static {p0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-eqz p1, :cond_e

    .line 153
    .line 154
    const-string v0, "custom local avatar apply hd fail"

    .line 155
    .line 156
    filled-new-array {v0, p2, p1}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :cond_e
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 164
    .line 165
    instance-of p2, p0, LE0/d;

    .line 166
    .line 167
    if-eqz p2, :cond_f

    .line 168
    .line 169
    move-object p0, p1

    .line 170
    :cond_f
    check-cast p0, Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    return p0
.end method

.method public static b(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_1

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "getDeclaredMethods(...)"

    .line 21
    .line 22
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    new-instance v2, LE0/d;

    .line 32
    .line 33
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object v1, v2

    .line 37
    :goto_1
    sget-object v2, LF0/s;->a:LF0/s;

    .line 38
    .line 39
    instance-of v3, v1, LE0/d;

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    move-object v1, v2

    .line 44
    :cond_0
    check-cast v1, Ljava/util/Collection;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-object v0
.end method

.method public static c(Ljava/io/File;I)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-lez v0, :cond_4

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-gtz v0, :cond_1

    .line 24
    .line 25
    goto :goto_4

    .line 26
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    int-to-float v0, v0

    .line 31
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    int-to-float v1, v1

    .line 36
    div-float/2addr v0, v1

    .line 37
    const/high16 v1, 0x3f800000    # 1.0f

    .line 38
    .line 39
    cmpl-float v0, v0, v1

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    if-lez v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    sub-int/2addr v2, v0

    .line 53
    div-int/lit8 v2, v2, 0x2

    .line 54
    .line 55
    new-instance v3, Landroid/graphics/Rect;

    .line 56
    .line 57
    add-int/2addr v0, v2

    .line 58
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    invoke-direct {v3, v2, v1, v0, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    sub-int/2addr v2, v0

    .line 77
    div-int/lit8 v2, v2, 0x2

    .line 78
    .line 79
    new-instance v3, Landroid/graphics/Rect;

    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    add-int/2addr v0, v2

    .line 86
    invoke-direct {v3, v1, v2, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 87
    .line 88
    .line 89
    :goto_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 90
    .line 91
    invoke-static {p1, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    new-instance v2, Landroid/graphics/Canvas;

    .line 96
    .line 97
    invoke-direct {v2, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 98
    .line 99
    .line 100
    new-instance v4, Landroid/graphics/Rect;

    .line 101
    .line 102
    invoke-direct {v4, v1, v1, p1, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 103
    .line 104
    .line 105
    new-instance p1, Landroid/graphics/Paint;

    .line 106
    .line 107
    const/4 v1, 0x1

    .line 108
    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, p0, v3, v4, p1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :goto_1
    new-instance v0, LE0/d;

    .line 122
    .line 123
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    :goto_2
    instance-of p1, v0, LE0/d;

    .line 127
    .line 128
    if-eqz p1, :cond_3

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_3
    move-object p0, v0

    .line 132
    :goto_3
    check-cast p0, Landroid/graphics/Bitmap;

    .line 133
    .line 134
    :cond_4
    :goto_4
    return-object p0
.end method

.method public static h(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x0

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    const-class v1, Landroid/widget/ImageView;

    .line 11
    .line 12
    aget-object v2, v0, v3

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    aget-object v0, v0, v1

    .line 22
    .line 23
    const-class v2, Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-static {p0, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    return v1

    .line 44
    :cond_0
    return v3
.end method

.method public static i(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne v1, v3, :cond_0

    .line 9
    .line 10
    aget-object v0, v0, v2

    .line 11
    .line 12
    const-class v1, Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-static {p0, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    return v3

    .line 33
    :cond_0
    return v2
.end method

.method public static j(Landroid/widget/ImageView;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v1, v2

    .line 14
    :goto_0
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    iget p0, p0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 28
    .line 29
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-lez p0, :cond_2

    .line 34
    .line 35
    move-object v2, v0

    .line 36
    :cond_2
    if-eqz v2, :cond_3

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0

    .line 43
    :cond_3
    const/16 p0, 0x9c

    .line 44
    .line 45
    return p0
.end method


# virtual methods
.method public final d(Ljava/lang/Class;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lr0/q;->d:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    move-object v1, p1

    .line 12
    :goto_0
    if-eqz v1, :cond_2

    .line 13
    .line 14
    const-class v2, Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "getDeclaredFields(...)"

    .line 27
    .line 28
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception v2

    .line 37
    new-instance v3, LE0/d;

    .line 38
    .line 39
    invoke-direct {v3, v2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    move-object v2, v3

    .line 43
    :goto_1
    sget-object v3, LF0/s;->a:LF0/s;

    .line 44
    .line 45
    instance-of v4, v2, LE0/d;

    .line 46
    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    move-object v2, v3

    .line 50
    :cond_1
    check-cast v2, Ljava/util/Collection;

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    move-object v4, v3

    .line 80
    check-cast v4, Ljava/lang/reflect/Field;

    .line 81
    .line 82
    const-class v5, Landroid/graphics/Bitmap;

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_3

    .line 93
    .line 94
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    const/4 v4, 0x1

    .line 107
    if-eqz v3, :cond_5

    .line 108
    .line 109
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Ljava/lang/reflect/Field;

    .line 114
    .line 115
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_5
    const/4 v2, 0x0

    .line 120
    invoke-static {v1, v2}, LF0/k;->k0(Ljava/util/List;I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, Ljava/lang/reflect/Field;

    .line 125
    .line 126
    iput-object v3, p0, Lr0/q;->e:Ljava/lang/reflect/Field;

    .line 127
    .line 128
    invoke-static {v1, v4}, LF0/k;->k0(Ljava/util/List;I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, Ljava/lang/reflect/Field;

    .line 133
    .line 134
    if-nez v3, :cond_6

    .line 135
    .line 136
    invoke-static {v1, v2}, LF0/k;->k0(Ljava/util/List;I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    move-object v3, v1

    .line 141
    check-cast v3, Ljava/lang/reflect/Field;

    .line 142
    .line 143
    :cond_6
    iput-object v3, p0, Lr0/q;->f:Ljava/lang/reflect/Field;

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    const/4 v5, 0x0

    .line 154
    if-eqz v3, :cond_8

    .line 155
    .line 156
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    move-object v6, v3

    .line 161
    check-cast v6, Ljava/lang/reflect/Field;

    .line 162
    .line 163
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    const-class v7, Ljava/lang/String;

    .line 168
    .line 169
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-eqz v6, :cond_7

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_8
    move-object v3, v5

    .line 177
    :goto_4
    check-cast v3, Ljava/lang/reflect/Field;

    .line 178
    .line 179
    if-eqz v3, :cond_9

    .line 180
    .line 181
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 182
    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_9
    move-object v3, v5

    .line 186
    :goto_5
    iput-object v3, p0, Lr0/q;->d:Ljava/lang/reflect/Field;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    :cond_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-eqz v3, :cond_b

    .line 197
    .line 198
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    move-object v6, v3

    .line 203
    check-cast v6, Ljava/lang/reflect/Field;

    .line 204
    .line 205
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 210
    .line 211
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    if-eqz v6, :cond_a

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_b
    move-object v3, v5

    .line 219
    :goto_6
    check-cast v3, Ljava/lang/reflect/Field;

    .line 220
    .line 221
    if-eqz v3, :cond_c

    .line 222
    .line 223
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 224
    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_c
    move-object v3, v5

    .line 228
    :goto_7
    iput-object v3, p0, Lr0/q;->g:Ljava/lang/reflect/Field;

    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    const-class v3, Landroid/widget/SpinnerAdapter;

    .line 239
    .line 240
    if-eqz v1, :cond_e

    .line 241
    .line 242
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    move-object v6, v1

    .line 247
    check-cast v6, Ljava/lang/reflect/Field;

    .line 248
    .line 249
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    invoke-virtual {v3, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-eqz v6, :cond_d

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_e
    move-object v1, v5

    .line 261
    :goto_8
    check-cast v1, Ljava/lang/reflect/Field;

    .line 262
    .line 263
    if-eqz v1, :cond_f

    .line 264
    .line 265
    invoke-virtual {v1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 266
    .line 267
    .line 268
    goto :goto_9

    .line 269
    :cond_f
    move-object v1, v5

    .line 270
    :goto_9
    iput-object v1, p0, Lr0/q;->h:Ljava/lang/reflect/Field;

    .line 271
    .line 272
    invoke-static {p1}, Lr0/q;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    :cond_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-eqz v0, :cond_11

    .line 285
    .line 286
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    move-object v1, v0

    .line 291
    check-cast v1, Ljava/lang/reflect/Method;

    .line 292
    .line 293
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    const-string v7, "setAdapter"

    .line 298
    .line 299
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    if-eqz v6, :cond_10

    .line 304
    .line 305
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    move-result-object v6

    .line 309
    array-length v6, v6

    .line 310
    if-ne v6, v4, :cond_10

    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    aget-object v1, v1, v2

    .line 317
    .line 318
    invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    if-eqz v1, :cond_10

    .line 323
    .line 324
    goto :goto_a

    .line 325
    :cond_11
    move-object v0, v5

    .line 326
    :goto_a
    check-cast v0, Ljava/lang/reflect/Method;

    .line 327
    .line 328
    if-eqz v0, :cond_12

    .line 329
    .line 330
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 331
    .line 332
    .line 333
    move-object v5, v0

    .line 334
    :cond_12
    iput-object v5, p0, Lr0/q;->i:Ljava/lang/reflect/Method;

    .line 335
    .line 336
    return-void
.end method

.method public final e(Ljava/lang/reflect/Method;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "getParameterTypes(...)"

    .line 18
    .line 19
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Lq0/d;

    .line 23
    .line 24
    const/16 v4, 0xb

    .line 25
    .line 26
    invoke-direct {v3, v4}, Lq0/d;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/16 v4, 0x1e

    .line 30
    .line 31
    const-string v5, ","

    .line 32
    .line 33
    invoke-static {v2, v5, v3, v4}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v3, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v4, "custom-local-avatar-"

    .line 40
    .line 41
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, "#"

    .line 48
    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sget-object v1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_0

    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    return p1

    .line 75
    :cond_0
    :try_start_0
    new-instance v1, Lr0/o;

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    invoke-direct {v1, p0, v2}, Lr0/o;-><init>(Lr0/q;I)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1, v1}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 82
    .line 83
    .line 84
    sget-object p1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :catchall_0
    move-exception p1

    .line 93
    new-instance v1, LE0/d;

    .line 94
    .line 95
    invoke-direct {v1, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    move-object p1, v1

    .line 99
    :goto_0
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    if-eqz v1, :cond_1

    .line 104
    .line 105
    const-string v2, "custom local avatar hook method fail"

    .line 106
    .line 107
    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 115
    .line 116
    instance-of v1, p1, LE0/d;

    .line 117
    .line 118
    if-eqz v1, :cond_2

    .line 119
    .line 120
    move-object p1, v0

    .line 121
    :cond_2
    check-cast p1, Ljava/lang/Boolean;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    return p1
.end method

.method public final f(Ljava/lang/reflect/Method;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "getParameterTypes(...)"

    .line 18
    .line 19
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Lq0/d;

    .line 23
    .line 24
    const/16 v4, 0xc

    .line 25
    .line 26
    invoke-direct {v3, v4}, Lq0/d;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/16 v4, 0x1e

    .line 30
    .line 31
    const-string v5, ","

    .line 32
    .line 33
    invoke-static {v2, v5, v3, v4}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v3, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v4, "custom-local-avatar-hd-gallery-"

    .line 40
    .line 41
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, "#"

    .line 48
    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sget-object v1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_0

    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    return p1

    .line 75
    :cond_0
    :try_start_0
    new-instance v1, Lr0/o;

    .line 76
    .line 77
    const/4 v2, 0x1

    .line 78
    invoke-direct {v1, p0, v2}, Lr0/o;-><init>(Lr0/q;I)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1, v1}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 82
    .line 83
    .line 84
    sget-object p1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :catchall_0
    move-exception p1

    .line 93
    new-instance v0, LE0/d;

    .line 94
    .line 95
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    move-object p1, v0

    .line 99
    :goto_0
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    if-eqz v0, :cond_1

    .line 104
    .line 105
    const-string v1, "custom local avatar hd gallery hook fail"

    .line 106
    .line 107
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 115
    .line 116
    instance-of v1, p1, LE0/d;

    .line 117
    .line 118
    if-eqz v1, :cond_2

    .line 119
    .line 120
    move-object p1, v0

    .line 121
    :cond_2
    check-cast p1, Ljava/lang/Boolean;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    return p1
.end method

.method public final g(Landroid/content/Context;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    iget-boolean v0, v1, Lr0/q;->c:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-static {}, Lz0/l;->e()Lz0/k;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    sget-object v4, LF0/s;->a:LF0/s;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    iget-object v0, v3, Lz0/k;->a:Ljava/util/List;

    .line 19
    .line 20
    :goto_0
    move-object v6, v0

    .line 21
    goto :goto_3

    .line 22
    :cond_1
    invoke-static {}, Lz0/l;->e()Lz0/k;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v0, v0, Lz0/k;->a:Ljava/util/List;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    sget-boolean v0, Lz0/i;->a:Z

    .line 32
    .line 33
    invoke-static {}, Lz0/g;->n()Landroid/content/SharedPreferences;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v6, "sp"

    .line 38
    .line 39
    invoke-static {v0, v6}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    const-string v7, "startReloadIfChangedUnexpectedly"

    .line 47
    .line 48
    invoke-virtual {v6, v7, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v6, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6, v0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    :catchall_0
    invoke-static {}, Lz0/g;->n()Landroid/content/SharedPreferences;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v6, "custom_local_avatar_methods"

    .line 63
    .line 64
    const-string v7, "[]"

    .line 65
    .line 66
    invoke-interface {v0, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    const-string v0, ""

    .line 73
    .line 74
    :cond_3
    :try_start_1
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    move-object v7, v0

    .line 82
    :goto_1
    new-instance v0, Lorg/json/JSONArray;

    .line 83
    .line 84
    invoke-direct {v0, v7}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Lz0/l;->i(Lorg/json/JSONArray;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 91
    goto :goto_2

    .line 92
    :catchall_1
    move-exception v0

    .line 93
    new-instance v6, LE0/d;

    .line 94
    .line 95
    invoke-direct {v6, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    move-object v0, v6

    .line 99
    :goto_2
    nop

    .line 100
    instance-of v6, v0, LE0/d;

    .line 101
    .line 102
    if-eqz v6, :cond_5

    .line 103
    .line 104
    move-object v0, v4

    .line 105
    :cond_5
    check-cast v0, Ljava/util/List;

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :goto_3
    if-eqz v3, :cond_6

    .line 109
    .line 110
    iget-object v0, v3, Lz0/k;->b:Ljava/util/List;

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_6
    move-object v0, v5

    .line 114
    :goto_4
    if-nez v0, :cond_7

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_7
    move-object v4, v0

    .line 118
    :goto_5
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    const/4 v8, 0x0

    .line 123
    move v9, v8

    .line 124
    :cond_8
    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_e

    .line 129
    .line 130
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    move-object v10, v0

    .line 135
    check-cast v10, Lz0/j;

    .line 136
    .line 137
    :try_start_2
    iget-object v0, v10, Lz0/j;->a:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 140
    .line 141
    .line 142
    move-result-object v11

    .line 143
    invoke-static {v0, v8, v11}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 147
    goto :goto_7

    .line 148
    :catchall_2
    move-exception v0

    .line 149
    new-instance v11, LE0/d;

    .line 150
    .line 151
    invoke-direct {v11, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    move-object v0, v11

    .line 155
    :goto_7
    nop

    .line 156
    instance-of v11, v0, LE0/d;

    .line 157
    .line 158
    if-eqz v11, :cond_9

    .line 159
    .line 160
    move-object v0, v5

    .line 161
    :cond_9
    check-cast v0, Ljava/lang/Class;

    .line 162
    .line 163
    if-nez v0, :cond_a

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_a
    invoke-static {v0}, Lr0/q;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    new-instance v11, Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    :cond_b
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v12

    .line 183
    if-eqz v12, :cond_c

    .line 184
    .line 185
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v12

    .line 189
    move-object v13, v12

    .line 190
    check-cast v13, Ljava/lang/reflect/Method;

    .line 191
    .line 192
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v14

    .line 196
    iget-object v15, v10, Lz0/j;->b:Ljava/lang/String;

    .line 197
    .line 198
    invoke-static {v14, v15}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v14

    .line 202
    if-eqz v14, :cond_b

    .line 203
    .line 204
    invoke-static {v13}, Lr0/q;->h(Ljava/lang/reflect/Method;)Z

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    if-eqz v13, :cond_b

    .line 209
    .line 210
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    goto :goto_8

    .line 214
    :cond_c
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    :cond_d
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v10

    .line 222
    if-eqz v10, :cond_8

    .line 223
    .line 224
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    check-cast v10, Ljava/lang/reflect/Method;

    .line 229
    .line 230
    invoke-virtual {v1, v10}, Lr0/q;->e(Ljava/lang/reflect/Method;)Z

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    if-eqz v10, :cond_d

    .line 235
    .line 236
    add-int/2addr v9, v2

    .line 237
    goto :goto_9

    .line 238
    :cond_e
    const-string v0, "com.tencent.mm.pluginsdk.ui.a$b"

    .line 239
    .line 240
    const-string v7, "com.tencent.mm.feature.avatar.w"

    .line 241
    .line 242
    const-string v10, "com.tencent.mm.pluginsdk.ui.u"

    .line 243
    .line 244
    const-string v11, "com.tencent.mm.pluginsdk.ui.u$b"

    .line 245
    .line 246
    filled-new-array {v10, v11, v0, v7}, [Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    move v10, v8

    .line 259
    :cond_f
    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_15

    .line 264
    .line 265
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    check-cast v0, Ljava/lang/String;

    .line 270
    .line 271
    :try_start_3
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 272
    .line 273
    .line 274
    move-result-object v11

    .line 275
    invoke-static {v0, v8, v11}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 279
    goto :goto_b

    .line 280
    :catchall_3
    move-exception v0

    .line 281
    new-instance v11, LE0/d;

    .line 282
    .line 283
    invoke-direct {v11, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 284
    .line 285
    .line 286
    move-object v0, v11

    .line 287
    :goto_b
    nop

    .line 288
    instance-of v11, v0, LE0/d;

    .line 289
    .line 290
    if-eqz v11, :cond_10

    .line 291
    .line 292
    move-object v0, v5

    .line 293
    :cond_10
    check-cast v0, Ljava/lang/Class;

    .line 294
    .line 295
    if-nez v0, :cond_11

    .line 296
    .line 297
    goto :goto_a

    .line 298
    :cond_11
    invoke-static {v0}, Lr0/q;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    new-instance v11, Ljava/util/ArrayList;

    .line 303
    .line 304
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    :cond_12
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 312
    .line 313
    .line 314
    move-result v12

    .line 315
    if-eqz v12, :cond_13

    .line 316
    .line 317
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v12

    .line 321
    move-object v13, v12

    .line 322
    check-cast v13, Ljava/lang/reflect/Method;

    .line 323
    .line 324
    invoke-static {v13}, Lr0/q;->h(Ljava/lang/reflect/Method;)Z

    .line 325
    .line 326
    .line 327
    move-result v13

    .line 328
    if-eqz v13, :cond_12

    .line 329
    .line 330
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    goto :goto_c

    .line 334
    :cond_13
    const/16 v0, 0x8

    .line 335
    .line 336
    invoke-static {v11, v0}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    :cond_14
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v11

    .line 348
    if-eqz v11, :cond_f

    .line 349
    .line 350
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v11

    .line 354
    check-cast v11, Ljava/lang/reflect/Method;

    .line 355
    .line 356
    invoke-virtual {v1, v11}, Lr0/q;->e(Ljava/lang/reflect/Method;)Z

    .line 357
    .line 358
    .line 359
    move-result v11

    .line 360
    if-eqz v11, :cond_14

    .line 361
    .line 362
    add-int/2addr v10, v2

    .line 363
    goto :goto_d

    .line 364
    :cond_15
    add-int/2addr v9, v10

    .line 365
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 366
    .line 367
    .line 368
    move-result-object v7

    .line 369
    move v10, v8

    .line 370
    :goto_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-eqz v0, :cond_1c

    .line 375
    .line 376
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    move-object v11, v0

    .line 381
    check-cast v11, Lz0/j;

    .line 382
    .line 383
    :try_start_4
    iget-object v0, v11, Lz0/j;->a:Ljava/lang/String;

    .line 384
    .line 385
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 386
    .line 387
    .line 388
    move-result-object v12

    .line 389
    invoke-static {v0, v8, v12}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 393
    goto :goto_f

    .line 394
    :catchall_4
    move-exception v0

    .line 395
    new-instance v12, LE0/d;

    .line 396
    .line 397
    invoke-direct {v12, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 398
    .line 399
    .line 400
    move-object v0, v12

    .line 401
    :goto_f
    nop

    .line 402
    instance-of v12, v0, LE0/d;

    .line 403
    .line 404
    if-eqz v12, :cond_16

    .line 405
    .line 406
    move-object v0, v5

    .line 407
    :cond_16
    check-cast v0, Ljava/lang/Class;

    .line 408
    .line 409
    if-nez v0, :cond_17

    .line 410
    .line 411
    move/from16 v16, v2

    .line 412
    .line 413
    goto :goto_12

    .line 414
    :cond_17
    invoke-static {v0}, Lr0/q;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    new-instance v12, Ljava/util/ArrayList;

    .line 419
    .line 420
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 428
    .line 429
    .line 430
    move-result v13

    .line 431
    if-eqz v13, :cond_19

    .line 432
    .line 433
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v13

    .line 437
    move-object v14, v13

    .line 438
    check-cast v14, Ljava/lang/reflect/Method;

    .line 439
    .line 440
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v15

    .line 444
    move/from16 v16, v2

    .line 445
    .line 446
    iget-object v2, v11, Lz0/j;->b:Ljava/lang/String;

    .line 447
    .line 448
    invoke-static {v15, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    if-eqz v2, :cond_18

    .line 453
    .line 454
    invoke-static {v14}, Lr0/q;->i(Ljava/lang/reflect/Method;)Z

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    if-eqz v2, :cond_18

    .line 459
    .line 460
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    :cond_18
    move/from16 v2, v16

    .line 464
    .line 465
    goto :goto_10

    .line 466
    :cond_19
    move/from16 v16, v2

    .line 467
    .line 468
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    :cond_1a
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 473
    .line 474
    .line 475
    move-result v2

    .line 476
    if-eqz v2, :cond_1b

    .line 477
    .line 478
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    check-cast v2, Ljava/lang/reflect/Method;

    .line 483
    .line 484
    invoke-virtual {v1, v2}, Lr0/q;->f(Ljava/lang/reflect/Method;)Z

    .line 485
    .line 486
    .line 487
    move-result v2

    .line 488
    if-eqz v2, :cond_1a

    .line 489
    .line 490
    add-int/lit8 v10, v10, 0x1

    .line 491
    .line 492
    goto :goto_11

    .line 493
    :cond_1b
    :goto_12
    move/from16 v2, v16

    .line 494
    .line 495
    goto :goto_e

    .line 496
    :cond_1c
    move/from16 v16, v2

    .line 497
    .line 498
    add-int/2addr v9, v10

    .line 499
    :try_start_5
    const-string v0, "com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView"

    .line 500
    .line 501
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    invoke-static {v0, v8, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 509
    goto :goto_13

    .line 510
    :catchall_5
    move-exception v0

    .line 511
    new-instance v2, LE0/d;

    .line 512
    .line 513
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 514
    .line 515
    .line 516
    move-object v0, v2

    .line 517
    :goto_13
    nop

    .line 518
    instance-of v2, v0, LE0/d;

    .line 519
    .line 520
    if-eqz v2, :cond_1d

    .line 521
    .line 522
    move-object v0, v5

    .line 523
    :cond_1d
    check-cast v0, Ljava/lang/Class;

    .line 524
    .line 525
    if-nez v0, :cond_1e

    .line 526
    .line 527
    :goto_14
    move v0, v8

    .line 528
    goto :goto_15

    .line 529
    :cond_1e
    invoke-static {v0}, Lr0/q;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    :cond_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    if-eqz v2, :cond_20

    .line 542
    .line 543
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    move-object v7, v2

    .line 548
    check-cast v7, Ljava/lang/reflect/Method;

    .line 549
    .line 550
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v10

    .line 554
    const-string v11, "setUsername"

    .line 555
    .line 556
    invoke-static {v10, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result v10

    .line 560
    if-eqz v10, :cond_1f

    .line 561
    .line 562
    invoke-static {v7}, Lr0/q;->i(Ljava/lang/reflect/Method;)Z

    .line 563
    .line 564
    .line 565
    move-result v7

    .line 566
    if-eqz v7, :cond_1f

    .line 567
    .line 568
    move-object v5, v2

    .line 569
    :cond_20
    check-cast v5, Ljava/lang/reflect/Method;

    .line 570
    .line 571
    if-nez v5, :cond_21

    .line 572
    .line 573
    goto :goto_14

    .line 574
    :cond_21
    invoke-virtual {v1, v5}, Lr0/q;->f(Ljava/lang/reflect/Method;)Z

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    :goto_15
    add-int/2addr v9, v0

    .line 579
    if-lez v9, :cond_22

    .line 580
    .line 581
    move/from16 v0, v16

    .line 582
    .line 583
    goto :goto_16

    .line 584
    :cond_22
    move v0, v8

    .line 585
    :goto_16
    iput-boolean v0, v1, Lr0/q;->c:Z

    .line 586
    .line 587
    const-string v0, "count="

    .line 588
    .line 589
    invoke-static {v9, v0}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 594
    .line 595
    .line 596
    move-result v2

    .line 597
    const-string v5, "load="

    .line 598
    .line 599
    invoke-static {v2, v5}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 604
    .line 605
    .line 606
    move-result v4

    .line 607
    const-string v5, "hd="

    .line 608
    .line 609
    invoke-static {v4, v5}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v4

    .line 613
    if-eqz v3, :cond_23

    .line 614
    .line 615
    move/from16 v8, v16

    .line 616
    .line 617
    :cond_23
    const-string v3, "versionCached="

    .line 618
    .line 619
    invoke-static {v3, v8}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v3

    .line 623
    const-string v5, "custom local avatar hook installed"

    .line 624
    .line 625
    filled-new-array {v5, v0, v2, v4, v3}, [Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    return-void
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 7

    .line 1
    iget-object v0, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p2, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, p2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    sget-object p2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 13
    .line 14
    const-string v0, "custom-local-avatar-activity-result"

    .line 15
    .line 16
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    const-class v1, Landroid/content/Intent;

    .line 26
    .line 27
    filled-new-array {p2, p2, v1}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    sget-object v1, Lc0/f;->b:Ld0/b;

    .line 32
    .line 33
    const-class v2, Landroid/app/Activity;

    .line 34
    .line 35
    const-string v3, "onActivityResult"

    .line 36
    .line 37
    invoke-interface {v1, v2, v3, p2}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-nez p2, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    new-instance v1, Lm0/f;

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    invoke-direct {v1, p0, p1, v2}, Lm0/f;-><init>(Le0/a;Ljava/lang/Object;I)V

    .line 48
    .line 49
    .line 50
    invoke-static {p2, v1}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 51
    .line 52
    .line 53
    sget-object p2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 54
    .line 55
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :goto_0
    sget-object p2, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 59
    .line 60
    new-instance v0, LA0/u;

    .line 61
    .line 62
    new-instance v3, Lq0/d;

    .line 63
    .line 64
    const/16 p2, 0x8

    .line 65
    .line 66
    invoke-direct {v3, p2}, Lq0/d;-><init>(I)V

    .line 67
    .line 68
    .line 69
    new-instance v4, Lq0/d;

    .line 70
    .line 71
    const/16 p2, 0x9

    .line 72
    .line 73
    invoke-direct {v4, p2}, Lq0/d;-><init>(I)V

    .line 74
    .line 75
    .line 76
    new-instance v5, Lq0/d;

    .line 77
    .line 78
    const/16 p2, 0xa

    .line 79
    .line 80
    invoke-direct {v5, p2}, Lq0/d;-><init>(I)V

    .line 81
    .line 82
    .line 83
    new-instance v6, LA0/a;

    .line 84
    .line 85
    const/16 p2, 0x10

    .line 86
    .line 87
    invoke-direct {v6, p2}, LA0/a;-><init>(I)V

    .line 88
    .line 89
    .line 90
    const-string v1, "custom-local-avatar"

    .line 91
    .line 92
    const-string v2, "\u672c\u5730\u5934\u50cf"

    .line 93
    .line 94
    invoke-direct/range {v0 .. v6}, LA0/u;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;LM0/l;)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v0}, LA0/y;->c(Landroid/content/Context;LA0/u;)V

    .line 98
    .line 99
    .line 100
    invoke-static {}, Lz0/l;->c()Ljava/util/Map;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-nez p2, :cond_3

    .line 109
    .line 110
    invoke-virtual {p0, p1}, Lr0/q;->g(Landroid/content/Context;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    :goto_1
    return-void
.end method
