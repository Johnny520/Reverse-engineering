.class public final Lzo0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ld92;
.implements Lfz0;


# instance fields
.field public final h:Landroid/graphics/drawable/Drawable;

.field public final synthetic i:I


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 1
    iput p2, p0, Lzo0;->i:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string p2, "Argument must not be null"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lfg1;->q(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lzo0;->h:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    return-void
.end method

.method private final c()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget v0, p0, Lzo0;->i:I

    .line 2
    .line 3
    iget-object p0, p0, Lzo0;->h:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    instance-of v0, p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    instance-of v0, p0, Lyo0;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    check-cast p0, Lyo0;

    .line 27
    .line 28
    iget-object p0, p0, Lyo0;->h:Lxo0;

    .line 29
    .line 30
    iget-object p0, p0, Lxo0;->a:Lep0;

    .line 31
    .line 32
    iget-object p0, p0, Lep0;->l:Landroid/graphics/Bitmap;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    return-void

    .line 38
    :pswitch_0
    check-cast p0, Lyo0;

    .line 39
    .line 40
    iget-object p0, p0, Lyo0;->h:Lxo0;

    .line 41
    .line 42
    iget-object p0, p0, Lxo0;->a:Lep0;

    .line 43
    .line 44
    iget-object p0, p0, Lep0;->l:Landroid/graphics/Bitmap;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()I
    .locals 3

    .line 1
    iget v0, p0, Lzo0;->i:I

    .line 2
    .line 3
    iget-object p0, p0, Lzo0;->h:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    mul-int/2addr p0, v0

    .line 17
    mul-int/lit8 p0, p0, 0x4

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :pswitch_0
    check-cast p0, Lyo0;

    .line 26
    .line 27
    iget-object p0, p0, Lyo0;->h:Lxo0;

    .line 28
    .line 29
    iget-object p0, p0, Lxo0;->a:Lep0;

    .line 30
    .line 31
    iget-object v0, p0, Lep0;->a:Lbu2;

    .line 32
    .line 33
    iget-object v1, v0, Lbu2;->d:Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget-object v2, v0, Lbu2;->i:[B

    .line 40
    .line 41
    array-length v2, v2

    .line 42
    add-int/2addr v1, v2

    .line 43
    iget-object v0, v0, Lbu2;->j:[I

    .line 44
    .line 45
    array-length v0, v0

    .line 46
    mul-int/lit8 v0, v0, 0x4

    .line 47
    .line 48
    add-int/2addr v0, v1

    .line 49
    iget p0, p0, Lep0;->n:I

    .line 50
    .line 51
    add-int/2addr v0, p0

    .line 52
    return v0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Ljava/lang/Class;
    .locals 1

    .line 1
    iget v0, p0, Lzo0;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lzo0;->h:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    const-class p0, Lyo0;

    .line 14
    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()V
    .locals 6

    .line 1
    iget v0, p0, Lzo0;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, Lzo0;->h:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    check-cast p0, Lyo0;

    .line 10
    .line 11
    invoke-virtual {p0}, Lyo0;->stop()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lyo0;->k:Z

    .line 16
    .line 17
    iget-object p0, p0, Lyo0;->h:Lxo0;

    .line 18
    .line 19
    iget-object p0, p0, Lxo0;->a:Lep0;

    .line 20
    .line 21
    iget-object v1, p0, Lep0;->d:Lx82;

    .line 22
    .line 23
    iget-object v2, p0, Lep0;->c:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lep0;->l:Landroid/graphics/Bitmap;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    iget-object v4, p0, Lep0;->e:Lzk;

    .line 34
    .line 35
    invoke-interface {v4, v2}, Lzk;->h(Landroid/graphics/Bitmap;)V

    .line 36
    .line 37
    .line 38
    iput-object v3, p0, Lep0;->l:Landroid/graphics/Bitmap;

    .line 39
    .line 40
    :cond_0
    const/4 v2, 0x0

    .line 41
    iput-boolean v2, p0, Lep0;->f:Z

    .line 42
    .line 43
    iget-object v2, p0, Lep0;->i:Lcp0;

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lx82;->a(Lby2;)V

    .line 48
    .line 49
    .line 50
    iput-object v3, p0, Lep0;->i:Lcp0;

    .line 51
    .line 52
    :cond_1
    iget-object v2, p0, Lep0;->k:Lcp0;

    .line 53
    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Lx82;->a(Lby2;)V

    .line 57
    .line 58
    .line 59
    iput-object v3, p0, Lep0;->k:Lcp0;

    .line 60
    .line 61
    :cond_2
    iget-object v2, p0, Lep0;->m:Lcp0;

    .line 62
    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Lx82;->a(Lby2;)V

    .line 66
    .line 67
    .line 68
    iput-object v3, p0, Lep0;->m:Lcp0;

    .line 69
    .line 70
    :cond_3
    iget-object v1, p0, Lep0;->a:Lbu2;

    .line 71
    .line 72
    iget-object v2, v1, Lbu2;->c:Lsz0;

    .line 73
    .line 74
    iput-object v3, v1, Lbu2;->l:Lfp0;

    .line 75
    .line 76
    iget-object v4, v1, Lbu2;->i:[B

    .line 77
    .line 78
    if-eqz v4, :cond_5

    .line 79
    .line 80
    iget-object v5, v2, Lsz0;->j:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v5, Ltd1;

    .line 83
    .line 84
    if-nez v5, :cond_4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    invoke-virtual {v5, v4}, Ltd1;->g(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    :goto_0
    iget-object v4, v1, Lbu2;->j:[I

    .line 91
    .line 92
    if-eqz v4, :cond_7

    .line 93
    .line 94
    iget-object v5, v2, Lsz0;->j:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v5, Ltd1;

    .line 97
    .line 98
    if-nez v5, :cond_6

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_6
    invoke-virtual {v5, v4}, Ltd1;->g(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_7
    :goto_1
    iget-object v4, v1, Lbu2;->m:Landroid/graphics/Bitmap;

    .line 105
    .line 106
    if-eqz v4, :cond_8

    .line 107
    .line 108
    iget-object v5, v2, Lsz0;->i:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v5, Lzk;

    .line 111
    .line 112
    invoke-interface {v5, v4}, Lzk;->h(Landroid/graphics/Bitmap;)V

    .line 113
    .line 114
    .line 115
    :cond_8
    iput-object v3, v1, Lbu2;->m:Landroid/graphics/Bitmap;

    .line 116
    .line 117
    iput-object v3, v1, Lbu2;->d:Ljava/nio/ByteBuffer;

    .line 118
    .line 119
    iput-object v3, v1, Lbu2;->s:Ljava/lang/Boolean;

    .line 120
    .line 121
    iget-object v1, v1, Lbu2;->e:[B

    .line 122
    .line 123
    if-eqz v1, :cond_a

    .line 124
    .line 125
    iget-object v2, v2, Lsz0;->j:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v2, Ltd1;

    .line 128
    .line 129
    if-nez v2, :cond_9

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_9
    invoke-virtual {v2, v1}, Ltd1;->g(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_a
    :goto_2
    iput-boolean v0, p0, Lep0;->j:Z

    .line 136
    .line 137
    return-void

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lzo0;->h:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method
