.class public final synthetic LP8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lparty/iroiro/luajava/Lua;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;I)V
    .locals 0

    iput p4, p0, LP8;->a:I

    iput-object p1, p0, LP8;->b:Ljava/lang/String;

    iput-object p2, p0, LP8;->c:Ljava/util/Map;

    iput-object p3, p0, LP8;->d:Lparty/iroiro/luajava/Lua;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    iget v0, p0, LP8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LP8;->c:Ljava/util/Map;

    iget-object v1, p0, LP8;->d:Lparty/iroiro/luajava/Lua;

    iget-object v2, p0, LP8;->b:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->A(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, LP8;->c:Ljava/util/Map;

    iget-object v1, p0, LP8;->d:Lparty/iroiro/luajava/Lua;

    iget-object v2, p0, LP8;->b:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->l0(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, LP8;->c:Ljava/util/Map;

    iget-object v1, p0, LP8;->d:Lparty/iroiro/luajava/Lua;

    iget-object v2, p0, LP8;->b:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->Z(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
