.class public final synthetic LI8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;)V
    .locals 0

    iput p1, p0, LI8;->a:I

    iput-object p2, p0, LI8;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget v0, p0, LI8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LI8;->b:Ljava/util/List;

    invoke-static {v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->h(Ljava/util/List;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, LI8;->b:Ljava/util/List;

    invoke-static {v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->g(Ljava/util/List;)LTC;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
