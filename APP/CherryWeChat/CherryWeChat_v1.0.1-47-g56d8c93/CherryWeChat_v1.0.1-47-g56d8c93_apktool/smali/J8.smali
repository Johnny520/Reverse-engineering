.class public final synthetic LJ8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lparty/iroiro/luajava/Lua;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lparty/iroiro/luajava/Lua;ILjava/lang/Object;I)V
    .locals 0

    iput p4, p0, LJ8;->a:I

    iput-object p1, p0, LJ8;->b:Lparty/iroiro/luajava/Lua;

    iput p2, p0, LJ8;->c:I

    iput-object p3, p0, LJ8;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    iget v0, p0, LJ8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LJ8;->d:Ljava/lang/Object;

    check-cast v0, Landroid/widget/EditText;

    iget-object v1, p0, LJ8;->b:Lparty/iroiro/luajava/Lua;

    iget v2, p0, LJ8;->c:I

    invoke-static {v1, v2, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->u(Lparty/iroiro/luajava/Lua;ILandroid/widget/EditText;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget v0, p0, LJ8;->c:I

    iget-object v1, p0, LJ8;->d:Ljava/lang/Object;

    iget-object v2, p0, LJ8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->d(Lparty/iroiro/luajava/Lua;ILjava/lang/Object;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget v0, p0, LJ8;->c:I

    iget-object v1, p0, LJ8;->d:Ljava/lang/Object;

    iget-object v2, p0, LJ8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->A(Lparty/iroiro/luajava/Lua;ILjava/lang/Object;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
