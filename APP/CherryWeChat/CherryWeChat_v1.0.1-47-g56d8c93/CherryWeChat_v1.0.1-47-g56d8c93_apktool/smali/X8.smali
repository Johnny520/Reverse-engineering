.class public final synthetic LX8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:Lparty/iroiro/luajava/Lua;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lparty/iroiro/luajava/Lua;IILjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX8;->a:Lparty/iroiro/luajava/Lua;

    iput p2, p0, LX8;->b:I

    iput p3, p0, LX8;->c:I

    iput-object p4, p0, LX8;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    iget v0, p0, LX8;->c:I

    iget-object v1, p0, LX8;->d:Ljava/util/List;

    iget-object v2, p0, LX8;->a:Lparty/iroiro/luajava/Lua;

    iget v3, p0, LX8;->b:I

    invoke-static {v2, v3, v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->L0(Lparty/iroiro/luajava/Lua;IILjava/util/List;)LTC;

    move-result-object v0

    return-object v0
.end method
