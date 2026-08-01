.class public final Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏哲世兰;


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏兰哲世;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏兰哲世;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;-><init>(Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v1, v0, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;->label:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    const/4 v3, 0x0

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v2, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;->L$4:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;

    .line 40
    .line 41
    iget-object p1, v0, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;->L$3:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Landroid/media/ImageReader;

    .line 44
    .line 45
    iget-object p1, v0, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;->L$2:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ljava/lang/AutoCloseable;

    .line 48
    .line 49
    iget-object p2, v0, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p2, Landroid/os/Looper;

    .line 52
    .line 53
    iget-object p2, v0, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p2, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;

    .line 56
    .line 57
    :try_start_0
    invoke-static {p0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    goto/16 :goto_2

    .line 63
    .line 64
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object v3

    .line 70
    :cond_2
    invoke-static {p0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-wide v4, p1, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:J

    .line 74
    .line 75
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-nez p0, :cond_3

    .line 80
    .line 81
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    :cond_3
    const/16 v1, 0x20

    .line 86
    .line 87
    shr-long v6, v4, v1

    .line 88
    .line 89
    long-to-int v1, v6

    .line 90
    const-wide v6, 0xffffffffL

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    and-long/2addr v4, v6

    .line 96
    long-to-int v4, v4

    .line 97
    invoke-static {v1, v4, v2, v2}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :try_start_1
    iput-object p1, v0, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object p0, v0, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;->L$1:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object v1, v0, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;->L$2:Ljava/lang/Object;

    .line 106
    .line 107
    iput-object v1, v0, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;->L$3:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object v0, v0, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;->L$4:Ljava/lang/Object;

    .line 110
    .line 111
    iput v2, v0, Landroidx/compose/ui/graphics/layer/LayerSnapshotV22$toBitmap$1;->label:I

    .line 112
    .line 113
    new-instance v4, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 114
    .line 115
    invoke-static {v0}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-direct {v4, v2, v0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲()V

    .line 123
    .line 124
    .line 125
    new-instance v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏兰世哲;

    .line 126
    .line 127
    invoke-direct {v0, v4}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏兰世哲;-><init>(Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;)V

    .line 128
    .line 129
    .line 130
    invoke-static {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Landroid/os/Looper;)Landroid/os/Handler;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {v1, v0, p0}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p0}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    .line 142
    .line 143
    .line 144
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 145
    :try_start_2
    sget-wide v5, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:J

    .line 146
    .line 147
    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪哲苏兰(J)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    sget-object v5, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 152
    .line 153
    invoke-virtual {v0, v2, v5}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 154
    .line 155
    .line 156
    sget-object v2, Landroidx/compose/ui/graphics/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Canvas;

    .line 157
    .line 158
    new-instance v2, Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;

    .line 159
    .line 160
    invoke-direct {v2}, Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 161
    .line 162
    .line 163
    iput-object v0, v2, Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Canvas;

    .line 164
    .line 165
    invoke-virtual {p1, v2, v3}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 166
    .line 167
    .line 168
    :try_start_3
    invoke-virtual {p0, v0}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 175
    if-ne p0, p2, :cond_4

    .line 176
    .line 177
    return-object p2

    .line 178
    :cond_4
    move-object p1, v1

    .line 179
    :goto_1
    :try_start_4
    check-cast p0, Landroid/media/Image;

    .line 180
    .line 181
    invoke-static {p0}, L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Landroid/media/Image;)Landroid/graphics/Bitmap;

    .line 182
    .line 183
    .line 184
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 185
    invoke-static {p1, v3}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    return-object p0

    .line 189
    :catchall_1
    move-exception p0

    .line 190
    move-object p1, v1

    .line 191
    goto :goto_2

    .line 192
    :catchall_2
    move-exception p1

    .line 193
    :try_start_5
    invoke-virtual {p0, v0}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 194
    .line 195
    .line 196
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 197
    :goto_2
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 198
    :catchall_3
    move-exception p2

    .line 199
    invoke-static {p1, p0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 200
    .line 201
    .line 202
    throw p2
.end method
