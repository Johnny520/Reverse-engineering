.class public final synthetic LZ8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lparty/iroiro/luajava/Lua;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lparty/iroiro/luajava/Lua;II)V
    .locals 0

    iput p3, p0, LZ8;->a:I

    iput-object p1, p0, LZ8;->b:Lparty/iroiro/luajava/Lua;

    iput p2, p0, LZ8;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget v0, p0, LZ8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LZ8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, LZ8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->V(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, LZ8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, LZ8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->C0(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, LZ8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, LZ8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->F(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, LZ8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, LZ8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->R(Lparty/iroiro/luajava/Lua;I)LTC;

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
