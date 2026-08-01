.class public abstract Lxd1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/ExecutorService;

.field public static final β:Lwd1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Laj;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, Laj;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lxd1;->α:Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    new-instance v0, Lwd1;

    .line 16
    .line 17
    const/16 v1, 0x18

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v0, v1, v2}, Lwd1;-><init>(II)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lxd1;->β:Lwd1;

    .line 24
    .line 25
    return-void
.end method

.method public static α(Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lxx;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, p7, Lxx;->β:Ljava/lang/String;

    .line 9
    .line 10
    const/16 v2, 0x8

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p7, Lxx;->ζ:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p7, Lxx;->η:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p7, Lxx;->ι:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    invoke-virtual {p4, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-virtual {p5, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    invoke-virtual {p6, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 65
    .line 66
    .line 67
    filled-new-array {p4, p5, p6}, [Landroid/widget/TextView;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_0

    .line 84
    .line 85
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Landroid/widget/TextView;

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object p3, p7, Lxx;->Α:Ljava/lang/String;

    .line 99
    .line 100
    const-string p4, "#00000000"

    .line 101
    .line 102
    const/4 p5, 0x6

    .line 103
    invoke-static {p5, p2, p3, p4}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_0
    return-void
.end method

.method public static β(Landroid/app/Activity;Lxx;Z)Landroid/graphics/drawable/GradientDrawable;
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

.method public static γ(Landroid/app/Activity;Landroid/app/AlertDialog;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    const v0, 0x3ee66666    # 0.45f

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/Window;->setDimAmount(F)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iget p0, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 35
    .line 36
    int-to-float p0, p0

    .line 37
    const v0, 0x3f6b851f    # 0.92f

    .line 38
    .line 39
    .line 40
    mul-float/2addr p0, v0

    .line 41
    float-to-int p0, p0

    .line 42
    const/4 v0, -0x2

    .line 43
    invoke-virtual {p1, p0, v0}, Landroid/view/Window;->setLayout(II)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public static δ(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    .locals 6

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
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    if-lez v2, :cond_3

    .line 30
    .line 31
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 32
    .line 33
    if-lez v2, :cond_3

    .line 34
    .line 35
    :goto_0
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 36
    .line 37
    div-int/2addr v2, v1

    .line 38
    mul-int/lit8 v5, p1, 0x2

    .line 39
    .line 40
    if-gt v2, v5, :cond_2

    .line 41
    .line 42
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 43
    .line 44
    div-int/2addr v2, v1

    .line 45
    if-le v2, v5, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    array-length p1, p0

    .line 49
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 50
    .line 51
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 52
    .line 53
    .line 54
    iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 55
    .line 56
    invoke-static {p0, v3, p1, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_1
    array-length p0, p0

    .line 64
    const-string p1, "\u56fe\u6807\u4f4d\u56fe\u89e3\u7801\u5931\u8d25 bytes="

    .line 65
    .line 66
    const-string v0, " sampleSize="

    .line 67
    .line 68
    invoke-static {p0, v1, p1, v0}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, Lγ;->λ(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-object v4

    .line 76
    :cond_2
    :goto_1
    mul-int/lit8 v1, v1, 0x2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    array-length p0, p0

    .line 80
    const-string p1, "\u56fe\u6807\u54cd\u5e94\u65e0\u6cd5\u89e3\u6790\u5c3a\u5bf8 bytes="

    .line 81
    .line 82
    invoke-static {p1, p0}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0}, Lγ;->λ(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-object v4
.end method

.method public static ε(Landroid/app/Activity;Landroid/widget/CompoundButton;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    const/4 v1, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    invoke-static {p2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p2, v1

    .line 14
    :goto_0
    if-nez p2, :cond_1

    .line 15
    .line 16
    const-string p2, ""

    .line 17
    .line 18
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x4

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    const-string p0, "r50ae750e12c684f0"

    .line 26
    .line 27
    const-string p1, "\u79cd\u5b50\u56fe\u6807\u7f3a\u5c11 URL label="

    .line 28
    .line 29
    invoke-static {p1, p3}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p0, p1, v1, v2, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    const-string v0, "https://"

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    invoke-static {p2, v0, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    const-string v0, "http://"

    .line 48
    .line 49
    invoke-static {p2, v0, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    :goto_1
    move-object v4, p2

    .line 56
    goto :goto_2

    .line 57
    :cond_4
    const-string v0, "//"

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    invoke-static {p2, v0, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_9

    .line 65
    .line 66
    const-string v0, "https:"

    .line 67
    .line 68
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    goto :goto_1

    .line 73
    :goto_2
    :try_start_0
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-virtual {p2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    if-nez p2, :cond_5

    .line 82
    .line 83
    const-string p2, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    move-object p2, v0

    .line 88
    new-instance v0, Leo1;

    .line 89
    .line 90
    invoke-direct {v0, p2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    move-object p2, v0

    .line 94
    :cond_5
    :goto_3
    const-string v0, ""

    .line 95
    .line 96
    instance-of v3, p2, Leo1;

    .line 97
    .line 98
    if-eqz v3, :cond_6

    .line 99
    .line 100
    move-object p2, v0

    .line 101
    :cond_6
    check-cast p2, Ljava/lang/CharSequence;

    .line 102
    .line 103
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_7

    .line 108
    .line 109
    const-string p2, "unknown"

    .line 110
    .line 111
    :cond_7
    check-cast p2, Ljava/lang/String;

    .line 112
    .line 113
    const-string v0, "label="

    .line 114
    .line 115
    const-string v3, " host="

    .line 116
    .line 117
    invoke-static {v0, p3, v3, p2}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-virtual {p1, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    sget-object p2, Lxd1;->β:Lwd1;

    .line 125
    .line 126
    monitor-enter p2

    .line 127
    :try_start_1
    invoke-virtual {p2, v4}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    check-cast p3, Landroid/graphics/Bitmap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 132
    .line 133
    monitor-exit p2

    .line 134
    if-eqz p3, :cond_8

    .line 135
    .line 136
    const-string p2, "r50ae750e12c684f0"

    .line 137
    .line 138
    const-string v0, "\u79cd\u5b50\u56fe\u6807\u7f13\u5b58\u547d\u4e2d "

    .line 139
    .line 140
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-static {p2, v0, v1, v2, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-static {p1, v4, v6, p0, p3}, Lxd1;->ζ(Landroid/widget/CompoundButton;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Landroid/graphics/Bitmap;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_8
    const-string p2, "r50ae750e12c684f0"

    .line 152
    .line 153
    const-string p3, "\u5f00\u59cb\u52a0\u8f7d\u79cd\u5b50\u56fe\u6807 "

    .line 154
    .line 155
    invoke-virtual {p3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p3

    .line 159
    invoke-static {p2, p3, v1, v2, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    sget-object p2, Lxd1;->α:Ljava/util/concurrent/ExecutorService;

    .line 163
    .line 164
    new-instance v3, Lvg0;

    .line 165
    .line 166
    const/4 v8, 0x3

    .line 167
    move-object v5, p0

    .line 168
    move-object v7, p1

    .line 169
    invoke-direct/range {v3 .. v8}, Lvg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 170
    .line 171
    .line 172
    invoke-interface {p2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :catchall_1
    move-exception v0

    .line 177
    move-object p0, v0

    .line 178
    monitor-exit p2

    .line 179
    throw p0

    .line 180
    :cond_9
    const-string p0, "r50ae750e12c684f0"

    .line 181
    .line 182
    const-string p1, "\u79cd\u5b50\u56fe\u6807 URL \u534f\u8bae\u65e0\u6548 label="

    .line 183
    .line 184
    invoke-static {p1, p3}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-static {p0, p1, v1, v2, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    return-void
.end method

.method public static final ζ(Landroid/widget/CompoundButton;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Landroid/graphics/Bitmap;)V
    .locals 5

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
    const/4 v0, 0x4

    .line 10
    const-string v1, "r50ae750e12c684f0"

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p4}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 p1, 0x28

    .line 23
    .line 24
    invoke-static {p3, p1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    .line 29
    .line 30
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-direct {v3, v4, p4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 35
    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-virtual {v3, v4, v4, p1, p1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 39
    .line 40
    .line 41
    const/16 p1, 0xa

    .line 42
    .line 43
    invoke-static {p3, p1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v3, v2, v2, v2}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-virtual {p4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    const-string p3, " size="

    .line 62
    .line 63
    const-string p4, "x"

    .line 64
    .line 65
    const-string v3, "\u79cd\u5b50\u56fe\u6807\u5df2\u5e94\u7528 "

    .line 66
    .line 67
    invoke-static {p0, v3, p2, p3, p4}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_1
    :goto_0
    const-string p0, "\u79cd\u5b50\u56fe\u6807\u7ed3\u679c\u5df2\u8fc7\u671f "

    .line 83
    .line 84
    invoke-virtual {p0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public static η(I)Ljava/lang/String;
    .locals 2

    .line 1
    if-gtz p0, :cond_0

    .line 2
    .line 3
    const-string p0, "\u4ef7\u683c\u4e0a\u9650\uff1a\u4e0d\u9650\u5236"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string v0, "\u4ef7\u683c\u4e0a\u9650\uff1a"

    .line 7
    .line 8
    const-string v1, " \u91d1\u5e01"

    .line 9
    .line 10
    invoke-static {v0, p0, v1}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static θ(Lid1;Ljava/lang/Integer;Ljava/lang/Long;)Ljava/lang/String;
    .locals 11

    .line 1
    iget-object v0, p0, Lid1;->ε:Ljava/lang/Integer;

    .line 2
    .line 3
    iget-object v1, p0, Lid1;->θ:Ljava/lang/Integer;

    .line 4
    .line 5
    const-string v2, " \u91d1\u5e01"

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    const-string v3, "\u4ef7\u683c\uff1a\u514d\u8d39"

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v4, "\u4ef7\u683c\uff1a"

    .line 19
    .line 20
    invoke-static {v4, v3, v2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    :goto_0
    move-object v4, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const-string v3, "\u4ef7\u683c\uff1a\u5f85\u83b7\u53d6"

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v3, p0, Lid1;->ζ:Ljava/lang/Integer;

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const-string v5, "\u6536\u76ca\uff1a"

    .line 38
    .line 39
    invoke-static {v5, v3, v2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    :goto_2
    move-object v5, v2

    .line 44
    goto :goto_3

    .line 45
    :cond_2
    const-string v2, "\u6536\u76ca\uff1a\u5f85\u83b7\u53d6"

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :goto_3
    iget-object v2, p0, Lid1;->η:Ljava/lang/Integer;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    const-string v6, "+"

    .line 58
    .line 59
    const-string v7, " \u8425\u5730\u7ecf\u9a8c"

    .line 60
    .line 61
    invoke-static {v6, v2, v7}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    goto :goto_4

    .line 66
    :cond_3
    move-object v2, v3

    .line 67
    :goto_4
    const-string v6, ""

    .line 68
    .line 69
    if-nez v2, :cond_4

    .line 70
    .line 71
    move-object v2, v6

    .line 72
    :cond_4
    iget-object v7, p0, Lid1;->δ:Ljava/lang/Integer;

    .line 73
    .line 74
    if-eqz v7, :cond_9

    .line 75
    .line 76
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-gtz v7, :cond_5

    .line 81
    .line 82
    const-string v7, "\u6210\u719f\u65f6\u95f4\u672a\u77e5"

    .line 83
    .line 84
    goto :goto_6

    .line 85
    :cond_5
    const v8, 0x15180

    .line 86
    .line 87
    .line 88
    rem-int v9, v7, v8

    .line 89
    .line 90
    if-nez v9, :cond_6

    .line 91
    .line 92
    div-int/2addr v7, v8

    .line 93
    const-string v8, " \u5929\u6210\u719f"

    .line 94
    .line 95
    :goto_5
    invoke-static {v8, v7}, Llz1;->λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    goto :goto_6

    .line 100
    :cond_6
    rem-int/lit16 v8, v7, 0xe10

    .line 101
    .line 102
    if-nez v8, :cond_7

    .line 103
    .line 104
    div-int/lit16 v7, v7, 0xe10

    .line 105
    .line 106
    const-string v8, " \u5c0f\u65f6\u6210\u719f"

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_7
    const/16 v8, 0x3c

    .line 110
    .line 111
    if-lt v7, v8, :cond_8

    .line 112
    .line 113
    div-int/2addr v7, v8

    .line 114
    const-string v8, " \u5206\u949f\u6210\u719f"

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_8
    const-string v8, " \u79d2\u6210\u719f"

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_9
    move-object v7, v3

    .line 121
    :goto_6
    if-nez v7, :cond_a

    .line 122
    .line 123
    move-object v7, v6

    .line 124
    :cond_a
    if-eqz v1, :cond_b

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    const-string v8, "\u89e3\u9501\uff1a"

    .line 131
    .line 132
    const-string v9, " \u7ea7"

    .line 133
    .line 134
    invoke-static {v8, v3, v9}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    :cond_b
    if-nez v3, :cond_c

    .line 139
    .line 140
    move-object v8, v6

    .line 141
    goto :goto_7

    .line 142
    :cond_c
    move-object v8, v3

    .line 143
    :goto_7
    iget-boolean v3, p0, Lid1;->τ:Z

    .line 144
    .line 145
    if-nez v3, :cond_d

    .line 146
    .line 147
    const-string p0, "\u5f53\u524d\u672a\u5728\u5546\u5e97\u51fa\u552e"

    .line 148
    .line 149
    :goto_8
    move-object v9, p0

    .line 150
    move-object v6, v2

    .line 151
    goto :goto_a

    .line 152
    :cond_d
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 153
    .line 154
    .line 155
    move-result-wide v9

    .line 156
    invoke-virtual {p0, v9, v10}, Lid1;->β(J)Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    if-nez p0, :cond_e

    .line 161
    .line 162
    const-string p0, "\u5f53\u524d\u4e0d\u5728\u6d3b\u52a8\u65f6\u95f4"

    .line 163
    .line 164
    goto :goto_8

    .line 165
    :cond_e
    if-nez p1, :cond_f

    .line 166
    .line 167
    const-string p0, "\u8425\u5730\u7b49\u7ea7\u5f85\u5237\u65b0"

    .line 168
    .line 169
    goto :goto_8

    .line 170
    :cond_f
    if-eqz v1, :cond_10

    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    goto :goto_9

    .line 177
    :cond_10
    const p0, 0x7fffffff

    .line 178
    .line 179
    .line 180
    :goto_9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-le p0, p1, :cond_11

    .line 185
    .line 186
    const-string p0, "\u5f53\u524d\u7b49\u7ea7\u672a\u89e3\u9501"

    .line 187
    .line 188
    goto :goto_8

    .line 189
    :cond_11
    if-eqz v0, :cond_12

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    if-lez p0, :cond_12

    .line 196
    .line 197
    if-eqz p2, :cond_12

    .line 198
    .line 199
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 200
    .line 201
    .line 202
    move-result-wide p0

    .line 203
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    int-to-long v0, v0

    .line 208
    cmp-long p0, p0, v0

    .line 209
    .line 210
    if-gez p0, :cond_12

    .line 211
    .line 212
    const-string p0, "\u5f53\u524d\u91d1\u5e01\u4e0d\u8db3"

    .line 213
    .line 214
    goto :goto_8

    .line 215
    :cond_12
    if-nez p2, :cond_13

    .line 216
    .line 217
    const-string p0, "\u91d1\u5e01\u5f85\u5237\u65b0"

    .line 218
    .line 219
    goto :goto_8

    .line 220
    :cond_13
    const-string p0, "\u5f53\u524d\u53ef\u8d2d\u4e70"

    .line 221
    .line 222
    goto :goto_8

    .line 223
    :goto_a
    filled-new-array/range {v4 .. v9}, [Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    new-instance v0, Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    :cond_14
    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    if-eqz p1, :cond_15

    .line 245
    .line 246
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    move-object p2, p1

    .line 251
    check-cast p2, Ljava/lang/String;

    .line 252
    .line 253
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 254
    .line 255
    .line 256
    move-result p2

    .line 257
    if-nez p2, :cond_14

    .line 258
    .line 259
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    goto :goto_b

    .line 263
    :cond_15
    const/4 v5, 0x0

    .line 264
    const/16 v6, 0x3e

    .line 265
    .line 266
    const-string v1, " \u00b7 "

    .line 267
    .line 268
    const/4 v2, 0x0

    .line 269
    const/4 v3, 0x0

    .line 270
    const/4 v4, 0x0

    .line 271
    invoke-static/range {v0 .. v6}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    return-object p0
.end method

.method public static ι(Lid1;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lid1;->β:Ljava/lang/String;

    .line 2
    .line 3
    iget p0, p0, Lid1;->α:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "\u79cd\u5b50 "

    .line 8
    .line 9
    invoke-static {v0, p0}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    const-string v1, " \u00b7 #"

    .line 14
    .line 15
    invoke-static {v0, v1, p0}, Lnx;->ι(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static κ(Landroid/app/Activity;Lec1;Ljava/util/Set;ILnb1;)V
    .locals 14

    .line 1
    sget-object v0, Lx01;->α:Lx01;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    const v3, 0x7f0c0036

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v3, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    const v0, 0x7f090257

    .line 17
    .line 18
    .line 19
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    move-object v7, v0

    .line 24
    check-cast v7, Landroid/widget/TextView;

    .line 25
    .line 26
    const v0, 0x7f090256

    .line 27
    .line 28
    .line 29
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v9, v0

    .line 34
    check-cast v9, Landroid/widget/TextView;

    .line 35
    .line 36
    const v0, 0x7f090253

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    move-object v1, v0

    .line 44
    check-cast v1, Landroid/widget/RadioGroup;

    .line 45
    .line 46
    const v0, 0x7f090252

    .line 47
    .line 48
    .line 49
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move-object v10, v0

    .line 54
    check-cast v10, Landroid/widget/TextView;

    .line 55
    .line 56
    const v0, 0x7f090254

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    move-object v8, v0

    .line 64
    check-cast v8, Landroid/widget/TextView;

    .line 65
    .line 66
    const v0, 0x7f09024f

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    move-object v11, v0

    .line 74
    check-cast v11, Landroid/widget/TextView;

    .line 75
    .line 76
    const v0, 0x7f090251

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    move-object v12, v0

    .line 84
    check-cast v12, Landroid/widget/TextView;

    .line 85
    .line 86
    invoke-static {p0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-object v13, v10

    .line 109
    move-object v10, v8

    .line 110
    move-object v8, v9

    .line 111
    move-object v9, v13

    .line 112
    move-object v13, v2

    .line 113
    invoke-static/range {v6 .. v13}, Lxd1;->α(Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lxx;)V

    .line 114
    .line 115
    .line 116
    move-object v2, v9

    .line 117
    move-object v9, v8

    .line 118
    move-object v8, v13

    .line 119
    move-object v13, v12

    .line 120
    move-object v12, v11

    .line 121
    move-object v11, v10

    .line 122
    move-object v10, v6

    .line 123
    iget-object v0, p1, Lec1;->δ:Ljava/lang/String;

    .line 124
    .line 125
    const-string v4, " \u6392\u9664\u7684\u667a\u80fd\u79cd\u5b50"

    .line 126
    .line 127
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    .line 133
    .line 134
    move-object/from16 v0, p2

    .line 135
    .line 136
    check-cast v0, Ljava/lang/Iterable;

    .line 137
    .line 138
    new-instance v4, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eqz v6, :cond_1

    .line 152
    .line 153
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    move-object v7, v6

    .line 158
    check-cast v7, Ljava/lang/Number;

    .line 159
    .line 160
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    if-lez v7, :cond_0

    .line 165
    .line 166
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_1
    invoke-static {v4}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    new-instance v4, Lum1;

    .line 175
    .line 176
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 177
    .line 178
    .line 179
    sget-object v6, Lkd1;->α:Lkd1;

    .line 180
    .line 181
    invoke-virtual {v6}, Lkd1;->ε()Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    iput-object v6, v4, Lum1;->ε:Ljava/lang/Object;

    .line 186
    .line 187
    move-object v7, p0

    .line 188
    move-object v5, v0

    .line 189
    move-object v0, v4

    .line 190
    move-object v3, v9

    .line 191
    move/from16 v4, p3

    .line 192
    .line 193
    move-object v9, v6

    .line 194
    move-object v6, p1

    .line 195
    invoke-static/range {v0 .. v9}, Lxd1;->μ(Lum1;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;ILjava/util/Set;Lec1;Landroid/app/Activity;Lxx;Ljava/util/List;)V

    .line 196
    .line 197
    .line 198
    move-object v4, v0

    .line 199
    move-object v7, v1

    .line 200
    move-object v9, v3

    .line 201
    move-object v0, v11

    .line 202
    move-object v11, v5

    .line 203
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 204
    .line 205
    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1, v10}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    move-object v10, v0

    .line 217
    new-instance v0, Lmd1;

    .line 218
    .line 219
    move-object v1, v10

    .line 220
    move-object v10, v2

    .line 221
    move-object v2, v8

    .line 222
    move-object v8, v1

    .line 223
    move-object v5, p0

    .line 224
    move-object v3, p1

    .line 225
    move/from16 v1, p3

    .line 226
    .line 227
    invoke-direct/range {v0 .. v11}, Lmd1;-><init>(ILxx;Lec1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/Set;)V

    .line 228
    .line 229
    .line 230
    move-object v1, v0

    .line 231
    move-object v0, v2

    .line 232
    move-object v2, v10

    .line 233
    invoke-virtual {v8, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 234
    .line 235
    .line 236
    new-instance v1, Lsa;

    .line 237
    .line 238
    const/16 v3, 0xf

    .line 239
    .line 240
    invoke-direct {v1, v6, v3}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 244
    .line 245
    .line 246
    new-instance v1, Lc9;

    .line 247
    .line 248
    const/16 v3, 0x9

    .line 249
    .line 250
    move-object/from16 v5, p4

    .line 251
    .line 252
    invoke-direct {v1, v5, v11, v6, v3}, Lc9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v13, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 256
    .line 257
    .line 258
    move-object v13, v0

    .line 259
    new-instance v0, Lnd1;

    .line 260
    .line 261
    move-object v5, p0

    .line 262
    move-object v3, p1

    .line 263
    move/from16 v1, p3

    .line 264
    .line 265
    move-object v2, v13

    .line 266
    invoke-direct/range {v0 .. v11}, Lnd1;-><init>(ILxx;Lec1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/Set;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v6, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v6}, Landroid/app/Dialog;->show()V

    .line 273
    .line 274
    .line 275
    return-void
.end method

.method public static final λ(ILxx;Lec1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/Set;Z)V
    .locals 13

    .line 1
    move-object/from16 v8, p7

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 5
    .line 6
    .line 7
    const v0, 0x3ee66666    # 0.45f

    .line 8
    .line 9
    .line 10
    invoke-virtual {v8, v0}, Landroid/view/View;->setAlpha(F)V

    .line 11
    .line 12
    .line 13
    const-string v0, "\u66f4\u65b0\u4e2d"

    .line 14
    .line 15
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "\u6b63\u5728\u4ece\u5bbf\u4e3b\u914d\u7f6e\u4e2d\u5fc3\u66f4\u65b0\u5168\u90e8\u79cd\u5b50\u2026"

    .line 19
    .line 20
    move-object/from16 v10, p8

    .line 21
    .line 22
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Ljc1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    new-instance v0, Lod1;

    .line 28
    .line 29
    move v1, p0

    .line 30
    move-object v2, p1

    .line 31
    move-object v3, p2

    .line 32
    move-object/from16 v4, p3

    .line 33
    .line 34
    move-object/from16 v5, p4

    .line 35
    .line 36
    move-object/from16 v6, p5

    .line 37
    .line 38
    move-object/from16 v7, p6

    .line 39
    .line 40
    move-object/from16 v9, p9

    .line 41
    .line 42
    move-object/from16 v11, p10

    .line 43
    .line 44
    move/from16 v12, p11

    .line 45
    .line 46
    invoke-direct/range {v0 .. v12}, Lod1;-><init>(ILxx;Lec1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/Set;Z)V

    .line 47
    .line 48
    .line 49
    invoke-static {v5, v0}, Ljc1;->ρ(Landroid/app/Activity;La80;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static final μ(Lum1;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;ILjava/util/Set;Lec1;Landroid/app/Activity;Lxx;Ljava/util/List;)V
    .locals 12

    .line 1
    move-object/from16 v2, p7

    .line 2
    .line 3
    move-object/from16 v5, p8

    .line 4
    .line 5
    move-object/from16 v6, p9

    .line 6
    .line 7
    iput-object v6, p0, Lum1;->ε:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 10
    .line 11
    .line 12
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    const/16 v3, 0x8

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    move-object v4, v0

    .line 30
    check-cast v4, Lid1;

    .line 31
    .line 32
    invoke-static {v4}, Lxd1;->ι(Lid1;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    move-object/from16 v8, p6

    .line 37
    .line 38
    iget-object v0, v8, Lec1;->η:Lid;

    .line 39
    .line 40
    const/4 v9, 0x0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    iget-object v10, v0, Lid;->γ:Lzd1;

    .line 44
    .line 45
    if-eqz v10, :cond_0

    .line 46
    .line 47
    iget-object v10, v10, Lzd1;->β:Ljava/lang/Integer;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    move-object v10, v9

    .line 51
    :goto_1
    if-eqz v0, :cond_1

    .line 52
    .line 53
    iget-object v0, v0, Lid;->γ:Lzd1;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    sget-object v9, Lqc1;->α:Lqc1;

    .line 58
    .line 59
    invoke-static {v0}, Lqc1;->β(Lzd1;)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    :cond_1
    invoke-static {v4, v10, v9}, Lxd1;->θ(Lid1;Ljava/lang/Integer;Ljava/lang/Long;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v9, Landroid/widget/CheckBox;

    .line 68
    .line 69
    invoke-direct {v9, v2}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v7, v0, v5}, Ljx0;->е(Ljava/lang/String;Ljava/lang/String;Lxx;)Landroid/text/SpannableString;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x41500000    # 13.0f

    .line 80
    .line 81
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 82
    .line 83
    .line 84
    const/4 v0, 0x2

    .line 85
    invoke-static {v2, v0}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    int-to-float v0, v0

    .line 90
    const/high16 v10, 0x3f800000    # 1.0f

    .line 91
    .line 92
    invoke-virtual {v9, v0, v10}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 93
    .line 94
    .line 95
    const/16 v0, 0x38

    .line 96
    .line 97
    invoke-static {v2, v0}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 102
    .line 103
    .line 104
    const/16 v0, 0x10

    .line 105
    .line 106
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 107
    .line 108
    .line 109
    const/16 v0, 0xa

    .line 110
    .line 111
    invoke-static {v2, v0}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-static {v2, v3}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    const/16 v11, 0xc

    .line 120
    .line 121
    invoke-static {v2, v11}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    invoke-static {v2, v3}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    invoke-virtual {v9, v0, v10, v11, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 130
    .line 131
    .line 132
    iget-object v0, v5, Lxx;->ζ:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 139
    .line 140
    .line 141
    new-instance v0, Landroid/content/res/ColorStateList;

    .line 142
    .line 143
    const v3, 0x10100a0

    .line 144
    .line 145
    .line 146
    filled-new-array {v3}, [I

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    new-array v1, v1, [I

    .line 151
    .line 152
    filled-new-array {v3, v1}, [[I

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    iget-object v3, v5, Lxx;->ρ:Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    iget-object v10, v5, Lxx;->η:Ljava/lang/String;

    .line 163
    .line 164
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    filled-new-array {v3, v10}, [I

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-direct {v0, v1, v3}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v9, v0}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    .line 176
    .line 177
    .line 178
    iget v0, v4, Lid1;->α:I

    .line 179
    .line 180
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    move-object/from16 v3, p5

    .line 185
    .line 186
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    invoke-virtual {v9, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v9}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    invoke-static {v2, v5, v0}, Lxd1;->β(Landroid/app/Activity;Lxx;Z)Landroid/graphics/drawable/GradientDrawable;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v9, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 202
    .line 203
    .line 204
    new-instance v0, Lxg;

    .line 205
    .line 206
    const/4 v1, 0x1

    .line 207
    invoke-direct/range {v0 .. v5}, Lxg;-><init>(ILandroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v9, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 211
    .line 212
    .line 213
    new-instance v0, Landroid/widget/RadioGroup$LayoutParams;

    .line 214
    .line 215
    const/4 v1, -0x1

    .line 216
    const/4 v3, -0x2

    .line 217
    invoke-direct {v0, v1, v3}, Landroid/widget/RadioGroup$LayoutParams;-><init>(II)V

    .line 218
    .line 219
    .line 220
    const/4 v1, 0x6

    .line 221
    invoke-static {v2, v1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    iput v1, v0, Landroid/widget/RadioGroup$LayoutParams;->bottomMargin:I

    .line 226
    .line 227
    invoke-virtual {p1, v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 228
    .line 229
    .line 230
    iget-object v0, v4, Lid1;->γ:Ljava/lang/String;

    .line 231
    .line 232
    invoke-static {v2, v9, v0, v7}, Lxd1;->ε(Landroid/app/Activity;Landroid/widget/CompoundButton;Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    move-object/from16 v5, p8

    .line 236
    .line 237
    goto/16 :goto_0

    .line 238
    .line 239
    :cond_2
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 240
    .line 241
    .line 242
    move-result p0

    .line 243
    if-eqz p0, :cond_3

    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_3
    move v1, v3

    .line 247
    :goto_2
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 248
    .line 249
    .line 250
    invoke-static/range {p4 .. p4}, Lxd1;->η(I)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    invoke-interface/range {p5 .. p5}, Ljava/util/Set;->size()I

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    new-instance p2, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    const-string v0, "\u4ec5\u5f71\u54cd\u667a\u80fd\u9009\u62e9\uff1b\u4ef7\u683c\u4e0a\u9650 "

    .line 261
    .line 262
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    const-string p0, "\uff0c\u5df2\u6392\u9664 "

    .line 269
    .line 270
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    const-string p0, " \u79cd"

    .line 277
    .line 278
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    invoke-virtual {p3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 286
    .line 287
    .line 288
    return-void
.end method

.method public static ν(Landroid/app/Activity;Ljava/lang/String;Lvd1;ILjava/lang/Integer;Ljava/lang/Long;ZZLa80;)V
    .locals 22

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    sget-object v1, Lx01;->α:Lx01;

    .line 6
    .line 7
    invoke-virtual {v1, v6}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v8

    .line 11
    const/4 v1, 0x0

    .line 12
    const v2, 0x7f0c0036

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-virtual {v8, v2, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v9

    .line 20
    const v1, 0x7f090257

    .line 21
    .line 22
    .line 23
    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v10, v1

    .line 28
    check-cast v10, Landroid/widget/TextView;

    .line 29
    .line 30
    const v1, 0x7f090256

    .line 31
    .line 32
    .line 33
    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object v11, v1

    .line 38
    check-cast v11, Landroid/widget/TextView;

    .line 39
    .line 40
    const v1, 0x7f090253

    .line 41
    .line 42
    .line 43
    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    move-object v4, v1

    .line 48
    check-cast v4, Landroid/widget/RadioGroup;

    .line 49
    .line 50
    const v1, 0x7f090252

    .line 51
    .line 52
    .line 53
    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    move-object v12, v1

    .line 58
    check-cast v12, Landroid/widget/TextView;

    .line 59
    .line 60
    const v1, 0x7f090254

    .line 61
    .line 62
    .line 63
    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    move-object v13, v1

    .line 68
    check-cast v13, Landroid/widget/TextView;

    .line 69
    .line 70
    const v1, 0x7f09024f

    .line 71
    .line 72
    .line 73
    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    move-object v14, v1

    .line 78
    check-cast v14, Landroid/widget/TextView;

    .line 79
    .line 80
    const v1, 0x7f090251

    .line 81
    .line 82
    .line 83
    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    move-object v15, v1

    .line 88
    check-cast v15, Landroid/widget/TextView;

    .line 89
    .line 90
    invoke-static {v6}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-object/from16 v16, v2

    .line 113
    .line 114
    invoke-static/range {v9 .. v16}, Lxd1;->α(Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lxx;)V

    .line 115
    .line 116
    .line 117
    move-object/from16 v1, p1

    .line 118
    .line 119
    move-object/from16 v16, v13

    .line 120
    .line 121
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    .line 123
    .line 124
    new-instance v5, Lum1;

    .line 125
    .line 126
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 127
    .line 128
    .line 129
    iget-object v1, v0, Lvd1;->α:Ltd;

    .line 130
    .line 131
    sget-object v7, Ltd;->η:Ltd;

    .line 132
    .line 133
    if-ne v1, v7, :cond_0

    .line 134
    .line 135
    iget-object v7, v0, Lvd1;->β:Ljava/lang/Integer;

    .line 136
    .line 137
    if-eqz v7, :cond_0

    .line 138
    .line 139
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    if-lez v7, :cond_0

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_0
    sget-object v0, Ltd;->ζ:Ltd;

    .line 147
    .line 148
    if-ne v1, v0, :cond_1

    .line 149
    .line 150
    new-instance v1, Lvd1;

    .line 151
    .line 152
    invoke-direct {v1, v0, v3}, Lvd1;-><init>(Ltd;Ljava/lang/Integer;)V

    .line 153
    .line 154
    .line 155
    :goto_0
    move-object v0, v1

    .line 156
    goto :goto_1

    .line 157
    :cond_1
    sget-object v0, Ltd;->ε:Ltd;

    .line 158
    .line 159
    if-ne v1, v0, :cond_2

    .line 160
    .line 161
    new-instance v1, Lvd1;

    .line 162
    .line 163
    invoke-direct {v1, v0, v3}, Lvd1;-><init>(Ltd;Ljava/lang/Integer;)V

    .line 164
    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_2
    new-instance v0, Lvd1;

    .line 168
    .line 169
    invoke-direct {v0, v3, v3}, Lvd1;-><init>(Ltd;Ljava/lang/Integer;)V

    .line 170
    .line 171
    .line 172
    :goto_1
    iput-object v0, v5, Lum1;->ε:Ljava/lang/Object;

    .line 173
    .line 174
    new-instance v10, Lum1;

    .line 175
    .line 176
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 177
    .line 178
    .line 179
    sget-object v0, Lkd1;->α:Lkd1;

    .line 180
    .line 181
    invoke-virtual {v0}, Lkd1;->ε()Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    iput-object v0, v10, Lum1;->ε:Ljava/lang/Object;

    .line 186
    .line 187
    new-instance v3, Lqm1;

    .line 188
    .line 189
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 190
    .line 191
    .line 192
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 193
    .line 194
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 195
    .line 196
    .line 197
    new-instance v0, Lrd1;

    .line 198
    .line 199
    const/4 v7, 0x0

    .line 200
    move-object/from16 v21, v2

    .line 201
    .line 202
    move-object v2, v1

    .line 203
    move-object v1, v3

    .line 204
    move-object v3, v5

    .line 205
    move-object v5, v6

    .line 206
    move-object/from16 v6, v21

    .line 207
    .line 208
    invoke-direct/range {v0 .. v7}, Lrd1;-><init>(Lqm1;Ljava/util/LinkedHashMap;Lum1;Landroid/widget/RadioGroup;Landroid/app/Activity;Lxx;I)V

    .line 209
    .line 210
    .line 211
    move-object v5, v3

    .line 212
    move-object v3, v4

    .line 213
    move-object v4, v0

    .line 214
    move-object v0, v2

    .line 215
    move-object v2, v6

    .line 216
    invoke-virtual {v3, v4}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 217
    .line 218
    .line 219
    iget-object v4, v10, Lum1;->ε:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v4, Ljava/util/List;

    .line 222
    .line 223
    move-object/from16 v6, p4

    .line 224
    .line 225
    move-object/from16 v7, p5

    .line 226
    .line 227
    move-object v13, v2

    .line 228
    move-object/from16 v18, v9

    .line 229
    .line 230
    move-object/from16 v19, v14

    .line 231
    .line 232
    move-object/from16 v20, v15

    .line 233
    .line 234
    move-object/from16 v14, p0

    .line 235
    .line 236
    move/from16 v9, p7

    .line 237
    .line 238
    move-object v2, v1

    .line 239
    move-object v15, v4

    .line 240
    move-object v4, v5

    .line 241
    move/from16 v5, p3

    .line 242
    .line 243
    move-object v1, v0

    .line 244
    move-object v0, v10

    .line 245
    move-object v10, v12

    .line 246
    move-object v12, v8

    .line 247
    move/from16 v8, p6

    .line 248
    .line 249
    invoke-static/range {v0 .. v15}, Lxd1;->ο(Lum1;Ljava/util/LinkedHashMap;Lqm1;Landroid/widget/RadioGroup;Lum1;ILjava/lang/Integer;Ljava/lang/Long;ZZLandroid/widget/TextView;Landroid/widget/TextView;Landroid/view/LayoutInflater;Lxx;Landroid/app/Activity;Ljava/util/List;)V

    .line 250
    .line 251
    .line 252
    move-object v15, v1

    .line 253
    move-object v1, v2

    .line 254
    move-object v9, v3

    .line 255
    move-object v5, v4

    .line 256
    move-object v8, v12

    .line 257
    move-object v2, v13

    .line 258
    move-object v6, v14

    .line 259
    move-object v4, v0

    .line 260
    move-object v12, v10

    .line 261
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 262
    .line 263
    invoke-direct {v0, v6}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 264
    .line 265
    .line 266
    move-object/from16 v3, v18

    .line 267
    .line 268
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 273
    .line 274
    .line 275
    move-result-object v7

    .line 276
    new-instance v0, Lsd1;

    .line 277
    .line 278
    move-object/from16 v13, p4

    .line 279
    .line 280
    move-object/from16 v14, p5

    .line 281
    .line 282
    move/from16 v17, p7

    .line 283
    .line 284
    move-object v3, v1

    .line 285
    move-object/from16 v10, v16

    .line 286
    .line 287
    move/from16 v1, p3

    .line 288
    .line 289
    move/from16 v16, p6

    .line 290
    .line 291
    invoke-direct/range {v0 .. v17}, Lsd1;-><init>(ILxx;Lqm1;Lum1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/view/LayoutInflater;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/LinkedHashMap;ZZ)V

    .line 292
    .line 293
    .line 294
    move-object v1, v3

    .line 295
    invoke-virtual {v10, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 296
    .line 297
    .line 298
    new-instance v0, Lsa;

    .line 299
    .line 300
    const/16 v3, 0x10

    .line 301
    .line 302
    invoke-direct {v0, v7, v3}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 303
    .line 304
    .line 305
    move-object/from16 v14, v19

    .line 306
    .line 307
    invoke-virtual {v14, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 308
    .line 309
    .line 310
    new-instance v0, Lc9;

    .line 311
    .line 312
    const/16 v3, 0xb

    .line 313
    .line 314
    move-object/from16 v6, p8

    .line 315
    .line 316
    invoke-direct {v0, v6, v5, v7, v3}, Lc9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 317
    .line 318
    .line 319
    move-object/from16 v3, v20

    .line 320
    .line 321
    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 322
    .line 323
    .line 324
    new-instance v0, Ltd1;

    .line 325
    .line 326
    move-object/from16 v6, p0

    .line 327
    .line 328
    move-object/from16 v14, p5

    .line 329
    .line 330
    move-object v3, v1

    .line 331
    move/from16 v1, p3

    .line 332
    .line 333
    invoke-direct/range {v0 .. v17}, Ltd1;-><init>(ILxx;Lqm1;Lum1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/view/LayoutInflater;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/LinkedHashMap;ZZ)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v7, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v7}, Landroid/app/Dialog;->show()V

    .line 340
    .line 341
    .line 342
    return-void
.end method

.method public static final ξ(ILxx;Lqm1;Lum1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/view/LayoutInflater;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/LinkedHashMap;ZZZ)V
    .locals 19

    .line 1
    move-object/from16 v10, p9

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 5
    .line 6
    .line 7
    const v0, 0x3ee66666    # 0.45f

    .line 8
    .line 9
    .line 10
    invoke-virtual {v10, v0}, Landroid/view/View;->setAlpha(F)V

    .line 11
    .line 12
    .line 13
    const-string v0, "\u66f4\u65b0\u4e2d"

    .line 14
    .line 15
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "\u6b63\u5728\u4ece\u5bbf\u4e3b\u914d\u7f6e\u4e2d\u5fc3\u66f4\u65b0\u5168\u90e8\u79cd\u5b50\u2026"

    .line 19
    .line 20
    move-object/from16 v12, p10

    .line 21
    .line 22
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Ljc1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    new-instance v0, Lld1;

    .line 28
    .line 29
    move/from16 v1, p0

    .line 30
    .line 31
    move-object/from16 v2, p1

    .line 32
    .line 33
    move-object/from16 v3, p2

    .line 34
    .line 35
    move-object/from16 v4, p3

    .line 36
    .line 37
    move-object/from16 v5, p4

    .line 38
    .line 39
    move-object/from16 v6, p5

    .line 40
    .line 41
    move-object/from16 v7, p6

    .line 42
    .line 43
    move-object/from16 v8, p7

    .line 44
    .line 45
    move-object/from16 v9, p8

    .line 46
    .line 47
    move-object/from16 v11, p11

    .line 48
    .line 49
    move-object/from16 v13, p12

    .line 50
    .line 51
    move-object/from16 v14, p13

    .line 52
    .line 53
    move-object/from16 v15, p14

    .line 54
    .line 55
    move/from16 v17, p15

    .line 56
    .line 57
    move/from16 v18, p16

    .line 58
    .line 59
    move/from16 v16, p17

    .line 60
    .line 61
    invoke-direct/range {v0 .. v18}, Lld1;-><init>(ILxx;Lqm1;Lum1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/view/LayoutInflater;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/LinkedHashMap;ZZZ)V

    .line 62
    .line 63
    .line 64
    invoke-static {v6, v0}, Ljc1;->ρ(Landroid/app/Activity;La80;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public static final ο(Lum1;Ljava/util/LinkedHashMap;Lqm1;Landroid/widget/RadioGroup;Lum1;ILjava/lang/Integer;Ljava/lang/Long;ZZLandroid/widget/TextView;Landroid/widget/TextView;Landroid/view/LayoutInflater;Lxx;Landroid/app/Activity;Ljava/util/List;)V
    .locals 20

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v9, p6

    .line 8
    .line 9
    move-object/from16 v10, p7

    .line 10
    .line 11
    move-object/from16 v7, p13

    .line 12
    .line 13
    move-object/from16 v6, p14

    .line 14
    .line 15
    move-object/from16 v1, p0

    .line 16
    .line 17
    move-object/from16 v11, p15

    .line 18
    .line 19
    iput-object v11, v1, Lum1;->ε:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual/range {p1 .. p1}, Ljava/util/LinkedHashMap;->clear()V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    iput-boolean v1, v0, Lqm1;->ε:Z

    .line 26
    .line 27
    invoke-virtual {v4}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 28
    .line 29
    .line 30
    iget-object v1, v2, Lum1;->ε:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lvd1;

    .line 33
    .line 34
    invoke-static {}, Lyh;->χ()Lzt0;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const/16 v5, 0x18

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    if-eqz p8, :cond_0

    .line 42
    .line 43
    new-instance v12, Lud1;

    .line 44
    .line 45
    new-instance v13, Lvd1;

    .line 46
    .line 47
    invoke-direct {v13, v8, v8}, Lvd1;-><init>(Ltd;Ljava/lang/Integer;)V

    .line 48
    .line 49
    .line 50
    const-string v14, "\u6682\u4e0d\u8bbe\u7f6e\u5168\u5c40\u79cd\u5b50"

    .line 51
    .line 52
    const-string v15, "\u81ea\u52a8\u79cd\u5730\u4f1a\u5b89\u5168\u8df3\u8fc7\uff0c\u76f4\u5230\u9009\u62e9\u667a\u80fd\u6216\u56fa\u5b9a\u79cd\u5b50"

    .line 53
    .line 54
    invoke-direct {v12, v13, v14, v15, v5}, Lud1;-><init>(Lvd1;Ljava/lang/String;Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v12}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_0
    if-eqz p9, :cond_1

    .line 61
    .line 62
    new-instance v12, Lud1;

    .line 63
    .line 64
    new-instance v13, Lvd1;

    .line 65
    .line 66
    sget-object v14, Ltd;->ε:Ltd;

    .line 67
    .line 68
    invoke-direct {v13, v14, v8}, Lvd1;-><init>(Ltd;Ljava/lang/Integer;)V

    .line 69
    .line 70
    .line 71
    const-string v14, "\u8ddf\u968f\u5168\u5c40\u79cd\u5b50"

    .line 72
    .line 73
    const-string v15, "\u5b9e\u65f6\u4f7f\u7528\u5168\u5c40\u56fa\u5b9a\u6216\u667a\u80fd\u7b56\u7565\uff1b\u4eba\u5458\u6392\u9664\u540d\u5355\u4ecd\u4f1a\u7ea6\u675f\u5168\u5c40\u667a\u80fd\u9009\u62e9"

    .line 74
    .line 75
    invoke-direct {v12, v13, v14, v15, v5}, Lud1;-><init>(Lvd1;Ljava/lang/String;Ljava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v12}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    :cond_1
    new-instance v12, Lud1;

    .line 82
    .line 83
    new-instance v13, Lvd1;

    .line 84
    .line 85
    sget-object v14, Ltd;->ζ:Ltd;

    .line 86
    .line 87
    invoke-direct {v13, v14, v8}, Lvd1;-><init>(Ltd;Ljava/lang/Integer;)V

    .line 88
    .line 89
    .line 90
    invoke-static/range {p5 .. p5}, Lxd1;->η(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v14

    .line 94
    const-string v15, "\u514d\u8d39\u4f18\u5148\uff0c\u5176\u4f59\u6309\u6536\u76ca/\u4ef7\u683c\u6bd4\u9009\u62e9\uff1b"

    .line 95
    .line 96
    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v14

    .line 100
    const-string v15, "\u667a\u80fd\u9009\u62e9"

    .line 101
    .line 102
    invoke-direct {v12, v13, v15, v14, v5}, Lud1;-><init>(Lvd1;Ljava/lang/String;Ljava/lang/String;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v12}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    iget-object v5, v1, Lvd1;->β:Ljava/lang/Integer;

    .line 109
    .line 110
    iget-object v1, v1, Lvd1;->α:Ltd;

    .line 111
    .line 112
    sget-object v12, Ltd;->η:Ltd;

    .line 113
    .line 114
    if-ne v1, v12, :cond_2

    .line 115
    .line 116
    move-object v8, v5

    .line 117
    :cond_2
    const/16 v13, 0x8

    .line 118
    .line 119
    if-eqz v8, :cond_6

    .line 120
    .line 121
    if-eqz v11, :cond_3

    .line 122
    .line 123
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_3

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_3
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-eqz v5, :cond_5

    .line 139
    .line 140
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    check-cast v5, Lid1;

    .line 145
    .line 146
    iget v5, v5, Lid1;->α:I

    .line 147
    .line 148
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v14

    .line 152
    if-ne v5, v14, :cond_4

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_5
    :goto_0
    new-instance v1, Lud1;

    .line 156
    .line 157
    new-instance v5, Lvd1;

    .line 158
    .line 159
    invoke-direct {v5, v12, v8}, Lvd1;-><init>(Ltd;Ljava/lang/Integer;)V

    .line 160
    .line 161
    .line 162
    new-instance v14, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v15, "\u5df2\u4fdd\u5b58\u7684\u79cd\u5b50 #"

    .line 165
    .line 166
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    const-string v14, "\u5f53\u524d\u76ee\u5f55\u4e2d\u672a\u627e\u5230\uff0c\u8bf7\u66f4\u65b0\u5217\u8868\u6216\u91cd\u65b0\u9009\u62e9"

    .line 177
    .line 178
    invoke-direct {v1, v5, v8, v14, v13}, Lud1;-><init>(Lvd1;Ljava/lang/String;Ljava/lang/String;I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3, v1}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    :cond_6
    :goto_1
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    if-eqz v5, :cond_7

    .line 193
    .line 194
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    check-cast v5, Lid1;

    .line 199
    .line 200
    new-instance v14, Lud1;

    .line 201
    .line 202
    new-instance v15, Lvd1;

    .line 203
    .line 204
    iget v8, v5, Lid1;->α:I

    .line 205
    .line 206
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    invoke-direct {v15, v12, v8}, Lvd1;-><init>(Ltd;Ljava/lang/Integer;)V

    .line 211
    .line 212
    .line 213
    invoke-static {v5}, Lxd1;->ι(Lid1;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v16

    .line 217
    invoke-static {v5, v9, v10}, Lxd1;->θ(Lid1;Ljava/lang/Integer;Ljava/lang/Long;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v17

    .line 221
    iget-object v5, v5, Lid1;->γ:Ljava/lang/String;

    .line 222
    .line 223
    const/16 v19, 0x1

    .line 224
    .line 225
    move-object/from16 v18, v5

    .line 226
    .line 227
    invoke-direct/range {v14 .. v19}, Lud1;-><init>(Lvd1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3, v14}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_7
    invoke-static {v3}, Lyh;->μ(Lzt0;)Lzt0;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    const/4 v14, 0x0

    .line 239
    invoke-virtual {v1, v14}, Lzt0;->listIterator(I)Ljava/util/ListIterator;

    .line 240
    .line 241
    .line 242
    move-result-object v15

    .line 243
    :goto_3
    move-object v1, v15

    .line 244
    check-cast v1, Lle0;

    .line 245
    .line 246
    invoke-virtual {v1}, Lle0;->hasNext()Z

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    if-eqz v3, :cond_a

    .line 251
    .line 252
    invoke-virtual {v1}, Lle0;->next()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    move-object v3, v1

    .line 257
    check-cast v3, Lud1;

    .line 258
    .line 259
    const v1, 0x7f0c0058

    .line 260
    .line 261
    .line 262
    move-object/from16 v5, p12

    .line 263
    .line 264
    invoke-virtual {v5, v1, v4, v14}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    check-cast v1, Landroid/widget/RadioButton;

    .line 272
    .line 273
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 274
    .line 275
    .line 276
    move-result v8

    .line 277
    invoke-virtual {v1, v8}, Landroid/view/View;->setId(I)V

    .line 278
    .line 279
    .line 280
    iget-object v8, v3, Lud1;->β:Ljava/lang/String;

    .line 281
    .line 282
    iget-object v13, v3, Lud1;->α:Lvd1;

    .line 283
    .line 284
    iget-boolean v14, v3, Lud1;->ε:Z

    .line 285
    .line 286
    iget-object v5, v3, Lud1;->γ:Ljava/lang/String;

    .line 287
    .line 288
    invoke-static {v8, v5, v7}, Ljx0;->е(Ljava/lang/String;Ljava/lang/String;Lxx;)Landroid/text/SpannableString;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 293
    .line 294
    .line 295
    const/4 v5, 0x2

    .line 296
    invoke-static {v6, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 297
    .line 298
    .line 299
    move-result v5

    .line 300
    int-to-float v5, v5

    .line 301
    const/high16 v8, 0x3f800000    # 1.0f

    .line 302
    .line 303
    invoke-virtual {v1, v5, v8}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1, v14}, Landroid/view/View;->setEnabled(Z)V

    .line 307
    .line 308
    .line 309
    if-eqz v14, :cond_8

    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_8
    const v8, 0x3ef5c28f    # 0.48f

    .line 313
    .line 314
    .line 315
    :goto_4
    invoke-virtual {v1, v8}, Landroid/view/View;->setAlpha(F)V

    .line 316
    .line 317
    .line 318
    iget-object v5, v7, Lxx;->ζ:Ljava/lang/String;

    .line 319
    .line 320
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 325
    .line 326
    .line 327
    new-instance v5, Landroid/content/res/ColorStateList;

    .line 328
    .line 329
    const v8, 0x10100a0

    .line 330
    .line 331
    .line 332
    filled-new-array {v8}, [I

    .line 333
    .line 334
    .line 335
    move-result-object v8

    .line 336
    const/4 v14, 0x0

    .line 337
    new-array v10, v14, [I

    .line 338
    .line 339
    filled-new-array {v8, v10}, [[I

    .line 340
    .line 341
    .line 342
    move-result-object v8

    .line 343
    iget-object v10, v7, Lxx;->ι:Ljava/lang/String;

    .line 344
    .line 345
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 346
    .line 347
    .line 348
    move-result v10

    .line 349
    iget-object v14, v7, Lxx;->η:Ljava/lang/String;

    .line 350
    .line 351
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 352
    .line 353
    .line 354
    move-result v14

    .line 355
    filled-new-array {v10, v14}, [I

    .line 356
    .line 357
    .line 358
    move-result-object v10

    .line 359
    invoke-direct {v5, v8, v10}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1, v5}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    .line 363
    .line 364
    .line 365
    iget-object v5, v2, Lum1;->ε:Ljava/lang/Object;

    .line 366
    .line 367
    invoke-static {v13, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    invoke-virtual {v1, v5}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 375
    .line 376
    .line 377
    move-result v5

    .line 378
    invoke-static {v6, v7, v5}, Lxd1;->β(Landroid/app/Activity;Lxx;Z)Landroid/graphics/drawable/GradientDrawable;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    invoke-virtual {v1, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 386
    .line 387
    .line 388
    move-result v5

    .line 389
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 390
    .line 391
    .line 392
    move-result-object v5

    .line 393
    move-object/from16 v10, p1

    .line 394
    .line 395
    invoke-interface {v10, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 399
    .line 400
    .line 401
    move-object v5, v1

    .line 402
    new-instance v1, Lcl0;

    .line 403
    .line 404
    const/4 v8, 0x1

    .line 405
    invoke-direct/range {v1 .. v8}, Lcl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;I)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v5, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 409
    .line 410
    .line 411
    iget-object v1, v13, Lvd1;->α:Ltd;

    .line 412
    .line 413
    if-ne v1, v12, :cond_9

    .line 414
    .line 415
    iget-object v1, v3, Lud1;->δ:Ljava/lang/String;

    .line 416
    .line 417
    iget-object v2, v3, Lud1;->β:Ljava/lang/String;

    .line 418
    .line 419
    invoke-static {v6, v5, v1, v2}, Lxd1;->ε(Landroid/app/Activity;Landroid/widget/CompoundButton;Ljava/lang/String;Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    :cond_9
    move-object/from16 v4, p3

    .line 423
    .line 424
    move-object/from16 v2, p4

    .line 425
    .line 426
    move-object/from16 v10, p7

    .line 427
    .line 428
    move-object/from16 v7, p13

    .line 429
    .line 430
    const/16 v13, 0x8

    .line 431
    .line 432
    const/4 v14, 0x0

    .line 433
    goto/16 :goto_3

    .line 434
    .line 435
    :cond_a
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    if-eqz v1, :cond_b

    .line 440
    .line 441
    const/4 v13, 0x0

    .line 442
    :goto_5
    move-object/from16 v1, p10

    .line 443
    .line 444
    goto :goto_6

    .line 445
    :cond_b
    const/16 v13, 0x8

    .line 446
    .line 447
    goto :goto_5

    .line 448
    :goto_6
    invoke-virtual {v1, v13}, Landroid/view/View;->setVisibility(I)V

    .line 449
    .line 450
    .line 451
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 452
    .line 453
    .line 454
    move-result v1

    .line 455
    if-nez v9, :cond_c

    .line 456
    .line 457
    invoke-static/range {p5 .. p5}, Lxd1;->η(I)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    new-instance v3, Ljava/lang/StringBuilder;

    .line 462
    .line 463
    const-string v4, "\u5df2\u7f13\u5b58 "

    .line 464
    .line 465
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    const-string v1, " \u79cd\u79cd\u5b50\uff1b\u6267\u884c\u65f6\u4f1a\u6309\u5404\u4f1a\u8bdd\u7684\u5b9e\u65f6\u7b49\u7ea7\u3001\u4f59\u989d\u548c "

    .line 472
    .line 473
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    const-string v1, " \u6821\u9a8c"

    .line 480
    .line 481
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    :goto_7
    move-object/from16 v2, p11

    .line 489
    .line 490
    goto :goto_9

    .line 491
    :cond_c
    if-nez p7, :cond_d

    .line 492
    .line 493
    const-string v2, "\u672a\u77e5"

    .line 494
    .line 495
    goto :goto_8

    .line 496
    :cond_d
    move-object/from16 v2, p7

    .line 497
    .line 498
    :goto_8
    invoke-static/range {p5 .. p5}, Lxd1;->η(I)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v3

    .line 502
    new-instance v4, Ljava/lang/StringBuilder;

    .line 503
    .line 504
    const-string v5, "\u5f53\u524d\u8425\u5730 "

    .line 505
    .line 506
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    const-string v5, " \u7ea7\uff0c\u91d1\u5e01 "

    .line 513
    .line 514
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    const-string v2, "\uff1b\u5171 "

    .line 521
    .line 522
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    const-string v1, " \u79cd\uff0c\u667a\u80fd\u9009\u62e9 "

    .line 529
    .line 530
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    goto :goto_7

    .line 541
    :goto_9
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 542
    .line 543
    .line 544
    const/4 v14, 0x0

    .line 545
    iput-boolean v14, v0, Lqm1;->ε:Z

    .line 546
    .line 547
    return-void
.end method

.method public static final π(Landroid/widget/RadioGroup;Landroid/app/Activity;Lxx;I)V
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
    invoke-static {p1, p2, v4}, Lxd1;->β(Landroid/app/Activity;Lxx;Z)Landroid/graphics/drawable/GradientDrawable;

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
