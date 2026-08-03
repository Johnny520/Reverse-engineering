.class public final LX2;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILEb;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LX2;->e:I

    .line 1
    iput-object p3, p0, LX2;->g:Ljava/lang/String;

    iput p1, p0, LX2;->f:I

    invoke-direct {p0, p2}, LOz;-><init>(LEb;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LEb;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LX2;->e:I

    .line 2
    iput-object p1, p0, LX2;->g:Ljava/lang/String;

    invoke-direct {p0, p2}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LX2;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p2, p1}, LX2;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LX2;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LX2;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p2, p1}, LX2;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LX2;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LX2;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 2

    iget p2, p0, LX2;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance p2, LX2;

    iget-object v0, p0, LX2;->g:Ljava/lang/String;

    invoke-direct {p2, v0, p1}, LX2;-><init>(Ljava/lang/String;LEb;)V

    return-object p2

    :pswitch_0
    new-instance p2, LX2;

    iget-object v0, p0, LX2;->g:Ljava/lang/String;

    iget v1, p0, LX2;->f:I

    invoke-direct {p2, v1, p1, v0}, LX2;-><init>(ILEb;Ljava/lang/String;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, LX2;->e:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, LX2;->f:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x49f2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    sget-object p1, LNs;->a:LNs;

    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v0

    iput v1, p0, LX2;->f:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, LX2;->g:Ljava/lang/String;

    invoke-static {v0, p1, p0}, LNs;->a(Ljava/lang/String;Ljava/lang/String;LOz;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lgc;->a:Lgc;

    if-ne p1, v0, :cond_2

    move-object p1, v0

    :cond_2
    :goto_0
    return-object p1

    :pswitch_0
    iget v0, p0, LX2;->f:I

    iget-object v1, p0, LX2;->g:Ljava/lang/String;

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    const/4 p1, 0x0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const/16 v4, 0x3e8

    int-to-long v4, v4

    div-long/2addr v2, v4

    const-wide v4, -0x1715afffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    new-instance v5, LEt;

    invoke-direct {v5, v4, v1}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v6, -0x17160fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/Integer;

    invoke-direct {v6, v0}, Ljava/lang/Integer;-><init>(I)V

    new-instance v7, LEt;

    invoke-direct {v7, v4, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v8, -0x1716bfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/Long;

    invoke-direct {v6, v2, v3}, Ljava/lang/Long;-><init>(J)V

    new-instance v8, LEt;

    invoke-direct {v8, v4, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v9, -0x17175fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    sget-object v6, LZ2;->b:Ljava/lang/String;

    new-instance v9, LEt;

    invoke-direct {v9, v4, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v7, v8, v9}, [LEt;

    move-result-object v4

    invoke-static {v4}, Luq;->L([LEt;)Ljava/util/Map;

    move-result-object v4

    sget-object v5, LZ2;->a:Lgf;

    const-wide v7, -0x17101fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v4, v2, v3, v7}, Lgf;->n(Lgf;Ljava/util/Map;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    const-wide v7, -0x1710ffffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-wide v7, -0x17115fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-wide v0, -0x17120fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-wide v0, -0x1712afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-wide v0, -0x17136fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-wide v4, -0x1713bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, Ljava/net/URL;

    const-wide v4, -0x171c9fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const-wide v7, -0x171f6fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v7, -0x17183fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v5, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v7, -0x17194fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v7, -0x1719efffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v5, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v7, -0x171b4fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v5, -0x17042fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v2, -0x1704efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lgf;->D()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    sget-object v3, Lw7;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-wide v5, -0x17059fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    const-wide v1, -0x17067fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, v0, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    new-instance v0, Ljava/io/BufferedReader;

    const/16 v2, 0x2000

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    invoke-static {v0}, LfG;->h0(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    :try_start_5
    sget-object v0, Lzm;->a:LAm;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    sget-object v3, Lio/github/cherrywechat/network/model/CheckInResponseData;->Companion:Lio/github/cherrywechat/network/model/CheckInResponseData$Companion;

    invoke-virtual {v3}, Lio/github/cherrywechat/network/model/CheckInResponseData$Companion;->serializer()LQm;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v2

    check-cast v2, LQm;

    invoke-virtual {v0, v2, v1}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-wide v1, -0x1707bfffff835L

    :try_start_6
    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-class v1, Lio/github/cherrywechat/network/model/ApiResponse;

    invoke-static {v1}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v1

    invoke-virtual {v1}, LF9;->b()Ljava/lang/String;

    const-wide v1, -0x17016fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    const/4 v0, 0x0

    :goto_1
    check-cast v0, Lio/github/cherrywechat/network/model/ApiResponse;

    new-instance v1, LU2;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getCode()I

    move-result v2

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    move v4, p1

    :goto_2
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getMsg()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    :cond_4
    const-wide v2, -0x1701afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_5
    invoke-direct {v1, v0, v4}, LU2;-><init>(Ljava/lang/String;Z)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_3

    :catchall_0
    move-exception v1

    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception v2

    :try_start_8
    invoke-static {v0, v1}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    :catchall_2
    move-exception v0

    :try_start_9
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :catchall_3
    move-exception v1

    :try_start_a
    invoke-static {v2, v0}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    :catch_1
    new-instance v1, LU2;

    const-wide v2, -0x1701ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, LU2;-><init>(Ljava/lang/String;Z)V

    :goto_3
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
