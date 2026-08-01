.class public abstract Lg2;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:Ljava/util/Set;

.field public static final b:Ljava/util/Set;

.field public static final c:Ljava/util/concurrent/ExecutorService;

.field public static final d:Landroid/os/Handler;

.field public static final e:Ljava/util/Map;

.field public static volatile f:Z

.field public static volatile g:Z

.field public static volatile h:Lf2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lg2;->a:Ljava/util/Set;

    .line 15
    .line 16
    new-instance v0, Ljava/util/WeakHashMap;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lg2;->b:Ljava/util/Set;

    .line 30
    .line 31
    new-instance v0, Ln1;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, v1}, Ln1;-><init>(I)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lg2;->c:Ljava/util/concurrent/ExecutorService;

    .line 43
    .line 44
    new-instance v0, Landroid/os/Handler;

    .line 45
    .line 46
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lg2;->d:Landroid/os/Handler;

    .line 54
    .line 55
    new-instance v0, Ly1;

    .line 56
    .line 57
    const/high16 v1, 0x3f400000    # 0.75f

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    const/16 v3, 0x18

    .line 61
    .line 62
    invoke-direct {v0, v3, v1, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Lg2;->e:Ljava/util/Map;

    .line 70
    .line 71
    return-void
.end method

.method public static a(I[B)Landroid/graphics/Bitmap;
    .locals 7

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    if-gtz p0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 16
    .line 17
    array-length v2, p1

    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-static {p1, v3, v2, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 20
    .line 21
    .line 22
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 23
    .line 24
    if-lez v2, :cond_4

    .line 25
    .line 26
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 27
    .line 28
    if-gtz v2, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    .line 32
    .line 33
    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 34
    .line 35
    .line 36
    iput v1, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 37
    .line 38
    iget v1, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 39
    .line 40
    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 41
    .line 42
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    :goto_0
    iget v1, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 47
    .line 48
    const/4 v4, 0x2

    .line 49
    mul-int/2addr v1, v4

    .line 50
    div-int v5, v0, v1

    .line 51
    .line 52
    mul-int/lit8 v6, p0, 0x2

    .line 53
    .line 54
    if-lt v5, v6, :cond_2

    .line 55
    .line 56
    iput v1, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    array-length v0, p1

    .line 60
    invoke-static {p1, v3, v0, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-nez p1, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static {p1, p0, p0, v4}, Landroid/media/ThumbnailUtils;->extractThumbnail(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 73
    return-object p0
.end method

.method public static b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ly;
    .locals 7

    .line 1
    new-instance v0, Landroid/app/Dialog;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Landroid/widget/LinearLayout;

    .line 11
    .line 12
    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 17
    .line 18
    .line 19
    const/high16 v3, 0x41a00000    # 20.0f

    .line 20
    .line 21
    invoke-static {p0, v3}, Lg2;->g(Landroid/content/Context;F)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/high16 v5, 0x41900000    # 18.0f

    .line 26
    .line 27
    invoke-static {p0, v5}, Lg2;->g(Landroid/content/Context;F)I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    invoke-static {p0, v3}, Lg2;->g(Landroid/content/Context;F)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-static {p0, v5}, Lg2;->g(Landroid/content/Context;F)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-virtual {v2, v4, v6, v3, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 40
    .line 41
    .line 42
    const/high16 v3, 0x41800000    # 16.0f

    .line 43
    .line 44
    invoke-static {p0, v3}, Lg2;->g(Landroid/content/Context;F)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const/4 v4, -0x1

    .line 49
    invoke-static {v4, v3, v1, v1}, Lg2;->n(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 54
    .line 55
    .line 56
    const/16 v3, 0x19

    .line 57
    .line 58
    const/16 v5, 0x1e

    .line 59
    .line 60
    const/16 v6, 0x17

    .line 61
    .line 62
    invoke-static {v6, v3, v5}, Landroid/graphics/Color;->rgb(III)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    const/16 v5, 0x15

    .line 67
    .line 68
    invoke-static {p0, p1, v5, v3}, Lg2;->q(Landroid/content/Context;Ljava/lang/String;II)Landroid/widget/TextView;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    sget-object v3, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 73
    .line 74
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 75
    .line 76
    .line 77
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 78
    .line 79
    const/4 v5, -0x2

    .line 80
    invoke-direct {v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, p1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 84
    .line 85
    .line 86
    const/16 p1, 0x63

    .line 87
    .line 88
    const/16 v3, 0x70

    .line 89
    .line 90
    const/16 v6, 0x5d

    .line 91
    .line 92
    invoke-static {v6, p1, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    const/16 v3, 0xe

    .line 97
    .line 98
    invoke-static {p0, p2, v3, p1}, Lg2;->q(Landroid/content/Context;Ljava/lang/String;II)Landroid/widget/TextView;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const/high16 p2, 0x40400000    # 3.0f

    .line 103
    .line 104
    invoke-static {p0, p2}, Lg2;->g(Landroid/content/Context;F)I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    int-to-float p2, p2

    .line 109
    const/high16 v3, 0x3f800000    # 1.0f

    .line 110
    .line 111
    invoke-virtual {p1, p2, v3}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 112
    .line 113
    .line 114
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    .line 115
    .line 116
    invoke-direct {p2, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 117
    .line 118
    .line 119
    const/high16 v3, 0x41000000    # 8.0f

    .line 120
    .line 121
    invoke-static {p0, v3}, Lg2;->g(Landroid/content/Context;F)I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    iput p0, p2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 126
    .line 127
    invoke-virtual {v2, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 131
    .line 132
    .line 133
    new-instance p0, Ly;

    .line 134
    .line 135
    invoke-direct {p0, v0, v2, v1}, Ly;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 136
    .line 137
    .line 138
    return-object p0
.end method

.method public static c(Landroid/content/Context;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 2
    .line 3
    const/high16 v1, 0x42280000    # 42.0f

    .line 4
    .line 5
    invoke-static {p0, v1}, Lg2;->g(Landroid/content/Context;F)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, -0x1

    .line 10
    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 11
    .line 12
    .line 13
    const/high16 v1, 0x41800000    # 16.0f

    .line 14
    .line 15
    invoke-static {p0, v1}, Lg2;->g(Landroid/content/Context;F)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    iput p0, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 20
    .line 21
    return-object v0
.end method

.method public static d(Le2;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    iget-object v0, p0, Le2;->i:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Le2;->b:Landroid/app/Activity;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/16 v2, 0x7d

    .line 12
    .line 13
    const/16 v3, 0xe8

    .line 14
    .line 15
    const/16 v4, 0x2d

    .line 16
    .line 17
    :goto_0
    invoke-static {v4, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/16 v2, 0x59

    .line 23
    .line 24
    const/16 v3, 0x64

    .line 25
    .line 26
    const/16 v4, 0x53

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    const/16 v3, 0xd

    .line 30
    .line 31
    invoke-static {v1, p1, v3, v2}, Lg2;->q(Landroid/content/Context;Ljava/lang/String;II)Landroid/widget/TextView;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const/16 v2, 0x11

    .line 36
    .line 37
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 38
    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 42
    .line 43
    .line 44
    const/high16 v2, 0x41400000    # 12.0f

    .line 45
    .line 46
    invoke-static {v1, v2}, Lg2;->g(Landroid/content/Context;F)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-static {v1, v2}, Lg2;->g(Landroid/content/Context;F)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    const/4 v4, 0x0

    .line 55
    invoke-virtual {p1, v3, v4, v2, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 56
    .line 57
    .line 58
    const/16 v2, 0xf5

    .line 59
    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    const/16 v3, 0xec

    .line 63
    .line 64
    const/16 v5, 0xff

    .line 65
    .line 66
    invoke-static {v3, v2, v5}, Landroid/graphics/Color;->rgb(III)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    goto :goto_2

    .line 71
    :cond_1
    const/16 v3, 0xf6

    .line 72
    .line 73
    const/16 v5, 0xf9

    .line 74
    .line 75
    invoke-static {v2, v3, v5}, Landroid/graphics/Color;->rgb(III)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    :goto_2
    const/high16 v3, 0x41100000    # 9.0f

    .line 80
    .line 81
    invoke-static {v1, v3}, Lg2;->g(Landroid/content/Context;F)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    const/16 v5, 0xd6

    .line 88
    .line 89
    const/16 v6, 0xfa

    .line 90
    .line 91
    const/16 v7, 0xb8

    .line 92
    .line 93
    invoke-static {v7, v5, v6}, Landroid/graphics/Color;->rgb(III)I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    goto :goto_3

    .line 98
    :cond_2
    move v5, v4

    .line 99
    :goto_3
    if-eqz v0, :cond_3

    .line 100
    .line 101
    const/high16 v0, 0x3f800000    # 1.0f

    .line 102
    .line 103
    invoke-static {v1, v0}, Lg2;->g(Landroid/content/Context;F)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    goto :goto_4

    .line 108
    :cond_3
    move v0, v4

    .line 109
    :goto_4
    invoke-static {v2, v3, v5, v0}, Lg2;->n(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 114
    .line 115
    .line 116
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 117
    .line 118
    const/high16 v2, 0x42000000    # 32.0f

    .line 119
    .line 120
    invoke-static {v1, v2}, Lg2;->g(Landroid/content/Context;F)I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    const/4 v3, -0x2

    .line 125
    invoke-direct {v0, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 126
    .line 127
    .line 128
    const/high16 v2, 0x40e00000    # 7.0f

    .line 129
    .line 130
    invoke-static {v1, v2}, Lg2;->g(Landroid/content/Context;F)I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 135
    .line 136
    iget-object v1, p0, Le2;->f:Landroid/widget/LinearLayout;

    .line 137
    .line 138
    invoke-virtual {v1, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 139
    .line 140
    .line 141
    new-instance v0, Lu1;

    .line 142
    .line 143
    invoke-direct {v0, p2, p0, v4}, Lu1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method public static e(Landroid/view/View;I)Ljava/lang/String;
    .locals 6

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    if-le p1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    :cond_1
    instance-of v1, p0, Landroid/widget/TextView;

    .line 22
    .line 23
    const/16 v2, 0x20

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    move-object v1, p0

    .line 31
    check-cast v1, Landroid/widget/TextView;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    :cond_2
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    check-cast p0, Landroid/view/ViewGroup;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const/16 v3, 0xc

    .line 51
    .line 52
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    const/4 v3, 0x0

    .line 57
    :goto_0
    if-ge v3, v1, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    add-int/lit8 v5, p1, 0x1

    .line 67
    .line 68
    invoke-static {v4, v5}, Lg2;->e(Landroid/view/View;I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :cond_4
    :goto_1
    const-string p0, ""

    .line 84
    .line 85
    return-object p0
.end method

.method public static f(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 5

    .line 1
    const/16 v0, 0x74

    .line 2
    .line 3
    const/16 v1, 0xe8

    .line 4
    .line 5
    const/16 v2, 0x2a

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0xe

    .line 12
    .line 13
    invoke-static {p0, p1, v1, v0}, Lg2;->q(Landroid/content/Context;Ljava/lang/String;II)Landroid/widget/TextView;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/16 v0, 0x11

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 25
    .line 26
    .line 27
    const/16 v0, 0xff

    .line 28
    .line 29
    const/16 v1, 0xf1

    .line 30
    .line 31
    const/16 v2, 0xf7

    .line 32
    .line 33
    invoke-static {v1, v2, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/high16 v1, 0x41100000    # 9.0f

    .line 38
    .line 39
    invoke-static {p0, v1}, Lg2;->g(Landroid/content/Context;F)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/16 v3, 0xd9

    .line 44
    .line 45
    const/16 v4, 0xe5

    .line 46
    .line 47
    invoke-static {v3, v4, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const/high16 v3, 0x3f800000    # 1.0f

    .line 52
    .line 53
    invoke-static {p0, v3}, Lg2;->g(Landroid/content/Context;F)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {v0, v1, v2, p0}, Lg2;->n(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 62
    .line 63
    .line 64
    return-object p1
.end method

.method public static g(Landroid/content/Context;F)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    mul-float/2addr p1, p0

    .line 12
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    const/4 p1, 0x1

    .line 17
    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public static h(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    array-length v3, p0

    .line 13
    if-ge v2, v3, :cond_1

    .line 14
    .line 15
    aget-object v3, p0, v2

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    aget-object v4, p0, v2

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    if-ne v4, v5, :cond_0

    .line 30
    .line 31
    aget-object v4, p0, v2

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_0

    .line 42
    .line 43
    array-length v4, v3

    .line 44
    const/4 v5, 0x3

    .line 45
    if-ne v4, v5, :cond_0

    .line 46
    .line 47
    aget-object v4, v3, v1

    .line 48
    .line 49
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    if-ne v4, v5, :cond_0

    .line 52
    .line 53
    const/4 v4, 0x1

    .line 54
    aget-object v4, v3, v4

    .line 55
    .line 56
    const-class v5, Ljava/lang/String;

    .line 57
    .line 58
    if-ne v4, v5, :cond_0

    .line 59
    .line 60
    const/4 v4, 0x2

    .line 61
    aget-object v3, v3, v4

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_0

    .line 68
    .line 69
    aget-object v3, p0, v2

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    return-object v0
.end method

.method public static declared-synchronized i(Ljava/lang/ClassLoader;)V
    .locals 9

    .line 1
    const-class v0, Lg2;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    const-class v1, Lg2;

    .line 9
    .line 10
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 11
    :try_start_1
    sget-boolean v2, Lg2;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :try_start_3
    new-instance v2, Lk;

    .line 20
    .line 21
    invoke-direct {v2, v3}, Lk;-><init>(I)V

    .line 22
    .line 23
    .line 24
    const/16 v5, 0x2057

    .line 25
    .line 26
    invoke-static {v5, v2}, Ld;->a(ILc;)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-ltz v2, :cond_2

    .line 31
    .line 32
    move v2, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    move v2, v4

    .line 35
    :goto_0
    sput-boolean v2, Lg2;->g:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 36
    .line 37
    :try_start_4
    monitor-exit v1

    .line 38
    :goto_1
    sget-boolean v1, Lg2;->f:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    monitor-exit v0

    .line 43
    return-void

    .line 44
    :cond_3
    :try_start_5
    const-string v1, "com.tencent.qqnt.aio.shortcutbar.PanelIconLinearLayout"

    .line 45
    .line 46
    invoke-static {v1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-nez v1, :cond_4

    .line 51
    .line 52
    const-string p0, "cloud sticker panel unavailable: shortcut bar missing"

    .line 53
    .line 54
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 55
    .line 56
    .line 57
    monitor-exit v0

    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    goto :goto_5

    .line 61
    :cond_4
    :try_start_6
    invoke-static {v1}, Lg2;->h(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    move v2, v4

    .line 66
    move v5, v2

    .line 67
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-ge v2, v6, :cond_6

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    check-cast v6, Ljava/lang/reflect/Method;

    .line 78
    .line 79
    invoke-static {v6}, Lg2;->l(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    sget-object v8, Lg2;->a:Ljava/util/Set;

    .line 84
    .line 85
    invoke-interface {v8, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 89
    if-nez v8, :cond_5

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_5
    :try_start_7
    invoke-virtual {v6, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 93
    .line 94
    .line 95
    new-instance v8, Lz1;

    .line 96
    .line 97
    invoke-direct {v8, p0}, Lz1;-><init>(Ljava/lang/ClassLoader;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v6, v8}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 101
    .line 102
    .line 103
    add-int/lit8 v5, v5, 0x1

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :catchall_1
    move-exception v6

    .line 107
    :try_start_8
    sget-object v8, Lg2;->a:Ljava/util/Set;

    .line 108
    .line 109
    invoke-interface {v8, v7}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    const-string v7, "cloud-sticker"

    .line 113
    .line 114
    const-string v8, "hook-shortcut-bind"

    .line 115
    .line 116
    invoke-static {v7, v8, v6}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_6
    if-lez v5, :cond_7

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_7
    move v3, v4

    .line 126
    :goto_4
    sput-boolean v3, Lg2;->f:Z

    .line 127
    .line 128
    sget-boolean p0, Lg2;->f:Z

    .line 129
    .line 130
    if-eqz p0, :cond_8

    .line 131
    .line 132
    new-instance p0, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    const-string v1, "cloud sticker precise shortcut hook installed count="

    .line 138
    .line 139
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 150
    .line 151
    .line 152
    :cond_8
    monitor-exit v0

    .line 153
    return-void

    .line 154
    :goto_5
    :try_start_9
    const-string v1, "cloud-sticker"

    .line 155
    .line 156
    const-string v2, "install"

    .line 157
    .line 158
    invoke-static {v1, v2, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 159
    .line 160
    .line 161
    monitor-exit v0

    .line 162
    return-void

    .line 163
    :catchall_2
    move-exception p0

    .line 164
    goto :goto_6

    .line 165
    :catchall_3
    move-exception p0

    .line 166
    :try_start_a
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 167
    :try_start_b
    throw p0

    .line 168
    :goto_6
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 169
    throw p0
.end method

.method public static j(Le2;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Le2;->a:Landroid/app/Dialog;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-nez p1, :cond_1

    .line 11
    .line 12
    const-string p1, ""

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/16 v1, 0x28

    .line 24
    .line 25
    if-gt v0, v1, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :goto_0
    iput-object p1, p0, Le2;->h:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v0, p0, Le2;->i:Ljava/lang/String;

    .line 36
    .line 37
    iget v1, p0, Le2;->j:I

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    iput v1, p0, Le2;->j:I

    .line 42
    .line 43
    iget-object v2, p0, Le2;->g:Landroid/widget/TextView;

    .line 44
    .line 45
    const-string v3, "\u6b63\u5728\u52a0\u8f7d"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, Le2;->e:Landroid/widget/GridLayout;

    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 53
    .line 54
    .line 55
    new-instance v2, Ld2;

    .line 56
    .line 57
    invoke-direct {v2, p1, v0, p0, v1}, Ld2;-><init>(Ljava/lang/String;Ljava/lang/String;Le2;I)V

    .line 58
    .line 59
    .line 60
    sget-object p0, Lg2;->c:Ljava/util/concurrent/ExecutorService;

    .line 61
    .line 62
    invoke-interface {p0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static k(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object p0

    .line 19
    :cond_1
    :goto_0
    const-string p0, "\u4e91\u7aef\u8868\u60c5\u670d\u52a1\u6682\u65f6\u4e0d\u53ef\u7528"

    .line 20
    .line 21
    return-object p0
.end method

.method public static l(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/16 v1, 0x23

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const/16 v1, 0x28

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v2, 0x0

    .line 36
    :goto_0
    array-length v3, v1

    .line 37
    if-ge v2, v3, :cond_1

    .line 38
    .line 39
    if-lez v2, :cond_0

    .line 40
    .line 41
    const/16 v3, 0x2c

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    :cond_0
    aget-object v3, v1, v2

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const-string v1, "):"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public static m(Le2;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lq;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lq;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    sget-object p0, Lg2;->d:Landroid/os/Handler;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static n(IIII)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 7
    .line 8
    .line 9
    int-to-float p0, p1

    .line 10
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 11
    .line 12
    .line 13
    if-lez p3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p3, p2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-object v0
.end method

.method public static o(Le2;Ll1;)V
    .locals 3

    .line 1
    iget-object v0, p1, Ll1;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Le2;->d:Lpd;

    .line 4
    .line 5
    iget-object v2, p0, Le2;->g:Landroid/widget/TextView;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const-string p0, "\u672a\u8bc6\u522b\u5f53\u524d\u4f1a\u8bdd\uff0c\u8bf7\u8fd4\u56de\u804a\u5929\u9875\u91cd\u8bd5"

    .line 10
    .line 11
    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    const-string v0, "\u6b63\u5728\u53d1\u9001\u8868\u60c5"

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    sget-object v1, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 25
    .line 26
    const-string v1, "\u6b63\u5728\u53d1\u9001 "

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :goto_0
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lq;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, p0, p1, v1}, Lq;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lg2;->c:Ljava/util/concurrent/ExecutorService;

    .line 42
    .line 43
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static p(Landroid/app/Dialog;Landroid/app/Activity;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/high16 v1, 0x43c30000    # 390.0f

    .line 25
    .line 26
    invoke-static {p1, v1}, Lg2;->g(Landroid/content/Context;F)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 39
    .line 40
    const/high16 v3, 0x42000000    # 32.0f

    .line 41
    .line 42
    invoke-static {p1, v3}, Lg2;->g(Landroid/content/Context;F)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    sub-int/2addr v2, p1

    .line 47
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 52
    .line 53
    const/4 p1, -0x2

    .line 54
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 55
    .line 56
    const/16 p1, 0x11

    .line 57
    .line 58
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 59
    .line 60
    const p1, 0x3ed70a3d    # 0.42f

    .line 61
    .line 62
    .line 63
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 66
    .line 67
    .line 68
    const/4 p1, 0x2

    .line 69
    invoke-virtual {p0, p1}, Landroid/view/Window;->addFlags(I)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public static q(Landroid/content/Context;Ljava/lang/String;II)Landroid/widget/TextView;
    .locals 1

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    int-to-float p0, p2

    .line 10
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
