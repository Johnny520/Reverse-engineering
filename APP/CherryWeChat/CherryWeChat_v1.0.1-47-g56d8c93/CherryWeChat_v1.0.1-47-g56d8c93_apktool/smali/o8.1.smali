.class public final synthetic Lo8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;II)V
    .locals 0

    iput p3, p0, Lo8;->a:I

    iput-object p1, p0, Lo8;->b:Ljava/lang/String;

    iput p2, p0, Lo8;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lo8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo8;->b:Ljava/lang/String;

    iget v1, p0, Lo8;->c:I

    invoke-static {v1, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->F0(ILjava/lang/String;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lo8;->b:Ljava/lang/String;

    iget v1, p0, Lo8;->c:I

    invoke-static {v1, v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->h(ILjava/lang/String;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lo8;->b:Ljava/lang/String;

    iget v1, p0, Lo8;->c:I

    invoke-static {v1, v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->y(ILjava/lang/String;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lo8;->b:Ljava/lang/String;

    iget v1, p0, Lo8;->c:I

    invoke-static {v1, v0}, Lio/github/cherrywechat/lua/api/CherryAPI;->g(ILjava/lang/String;)LTC;

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
