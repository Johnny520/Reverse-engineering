.class public final Lyyds/ᛴᲈᲇᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛱᛸᛵ;
.implements Lyyds/ᛴᛱᛵ;


# instance fields
.field public final ᲀᛲᛳᲀ:Landroid/graphics/drawable/Drawable;

.field public final synthetic ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛴᲈᲇᛸ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string p2, "Argument must not be null"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lyyds/ᛴᲈᲇᛸ;->ᲀᛲᛳᲀ:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    return-void
.end method

.method private final ᲀᛲᛳᲀ()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛴᲈᲇᛸ;->ᲀᛲᛳᲀ:Landroid/graphics/drawable/Drawable;

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

.method public final ᛲᛴᛳᛲ()V
    .locals 6

    .line 1
    iget v0, p0, Lyyds/ᛴᲈᲇᛸ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛴᲈᲇᛸ;->ᲀᛲᛳᲀ:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    check-cast p0, Lyyds/ᲇᛱᛴᛲ;

    .line 10
    .line 11
    invoke-virtual {p0}, Lyyds/ᲇᛱᛴᛲ;->stop()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᲇᲇᲇᛱ:Z

    .line 16
    .line 17
    iget-object p0, p0, Lyyds/ᲇᛱᛴᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛸᛲᛸ;

    .line 18
    .line 19
    iget-object p0, p0, Lyyds/ᲇᛸᛲᛸ;->ᛲᲈᲁ:Lyyds/ᲇᛴᲈᛷ;

    .line 20
    .line 21
    iget-object v1, p0, Lyyds/ᲇᛴᲈᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛷᛲ;

    .line 22
    .line 23
    iget-object v2, p0, Lyyds/ᲇᛴᲈᛷ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lyyds/ᲇᛴᲈᛷ;->ᛷᛵᲇᲀ:Landroid/graphics/Bitmap;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    iget-object v4, p0, Lyyds/ᲇᛴᲈᛷ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛱᛸᛴ;

    .line 34
    .line 35
    invoke-interface {v4, v2}, Lyyds/ᲈᛱᛸᛴ;->ᛱᲈᲁ(Landroid/graphics/Bitmap;)V

    .line 36
    .line 37
    .line 38
    iput-object v3, p0, Lyyds/ᲇᛴᲈᛷ;->ᛷᛵᲇᲀ:Landroid/graphics/Bitmap;

    .line 39
    .line 40
    :cond_0
    const/4 v2, 0x0

    .line 41
    iput-boolean v2, p0, Lyyds/ᲇᛴᲈᛷ;->ᲇᲇᲇᛱ:Z

    .line 42
    .line 43
    iget-object v2, p0, Lyyds/ᲇᛴᲈᛷ;->ᛲᛳᛶᲁ:Lyyds/ᛸᛴᛴᛲ;

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lyyds/ᲁᛷᛲ;->ᛷᛵᲇᲀ(Lyyds/ᲁᛱᛶᛲ;)V

    .line 48
    .line 49
    .line 50
    iput-object v3, p0, Lyyds/ᲇᛴᲈᛷ;->ᛲᛳᛶᲁ:Lyyds/ᛸᛴᛴᛲ;

    .line 51
    .line 52
    :cond_1
    iget-object v2, p0, Lyyds/ᲇᛴᲈᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛸᛴᛴᛲ;

    .line 53
    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Lyyds/ᲁᛷᛲ;->ᛷᛵᲇᲀ(Lyyds/ᲁᛱᛶᛲ;)V

    .line 57
    .line 58
    .line 59
    iput-object v3, p0, Lyyds/ᲇᛴᲈᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛸᛴᛴᛲ;

    .line 60
    .line 61
    :cond_2
    iget-object v2, p0, Lyyds/ᲇᛴᲈᛷ;->ᛲᛲᲈᲈ:Lyyds/ᛸᛴᛴᛲ;

    .line 62
    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Lyyds/ᲁᛷᛲ;->ᛷᛵᲇᲀ(Lyyds/ᲁᛱᛶᛲ;)V

    .line 66
    .line 67
    .line 68
    iput-object v3, p0, Lyyds/ᲇᛴᲈᛷ;->ᛲᛲᲈᲈ:Lyyds/ᛸᛴᛴᛲ;

    .line 69
    .line 70
    :cond_3
    iget-object v1, p0, Lyyds/ᲇᛴᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛷᛶᛵᛵ;

    .line 71
    .line 72
    iget-object v2, v1, Lyyds/ᛷᛶᛵᛵ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲈᛶᲈ;

    .line 73
    .line 74
    iput-object v3, v1, Lyyds/ᛷᛶᛵᛵ;->ᛷᛵᲇᲀ:Lyyds/ᛱᛱᲈᲇ;

    .line 75
    .line 76
    iget-object v4, v1, Lyyds/ᛷᛶᛵᛵ;->ᛲᛳᛶᲁ:[B

    .line 77
    .line 78
    if-eqz v4, :cond_5

    .line 79
    .line 80
    iget-object v5, v2, Lyyds/ᲀᲈᛶᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v5, Lyyds/ᲁᛶᲇᛱ;

    .line 83
    .line 84
    if-nez v5, :cond_4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    invoke-virtual {v5, v4}, Lyyds/ᲁᛶᲇᛱ;->ᛶᛷᛲᲁ(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    :goto_0
    iget-object v4, v1, Lyyds/ᛷᛶᛵᛵ;->ᛷᲈᲈᲁ:[I

    .line 91
    .line 92
    if-eqz v4, :cond_7

    .line 93
    .line 94
    iget-object v5, v2, Lyyds/ᲀᲈᛶᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v5, Lyyds/ᲁᛶᲇᛱ;

    .line 97
    .line 98
    if-nez v5, :cond_6

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_6
    invoke-virtual {v5, v4}, Lyyds/ᲁᛶᲇᛱ;->ᛶᛷᛲᲁ(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_7
    :goto_1
    iget-object v4, v1, Lyyds/ᛷᛶᛵᛵ;->ᛲᛲᲈᲈ:Landroid/graphics/Bitmap;

    .line 105
    .line 106
    if-eqz v4, :cond_8

    .line 107
    .line 108
    iget-object v5, v2, Lyyds/ᲀᲈᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v5, Lyyds/ᲈᛱᛸᛴ;

    .line 111
    .line 112
    invoke-interface {v5, v4}, Lyyds/ᲈᛱᛸᛴ;->ᛱᲈᲁ(Landroid/graphics/Bitmap;)V

    .line 113
    .line 114
    .line 115
    :cond_8
    iput-object v3, v1, Lyyds/ᛷᛶᛵᛵ;->ᛲᛲᲈᲈ:Landroid/graphics/Bitmap;

    .line 116
    .line 117
    iput-object v3, v1, Lyyds/ᛷᛶᛵᛵ;->ᲇᲈᛵᛷ:Ljava/nio/ByteBuffer;

    .line 118
    .line 119
    iput-object v3, v1, Lyyds/ᛷᛶᛵᛵ;->ᲀᛲᛲᲇ:Ljava/lang/Boolean;

    .line 120
    .line 121
    iget-object v1, v1, Lyyds/ᛷᛶᛵᛵ;->ᛲᛴᛳᛲ:[B

    .line 122
    .line 123
    if-eqz v1, :cond_a

    .line 124
    .line 125
    iget-object v2, v2, Lyyds/ᲀᲈᛶᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v2, Lyyds/ᲁᛶᲇᛱ;

    .line 128
    .line 129
    if-nez v2, :cond_9

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_9
    invoke-virtual {v2, v1}, Lyyds/ᲁᛶᲇᛱ;->ᛶᛷᛲᲁ(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_a
    :goto_2
    iput-boolean v0, p0, Lyyds/ᲇᛴᲈᛷ;->ᛷᲈᲈᲁ:Z

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

.method public ᛲᲈᲁ()V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛴᲈᲇᛸ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛴᲈᲇᛸ;->ᲀᛲᛳᲀ:Landroid/graphics/drawable/Drawable;

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
    instance-of v0, p0, Lyyds/ᲇᛱᛴᛲ;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    check-cast p0, Lyyds/ᲇᛱᛴᛲ;

    .line 27
    .line 28
    iget-object p0, p0, Lyyds/ᲇᛱᛴᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛸᛲᛸ;

    .line 29
    .line 30
    iget-object p0, p0, Lyyds/ᲇᛸᛲᛸ;->ᛲᲈᲁ:Lyyds/ᲇᛴᲈᛷ;

    .line 31
    .line 32
    iget-object p0, p0, Lyyds/ᲇᛴᲈᛷ;->ᛷᛵᲇᲀ:Landroid/graphics/Bitmap;

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
    check-cast p0, Lyyds/ᲇᛱᛴᛲ;

    .line 39
    .line 40
    iget-object p0, p0, Lyyds/ᲇᛱᛴᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛸᛲᛸ;

    .line 41
    .line 42
    iget-object p0, p0, Lyyds/ᲇᛸᛲᛸ;->ᛲᲈᲁ:Lyyds/ᲇᛴᲈᛷ;

    .line 43
    .line 44
    iget-object p0, p0, Lyyds/ᲇᛴᲈᛷ;->ᛷᛵᲇᲀ:Landroid/graphics/Bitmap;

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

.method public final ᛵᛸᛸᛷ()I
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛴᲈᲇᛸ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛴᲈᲇᛸ;->ᲀᛲᛳᲀ:Landroid/graphics/drawable/Drawable;

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
    check-cast p0, Lyyds/ᲇᛱᛴᛲ;

    .line 26
    .line 27
    iget-object p0, p0, Lyyds/ᲇᛱᛴᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛸᛲᛸ;

    .line 28
    .line 29
    iget-object p0, p0, Lyyds/ᲇᛸᛲᛸ;->ᛲᲈᲁ:Lyyds/ᲇᛴᲈᛷ;

    .line 30
    .line 31
    iget-object v0, p0, Lyyds/ᲇᛴᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛷᛶᛵᛵ;

    .line 32
    .line 33
    iget-object v1, v0, Lyyds/ᛷᛶᛵᛵ;->ᲇᲈᛵᛷ:Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget-object v2, v0, Lyyds/ᛷᛶᛵᛵ;->ᛲᛳᛶᲁ:[B

    .line 40
    .line 41
    array-length v2, v2

    .line 42
    add-int/2addr v1, v2

    .line 43
    iget-object v0, v0, Lyyds/ᛷᛶᛵᛵ;->ᛷᲈᲈᲁ:[I

    .line 44
    .line 45
    array-length v0, v0

    .line 46
    mul-int/lit8 v0, v0, 0x4

    .line 47
    .line 48
    add-int/2addr v0, v1

    .line 49
    iget p0, p0, Lyyds/ᲇᛴᲈᛷ;->ᛱᛳᲇ:I

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

.method public final ᲇᲈᛵᛷ()Ljava/lang/Class;
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛴᲈᲇᛸ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᛴᲈᲇᛸ;->ᲀᛲᛳᲀ:Landroid/graphics/drawable/Drawable;

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
    const-class p0, Lyyds/ᲇᛱᛴᛲ;

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
