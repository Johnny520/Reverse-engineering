.class public final synthetic Lxy0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lxy0;->α:I

    .line 5
    .line 6
    iput p2, p0, Lxy0;->β:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onHeaderDecoded(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p3, 0x1

    .line 11
    invoke-virtual {p1, p3}, Landroid/graphics/ImageDecoder;->setAllocator(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Landroid/graphics/ImageDecoder$ImageInfo;->getSize()Landroid/util/Size;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p2}, Landroid/graphics/ImageDecoder$ImageInfo;->getSize()Landroid/util/Size;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    iget v1, p0, Lxy0;->α:I

    .line 31
    .line 32
    iget p0, p0, Lxy0;->β:I

    .line 33
    .line 34
    if-le v1, p0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v1, p0

    .line 38
    :goto_0
    if-gt v0, v1, :cond_2

    .line 39
    .line 40
    if-le p2, v1, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    return-void

    .line 44
    :cond_2
    :goto_1
    int-to-float p0, v1

    .line 45
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    int-to-float v1, v1

    .line 50
    div-float/2addr p0, v1

    .line 51
    int-to-float v0, v0

    .line 52
    mul-float/2addr v0, p0

    .line 53
    float-to-int v0, v0

    .line 54
    if-ge v0, p3, :cond_3

    .line 55
    .line 56
    move v0, p3

    .line 57
    :cond_3
    int-to-float p2, p2

    .line 58
    mul-float/2addr p2, p0

    .line 59
    float-to-int p0, p2

    .line 60
    if-ge p0, p3, :cond_4

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    move p3, p0

    .line 64
    :goto_2
    invoke-virtual {p1, v0, p3}, Landroid/graphics/ImageDecoder;->setTargetSize(II)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
