.class public final synthetic LO8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput p1, p0, LO8;->a:I

    iput-object p2, p0, LO8;->b:Ljava/lang/String;

    iput-object p3, p0, LO8;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget v0, p0, LO8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LO8;->b:Ljava/lang/String;

    iget-object v1, p0, LO8;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->t0(Ljava/lang/String;Ljava/lang/String;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, LO8;->b:Ljava/lang/String;

    iget-object v1, p0, LO8;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->D(Ljava/lang/String;Ljava/lang/String;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, LO8;->b:Ljava/lang/String;

    iget-object v1, p0, LO8;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->a0(Ljava/lang/String;Ljava/lang/String;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, LO8;->b:Ljava/lang/String;

    iget-object v1, p0, LO8;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->w(Ljava/lang/String;Ljava/lang/String;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, LO8;->b:Ljava/lang/String;

    iget-object v1, p0, LO8;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->h0(Ljava/lang/String;Ljava/lang/String;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, LO8;->b:Ljava/lang/String;

    iget-object v1, p0, LO8;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->y0(Ljava/lang/String;Ljava/lang/String;)LTC;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
