.class public final synthetic Lks0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/PixelCopy$OnPixelCopyFinishedListener;


# instance fields
.field public final synthetic α:J

.field public final synthetic β:Lns0;

.field public final synthetic γ:Landroid/view/View;

.field public final synthetic δ:Landroid/view/View;

.field public final synthetic ε:Ltt0;

.field public final synthetic ζ:Lls0;

.field public final synthetic η:Landroid/graphics/Bitmap;

.field public final synthetic θ:Lms0;

.field public final synthetic ι:Lwa;


# direct methods
.method public synthetic constructor <init>(JLns0;Landroid/view/View;Landroid/view/View;Ltt0;Lls0;Landroid/graphics/Bitmap;Lms0;Lwa;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lks0;->α:J

    .line 5
    .line 6
    iput-object p3, p0, Lks0;->β:Lns0;

    .line 7
    .line 8
    iput-object p4, p0, Lks0;->γ:Landroid/view/View;

    .line 9
    .line 10
    iput-object p5, p0, Lks0;->δ:Landroid/view/View;

    .line 11
    .line 12
    iput-object p6, p0, Lks0;->ε:Ltt0;

    .line 13
    .line 14
    iput-object p7, p0, Lks0;->ζ:Lls0;

    .line 15
    .line 16
    iput-object p8, p0, Lks0;->η:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    iput-object p9, p0, Lks0;->θ:Lms0;

    .line 19
    .line 20
    iput-object p10, p0, Lks0;->ι:Lwa;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final onPixelCopyFinished(I)V
    .locals 9

    .line 1
    iget-object v0, p0, Lks0;->β:Lns0;

    .line 2
    .line 3
    iget-wide v1, v0, Lns0;->κ:J

    .line 4
    .line 5
    iget-wide v3, p0, Lks0;->α:J

    .line 6
    .line 7
    cmp-long v1, v3, v1

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    iput-boolean v1, v0, Lns0;->ι:Z

    .line 14
    .line 15
    iget-object v2, p0, Lks0;->γ:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :cond_1
    iget-object v1, p0, Lks0;->δ:Landroid/view/View;

    .line 25
    .line 26
    iget-object v3, p0, Lks0;->ε:Ltt0;

    .line 27
    .line 28
    iget-object v4, p0, Lks0;->ζ:Lls0;

    .line 29
    .line 30
    iget-object v7, p0, Lks0;->ι:Lwa;

    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, Lks0;->θ:Lms0;

    .line 35
    .line 36
    iget-object v6, p1, Lms0;->γ:Landroid/graphics/Rect;

    .line 37
    .line 38
    iget-object v5, p0, Lks0;->η:Landroid/graphics/Bitmap;

    .line 39
    .line 40
    invoke-virtual/range {v0 .. v7}, Lns0;->γ(Landroid/view/View;Landroid/view/View;Ltt0;Lls0;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lwa;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    iget-object p0, v0, Lns0;->α:Ldt0;

    .line 45
    .line 46
    const-string v5, "pixel_copy_"

    .line 47
    .line 48
    invoke-static {v5, p1}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    new-instance v6, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v8, "\u5bbf\u4e3b\u89c6\u9891 PixelCopy \u8fd4\u56de\u7801="

    .line 55
    .line 56
    invoke-static {v8, p1}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {v6, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v5, v6}, Ldt0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    const/4 v5, 0x0

    .line 68
    invoke-virtual/range {v0 .. v7}, Lns0;->γ(Landroid/view/View;Landroid/view/View;Ltt0;Lls0;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lwa;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method
