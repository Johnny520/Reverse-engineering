.class public final Ls0/f;
.super Landroid/util/LruCache;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Ls0/f;->a:I

    invoke-direct {p0, p1}, Landroid/util/LruCache;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget v0, p0, Ls0/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    check-cast p2, Landroid/graphics/Bitmap;

    .line 9
    .line 10
    const-string v0, "key"

    .line 11
    .line 12
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string p1, "value"

    .line 16
    .line 17
    invoke-static {p2, p1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getByteCount()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1

    .line 25
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 26
    .line 27
    check-cast p2, Landroid/graphics/Bitmap;

    .line 28
    .line 29
    const-string v0, "key"

    .line 30
    .line 31
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string p1, "value"

    .line 35
    .line 36
    invoke-static {p2, p1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getByteCount()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
