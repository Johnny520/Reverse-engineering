.class public final Lda/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final k:Ljava/util/List;


# instance fields
.field public final a:Lr8/g;

.field public final b:Landroid/content/SharedPreferences;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public final f:Ljava/util/concurrent/ConcurrentHashMap;

.field public final g:Lsf/i;

.field public final h:Lsf/i;

.field public final i:Lsf/i;

.field public volatile j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "bjx"

    .line 2
    .line 3
    const-string v1, "bj2"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lda/h;->k:Ljava/util/List;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lr8/g;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lda/h;->a:Lr8/g;

    .line 8
    .line 9
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    const-string v0, "Hchat_message_text_color_config"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lda/h;->b:Landroid/content/SharedPreferences;

    .line 18
    .line 19
    const-string v0, "Hchat_message_text_color_method_cache"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lda/h;->c:Landroid/content/SharedPreferences;

    .line 26
    .line 27
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lda/h;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lda/h;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lda/h;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    new-instance p1, Lda/a;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-direct {p1, p0, v0}, Lda/a;-><init>(Lda/h;I)V

    .line 52
    .line 53
    .line 54
    new-instance v0, Lsf/i;

    .line 55
    .line 56
    invoke-direct {v0, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, Lda/h;->g:Lsf/i;

    .line 60
    .line 61
    new-instance p1, Lda/a;

    .line 62
    .line 63
    const/4 v0, 0x1

    .line 64
    invoke-direct {p1, p0, v0}, Lda/a;-><init>(Lda/h;I)V

    .line 65
    .line 66
    .line 67
    new-instance v0, Lsf/i;

    .line 68
    .line 69
    invoke-direct {v0, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Lda/h;->h:Lsf/i;

    .line 73
    .line 74
    new-instance p1, Lda/a;

    .line 75
    .line 76
    const/4 v0, 0x2

    .line 77
    invoke-direct {p1, p0, v0}, Lda/a;-><init>(Lda/h;I)V

    .line 78
    .line 79
    .line 80
    new-instance v0, Lsf/i;

    .line 81
    .line 82
    invoke-direct {v0, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, Lda/h;->i:Lsf/i;

    .line 86
    .line 87
    return-void
.end method

.method public static A(Landroid/view/View;)Landroid/widget/TextView;
    .locals 3

    .line 1
    invoke-static {p0}, Lda/h;->m(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [Ljava/lang/Object;

    .line 10
    .line 11
    const-string v2, "getWrappedTextView"

    .line 12
    .line 13
    invoke-static {p0, v2, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v2, v0, Landroid/widget/TextView;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    check-cast v0, Landroid/widget/TextView;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v0, v1

    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    check-cast p0, Landroid/widget/TextView;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_2
    instance-of v0, p0, Landroid/widget/TextView;

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    check-cast p0, Landroid/widget/TextView;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_3
    return-object v1
.end method

.method public static final a(Lda/h;Landroid/view/View;Lda/f;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p2, Lda/f;->a:Landroid/view/View;

    .line 5
    .line 6
    iget-object p2, p2, Lda/f;->b:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v1, v2

    .line 21
    :goto_0
    if-eqz v1, :cond_1

    .line 22
    .line 23
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    goto :goto_3

    .line 28
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-lez v0, :cond_2

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move-object v1, v2

    .line 40
    :goto_2
    if-eqz v1, :cond_3

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    :goto_3
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    if-lez v1, :cond_4

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_4
    move-object v3, v2

    .line 59
    :goto_4
    if-eqz v3, :cond_5

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    goto :goto_5

    .line 66
    :cond_5
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    if-lez v1, :cond_6

    .line 75
    .line 76
    move-object v2, v3

    .line 77
    :cond_6
    if-eqz v2, :cond_7

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    goto :goto_5

    .line 84
    :cond_7
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    :goto_5
    const/4 v2, 0x0

    .line 89
    if-gez v0, :cond_8

    .line 90
    .line 91
    move v0, v2

    .line 92
    :cond_8
    if-gez v1, :cond_9

    .line 93
    .line 94
    move v1, v2

    .line 95
    :cond_9
    mul-int/2addr v0, v1

    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    if-nez v1, :cond_a

    .line 101
    .line 102
    invoke-virtual {p2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    if-eqz v1, :cond_b

    .line 107
    .line 108
    :cond_a
    const v1, 0x186a0

    .line 109
    .line 110
    .line 111
    add-int/2addr v0, v1

    .line 112
    :cond_b
    invoke-virtual {p2}, Landroid/widget/TextView;->getTextSize()F

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    const/4 v2, 0x1

    .line 125
    const/high16 v3, 0x41500000    # 13.0f

    .line 126
    .line 127
    invoke-static {v2, v3, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    float-to-int p2, p2

    .line 132
    int-to-float p2, p2

    .line 133
    cmpl-float p2, v1, p2

    .line 134
    .line 135
    if-ltz p2, :cond_c

    .line 136
    .line 137
    add-int/lit16 v0, v0, 0x4e20

    .line 138
    .line 139
    :cond_c
    const/4 p2, 0x2

    .line 140
    new-array v1, p2, [I

    .line 141
    .line 142
    new-array p2, p2, [I

    .line 143
    .line 144
    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, p2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 148
    .line 149
    .line 150
    aget p0, v1, v2

    .line 151
    .line 152
    aget p1, p2, v2

    .line 153
    .line 154
    if-lt p0, p1, :cond_d

    .line 155
    .line 156
    add-int/lit16 v0, v0, 0x1388

    .line 157
    .line 158
    :cond_d
    return v0
.end method

.method public static b(Ljava/lang/String;Ljava/util/LinkedHashSet;)V
    .locals 3

    .line 1
    invoke-static {p0}, Lda/h;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {p1, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    const-string v0, ":\n"

    .line 16
    .line 17
    const/4 v1, 0x6

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {p0, v0, v2, v2, v1}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-lez v0, :cond_1

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x2

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-ge v0, v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Lda/h;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-interface {p1, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Lsf/e;

    .line 19
    .line 20
    invoke-direct {v1, v0, p0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public static d(Landroid/view/View;)V
    .locals 10

    .line 1
    const v0, 0x7f06003f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_9

    .line 15
    .line 16
    invoke-static {p0}, Lda/h;->A(Landroid/view/View;)Landroid/widget/TextView;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const v2, 0x7f060040

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    instance-of v4, v3, Lda/b;

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    check-cast v3, Lda/b;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v3, v5

    .line 36
    :goto_0
    const-string v4, "setTextColor"

    .line 37
    .line 38
    const v6, 0x7f060041

    .line 39
    .line 40
    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    if-eqz v3, :cond_4

    .line 44
    .line 45
    iget v7, v3, Lda/b;->e:I

    .line 46
    .line 47
    iget-object v8, v3, Lda/b;->f:Landroid/graphics/LinearGradient;

    .line 48
    .line 49
    if-eqz v8, :cond_1

    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    invoke-virtual {v8}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    iget-object v9, v3, Lda/b;->f:Landroid/graphics/LinearGradient;

    .line 60
    .line 61
    if-ne v8, v9, :cond_1

    .line 62
    .line 63
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    iget-object v9, v3, Lda/b;->d:Landroid/graphics/Shader;

    .line 68
    .line 69
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 70
    .line 71
    .line 72
    :cond_1
    invoke-virtual {v1}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-ne v8, v7, :cond_3

    .line 77
    .line 78
    iget-object v8, v3, Lda/b;->a:Landroid/content/res/ColorStateList;

    .line 79
    .line 80
    invoke-static {p0}, Lda/h;->m(Landroid/view/View;)Z

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    if-eqz v9, :cond_2

    .line 85
    .line 86
    invoke-virtual {v8}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    invoke-static {p0, v4, v9}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    :cond_2
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 108
    .line 109
    .line 110
    :cond_3
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    iget v4, v4, Landroid/text/TextPaint;->linkColor:I

    .line 115
    .line 116
    if-ne v4, v7, :cond_8

    .line 117
    .line 118
    iget-object v4, v3, Lda/b;->b:Landroid/content/res/ColorStateList;

    .line 119
    .line 120
    iget v3, v3, Lda/b;->c:I

    .line 121
    .line 122
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setLinkTextColor(Landroid/content/res/ColorStateList;)V

    .line 123
    .line 124
    .line 125
    invoke-static {p0}, Lda/h;->m(Landroid/view/View;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_8

    .line 130
    .line 131
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    const-string v3, "setLinkTextColor"

    .line 140
    .line 141
    invoke-static {p0, v3, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_4
    invoke-virtual {p0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    instance-of v7, v3, Ljava/lang/Integer;

    .line 150
    .line 151
    if-eqz v7, :cond_5

    .line 152
    .line 153
    check-cast v3, Ljava/lang/Integer;

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_5
    move-object v3, v5

    .line 157
    :goto_1
    invoke-virtual {p0, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    instance-of v8, v7, Ljava/lang/Integer;

    .line 162
    .line 163
    if-eqz v8, :cond_6

    .line 164
    .line 165
    check-cast v7, Ljava/lang/Integer;

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_6
    move-object v7, v5

    .line 169
    :goto_2
    if-eqz v3, :cond_8

    .line 170
    .line 171
    if-eqz v7, :cond_8

    .line 172
    .line 173
    if-eqz v1, :cond_8

    .line 174
    .line 175
    invoke-virtual {v1}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-ne v8, v7, :cond_8

    .line 184
    .line 185
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    invoke-static {p0}, Lda/h;->m(Landroid/view/View;)Z

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    if-eqz v8, :cond_7

    .line 201
    .line 202
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-static {p0, v4, v3}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    :cond_7
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 216
    .line 217
    .line 218
    :cond_8
    :goto_3
    invoke-virtual {p0, v0, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0, v2, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0, v6, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 228
    .line 229
    .line 230
    :cond_9
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 231
    .line 232
    if-eqz v0, :cond_b

    .line 233
    .line 234
    check-cast p0, Landroid/view/ViewGroup;

    .line 235
    .line 236
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    const/4 v1, 0x0

    .line 241
    :goto_4
    if-lt v1, v0, :cond_a

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_a
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-static {v2}, Lda/h;->d(Landroid/view/View;)V

    .line 252
    .line 253
    .line 254
    add-int/lit8 v1, v1, 0x1

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_b
    :goto_5
    return-void
.end method

.method public static e(Landroid/view/View;Ljava/util/List;ZLjava/util/ArrayList;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-static {v0}, Lda/h;->A(Landroid/view/View;)Landroid/widget/TextView;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const/4 v4, 0x0

    .line 12
    if-eqz v3, :cond_c

    .line 13
    .line 14
    invoke-static {v0, v3}, Lda/h;->r(Landroid/view/View;Landroid/widget/TextView;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    invoke-static {v5}, Lda/h;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    if-lez v6, :cond_c

    .line 27
    .line 28
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    if-eqz v7, :cond_b

    .line 37
    .line 38
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    move-object v8, v7

    .line 43
    check-cast v8, Lda/d;

    .line 44
    .line 45
    const/16 v9, 0x23

    .line 46
    .line 47
    const-string v10, ""

    .line 48
    .line 49
    const-string v11, "#"

    .line 50
    .line 51
    const/4 v12, 0x2

    .line 52
    const/4 v13, 0x1

    .line 53
    if-eqz v1, :cond_5

    .line 54
    .line 55
    iget-object v8, v8, Lda/d;->a:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v5, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v14

    .line 61
    if-eqz v14, :cond_1

    .line 62
    .line 63
    goto/16 :goto_2

    .line 64
    .line 65
    :cond_1
    invoke-static {v8, v9}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    if-nez v9, :cond_3

    .line 70
    .line 71
    :cond_2
    :goto_0
    move v13, v4

    .line 72
    goto/16 :goto_2

    .line 73
    .line 74
    :cond_3
    invoke-static {v8, v11, v10, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    if-ge v9, v12, :cond_4

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    invoke-static {v5, v11, v10, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    invoke-virtual {v9, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    move v13, v8

    .line 94
    goto :goto_2

    .line 95
    :cond_5
    iget-object v8, v8, Lda/d;->a:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result v14

    .line 101
    if-ge v14, v12, :cond_6

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_6
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v14

    .line 108
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 109
    .line 110
    .line 111
    move-result v15

    .line 112
    mul-int/lit8 v15, v15, 0x3

    .line 113
    .line 114
    add-int/lit8 v15, v15, 0xc

    .line 115
    .line 116
    if-le v14, v15, :cond_7

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_7
    invoke-static {v5, v8, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 120
    .line 121
    .line 122
    move-result v14

    .line 123
    if-eqz v14, :cond_8

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_8
    invoke-static {v8, v9}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    if-nez v9, :cond_9

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_9
    invoke-static {v8, v11, v10, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-ge v9, v12, :cond_a

    .line 142
    .line 143
    :goto_1
    goto :goto_0

    .line 144
    :cond_a
    invoke-static {v5, v11, v10, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    if-lt v10, v12, :cond_2

    .line 153
    .line 154
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 159
    .line 160
    .line 161
    move-result v11

    .line 162
    mul-int/lit8 v11, v11, 0x3

    .line 163
    .line 164
    add-int/lit8 v11, v11, 0xc

    .line 165
    .line 166
    if-gt v10, v11, :cond_2

    .line 167
    .line 168
    invoke-static {v9, v8, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    if-eqz v8, :cond_2

    .line 173
    .line 174
    :goto_2
    if-eqz v13, :cond_0

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_b
    const/4 v7, 0x0

    .line 178
    :goto_3
    check-cast v7, Lda/d;

    .line 179
    .line 180
    if-eqz v7, :cond_c

    .line 181
    .line 182
    new-instance v5, Lda/e;

    .line 183
    .line 184
    new-instance v6, Lda/f;

    .line 185
    .line 186
    invoke-direct {v6, v0, v3}, Lda/f;-><init>(Landroid/view/View;Landroid/widget/TextView;)V

    .line 187
    .line 188
    .line 189
    invoke-direct {v5, v6, v7, v1}, Lda/e;-><init>(Lda/f;Lda/d;Z)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    :cond_c
    instance-of v3, v0, Landroid/view/ViewGroup;

    .line 196
    .line 197
    if-eqz v3, :cond_e

    .line 198
    .line 199
    check-cast v0, Landroid/view/ViewGroup;

    .line 200
    .line 201
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    :goto_4
    if-lt v4, v3, :cond_d

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_d
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-object/from16 v6, p1

    .line 216
    .line 217
    invoke-static {v5, v6, v1, v2}, Lda/h;->e(Landroid/view/View;Ljava/util/List;ZLjava/util/ArrayList;)V

    .line 218
    .line 219
    .line 220
    add-int/lit8 v4, v4, 0x1

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_e
    :goto_5
    return-void
.end method

.method public static f(Landroid/view/View;Ljava/util/List;ZLjava/util/ArrayList;)V
    .locals 7

    .line 1
    invoke-static {p0}, Lda/h;->A(Landroid/view/View;)Landroid/widget/TextView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    invoke-static {p0, v0}, Lda/h;->r(Landroid/view/View;Landroid/widget/TextView;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-static {v2}, Lda/h;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-lez v3, :cond_5

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_5

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Ljava/lang/String;

    .line 44
    .line 45
    if-eqz p2, :cond_2

    .line 46
    .line 47
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    const/4 v6, 0x2

    .line 57
    if-ge v5, v6, :cond_3

    .line 58
    .line 59
    :goto_0
    move v4, v1

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    mul-int/lit8 v6, v6, 0x3

    .line 70
    .line 71
    add-int/lit8 v6, v6, 0xc

    .line 72
    .line 73
    if-le v5, v6, :cond_4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    invoke-static {v2, v4, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    :goto_1
    if-eqz v4, :cond_1

    .line 81
    .line 82
    new-instance v2, Lda/f;

    .line 83
    .line 84
    invoke-direct {v2, p0, v0}, Lda/f;-><init>(Landroid/view/View;Landroid/widget/TextView;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_5
    :goto_2
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 91
    .line 92
    if-eqz v0, :cond_7

    .line 93
    .line 94
    check-cast p0, Landroid/view/ViewGroup;

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    :goto_3
    if-lt v1, v0, :cond_6

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_6
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-static {v2, p1, p2, p3}, Lda/h;->f(Landroid/view/View;Ljava/util/List;ZLjava/util/ArrayList;)V

    .line 111
    .line 112
    .line 113
    add-int/lit8 v1, v1, 0x1

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_7
    :goto_4
    return-void
.end method

.method public static g(Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    invoke-static {p0}, Lda/h;->m(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, Lda/h;->A(Landroid/view/View;)Landroid/widget/TextView;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_b

    .line 15
    .line 16
    invoke-static {p0, v0}, Lda/h;->r(Landroid/view/View;Landroid/widget/TextView;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2}, Lda/h;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const/16 v4, 0x4b0

    .line 37
    .line 38
    if-le v3, v4, :cond_2

    .line 39
    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :cond_2
    const-string v3, "\\d{1,2}:\\d{2}"

    .line 43
    .line 44
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_3
    const-string v3, "\u5df2\u8bfb"

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_b

    .line 69
    .line 70
    const-string v3, "\u672a\u8bfb"

    .line 71
    .line 72
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_4

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-lez v2, :cond_5

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    move-object v3, v1

    .line 91
    :goto_1
    if-eqz v3, :cond_6

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    goto :goto_2

    .line 98
    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    if-lez v3, :cond_7

    .line 111
    .line 112
    move-object v1, v4

    .line 113
    :cond_7
    if-eqz v1, :cond_8

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    goto :goto_3

    .line 120
    :cond_8
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    :goto_3
    if-lez v2, :cond_b

    .line 125
    .line 126
    if-gtz v1, :cond_9

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_9
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    const/4 v3, 0x1

    .line 138
    const/high16 v4, 0x41400000    # 12.0f

    .line 139
    .line 140
    invoke-static {v3, v4, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    float-to-int v2, v2

    .line 145
    if-ge v1, v2, :cond_a

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_a
    new-instance v1, Lda/f;

    .line 149
    .line 150
    invoke-direct {v1, p0, v0}, Lda/f;-><init>(Landroid/view/View;Landroid/widget/TextView;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    :cond_b
    :goto_4
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 157
    .line 158
    if-eqz v0, :cond_d

    .line 159
    .line 160
    check-cast p0, Landroid/view/ViewGroup;

    .line 161
    .line 162
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    const/4 v1, 0x0

    .line 167
    :goto_5
    if-lt v1, v0, :cond_c

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_c
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-static {v2, p1}, Lda/h;->g(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 178
    .line 179
    .line 180
    add-int/lit8 v1, v1, 0x1

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_d
    :goto_6
    return-void
.end method

.method public static h(Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-static {p0}, Lda/h;->A(Landroid/view/View;)Landroid/widget/TextView;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-static {p0, v0}, Lda/h;->y(Landroid/view/View;Landroid/widget/TextView;)Ljava/lang/CharSequence;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    new-instance v1, Lda/f;

    .line 25
    .line 26
    invoke-direct {v1, p0, v0}, Lda/f;-><init>(Landroid/view/View;Landroid/widget/TextView;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    :cond_1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    check-cast p0, Landroid/view/ViewGroup;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v1, 0x0

    .line 43
    :goto_0
    if-lt v1, v0, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {v2, p1}, Lda/h;->h(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    :goto_1
    return-void
.end method

.method public static j(Ljava/lang/Object;ILjava/util/Set;I)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_a

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    if-gt p3, v1, :cond_a

    .line 6
    .line 7
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_4

    .line 14
    .line 15
    :cond_0
    invoke-static {p1, p0}, Lda/h;->o(ILjava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x1

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    new-instance v4, Ljava/util/WeakHashMap;

    .line 24
    .line 25
    invoke-direct {v4}, Ljava/util/WeakHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-static {v4}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    check-cast v4, Ljava/util/Set;

    .line 36
    .line 37
    invoke-static {v3, v1, v4}, Lda/h;->z(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    move v4, v2

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v4, v3

    .line 46
    :goto_0
    if-eqz v4, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v1, v0

    .line 50
    :goto_1
    if-eqz v1, :cond_3

    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-string v4, "java."

    .line 62
    .line 63
    invoke-static {v1, v4, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_a

    .line 68
    .line 69
    const-string v4, "android."

    .line 70
    .line 71
    invoke-static {v1, v4, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_4
    instance-of v1, p0, Landroid/view/View;

    .line 79
    .line 80
    if-nez v1, :cond_a

    .line 81
    .line 82
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 83
    .line 84
    if-eqz v1, :cond_5

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    :goto_2
    if-eqz v1, :cond_a

    .line 92
    .line 93
    const-class v3, Ljava/lang/Object;

    .line 94
    .line 95
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-nez v3, :cond_a

    .line 100
    .line 101
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    :cond_6
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_9

    .line 114
    .line 115
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, Ljava/lang/reflect/Field;

    .line 120
    .line 121
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-nez v6, :cond_6

    .line 130
    .line 131
    invoke-virtual {v5}, Ljava/lang/Class;->isArray()Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_7

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_7
    const-class v6, Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    if-nez v6, :cond_6

    .line 145
    .line 146
    const-class v6, Ljava/lang/Number;

    .line 147
    .line 148
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    if-eqz v5, :cond_8

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_8
    invoke-static {v4, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    if-eqz v4, :cond_6

    .line 160
    .line 161
    add-int/lit8 v5, p3, 0x1

    .line 162
    .line 163
    invoke-static {v4, p1, p2, v5}, Lda/h;->j(Ljava/lang/Object;ILjava/util/Set;I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    if-eqz v4, :cond_6

    .line 168
    .line 169
    return-object v4

    .line 170
    :cond_9
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    goto :goto_2

    .line 175
    :cond_a
    :goto_4
    return-object v0
.end method

.method public static m(Landroid/view/View;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_2

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
    if-nez v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "com.tencent.mm.ui.widget.MMNeat7extView"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    const-string v2, "com.tencent.neattextview.textview.view.NeatTextView"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    const-string v2, "NeatTextView"

    .line 37
    .line 38
    invoke-static {v1, v2, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    const/4 p0, 0x1

    .line 51
    return p0

    .line 52
    :cond_2
    return v0
.end method

.method public static n(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "\u200b"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "\ufeff"

    .line 11
    .line 12
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/16 v0, 0xa0

    .line 17
    .line 18
    const/16 v1, 0x20

    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static o(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    if-gez p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    instance-of v0, p1, Ljava/util/List;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-ge p0, v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-string v3, "get"

    .line 38
    .line 39
    invoke-static {v0, v3, v2}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v0, p1, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v0, v3, v1}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {v0, p1, p0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 84
    return-object p0
.end method

.method public static q(Ljava/lang/Object;)J
    .locals 8

    .line 1
    const-string v0, "getMsgID"

    .line 2
    .line 3
    const-string v1, "getId"

    .line 4
    .line 5
    const-string v2, "getMsgId"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    const/4 v5, 0x3

    .line 16
    if-lt v2, v5, :cond_2

    .line 17
    .line 18
    const-string v0, "msgID"

    .line 19
    .line 20
    const-string v2, "id"

    .line 21
    .line 22
    const-string v5, "field_msgId"

    .line 23
    .line 24
    const-string v6, "msgId"

    .line 25
    .line 26
    filled-new-array {v5, v6, v0, v2}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    :goto_1
    const/4 v0, 0x4

    .line 31
    if-lt v1, v0, :cond_0

    .line 32
    .line 33
    return-wide v3

    .line 34
    :cond_0
    aget-object v0, v5, v1

    .line 35
    .line 36
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Lda/h;->w(Ljava/lang/Object;)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    cmp-long v0, v6, v3

    .line 51
    .line 52
    if-lez v0, :cond_1

    .line 53
    .line 54
    return-wide v6

    .line 55
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    aget-object v5, v0, v2

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    new-array v7, v1, [Ljava/lang/Class;

    .line 65
    .line 66
    invoke-static {v6, v5, v7}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    new-array v6, v1, [Ljava/lang/Object;

    .line 71
    .line 72
    invoke-static {v5, p0, v6}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-static {v5}, Lda/h;->w(Ljava/lang/Object;)Ljava/lang/Long;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 83
    .line 84
    .line 85
    move-result-wide v5

    .line 86
    cmp-long v3, v5, v3

    .line 87
    .line 88
    if-lez v3, :cond_3

    .line 89
    .line 90
    return-wide v5

    .line 91
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    goto :goto_0
.end method

.method public static r(Landroid/view/View;Landroid/widget/TextView;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "a"

    .line 5
    .line 6
    invoke-static {p0, v1, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Ljava/lang/CharSequence;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Ljava/lang/CharSequence;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v2

    .line 19
    :goto_0
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v0, v2

    .line 35
    :goto_1
    if-eqz v0, :cond_2

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    const-string v0, "x"

    .line 39
    .line 40
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    instance-of v1, v0, Ljava/lang/CharSequence;

    .line 45
    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    check-cast v0, Ljava/lang/CharSequence;

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_3
    move-object v0, v2

    .line 52
    :goto_2
    if-eqz v0, :cond_5

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_4

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    move-object v0, v2

    .line 68
    :goto_3
    if-eqz v0, :cond_5

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    if-eqz p0, :cond_7

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-eqz p0, :cond_7

    .line 82
    .line 83
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_6

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_6
    move-object p0, v2

    .line 91
    :goto_4
    if-eqz p0, :cond_7

    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_7
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    if-eqz p0, :cond_8

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    :cond_8
    if-nez v2, :cond_9

    .line 105
    .line 106
    const-string p0, ""

    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_9
    return-object v2
.end method

.method public static s(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-lt v2, v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "[ \\t\\x0B\\f\\r]+"

    .line 22
    .line 23
    const-string v1, " "

    .line 24
    .line 25
    invoke-static {v0, p0, v1}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v0, " *\\n *"

    .line 30
    .line 31
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const-string v1, "\n"

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    const/16 v4, 0xa0

    .line 65
    .line 66
    if-eq v3, v4, :cond_2

    .line 67
    .line 68
    const/16 v4, 0x2007

    .line 69
    .line 70
    if-eq v3, v4, :cond_2

    .line 71
    .line 72
    const/16 v4, 0x202f

    .line 73
    .line 74
    if-eq v3, v4, :cond_2

    .line 75
    .line 76
    const/16 v4, 0x2060

    .line 77
    .line 78
    if-eq v3, v4, :cond_3

    .line 79
    .line 80
    const v4, 0xfeff

    .line 81
    .line 82
    .line 83
    if-eq v3, v4, :cond_3

    .line 84
    .line 85
    const v4, 0xff03

    .line 86
    .line 87
    .line 88
    if-eq v3, v4, :cond_1

    .line 89
    .line 90
    const v4, 0xfffc

    .line 91
    .line 92
    .line 93
    if-eq v3, v4, :cond_3

    .line 94
    .line 95
    packed-switch v3, :pswitch_data_0

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    const/16 v3, 0x23

    .line 103
    .line 104
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    const/16 v3, 0x20

    .line 109
    .line 110
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    :cond_3
    :goto_1
    :pswitch_0
    add-int/lit8 v2, v2, 0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x200b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static t(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 2

    .line 1
    invoke-static {p0}, Lac/p;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    :try_start_0
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    new-instance v0, Lsf/f;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p0, v0

    .line 29
    :goto_0
    nop

    .line 30
    instance-of v0, p0, Lsf/f;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object v1, p0

    .line 36
    :goto_1
    check-cast v1, Ljava/lang/Integer;

    .line 37
    .line 38
    return-object v1
.end method

.method public static u(Ljava/lang/String;)Lda/c;
    .locals 4

    .line 1
    invoke-static {p0}, Lac/p;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    const/4 v0, 0x1

    .line 13
    new-array v1, v0, [C

    .line 14
    .line 15
    const/16 v2, 0x2c

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    aput-char v2, v1, v3

    .line 19
    .line 20
    const/4 v2, 0x6

    .line 21
    invoke-static {p0, v1, v2}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const/4 v1, 0x2

    .line 26
    invoke-static {v1, p0}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    const-string v2, ""

    .line 37
    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    move-object v1, v2

    .line 41
    :cond_1
    invoke-static {v1}, Lda/h;->t(Ljava/lang/String;)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {v0, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Ljava/lang/String;

    .line 56
    .line 57
    if-nez p0, :cond_2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move-object v2, p0

    .line 61
    :goto_0
    invoke-static {v2}, Lda/h;->t(Ljava/lang/String;)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-eqz p0, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    move p0, v1

    .line 73
    :goto_1
    new-instance v0, Lda/c;

    .line 74
    .line 75
    invoke-direct {v0, v1, p0}, Lda/c;-><init>(II)V

    .line 76
    .line 77
    .line 78
    return-object v0

    .line 79
    :cond_4
    :goto_2
    const/4 p0, 0x0

    .line 80
    return-object p0
.end method

.method public static v(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public static w(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public static x(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v2, v1, [Ljava/lang/Class;

    .line 7
    .line 8
    invoke-static {v0, p1, v2}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-array v0, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {p1, p0, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    invoke-static {p0, p2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    invoke-static {p0, p3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static y(Landroid/view/View;Landroid/widget/TextView;)Ljava/lang/CharSequence;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v2, "a"

    .line 5
    .line 6
    invoke-static {p0, v2, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    instance-of v2, v1, Ljava/lang/CharSequence;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    check-cast v1, Ljava/lang/CharSequence;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v1, v3

    .line 19
    :goto_0
    const/4 v2, 0x1

    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-lez v4, :cond_1

    .line 27
    .line 28
    move v4, v2

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v4, v0

    .line 31
    :goto_1
    if-eqz v4, :cond_2

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move-object v1, v3

    .line 35
    :goto_2
    if-eqz v1, :cond_3

    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_3
    const-string v1, "x"

    .line 39
    .line 40
    invoke-static {p0, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    instance-of v1, p0, Ljava/lang/CharSequence;

    .line 45
    .line 46
    if-eqz v1, :cond_4

    .line 47
    .line 48
    check-cast p0, Ljava/lang/CharSequence;

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_4
    move-object p0, v3

    .line 52
    :goto_3
    if-eqz p0, :cond_7

    .line 53
    .line 54
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-lez v1, :cond_5

    .line 59
    .line 60
    move v0, v2

    .line 61
    :cond_5
    if-eqz v0, :cond_6

    .line 62
    .line 63
    move-object v3, p0

    .line 64
    :cond_6
    if-eqz v3, :cond_7

    .line 65
    .line 66
    return-object v3

    .line 67
    :cond_7
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    return-object p0
.end method

.method public static z(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_e

    .line 3
    .line 4
    const/4 v1, 0x4

    .line 5
    if-gt p0, v1, :cond_e

    .line 6
    .line 7
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "com.tencent.mm.storage."

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-static {v2, p1, v3}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_4

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_5

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Ljava/lang/reflect/Method;

    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    array-length v5, v5

    .line 73
    if-nez v5, :cond_2

    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    const-string v6, "getMsgId"

    .line 80
    .line 81
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-nez v5, :cond_3

    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    const-string v6, "getMsgID"

    .line 92
    .line 93
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_2

    .line 98
    .line 99
    :cond_3
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 104
    .line 105
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-nez v5, :cond_4

    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    const-class v5, Ljava/lang/Long;

    .line 116
    .line 117
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_2

    .line 122
    .line 123
    :cond_4
    invoke-static {p1}, Lda/h;->q(Ljava/lang/Object;)J

    .line 124
    .line 125
    .line 126
    move-result-wide v4

    .line 127
    const-wide/16 v6, 0x0

    .line 128
    .line 129
    cmp-long v2, v4, v6

    .line 130
    .line 131
    if-lez v2, :cond_5

    .line 132
    .line 133
    return-object p1

    .line 134
    :cond_5
    :goto_0
    const-string v2, "java."

    .line 135
    .line 136
    invoke-static {v1, v2, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-nez v2, :cond_e

    .line 141
    .line 142
    const-string v2, "android."

    .line 143
    .line 144
    invoke-static {v1, v2, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_6

    .line 149
    .line 150
    goto/16 :goto_3

    .line 151
    .line 152
    :cond_6
    instance-of v1, p1, Landroid/view/View;

    .line 153
    .line 154
    if-nez v1, :cond_e

    .line 155
    .line 156
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 157
    .line 158
    if-eqz v1, :cond_7

    .line 159
    .line 160
    return-object v0

    .line 161
    :cond_7
    instance-of v1, p1, Ljava/util/Collection;

    .line 162
    .line 163
    if-eqz v1, :cond_9

    .line 164
    .line 165
    check-cast p1, Ljava/util/Collection;

    .line 166
    .line 167
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eqz v1, :cond_e

    .line 176
    .line 177
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    add-int/lit8 v2, p0, 0x1

    .line 182
    .line 183
    invoke-static {v2, v1, p2}, Lda/h;->z(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    if-eqz v1, :cond_8

    .line 188
    .line 189
    return-object v1

    .line 190
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    :goto_1
    if-eqz v1, :cond_e

    .line 195
    .line 196
    const-class v2, Ljava/lang/Object;

    .line 197
    .line 198
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-nez v2, :cond_e

    .line 203
    .line 204
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    :cond_a
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-eqz v3, :cond_d

    .line 217
    .line 218
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    check-cast v3, Ljava/lang/reflect/Field;

    .line 223
    .line 224
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    if-nez v5, :cond_a

    .line 233
    .line 234
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    if-eqz v5, :cond_b

    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_b
    const-class v5, Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    if-nez v5, :cond_a

    .line 248
    .line 249
    const-class v5, Ljava/lang/Number;

    .line 250
    .line 251
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-eqz v4, :cond_c

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_c
    invoke-static {v3, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    if-eqz v3, :cond_a

    .line 263
    .line 264
    add-int/lit8 v4, p0, 0x1

    .line 265
    .line 266
    invoke-static {v4, v3, p2}, Lda/h;->z(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    if-eqz v3, :cond_a

    .line 271
    .line 272
    return-object v3

    .line 273
    :cond_d
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    goto :goto_1

    .line 278
    :cond_e
    :goto_3
    return-object v0
.end method


# virtual methods
.method public final B(Landroid/view/View;Landroid/widget/TextView;Lda/c;Lda/b;)V
    .locals 11

    .line 1
    invoke-virtual {p2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    if-nez v1, :cond_1

    .line 18
    .line 19
    const-string v1, ""

    .line 20
    .line 21
    :cond_1
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    int-to-float v1, v1

    .line 30
    cmpg-float v2, v0, v1

    .line 31
    .line 32
    if-gez v2, :cond_2

    .line 33
    .line 34
    move v6, v1

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move v6, v0

    .line 37
    :goto_1
    const/4 v0, 0x0

    .line 38
    cmpg-float v0, v6, v0

    .line 39
    .line 40
    if-gtz v0, :cond_3

    .line 41
    .line 42
    new-instance v0, Lca/x;

    .line 43
    .line 44
    const/4 v6, 0x3

    .line 45
    move-object v3, p0

    .line 46
    move-object v1, p1

    .line 47
    move-object v4, p2

    .line 48
    move-object v5, p3

    .line 49
    move-object v2, p4

    .line 50
    invoke-direct/range {v0 .. v6}, Lca/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    new-instance v3, Landroid/graphics/LinearGradient;

    .line 58
    .line 59
    iget v8, p3, Lda/c;->a:I

    .line 60
    .line 61
    iget v9, p3, Lda/c;->b:I

    .line 62
    .line 63
    sget-object v10, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v7, 0x0

    .line 68
    invoke-direct/range {v3 .. v10}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 69
    .line 70
    .line 71
    iput-object v3, p4, Lda/b;->f:Landroid/graphics/LinearGradient;

    .line 72
    .line 73
    invoke-virtual {p2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final varargs i([Ljava/lang/String;)Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lda/h;->a:Lr8/g;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    new-instance v2, Lch/e;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v3, Lfh/k;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {v3, p1}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    iput-object v3, v2, Lch/e;->h:Lfh/k;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 48
    .line 49
    :try_start_1
    iget-object v3, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 52
    .line 53
    .line 54
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    move-exception v2

    .line 57
    :try_start_2
    new-instance v3, Lsf/f;

    .line 58
    .line 59
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    move-object v2, v3

    .line 63
    :goto_1
    nop

    .line 64
    instance-of v3, v2, Lsf/f;

    .line 65
    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    :cond_1
    check-cast v2, Ljava/lang/reflect/Method;

    .line 70
    .line 71
    if-eqz v2, :cond_0

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_1
    move-exception p1

    .line 78
    new-instance v1, Lsf/f;

    .line 79
    .line 80
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-nez p1, :cond_3

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-string v1, "[Hchat:MessageTextColor] \u5b9a\u4f4d\u804a\u5929\u6d88\u606f\u7ed1\u5b9a\u65b9\u6cd5\u5f02\u5e38: "

    .line 95
    .line 96
    invoke-static {v1, v0, p1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 100
    .line 101
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 102
    .line 103
    return-object v1
.end method

.method public final k(Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 8

    .line 1
    iget-object v0, p0, Lda/h;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/reflect/Field;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    move-object v1, p1

    .line 13
    :goto_0
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    const-class v3, Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_6

    .line 23
    .line 24
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_4

    .line 37
    .line 38
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    move-object v5, v4

    .line 43
    check-cast v5, Ljava/lang/reflect/Field;

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    const-string v7, "itemView"

    .line 50
    .line 51
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-nez v6, :cond_3

    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    const-class v6, Landroid/view/View;

    .line 62
    .line 63
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const/4 v5, 0x0

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    :goto_1
    const/4 v5, 0x1

    .line 73
    :goto_2
    if-eqz v5, :cond_1

    .line 74
    .line 75
    move-object v2, v4

    .line 76
    :cond_4
    check-cast v2, Ljava/lang/reflect/Field;

    .line 77
    .line 78
    if-eqz v2, :cond_5

    .line 79
    .line 80
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    return-object v2

    .line 84
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    goto :goto_0

    .line 89
    :cond_6
    return-object v2
.end method

.method public final l(Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    array-length v0, p1

    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_7

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    aget-object v1, p1, v0

    .line 12
    .line 13
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_7

    .line 20
    .line 21
    aget-object p1, p1, v2

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_0
    :try_start_0
    iget-object v1, p0, Lda/h;->a:Lr8/g;

    .line 28
    .line 29
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 30
    .line 31
    const-string v3, "androidx.recyclerview.widget.RecyclerView$ViewHolder"

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    new-instance v3, Lsf/f;

    .line 48
    .line 49
    invoke-direct {v3, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object v1, v3

    .line 53
    :goto_0
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 54
    .line 55
    instance-of v4, v1, Lsf/f;

    .line 56
    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    move-object v1, v3

    .line 60
    :cond_1
    check-cast v1, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    invoke-virtual {p0, p1}, Lda/h;->k(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    :goto_1
    if-eqz p1, :cond_7

    .line 77
    .line 78
    const-class v1, Ljava/lang/Object;

    .line 79
    .line 80
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_7

    .line 85
    .line 86
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_4

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_6

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Ljava/lang/reflect/Field;

    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    const-class v4, Landroid/view/View;

    .line 120
    .line 121
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_5

    .line 126
    .line 127
    :goto_2
    move v2, v0

    .line 128
    goto :goto_4

    .line 129
    :cond_6
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    goto :goto_1

    .line 134
    :cond_7
    :goto_4
    return v2
.end method

.method public final p()Ljava/lang/reflect/Method;
    .locals 8

    .line 1
    iget-object v0, p0, Lda/h;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v0}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v1, v1, Ll8/i;->h:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v1, v3

    .line 25
    :goto_0
    if-eqz v1, :cond_1

    .line 26
    .line 27
    const-string v2, "|message_text_color_v3"

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v1, v3

    .line 35
    :goto_1
    const-string v2, ""

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    move-object v1, v2

    .line 40
    :cond_2
    iget-object v4, p0, Lda/h;->c:Landroid/content/SharedPreferences;

    .line 41
    .line 42
    const-string v5, "adapter_bind"

    .line 43
    .line 44
    invoke-static {v4, v1, v0, v5}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lda/h;->l(Ljava/lang/reflect/Method;)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-eqz v6, :cond_3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    move-object v0, v3

    .line 58
    :goto_2
    if-eqz v0, :cond_4

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_4
    const-string v0, "_onBindViewHolder["

    .line 62
    .line 63
    const-string v6, "msgInfo"

    .line 64
    .line 65
    const-string v7, "MicroMsg.ChattingDataAdapterV3"

    .line 66
    .line 67
    filled-new-array {v7, v0, v6}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p0, v0}, Lda/h;->i([Ljava/lang/String;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_5

    .line 80
    .line 81
    const-string v0, "holder"

    .line 82
    .line 83
    const-string v6, "itemView"

    .line 84
    .line 85
    filled-new-array {v7, v0, v6}, [Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p0, v0}, Lda/h;->i([Ljava/lang/String;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-eqz v6, :cond_7

    .line 102
    .line 103
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    move-object v7, v6

    .line 108
    check-cast v7, Ljava/lang/reflect/Method;

    .line 109
    .line 110
    invoke-virtual {p0, v7}, Lda/h;->l(Ljava/lang/reflect/Method;)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-eqz v7, :cond_6

    .line 115
    .line 116
    move-object v3, v6

    .line 117
    :cond_7
    check-cast v3, Ljava/lang/reflect/Method;

    .line 118
    .line 119
    if-eqz v3, :cond_8

    .line 120
    .line 121
    invoke-static {v4, v1, v5, v3}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 122
    .line 123
    .line 124
    return-object v3

    .line 125
    :cond_8
    const-string v0, "cache.key"

    .line 126
    .line 127
    :try_start_0
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-interface {v4, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-static {v2, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-nez v2, :cond_9

    .line 140
    .line 141
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 146
    .line 147
    .line 148
    :cond_9
    invoke-interface {v6, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    .line 154
    .line 155
    :catchall_0
    return-object v3
.end method
