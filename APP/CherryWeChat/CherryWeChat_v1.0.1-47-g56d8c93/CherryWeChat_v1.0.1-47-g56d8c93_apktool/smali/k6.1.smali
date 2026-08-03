.class public final Lk6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic a:I

.field public final b:LL5;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lk6;->a:I

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, LL5;

    invoke-direct {p1}, LL5;-><init>()V

    iput-object p1, p0, Lk6;->b:LL5;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, LL5;

    invoke-direct {p1}, LL5;-><init>()V

    iput-object p1, p0, Lk6;->b:LL5;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILvt;)Lpw;
    .locals 1

    iget v0, p0, Lk6;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/io/InputStream;

    invoke-static {p1}, Lt6;->b(Ljava/io/InputStream;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/ImageDecoder;->createSource(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p1

    iget-object v0, p0, Lk6;->b:LL5;

    invoke-virtual {v0, p1, p2, p3, p4}, LL5;->c(Landroid/graphics/ImageDecoder$Source;IILvt;)LO5;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-static {p1}, Landroid/graphics/ImageDecoder;->createSource(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p1

    iget-object v0, p0, Lk6;->b:LL5;

    invoke-virtual {v0, p1, p2, p3, p4}, LL5;->c(Landroid/graphics/ImageDecoder$Source;IILvt;)LO5;

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

    iget p2, p0, Lk6;->a:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, Ljava/io/InputStream;

    :goto_0
    const/4 p1, 0x1

    return p1

    :pswitch_0
    check-cast p1, Ljava/nio/ByteBuffer;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
