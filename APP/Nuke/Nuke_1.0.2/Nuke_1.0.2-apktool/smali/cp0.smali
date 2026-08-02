.class public final Lcp0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lby2;


# instance fields
.field public final h:I

.field public final i:I

.field public j:Ll82;

.field public final k:Landroid/os/Handler;

.field public final l:I

.field public final m:J

.field public n:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Landroid/os/Handler;IJ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, -0x80000000

    .line 5
    .line 6
    invoke-static {v0, v0}, Lb93;->i(II)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput v0, p0, Lcp0;->h:I

    .line 13
    .line 14
    iput v0, p0, Lcp0;->i:I

    .line 15
    .line 16
    iput-object p1, p0, Lcp0;->k:Landroid/os/Handler;

    .line 17
    .line 18
    iput p2, p0, Lcp0;->l:I

    .line 19
    .line 20
    iput-wide p3, p0, Lcp0;->m:J

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p0, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648"

    .line 24
    .line 25
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    throw p0
.end method


# virtual methods
.method public final f(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final g(Lyq2;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final m(Lyq2;)V
    .locals 1

    .line 1
    iget v0, p0, Lcp0;->h:I

    .line 2
    .line 3
    iget p0, p0, Lcp0;->i:I

    .line 4
    .line 5
    invoke-virtual {p1, v0, p0}, Lyq2;->l(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final o(Ll82;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcp0;->j:Ll82;

    .line 2
    .line 3
    return-void
.end method

.method public final p(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final u()Ll82;
    .locals 0

    .line 1
    iget-object p0, p0, Lcp0;->j:Ll82;

    .line 2
    .line 3
    return-object p0
.end method

.method public final v(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcp0;->n:Landroid/graphics/Bitmap;

    .line 3
    .line 4
    return-void
.end method

.method public final w(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 2
    .line 3
    iput-object p1, p0, Lcp0;->n:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iget-object v0, p0, Lcp0;->k:Landroid/os/Handler;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-wide v1, p0, Lcp0;->m:J

    .line 13
    .line 14
    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final x()V
    .locals 0

    .line 1
    return-void
.end method
