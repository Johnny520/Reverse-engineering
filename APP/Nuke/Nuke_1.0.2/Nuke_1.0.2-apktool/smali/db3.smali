.class public final Ldb3;
.super Landroid/view/View;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final r:Lo80;


# instance fields
.field public final h:Lkc0;

.field public final i:Ltp;

.field public final j:Lsp;

.field public k:Z

.field public l:Landroid/graphics/Outline;

.field public m:Z

.field public n:Le70;

.field public o:Ld61;

.field public p:Lin0;

.field public q:Lpq0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lo80;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lo80;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldb3;->r:Lo80;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lkc0;Ltp;Lsp;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Ldb3;->h:Lkc0;

    .line 9
    .line 10
    iput-object p2, p0, Ldb3;->i:Ltp;

    .line 11
    .line 12
    iput-object p3, p0, Ldb3;->j:Lsp;

    .line 13
    .line 14
    sget-object p1, Ldb3;->r:Lo80;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    iput-boolean p1, p0, Ldb3;->m:Z

    .line 21
    .line 22
    sget-object p1, Lpp0;->c:Lh70;

    .line 23
    .line 24
    iput-object p1, p0, Ldb3;->n:Le70;

    .line 25
    .line 26
    sget-object p1, Ld61;->h:Ld61;

    .line 27
    .line 28
    iput-object p1, p0, Ldb3;->o:Ld61;

    .line 29
    .line 30
    sget-object p1, Lrq0;->a:Lsn;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object p1, Loq0;->k:Loq0;

    .line 36
    .line 37
    iput-object p1, p0, Ldb3;->p:Lin0;

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    invoke-virtual {p0, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldb3;->i:Ltp;

    .line 4
    .line 5
    iget-object v2, v1, Ltp;->a:Lf6;

    .line 6
    .line 7
    iget-object v3, v2, Lf6;->a:Landroid/graphics/Canvas;

    .line 8
    .line 9
    move-object/from16 v4, p1

    .line 10
    .line 11
    iput-object v4, v2, Lf6;->a:Landroid/graphics/Canvas;

    .line 12
    .line 13
    iget-object v4, v0, Ldb3;->n:Le70;

    .line 14
    .line 15
    iget-object v5, v0, Ldb3;->o:Ld61;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    int-to-float v6, v6

    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    int-to-float v7, v7

    .line 27
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    int-to-long v8, v6

    .line 32
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    int-to-long v6, v6

    .line 37
    const/16 v10, 0x20

    .line 38
    .line 39
    shl-long/2addr v8, v10

    .line 40
    const-wide v10, 0xffffffffL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    and-long/2addr v6, v10

    .line 46
    or-long/2addr v6, v8

    .line 47
    iget-object v8, v0, Ldb3;->q:Lpq0;

    .line 48
    .line 49
    iget-object v9, v0, Ldb3;->p:Lin0;

    .line 50
    .line 51
    iget-object v10, v0, Ldb3;->j:Lsp;

    .line 52
    .line 53
    iget-object v11, v10, Lsp;->i:Lb5;

    .line 54
    .line 55
    iget-object v12, v11, Lb5;->k:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v12, Lsp;

    .line 58
    .line 59
    iget-object v12, v12, Lsp;->h:Lrp;

    .line 60
    .line 61
    iget-object v13, v12, Lrp;->a:Le70;

    .line 62
    .line 63
    iget-object v12, v12, Lrp;->b:Ld61;

    .line 64
    .line 65
    invoke-virtual {v11}, Lb5;->q()Lqp;

    .line 66
    .line 67
    .line 68
    move-result-object v11

    .line 69
    iget-object v14, v10, Lsp;->i:Lb5;

    .line 70
    .line 71
    move-object v15, v11

    .line 72
    move-object/from16 p1, v12

    .line 73
    .line 74
    invoke-virtual {v14}, Lb5;->u()J

    .line 75
    .line 76
    .line 77
    move-result-wide v11

    .line 78
    move-object/from16 v16, v15

    .line 79
    .line 80
    iget-object v15, v14, Lb5;->j:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v15, Lpq0;

    .line 83
    .line 84
    invoke-virtual {v14, v4}, Lb5;->C(Le70;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v14, v5}, Lb5;->D(Ld61;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v14, v2}, Lb5;->B(Lqp;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v14, v6, v7}, Lb5;->E(J)V

    .line 94
    .line 95
    .line 96
    iput-object v8, v14, Lb5;->j:Ljava/lang/Object;

    .line 97
    .line 98
    invoke-virtual {v2}, Lf6;->l()V

    .line 99
    .line 100
    .line 101
    :try_start_0
    invoke-interface {v9, v10}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Lf6;->i()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v14, v13}, Lb5;->C(Le70;)V

    .line 108
    .line 109
    .line 110
    move-object/from16 v4, p1

    .line 111
    .line 112
    invoke-virtual {v14, v4}, Lb5;->D(Ld61;)V

    .line 113
    .line 114
    .line 115
    move-object/from16 v5, v16

    .line 116
    .line 117
    invoke-virtual {v14, v5}, Lb5;->B(Lqp;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v14, v11, v12}, Lb5;->E(J)V

    .line 121
    .line 122
    .line 123
    iput-object v15, v14, Lb5;->j:Ljava/lang/Object;

    .line 124
    .line 125
    iget-object v1, v1, Ltp;->a:Lf6;

    .line 126
    .line 127
    iput-object v3, v1, Lf6;->a:Landroid/graphics/Canvas;

    .line 128
    .line 129
    const/4 v1, 0x0

    .line 130
    iput-boolean v1, v0, Ldb3;->k:Z

    .line 131
    .line 132
    return-void

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    move-object/from16 v4, p1

    .line 135
    .line 136
    move-object/from16 v5, v16

    .line 137
    .line 138
    invoke-virtual {v2}, Lf6;->i()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v14, v13}, Lb5;->C(Le70;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v14, v4}, Lb5;->D(Ld61;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v14, v5}, Lb5;->B(Lqp;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v14, v11, v12}, Lb5;->E(J)V

    .line 151
    .line 152
    .line 153
    iput-object v15, v14, Lb5;->j:Ljava/lang/Object;

    .line 154
    .line 155
    throw v0
.end method

.method public final forceLayout()V
    .locals 0

    .line 1
    return-void
.end method

.method public final getCanUseCompositingLayer$ui_graphics()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ldb3;->m:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getCanvasHolder()Ltp;
    .locals 0

    .line 1
    iget-object p0, p0, Ldb3;->i:Ltp;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOwnerView()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Ldb3;->h:Lkc0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hasOverlappingRendering()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ldb3;->m:Z

    .line 2
    .line 3
    return p0
.end method

.method public final invalidate()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldb3;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Ldb3;->k:Z

    .line 7
    .line 8
    invoke-super {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setCanUseCompositingLayer$ui_graphics(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldb3;->m:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Ldb3;->m:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Ldb3;->invalidate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setInvalidated(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ldb3;->k:Z

    .line 2
    .line 3
    return-void
.end method
