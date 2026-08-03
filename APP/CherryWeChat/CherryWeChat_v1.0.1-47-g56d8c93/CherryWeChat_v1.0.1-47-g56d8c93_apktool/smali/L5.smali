.class public final LL5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic a:I

.field public final b:LN5;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LL5;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lgf;

    const/16 v1, 0x18

    .line 3
    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    .line 4
    iput-object v0, p0, LL5;->b:LN5;

    return-void
.end method

.method public constructor <init>(LN5;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LL5;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, LL5;->b:LN5;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILvt;)Lpw;
    .locals 1

    iget v0, p0, LL5;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, LWy;

    invoke-virtual {p1}, LWy;->b()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object p2, p0, LL5;->b:LN5;

    invoke-static {p2, p1}, LO5;->c(LN5;Landroid/graphics/Bitmap;)LO5;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Landroid/graphics/ImageDecoder$Source;

    invoke-virtual {p0, p1, p2, p3, p4}, LL5;->c(Landroid/graphics/ImageDecoder$Source;IILvt;)LO5;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic b(Ljava/lang/Object;Lvt;)Z
    .locals 0

    iget p2, p0, LL5;->a:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, LWy;

    :goto_0
    const/4 p1, 0x1

    return p1

    :pswitch_0
    check-cast p1, Landroid/graphics/ImageDecoder$Source;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Landroid/graphics/ImageDecoder$Source;IILvt;)LO5;
    .locals 1

    new-instance v0, Lgd;

    invoke-direct {v0, p2, p3, p4}, Lgd;-><init>(IILvt;)V

    invoke-static {p1, v0}, Landroid/graphics/ImageDecoder;->decodeBitmap(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string p2, "BitmapImageDecoder"

    const/4 p3, 0x2

    invoke-static {p2, p3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    :cond_0
    new-instance p2, LO5;

    iget-object p3, p0, LL5;->b:LN5;

    check-cast p3, Lgf;

    invoke-direct {p2, p3, p1}, LO5;-><init>(LN5;Landroid/graphics/Bitmap;)V

    return-object p2
.end method
