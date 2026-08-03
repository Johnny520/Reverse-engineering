.class public final synthetic LH8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lparty/iroiro/luajava/Lua;

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(ZLparty/iroiro/luajava/Lua;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LH8;->a:Z

    iput-object p2, p0, LH8;->b:Lparty/iroiro/luajava/Lua;

    iput p3, p0, LH8;->c:I

    iput p4, p0, LH8;->d:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, LH8;->c:I

    iget v1, p0, LH8;->d:I

    iget-boolean v2, p0, LH8;->a:Z

    iget-object v3, p0, LH8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v2, v3, v0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->K(ZLparty/iroiro/luajava/Lua;II)V

    return-void
.end method
