.class public final Lpf1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/lang/Object;

.field public static β:Z

.field public static final γ:Ljava/util/ArrayList;

.field public static final δ:Ljava/util/concurrent/ExecutorService;

.field public static final ε:Lwd1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lpf1;->α:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lpf1;->γ:Ljava/util/ArrayList;

    .line 14
    .line 15
    new-instance v0, Laj;

    .line 16
    .line 17
    const/16 v1, 0x10

    .line 18
    .line 19
    invoke-direct {v0, v1}, Laj;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lpf1;->δ:Ljava/util/concurrent/ExecutorService;

    .line 28
    .line 29
    new-instance v0, Lwd1;

    .line 30
    .line 31
    const/16 v1, 0x18

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-direct {v0, v1, v2}, Lwd1;-><init>(II)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lpf1;->ε:Lwd1;

    .line 38
    .line 39
    return-void
.end method

.method public static α(Landroid/app/Activity;Lxx;Z)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iget-object v1, p1, Lxx;->κ:Ljava/lang/String;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p1, Lxx;->γ:Ljava/lang/String;

    .line 12
    .line 13
    :goto_0
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-static {p0, v1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    iget-object p1, p1, Lxx;->ι:Ljava/lang/String;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-object p1, p1, Lxx;->δ:Ljava/lang/String;

    .line 31
    .line 32
    :goto_1
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-virtual {v0, v1, p1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x6

    .line 40
    invoke-static {p0, p1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    int-to-float p0, p0

    .line 45
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 46
    .line 47
    .line 48
    return-object v0
.end method

.method public static β(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    sget-object v0, Lwx;->α:Lt41;

    .line 2
    .line 3
    sget-object v0, Lkz;->ε:Lkz;

    .line 4
    .line 5
    const/high16 v1, 0x200000

    .line 6
    .line 7
    const-string v2, "image/*"

    .line 8
    .line 9
    invoke-static {p0, v0, v2, v1}, Lwx;->α(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)[B

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 20
    .line 21
    array-length v2, p0

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static {p0, v3, v2, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 24
    .line 25
    .line 26
    :goto_0
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 27
    .line 28
    div-int/2addr v2, v1

    .line 29
    mul-int/lit8 v4, p1, 0x2

    .line 30
    .line 31
    if-gt v2, v4, :cond_1

    .line 32
    .line 33
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 34
    .line 35
    div-int/2addr v2, v1

    .line 36
    if-le v2, v4, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    array-length p1, p0

    .line 40
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 41
    .line 42
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 43
    .line 44
    .line 45
    iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 46
    .line 47
    invoke-static {p0, v3, p1, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_1
    :goto_1
    mul-int/lit8 v1, v1, 0x2

    .line 53
    .line 54
    goto :goto_0
.end method

.method public static final γ(Landroid/widget/RadioButton;Ljava/lang/String;Landroid/app/Activity;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 p1, 0x28

    .line 19
    .line 20
    invoke-static {p2, p1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {v0, v1, p3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 31
    .line 32
    .line 33
    const/4 p3, 0x0

    .line 34
    invoke-virtual {v0, p3, p3, p1, p1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 35
    .line 36
    .line 37
    const/16 p1, 0xa

    .line 38
    .line 39
    invoke-static {p2, p1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    invoke-virtual {p0, v0, p1, p1, p1}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void
.end method

.method public static δ(Landroid/app/Activity;Lky1;La80;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v1, Lpf1;->α:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v1

    .line 7
    :try_start_0
    sget-object v0, Lpf1;->γ:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    sget-boolean p2, Lpf1;->β:Z

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sput-boolean v0, Lpf1;->β:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    move p2, v0

    .line 22
    :goto_0
    monitor-exit v1

    .line 23
    if-nez p2, :cond_1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    sget-object p2, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-eqz p2, :cond_2

    .line 43
    .line 44
    :goto_1
    move-object v2, p2

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    goto :goto_1

    .line 55
    :goto_2
    sget-object p2, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 56
    .line 57
    invoke-static {p2}, Lex0;->Ο(Ljava/util/Map;)Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    new-instance p2, Ljava/lang/Thread;

    .line 66
    .line 67
    new-instance v1, Lvg0;

    .line 68
    .line 69
    const/4 v6, 0x5

    .line 70
    move-object v5, p0

    .line 71
    move-object v4, p1

    .line 72
    invoke-direct/range {v1 .. v6}, Lvg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 73
    .line 74
    .line 75
    const-string p0, "rb5b77f205c010489"

    .line 76
    .line 77
    invoke-direct {p2, v1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    move-object p0, v0

    .line 89
    monitor-exit v1

    .line 90
    throw p0
.end method

.method public static ε(Landroid/app/Activity;Ljava/lang/String;ZLky1;La80;)V
    .locals 17

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    invoke-static {}, Lui1;->Α()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lui1;->π(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    sget-object v0, Lx01;->α:Lx01;

    .line 20
    .line 21
    invoke-virtual {v0, v6}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 22
    .line 23
    .line 24
    move-result-object v8

    .line 25
    const/4 v0, 0x0

    .line 26
    const/4 v1, 0x0

    .line 27
    const v2, 0x7f0c0036

    .line 28
    .line 29
    .line 30
    invoke-virtual {v8, v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v12

    .line 34
    const v0, 0x7f090257

    .line 35
    .line 36
    .line 37
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Landroid/widget/TextView;

    .line 42
    .line 43
    const v1, 0x7f090256

    .line 44
    .line 45
    .line 46
    invoke-virtual {v12, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    move-object v11, v1

    .line 51
    check-cast v11, Landroid/widget/TextView;

    .line 52
    .line 53
    const v1, 0x7f090253

    .line 54
    .line 55
    .line 56
    invoke-virtual {v12, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    move-object v9, v1

    .line 61
    check-cast v9, Landroid/widget/RadioGroup;

    .line 62
    .line 63
    const v1, 0x7f090252

    .line 64
    .line 65
    .line 66
    invoke-virtual {v12, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    move-object v10, v1

    .line 71
    check-cast v10, Landroid/widget/TextView;

    .line 72
    .line 73
    const v1, 0x7f090254

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    move-object v13, v1

    .line 81
    check-cast v13, Landroid/widget/TextView;

    .line 82
    .line 83
    const v1, 0x7f09024f

    .line 84
    .line 85
    .line 86
    invoke-virtual {v12, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    move-object v15, v1

    .line 91
    check-cast v15, Landroid/widget/TextView;

    .line 92
    .line 93
    const v1, 0x7f090251

    .line 94
    .line 95
    .line 96
    invoke-virtual {v12, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    move-object v14, v1

    .line 101
    check-cast v14, Landroid/widget/TextView;

    .line 102
    .line 103
    invoke-static {v6}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object v3, v1, Lxx;->β:Ljava/lang/String;

    .line 133
    .line 134
    const/16 v4, 0x8

    .line 135
    .line 136
    invoke-static {v4, v2, v3}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v12, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 141
    .line 142
    .line 143
    iget-object v2, v1, Lxx;->ζ:Ljava/lang/String;

    .line 144
    .line 145
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 150
    .line 151
    .line 152
    iget-object v0, v1, Lxx;->η:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 159
    .line 160
    .line 161
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 166
    .line 167
    .line 168
    iget-object v2, v1, Lxx;->ι:Ljava/lang/String;

    .line 169
    .line 170
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    invoke-virtual {v13, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 175
    .line 176
    .line 177
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    invoke-virtual {v15, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 182
    .line 183
    .line 184
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    invoke-virtual {v14, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 189
    .line 190
    .line 191
    filled-new-array {v13, v15, v14}, [Landroid/widget/TextView;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-eqz v2, :cond_1

    .line 208
    .line 209
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    check-cast v2, Landroid/widget/TextView;

    .line 214
    .line 215
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    iget-object v4, v1, Lxx;->Α:Ljava/lang/String;

    .line 223
    .line 224
    const-string v5, "#00000000"

    .line 225
    .line 226
    const/4 v7, 0x6

    .line 227
    invoke-static {v7, v3, v4, v5}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 232
    .line 233
    .line 234
    goto :goto_0

    .line 235
    :cond_1
    new-instance v4, Lum1;

    .line 236
    .line 237
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 238
    .line 239
    .line 240
    invoke-static/range {p1 .. p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    iput-object v0, v4, Lum1;->ε:Ljava/lang/Object;

    .line 249
    .line 250
    new-instance v0, Lum1;

    .line 251
    .line 252
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 253
    .line 254
    .line 255
    invoke-static {}, Lgf1;->γ()Lef1;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    iput-object v2, v0, Lum1;->ε:Ljava/lang/Object;

    .line 260
    .line 261
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 262
    .line 263
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 264
    .line 265
    .line 266
    move-object v6, v1

    .line 267
    new-instance v1, Lqm1;

    .line 268
    .line 269
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 270
    .line 271
    .line 272
    move-object v3, v0

    .line 273
    new-instance v0, Lrd1;

    .line 274
    .line 275
    const/4 v7, 0x1

    .line 276
    move-object v5, v9

    .line 277
    move-object v9, v3

    .line 278
    move-object v3, v4

    .line 279
    move-object v4, v5

    .line 280
    move-object/from16 v5, p0

    .line 281
    .line 282
    invoke-direct/range {v0 .. v7}, Lrd1;-><init>(Lqm1;Ljava/util/LinkedHashMap;Lum1;Landroid/widget/RadioGroup;Landroid/app/Activity;Lxx;I)V

    .line 283
    .line 284
    .line 285
    move-object v5, v4

    .line 286
    move-object v4, v3

    .line 287
    move-object v3, v5

    .line 288
    move-object v5, v0

    .line 289
    move-object v0, v1

    .line 290
    move-object v1, v6

    .line 291
    invoke-virtual {v3, v5}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 292
    .line 293
    .line 294
    iget-object v5, v9, Lum1;->ε:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v5, Lef1;

    .line 297
    .line 298
    move-object v7, v8

    .line 299
    move-object v6, v11

    .line 300
    move-object v8, v1

    .line 301
    move-object v1, v2

    .line 302
    move-object v11, v5

    .line 303
    move-object v5, v10

    .line 304
    move-object v2, v0

    .line 305
    move-object v10, v4

    .line 306
    move-object v0, v9

    .line 307
    move-object/from16 v9, p0

    .line 308
    .line 309
    move/from16 v4, p2

    .line 310
    .line 311
    invoke-static/range {v0 .. v11}, Lpf1;->θ(Lum1;Ljava/util/LinkedHashMap;Lqm1;Landroid/widget/RadioGroup;ZLandroid/widget/TextView;Landroid/widget/TextView;Landroid/view/LayoutInflater;Lxx;Landroid/app/Activity;Lum1;Lef1;)V

    .line 312
    .line 313
    .line 314
    move-object v4, v2

    .line 315
    move-object v2, v1

    .line 316
    move-object v1, v8

    .line 317
    move-object v8, v7

    .line 318
    move-object v7, v4

    .line 319
    move-object v11, v6

    .line 320
    move-object v6, v9

    .line 321
    move-object v4, v10

    .line 322
    new-instance v9, Landroid/app/AlertDialog$Builder;

    .line 323
    .line 324
    invoke-direct {v9, v6}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v9, v12}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 328
    .line 329
    .line 330
    move-result-object v9

    .line 331
    const/4 v10, 0x1

    .line 332
    invoke-virtual {v9, v10}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 333
    .line 334
    .line 335
    move-result-object v9

    .line 336
    invoke-virtual {v9}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    move-object v10, v13

    .line 341
    move-object v13, v2

    .line 342
    move-object v2, v7

    .line 343
    move-object v7, v9

    .line 344
    move-object v9, v3

    .line 345
    move-object v3, v0

    .line 346
    new-instance v0, Llf1;

    .line 347
    .line 348
    move-object v12, v5

    .line 349
    move-object/from16 v16, v14

    .line 350
    .line 351
    move/from16 v14, p2

    .line 352
    .line 353
    move-object/from16 v5, p3

    .line 354
    .line 355
    invoke-direct/range {v0 .. v14}, Llf1;-><init>(Lxx;Lqm1;Lum1;Lum1;Lky1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/view/LayoutInflater;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/LinkedHashMap;Z)V

    .line 356
    .line 357
    .line 358
    move-object v6, v1

    .line 359
    move-object v14, v2

    .line 360
    move-object v5, v7

    .line 361
    move-object v7, v3

    .line 362
    invoke-virtual {v10, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 363
    .line 364
    .line 365
    new-instance v0, Lsa;

    .line 366
    .line 367
    const/16 v1, 0x12

    .line 368
    .line 369
    invoke-direct {v0, v5, v1}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v15, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 373
    .line 374
    .line 375
    new-instance v0, Lmf1;

    .line 376
    .line 377
    move-object/from16 v3, p0

    .line 378
    .line 379
    move/from16 v1, p2

    .line 380
    .line 381
    move-object v2, v4

    .line 382
    move-object/from16 v4, p4

    .line 383
    .line 384
    invoke-direct/range {v0 .. v5}, Lmf1;-><init>(ZLum1;Landroid/app/Activity;La80;Landroid/app/AlertDialog;)V

    .line 385
    .line 386
    .line 387
    move-object v4, v2

    .line 388
    move-object/from16 v1, v16

    .line 389
    .line 390
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 391
    .line 392
    .line 393
    new-instance v0, Lnf1;

    .line 394
    .line 395
    move-object v1, v6

    .line 396
    move-object v3, v7

    .line 397
    move-object v2, v14

    .line 398
    move-object/from16 v6, p0

    .line 399
    .line 400
    move/from16 v14, p2

    .line 401
    .line 402
    move-object v7, v5

    .line 403
    move-object/from16 v5, p3

    .line 404
    .line 405
    invoke-direct/range {v0 .. v14}, Lnf1;-><init>(Lxx;Lqm1;Lum1;Lum1;Lky1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/view/LayoutInflater;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/LinkedHashMap;Z)V

    .line 406
    .line 407
    .line 408
    move-object v5, v7

    .line 409
    invoke-virtual {v5, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v5}, Landroid/app/Dialog;->show()V

    .line 413
    .line 414
    .line 415
    return-void
.end method

.method public static final ζ(Landroid/view/LayoutInflater;Landroid/widget/RadioGroup;Lxx;Landroid/app/Activity;Lum1;Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/RadioButton;
    .locals 2

    .line 1
    const v0, 0x7f0c0058

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Landroid/widget/RadioButton;

    .line 13
    .line 14
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v0}, Landroid/view/View;->setId(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {p6, p7, p2}, Ljx0;->е(Ljava/lang/String;Ljava/lang/String;Lxx;)Landroid/text/SpannableString;

    .line 22
    .line 23
    .line 24
    move-result-object p6

    .line 25
    invoke-virtual {p0, p6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    const/4 p6, 0x2

    .line 29
    invoke-static {p3, p6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 30
    .line 31
    .line 32
    move-result p6

    .line 33
    int-to-float p6, p6

    .line 34
    const/high16 p7, 0x3f800000    # 1.0f

    .line 35
    .line 36
    invoke-virtual {p0, p6, p7}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 37
    .line 38
    .line 39
    iget-object p6, p2, Lxx;->ζ:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result p6

    .line 45
    invoke-virtual {p0, p6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 46
    .line 47
    .line 48
    new-instance p6, Landroid/content/res/ColorStateList;

    .line 49
    .line 50
    const p7, 0x10100a0

    .line 51
    .line 52
    .line 53
    filled-new-array {p7}, [I

    .line 54
    .line 55
    .line 56
    move-result-object p7

    .line 57
    new-array v0, v1, [I

    .line 58
    .line 59
    filled-new-array {p7, v0}, [[I

    .line 60
    .line 61
    .line 62
    move-result-object p7

    .line 63
    iget-object v0, p2, Lxx;->ι:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iget-object v1, p2, Lxx;->η:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    filled-new-array {v0, v1}, [I

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-direct {p6, p7, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p6}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    .line 83
    .line 84
    .line 85
    iget-object p6, p4, Lum1;->ε:Ljava/lang/Object;

    .line 86
    .line 87
    invoke-virtual {p8, p6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p6

    .line 91
    invoke-static {p3, p2, p6}, Lpf1;->α(Landroid/app/Activity;Lxx;Z)Landroid/graphics/drawable/GradientDrawable;

    .line 92
    .line 93
    .line 94
    move-result-object p6

    .line 95
    invoke-virtual {p0, p6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 99
    .line 100
    .line 101
    move-result p6

    .line 102
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object p6

    .line 106
    invoke-interface {p5, p6, p8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-object p7, p2

    .line 110
    move-object p2, p4

    .line 111
    move-object p4, p1

    .line 112
    new-instance p1, Lcl0;

    .line 113
    .line 114
    move-object p6, p3

    .line 115
    move-object p3, p8

    .line 116
    const/4 p8, 0x2

    .line 117
    move-object p5, p0

    .line 118
    invoke-direct/range {p1 .. p8}, Lcl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p5, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 122
    .line 123
    .line 124
    return-object p5
.end method

.method public static final η(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/app/Activity;Lky1;Landroid/app/AlertDialog;Lum1;Ljava/util/LinkedHashMap;Lqm1;Landroid/widget/RadioGroup;ZLandroid/widget/TextView;Landroid/view/LayoutInflater;Lxx;Lum1;Z)V
    .locals 15

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 3
    .line 4
    .line 5
    const v0, 0x3ee66666    # 0.45f

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 9
    .line 10
    .line 11
    const-string v0, "\u66f4\u65b0\u4e2d"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "\u6b63\u5728\u901a\u8fc7\u5bbf\u4e3b\u83b7\u53d6\u6700\u65b0\u98df\u7269\u76ee\u5f55..."

    .line 17
    .line 18
    move-object/from16 v11, p1

    .line 19
    .line 20
    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lof1;

    .line 24
    .line 25
    move-object v2, p0

    .line 26
    move-object/from16 v4, p2

    .line 27
    .line 28
    move-object/from16 v1, p4

    .line 29
    .line 30
    move-object/from16 v5, p5

    .line 31
    .line 32
    move-object/from16 v6, p6

    .line 33
    .line 34
    move-object/from16 v7, p7

    .line 35
    .line 36
    move-object/from16 v8, p8

    .line 37
    .line 38
    move/from16 v9, p9

    .line 39
    .line 40
    move-object/from16 v10, p10

    .line 41
    .line 42
    move-object/from16 v12, p11

    .line 43
    .line 44
    move-object/from16 v13, p12

    .line 45
    .line 46
    move-object/from16 v14, p13

    .line 47
    .line 48
    move/from16 v3, p14

    .line 49
    .line 50
    invoke-direct/range {v0 .. v14}, Lof1;-><init>(Landroid/app/AlertDialog;Landroid/widget/TextView;ZLandroid/app/Activity;Lum1;Ljava/util/LinkedHashMap;Lqm1;Landroid/widget/RadioGroup;ZLandroid/widget/TextView;Landroid/widget/TextView;Landroid/view/LayoutInflater;Lxx;Lum1;)V

    .line 51
    .line 52
    .line 53
    move-object v1, v0

    .line 54
    move-object/from16 v0, p3

    .line 55
    .line 56
    invoke-static {v4, v0, v1}, Lpf1;->δ(Landroid/app/Activity;Lky1;La80;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public static final θ(Lum1;Ljava/util/LinkedHashMap;Lqm1;Landroid/widget/RadioGroup;ZLandroid/widget/TextView;Landroid/widget/TextView;Landroid/view/LayoutInflater;Lxx;Landroid/app/Activity;Lum1;Lef1;)V
    .locals 16

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move-object/from16 v10, p11

    .line 6
    .line 7
    iput-object v10, v1, Lum1;->ε:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Ljava/util/LinkedHashMap;->clear()V

    .line 10
    .line 11
    .line 12
    const/4 v11, 0x1

    .line 13
    iput-boolean v11, v0, Lqm1;->ε:Z

    .line 14
    .line 15
    invoke-virtual/range {p3 .. p3}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p3 .. p3}, Landroid/widget/RadioGroup;->clearCheck()V

    .line 19
    .line 20
    .line 21
    if-eqz p4, :cond_0

    .line 22
    .line 23
    const-string v7, "\u8ddf\u968f\u5168\u5c40\u9ed8\u8ba4"

    .line 24
    .line 25
    const-string v8, "\u7531\u8bbe\u7f6e\u9875\u7684\u9ed8\u8ba4\u6295\u5582\u98df\u7269\u51b3\u5b9a"

    .line 26
    .line 27
    const-string v9, ""

    .line 28
    .line 29
    move-object/from16 v6, p1

    .line 30
    .line 31
    move-object/from16 v2, p3

    .line 32
    .line 33
    move-object/from16 v1, p7

    .line 34
    .line 35
    move-object/from16 v3, p8

    .line 36
    .line 37
    move-object/from16 v4, p9

    .line 38
    .line 39
    move-object/from16 v5, p10

    .line 40
    .line 41
    invoke-static/range {v1 .. v9}, Lpf1;->ζ(Landroid/view/LayoutInflater;Landroid/widget/RadioGroup;Lxx;Landroid/app/Activity;Lum1;Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/RadioButton;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-virtual {v2, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-object/from16 v2, p3

    .line 50
    .line 51
    :goto_0
    const-string v7, "\u667a\u80fd\u9009\u62e9"

    .line 52
    .line 53
    const-string v8, "\u6309\u4ef7\u683c\u4e0a\u9650\u4f18\u5148\u9009\u62e9\u4eb2\u5bc6\u5ea6 / \u706b\u661f\u6700\u9ad8\u7684\u98df\u7269\uff1b\u514d\u8d39\u98df\u7269\u4f18\u5148"

    .line 54
    .line 55
    const-string v9, "__smart__"

    .line 56
    .line 57
    move-object/from16 v6, p1

    .line 58
    .line 59
    move-object/from16 v1, p7

    .line 60
    .line 61
    move-object/from16 v3, p8

    .line 62
    .line 63
    move-object/from16 v4, p9

    .line 64
    .line 65
    move-object/from16 v5, p10

    .line 66
    .line 67
    invoke-static/range {v1 .. v9}, Lpf1;->ζ(Landroid/view/LayoutInflater;Landroid/widget/RadioGroup;Lxx;Landroid/app/Activity;Lum1;Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/RadioButton;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-virtual {v2, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, v10, Lef1;->α:Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v12

    .line 80
    :cond_1
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    const/4 v13, 0x0

    .line 85
    const/4 v14, 0x0

    .line 86
    if-eqz v1, :cond_13

    .line 87
    .line 88
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    move-object v15, v1

    .line 93
    check-cast v15, Ldf1;

    .line 94
    .line 95
    iget-object v1, v15, Ldf1;->γ:Ljava/lang/Integer;

    .line 96
    .line 97
    if-nez v1, :cond_2

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-nez v3, :cond_3

    .line 105
    .line 106
    const-string v1, "\u6700\u8fd1\u4ef7\u683c\uff1a\u514d\u8d39"

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_3
    :goto_2
    if-nez v1, :cond_4

    .line 110
    .line 111
    const-string v1, "\u6700\u8fd1\u4ef7\u683c\uff1a\u5f85\u5237\u65b0"

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    iget-object v1, v15, Ldf1;->γ:Ljava/lang/Integer;

    .line 115
    .line 116
    new-instance v3, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v4, "\u6700\u8fd1\u4ef7\u683c\uff1a"

    .line 119
    .line 120
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v1, " \u706b\u661f"

    .line 127
    .line 128
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    :goto_3
    iget-object v3, v15, Ldf1;->δ:Ljava/lang/Integer;

    .line 136
    .line 137
    if-eqz v3, :cond_8

    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-gtz v3, :cond_5

    .line 144
    .line 145
    const-string v3, ""

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_5
    const v4, 0x15180

    .line 149
    .line 150
    .line 151
    rem-int v5, v3, v4

    .line 152
    .line 153
    if-nez v5, :cond_6

    .line 154
    .line 155
    div-int/2addr v3, v4

    .line 156
    const-string v4, " \u5929"

    .line 157
    .line 158
    invoke-static {v4, v3}, Llz1;->λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    goto :goto_4

    .line 163
    :cond_6
    rem-int/lit16 v4, v3, 0xe10

    .line 164
    .line 165
    if-nez v4, :cond_7

    .line 166
    .line 167
    div-int/lit16 v3, v3, 0xe10

    .line 168
    .line 169
    const-string v4, " \u5c0f\u65f6"

    .line 170
    .line 171
    invoke-static {v4, v3}, Llz1;->λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    goto :goto_4

    .line 176
    :cond_7
    div-int/lit8 v3, v3, 0x3c

    .line 177
    .line 178
    const-string v4, " \u5206\u949f"

    .line 179
    .line 180
    invoke-static {v4, v3}, Llz1;->λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    goto :goto_4

    .line 185
    :cond_8
    move-object v3, v14

    .line 186
    :goto_4
    if-nez v3, :cond_9

    .line 187
    .line 188
    const-string v3, ""

    .line 189
    .line 190
    :cond_9
    iget-object v4, v15, Ldf1;->ε:Ljava/lang/Integer;

    .line 191
    .line 192
    if-eqz v4, :cond_a

    .line 193
    .line 194
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    const-string v5, "+"

    .line 199
    .line 200
    const-string v6, " \u4eb2\u5bc6\u5ea6"

    .line 201
    .line 202
    invoke-static {v5, v4, v6}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    goto :goto_5

    .line 207
    :cond_a
    move-object v4, v14

    .line 208
    :goto_5
    if-nez v4, :cond_b

    .line 209
    .line 210
    const-string v4, ""

    .line 211
    .line 212
    :cond_b
    iget-object v5, v15, Ldf1;->η:Ljava/lang/String;

    .line 213
    .line 214
    if-nez v5, :cond_c

    .line 215
    .line 216
    const-string v5, ""

    .line 217
    .line 218
    :cond_c
    filled-new-array {v1, v3, v4, v5}, [Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    new-instance v3, Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    :cond_d
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-eqz v4, :cond_e

    .line 240
    .line 241
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    move-object v5, v4

    .line 246
    check-cast v5, Ljava/lang/String;

    .line 247
    .line 248
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    if-nez v5, :cond_d

    .line 253
    .line 254
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_e
    const-string v4, " \u00b7 "

    .line 259
    .line 260
    const/4 v8, 0x0

    .line 261
    const/16 v9, 0x3e

    .line 262
    .line 263
    const/4 v5, 0x0

    .line 264
    const/4 v6, 0x0

    .line 265
    const/4 v7, 0x0

    .line 266
    invoke-static/range {v3 .. v9}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v8

    .line 270
    iget-object v1, v15, Ldf1;->β:Ljava/lang/String;

    .line 271
    .line 272
    iget-object v3, v15, Ldf1;->α:Ljava/lang/String;

    .line 273
    .line 274
    const-string v4, "  #"

    .line 275
    .line 276
    invoke-static {v1, v4, v3}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    iget-object v9, v15, Ldf1;->α:Ljava/lang/String;

    .line 281
    .line 282
    move-object/from16 v6, p1

    .line 283
    .line 284
    move-object/from16 v1, p7

    .line 285
    .line 286
    move-object/from16 v3, p8

    .line 287
    .line 288
    move-object/from16 v4, p9

    .line 289
    .line 290
    move-object/from16 v5, p10

    .line 291
    .line 292
    invoke-static/range {v1 .. v9}, Lpf1;->ζ(Landroid/view/LayoutInflater;Landroid/widget/RadioGroup;Lxx;Landroid/app/Activity;Lum1;Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/RadioButton;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    invoke-virtual {v2, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 297
    .line 298
    .line 299
    iget-object v1, v15, Ldf1;->ζ:Ljava/lang/String;

    .line 300
    .line 301
    if-eqz v1, :cond_1

    .line 302
    .line 303
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    if-eqz v1, :cond_1

    .line 312
    .line 313
    const-string v3, "https://"

    .line 314
    .line 315
    invoke-static {v1, v3, v11}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    if-nez v3, :cond_f

    .line 320
    .line 321
    const-string v3, "http://"

    .line 322
    .line 323
    invoke-static {v1, v3, v11}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    if-nez v3, :cond_f

    .line 328
    .line 329
    const-string v3, "//"

    .line 330
    .line 331
    invoke-static {v1, v3, v13}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    if-eqz v3, :cond_10

    .line 336
    .line 337
    :cond_f
    move-object v14, v1

    .line 338
    :cond_10
    if-nez v14, :cond_11

    .line 339
    .line 340
    goto/16 :goto_1

    .line 341
    .line 342
    :cond_11
    invoke-virtual {v7, v14}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    sget-object v1, Lpf1;->ε:Lwd1;

    .line 346
    .line 347
    monitor-enter v1

    .line 348
    :try_start_0
    invoke-virtual {v1, v14}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    check-cast v3, Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 353
    .line 354
    monitor-exit v1

    .line 355
    if-eqz v3, :cond_12

    .line 356
    .line 357
    invoke-static {v7, v14, v4, v3}, Lpf1;->γ(Landroid/widget/RadioButton;Ljava/lang/String;Landroid/app/Activity;Landroid/graphics/Bitmap;)V

    .line 358
    .line 359
    .line 360
    goto/16 :goto_1

    .line 361
    .line 362
    :cond_12
    sget-object v1, Lpf1;->δ:Ljava/util/concurrent/ExecutorService;

    .line 363
    .line 364
    new-instance v3, Le9;

    .line 365
    .line 366
    const/16 v5, 0x1c

    .line 367
    .line 368
    invoke-direct {v3, v14, v4, v7, v5}, Le9;-><init>(Ljava/lang/Object;Landroid/content/Context;Ljava/lang/Object;I)V

    .line 369
    .line 370
    .line 371
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 372
    .line 373
    .line 374
    goto/16 :goto_1

    .line 375
    .line 376
    :catchall_0
    move-exception v0

    .line 377
    monitor-exit v1

    .line 378
    throw v0

    .line 379
    :cond_13
    move-object/from16 v4, p9

    .line 380
    .line 381
    invoke-virtual/range {p1 .. p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    check-cast v1, Ljava/lang/Iterable;

    .line 389
    .line 390
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    :cond_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 395
    .line 396
    .line 397
    move-result v3

    .line 398
    if-eqz v3, :cond_15

    .line 399
    .line 400
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    move-object v5, v3

    .line 405
    check-cast v5, Ljava/util/Map$Entry;

    .line 406
    .line 407
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v5

    .line 411
    move-object/from16 v6, p10

    .line 412
    .line 413
    iget-object v7, v6, Lum1;->ε:Ljava/lang/Object;

    .line 414
    .line 415
    invoke-static {v5, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v5

    .line 419
    if-eqz v5, :cond_14

    .line 420
    .line 421
    goto :goto_7

    .line 422
    :cond_15
    move-object v3, v14

    .line 423
    :goto_7
    check-cast v3, Ljava/util/Map$Entry;

    .line 424
    .line 425
    if-eqz v3, :cond_16

    .line 426
    .line 427
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    move-object v14, v1

    .line 432
    check-cast v14, Ljava/lang/Integer;

    .line 433
    .line 434
    :cond_16
    if-eqz v14, :cond_17

    .line 435
    .line 436
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 437
    .line 438
    .line 439
    move-result v1

    .line 440
    invoke-virtual {v2, v1}, Landroid/widget/RadioGroup;->check(I)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    move-object/from16 v3, p8

    .line 448
    .line 449
    invoke-static {v2, v4, v3, v1}, Lpf1;->ι(Landroid/widget/RadioGroup;Landroid/app/Activity;Lxx;I)V

    .line 450
    .line 451
    .line 452
    :cond_17
    iget-object v1, v10, Lef1;->α:Ljava/util/List;

    .line 453
    .line 454
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    if-eqz v1, :cond_18

    .line 459
    .line 460
    move v1, v13

    .line 461
    :goto_8
    move-object/from16 v2, p5

    .line 462
    .line 463
    goto :goto_9

    .line 464
    :cond_18
    const/16 v1, 0x8

    .line 465
    .line 466
    goto :goto_8

    .line 467
    :goto_9
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 468
    .line 469
    .line 470
    iget-wide v1, v10, Lef1;->β:J

    .line 471
    .line 472
    const-wide/16 v3, 0x0

    .line 473
    .line 474
    cmp-long v1, v1, v3

    .line 475
    .line 476
    if-lez v1, :cond_19

    .line 477
    .line 478
    iget-object v1, v10, Lef1;->α:Ljava/util/List;

    .line 479
    .line 480
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 481
    .line 482
    .line 483
    move-result v1

    .line 484
    const-string v2, "\u5df2\u7f13\u5b58 "

    .line 485
    .line 486
    const-string v3, " \u79cd\u98df\u7269\uff0c\u5b9e\u9645\u6295\u5582\u524d\u4f1a\u91cd\u65b0\u6821\u9a8c\u4ef7\u683c"

    .line 487
    .line 488
    invoke-static {v2, v1, v3}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    :goto_a
    move-object/from16 v2, p6

    .line 493
    .line 494
    goto :goto_b

    .line 495
    :cond_19
    const-string v1, "\u9996\u6b21\u6253\u5f00\u5c06\u81ea\u52a8\u83b7\u53d6\u98df\u7269\u76ee\u5f55"

    .line 496
    .line 497
    goto :goto_a

    .line 498
    :goto_b
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 499
    .line 500
    .line 501
    iput-boolean v13, v0, Lqm1;->ε:Z

    .line 502
    .line 503
    return-void
.end method

.method public static final ι(Landroid/widget/RadioGroup;Landroid/app/Activity;Lxx;I)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    instance-of v4, v3, Landroid/widget/RadioButton;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Landroid/widget/RadioButton;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 v3, 0x0

    .line 21
    :goto_1
    if-nez v3, :cond_1

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-ne v4, p3, :cond_2

    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move v4, v1

    .line 33
    :goto_2
    invoke-static {p1, p2, v4}, Lpf1;->α(Landroid/app/Activity;Lxx;Z)Landroid/graphics/drawable/GradientDrawable;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 38
    .line 39
    .line 40
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    return-void
.end method
