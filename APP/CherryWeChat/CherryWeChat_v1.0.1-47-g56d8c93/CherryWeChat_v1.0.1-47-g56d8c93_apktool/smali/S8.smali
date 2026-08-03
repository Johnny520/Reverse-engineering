.class public final synthetic LS8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, LS8;->a:I

    iput-object p1, p0, LS8;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget v0, p0, LS8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LS8;->b:Ljava/lang/String;

    invoke-static {v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->e(Ljava/lang/String;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, LS8;->b:Ljava/lang/String;

    invoke-static {v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->i0(Ljava/lang/String;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, LS8;->b:Ljava/lang/String;

    invoke-static {v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->X(Ljava/lang/String;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, LS8;->b:Ljava/lang/String;

    invoke-static {v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->I(Ljava/lang/String;)LTC;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
