.class public abstract Lxhss/ᛱᛷᛵᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:Lxhss/ᛶᛵᲇᛸ;

.field public static final ᛳᲁᲇᛸ:Lxhss/ᛳᛴᲀᲁ;

.field public static final ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᛶᛵᲇᛸ;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lxhss/ᛶᛵᲇᛸ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxhss/ᛱᛷᛵᛷ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 8
    .line 9
    new-instance v0, Lxhss/ᛶᛵᲇᛸ;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Lxhss/ᛶᛵᲇᛸ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lxhss/ᛱᛷᛵᛷ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛵᲇᛸ;

    .line 16
    .line 17
    new-instance v0, Lxhss/ᛳᛴᲀᲁ;

    .line 18
    .line 19
    const/16 v1, 0x1d

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lxhss/ᛳᛴᲀᲁ;-><init>(I)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lxhss/ᛱᛷᛵᛷ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛴᲀᲁ;

    .line 25
    .line 26
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Lxhss/ᛷᛲᛳᛴ;)V
    .locals 2

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lxhss/ᲀᛸᛳᲈ;

    .line 3
    .line 4
    invoke-interface {v0}, Lxhss/ᲀᛸᛳᲈ;->ᛱᛱᛲᲇ()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x2

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string v0, "kotlin.jvm.functions.Function2"

    .line 13
    .line 14
    invoke-static {p0, v0}, Lxhss/ᛱᛷᛵᛷ;->ᛶᲇᲈᛸ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    throw p0
.end method

.method public static ᛳᲁᲇᛸ(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x7f

    .line 6
    .line 7
    if-gt v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static ᛳᲈᲈᛲ(Landroid/app/Activity;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 2
    .line 3
    new-instance v0, Landroid/widget/FrameLayout;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroid/view/ViewGroup;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 24
    .line 25
    const/4 v2, -0x1

    .line 26
    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 30
    .line 31
    .line 32
    const-string p1, "window"

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Landroid/view/WindowManager;

    .line 39
    .line 40
    new-instance p1, Landroid/view/WindowManager$LayoutParams;

    .line 41
    .line 42
    invoke-direct {p1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 43
    .line 44
    .line 45
    const/16 v1, 0x10

    .line 46
    .line 47
    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 48
    .line 49
    const/4 v2, -0x2

    .line 50
    iput v2, p1, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 51
    .line 52
    const/16 v2, 0x3eb

    .line 53
    .line 54
    iput v2, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 55
    .line 56
    const v2, 0xc000500

    .line 57
    .line 58
    .line 59
    iput v2, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 60
    .line 61
    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 62
    .line 63
    const/4 v1, 0x1

    .line 64
    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    .line 65
    .line 66
    invoke-interface {p0, v0, p1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public static ᛶᲇᲈᛸ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, " cannot be cast to "

    .line 10
    .line 11
    invoke-static {p0, v0, p1}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance p1, Ljava/lang/ClassCastException;

    .line 16
    .line 17
    invoke-direct {p1, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-class p0, Lxhss/ᛱᛷᛵᛷ;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p1, p0}, Lxhss/ᛱᛱᛷᛸ;->ᲈᛳᲀ(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method

.method public static final ᛷᛴᛷᛱ(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p0, v0, :cond_0

    .line 3
    .line 4
    return-void

    .line 5
    :cond_0
    const-string v0, "Expected positive parallelism level, but got "

    .line 6
    .line 7
    invoke-static {v0, p0}, Lxhss/ᛴᛸᛲᛳ;->ᛶᲇᲈᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛱᛱᛲᲇ(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/util/Set;
    .locals 1

    .line 1
    instance-of v0, p0, Lxhss/ᛱᛶᲈᛵ;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, Lxhss/ᲈᛷᛷ;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "kotlin.collections.MutableSet"

    .line 11
    .line 12
    invoke-static {p0, v0}, Lxhss/ᛱᛷᛵᛷ;->ᛶᲇᲈᛸ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    throw p0

    .line 17
    :cond_1
    :goto_0
    :try_start_0
    check-cast p0, Ljava/util/Set;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :catch_0
    move-exception p0

    .line 21
    const-class v0, Lxhss/ᛱᛷᛵᛷ;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p0, v0}, Lxhss/ᛱᛱᛷᛸ;->ᲈᛳᲀ(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p0
.end method

.method public static ᛷᲁᲁ(C)Z
    .locals 1

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x1f

    .line 4
    .line 5
    if-le p0, v0, :cond_2

    .line 6
    .line 7
    :cond_0
    const/16 v0, 0x7f

    .line 8
    .line 9
    if-lt p0, v0, :cond_1

    .line 10
    .line 11
    const/16 v0, 0x9f

    .line 12
    .line 13
    if-le p0, v0, :cond_2

    .line 14
    .line 15
    :cond_1
    const/16 v0, 0x2000

    .line 16
    .line 17
    if-lt p0, v0, :cond_3

    .line 18
    .line 19
    const/16 v0, 0x20ff

    .line 20
    .line 21
    if-gt p0, v0, :cond_3

    .line 22
    .line 23
    :cond_2
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_3
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public static final ᛸᛲᲀᛵ(Lxhss/ᛲᛶᛳᲁ;Lxhss/ᛶᛳᲁᲈ;)V
    .locals 11

    .line 1
    sget-wide v0, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 2
    .line 3
    :goto_0
    sget-object v2, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 4
    .line 5
    invoke-virtual {v2, p0, v0, v1}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v7

    .line 9
    instance-of v3, v7, Lxhss/ᛶᲀᛵᲇ;

    .line 10
    .line 11
    if-eqz v3, :cond_2

    .line 12
    .line 13
    :goto_1
    sget-object v3, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v5, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 16
    .line 17
    move-object v4, p0

    .line 18
    move-object v8, p1

    .line 19
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    move-object p1, v4

    .line 24
    move-object v9, v8

    .line 25
    move-object v8, v7

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_0
    invoke-virtual {v3, p1, v0, v1}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eq p0, v8, :cond_1

    .line 35
    .line 36
    move-object v4, p1

    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_1
    move-object p0, p1

    .line 40
    move-object v7, v8

    .line 41
    move-object p1, v9

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move-object v9, p1

    .line 44
    move-object v8, v7

    .line 45
    move-object p1, p0

    .line 46
    instance-of p0, v8, Lxhss/ᛶᛳᲁᲈ;

    .line 47
    .line 48
    const/4 v10, 0x0

    .line 49
    if-nez p0, :cond_d

    .line 50
    .line 51
    instance-of p0, v8, Lxhss/ᛷᲁᲇᛷ;

    .line 52
    .line 53
    if-eqz p0, :cond_4

    .line 54
    .line 55
    move-object v3, v8

    .line 56
    check-cast v3, Lxhss/ᛷᲁᲇᛷ;

    .line 57
    .line 58
    const/4 v7, 0x1

    .line 59
    sget-wide v4, Lxhss/ᛷᲁᲇᛷ;->ᛱᛱᛲᲇ:J

    .line 60
    .line 61
    const/4 v6, 0x0

    .line 62
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_3

    .line 67
    .line 68
    instance-of p0, v8, Lxhss/ᛴᲀᛳᛱ;

    .line 69
    .line 70
    if-eqz p0, :cond_b

    .line 71
    .line 72
    iget-object p0, v3, Lxhss/ᛷᲁᲇᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Throwable;

    .line 73
    .line 74
    invoke-virtual {p1, v9, p0}, Lxhss/ᛲᛶᛳᲁ;->ᛸᛷᲈᲈ(Lxhss/ᛶᛳᲁᲈ;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    invoke-static {v9, v8}, Lxhss/ᛲᛶᛳᲁ;->ᛸᛶᛴᲈ(Lxhss/ᛶᛳᲁᲈ;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    throw v10

    .line 82
    :cond_4
    instance-of p0, v8, Lxhss/ᲇᲁᛲᛳ;

    .line 83
    .line 84
    if-eqz p0, :cond_9

    .line 85
    .line 86
    move-object v7, v8

    .line 87
    check-cast v7, Lxhss/ᲇᲁᛲᛳ;

    .line 88
    .line 89
    iget-object p0, v7, Lxhss/ᲇᲁᛲᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛳᲁᲈ;

    .line 90
    .line 91
    if-nez p0, :cond_8

    .line 92
    .line 93
    iget-object p0, v7, Lxhss/ᲇᲁᛲᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Throwable;

    .line 94
    .line 95
    if-eqz p0, :cond_5

    .line 96
    .line 97
    invoke-virtual {p1, v9, p0}, Lxhss/ᛲᛶᛳᲁ;->ᛸᛷᲈᲈ(Lxhss/ᛶᛳᲁᲈ;Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_5
    const/16 p0, 0x1d

    .line 102
    .line 103
    invoke-static {v7, v9, v10, p0}, Lxhss/ᲇᲁᛲᛳ;->ᛷᛵᛵᲈ(Lxhss/ᲇᲁᛲᛳ;Lxhss/ᛶᛳᲁᲈ;Ljava/util/concurrent/CancellationException;I)Lxhss/ᲇᲁᛲᛳ;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :goto_2
    sget-object v3, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 108
    .line 109
    sget-wide v5, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 110
    .line 111
    move-object v4, p1

    .line 112
    move-object v7, v8

    .line 113
    move-object v8, p0

    .line 114
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-eqz p0, :cond_6

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    invoke-virtual {v3, v4, v0, v1}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    if-eq p0, v7, :cond_7

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_7
    move-object p1, v4

    .line 129
    move-object p0, v8

    .line 130
    move-object v8, v7

    .line 131
    goto :goto_2

    .line 132
    :cond_8
    move-object v7, v8

    .line 133
    invoke-static {v9, v7}, Lxhss/ᛲᛶᛳᲁ;->ᛸᛶᛴᲈ(Lxhss/ᛶᛳᲁᲈ;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    throw v10

    .line 137
    :cond_9
    move-object v4, p1

    .line 138
    move-object v7, v8

    .line 139
    new-instance v8, Lxhss/ᲇᲁᛲᛳ;

    .line 140
    .line 141
    const/16 p0, 0x1c

    .line 142
    .line 143
    invoke-direct {v8, v7, v9, v10, p0}, Lxhss/ᲇᲁᛲᛳ;-><init>(Ljava/lang/Object;Lxhss/ᛶᛳᲁᲈ;Ljava/util/concurrent/CancellationException;I)V

    .line 144
    .line 145
    .line 146
    :cond_a
    sget-object v3, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 147
    .line 148
    sget-wide v5, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 149
    .line 150
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    if-eqz p0, :cond_c

    .line 155
    .line 156
    :cond_b
    :goto_3
    return-void

    .line 157
    :cond_c
    invoke-virtual {v3, v4, v0, v1}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    if-eq p0, v7, :cond_a

    .line 162
    .line 163
    :goto_4
    move-object p0, v4

    .line 164
    move-object p1, v9

    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :cond_d
    move-object v7, v8

    .line 168
    invoke-static {v9, v7}, Lxhss/ᛲᛶᛳᲁ;->ᛸᛶᛴᲈ(Lxhss/ᛶᛳᲁᲈ;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    throw v10
.end method

.method public static final ᛸᛴᛶᛳ(Lxhss/ᛴᛲᛴᲇ;Ljava/lang/Object;I)I
    .locals 4

    .line 1
    iget v0, p0, Lxhss/ᛴᛲᛴᲇ;->ᲇᛴᲇᛵ:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    :try_start_0
    iget-object v1, p0, Lxhss/ᛴᛲᛴᲇ;->ᛱᛱᛲᲇ:[I

    .line 8
    .line 9
    invoke-static {v0, p2, v1}, Lxhss/ᛵᛵᛲᲈ;->ᛷᛵᛵᲈ(II[I)I

    .line 10
    .line 11
    .line 12
    move-result v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    if-gez v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object v2, p0, Lxhss/ᛴᛲᛴᲇ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 17
    .line 18
    aget-object v2, v2, v1

    .line 19
    .line 20
    invoke-static {p1, v2}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    :goto_0
    return v1

    .line 27
    :cond_2
    add-int/lit8 v2, v1, 0x1

    .line 28
    .line 29
    :goto_1
    if-ge v2, v0, :cond_4

    .line 30
    .line 31
    iget-object v3, p0, Lxhss/ᛴᛲᛴᲇ;->ᛱᛱᛲᲇ:[I

    .line 32
    .line 33
    aget v3, v3, v2

    .line 34
    .line 35
    if-ne v3, p2, :cond_4

    .line 36
    .line 37
    iget-object v3, p0, Lxhss/ᛴᛲᛴᲇ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 38
    .line 39
    aget-object v3, v3, v2

    .line 40
    .line 41
    invoke-static {p1, v3}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    return v2

    .line 48
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_4
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    :goto_2
    if-ltz v1, :cond_6

    .line 54
    .line 55
    iget-object v0, p0, Lxhss/ᛴᛲᛴᲇ;->ᛱᛱᛲᲇ:[I

    .line 56
    .line 57
    aget v0, v0, v1

    .line 58
    .line 59
    if-ne v0, p2, :cond_6

    .line 60
    .line 61
    iget-object v0, p0, Lxhss/ᛴᛲᛴᲇ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 62
    .line 63
    aget-object v0, v0, v1

    .line 64
    .line 65
    invoke-static {p1, v0}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_5

    .line 70
    .line 71
    return v1

    .line 72
    :cond_5
    add-int/lit8 v1, v1, -0x1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_6
    not-int p0, v2

    .line 76
    return p0

    .line 77
    :catch_0
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 78
    .line 79
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 80
    .line 81
    .line 82
    throw p0
.end method

.method public static ᛸᛶᲈᛶ(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛴᛵᛳᛵ;)Lxhss/ᛴᛵᛳᛵ;
    .locals 2

    .line 1
    sget-object v0, Lxhss/ᲇᛷᲁᛷ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛷᲁᛷ;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lxhss/ᲇᛵᲈᛵ;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, v1}, Lxhss/ᲇᛵᲈᛵ;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, p0, v0}, Lxhss/ᛴᛵᛳᛵ;->ᛳᲁᲇᛸ(Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lxhss/ᛴᛵᛳᛵ;

    .line 17
    .line 18
    return-object p0
.end method

.method public static ᛸᛷᲈᲈ(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x3

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0x6e

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    const-string v0, "null"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_1
    const/16 v1, 0x74

    .line 26
    .line 27
    if-ne v0, v1, :cond_2

    .line 28
    .line 29
    const-string v0, "true"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :cond_2
    const/16 v1, 0x66

    .line 37
    .line 38
    if-ne v0, v1, :cond_3

    .line 39
    .line 40
    const-string v0, "false"

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :cond_3
    const/16 v1, 0x4e

    .line 48
    .line 49
    if-ne v0, v1, :cond_4

    .line 50
    .line 51
    const-string v0, "NaN"

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    return p0

    .line 58
    :cond_4
    return v2
.end method

.method public static ᲀᲇᛳᲁ(Ljavax/net/ssl/SSLSession;)Lxhss/ᛵᛲᛸᛲ;
    .locals 6

    .line 1
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

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
    const-string v2, "TLS_NULL_WITH_NULL_NULL"

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_2

    .line 15
    .line 16
    const-string v2, "SSL_NULL_WITH_NULL_NULL"

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_2

    .line 23
    .line 24
    sget-object v2, Lxhss/ᛳᲁᲇᲀ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛴᲀᲁ;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Lxhss/ᛳᛴᲀᲁ;->ᲇᛶᛴᲀ(Ljava/lang/String;)Lxhss/ᛳᲁᲇᲀ;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getProtocol()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    const-string v3, "NONE"

    .line 37
    .line 38
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    invoke-static {v2}, Lxhss/ᲀᲈᛵᛸ;->ᲀᲇᛳᲁ(Ljava/lang/String;)Lxhss/ᛶᲈᛴ;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :try_start_0
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v2}, Lxhss/ᛶᛴᲀᛲ;->ᛸᛷᲈᲈ([Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v2
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    goto :goto_0

    .line 57
    :catch_0
    sget-object v2, Lxhss/ᛵᛷᛶᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛷᛶᛱ;

    .line 58
    .line 59
    :goto_0
    new-instance v3, Lxhss/ᛵᛲᛸᛲ;

    .line 60
    .line 61
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getLocalCertificates()[Ljava/security/cert/Certificate;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0}, Lxhss/ᛶᛴᲀᛲ;->ᛸᛷᲈᲈ([Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    new-instance v4, Lxhss/ᛲᛶᲀᛲ;

    .line 70
    .line 71
    const/4 v5, 0x1

    .line 72
    invoke-direct {v4, v5, v2}, Lxhss/ᛲᛶᲀᛲ;-><init>(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {v3, v1, v0, p0, v4}, Lxhss/ᛵᛲᛸᛲ;-><init>(Lxhss/ᛶᲈᛴ;Lxhss/ᛳᲁᲇᲀ;Ljava/util/List;Lxhss/ᛱᛳᲇᛶ;)V

    .line 76
    .line 77
    .line 78
    return-object v3

    .line 79
    :cond_0
    const-string p0, "tlsVersion == NONE"

    .line 80
    .line 81
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_1
    const-string p0, "tlsVersion == null"

    .line 86
    .line 87
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_2
    const-string p0, "cipherSuite == "

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object v1

    .line 101
    :cond_3
    const-string p0, "cipherSuite == null"

    .line 102
    .line 103
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-object v1
.end method

.method public static ᲇᛴᲇᛵ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p1}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛲᛷᛱ(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static final ᲇᛶᛴᲀ(C)I
    .locals 3

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-gt v0, p0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x3a

    .line 6
    .line 7
    if-ge p0, v1, :cond_0

    .line 8
    .line 9
    sub-int/2addr p0, v0

    .line 10
    return p0

    .line 11
    :cond_0
    const/16 v0, 0x61

    .line 12
    .line 13
    if-gt v0, p0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x67

    .line 16
    .line 17
    if-ge p0, v0, :cond_1

    .line 18
    .line 19
    add-int/lit8 p0, p0, -0x57

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    const/16 v0, 0x41

    .line 23
    .line 24
    if-gt v0, p0, :cond_2

    .line 25
    .line 26
    const/16 v0, 0x47

    .line 27
    .line 28
    if-ge p0, v0, :cond_2

    .line 29
    .line 30
    add-int/lit8 p0, p0, -0x37

    .line 31
    .line 32
    return p0

    .line 33
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v2, "Unexpected hex digit: "

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0
.end method

.method public static final ᲇᛸᛳᲁ(Lxhss/ᛲᛶᛳᲁ;Lxhss/ᛱᛴᛶᛴ;Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lxhss/ᛲᛶᛳᲁ;->ᛳᲁᲇᛸ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance p0, Lxhss/ᲈᛳᛱᲇ;

    .line 12
    .line 13
    invoke-direct {p0, v1}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0, v0}, Lxhss/ᛲᛶᛳᲁ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_0
    if-eqz p2, :cond_6

    .line 22
    .line 23
    check-cast p1, Lxhss/ᛸᲇᲁᛱ;

    .line 24
    .line 25
    iget-object p2, p1, Lxhss/ᛸᲇᲁᛱ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛴᛳᛷ;

    .line 26
    .line 27
    iget-object v0, p1, Lxhss/ᛸᲇᲁᛱ;->ᛸᛴᛶᛳ:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v1, p2, Lxhss/ᛸᛴᛳᛷ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛵᛳᛵ;

    .line 30
    .line 31
    invoke-static {v1, v0}, Lxhss/ᛶᲈᛴᛲ;->ᲁᛲᛴᛴ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v2, Lxhss/ᛶᲈᛴᛲ;->ᛷᛴᛷᛱ:Lxhss/ᛶᛲᛷᛵ;

    .line 36
    .line 37
    if-eq v0, v2, :cond_1

    .line 38
    .line 39
    invoke-static {p2, v1, v0}, Lxhss/ᛵᛶᲀᲇ;->ᲈᛳᲀ(Lxhss/ᛸᛴᛳᛷ;Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)Lxhss/ᲈᲇᛵ;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/4 p2, 0x0

    .line 45
    :goto_1
    :try_start_0
    iget-object p1, p1, Lxhss/ᛸᲇᲁᛱ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛴᛳᛷ;

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Lxhss/ᛷᛲᛳᛴ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    if-eqz p2, :cond_3

    .line 51
    .line 52
    invoke-virtual {p2}, Lxhss/ᲈᲇᛵ;->ᛴᛷᛵᛴ()Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    return-void

    .line 60
    :cond_3
    :goto_2
    invoke-static {v1, v0}, Lxhss/ᛶᲈᛴᛲ;->ᛸᛲᛷᛱ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    if-eqz p2, :cond_4

    .line 66
    .line 67
    invoke-virtual {p2}, Lxhss/ᲈᲇᛵ;->ᛴᛷᛵᛴ()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_5

    .line 72
    .line 73
    :cond_4
    invoke-static {v1, v0}, Lxhss/ᛶᲈᛴᛲ;->ᛸᛲᛷᛱ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_5
    throw p0

    .line 77
    :cond_6
    invoke-interface {p1, p0}, Lxhss/ᛱᛴᛶᛴ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public static ᲈᛳᲀ(C)Z
    .locals 1

    .line 1
    const/16 v0, 0x7b

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x5b

    .line 6
    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x2c

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x7d

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x5d

    .line 18
    .line 19
    if-eq p0, v0, :cond_1

    .line 20
    .line 21
    const/16 v0, 0x3a

    .line 22
    .line 23
    if-eq p0, v0, :cond_1

    .line 24
    .line 25
    const/16 v0, 0x27

    .line 26
    .line 27
    if-eq p0, v0, :cond_1

    .line 28
    .line 29
    const/16 v0, 0x22

    .line 30
    .line 31
    if-ne p0, v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method
