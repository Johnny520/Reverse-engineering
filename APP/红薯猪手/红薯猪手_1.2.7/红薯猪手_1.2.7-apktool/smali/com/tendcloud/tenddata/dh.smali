.class public Lcom/tendcloud/tenddata/dh;
.super Lcom/tendcloud/tenddata/cy;
.source "SourceFile"


# instance fields
.field private a:Lcom/tendcloud/tenddata/ba;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/di;)V
    .locals 10

    invoke-direct {p0}, Lcom/tendcloud/tenddata/cy;-><init>()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tendcloud/tenddata/dh;->c:Ljava/lang/String;

    sget-object v0, Lcom/tendcloud/tenddata/dh$1;->$SwitchMap$com$talkingdata$sdk$saf$datamodel$network$TDNetworkType:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const-string v1, ":"

    const-string v2, "proxy"

    const-string v3, "current"

    const-string v4, "available"

    const-string v5, "ipv6"

    const-string v6, "ip"

    const-string v7, "connected"

    const-string v8, "type"

    const-string v9, "scannable"

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    goto/16 :goto_2

    :cond_0
    :try_start_0
    sget-object p1, Lcom/tendcloud/tenddata/di;->c:Lcom/tendcloud/tenddata/di;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/di;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v8, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    sget-object p1, Lcom/tendcloud/tenddata/di;->b:Lcom/tendcloud/tenddata/di;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/di;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v8, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->e(Landroid/content/Context;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v4, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->j(Landroid/content/Context;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v7, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "cell_ip"

    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v6, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "cell_ipv6"

    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v5, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->b(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/tendcloud/tenddata/o;->a(Landroid/content/Context;Z)Lorg/json/JSONArray;

    move-result-object p1

    invoke-virtual {p0, v3, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    invoke-static {}, Lcom/tendcloud/tenddata/o;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v2, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->v(Landroid/content/Context;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-virtual {p0, v9, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :cond_4
    sget-object p1, Lcom/tendcloud/tenddata/di;->a:Lcom/tendcloud/tenddata/di;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/di;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v8, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->d(Landroid/content/Context;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v4, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->i(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, v7, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->y(Landroid/content/Context;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-virtual {p0, v3, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->z(Landroid/content/Context;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/dh;->a(Lorg/json/JSONArray;)Lcom/tendcloud/tenddata/ba;

    move-result-object v0

    iget-object v3, p0, Lcom/tendcloud/tenddata/dh;->a:Lcom/tendcloud/tenddata/ba;

    if-nez v3, :cond_5

    invoke-virtual {p0, v9, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/tendcloud/tenddata/dh;->a:Lcom/tendcloud/tenddata/ba;

    goto :goto_0

    :cond_5
    new-instance v3, Lcom/tendcloud/tenddata/bb;

    invoke-direct {v3}, Lcom/tendcloud/tenddata/bb;-><init>()V

    iget-object v4, p0, Lcom/tendcloud/tenddata/dh;->a:Lcom/tendcloud/tenddata/ba;

    invoke-virtual {v3, v4, v0}, Lcom/tendcloud/tenddata/bb;->a(Lcom/tendcloud/tenddata/ba;Lcom/tendcloud/tenddata/ba;)D

    move-result-wide v3

    const-wide v7, 0x3fe999999999999aL    # 0.8

    cmpl-double v3, v3, v7

    if-lez v3, :cond_6

    const/4 p1, 0x0

    invoke-virtual {p0, v9, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_6
    invoke-virtual {p0, v9, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/tendcloud/tenddata/dh;->a:Lcom/tendcloud/tenddata/ba;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/dh;->c:Ljava/lang/String;

    :goto_0
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {p1}, Lcom/tendcloud/tenddata/o;->x(Landroid/content/Context;)Lorg/json/JSONArray;

    move-result-object p1

    const-string v0, "configured"

    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v6, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v5}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v5, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_7
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v7, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    invoke-static {}, Lcom/tendcloud/tenddata/o;->b()Z

    move-result p1

    if-eqz p1, :cond_8

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v2, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_8
    iget-object p1, p0, Lcom/tendcloud/tenddata/dh;->c:Ljava/lang/String;

    const-string v0, "scannableFingerId"

    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :catchall_0
    :goto_2
    return-void
.end method

.method private static a(Lorg/json/JSONArray;)Lcom/tendcloud/tenddata/ba;
    .locals 10

    if-eqz p0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    :try_start_0
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    new-instance v9, Lcom/tendcloud/tenddata/ax;

    const-string v3, "name"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v3, "id"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v3, "level"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    int-to-byte v6, v2

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Lcom/tendcloud/tenddata/ax;-><init>(Ljava/lang/String;Ljava/lang/String;BBB)V

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    invoke-static {v2}, Lcom/tendcloud/tenddata/h;->eForInternal(Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/tendcloud/tenddata/ba;

    invoke-direct {p0}, Lcom/tendcloud/tenddata/ba;-><init>()V

    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/ba;->setBsslist(Ljava/util/List;)V

    goto :goto_2

    :cond_1
    const/4 p0, 0x0

    :goto_2
    return-object p0
.end method
