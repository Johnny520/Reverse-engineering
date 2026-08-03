.class public final Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/lua/api/MessageAPI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MessageCallback"
.end annotation


# instance fields
.field private final funcRef:I

.field private final lua:Lparty/iroiro/luajava/Lua;


# direct methods
.method public constructor <init>(Lparty/iroiro/luajava/Lua;I)V
    .locals 2

    const-wide v0, -0x10eb8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->lua:Lparty/iroiro/luajava/Lua;

    iput p2, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->funcRef:I

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;Lparty/iroiro/luajava/Lua;IILjava/lang/Object;)Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->lua:Lparty/iroiro/luajava/Lua;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->funcRef:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->copy(Lparty/iroiro/luajava/Lua;I)Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lparty/iroiro/luajava/Lua;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->lua:Lparty/iroiro/luajava/Lua;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->funcRef:I

    return v0
.end method

.method public final copy(Lparty/iroiro/luajava/Lua;I)Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;
    .locals 2

    const-wide v0, -0x10ebcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;

    invoke-direct {v0, p1, p2}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;-><init>(Lparty/iroiro/luajava/Lua;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->lua:Lparty/iroiro/luajava/Lua;

    iget-object v3, p1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->lua:Lparty/iroiro/luajava/Lua;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->funcRef:I

    iget p1, p1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->funcRef:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getFuncRef()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->funcRef:I

    return v0
.end method

.method public final getLua()Lparty/iroiro/luajava/Lua;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->lua:Lparty/iroiro/luajava/Lua;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->lua:Lparty/iroiro/luajava/Lua;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->funcRef:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x10d40fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->lua:Lparty/iroiro/luajava/Lua;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-wide v1, -0x10d55fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->funcRef:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, LEy;->f(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
