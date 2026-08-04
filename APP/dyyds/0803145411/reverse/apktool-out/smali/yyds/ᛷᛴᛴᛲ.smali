.class public final Lyyds/ᛷᛴᛴᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛴᛲᲈᲁ;


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    iput p1, p0, Lyyds/ᛷᛴᛴᛲ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lyyds/ᛴᛲᛷᛸ;

    .line 10
    .line 11
    const/16 v0, 0x8

    .line 12
    .line 13
    invoke-direct {p1, v0}, Lyyds/ᛴᛲᛷᛸ;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lyyds/ᛷᛴᛴᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p1, Lyyds/ᛷᛴᛴᛲ;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, v0}, Lyyds/ᛷᛴᛴᛲ;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lyyds/ᛷᛴᛴᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lyyds/ᲈᛱᛸᛴ;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lyyds/ᛷᛴᛴᛲ;->ᛲᲈᲁ:I

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lyyds/ᛷᛴᛴᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/Object;Lyyds/ᛴᛳᲀᲈ;)Z
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛷᛴᛴᛲ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lyyds/ᛷᛶᛵᛵ;

    .line 7
    .line 8
    :goto_0
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :pswitch_0
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_1
    check-cast p1, Landroid/graphics/ImageDecoder$Source;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛵᛸᛸᛷ(Ljava/lang/Object;IILyyds/ᛴᛳᲀᲈ;)Lyyds/ᲁᛱᛸᛵ;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛷᛴᛴᛲ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛷᛴᛴᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lyyds/ᛷᛶᛵᛵ;

    .line 9
    .line 10
    invoke-virtual {p1}, Lyyds/ᛷᛶᛵᛵ;->ᛵᛸᛸᛷ()Landroid/graphics/Bitmap;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast v1, Lyyds/ᲈᛱᛸᛴ;

    .line 15
    .line 16
    invoke-static {p0, v1}, Lyyds/ᛳᛸᛵᲈ;->ᲀᛲᛳᲀ(Landroid/graphics/Bitmap;Lyyds/ᲈᛱᛸᛴ;)Lyyds/ᛳᛸᛵᲈ;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-static {p1}, Landroid/graphics/ImageDecoder;->createSource(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast v1, Lyyds/ᛷᛴᛴᛲ;

    .line 28
    .line 29
    invoke-virtual {v1, p0, p2, p3, p4}, Lyyds/ᛷᛴᛴᛲ;->ᲀᛲᛳᲀ(Landroid/graphics/ImageDecoder$Source;IILyyds/ᛴᛳᲀᲈ;)Lyyds/ᛳᛸᛵᲈ;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    check-cast p1, Landroid/graphics/ImageDecoder$Source;

    .line 35
    .line 36
    invoke-virtual {p0, p1, p2, p3, p4}, Lyyds/ᛷᛴᛴᛲ;->ᲀᛲᛳᲀ(Landroid/graphics/ImageDecoder$Source;IILyyds/ᛴᛳᲀᲈ;)Lyyds/ᛳᛸᛵᲈ;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ᲀᛲᛳᲀ(Landroid/graphics/ImageDecoder$Source;IILyyds/ᛴᛳᲀᲈ;)Lyyds/ᛳᛸᛵᲈ;
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᛵᲁᛶᛳ;

    .line 2
    .line 3
    invoke-direct {v0, p2, p3, p4}, Lyyds/ᛵᲁᛶᛳ;-><init>(IILyyds/ᛴᛳᲀᲈ;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Landroid/graphics/ImageDecoder;->decodeBitmap(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/Bitmap;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 p4, 0x2

    .line 11
    const-string v0, "BitmapImageDecoder"

    .line 12
    .line 13
    invoke-static {v0, p4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    if-eqz p4, :cond_0

    .line 18
    .line 19
    new-instance p4, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v1, "Decoded ["

    .line 22
    .line 23
    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, "x"

    .line 34
    .line 35
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v2, "] for ["

    .line 46
    .line 47
    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p2, "]"

    .line 60
    .line 61
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-static {v0, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    :cond_0
    new-instance p2, Lyyds/ᛳᛸᛵᲈ;

    .line 72
    .line 73
    iget-object p0, p0, Lyyds/ᛷᛴᛴᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, Lyyds/ᛴᛲᛷᛸ;

    .line 76
    .line 77
    invoke-direct {p2, p1, p0}, Lyyds/ᛳᛸᛵᲈ;-><init>(Landroid/graphics/Bitmap;Lyyds/ᲈᛱᛸᛴ;)V

    .line 78
    .line 79
    .line 80
    return-object p2
.end method
