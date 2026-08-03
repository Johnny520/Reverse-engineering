.class public final Ll6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ltc;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Ll6;->a:I

    iput-object p2, p0, Ll6;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b()V
    .locals 0

    return-void
.end method

.method private final e()V
    .locals 0

    return-void
.end method

.method private final g()V
    .locals 0

    return-void
.end method

.method private final h()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    iget v0, p0, Ll6;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll6;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-class v0, Ljava/nio/ByteBuffer;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()V
    .locals 1

    iget v0, p0, Ll6;->a:I

    return-void
.end method

.method public final cancel()V
    .locals 1

    iget v0, p0, Ll6;->a:I

    return-void
.end method

.method public final d(Lwu;Lsc;)V
    .locals 0

    iget p1, p0, Ll6;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Ll6;->b:Ljava/lang/Object;

    invoke-interface {p2, p1}, Lsc;->e(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    :try_start_0
    iget-object p1, p0, Ll6;->b:Ljava/lang/Object;

    check-cast p1, Ljava/io/File;

    invoke-static {p1}, Lt6;->a(Ljava/io/File;)Ljava/nio/MappedByteBuffer;

    move-result-object p1

    invoke-interface {p2, p1}, Lsc;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-interface {p2, p1}, Lsc;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Ll6;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
