.class public final synthetic Ln8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I

.field public final synthetic e:Lparty/iroiro/luajava/Lua;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Ln8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln8;->b:Ljava/lang/String;

    iput-object p2, p0, Ln8;->c:Ljava/lang/String;

    iput-object p4, p0, Ln8;->e:Lparty/iroiro/luajava/Lua;

    iput p3, p0, Ln8;->d:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;I)V
    .locals 0

    .line 2
    iput p5, p0, Ln8;->a:I

    iput-object p1, p0, Ln8;->b:Ljava/lang/String;

    iput-object p2, p0, Ln8;->c:Ljava/lang/String;

    iput p3, p0, Ln8;->d:I

    iput-object p4, p0, Ln8;->e:Lparty/iroiro/luajava/Lua;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ln8;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Ln8;->d:I

    iget-object v1, p0, Ln8;->e:Lparty/iroiro/luajava/Lua;

    iget-object v2, p0, Ln8;->b:Ljava/lang/String;

    iget-object v3, p0, Ln8;->c:Ljava/lang/String;

    invoke-static {v2, v3, v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->N(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ln8;->e:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Ln8;->d:I

    iget-object v2, p0, Ln8;->b:Ljava/lang/String;

    iget-object v3, p0, Ln8;->c:Ljava/lang/String;

    invoke-static {v2, v3, v1, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->Y(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget v0, p0, Ln8;->d:I

    iget-object v1, p0, Ln8;->e:Lparty/iroiro/luajava/Lua;

    iget-object v2, p0, Ln8;->b:Ljava/lang/String;

    iget-object v3, p0, Ln8;->c:Ljava/lang/String;

    invoke-static {v2, v3, v0, v1}, Lio/github/cherrywechat/lua/api/CherryAPI;->E(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget v0, p0, Ln8;->d:I

    iget-object v1, p0, Ln8;->e:Lparty/iroiro/luajava/Lua;

    iget-object v2, p0, Ln8;->b:Ljava/lang/String;

    iget-object v3, p0, Ln8;->c:Ljava/lang/String;

    invoke-static {v2, v3, v0, v1}, Lio/github/cherrywechat/lua/api/CherryAPI;->W(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;)LTC;

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
