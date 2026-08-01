.class public Ln;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ltz0;
.implements Lgz0;
.implements Lkz0;
.implements Lep;
.implements Lgp;
.implements Lgo1;


# static fields
.field public static final η:Ln;


# instance fields
.field public final synthetic ε:I

.field public ζ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [F

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    new-instance v1, Ln;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v2, v0}, Ln;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Ln;->η:Ln;

    .line 15
    .line 16
    return-void

    .line 17
    :array_0
    .array-data 4
        0x3f652546    # 0.8951f
        -0x40bff2e5    # -0.7502f
        0x3d1f559b    # 0.0389f
        0x3e886595    # 0.2664f
        0x3fdb53f8    # 1.7135f
        -0x4273b646    # -0.0685f
        -0x41dab9f5    # -0.1614f
        0x3d1652bd    # 0.0367f
        0x3f83c9ef    # 1.0296f
    .end array-data
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 1
    iput p1, p0, Ln;->ε:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lю;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lю;-><init>(Ln;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ln;->ζ:Ljava/lang/Object;

    .line 15
    .line 16
    return-void

    .line 17
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    const/4 v1, 0x0

    .line 24
    const/high16 v2, 0x3f400000    # 0.75f

    .line 25
    .line 26
    invoke-direct {p1, v1, v2, v0}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ln;->ζ:Ljava/lang/Object;

    .line 30
    .line 31
    return-void

    .line 32
    :sswitch_1
    new-instance p1, Lvw0;

    .line 33
    .line 34
    invoke-direct {p1}, Lvw0;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Ln;->ζ:Ljava/lang/Object;

    .line 41
    .line 42
    iget-boolean p0, p1, Lvw0;->ζ:Z

    .line 43
    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-boolean p0, p1, Lvw0;->η:Z

    .line 48
    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    const-string p0, "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"

    .line 52
    .line 53
    invoke-static {p0}, Lqi1;->α(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {p1}, Lvw0;->α()V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x1

    .line 60
    iput-boolean p0, p1, Lvw0;->η:Z

    .line 61
    .line 62
    :goto_0
    return-void

    .line 63
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance p1, Ljava/util/HashMap;

    .line 67
    .line 68
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Ln;->ζ:Ljava/lang/Object;

    .line 72
    .line 73
    return-void

    .line 74
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    .line 76
    .line 77
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 78
    .line 79
    const/4 v0, 0x0

    .line 80
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Ln;->ζ:Ljava/lang/Object;

    .line 84
    .line 85
    return-void

    .line 86
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    new-instance p1, Landroid/util/SparseIntArray;

    .line 90
    .line 91
    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object p1, p0, Ln;->ζ:Ljava/lang/Object;

    .line 95
    .line 96
    new-instance p0, Landroid/util/SparseIntArray;

    .line 97
    .line 98
    invoke-direct {p0}, Landroid/util/SparseIntArray;-><init>()V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    .line 104
    .line 105
    new-instance p1, Lqx1;

    .line 106
    .line 107
    sget-object v0, Lln0;->α:Ltf;

    .line 108
    .line 109
    invoke-direct {p1, v0}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 110
    .line 111
    .line 112
    iput-object p1, p0, Ln;->ζ:Ljava/lang/Object;

    .line 113
    .line 114
    return-void

    .line 115
    :sswitch_6
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    sget-object p1, Lx22;->μ:Lx22;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    new-instance v0, Lxk1;

    .line 126
    .line 127
    invoke-direct {v0, p1}, Lxk1;-><init>(Lx22;)V

    .line 128
    .line 129
    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    .line 132
    .line 133
    iput-object v0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 134
    .line 135
    return-void

    .line 136
    nop

    .line 137
    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_6
        0xb -> :sswitch_5
        0x14 -> :sswitch_4
        0x16 -> :sswitch_3
        0x18 -> :sswitch_2
        0x1b -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 144
    iput p1, p0, Ln;->ε:I

    iput-object p2, p0, Ln;->ζ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 137
    iput p1, p0, Ln;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/animation/Animator;)V
    .locals 0

    const/16 p1, 0x12

    iput p1, p0, Ln;->ε:I

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 146
    iput-object p1, p0, Ln;->ζ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    const/16 v0, 0x17

    iput v0, p0, Ln;->ε:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ln;->ζ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Ln;->ε:I

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 151
    invoke-static {p1, p2}, Lp1;->ι(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, Ln;->ζ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/ContentInfo;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Ln;->ε:I

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    invoke-static {p1}, Lp1;->λ(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    iput-object p1, p0, Ln;->ζ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 2

    const/16 v0, 0x10

    iput v0, p0, Ln;->ε:I

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 143
    new-instance v0, Ln5;

    const/16 v1, 0x9

    invoke-direct {v0, p1, v1}, Ln5;-><init>(Landroid/widget/EditText;I)V

    iput-object v0, p0, Ln;->ζ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, Ln;->ε:I

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 141
    new-instance v0, Lzy;

    invoke-direct {v0, p1}, Lzy;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ln;->ζ:Ljava/lang/Object;

    return-void
.end method

.method public static Α(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move-object v1, p0

    .line 19
    check-cast v1, Ljava/lang/Boolean;

    .line 20
    .line 21
    :cond_0
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_1
    const-string p0, "\u5bbf\u4e3b\u65b9\u6cd5 "

    .line 29
    .line 30
    const-string v0, " \u672a\u8fd4\u56de\u5e03\u5c14\u503c"

    .line 31
    .line 32
    invoke-static {p0, p1, v0}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public static Β(Ljava/lang/Object;Ljava/lang/String;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    instance-of v0, p0, Ljava/lang/Number;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move-object v1, p0

    .line 19
    check-cast v1, Ljava/lang/Number;

    .line 20
    .line 21
    :cond_0
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_1
    const-string p0, "\u5bbf\u4e3b\u65b9\u6cd5 "

    .line 29
    .line 30
    const-string v0, " \u672a\u8fd4\u56de\u6574\u6570"

    .line 31
    .line 32
    invoke-static {p0, p1, v0}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public static Δ(Ljava/lang/Object;Lue0;Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget v0, p1, Lue0;->γ:I

    .line 2
    .line 3
    iget v1, p1, Lue0;->δ:I

    .line 4
    .line 5
    if-lez v0, :cond_2

    .line 6
    .line 7
    if-lez v1, :cond_2

    .line 8
    .line 9
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 10
    .line 11
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    :try_start_0
    invoke-virtual {v2, v3}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-string v4, "renderFrame"

    .line 27
    .line 28
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    const-class v6, Landroid/graphics/Bitmap;

    .line 31
    .line 32
    filled-new-array {v5, v5, v6}, [Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v3, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    iget p0, p1, Lue0;->α:I

    .line 56
    .line 57
    int-to-float p0, p0

    .line 58
    iget p1, p1, Lue0;->β:I

    .line 59
    .line 60
    int-to-float p1, p1

    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-virtual {p2, v2, p0, p1, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-nez p0, :cond_0

    .line 70
    .line 71
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 72
    .line 73
    .line 74
    :cond_0
    return-void

    .line 75
    :catchall_0
    move-exception p0

    .line 76
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-nez p1, :cond_1

    .line 81
    .line 82
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 83
    .line 84
    .line 85
    :cond_1
    throw p0

    .line 86
    :cond_2
    const-string p0, "\u52a8\u753b WebP \u5e27\u5c3a\u5bf8\u65e0\u6548"

    .line 87
    .line 88
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public static Θ(III)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-gt v0, p0, :cond_3

    .line 3
    .line 4
    const/16 v1, 0x1001

    .line 5
    .line 6
    if-ge p0, v1, :cond_3

    .line 7
    .line 8
    if-gt v0, p1, :cond_3

    .line 9
    .line 10
    if-ge p1, v1, :cond_3

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-gt v0, p2, :cond_2

    .line 14
    .line 15
    const/16 v0, 0x12d

    .line 16
    .line 17
    if-ge p2, v0, :cond_2

    .line 18
    .line 19
    int-to-long v0, p0

    .line 20
    int-to-long p0, p1

    .line 21
    mul-long/2addr v0, p0

    .line 22
    const-wide/32 p0, 0x400000

    .line 23
    .line 24
    .line 25
    cmp-long p0, v0, p0

    .line 26
    .line 27
    if-gtz p0, :cond_1

    .line 28
    .line 29
    int-to-long p0, p2

    .line 30
    mul-long/2addr v0, p0

    .line 31
    const-wide/32 p0, 0x4c4b400

    .line 32
    .line 33
    .line 34
    cmp-long p0, v0, p0

    .line 35
    .line 36
    if-gtz p0, :cond_0

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    const-string p0, "\u52a8\u753b WebP \u603b\u50cf\u7d20\u91cf\u8fc7\u5927: "

    .line 40
    .line 41
    invoke-static {v0, v1, p0}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string p1, "\u52a8\u753b WebP \u753b\u5e03\u8fc7\u5927: "

    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p1, " pixels"

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_2
    const-string p0, "\u52a8\u753b WebP \u5e27\u6570\u4e0d\u5b89\u5168: "

    .line 79
    .line 80
    invoke-static {p0, p2}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    const-string p2, "\u52a8\u753b WebP \u5c3a\u5bf8\u8d85\u51fa\u5b89\u5168\u8303\u56f4: "

    .line 89
    .line 90
    const-string v0, "x"

    .line 91
    .line 92
    invoke-static {p0, p1, p2, v0}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public static π(Ljava/io/OutputStream;III)Lt3;
    .locals 4

    .line 1
    new-instance v0, Lt3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, Lt3;->ε:Ljava/lang/Integer;

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    iput v1, v0, Lt3;->η:I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iput v2, v0, Lt3;->θ:I

    .line 14
    .line 15
    iput-boolean v2, v0, Lt3;->ι:Z

    .line 16
    .line 17
    const/16 v3, 0x100

    .line 18
    .line 19
    new-array v3, v3, [Z

    .line 20
    .line 21
    iput-object v3, v0, Lt3;->π:[Z

    .line 22
    .line 23
    const/4 v3, 0x7

    .line 24
    iput v3, v0, Lt3;->ρ:I

    .line 25
    .line 26
    iput v1, v0, Lt3;->σ:I

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    iput-boolean v1, v0, Lt3;->τ:Z

    .line 30
    .line 31
    iput-boolean v2, v0, Lt3;->υ:Z

    .line 32
    .line 33
    const/16 v3, 0xa

    .line 34
    .line 35
    iput v3, v0, Lt3;->φ:I

    .line 36
    .line 37
    iput p1, v0, Lt3;->γ:I

    .line 38
    .line 39
    iput p2, v0, Lt3;->δ:I

    .line 40
    .line 41
    if-ge p1, v1, :cond_0

    .line 42
    .line 43
    const/16 p1, 0x140

    .line 44
    .line 45
    iput p1, v0, Lt3;->γ:I

    .line 46
    .line 47
    :cond_0
    if-ge p2, v1, :cond_1

    .line 48
    .line 49
    const/16 p1, 0xf0

    .line 50
    .line 51
    iput p1, v0, Lt3;->δ:I

    .line 52
    .line 53
    :cond_1
    iput-boolean v1, v0, Lt3;->υ:Z

    .line 54
    .line 55
    if-ltz p3, :cond_2

    .line 56
    .line 57
    iput p3, v0, Lt3;->η:I

    .line 58
    .line 59
    :cond_2
    iput v3, v0, Lt3;->φ:I

    .line 60
    .line 61
    const/4 p1, 0x2

    .line 62
    iput p1, v0, Lt3;->σ:I

    .line 63
    .line 64
    iput-object p0, v0, Lt3;->κ:Ljava/io/OutputStream;

    .line 65
    .line 66
    :try_start_0
    const-string p0, "GIF89a"

    .line 67
    .line 68
    move p1, v2

    .line 69
    :goto_0
    const/4 p2, 0x6

    .line 70
    if-ge p1, p2, :cond_3

    .line 71
    .line 72
    iget-object p2, v0, Lt3;->κ:Ljava/io/OutputStream;

    .line 73
    .line 74
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 75
    .line 76
    .line 77
    move-result p3

    .line 78
    int-to-byte p3, p3

    .line 79
    invoke-virtual {p2, p3}, Ljava/io/OutputStream;->write(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .line 81
    .line 82
    add-int/lit8 p1, p1, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    move v2, v1

    .line 86
    :catch_0
    iput-boolean v2, v0, Lt3;->ι:Z

    .line 87
    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_4
    const-string p0, "GIF \u7f16\u7801\u5668\u65e0\u6cd5\u6253\u5f00\u8f93\u51fa\u6d41"

    .line 92
    .line 93
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const/4 p0, 0x0

    .line 97
    return-object p0
.end method

.method public static σ(Landroid/app/Activity;I)I
    .locals 1

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    float-to-int p0, p0

    .line 16
    return p0
.end method

.method public static φ(II)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    const/4 v4, 0x1

    .line 6
    if-ge v1, p0, :cond_2

    .line 7
    .line 8
    add-int/lit8 v2, v2, 0x1

    .line 9
    .line 10
    if-ne v2, p1, :cond_0

    .line 11
    .line 12
    add-int/lit8 v3, v3, 0x1

    .line 13
    .line 14
    move v2, v0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    if-le v2, p1, :cond_1

    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    move v2, v4

    .line 21
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    add-int/2addr v2, v4

    .line 25
    if-le v2, p1, :cond_3

    .line 26
    .line 27
    add-int/2addr v3, v4

    .line 28
    :cond_3
    return v3
.end method


# virtual methods
.method public build()Lhp;
    .locals 2

    .line 1
    new-instance v0, Lhp;

    .line 2
    .line 3
    new-instance v1, Ln;

    .line 4
    .line 5
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/view/ContentInfo$Builder;

    .line 8
    .line 9
    invoke-static {p0}, Lp1;->κ(Landroid/view/ContentInfo$Builder;)Landroid/view/ContentInfo;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v1, p0}, Ln;-><init>(Landroid/view/ContentInfo;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lhp;-><init>(Lgp;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public setExtras(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lp1;->Α(Landroid/view/ContentInfo$Builder;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Ln;->ε:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :sswitch_0
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lqx1;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :sswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, "ContentInfoCompat{"

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Landroid/view/ContentInfo;

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, "}"

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :sswitch_2
    const-string p0, "Bradford"

    .line 45
    .line 46
    return-object p0

    .line 47
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x9 -> :sswitch_1
        0xb -> :sswitch_0
    .end sparse-switch
.end method

.method public Γ(Lyp0;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lyp0;->Η()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "DepthSortedSet.remove called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lqx1;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public Ε(FFJ)V
    .locals 4

    .line 1
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lm6;

    .line 4
    .line 5
    invoke-virtual {p0}, Lm6;->υ()Lde;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x20

    .line 10
    .line 11
    shr-long v0, p3, v0

    .line 12
    .line 13
    long-to-int v0, v0

    .line 14
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-wide v2, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p3, v2

    .line 24
    long-to-int p3, p3

    .line 25
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    invoke-interface {p0, v1, p4}, Lde;->δ(FF)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, p1, p2}, Lde;->α(FF)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    neg-float p1, p1

    .line 40
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    neg-float p2, p2

    .line 45
    invoke-interface {p0, p1, p2}, Lde;->δ(FF)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public Ζ()V
    .locals 1

    .line 1
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 13
    .line 14
    const-string v0, "\u804a\u5929\u8bb0\u5f55\u5bfc\u51fa\u5df2\u53d6\u6d88"

    .line 15
    .line 16
    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method public Η(FF)V
    .locals 0

    .line 1
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lm6;

    .line 4
    .line 5
    invoke-virtual {p0}, Lm6;->υ()Lde;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0, p1, p2}, Lde;->δ(FF)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public α(Liz0;Z)V
    .locals 2

    .line 1
    instance-of v0, p1, Lb12;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lb12;

    .line 7
    .line 8
    iget-object v0, v0, Lb12;->Β:Liz0;

    .line 9
    .line 10
    invoke-virtual {v0}, Liz0;->λ()Liz0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Liz0;->γ(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Landroidx/appcompat/widget/γ;

    .line 21
    .line 22
    iget-object p0, p0, Landroidx/appcompat/widget/γ;->ι:Ltz0;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-interface {p0, p1, p2}, Ltz0;->α(Liz0;Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public β()I
    .locals 0

    .line 1
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {p0}, Lp1;->Ζ(Landroid/view/ContentInfo;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public γ()Landroid/content/ClipData;
    .locals 0

    .line 1
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {p0}, Lp1;->γ(Landroid/view/ContentInfo;)Landroid/content/ClipData;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public δ(Liz0;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/appcompat/widget/ActionMenuView;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->Ζ:Lｖ;

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    check-cast p0, Lt42;

    .line 10
    .line 11
    iget-object p0, p0, Lt42;->ε:Landroidx/appcompat/widget/Toolbar;

    .line 12
    .line 13
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->Ν:Lm6;

    .line 14
    .line 15
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lv60;

    .line 34
    .line 35
    iget-object p1, p1, Lv60;->α:Lb70;

    .line 36
    .line 37
    invoke-virtual {p1}, Lb70;->ο()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    const/4 p0, 0x1

    .line 44
    return p0

    .line 45
    :cond_1
    const/4 p0, 0x0

    .line 46
    return p0
.end method

.method public ε()I
    .locals 0

    .line 1
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {p0}, Lp1;->β(Landroid/view/ContentInfo;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public ζ(Liz0;Landroid/view/MenuItem;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lie;

    .line 4
    .line 5
    iget-object p0, p0, Lie;->κ:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public η()Landroid/view/ContentInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    return-object p0
.end method

.method public θ(Liz0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/appcompat/widget/ActionMenuView;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->Α:Lt42;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lt42;->θ(Liz0;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public ι(Landroid/net/Uri;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lp1;->ω(Landroid/view/ContentInfo$Builder;Landroid/net/Uri;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public κ(Liz0;Llz0;)V
    .locals 7

    .line 1
    iget-object v0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lie;

    .line 4
    .line 5
    iget-object v1, v0, Lie;->κ:Landroid/os/Handler;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lie;->μ:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    const/4 v5, -0x1

    .line 19
    if-ge v4, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    check-cast v6, Lhe;

    .line 26
    .line 27
    iget-object v6, v6, Lhe;->β:Liz0;

    .line 28
    .line 29
    if-ne p1, v6, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v4, v5

    .line 36
    :goto_1
    if-ne v4, v5, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-ge v4, v3, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move-object v2, v0

    .line 52
    check-cast v2, Lhe;

    .line 53
    .line 54
    :cond_3
    new-instance v0, Lca;

    .line 55
    .line 56
    invoke-direct {v0, p0, v2, p2, p1}, Lca;-><init>(Ln;Lhe;Llz0;Liz0;)V

    .line 57
    .line 58
    .line 59
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 60
    .line 61
    .line 62
    move-result-wide v2

    .line 63
    const-wide/16 v4, 0xc8

    .line 64
    .line 65
    add-long/2addr v2, v4

    .line 66
    invoke-virtual {v1, v0, p1, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public λ(Liz0;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/appcompat/widget/γ;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/appcompat/widget/γ;->η:Liz0;

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, p1

    .line 11
    check-cast v0, Lb12;

    .line 12
    .line 13
    iget-object v0, v0, Lb12;->Γ:Llz0;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Landroidx/appcompat/widget/γ;->ι:Ltz0;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-interface {p0, p1}, Ltz0;->λ(Liz0;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public μ(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lp1;->ψ(Landroid/view/ContentInfo$Builder;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public ν(Lyp0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lyp0;->Η()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "DepthSortedSet.add called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lqx1;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public ξ(ILэ;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ο(I)Lэ;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public ρ()V
    .locals 0

    .line 1
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lun;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public τ(I)Lэ;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public υ()Lc02;
    .locals 3

    .line 1
    invoke-static {}, Ljy;->α()Ljy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljy;->β()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    new-instance p0, Ljl0;

    .line 13
    .line 14
    invoke-direct {p0, v2}, Ljl0;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {v1}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Ldr;

    .line 25
    .line 26
    invoke-direct {v2, v1, p0}, Ldr;-><init>(Lx91;Ln;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljy;->η(Lgy;)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public χ(FFFF)V
    .locals 8

    .line 1
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lm6;

    .line 4
    .line 5
    invoke-virtual {p0}, Lm6;->υ()Lde;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lm6;->Ζ()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const/16 v3, 0x20

    .line 14
    .line 15
    shr-long/2addr v1, v3

    .line 16
    long-to-int v1, v1

    .line 17
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-float/2addr p3, p1

    .line 22
    sub-float/2addr v1, p3

    .line 23
    invoke-virtual {p0}, Lm6;->Ζ()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    const-wide v6, 0xffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr v4, v6

    .line 33
    long-to-int p3, v4

    .line 34
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    add-float/2addr p4, p2

    .line 39
    sub-float/2addr p3, p4

    .line 40
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result p4

    .line 44
    int-to-long v1, p4

    .line 45
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    int-to-long p3, p3

    .line 50
    shl-long/2addr v1, v3

    .line 51
    and-long/2addr p3, v6

    .line 52
    or-long/2addr p3, v1

    .line 53
    shr-long v1, p3, v3

    .line 54
    .line 55
    long-to-int v1, v1

    .line 56
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const/4 v2, 0x0

    .line 61
    cmpl-float v1, v1, v2

    .line 62
    .line 63
    if-ltz v1, :cond_0

    .line 64
    .line 65
    and-long v3, p3, v6

    .line 66
    .line 67
    long-to-int v1, v3

    .line 68
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    cmpl-float v1, v1, v2

    .line 73
    .line 74
    if-ltz v1, :cond_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    const-string v1, "Width and height must be greater than or equal to zero"

    .line 78
    .line 79
    invoke-static {v1}, Lzl0;->α(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    invoke-virtual {p0, p3, p4}, Lm6;->Υ(J)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v0, p1, p2}, Lde;->δ(FF)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public ψ()V
    .locals 0

    .line 1
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lp60;

    .line 4
    .line 5
    iget-object p0, p0, Lp60;->ω:Lb70;

    .line 6
    .line 7
    invoke-virtual {p0}, Lb70;->Ν()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public ω(IILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
