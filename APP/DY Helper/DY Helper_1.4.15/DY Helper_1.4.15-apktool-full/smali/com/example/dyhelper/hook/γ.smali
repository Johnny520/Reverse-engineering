.class public final Lcom/example/dyhelper/hook/γ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final Α:Ljava/util/WeakHashMap;

.field public static final Β:Ljava/util/WeakHashMap;

.field public static final Γ:Ljava/util/WeakHashMap;

.field public static final Δ:Ljava/util/WeakHashMap;

.field public static final Ε:Ljava/util/WeakHashMap;

.field public static volatile Ζ:Z

.field public static volatile Η:Z

.field public static volatile Θ:Z

.field public static volatile Ι:Li20;

.field public static volatile Κ:J

.field public static volatile Λ:Ld20;

.field public static final α:Lcom/example/dyhelper/hook/γ;

.field public static final β:Lym1;

.field public static final γ:Lym1;

.field public static final δ:Lym1;

.field public static final ε:Lym1;

.field public static final ζ:Landroid/os/Handler;

.field public static final η:Ljava/lang/Object;

.field public static final θ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final ι:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final κ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final λ:[I

.field public static final μ:[I

.field public static final ν:[I

.field public static final ξ:[I

.field public static final ο:[I

.field public static final π:Ljava/util/WeakHashMap;

.field public static final ρ:Ljava/util/WeakHashMap;

.field public static final σ:Ljava/util/WeakHashMap;

.field public static final τ:Ljava/util/WeakHashMap;

.field public static final υ:Ljava/util/WeakHashMap;

.field public static final φ:Ljava/util/WeakHashMap;

.field public static final χ:Ljava/util/WeakHashMap;

.field public static final ψ:Ljava/util/WeakHashMap;

.field public static final ω:Ljava/util/WeakHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/γ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 7
    .line 8
    new-instance v0, Lym1;

    .line 9
    .line 10
    const-string v1, "[ \\t]*[|\u00b7/,\\-][ \\t]*[|\u00b7/,\\-][ \\t]*"

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lym1;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/example/dyhelper/hook/γ;->β:Lym1;

    .line 16
    .line 17
    new-instance v0, Lym1;

    .line 18
    .line 19
    const-string v1, "^[ \\t]*[|\u00b7/,\\-]+[ \\t]*"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lym1;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lcom/example/dyhelper/hook/γ;->γ:Lym1;

    .line 25
    .line 26
    new-instance v0, Lym1;

    .line 27
    .line 28
    const-string v1, "[ \\t]*[|\u00b7/,\\-]+[ \\t]*$"

    .line 29
    .line 30
    invoke-direct {v0, v1}, Lym1;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lcom/example/dyhelper/hook/γ;->δ:Lym1;

    .line 34
    .line 35
    new-instance v0, Lym1;

    .line 36
    .line 37
    const-string v1, "[ \\t]{2,}"

    .line 38
    .line 39
    invoke-direct {v0, v1}, Lym1;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lcom/example/dyhelper/hook/γ;->ε:Lym1;

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
    sput-object v0, Lcom/example/dyhelper/hook/γ;->ζ:Landroid/os/Handler;

    .line 54
    .line 55
    new-instance v0, Ljava/lang/Object;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    sput-object v0, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 61
    .line 62
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 65
    .line 66
    .line 67
    sput-object v0, Lcom/example/dyhelper/hook/γ;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 68
    .line 69
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lcom/example/dyhelper/hook/γ;->ι:Ljava/util/concurrent/ConcurrentHashMap;

    .line 75
    .line 76
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 79
    .line 80
    .line 81
    sput-object v0, Lcom/example/dyhelper/hook/γ;->κ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 82
    .line 83
    const/4 v0, 0x2

    .line 84
    new-array v1, v0, [I

    .line 85
    .line 86
    sput-object v1, Lcom/example/dyhelper/hook/γ;->λ:[I

    .line 87
    .line 88
    new-array v1, v0, [I

    .line 89
    .line 90
    sput-object v1, Lcom/example/dyhelper/hook/γ;->μ:[I

    .line 91
    .line 92
    new-array v1, v0, [I

    .line 93
    .line 94
    sput-object v1, Lcom/example/dyhelper/hook/γ;->ν:[I

    .line 95
    .line 96
    new-array v1, v0, [I

    .line 97
    .line 98
    sput-object v1, Lcom/example/dyhelper/hook/γ;->ξ:[I

    .line 99
    .line 100
    new-array v0, v0, [I

    .line 101
    .line 102
    sput-object v0, Lcom/example/dyhelper/hook/γ;->ο:[I

    .line 103
    .line 104
    new-instance v0, Ljava/util/WeakHashMap;

    .line 105
    .line 106
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 107
    .line 108
    .line 109
    sput-object v0, Lcom/example/dyhelper/hook/γ;->π:Ljava/util/WeakHashMap;

    .line 110
    .line 111
    new-instance v0, Ljava/util/WeakHashMap;

    .line 112
    .line 113
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 114
    .line 115
    .line 116
    sput-object v0, Lcom/example/dyhelper/hook/γ;->ρ:Ljava/util/WeakHashMap;

    .line 117
    .line 118
    new-instance v0, Ljava/util/WeakHashMap;

    .line 119
    .line 120
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 121
    .line 122
    .line 123
    sput-object v0, Lcom/example/dyhelper/hook/γ;->σ:Ljava/util/WeakHashMap;

    .line 124
    .line 125
    new-instance v0, Ljava/util/WeakHashMap;

    .line 126
    .line 127
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 128
    .line 129
    .line 130
    sput-object v0, Lcom/example/dyhelper/hook/γ;->τ:Ljava/util/WeakHashMap;

    .line 131
    .line 132
    new-instance v0, Ljava/util/WeakHashMap;

    .line 133
    .line 134
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 135
    .line 136
    .line 137
    sput-object v0, Lcom/example/dyhelper/hook/γ;->υ:Ljava/util/WeakHashMap;

    .line 138
    .line 139
    new-instance v0, Ljava/util/WeakHashMap;

    .line 140
    .line 141
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 142
    .line 143
    .line 144
    sput-object v0, Lcom/example/dyhelper/hook/γ;->φ:Ljava/util/WeakHashMap;

    .line 145
    .line 146
    new-instance v0, Ljava/util/WeakHashMap;

    .line 147
    .line 148
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 149
    .line 150
    .line 151
    sput-object v0, Lcom/example/dyhelper/hook/γ;->χ:Ljava/util/WeakHashMap;

    .line 152
    .line 153
    new-instance v0, Ljava/util/WeakHashMap;

    .line 154
    .line 155
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 156
    .line 157
    .line 158
    sput-object v0, Lcom/example/dyhelper/hook/γ;->ψ:Ljava/util/WeakHashMap;

    .line 159
    .line 160
    new-instance v0, Ljava/util/WeakHashMap;

    .line 161
    .line 162
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 163
    .line 164
    .line 165
    new-instance v0, Ljava/util/WeakHashMap;

    .line 166
    .line 167
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 168
    .line 169
    .line 170
    sput-object v0, Lcom/example/dyhelper/hook/γ;->ω:Ljava/util/WeakHashMap;

    .line 171
    .line 172
    new-instance v0, Ljava/util/WeakHashMap;

    .line 173
    .line 174
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 175
    .line 176
    .line 177
    sput-object v0, Lcom/example/dyhelper/hook/γ;->Α:Ljava/util/WeakHashMap;

    .line 178
    .line 179
    new-instance v0, Ljava/util/WeakHashMap;

    .line 180
    .line 181
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 182
    .line 183
    .line 184
    sput-object v0, Lcom/example/dyhelper/hook/γ;->Β:Ljava/util/WeakHashMap;

    .line 185
    .line 186
    new-instance v0, Ljava/util/WeakHashMap;

    .line 187
    .line 188
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 189
    .line 190
    .line 191
    sput-object v0, Lcom/example/dyhelper/hook/γ;->Γ:Ljava/util/WeakHashMap;

    .line 192
    .line 193
    new-instance v0, Ljava/util/WeakHashMap;

    .line 194
    .line 195
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 196
    .line 197
    .line 198
    sput-object v0, Lcom/example/dyhelper/hook/γ;->Δ:Ljava/util/WeakHashMap;

    .line 199
    .line 200
    new-instance v0, Ljava/util/WeakHashMap;

    .line 201
    .line 202
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 203
    .line 204
    .line 205
    sput-object v0, Lcom/example/dyhelper/hook/γ;->Ε:Ljava/util/WeakHashMap;

    .line 206
    .line 207
    return-void
.end method

.method public static Α(Landroid/widget/TextView;)I
    .locals 4

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/γ;->ξ:[I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/text/Layout;->getLineCount()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-gtz v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v1}, Landroid/text/Layout;->getLineCount()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    sub-int/2addr v3, v2

    .line 25
    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineBottom(I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    aget v0, v0, v2

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/widget/TextView;->getTotalPaddingTop()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    add-int/2addr v2, v0

    .line 36
    add-int/2addr v2, v1

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    sub-int/2addr v2, p0

    .line 42
    return v2

    .line 43
    :cond_1
    :goto_0
    aget v0, v0, v2

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    add-int/2addr v1, v0

    .line 50
    invoke-virtual {p0}, Landroid/widget/TextView;->getTotalPaddingBottom()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    sub-int/2addr v1, v0

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    sub-int/2addr v1, p0

    .line 60
    return v1
.end method

.method public static Β(Landroid/widget/TextView;)I
    .locals 9

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/γ;->ν:[I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/text/Layout;->getLineCount()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-gtz v3, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    invoke-virtual {v1}, Landroid/text/Layout;->getLineCount()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 25
    .line 26
    .line 27
    move v5, v2

    .line 28
    move v6, v4

    .line 29
    :goto_0
    if-ge v5, v3, :cond_2

    .line 30
    .line 31
    invoke-virtual {v1, v5}, Landroid/text/Layout;->getLineLeft(I)F

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    cmpg-float v8, v7, v6

    .line 36
    .line 37
    if-gez v8, :cond_1

    .line 38
    .line 39
    move v6, v7

    .line 40
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    cmpg-float v1, v6, v4

    .line 44
    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    :cond_3
    aget v0, v0, v2

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    add-int/2addr v1, v0

    .line 55
    int-to-float v0, v1

    .line 56
    add-float/2addr v0, v6

    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    int-to-float p0, p0

    .line 62
    sub-float/2addr v0, p0

    .line 63
    float-to-int p0, v0

    .line 64
    return p0

    .line 65
    :cond_4
    :goto_1
    aget v0, v0, v2

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    add-int/2addr v1, v0

    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    sub-int/2addr v1, p0

    .line 77
    return v1
.end method

.method public static Γ(Landroid/view/View;)Landroid/graphics/Rect;
    .locals 6

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/γ;->ο:[I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/graphics/Rect;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aget v2, v0, v2

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    aget v4, v0, v3

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    add-int/2addr v5, v2

    .line 19
    aget v0, v0, v3

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    add-int/2addr p0, v0

    .line 26
    invoke-direct {v1, v2, v4, v5, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 27
    .line 28
    .line 29
    return-object v1
.end method

.method public static Δ(Ljava/lang/Long;)V
    .locals 4

    .line 1
    sget-object v0, Lpq;->α:Lpq;

    .line 2
    .line 3
    invoke-static {}, Lpq;->α()Lmq;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->Κ()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->Υ()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    if-nez p0, :cond_1

    .line 18
    .line 19
    if-nez v0, :cond_7

    .line 20
    .line 21
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->Υ()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-wide v2, v0, Lmq;->δ:J

    .line 29
    .line 30
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move-object v0, v1

    .line 36
    :goto_0
    invoke-static {v0, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-nez p0, :cond_3

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    sput-object v1, Lcom/example/dyhelper/hook/γ;->Λ:Ld20;

    .line 44
    .line 45
    sget-object p0, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 46
    .line 47
    monitor-enter p0

    .line 48
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/γ;->ω:Ljava/util/WeakHashMap;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    monitor-exit p0

    .line 54
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->Υ()V

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lpq;->β()Lkq;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-nez p0, :cond_4

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->α(Lkq;)Lb20;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-nez p0, :cond_5

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_5
    iget-object v0, p0, Lb20;->ε:Landroid/view/View;

    .line 72
    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    new-instance v1, Lw1;

    .line 76
    .line 77
    const/16 v2, 0x11

    .line 78
    .line 79
    invoke-direct {v1, p0, v2, v0}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_6
    invoke-static {}, Li;->α()Landroid/app/Activity;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    if-eqz p0, :cond_7

    .line 91
    .line 92
    const-wide/16 v0, 0x40

    .line 93
    .line 94
    const/4 v2, 0x1

    .line 95
    invoke-static {p0, v0, v1, v2}, Lcom/example/dyhelper/hook/γ;->в(Landroid/app/Activity;JZ)V

    .line 96
    .line 97
    .line 98
    :cond_7
    :goto_1
    return-void

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    monitor-exit p0

    .line 101
    throw v0
.end method

.method public static Ε(Landroid/widget/TextView;Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    if-eqz p0, :cond_2

    .line 4
    .line 5
    const/16 v2, 0x28

    .line 6
    .line 7
    if-ge v1, v2, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-static {v2, p1, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    return v3

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    instance-of v2, p0, Landroid/view/View;

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    check-cast p0, Landroid/view/View;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/4 p0, 0x0

    .line 37
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    return v0
.end method

.method public static Ζ(Landroid/view/View;Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Lcom/example/dyhelper/hook/γ;->ι:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    :goto_0
    move-object v1, p0

    .line 33
    goto :goto_1

    .line 34
    :catchall_0
    const-string p0, ""

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v2, p0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    const/4 p0, 0x1

    .line 55
    invoke-static {v1, p1, p0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    return p0

    .line 60
    :cond_2
    :goto_2
    const/4 p0, 0x0

    .line 61
    return p0
.end method

.method public static final Η(Lz81;Ljava/lang/String;Lk20;)Z
    .locals 8

    .line 1
    const-string v0, "DYHelper_InfoBar"

    .line 2
    .line 3
    const-string v1, "\u6210\u529f Hook \u89e6\u53d1\u7c7b: "

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    :try_start_0
    iget-object p0, p0, Lz81;->γ:Ljava/lang/ClassLoader;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    :try_start_1
    invoke-static {p0, p1}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-object p0, v4

    .line 16
    :goto_0
    if-nez p0, :cond_0

    .line 17
    .line 18
    return v3

    .line 19
    :cond_0
    :try_start_2
    sget-object v5, Lxq0;->α:Lxq0;

    .line 20
    .line 21
    new-instance v6, Lnh;

    .line 22
    .line 23
    const/4 v7, 0x5

    .line 24
    invoke-direct {v6, v7, p2}, Lnh;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5, p0, v6}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    new-instance p0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v1, ", kind="

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {v0, p0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    goto :goto_1

    .line 55
    :catchall_1
    move-exception p0

    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const-string p2, "Hook "

    .line 61
    .line 62
    const-string v1, " \u5931\u8d25: "

    .line 63
    .line 64
    invoke-static {p2, p1, v1, p0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {v0, p0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :goto_1
    return v3
.end method

.method public static Θ(Landroid/widget/TextView;I)Z
    .locals 8

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->Λ(Landroid/view/View;)Z

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
    goto/16 :goto_4

    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ne v2, p1, :cond_1

    .line 18
    .line 19
    move p1, v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move p1, v1

    .line 22
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-lez v2, :cond_b

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-gtz v2, :cond_2

    .line 33
    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_3

    .line 41
    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_3
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_4

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    goto :goto_1

    .line 55
    :cond_4
    const/4 v2, 0x0

    .line 56
    :goto_1
    if-nez v2, :cond_5

    .line 57
    .line 58
    const-string v2, ""

    .line 59
    .line 60
    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    move v4, v1

    .line 65
    :goto_2
    if-ge v4, v3, :cond_9

    .line 66
    .line 67
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    const v6, 0xfeff

    .line 72
    .line 73
    .line 74
    if-eq v5, v6, :cond_6

    .line 75
    .line 76
    packed-switch v5, :pswitch_data_0

    .line 77
    .line 78
    .line 79
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_6
    :pswitch_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    move v5, v1

    .line 96
    :goto_3
    if-ge v5, v4, :cond_8

    .line 97
    .line 98
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-eq v7, v6, :cond_7

    .line 103
    .line 104
    packed-switch v7, :pswitch_data_1

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    :cond_7
    :pswitch_1
    add-int/lit8 v5, v5, 0x1

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_8
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    :cond_9
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    const-string v3, "AwemeIntroInfoLayout"

    .line 126
    .line 127
    invoke-static {p0, v3}, Lcom/example/dyhelper/hook/γ;->Ε(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-gt v0, v3, :cond_b

    .line 147
    .line 148
    const/16 v4, 0x51

    .line 149
    .line 150
    if-ge v3, v4, :cond_b

    .line 151
    .line 152
    const-string v3, "@"

    .line 153
    .line 154
    invoke-static {v2, v3, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-nez v2, :cond_a

    .line 159
    .line 160
    if-nez p1, :cond_a

    .line 161
    .line 162
    if-eqz p0, :cond_b

    .line 163
    .line 164
    :cond_a
    return v0

    .line 165
    :cond_b
    :goto_4
    return v1

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x200b
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    :pswitch_data_1
    .packed-switch 0x200b
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static Ι(Landroid/view/View;Landroid/view/View;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    if-eqz p0, :cond_2

    .line 4
    .line 5
    const/16 v2, 0x3c

    .line 6
    .line 7
    if-ge v1, v2, :cond_2

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    instance-of v2, p0, Landroid/view/View;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    check-cast p0, Landroid/view/View;

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    return v0
.end method

.method public static Κ()Z
    .locals 2

    .line 1
    const-string v0, "info_bar_enabled"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public static Λ(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "DYHelper_InfoBar_injected"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "DYHelper_InfoBar_fake_desc"

    .line 18
    .line 19
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public static Μ(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "VideoViewHolderRootView"

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static Ν(JLjava/lang/String;)Z
    .locals 4

    .line 1
    sget-object v0, Lpq;->α:Lpq;

    .line 2
    .line 3
    invoke-static {}, Lpq;->α()Lmq;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-wide v2, v0, Lmq;->δ:J

    .line 11
    .line 12
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v2, v1

    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v1, v0, Lmq;->α:Ljava/lang/String;

    .line 21
    .line 22
    :cond_1
    if-nez v2, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    cmp-long p0, v2, p0

    .line 30
    .line 31
    if-nez p0, :cond_3

    .line 32
    .line 33
    invoke-static {v1, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_3

    .line 38
    .line 39
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_3

    .line 44
    .line 45
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 48
    return p0
.end method

.method public static Ξ(Landroid/widget/TextView;)Z
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->Λ(Landroid/view/View;)Z

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
    goto :goto_2

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-lez v0, :cond_6

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-gtz v0, :cond_1

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_3

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    const/4 p0, 0x0

    .line 41
    :goto_0
    if-nez p0, :cond_4

    .line 42
    .line 43
    const-string p0, ""

    .line 44
    .line 45
    :cond_4
    move v0, v1

    .line 46
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-ge v0, v2, :cond_6

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-static {v2}, Ljx0;->Κ(C)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-nez v3, :cond_5

    .line 61
    .line 62
    const/16 v3, 0x200b

    .line 63
    .line 64
    if-eq v2, v3, :cond_5

    .line 65
    .line 66
    const/16 v3, 0x200c

    .line 67
    .line 68
    if-eq v2, v3, :cond_5

    .line 69
    .line 70
    const/16 v3, 0x200d

    .line 71
    .line 72
    if-eq v2, v3, :cond_5

    .line 73
    .line 74
    const v3, 0xfeff

    .line 75
    .line 76
    .line 77
    if-eq v2, v3, :cond_5

    .line 78
    .line 79
    const/4 p0, 0x1

    .line 80
    return p0

    .line 81
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_6
    :goto_2
    return v1
.end method

.method public static Ο(Landroid/app/Activity;Landroid/view/ViewGroup;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_5

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-gtz v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    :cond_0
    invoke-static {p1}, Lcom/example/dyhelper/hook/γ;->Γ(Landroid/view/View;)Landroid/graphics/Rect;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    if-lez v0, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object v3, v2

    .line 45
    :goto_0
    if-eqz v3, :cond_2

    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 61
    .line 62
    :goto_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    if-lez v3, :cond_3

    .line 83
    .line 84
    move-object v2, v4

    .line 85
    :cond_3
    if-eqz v2, :cond_4

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    iget p0, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 101
    .line 102
    :goto_2
    iget v2, p1, Landroid/graphics/Rect;->right:I

    .line 103
    .line 104
    if-lez v2, :cond_5

    .line 105
    .line 106
    iget v2, p1, Landroid/graphics/Rect;->left:I

    .line 107
    .line 108
    if-ge v2, v0, :cond_5

    .line 109
    .line 110
    iget v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 111
    .line 112
    if-lez v0, :cond_5

    .line 113
    .line 114
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 115
    .line 116
    if-ge p1, p0, :cond_5

    .line 117
    .line 118
    const/4 p0, 0x1

    .line 119
    return p0

    .line 120
    :cond_5
    :goto_3
    return v1
.end method

.method public static Π(Ljava/lang/String;)Ljava/text/SimpleDateFormat;
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/γ;->κ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 10
    .line 11
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v1, p0, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, p0

    .line 26
    :cond_1
    :goto_0
    check-cast v1, Ljava/text/SimpleDateFormat;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    return-object v1

    .line 29
    :catchall_0
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public static Ρ(Landroid/view/ViewGroup;JLp70;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/γ;->ρ:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, p0, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    :goto_0
    monitor-exit v0

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    new-instance v0, Lw1;

    .line 31
    .line 32
    const/16 v1, 0x14

    .line 33
    .line 34
    invoke-direct {v0, p3, v1, p0}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0, p1, p2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :goto_1
    monitor-exit v0

    .line 42
    throw p0
.end method

.method public static Σ(Landroid/app/Activity;JLjava/lang/String;Ljava/lang/String;ILandroid/view/ViewGroup;Le20;)V
    .locals 10

    .line 1
    sget-object v1, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/γ;->ω:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    new-instance v2, Lc20;

    .line 7
    .line 8
    new-instance v9, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    move-object/from16 v3, p6

    .line 11
    .line 12
    invoke-direct {v9, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    move-wide v3, p1

    .line 16
    move-object v5, p3

    .line 17
    move-object v6, p4

    .line 18
    move v7, p5

    .line 19
    move-object/from16 v8, p7

    .line 20
    .line 21
    invoke-direct/range {v2 .. v9}, Lc20;-><init>(JLjava/lang/String;Ljava/lang/String;ILe20;Ljava/lang/ref/WeakReference;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    monitor-exit v1

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    move-object p0, v0

    .line 31
    monitor-exit v1

    .line 32
    throw p0
.end method

.method public static Τ(Landroid/view/ViewGroup;JLjava/lang/String;Le20;Ljava/lang/String;I)Z
    .locals 11

    .line 1
    sget-object v1, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/γ;->τ:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    check-cast v2, Lf20;

    .line 11
    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    iget-wide v3, v2, Lf20;->α:J

    .line 15
    .line 16
    cmp-long v3, v3, p1

    .line 17
    .line 18
    if-nez v3, :cond_2

    .line 19
    .line 20
    iget-object v3, v2, Lf20;->β:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v3, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_2

    .line 27
    .line 28
    iget-object v3, v2, Lf20;->γ:Le20;

    .line 29
    .line 30
    if-ne v3, p4, :cond_2

    .line 31
    .line 32
    iget-object v3, v2, Lf20;->δ:Ljava/lang/String;

    .line 33
    .line 34
    move-object/from16 v9, p5

    .line 35
    .line 36
    invoke-static {v3, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    iget v2, v2, Lf20;->ε:I

    .line 43
    .line 44
    move/from16 v10, p6

    .line 45
    .line 46
    if-eq v2, v10, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    const/4 v2, 0x0

    .line 50
    goto :goto_2

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    move-object p0, v0

    .line 53
    goto :goto_3

    .line 54
    :cond_1
    :goto_0
    move/from16 v10, p6

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move-object/from16 v9, p5

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :goto_1
    const/4 v2, 0x1

    .line 61
    :goto_2
    new-instance v4, Lf20;

    .line 62
    .line 63
    move-wide v5, p1

    .line 64
    move-object v7, p3

    .line 65
    move-object v8, p4

    .line 66
    invoke-direct/range {v4 .. v10}, Lf20;-><init>(JLjava/lang/String;Le20;Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p0, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    sget-object p1, Lcom/example/dyhelper/hook/γ;->σ:Ljava/util/WeakHashMap;

    .line 73
    .line 74
    invoke-virtual {p1, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    sget-object p1, Lcom/example/dyhelper/hook/γ;->φ:Ljava/util/WeakHashMap;

    .line 78
    .line 79
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {p1, p0, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    monitor-exit v1

    .line 85
    return v2

    .line 86
    :goto_3
    monitor-exit v1

    .line 87
    throw p0
.end method

.method public static Υ()V
    .locals 3

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/γ;->φ:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 10
    monitor-exit v0

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    monitor-enter v0

    .line 15
    :try_start_1
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    check-cast v1, Ljava/lang/Iterable;

    .line 23
    .line 24
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 28
    monitor-exit v0

    .line 29
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :catchall_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Landroid/view/ViewGroup;

    .line 44
    .line 45
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const-string v2, "DYHelper_InfoBar_injected"

    .line 49
    .line 50
    invoke-static {v1, v2}, Lcom/example/dyhelper/hook/γ;->Φ(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v2, "DYHelper_InfoBar_fake_desc"

    .line 54
    .line 55
    invoke-static {v1, v2}, Lcom/example/dyhelper/hook/γ;->Φ(Landroid/view/ViewGroup;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    sget-object v0, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 60
    .line 61
    monitor-enter v0

    .line 62
    :try_start_3
    sget-object v1, Lcom/example/dyhelper/hook/γ;->φ:Ljava/util/WeakHashMap;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->clear()V

    .line 65
    .line 66
    .line 67
    sget-object v1, Lcom/example/dyhelper/hook/γ;->τ:Ljava/util/WeakHashMap;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->clear()V

    .line 70
    .line 71
    .line 72
    sget-object v1, Lcom/example/dyhelper/hook/γ;->σ:Ljava/util/WeakHashMap;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->clear()V

    .line 75
    .line 76
    .line 77
    sget-object v1, Lcom/example/dyhelper/hook/γ;->υ:Ljava/util/WeakHashMap;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->clear()V

    .line 80
    .line 81
    .line 82
    sget-object v1, Lcom/example/dyhelper/hook/γ;->ω:Ljava/util/WeakHashMap;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->clear()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 85
    .line 86
    .line 87
    monitor-exit v0

    .line 88
    return-void

    .line 89
    :catchall_1
    move-exception v1

    .line 90
    monitor-exit v0

    .line 91
    throw v1

    .line 92
    :catchall_2
    move-exception v1

    .line 93
    monitor-exit v0

    .line 94
    throw v1

    .line 95
    :catchall_3
    move-exception v1

    .line 96
    monitor-exit v0

    .line 97
    throw v1
.end method

.method public static Φ(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    const/4 v4, -0x1

    .line 10
    if-ge v4, v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-static {v5, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_1

    .line 25
    .line 26
    instance-of v3, v4, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    check-cast v4, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;

    .line 31
    .line 32
    invoke-virtual {v4}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ε()V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 36
    .line 37
    .line 38
    move v3, v1

    .line 39
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    if-eqz v3, :cond_6

    .line 43
    .line 44
    const-string p1, "DYHelper_InfoBar_injected"

    .line 45
    .line 46
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/γ;->ο(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    const-string p1, "DYHelper_InfoBar_fake_desc"

    .line 54
    .line 55
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/γ;->ο(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_4
    move v1, v2

    .line 63
    :goto_1
    sget-object p1, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 64
    .line 65
    monitor-enter p1

    .line 66
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/γ;->τ:Ljava/util/WeakHashMap;

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    sget-object v0, Lcom/example/dyhelper/hook/γ;->σ:Ljava/util/WeakHashMap;

    .line 72
    .line 73
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    sget-object v0, Lcom/example/dyhelper/hook/γ;->υ:Ljava/util/WeakHashMap;

    .line 77
    .line 78
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    if-nez v1, :cond_5

    .line 82
    .line 83
    sget-object v0, Lcom/example/dyhelper/hook/γ;->φ:Ljava/util/WeakHashMap;

    .line 84
    .line 85
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    goto :goto_3

    .line 91
    :cond_5
    :goto_2
    monitor-exit p1

    .line 92
    return-void

    .line 93
    :goto_3
    monitor-exit p1

    .line 94
    throw p0

    .line 95
    :cond_6
    return-void
.end method

.method public static Χ(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/γ;->φ:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast v1, Ljava/lang/Iterable;

    .line 14
    .line 15
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    monitor-exit v0

    .line 20
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :catchall_0
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroid/view/ViewGroup;

    .line 35
    .line 36
    if-eq v1, p0, :cond_1

    .line 37
    .line 38
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v1, p0}, Lcom/example/dyhelper/hook/γ;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {v1, p1}, Lcom/example/dyhelper/hook/γ;->Φ(Landroid/view/ViewGroup;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    return-void

    .line 55
    :catchall_1
    move-exception p0

    .line 56
    monitor-exit v0

    .line 57
    throw p0
.end method

.method public static Ψ(Landroid/view/View;Landroid/view/ViewGroup;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/γ;->σ:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    check-cast v2, Ljava/lang/Integer;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_2

    .line 22
    :cond_0
    move v2, v3

    .line 23
    :goto_0
    const/4 v4, 0x5

    .line 24
    if-ge v2, v4, :cond_1

    .line 25
    .line 26
    add-int/lit8 v3, v2, 0x1

    .line 27
    .line 28
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v1, p1, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    int-to-long v1, v2

    .line 36
    const-wide/16 v3, 0x5a

    .line 37
    .line 38
    mul-long/2addr v1, v3

    .line 39
    const-wide/16 v3, 0x50

    .line 40
    .line 41
    add-long/2addr v1, v3

    .line 42
    const/4 v3, 0x1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-wide/16 v1, 0x0

    .line 45
    .line 46
    :goto_1
    monitor-exit v0

    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    new-instance v0, Lw1;

    .line 51
    .line 52
    const/16 v3, 0x15

    .line 53
    .line 54
    invoke-direct {v0, p0, v3, p1}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :goto_2
    monitor-exit v0

    .line 62
    throw p0
.end method

.method public static Ω(Landroid/view/ViewGroup;Landroid/widget/TextView;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/γ;->υ:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, p0, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    :goto_0
    monitor-exit v0

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    new-instance v0, Lw1;

    .line 31
    .line 32
    const/16 v1, 0x12

    .line 33
    .line 34
    invoke-direct {v0, p0, v1, p1}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const-wide/16 v1, 0xb4

    .line 38
    .line 39
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :goto_1
    monitor-exit v0

    .line 44
    throw p0
.end method

.method public static α(Lkq;)Lb20;
    .locals 12

    .line 1
    iget-object v0, p0, Lkq;->δ:Lmq;

    .line 2
    .line 3
    iget-object v1, v0, Lmq;->α:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_2

    .line 7
    .line 8
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    move-object v7, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v7, v2

    .line 27
    :goto_0
    if-nez v7, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    new-instance v4, Lb20;

    .line 31
    .line 32
    iget-wide v5, v0, Lmq;->δ:J

    .line 33
    .line 34
    iget-wide v8, v0, Lmq;->β:J

    .line 35
    .line 36
    iget-object v10, v0, Lmq;->γ:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v11, p0, Lkq;->γ:Landroid/view/View;

    .line 39
    .line 40
    invoke-direct/range {v4 .. v11}, Lb20;-><init>(JLjava/lang/String;JLjava/lang/String;Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    return-object v4

    .line 44
    :cond_2
    :goto_1
    return-object v2
.end method

.method public static β(Landroid/widget/TextView;III)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 6
    .line 7
    const/4 v2, -0x2

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget v3, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v3, v2

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget v4, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    move v4, v2

    .line 27
    :goto_1
    invoke-direct {v1, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 28
    .line 29
    .line 30
    instance-of v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 31
    .line 32
    if-eqz v3, :cond_3

    .line 33
    .line 34
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 35
    .line 36
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 37
    .line 38
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 39
    .line 40
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 41
    .line 42
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 43
    .line 44
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 45
    .line 46
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 47
    .line 48
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 49
    .line 50
    iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 51
    .line 52
    :cond_3
    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 53
    .line 54
    .line 55
    move-object v0, v1

    .line 56
    :goto_2
    iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    const v4, 0x800033

    .line 60
    .line 61
    .line 62
    if-eq v1, v4, :cond_4

    .line 63
    .line 64
    iput v4, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 65
    .line 66
    move v1, v3

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/4 v1, 0x0

    .line 69
    :goto_3
    iget v4, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 70
    .line 71
    if-eq v4, p1, :cond_5

    .line 72
    .line 73
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 74
    .line 75
    move v1, v3

    .line 76
    :cond_5
    iget p1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 77
    .line 78
    if-eq p1, p2, :cond_6

    .line 79
    .line 80
    iput p2, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 81
    .line 82
    move v1, v3

    .line 83
    :cond_6
    iget p1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 84
    .line 85
    if-eq p1, v2, :cond_7

    .line 86
    .line 87
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 88
    .line 89
    move v1, v3

    .line 90
    :cond_7
    iget p1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 91
    .line 92
    if-eq p1, v2, :cond_8

    .line 93
    .line 94
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 95
    .line 96
    move v1, v3

    .line 97
    :cond_8
    invoke-virtual {p0}, Landroid/widget/TextView;->getMaxWidth()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eq p1, p3, :cond_9

    .line 102
    .line 103
    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_9
    move v3, v1

    .line 108
    :goto_4
    if-eqz v3, :cond_a

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 111
    .line 112
    .line 113
    :cond_a
    return v3
.end method

.method public static γ(Landroid/view/View;Lb20;)Z
    .locals 1

    .line 1
    iget-object p1, p1, Lb20;->ε:Landroid/view/View;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/γ;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_5

    .line 11
    .line 12
    invoke-static {p1, p0}, Lcom/example/dyhelper/hook/γ;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_1
    instance-of v0, p0, Landroid/widget/FrameLayout;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->Μ(Landroid/view/View;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    check-cast p0, Landroid/widget/FrameLayout;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->τ(Landroid/view/View;)Landroid/widget/FrameLayout;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :goto_0
    instance-of v0, p1, Landroid/widget/FrameLayout;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-static {p1}, Lcom/example/dyhelper/hook/γ;->Μ(Landroid/view/View;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    check-cast p1, Landroid/widget/FrameLayout;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    invoke-static {p1}, Lcom/example/dyhelper/hook/γ;->τ(Landroid/view/View;)Landroid/widget/FrameLayout;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_1
    if-eqz p0, :cond_4

    .line 54
    .line 55
    if-ne p0, p1, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    const/4 p0, 0x0

    .line 59
    return p0

    .line 60
    :cond_5
    :goto_2
    const/4 p0, 0x1

    .line 61
    return p0
.end method

.method public static δ(Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;Ljava/lang/String;Li20;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

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
    invoke-static {v0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget p1, p2, Li20;->δ:I

    .line 24
    .line 25
    iget v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->η:I

    .line 26
    .line 27
    iget v2, p2, Li20;->ε:I

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    const/4 v4, 0x0

    .line 31
    if-ne v0, v2, :cond_2

    .line 32
    .line 33
    move v0, v3

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move v0, v4

    .line 36
    :goto_1
    const/4 v5, 0x2

    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    iget v6, p2, Li20;->α:F

    .line 40
    .line 41
    invoke-virtual {p0, v5, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 42
    .line 43
    .line 44
    :cond_3
    iget-boolean v6, p2, Li20;->β:Z

    .line 45
    .line 46
    if-eqz v6, :cond_7

    .line 47
    .line 48
    iput v3, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ:I

    .line 49
    .line 50
    const/4 p1, -0x1

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-eq p2, p1, :cond_5

    .line 58
    .line 59
    :cond_4
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 60
    .line 61
    .line 62
    :cond_5
    iget-boolean p1, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ε:Z

    .line 63
    .line 64
    if-nez p1, :cond_6

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->δ()V

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_6
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-nez p1, :cond_b

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-lez p1, :cond_b

    .line 85
    .line 86
    sget p1, Lh20;->δ:F

    .line 87
    .line 88
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->β(Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;F)V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_7
    iget-boolean p2, p2, Li20;->γ:Z

    .line 93
    .line 94
    if-eqz p2, :cond_9

    .line 95
    .line 96
    iput v5, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ:I

    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 103
    .line 104
    .line 105
    iget-boolean p1, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ε:Z

    .line 106
    .line 107
    if-nez p1, :cond_8

    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->δ()V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_8
    sget p1, Lh20;->δ:F

    .line 114
    .line 115
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->β(Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;F)V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_9
    iput v4, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ:I

    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ε()V

    .line 122
    .line 123
    .line 124
    if-eqz v0, :cond_a

    .line 125
    .line 126
    invoke-virtual {p0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-eq p2, p1, :cond_b

    .line 131
    .line 132
    :cond_a
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 133
    .line 134
    .line 135
    :cond_b
    :goto_2
    iput v2, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->η:I

    .line 136
    .line 137
    return-void
.end method

.method public static ε(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroid/view/ViewGroup;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-lez v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/lit8 v1, v1, -0x1

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eq v0, p0, :cond_2

    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->bringToFront()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    :catchall_0
    :cond_2
    :try_start_1
    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const v1, 0x461c4000    # 10000.0f

    .line 41
    .line 42
    .line 43
    cmpg-float v0, v0, v1

    .line 44
    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    invoke-virtual {p0, v1}, Landroid/view/View;->setElevation(F)V

    .line 49
    .line 50
    .line 51
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getTranslationZ()F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    cmpg-float v0, v0, v1

    .line 56
    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    invoke-virtual {p0, v1}, Landroid/view/View;->setTranslationZ(F)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 61
    .line 62
    .line 63
    :catchall_1
    :goto_2
    return-void
.end method

.method public static ζ(Lb20;)Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "info_bar_text_format"

    .line 4
    .line 5
    const-string v2, "{time}     {location}"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-nez v1, :cond_1

    .line 20
    .line 21
    move-object v7, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object v7, v1

    .line 24
    :goto_1
    sget-object v1, Lcom/example/dyhelper/hook/γ;->Λ:Ld20;

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    iget-wide v2, v1, Ld20;->α:J

    .line 29
    .line 30
    iget-wide v5, v0, Lb20;->α:J

    .line 31
    .line 32
    cmp-long v2, v2, v5

    .line 33
    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    iget-object v2, v1, Ld20;->β:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v3, v0, Lb20;->β:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    iget-object v2, v1, Ld20;->γ:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v2, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    iget-object v0, v1, Ld20;->δ:Ljava/lang/String;

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_2
    iget-object v1, v0, Lb20;->δ:Ljava/lang/String;

    .line 58
    .line 59
    const-string v2, ""

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_3

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    const/4 v1, 0x0

    .line 71
    :goto_2
    if-eqz v1, :cond_4

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    move-object v1, v2

    .line 75
    :goto_3
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    const/4 v5, 0x4

    .line 80
    const/4 v6, 0x0

    .line 81
    if-nez v3, :cond_5

    .line 82
    .line 83
    goto/16 :goto_8

    .line 84
    .line 85
    :cond_5
    move v3, v6

    .line 86
    :goto_4
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-ge v3, v8, :cond_7

    .line 91
    .line 92
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    invoke-static {v8}, Ljava/lang/Character;->isDigit(C)Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-nez v8, :cond_6

    .line 101
    .line 102
    goto/16 :goto_8

    .line 103
    .line 104
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eq v3, v5, :cond_8

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    const/4 v8, 0x6

    .line 118
    if-eq v3, v8, :cond_8

    .line 119
    .line 120
    const/4 v3, 0x0

    .line 121
    goto :goto_5

    .line 122
    :cond_8
    sget-object v3, Lan1;->α:Lan1;

    .line 123
    .line 124
    invoke-static {v1}, Lan1;->γ(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    :goto_5
    if-eqz v3, :cond_9

    .line 129
    .line 130
    move-object v1, v3

    .line 131
    goto :goto_8

    .line 132
    :cond_9
    iget-object v3, v0, Lb20;->ε:Landroid/view/View;

    .line 133
    .line 134
    if-eqz v3, :cond_a

    .line 135
    .line 136
    invoke-static {v3}, Lcom/example/dyhelper/hook/γ;->μ(Landroid/view/View;)Landroid/app/Activity;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    goto :goto_6

    .line 141
    :cond_a
    const/4 v3, 0x0

    .line 142
    :goto_6
    sget-object v8, Lu90;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 143
    .line 144
    invoke-static {v1}, Lu90;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    invoke-virtual {v8, v9}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    check-cast v9, Lp90;

    .line 153
    .line 154
    if-eqz v9, :cond_b

    .line 155
    .line 156
    iget-object v9, v9, Lp90;->α:Ljava/lang/String;

    .line 157
    .line 158
    goto :goto_7

    .line 159
    :cond_b
    const/4 v9, 0x0

    .line 160
    :goto_7
    if-eqz v9, :cond_c

    .line 161
    .line 162
    move-object v1, v9

    .line 163
    goto :goto_8

    .line 164
    :cond_c
    if-nez v3, :cond_d

    .line 165
    .line 166
    goto :goto_8

    .line 167
    :cond_d
    invoke-static {v3}, Lu90;->ε(Landroid/content/Context;)Z

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-eqz v9, :cond_e

    .line 172
    .line 173
    invoke-static {v1}, Lu90;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    invoke-virtual {v8, v9}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    if-nez v8, :cond_f

    .line 182
    .line 183
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    new-instance v8, Lo7;

    .line 191
    .line 192
    const/16 v9, 0x15

    .line 193
    .line 194
    invoke-direct {v8, v9}, Lo7;-><init>(I)V

    .line 195
    .line 196
    .line 197
    invoke-static {v3, v1, v8}, Lu90;->θ(Landroid/content/Context;Ljava/lang/String;Lp70;)V

    .line 198
    .line 199
    .line 200
    goto :goto_8

    .line 201
    :cond_e
    const-string v8, "geonames_database"

    .line 202
    .line 203
    invoke-virtual {v3, v8, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    const-string v9, "prompt_suppressed"

    .line 208
    .line 209
    invoke-interface {v8, v9, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    if-nez v8, :cond_f

    .line 214
    .line 215
    sget-object v8, Lcom/example/dyhelper/hook/γ;->ζ:Landroid/os/Handler;

    .line 216
    .line 217
    new-instance v9, Ln9;

    .line 218
    .line 219
    const/16 v10, 0xc

    .line 220
    .line 221
    invoke-direct {v9, v3, v10}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v8, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 225
    .line 226
    .line 227
    :cond_f
    :goto_8
    iget-object v3, v0, Lb20;->β:Ljava/lang/String;

    .line 228
    .line 229
    iget-wide v8, v0, Lb20;->γ:J

    .line 230
    .line 231
    const-string v10, "yyyy-MM-dd HH:mm"

    .line 232
    .line 233
    invoke-static {v8, v9, v10}, Lcom/example/dyhelper/hook/γ;->χ(JLjava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    new-instance v11, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 240
    .line 241
    .line 242
    move-result v12

    .line 243
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 244
    .line 245
    .line 246
    move v12, v6

    .line 247
    :goto_9
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 248
    .line 249
    .line 250
    move-result v13

    .line 251
    if-ge v12, v13, :cond_10

    .line 252
    .line 253
    const/16 v13, 0x7b

    .line 254
    .line 255
    invoke-static {v7, v13, v12, v5}, Lq02;->г(Ljava/lang/CharSequence;CII)I

    .line 256
    .line 257
    .line 258
    move-result v13

    .line 259
    if-gez v13, :cond_11

    .line 260
    .line 261
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    invoke-virtual {v11, v7, v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    :cond_10
    :goto_a
    const/16 v16, 0x0

    .line 269
    .line 270
    goto :goto_e

    .line 271
    :cond_11
    invoke-virtual {v11, v7, v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    add-int/lit8 v12, v13, 0x1

    .line 275
    .line 276
    const/16 v14, 0x7d

    .line 277
    .line 278
    invoke-static {v7, v14, v12, v5}, Lq02;->г(Ljava/lang/CharSequence;CII)I

    .line 279
    .line 280
    .line 281
    move-result v14

    .line 282
    if-gez v14, :cond_12

    .line 283
    .line 284
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 285
    .line 286
    .line 287
    move-result v5

    .line 288
    invoke-virtual {v11, v7, v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    goto :goto_a

    .line 292
    :cond_12
    invoke-virtual {v7, v12, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v12

    .line 296
    const-string v15, "time"

    .line 297
    .line 298
    invoke-virtual {v12, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v15

    .line 302
    if-nez v15, :cond_13

    .line 303
    .line 304
    const-string v15, "createTime"

    .line 305
    .line 306
    invoke-virtual {v12, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v15

    .line 310
    if-eqz v15, :cond_14

    .line 311
    .line 312
    :cond_13
    const/16 v16, 0x0

    .line 313
    .line 314
    goto :goto_b

    .line 315
    :cond_14
    const-string v15, "time:"

    .line 316
    .line 317
    invoke-static {v12, v15, v6}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 318
    .line 319
    .line 320
    move-result v15

    .line 321
    const/16 v16, 0x0

    .line 322
    .line 323
    const/16 v4, 0x3a

    .line 324
    .line 325
    if-eqz v15, :cond_15

    .line 326
    .line 327
    invoke-static {v12, v4, v12}, Lq02;->ф(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    invoke-static {v8, v9, v4}, Lcom/example/dyhelper/hook/γ;->χ(JLjava/lang/String;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    goto :goto_c

    .line 336
    :cond_15
    const-string v15, "createTime:"

    .line 337
    .line 338
    invoke-static {v12, v15, v6}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 339
    .line 340
    .line 341
    move-result v15

    .line 342
    if-eqz v15, :cond_16

    .line 343
    .line 344
    invoke-static {v12, v4, v12}, Lq02;->ф(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    invoke-static {v8, v9, v4}, Lcom/example/dyhelper/hook/γ;->χ(JLjava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    goto :goto_c

    .line 353
    :cond_16
    move-object/from16 v4, v16

    .line 354
    .line 355
    goto :goto_c

    .line 356
    :goto_b
    move-object v4, v10

    .line 357
    :goto_c
    if-eqz v4, :cond_17

    .line 358
    .line 359
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    goto :goto_d

    .line 363
    :cond_17
    add-int/lit8 v4, v14, 0x1

    .line 364
    .line 365
    invoke-virtual {v11, v7, v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    :goto_d
    add-int/lit8 v12, v14, 0x1

    .line 369
    .line 370
    goto :goto_9

    .line 371
    :goto_e
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    const-string v5, "{location}"

    .line 376
    .line 377
    invoke-static {v4, v5, v1}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    const-string v5, "{loc}"

    .line 382
    .line 383
    invoke-static {v4, v5, v1}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    const-string v4, "{id}"

    .line 388
    .line 389
    invoke-static {v1, v4, v3}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    const-string v4, "{awemeId}"

    .line 394
    .line 395
    invoke-static {v1, v4, v3}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    sget-object v4, Lcom/example/dyhelper/hook/γ;->β:Lym1;

    .line 400
    .line 401
    const-string v5, " "

    .line 402
    .line 403
    invoke-virtual {v4, v1, v5}, Lym1;->δ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    sget-object v4, Lcom/example/dyhelper/hook/γ;->γ:Lym1;

    .line 408
    .line 409
    invoke-virtual {v4, v1, v2}, Lym1;->δ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    sget-object v4, Lcom/example/dyhelper/hook/γ;->δ:Lym1;

    .line 414
    .line 415
    invoke-virtual {v4, v1, v2}, Lym1;->δ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    sget-object v2, Lcom/example/dyhelper/hook/γ;->ε:Lym1;

    .line 420
    .line 421
    invoke-virtual {v2, v1, v5}, Lym1;->δ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    const-string v2, ","

    .line 434
    .line 435
    const-string v4, "-"

    .line 436
    .line 437
    const-string v8, "|"

    .line 438
    .line 439
    const-string v9, "\u00b7"

    .line 440
    .line 441
    const-string v10, "/"

    .line 442
    .line 443
    filled-new-array {v8, v9, v10, v2, v4}, [Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    move v4, v6

    .line 448
    :goto_f
    const/4 v8, 0x5

    .line 449
    if-ge v4, v8, :cond_1a

    .line 450
    .line 451
    aget-object v8, v2, v4

    .line 452
    .line 453
    new-instance v9, Ljava/lang/StringBuilder;

    .line 454
    .line 455
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v9

    .line 471
    invoke-static {v1, v9, v8}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 484
    .line 485
    .line 486
    move-result v9

    .line 487
    if-eqz v9, :cond_19

    .line 488
    .line 489
    const/4 v10, 0x1

    .line 490
    if-ne v9, v10, :cond_18

    .line 491
    .line 492
    invoke-virtual {v8, v6}, Ljava/lang/String;->charAt(I)C

    .line 493
    .line 494
    .line 495
    move-result v8

    .line 496
    new-array v9, v10, [C

    .line 497
    .line 498
    aput-char v8, v9, v6

    .line 499
    .line 500
    invoke-static {v1, v9}, Lq02;->В(Ljava/lang/String;[C)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    add-int/lit8 v4, v4, 0x1

    .line 513
    .line 514
    goto :goto_f

    .line 515
    :cond_18
    const-string v0, "Char sequence has more than one element."

    .line 516
    .line 517
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    return-object v16

    .line 521
    :cond_19
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 522
    .line 523
    const-string v1, "Char sequence is empty."

    .line 524
    .line 525
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    throw v0

    .line 529
    :cond_1a
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 530
    .line 531
    .line 532
    move-result v2

    .line 533
    if-eqz v2, :cond_1b

    .line 534
    .line 535
    move-object v1, v3

    .line 536
    :cond_1b
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 537
    .line 538
    .line 539
    move-result v2

    .line 540
    if-nez v2, :cond_1c

    .line 541
    .line 542
    invoke-virtual {v5, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v5

    .line 546
    :cond_1c
    move-object v10, v5

    .line 547
    new-instance v5, Ld20;

    .line 548
    .line 549
    iget-wide v8, v0, Lb20;->α:J

    .line 550
    .line 551
    move-object v6, v3

    .line 552
    invoke-direct/range {v5 .. v10}, Ld20;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 553
    .line 554
    .line 555
    sput-object v5, Lcom/example/dyhelper/hook/γ;->Λ:Ld20;

    .line 556
    .line 557
    return-object v10
.end method

.method public static η(Landroid/view/ViewGroup;Landroid/widget/TextView;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/γ;->Γ:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    monitor-exit v0

    .line 18
    throw p0
.end method

.method public static θ(Lcom/example/dyhelper/hook/γ;Landroid/view/ViewGroup;)V
    .locals 6

    .line 1
    const/4 p0, 0x0

    .line 2
    move v0, p0

    .line 3
    :goto_0
    if-eqz p1, :cond_5

    .line 4
    .line 5
    const/16 v1, 0x14

    .line 6
    .line 7
    if-ge v0, v1, :cond_5

    .line 8
    .line 9
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast p1, Landroid/view/ViewGroup;

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    move-object p1, v2

    .line 18
    :goto_1
    if-nez p1, :cond_1

    .line 19
    .line 20
    goto :goto_5

    .line 21
    :cond_1
    sget-object v1, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v1

    .line 24
    :try_start_0
    sget-object v3, Lcom/example/dyhelper/hook/γ;->Ε:Ljava/util/WeakHashMap;

    .line 25
    .line 26
    invoke-virtual {v3, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_2

    .line 37
    .line 38
    invoke-virtual {v3, p1, v5}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    goto :goto_2

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    goto :goto_4

    .line 45
    :cond_2
    move v3, p0

    .line 46
    :goto_2
    monitor-exit v1

    .line 47
    if-eqz v3, :cond_3

    .line 48
    .line 49
    :try_start_1
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 53
    .line 54
    .line 55
    :catchall_1
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    instance-of v1, p1, Landroid/view/View;

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    check-cast p1, Landroid/view/View;

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    move-object p1, v2

    .line 67
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :goto_4
    monitor-exit v1

    .line 71
    throw p0

    .line 72
    :cond_5
    :goto_5
    return-void
.end method

.method public static ι()V
    .locals 3

    .line 1
    new-instance v0, Lo7;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lo7;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lo7;->invoke()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance v1, Lν;

    .line 27
    .line 28
    const/16 v2, 0xe

    .line 29
    .line 30
    invoke-direct {v1, v2, v0}, Lν;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lcom/example/dyhelper/hook/γ;->ζ:Landroid/os/Handler;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static κ(Ljava/lang/Long;)V
    .locals 2

    .line 1
    new-instance v0, Lη;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1, p0}, Lη;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {p0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lη;->invoke()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance p0, Lν;

    .line 27
    .line 28
    const/16 v1, 0xd

    .line 29
    .line 30
    invoke-direct {p0, v1, v0}, Lν;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lcom/example/dyhelper/hook/γ;->ζ:Landroid/os/Handler;

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static λ(Landroid/content/Context;F)I
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
    invoke-static {p1}, Ljx0;->в(F)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static μ(Landroid/view/View;)Landroid/app/Activity;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :goto_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    instance-of v0, p0, Landroid/app/Activity;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    check-cast p0, Landroid/app/Activity;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public static final ν([ILandroid/view/ViewGroup;IIIIILum1;Landroid/view/View;)V
    .locals 15

    .line 1
    move/from16 v3, p3

    .line 2
    .line 3
    move/from16 v4, p4

    .line 4
    .line 5
    move-object/from16 v7, p7

    .line 6
    .line 7
    move-object/from16 v0, p8

    .line 8
    .line 9
    const/4 v9, 0x0

    .line 10
    aget v1, p0, v9

    .line 11
    .line 12
    add-int/lit8 v2, v1, 0x1

    .line 13
    .line 14
    aput v2, p0, v9

    .line 15
    .line 16
    const/16 v10, 0x258

    .line 17
    .line 18
    if-le v1, v10, :cond_0

    .line 19
    .line 20
    goto/16 :goto_6

    .line 21
    .line 22
    :cond_0
    move-object/from16 v1, p1

    .line 23
    .line 24
    if-eq v0, v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    goto/16 :goto_6

    .line 33
    .line 34
    :cond_1
    instance-of v2, v0, Landroid/widget/TextView;

    .line 35
    .line 36
    if-eqz v2, :cond_a

    .line 37
    .line 38
    move-object v2, v0

    .line 39
    check-cast v2, Landroid/widget/TextView;

    .line 40
    .line 41
    move/from16 v5, p2

    .line 42
    .line 43
    invoke-static {v2, v5}, Lcom/example/dyhelper/hook/γ;->Θ(Landroid/widget/TextView;I)Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-eqz v6, :cond_9

    .line 48
    .line 49
    invoke-static {v0}, Lcom/example/dyhelper/hook/γ;->Γ(Landroid/view/View;)Landroid/graphics/Rect;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    iget v8, v6, Landroid/graphics/Rect;->right:I

    .line 54
    .line 55
    if-lez v8, :cond_9

    .line 56
    .line 57
    iget v8, v6, Landroid/graphics/Rect;->left:I

    .line 58
    .line 59
    if-ge v8, v3, :cond_9

    .line 60
    .line 61
    iget v11, v6, Landroid/graphics/Rect;->bottom:I

    .line 62
    .line 63
    if-lez v11, :cond_9

    .line 64
    .line 65
    iget v11, v6, Landroid/graphics/Rect;->top:I

    .line 66
    .line 67
    if-ge v11, v4, :cond_9

    .line 68
    .line 69
    int-to-float v8, v8

    .line 70
    int-to-float v11, v3

    .line 71
    const v12, 0x3f3851ec    # 0.72f

    .line 72
    .line 73
    .line 74
    mul-float/2addr v11, v12

    .line 75
    cmpg-float v8, v8, v11

    .line 76
    .line 77
    if-gtz v8, :cond_9

    .line 78
    .line 79
    invoke-static {v0}, Lcom/example/dyhelper/hook/γ;->τ(Landroid/view/View;)Landroid/widget/FrameLayout;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    if-eqz v8, :cond_9

    .line 84
    .line 85
    invoke-static {v8}, Lcom/example/dyhelper/hook/γ;->Γ(Landroid/view/View;)Landroid/graphics/Rect;

    .line 86
    .line 87
    .line 88
    move-result-object v11

    .line 89
    iget v12, v11, Landroid/graphics/Rect;->bottom:I

    .line 90
    .line 91
    if-lez v12, :cond_2

    .line 92
    .line 93
    iget v12, v11, Landroid/graphics/Rect;->top:I

    .line 94
    .line 95
    if-lt v12, v4, :cond_3

    .line 96
    .line 97
    :cond_2
    move/from16 v12, p6

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    const-string v12, "title"

    .line 101
    .line 102
    invoke-static {v2, v12}, Lcom/example/dyhelper/hook/γ;->Ζ(Landroid/view/View;Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result v12

    .line 106
    if-eqz v12, :cond_4

    .line 107
    .line 108
    const/16 v12, 0x384

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    move v12, v9

    .line 112
    :goto_0
    const-string v13, "VideoViewHolderRootView"

    .line 113
    .line 114
    invoke-static {v2, v13}, Lcom/example/dyhelper/hook/γ;->Ε(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    if-eqz v13, :cond_5

    .line 119
    .line 120
    add-int/lit16 v12, v12, 0x384

    .line 121
    .line 122
    :cond_5
    const-string v13, "AwemeIntroInfoLayout"

    .line 123
    .line 124
    invoke-static {v2, v13}, Lcom/example/dyhelper/hook/γ;->Ε(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result v13

    .line 128
    if-eqz v13, :cond_6

    .line 129
    .line 130
    add-int/lit16 v12, v12, 0x1f4

    .line 131
    .line 132
    :cond_6
    invoke-virtual {v6}, Landroid/graphics/Rect;->centerY()I

    .line 133
    .line 134
    .line 135
    move-result v13

    .line 136
    sub-int v13, v13, p5

    .line 137
    .line 138
    invoke-static {v13}, Ljava/lang/Math;->abs(I)I

    .line 139
    .line 140
    .line 141
    move-result v13

    .line 142
    rsub-int v13, v13, 0x2bc

    .line 143
    .line 144
    invoke-static {v9, v13}, Ljava/lang/Math;->max(II)I

    .line 145
    .line 146
    .line 147
    move-result v13

    .line 148
    add-int/2addr v13, v12

    .line 149
    iget v12, v11, Landroid/graphics/Rect;->bottom:I

    .line 150
    .line 151
    invoke-static {v12, v4}, Ljava/lang/Math;->min(II)I

    .line 152
    .line 153
    .line 154
    move-result v12

    .line 155
    iget v11, v11, Landroid/graphics/Rect;->top:I

    .line 156
    .line 157
    invoke-static {v11, v9}, Ljava/lang/Math;->max(II)I

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    sub-int/2addr v12, v11

    .line 162
    div-int/lit8 v12, v12, 0x5

    .line 163
    .line 164
    invoke-static {v9, v12}, Ljava/lang/Math;->max(II)I

    .line 165
    .line 166
    .line 167
    move-result v11

    .line 168
    add-int/2addr v11, v13

    .line 169
    iget v6, v6, Landroid/graphics/Rect;->left:I

    .line 170
    .line 171
    move/from16 v12, p6

    .line 172
    .line 173
    if-gt v6, v12, :cond_7

    .line 174
    .line 175
    add-int/lit8 v11, v11, 0x78

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :goto_1
    const/high16 v11, -0x80000000

    .line 179
    .line 180
    :cond_7
    :goto_2
    const/high16 v6, -0x40000000    # -2.0f

    .line 181
    .line 182
    if-le v11, v6, :cond_b

    .line 183
    .line 184
    iget-object v6, v7, Lum1;->ε:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v6, Lj20;

    .line 187
    .line 188
    if-eqz v6, :cond_8

    .line 189
    .line 190
    iget v6, v6, Lj20;->γ:I

    .line 191
    .line 192
    if-le v11, v6, :cond_b

    .line 193
    .line 194
    :cond_8
    new-instance v6, Lj20;

    .line 195
    .line 196
    invoke-direct {v6, v2, v8, v11}, Lj20;-><init>(Landroid/widget/TextView;Landroid/widget/FrameLayout;I)V

    .line 197
    .line 198
    .line 199
    iput-object v6, v7, Lum1;->ε:Ljava/lang/Object;

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_9
    :goto_3
    move/from16 v12, p6

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_a
    move/from16 v5, p2

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_b
    :goto_4
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 209
    .line 210
    if-eqz v2, :cond_d

    .line 211
    .line 212
    move-object v11, v0

    .line 213
    check-cast v11, Landroid/view/ViewGroup;

    .line 214
    .line 215
    invoke-virtual {v11}, Landroid/view/ViewGroup;->getChildCount()I

    .line 216
    .line 217
    .line 218
    move-result v13

    .line 219
    move v14, v9

    .line 220
    :goto_5
    if-ge v14, v13, :cond_d

    .line 221
    .line 222
    aget v0, p0, v9

    .line 223
    .line 224
    if-le v0, v10, :cond_c

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_c
    invoke-virtual {v11, v14}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object v8

    .line 231
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    move-object v0, p0

    .line 235
    move v2, v5

    .line 236
    move v6, v12

    .line 237
    move/from16 v5, p5

    .line 238
    .line 239
    invoke-static/range {v0 .. v8}, Lcom/example/dyhelper/hook/γ;->ν([ILandroid/view/ViewGroup;IIIIILum1;Landroid/view/View;)V

    .line 240
    .line 241
    .line 242
    add-int/lit8 v14, v14, 0x1

    .line 243
    .line 244
    move-object/from16 v1, p1

    .line 245
    .line 246
    move/from16 v5, p2

    .line 247
    .line 248
    move/from16 v3, p3

    .line 249
    .line 250
    move/from16 v4, p4

    .line 251
    .line 252
    move/from16 v12, p6

    .line 253
    .line 254
    move-object/from16 v7, p7

    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_d
    :goto_6
    return-void
.end method

.method public static ξ(Landroid/view/View;)Landroid/view/ViewGroup;
    .locals 5

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/γ;->Α:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroid/view/ViewGroup;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_3

    .line 24
    :cond_0
    move-object v1, v2

    .line 25
    :goto_0
    monitor-exit v0

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-static {p0, v1}, Lcom/example/dyhelper/hook/γ;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    move-object v1, p0

    .line 37
    :goto_1
    if-eqz v1, :cond_4

    .line 38
    .line 39
    const/16 v3, 0x28

    .line 40
    .line 41
    if-ge v0, v3, :cond_4

    .line 42
    .line 43
    instance-of v3, v1, Landroid/view/ViewGroup;

    .line 44
    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const-string v4, "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F7353FACB1A1D8F47B0B30FC233A3B8CE5178DE7A241D527420FDE072775A4"

    .line 56
    .line 57
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_2

    .line 66
    .line 67
    sget-object v0, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 68
    .line 69
    monitor-enter v0

    .line 70
    :try_start_1
    sget-object v2, Lcom/example/dyhelper/hook/γ;->Α:Ljava/util/WeakHashMap;

    .line 71
    .line 72
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 73
    .line 74
    invoke-direct {v3, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, p0, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    .line 79
    .line 80
    monitor-exit v0

    .line 81
    check-cast v1, Landroid/view/ViewGroup;

    .line 82
    .line 83
    return-object v1

    .line 84
    :catchall_1
    move-exception p0

    .line 85
    monitor-exit v0

    .line 86
    throw p0

    .line 87
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    instance-of v3, v1, Landroid/view/View;

    .line 92
    .line 93
    if-eqz v3, :cond_3

    .line 94
    .line 95
    check-cast v1, Landroid/view/View;

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    move-object v1, v2

    .line 99
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    return-object v2

    .line 103
    :goto_3
    monitor-exit v0

    .line 104
    throw p0
.end method

.method public static ο(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-static {v3, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public static final π([ILandroid/view/View;)Landroid/widget/TextView;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    aget v1, p0, v0

    .line 3
    .line 4
    add-int/lit8 v2, v1, 0x1

    .line 5
    .line 6
    aput v2, p0, v0

    .line 7
    .line 8
    const/16 v2, 0x190

    .line 9
    .line 10
    if-le v1, v2, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    instance-of v1, p1, Landroid/widget/TextView;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-static {p1}, Lcom/example/dyhelper/hook/γ;->Λ(Landroid/view/View;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v3, "ScrollMentionTextView"

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    invoke-static {v1, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    const-string v3, "MentionTextView"

    .line 41
    .line 42
    invoke-static {v1, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_1

    .line 47
    .line 48
    const-string v3, ".feed.desc."

    .line 49
    .line 50
    invoke-static {v1, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    const-string v1, "desc"

    .line 57
    .line 58
    invoke-static {p1, v1}, Lcom/example/dyhelper/hook/γ;->Ζ(Landroid/view/View;Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    :cond_1
    check-cast p1, Landroid/widget/TextView;

    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_2
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 68
    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    check-cast p1, Landroid/view/ViewGroup;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    move v3, v0

    .line 78
    :goto_0
    if-ge v3, v1, :cond_5

    .line 79
    .line 80
    aget v4, p0, v0

    .line 81
    .line 82
    if-le v4, v2, :cond_3

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {p0, v4}, Lcom/example/dyhelper/hook/γ;->π([ILandroid/view/View;)Landroid/widget/TextView;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    if-eqz v4, :cond_4

    .line 97
    .line 98
    return-object v4

    .line 99
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 103
    return-object p0
.end method

.method public static final ρ([ILandroid/view/View;)Landroid/view/View;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    aget v1, p0, v0

    .line 3
    .line 4
    add-int/lit8 v2, v1, 0x1

    .line 5
    .line 6
    aput v2, p0, v0

    .line 7
    .line 8
    const/16 v2, 0x190

    .line 9
    .line 10
    if-le v1, v2, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v3, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB44494FF2F21D25346073D4A055F179F39CEFF671876F707CD1CB0C97ED"

    .line 22
    .line 23
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_1
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 35
    .line 36
    if-eqz v1, :cond_4

    .line 37
    .line 38
    check-cast p1, Landroid/view/ViewGroup;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    move v3, v0

    .line 45
    :goto_0
    if-ge v3, v1, :cond_4

    .line 46
    .line 47
    aget v4, p0, v0

    .line 48
    .line 49
    if-le v4, v2, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v4}, Lcom/example/dyhelper/hook/γ;->ρ([ILandroid/view/View;)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    return-object v4

    .line 66
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 70
    return-object p0
.end method

.method public static σ(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/widget/TextView;
    .locals 3

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/γ;->Γ:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroid/widget/TextView;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    move-object v1, v2

    .line 25
    :goto_0
    monitor-exit v0

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-static {v1}, Lcom/example/dyhelper/hook/γ;->Λ(Landroid/view/View;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    invoke-static {v1, p1}, Lcom/example/dyhelper/hook/γ;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const-string v1, "desc"

    .line 49
    .line 50
    invoke-static {v0, v1}, Lcom/example/dyhelper/hook/γ;->б(Landroid/content/Context;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    :try_start_1
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    instance-of v1, v0, Landroid/widget/TextView;

    .line 61
    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    check-cast v0, Landroid/widget/TextView;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catchall_1
    :cond_2
    move-object v0, v2

    .line 68
    :goto_1
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-static {v0}, Lcom/example/dyhelper/hook/γ;->Λ(Landroid/view/View;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_3

    .line 75
    .line 76
    invoke-static {p1, v0}, Lcom/example/dyhelper/hook/γ;->η(Landroid/view/ViewGroup;Landroid/widget/TextView;)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_3
    const/4 v0, 0x0

    .line 81
    filled-new-array {v0}, [I

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v1, p0}, Lcom/example/dyhelper/hook/γ;->π([ILandroid/view/View;)Landroid/widget/TextView;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    invoke-static {p1, v1}, Lcom/example/dyhelper/hook/γ;->η(Landroid/view/ViewGroup;Landroid/widget/TextView;)V

    .line 92
    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_4
    if-eq p0, p1, :cond_5

    .line 96
    .line 97
    filled-new-array {v0}, [I

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/γ;->π([ILandroid/view/View;)Landroid/widget/TextView;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-eqz p0, :cond_5

    .line 106
    .line 107
    invoke-static {p1, p0}, Lcom/example/dyhelper/hook/γ;->η(Landroid/view/ViewGroup;Landroid/widget/TextView;)V

    .line 108
    .line 109
    .line 110
    return-object p0

    .line 111
    :cond_5
    return-object v2

    .line 112
    :goto_2
    monitor-exit v0

    .line 113
    throw p0
.end method

.method public static τ(Landroid/view/View;)Landroid/widget/FrameLayout;
    .locals 9

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/γ;->Β:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroid/widget/FrameLayout;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    move-object v1, v2

    .line 26
    :goto_0
    monitor-exit v0

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-static {p0, v1}, Lcom/example/dyhelper/hook/γ;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 45
    .line 46
    int-to-float v1, v1

    .line 47
    const/high16 v3, 0x3f400000    # 0.75f

    .line 48
    .line 49
    mul-float/2addr v1, v3

    .line 50
    float-to-int v1, v1

    .line 51
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 52
    .line 53
    int-to-float v0, v0

    .line 54
    const v3, 0x3ee66666    # 0.45f

    .line 55
    .line 56
    .line 57
    mul-float/2addr v0, v3

    .line 58
    float-to-int v0, v0

    .line 59
    const/4 v3, 0x0

    .line 60
    move-object v4, p0

    .line 61
    move-object v5, v2

    .line 62
    :goto_1
    if-eqz v4, :cond_5

    .line 63
    .line 64
    const/16 v6, 0x28

    .line 65
    .line 66
    if-ge v3, v6, :cond_5

    .line 67
    .line 68
    instance-of v6, v4, Landroid/widget/FrameLayout;

    .line 69
    .line 70
    if-eqz v6, :cond_3

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    const-string v7, "VideoViewHolderRootView"

    .line 81
    .line 82
    const/4 v8, 0x1

    .line 83
    invoke-static {v6, v7, v8}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_2

    .line 88
    .line 89
    sget-object v0, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 90
    .line 91
    monitor-enter v0

    .line 92
    :try_start_1
    sget-object v1, Lcom/example/dyhelper/hook/γ;->Β:Ljava/util/WeakHashMap;

    .line 93
    .line 94
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 95
    .line 96
    invoke-direct {v2, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, p0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 100
    .line 101
    .line 102
    monitor-exit v0

    .line 103
    check-cast v4, Landroid/widget/FrameLayout;

    .line 104
    .line 105
    return-object v4

    .line 106
    :catchall_1
    move-exception p0

    .line 107
    monitor-exit v0

    .line 108
    throw p0

    .line 109
    :cond_2
    if-nez v5, :cond_3

    .line 110
    .line 111
    move-object v6, v4

    .line 112
    check-cast v6, Landroid/widget/FrameLayout;

    .line 113
    .line 114
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-lt v7, v1, :cond_3

    .line 119
    .line 120
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-lt v6, v0, :cond_3

    .line 125
    .line 126
    move-object v5, v4

    .line 127
    :cond_3
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    instance-of v6, v4, Landroid/view/View;

    .line 132
    .line 133
    if-eqz v6, :cond_4

    .line 134
    .line 135
    check-cast v4, Landroid/view/View;

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_4
    move-object v4, v2

    .line 139
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_5
    if-eqz v5, :cond_6

    .line 143
    .line 144
    sget-object v0, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 145
    .line 146
    monitor-enter v0

    .line 147
    :try_start_2
    sget-object v1, Lcom/example/dyhelper/hook/γ;->Β:Ljava/util/WeakHashMap;

    .line 148
    .line 149
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 150
    .line 151
    invoke-direct {v2, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, p0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 155
    .line 156
    .line 157
    monitor-exit v0

    .line 158
    goto :goto_3

    .line 159
    :catchall_2
    move-exception p0

    .line 160
    monitor-exit v0

    .line 161
    throw p0

    .line 162
    :cond_6
    :goto_3
    check-cast v5, Landroid/widget/FrameLayout;

    .line 163
    .line 164
    return-object v5

    .line 165
    :goto_4
    monitor-exit v0

    .line 166
    throw p0
.end method

.method public static υ(Landroid/widget/FrameLayout;)Landroid/widget/TextView;
    .locals 5

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
    const-string v1, "title"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/example/dyhelper/hook/γ;->б(Landroid/content/Context;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    sget-object v1, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v1

    .line 17
    :try_start_0
    sget-object v2, Lcom/example/dyhelper/hook/γ;->Δ:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v2, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Landroid/widget/TextView;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    const/4 v3, 0x0

    .line 37
    :goto_0
    monitor-exit v1

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    invoke-static {v3, p0}, Lcom/example/dyhelper/hook/γ;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    invoke-static {v3, v0}, Lcom/example/dyhelper/hook/γ;->Θ(Landroid/widget/TextView;I)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_1
    const/4 v3, 0x0

    .line 54
    filled-new-array {v3}, [I

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-static {v3, p0, v0, p0}, Lcom/example/dyhelper/hook/γ;->φ([ILandroid/widget/FrameLayout;ILandroid/view/View;)Landroid/widget/TextView;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    monitor-enter v1

    .line 65
    :try_start_1
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 66
    .line 67
    invoke-direct {v3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, p0, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 71
    .line 72
    .line 73
    monitor-exit v1

    .line 74
    return-object v0

    .line 75
    :catchall_1
    move-exception p0

    .line 76
    monitor-exit v1

    .line 77
    throw p0

    .line 78
    :cond_2
    return-object v0

    .line 79
    :goto_1
    monitor-exit v1

    .line 80
    throw p0
.end method

.method public static final φ([ILandroid/widget/FrameLayout;ILandroid/view/View;)Landroid/widget/TextView;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    aget v1, p0, v0

    .line 3
    .line 4
    add-int/lit8 v2, v1, 0x1

    .line 5
    .line 6
    aput v2, p0, v0

    .line 7
    .line 8
    const/16 v2, 0x190

    .line 9
    .line 10
    if-le v1, v2, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    if-eq p3, p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p3}, Landroid/view/View;->getVisibility()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    instance-of v1, p3, Landroid/widget/TextView;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    move-object v1, p3

    .line 27
    check-cast v1, Landroid/widget/TextView;

    .line 28
    .line 29
    invoke-static {v1, p2}, Lcom/example/dyhelper/hook/γ;->Θ(Landroid/widget/TextView;I)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_2
    instance-of v1, p3, Landroid/view/ViewGroup;

    .line 37
    .line 38
    if-eqz v1, :cond_5

    .line 39
    .line 40
    check-cast p3, Landroid/view/ViewGroup;

    .line 41
    .line 42
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    move v3, v0

    .line 47
    :goto_0
    if-ge v3, v1, :cond_5

    .line 48
    .line 49
    aget v4, p0, v0

    .line 50
    .line 51
    if-le v4, v2, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-virtual {p3, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {p0, p1, p2, v4}, Lcom/example/dyhelper/hook/γ;->φ([ILandroid/widget/FrameLayout;ILandroid/view/View;)Landroid/widget/TextView;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    if-eqz v4, :cond_4

    .line 66
    .line 67
    return-object v4

    .line 68
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 72
    return-object p0
.end method

.method public static χ(JLjava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p2}, Lcom/example/dyhelper/hook/γ;->Π(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    const-string p2, "yyyy-MM-dd HH:mm"

    .line 15
    .line 16
    invoke-static {p2}, Lcom/example/dyhelper/hook/γ;->Π(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :cond_1
    if-eqz p2, :cond_2

    .line 21
    .line 22
    new-instance v0, Ljava/util/Date;

    .line 23
    .line 24
    const-wide/16 v1, 0x3e8

    .line 25
    .line 26
    mul-long/2addr p0, v1

    .line 27
    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const/4 p0, 0x0

    .line 36
    :goto_0
    if-nez p0, :cond_3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    return-object p0

    .line 40
    :catchall_0
    :goto_1
    const-string p0, ""

    .line 41
    .line 42
    return-object p0
.end method

.method public static ψ(Landroid/view/ViewGroup;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    const/4 v4, -0x1

    .line 10
    if-ge v4, v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-static {v5, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_2

    .line 25
    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    move v3, v1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    instance-of v5, v4, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    check-cast v4, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;

    .line 35
    .line 36
    invoke-virtual {v4}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ε()V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_1
    add-int/lit8 v0, v0, -0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    invoke-static {p0, p2}, Lcom/example/dyhelper/hook/γ;->ο(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const/4 v1, 0x0

    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    instance-of v3, v0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;

    .line 53
    .line 54
    if-nez v3, :cond_4

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 57
    .line 58
    .line 59
    move-object v0, v1

    .line 60
    :cond_4
    if-nez v0, :cond_5

    .line 61
    .line 62
    new-instance v0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;

    .line 63
    .line 64
    invoke-direct {v0, p1}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;-><init>(Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 74
    .line 75
    const/4 p2, -0x2

    .line 76
    invoke-direct {p1, p2, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 80
    .line 81
    .line 82
    const/4 p1, 0x4

    .line 83
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    const/high16 p3, 0x40800000    # 4.0f

    .line 103
    .line 104
    invoke-static {p2, p3}, Lcom/example/dyhelper/hook/γ;->λ(Landroid/content/Context;F)I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    const/high16 v4, 0x40000000    # 2.0f

    .line 116
    .line 117
    invoke-static {v3, v4}, Lcom/example/dyhelper/hook/γ;->λ(Landroid/content/Context;F)I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-static {v5, p3}, Lcom/example/dyhelper/hook/γ;->λ(Landroid/content/Context;F)I

    .line 129
    .line 130
    .line 131
    move-result p3

    .line 132
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-static {v5, v4}, Lcom/example/dyhelper/hook/γ;->λ(Landroid/content/Context;F)I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    invoke-virtual {v0, p2, v3, p3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 153
    .line 154
    .line 155
    const/16 p1, 0x10

    .line 156
    .line 157
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v2}, Landroid/view/View;->setClickable(Z)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 164
    .line 165
    .line 166
    const/4 p1, 0x2

    .line 167
    invoke-virtual {v0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 171
    .line 172
    .line 173
    sget-object p1, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 174
    .line 175
    monitor-enter p1

    .line 176
    :try_start_0
    sget-object p2, Lcom/example/dyhelper/hook/γ;->φ:Ljava/util/WeakHashMap;

    .line 177
    .line 178
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 179
    .line 180
    invoke-virtual {p2, p0, p3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    .line 182
    .line 183
    monitor-exit p1

    .line 184
    return-object v0

    .line 185
    :catchall_0
    move-exception p0

    .line 186
    monitor-exit p1

    .line 187
    throw p0

    .line 188
    :cond_5
    sget-object p1, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 189
    .line 190
    monitor-enter p1

    .line 191
    :try_start_1
    sget-object p2, Lcom/example/dyhelper/hook/γ;->φ:Ljava/util/WeakHashMap;

    .line 192
    .line 193
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 194
    .line 195
    invoke-virtual {p2, p0, p3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 196
    .line 197
    .line 198
    monitor-exit p1

    .line 199
    check-cast v0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;

    .line 200
    .line 201
    return-object v0

    .line 202
    :catchall_1
    move-exception p0

    .line 203
    monitor-exit p1

    .line 204
    throw p0
.end method

.method public static ω()Li20;
    .locals 8

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-object v2, Lcom/example/dyhelper/hook/γ;->Ι:Li20;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    sget-wide v3, Lcom/example/dyhelper/hook/γ;->Κ:J

    .line 10
    .line 11
    sub-long v3, v0, v3

    .line 12
    .line 13
    const-wide/16 v5, 0x3e8

    .line 14
    .line 15
    cmp-long v3, v3, v5

    .line 16
    .line 17
    if-gtz v3, :cond_0

    .line 18
    .line 19
    return-object v2

    .line 20
    :cond_0
    const-string v2, "info_bar_text_size"

    .line 21
    .line 22
    const/16 v3, 0x73

    .line 23
    .line 24
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-interface {v4, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 29
    .line 30
    .line 31
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    :catchall_0
    const/16 v2, 0x50

    .line 33
    .line 34
    const/16 v4, 0xc8

    .line 35
    .line 36
    invoke-static {v3, v2, v4}, Lj81;->μ(III)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const-string v3, "info_bar_neon_enabled"

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-static {v3, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_1

    .line 48
    .line 49
    const-string v5, "info_bar_neon_solid_enabled"

    .line 50
    .line 51
    invoke-static {v5, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    :cond_1
    const/4 v5, -0x1

    .line 59
    if-nez v3, :cond_3

    .line 60
    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    const-string v6, "info_bar_text_color"

    .line 65
    .line 66
    const-string v7, "#CCFFFFFF"

    .line 67
    .line 68
    invoke-static {v6, v7}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    :try_start_1
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    :catchall_1
    :cond_3
    :goto_0
    new-instance v6, Li20;

    .line 77
    .line 78
    int-to-float v2, v2

    .line 79
    const/high16 v7, 0x41200000    # 10.0f

    .line 80
    .line 81
    div-float/2addr v2, v7

    .line 82
    invoke-direct {v6, v2, v3, v4, v5}, Li20;-><init>(FZZI)V

    .line 83
    .line 84
    .line 85
    sput-object v6, Lcom/example/dyhelper/hook/γ;->Ι:Li20;

    .line 86
    .line 87
    sput-wide v0, Lcom/example/dyhelper/hook/γ;->Κ:J

    .line 88
    .line 89
    return-object v6
.end method

.method public static а(Landroid/view/View;)Lb20;
    .locals 4

    .line 1
    sget-object v0, Lpq;->α:Lpq;

    .line 2
    .line 3
    invoke-static {}, Lpq;->β()Lkq;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {v0}, Lcom/example/dyhelper/hook/γ;->α(Lkq;)Lb20;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-wide v1, v0, Lb20;->α:J

    .line 18
    .line 19
    iget-object v3, v0, Lb20;->β:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v1, v2, v3}, Lcom/example/dyhelper/hook/γ;->Ν(JLjava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    if-eqz p0, :cond_3

    .line 29
    .line 30
    invoke-static {p0, v0}, Lcom/example/dyhelper/hook/γ;->γ(Landroid/view/View;Lb20;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-nez p0, :cond_3

    .line 35
    .line 36
    :goto_0
    const/4 p0, 0x0

    .line 37
    return-object p0

    .line 38
    :cond_3
    return-object v0
.end method

.method public static б(Landroid/content/Context;Ljava/lang/String;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, ":id/"

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lcom/example/dyhelper/hook/γ;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ljava/lang/Integer;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string v3, "id"

    .line 31
    .line 32
    invoke-virtual {p0, p1, v3, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    const/4 p0, 0x0

    .line 38
    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v2, v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return p0
.end method

.method public static в(Landroid/app/Activity;JZ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move/from16 v3, p3

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    sget-object v4, Lcom/example/dyhelper/hook/γ;->ζ:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v5, La20;

    .line 24
    .line 25
    invoke-direct {v5, v0, v1, v2, v3}, La20;-><init>(Landroid/app/Activity;JZ)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    if-eqz v4, :cond_5

    .line 37
    .line 38
    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    if-nez v4, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    sget-object v7, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 50
    .line 51
    monitor-enter v7

    .line 52
    :try_start_0
    sget-object v8, Lcom/example/dyhelper/hook/γ;->χ:Ljava/util/WeakHashMap;

    .line 53
    .line 54
    invoke-virtual {v8, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-static {v9, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    if-eqz v9, :cond_2

    .line 65
    .line 66
    monitor-exit v7

    .line 67
    return-void

    .line 68
    :cond_2
    if-nez v3, :cond_4

    .line 69
    .line 70
    :try_start_1
    sget-object v3, Lcom/example/dyhelper/hook/γ;->ψ:Ljava/util/WeakHashMap;

    .line 71
    .line 72
    invoke-virtual {v3, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Ljava/lang/Long;

    .line 77
    .line 78
    const-wide/16 v11, 0x0

    .line 79
    .line 80
    if-eqz v3, :cond_3

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 83
    .line 84
    .line 85
    move-result-wide v13

    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    goto :goto_1

    .line 89
    :cond_3
    move-wide v13, v11

    .line 90
    :goto_0
    const-wide/16 v15, 0x320

    .line 91
    .line 92
    sub-long/2addr v5, v13

    .line 93
    sub-long v5, v15, v5

    .line 94
    .line 95
    cmp-long v3, v5, v11

    .line 96
    .line 97
    if-lez v3, :cond_4

    .line 98
    .line 99
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 100
    .line 101
    .line 102
    move-result-wide v1

    .line 103
    :cond_4
    invoke-virtual {v8, v0, v10}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    .line 105
    .line 106
    monitor-exit v7

    .line 107
    new-instance v3, Ln9;

    .line 108
    .line 109
    const/16 v5, 0xd

    .line 110
    .line 111
    invoke-direct {v3, v0, v5}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4, v3, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :goto_1
    monitor-exit v7

    .line 119
    throw v0

    .line 120
    :cond_5
    :goto_2
    return-void
.end method

.method public static г(Landroid/view/View;Lk20;)V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lz10;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, p1, v1}, Lz10;-><init>(Landroid/view/View;Lk20;I)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lcom/example/dyhelper/hook/γ;->ζ:Landroid/os/Handler;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->а(Landroid/view/View;)Lb20;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->д(Landroid/view/View;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    invoke-static {}, Lγ;->κ()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->ξ(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-nez p1, :cond_4

    .line 56
    .line 57
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->д(Landroid/view/View;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_4
    new-instance v0, Lhb;

    .line 62
    .line 63
    const/16 v1, 0xe

    .line 64
    .line 65
    invoke-direct {v0, p0, v1}, Lhb;-><init>(Landroid/view/View;I)V

    .line 66
    .line 67
    .line 68
    const-wide/16 v1, 0x20

    .line 69
    .line 70
    invoke-static {p1, v1, v2, v0}, Lcom/example/dyhelper/hook/γ;->Ρ(Landroid/view/ViewGroup;JLp70;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public static д(Landroid/view/View;)V
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/widget/FrameLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->Μ(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p0

    .line 12
    check-cast v0, Landroid/widget/FrameLayout;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->τ(Landroid/view/View;)Landroid/widget/FrameLayout;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    new-instance v1, Lp3;

    .line 22
    .line 23
    const/16 v2, 0x8

    .line 24
    .line 25
    invoke-direct {v1, v0, v2, p0}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const-wide/16 v2, 0x40

    .line 29
    .line 30
    invoke-static {v0, v2, v3, v1}, Lcom/example/dyhelper/hook/γ;->Ρ(Landroid/view/ViewGroup;JLp70;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->μ(Landroid/view/View;)Landroid/app/Activity;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    const-wide/16 v0, 0x104

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-static {p0, v0, v1, v2}, Lcom/example/dyhelper/hook/γ;->в(Landroid/app/Activity;JZ)V

    .line 44
    .line 45
    .line 46
    :cond_2
    return-void
.end method

.method public static е(Landroid/widget/FrameLayout;Landroid/app/Activity;Landroid/widget/TextView;JLjava/lang/String;Ljava/lang/String;Li20;)Z
    .locals 12

    .line 1
    move-object/from16 v6, p6

    .line 2
    .line 3
    move-object/from16 v0, p7

    .line 4
    .line 5
    invoke-static/range {p3 .. p5}, Lcom/example/dyhelper/hook/γ;->Ν(JLjava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {p2}, Landroid/view/View;->isShown()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    move-object v8, p2

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v8, v1

    .line 31
    :goto_0
    const-string v1, "DYHelper_InfoBar_fake_desc"

    .line 32
    .line 33
    if-nez v8, :cond_2

    .line 34
    .line 35
    invoke-static {p0, v1}, Lcom/example/dyhelper/hook/γ;->Χ(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return v2

    .line 39
    :cond_2
    const-string v3, "DYHelper_InfoBar_injected"

    .line 40
    .line 41
    invoke-static {p0, v3}, Lcom/example/dyhelper/hook/γ;->Χ(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, p1, v1, v6}, Lcom/example/dyhelper/hook/γ;->ψ(Landroid/view/ViewGroup;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1, v6, v0}, Lcom/example/dyhelper/hook/γ;->δ(Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;Ljava/lang/String;Li20;)V

    .line 49
    .line 50
    .line 51
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 52
    .line 53
    invoke-direct {v3, v8}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-object v3, v1, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->π:Ljava/lang/ref/WeakReference;

    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_a

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-lez v3, :cond_a

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-gtz v3, :cond_3

    .line 78
    .line 79
    goto/16 :goto_3

    .line 80
    .line 81
    :cond_3
    :try_start_0
    sget-object v3, Lcom/example/dyhelper/hook/γ;->λ:[I

    .line 82
    .line 83
    invoke-virtual {p0, v3}, Landroid/view/View;->getLocationInWindow([I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v8}, Landroid/view/View;->isAttachedToWindow()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_a

    .line 91
    .line 92
    invoke-virtual {v8}, Landroid/view/View;->isShown()Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_a

    .line 97
    .line 98
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-gtz v4, :cond_4

    .line 103
    .line 104
    goto/16 :goto_3

    .line 105
    .line 106
    :cond_4
    sget-object v4, Lcom/example/dyhelper/hook/γ;->μ:[I

    .line 107
    .line 108
    invoke-virtual {v8, v4}, Landroid/view/View;->getLocationInWindow([I)V

    .line 109
    .line 110
    .line 111
    const/high16 v5, 0x41400000    # 12.0f

    .line 112
    .line 113
    invoke-static {p1, v5}, Lcom/example/dyhelper/hook/γ;->λ(Landroid/content/Context;F)I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    aget v7, v4, v2

    .line 118
    .line 119
    invoke-virtual {v8}, Landroid/view/View;->getPaddingLeft()I

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    add-int/2addr v7, v9

    .line 124
    const/4 v9, 0x1

    .line 125
    aget v4, v4, v9

    .line 126
    .line 127
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    add-int/2addr v4, v10

    .line 132
    const/high16 v10, 0x40800000    # 4.0f

    .line 133
    .line 134
    invoke-static {p1, v10}, Lcom/example/dyhelper/hook/γ;->λ(Landroid/content/Context;F)I

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    add-int/2addr v4, v10

    .line 139
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    aget v11, v3, v2

    .line 144
    .line 145
    sub-int v11, v7, v11

    .line 146
    .line 147
    sub-int/2addr v10, v11

    .line 148
    sub-int/2addr v10, v5

    .line 149
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    const/high16 v10, 0x43a00000    # 320.0f

    .line 154
    .line 155
    invoke-static {p1, v10}, Lcom/example/dyhelper/hook/γ;->λ(Landroid/content/Context;F)I

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    invoke-static {v5, v10}, Ljava/lang/Math;->min(II)I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    aget v10, v3, v2

    .line 164
    .line 165
    sub-int/2addr v7, v10

    .line 166
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 167
    .line 168
    .line 169
    move-result v10

    .line 170
    sub-int/2addr v7, v10

    .line 171
    if-gez v7, :cond_5

    .line 172
    .line 173
    move v7, v2

    .line 174
    :cond_5
    aget v3, v3, v9

    .line 175
    .line 176
    sub-int/2addr v4, v3

    .line 177
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    const/high16 v10, 0x42c80000    # 100.0f

    .line 182
    .line 183
    invoke-static {p1, v10}, Lcom/example/dyhelper/hook/γ;->λ(Landroid/content/Context;F)I

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    sub-int/2addr v3, p1

    .line 188
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    invoke-static {v4, v2, p1}, Lj81;->μ(III)I

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    invoke-static {v9, v5}, Ljava/lang/Math;->max(II)I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    invoke-static {v1, v7, p1, v3}, Lcom/example/dyhelper/hook/γ;->β(Landroid/widget/TextView;III)Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-nez p1, :cond_6

    .line 205
    .line 206
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-eqz p1, :cond_7

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :catchall_0
    move-exception v0

    .line 214
    move-object p1, v0

    .line 215
    goto :goto_2

    .line 216
    :cond_6
    :goto_1
    invoke-static {v1}, Lcom/example/dyhelper/hook/γ;->ε(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    .line 218
    .line 219
    :cond_7
    invoke-virtual {v1, v9}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->γ(Z)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    if-eqz p1, :cond_8

    .line 227
    .line 228
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 229
    .line 230
    .line 231
    :cond_8
    sget-object v5, Le20;->ζ:Le20;

    .line 232
    .line 233
    iget v7, v0, Li20;->ε:I

    .line 234
    .line 235
    move-object v1, p0

    .line 236
    move-wide v2, p3

    .line 237
    move-object/from16 v4, p5

    .line 238
    .line 239
    invoke-static/range {v1 .. v7}, Lcom/example/dyhelper/hook/γ;->Τ(Landroid/view/ViewGroup;JLjava/lang/String;Le20;Ljava/lang/String;I)Z

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    if-eqz p1, :cond_9

    .line 244
    .line 245
    invoke-static {p0, v8}, Lcom/example/dyhelper/hook/γ;->Ω(Landroid/view/ViewGroup;Landroid/widget/TextView;)V

    .line 246
    .line 247
    .line 248
    :cond_9
    return v9

    .line 249
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    :cond_a
    :goto_3
    invoke-virtual {v1, v2}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->γ(Z)V

    .line 253
    .line 254
    .line 255
    invoke-static {v8, p0}, Lcom/example/dyhelper/hook/γ;->Ψ(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 256
    .line 257
    .line 258
    return v2
.end method

.method public static ж(Landroid/view/ViewGroup;Landroid/app/Activity;Landroid/widget/TextView;JLjava/lang/String;Ljava/lang/String;Li20;)Z
    .locals 9

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    invoke-static/range {p3 .. p5}, Lcom/example/dyhelper/hook/γ;->Ν(JLjava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->τ(Landroid/view/View;)Landroid/widget/FrameLayout;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v3, "DYHelper_InfoBar_fake_desc"

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-static {v1, v3}, Lcom/example/dyhelper/hook/γ;->Χ(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-static {p0, v3}, Lcom/example/dyhelper/hook/γ;->Φ(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    const-string v1, "DYHelper_InfoBar_injected"

    .line 27
    .line 28
    invoke-static {p0, p1, v1, p6}, Lcom/example/dyhelper/hook/γ;->ψ(Landroid/view/ViewGroup;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1, p6, v0}, Lcom/example/dyhelper/hook/γ;->δ(Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;Ljava/lang/String;Li20;)V

    .line 33
    .line 34
    .line 35
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    invoke-direct {v3, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-object v3, v1, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->π:Ljava/lang/ref/WeakReference;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_a

    .line 50
    .line 51
    invoke-virtual {p2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_2

    .line 56
    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-lez v3, :cond_a

    .line 64
    .line 65
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-gtz v3, :cond_3

    .line 70
    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :cond_3
    :try_start_0
    sget-object v3, Lcom/example/dyhelper/hook/γ;->λ:[I

    .line 74
    .line 75
    invoke-virtual {p0, v3}, Landroid/view/View;->getLocationInWindow([I)V

    .line 76
    .line 77
    .line 78
    invoke-static {p2}, Lcom/example/dyhelper/hook/γ;->Β(Landroid/widget/TextView;)I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    invoke-static {p2}, Lcom/example/dyhelper/hook/γ;->Α(Landroid/widget/TextView;)I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    aget v7, v3, v2

    .line 87
    .line 88
    sub-int/2addr v4, v7

    .line 89
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    sub-int/2addr v4, v7

    .line 94
    if-gez v4, :cond_4

    .line 95
    .line 96
    move v4, v2

    .line 97
    :cond_4
    const/4 v8, 0x1

    .line 98
    aget v3, v3, v8

    .line 99
    .line 100
    sub-int/2addr v5, v3

    .line 101
    const/high16 v3, 0x40000000    # 2.0f

    .line 102
    .line 103
    invoke-static {p1, v3}, Lcom/example/dyhelper/hook/γ;->λ(Landroid/content/Context;F)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    add-int/2addr v5, v3

    .line 108
    if-gez v5, :cond_5

    .line 109
    .line 110
    move v5, v2

    .line 111
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    sub-int/2addr v3, v4

    .line 116
    const/high16 v7, 0x41000000    # 8.0f

    .line 117
    .line 118
    invoke-static {p1, v7}, Lcom/example/dyhelper/hook/γ;->λ(Landroid/content/Context;F)I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    sub-int/2addr v3, p1

    .line 123
    invoke-static {v8, v3}, Ljava/lang/Math;->max(II)I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    invoke-static {v1, v4, v5, p1}, Lcom/example/dyhelper/hook/γ;->β(Landroid/widget/TextView;III)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-nez p1, :cond_6

    .line 132
    .line 133
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_7

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :catchall_0
    move-exception v0

    .line 141
    move-object p1, v0

    .line 142
    goto :goto_2

    .line 143
    :cond_6
    :goto_1
    invoke-static {v1}, Lcom/example/dyhelper/hook/γ;->ε(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    .line 145
    .line 146
    :cond_7
    invoke-virtual {v1, v8}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->γ(Z)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-eqz p1, :cond_8

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 156
    .line 157
    .line 158
    :cond_8
    sget-object v5, Le20;->ε:Le20;

    .line 159
    .line 160
    iget v7, v0, Li20;->ε:I

    .line 161
    .line 162
    move-object v1, p0

    .line 163
    move-wide v2, p3

    .line 164
    move-object v4, p5

    .line 165
    move-object v6, p6

    .line 166
    invoke-static/range {v1 .. v7}, Lcom/example/dyhelper/hook/γ;->Τ(Landroid/view/ViewGroup;JLjava/lang/String;Le20;Ljava/lang/String;I)Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-eqz p1, :cond_9

    .line 171
    .line 172
    invoke-static {p0, p2}, Lcom/example/dyhelper/hook/γ;->Ω(Landroid/view/ViewGroup;Landroid/widget/TextView;)V

    .line 173
    .line 174
    .line 175
    :cond_9
    return v8

    .line 176
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    :cond_a
    :goto_3
    invoke-virtual {v1, v2}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->γ(Z)V

    .line 180
    .line 181
    .line 182
    invoke-static {p2, p0}, Lcom/example/dyhelper/hook/γ;->Ψ(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 183
    .line 184
    .line 185
    return v2
.end method

.method public static з(Landroid/widget/FrameLayout;Landroid/app/Activity;Landroid/widget/TextView;JLjava/lang/String;Ljava/lang/String;Li20;)Z
    .locals 11

    .line 1
    move-object/from16 v6, p6

    .line 2
    .line 3
    move-object/from16 v0, p7

    .line 4
    .line 5
    invoke-static/range {p3 .. p5}, Lcom/example/dyhelper/hook/γ;->Ν(JLjava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v8, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return v8

    .line 13
    :cond_0
    const-string v1, "DYHelper_InfoBar_fake_desc"

    .line 14
    .line 15
    invoke-static {p0, v1}, Lcom/example/dyhelper/hook/γ;->Χ(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "DYHelper_InfoBar_injected"

    .line 19
    .line 20
    invoke-static {p0, p1, v1, v6}, Lcom/example/dyhelper/hook/γ;->ψ(Landroid/view/ViewGroup;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;

    .line 21
    .line 22
    .line 23
    move-result-object v9

    .line 24
    invoke-static {v9, v6, v0}, Lcom/example/dyhelper/hook/γ;->δ(Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;Ljava/lang/String;Li20;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    invoke-direct {v1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, v9, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->π:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    invoke-virtual {v9}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_7

    .line 42
    .line 43
    invoke-virtual {p2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    goto/16 :goto_2

    .line 50
    .line 51
    :cond_1
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/γ;->λ:[I

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 54
    .line 55
    .line 56
    invoke-static {p2}, Lcom/example/dyhelper/hook/γ;->Β(Landroid/widget/TextView;)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-static {p2}, Lcom/example/dyhelper/hook/γ;->Α(Landroid/widget/TextView;)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    aget v4, v1, v8

    .line 65
    .line 66
    sub-int/2addr v2, v4

    .line 67
    invoke-virtual {v9}, Landroid/view/View;->getPaddingLeft()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    sub-int/2addr v2, v4

    .line 72
    if-gez v2, :cond_2

    .line 73
    .line 74
    move v2, v8

    .line 75
    :cond_2
    const/4 v10, 0x1

    .line 76
    aget v1, v1, v10

    .line 77
    .line 78
    sub-int/2addr v3, v1

    .line 79
    const/high16 v1, 0x40000000    # 2.0f

    .line 80
    .line 81
    invoke-static {p1, v1}, Lcom/example/dyhelper/hook/γ;->λ(Landroid/content/Context;F)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    add-int/2addr v3, v1

    .line 86
    if-gez v3, :cond_3

    .line 87
    .line 88
    move v3, v8

    .line 89
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    sub-int/2addr v1, v2

    .line 94
    const/high16 v4, 0x41400000    # 12.0f

    .line 95
    .line 96
    invoke-static {p1, v4}, Lcom/example/dyhelper/hook/γ;->λ(Landroid/content/Context;F)I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    sub-int/2addr v1, v4

    .line 101
    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    const/high16 v4, 0x43a00000    # 320.0f

    .line 106
    .line 107
    invoke-static {p1, v4}, Lcom/example/dyhelper/hook/γ;->λ(Landroid/content/Context;F)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    invoke-static {v9, v2, v3, p1}, Lcom/example/dyhelper/hook/γ;->β(Landroid/widget/TextView;III)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-nez p1, :cond_4

    .line 120
    .line 121
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_5

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :catchall_0
    move-exception v0

    .line 129
    move-object p1, v0

    .line 130
    goto :goto_1

    .line 131
    :cond_4
    :goto_0
    invoke-static {v9}, Lcom/example/dyhelper/hook/γ;->ε(Landroid/view/View;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    invoke-virtual {v9, v10}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->γ(Z)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v9, v8}, Landroid/view/View;->setVisibility(I)V

    .line 138
    .line 139
    .line 140
    sget-object v5, Le20;->ε:Le20;

    .line 141
    .line 142
    iget v7, v0, Li20;->ε:I

    .line 143
    .line 144
    move-object v1, p0

    .line 145
    move-wide v2, p3

    .line 146
    move-object/from16 v4, p5

    .line 147
    .line 148
    invoke-static/range {v1 .. v7}, Lcom/example/dyhelper/hook/γ;->Τ(Landroid/view/ViewGroup;JLjava/lang/String;Le20;Ljava/lang/String;I)Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_6

    .line 153
    .line 154
    invoke-static {p0, p2}, Lcom/example/dyhelper/hook/γ;->Ω(Landroid/view/ViewGroup;Landroid/widget/TextView;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    .line 156
    .line 157
    :cond_6
    return v10

    .line 158
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v9, v8}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->γ(Z)V

    .line 162
    .line 163
    .line 164
    invoke-static {p2, p0}, Lcom/example/dyhelper/hook/γ;->Ψ(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 165
    .line 166
    .line 167
    return v8

    .line 168
    :cond_7
    :goto_2
    invoke-virtual {v9, v8}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->γ(Z)V

    .line 169
    .line 170
    .line 171
    invoke-static {p2, p0}, Lcom/example/dyhelper/hook/γ;->Ψ(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 172
    .line 173
    .line 174
    return v8
.end method


# virtual methods
.method public final и(Landroid/app/Activity;)V
    .locals 20

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lcom/example/dyhelper/hook/γ;->ζ:Landroid/os/Handler;

    .line 18
    .line 19
    new-instance v2, Ln9;

    .line 20
    .line 21
    const/16 v3, 0xb

    .line 22
    .line 23
    invoke-direct {v2, v1, v3}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v8, 0x0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object v0, v8

    .line 43
    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 44
    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    check-cast v0, Landroid/view/ViewGroup;

    .line 48
    .line 49
    move-object v10, v0

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move-object v10, v8

    .line 52
    :goto_1
    if-nez v10, :cond_3

    .line 53
    .line 54
    goto/16 :goto_11

    .line 55
    .line 56
    :cond_3
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->Κ()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_4

    .line 61
    .line 62
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->Υ()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_4
    invoke-static {v8}, Lcom/example/dyhelper/hook/γ;->а(Landroid/view/View;)Lb20;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    if-nez v9, :cond_5

    .line 71
    .line 72
    goto/16 :goto_11

    .line 73
    .line 74
    :cond_5
    iget-object v11, v9, Lb20;->β:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v9}, Lcom/example/dyhelper/hook/γ;->ζ(Lb20;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->ω()Li20;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    sget-object v18, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 85
    .line 86
    monitor-enter v18

    .line 87
    :try_start_0
    sget-object v12, Lcom/example/dyhelper/hook/γ;->ω:Ljava/util/WeakHashMap;

    .line 88
    .line 89
    invoke-virtual {v12, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Lc20;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 94
    .line 95
    monitor-exit v18

    .line 96
    const/4 v13, 0x0

    .line 97
    if-nez v0, :cond_7

    .line 98
    .line 99
    :cond_6
    :goto_2
    move v0, v13

    .line 100
    goto/16 :goto_4

    .line 101
    .line 102
    :cond_7
    iget-wide v2, v0, Lc20;->α:J

    .line 103
    .line 104
    iget-wide v4, v9, Lb20;->α:J

    .line 105
    .line 106
    cmp-long v2, v2, v4

    .line 107
    .line 108
    if-nez v2, :cond_6

    .line 109
    .line 110
    iget-object v2, v0, Lc20;->β:Ljava/lang/String;

    .line 111
    .line 112
    iget-object v3, v9, Lb20;->β:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_6

    .line 119
    .line 120
    iget-object v2, v0, Lc20;->γ:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v2, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_6

    .line 127
    .line 128
    iget v2, v0, Lc20;->δ:I

    .line 129
    .line 130
    iget v3, v7, Li20;->ε:I

    .line 131
    .line 132
    if-eq v2, v3, :cond_8

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_8
    iget-object v2, v0, Lc20;->ζ:Ljava/lang/ref/WeakReference;

    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    check-cast v2, Landroid/view/ViewGroup;

    .line 142
    .line 143
    if-nez v2, :cond_9

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_9
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_6

    .line 151
    .line 152
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-lez v3, :cond_6

    .line 157
    .line 158
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-gtz v3, :cond_a

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_a
    invoke-static {v2, v9}, Lcom/example/dyhelper/hook/γ;->γ(Landroid/view/View;Lb20;)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-eqz v3, :cond_6

    .line 170
    .line 171
    iget-wide v3, v9, Lb20;->α:J

    .line 172
    .line 173
    iget-object v5, v9, Lb20;->β:Ljava/lang/String;

    .line 174
    .line 175
    invoke-static {v3, v4, v5}, Lcom/example/dyhelper/hook/γ;->Ν(JLjava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_6

    .line 180
    .line 181
    invoke-static {v1, v2}, Lcom/example/dyhelper/hook/γ;->Ο(Landroid/app/Activity;Landroid/view/ViewGroup;)Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-nez v3, :cond_b

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_b
    iget-object v0, v0, Lc20;->ε:Le20;

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_10

    .line 195
    .line 196
    const/4 v3, 0x1

    .line 197
    if-ne v0, v3, :cond_f

    .line 198
    .line 199
    instance-of v0, v2, Landroid/widget/FrameLayout;

    .line 200
    .line 201
    if-eqz v0, :cond_c

    .line 202
    .line 203
    check-cast v2, Landroid/widget/FrameLayout;

    .line 204
    .line 205
    move-object v0, v2

    .line 206
    goto :goto_3

    .line 207
    :cond_c
    move-object v0, v8

    .line 208
    :goto_3
    if-nez v0, :cond_d

    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_d
    invoke-static {v0, v0}, Lcom/example/dyhelper/hook/γ;->σ(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/widget/TextView;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    if-eqz v2, :cond_e

    .line 216
    .line 217
    invoke-static {v2}, Lcom/example/dyhelper/hook/γ;->Ξ(Landroid/widget/TextView;)Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    if-eqz v2, :cond_e

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_e
    invoke-static {v0}, Lcom/example/dyhelper/hook/γ;->υ(Landroid/widget/FrameLayout;)Landroid/widget/TextView;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    iget-wide v3, v9, Lb20;->α:J

    .line 229
    .line 230
    iget-object v5, v9, Lb20;->β:Ljava/lang/String;

    .line 231
    .line 232
    invoke-static/range {v0 .. v7}, Lcom/example/dyhelper/hook/γ;->е(Landroid/widget/FrameLayout;Landroid/app/Activity;Landroid/widget/TextView;JLjava/lang/String;Ljava/lang/String;Li20;)Z

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    move-object/from16 v1, p1

    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_f
    invoke-static {}, Lγ;->κ()V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :cond_10
    move-object v0, v2

    .line 244
    invoke-static {v0, v0}, Lcom/example/dyhelper/hook/γ;->σ(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/widget/TextView;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    if-eqz v2, :cond_12

    .line 249
    .line 250
    invoke-static {v2}, Lcom/example/dyhelper/hook/γ;->Ξ(Landroid/widget/TextView;)Z

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    if-eqz v1, :cond_12

    .line 255
    .line 256
    move-object v1, v0

    .line 257
    invoke-static {v2}, Lcom/example/dyhelper/hook/γ;->ξ(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    if-eqz v0, :cond_11

    .line 262
    .line 263
    iget-wide v3, v9, Lb20;->α:J

    .line 264
    .line 265
    iget-object v5, v9, Lb20;->β:Ljava/lang/String;

    .line 266
    .line 267
    move-object/from16 v1, p1

    .line 268
    .line 269
    invoke-static/range {v0 .. v7}, Lcom/example/dyhelper/hook/γ;->ж(Landroid/view/ViewGroup;Landroid/app/Activity;Landroid/widget/TextView;JLjava/lang/String;Ljava/lang/String;Li20;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    goto :goto_4

    .line 274
    :cond_11
    instance-of v0, v1, Landroid/widget/FrameLayout;

    .line 275
    .line 276
    if-eqz v0, :cond_12

    .line 277
    .line 278
    move-object v0, v1

    .line 279
    check-cast v0, Landroid/widget/FrameLayout;

    .line 280
    .line 281
    iget-wide v3, v9, Lb20;->α:J

    .line 282
    .line 283
    iget-object v5, v9, Lb20;->β:Ljava/lang/String;

    .line 284
    .line 285
    move-object/from16 v1, p1

    .line 286
    .line 287
    invoke-static/range {v0 .. v7}, Lcom/example/dyhelper/hook/γ;->з(Landroid/widget/FrameLayout;Landroid/app/Activity;Landroid/widget/TextView;JLjava/lang/String;Ljava/lang/String;Li20;)Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    goto :goto_4

    .line 292
    :cond_12
    move-object/from16 v1, p1

    .line 293
    .line 294
    goto/16 :goto_2

    .line 295
    .line 296
    :goto_4
    if-eqz v0, :cond_13

    .line 297
    .line 298
    goto/16 :goto_11

    .line 299
    .line 300
    :cond_13
    iget-object v0, v9, Lb20;->ε:Landroid/view/View;

    .line 301
    .line 302
    if-eqz v0, :cond_15

    .line 303
    .line 304
    instance-of v2, v0, Landroid/widget/FrameLayout;

    .line 305
    .line 306
    if-eqz v2, :cond_14

    .line 307
    .line 308
    invoke-static {v0}, Lcom/example/dyhelper/hook/γ;->Μ(Landroid/view/View;)Z

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    if-eqz v2, :cond_14

    .line 313
    .line 314
    move-object v2, v0

    .line 315
    check-cast v2, Landroid/widget/FrameLayout;

    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_14
    invoke-static {v0}, Lcom/example/dyhelper/hook/γ;->τ(Landroid/view/View;)Landroid/widget/FrameLayout;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    goto :goto_5

    .line 323
    :cond_15
    move-object v2, v8

    .line 324
    :goto_5
    if-nez v2, :cond_1a

    .line 325
    .line 326
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    const-string v4, "title"

    .line 334
    .line 335
    invoke-static {v3, v4}, Lcom/example/dyhelper/hook/γ;->б(Landroid/content/Context;Ljava/lang/String;)I

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    if-eqz v4, :cond_17

    .line 344
    .line 345
    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    if-eqz v4, :cond_17

    .line 350
    .line 351
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 352
    .line 353
    .line 354
    move-result v4

    .line 355
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    if-lez v4, :cond_16

    .line 360
    .line 361
    goto :goto_6

    .line 362
    :cond_16
    move-object v5, v8

    .line 363
    :goto_6
    if-eqz v5, :cond_17

    .line 364
    .line 365
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 366
    .line 367
    .line 368
    move-result v4

    .line 369
    goto :goto_7

    .line 370
    :cond_17
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 379
    .line 380
    :goto_7
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    if-eqz v5, :cond_19

    .line 385
    .line 386
    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    if-eqz v5, :cond_19

    .line 391
    .line 392
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 393
    .line 394
    .line 395
    move-result v5

    .line 396
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 397
    .line 398
    .line 399
    move-result-object v14

    .line 400
    if-lez v5, :cond_18

    .line 401
    .line 402
    goto :goto_8

    .line 403
    :cond_18
    move-object v14, v8

    .line 404
    :goto_8
    if-eqz v14, :cond_19

    .line 405
    .line 406
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 407
    .line 408
    .line 409
    move-result v5

    .line 410
    goto :goto_9

    .line 411
    :cond_19
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 412
    .line 413
    .line 414
    move-result-object v5

    .line 415
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 416
    .line 417
    .line 418
    move-result-object v5

    .line 419
    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 420
    .line 421
    :goto_9
    int-to-float v14, v5

    .line 422
    const v15, 0x3f570a3d    # 0.84f

    .line 423
    .line 424
    .line 425
    mul-float/2addr v14, v15

    .line 426
    float-to-int v14, v14

    .line 427
    const/high16 v15, 0x42a00000    # 80.0f

    .line 428
    .line 429
    invoke-static {v1, v15}, Lcom/example/dyhelper/hook/γ;->λ(Landroid/content/Context;F)I

    .line 430
    .line 431
    .line 432
    move-result v15

    .line 433
    new-instance v16, Lum1;

    .line 434
    .line 435
    invoke-direct/range {v16 .. v16}, Ljava/lang/Object;-><init>()V

    .line 436
    .line 437
    .line 438
    filled-new-array {v13}, [I

    .line 439
    .line 440
    .line 441
    move-result-object v13

    .line 442
    move-object/from16 v17, v10

    .line 443
    .line 444
    move-object/from16 v19, v11

    .line 445
    .line 446
    move v11, v3

    .line 447
    move-object v3, v9

    .line 448
    move-object v9, v13

    .line 449
    move v13, v5

    .line 450
    move-object/from16 v5, v19

    .line 451
    .line 452
    move-object/from16 v19, v12

    .line 453
    .line 454
    move v12, v4

    .line 455
    move-object/from16 v4, v19

    .line 456
    .line 457
    invoke-static/range {v9 .. v17}, Lcom/example/dyhelper/hook/γ;->ν([ILandroid/view/ViewGroup;IIIIILum1;Landroid/view/View;)V

    .line 458
    .line 459
    .line 460
    move-object/from16 v9, v16

    .line 461
    .line 462
    iget-object v9, v9, Lum1;->ε:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v9, Lj20;

    .line 465
    .line 466
    goto :goto_a

    .line 467
    :cond_1a
    move-object v3, v9

    .line 468
    move-object v5, v11

    .line 469
    move-object v4, v12

    .line 470
    move-object v9, v8

    .line 471
    :goto_a
    if-nez v2, :cond_1c

    .line 472
    .line 473
    if-eqz v9, :cond_1b

    .line 474
    .line 475
    iget-object v2, v9, Lj20;->β:Landroid/widget/FrameLayout;

    .line 476
    .line 477
    goto :goto_b

    .line 478
    :cond_1b
    move-object v2, v8

    .line 479
    :goto_b
    if-nez v2, :cond_1c

    .line 480
    .line 481
    goto/16 :goto_11

    .line 482
    .line 483
    :cond_1c
    move-object v10, v2

    .line 484
    invoke-static {v10, v3}, Lcom/example/dyhelper/hook/γ;->γ(Landroid/view/View;Lb20;)Z

    .line 485
    .line 486
    .line 487
    move-result v2

    .line 488
    if-eqz v2, :cond_27

    .line 489
    .line 490
    invoke-static {v1, v10}, Lcom/example/dyhelper/hook/γ;->Ο(Landroid/app/Activity;Landroid/view/ViewGroup;)Z

    .line 491
    .line 492
    .line 493
    move-result v2

    .line 494
    if-eqz v2, :cond_27

    .line 495
    .line 496
    iget-wide v11, v3, Lb20;->α:J

    .line 497
    .line 498
    iget-object v2, v3, Lb20;->β:Ljava/lang/String;

    .line 499
    .line 500
    invoke-static {v11, v12, v2}, Lcom/example/dyhelper/hook/γ;->Ν(JLjava/lang/String;)Z

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    if-nez v2, :cond_1d

    .line 505
    .line 506
    goto/16 :goto_11

    .line 507
    .line 508
    :cond_1d
    move-object/from16 v2, p0

    .line 509
    .line 510
    invoke-static {v2, v10}, Lcom/example/dyhelper/hook/γ;->θ(Lcom/example/dyhelper/hook/γ;Landroid/view/ViewGroup;)V

    .line 511
    .line 512
    .line 513
    invoke-static {v10, v10}, Lcom/example/dyhelper/hook/γ;->σ(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/widget/TextView;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    if-eqz v2, :cond_1e

    .line 518
    .line 519
    invoke-static {v2}, Lcom/example/dyhelper/hook/γ;->Ξ(Landroid/widget/TextView;)Z

    .line 520
    .line 521
    .line 522
    move-result v11

    .line 523
    if-nez v11, :cond_1f

    .line 524
    .line 525
    :cond_1e
    move-object v1, v0

    .line 526
    move-object v11, v3

    .line 527
    move-object v0, v10

    .line 528
    goto :goto_c

    .line 529
    :cond_1f
    const-string v0, "DYHelper_InfoBar_fake_desc"

    .line 530
    .line 531
    invoke-static {v10, v0}, Lcom/example/dyhelper/hook/γ;->Χ(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    invoke-static {v2}, Lcom/example/dyhelper/hook/γ;->ξ(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    move-object v8, v3

    .line 539
    iget-wide v3, v8, Lb20;->α:J

    .line 540
    .line 541
    if-eqz v0, :cond_20

    .line 542
    .line 543
    move-object v11, v8

    .line 544
    invoke-static/range {v0 .. v7}, Lcom/example/dyhelper/hook/γ;->ж(Landroid/view/ViewGroup;Landroid/app/Activity;Landroid/widget/TextView;JLjava/lang/String;Ljava/lang/String;Li20;)Z

    .line 545
    .line 546
    .line 547
    move-result v2

    .line 548
    if-eqz v2, :cond_27

    .line 549
    .line 550
    iget-wide v1, v11, Lb20;->α:J

    .line 551
    .line 552
    iget v3, v7, Li20;->ε:I

    .line 553
    .line 554
    sget-object v7, Le20;->ε:Le20;

    .line 555
    .line 556
    move-object v4, v5

    .line 557
    move v5, v3

    .line 558
    move-object v3, v4

    .line 559
    move-object v4, v6

    .line 560
    move-object v6, v0

    .line 561
    move-object/from16 v0, p1

    .line 562
    .line 563
    invoke-static/range {v0 .. v7}, Lcom/example/dyhelper/hook/γ;->Σ(Landroid/app/Activity;JLjava/lang/String;Ljava/lang/String;ILandroid/view/ViewGroup;Le20;)V

    .line 564
    .line 565
    .line 566
    return-void

    .line 567
    :cond_20
    move-object v11, v8

    .line 568
    move-object v0, v10

    .line 569
    invoke-static/range {v0 .. v7}, Lcom/example/dyhelper/hook/γ;->з(Landroid/widget/FrameLayout;Landroid/app/Activity;Landroid/widget/TextView;JLjava/lang/String;Ljava/lang/String;Li20;)Z

    .line 570
    .line 571
    .line 572
    move-result v2

    .line 573
    if-eqz v2, :cond_27

    .line 574
    .line 575
    iget-wide v1, v11, Lb20;->α:J

    .line 576
    .line 577
    move-object v3, v5

    .line 578
    iget v5, v7, Li20;->ε:I

    .line 579
    .line 580
    sget-object v7, Le20;->ε:Le20;

    .line 581
    .line 582
    move-object v4, v6

    .line 583
    move-object v6, v0

    .line 584
    move-object/from16 v0, p1

    .line 585
    .line 586
    invoke-static/range {v0 .. v7}, Lcom/example/dyhelper/hook/γ;->Σ(Landroid/app/Activity;JLjava/lang/String;Ljava/lang/String;ILandroid/view/ViewGroup;Le20;)V

    .line 587
    .line 588
    .line 589
    return-void

    .line 590
    :goto_c
    if-eqz v9, :cond_23

    .line 591
    .line 592
    iget-object v2, v9, Lj20;->α:Landroid/widget/TextView;

    .line 593
    .line 594
    invoke-static {v2, v0}, Lcom/example/dyhelper/hook/γ;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 595
    .line 596
    .line 597
    move-result v3

    .line 598
    if-eqz v3, :cond_21

    .line 599
    .line 600
    move-object v8, v2

    .line 601
    :cond_21
    if-nez v8, :cond_22

    .line 602
    .line 603
    goto :goto_e

    .line 604
    :cond_22
    :goto_d
    move-object v2, v8

    .line 605
    move-object v8, v4

    .line 606
    goto :goto_f

    .line 607
    :cond_23
    :goto_e
    invoke-static {v0}, Lcom/example/dyhelper/hook/γ;->υ(Landroid/widget/FrameLayout;)Landroid/widget/TextView;

    .line 608
    .line 609
    .line 610
    move-result-object v8

    .line 611
    goto :goto_d

    .line 612
    :goto_f
    iget-wide v3, v11, Lb20;->α:J

    .line 613
    .line 614
    move-object v9, v8

    .line 615
    move-object v8, v1

    .line 616
    move-object/from16 v1, p1

    .line 617
    .line 618
    invoke-static/range {v0 .. v7}, Lcom/example/dyhelper/hook/γ;->е(Landroid/widget/FrameLayout;Landroid/app/Activity;Landroid/widget/TextView;JLjava/lang/String;Ljava/lang/String;Li20;)Z

    .line 619
    .line 620
    .line 621
    move-result v3

    .line 622
    if-eqz v3, :cond_24

    .line 623
    .line 624
    iget-wide v1, v11, Lb20;->α:J

    .line 625
    .line 626
    iget v3, v7, Li20;->ε:I

    .line 627
    .line 628
    sget-object v7, Le20;->ζ:Le20;

    .line 629
    .line 630
    move-object v4, v5

    .line 631
    move v5, v3

    .line 632
    move-object v3, v4

    .line 633
    move-object v4, v6

    .line 634
    move-object v6, v0

    .line 635
    move-object/from16 v0, p1

    .line 636
    .line 637
    invoke-static/range {v0 .. v7}, Lcom/example/dyhelper/hook/γ;->Σ(Landroid/app/Activity;JLjava/lang/String;Ljava/lang/String;ILandroid/view/ViewGroup;Le20;)V

    .line 638
    .line 639
    .line 640
    return-void

    .line 641
    :cond_24
    move-object/from16 v1, p1

    .line 642
    .line 643
    monitor-enter v18

    .line 644
    :try_start_1
    invoke-virtual {v9, v1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    check-cast v1, Lc20;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 649
    .line 650
    monitor-exit v18

    .line 651
    if-eqz v2, :cond_25

    .line 652
    .line 653
    goto :goto_10

    .line 654
    :cond_25
    if-nez v8, :cond_26

    .line 655
    .line 656
    move-object v2, v0

    .line 657
    goto :goto_10

    .line 658
    :cond_26
    move-object v2, v8

    .line 659
    :goto_10
    invoke-static {v2, v0}, Lcom/example/dyhelper/hook/γ;->Ψ(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 660
    .line 661
    .line 662
    return-void

    .line 663
    :catchall_0
    move-exception v0

    .line 664
    monitor-exit v18

    .line 665
    throw v0

    .line 666
    :cond_27
    :goto_11
    return-void

    .line 667
    :catchall_1
    move-exception v0

    .line 668
    monitor-exit v18

    .line 669
    throw v0
.end method

.method public final й(Landroid/view/View;)V
    .locals 12

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance p0, Ljb;

    .line 16
    .line 17
    const/16 v0, 0x14

    .line 18
    .line 19
    invoke-direct {p0, p1, v0}, Ljb;-><init>(Landroid/view/View;I)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lcom/example/dyhelper/hook/γ;->ζ:Landroid/os/Handler;

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-static {p1}, Lcom/example/dyhelper/hook/γ;->ξ(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    invoke-static {p1}, Lcom/example/dyhelper/hook/γ;->д(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-static {v0}, Lcom/example/dyhelper/hook/γ;->μ(Landroid/view/View;)Landroid/app/Activity;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    goto/16 :goto_2

    .line 45
    .line 46
    :cond_2
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->Κ()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->Υ()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    move-object v2, v1

    .line 57
    invoke-static {v0}, Lcom/example/dyhelper/hook/γ;->τ(Landroid/view/View;)Landroid/widget/FrameLayout;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    invoke-static {v2, v1}, Lcom/example/dyhelper/hook/γ;->Ο(Landroid/app/Activity;Landroid/view/ViewGroup;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_4

    .line 68
    .line 69
    goto/16 :goto_2

    .line 70
    .line 71
    :cond_4
    if-ne p1, v0, :cond_6

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    filled-new-array {v3}, [I

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-static {v3, v0}, Lcom/example/dyhelper/hook/γ;->ρ([ILandroid/view/View;)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-nez v3, :cond_5

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_5
    move-object p1, v3

    .line 86
    :cond_6
    :goto_0
    invoke-static {p1}, Lcom/example/dyhelper/hook/γ;->а(Landroid/view/View;)Lb20;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    const-string v4, "DYHelper_InfoBar_fake_desc"

    .line 91
    .line 92
    const-string v5, "DYHelper_InfoBar_injected"

    .line 93
    .line 94
    if-nez v3, :cond_7

    .line 95
    .line 96
    invoke-static {v0, v5}, Lcom/example/dyhelper/hook/γ;->Φ(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    if-eqz v1, :cond_e

    .line 100
    .line 101
    invoke-static {v1, v4}, Lcom/example/dyhelper/hook/γ;->Χ(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_7
    iget-object v6, v3, Lb20;->β:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {v3}, Lcom/example/dyhelper/hook/γ;->ζ(Lb20;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->ω()Li20;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    move-object v9, v1

    .line 116
    move-object v1, v2

    .line 117
    invoke-static {p1, v0}, Lcom/example/dyhelper/hook/γ;->σ(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/widget/TextView;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    iget-wide v10, v3, Lb20;->α:J

    .line 122
    .line 123
    invoke-static {v10, v11, v6}, Lcom/example/dyhelper/hook/γ;->Ν(JLjava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    if-nez v10, :cond_8

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_8
    invoke-static {p0, v0}, Lcom/example/dyhelper/hook/γ;->θ(Lcom/example/dyhelper/hook/γ;Landroid/view/ViewGroup;)V

    .line 131
    .line 132
    .line 133
    if-eqz v9, :cond_9

    .line 134
    .line 135
    invoke-static {p0, v9}, Lcom/example/dyhelper/hook/γ;->θ(Lcom/example/dyhelper/hook/γ;Landroid/view/ViewGroup;)V

    .line 136
    .line 137
    .line 138
    :cond_9
    if-eqz v2, :cond_c

    .line 139
    .line 140
    invoke-static {v2}, Lcom/example/dyhelper/hook/γ;->Ξ(Landroid/widget/TextView;)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    if-nez p0, :cond_a

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_a
    if-eqz v9, :cond_b

    .line 148
    .line 149
    invoke-static {v9, v4}, Lcom/example/dyhelper/hook/γ;->Χ(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_b
    iget-wide v3, v3, Lb20;->α:J

    .line 153
    .line 154
    move-object v5, v6

    .line 155
    move-object v6, v7

    .line 156
    move-object v7, v8

    .line 157
    invoke-static/range {v0 .. v7}, Lcom/example/dyhelper/hook/γ;->ж(Landroid/view/ViewGroup;Landroid/app/Activity;Landroid/widget/TextView;JLjava/lang/String;Ljava/lang/String;Li20;)Z

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_c
    :goto_1
    invoke-static {v0, v5}, Lcom/example/dyhelper/hook/γ;->Φ(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v0, v5}, Lcom/example/dyhelper/hook/γ;->Χ(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    if-nez v9, :cond_d

    .line 168
    .line 169
    invoke-static {p1, v0}, Lcom/example/dyhelper/hook/γ;->Ψ(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_d
    move-object p0, v3

    .line 174
    invoke-static {v9}, Lcom/example/dyhelper/hook/γ;->υ(Landroid/widget/FrameLayout;)Landroid/widget/TextView;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    iget-wide v4, p0, Lb20;->α:J

    .line 179
    .line 180
    move-object v2, v1

    .line 181
    move-object v1, v9

    .line 182
    invoke-static/range {v1 .. v8}, Lcom/example/dyhelper/hook/γ;->е(Landroid/widget/FrameLayout;Landroid/app/Activity;Landroid/widget/TextView;JLjava/lang/String;Ljava/lang/String;Li20;)Z

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    if-nez p0, :cond_e

    .line 187
    .line 188
    invoke-static {p1, v0}, Lcom/example/dyhelper/hook/γ;->Ψ(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 189
    .line 190
    .line 191
    :cond_e
    :goto_2
    return-void
.end method

.method public final к(Landroid/widget/FrameLayout;Landroid/view/View;)V
    .locals 9

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance p0, Lw1;

    .line 16
    .line 17
    const/16 v0, 0x13

    .line 18
    .line 19
    invoke-direct {p0, p1, v0, p2}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lcom/example/dyhelper/hook/γ;->ζ:Landroid/os/Handler;

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-static {p1}, Lcom/example/dyhelper/hook/γ;->μ(Landroid/view/View;)Landroid/app/Activity;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    invoke-static {p2}, Lcom/example/dyhelper/hook/γ;->μ(Landroid/view/View;)Landroid/app/Activity;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto/16 :goto_1

    .line 41
    .line 42
    :cond_1
    move-object v2, v0

    .line 43
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->Κ()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->Υ()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-lez v0, :cond_3

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-gtz v0, :cond_4

    .line 70
    .line 71
    :cond_3
    move-object v1, p1

    .line 72
    goto :goto_2

    .line 73
    :cond_4
    invoke-static {v2, p1}, Lcom/example/dyhelper/hook/γ;->Ο(Landroid/app/Activity;Landroid/view/ViewGroup;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_5

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_5
    invoke-static {p1}, Lcom/example/dyhelper/hook/γ;->а(Landroid/view/View;)Lb20;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const-string v1, "DYHelper_InfoBar_fake_desc"

    .line 85
    .line 86
    if-nez v0, :cond_6

    .line 87
    .line 88
    const-string p0, "DYHelper_InfoBar_injected"

    .line 89
    .line 90
    invoke-static {p1, p0}, Lcom/example/dyhelper/hook/γ;->Χ(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1, v1}, Lcom/example/dyhelper/hook/γ;->Χ(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_6
    iget-object v6, v0, Lb20;->β:Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v0}, Lcom/example/dyhelper/hook/γ;->ζ(Lb20;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->ω()Li20;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    invoke-static {p2, p1}, Lcom/example/dyhelper/hook/γ;->σ(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/widget/TextView;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    iget-wide v4, v0, Lb20;->α:J

    .line 112
    .line 113
    invoke-static {v4, v5, v6}, Lcom/example/dyhelper/hook/γ;->Ν(JLjava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-nez v4, :cond_7

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_7
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/γ;->θ(Lcom/example/dyhelper/hook/γ;Landroid/view/ViewGroup;)V

    .line 121
    .line 122
    .line 123
    if-eqz v3, :cond_8

    .line 124
    .line 125
    invoke-static {v3}, Lcom/example/dyhelper/hook/γ;->Ξ(Landroid/widget/TextView;)Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-nez p0, :cond_9

    .line 130
    .line 131
    :cond_8
    move-object v1, p1

    .line 132
    goto :goto_0

    .line 133
    :cond_9
    invoke-static {p1, v1}, Lcom/example/dyhelper/hook/γ;->Χ(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v3}, Lcom/example/dyhelper/hook/γ;->ξ(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    iget-wide v4, v0, Lb20;->α:J

    .line 141
    .line 142
    if-eqz v1, :cond_a

    .line 143
    .line 144
    invoke-static/range {v1 .. v8}, Lcom/example/dyhelper/hook/γ;->ж(Landroid/view/ViewGroup;Landroid/app/Activity;Landroid/widget/TextView;JLjava/lang/String;Ljava/lang/String;Li20;)Z

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_a
    move-object v1, p1

    .line 149
    invoke-static/range {v1 .. v8}, Lcom/example/dyhelper/hook/γ;->з(Landroid/widget/FrameLayout;Landroid/app/Activity;Landroid/widget/TextView;JLjava/lang/String;Ljava/lang/String;Li20;)Z

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :goto_0
    invoke-static {v1}, Lcom/example/dyhelper/hook/γ;->υ(Landroid/widget/FrameLayout;)Landroid/widget/TextView;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    iget-wide v4, v0, Lb20;->α:J

    .line 158
    .line 159
    invoke-static/range {v1 .. v8}, Lcom/example/dyhelper/hook/γ;->е(Landroid/widget/FrameLayout;Landroid/app/Activity;Landroid/widget/TextView;JLjava/lang/String;Ljava/lang/String;Li20;)Z

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    if-nez p0, :cond_b

    .line 164
    .line 165
    invoke-static {p2, v1}, Lcom/example/dyhelper/hook/γ;->Ψ(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 166
    .line 167
    .line 168
    :cond_b
    :goto_1
    return-void

    .line 169
    :goto_2
    invoke-static {p2, v1}, Lcom/example/dyhelper/hook/γ;->Ψ(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 170
    .line 171
    .line 172
    return-void
.end method
