.class public final synthetic LN8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LN8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LN8;->b:Ljava/util/Map;

    iput-object p1, p0, LN8;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Map;I)V
    .locals 0

    .line 2
    iput p3, p0, LN8;->a:I

    iput-object p1, p0, LN8;->c:Ljava/lang/String;

    iput-object p2, p0, LN8;->b:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget v0, p0, LN8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LN8;->c:Ljava/lang/String;

    iget-object v1, p0, LN8;->b:Ljava/util/Map;

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->P(Ljava/lang/String;Ljava/util/Map;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, LN8;->c:Ljava/lang/String;

    iget-object v1, p0, LN8;->b:Ljava/util/Map;

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->H0(Ljava/lang/String;Ljava/util/Map;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, LN8;->c:Ljava/lang/String;

    iget-object v1, p0, LN8;->b:Ljava/util/Map;

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->j0(Ljava/lang/String;Ljava/util/Map;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, LN8;->b:Ljava/util/Map;

    iget-object v1, p0, LN8;->c:Ljava/lang/String;

    invoke-static {v1, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->n(Ljava/lang/String;Ljava/util/Map;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, LN8;->c:Ljava/lang/String;

    iget-object v1, p0, LN8;->b:Ljava/util/Map;

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->B(Ljava/lang/String;Ljava/util/Map;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
