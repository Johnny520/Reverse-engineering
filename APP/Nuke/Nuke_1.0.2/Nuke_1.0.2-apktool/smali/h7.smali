.class public final Lh7;
.super Lt3;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;
.implements Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;
.implements Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;


# static fields
.field public static final U:Lyj1;


# instance fields
.field public A:I

.field public B:Ljava/lang/Integer;

.field public final C:Ljg;

.field public final D:Ljn;

.field public E:Z

.field public F:Ld7;

.field public G:Lzj1;

.field public final H:Lak1;

.field public final I:Lxj1;

.field public final J:Lxj1;

.field public final K:Ljava/lang/String;

.field public final L:Ljava/lang/String;

.field public final M:Lvu2;

.field public final N:Lzj1;

.field public O:Lrn2;

.field public P:Z

.field public final Q:Lxj1;

.field public final R:Lm2;

.field public final S:Ljava/util/ArrayList;

.field public final T:Lg7;

.field public final k:Lb7;

.field public l:I

.field public final m:Lg7;

.field public final n:Landroid/view/accessibility/AccessibilityManager;

.field public o:J

.field public p:Ljava/util/List;

.field public final q:Lc7;

.field public r:I

.field public s:I

.field public t:Ll4;

.field public u:Ll4;

.field public v:Z

.field public final w:Lzj1;

.field public final x:Lzj1;

.field public final y:Lnt2;

.field public final z:Lnt2;


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
    sget-object v2, Lw01;->a:Lyj1;

    .line 9
    .line 10
    new-instance v2, Lyj1;

    .line 11
    .line 12
    invoke-direct {v2, v0}, Lyj1;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iget v3, v2, Lyj1;->b:I

    .line 16
    .line 17
    if-ltz v3, :cond_1

    .line 18
    .line 19
    add-int/lit8 v4, v3, 0x20

    .line 20
    .line 21
    invoke-virtual {v2, v4}, Lyj1;->b(I)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v2, Lyj1;->a:[I

    .line 25
    .line 26
    iget v6, v2, Lyj1;->b:I

    .line 27
    .line 28
    if-eq v3, v6, :cond_0

    .line 29
    .line 30
    invoke-static {v5, v5, v4, v3, v6}, Lmg;->a0([I[IIII)V

    .line 31
    .line 32
    .line 33
    :cond_0
    const/4 v4, 0x0

    .line 34
    const/16 v6, 0xc

    .line 35
    .line 36
    invoke-static {v1, v5, v3, v4, v6}, Lmg;->e0([I[IIII)V

    .line 37
    .line 38
    .line 39
    iget v1, v2, Lyj1;->b:I

    .line 40
    .line 41
    add-int/2addr v1, v0

    .line 42
    iput v1, v2, Lyj1;->b:I

    .line 43
    .line 44
    sput-object v2, Lh7;->U:Lyj1;

    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    const-string v0, ""

    .line 48
    .line 49
    invoke-static {v0}, Ls;->d(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :array_0
    .array-data 4
        0x79080001
        0x79080002
        0x7908000d
        0x79080018
        0x7908001b
        0x7908001c
        0x7908001d
        0x7908001e
        0x7908001f
        0x79080020
        0x79080003
        0x79080004
        0x79080005
        0x79080006
        0x79080007
        0x79080008
        0x79080009
        0x7908000a
        0x7908000b
        0x7908000c
        0x7908000e
        0x7908000f
        0x79080010
        0x79080011
        0x79080012
        0x79080013
        0x79080014
        0x79080015
        0x79080016
        0x79080017
        0x79080019
        0x7908001a
    .end array-data
.end method

.method public constructor <init>(Lb7;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lt3;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh7;->k:Lb7;

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    .line 8
    iput v0, p0, Lh7;->l:I

    .line 9
    .line 10
    new-instance v1, Lg7;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, v2}, Lg7;-><init>(Lh7;I)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lh7;->m:Lg7;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "accessibility"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

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
    iput-object v1, p0, Lh7;->n:Landroid/view/accessibility/AccessibilityManager;

    .line 34
    .line 35
    const-wide/16 v1, 0x64

    .line 36
    .line 37
    iput-wide v1, p0, Lh7;->o:J

    .line 38
    .line 39
    new-instance v1, Landroid/os/Handler;

    .line 40
    .line 41
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 46
    .line 47
    .line 48
    new-instance v1, Lc7;

    .line 49
    .line 50
    invoke-direct {v1, p0}, Lc7;-><init>(Lh7;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lh7;->q:Lc7;

    .line 54
    .line 55
    iput v0, p0, Lh7;->r:I

    .line 56
    .line 57
    iput v0, p0, Lh7;->s:I

    .line 58
    .line 59
    new-instance v0, Lzj1;

    .line 60
    .line 61
    invoke-direct {v0}, Lzj1;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lh7;->w:Lzj1;

    .line 65
    .line 66
    new-instance v0, Lzj1;

    .line 67
    .line 68
    invoke-direct {v0}, Lzj1;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Lh7;->x:Lzj1;

    .line 72
    .line 73
    new-instance v0, Lnt2;

    .line 74
    .line 75
    invoke-direct {v0}, Lnt2;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Lh7;->y:Lnt2;

    .line 79
    .line 80
    new-instance v0, Lnt2;

    .line 81
    .line 82
    invoke-direct {v0}, Lnt2;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, Lh7;->z:Lnt2;

    .line 86
    .line 87
    const/4 v0, -0x1

    .line 88
    iput v0, p0, Lh7;->A:I

    .line 89
    .line 90
    new-instance v0, Ljg;

    .line 91
    .line 92
    invoke-direct {v0}, Ljg;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, Lh7;->C:Ljg;

    .line 96
    .line 97
    const/4 v0, 0x6

    .line 98
    const/4 v1, 0x1

    .line 99
    const/4 v2, 0x0

    .line 100
    invoke-static {v1, v0, v2}, Lfg1;->a(IILhn;)Ljn;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iput-object v0, p0, Lh7;->D:Ljn;

    .line 105
    .line 106
    iput-boolean v1, p0, Lh7;->E:Z

    .line 107
    .line 108
    sget-object v0, Ly01;->a:Lzj1;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iput-object v0, p0, Lh7;->G:Lzj1;

    .line 114
    .line 115
    new-instance v2, Lak1;

    .line 116
    .line 117
    invoke-direct {v2}, Lak1;-><init>()V

    .line 118
    .line 119
    .line 120
    iput-object v2, p0, Lh7;->H:Lak1;

    .line 121
    .line 122
    new-instance v2, Lxj1;

    .line 123
    .line 124
    invoke-direct {v2}, Lxj1;-><init>()V

    .line 125
    .line 126
    .line 127
    iput-object v2, p0, Lh7;->I:Lxj1;

    .line 128
    .line 129
    new-instance v2, Lxj1;

    .line 130
    .line 131
    invoke-direct {v2}, Lxj1;-><init>()V

    .line 132
    .line 133
    .line 134
    iput-object v2, p0, Lh7;->J:Lxj1;

    .line 135
    .line 136
    const-string v2, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL"

    .line 137
    .line 138
    iput-object v2, p0, Lh7;->K:Ljava/lang/String;

    .line 139
    .line 140
    const-string v2, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL"

    .line 141
    .line 142
    iput-object v2, p0, Lh7;->L:Ljava/lang/String;

    .line 143
    .line 144
    new-instance v2, Lvu2;

    .line 145
    .line 146
    const/4 v3, 0x2

    .line 147
    invoke-direct {v2, v3}, Lvu2;-><init>(I)V

    .line 148
    .line 149
    .line 150
    iput-object v2, p0, Lh7;->M:Lvu2;

    .line 151
    .line 152
    new-instance v2, Lzj1;

    .line 153
    .line 154
    invoke-direct {v2}, Lzj1;-><init>()V

    .line 155
    .line 156
    .line 157
    iput-object v2, p0, Lh7;->N:Lzj1;

    .line 158
    .line 159
    new-instance v2, Lrn2;

    .line 160
    .line 161
    invoke-virtual {p1}, Lb7;->getSemanticsOwner()Ltn2;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v3}, Ltn2;->a()Lqn2;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-direct {v2, v3, v0}, Lrn2;-><init>(Lqn2;Lx01;)V

    .line 170
    .line 171
    .line 172
    iput-object v2, p0, Lh7;->O:Lrn2;

    .line 173
    .line 174
    sget v0, Lu01;->a:I

    .line 175
    .line 176
    new-instance v0, Lxj1;

    .line 177
    .line 178
    invoke-direct {v0}, Lxj1;-><init>()V

    .line 179
    .line 180
    .line 181
    iput-object v0, p0, Lh7;->Q:Lxj1;

    .line 182
    .line 183
    invoke-virtual {p1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 184
    .line 185
    .line 186
    new-instance p1, Lm2;

    .line 187
    .line 188
    invoke-direct {p1, v1, p0}, Lm2;-><init>(ILjava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    iput-object p1, p0, Lh7;->R:Lm2;

    .line 192
    .line 193
    new-instance p1, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 196
    .line 197
    .line 198
    iput-object p1, p0, Lh7;->S:Ljava/util/ArrayList;

    .line 199
    .line 200
    new-instance p1, Lg7;

    .line 201
    .line 202
    invoke-direct {p1, p0, v1}, Lg7;-><init>(Lh7;I)V

    .line 203
    .line 204
    .line 205
    iput-object p1, p0, Lh7;->T:Lg7;

    .line 206
    .line 207
    return-void
.end method

.method public static E(Lte;FF)Landroid/graphics/Rect;
    .locals 4

    .line 1
    instance-of v0, p0, Ltv1;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, Luv1;

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
    invoke-virtual {p0}, Lte;->D()Lo62;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance v0, Landroid/graphics/Rect;

    .line 17
    .line 18
    iget v1, p0, Lo62;->a:F

    .line 19
    .line 20
    add-float/2addr v1, p1

    .line 21
    float-to-int v1, v1

    .line 22
    iget v2, p0, Lo62;->b:F

    .line 23
    .line 24
    add-float/2addr v2, p2

    .line 25
    float-to-int v2, v2

    .line 26
    iget v3, p0, Lo62;->c:F

    .line 27
    .line 28
    add-float/2addr v3, p1

    .line 29
    float-to-int p1, v3

    .line 30
    iget p0, p0, Lo62;->d:F

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

.method public static G(Lte;)[F
    .locals 13

    .line 1
    instance-of v0, p0, Luv1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Luv1;

    .line 6
    .line 7
    iget-object p0, p0, Luv1;->j:Ldb2;

    .line 8
    .line 9
    iget-wide v0, p0, Ldb2;->h:J

    .line 10
    .line 11
    iget-wide v2, p0, Ldb2;->g:J

    .line 12
    .line 13
    iget-wide v4, p0, Ldb2;->f:J

    .line 14
    .line 15
    iget-wide v6, p0, Ldb2;->e:J

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

.method public static H(Lte;FF)Landroid/graphics/Region;
    .locals 8

    .line 1
    instance-of v0, p0, Lsv1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Region;

    .line 7
    .line 8
    check-cast p0, Lsv1;

    .line 9
    .line 10
    invoke-virtual {p0}, Lsv1;->D()Lo62;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2, p1, p2}, Lo62;->h(FF)Lo62;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v3, Landroid/graphics/Rect;

    .line 19
    .line 20
    iget v4, v2, Lo62;->a:F

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    add-float/2addr v4, v5

    .line 24
    float-to-int v4, v4

    .line 25
    iget v6, v2, Lo62;->b:F

    .line 26
    .line 27
    add-float/2addr v6, v5

    .line 28
    float-to-int v6, v6

    .line 29
    iget v7, v2, Lo62;->c:F

    .line 30
    .line 31
    add-float/2addr v7, v5

    .line 32
    float-to-int v7, v7

    .line 33
    iget v2, v2, Lo62;->d:F

    .line 34
    .line 35
    add-float/2addr v2, v5

    .line 36
    float-to-int v2, v2

    .line 37
    invoke-direct {v3, v4, v6, v7, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v3}, Landroid/graphics/Region;-><init>(Landroid/graphics/Rect;)V

    .line 41
    .line 42
    .line 43
    new-instance v2, Landroid/graphics/Region;

    .line 44
    .line 45
    invoke-direct {v2}, Landroid/graphics/Region;-><init>()V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lsv1;->j:Ly9;

    .line 49
    .line 50
    instance-of v3, p0, Ly9;

    .line 51
    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    iget-object p0, p0, Ly9;->a:Landroid/graphics/Path;

    .line 55
    .line 56
    invoke-virtual {p0, p1, p2}, Landroid/graphics/Path;->offset(FF)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, p0, v0}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    .line 60
    .line 61
    .line 62
    return-object v2

    .line 63
    :cond_0
    const-string p0, "Unable to obtain android.graphics.Path"

    .line 64
    .line 65
    invoke-static {p0}, Lc80;->t(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    return-object v1
.end method

.method public static I(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
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

.method public static m(Lqn2;)Ljava/lang/String;
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
    iget-object p0, p0, Lqn2;->d:Lln2;

    .line 6
    .line 7
    iget-object v1, p0, Lln2;->h:Lrk1;

    .line 8
    .line 9
    sget-object v2, Lvn2;->a:Lyn2;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, v2}, Lln2;->c(Lyn2;)Ljava/lang/Object;

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
    invoke-static {p0, v1, v0, v2}, Lsb1;->a(Ljava/util/List;Ljava/lang/String;Lvi1;I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    sget-object p0, Lvn2;->G:Lyn2;

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    invoke-virtual {v1, p0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast p0, Lsd;

    .line 48
    .line 49
    if-eqz p0, :cond_5

    .line 50
    .line 51
    iget-object p0, p0, Lsd;->i:Ljava/lang/String;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_3
    sget-object p0, Lvn2;->C:Lyn2;

    .line 55
    .line 56
    invoke-virtual {v1, p0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {p0}, Ldu;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Lsd;

    .line 72
    .line 73
    if-eqz p0, :cond_5

    .line 74
    .line 75
    iget-object p0, p0, Lsd;->i:Ljava/lang/String;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_5
    :goto_0
    return-object v0
.end method

.method public static final q(Lel2;F)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lel2;->a:Lxm0;

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
    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

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
    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

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
    iget-object p0, p0, Lel2;->b:Lxm0;

    .line 37
    .line 38
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

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

.method public static final r(Lel2;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lel2;->a:Lxm0;

    .line 2
    .line 3
    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

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
    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

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
    iget-object p0, p0, Lel2;->b:Lxm0;

    .line 30
    .line 31
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

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

.method public static final s(Lel2;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lel2;->a:Lxm0;

    .line 2
    .line 3
    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

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
    iget-object p0, p0, Lel2;->b:Lxm0;

    .line 14
    .line 15
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

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
    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

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

.method public static synthetic x(Lh7;IILjava/lang/Integer;I)V
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
    invoke-virtual {p0, p1, p2, p3, v0}, Lh7;->w(IILjava/lang/Integer;Ljava/util/List;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final A(Lx01;)V
    .locals 58

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
    iget-object v9, v0, Lh7;->S:Ljava/util/ArrayList;

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
    iget-object v10, v6, Lx01;->b:[I

    .line 22
    .line 23
    iget-object v11, v6, Lx01;->a:[J

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
    if-ltz v13, :cond_4b

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
    if-eqz v1, :cond_4a

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
    if-ge v1, v13, :cond_49

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
    if-gez v3, :cond_48

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
    iget-object v4, v0, Lh7;->N:Lzj1;

    .line 90
    .line 91
    invoke-virtual {v4, v3}, Lx01;->b(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, Lrn2;

    .line 96
    .line 97
    if-nez v4, :cond_0

    .line 98
    .line 99
    goto/16 :goto_27

    .line 100
    .line 101
    :cond_0
    iget-object v4, v4, Lrn2;->a:Lln2;

    .line 102
    .line 103
    iget-object v5, v4, Lln2;->h:Lrk1;

    .line 104
    .line 105
    invoke-virtual {v6, v3}, Lx01;->b(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v27

    .line 109
    move-object/from16 v14, v27

    .line 110
    .line 111
    check-cast v14, Lsn2;

    .line 112
    .line 113
    const/16 v27, 0x0

    .line 114
    .line 115
    if-eqz v14, :cond_1

    .line 116
    .line 117
    iget-object v14, v14, Lsn2;->a:Lqn2;

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_1
    move-object/from16 v14, v27

    .line 121
    .line 122
    :goto_2
    if-eqz v14, :cond_47

    .line 123
    .line 124
    move/from16 v29, v12

    .line 125
    .line 126
    iget v12, v14, Lqn2;->f:I

    .line 127
    .line 128
    iget-object v6, v14, Lqn2;->d:Lln2;

    .line 129
    .line 130
    move-object/from16 v30, v10

    .line 131
    .line 132
    iget-object v10, v6, Lln2;->h:Lrk1;

    .line 133
    .line 134
    move-object/from16 v31, v11

    .line 135
    .line 136
    iget-object v11, v10, Lrk1;->b:[Ljava/lang/Object;

    .line 137
    .line 138
    move-object/from16 v32, v11

    .line 139
    .line 140
    iget-object v11, v10, Lrk1;->c:[Ljava/lang/Object;

    .line 141
    .line 142
    move-object/from16 v33, v11

    .line 143
    .line 144
    iget-object v11, v10, Lrk1;->a:[J

    .line 145
    .line 146
    move/from16 v34, v1

    .line 147
    .line 148
    array-length v1, v11

    .line 149
    add-int/lit8 v1, v1, -0x2

    .line 150
    .line 151
    move-object/from16 v35, v11

    .line 152
    .line 153
    if-ltz v1, :cond_41

    .line 154
    .line 155
    move/from16 v38, v13

    .line 156
    .line 157
    move-object/from16 v39, v14

    .line 158
    .line 159
    const/4 v11, 0x0

    .line 160
    const/16 v37, 0x0

    .line 161
    .line 162
    :goto_3
    const/16 v36, 0x1

    .line 163
    .line 164
    aget-wide v13, v35, v11

    .line 165
    .line 166
    move/from16 v41, v11

    .line 167
    .line 168
    move/from16 v40, v12

    .line 169
    .line 170
    not-long v11, v13

    .line 171
    shl-long v11, v11, v18

    .line 172
    .line 173
    and-long/2addr v11, v13

    .line 174
    and-long v11, v11, v19

    .line 175
    .line 176
    cmp-long v11, v11, v19

    .line 177
    .line 178
    if-eqz v11, :cond_40

    .line 179
    .line 180
    sub-int v11, v41, v1

    .line 181
    .line 182
    not-int v11, v11

    .line 183
    ushr-int/lit8 v11, v11, 0x1f

    .line 184
    .line 185
    rsub-int/lit8 v12, v11, 0x8

    .line 186
    .line 187
    const/4 v11, 0x0

    .line 188
    :goto_4
    if-ge v11, v12, :cond_3f

    .line 189
    .line 190
    and-long v42, v13, v23

    .line 191
    .line 192
    cmp-long v42, v42, v25

    .line 193
    .line 194
    if-gez v42, :cond_3e

    .line 195
    .line 196
    shl-int/lit8 v42, v41, 0x3

    .line 197
    .line 198
    add-int v42, v42, v11

    .line 199
    .line 200
    aget-object v43, v32, v42

    .line 201
    .line 202
    move/from16 v44, v1

    .line 203
    .line 204
    aget-object v1, v33, v42

    .line 205
    .line 206
    move-object/from16 v42, v4

    .line 207
    .line 208
    move-object/from16 v4, v43

    .line 209
    .line 210
    check-cast v4, Lyn2;

    .line 211
    .line 212
    move/from16 v43, v11

    .line 213
    .line 214
    sget-object v11, Lvn2;->v:Lyn2;

    .line 215
    .line 216
    invoke-static {v4, v11}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v45

    .line 220
    if-nez v45, :cond_3

    .line 221
    .line 222
    move-wide/from16 v45, v13

    .line 223
    .line 224
    sget-object v13, Lvn2;->w:Lyn2;

    .line 225
    .line 226
    invoke-static {v4, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v13

    .line 230
    if-eqz v13, :cond_2

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_2
    const/4 v14, 0x0

    .line 234
    goto :goto_9

    .line 235
    :cond_3
    move-wide/from16 v45, v13

    .line 236
    .line 237
    :goto_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 238
    .line 239
    .line 240
    move-result v13

    .line 241
    const/4 v14, 0x0

    .line 242
    :goto_6
    if-ge v14, v13, :cond_5

    .line 243
    .line 244
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v47

    .line 248
    move/from16 v48, v13

    .line 249
    .line 250
    move-object/from16 v13, v47

    .line 251
    .line 252
    check-cast v13, Ljl2;

    .line 253
    .line 254
    iget v13, v13, Ljl2;->h:I

    .line 255
    .line 256
    if-ne v13, v3, :cond_4

    .line 257
    .line 258
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v13

    .line 262
    check-cast v13, Ljl2;

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_4
    add-int/lit8 v14, v14, 0x1

    .line 266
    .line 267
    move/from16 v13, v48

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_5
    move-object/from16 v13, v27

    .line 271
    .line 272
    :goto_7
    if-eqz v13, :cond_6

    .line 273
    .line 274
    const/4 v14, 0x0

    .line 275
    goto :goto_8

    .line 276
    :cond_6
    new-instance v13, Ljl2;

    .line 277
    .line 278
    invoke-direct {v13, v3, v9}, Ljl2;-><init>(ILjava/util/ArrayList;)V

    .line 279
    .line 280
    .line 281
    move/from16 v14, v36

    .line 282
    .line 283
    :goto_8
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    :goto_9
    if-nez v14, :cond_9

    .line 287
    .line 288
    invoke-virtual {v5, v4}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v13

    .line 292
    if-nez v13, :cond_7

    .line 293
    .line 294
    move-object/from16 v13, v27

    .line 295
    .line 296
    :cond_7
    invoke-static {v1, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v13

    .line 300
    if-eqz v13, :cond_9

    .line 301
    .line 302
    :cond_8
    :goto_a
    move-object v13, v2

    .line 303
    move-object v14, v5

    .line 304
    move-object/from16 v52, v7

    .line 305
    .line 306
    move-object/from16 v53, v8

    .line 307
    .line 308
    move-object/from16 v1, v39

    .line 309
    .line 310
    move/from16 v2, v40

    .line 311
    .line 312
    move/from16 v8, v44

    .line 313
    .line 314
    move v7, v3

    .line 315
    goto/16 :goto_22

    .line 316
    .line 317
    :cond_9
    sget-object v13, Lvn2;->d:Lyn2;

    .line 318
    .line 319
    invoke-static {v4, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v14

    .line 323
    if-eqz v14, :cond_a

    .line 324
    .line 325
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    check-cast v1, Ljava/lang/String;

    .line 329
    .line 330
    invoke-virtual {v5, v13}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    move/from16 v13, v29

    .line 335
    .line 336
    if-eqz v4, :cond_8

    .line 337
    .line 338
    invoke-virtual {v0, v1, v3, v13}, Lh7;->y(Ljava/lang/String;II)V

    .line 339
    .line 340
    .line 341
    goto :goto_a

    .line 342
    :cond_a
    move/from16 v13, v29

    .line 343
    .line 344
    sget-object v14, Lvn2;->b:Lyn2;

    .line 345
    .line 346
    invoke-static {v4, v14}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v14

    .line 350
    if-eqz v14, :cond_b

    .line 351
    .line 352
    invoke-virtual {v0, v3}, Lh7;->t(I)I

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    const/16 v14, 0x800

    .line 357
    .line 358
    invoke-static {v0, v1, v14, v7, v13}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v0, v3}, Lh7;->t(I)I

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    invoke-static {v0, v1, v14, v2, v13}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    .line 366
    .line 367
    .line 368
    goto :goto_a

    .line 369
    :cond_b
    const/16 v14, 0x800

    .line 370
    .line 371
    sget-object v13, Lvn2;->K:Lyn2;

    .line 372
    .line 373
    invoke-static {v4, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v13

    .line 377
    if-eqz v13, :cond_c

    .line 378
    .line 379
    invoke-virtual {v0, v3}, Lh7;->t(I)I

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    const/16 v4, 0x2000

    .line 384
    .line 385
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    const/16 v13, 0x8

    .line 390
    .line 391
    invoke-static {v0, v1, v14, v4, v13}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0, v3}, Lh7;->t(I)I

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    invoke-static {v0, v1, v14, v2, v13}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    .line 399
    .line 400
    .line 401
    goto :goto_a

    .line 402
    :cond_c
    sget-object v13, Lvn2;->M:Lyn2;

    .line 403
    .line 404
    invoke-static {v4, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v13

    .line 408
    if-eqz v13, :cond_d

    .line 409
    .line 410
    invoke-virtual {v0, v3}, Lh7;->t(I)I

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    const/16 v4, 0xc00

    .line 415
    .line 416
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    const/16 v13, 0x8

    .line 421
    .line 422
    invoke-static {v0, v1, v14, v4, v13}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    .line 423
    .line 424
    .line 425
    goto :goto_a

    .line 426
    :cond_d
    sget-object v13, Lvn2;->c:Lyn2;

    .line 427
    .line 428
    invoke-static {v4, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v13

    .line 432
    if-eqz v13, :cond_e

    .line 433
    .line 434
    invoke-virtual {v0, v3}, Lh7;->t(I)I

    .line 435
    .line 436
    .line 437
    move-result v1

    .line 438
    const/16 v13, 0x8

    .line 439
    .line 440
    invoke-static {v0, v1, v14, v7, v13}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v0, v3}, Lh7;->t(I)I

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    invoke-static {v0, v1, v14, v2, v13}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    .line 448
    .line 449
    .line 450
    goto/16 :goto_a

    .line 451
    .line 452
    :cond_e
    sget-object v13, Lvn2;->J:Lyn2;

    .line 453
    .line 454
    invoke-static {v4, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v13

    .line 458
    if-eqz v13, :cond_10

    .line 459
    .line 460
    sget-object v1, Lvn2;->z:Lyn2;

    .line 461
    .line 462
    invoke-virtual {v10, v1}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    if-nez v1, :cond_f

    .line 467
    .line 468
    move-object/from16 v1, v27

    .line 469
    .line 470
    :cond_f
    check-cast v1, Lva2;

    .line 471
    .line 472
    invoke-virtual {v0, v3}, Lh7;->t(I)I

    .line 473
    .line 474
    .line 475
    move-result v1

    .line 476
    const/16 v13, 0x8

    .line 477
    .line 478
    const/16 v14, 0x800

    .line 479
    .line 480
    invoke-static {v0, v1, v14, v7, v13}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v0, v3}, Lh7;->t(I)I

    .line 484
    .line 485
    .line 486
    move-result v1

    .line 487
    invoke-static {v0, v1, v14, v2, v13}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    .line 488
    .line 489
    .line 490
    goto/16 :goto_a

    .line 491
    .line 492
    :cond_10
    const/16 v14, 0x800

    .line 493
    .line 494
    sget-object v13, Lvn2;->a:Lyn2;

    .line 495
    .line 496
    invoke-static {v4, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    move-result v13

    .line 500
    if-eqz v13, :cond_11

    .line 501
    .line 502
    invoke-virtual {v0, v3}, Lh7;->t(I)I

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    const/4 v11, 0x4

    .line 507
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 508
    .line 509
    .line 510
    move-result-object v11

    .line 511
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    check-cast v1, Ljava/util/List;

    .line 515
    .line 516
    invoke-virtual {v0, v4, v14, v11, v1}, Lh7;->w(IILjava/lang/Integer;Ljava/util/List;)Z

    .line 517
    .line 518
    .line 519
    goto/16 :goto_a

    .line 520
    .line 521
    :cond_11
    sget-object v13, Lvn2;->G:Lyn2;

    .line 522
    .line 523
    invoke-static {v4, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result v14

    .line 527
    const-wide v47, 0xffffffffL

    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    const/16 v49, 0x20

    .line 533
    .line 534
    const-string v50, ""

    .line 535
    .line 536
    if-eqz v14, :cond_22

    .line 537
    .line 538
    sget-object v1, Lkn2;->k:Lyn2;

    .line 539
    .line 540
    invoke-virtual {v10, v1}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move-result v1

    .line 544
    if-eqz v1, :cond_21

    .line 545
    .line 546
    invoke-virtual {v5, v13}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    if-nez v1, :cond_12

    .line 551
    .line 552
    move-object/from16 v1, v27

    .line 553
    .line 554
    :cond_12
    check-cast v1, Lsd;

    .line 555
    .line 556
    if-eqz v1, :cond_13

    .line 557
    .line 558
    goto :goto_b

    .line 559
    :cond_13
    move-object/from16 v1, v50

    .line 560
    .line 561
    :goto_b
    invoke-virtual {v10, v13}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v4

    .line 565
    if-nez v4, :cond_14

    .line 566
    .line 567
    move-object/from16 v4, v27

    .line 568
    .line 569
    :cond_14
    check-cast v4, Lsd;

    .line 570
    .line 571
    if-eqz v4, :cond_15

    .line 572
    .line 573
    goto :goto_c

    .line 574
    :cond_15
    move-object/from16 v4, v50

    .line 575
    .line 576
    :goto_c
    invoke-static {v4}, Lh7;->I(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 577
    .line 578
    .line 579
    move-result-object v11

    .line 580
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 581
    .line 582
    .line 583
    move-result v13

    .line 584
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 585
    .line 586
    .line 587
    move-result v14

    .line 588
    move-object/from16 v51, v2

    .line 589
    .line 590
    if-le v13, v14, :cond_16

    .line 591
    .line 592
    move v2, v14

    .line 593
    goto :goto_d

    .line 594
    :cond_16
    move v2, v13

    .line 595
    :goto_d
    move-object/from16 v52, v7

    .line 596
    .line 597
    const/4 v7, 0x0

    .line 598
    :goto_e
    move/from16 v50, v2

    .line 599
    .line 600
    if-ge v7, v2, :cond_18

    .line 601
    .line 602
    invoke-interface {v1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 603
    .line 604
    .line 605
    move-result v2

    .line 606
    move-object/from16 v53, v8

    .line 607
    .line 608
    invoke-interface {v4, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 609
    .line 610
    .line 611
    move-result v8

    .line 612
    if-eq v2, v8, :cond_17

    .line 613
    .line 614
    goto :goto_f

    .line 615
    :cond_17
    add-int/lit8 v7, v7, 0x1

    .line 616
    .line 617
    move/from16 v2, v50

    .line 618
    .line 619
    move-object/from16 v8, v53

    .line 620
    .line 621
    goto :goto_e

    .line 622
    :cond_18
    move-object/from16 v53, v8

    .line 623
    .line 624
    :goto_f
    const/4 v2, 0x0

    .line 625
    :goto_10
    sub-int v8, v50, v7

    .line 626
    .line 627
    if-ge v2, v8, :cond_1a

    .line 628
    .line 629
    add-int/lit8 v8, v13, -0x1

    .line 630
    .line 631
    sub-int/2addr v8, v2

    .line 632
    invoke-interface {v1, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 633
    .line 634
    .line 635
    move-result v8

    .line 636
    add-int/lit8 v54, v14, -0x1

    .line 637
    .line 638
    move/from16 v55, v2

    .line 639
    .line 640
    sub-int v2, v54, v55

    .line 641
    .line 642
    invoke-interface {v4, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 643
    .line 644
    .line 645
    move-result v2

    .line 646
    if-eq v8, v2, :cond_19

    .line 647
    .line 648
    goto :goto_11

    .line 649
    :cond_19
    add-int/lit8 v2, v55, 0x1

    .line 650
    .line 651
    goto :goto_10

    .line 652
    :cond_1a
    move/from16 v55, v2

    .line 653
    .line 654
    :goto_11
    sub-int v13, v13, v55

    .line 655
    .line 656
    sub-int/2addr v13, v7

    .line 657
    sub-int v2, v14, v55

    .line 658
    .line 659
    sub-int/2addr v2, v7

    .line 660
    sget-object v4, Lvn2;->L:Lyn2;

    .line 661
    .line 662
    invoke-virtual {v5, v4}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move-result v8

    .line 666
    invoke-virtual {v10, v4}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    move-result v4

    .line 670
    move/from16 v50, v4

    .line 671
    .line 672
    sget-object v4, Lvn2;->G:Lyn2;

    .line 673
    .line 674
    invoke-virtual {v5, v4}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    move-result v4

    .line 678
    if-eqz v4, :cond_1b

    .line 679
    .line 680
    if-nez v8, :cond_1b

    .line 681
    .line 682
    if-eqz v50, :cond_1b

    .line 683
    .line 684
    move/from16 v54, v36

    .line 685
    .line 686
    goto :goto_12

    .line 687
    :cond_1b
    const/16 v54, 0x0

    .line 688
    .line 689
    :goto_12
    if-eqz v4, :cond_1c

    .line 690
    .line 691
    if-eqz v8, :cond_1c

    .line 692
    .line 693
    if-nez v50, :cond_1c

    .line 694
    .line 695
    move/from16 v8, v36

    .line 696
    .line 697
    goto :goto_13

    .line 698
    :cond_1c
    const/4 v8, 0x0

    .line 699
    :goto_13
    if-nez v54, :cond_1e

    .line 700
    .line 701
    if-eqz v8, :cond_1d

    .line 702
    .line 703
    goto :goto_14

    .line 704
    :cond_1d
    invoke-virtual {v0, v3}, Lh7;->t(I)I

    .line 705
    .line 706
    .line 707
    move-result v4

    .line 708
    const/16 v14, 0x10

    .line 709
    .line 710
    invoke-virtual {v0, v4, v14}, Lh7;->h(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 711
    .line 712
    .line 713
    move-result-object v4

    .line 714
    invoke-virtual {v4, v7}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v4, v13}, Landroid/view/accessibility/AccessibilityRecord;->setRemovedCount(I)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v4, v2}, Landroid/view/accessibility/AccessibilityRecord;->setAddedCount(I)V

    .line 721
    .line 722
    .line 723
    invoke-virtual {v4, v1}, Landroid/view/accessibility/AccessibilityRecord;->setBeforeText(Ljava/lang/CharSequence;)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 727
    .line 728
    .line 729
    move-result-object v1

    .line 730
    invoke-interface {v1, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    move v7, v3

    .line 734
    move-object v14, v5

    .line 735
    move-object/from16 v2, v51

    .line 736
    .line 737
    goto :goto_15

    .line 738
    :cond_1e
    :goto_14
    invoke-virtual {v0, v3}, Lh7;->t(I)I

    .line 739
    .line 740
    .line 741
    move-result v1

    .line 742
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 743
    .line 744
    .line 745
    move-result-object v4

    .line 746
    move v2, v3

    .line 747
    move-object/from16 v3, v51

    .line 748
    .line 749
    move v7, v2

    .line 750
    move-object v14, v5

    .line 751
    move-object v5, v11

    .line 752
    move-object/from16 v2, v51

    .line 753
    .line 754
    invoke-virtual/range {v0 .. v5}, Lh7;->i(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    .line 755
    .line 756
    .line 757
    move-result-object v4

    .line 758
    :goto_15
    const-string v1, "android.widget.EditText"

    .line 759
    .line 760
    invoke-virtual {v4, v1}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v0, v4}, Lh7;->v(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 764
    .line 765
    .line 766
    if-nez v54, :cond_20

    .line 767
    .line 768
    if-eqz v8, :cond_1f

    .line 769
    .line 770
    goto :goto_16

    .line 771
    :cond_1f
    move-object/from16 v51, v2

    .line 772
    .line 773
    goto :goto_17

    .line 774
    :cond_20
    :goto_16
    sget-object v1, Lvn2;->H:Lyn2;

    .line 775
    .line 776
    invoke-virtual {v6, v1}, Lln2;->c(Lyn2;)Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v1

    .line 780
    check-cast v1, Lf13;

    .line 781
    .line 782
    move-object/from16 v51, v2

    .line 783
    .line 784
    iget-wide v1, v1, Lf13;->a:J

    .line 785
    .line 786
    move-wide/from16 v54, v1

    .line 787
    .line 788
    shr-long v1, v54, v49

    .line 789
    .line 790
    long-to-int v1, v1

    .line 791
    invoke-virtual {v4, v1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 792
    .line 793
    .line 794
    and-long v1, v54, v47

    .line 795
    .line 796
    long-to-int v1, v1

    .line 797
    invoke-virtual {v4, v1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v0, v4}, Lh7;->v(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 801
    .line 802
    .line 803
    :goto_17
    move-object/from16 v1, v39

    .line 804
    .line 805
    move/from16 v2, v40

    .line 806
    .line 807
    move/from16 v8, v44

    .line 808
    .line 809
    move-object/from16 v13, v51

    .line 810
    .line 811
    goto/16 :goto_22

    .line 812
    .line 813
    :cond_21
    move-object/from16 v51, v2

    .line 814
    .line 815
    move-object v14, v5

    .line 816
    move-object/from16 v52, v7

    .line 817
    .line 818
    move-object/from16 v53, v8

    .line 819
    .line 820
    move v7, v3

    .line 821
    invoke-virtual {v0, v7}, Lh7;->t(I)I

    .line 822
    .line 823
    .line 824
    move-result v1

    .line 825
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 826
    .line 827
    .line 828
    move-result-object v2

    .line 829
    const/16 v3, 0x800

    .line 830
    .line 831
    const/16 v13, 0x8

    .line 832
    .line 833
    invoke-static {v0, v1, v3, v2, v13}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    .line 834
    .line 835
    .line 836
    goto :goto_17

    .line 837
    :cond_22
    move-object/from16 v51, v2

    .line 838
    .line 839
    move-object v14, v5

    .line 840
    move-object/from16 v52, v7

    .line 841
    .line 842
    move-object/from16 v53, v8

    .line 843
    .line 844
    move/from16 v8, v44

    .line 845
    .line 846
    move v7, v3

    .line 847
    sget-object v2, Lvn2;->H:Lyn2;

    .line 848
    .line 849
    invoke-static {v4, v2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 850
    .line 851
    .line 852
    move-result v3

    .line 853
    if-eqz v3, :cond_27

    .line 854
    .line 855
    invoke-virtual {v10, v13}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 856
    .line 857
    .line 858
    move-result-object v1

    .line 859
    if-nez v1, :cond_23

    .line 860
    .line 861
    move-object/from16 v1, v27

    .line 862
    .line 863
    :cond_23
    check-cast v1, Lsd;

    .line 864
    .line 865
    if-eqz v1, :cond_25

    .line 866
    .line 867
    iget-object v1, v1, Lsd;->i:Ljava/lang/String;

    .line 868
    .line 869
    if-nez v1, :cond_24

    .line 870
    .line 871
    goto :goto_18

    .line 872
    :cond_24
    move-object/from16 v50, v1

    .line 873
    .line 874
    :cond_25
    :goto_18
    invoke-virtual {v6, v2}, Lln2;->c(Lyn2;)Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v1

    .line 878
    check-cast v1, Lf13;

    .line 879
    .line 880
    iget-wide v1, v1, Lf13;->a:J

    .line 881
    .line 882
    move-wide v2, v1

    .line 883
    invoke-virtual {v0, v7}, Lh7;->t(I)I

    .line 884
    .line 885
    .line 886
    move-result v1

    .line 887
    shr-long v4, v2, v49

    .line 888
    .line 889
    long-to-int v4, v4

    .line 890
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 891
    .line 892
    .line 893
    move-result-object v4

    .line 894
    and-long v2, v2, v47

    .line 895
    .line 896
    long-to-int v2, v2

    .line 897
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 898
    .line 899
    .line 900
    move-result-object v3

    .line 901
    invoke-virtual/range {v50 .. v50}, Ljava/lang/String;->length()I

    .line 902
    .line 903
    .line 904
    move-result v2

    .line 905
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 906
    .line 907
    .line 908
    move-result-object v2

    .line 909
    invoke-static/range {v50 .. v50}, Lh7;->I(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 910
    .line 911
    .line 912
    move-result-object v5

    .line 913
    move-object v13, v4

    .line 914
    move-object v4, v2

    .line 915
    move-object v2, v13

    .line 916
    move-object/from16 v13, v51

    .line 917
    .line 918
    invoke-virtual/range {v0 .. v5}, Lh7;->i(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    .line 919
    .line 920
    .line 921
    move-result-object v1

    .line 922
    invoke-virtual {v0, v1}, Lh7;->v(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 923
    .line 924
    .line 925
    move/from16 v2, v40

    .line 926
    .line 927
    invoke-virtual {v0, v2}, Lh7;->z(I)V

    .line 928
    .line 929
    .line 930
    :cond_26
    :goto_19
    move-object/from16 v1, v39

    .line 931
    .line 932
    goto/16 :goto_22

    .line 933
    .line 934
    :cond_27
    move/from16 v2, v40

    .line 935
    .line 936
    move-object/from16 v13, v51

    .line 937
    .line 938
    invoke-static {v4, v11}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 939
    .line 940
    .line 941
    move-result v3

    .line 942
    if-nez v3, :cond_38

    .line 943
    .line 944
    sget-object v3, Lvn2;->w:Lyn2;

    .line 945
    .line 946
    invoke-static {v4, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 947
    .line 948
    .line 949
    move-result v3

    .line 950
    if-eqz v3, :cond_28

    .line 951
    .line 952
    move-object/from16 v1, v39

    .line 953
    .line 954
    const/4 v5, 0x0

    .line 955
    goto/16 :goto_1f

    .line 956
    .line 957
    :cond_28
    sget-object v3, Lvn2;->l:Lyn2;

    .line 958
    .line 959
    invoke-static {v4, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 960
    .line 961
    .line 962
    move-result v3

    .line 963
    if-eqz v3, :cond_2a

    .line 964
    .line 965
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 966
    .line 967
    .line 968
    check-cast v1, Ljava/lang/Boolean;

    .line 969
    .line 970
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 971
    .line 972
    .line 973
    move-result v1

    .line 974
    if-eqz v1, :cond_29

    .line 975
    .line 976
    invoke-virtual {v0, v2}, Lh7;->t(I)I

    .line 977
    .line 978
    .line 979
    move-result v1

    .line 980
    const/16 v3, 0x8

    .line 981
    .line 982
    invoke-virtual {v0, v1, v3}, Lh7;->h(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 983
    .line 984
    .line 985
    move-result-object v1

    .line 986
    invoke-virtual {v0, v1}, Lh7;->v(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 987
    .line 988
    .line 989
    goto :goto_1a

    .line 990
    :cond_29
    const/16 v3, 0x8

    .line 991
    .line 992
    :goto_1a
    invoke-virtual {v0, v2}, Lh7;->t(I)I

    .line 993
    .line 994
    .line 995
    move-result v1

    .line 996
    const/16 v4, 0x800

    .line 997
    .line 998
    invoke-static {v0, v1, v4, v13, v3}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    .line 999
    .line 1000
    .line 1001
    goto :goto_19

    .line 1002
    :cond_2a
    sget-object v3, Lkn2;->x:Lyn2;

    .line 1003
    .line 1004
    invoke-static {v4, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1005
    .line 1006
    .line 1007
    move-result v5

    .line 1008
    if-eqz v5, :cond_30

    .line 1009
    .line 1010
    invoke-virtual {v6, v3}, Lln2;->c(Lyn2;)Ljava/lang/Object;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v1

    .line 1014
    check-cast v1, Ljava/util/List;

    .line 1015
    .line 1016
    invoke-virtual {v14, v3}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v3

    .line 1020
    if-nez v3, :cond_2b

    .line 1021
    .line 1022
    move-object/from16 v3, v27

    .line 1023
    .line 1024
    :cond_2b
    check-cast v3, Ljava/util/List;

    .line 1025
    .line 1026
    if-eqz v3, :cond_2e

    .line 1027
    .line 1028
    sget-object v4, Lfd2;->a:Lsk1;

    .line 1029
    .line 1030
    new-instance v4, Lsk1;

    .line 1031
    .line 1032
    invoke-direct {v4}, Lsk1;-><init>()V

    .line 1033
    .line 1034
    .line 1035
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 1036
    .line 1037
    .line 1038
    move-result v5

    .line 1039
    if-gtz v5, :cond_2d

    .line 1040
    .line 1041
    new-instance v1, Lsk1;

    .line 1042
    .line 1043
    invoke-direct {v1}, Lsk1;-><init>()V

    .line 1044
    .line 1045
    .line 1046
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1047
    .line 1048
    .line 1049
    move-result v5

    .line 1050
    if-gtz v5, :cond_2c

    .line 1051
    .line 1052
    invoke-virtual {v4, v1}, Lsk1;->equals(Ljava/lang/Object;)Z

    .line 1053
    .line 1054
    .line 1055
    move-result v1

    .line 1056
    xor-int/lit8 v37, v1, 0x1

    .line 1057
    .line 1058
    const/4 v5, 0x0

    .line 1059
    goto/16 :goto_19

    .line 1060
    .line 1061
    :cond_2c
    const/4 v5, 0x0

    .line 1062
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1067
    .line 1068
    .line 1069
    invoke-static {}, Lc80;->g()V

    .line 1070
    .line 1071
    .line 1072
    return-void

    .line 1073
    :cond_2d
    const/4 v5, 0x0

    .line 1074
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v0

    .line 1078
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1079
    .line 1080
    .line 1081
    invoke-static {}, Lc80;->g()V

    .line 1082
    .line 1083
    .line 1084
    return-void

    .line 1085
    :cond_2e
    const/4 v5, 0x0

    .line 1086
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1087
    .line 1088
    .line 1089
    move-result v1

    .line 1090
    if-nez v1, :cond_26

    .line 1091
    .line 1092
    :cond_2f
    :goto_1b
    move/from16 v37, v36

    .line 1093
    .line 1094
    goto/16 :goto_19

    .line 1095
    .line 1096
    :cond_30
    const/4 v5, 0x0

    .line 1097
    instance-of v3, v1, Lq3;

    .line 1098
    .line 1099
    if-eqz v3, :cond_2f

    .line 1100
    .line 1101
    check-cast v1, Lq3;

    .line 1102
    .line 1103
    invoke-virtual {v14, v4}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v3

    .line 1107
    if-nez v3, :cond_31

    .line 1108
    .line 1109
    move-object/from16 v3, v27

    .line 1110
    .line 1111
    :cond_31
    if-ne v1, v3, :cond_32

    .line 1112
    .line 1113
    goto :goto_1d

    .line 1114
    :cond_32
    instance-of v4, v3, Lq3;

    .line 1115
    .line 1116
    if-nez v4, :cond_33

    .line 1117
    .line 1118
    goto :goto_1c

    .line 1119
    :cond_33
    iget-object v4, v1, Lq3;->a:Ljava/lang/String;

    .line 1120
    .line 1121
    check-cast v3, Lq3;

    .line 1122
    .line 1123
    iget-object v11, v3, Lq3;->b:Lun0;

    .line 1124
    .line 1125
    iget-object v3, v3, Lq3;->a:Ljava/lang/String;

    .line 1126
    .line 1127
    invoke-static {v4, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1128
    .line 1129
    .line 1130
    move-result v3

    .line 1131
    if-nez v3, :cond_34

    .line 1132
    .line 1133
    goto :goto_1c

    .line 1134
    :cond_34
    iget-object v1, v1, Lq3;->b:Lun0;

    .line 1135
    .line 1136
    if-nez v1, :cond_35

    .line 1137
    .line 1138
    if-eqz v11, :cond_35

    .line 1139
    .line 1140
    goto :goto_1c

    .line 1141
    :cond_35
    if-eqz v1, :cond_36

    .line 1142
    .line 1143
    if-nez v11, :cond_36

    .line 1144
    .line 1145
    :goto_1c
    move v1, v5

    .line 1146
    goto :goto_1e

    .line 1147
    :cond_36
    :goto_1d
    move/from16 v1, v36

    .line 1148
    .line 1149
    :goto_1e
    if-nez v1, :cond_37

    .line 1150
    .line 1151
    goto :goto_1b

    .line 1152
    :cond_37
    move/from16 v37, v5

    .line 1153
    .line 1154
    goto/16 :goto_19

    .line 1155
    .line 1156
    :cond_38
    const/4 v5, 0x0

    .line 1157
    move-object/from16 v1, v39

    .line 1158
    .line 1159
    :goto_1f
    iget-object v3, v1, Lqn2;->c:Lr61;

    .line 1160
    .line 1161
    invoke-virtual {v0, v3}, Lh7;->p(Lr61;)V

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1165
    .line 1166
    .line 1167
    move-result v3

    .line 1168
    move v4, v5

    .line 1169
    :goto_20
    if-ge v4, v3, :cond_3a

    .line 1170
    .line 1171
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v28

    .line 1175
    move-object/from16 v5, v28

    .line 1176
    .line 1177
    check-cast v5, Ljl2;

    .line 1178
    .line 1179
    iget v5, v5, Ljl2;->h:I

    .line 1180
    .line 1181
    if-ne v5, v7, :cond_39

    .line 1182
    .line 1183
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v3

    .line 1187
    check-cast v3, Ljl2;

    .line 1188
    .line 1189
    goto :goto_21

    .line 1190
    :cond_39
    add-int/lit8 v4, v4, 0x1

    .line 1191
    .line 1192
    const/4 v5, 0x0

    .line 1193
    goto :goto_20

    .line 1194
    :cond_3a
    move-object/from16 v3, v27

    .line 1195
    .line 1196
    :goto_21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v10, v11}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v4

    .line 1203
    if-nez v4, :cond_3b

    .line 1204
    .line 1205
    move-object/from16 v4, v27

    .line 1206
    .line 1207
    :cond_3b
    check-cast v4, Lel2;

    .line 1208
    .line 1209
    iput-object v4, v3, Ljl2;->l:Lel2;

    .line 1210
    .line 1211
    sget-object v4, Lvn2;->w:Lyn2;

    .line 1212
    .line 1213
    invoke-virtual {v10, v4}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v4

    .line 1217
    if-nez v4, :cond_3c

    .line 1218
    .line 1219
    move-object/from16 v4, v27

    .line 1220
    .line 1221
    :cond_3c
    check-cast v4, Lel2;

    .line 1222
    .line 1223
    iput-object v4, v3, Ljl2;->m:Lel2;

    .line 1224
    .line 1225
    iget-object v4, v3, Ljl2;->i:Ljava/util/List;

    .line 1226
    .line 1227
    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1228
    .line 1229
    .line 1230
    move-result v4

    .line 1231
    if-nez v4, :cond_3d

    .line 1232
    .line 1233
    goto :goto_22

    .line 1234
    :cond_3d
    iget-object v4, v0, Lh7;->k:Lb7;

    .line 1235
    .line 1236
    invoke-virtual {v4}, Lb7;->getSnapshotObserver()Lbw1;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v4

    .line 1240
    new-instance v5, Lt6;

    .line 1241
    .line 1242
    move/from16 v11, v36

    .line 1243
    .line 1244
    invoke-direct {v5, v11, v3, v0}, Lt6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1245
    .line 1246
    .line 1247
    iget-object v4, v4, Lbw1;->a:Lts2;

    .line 1248
    .line 1249
    iget-object v11, v0, Lh7;->T:Lg7;

    .line 1250
    .line 1251
    invoke-virtual {v4, v3, v11, v5}, Lts2;->c(Ljava/lang/Object;Lin0;Lxm0;)V

    .line 1252
    .line 1253
    .line 1254
    :goto_22
    const/16 v3, 0x8

    .line 1255
    .line 1256
    goto :goto_23

    .line 1257
    :cond_3e
    move-object/from16 v42, v4

    .line 1258
    .line 1259
    move-object/from16 v52, v7

    .line 1260
    .line 1261
    move-object/from16 v53, v8

    .line 1262
    .line 1263
    move/from16 v43, v11

    .line 1264
    .line 1265
    move-wide/from16 v45, v13

    .line 1266
    .line 1267
    move v8, v1

    .line 1268
    move-object v13, v2

    .line 1269
    move v7, v3

    .line 1270
    move-object v14, v5

    .line 1271
    move-object/from16 v1, v39

    .line 1272
    .line 1273
    move/from16 v2, v40

    .line 1274
    .line 1275
    goto :goto_22

    .line 1276
    :goto_23
    shr-long v4, v45, v3

    .line 1277
    .line 1278
    add-int/lit8 v11, v43, 0x1

    .line 1279
    .line 1280
    move-object/from16 v39, v1

    .line 1281
    .line 1282
    move/from16 v40, v2

    .line 1283
    .line 1284
    move/from16 v29, v3

    .line 1285
    .line 1286
    move v3, v7

    .line 1287
    move v1, v8

    .line 1288
    move-object v2, v13

    .line 1289
    move-object/from16 v7, v52

    .line 1290
    .line 1291
    move-object/from16 v8, v53

    .line 1292
    .line 1293
    const/16 v36, 0x1

    .line 1294
    .line 1295
    move-wide/from16 v56, v4

    .line 1296
    .line 1297
    move-object v5, v14

    .line 1298
    move-wide/from16 v13, v56

    .line 1299
    .line 1300
    move-object/from16 v4, v42

    .line 1301
    .line 1302
    goto/16 :goto_4

    .line 1303
    .line 1304
    :cond_3f
    move-object v13, v2

    .line 1305
    move-object/from16 v42, v4

    .line 1306
    .line 1307
    move-object v14, v5

    .line 1308
    move-object/from16 v52, v7

    .line 1309
    .line 1310
    move-object/from16 v53, v8

    .line 1311
    .line 1312
    move/from16 v2, v40

    .line 1313
    .line 1314
    move v8, v1

    .line 1315
    move v7, v3

    .line 1316
    move/from16 v3, v29

    .line 1317
    .line 1318
    move-object/from16 v1, v39

    .line 1319
    .line 1320
    if-ne v12, v3, :cond_42

    .line 1321
    .line 1322
    :goto_24
    move/from16 v3, v41

    .line 1323
    .line 1324
    goto :goto_25

    .line 1325
    :cond_40
    move-object v13, v2

    .line 1326
    move-object/from16 v42, v4

    .line 1327
    .line 1328
    move-object v14, v5

    .line 1329
    move-object/from16 v52, v7

    .line 1330
    .line 1331
    move-object/from16 v53, v8

    .line 1332
    .line 1333
    move/from16 v2, v40

    .line 1334
    .line 1335
    move v8, v1

    .line 1336
    move v7, v3

    .line 1337
    move-object/from16 v1, v39

    .line 1338
    .line 1339
    goto :goto_24

    .line 1340
    :goto_25
    if-eq v3, v8, :cond_42

    .line 1341
    .line 1342
    add-int/lit8 v11, v3, 0x1

    .line 1343
    .line 1344
    move-object/from16 v39, v1

    .line 1345
    .line 1346
    move v12, v2

    .line 1347
    move v3, v7

    .line 1348
    move v1, v8

    .line 1349
    move-object v2, v13

    .line 1350
    move-object v5, v14

    .line 1351
    move-object/from16 v4, v42

    .line 1352
    .line 1353
    move-object/from16 v7, v52

    .line 1354
    .line 1355
    move-object/from16 v8, v53

    .line 1356
    .line 1357
    const/16 v29, 0x8

    .line 1358
    .line 1359
    goto/16 :goto_3

    .line 1360
    .line 1361
    :cond_41
    move-object/from16 v42, v4

    .line 1362
    .line 1363
    move-object/from16 v52, v7

    .line 1364
    .line 1365
    move-object/from16 v53, v8

    .line 1366
    .line 1367
    move/from16 v38, v13

    .line 1368
    .line 1369
    move-object v1, v14

    .line 1370
    move-object v13, v2

    .line 1371
    move v7, v3

    .line 1372
    const/16 v37, 0x0

    .line 1373
    .line 1374
    :cond_42
    if-nez v37, :cond_45

    .line 1375
    .line 1376
    invoke-virtual/range {v42 .. v42}, Lln2;->iterator()Ljava/util/Iterator;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v2

    .line 1380
    :cond_43
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1381
    .line 1382
    .line 1383
    move-result v3

    .line 1384
    if-eqz v3, :cond_44

    .line 1385
    .line 1386
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v3

    .line 1390
    check-cast v3, Ljava/util/Map$Entry;

    .line 1391
    .line 1392
    invoke-virtual {v1}, Lqn2;->k()Lln2;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v4

    .line 1396
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v3

    .line 1400
    check-cast v3, Lyn2;

    .line 1401
    .line 1402
    iget-object v4, v4, Lln2;->h:Lrk1;

    .line 1403
    .line 1404
    invoke-virtual {v4, v3}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 1405
    .line 1406
    .line 1407
    move-result v3

    .line 1408
    if-nez v3, :cond_43

    .line 1409
    .line 1410
    const/4 v11, 0x1

    .line 1411
    goto :goto_26

    .line 1412
    :cond_44
    const/4 v11, 0x0

    .line 1413
    :goto_26
    move/from16 v37, v11

    .line 1414
    .line 1415
    :cond_45
    if-eqz v37, :cond_46

    .line 1416
    .line 1417
    invoke-virtual {v0, v7}, Lh7;->t(I)I

    .line 1418
    .line 1419
    .line 1420
    move-result v1

    .line 1421
    const/16 v3, 0x8

    .line 1422
    .line 1423
    const/16 v14, 0x800

    .line 1424
    .line 1425
    invoke-static {v0, v1, v14, v13, v3}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    .line 1426
    .line 1427
    .line 1428
    goto :goto_28

    .line 1429
    :cond_46
    const/16 v3, 0x8

    .line 1430
    .line 1431
    goto :goto_28

    .line 1432
    :cond_47
    const-string v0, "no value for specified key"

    .line 1433
    .line 1434
    invoke-static {v0}, Lvi0;->e(Ljava/lang/String;)Lpv;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v0

    .line 1438
    throw v0

    .line 1439
    :cond_48
    :goto_27
    move/from16 v34, v1

    .line 1440
    .line 1441
    move-object/from16 v52, v7

    .line 1442
    .line 1443
    move-object/from16 v53, v8

    .line 1444
    .line 1445
    move-object/from16 v30, v10

    .line 1446
    .line 1447
    move-object/from16 v31, v11

    .line 1448
    .line 1449
    move v3, v12

    .line 1450
    move/from16 v38, v13

    .line 1451
    .line 1452
    move-object v13, v2

    .line 1453
    :goto_28
    shr-long v21, v21, v3

    .line 1454
    .line 1455
    add-int/lit8 v1, v34, 0x1

    .line 1456
    .line 1457
    move-object/from16 v6, p1

    .line 1458
    .line 1459
    move v12, v3

    .line 1460
    move-object v2, v13

    .line 1461
    move-object/from16 v10, v30

    .line 1462
    .line 1463
    move-object/from16 v11, v31

    .line 1464
    .line 1465
    move/from16 v13, v38

    .line 1466
    .line 1467
    move-object/from16 v7, v52

    .line 1468
    .line 1469
    move-object/from16 v8, v53

    .line 1470
    .line 1471
    const/4 v14, 0x0

    .line 1472
    goto/16 :goto_1

    .line 1473
    .line 1474
    :cond_49
    move-object/from16 v52, v7

    .line 1475
    .line 1476
    move-object/from16 v53, v8

    .line 1477
    .line 1478
    move-object/from16 v30, v10

    .line 1479
    .line 1480
    move-object/from16 v31, v11

    .line 1481
    .line 1482
    move v3, v12

    .line 1483
    move v12, v13

    .line 1484
    move-object v13, v2

    .line 1485
    if-ne v12, v3, :cond_4b

    .line 1486
    .line 1487
    :goto_29
    move/from16 v1, v17

    .line 1488
    .line 1489
    goto :goto_2a

    .line 1490
    :cond_4a
    move-object v13, v2

    .line 1491
    move-object/from16 v52, v7

    .line 1492
    .line 1493
    move-object/from16 v53, v8

    .line 1494
    .line 1495
    move-object/from16 v30, v10

    .line 1496
    .line 1497
    move-object/from16 v31, v11

    .line 1498
    .line 1499
    goto :goto_29

    .line 1500
    :goto_2a
    if-eq v15, v1, :cond_4b

    .line 1501
    .line 1502
    add-int/lit8 v15, v15, 0x1

    .line 1503
    .line 1504
    move-object/from16 v6, p1

    .line 1505
    .line 1506
    move-object v2, v13

    .line 1507
    move/from16 v12, v16

    .line 1508
    .line 1509
    move-object/from16 v10, v30

    .line 1510
    .line 1511
    move-object/from16 v11, v31

    .line 1512
    .line 1513
    move-object/from16 v7, v52

    .line 1514
    .line 1515
    move-object/from16 v8, v53

    .line 1516
    .line 1517
    const/4 v14, 0x0

    .line 1518
    move v13, v1

    .line 1519
    goto/16 :goto_0

    .line 1520
    .line 1521
    :cond_4b
    return-void
.end method

.method public final B(Lr61;Lak1;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lr61;->H()Z

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
    iget-object v0, p0, Lh7;->k:Lb7;

    .line 10
    .line 11
    invoke-virtual {v0}, Lb7;->getAndroidViewsHandler$ui()Lnc;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lnc;->getLayoutNodeToHolder()Ljava/util/HashMap;

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
    iget-object v0, p1, Lr61;->M:Lvn1;

    .line 28
    .line 29
    const/16 v1, 0x8

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lvn1;->m(I)Z

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
    invoke-virtual {p1}, Lr61;->u()Lr61;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_0
    if-eqz p1, :cond_4

    .line 44
    .line 45
    iget-object v0, p1, Lr61;->M:Lvn1;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lvn1;->m(I)Z

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
    invoke-virtual {p1}, Lr61;->u()Lr61;

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
    invoke-virtual {p1}, Lr61;->w()Lln2;

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
    iget-boolean v0, v0, Lln2;->j:Z

    .line 70
    .line 71
    const/4 v3, 0x1

    .line 72
    if-nez v0, :cond_8

    .line 73
    .line 74
    invoke-virtual {p1}, Lr61;->u()Lr61;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :goto_2
    if-eqz v0, :cond_7

    .line 79
    .line 80
    invoke-virtual {v0}, Lr61;->w()Lln2;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    if-eqz v4, :cond_6

    .line 85
    .line 86
    iget-boolean v4, v4, Lln2;->j:Z

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
    invoke-virtual {v0}, Lr61;->u()Lr61;

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
    iget p1, p1, Lr61;->i:I

    .line 101
    .line 102
    invoke-virtual {p2, p1}, Lak1;->a(I)Z

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
    invoke-virtual {p0, p1}, Lh7;->t(I)I

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
    invoke-static {p0, p1, p2, v0, v1}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    .line 120
    .line 121
    .line 122
    :cond_a
    :goto_4
    return-void
.end method

.method public final C(Lr61;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lr61;->H()Z

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
    iget-object v0, p0, Lh7;->k:Lb7;

    .line 9
    .line 10
    invoke-virtual {v0}, Lb7;->getAndroidViewsHandler$ui()Lnc;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lnc;->getLayoutNodeToHolder()Ljava/util/HashMap;

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
    iget p1, p1, Lr61;->i:I

    .line 26
    .line 27
    iget-object v0, p0, Lh7;->w:Lzj1;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lx01;->b(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lel2;

    .line 34
    .line 35
    iget-object v1, p0, Lh7;->x:Lzj1;

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Lx01;->b(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lel2;

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
    invoke-virtual {p0, p1, v2}, Lh7;->h(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    iget-object v2, v0, Lel2;->a:Lxm0;

    .line 57
    .line 58
    invoke-interface {v2}, Lxm0;->a()Ljava/lang/Object;

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
    iget-object v0, v0, Lel2;->b:Lxm0;

    .line 73
    .line 74
    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

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
    iget-object v0, v1, Lel2;->a:Lxm0;

    .line 91
    .line 92
    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

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
    iget-object v0, v1, Lel2;->b:Lxm0;

    .line 107
    .line 108
    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Lh7;->v(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public final D(Lqn2;IIZ)Z
    .locals 10

    .line 1
    iget-object v0, p1, Lqn2;->d:Lln2;

    .line 2
    .line 3
    iget v1, p1, Lqn2;->f:I

    .line 4
    .line 5
    sget-object v2, Lkn2;->j:Lyn2;

    .line 6
    .line 7
    iget-object v0, v0, Lln2;->h:Lrk1;

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lrk1;->c(Ljava/lang/Object;)Z

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
    invoke-static {p1}, Lrg3;->j(Lqn2;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object p0, p1, Lqn2;->d:Lln2;

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Lln2;->c(Lyn2;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lq3;

    .line 29
    .line 30
    iget-object p0, p0, Lq3;->b:Lun0;

    .line 31
    .line 32
    check-cast p0, Lnn0;

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
    invoke-interface {p0, p1, p2, p3}, Lnn0;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
    iget p4, p0, Lh7;->A:I

    .line 62
    .line 63
    if-ne p3, p4, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-static {p1}, Lh7;->m(Lqn2;)Ljava/lang/String;

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
    iput p2, p0, Lh7;->A:I

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
    invoke-virtual {p0, v1}, Lh7;->t(I)I

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
    iget p3, p0, Lh7;->A:I

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
    iget p3, p0, Lh7;->A:I

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
    invoke-virtual/range {v4 .. v9}, Lh7;->i(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {v4, p0}, Lh7;->v(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v1}, Lh7;->z(I)V

    .line 142
    .line 143
    .line 144
    return p2
.end method

.method public final F(FFFF)Landroid/graphics/Rect;
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
    iget-object p0, p0, Lh7;->k:Lb7;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Lb7;->u(J)J

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
    invoke-virtual {p0, p3, p4}, Lb7;->u(J)J

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

.method public final J()V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lak1;

    .line 4
    .line 5
    invoke-direct {v1}, Lak1;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lh7;->H:Lak1;

    .line 9
    .line 10
    iget-object v3, v2, Lak1;->b:[I

    .line 11
    .line 12
    iget-object v4, v2, Lak1;->a:[J

    .line 13
    .line 14
    array-length v5, v4

    .line 15
    add-int/lit8 v5, v5, -0x2

    .line 16
    .line 17
    iget-object v6, v0, Lh7;->N:Lzj1;

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
    invoke-virtual {v0}, Lh7;->l()Lx01;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-virtual {v8, v13}, Lx01;->b(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    check-cast v8, Lsn2;

    .line 77
    .line 78
    const/16 v23, 0x0

    .line 79
    .line 80
    if-eqz v8, :cond_0

    .line 81
    .line 82
    iget-object v8, v8, Lsn2;->a:Lqn2;

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
    iget-object v8, v8, Lqn2;->d:Lln2;

    .line 90
    .line 91
    sget-object v15, Lvn2;->d:Lyn2;

    .line 92
    .line 93
    iget-object v8, v8, Lln2;->h:Lrk1;

    .line 94
    .line 95
    invoke-virtual {v8, v15}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-nez v8, :cond_5

    .line 100
    .line 101
    :cond_1
    invoke-virtual {v1, v13}, Lak1;->a(I)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, v13}, Lx01;->b(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    check-cast v8, Lrn2;

    .line 109
    .line 110
    if-eqz v8, :cond_3

    .line 111
    .line 112
    iget-object v8, v8, Lrn2;->a:Lln2;

    .line 113
    .line 114
    sget-object v15, Lvn2;->d:Lyn2;

    .line 115
    .line 116
    iget-object v8, v8, Lln2;->h:Lrk1;

    .line 117
    .line 118
    invoke-virtual {v8, v15}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {v0, v8, v13, v15}, Lh7;->y(Ljava/lang/String;II)V

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
    iget-object v3, v1, Lak1;->b:[I

    .line 170
    .line 171
    iget-object v1, v1, Lak1;->a:[J

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
    iget v15, v2, Lak1;->c:I

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
    iget-object v14, v2, Lak1;->a:[J

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
    iget-object v1, v2, Lak1;->b:[I

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
    invoke-virtual {v2, v1}, Lak1;->f(I)V

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
    invoke-virtual {v6}, Lzj1;->c()V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0}, Lh7;->l()Lx01;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    iget-object v3, v1, Lx01;->b:[I

    .line 396
    .line 397
    iget-object v4, v1, Lx01;->c:[Ljava/lang/Object;

    .line 398
    .line 399
    iget-object v1, v1, Lx01;->a:[J

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
    check-cast v11, Lsn2;

    .line 445
    .line 446
    iget-object v11, v11, Lsn2;->a:Lqn2;

    .line 447
    .line 448
    iget-object v13, v11, Lqn2;->d:Lln2;

    .line 449
    .line 450
    sget-object v15, Lvn2;->d:Lyn2;

    .line 451
    .line 452
    iget-object v13, v13, Lln2;->h:Lrk1;

    .line 453
    .line 454
    invoke-virtual {v13, v15}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v13

    .line 458
    if-eqz v13, :cond_12

    .line 459
    .line 460
    invoke-virtual {v2, v12}, Lak1;->a(I)Z

    .line 461
    .line 462
    .line 463
    move-result v13

    .line 464
    if-eqz v13, :cond_12

    .line 465
    .line 466
    iget-object v13, v11, Lqn2;->d:Lln2;

    .line 467
    .line 468
    invoke-virtual {v13, v15}, Lln2;->c(Lyn2;)Ljava/lang/Object;

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
    invoke-virtual {v0, v13, v12, v15}, Lh7;->y(Ljava/lang/String;II)V

    .line 477
    .line 478
    .line 479
    :cond_12
    new-instance v13, Lrn2;

    .line 480
    .line 481
    invoke-virtual {v0}, Lh7;->l()Lx01;

    .line 482
    .line 483
    .line 484
    move-result-object v15

    .line 485
    invoke-direct {v13, v11, v15}, Lrn2;-><init>(Lqn2;Lx01;)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v6, v12, v13}, Lzj1;->h(ILjava/lang/Object;)V

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
    new-instance v1, Lrn2;

    .line 510
    .line 511
    iget-object v2, v0, Lh7;->k:Lb7;

    .line 512
    .line 513
    invoke-virtual {v2}, Lb7;->getSemanticsOwner()Ltn2;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    invoke-virtual {v2}, Ltn2;->a()Lqn2;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    invoke-virtual {v0}, Lh7;->l()Lx01;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-direct {v1, v2, v3}, Lrn2;-><init>(Lqn2;Lx01;)V

    .line 526
    .line 527
    .line 528
    iput-object v1, v0, Lh7;->O:Lrn2;

    .line 529
    .line 530
    return-void
.end method

.method public final a(Landroid/view/View;)Ln4;
    .locals 0

    .line 1
    iget-object p0, p0, Lh7;->q:Lc7;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c(ILl4;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 19

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
    iget-object v3, v3, Ll4;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 12
    .line 13
    invoke-virtual {v0}, Lh7;->l()Lx01;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {v5, v1}, Lx01;->b(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    check-cast v5, Lsn2;

    .line 22
    .line 23
    if-eqz v5, :cond_1b

    .line 24
    .line 25
    iget-object v5, v5, Lsn2;->a:Lqn2;

    .line 26
    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    goto/16 :goto_c

    .line 30
    .line 31
    :cond_0
    iget-object v6, v5, Lqn2;->c:Lr61;

    .line 32
    .line 33
    iget-object v7, v5, Lqn2;->d:Lln2;

    .line 34
    .line 35
    iget-object v8, v7, Lln2;->h:Lrk1;

    .line 36
    .line 37
    invoke-static {v5}, Lh7;->m(Lqn2;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    iget-object v10, v0, Lh7;->K:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v2, v10}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, v0, Lh7;->I:Lxj1;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lxj1;->d(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eq v0, v11, :cond_1b

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
    iget-object v10, v0, Lh7;->L:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v2, v10}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    if-eqz v10, :cond_2

    .line 73
    .line 74
    iget-object v0, v0, Lh7;->J:Lxj1;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Lxj1;->d(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eq v0, v11, :cond_1b

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
    sget-object v1, Lkn2;->a:Lyn2;

    .line 91
    .line 92
    invoke-virtual {v8, v1}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    iget-object v10, v0, Lh7;->k:Lb7;

    .line 97
    .line 98
    const/4 v12, 0x0

    .line 99
    if-eqz v1, :cond_d

    .line 100
    .line 101
    if-eqz v4, :cond_d

    .line 102
    .line 103
    const-string v1, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    .line 104
    .line 105
    invoke-static {v2, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_d

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
    if-lez v1, :cond_c

    .line 124
    .line 125
    if-ltz v0, :cond_c

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
    goto/16 :goto_6

    .line 140
    .line 141
    :cond_4
    invoke-static {v7}, Leu;->N(Lln2;)Ly03;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    if-nez v4, :cond_5

    .line 146
    .line 147
    goto/16 :goto_c

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
    if-ge v7, v1, :cond_b

    .line 156
    .line 157
    add-int v8, v0, v7

    .line 158
    .line 159
    iget-object v9, v4, Ly03;->a:Lx03;

    .line 160
    .line 161
    iget-object v9, v9, Lx03;->a:Lsd;

    .line 162
    .line 163
    iget-object v9, v9, Lsd;->i:Ljava/lang/String;

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
    move/from16 v18, v0

    .line 175
    .line 176
    move/from16 p4, v1

    .line 177
    .line 178
    move-object v15, v10

    .line 179
    goto/16 :goto_5

    .line 180
    .line 181
    :cond_6
    invoke-virtual {v4, v8}, Ly03;->b(I)Lo62;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    invoke-virtual {v5}, Lqn2;->d()Lzn1;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    const-wide/16 v14, 0x0

    .line 190
    .line 191
    if-eqz v9, :cond_8

    .line 192
    .line 193
    invoke-virtual {v9}, Lzn1;->S0()Lth1;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    iget-boolean v11, v11, Lth1;->u:Z

    .line 198
    .line 199
    if-eqz v11, :cond_7

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_7
    move-object v9, v12

    .line 203
    :goto_2
    if-eqz v9, :cond_8

    .line 204
    .line 205
    invoke-virtual {v9, v14, v15}, Lzn1;->M(J)J

    .line 206
    .line 207
    .line 208
    move-result-wide v14

    .line 209
    :cond_8
    invoke-virtual {v8, v14, v15}, Lo62;->i(J)Lo62;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    invoke-virtual {v5}, Lqn2;->g()Lo62;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    invoke-virtual {v8, v9}, Lo62;->g(Lo62;)Z

    .line 218
    .line 219
    .line 220
    move-result v11

    .line 221
    if-eqz v11, :cond_9

    .line 222
    .line 223
    invoke-virtual {v8, v9}, Lo62;->e(Lo62;)Lo62;

    .line 224
    .line 225
    .line 226
    move-result-object v8

    .line 227
    goto :goto_3

    .line 228
    :cond_9
    move-object v8, v12

    .line 229
    :goto_3
    if-eqz v8, :cond_a

    .line 230
    .line 231
    iget v9, v8, Lo62;->a:F

    .line 232
    .line 233
    iget v11, v8, Lo62;->b:F

    .line 234
    .line 235
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 236
    .line 237
    .line 238
    move-result v9

    .line 239
    int-to-long v14, v9

    .line 240
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 241
    .line 242
    .line 243
    move-result v9

    .line 244
    int-to-long v12, v9

    .line 245
    const/16 v9, 0x20

    .line 246
    .line 247
    shl-long/2addr v14, v9

    .line 248
    const-wide v16, 0xffffffffL

    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    and-long v11, v12, v16

    .line 254
    .line 255
    or-long/2addr v11, v14

    .line 256
    invoke-virtual {v10, v11, v12}, Lb7;->u(J)J

    .line 257
    .line 258
    .line 259
    move-result-wide v11

    .line 260
    iget v13, v8, Lo62;->c:F

    .line 261
    .line 262
    iget v8, v8, Lo62;->d:F

    .line 263
    .line 264
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 265
    .line 266
    .line 267
    move-result v13

    .line 268
    int-to-long v13, v13

    .line 269
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 270
    .line 271
    .line 272
    move-result v8

    .line 273
    move/from16 p0, v9

    .line 274
    .line 275
    move-object v15, v10

    .line 276
    int-to-long v9, v8

    .line 277
    shl-long v13, v13, p0

    .line 278
    .line 279
    and-long v8, v9, v16

    .line 280
    .line 281
    or-long/2addr v8, v13

    .line 282
    invoke-virtual {v15, v8, v9}, Lb7;->u(J)J

    .line 283
    .line 284
    .line 285
    move-result-wide v8

    .line 286
    new-instance v10, Landroid/graphics/RectF;

    .line 287
    .line 288
    shr-long v13, v11, p0

    .line 289
    .line 290
    long-to-int v13, v13

    .line 291
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 292
    .line 293
    .line 294
    move-result v14

    .line 295
    move/from16 v18, v0

    .line 296
    .line 297
    move/from16 p4, v1

    .line 298
    .line 299
    shr-long v0, v8, p0

    .line 300
    .line 301
    long-to-int v0, v0

    .line 302
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    invoke-static {v14, v1}, Ljava/lang/Math;->min(FF)F

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    and-long v11, v11, v16

    .line 311
    .line 312
    long-to-int v11, v11

    .line 313
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 314
    .line 315
    .line 316
    move-result v12

    .line 317
    and-long v8, v8, v16

    .line 318
    .line 319
    long-to-int v8, v8

    .line 320
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 321
    .line 322
    .line 323
    move-result v9

    .line 324
    invoke-static {v12, v9}, Ljava/lang/Math;->min(FF)F

    .line 325
    .line 326
    .line 327
    move-result v9

    .line 328
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 329
    .line 330
    .line 331
    move-result v12

    .line 332
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    invoke-static {v12, v0}, Ljava/lang/Math;->max(FF)F

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 341
    .line 342
    .line 343
    move-result v11

    .line 344
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 345
    .line 346
    .line 347
    move-result v8

    .line 348
    invoke-static {v11, v8}, Ljava/lang/Math;->max(FF)F

    .line 349
    .line 350
    .line 351
    move-result v8

    .line 352
    invoke-direct {v10, v1, v9, v0, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 353
    .line 354
    .line 355
    goto :goto_4

    .line 356
    :cond_a
    move/from16 v18, v0

    .line 357
    .line 358
    move/from16 p4, v1

    .line 359
    .line 360
    move-object v15, v10

    .line 361
    const/4 v10, 0x0

    .line 362
    :goto_4
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    :goto_5
    add-int/lit8 v7, v7, 0x1

    .line 366
    .line 367
    move/from16 v1, p4

    .line 368
    .line 369
    move-object v10, v15

    .line 370
    move/from16 v0, v18

    .line 371
    .line 372
    const/4 v12, 0x0

    .line 373
    goto/16 :goto_1

    .line 374
    .line 375
    :cond_b
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    const/4 v1, 0x0

    .line 380
    new-array v1, v1, [Landroid/graphics/RectF;

    .line 381
    .line 382
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    check-cast v1, [Landroid/os/Parcelable;

    .line 387
    .line 388
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 389
    .line 390
    .line 391
    return-void

    .line 392
    :cond_c
    :goto_6
    const-string v0, "AccessibilityDelegate"

    .line 393
    .line 394
    const-string v1, "Invalid arguments for accessibility character locations"

    .line 395
    .line 396
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 397
    .line 398
    .line 399
    return-void

    .line 400
    :cond_d
    move-object v15, v10

    .line 401
    sget-object v1, Lvn2;->A:Lyn2;

    .line 402
    .line 403
    invoke-virtual {v8, v1}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v7

    .line 407
    if-eqz v7, :cond_f

    .line 408
    .line 409
    if-eqz v4, :cond_f

    .line 410
    .line 411
    const-string v4, "androidx.compose.ui.semantics.testTag"

    .line 412
    .line 413
    invoke-static {v2, v4}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    if-eqz v4, :cond_f

    .line 418
    .line 419
    invoke-virtual {v8, v1}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    if-nez v0, :cond_e

    .line 424
    .line 425
    const/4 v12, 0x0

    .line 426
    goto :goto_7

    .line 427
    :cond_e
    move-object v12, v0

    .line 428
    :goto_7
    check-cast v12, Ljava/lang/String;

    .line 429
    .line 430
    if-eqz v12, :cond_1b

    .line 431
    .line 432
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-virtual {v0, v2, v12}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 437
    .line 438
    .line 439
    return-void

    .line 440
    :cond_f
    const-string v1, "androidx.compose.ui.semantics.id"

    .line 441
    .line 442
    invoke-static {v2, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    if-eqz v1, :cond_10

    .line 447
    .line 448
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    iget v1, v5, Lqn2;->f:I

    .line 453
    .line 454
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 455
    .line 456
    .line 457
    return-void

    .line 458
    :cond_10
    const-string v1, "androidx.compose.ui.semantics.shapeType"

    .line 459
    .line 460
    invoke-static {v2, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v4

    .line 464
    const-string v7, "androidx.compose.ui.semantics.shapeRegion"

    .line 465
    .line 466
    const-string v9, "androidx.compose.ui.semantics.shapeCorners"

    .line 467
    .line 468
    const-string v10, "androidx.compose.ui.semantics.shapeRect"

    .line 469
    .line 470
    if-eqz v4, :cond_15

    .line 471
    .line 472
    sget-object v2, Lvn2;->Q:Lyn2;

    .line 473
    .line 474
    invoke-virtual {v8, v2}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    if-nez v2, :cond_11

    .line 479
    .line 480
    const/4 v12, 0x0

    .line 481
    goto :goto_8

    .line 482
    :cond_11
    move-object v12, v2

    .line 483
    :goto_8
    check-cast v12, Leq2;

    .line 484
    .line 485
    if-eqz v12, :cond_1b

    .line 486
    .line 487
    new-instance v2, Landroid/graphics/Rect;

    .line 488
    .line 489
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v3, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0, v5, v2, v12}, Lh7;->n(Lqn2;Landroid/graphics/Rect;Leq2;)Lo62;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    iget v2, v0, Lo62;->b:F

    .line 500
    .line 501
    iget v4, v0, Lo62;->a:F

    .line 502
    .line 503
    invoke-virtual {v0}, Lo62;->c()J

    .line 504
    .line 505
    .line 506
    move-result-wide v13

    .line 507
    iget-object v0, v6, Lr61;->G:Ld61;

    .line 508
    .line 509
    invoke-virtual {v15}, Lb7;->getDensity()Le70;

    .line 510
    .line 511
    .line 512
    move-result-object v5

    .line 513
    invoke-interface {v12, v13, v14, v0, v5}, Leq2;->a(JLd61;Le70;)Lte;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    instance-of v5, v0, Ltv1;

    .line 518
    .line 519
    if-eqz v5, :cond_12

    .line 520
    .line 521
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 522
    .line 523
    .line 524
    move-result-object v5

    .line 525
    const/4 v6, 0x0

    .line 526
    invoke-virtual {v5, v1, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    invoke-static {v0, v4, v2}, Lh7;->E(Lte;FF)Landroid/graphics/Rect;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    invoke-virtual {v1, v10, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 538
    .line 539
    .line 540
    return-void

    .line 541
    :cond_12
    instance-of v5, v0, Luv1;

    .line 542
    .line 543
    if-eqz v5, :cond_13

    .line 544
    .line 545
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 546
    .line 547
    .line 548
    move-result-object v5

    .line 549
    const/4 v6, 0x1

    .line 550
    invoke-virtual {v5, v1, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    invoke-static {v0, v4, v2}, Lh7;->E(Lte;FF)Landroid/graphics/Rect;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    invoke-virtual {v1, v10, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    invoke-static {v0}, Lh7;->G(Lte;)[F

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-virtual {v1, v9, v0}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 573
    .line 574
    .line 575
    return-void

    .line 576
    :cond_13
    instance-of v5, v0, Lsv1;

    .line 577
    .line 578
    if-eqz v5, :cond_14

    .line 579
    .line 580
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 581
    .line 582
    .line 583
    move-result-object v5

    .line 584
    const/4 v6, 0x2

    .line 585
    invoke-virtual {v5, v1, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    invoke-static {v0, v4, v2}, Lh7;->H(Lte;FF)Landroid/graphics/Region;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-virtual {v1, v7, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 597
    .line 598
    .line 599
    return-void

    .line 600
    :cond_14
    invoke-static {}, Lc80;->s()V

    .line 601
    .line 602
    .line 603
    return-void

    .line 604
    :cond_15
    invoke-static {v2, v10}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    move-result v1

    .line 608
    if-eqz v1, :cond_17

    .line 609
    .line 610
    sget-object v1, Lvn2;->Q:Lyn2;

    .line 611
    .line 612
    invoke-virtual {v8, v1}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    if-nez v1, :cond_16

    .line 617
    .line 618
    const/4 v12, 0x0

    .line 619
    goto :goto_9

    .line 620
    :cond_16
    move-object v12, v1

    .line 621
    :goto_9
    check-cast v12, Leq2;

    .line 622
    .line 623
    if-eqz v12, :cond_1b

    .line 624
    .line 625
    new-instance v1, Landroid/graphics/Rect;

    .line 626
    .line 627
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v0, v5, v1, v12}, Lh7;->n(Lqn2;Landroid/graphics/Rect;Leq2;)Lo62;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    invoke-virtual {v0}, Lo62;->c()J

    .line 638
    .line 639
    .line 640
    move-result-wide v1

    .line 641
    iget-object v4, v6, Lr61;->G:Ld61;

    .line 642
    .line 643
    invoke-virtual {v15}, Lb7;->getDensity()Le70;

    .line 644
    .line 645
    .line 646
    move-result-object v5

    .line 647
    invoke-interface {v12, v1, v2, v4, v5}, Leq2;->a(JLd61;Le70;)Lte;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    iget v2, v0, Lo62;->a:F

    .line 652
    .line 653
    iget v0, v0, Lo62;->b:F

    .line 654
    .line 655
    invoke-static {v1, v2, v0}, Lh7;->E(Lte;FF)Landroid/graphics/Rect;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    if-eqz v0, :cond_1b

    .line 660
    .line 661
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 662
    .line 663
    .line 664
    move-result-object v1

    .line 665
    invoke-virtual {v1, v10, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 666
    .line 667
    .line 668
    return-void

    .line 669
    :cond_17
    invoke-static {v2, v9}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    move-result v1

    .line 673
    if-eqz v1, :cond_19

    .line 674
    .line 675
    sget-object v1, Lvn2;->Q:Lyn2;

    .line 676
    .line 677
    invoke-virtual {v8, v1}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    if-nez v1, :cond_18

    .line 682
    .line 683
    const/4 v12, 0x0

    .line 684
    goto :goto_a

    .line 685
    :cond_18
    move-object v12, v1

    .line 686
    :goto_a
    check-cast v12, Leq2;

    .line 687
    .line 688
    if-eqz v12, :cond_1b

    .line 689
    .line 690
    new-instance v1, Landroid/graphics/Rect;

    .line 691
    .line 692
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v0, v5, v1, v12}, Lh7;->n(Lqn2;Landroid/graphics/Rect;Leq2;)Lo62;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    invoke-virtual {v0}, Lo62;->c()J

    .line 703
    .line 704
    .line 705
    move-result-wide v0

    .line 706
    iget-object v2, v6, Lr61;->G:Ld61;

    .line 707
    .line 708
    invoke-virtual {v15}, Lb7;->getDensity()Le70;

    .line 709
    .line 710
    .line 711
    move-result-object v4

    .line 712
    invoke-interface {v12, v0, v1, v2, v4}, Leq2;->a(JLd61;Le70;)Lte;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    invoke-static {v0}, Lh7;->G(Lte;)[F

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    if-eqz v0, :cond_1b

    .line 721
    .line 722
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    invoke-virtual {v1, v9, v0}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 727
    .line 728
    .line 729
    return-void

    .line 730
    :cond_19
    invoke-static {v2, v7}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    move-result v1

    .line 734
    if-eqz v1, :cond_1b

    .line 735
    .line 736
    sget-object v1, Lvn2;->Q:Lyn2;

    .line 737
    .line 738
    invoke-virtual {v8, v1}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v1

    .line 742
    if-nez v1, :cond_1a

    .line 743
    .line 744
    const/4 v12, 0x0

    .line 745
    goto :goto_b

    .line 746
    :cond_1a
    move-object v12, v1

    .line 747
    :goto_b
    check-cast v12, Leq2;

    .line 748
    .line 749
    if-eqz v12, :cond_1b

    .line 750
    .line 751
    new-instance v1, Landroid/graphics/Rect;

    .line 752
    .line 753
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 757
    .line 758
    .line 759
    invoke-virtual {v0, v5, v1, v12}, Lh7;->n(Lqn2;Landroid/graphics/Rect;Leq2;)Lo62;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    invoke-virtual {v0}, Lo62;->c()J

    .line 764
    .line 765
    .line 766
    move-result-wide v1

    .line 767
    iget-object v4, v6, Lr61;->G:Ld61;

    .line 768
    .line 769
    invoke-virtual {v15}, Lb7;->getDensity()Le70;

    .line 770
    .line 771
    .line 772
    move-result-object v5

    .line 773
    invoke-interface {v12, v1, v2, v4, v5}, Leq2;->a(JLd61;Le70;)Lte;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    iget v2, v0, Lo62;->a:F

    .line 778
    .line 779
    iget v0, v0, Lo62;->b:F

    .line 780
    .line 781
    invoke-static {v1, v2, v0}, Lh7;->H(Lte;FF)Landroid/graphics/Region;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    if-eqz v0, :cond_1b

    .line 786
    .line 787
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 788
    .line 789
    .line 790
    move-result-object v1

    .line 791
    invoke-virtual {v1, v7, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 792
    .line 793
    .line 794
    :cond_1b
    :goto_c
    return-void
.end method

.method public final d(Lsn2;)Landroid/graphics/Rect;
    .locals 3

    .line 1
    iget-object p1, p1, Lsn2;->b:Ld11;

    .line 2
    .line 3
    iget v0, p1, Ld11;->a:I

    .line 4
    .line 5
    int-to-float v0, v0

    .line 6
    iget v1, p1, Ld11;->b:I

    .line 7
    .line 8
    int-to-float v1, v1

    .line 9
    iget v2, p1, Ld11;->c:I

    .line 10
    .line 11
    int-to-float v2, v2

    .line 12
    iget p1, p1, Ld11;->d:I

    .line 13
    .line 14
    int-to-float p1, p1

    .line 15
    invoke-virtual {p0, v0, v1, v2, p1}, Lh7;->F(FFFF)Landroid/graphics/Rect;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final e(Lu00;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Le7;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Le7;

    .line 11
    .line 12
    iget v3, v2, Le7;->o:I

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
    iput v3, v2, Le7;->o:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Le7;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Le7;-><init>(Lh7;Lu00;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Le7;->m:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Le7;->o:I

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    iget-object v5, v0, Lh7;->C:Ljg;

    .line 35
    .line 36
    const/4 v6, 0x1

    .line 37
    sget-object v7, Lk20;->h:Lk20;

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
    iget-object v3, v2, Le7;->l:Lin;

    .line 46
    .line 47
    iget-object v8, v2, Le7;->k:Lak1;

    .line 48
    .line 49
    :try_start_0
    invoke-static {v1}, Lfg1;->T(Ljava/lang/Object;)V
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
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    return-object v0

    .line 67
    :cond_2
    iget-object v3, v2, Le7;->l:Lin;

    .line 68
    .line 69
    iget-object v8, v2, Le7;->k:Lak1;

    .line 70
    .line 71
    :try_start_1
    invoke-static {v1}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    invoke-static {v1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :try_start_2
    new-instance v1, Lak1;

    .line 79
    .line 80
    invoke-direct {v1}, Lak1;-><init>()V

    .line 81
    .line 82
    .line 83
    iget-object v3, v0, Lh7;->D:Ljn;

    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    new-instance v8, Lin;

    .line 89
    .line 90
    invoke-direct {v8, v3}, Lin;-><init>(Ljn;)V

    .line 91
    .line 92
    .line 93
    :goto_1
    iput-object v1, v2, Le7;->k:Lak1;

    .line 94
    .line 95
    iput-object v8, v2, Le7;->l:Lin;

    .line 96
    .line 97
    iput v6, v2, Le7;->o:I

    .line 98
    .line 99
    invoke-virtual {v8, v2}, Lin;->b(Lu00;)Ljava/lang/Object;

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
    invoke-virtual {v3}, Lin;->c()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lh7;->o()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_7

    .line 127
    .line 128
    iget v1, v5, Ljg;->j:I

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
    iget-object v11, v5, Ljg;->i:[Ljava/lang/Object;

    .line 135
    .line 136
    aget-object v11, v11, v10

    .line 137
    .line 138
    check-cast v11, Lr61;

    .line 139
    .line 140
    invoke-virtual {v0, v11, v8}, Lh7;->B(Lr61;Lak1;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v11}, Lh7;->C(Lr61;)V

    .line 144
    .line 145
    .line 146
    add-int/lit8 v10, v10, 0x1

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_5
    iput v9, v8, Lak1;->d:I

    .line 150
    .line 151
    iget-object v1, v8, Lak1;->a:[J

    .line 152
    .line 153
    sget-object v9, Led2;->a:[J

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
    invoke-static {v9, v10, v1}, Lmg;->j0(J[J)V

    .line 163
    .line 164
    .line 165
    iget-object v1, v8, Lak1;->a:[J

    .line 166
    .line 167
    iget v9, v8, Lak1;->c:I

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
    iget v1, v8, Lak1;->c:I

    .line 189
    .line 190
    invoke-static {v1}, Led2;->a(I)I

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    iget v4, v8, Lak1;->d:I

    .line 195
    .line 196
    sub-int/2addr v1, v4

    .line 197
    iput v1, v8, Lak1;->e:I

    .line 198
    .line 199
    iget-object v1, v0, Lh7;->k:Lb7;

    .line 200
    .line 201
    invoke-virtual {v1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    iget-boolean v4, v0, Lh7;->P:Z

    .line 206
    .line 207
    if-nez v4, :cond_8

    .line 208
    .line 209
    if-eqz v1, :cond_8

    .line 210
    .line 211
    iput-boolean v6, v0, Lh7;->P:Z

    .line 212
    .line 213
    iget-object v4, v0, Lh7;->R:Lm2;

    .line 214
    .line 215
    invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 216
    .line 217
    .line 218
    goto :goto_5

    .line 219
    :catchall_1
    move-exception v0

    .line 220
    goto :goto_8

    .line 221
    :cond_7
    move-object v9, v5

    .line 222
    :cond_8
    :goto_5
    invoke-virtual {v9}, Ljg;->clear()V

    .line 223
    .line 224
    .line 225
    iget-object v1, v0, Lh7;->w:Lzj1;

    .line 226
    .line 227
    invoke-virtual {v1}, Lzj1;->c()V

    .line 228
    .line 229
    .line 230
    iget-object v1, v0, Lh7;->x:Lzj1;

    .line 231
    .line 232
    invoke-virtual {v1}, Lzj1;->c()V

    .line 233
    .line 234
    .line 235
    iget-wide v4, v0, Lh7;->o:J

    .line 236
    .line 237
    iput-object v8, v2, Le7;->k:Lak1;

    .line 238
    .line 239
    iput-object v3, v2, Le7;->l:Lin;

    .line 240
    .line 241
    const/4 v1, 0x2

    .line 242
    iput v1, v2, Le7;->o:I

    .line 243
    .line 244
    invoke-static {v4, v5, v2}, Leu;->F(JLu00;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 248
    if-ne v4, v7, :cond_9

    .line 249
    .line 250
    :goto_6
    return-object v7

    .line 251
    :cond_9
    :goto_7
    move v4, v1

    .line 252
    move-object v1, v8

    .line 253
    move-object v5, v9

    .line 254
    move-object v8, v3

    .line 255
    goto/16 :goto_1

    .line 256
    .line 257
    :cond_a
    move-object v9, v5

    .line 258
    invoke-virtual {v9}, Ljg;->clear()V

    .line 259
    .line 260
    .line 261
    sget-object v0, La83;->a:La83;

    .line 262
    .line 263
    return-object v0

    .line 264
    :goto_8
    invoke-virtual {v9}, Ljg;->clear()V

    .line 265
    .line 266
    .line 267
    throw v0
.end method

.method public final f(ZIJ)Z
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
    invoke-static {v3, v4}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-virtual/range {p0 .. p0}, Lh7;->l()Lx01;

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
    invoke-static {v1, v2, v5, v6}, Lrs1;->b(JJ)Z

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
    sget-object v0, Lvn2;->w:Lyn2;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    if-nez v0, :cond_11

    .line 73
    .line 74
    sget-object v0, Lvn2;->v:Lyn2;

    .line 75
    .line 76
    :goto_0
    iget-object v6, v3, Lx01;->c:[Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v3, v3, Lx01;->a:[J

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
    check-cast v15, Lsn2;

    .line 130
    .line 131
    const/16 v16, 0x0

    .line 132
    .line 133
    iget-object v4, v15, Lsn2;->b:Ld11;

    .line 134
    .line 135
    iget v5, v4, Ld11;->a:I

    .line 136
    .line 137
    int-to-float v5, v5

    .line 138
    move/from16 p1, v13

    .line 139
    .line 140
    iget v13, v4, Ld11;->b:I

    .line 141
    .line 142
    int-to-float v13, v13

    .line 143
    iget v1, v4, Ld11;->c:I

    .line 144
    .line 145
    int-to-float v1, v1

    .line 146
    iget v2, v4, Ld11;->d:I

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
    iget-object v1, v15, Lsn2;->a:Lqn2;

    .line 214
    .line 215
    iget-object v1, v1, Lqn2;->d:Lln2;

    .line 216
    .line 217
    iget-object v1, v1, Lln2;->h:Lrk1;

    .line 218
    .line 219
    invoke-virtual {v1, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast v1, Lel2;

    .line 227
    .line 228
    if-nez v1, :cond_9

    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_9
    iget-object v2, v1, Lel2;->a:Lxm0;

    .line 232
    .line 233
    if-gez p2, :cond_a

    .line 234
    .line 235
    invoke-interface {v2}, Lxm0;->a()Ljava/lang/Object;

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
    invoke-interface {v2}, Lxm0;->a()Ljava/lang/Object;

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
    iget-object v1, v1, Lel2;->b:Lxm0;

    .line 263
    .line 264
    invoke-interface {v1}, Lxm0;->a()Ljava/lang/Object;

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
    invoke-static {}, Lc80;->s()V

    .line 316
    .line 317
    .line 318
    :goto_a
    return v16
.end method

.method public final g()V
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
    invoke-virtual {p0}, Lh7;->o()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lh7;->k:Lb7;

    .line 13
    .line 14
    invoke-virtual {v0}, Lb7;->getSemanticsOwner()Ltn2;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ltn2;->a()Lqn2;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lh7;->O:Lrn2;

    .line 23
    .line 24
    invoke-virtual {p0, v0, v1}, Lh7;->u(Lqn2;Lrn2;)V
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
    invoke-virtual {p0}, Lh7;->l()Lx01;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0, v0}, Lh7;->A(Lx01;)V
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
    invoke-virtual {p0}, Lh7;->J()V
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

.method public final h(II)Landroid/view/accessibility/AccessibilityEvent;
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
    iget-object v0, p0, Lh7;->k:Lb7;

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
    invoke-virtual {p0}, Lh7;->o()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lh7;->l()Lx01;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0, p1}, Lx01;->b(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lsn2;

    .line 45
    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    iget-object p0, p0, Lsn2;->a:Lqn2;

    .line 49
    .line 50
    iget-object p1, p0, Lqn2;->d:Lln2;

    .line 51
    .line 52
    sget-object v0, Lvn2;->L:Lyn2;

    .line 53
    .line 54
    iget-object p1, p1, Lln2;->h:Lrk1;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setPassword(Z)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, Lqn2;->d:Lln2;

    .line 64
    .line 65
    sget-object p1, Lvn2;->o:Lyn2;

    .line 66
    .line 67
    iget-object p0, p0, Lln2;->h:Lrk1;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-static {p2, p0}, Lu3;->f(Landroid/view/accessibility/AccessibilityEvent;Z)V

    .line 89
    .line 90
    .line 91
    :cond_1
    return-object p2
.end method

.method public final i(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;
    .locals 1

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lh7;->h(II)Landroid/view/accessibility/AccessibilityEvent;

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

.method public final j(Lqn2;)I
    .locals 2

    .line 1
    iget-object p1, p1, Lqn2;->d:Lln2;

    .line 2
    .line 3
    sget-object v0, Lvn2;->a:Lyn2;

    .line 4
    .line 5
    iget-object v1, p1, Lln2;->h:Lrk1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lvn2;->H:Lyn2;

    .line 14
    .line 15
    iget-object v1, p1, Lln2;->h:Lrk1;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lln2;->c(Lyn2;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lf13;

    .line 28
    .line 29
    iget-wide p0, p0, Lf13;->a:J

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
    iget p0, p0, Lh7;->A:I

    .line 40
    .line 41
    return p0
.end method

.method public final k(Lqn2;)I
    .locals 2

    .line 1
    iget-object p1, p1, Lqn2;->d:Lln2;

    .line 2
    .line 3
    sget-object v0, Lvn2;->a:Lyn2;

    .line 4
    .line 5
    iget-object v1, p1, Lln2;->h:Lrk1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lvn2;->H:Lyn2;

    .line 14
    .line 15
    iget-object v1, p1, Lln2;->h:Lrk1;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lln2;->c(Lyn2;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lf13;

    .line 28
    .line 29
    iget-wide p0, p0, Lf13;->a:J

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
    iget p0, p0, Lh7;->A:I

    .line 37
    .line 38
    return p0
.end method

.method public final l()Lx01;
    .locals 7

    .line 1
    iget-boolean v0, p0, Lh7;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lh7;->E:Z

    .line 7
    .line 8
    iget-object v0, p0, Lh7;->k:Lb7;

    .line 9
    .line 10
    invoke-virtual {v0}, Lb7;->getSemanticsOwner()Ltn2;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Lv6;->k:Lv6;

    .line 15
    .line 16
    invoke-static {v1, v2}, Lxe1;->v(Ltn2;Lin0;)Lzj1;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iput-object v1, p0, Lh7;->G:Lzj1;

    .line 21
    .line 22
    invoke-virtual {p0}, Lh7;->o()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Lh7;->G:Lzj1;

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
    iget-object v2, p0, Lh7;->I:Lxj1;

    .line 39
    .line 40
    invoke-virtual {v2}, Lxj1;->a()V

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, Lh7;->J:Lxj1;

    .line 44
    .line 45
    invoke-virtual {v3}, Lxj1;->a()V

    .line 46
    .line 47
    .line 48
    const/4 v4, -0x1

    .line 49
    invoke-virtual {v1, v4}, Lx01;->b(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Lsn2;

    .line 54
    .line 55
    if-eqz v4, :cond_0

    .line 56
    .line 57
    iget-object v4, v4, Lsn2;->a:Lqn2;

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
    new-instance v5, Lv5;

    .line 65
    .line 66
    const/4 v6, 0x3

    .line 67
    invoke-direct {v5, v6, v1}, Lv5;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance v1, Lv5;

    .line 71
    .line 72
    const/4 v6, 0x4

    .line 73
    invoke-direct {v1, v6, v0}, Lv5;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v4}, Leu;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v4, v5, v1, v0}, Lao2;->b(Lqn2;Lv5;Lv5;Ljava/util/List;)Ljava/util/ArrayList;

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
    check-cast v5, Lqn2;

    .line 99
    .line 100
    iget v5, v5, Lqn2;->f:I

    .line 101
    .line 102
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    check-cast v6, Lqn2;

    .line 107
    .line 108
    iget v6, v6, Lqn2;->f:I

    .line 109
    .line 110
    invoke-virtual {v2, v5, v6}, Lxj1;->f(II)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v6, v5}, Lxj1;->f(II)V

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
    iget-object p0, p0, Lh7;->G:Lzj1;

    .line 122
    .line 123
    return-object p0
.end method

.method public final n(Lqn2;Landroid/graphics/Rect;Leq2;)Lo62;
    .locals 9

    .line 1
    new-instance v0, Lf7;

    .line 2
    .line 3
    invoke-direct {v0, p3}, Lf7;-><init>(Leq2;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lqn2;->c:Lr61;

    .line 7
    .line 8
    iget-object p3, p1, Lr61;->M:Lvn1;

    .line 9
    .line 10
    iget-object p3, p3, Lvn1;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p3, Lth1;

    .line 13
    .line 14
    iget v1, p3, Lth1;->k:I

    .line 15
    .line 16
    and-int/lit8 v1, v1, 0x8

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x1

    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v1, :cond_8

    .line 22
    .line 23
    :goto_0
    if-eqz p3, :cond_8

    .line 24
    .line 25
    iget v1, p3, Lth1;->j:I

    .line 26
    .line 27
    and-int/lit8 v1, v1, 0x8

    .line 28
    .line 29
    if-eqz v1, :cond_7

    .line 30
    .line 31
    move-object v1, p3

    .line 32
    move-object v5, v2

    .line 33
    :goto_1
    if-eqz v1, :cond_7

    .line 34
    .line 35
    instance-of v6, v1, Lon2;

    .line 36
    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    move-object v6, v1

    .line 40
    check-cast v6, Lon2;

    .line 41
    .line 42
    invoke-interface {v6, v0}, Lon2;->l0(Lzn2;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v6, v0, Lf7;->h:Z

    .line 46
    .line 47
    if-eqz v6, :cond_6

    .line 48
    .line 49
    move-object v2, v1

    .line 50
    goto :goto_4

    .line 51
    :cond_0
    iget v6, v1, Lth1;->j:I

    .line 52
    .line 53
    and-int/lit8 v6, v6, 0x8

    .line 54
    .line 55
    if-eqz v6, :cond_6

    .line 56
    .line 57
    instance-of v6, v1, Lu60;

    .line 58
    .line 59
    if-eqz v6, :cond_6

    .line 60
    .line 61
    move-object v6, v1

    .line 62
    check-cast v6, Lu60;

    .line 63
    .line 64
    iget-object v6, v6, Lu60;->w:Lth1;

    .line 65
    .line 66
    move v7, v4

    .line 67
    :goto_2
    if-eqz v6, :cond_5

    .line 68
    .line 69
    iget v8, v6, Lth1;->j:I

    .line 70
    .line 71
    and-int/lit8 v8, v8, 0x8

    .line 72
    .line 73
    if-eqz v8, :cond_4

    .line 74
    .line 75
    add-int/lit8 v7, v7, 0x1

    .line 76
    .line 77
    if-ne v7, v3, :cond_1

    .line 78
    .line 79
    move-object v1, v6

    .line 80
    goto :goto_3

    .line 81
    :cond_1
    if-nez v5, :cond_2

    .line 82
    .line 83
    new-instance v5, Lzk1;

    .line 84
    .line 85
    const/16 v8, 0x10

    .line 86
    .line 87
    new-array v8, v8, [Lth1;

    .line 88
    .line 89
    invoke-direct {v5, v8}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    if-eqz v1, :cond_3

    .line 93
    .line 94
    invoke-virtual {v5, v1}, Lzk1;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    move-object v1, v2

    .line 98
    :cond_3
    invoke-virtual {v5, v6}, Lzk1;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_4
    :goto_3
    iget-object v6, v6, Lth1;->m:Lth1;

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    if-ne v7, v3, :cond_6

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_6
    invoke-static {v5}, Lsp0;->m(Lzk1;)Lth1;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    goto :goto_1

    .line 112
    :cond_7
    iget v1, p3, Lth1;->k:I

    .line 113
    .line 114
    and-int/lit8 v1, v1, 0x8

    .line 115
    .line 116
    if-eqz v1, :cond_8

    .line 117
    .line 118
    iget-object p3, p3, Lth1;->m:Lth1;

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_8
    :goto_4
    check-cast v2, Lon2;

    .line 122
    .line 123
    if-eqz v2, :cond_9

    .line 124
    .line 125
    move-object p3, v2

    .line 126
    check-cast p3, Lth1;

    .line 127
    .line 128
    iget-object p3, p3, Lth1;->h:Lth1;

    .line 129
    .line 130
    iget-boolean p3, p3, Lth1;->u:Z

    .line 131
    .line 132
    if-ne p3, v3, :cond_9

    .line 133
    .line 134
    invoke-static {v2}, Lsp0;->b0(Lt60;)Lzn1;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p1}, Ls11;->J(Lc61;)Lc61;

    .line 139
    .line 140
    .line 141
    move-result-object p3

    .line 142
    invoke-interface {p3, p1, v4}, Lc61;->J(Lc61;Z)Lo62;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    iget p3, p1, Lo62;->a:F

    .line 147
    .line 148
    iget v0, p1, Lo62;->b:F

    .line 149
    .line 150
    iget v1, p1, Lo62;->c:F

    .line 151
    .line 152
    iget p1, p1, Lo62;->d:F

    .line 153
    .line 154
    invoke-virtual {p0, p3, v0, v1, p1}, Lh7;->F(FFFF)Landroid/graphics/Rect;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    iget p1, p0, Landroid/graphics/Rect;->left:I

    .line 159
    .line 160
    iget p3, p2, Landroid/graphics/Rect;->left:I

    .line 161
    .line 162
    sub-int/2addr p1, p3

    .line 163
    int-to-float p1, p1

    .line 164
    iget p3, p0, Landroid/graphics/Rect;->top:I

    .line 165
    .line 166
    iget p2, p2, Landroid/graphics/Rect;->top:I

    .line 167
    .line 168
    sub-int/2addr p3, p2

    .line 169
    int-to-float p2, p3

    .line 170
    new-instance p3, Lo62;

    .line 171
    .line 172
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    int-to-float v0, v0

    .line 177
    add-float/2addr v0, p1

    .line 178
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    int-to-float p0, p0

    .line 183
    add-float/2addr p0, p2

    .line 184
    invoke-direct {p3, p1, p2, v0, p0}, Lo62;-><init>(FFFF)V

    .line 185
    .line 186
    .line 187
    return-object p3

    .line 188
    :cond_9
    iget-object p0, p1, Lr61;->M:Lvn1;

    .line 189
    .line 190
    iget-object p0, p0, Lvn1;->e:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p0, Lzn1;

    .line 193
    .line 194
    invoke-static {p0, v4}, Ls11;->w(Lc61;Z)Lo62;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    return-object p0
.end method

.method public final o()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh7;->n:Landroid/view/accessibility/AccessibilityManager;

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
    iget-object v1, p0, Lh7;->p:Ljava/util/List;

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
    iput-object v1, p0, Lh7;->p:Ljava/util/List;

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

.method public final onAccessibilityStateChanged(Z)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lh7;->p:Ljava/util/List;

    .line 3
    .line 4
    return-void
.end method

.method public final onTouchExplorationStateChanged(Z)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lh7;->p:Ljava/util/List;

    .line 3
    .line 4
    return-void
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lh7;->n:Landroid/view/accessibility/AccessibilityManager;

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
    iput-object v0, p0, Lh7;->p:Ljava/util/List;

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
    iget-object p1, p0, Lh7;->k:Lb7;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lh7;->R:Lm2;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lh7;->n:Landroid/view/accessibility/AccessibilityManager;

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final p(Lr61;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh7;->C:Ljg;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljg;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lh7;->D:Ljn;

    .line 10
    .line 11
    sget-object p1, La83;->a:La83;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final t(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lh7;->k:Lb7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lb7;->getSemanticsOwner()Ltn2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ltn2;->a()Lqn2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget p0, p0, Lqn2;->f:I

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

.method public final u(Lqn2;Lrn2;)V
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
    sget-object v3, Lg11;->a:[I

    .line 8
    .line 9
    new-instance v3, Lak1;

    .line 10
    .line 11
    invoke-direct {v3}, Lak1;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x4

    .line 15
    invoke-static {v4, v1}, Lqn2;->j(ILqn2;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    iget-object v6, v1, Lqn2;->c:Lr61;

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
    check-cast v10, Lqn2;

    .line 34
    .line 35
    invoke-virtual {v0}, Lh7;->l()Lx01;

    .line 36
    .line 37
    .line 38
    move-result-object v11

    .line 39
    iget v10, v10, Lqn2;->f:I

    .line 40
    .line 41
    invoke-virtual {v11, v10}, Lx01;->a(I)Z

    .line 42
    .line 43
    .line 44
    move-result v11

    .line 45
    if-eqz v11, :cond_1

    .line 46
    .line 47
    iget-object v11, v2, Lrn2;->b:Lak1;

    .line 48
    .line 49
    invoke-virtual {v11, v10}, Lak1;->b(I)Z

    .line 50
    .line 51
    .line 52
    move-result v11

    .line 53
    if-nez v11, :cond_0

    .line 54
    .line 55
    invoke-virtual {v0, v6}, Lh7;->p(Lr61;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    invoke-virtual {v3, v10}, Lak1;->a(I)Z

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
    iget-object v2, v2, Lrn2;->b:Lak1;

    .line 66
    .line 67
    iget-object v5, v2, Lak1;->b:[I

    .line 68
    .line 69
    iget-object v2, v2, Lak1;->a:[J

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
    invoke-virtual {v3, v15}, Lak1;->b(I)Z

    .line 120
    .line 121
    .line 122
    move-result v15

    .line 123
    if-nez v15, :cond_3

    .line 124
    .line 125
    invoke-virtual {v0, v6}, Lh7;->p(Lr61;)V

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
    invoke-static {v4, v1}, Lqn2;->j(ILqn2;)Ljava/util/List;

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
    check-cast v3, Lqn2;

    .line 155
    .line 156
    iget-object v4, v0, Lh7;->N:Lzj1;

    .line 157
    .line 158
    iget v5, v3, Lqn2;->f:I

    .line 159
    .line 160
    invoke-virtual {v4, v5}, Lx01;->b(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    check-cast v4, Lrn2;

    .line 165
    .line 166
    if-eqz v4, :cond_7

    .line 167
    .line 168
    invoke-virtual {v0}, Lh7;->l()Lx01;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    iget v6, v3, Lqn2;->f:I

    .line 173
    .line 174
    invoke-virtual {v5, v6}, Lx01;->a(I)Z

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-eqz v5, :cond_7

    .line 179
    .line 180
    invoke-virtual {v0, v3, v4}, Lh7;->u(Lqn2;Lrn2;)V

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

.method public final v(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh7;->o()Z

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
    iput-boolean v0, p0, Lh7;->v:Z

    .line 28
    .line 29
    :cond_2
    :try_start_0
    iget-object v0, p0, Lh7;->m:Lg7;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lg7;->j(Ljava/lang/Object;)Ljava/lang/Object;

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
    iput-boolean v1, p0, Lh7;->v:Z

    .line 42
    .line 43
    return p1

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    iput-boolean v1, p0, Lh7;->v:Z

    .line 46
    .line 47
    throw p1
.end method

.method public final w(IILjava/lang/Integer;Ljava/util/List;)Z
    .locals 1

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-eq p1, v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Lh7;->o()Z

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
    invoke-virtual {p0, p1, p2}, Lh7;->h(II)Landroid/view/accessibility/AccessibilityEvent;

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
    invoke-static {p4, v0, p2, p3}, Lsb1;->a(Ljava/util/List;Ljava/lang/String;Lvi1;I)Ljava/lang/String;

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
    invoke-virtual {p0, p1}, Lh7;->v(Landroid/view/accessibility/AccessibilityEvent;)Z

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

.method public final y(Ljava/lang/String;II)V
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lh7;->t(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/16 v0, 0x20

    .line 6
    .line 7
    invoke-virtual {p0, p2, v0}, Lh7;->h(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2, p3}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 12
    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0, p2}, Lh7;->v(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final z(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lh7;->F:Ld7;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Ld7;->a:Lqn2;

    .line 6
    .line 7
    iget v2, v1, Lqn2;->f:I

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
    iget-wide v4, v0, Ld7;->f:J

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
    iget p1, v1, Lqn2;->f:I

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lh7;->t(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/high16 v2, 0x20000

    .line 32
    .line 33
    invoke-virtual {p0, p1, v2}, Lh7;->h(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget v2, v0, Ld7;->d:I

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 40
    .line 41
    .line 42
    iget v2, v0, Ld7;->e:I

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 45
    .line 46
    .line 47
    iget v2, v0, Ld7;->b:I

    .line 48
    .line 49
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityEvent;->setAction(I)V

    .line 50
    .line 51
    .line 52
    iget v0, v0, Ld7;->c:I

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
    invoke-static {v1}, Lh7;->m(Lqn2;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lh7;->v(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 69
    .line 70
    .line 71
    :cond_1
    const/4 p1, 0x0

    .line 72
    iput-object p1, p0, Lh7;->F:Ld7;

    .line 73
    .line 74
    return-void
.end method
