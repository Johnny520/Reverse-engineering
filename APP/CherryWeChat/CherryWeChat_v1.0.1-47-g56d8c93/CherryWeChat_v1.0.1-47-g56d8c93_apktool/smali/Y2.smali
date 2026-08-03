.class public final LY2;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(ILEb;)V
    .locals 0

    iput p1, p0, LY2;->e:I

    invoke-direct {p0, p2}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LY2;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    new-instance p1, LY2;

    const/4 v0, 0x3

    invoke-direct {p1, v0, p2}, LY2;-><init>(ILEb;)V

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LY2;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    new-instance p1, LY2;

    const/4 v0, 0x2

    invoke-direct {p1, v0, p2}, LY2;-><init>(ILEb;)V

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LY2;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    new-instance p1, LY2;

    const/4 v0, 0x1

    invoke-direct {p1, v0, p2}, LY2;-><init>(ILEb;)V

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LY2;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    new-instance p1, LY2;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p2}, LY2;-><init>(ILEb;)V

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LY2;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 1

    iget p2, p0, LY2;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance p2, LY2;

    const/4 v0, 0x3

    invoke-direct {p2, v0, p1}, LY2;-><init>(ILEb;)V

    return-object p2

    :pswitch_0
    new-instance p2, LY2;

    const/4 v0, 0x2

    invoke-direct {p2, v0, p1}, LY2;-><init>(ILEb;)V

    return-object p2

    :pswitch_1
    new-instance p2, LY2;

    const/4 v0, 0x1

    invoke-direct {p2, v0, p1}, LY2;-><init>(ILEb;)V

    return-object p2

    :pswitch_2
    new-instance p2, LY2;

    const/4 v0, 0x0

    invoke-direct {p2, v0, p1}, LY2;-><init>(ILEb;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, LY2;->e:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    new-instance p1, Ljava/net/URL;

    const-wide v0, -0x16173fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    const-wide v0, -0x161e6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Ljava/net/HttpURLConnection;

    const-wide v0, -0x161a6fffff835L

    :try_start_0
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, v0, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {v1}, LfG;->h0(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_4
    invoke-static {v1, v2}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_2
    :try_start_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x161aafffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v2, -0x16042fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_1

    :goto_3
    return-object v0

    :catchall_3
    move-exception v0

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    throw v0

    :pswitch_0
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    const/4 p1, 0x0

    :try_start_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/16 v2, 0x3e8

    int-to-long v2, v2

    div-long/2addr v0, v2

    sget-object v2, LZ2;->a:Lgf;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lgf;->L()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    if-lez v4, :cond_1

    goto :goto_4

    :cond_1
    move-object v3, v5

    :goto_4
    if-nez v3, :cond_2

    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v3

    :cond_2
    invoke-static {}, Lgf;->K()Ljava/lang/String;

    move-result-object v4

    const-wide v6, -0x1666bfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LEt;

    invoke-direct {v7, v6, v3}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v8, -0x16670fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v8, LEt;

    invoke-direct {v8, v6, v4}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v9, -0x16679fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Ljava/lang/Long;

    invoke-direct {v9, v0, v1}, Ljava/lang/Long;-><init>(J)V

    new-instance v10, LEt;

    invoke-direct {v10, v6, v9}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v11, -0x16603fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    sget-object v9, LZ2;->b:Ljava/lang/String;

    new-instance v11, LEt;

    invoke-direct {v11, v6, v9}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v7, v8, v10, v11}, [LEt;

    move-result-object v6

    invoke-static {v6}, Luq;->L([LEt;)Ljava/util/Map;

    move-result-object v6

    const-wide v7, -0x1660ffffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v6, v0, v1, v7}, Lgf;->n(Lgf;Ljava/util/Map;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    const-wide v7, -0x1661dfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-wide v7, -0x16622fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-wide v3, -0x1662bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-wide v3, -0x16635fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-wide v3, -0x166c1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x166c6fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, Ljava/net/URL;

    const-wide v6, -0x166d4fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const-wide v6, -0x16687fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v6, -0x16694fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v6, -0x166a5fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v6, -0x166affffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v6, -0x16545fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v9}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v6, -0x16553fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v0, -0x1655ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lgf;->D()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    :try_start_7
    sget-object v0, Lw7;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    const-wide v6, -0x1656afffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    :try_start_8
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    invoke-virtual {v3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    const-wide v2, -0x16578fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-direct {v2, v1, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    new-instance v1, Ljava/io/BufferedReader;

    const/16 v0, 0x2000

    invoke-direct {v1, v2, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    :try_start_9
    invoke-static {v1}, LfG;->h0(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :try_start_a
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    :try_start_b
    sget-object v1, Lzm;->a:LAm;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    sget-object v3, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->Companion:Lio/github/cherrywechat/network/model/SubmitWxAccountData$Companion;

    invoke-virtual {v3}, Lio/github/cherrywechat/network/model/SubmitWxAccountData$Companion;->serializer()LQm;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v2

    check-cast v2, LQm;

    invoke-virtual {v1, v2, v0}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    const-wide v1, -0x1650cfffff835L

    :try_start_c
    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-class v1, Lio/github/cherrywechat/network/model/ApiResponse;

    invoke-static {v1}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v1

    invoke-virtual {v1}, LF9;->b()Ljava/lang/String;

    const-wide v1, -0x16527fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :goto_5
    check-cast v5, Lio/github/cherrywechat/network/model/ApiResponse;

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lio/github/cherrywechat/network/model/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;

    if-nez v0, :cond_3

    goto :goto_6

    :cond_3
    new-instance v1, LU2;

    const-wide v2, -0x16532fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->getWxId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->getAdVersion()I

    move-result v2

    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, v2}, Ljava/lang/Integer;-><init>(I)V

    new-instance v6, LT2;

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->getWxId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->getAdUrl()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->getAdVersion()I

    move-result v7

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->isUnlocked()Z

    move-result v12

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->getContinuousDays()I

    move-result v8

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->getTotalCheckins()I

    move-result v9

    invoke-direct/range {v6 .. v12}, LT2;-><init>(IIILjava/lang/String;Ljava/lang/String;Z)V

    const/4 v2, 0x1

    invoke-direct/range {v1 .. v6}, LU2;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;LT2;)V

    goto :goto_8

    :catch_1
    move-exception v0

    goto :goto_7

    :cond_4
    :goto_6
    new-instance v1, LU2;

    const-wide v2, -0x1652bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, LU2;-><init>(Ljava/lang/String;Z)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1

    goto :goto_8

    :catchall_4
    move-exception v0

    move-object v2, v0

    :try_start_d
    throw v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    :catchall_5
    move-exception v0

    :try_start_e
    invoke-static {v1, v2}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1

    :catchall_6
    move-exception v0

    move-object v2, v0

    :try_start_f
    throw v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    :catchall_7
    move-exception v0

    :try_start_10
    invoke-static {v1, v2}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1

    :goto_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance v1, LU2;

    const-wide v2, -0x16537fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, LU2;-><init>(Ljava/lang/String;Z)V

    :goto_8
    return-object v1

    :pswitch_1
    sget-object v1, LKf;->a:LKf;

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_11
    new-instance p1, Ljava/net/URL;

    const-wide v2, -0x178fcfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    new-instance v0, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    invoke-static {v0}, LfG;->h0(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object p1
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_3

    :try_start_12
    sget-object v0, Lzm;->a:LAm;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    new-instance v3, LG4;

    sget-object v4, Lio/github/cherrywechat/network/model/UpdateItem;->Companion:Lio/github/cherrywechat/network/model/UpdateItem$Companion;

    invoke-virtual {v4}, Lio/github/cherrywechat/network/model/UpdateItem$Companion;->serializer()LQm;

    move-result-object v4

    invoke-direct {v3, v4}, LG4;-><init>(LQm;)V

    invoke-virtual {v2, v3}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v2

    check-cast v2, LQm;

    invoke-virtual {v0, v2, p1}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_2

    goto :goto_9

    :catch_2
    move-exception v0

    move-object p1, v0

    const-wide v2, -0x178abfffff835L

    :try_start_13
    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-class v0, Lio/github/cherrywechat/network/model/ApiResponse;

    invoke-static {v0}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v0

    invoke-virtual {v0}, LF9;->b()Ljava/lang/String;

    const-wide v2, -0x16746fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    const/4 p1, 0x0

    :goto_9
    check-cast p1, Lio/github/cherrywechat/network/model/ApiResponse;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/ApiResponse;->getCode()I

    move-result v0

    const/16 v2, 0xc8

    if-ne v0, v2, :cond_6

    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_3

    if-nez p1, :cond_5

    goto :goto_a

    :cond_5
    move-object v1, p1

    :catch_3
    :cond_6
    :goto_a
    return-object v1

    :pswitch_2
    sget-object v1, LKf;->a:LKf;

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_14
    new-instance p1, Ljava/net/URL;

    const-wide v2, -0x17ac9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    new-instance v0, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    invoke-static {v0}, LfG;->h0(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object p1
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_5

    :try_start_15
    sget-object v0, Lzm;->a:LAm;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    new-instance v3, LG4;

    sget-object v4, Lio/github/cherrywechat/network/model/FAQCategory;->Companion:Lio/github/cherrywechat/network/model/FAQCategory$Companion;

    invoke-virtual {v4}, Lio/github/cherrywechat/network/model/FAQCategory$Companion;->serializer()LQm;

    move-result-object v4

    invoke-direct {v3, v4}, LG4;-><init>(LQm;)V

    invoke-virtual {v2, v3}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v2

    check-cast v2, LQm;

    invoke-virtual {v0, v2, p1}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_4

    goto :goto_b

    :catch_4
    move-exception v0

    move-object p1, v0

    const-wide v2, -0x17af5fffff835L

    :try_start_16
    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-class v0, Lio/github/cherrywechat/network/model/ApiResponse;

    invoke-static {v0}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v0

    invoke-virtual {v0}, LF9;->b()Ljava/lang/String;

    const-wide v2, -0x17a90fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    const/4 p1, 0x0

    :goto_b
    check-cast p1, Lio/github/cherrywechat/network/model/ApiResponse;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/ApiResponse;->getCode()I

    move-result v0

    const/16 v2, 0xc8

    if-ne v0, v2, :cond_8

    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_5

    if-nez p1, :cond_7

    goto :goto_c

    :cond_7
    move-object v1, p1

    :catch_5
    :cond_8
    :goto_c
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
