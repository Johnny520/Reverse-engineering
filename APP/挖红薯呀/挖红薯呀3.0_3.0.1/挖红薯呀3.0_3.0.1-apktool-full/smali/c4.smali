.class public final Lc4;
.super Lr0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;
.implements Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;
.implements Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;


# static fields
.field public static final R:Ltg0;


# instance fields
.field public final A:Lvb;

.field public B:Z

.field public C:Ly3;

.field public D:Lug0;

.field public final E:Lvg0;

.field public final F:Lsg0;

.field public final G:Lsg0;

.field public final H:Ljava/lang/String;

.field public final I:Ljava/lang/String;

.field public final J:Lo8;

.field public final K:Lug0;

.field public L:Lyz0;

.field public M:Z

.field public final N:Lsg0;

.field public final O:Lx3;

.field public final P:Ljava/util/ArrayList;

.field public final Q:Lb4;

.field public final g:Lw3;

.field public h:I

.field public final i:Lb4;

.field public final j:Landroid/view/accessibility/AccessibilityManager;

.field public k:J

.field public l:Ljava/util/List;

.field public final m:Landroid/os/Handler;

.field public final n:Ld;

.field public o:I

.field public p:I

.field public q:Le1;

.field public r:Le1;

.field public s:Z

.field public final t:Lug0;

.field public final u:Lug0;

.field public final v:Ll31;

.field public final w:Ll31;

.field public x:I

.field public y:Ljava/lang/Integer;

.field public final z:Le9;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sget-object v2, Lt20;->a:Ltg0;

    .line 9
    .line 10
    new-instance v2, Ltg0;

    .line 11
    .line 12
    invoke-direct {v2, v0}, Ltg0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iget v3, v2, Ltg0;->b:I

    .line 16
    .line 17
    if-ltz v3, :cond_2

    .line 18
    .line 19
    add-int/lit8 v4, v3, 0x20

    .line 20
    .line 21
    iget-object v5, v2, Ltg0;->a:[I

    .line 22
    .line 23
    array-length v6, v5

    .line 24
    if-ge v6, v4, :cond_0

    .line 25
    .line 26
    array-length v6, v5

    .line 27
    mul-int/lit8 v6, v6, 0x3

    .line 28
    .line 29
    div-int/lit8 v6, v6, 0x2

    .line 30
    .line 31
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([II)[I

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iput-object v5, v2, Ltg0;->a:[I

    .line 40
    .line 41
    :cond_0
    iget-object v5, v2, Ltg0;->a:[I

    .line 42
    .line 43
    iget v6, v2, Ltg0;->b:I

    .line 44
    .line 45
    if-eq v3, v6, :cond_1

    .line 46
    .line 47
    invoke-static {v5, v5, v4, v3, v6}, Lf9;->a0([I[IIII)V

    .line 48
    .line 49
    .line 50
    :cond_1
    const/4 v4, 0x0

    .line 51
    const/16 v6, 0xc

    .line 52
    .line 53
    invoke-static {v1, v5, v3, v4, v6}, Lf9;->d0([I[IIII)V

    .line 54
    .line 55
    .line 56
    iget v1, v2, Ltg0;->b:I

    .line 57
    .line 58
    add-int/2addr v1, v0

    .line 59
    iput v1, v2, Ltg0;->b:I

    .line 60
    .line 61
    sput-object v2, Lc4;->R:Ltg0;

    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    const-string v0, ""

    .line 65
    .line 66
    invoke-static {v0}, Lxc;->f(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :array_0
    .array-data 4
        0x7f060001
        0x7f060002
        0x7f06000d
        0x7f060018
        0x7f06001b
        0x7f06001c
        0x7f06001d
        0x7f06001e
        0x7f06001f
        0x7f060020
        0x7f060003
        0x7f060004
        0x7f060005
        0x7f060006
        0x7f060007
        0x7f060008
        0x7f060009
        0x7f06000a
        0x7f06000b
        0x7f06000c
        0x7f06000e
        0x7f06000f
        0x7f060010
        0x7f060011
        0x7f060012
        0x7f060013
        0x7f060014
        0x7f060015
        0x7f060016
        0x7f060017
        0x7f060019
        0x7f06001a
    .end array-data
.end method

.method public constructor <init>(Lw3;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lr0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc4;->g:Lw3;

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    .line 8
    iput v0, p0, Lc4;->h:I

    .line 9
    .line 10
    new-instance v1, Lb4;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, v2}, Lb4;-><init>(Lc4;I)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lc4;->i:Lb4;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v3, "accessibility"

    .line 23
    .line 24
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 32
    .line 33
    iput-object v1, p0, Lc4;->j:Landroid/view/accessibility/AccessibilityManager;

    .line 34
    .line 35
    const-wide/16 v3, 0x64

    .line 36
    .line 37
    iput-wide v3, p0, Lc4;->k:J

    .line 38
    .line 39
    new-instance v1, Landroid/os/Handler;

    .line 40
    .line 41
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Lc4;->m:Landroid/os/Handler;

    .line 49
    .line 50
    new-instance v1, Ld;

    .line 51
    .line 52
    invoke-direct {v1, p0}, Ld;-><init>(Lc4;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Lc4;->n:Ld;

    .line 56
    .line 57
    iput v0, p0, Lc4;->o:I

    .line 58
    .line 59
    iput v0, p0, Lc4;->p:I

    .line 60
    .line 61
    new-instance v0, Lug0;

    .line 62
    .line 63
    invoke-direct {v0}, Lug0;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Lc4;->t:Lug0;

    .line 67
    .line 68
    new-instance v0, Lug0;

    .line 69
    .line 70
    invoke-direct {v0}, Lug0;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, Lc4;->u:Lug0;

    .line 74
    .line 75
    new-instance v0, Ll31;

    .line 76
    .line 77
    invoke-direct {v0}, Ll31;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, Lc4;->v:Ll31;

    .line 81
    .line 82
    new-instance v0, Ll31;

    .line 83
    .line 84
    invoke-direct {v0}, Ll31;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, Lc4;->w:Ll31;

    .line 88
    .line 89
    const/4 v0, -0x1

    .line 90
    iput v0, p0, Lc4;->x:I

    .line 91
    .line 92
    new-instance v0, Le9;

    .line 93
    .line 94
    invoke-direct {v0}, Le9;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object v0, p0, Lc4;->z:Le9;

    .line 98
    .line 99
    const/4 v0, 0x6

    .line 100
    const/4 v1, 0x1

    .line 101
    const/4 v3, 0x0

    .line 102
    invoke-static {v1, v0, v3}, Lo30;->e(IILtb;)Lvb;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iput-object v0, p0, Lc4;->A:Lvb;

    .line 107
    .line 108
    iput-boolean v1, p0, Lc4;->B:Z

    .line 109
    .line 110
    sget-object v0, Lv20;->a:Lug0;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iput-object v0, p0, Lc4;->D:Lug0;

    .line 116
    .line 117
    new-instance v3, Lvg0;

    .line 118
    .line 119
    invoke-direct {v3}, Lvg0;-><init>()V

    .line 120
    .line 121
    .line 122
    iput-object v3, p0, Lc4;->E:Lvg0;

    .line 123
    .line 124
    new-instance v3, Lsg0;

    .line 125
    .line 126
    invoke-direct {v3}, Lsg0;-><init>()V

    .line 127
    .line 128
    .line 129
    iput-object v3, p0, Lc4;->F:Lsg0;

    .line 130
    .line 131
    new-instance v3, Lsg0;

    .line 132
    .line 133
    invoke-direct {v3}, Lsg0;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object v3, p0, Lc4;->G:Lsg0;

    .line 137
    .line 138
    const-string v3, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL"

    .line 139
    .line 140
    iput-object v3, p0, Lc4;->H:Ljava/lang/String;

    .line 141
    .line 142
    const-string v3, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL"

    .line 143
    .line 144
    iput-object v3, p0, Lc4;->I:Ljava/lang/String;

    .line 145
    .line 146
    new-instance v3, Lo8;

    .line 147
    .line 148
    const/16 v4, 0xb

    .line 149
    .line 150
    invoke-direct {v3, v4}, Lo8;-><init>(I)V

    .line 151
    .line 152
    .line 153
    iput-object v3, p0, Lc4;->J:Lo8;

    .line 154
    .line 155
    new-instance v3, Lug0;

    .line 156
    .line 157
    invoke-direct {v3}, Lug0;-><init>()V

    .line 158
    .line 159
    .line 160
    iput-object v3, p0, Lc4;->K:Lug0;

    .line 161
    .line 162
    new-instance v3, Lyz0;

    .line 163
    .line 164
    invoke-virtual {p1}, Lw3;->getSemanticsOwner()La01;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-virtual {v4}, La01;->a()Lxz0;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-direct {v3, v4, v0}, Lyz0;-><init>(Lxz0;Lu20;)V

    .line 173
    .line 174
    .line 175
    iput-object v3, p0, Lc4;->L:Lyz0;

    .line 176
    .line 177
    sget v0, Ls20;->a:I

    .line 178
    .line 179
    new-instance v0, Lsg0;

    .line 180
    .line 181
    invoke-direct {v0}, Lsg0;-><init>()V

    .line 182
    .line 183
    .line 184
    iput-object v0, p0, Lc4;->N:Lsg0;

    .line 185
    .line 186
    invoke-virtual {p1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 187
    .line 188
    .line 189
    new-instance p1, Lx3;

    .line 190
    .line 191
    invoke-direct {p1, v2, p0}, Lx3;-><init>(ILjava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    iput-object p1, p0, Lc4;->O:Lx3;

    .line 195
    .line 196
    new-instance p1, Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 199
    .line 200
    .line 201
    iput-object p1, p0, Lc4;->P:Ljava/util/ArrayList;

    .line 202
    .line 203
    new-instance p1, Lb4;

    .line 204
    .line 205
    invoke-direct {p1, p0, v1}, Lb4;-><init>(Lc4;I)V

    .line 206
    .line 207
    .line 208
    iput-object p1, p0, Lc4;->Q:Lb4;

    .line 209
    .line 210
    return-void
.end method

.method public static D(Lv50;FF)Landroid/graphics/Rect;
    .locals 4

    .line 1
    instance-of v0, p0, Lxm0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, Lym0;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lv50;->j()Lst0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance v0, Landroid/graphics/Rect;

    .line 17
    .line 18
    iget v1, p0, Lst0;->a:F

    .line 19
    .line 20
    add-float/2addr v1, p1

    .line 21
    float-to-int v1, v1

    .line 22
    iget v2, p0, Lst0;->b:F

    .line 23
    .line 24
    add-float/2addr v2, p2

    .line 25
    float-to-int v2, v2

    .line 26
    iget v3, p0, Lst0;->c:F

    .line 27
    .line 28
    add-float/2addr v3, p1

    .line 29
    float-to-int p1, v3

    .line 30
    iget p0, p0, Lst0;->d:F

    .line 31
    .line 32
    add-float/2addr p0, p2

    .line 33
    float-to-int p0, p0

    .line 34
    invoke-direct {v0, v1, v2, p1, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public static F(Lv50;)[F
    .locals 13

    .line 1
    instance-of v0, p0, Lym0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lym0;

    .line 6
    .line 7
    iget-object p0, p0, Lym0;->a:Lbw0;

    .line 8
    .line 9
    iget-wide v0, p0, Lbw0;->h:J

    .line 10
    .line 11
    iget-wide v2, p0, Lbw0;->g:J

    .line 12
    .line 13
    iget-wide v4, p0, Lbw0;->f:J

    .line 14
    .line 15
    iget-wide v6, p0, Lbw0;->e:J

    .line 16
    .line 17
    const/16 p0, 0x20

    .line 18
    .line 19
    shr-long v8, v6, p0

    .line 20
    .line 21
    long-to-int v8, v8

    .line 22
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result v8

    .line 26
    const-wide v9, 0xffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr v6, v9

    .line 32
    long-to-int v6, v6

    .line 33
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    shr-long v11, v4, p0

    .line 38
    .line 39
    long-to-int v7, v11

    .line 40
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    and-long/2addr v4, v9

    .line 45
    long-to-int v4, v4

    .line 46
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    shr-long v11, v2, p0

    .line 51
    .line 52
    long-to-int v5, v11

    .line 53
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    and-long/2addr v2, v9

    .line 58
    long-to-int v2, v2

    .line 59
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    shr-long v11, v0, p0

    .line 64
    .line 65
    long-to-int p0, v11

    .line 66
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    and-long/2addr v0, v9

    .line 71
    long-to-int v0, v0

    .line 72
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const/16 v1, 0x8

    .line 77
    .line 78
    new-array v1, v1, [F

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    aput v8, v1, v3

    .line 82
    .line 83
    const/4 v3, 0x1

    .line 84
    aput v6, v1, v3

    .line 85
    .line 86
    const/4 v3, 0x2

    .line 87
    aput v7, v1, v3

    .line 88
    .line 89
    const/4 v3, 0x3

    .line 90
    aput v4, v1, v3

    .line 91
    .line 92
    const/4 v3, 0x4

    .line 93
    aput v5, v1, v3

    .line 94
    .line 95
    const/4 v3, 0x5

    .line 96
    aput v2, v1, v3

    .line 97
    .line 98
    const/4 v2, 0x6

    .line 99
    aput p0, v1, v2

    .line 100
    .line 101
    const/4 p0, 0x7

    .line 102
    aput v0, v1, p0

    .line 103
    .line 104
    return-object v1

    .line 105
    :cond_0
    const/4 p0, 0x0

    .line 106
    return-object p0
.end method

.method public static G(Lv50;FF)Landroid/graphics/Region;
    .locals 7

    .line 1
    instance-of v0, p0, Lwm0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Region;

    .line 6
    .line 7
    check-cast p0, Lwm0;

    .line 8
    .line 9
    invoke-virtual {p0}, Lwm0;->j()Lst0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, p1, p2}, Lst0;->d(FF)Lst0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Landroid/graphics/Rect;

    .line 18
    .line 19
    iget v3, v1, Lst0;->a:F

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    add-float/2addr v3, v4

    .line 23
    float-to-int v3, v3

    .line 24
    iget v5, v1, Lst0;->b:F

    .line 25
    .line 26
    add-float/2addr v5, v4

    .line 27
    float-to-int v5, v5

    .line 28
    iget v6, v1, Lst0;->c:F

    .line 29
    .line 30
    add-float/2addr v6, v4

    .line 31
    float-to-int v6, v6

    .line 32
    iget v1, v1, Lst0;->d:F

    .line 33
    .line 34
    add-float/2addr v1, v4

    .line 35
    float-to-int v1, v1

    .line 36
    invoke-direct {v2, v3, v5, v6, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v2}, Landroid/graphics/Region;-><init>(Landroid/graphics/Rect;)V

    .line 40
    .line 41
    .line 42
    new-instance v1, Landroid/graphics/Region;

    .line 43
    .line 44
    invoke-direct {v1}, Landroid/graphics/Region;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Lwm0;->a:Ld6;

    .line 48
    .line 49
    instance-of v2, p0, Ld6;

    .line 50
    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    iget-object p0, p0, Ld6;->a:Landroid/graphics/Path;

    .line 54
    .line 55
    invoke-virtual {p0, p1, p2}, Landroid/graphics/Path;->offset(FF)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p0, v0}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 63
    .line 64
    const-string p1, "Unable to obtain android.graphics.Path"

    .line 65
    .line 66
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p0

    .line 70
    :cond_1
    const/4 p0, 0x0

    .line 71
    return-object p0
.end method

.method public static H(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v1, 0x186a0

    .line 13
    .line 14
    .line 15
    if-gt v0, v1, :cond_1

    .line 16
    .line 17
    :goto_0
    return-object p0

    .line 18
    :cond_1
    const v0, 0x1869f

    .line 19
    .line 20
    .line 21
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v2}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    move v1, v0

    .line 42
    :cond_2
    const/4 v0, 0x0

    .line 43
    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    return-object p0
.end method

.method public static l(Lxz0;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    iget-object p0, p0, Lxz0;->d:Lsz0;

    .line 6
    .line 7
    iget-object v1, p0, Lsz0;->d:Ljh0;

    .line 8
    .line 9
    sget-object v2, Lb01;->a:Le01;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, v2}, Lsz0;->c(Le01;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/util/List;

    .line 22
    .line 23
    const-string v1, ","

    .line 24
    .line 25
    const/16 v2, 0x3e

    .line 26
    .line 27
    invoke-static {p0, v1, v0, v2}, Lya0;->a(Ljava/util/List;Ljava/lang/String;Lpg0;I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    sget-object p0, Lb01;->E:Le01;

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    invoke-virtual {v1, p0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-nez p0, :cond_2

    .line 45
    .line 46
    move-object p0, v0

    .line 47
    :cond_2
    check-cast p0, Lf8;

    .line 48
    .line 49
    if-eqz p0, :cond_5

    .line 50
    .line 51
    iget-object p0, p0, Lf8;->e:Ljava/lang/String;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_3
    sget-object p0, Lb01;->A:Le01;

    .line 55
    .line 56
    invoke-virtual {v1, p0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-nez p0, :cond_4

    .line 61
    .line 62
    move-object p0, v0

    .line 63
    :cond_4
    check-cast p0, Ljava/util/List;

    .line 64
    .line 65
    if-eqz p0, :cond_5

    .line 66
    .line 67
    invoke-static {p0}, Lye;->K(Ljava/util/List;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Lf8;

    .line 72
    .line 73
    if-eqz p0, :cond_5

    .line 74
    .line 75
    iget-object p0, p0, Lf8;->e:Ljava/lang/String;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_5
    :goto_0
    return-object v0
.end method

.method public static final p(Lhy0;F)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lhy0;->a:Lhw;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v2, p1, v1

    .line 5
    .line 6
    if-gez v2, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    cmpl-float v2, v2, v1

    .line 19
    .line 20
    if-gtz v2, :cond_1

    .line 21
    .line 22
    :cond_0
    cmpl-float p1, p1, v1

    .line 23
    .line 24
    if-lez p1, :cond_2

    .line 25
    .line 26
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iget-object p0, p0, Lhy0;->b:Lhw;

    .line 37
    .line 38
    invoke-interface {p0}, Lhw;->invoke()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    cmpg-float p0, p1, p0

    .line 49
    .line 50
    if-gez p0, :cond_2

    .line 51
    .line 52
    :cond_1
    const/4 p0, 0x1

    .line 53
    return p0

    .line 54
    :cond_2
    const/4 p0, 0x0

    .line 55
    return p0
.end method

.method public static final q(Lhy0;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lhy0;->a:Lhw;

    .line 2
    .line 3
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    cmpl-float v1, v1, v2

    .line 15
    .line 16
    if-lez v1, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lhy0;->b:Lhw;

    .line 30
    .line 31
    invoke-interface {p0}, Lhw;->invoke()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public static final r(Lhy0;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lhy0;->a:Lhw;

    .line 2
    .line 3
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object p0, p0, Lhy0;->b:Lhw;

    .line 14
    .line 15
    invoke-interface {p0}, Lhw;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    cmpg-float p0, v1, p0

    .line 26
    .line 27
    if-gez p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public static synthetic w(Lc4;IILjava/lang/Integer;I)V
    .locals 1

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p3, v0

    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3, v0}, Lc4;->v(IILjava/lang/Integer;Ljava/util/List;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final A(Lb60;Lvg0;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lb60;->H()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lc4;->g:Lw3;

    .line 10
    .line 11
    invoke-virtual {v0}, Lw3;->getAndroidViewsHandler$ui()Lw6;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lw6;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_1
    iget-object v0, p1, Lb60;->I:Lmj0;

    .line 28
    .line 29
    const/16 v1, 0x8

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lmj0;->d(I)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-virtual {p1}, Lb60;->v()Lb60;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_0
    if-eqz p1, :cond_4

    .line 44
    .line 45
    iget-object v0, p1, Lb60;->I:Lmj0;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lmj0;->d(I)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-virtual {p1}, Lb60;->v()Lb60;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    goto :goto_0

    .line 59
    :cond_4
    move-object p1, v2

    .line 60
    :goto_1
    if-eqz p1, :cond_a

    .line 61
    .line 62
    invoke-virtual {p1}, Lb60;->x()Lsz0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-nez v0, :cond_5

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_5
    iget-boolean v0, v0, Lsz0;->f:Z

    .line 70
    .line 71
    const/4 v3, 0x1

    .line 72
    if-nez v0, :cond_8

    .line 73
    .line 74
    invoke-virtual {p1}, Lb60;->v()Lb60;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :goto_2
    if-eqz v0, :cond_7

    .line 79
    .line 80
    invoke-virtual {v0}, Lb60;->x()Lsz0;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    if-eqz v4, :cond_6

    .line 85
    .line 86
    iget-boolean v4, v4, Lsz0;->f:Z

    .line 87
    .line 88
    if-ne v4, v3, :cond_6

    .line 89
    .line 90
    move-object v2, v0

    .line 91
    goto :goto_3

    .line 92
    :cond_6
    invoke-virtual {v0}, Lb60;->v()Lb60;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_2

    .line 97
    :cond_7
    :goto_3
    if-eqz v2, :cond_8

    .line 98
    .line 99
    move-object p1, v2

    .line 100
    :cond_8
    iget p1, p1, Lb60;->e:I

    .line 101
    .line 102
    invoke-virtual {p2, p1}, Lvg0;->a(I)Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    if-nez p2, :cond_9

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_9
    invoke-virtual {p0, p1}, Lc4;->s(I)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    const/16 p2, 0x800

    .line 114
    .line 115
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {p0, p1, p2, v0, v1}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 120
    .line 121
    .line 122
    :cond_a
    :goto_4
    return-void
.end method

.method public final B(Lb60;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lb60;->H()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lc4;->g:Lw3;

    .line 9
    .line 10
    invoke-virtual {v0}, Lw3;->getAndroidViewsHandler$ui()Lw6;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lw6;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget p1, p1, Lb60;->e:I

    .line 26
    .line 27
    iget-object v0, p0, Lc4;->t:Lug0;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lu20;->b(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lhy0;

    .line 34
    .line 35
    iget-object v1, p0, Lc4;->u:Lug0;

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Lu20;->b(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lhy0;

    .line 42
    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    :goto_0
    return-void

    .line 48
    :cond_2
    const/16 v2, 0x1000

    .line 49
    .line 50
    invoke-virtual {p0, p1, v2}, Lc4;->g(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    iget-object v2, v0, Lhy0;->a:Lhw;

    .line 57
    .line 58
    invoke-interface {v2}, Lhw;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    float-to-int v2, v2

    .line 69
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setScrollX(I)V

    .line 70
    .line 71
    .line 72
    iget-object v0, v0, Lhy0;->b:Lhw;

    .line 73
    .line 74
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    float-to-int v0, v0

    .line 85
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollX(I)V

    .line 86
    .line 87
    .line 88
    :cond_3
    if-eqz v1, :cond_4

    .line 89
    .line 90
    iget-object v0, v1, Lhy0;->a:Lhw;

    .line 91
    .line 92
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Ljava/lang/Number;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    float-to-int v0, v0

    .line 103
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setScrollY(I)V

    .line 104
    .line 105
    .line 106
    iget-object v0, v1, Lhy0;->b:Lhw;

    .line 107
    .line 108
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Ljava/lang/Number;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    float-to-int v0, v0

    .line 119
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollY(I)V

    .line 120
    .line 121
    .line 122
    :cond_4
    invoke-virtual {p0, p1}, Lc4;->u(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public final C(Lxz0;IIZ)Z
    .locals 10

    .line 1
    iget-object v0, p1, Lxz0;->d:Lsz0;

    .line 2
    .line 3
    iget v1, p1, Lxz0;->g:I

    .line 4
    .line 5
    sget-object v2, Lrz0;->j:Le01;

    .line 6
    .line 7
    iget-object v0, v0, Lsz0;->d:Ljh0;

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lrd0;->g(Lxz0;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object p0, p1, Lxz0;->d:Lsz0;

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Lsz0;->c(Le01;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lo0;

    .line 29
    .line 30
    iget-object p0, p0, Lo0;->b:Lex;

    .line 31
    .line 32
    check-cast p0, Lxw;

    .line 33
    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-interface {p0, p1, p2, p3}, Lxw;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    return p0

    .line 59
    :cond_0
    if-ne p2, p3, :cond_1

    .line 60
    .line 61
    iget p4, p0, Lc4;->x:I

    .line 62
    .line 63
    if-ne p3, p4, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-static {p1}, Lc4;->l(Lxz0;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    if-nez v9, :cond_3

    .line 71
    .line 72
    :cond_2
    :goto_0
    return v3

    .line 73
    :cond_3
    if-ltz p2, :cond_4

    .line 74
    .line 75
    if-ne p2, p3, :cond_4

    .line 76
    .line 77
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-gt p3, p1, :cond_4

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    const/4 p2, -0x1

    .line 85
    :goto_1
    iput p2, p0, Lc4;->x:I

    .line 86
    .line 87
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    const/4 p2, 0x1

    .line 92
    if-lez p1, :cond_5

    .line 93
    .line 94
    move v3, p2

    .line 95
    :cond_5
    invoke-virtual {p0, v1}, Lc4;->s(I)I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    const/4 p1, 0x0

    .line 100
    if-eqz v3, :cond_6

    .line 101
    .line 102
    iget p3, p0, Lc4;->x:I

    .line 103
    .line 104
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    move-object v6, p3

    .line 109
    goto :goto_2

    .line 110
    :cond_6
    move-object v6, p1

    .line 111
    :goto_2
    if-eqz v3, :cond_7

    .line 112
    .line 113
    iget p3, p0, Lc4;->x:I

    .line 114
    .line 115
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    move-object v7, p3

    .line 120
    goto :goto_3

    .line 121
    :cond_7
    move-object v7, p1

    .line 122
    :goto_3
    if-eqz v3, :cond_8

    .line 123
    .line 124
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    :cond_8
    move-object v4, p0

    .line 133
    move-object v8, p1

    .line 134
    invoke-virtual/range {v4 .. v9}, Lc4;->h(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {v4, p0}, Lc4;->u(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v1}, Lc4;->y(I)V

    .line 142
    .line 143
    .line 144
    return p2
.end method

.method public final E(FFFF)Landroid/graphics/Rect;
    .locals 7

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-long v0, p1

    .line 6
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    int-to-long p1, p1

    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    shl-long/2addr v0, v2

    .line 14
    const-wide v3, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr p1, v3

    .line 20
    or-long/2addr p1, v0

    .line 21
    iget-object p0, p0, Lc4;->g:Lw3;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Lw3;->r(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    int-to-long v0, p3

    .line 32
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    int-to-long p3, p3

    .line 37
    shl-long/2addr v0, v2

    .line 38
    and-long/2addr p3, v3

    .line 39
    or-long/2addr p3, v0

    .line 40
    invoke-virtual {p0, p3, p4}, Lw3;->r(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide p3

    .line 44
    new-instance p0, Landroid/graphics/Rect;

    .line 45
    .line 46
    shr-long v0, p1, v2

    .line 47
    .line 48
    long-to-int v0, v0

    .line 49
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    shr-long v5, p3, v2

    .line 54
    .line 55
    long-to-int v2, v5

    .line 56
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-static {v1, v5}, Ljava/lang/Math;->min(FF)F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    float-to-double v5, v1

    .line 65
    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    .line 66
    .line 67
    .line 68
    move-result-wide v5

    .line 69
    double-to-float v1, v5

    .line 70
    float-to-int v1, v1

    .line 71
    and-long/2addr p1, v3

    .line 72
    long-to-int p1, p1

    .line 73
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    and-long/2addr p3, v3

    .line 78
    long-to-int p3, p3

    .line 79
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 80
    .line 81
    .line 82
    move-result p4

    .line 83
    invoke-static {p2, p4}, Ljava/lang/Math;->min(FF)F

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    float-to-double v3, p2

    .line 88
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    double-to-float p2, v3

    .line 93
    float-to-int p2, p2

    .line 94
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 95
    .line 96
    .line 97
    move-result p4

    .line 98
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    invoke-static {p4, v0}, Ljava/lang/Math;->max(FF)F

    .line 103
    .line 104
    .line 105
    move-result p4

    .line 106
    float-to-double v2, p4

    .line 107
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 108
    .line 109
    .line 110
    move-result-wide v2

    .line 111
    double-to-float p4, v2

    .line 112
    float-to-int p4, p4

    .line 113
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 118
    .line 119
    .line 120
    move-result p3

    .line 121
    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    float-to-double v2, p1

    .line 126
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 127
    .line 128
    .line 129
    move-result-wide v2

    .line 130
    double-to-float p1, v2

    .line 131
    float-to-int p1, p1

    .line 132
    invoke-direct {p0, v1, p2, p4, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 133
    .line 134
    .line 135
    return-object p0
.end method

.method public final I()V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lvg0;

    .line 4
    .line 5
    invoke-direct {v1}, Lvg0;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lc4;->E:Lvg0;

    .line 9
    .line 10
    iget-object v3, v2, Lvg0;->b:[I

    .line 11
    .line 12
    iget-object v4, v2, Lvg0;->a:[J

    .line 13
    .line 14
    array-length v5, v4

    .line 15
    add-int/lit8 v5, v5, -0x2

    .line 16
    .line 17
    iget-object v6, v0, Lc4;->K:Lug0;

    .line 18
    .line 19
    const/16 v14, 0x8

    .line 20
    .line 21
    if-ltz v5, :cond_8

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const-wide/16 v16, 0x80

    .line 25
    .line 26
    const-wide/16 v18, 0xff

    .line 27
    .line 28
    :goto_0
    aget-wide v9, v4, v7

    .line 29
    .line 30
    const/4 v8, 0x7

    .line 31
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    not-long v11, v9

    .line 37
    shl-long/2addr v11, v8

    .line 38
    and-long/2addr v11, v9

    .line 39
    and-long v11, v11, v20

    .line 40
    .line 41
    cmp-long v11, v11, v20

    .line 42
    .line 43
    if-eqz v11, :cond_7

    .line 44
    .line 45
    sub-int v11, v7, v5

    .line 46
    .line 47
    not-int v11, v11

    .line 48
    ushr-int/lit8 v11, v11, 0x1f

    .line 49
    .line 50
    rsub-int/lit8 v11, v11, 0x8

    .line 51
    .line 52
    const/4 v12, 0x0

    .line 53
    :goto_1
    if-ge v12, v11, :cond_6

    .line 54
    .line 55
    and-long v22, v9, v18

    .line 56
    .line 57
    cmp-long v13, v22, v16

    .line 58
    .line 59
    if-gez v13, :cond_4

    .line 60
    .line 61
    shl-int/lit8 v13, v7, 0x3

    .line 62
    .line 63
    add-int/2addr v13, v12

    .line 64
    aget v13, v3, v13

    .line 65
    .line 66
    move/from16 v22, v8

    .line 67
    .line 68
    invoke-virtual {v0}, Lc4;->k()Lu20;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-virtual {v8, v13}, Lu20;->b(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    check-cast v8, Lzz0;

    .line 77
    .line 78
    const/16 v23, 0x0

    .line 79
    .line 80
    if-eqz v8, :cond_0

    .line 81
    .line 82
    iget-object v8, v8, Lzz0;->a:Lxz0;

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_0
    move-object/from16 v8, v23

    .line 86
    .line 87
    :goto_2
    if-eqz v8, :cond_1

    .line 88
    .line 89
    iget-object v8, v8, Lxz0;->d:Lsz0;

    .line 90
    .line 91
    sget-object v15, Lb01;->d:Le01;

    .line 92
    .line 93
    iget-object v8, v8, Lsz0;->d:Ljh0;

    .line 94
    .line 95
    invoke-virtual {v8, v15}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-nez v8, :cond_5

    .line 100
    .line 101
    :cond_1
    invoke-virtual {v1, v13}, Lvg0;->a(I)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, v13}, Lu20;->b(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    check-cast v8, Lyz0;

    .line 109
    .line 110
    if-eqz v8, :cond_3

    .line 111
    .line 112
    iget-object v8, v8, Lyz0;->a:Lsz0;

    .line 113
    .line 114
    sget-object v15, Lb01;->d:Le01;

    .line 115
    .line 116
    iget-object v8, v8, Lsz0;->d:Ljh0;

    .line 117
    .line 118
    invoke-virtual {v8, v15}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    if-nez v8, :cond_2

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_2
    move-object/from16 v23, v8

    .line 126
    .line 127
    :goto_3
    check-cast v23, Ljava/lang/String;

    .line 128
    .line 129
    :cond_3
    move-object/from16 v8, v23

    .line 130
    .line 131
    const/16 v15, 0x20

    .line 132
    .line 133
    invoke-virtual {v0, v13, v15, v8}, Lc4;->x(IILjava/lang/String;)V

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_4
    move/from16 v22, v8

    .line 138
    .line 139
    :cond_5
    :goto_4
    shr-long/2addr v9, v14

    .line 140
    add-int/lit8 v12, v12, 0x1

    .line 141
    .line 142
    move/from16 v8, v22

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_6
    move/from16 v22, v8

    .line 146
    .line 147
    if-ne v11, v14, :cond_9

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_7
    move/from16 v22, v8

    .line 151
    .line 152
    :goto_5
    if-eq v7, v5, :cond_9

    .line 153
    .line 154
    add-int/lit8 v7, v7, 0x1

    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_8
    const-wide/16 v16, 0x80

    .line 159
    .line 160
    const-wide/16 v18, 0xff

    .line 161
    .line 162
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    const/16 v22, 0x7

    .line 168
    .line 169
    :cond_9
    iget-object v3, v1, Lvg0;->b:[I

    .line 170
    .line 171
    iget-object v1, v1, Lvg0;->a:[J

    .line 172
    .line 173
    array-length v4, v1

    .line 174
    add-int/lit8 v4, v4, -0x2

    .line 175
    .line 176
    if-ltz v4, :cond_11

    .line 177
    .line 178
    const/4 v5, 0x0

    .line 179
    :goto_6
    aget-wide v7, v1, v5

    .line 180
    .line 181
    not-long v9, v7

    .line 182
    shl-long v9, v9, v22

    .line 183
    .line 184
    and-long/2addr v9, v7

    .line 185
    and-long v9, v9, v20

    .line 186
    .line 187
    cmp-long v9, v9, v20

    .line 188
    .line 189
    if-eqz v9, :cond_10

    .line 190
    .line 191
    sub-int v9, v5, v4

    .line 192
    .line 193
    not-int v9, v9

    .line 194
    ushr-int/lit8 v9, v9, 0x1f

    .line 195
    .line 196
    rsub-int/lit8 v9, v9, 0x8

    .line 197
    .line 198
    const/4 v10, 0x0

    .line 199
    :goto_7
    if-ge v10, v9, :cond_f

    .line 200
    .line 201
    and-long v11, v7, v18

    .line 202
    .line 203
    cmp-long v11, v11, v16

    .line 204
    .line 205
    if-gez v11, :cond_d

    .line 206
    .line 207
    shl-int/lit8 v11, v5, 0x3

    .line 208
    .line 209
    add-int/2addr v11, v10

    .line 210
    aget v11, v3, v11

    .line 211
    .line 212
    invoke-static {v11}, Ljava/lang/Integer;->hashCode(I)I

    .line 213
    .line 214
    .line 215
    move-result v12

    .line 216
    const v13, -0x3361d2af    # -8.293031E7f

    .line 217
    .line 218
    .line 219
    mul-int/2addr v12, v13

    .line 220
    shl-int/lit8 v13, v12, 0x10

    .line 221
    .line 222
    xor-int/2addr v12, v13

    .line 223
    and-int/lit8 v13, v12, 0x7f

    .line 224
    .line 225
    iget v15, v2, Lvg0;->c:I

    .line 226
    .line 227
    ushr-int/lit8 v12, v12, 0x7

    .line 228
    .line 229
    and-int/2addr v12, v15

    .line 230
    move/from16 v24, v14

    .line 231
    .line 232
    const/16 v23, 0x0

    .line 233
    .line 234
    :goto_8
    iget-object v14, v2, Lvg0;->a:[J

    .line 235
    .line 236
    shr-int/lit8 v25, v12, 0x3

    .line 237
    .line 238
    and-int/lit8 v26, v12, 0x7

    .line 239
    .line 240
    move-object/from16 v27, v1

    .line 241
    .line 242
    shl-int/lit8 v1, v26, 0x3

    .line 243
    .line 244
    aget-wide v28, v14, v25

    .line 245
    .line 246
    ushr-long v28, v28, v1

    .line 247
    .line 248
    add-int/lit8 v25, v25, 0x1

    .line 249
    .line 250
    aget-wide v25, v14, v25

    .line 251
    .line 252
    rsub-int/lit8 v14, v1, 0x40

    .line 253
    .line 254
    shl-long v25, v25, v14

    .line 255
    .line 256
    move-wide/from16 v30, v7

    .line 257
    .line 258
    int-to-long v7, v1

    .line 259
    neg-long v7, v7

    .line 260
    const/16 v1, 0x3f

    .line 261
    .line 262
    shr-long/2addr v7, v1

    .line 263
    and-long v7, v25, v7

    .line 264
    .line 265
    or-long v7, v28, v7

    .line 266
    .line 267
    move v1, v15

    .line 268
    int-to-long v14, v13

    .line 269
    const-wide v25, 0x101010101010101L

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    mul-long v14, v14, v25

    .line 275
    .line 276
    xor-long/2addr v14, v7

    .line 277
    sub-long v25, v14, v25

    .line 278
    .line 279
    not-long v14, v14

    .line 280
    and-long v14, v25, v14

    .line 281
    .line 282
    and-long v14, v14, v20

    .line 283
    .line 284
    :goto_9
    const-wide/16 v25, 0x0

    .line 285
    .line 286
    cmp-long v28, v14, v25

    .line 287
    .line 288
    if-eqz v28, :cond_b

    .line 289
    .line 290
    invoke-static {v14, v15}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 291
    .line 292
    .line 293
    move-result v25

    .line 294
    shr-int/lit8 v25, v25, 0x3

    .line 295
    .line 296
    add-int v25, v12, v25

    .line 297
    .line 298
    and-int v25, v25, v1

    .line 299
    .line 300
    move/from16 v28, v1

    .line 301
    .line 302
    iget-object v1, v2, Lvg0;->b:[I

    .line 303
    .line 304
    aget v1, v1, v25

    .line 305
    .line 306
    if-ne v1, v11, :cond_a

    .line 307
    .line 308
    :goto_a
    move/from16 v1, v25

    .line 309
    .line 310
    goto :goto_b

    .line 311
    :cond_a
    const-wide/16 v25, 0x1

    .line 312
    .line 313
    sub-long v25, v14, v25

    .line 314
    .line 315
    and-long v14, v14, v25

    .line 316
    .line 317
    move/from16 v1, v28

    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_b
    move/from16 v28, v1

    .line 321
    .line 322
    not-long v14, v7

    .line 323
    const/4 v1, 0x6

    .line 324
    shl-long/2addr v14, v1

    .line 325
    and-long/2addr v7, v14

    .line 326
    and-long v7, v7, v20

    .line 327
    .line 328
    cmp-long v1, v7, v25

    .line 329
    .line 330
    if-eqz v1, :cond_c

    .line 331
    .line 332
    const/16 v25, -0x1

    .line 333
    .line 334
    goto :goto_a

    .line 335
    :goto_b
    if-ltz v1, :cond_e

    .line 336
    .line 337
    invoke-virtual {v2, v1}, Lvg0;->f(I)V

    .line 338
    .line 339
    .line 340
    goto :goto_c

    .line 341
    :cond_c
    add-int/lit8 v23, v23, 0x8

    .line 342
    .line 343
    add-int v12, v12, v23

    .line 344
    .line 345
    and-int v12, v12, v28

    .line 346
    .line 347
    move-object/from16 v1, v27

    .line 348
    .line 349
    move/from16 v15, v28

    .line 350
    .line 351
    move-wide/from16 v7, v30

    .line 352
    .line 353
    goto :goto_8

    .line 354
    :cond_d
    move-object/from16 v27, v1

    .line 355
    .line 356
    move-wide/from16 v30, v7

    .line 357
    .line 358
    move/from16 v24, v14

    .line 359
    .line 360
    :cond_e
    :goto_c
    shr-long v7, v30, v24

    .line 361
    .line 362
    add-int/lit8 v10, v10, 0x1

    .line 363
    .line 364
    move/from16 v14, v24

    .line 365
    .line 366
    move-object/from16 v1, v27

    .line 367
    .line 368
    goto/16 :goto_7

    .line 369
    .line 370
    :cond_f
    move-object/from16 v27, v1

    .line 371
    .line 372
    move v1, v14

    .line 373
    if-ne v9, v1, :cond_11

    .line 374
    .line 375
    goto :goto_d

    .line 376
    :cond_10
    move-object/from16 v27, v1

    .line 377
    .line 378
    :goto_d
    if-eq v5, v4, :cond_11

    .line 379
    .line 380
    add-int/lit8 v5, v5, 0x1

    .line 381
    .line 382
    move-object/from16 v1, v27

    .line 383
    .line 384
    const/16 v14, 0x8

    .line 385
    .line 386
    goto/16 :goto_6

    .line 387
    .line 388
    :cond_11
    invoke-virtual {v6}, Lug0;->c()V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0}, Lc4;->k()Lu20;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    iget-object v3, v1, Lu20;->b:[I

    .line 396
    .line 397
    iget-object v4, v1, Lu20;->c:[Ljava/lang/Object;

    .line 398
    .line 399
    iget-object v1, v1, Lu20;->a:[J

    .line 400
    .line 401
    array-length v5, v1

    .line 402
    add-int/lit8 v5, v5, -0x2

    .line 403
    .line 404
    if-ltz v5, :cond_16

    .line 405
    .line 406
    const/4 v7, 0x0

    .line 407
    :goto_e
    aget-wide v8, v1, v7

    .line 408
    .line 409
    not-long v10, v8

    .line 410
    shl-long v10, v10, v22

    .line 411
    .line 412
    and-long/2addr v10, v8

    .line 413
    and-long v10, v10, v20

    .line 414
    .line 415
    cmp-long v10, v10, v20

    .line 416
    .line 417
    if-eqz v10, :cond_15

    .line 418
    .line 419
    sub-int v10, v7, v5

    .line 420
    .line 421
    not-int v10, v10

    .line 422
    ushr-int/lit8 v10, v10, 0x1f

    .line 423
    .line 424
    const/16 v24, 0x8

    .line 425
    .line 426
    rsub-int/lit8 v14, v10, 0x8

    .line 427
    .line 428
    const/4 v10, 0x0

    .line 429
    :goto_f
    if-ge v10, v14, :cond_14

    .line 430
    .line 431
    and-long v11, v8, v18

    .line 432
    .line 433
    cmp-long v11, v11, v16

    .line 434
    .line 435
    if-gez v11, :cond_13

    .line 436
    .line 437
    shl-int/lit8 v11, v7, 0x3

    .line 438
    .line 439
    add-int/2addr v11, v10

    .line 440
    aget v12, v3, v11

    .line 441
    .line 442
    aget-object v11, v4, v11

    .line 443
    .line 444
    check-cast v11, Lzz0;

    .line 445
    .line 446
    iget-object v11, v11, Lzz0;->a:Lxz0;

    .line 447
    .line 448
    iget-object v13, v11, Lxz0;->d:Lsz0;

    .line 449
    .line 450
    sget-object v15, Lb01;->d:Le01;

    .line 451
    .line 452
    iget-object v13, v13, Lsz0;->d:Ljh0;

    .line 453
    .line 454
    invoke-virtual {v13, v15}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v13

    .line 458
    if-eqz v13, :cond_12

    .line 459
    .line 460
    invoke-virtual {v2, v12}, Lvg0;->a(I)Z

    .line 461
    .line 462
    .line 463
    move-result v13

    .line 464
    if-eqz v13, :cond_12

    .line 465
    .line 466
    iget-object v13, v11, Lxz0;->d:Lsz0;

    .line 467
    .line 468
    invoke-virtual {v13, v15}, Lsz0;->c(Le01;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v13

    .line 472
    check-cast v13, Ljava/lang/String;

    .line 473
    .line 474
    const/16 v15, 0x10

    .line 475
    .line 476
    invoke-virtual {v0, v12, v15, v13}, Lc4;->x(IILjava/lang/String;)V

    .line 477
    .line 478
    .line 479
    :cond_12
    new-instance v13, Lyz0;

    .line 480
    .line 481
    invoke-virtual {v0}, Lc4;->k()Lu20;

    .line 482
    .line 483
    .line 484
    move-result-object v15

    .line 485
    invoke-direct {v13, v11, v15}, Lyz0;-><init>(Lxz0;Lu20;)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v6, v12, v13}, Lug0;->i(ILjava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    :cond_13
    const/16 v11, 0x8

    .line 492
    .line 493
    shr-long/2addr v8, v11

    .line 494
    add-int/lit8 v10, v10, 0x1

    .line 495
    .line 496
    goto :goto_f

    .line 497
    :cond_14
    const/16 v11, 0x8

    .line 498
    .line 499
    if-ne v14, v11, :cond_16

    .line 500
    .line 501
    goto :goto_10

    .line 502
    :cond_15
    const/16 v11, 0x8

    .line 503
    .line 504
    :goto_10
    if-eq v7, v5, :cond_16

    .line 505
    .line 506
    add-int/lit8 v7, v7, 0x1

    .line 507
    .line 508
    goto :goto_e

    .line 509
    :cond_16
    new-instance v1, Lyz0;

    .line 510
    .line 511
    iget-object v2, v0, Lc4;->g:Lw3;

    .line 512
    .line 513
    invoke-virtual {v2}, Lw3;->getSemanticsOwner()La01;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    invoke-virtual {v2}, La01;->a()Lxz0;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    invoke-virtual {v0}, Lc4;->k()Lu20;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-direct {v1, v2, v3}, Lyz0;-><init>(Lxz0;Lu20;)V

    .line 526
    .line 527
    .line 528
    iput-object v1, v0, Lc4;->L:Lyz0;

    .line 529
    .line 530
    return-void
.end method

.method public final a(Landroid/view/View;)Ld;
    .locals 0

    .line 1
    iget-object p0, p0, Lc4;->n:Ld;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(ILe1;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    iget-object v3, v3, Le1;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 12
    .line 13
    invoke-virtual {v0}, Lc4;->k()Lu20;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {v5, v1}, Lu20;->b(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    check-cast v5, Lzz0;

    .line 22
    .line 23
    if-eqz v5, :cond_25

    .line 24
    .line 25
    iget-object v5, v5, Lzz0;->a:Lxz0;

    .line 26
    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    goto/16 :goto_15

    .line 30
    .line 31
    :cond_0
    iget-object v6, v5, Lxz0;->c:Lb60;

    .line 32
    .line 33
    iget-object v7, v5, Lxz0;->d:Lsz0;

    .line 34
    .line 35
    iget-object v8, v7, Lsz0;->d:Ljh0;

    .line 36
    .line 37
    invoke-static {v5}, Lc4;->l(Lxz0;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    iget-object v10, v0, Lc4;->H:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v2, v10}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    const/4 v11, -0x1

    .line 48
    if-eqz v10, :cond_1

    .line 49
    .line 50
    iget-object v0, v0, Lc4;->F:Lsg0;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lsg0;->d(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eq v0, v11, :cond_25

    .line 57
    .line 58
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    iget-object v10, v0, Lc4;->I:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v2, v10}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    if-eqz v10, :cond_2

    .line 73
    .line 74
    iget-object v0, v0, Lc4;->G:Lsg0;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Lsg0;->d(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eq v0, v11, :cond_25

    .line 81
    .line 82
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    sget-object v1, Lrz0;->a:Le01;

    .line 91
    .line 92
    invoke-virtual {v8, v1}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    iget-object v10, v0, Lc4;->g:Lw3;

    .line 97
    .line 98
    const/4 v12, 0x0

    .line 99
    if-eqz v1, :cond_17

    .line 100
    .line 101
    if-eqz v4, :cond_17

    .line 102
    .line 103
    const-string v1, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    .line 104
    .line 105
    invoke-static {v2, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_17

    .line 110
    .line 111
    const-string v0, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX"

    .line 112
    .line 113
    invoke-virtual {v4, v0, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    const-string v1, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH"

    .line 118
    .line 119
    invoke-virtual {v4, v1, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-lez v1, :cond_16

    .line 124
    .line 125
    if-ltz v0, :cond_16

    .line 126
    .line 127
    if-eqz v9, :cond_3

    .line 128
    .line 129
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    goto :goto_0

    .line 134
    :cond_3
    const v4, 0x7fffffff

    .line 135
    .line 136
    .line 137
    :goto_0
    if-lt v0, v4, :cond_4

    .line 138
    .line 139
    goto/16 :goto_f

    .line 140
    .line 141
    :cond_4
    invoke-static {v7}, Lu50;->p(Lsz0;)Lg71;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    if-nez v4, :cond_5

    .line 146
    .line 147
    goto/16 :goto_15

    .line 148
    .line 149
    :cond_5
    new-instance v6, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 152
    .line 153
    .line 154
    const/4 v7, 0x0

    .line 155
    :goto_1
    if-ge v7, v1, :cond_15

    .line 156
    .line 157
    add-int v8, v0, v7

    .line 158
    .line 159
    iget-object v9, v4, Lg71;->a:Lf71;

    .line 160
    .line 161
    iget-object v9, v9, Lf71;->a:Lf8;

    .line 162
    .line 163
    iget-object v9, v9, Lf8;->e:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 166
    .line 167
    .line 168
    move-result v9

    .line 169
    if-lt v8, v9, :cond_6

    .line 170
    .line 171
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move/from16 p0, v0

    .line 175
    .line 176
    move/from16 p4, v1

    .line 177
    .line 178
    move-object v14, v10

    .line 179
    goto/16 :goto_e

    .line 180
    .line 181
    :cond_6
    iget-object v9, v4, Lg71;->b:Lng0;

    .line 182
    .line 183
    iget-object v11, v9, Lng0;->c:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v11, Lr9;

    .line 186
    .line 187
    iget-object v11, v11, Lr9;->a:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v11, Lf8;

    .line 190
    .line 191
    const/16 v15, 0x29

    .line 192
    .line 193
    const-string v12, "offset("

    .line 194
    .line 195
    if-ltz v8, :cond_7

    .line 196
    .line 197
    iget-object v14, v11, Lf8;->e:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 200
    .line 201
    .line 202
    move-result v14

    .line 203
    if-ge v8, v14, :cond_7

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_7
    new-instance v14, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    invoke-direct {v14, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string v13, ") is out of bounds [0, "

    .line 215
    .line 216
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    iget-object v11, v11, Lf8;->e:Ljava/lang/String;

    .line 220
    .line 221
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 222
    .line 223
    .line 224
    move-result v11

    .line 225
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v11

    .line 235
    invoke-static {v11}, Lx10;->a(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    :goto_2
    iget-object v9, v9, Lng0;->e:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v9, Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-static {v8, v9}, Lw60;->q(ILjava/util/List;)I

    .line 243
    .line 244
    .line 245
    move-result v11

    .line 246
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v9

    .line 250
    check-cast v9, Lwo0;

    .line 251
    .line 252
    iget-object v11, v9, Lwo0;->a:Ly5;

    .line 253
    .line 254
    invoke-virtual {v9, v8}, Lwo0;->a(I)I

    .line 255
    .line 256
    .line 257
    move-result v8

    .line 258
    iget-object v13, v11, Ly5;->e:Ljava/lang/CharSequence;

    .line 259
    .line 260
    if-ltz v8, :cond_8

    .line 261
    .line 262
    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    .line 263
    .line 264
    .line 265
    move-result v14

    .line 266
    if-ge v8, v14, :cond_8

    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_8
    new-instance v14, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    invoke-direct {v14, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    const-string v12, ") is out of bounds [0,"

    .line 278
    .line 279
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    .line 283
    .line 284
    .line 285
    move-result v12

    .line 286
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v12

    .line 296
    invoke-static {v12}, Lx10;->a(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    :goto_3
    iget-object v11, v11, Ly5;->d:Le71;

    .line 300
    .line 301
    iget-object v12, v11, Le71;->e:Landroid/text/Layout;

    .line 302
    .line 303
    invoke-virtual {v12, v8}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 304
    .line 305
    .line 306
    move-result v13

    .line 307
    invoke-virtual {v11, v13}, Le71;->f(I)F

    .line 308
    .line 309
    .line 310
    move-result v14

    .line 311
    invoke-virtual {v11, v13}, Le71;->d(I)F

    .line 312
    .line 313
    .line 314
    move-result v15

    .line 315
    invoke-virtual {v12, v13}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 316
    .line 317
    .line 318
    move-result v13

    .line 319
    move/from16 p0, v0

    .line 320
    .line 321
    const/4 v0, 0x1

    .line 322
    if-ne v13, v0, :cond_9

    .line 323
    .line 324
    move v13, v0

    .line 325
    goto :goto_4

    .line 326
    :cond_9
    const/4 v13, 0x0

    .line 327
    :goto_4
    invoke-virtual {v12, v8}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 328
    .line 329
    .line 330
    move-result v12

    .line 331
    if-eqz v13, :cond_a

    .line 332
    .line 333
    if-nez v12, :cond_a

    .line 334
    .line 335
    const/4 v0, 0x0

    .line 336
    invoke-virtual {v11, v8, v0}, Le71;->g(IZ)F

    .line 337
    .line 338
    .line 339
    move-result v12

    .line 340
    add-int/lit8 v8, v8, 0x1

    .line 341
    .line 342
    const/4 v13, 0x1

    .line 343
    invoke-virtual {v11, v8, v13}, Le71;->g(IZ)F

    .line 344
    .line 345
    .line 346
    move-result v8

    .line 347
    goto :goto_6

    .line 348
    :cond_a
    const/4 v0, 0x0

    .line 349
    if-eqz v13, :cond_b

    .line 350
    .line 351
    if-eqz v12, :cond_b

    .line 352
    .line 353
    invoke-virtual {v11, v8, v0}, Le71;->h(IZ)F

    .line 354
    .line 355
    .line 356
    move-result v12

    .line 357
    add-int/lit8 v8, v8, 0x1

    .line 358
    .line 359
    const/4 v13, 0x1

    .line 360
    invoke-virtual {v11, v8, v13}, Le71;->h(IZ)F

    .line 361
    .line 362
    .line 363
    move-result v8

    .line 364
    :goto_5
    move/from16 v21, v12

    .line 365
    .line 366
    move v12, v8

    .line 367
    move/from16 v8, v21

    .line 368
    .line 369
    goto :goto_6

    .line 370
    :cond_b
    const/4 v13, 0x1

    .line 371
    if-eqz v12, :cond_c

    .line 372
    .line 373
    invoke-virtual {v11, v8, v0}, Le71;->g(IZ)F

    .line 374
    .line 375
    .line 376
    move-result v12

    .line 377
    add-int/lit8 v8, v8, 0x1

    .line 378
    .line 379
    invoke-virtual {v11, v8, v13}, Le71;->g(IZ)F

    .line 380
    .line 381
    .line 382
    move-result v8

    .line 383
    goto :goto_5

    .line 384
    :cond_c
    invoke-virtual {v11, v8, v0}, Le71;->h(IZ)F

    .line 385
    .line 386
    .line 387
    move-result v12

    .line 388
    add-int/lit8 v8, v8, 0x1

    .line 389
    .line 390
    invoke-virtual {v11, v8, v13}, Le71;->h(IZ)F

    .line 391
    .line 392
    .line 393
    move-result v8

    .line 394
    :goto_6
    new-instance v0, Landroid/graphics/RectF;

    .line 395
    .line 396
    invoke-direct {v0, v12, v14, v8, v15}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 397
    .line 398
    .line 399
    iget v8, v0, Landroid/graphics/RectF;->left:F

    .line 400
    .line 401
    iget v11, v0, Landroid/graphics/RectF;->top:F

    .line 402
    .line 403
    iget v12, v0, Landroid/graphics/RectF;->right:F

    .line 404
    .line 405
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 406
    .line 407
    iget v9, v9, Lwo0;->f:F

    .line 408
    .line 409
    const/4 v13, 0x0

    .line 410
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 411
    .line 412
    .line 413
    move-result v13

    .line 414
    int-to-long v13, v13

    .line 415
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 416
    .line 417
    .line 418
    move-result v9

    .line 419
    move v15, v0

    .line 420
    move/from16 p4, v1

    .line 421
    .line 422
    int-to-long v0, v9

    .line 423
    const/16 v9, 0x20

    .line 424
    .line 425
    shl-long/2addr v13, v9

    .line 426
    const-wide v16, 0xffffffffL

    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    and-long v0, v0, v16

    .line 432
    .line 433
    or-long/2addr v0, v13

    .line 434
    new-instance v13, Lst0;

    .line 435
    .line 436
    move/from16 v18, v9

    .line 437
    .line 438
    move-object v14, v10

    .line 439
    shr-long v9, v0, v18

    .line 440
    .line 441
    long-to-int v9, v9

    .line 442
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 443
    .line 444
    .line 445
    move-result v10

    .line 446
    add-float/2addr v10, v8

    .line 447
    and-long v0, v0, v16

    .line 448
    .line 449
    long-to-int v0, v0

    .line 450
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 451
    .line 452
    .line 453
    move-result v1

    .line 454
    add-float/2addr v1, v11

    .line 455
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 456
    .line 457
    .line 458
    move-result v8

    .line 459
    add-float/2addr v8, v12

    .line 460
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    add-float/2addr v0, v15

    .line 465
    invoke-direct {v13, v10, v1, v8, v0}, Lst0;-><init>(FFFF)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v5}, Lxz0;->d()Lqj0;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    const-wide/16 v8, 0x0

    .line 473
    .line 474
    if-eqz v0, :cond_e

    .line 475
    .line 476
    invoke-virtual {v0}, Lqj0;->G0()Loe0;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    iget-boolean v1, v1, Loe0;->q:Z

    .line 481
    .line 482
    if-eqz v1, :cond_d

    .line 483
    .line 484
    goto :goto_7

    .line 485
    :cond_d
    const/4 v0, 0x0

    .line 486
    :goto_7
    if-eqz v0, :cond_e

    .line 487
    .line 488
    invoke-virtual {v0, v8, v9}, Lqj0;->P0(J)J

    .line 489
    .line 490
    .line 491
    move-result-wide v8

    .line 492
    :cond_e
    invoke-virtual {v13, v8, v9}, Lst0;->e(J)Lst0;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-virtual {v5}, Lxz0;->g()Lst0;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    iget v8, v0, Lst0;->a:F

    .line 501
    .line 502
    iget v9, v1, Lst0;->c:F

    .line 503
    .line 504
    cmpg-float v8, v8, v9

    .line 505
    .line 506
    if-gez v8, :cond_f

    .line 507
    .line 508
    const/4 v8, 0x1

    .line 509
    goto :goto_8

    .line 510
    :cond_f
    const/4 v8, 0x0

    .line 511
    :goto_8
    iget v9, v1, Lst0;->a:F

    .line 512
    .line 513
    iget v10, v0, Lst0;->c:F

    .line 514
    .line 515
    cmpg-float v9, v9, v10

    .line 516
    .line 517
    if-gez v9, :cond_10

    .line 518
    .line 519
    const/4 v9, 0x1

    .line 520
    goto :goto_9

    .line 521
    :cond_10
    const/4 v9, 0x0

    .line 522
    :goto_9
    and-int/2addr v8, v9

    .line 523
    iget v9, v0, Lst0;->b:F

    .line 524
    .line 525
    iget v10, v1, Lst0;->d:F

    .line 526
    .line 527
    cmpg-float v9, v9, v10

    .line 528
    .line 529
    if-gez v9, :cond_11

    .line 530
    .line 531
    const/4 v9, 0x1

    .line 532
    goto :goto_a

    .line 533
    :cond_11
    const/4 v9, 0x0

    .line 534
    :goto_a
    and-int/2addr v8, v9

    .line 535
    iget v9, v1, Lst0;->b:F

    .line 536
    .line 537
    iget v10, v0, Lst0;->d:F

    .line 538
    .line 539
    cmpg-float v9, v9, v10

    .line 540
    .line 541
    if-gez v9, :cond_12

    .line 542
    .line 543
    const/4 v9, 0x1

    .line 544
    goto :goto_b

    .line 545
    :cond_12
    const/4 v9, 0x0

    .line 546
    :goto_b
    and-int/2addr v8, v9

    .line 547
    if-eqz v8, :cond_13

    .line 548
    .line 549
    invoke-virtual {v0, v1}, Lst0;->c(Lst0;)Lst0;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    goto :goto_c

    .line 554
    :cond_13
    const/4 v0, 0x0

    .line 555
    :goto_c
    if-eqz v0, :cond_14

    .line 556
    .line 557
    iget v1, v0, Lst0;->a:F

    .line 558
    .line 559
    iget v8, v0, Lst0;->b:F

    .line 560
    .line 561
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 562
    .line 563
    .line 564
    move-result v1

    .line 565
    int-to-long v9, v1

    .line 566
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 567
    .line 568
    .line 569
    move-result v1

    .line 570
    int-to-long v11, v1

    .line 571
    shl-long v8, v9, v18

    .line 572
    .line 573
    and-long v10, v11, v16

    .line 574
    .line 575
    or-long/2addr v8, v10

    .line 576
    invoke-virtual {v14, v8, v9}, Lw3;->r(J)J

    .line 577
    .line 578
    .line 579
    move-result-wide v8

    .line 580
    iget v1, v0, Lst0;->c:F

    .line 581
    .line 582
    iget v0, v0, Lst0;->d:F

    .line 583
    .line 584
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 585
    .line 586
    .line 587
    move-result v1

    .line 588
    int-to-long v10, v1

    .line 589
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    int-to-long v0, v0

    .line 594
    shl-long v10, v10, v18

    .line 595
    .line 596
    and-long v0, v0, v16

    .line 597
    .line 598
    or-long/2addr v0, v10

    .line 599
    invoke-virtual {v14, v0, v1}, Lw3;->r(J)J

    .line 600
    .line 601
    .line 602
    move-result-wide v0

    .line 603
    new-instance v10, Landroid/graphics/RectF;

    .line 604
    .line 605
    shr-long v11, v8, v18

    .line 606
    .line 607
    long-to-int v11, v11

    .line 608
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 609
    .line 610
    .line 611
    move-result v12

    .line 612
    move-wide/from16 v19, v0

    .line 613
    .line 614
    shr-long v0, v19, v18

    .line 615
    .line 616
    long-to-int v0, v0

    .line 617
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 618
    .line 619
    .line 620
    move-result v1

    .line 621
    invoke-static {v12, v1}, Ljava/lang/Math;->min(FF)F

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    and-long v8, v8, v16

    .line 626
    .line 627
    long-to-int v8, v8

    .line 628
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 629
    .line 630
    .line 631
    move-result v9

    .line 632
    and-long v12, v19, v16

    .line 633
    .line 634
    long-to-int v12, v12

    .line 635
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 636
    .line 637
    .line 638
    move-result v13

    .line 639
    invoke-static {v9, v13}, Ljava/lang/Math;->min(FF)F

    .line 640
    .line 641
    .line 642
    move-result v9

    .line 643
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 644
    .line 645
    .line 646
    move-result v11

    .line 647
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 648
    .line 649
    .line 650
    move-result v0

    .line 651
    invoke-static {v11, v0}, Ljava/lang/Math;->max(FF)F

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 656
    .line 657
    .line 658
    move-result v8

    .line 659
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 660
    .line 661
    .line 662
    move-result v11

    .line 663
    invoke-static {v8, v11}, Ljava/lang/Math;->max(FF)F

    .line 664
    .line 665
    .line 666
    move-result v8

    .line 667
    invoke-direct {v10, v1, v9, v0, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 668
    .line 669
    .line 670
    goto :goto_d

    .line 671
    :cond_14
    const/4 v10, 0x0

    .line 672
    :goto_d
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    :goto_e
    add-int/lit8 v7, v7, 0x1

    .line 676
    .line 677
    move/from16 v0, p0

    .line 678
    .line 679
    move/from16 v1, p4

    .line 680
    .line 681
    move-object v10, v14

    .line 682
    const/4 v12, 0x0

    .line 683
    goto/16 :goto_1

    .line 684
    .line 685
    :cond_15
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    const/4 v1, 0x0

    .line 690
    new-array v1, v1, [Landroid/graphics/RectF;

    .line 691
    .line 692
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    check-cast v1, [Landroid/os/Parcelable;

    .line 697
    .line 698
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 699
    .line 700
    .line 701
    return-void

    .line 702
    :cond_16
    :goto_f
    const-string v0, "AccessibilityDelegate"

    .line 703
    .line 704
    const-string v1, "Invalid arguments for accessibility character locations"

    .line 705
    .line 706
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 707
    .line 708
    .line 709
    return-void

    .line 710
    :cond_17
    move-object v14, v10

    .line 711
    sget-object v1, Lb01;->y:Le01;

    .line 712
    .line 713
    invoke-virtual {v8, v1}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 714
    .line 715
    .line 716
    move-result v7

    .line 717
    if-eqz v7, :cond_19

    .line 718
    .line 719
    if-eqz v4, :cond_19

    .line 720
    .line 721
    const-string v4, "androidx.compose.ui.semantics.testTag"

    .line 722
    .line 723
    invoke-static {v2, v4}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    move-result v4

    .line 727
    if-eqz v4, :cond_19

    .line 728
    .line 729
    invoke-virtual {v8, v1}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    if-nez v0, :cond_18

    .line 734
    .line 735
    const/4 v12, 0x0

    .line 736
    goto :goto_10

    .line 737
    :cond_18
    move-object v12, v0

    .line 738
    :goto_10
    check-cast v12, Ljava/lang/String;

    .line 739
    .line 740
    if-eqz v12, :cond_25

    .line 741
    .line 742
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    invoke-virtual {v0, v2, v12}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 747
    .line 748
    .line 749
    return-void

    .line 750
    :cond_19
    const-string v1, "androidx.compose.ui.semantics.id"

    .line 751
    .line 752
    invoke-static {v2, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    move-result v1

    .line 756
    if-eqz v1, :cond_1a

    .line 757
    .line 758
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    iget v1, v5, Lxz0;->g:I

    .line 763
    .line 764
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 765
    .line 766
    .line 767
    return-void

    .line 768
    :cond_1a
    const-string v1, "androidx.compose.ui.semantics.shapeType"

    .line 769
    .line 770
    invoke-static {v2, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 771
    .line 772
    .line 773
    move-result v4

    .line 774
    const-string v7, "androidx.compose.ui.semantics.shapeRegion"

    .line 775
    .line 776
    const-string v9, "androidx.compose.ui.semantics.shapeCorners"

    .line 777
    .line 778
    const-string v10, "androidx.compose.ui.semantics.shapeRect"

    .line 779
    .line 780
    if-eqz v4, :cond_1f

    .line 781
    .line 782
    sget-object v2, Lb01;->N:Le01;

    .line 783
    .line 784
    invoke-virtual {v8, v2}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v2

    .line 788
    if-nez v2, :cond_1b

    .line 789
    .line 790
    const/4 v12, 0x0

    .line 791
    goto :goto_11

    .line 792
    :cond_1b
    move-object v12, v2

    .line 793
    :goto_11
    check-cast v12, Lx01;

    .line 794
    .line 795
    if-eqz v12, :cond_25

    .line 796
    .line 797
    new-instance v2, Landroid/graphics/Rect;

    .line 798
    .line 799
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v3, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v0, v5, v2, v12}, Lc4;->m(Lxz0;Landroid/graphics/Rect;Lx01;)Lst0;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    iget v2, v0, Lst0;->b:F

    .line 810
    .line 811
    iget v4, v0, Lst0;->a:F

    .line 812
    .line 813
    move-object v11, v14

    .line 814
    invoke-virtual {v0}, Lst0;->b()J

    .line 815
    .line 816
    .line 817
    move-result-wide v13

    .line 818
    iget-object v0, v6, Lb60;->C:Lk50;

    .line 819
    .line 820
    invoke-virtual {v11}, Lw3;->getDensity()Lym;

    .line 821
    .line 822
    .line 823
    move-result-object v5

    .line 824
    invoke-interface {v12, v13, v14, v0, v5}, Lx01;->a(JLk50;Lym;)Lv50;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    instance-of v5, v0, Lxm0;

    .line 829
    .line 830
    if-eqz v5, :cond_1c

    .line 831
    .line 832
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 833
    .line 834
    .line 835
    move-result-object v5

    .line 836
    const/4 v6, 0x0

    .line 837
    invoke-virtual {v5, v1, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 841
    .line 842
    .line 843
    move-result-object v1

    .line 844
    invoke-static {v0, v4, v2}, Lc4;->D(Lv50;FF)Landroid/graphics/Rect;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    invoke-virtual {v1, v10, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 849
    .line 850
    .line 851
    return-void

    .line 852
    :cond_1c
    instance-of v5, v0, Lym0;

    .line 853
    .line 854
    if-eqz v5, :cond_1d

    .line 855
    .line 856
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 857
    .line 858
    .line 859
    move-result-object v5

    .line 860
    const/4 v13, 0x1

    .line 861
    invoke-virtual {v5, v1, v13}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 862
    .line 863
    .line 864
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 865
    .line 866
    .line 867
    move-result-object v1

    .line 868
    invoke-static {v0, v4, v2}, Lc4;->D(Lv50;FF)Landroid/graphics/Rect;

    .line 869
    .line 870
    .line 871
    move-result-object v2

    .line 872
    invoke-virtual {v1, v10, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 873
    .line 874
    .line 875
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 876
    .line 877
    .line 878
    move-result-object v1

    .line 879
    invoke-static {v0}, Lc4;->F(Lv50;)[F

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    invoke-virtual {v1, v9, v0}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 884
    .line 885
    .line 886
    return-void

    .line 887
    :cond_1d
    instance-of v5, v0, Lwm0;

    .line 888
    .line 889
    if-eqz v5, :cond_1e

    .line 890
    .line 891
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 892
    .line 893
    .line 894
    move-result-object v5

    .line 895
    const/4 v6, 0x2

    .line 896
    invoke-virtual {v5, v1, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 900
    .line 901
    .line 902
    move-result-object v1

    .line 903
    invoke-static {v0, v4, v2}, Lc4;->G(Lv50;FF)Landroid/graphics/Region;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    invoke-virtual {v1, v7, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 908
    .line 909
    .line 910
    return-void

    .line 911
    :cond_1e
    invoke-static {}, Lxc;->j()V

    .line 912
    .line 913
    .line 914
    return-void

    .line 915
    :cond_1f
    move-object v11, v14

    .line 916
    invoke-static {v2, v10}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 917
    .line 918
    .line 919
    move-result v1

    .line 920
    if-eqz v1, :cond_21

    .line 921
    .line 922
    sget-object v1, Lb01;->N:Le01;

    .line 923
    .line 924
    invoke-virtual {v8, v1}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 925
    .line 926
    .line 927
    move-result-object v1

    .line 928
    if-nez v1, :cond_20

    .line 929
    .line 930
    const/4 v12, 0x0

    .line 931
    goto :goto_12

    .line 932
    :cond_20
    move-object v12, v1

    .line 933
    :goto_12
    check-cast v12, Lx01;

    .line 934
    .line 935
    if-eqz v12, :cond_25

    .line 936
    .line 937
    new-instance v1, Landroid/graphics/Rect;

    .line 938
    .line 939
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 940
    .line 941
    .line 942
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 943
    .line 944
    .line 945
    invoke-virtual {v0, v5, v1, v12}, Lc4;->m(Lxz0;Landroid/graphics/Rect;Lx01;)Lst0;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    invoke-virtual {v0}, Lst0;->b()J

    .line 950
    .line 951
    .line 952
    move-result-wide v1

    .line 953
    iget-object v4, v6, Lb60;->C:Lk50;

    .line 954
    .line 955
    invoke-virtual {v11}, Lw3;->getDensity()Lym;

    .line 956
    .line 957
    .line 958
    move-result-object v5

    .line 959
    invoke-interface {v12, v1, v2, v4, v5}, Lx01;->a(JLk50;Lym;)Lv50;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    iget v2, v0, Lst0;->a:F

    .line 964
    .line 965
    iget v0, v0, Lst0;->b:F

    .line 966
    .line 967
    invoke-static {v1, v2, v0}, Lc4;->D(Lv50;FF)Landroid/graphics/Rect;

    .line 968
    .line 969
    .line 970
    move-result-object v0

    .line 971
    if-eqz v0, :cond_25

    .line 972
    .line 973
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 974
    .line 975
    .line 976
    move-result-object v1

    .line 977
    invoke-virtual {v1, v10, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 978
    .line 979
    .line 980
    return-void

    .line 981
    :cond_21
    invoke-static {v2, v9}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 982
    .line 983
    .line 984
    move-result v1

    .line 985
    if-eqz v1, :cond_23

    .line 986
    .line 987
    sget-object v1, Lb01;->N:Le01;

    .line 988
    .line 989
    invoke-virtual {v8, v1}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v1

    .line 993
    if-nez v1, :cond_22

    .line 994
    .line 995
    const/4 v12, 0x0

    .line 996
    goto :goto_13

    .line 997
    :cond_22
    move-object v12, v1

    .line 998
    :goto_13
    check-cast v12, Lx01;

    .line 999
    .line 1000
    if-eqz v12, :cond_25

    .line 1001
    .line 1002
    new-instance v1, Landroid/graphics/Rect;

    .line 1003
    .line 1004
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v0, v5, v1, v12}, Lc4;->m(Lxz0;Landroid/graphics/Rect;Lx01;)Lst0;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0

    .line 1014
    invoke-virtual {v0}, Lst0;->b()J

    .line 1015
    .line 1016
    .line 1017
    move-result-wide v0

    .line 1018
    iget-object v2, v6, Lb60;->C:Lk50;

    .line 1019
    .line 1020
    invoke-virtual {v11}, Lw3;->getDensity()Lym;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v4

    .line 1024
    invoke-interface {v12, v0, v1, v2, v4}, Lx01;->a(JLk50;Lym;)Lv50;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v0

    .line 1028
    invoke-static {v0}, Lc4;->F(Lv50;)[F

    .line 1029
    .line 1030
    .line 1031
    move-result-object v0

    .line 1032
    if-eqz v0, :cond_25

    .line 1033
    .line 1034
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v1

    .line 1038
    invoke-virtual {v1, v9, v0}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 1039
    .line 1040
    .line 1041
    return-void

    .line 1042
    :cond_23
    invoke-static {v2, v7}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1043
    .line 1044
    .line 1045
    move-result v1

    .line 1046
    if-eqz v1, :cond_25

    .line 1047
    .line 1048
    sget-object v1, Lb01;->N:Le01;

    .line 1049
    .line 1050
    invoke-virtual {v8, v1}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v1

    .line 1054
    if-nez v1, :cond_24

    .line 1055
    .line 1056
    const/4 v12, 0x0

    .line 1057
    goto :goto_14

    .line 1058
    :cond_24
    move-object v12, v1

    .line 1059
    :goto_14
    check-cast v12, Lx01;

    .line 1060
    .line 1061
    if-eqz v12, :cond_25

    .line 1062
    .line 1063
    new-instance v1, Landroid/graphics/Rect;

    .line 1064
    .line 1065
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v0, v5, v1, v12}, Lc4;->m(Lxz0;Landroid/graphics/Rect;Lx01;)Lst0;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    invoke-virtual {v0}, Lst0;->b()J

    .line 1076
    .line 1077
    .line 1078
    move-result-wide v1

    .line 1079
    iget-object v4, v6, Lb60;->C:Lk50;

    .line 1080
    .line 1081
    invoke-virtual {v11}, Lw3;->getDensity()Lym;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v5

    .line 1085
    invoke-interface {v12, v1, v2, v4, v5}, Lx01;->a(JLk50;Lym;)Lv50;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v1

    .line 1089
    iget v2, v0, Lst0;->a:F

    .line 1090
    .line 1091
    iget v0, v0, Lst0;->b:F

    .line 1092
    .line 1093
    invoke-static {v1, v2, v0}, Lc4;->G(Lv50;FF)Landroid/graphics/Region;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v0

    .line 1097
    if-eqz v0, :cond_25

    .line 1098
    .line 1099
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v1

    .line 1103
    invoke-virtual {v1, v7, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1104
    .line 1105
    .line 1106
    :cond_25
    :goto_15
    return-void
.end method

.method public final c(Lzz0;)Landroid/graphics/Rect;
    .locals 3

    .line 1
    iget-object p1, p1, Lzz0;->b:La30;

    .line 2
    .line 3
    iget v0, p1, La30;->a:I

    .line 4
    .line 5
    int-to-float v0, v0

    .line 6
    iget v1, p1, La30;->b:I

    .line 7
    .line 8
    int-to-float v1, v1

    .line 9
    iget v2, p1, La30;->c:I

    .line 10
    .line 11
    int-to-float v2, v2

    .line 12
    iget p1, p1, La30;->d:I

    .line 13
    .line 14
    int-to-float p1, p1

    .line 15
    invoke-virtual {p0, v0, v1, v2, p1}, Lc4;->E(FFFF)Landroid/graphics/Rect;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final d(Ljk;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lz3;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lz3;

    .line 11
    .line 12
    iget v3, v2, Lz3;->k:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lz3;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lz3;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lz3;-><init>(Lc4;Ljk;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lz3;->i:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Lz3;->k:I

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    iget-object v5, v0, Lc4;->z:Le9;

    .line 35
    .line 36
    const/4 v6, 0x1

    .line 37
    sget-object v7, Lzk;->d:Lzk;

    .line 38
    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    if-eq v3, v6, :cond_2

    .line 42
    .line 43
    if-ne v3, v4, :cond_1

    .line 44
    .line 45
    iget-object v3, v2, Lz3;->h:Lub;

    .line 46
    .line 47
    iget-object v8, v2, Lz3;->g:Lvg0;

    .line 48
    .line 49
    :try_start_0
    invoke-static {v1}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    move v1, v4

    .line 53
    move-object v9, v5

    .line 54
    goto/16 :goto_7

    .line 55
    .line 56
    :catchall_0
    move-exception v0

    .line 57
    move-object v9, v5

    .line 58
    goto/16 :goto_8

    .line 59
    .line 60
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {v0}, Lxc;->o(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    return-object v0

    .line 67
    :cond_2
    iget-object v3, v2, Lz3;->h:Lub;

    .line 68
    .line 69
    iget-object v8, v2, Lz3;->g:Lvg0;

    .line 70
    .line 71
    :try_start_1
    invoke-static {v1}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    invoke-static {v1}, Lw60;->M(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :try_start_2
    new-instance v1, Lvg0;

    .line 79
    .line 80
    invoke-direct {v1}, Lvg0;-><init>()V

    .line 81
    .line 82
    .line 83
    iget-object v3, v0, Lc4;->A:Lvb;

    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    new-instance v8, Lub;

    .line 89
    .line 90
    invoke-direct {v8, v3}, Lub;-><init>(Lvb;)V

    .line 91
    .line 92
    .line 93
    :goto_1
    iput-object v1, v2, Lz3;->g:Lvg0;

    .line 94
    .line 95
    iput-object v8, v2, Lz3;->h:Lub;

    .line 96
    .line 97
    iput v6, v2, Lz3;->k:I

    .line 98
    .line 99
    invoke-virtual {v8, v2}, Lub;->b(Ljk;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    if-ne v3, v7, :cond_4

    .line 104
    .line 105
    goto/16 :goto_6

    .line 106
    .line 107
    :cond_4
    move-object v15, v8

    .line 108
    move-object v8, v1

    .line 109
    move-object v1, v3

    .line 110
    move-object v3, v15

    .line 111
    :goto_2
    check-cast v1, Ljava/lang/Boolean;

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_a

    .line 118
    .line 119
    invoke-virtual {v3}, Lub;->c()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lc4;->n()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_7

    .line 127
    .line 128
    iget v1, v5, Le9;->f:I

    .line 129
    .line 130
    const/4 v9, 0x0

    .line 131
    move v10, v9

    .line 132
    :goto_3
    if-ge v10, v1, :cond_5

    .line 133
    .line 134
    iget-object v11, v5, Le9;->e:[Ljava/lang/Object;

    .line 135
    .line 136
    aget-object v11, v11, v10

    .line 137
    .line 138
    check-cast v11, Lb60;

    .line 139
    .line 140
    invoke-virtual {v0, v11, v8}, Lc4;->A(Lb60;Lvg0;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v11}, Lc4;->B(Lb60;)V

    .line 144
    .line 145
    .line 146
    add-int/lit8 v10, v10, 0x1

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_5
    iput v9, v8, Lvg0;->d:I

    .line 150
    .line 151
    iget-object v1, v8, Lvg0;->a:[J

    .line 152
    .line 153
    sget-object v9, Ldy0;->a:[J

    .line 154
    .line 155
    if-eq v1, v9, :cond_6

    .line 156
    .line 157
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    invoke-static {v9, v10, v1}, Lf9;->h0(J[J)V

    .line 163
    .line 164
    .line 165
    iget-object v1, v8, Lvg0;->a:[J

    .line 166
    .line 167
    iget v9, v8, Lvg0;->c:I

    .line 168
    .line 169
    shr-int/lit8 v10, v9, 0x3

    .line 170
    .line 171
    and-int/lit8 v9, v9, 0x7

    .line 172
    .line 173
    shl-int/lit8 v9, v9, 0x3

    .line 174
    .line 175
    aget-wide v11, v1, v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 176
    .line 177
    const-wide/16 v13, 0xff

    .line 178
    .line 179
    shl-long/2addr v13, v9

    .line 180
    move-object v9, v5

    .line 181
    not-long v4, v13

    .line 182
    and-long/2addr v4, v11

    .line 183
    or-long/2addr v4, v13

    .line 184
    :try_start_3
    aput-wide v4, v1, v10

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_6
    move-object v9, v5

    .line 188
    :goto_4
    iget v1, v8, Lvg0;->c:I

    .line 189
    .line 190
    invoke-static {v1}, Ldy0;->a(I)I

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    iget v4, v8, Lvg0;->d:I

    .line 195
    .line 196
    sub-int/2addr v1, v4

    .line 197
    iput v1, v8, Lvg0;->e:I

    .line 198
    .line 199
    iget-boolean v1, v0, Lc4;->M:Z

    .line 200
    .line 201
    if-nez v1, :cond_8

    .line 202
    .line 203
    iput-boolean v6, v0, Lc4;->M:Z

    .line 204
    .line 205
    iget-object v1, v0, Lc4;->m:Landroid/os/Handler;

    .line 206
    .line 207
    iget-object v4, v0, Lc4;->O:Lx3;

    .line 208
    .line 209
    invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 210
    .line 211
    .line 212
    goto :goto_5

    .line 213
    :catchall_1
    move-exception v0

    .line 214
    goto :goto_8

    .line 215
    :cond_7
    move-object v9, v5

    .line 216
    :cond_8
    :goto_5
    invoke-virtual {v9}, Le9;->clear()V

    .line 217
    .line 218
    .line 219
    iget-object v1, v0, Lc4;->t:Lug0;

    .line 220
    .line 221
    invoke-virtual {v1}, Lug0;->c()V

    .line 222
    .line 223
    .line 224
    iget-object v1, v0, Lc4;->u:Lug0;

    .line 225
    .line 226
    invoke-virtual {v1}, Lug0;->c()V

    .line 227
    .line 228
    .line 229
    iget-wide v4, v0, Lc4;->k:J

    .line 230
    .line 231
    iput-object v8, v2, Lz3;->g:Lvg0;

    .line 232
    .line 233
    iput-object v3, v2, Lz3;->h:Lub;

    .line 234
    .line 235
    const/4 v1, 0x2

    .line 236
    iput v1, v2, Lz3;->k:I

    .line 237
    .line 238
    invoke-static {v4, v5, v2}, Ls91;->u(JLjk;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 242
    if-ne v4, v7, :cond_9

    .line 243
    .line 244
    :goto_6
    return-object v7

    .line 245
    :cond_9
    :goto_7
    move v4, v1

    .line 246
    move-object v1, v8

    .line 247
    move-object v5, v9

    .line 248
    move-object v8, v3

    .line 249
    goto/16 :goto_1

    .line 250
    .line 251
    :cond_a
    move-object v9, v5

    .line 252
    invoke-virtual {v9}, Le9;->clear()V

    .line 253
    .line 254
    .line 255
    sget-object v0, Lna1;->a:Lna1;

    .line 256
    .line 257
    return-object v0

    .line 258
    :goto_8
    invoke-virtual {v9}, Le9;->clear()V

    .line 259
    .line 260
    .line 261
    throw v0
.end method

.method public final e(ZIJ)Z
    .locals 21

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-wide/from16 v1, p3

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-virtual {v3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-static {v3, v4}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    :cond_0
    const/16 v16, 0x0

    .line 24
    .line 25
    goto/16 :goto_a

    .line 26
    .line 27
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lc4;->k()Lu20;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2, v5, v6}, Lok0;->b(JJ)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-nez v5, :cond_0

    .line 41
    .line 42
    const-wide v5, 0x7fffffff7fffffffL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    and-long/2addr v5, v1

    .line 48
    const-wide v7, 0x7fffff007fffffL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    add-long/2addr v5, v7

    .line 54
    const-wide v7, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    and-long/2addr v5, v7

    .line 60
    const-wide/16 v7, 0x0

    .line 61
    .line 62
    cmp-long v5, v5, v7

    .line 63
    .line 64
    if-nez v5, :cond_0

    .line 65
    .line 66
    const/4 v5, 0x1

    .line 67
    if-ne v0, v5, :cond_2

    .line 68
    .line 69
    sget-object v0, Lb01;->v:Le01;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    if-nez v0, :cond_11

    .line 73
    .line 74
    sget-object v0, Lb01;->u:Le01;

    .line 75
    .line 76
    :goto_0
    iget-object v6, v3, Lu20;->c:[Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v3, v3, Lu20;->a:[J

    .line 79
    .line 80
    array-length v7, v3

    .line 81
    add-int/lit8 v7, v7, -0x2

    .line 82
    .line 83
    if-ltz v7, :cond_0

    .line 84
    .line 85
    const/4 v8, 0x0

    .line 86
    const/4 v9, 0x0

    .line 87
    :goto_1
    aget-wide v10, v3, v8

    .line 88
    .line 89
    not-long v12, v10

    .line 90
    const/4 v14, 0x7

    .line 91
    shl-long/2addr v12, v14

    .line 92
    and-long/2addr v12, v10

    .line 93
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    and-long/2addr v12, v14

    .line 99
    cmp-long v12, v12, v14

    .line 100
    .line 101
    if-eqz v12, :cond_f

    .line 102
    .line 103
    sub-int v12, v8, v7

    .line 104
    .line 105
    not-int v12, v12

    .line 106
    ushr-int/lit8 v12, v12, 0x1f

    .line 107
    .line 108
    const/16 v13, 0x8

    .line 109
    .line 110
    rsub-int/lit8 v12, v12, 0x8

    .line 111
    .line 112
    const/4 v14, 0x0

    .line 113
    :goto_2
    if-ge v14, v12, :cond_d

    .line 114
    .line 115
    const-wide/16 v15, 0xff

    .line 116
    .line 117
    and-long/2addr v15, v10

    .line 118
    const-wide/16 v17, 0x80

    .line 119
    .line 120
    cmp-long v15, v15, v17

    .line 121
    .line 122
    if-gez v15, :cond_b

    .line 123
    .line 124
    shl-int/lit8 v15, v8, 0x3

    .line 125
    .line 126
    add-int/2addr v15, v14

    .line 127
    aget-object v15, v6, v15

    .line 128
    .line 129
    check-cast v15, Lzz0;

    .line 130
    .line 131
    const/16 v16, 0x0

    .line 132
    .line 133
    iget-object v4, v15, Lzz0;->b:La30;

    .line 134
    .line 135
    iget v5, v4, La30;->a:I

    .line 136
    .line 137
    int-to-float v5, v5

    .line 138
    move/from16 p1, v13

    .line 139
    .line 140
    iget v13, v4, La30;->b:I

    .line 141
    .line 142
    int-to-float v13, v13

    .line 143
    iget v1, v4, La30;->c:I

    .line 144
    .line 145
    int-to-float v1, v1

    .line 146
    iget v2, v4, La30;->d:I

    .line 147
    .line 148
    int-to-float v2, v2

    .line 149
    const/16 v4, 0x20

    .line 150
    .line 151
    move/from16 v17, v1

    .line 152
    .line 153
    move/from16 v18, v2

    .line 154
    .line 155
    shr-long v1, p3, v4

    .line 156
    .line 157
    long-to-int v1, v1

    .line 158
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    const-wide v19, 0xffffffffL

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    move v4, v1

    .line 168
    and-long v1, p3, v19

    .line 169
    .line 170
    long-to-int v1, v1

    .line 171
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    cmpl-float v2, v4, v5

    .line 176
    .line 177
    if-ltz v2, :cond_3

    .line 178
    .line 179
    const/4 v2, 0x1

    .line 180
    goto :goto_3

    .line 181
    :cond_3
    move/from16 v2, v16

    .line 182
    .line 183
    :goto_3
    cmpg-float v4, v4, v17

    .line 184
    .line 185
    if-gez v4, :cond_4

    .line 186
    .line 187
    const/4 v4, 0x1

    .line 188
    goto :goto_4

    .line 189
    :cond_4
    move/from16 v4, v16

    .line 190
    .line 191
    :goto_4
    and-int/2addr v2, v4

    .line 192
    cmpl-float v4, v1, v13

    .line 193
    .line 194
    if-ltz v4, :cond_5

    .line 195
    .line 196
    const/4 v4, 0x1

    .line 197
    goto :goto_5

    .line 198
    :cond_5
    move/from16 v4, v16

    .line 199
    .line 200
    :goto_5
    and-int/2addr v2, v4

    .line 201
    cmpg-float v1, v1, v18

    .line 202
    .line 203
    if-gez v1, :cond_6

    .line 204
    .line 205
    const/4 v1, 0x1

    .line 206
    goto :goto_6

    .line 207
    :cond_6
    move/from16 v1, v16

    .line 208
    .line 209
    :goto_6
    and-int/2addr v1, v2

    .line 210
    if-nez v1, :cond_7

    .line 211
    .line 212
    goto :goto_8

    .line 213
    :cond_7
    iget-object v1, v15, Lzz0;->a:Lxz0;

    .line 214
    .line 215
    iget-object v1, v1, Lxz0;->d:Lsz0;

    .line 216
    .line 217
    iget-object v1, v1, Lsz0;->d:Ljh0;

    .line 218
    .line 219
    invoke-virtual {v1, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    if-nez v1, :cond_8

    .line 224
    .line 225
    const/4 v1, 0x0

    .line 226
    :cond_8
    check-cast v1, Lhy0;

    .line 227
    .line 228
    if-nez v1, :cond_9

    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_9
    iget-object v2, v1, Lhy0;->a:Lhw;

    .line 232
    .line 233
    if-gez p2, :cond_a

    .line 234
    .line 235
    invoke-interface {v2}, Lhw;->invoke()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    check-cast v1, Ljava/lang/Number;

    .line 240
    .line 241
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    const/4 v2, 0x0

    .line 246
    cmpl-float v1, v1, v2

    .line 247
    .line 248
    if-lez v1, :cond_c

    .line 249
    .line 250
    :goto_7
    const/4 v9, 0x1

    .line 251
    goto :goto_8

    .line 252
    :cond_a
    invoke-interface {v2}, Lhw;->invoke()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    check-cast v2, Ljava/lang/Number;

    .line 257
    .line 258
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    iget-object v1, v1, Lhy0;->b:Lhw;

    .line 263
    .line 264
    invoke-interface {v1}, Lhw;->invoke()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    check-cast v1, Ljava/lang/Number;

    .line 269
    .line 270
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    cmpg-float v1, v2, v1

    .line 275
    .line 276
    if-gez v1, :cond_c

    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_b
    move/from16 p1, v13

    .line 280
    .line 281
    const/16 v16, 0x0

    .line 282
    .line 283
    :cond_c
    :goto_8
    shr-long v10, v10, p1

    .line 284
    .line 285
    add-int/lit8 v14, v14, 0x1

    .line 286
    .line 287
    move/from16 v13, p1

    .line 288
    .line 289
    move-wide/from16 v1, p3

    .line 290
    .line 291
    const/4 v5, 0x1

    .line 292
    goto/16 :goto_2

    .line 293
    .line 294
    :cond_d
    move v1, v13

    .line 295
    const/16 v16, 0x0

    .line 296
    .line 297
    if-ne v12, v1, :cond_e

    .line 298
    .line 299
    goto :goto_9

    .line 300
    :cond_e
    return v9

    .line 301
    :cond_f
    const/16 v16, 0x0

    .line 302
    .line 303
    :goto_9
    if-eq v8, v7, :cond_10

    .line 304
    .line 305
    add-int/lit8 v8, v8, 0x1

    .line 306
    .line 307
    move-wide/from16 v1, p3

    .line 308
    .line 309
    const/4 v5, 0x1

    .line 310
    goto/16 :goto_1

    .line 311
    .line 312
    :cond_10
    return v9

    .line 313
    :cond_11
    const/16 v16, 0x0

    .line 314
    .line 315
    invoke-static {}, Lxc;->j()V

    .line 316
    .line 317
    .line 318
    :goto_a
    return v16
.end method

.method public final f()V
    .locals 2

    .line 1
    const-string v0, "sendAccessibilitySemanticsStructureChangeEvents"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Lc4;->n()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lc4;->g:Lw3;

    .line 13
    .line 14
    invoke-virtual {v0}, Lw3;->getSemanticsOwner()La01;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, La01;->a()Lxz0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lc4;->L:Lyz0;

    .line 23
    .line 24
    invoke-virtual {p0, v0, v1}, Lc4;->t(Lxz0;Lyz0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 28
    .line 29
    .line 30
    const-string v0, "sendSemanticsPropertyChangeEvents"

    .line 31
    .line 32
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :try_start_1
    invoke-virtual {p0}, Lc4;->k()Lu20;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0, v0}, Lc4;->z(Lu20;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    .line 41
    .line 42
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 43
    .line 44
    .line 45
    const-string v0, "updateSemanticsNodesCopyAndPanes"

    .line 46
    .line 47
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :try_start_2
    invoke-virtual {p0}, Lc4;->I()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    .line 52
    .line 53
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 59
    .line 60
    .line 61
    throw p0

    .line 62
    :catchall_1
    move-exception p0

    .line 63
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :catchall_2
    move-exception p0

    .line 68
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 69
    .line 70
    .line 71
    throw p0
.end method

.method public final g(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 2

    .line 1
    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setEnabled(Z)V

    .line 7
    .line 8
    .line 9
    const-string v0, "android.view.View"

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lc4;->g:Lw3;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, v0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lc4;->n()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lc4;->k()Lu20;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0, p1}, Lu20;->b(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lzz0;

    .line 45
    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    iget-object p0, p0, Lzz0;->a:Lxz0;

    .line 49
    .line 50
    iget-object p1, p0, Lxz0;->d:Lsz0;

    .line 51
    .line 52
    sget-object v0, Lb01;->I:Le01;

    .line 53
    .line 54
    iget-object p1, p1, Lsz0;->d:Ljh0;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setPassword(Z)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, Lxz0;->d:Lsz0;

    .line 64
    .line 65
    sget-object p1, Lb01;->n:Le01;

    .line 66
    .line 67
    iget-object p0, p0, Lsz0;->d:Ljh0;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-nez p0, :cond_0

    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-static {p0, p1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 83
    .line 84
    const/16 v0, 0x22

    .line 85
    .line 86
    if-lt p1, v0, :cond_1

    .line 87
    .line 88
    invoke-static {p2, p0}, Ls0;->f(Landroid/view/accessibility/AccessibilityEvent;Z)V

    .line 89
    .line 90
    .line 91
    :cond_1
    return-object p2
.end method

.method public final h(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;
    .locals 1

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lc4;->g(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    if-eqz p4, :cond_2

    .line 26
    .line 27
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    .line 32
    .line 33
    .line 34
    :cond_2
    if-eqz p5, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p1, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_3
    return-object p0
.end method

.method public final i(Lxz0;)I
    .locals 2

    .line 1
    iget-object p1, p1, Lxz0;->d:Lsz0;

    .line 2
    .line 3
    sget-object v0, Lb01;->a:Le01;

    .line 4
    .line 5
    iget-object v1, p1, Lsz0;->d:Ljh0;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lb01;->F:Le01;

    .line 14
    .line 15
    iget-object v1, p1, Lsz0;->d:Ljh0;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lsz0;->c(Le01;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ll71;

    .line 28
    .line 29
    iget-wide p0, p0, Ll71;->a:J

    .line 30
    .line 31
    const-wide v0, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr p0, v0

    .line 37
    long-to-int p0, p0

    .line 38
    return p0

    .line 39
    :cond_0
    iget p0, p0, Lc4;->x:I

    .line 40
    .line 41
    return p0
.end method

.method public final j(Lxz0;)I
    .locals 2

    .line 1
    iget-object p1, p1, Lxz0;->d:Lsz0;

    .line 2
    .line 3
    sget-object v0, Lb01;->a:Le01;

    .line 4
    .line 5
    iget-object v1, p1, Lsz0;->d:Ljh0;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lb01;->F:Le01;

    .line 14
    .line 15
    iget-object v1, p1, Lsz0;->d:Ljh0;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lsz0;->c(Le01;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ll71;

    .line 28
    .line 29
    iget-wide p0, p0, Ll71;->a:J

    .line 30
    .line 31
    const/16 v0, 0x20

    .line 32
    .line 33
    shr-long/2addr p0, v0

    .line 34
    long-to-int p0, p0

    .line 35
    return p0

    .line 36
    :cond_0
    iget p0, p0, Lc4;->x:I

    .line 37
    .line 38
    return p0
.end method

.method public final k()Lu20;
    .locals 7

    .line 1
    iget-boolean v0, p0, Lc4;->B:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lc4;->B:Z

    .line 7
    .line 8
    iget-object v0, p0, Lc4;->g:Lw3;

    .line 9
    .line 10
    invoke-virtual {v0}, Lw3;->getSemanticsOwner()La01;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Lp3;->f:Lp3;

    .line 15
    .line 16
    invoke-static {v1, v2}, Li4;->r(La01;Lsw;)Lug0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iput-object v1, p0, Lc4;->D:Lug0;

    .line 21
    .line 22
    invoke-virtual {p0}, Lc4;->n()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Lc4;->D:Lug0;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v2, p0, Lc4;->F:Lsg0;

    .line 39
    .line 40
    invoke-virtual {v2}, Lsg0;->a()V

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, Lc4;->G:Lsg0;

    .line 44
    .line 45
    invoke-virtual {v3}, Lsg0;->a()V

    .line 46
    .line 47
    .line 48
    const/4 v4, -0x1

    .line 49
    invoke-virtual {v1, v4}, Lu20;->b(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Lzz0;

    .line 54
    .line 55
    if-eqz v4, :cond_0

    .line 56
    .line 57
    iget-object v4, v4, Lzz0;->a:Lxz0;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/4 v4, 0x0

    .line 61
    :goto_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v5, Ls2;

    .line 65
    .line 66
    const/4 v6, 0x3

    .line 67
    invoke-direct {v5, v6, v1}, Ls2;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance v1, Ls2;

    .line 71
    .line 72
    const/4 v6, 0x4

    .line 73
    invoke-direct {v1, v6, v0}, Ls2;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v4}, Lo30;->v(Ljava/lang/Object;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v4, v5, v1, v0}, Lh01;->b(Lxz0;Ls2;Ls2;Ljava/util/List;)Ljava/util/ArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    const/4 v4, 0x1

    .line 89
    sub-int/2addr v1, v4

    .line 90
    if-gt v4, v1, :cond_1

    .line 91
    .line 92
    :goto_1
    add-int/lit8 v5, v4, -0x1

    .line 93
    .line 94
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Lxz0;

    .line 99
    .line 100
    iget v5, v5, Lxz0;->g:I

    .line 101
    .line 102
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    check-cast v6, Lxz0;

    .line 107
    .line 108
    iget v6, v6, Lxz0;->g:I

    .line 109
    .line 110
    invoke-virtual {v2, v5, v6}, Lsg0;->f(II)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v6, v5}, Lsg0;->f(II)V

    .line 114
    .line 115
    .line 116
    if-eq v4, v1, :cond_1

    .line 117
    .line 118
    add-int/lit8 v4, v4, 0x1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    iget-object p0, p0, Lc4;->D:Lug0;

    .line 122
    .line 123
    return-object p0
.end method

.method public final m(Lxz0;Landroid/graphics/Rect;Lx01;)Lst0;
    .locals 9

    .line 1
    new-instance v0, La4;

    .line 2
    .line 3
    invoke-direct {v0, p3}, La4;-><init>(Lx01;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lxz0;->c:Lb60;

    .line 7
    .line 8
    iget-object p3, p1, Lb60;->I:Lmj0;

    .line 9
    .line 10
    iget-object p3, p3, Lmj0;->f:Loe0;

    .line 11
    .line 12
    iget v1, p3, Loe0;->g:I

    .line 13
    .line 14
    and-int/lit8 v1, v1, 0x8

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v1, :cond_8

    .line 20
    .line 21
    :goto_0
    if-eqz p3, :cond_8

    .line 22
    .line 23
    iget v1, p3, Loe0;->f:I

    .line 24
    .line 25
    and-int/lit8 v1, v1, 0x8

    .line 26
    .line 27
    if-eqz v1, :cond_7

    .line 28
    .line 29
    move-object v1, p3

    .line 30
    move-object v5, v4

    .line 31
    :goto_1
    if-eqz v1, :cond_7

    .line 32
    .line 33
    instance-of v6, v1, Lvz0;

    .line 34
    .line 35
    if-eqz v6, :cond_0

    .line 36
    .line 37
    move-object v6, v1

    .line 38
    check-cast v6, Lvz0;

    .line 39
    .line 40
    invoke-interface {v6, v0}, Lvz0;->S(Lf01;)V

    .line 41
    .line 42
    .line 43
    iget-boolean v6, v0, La4;->d:Z

    .line 44
    .line 45
    if-eqz v6, :cond_6

    .line 46
    .line 47
    move-object v4, v1

    .line 48
    goto :goto_4

    .line 49
    :cond_0
    iget v6, v1, Loe0;->f:I

    .line 50
    .line 51
    and-int/lit8 v6, v6, 0x8

    .line 52
    .line 53
    if-eqz v6, :cond_6

    .line 54
    .line 55
    instance-of v6, v1, Lsm;

    .line 56
    .line 57
    if-eqz v6, :cond_6

    .line 58
    .line 59
    move-object v6, v1

    .line 60
    check-cast v6, Lsm;

    .line 61
    .line 62
    iget-object v6, v6, Lsm;->s:Loe0;

    .line 63
    .line 64
    move v7, v3

    .line 65
    :goto_2
    if-eqz v6, :cond_5

    .line 66
    .line 67
    iget v8, v6, Loe0;->f:I

    .line 68
    .line 69
    and-int/lit8 v8, v8, 0x8

    .line 70
    .line 71
    if-eqz v8, :cond_4

    .line 72
    .line 73
    add-int/lit8 v7, v7, 0x1

    .line 74
    .line 75
    if-ne v7, v2, :cond_1

    .line 76
    .line 77
    move-object v1, v6

    .line 78
    goto :goto_3

    .line 79
    :cond_1
    if-nez v5, :cond_2

    .line 80
    .line 81
    new-instance v5, Lsh0;

    .line 82
    .line 83
    const/16 v8, 0x10

    .line 84
    .line 85
    new-array v8, v8, [Loe0;

    .line 86
    .line 87
    invoke-direct {v5, v8}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    if-eqz v1, :cond_3

    .line 91
    .line 92
    invoke-virtual {v5, v1}, Lsh0;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    move-object v1, v4

    .line 96
    :cond_3
    invoke-virtual {v5, v6}, Lsh0;->b(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_4
    :goto_3
    iget-object v6, v6, Loe0;->i:Loe0;

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_5
    if-ne v7, v2, :cond_6

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_6
    invoke-static {v5}, Lpf1;->f(Lsh0;)Loe0;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    goto :goto_1

    .line 110
    :cond_7
    iget v1, p3, Loe0;->g:I

    .line 111
    .line 112
    and-int/lit8 v1, v1, 0x8

    .line 113
    .line 114
    if-eqz v1, :cond_8

    .line 115
    .line 116
    iget-object p3, p3, Loe0;->i:Loe0;

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_8
    :goto_4
    check-cast v4, Lvz0;

    .line 120
    .line 121
    if-eqz v4, :cond_9

    .line 122
    .line 123
    move-object p3, v4

    .line 124
    check-cast p3, Loe0;

    .line 125
    .line 126
    iget-object p3, p3, Loe0;->d:Loe0;

    .line 127
    .line 128
    iget-boolean p3, p3, Loe0;->q:Z

    .line 129
    .line 130
    if-ne p3, v2, :cond_9

    .line 131
    .line 132
    invoke-static {v4}, Lpf1;->P(Lrm;)Lqj0;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-static {p1}, Lj50;->l(Li50;)Li50;

    .line 137
    .line 138
    .line 139
    move-result-object p3

    .line 140
    invoke-interface {p3, p1, v2}, Li50;->B(Li50;Z)Lst0;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iget p3, p1, Lst0;->a:F

    .line 145
    .line 146
    iget v0, p1, Lst0;->b:F

    .line 147
    .line 148
    iget v1, p1, Lst0;->c:F

    .line 149
    .line 150
    iget p1, p1, Lst0;->d:F

    .line 151
    .line 152
    invoke-virtual {p0, p3, v0, v1, p1}, Lc4;->E(FFFF)Landroid/graphics/Rect;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    iget p1, p0, Landroid/graphics/Rect;->left:I

    .line 157
    .line 158
    iget p3, p2, Landroid/graphics/Rect;->left:I

    .line 159
    .line 160
    sub-int/2addr p1, p3

    .line 161
    int-to-float p1, p1

    .line 162
    iget p3, p0, Landroid/graphics/Rect;->top:I

    .line 163
    .line 164
    iget p2, p2, Landroid/graphics/Rect;->top:I

    .line 165
    .line 166
    sub-int/2addr p3, p2

    .line 167
    int-to-float p2, p3

    .line 168
    new-instance p3, Lst0;

    .line 169
    .line 170
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    int-to-float v0, v0

    .line 175
    add-float/2addr v0, p1

    .line 176
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    int-to-float p0, p0

    .line 181
    add-float/2addr p0, p2

    .line 182
    invoke-direct {p3, p1, p2, v0, p0}, Lst0;-><init>(FFFF)V

    .line 183
    .line 184
    .line 185
    return-object p3

    .line 186
    :cond_9
    iget-object p0, p1, Lb60;->I:Lmj0;

    .line 187
    .line 188
    iget-object p0, p0, Lmj0;->d:Lqj0;

    .line 189
    .line 190
    invoke-static {p0, v3}, Lj50;->h(Li50;Z)Lst0;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0
.end method

.method public final n()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc4;->j:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Lc4;->l:Ljava/util/List;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, Lc4;->l:Ljava/util/List;

    .line 19
    .line 20
    :cond_0
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public final o(Lb60;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc4;->z:Le9;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Le9;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lc4;->A:Lvb;

    .line 10
    .line 11
    sget-object p1, Lna1;->a:Lna1;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Ln01;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final onAccessibilityStateChanged(Z)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lc4;->l:Ljava/util/List;

    .line 3
    .line 4
    return-void
.end method

.method public final onTouchExplorationStateChanged(Z)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lc4;->l:Ljava/util/List;

    .line 3
    .line 4
    return-void
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc4;->j:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lc4;->l:Ljava/util/List;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc4;->m:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v0, p0, Lc4;->O:Lx3;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lc4;->j:Landroid/view/accessibility/AccessibilityManager;

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final s(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lc4;->g:Lw3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lw3;->getSemanticsOwner()La01;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, La01;->a()Lxz0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget p0, p0, Lxz0;->g:I

    .line 12
    .line 13
    if-ne p1, p0, :cond_0

    .line 14
    .line 15
    const/4 p0, -0x1

    .line 16
    return p0

    .line 17
    :cond_0
    return p1
.end method

.method public final t(Lxz0;Lyz0;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    sget-object v3, Lc30;->a:[I

    .line 8
    .line 9
    new-instance v3, Lvg0;

    .line 10
    .line 11
    invoke-direct {v3}, Lvg0;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x4

    .line 15
    invoke-static {v4, v1}, Lxz0;->j(ILxz0;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    iget-object v6, v1, Lxz0;->c:Lb60;

    .line 20
    .line 21
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    const/4 v8, 0x0

    .line 26
    move v9, v8

    .line 27
    :goto_0
    if-ge v9, v7, :cond_2

    .line 28
    .line 29
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v10

    .line 33
    check-cast v10, Lxz0;

    .line 34
    .line 35
    invoke-virtual {v0}, Lc4;->k()Lu20;

    .line 36
    .line 37
    .line 38
    move-result-object v11

    .line 39
    iget v10, v10, Lxz0;->g:I

    .line 40
    .line 41
    invoke-virtual {v11, v10}, Lu20;->a(I)Z

    .line 42
    .line 43
    .line 44
    move-result v11

    .line 45
    if-eqz v11, :cond_1

    .line 46
    .line 47
    iget-object v11, v2, Lyz0;->b:Lvg0;

    .line 48
    .line 49
    invoke-virtual {v11, v10}, Lvg0;->b(I)Z

    .line 50
    .line 51
    .line 52
    move-result v11

    .line 53
    if-nez v11, :cond_0

    .line 54
    .line 55
    invoke-virtual {v0, v6}, Lc4;->o(Lb60;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    invoke-virtual {v3, v10}, Lvg0;->a(I)Z

    .line 60
    .line 61
    .line 62
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    iget-object v2, v2, Lyz0;->b:Lvg0;

    .line 66
    .line 67
    iget-object v5, v2, Lvg0;->b:[I

    .line 68
    .line 69
    iget-object v2, v2, Lvg0;->a:[J

    .line 70
    .line 71
    array-length v7, v2

    .line 72
    add-int/lit8 v7, v7, -0x2

    .line 73
    .line 74
    if-ltz v7, :cond_6

    .line 75
    .line 76
    move v9, v8

    .line 77
    :goto_1
    aget-wide v10, v2, v9

    .line 78
    .line 79
    not-long v12, v10

    .line 80
    const/4 v14, 0x7

    .line 81
    shl-long/2addr v12, v14

    .line 82
    and-long/2addr v12, v10

    .line 83
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    and-long/2addr v12, v14

    .line 89
    cmp-long v12, v12, v14

    .line 90
    .line 91
    if-eqz v12, :cond_5

    .line 92
    .line 93
    sub-int v12, v9, v7

    .line 94
    .line 95
    not-int v12, v12

    .line 96
    ushr-int/lit8 v12, v12, 0x1f

    .line 97
    .line 98
    const/16 v13, 0x8

    .line 99
    .line 100
    rsub-int/lit8 v12, v12, 0x8

    .line 101
    .line 102
    move v14, v8

    .line 103
    :goto_2
    if-ge v14, v12, :cond_4

    .line 104
    .line 105
    const-wide/16 v15, 0xff

    .line 106
    .line 107
    and-long/2addr v15, v10

    .line 108
    const-wide/16 v17, 0x80

    .line 109
    .line 110
    cmp-long v15, v15, v17

    .line 111
    .line 112
    if-gez v15, :cond_3

    .line 113
    .line 114
    shl-int/lit8 v15, v9, 0x3

    .line 115
    .line 116
    add-int/2addr v15, v14

    .line 117
    aget v15, v5, v15

    .line 118
    .line 119
    invoke-virtual {v3, v15}, Lvg0;->b(I)Z

    .line 120
    .line 121
    .line 122
    move-result v15

    .line 123
    if-nez v15, :cond_3

    .line 124
    .line 125
    invoke-virtual {v0, v6}, Lc4;->o(Lb60;)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_3
    shr-long/2addr v10, v13

    .line 130
    add-int/lit8 v14, v14, 0x1

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    if-ne v12, v13, :cond_6

    .line 134
    .line 135
    :cond_5
    if-eq v9, v7, :cond_6

    .line 136
    .line 137
    add-int/lit8 v9, v9, 0x1

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_6
    invoke-static {v4, v1}, Lxz0;->j(ILxz0;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    :goto_3
    if-ge v8, v2, :cond_8

    .line 149
    .line 150
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    check-cast v3, Lxz0;

    .line 155
    .line 156
    iget-object v4, v0, Lc4;->K:Lug0;

    .line 157
    .line 158
    iget v5, v3, Lxz0;->g:I

    .line 159
    .line 160
    invoke-virtual {v4, v5}, Lu20;->b(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    check-cast v4, Lyz0;

    .line 165
    .line 166
    if-eqz v4, :cond_7

    .line 167
    .line 168
    invoke-virtual {v0}, Lc4;->k()Lu20;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    iget v6, v3, Lxz0;->g:I

    .line 173
    .line 174
    invoke-virtual {v5, v6}, Lu20;->a(I)Z

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-eqz v5, :cond_7

    .line 179
    .line 180
    invoke-virtual {v0, v3, v4}, Lc4;->t(Lxz0;Lyz0;)V

    .line 181
    .line 182
    .line 183
    :cond_7
    add-int/lit8 v8, v8, 0x1

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_8
    return-void
.end method

.method public final u(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lc4;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v2, 0x800

    .line 14
    .line 15
    if-eq v0, v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const v2, 0x8000

    .line 22
    .line 23
    .line 24
    if-ne v0, v2, :cond_2

    .line 25
    .line 26
    :cond_1
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Lc4;->s:Z

    .line 28
    .line 29
    :cond_2
    :try_start_0
    iget-object v0, p0, Lc4;->i:Lb4;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lb4;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    iput-boolean v1, p0, Lc4;->s:Z

    .line 42
    .line 43
    return p1

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    iput-boolean v1, p0, Lc4;->s:Z

    .line 46
    .line 47
    throw p1
.end method

.method public final v(IILjava/lang/Integer;Ljava/util/List;)Z
    .locals 1

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-eq p1, v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Lc4;->n()Z

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
    invoke-virtual {p0, p1, p2}, Lc4;->g(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    if-eqz p4, :cond_2

    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    const/16 p3, 0x3e

    .line 29
    .line 30
    const-string v0, ","

    .line 31
    .line 32
    invoke-static {p4, v0, p2, p3}, Lya0;->a(Ljava/util/List;Ljava/lang/String;Lpg0;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    invoke-virtual {p0, p1}, Lc4;->u(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0

    .line 44
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 45
    return p0
.end method

.method public final x(IILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lc4;->s(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/16 v0, 0x20

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Lc4;->g(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 12
    .line 13
    .line 14
    if-eqz p3, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0, p1}, Lc4;->u(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final y(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lc4;->C:Ly3;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Ly3;->a:Lxz0;

    .line 6
    .line 7
    iget v2, v1, Lxz0;->g:I

    .line 8
    .line 9
    if-eq p1, v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iget-wide v4, v0, Ly3;->f:J

    .line 17
    .line 18
    sub-long/2addr v2, v4

    .line 19
    const-wide/16 v4, 0x3e8

    .line 20
    .line 21
    cmp-long p1, v2, v4

    .line 22
    .line 23
    if-gtz p1, :cond_1

    .line 24
    .line 25
    iget p1, v1, Lxz0;->g:I

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lc4;->s(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/high16 v2, 0x20000

    .line 32
    .line 33
    invoke-virtual {p0, p1, v2}, Lc4;->g(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget v2, v0, Ly3;->d:I

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 40
    .line 41
    .line 42
    iget v2, v0, Ly3;->e:I

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 45
    .line 46
    .line 47
    iget v2, v0, Ly3;->b:I

    .line 48
    .line 49
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityEvent;->setAction(I)V

    .line 50
    .line 51
    .line 52
    iget v0, v0, Ly3;->c:I

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setMovementGranularity(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v1}, Lc4;->l(Lxz0;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lc4;->u(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 69
    .line 70
    .line 71
    :cond_1
    const/4 p1, 0x0

    .line 72
    iput-object p1, p0, Lc4;->C:Ly3;

    .line 73
    .line 74
    return-void
.end method

.method public final z(Lu20;)V
    .locals 56

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    const/16 v1, 0x40

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v7

    .line 11
    new-instance v8, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v9, v0, Lc4;->P:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 19
    .line 20
    .line 21
    iget-object v10, v6, Lu20;->b:[I

    .line 22
    .line 23
    iget-object v11, v6, Lu20;->a:[J

    .line 24
    .line 25
    array-length v1, v11

    .line 26
    const/4 v12, 0x2

    .line 27
    add-int/lit8 v13, v1, -0x2

    .line 28
    .line 29
    const/4 v14, 0x0

    .line 30
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-ltz v13, :cond_55

    .line 35
    .line 36
    move v15, v14

    .line 37
    :goto_0
    aget-wide v3, v11, v15

    .line 38
    .line 39
    move/from16 v16, v12

    .line 40
    .line 41
    move/from16 v17, v13

    .line 42
    .line 43
    not-long v12, v3

    .line 44
    const/16 v18, 0x7

    .line 45
    .line 46
    shl-long v12, v12, v18

    .line 47
    .line 48
    and-long/2addr v12, v3

    .line 49
    const-wide v19, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long v12, v12, v19

    .line 55
    .line 56
    cmp-long v1, v12, v19

    .line 57
    .line 58
    if-eqz v1, :cond_54

    .line 59
    .line 60
    sub-int v1, v15, v17

    .line 61
    .line 62
    not-int v1, v1

    .line 63
    ushr-int/lit8 v1, v1, 0x1f

    .line 64
    .line 65
    const/16 v12, 0x8

    .line 66
    .line 67
    rsub-int/lit8 v13, v1, 0x8

    .line 68
    .line 69
    move-wide/from16 v21, v3

    .line 70
    .line 71
    move v1, v14

    .line 72
    :goto_1
    if-ge v1, v13, :cond_53

    .line 73
    .line 74
    const-wide/16 v23, 0xff

    .line 75
    .line 76
    and-long v3, v21, v23

    .line 77
    .line 78
    const-wide/16 v25, 0x80

    .line 79
    .line 80
    cmp-long v3, v3, v25

    .line 81
    .line 82
    if-gez v3, :cond_52

    .line 83
    .line 84
    shl-int/lit8 v3, v15, 0x3

    .line 85
    .line 86
    add-int/2addr v3, v1

    .line 87
    aget v3, v10, v3

    .line 88
    .line 89
    iget-object v4, v0, Lc4;->K:Lug0;

    .line 90
    .line 91
    invoke-virtual {v4, v3}, Lu20;->b(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, Lyz0;

    .line 96
    .line 97
    if-nez v4, :cond_0

    .line 98
    .line 99
    goto/16 :goto_2e

    .line 100
    .line 101
    :cond_0
    iget-object v4, v4, Lyz0;->a:Lsz0;

    .line 102
    .line 103
    iget-object v5, v4, Lsz0;->d:Ljh0;

    .line 104
    .line 105
    invoke-virtual {v6, v3}, Lu20;->b(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v27

    .line 109
    move-object/from16 v14, v27

    .line 110
    .line 111
    check-cast v14, Lzz0;

    .line 112
    .line 113
    move/from16 v27, v12

    .line 114
    .line 115
    if-eqz v14, :cond_1

    .line 116
    .line 117
    iget-object v14, v14, Lzz0;->a:Lxz0;

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_1
    const/4 v14, 0x0

    .line 121
    :goto_2
    if-eqz v14, :cond_51

    .line 122
    .line 123
    iget-object v12, v14, Lxz0;->c:Lb60;

    .line 124
    .line 125
    iget-object v6, v14, Lxz0;->d:Lsz0;

    .line 126
    .line 127
    move-object/from16 v29, v10

    .line 128
    .line 129
    iget v10, v14, Lxz0;->g:I

    .line 130
    .line 131
    move-object/from16 v30, v11

    .line 132
    .line 133
    iget-object v11, v6, Lsz0;->d:Ljh0;

    .line 134
    .line 135
    move/from16 v31, v15

    .line 136
    .line 137
    iget-object v15, v11, Ljh0;->b:[Ljava/lang/Object;

    .line 138
    .line 139
    move-object/from16 v32, v15

    .line 140
    .line 141
    iget-object v15, v11, Ljh0;->c:[Ljava/lang/Object;

    .line 142
    .line 143
    move-object/from16 v33, v15

    .line 144
    .line 145
    iget-object v15, v11, Ljh0;->a:[J

    .line 146
    .line 147
    move/from16 v34, v1

    .line 148
    .line 149
    array-length v1, v15

    .line 150
    add-int/lit8 v1, v1, -0x2

    .line 151
    .line 152
    move-object/from16 v35, v15

    .line 153
    .line 154
    if-ltz v1, :cond_4b

    .line 155
    .line 156
    move-object/from16 v40, v12

    .line 157
    .line 158
    move/from16 v39, v13

    .line 159
    .line 160
    const/4 v15, 0x0

    .line 161
    const/16 v38, 0x0

    .line 162
    .line 163
    :goto_3
    aget-wide v12, v35, v15

    .line 164
    .line 165
    move-object/from16 v41, v14

    .line 166
    .line 167
    move/from16 v42, v15

    .line 168
    .line 169
    not-long v14, v12

    .line 170
    shl-long v14, v14, v18

    .line 171
    .line 172
    and-long/2addr v14, v12

    .line 173
    and-long v14, v14, v19

    .line 174
    .line 175
    cmp-long v14, v14, v19

    .line 176
    .line 177
    if-eqz v14, :cond_4a

    .line 178
    .line 179
    sub-int v15, v42, v1

    .line 180
    .line 181
    not-int v14, v15

    .line 182
    ushr-int/lit8 v14, v14, 0x1f

    .line 183
    .line 184
    rsub-int/lit8 v14, v14, 0x8

    .line 185
    .line 186
    const/4 v15, 0x0

    .line 187
    :goto_4
    if-ge v15, v14, :cond_49

    .line 188
    .line 189
    and-long v43, v12, v23

    .line 190
    .line 191
    cmp-long v43, v43, v25

    .line 192
    .line 193
    if-gez v43, :cond_48

    .line 194
    .line 195
    shl-int/lit8 v43, v42, 0x3

    .line 196
    .line 197
    add-int v43, v43, v15

    .line 198
    .line 199
    aget-object v44, v32, v43

    .line 200
    .line 201
    move/from16 v45, v1

    .line 202
    .line 203
    aget-object v1, v33, v43

    .line 204
    .line 205
    move-object/from16 v43, v4

    .line 206
    .line 207
    move-object/from16 v4, v44

    .line 208
    .line 209
    check-cast v4, Le01;

    .line 210
    .line 211
    move-wide/from16 v46, v12

    .line 212
    .line 213
    sget-object v12, Lb01;->u:Le01;

    .line 214
    .line 215
    invoke-static {v4, v12}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v13

    .line 219
    if-nez v13, :cond_3

    .line 220
    .line 221
    sget-object v13, Lb01;->v:Le01;

    .line 222
    .line 223
    invoke-static {v4, v13}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v13

    .line 227
    if-eqz v13, :cond_2

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_2
    move/from16 v44, v15

    .line 231
    .line 232
    const/4 v15, 0x0

    .line 233
    goto :goto_9

    .line 234
    :cond_3
    :goto_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 235
    .line 236
    .line 237
    move-result v13

    .line 238
    move/from16 v44, v15

    .line 239
    .line 240
    const/4 v15, 0x0

    .line 241
    :goto_6
    if-ge v15, v13, :cond_5

    .line 242
    .line 243
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v48

    .line 247
    move/from16 v49, v13

    .line 248
    .line 249
    move-object/from16 v13, v48

    .line 250
    .line 251
    check-cast v13, Lmy0;

    .line 252
    .line 253
    iget v13, v13, Lmy0;->d:I

    .line 254
    .line 255
    if-ne v13, v3, :cond_4

    .line 256
    .line 257
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v13

    .line 261
    check-cast v13, Lmy0;

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_4
    add-int/lit8 v15, v15, 0x1

    .line 265
    .line 266
    move/from16 v13, v49

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_5
    const/4 v13, 0x0

    .line 270
    :goto_7
    if-eqz v13, :cond_6

    .line 271
    .line 272
    const/4 v15, 0x0

    .line 273
    goto :goto_8

    .line 274
    :cond_6
    new-instance v13, Lmy0;

    .line 275
    .line 276
    invoke-direct {v13, v3, v9}, Lmy0;-><init>(ILjava/util/ArrayList;)V

    .line 277
    .line 278
    .line 279
    const/4 v15, 0x1

    .line 280
    :goto_8
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    :goto_9
    if-nez v15, :cond_8

    .line 284
    .line 285
    invoke-virtual {v5, v4}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v13

    .line 289
    if-nez v13, :cond_7

    .line 290
    .line 291
    const/4 v13, 0x0

    .line 292
    :cond_7
    invoke-static {v1, v13}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v13

    .line 296
    if-eqz v13, :cond_8

    .line 297
    .line 298
    move v13, v3

    .line 299
    move-object/from16 v48, v8

    .line 300
    .line 301
    move/from16 v28, v14

    .line 302
    .line 303
    move/from16 v12, v16

    .line 304
    .line 305
    move/from16 v3, v27

    .line 306
    .line 307
    goto/16 :goto_b

    .line 308
    .line 309
    :cond_8
    sget-object v13, Lb01;->d:Le01;

    .line 310
    .line 311
    invoke-static {v4, v13}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v15

    .line 315
    if-eqz v15, :cond_a

    .line 316
    .line 317
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    check-cast v1, Ljava/lang/String;

    .line 321
    .line 322
    invoke-virtual {v5, v13}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    if-eqz v4, :cond_9

    .line 327
    .line 328
    move/from16 v4, v27

    .line 329
    .line 330
    invoke-virtual {v0, v3, v4, v1}, Lc4;->x(IILjava/lang/String;)V

    .line 331
    .line 332
    .line 333
    :cond_9
    move v13, v3

    .line 334
    move-object/from16 v48, v8

    .line 335
    .line 336
    move/from16 v28, v14

    .line 337
    .line 338
    move/from16 v12, v16

    .line 339
    .line 340
    move-object/from16 v15, v40

    .line 341
    .line 342
    const/16 v3, 0x8

    .line 343
    .line 344
    :goto_a
    const/16 v37, 0x1

    .line 345
    .line 346
    move-object v8, v2

    .line 347
    move-object v14, v5

    .line 348
    move/from16 v2, v45

    .line 349
    .line 350
    goto/16 :goto_2a

    .line 351
    .line 352
    :cond_a
    sget-object v13, Lb01;->b:Le01;

    .line 353
    .line 354
    invoke-static {v4, v13}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v13

    .line 358
    if-nez v13, :cond_b

    .line 359
    .line 360
    sget-object v13, Lb01;->H:Le01;

    .line 361
    .line 362
    invoke-static {v4, v13}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v13

    .line 366
    if-eqz v13, :cond_c

    .line 367
    .line 368
    :cond_b
    move v13, v3

    .line 369
    move-object/from16 v48, v8

    .line 370
    .line 371
    move/from16 v28, v14

    .line 372
    .line 373
    move/from16 v12, v16

    .line 374
    .line 375
    move-object/from16 v15, v40

    .line 376
    .line 377
    const/16 v37, 0x1

    .line 378
    .line 379
    move-object v8, v2

    .line 380
    move-object v14, v5

    .line 381
    move/from16 v2, v45

    .line 382
    .line 383
    goto/16 :goto_29

    .line 384
    .line 385
    :cond_c
    sget-object v13, Lb01;->c:Le01;

    .line 386
    .line 387
    invoke-static {v4, v13}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v13

    .line 391
    if-eqz v13, :cond_d

    .line 392
    .line 393
    invoke-virtual {v0, v3}, Lc4;->s(I)I

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    const/16 v4, 0x800

    .line 398
    .line 399
    const/16 v12, 0x8

    .line 400
    .line 401
    invoke-static {v0, v1, v4, v7, v12}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0, v3}, Lc4;->s(I)I

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    invoke-static {v0, v1, v4, v2, v12}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 409
    .line 410
    .line 411
    move v13, v3

    .line 412
    move-object/from16 v48, v8

    .line 413
    .line 414
    move v3, v12

    .line 415
    move/from16 v28, v14

    .line 416
    .line 417
    move/from16 v12, v16

    .line 418
    .line 419
    :goto_b
    move-object/from16 v15, v40

    .line 420
    .line 421
    goto :goto_a

    .line 422
    :cond_d
    sget-object v13, Lb01;->G:Le01;

    .line 423
    .line 424
    invoke-static {v4, v13}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v15

    .line 428
    move-object/from16 v48, v8

    .line 429
    .line 430
    const/4 v8, 0x4

    .line 431
    if-eqz v15, :cond_19

    .line 432
    .line 433
    sget-object v1, Lb01;->x:Le01;

    .line 434
    .line 435
    invoke-virtual {v11, v1}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    if-nez v1, :cond_e

    .line 440
    .line 441
    const/4 v1, 0x0

    .line 442
    :cond_e
    check-cast v1, Lxv0;

    .line 443
    .line 444
    if-nez v1, :cond_10

    .line 445
    .line 446
    :cond_f
    move/from16 v28, v14

    .line 447
    .line 448
    move-object/from16 v15, v40

    .line 449
    .line 450
    const/16 v4, 0x8

    .line 451
    .line 452
    const/4 v12, 0x0

    .line 453
    const/16 v13, 0x800

    .line 454
    .line 455
    goto/16 :goto_d

    .line 456
    .line 457
    :cond_10
    iget v1, v1, Lxv0;->a:I

    .line 458
    .line 459
    if-ne v1, v8, :cond_f

    .line 460
    .line 461
    invoke-virtual {v11, v13}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    if-nez v1, :cond_11

    .line 466
    .line 467
    const/4 v1, 0x0

    .line 468
    :cond_11
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 469
    .line 470
    invoke-static {v1, v4}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    if-eqz v1, :cond_18

    .line 475
    .line 476
    invoke-virtual {v0, v3}, Lc4;->s(I)I

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    invoke-virtual {v0, v1, v8}, Lc4;->g(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    new-instance v4, Lxz0;

    .line 485
    .line 486
    move-object/from16 v13, v41

    .line 487
    .line 488
    iget-object v8, v13, Lxz0;->a:Loe0;

    .line 489
    .line 490
    move-object/from16 v15, v40

    .line 491
    .line 492
    const/4 v12, 0x1

    .line 493
    invoke-direct {v4, v8, v12, v15, v6}, Lxz0;-><init>(Loe0;ZLb60;Lsz0;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v4}, Lxz0;->k()Lsz0;

    .line 497
    .line 498
    .line 499
    move-result-object v8

    .line 500
    sget-object v12, Lb01;->a:Le01;

    .line 501
    .line 502
    iget-object v8, v8, Lsz0;->d:Ljh0;

    .line 503
    .line 504
    invoke-virtual {v8, v12}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v8

    .line 508
    if-nez v8, :cond_12

    .line 509
    .line 510
    const/4 v8, 0x0

    .line 511
    :cond_12
    check-cast v8, Ljava/util/List;

    .line 512
    .line 513
    const/16 v12, 0x3e

    .line 514
    .line 515
    move-object/from16 v40, v4

    .line 516
    .line 517
    const-string v4, ","

    .line 518
    .line 519
    move-object/from16 v41, v13

    .line 520
    .line 521
    const/4 v13, 0x0

    .line 522
    if-eqz v8, :cond_13

    .line 523
    .line 524
    invoke-static {v8, v4, v13, v12}, Lya0;->a(Ljava/util/List;Ljava/lang/String;Lpg0;I)Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v8

    .line 528
    move-object v13, v8

    .line 529
    :cond_13
    invoke-virtual/range {v40 .. v40}, Lxz0;->k()Lsz0;

    .line 530
    .line 531
    .line 532
    move-result-object v8

    .line 533
    sget-object v12, Lb01;->A:Le01;

    .line 534
    .line 535
    iget-object v8, v8, Lsz0;->d:Ljh0;

    .line 536
    .line 537
    invoke-virtual {v8, v12}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v8

    .line 541
    if-nez v8, :cond_14

    .line 542
    .line 543
    const/4 v8, 0x0

    .line 544
    :cond_14
    check-cast v8, Ljava/util/List;

    .line 545
    .line 546
    move/from16 v28, v14

    .line 547
    .line 548
    const/4 v12, 0x0

    .line 549
    if-eqz v8, :cond_15

    .line 550
    .line 551
    const/16 v14, 0x3e

    .line 552
    .line 553
    invoke-static {v8, v4, v12, v14}, Lya0;->a(Ljava/util/List;Ljava/lang/String;Lpg0;I)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v4

    .line 557
    goto :goto_c

    .line 558
    :cond_15
    move-object v4, v12

    .line 559
    :goto_c
    if-eqz v13, :cond_16

    .line 560
    .line 561
    invoke-virtual {v1, v13}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 562
    .line 563
    .line 564
    :cond_16
    if-eqz v4, :cond_17

    .line 565
    .line 566
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 567
    .line 568
    .line 569
    move-result-object v8

    .line 570
    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    :cond_17
    invoke-virtual {v0, v1}, Lc4;->u(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 574
    .line 575
    .line 576
    const/16 v13, 0x800

    .line 577
    .line 578
    goto :goto_e

    .line 579
    :cond_18
    move/from16 v28, v14

    .line 580
    .line 581
    move-object/from16 v15, v40

    .line 582
    .line 583
    const/4 v12, 0x0

    .line 584
    invoke-virtual {v0, v3}, Lc4;->s(I)I

    .line 585
    .line 586
    .line 587
    move-result v1

    .line 588
    const/16 v4, 0x8

    .line 589
    .line 590
    const/16 v13, 0x800

    .line 591
    .line 592
    invoke-static {v0, v1, v13, v2, v4}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 593
    .line 594
    .line 595
    goto :goto_e

    .line 596
    :goto_d
    invoke-virtual {v0, v3}, Lc4;->s(I)I

    .line 597
    .line 598
    .line 599
    move-result v1

    .line 600
    invoke-static {v0, v1, v13, v7, v4}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v0, v3}, Lc4;->s(I)I

    .line 604
    .line 605
    .line 606
    move-result v1

    .line 607
    invoke-static {v0, v1, v13, v2, v4}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 608
    .line 609
    .line 610
    :goto_e
    move-object v8, v2

    .line 611
    move v13, v3

    .line 612
    move-object v14, v5

    .line 613
    move/from16 v12, v16

    .line 614
    .line 615
    move/from16 v2, v45

    .line 616
    .line 617
    const/16 v3, 0x8

    .line 618
    .line 619
    const/16 v37, 0x1

    .line 620
    .line 621
    goto/16 :goto_2a

    .line 622
    .line 623
    :cond_19
    move/from16 v36, v8

    .line 624
    .line 625
    move/from16 v28, v14

    .line 626
    .line 627
    move-object/from16 v15, v40

    .line 628
    .line 629
    const/16 v13, 0x800

    .line 630
    .line 631
    const/4 v14, 0x0

    .line 632
    const/16 v37, 0x1

    .line 633
    .line 634
    sget-object v8, Lb01;->a:Le01;

    .line 635
    .line 636
    invoke-static {v4, v8}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    move-result v8

    .line 640
    if-eqz v8, :cond_1a

    .line 641
    .line 642
    invoke-virtual {v0, v3}, Lc4;->s(I)I

    .line 643
    .line 644
    .line 645
    move-result v4

    .line 646
    invoke-static/range {v36 .. v36}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 647
    .line 648
    .line 649
    move-result-object v8

    .line 650
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    check-cast v1, Ljava/util/List;

    .line 654
    .line 655
    invoke-virtual {v0, v4, v13, v8, v1}, Lc4;->v(IILjava/lang/Integer;Ljava/util/List;)Z

    .line 656
    .line 657
    .line 658
    move-object v8, v2

    .line 659
    move v13, v3

    .line 660
    move-object v14, v5

    .line 661
    :goto_f
    move/from16 v12, v16

    .line 662
    .line 663
    move/from16 v2, v45

    .line 664
    .line 665
    :goto_10
    const/16 v3, 0x8

    .line 666
    .line 667
    goto/16 :goto_2a

    .line 668
    .line 669
    :cond_1a
    sget-object v8, Lb01;->E:Le01;

    .line 670
    .line 671
    invoke-static {v4, v8}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    move-result v13

    .line 675
    const-wide v49, 0xffffffffL

    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    const/16 v40, 0x20

    .line 681
    .line 682
    const-string v51, ""

    .line 683
    .line 684
    if-eqz v13, :cond_2b

    .line 685
    .line 686
    sget-object v1, Lrz0;->k:Le01;

    .line 687
    .line 688
    invoke-virtual {v11, v1}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    move-result v1

    .line 692
    if-eqz v1, :cond_2a

    .line 693
    .line 694
    invoke-virtual {v5, v8}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v13

    .line 698
    if-nez v13, :cond_1b

    .line 699
    .line 700
    move-object v13, v14

    .line 701
    :cond_1b
    check-cast v13, Lf8;

    .line 702
    .line 703
    if-eqz v13, :cond_1c

    .line 704
    .line 705
    goto :goto_11

    .line 706
    :cond_1c
    move-object/from16 v13, v51

    .line 707
    .line 708
    :goto_11
    invoke-virtual {v11, v8}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    if-nez v1, :cond_1d

    .line 713
    .line 714
    move-object v1, v14

    .line 715
    :cond_1d
    check-cast v1, Lf8;

    .line 716
    .line 717
    if-eqz v1, :cond_1e

    .line 718
    .line 719
    goto :goto_12

    .line 720
    :cond_1e
    move-object/from16 v1, v51

    .line 721
    .line 722
    :goto_12
    invoke-static {v1}, Lc4;->H(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 723
    .line 724
    .line 725
    move-result-object v4

    .line 726
    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    .line 727
    .line 728
    .line 729
    move-result v8

    .line 730
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 731
    .line 732
    .line 733
    move-result v12

    .line 734
    if-le v8, v12, :cond_1f

    .line 735
    .line 736
    move v14, v12

    .line 737
    goto :goto_13

    .line 738
    :cond_1f
    move v14, v8

    .line 739
    :goto_13
    move-object/from16 v52, v2

    .line 740
    .line 741
    const/4 v2, 0x0

    .line 742
    :goto_14
    move/from16 v51, v8

    .line 743
    .line 744
    if-ge v2, v14, :cond_21

    .line 745
    .line 746
    invoke-interface {v13, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 747
    .line 748
    .line 749
    move-result v8

    .line 750
    move/from16 v53, v12

    .line 751
    .line 752
    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 753
    .line 754
    .line 755
    move-result v12

    .line 756
    if-eq v8, v12, :cond_20

    .line 757
    .line 758
    goto :goto_15

    .line 759
    :cond_20
    add-int/lit8 v2, v2, 0x1

    .line 760
    .line 761
    move/from16 v8, v51

    .line 762
    .line 763
    move/from16 v12, v53

    .line 764
    .line 765
    goto :goto_14

    .line 766
    :cond_21
    move/from16 v53, v12

    .line 767
    .line 768
    :goto_15
    const/4 v8, 0x0

    .line 769
    :goto_16
    sub-int v12, v14, v2

    .line 770
    .line 771
    if-ge v8, v12, :cond_23

    .line 772
    .line 773
    add-int/lit8 v12, v51, -0x1

    .line 774
    .line 775
    sub-int/2addr v12, v8

    .line 776
    invoke-interface {v13, v12}, Ljava/lang/CharSequence;->charAt(I)C

    .line 777
    .line 778
    .line 779
    move-result v12

    .line 780
    add-int/lit8 v54, v53, -0x1

    .line 781
    .line 782
    move/from16 v55, v8

    .line 783
    .line 784
    sub-int v8, v54, v55

    .line 785
    .line 786
    invoke-interface {v1, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 787
    .line 788
    .line 789
    move-result v8

    .line 790
    if-eq v12, v8, :cond_22

    .line 791
    .line 792
    goto :goto_17

    .line 793
    :cond_22
    add-int/lit8 v8, v55, 0x1

    .line 794
    .line 795
    goto :goto_16

    .line 796
    :cond_23
    move/from16 v55, v8

    .line 797
    .line 798
    :goto_17
    sub-int v8, v51, v55

    .line 799
    .line 800
    sub-int/2addr v8, v2

    .line 801
    sub-int v12, v53, v55

    .line 802
    .line 803
    sub-int/2addr v12, v2

    .line 804
    sget-object v1, Lb01;->I:Le01;

    .line 805
    .line 806
    invoke-virtual {v5, v1}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 807
    .line 808
    .line 809
    move-result v14

    .line 810
    invoke-virtual {v11, v1}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 811
    .line 812
    .line 813
    move-result v1

    .line 814
    move/from16 v51, v1

    .line 815
    .line 816
    sget-object v1, Lb01;->E:Le01;

    .line 817
    .line 818
    invoke-virtual {v5, v1}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    move-result v1

    .line 822
    if-eqz v1, :cond_24

    .line 823
    .line 824
    if-nez v14, :cond_24

    .line 825
    .line 826
    if-eqz v51, :cond_24

    .line 827
    .line 828
    move/from16 v54, v37

    .line 829
    .line 830
    goto :goto_18

    .line 831
    :cond_24
    const/16 v54, 0x0

    .line 832
    .line 833
    :goto_18
    if-eqz v1, :cond_25

    .line 834
    .line 835
    if-eqz v14, :cond_25

    .line 836
    .line 837
    if-nez v51, :cond_25

    .line 838
    .line 839
    move/from16 v14, v37

    .line 840
    .line 841
    goto :goto_19

    .line 842
    :cond_25
    const/4 v14, 0x0

    .line 843
    :goto_19
    if-nez v54, :cond_26

    .line 844
    .line 845
    if-eqz v14, :cond_27

    .line 846
    .line 847
    :cond_26
    move-object/from16 v55, v5

    .line 848
    .line 849
    goto :goto_1a

    .line 850
    :cond_27
    invoke-virtual {v0, v3}, Lc4;->s(I)I

    .line 851
    .line 852
    .line 853
    move-result v1

    .line 854
    move-object/from16 v55, v5

    .line 855
    .line 856
    const/16 v5, 0x10

    .line 857
    .line 858
    invoke-virtual {v0, v1, v5}, Lc4;->g(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 859
    .line 860
    .line 861
    move-result-object v1

    .line 862
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {v1, v8}, Landroid/view/accessibility/AccessibilityRecord;->setRemovedCount(I)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {v1, v12}, Landroid/view/accessibility/AccessibilityRecord;->setAddedCount(I)V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v1, v13}, Landroid/view/accessibility/AccessibilityRecord;->setBeforeText(Ljava/lang/CharSequence;)V

    .line 872
    .line 873
    .line 874
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 875
    .line 876
    .line 877
    move-result-object v2

    .line 878
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 879
    .line 880
    .line 881
    move v13, v3

    .line 882
    move-object/from16 v2, v52

    .line 883
    .line 884
    goto :goto_1b

    .line 885
    :goto_1a
    invoke-virtual {v0, v3}, Lc4;->s(I)I

    .line 886
    .line 887
    .line 888
    move-result v1

    .line 889
    invoke-static/range {v53 .. v53}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 890
    .line 891
    .line 892
    move-result-object v2

    .line 893
    move v5, v3

    .line 894
    move-object/from16 v3, v52

    .line 895
    .line 896
    move v13, v5

    .line 897
    move-object v5, v4

    .line 898
    move-object v4, v2

    .line 899
    move-object/from16 v2, v52

    .line 900
    .line 901
    invoke-virtual/range {v0 .. v5}, Lc4;->h(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    .line 902
    .line 903
    .line 904
    move-result-object v1

    .line 905
    :goto_1b
    const-string v3, "android.widget.EditText"

    .line 906
    .line 907
    invoke-virtual {v1, v3}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v0, v1}, Lc4;->u(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 911
    .line 912
    .line 913
    if-nez v54, :cond_29

    .line 914
    .line 915
    if-eqz v14, :cond_28

    .line 916
    .line 917
    goto :goto_1c

    .line 918
    :cond_28
    move-object/from16 v52, v2

    .line 919
    .line 920
    goto :goto_1d

    .line 921
    :cond_29
    :goto_1c
    sget-object v3, Lb01;->F:Le01;

    .line 922
    .line 923
    invoke-virtual {v6, v3}, Lsz0;->c(Le01;)Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v3

    .line 927
    check-cast v3, Ll71;

    .line 928
    .line 929
    iget-wide v3, v3, Ll71;->a:J

    .line 930
    .line 931
    move-object/from16 v52, v2

    .line 932
    .line 933
    move-wide/from16 v53, v3

    .line 934
    .line 935
    shr-long v2, v53, v40

    .line 936
    .line 937
    long-to-int v2, v2

    .line 938
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 939
    .line 940
    .line 941
    and-long v2, v53, v49

    .line 942
    .line 943
    long-to-int v2, v2

    .line 944
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 945
    .line 946
    .line 947
    invoke-virtual {v0, v1}, Lc4;->u(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 948
    .line 949
    .line 950
    :goto_1d
    move/from16 v12, v16

    .line 951
    .line 952
    move/from16 v2, v45

    .line 953
    .line 954
    move-object/from16 v8, v52

    .line 955
    .line 956
    move-object/from16 v14, v55

    .line 957
    .line 958
    goto/16 :goto_10

    .line 959
    .line 960
    :cond_2a
    move-object/from16 v52, v2

    .line 961
    .line 962
    move v13, v3

    .line 963
    move-object/from16 v55, v5

    .line 964
    .line 965
    invoke-virtual {v0, v13}, Lc4;->s(I)I

    .line 966
    .line 967
    .line 968
    move-result v1

    .line 969
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 970
    .line 971
    .line 972
    move-result-object v2

    .line 973
    const/16 v4, 0x800

    .line 974
    .line 975
    const/16 v12, 0x8

    .line 976
    .line 977
    invoke-static {v0, v1, v4, v2, v12}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 978
    .line 979
    .line 980
    move v3, v12

    .line 981
    move/from16 v12, v16

    .line 982
    .line 983
    move/from16 v2, v45

    .line 984
    .line 985
    move-object/from16 v8, v52

    .line 986
    .line 987
    move-object/from16 v14, v55

    .line 988
    .line 989
    goto/16 :goto_2a

    .line 990
    .line 991
    :cond_2b
    move-object/from16 v52, v2

    .line 992
    .line 993
    move v13, v3

    .line 994
    move-object v14, v5

    .line 995
    sget-object v2, Lb01;->F:Le01;

    .line 996
    .line 997
    invoke-static {v4, v2}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 998
    .line 999
    .line 1000
    move-result v3

    .line 1001
    if-eqz v3, :cond_2f

    .line 1002
    .line 1003
    invoke-virtual {v11, v8}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v1

    .line 1007
    if-nez v1, :cond_2c

    .line 1008
    .line 1009
    const/4 v1, 0x0

    .line 1010
    :cond_2c
    check-cast v1, Lf8;

    .line 1011
    .line 1012
    if-eqz v1, :cond_2e

    .line 1013
    .line 1014
    iget-object v1, v1, Lf8;->e:Ljava/lang/String;

    .line 1015
    .line 1016
    if-nez v1, :cond_2d

    .line 1017
    .line 1018
    goto :goto_1e

    .line 1019
    :cond_2d
    move-object/from16 v51, v1

    .line 1020
    .line 1021
    :cond_2e
    :goto_1e
    invoke-virtual {v6, v2}, Lsz0;->c(Le01;)Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v1

    .line 1025
    check-cast v1, Ll71;

    .line 1026
    .line 1027
    iget-wide v1, v1, Ll71;->a:J

    .line 1028
    .line 1029
    move-wide v2, v1

    .line 1030
    invoke-virtual {v0, v13}, Lc4;->s(I)I

    .line 1031
    .line 1032
    .line 1033
    move-result v1

    .line 1034
    shr-long v4, v2, v40

    .line 1035
    .line 1036
    long-to-int v4, v4

    .line 1037
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v4

    .line 1041
    and-long v2, v2, v49

    .line 1042
    .line 1043
    long-to-int v2, v2

    .line 1044
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v3

    .line 1048
    invoke-virtual/range {v51 .. v51}, Ljava/lang/String;->length()I

    .line 1049
    .line 1050
    .line 1051
    move-result v2

    .line 1052
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v2

    .line 1056
    invoke-static/range {v51 .. v51}, Lc4;->H(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v5

    .line 1060
    move-object v8, v4

    .line 1061
    move-object v4, v2

    .line 1062
    move-object v2, v8

    .line 1063
    move-object/from16 v8, v52

    .line 1064
    .line 1065
    invoke-virtual/range {v0 .. v5}, Lc4;->h(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v1

    .line 1069
    invoke-virtual {v0, v1}, Lc4;->u(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 1070
    .line 1071
    .line 1072
    invoke-virtual {v0, v10}, Lc4;->y(I)V

    .line 1073
    .line 1074
    .line 1075
    goto/16 :goto_f

    .line 1076
    .line 1077
    :cond_2f
    move/from16 v2, v45

    .line 1078
    .line 1079
    move-object/from16 v8, v52

    .line 1080
    .line 1081
    invoke-static {v4, v12}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1082
    .line 1083
    .line 1084
    move-result v3

    .line 1085
    if-nez v3, :cond_30

    .line 1086
    .line 1087
    sget-object v3, Lb01;->v:Le01;

    .line 1088
    .line 1089
    invoke-static {v4, v3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1090
    .line 1091
    .line 1092
    move-result v3

    .line 1093
    if-eqz v3, :cond_31

    .line 1094
    .line 1095
    :cond_30
    const/4 v5, 0x0

    .line 1096
    goto/16 :goto_26

    .line 1097
    .line 1098
    :cond_31
    sget-object v3, Lb01;->k:Le01;

    .line 1099
    .line 1100
    invoke-static {v4, v3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1101
    .line 1102
    .line 1103
    move-result v3

    .line 1104
    if-eqz v3, :cond_33

    .line 1105
    .line 1106
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1107
    .line 1108
    .line 1109
    check-cast v1, Ljava/lang/Boolean;

    .line 1110
    .line 1111
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1112
    .line 1113
    .line 1114
    move-result v1

    .line 1115
    if-eqz v1, :cond_32

    .line 1116
    .line 1117
    invoke-virtual {v0, v10}, Lc4;->s(I)I

    .line 1118
    .line 1119
    .line 1120
    move-result v1

    .line 1121
    const/16 v4, 0x8

    .line 1122
    .line 1123
    invoke-virtual {v0, v1, v4}, Lc4;->g(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v1

    .line 1127
    invoke-virtual {v0, v1}, Lc4;->u(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 1128
    .line 1129
    .line 1130
    goto :goto_1f

    .line 1131
    :cond_32
    const/16 v4, 0x8

    .line 1132
    .line 1133
    :goto_1f
    invoke-virtual {v0, v10}, Lc4;->s(I)I

    .line 1134
    .line 1135
    .line 1136
    move-result v1

    .line 1137
    const/16 v3, 0x800

    .line 1138
    .line 1139
    invoke-static {v0, v1, v3, v8, v4}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 1140
    .line 1141
    .line 1142
    move v3, v4

    .line 1143
    move/from16 v12, v16

    .line 1144
    .line 1145
    goto/16 :goto_2a

    .line 1146
    .line 1147
    :cond_33
    sget-object v3, Lrz0;->w:Le01;

    .line 1148
    .line 1149
    invoke-static {v4, v3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1150
    .line 1151
    .line 1152
    move-result v5

    .line 1153
    if-eqz v5, :cond_3c

    .line 1154
    .line 1155
    invoke-virtual {v6, v3}, Lsz0;->c(Le01;)Ljava/lang/Object;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v1

    .line 1159
    check-cast v1, Ljava/util/List;

    .line 1160
    .line 1161
    invoke-virtual {v14, v3}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v3

    .line 1165
    if-nez v3, :cond_34

    .line 1166
    .line 1167
    const/4 v3, 0x0

    .line 1168
    :cond_34
    check-cast v3, Ljava/util/List;

    .line 1169
    .line 1170
    if-eqz v3, :cond_39

    .line 1171
    .line 1172
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 1173
    .line 1174
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1175
    .line 1176
    .line 1177
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 1178
    .line 1179
    .line 1180
    move-result v5

    .line 1181
    if-gtz v5, :cond_38

    .line 1182
    .line 1183
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 1184
    .line 1185
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1186
    .line 1187
    .line 1188
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1189
    .line 1190
    .line 1191
    move-result v5

    .line 1192
    if-gtz v5, :cond_37

    .line 1193
    .line 1194
    invoke-interface {v4, v1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 1195
    .line 1196
    .line 1197
    move-result v3

    .line 1198
    if-eqz v3, :cond_36

    .line 1199
    .line 1200
    invoke-interface {v1, v4}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 1201
    .line 1202
    .line 1203
    move-result v1

    .line 1204
    if-nez v1, :cond_35

    .line 1205
    .line 1206
    goto :goto_20

    .line 1207
    :cond_35
    const/16 v38, 0x0

    .line 1208
    .line 1209
    goto :goto_21

    .line 1210
    :cond_36
    :goto_20
    move/from16 v38, v37

    .line 1211
    .line 1212
    :goto_21
    const/4 v5, 0x0

    .line 1213
    goto :goto_23

    .line 1214
    :cond_37
    const/4 v5, 0x0

    .line 1215
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v0

    .line 1219
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1220
    .line 1221
    .line 1222
    invoke-static {}, Lxc;->d()V

    .line 1223
    .line 1224
    .line 1225
    return-void

    .line 1226
    :cond_38
    const/4 v5, 0x0

    .line 1227
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v0

    .line 1231
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1232
    .line 1233
    .line 1234
    invoke-static {}, Lxc;->d()V

    .line 1235
    .line 1236
    .line 1237
    return-void

    .line 1238
    :cond_39
    const/4 v5, 0x0

    .line 1239
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1240
    .line 1241
    .line 1242
    move-result v1

    .line 1243
    if-nez v1, :cond_3b

    .line 1244
    .line 1245
    :cond_3a
    :goto_22
    move/from16 v38, v37

    .line 1246
    .line 1247
    :cond_3b
    :goto_23
    move/from16 v12, v16

    .line 1248
    .line 1249
    goto/16 :goto_10

    .line 1250
    .line 1251
    :cond_3c
    const/4 v5, 0x0

    .line 1252
    instance-of v3, v1, Lo0;

    .line 1253
    .line 1254
    if-eqz v3, :cond_3a

    .line 1255
    .line 1256
    check-cast v1, Lo0;

    .line 1257
    .line 1258
    invoke-virtual {v14, v4}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v3

    .line 1262
    if-nez v3, :cond_3d

    .line 1263
    .line 1264
    const/4 v3, 0x0

    .line 1265
    :cond_3d
    if-ne v1, v3, :cond_3e

    .line 1266
    .line 1267
    goto :goto_25

    .line 1268
    :cond_3e
    instance-of v4, v3, Lo0;

    .line 1269
    .line 1270
    if-nez v4, :cond_3f

    .line 1271
    .line 1272
    goto :goto_24

    .line 1273
    :cond_3f
    iget-object v4, v1, Lo0;->a:Ljava/lang/String;

    .line 1274
    .line 1275
    check-cast v3, Lo0;

    .line 1276
    .line 1277
    iget-object v12, v3, Lo0;->b:Lex;

    .line 1278
    .line 1279
    iget-object v3, v3, Lo0;->a:Ljava/lang/String;

    .line 1280
    .line 1281
    invoke-static {v4, v3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1282
    .line 1283
    .line 1284
    move-result v3

    .line 1285
    if-nez v3, :cond_40

    .line 1286
    .line 1287
    goto :goto_24

    .line 1288
    :cond_40
    iget-object v1, v1, Lo0;->b:Lex;

    .line 1289
    .line 1290
    if-nez v1, :cond_41

    .line 1291
    .line 1292
    if-eqz v12, :cond_41

    .line 1293
    .line 1294
    goto :goto_24

    .line 1295
    :cond_41
    if-eqz v1, :cond_42

    .line 1296
    .line 1297
    if-nez v12, :cond_42

    .line 1298
    .line 1299
    :goto_24
    goto :goto_22

    .line 1300
    :cond_42
    :goto_25
    move/from16 v38, v5

    .line 1301
    .line 1302
    goto :goto_23

    .line 1303
    :goto_26
    invoke-virtual {v0, v15}, Lc4;->o(Lb60;)V

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1307
    .line 1308
    .line 1309
    move-result v1

    .line 1310
    move v3, v5

    .line 1311
    :goto_27
    if-ge v3, v1, :cond_44

    .line 1312
    .line 1313
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v4

    .line 1317
    check-cast v4, Lmy0;

    .line 1318
    .line 1319
    iget v4, v4, Lmy0;->d:I

    .line 1320
    .line 1321
    if-ne v4, v13, :cond_43

    .line 1322
    .line 1323
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v1

    .line 1327
    check-cast v1, Lmy0;

    .line 1328
    .line 1329
    goto :goto_28

    .line 1330
    :cond_43
    add-int/lit8 v3, v3, 0x1

    .line 1331
    .line 1332
    goto :goto_27

    .line 1333
    :cond_44
    const/4 v1, 0x0

    .line 1334
    :goto_28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1335
    .line 1336
    .line 1337
    invoke-virtual {v11, v12}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v3

    .line 1341
    if-nez v3, :cond_45

    .line 1342
    .line 1343
    const/4 v3, 0x0

    .line 1344
    :cond_45
    check-cast v3, Lhy0;

    .line 1345
    .line 1346
    iput-object v3, v1, Lmy0;->h:Lhy0;

    .line 1347
    .line 1348
    sget-object v3, Lb01;->v:Le01;

    .line 1349
    .line 1350
    invoke-virtual {v11, v3}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v3

    .line 1354
    if-nez v3, :cond_46

    .line 1355
    .line 1356
    const/4 v3, 0x0

    .line 1357
    :cond_46
    check-cast v3, Lhy0;

    .line 1358
    .line 1359
    iput-object v3, v1, Lmy0;->i:Lhy0;

    .line 1360
    .line 1361
    iget-object v3, v1, Lmy0;->e:Ljava/util/List;

    .line 1362
    .line 1363
    invoke-interface {v3, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1364
    .line 1365
    .line 1366
    move-result v3

    .line 1367
    if-nez v3, :cond_47

    .line 1368
    .line 1369
    goto :goto_23

    .line 1370
    :cond_47
    iget-object v3, v0, Lc4;->g:Lw3;

    .line 1371
    .line 1372
    invoke-virtual {v3}, Lw3;->getSnapshotObserver()Lfn0;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v3

    .line 1376
    new-instance v4, Lm3;

    .line 1377
    .line 1378
    move/from16 v12, v16

    .line 1379
    .line 1380
    invoke-direct {v4, v12, v1, v0}, Lm3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1381
    .line 1382
    .line 1383
    iget-object v3, v3, Lfn0;->a:Le31;

    .line 1384
    .line 1385
    iget-object v5, v0, Lc4;->Q:Lb4;

    .line 1386
    .line 1387
    invoke-virtual {v3, v1, v5, v4}, Le31;->b(Ljava/lang/Object;Lsw;Lhw;)V

    .line 1388
    .line 1389
    .line 1390
    goto/16 :goto_10

    .line 1391
    .line 1392
    :goto_29
    invoke-virtual {v0, v13}, Lc4;->s(I)I

    .line 1393
    .line 1394
    .line 1395
    move-result v1

    .line 1396
    const/16 v3, 0x8

    .line 1397
    .line 1398
    const/16 v4, 0x800

    .line 1399
    .line 1400
    invoke-static {v0, v1, v4, v7, v3}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 1401
    .line 1402
    .line 1403
    invoke-virtual {v0, v13}, Lc4;->s(I)I

    .line 1404
    .line 1405
    .line 1406
    move-result v1

    .line 1407
    invoke-static {v0, v1, v4, v8, v3}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 1408
    .line 1409
    .line 1410
    goto :goto_2a

    .line 1411
    :cond_48
    move-object/from16 v43, v4

    .line 1412
    .line 1413
    move-object/from16 v48, v8

    .line 1414
    .line 1415
    move-wide/from16 v46, v12

    .line 1416
    .line 1417
    move/from16 v28, v14

    .line 1418
    .line 1419
    move/from16 v44, v15

    .line 1420
    .line 1421
    move/from16 v12, v16

    .line 1422
    .line 1423
    move-object/from16 v15, v40

    .line 1424
    .line 1425
    const/16 v37, 0x1

    .line 1426
    .line 1427
    move-object v8, v2

    .line 1428
    move v13, v3

    .line 1429
    move-object v14, v5

    .line 1430
    move/from16 v3, v27

    .line 1431
    .line 1432
    move v2, v1

    .line 1433
    :goto_2a
    shr-long v4, v46, v3

    .line 1434
    .line 1435
    add-int/lit8 v1, v44, 0x1

    .line 1436
    .line 1437
    move/from16 v27, v3

    .line 1438
    .line 1439
    move/from16 v16, v12

    .line 1440
    .line 1441
    move v3, v13

    .line 1442
    move-object/from16 v40, v15

    .line 1443
    .line 1444
    move v15, v1

    .line 1445
    move v1, v2

    .line 1446
    move-wide v12, v4

    .line 1447
    move-object v2, v8

    .line 1448
    move-object v5, v14

    .line 1449
    move/from16 v14, v28

    .line 1450
    .line 1451
    move-object/from16 v4, v43

    .line 1452
    .line 1453
    move-object/from16 v8, v48

    .line 1454
    .line 1455
    goto/16 :goto_4

    .line 1456
    .line 1457
    :cond_49
    move v13, v3

    .line 1458
    move-object/from16 v43, v4

    .line 1459
    .line 1460
    move-object/from16 v48, v8

    .line 1461
    .line 1462
    move/from16 v12, v16

    .line 1463
    .line 1464
    move/from16 v3, v27

    .line 1465
    .line 1466
    move-object/from16 v15, v40

    .line 1467
    .line 1468
    const/16 v37, 0x1

    .line 1469
    .line 1470
    move-object v8, v2

    .line 1471
    move v2, v1

    .line 1472
    move v1, v14

    .line 1473
    move-object v14, v5

    .line 1474
    if-ne v1, v3, :cond_4c

    .line 1475
    .line 1476
    :goto_2b
    move/from16 v1, v42

    .line 1477
    .line 1478
    goto :goto_2c

    .line 1479
    :cond_4a
    move v13, v3

    .line 1480
    move-object/from16 v43, v4

    .line 1481
    .line 1482
    move-object v14, v5

    .line 1483
    move-object/from16 v48, v8

    .line 1484
    .line 1485
    move/from16 v12, v16

    .line 1486
    .line 1487
    move-object/from16 v15, v40

    .line 1488
    .line 1489
    const/16 v37, 0x1

    .line 1490
    .line 1491
    move-object v8, v2

    .line 1492
    move v2, v1

    .line 1493
    goto :goto_2b

    .line 1494
    :goto_2c
    if-eq v1, v2, :cond_4c

    .line 1495
    .line 1496
    add-int/lit8 v1, v1, 0x1

    .line 1497
    .line 1498
    move/from16 v16, v12

    .line 1499
    .line 1500
    move v3, v13

    .line 1501
    move-object v5, v14

    .line 1502
    move-object/from16 v40, v15

    .line 1503
    .line 1504
    move-object/from16 v14, v41

    .line 1505
    .line 1506
    move-object/from16 v4, v43

    .line 1507
    .line 1508
    const/16 v27, 0x8

    .line 1509
    .line 1510
    move v15, v1

    .line 1511
    move v1, v2

    .line 1512
    move-object v2, v8

    .line 1513
    move-object/from16 v8, v48

    .line 1514
    .line 1515
    goto/16 :goto_3

    .line 1516
    .line 1517
    :cond_4b
    move-object/from16 v43, v4

    .line 1518
    .line 1519
    move-object/from16 v48, v8

    .line 1520
    .line 1521
    move/from16 v39, v13

    .line 1522
    .line 1523
    move-object/from16 v41, v14

    .line 1524
    .line 1525
    move/from16 v12, v16

    .line 1526
    .line 1527
    const/16 v37, 0x1

    .line 1528
    .line 1529
    move-object v8, v2

    .line 1530
    move v13, v3

    .line 1531
    const/16 v38, 0x0

    .line 1532
    .line 1533
    :cond_4c
    if-nez v38, :cond_4f

    .line 1534
    .line 1535
    invoke-virtual/range {v43 .. v43}, Lsz0;->iterator()Ljava/util/Iterator;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v1

    .line 1539
    :cond_4d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1540
    .line 1541
    .line 1542
    move-result v2

    .line 1543
    if-eqz v2, :cond_4e

    .line 1544
    .line 1545
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v2

    .line 1549
    check-cast v2, Ljava/util/Map$Entry;

    .line 1550
    .line 1551
    invoke-virtual/range {v41 .. v41}, Lxz0;->k()Lsz0;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v3

    .line 1555
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v2

    .line 1559
    check-cast v2, Le01;

    .line 1560
    .line 1561
    iget-object v3, v3, Lsz0;->d:Ljh0;

    .line 1562
    .line 1563
    invoke-virtual {v3, v2}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 1564
    .line 1565
    .line 1566
    move-result v2

    .line 1567
    if-nez v2, :cond_4d

    .line 1568
    .line 1569
    move/from16 v15, v37

    .line 1570
    .line 1571
    goto :goto_2d

    .line 1572
    :cond_4e
    const/4 v15, 0x0

    .line 1573
    :goto_2d
    move/from16 v38, v15

    .line 1574
    .line 1575
    :cond_4f
    if-eqz v38, :cond_50

    .line 1576
    .line 1577
    invoke-virtual {v0, v13}, Lc4;->s(I)I

    .line 1578
    .line 1579
    .line 1580
    move-result v1

    .line 1581
    const/16 v3, 0x8

    .line 1582
    .line 1583
    const/16 v4, 0x800

    .line 1584
    .line 1585
    invoke-static {v0, v1, v4, v8, v3}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 1586
    .line 1587
    .line 1588
    goto :goto_2f

    .line 1589
    :cond_50
    const/16 v3, 0x8

    .line 1590
    .line 1591
    goto :goto_2f

    .line 1592
    :cond_51
    const-string v0, "no value for specified key"

    .line 1593
    .line 1594
    invoke-static {v0}, Lt1;->g(Ljava/lang/String;)Lsg;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v0

    .line 1598
    throw v0

    .line 1599
    :cond_52
    :goto_2e
    move/from16 v34, v1

    .line 1600
    .line 1601
    move-object/from16 v48, v8

    .line 1602
    .line 1603
    move-object/from16 v29, v10

    .line 1604
    .line 1605
    move-object/from16 v30, v11

    .line 1606
    .line 1607
    move v3, v12

    .line 1608
    move/from16 v39, v13

    .line 1609
    .line 1610
    move/from16 v31, v15

    .line 1611
    .line 1612
    move/from16 v12, v16

    .line 1613
    .line 1614
    move-object v8, v2

    .line 1615
    :goto_2f
    shr-long v21, v21, v3

    .line 1616
    .line 1617
    add-int/lit8 v1, v34, 0x1

    .line 1618
    .line 1619
    move-object/from16 v6, p1

    .line 1620
    .line 1621
    move-object v2, v8

    .line 1622
    move/from16 v16, v12

    .line 1623
    .line 1624
    move-object/from16 v10, v29

    .line 1625
    .line 1626
    move-object/from16 v11, v30

    .line 1627
    .line 1628
    move/from16 v15, v31

    .line 1629
    .line 1630
    move/from16 v13, v39

    .line 1631
    .line 1632
    move-object/from16 v8, v48

    .line 1633
    .line 1634
    const/4 v14, 0x0

    .line 1635
    move v12, v3

    .line 1636
    goto/16 :goto_1

    .line 1637
    .line 1638
    :cond_53
    move-object/from16 v48, v8

    .line 1639
    .line 1640
    move-object/from16 v29, v10

    .line 1641
    .line 1642
    move-object/from16 v30, v11

    .line 1643
    .line 1644
    move v3, v12

    .line 1645
    move v1, v13

    .line 1646
    move/from16 v31, v15

    .line 1647
    .line 1648
    move/from16 v12, v16

    .line 1649
    .line 1650
    move-object v8, v2

    .line 1651
    if-ne v1, v3, :cond_55

    .line 1652
    .line 1653
    move/from16 v14, v31

    .line 1654
    .line 1655
    :goto_30
    move/from16 v1, v17

    .line 1656
    .line 1657
    goto :goto_31

    .line 1658
    :cond_54
    move-object/from16 v48, v8

    .line 1659
    .line 1660
    move-object/from16 v29, v10

    .line 1661
    .line 1662
    move-object/from16 v30, v11

    .line 1663
    .line 1664
    move/from16 v12, v16

    .line 1665
    .line 1666
    move-object v8, v2

    .line 1667
    move v14, v15

    .line 1668
    goto :goto_30

    .line 1669
    :goto_31
    if-eq v14, v1, :cond_55

    .line 1670
    .line 1671
    add-int/lit8 v15, v14, 0x1

    .line 1672
    .line 1673
    move-object/from16 v6, p1

    .line 1674
    .line 1675
    move v13, v1

    .line 1676
    move-object v2, v8

    .line 1677
    move-object/from16 v10, v29

    .line 1678
    .line 1679
    move-object/from16 v11, v30

    .line 1680
    .line 1681
    move-object/from16 v8, v48

    .line 1682
    .line 1683
    const/4 v14, 0x0

    .line 1684
    goto/16 :goto_0

    .line 1685
    .line 1686
    :cond_55
    return-void
.end method
