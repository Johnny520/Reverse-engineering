.class public final LX4;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;LEb;I)V
    .locals 0

    iput p4, p0, LX4;->e:I

    iput-object p1, p0, LX4;->f:Ljava/lang/Object;

    iput-object p2, p0, LX4;->g:Ljava/lang/Object;

    invoke-direct {p0, p3}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LX4;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p2, p1}, LX4;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LX4;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LX4;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p2, p1}, LX4;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LX4;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LX4;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p2, p1}, LX4;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LX4;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LX4;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_2
    invoke-virtual {p0, p2, p1}, LX4;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LX4;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LX4;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_3
    invoke-virtual {p0, p2, p1}, LX4;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LX4;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LX4;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_4
    invoke-virtual {p0, p2, p1}, LX4;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LX4;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LX4;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_5
    invoke-virtual {p0, p2, p1}, LX4;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LX4;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LX4;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 3

    iget p2, p0, LX4;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance p2, LX4;

    iget-object v0, p0, LX4;->f:Ljava/lang/Object;

    check-cast v0, LQC;

    iget-object v1, p0, LX4;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Exception;

    const/4 v2, 0x6

    invoke-direct {p2, v0, v1, p1, v2}, LX4;-><init>(Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    return-object p2

    :pswitch_0
    new-instance p2, LX4;

    iget-object v0, p0, LX4;->f:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, LX4;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x5

    invoke-direct {p2, v0, v1, p1, v2}, LX4;-><init>(Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    return-object p2

    :pswitch_1
    new-instance p2, LX4;

    iget-object v0, p0, LX4;->f:Ljava/lang/Object;

    check-cast v0, LRp;

    iget-object v1, p0, LX4;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Exception;

    const/4 v2, 0x4

    invoke-direct {p2, v0, v1, p1, v2}, LX4;-><init>(Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    return-object p2

    :pswitch_2
    new-instance p2, LX4;

    iget-object v0, p0, LX4;->f:Ljava/lang/Object;

    check-cast v0, Lhk;

    iget-object v1, p0, LX4;->g:Ljava/lang/Object;

    check-cast v1, LEC;

    const/4 v2, 0x3

    invoke-direct {p2, v0, v1, p1, v2}, LX4;-><init>(Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    return-object p2

    :pswitch_3
    new-instance p2, LX4;

    iget-object v0, p0, LX4;->f:Ljava/lang/Object;

    check-cast v0, Landroid/app/Activity;

    iget-object v1, p0, LX4;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Exception;

    const/4 v2, 0x2

    invoke-direct {p2, v0, v1, p1, v2}, LX4;-><init>(Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    return-object p2

    :pswitch_4
    new-instance p2, LX4;

    iget-object v0, p0, LX4;->f:Ljava/lang/Object;

    check-cast v0, Lqe;

    iget-object v1, p0, LX4;->g:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    const/4 v2, 0x1

    invoke-direct {p2, v0, v1, p1, v2}, LX4;-><init>(Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    return-object p2

    :pswitch_5
    new-instance p2, LX4;

    iget-object v0, p0, LX4;->f:Ljava/lang/Object;

    check-cast v0, Lfj;

    iget-object v1, p0, LX4;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Exception;

    const/4 v2, 0x0

    invoke-direct {p2, v0, v1, p1, v2}, LX4;-><init>(Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, LX4;->e:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LX4;->f:Ljava/lang/Object;

    check-cast p1, LQC;

    invoke-virtual {p1}, LQC;->f()Landroid/app/Activity;

    move-result-object p1

    const-wide v0, -0x1b841fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LX4;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Exception;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-wide v1, -0x1b848fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_0
    iget-object v0, p0, LX4;->g:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    new-instance p1, Ljava/net/URL;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x16e85fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LX4;->f:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v3, -0x16ea2fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    const-wide v3, -0x16ea9fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Ljava/net/HttpURLConnection;

    const-wide v3, -0x16d69fffff835L

    :try_start_0
    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    invoke-static {v2, v0}, Lio/github/cherrywechat/network/NetworkNativeBridge;->getHeaders(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v3, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_1
    const-wide v1, -0x16d6efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x16d7bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-wide v3, -0x16d0cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-wide v3, -0x16d12fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    :goto_1
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-direct {v3, v0, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v1, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {v1}, LfG;->h0(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    const-wide v1, -0x16d20fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    const-wide v0, -0x16d2cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_2
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_4

    :cond_3
    :try_start_5
    invoke-static {v0}, Lio/github/cherrywechat/network/NetworkNativeBridge;->decryptData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_2

    :catchall_1
    move-exception v0

    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v2

    :try_start_7
    invoke-static {v1, v0}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catchall_3
    move-exception v0

    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception v2

    :try_start_9
    invoke-static {v1, v0}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :goto_3
    :try_start_a
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x16de0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v2, -0x16df8fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    goto :goto_2

    :goto_4
    return-object v0

    :catchall_5
    move-exception v0

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    throw v0

    :pswitch_1
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LX4;->f:Ljava/lang/Object;

    check-cast p1, LRp;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x76f5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LX4;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Exception;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, LRp;->a(Ljava/lang/String;)V

    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_2
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LX4;->f:Ljava/lang/Object;

    check-cast p1, Lhk;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-wide v1, -0x435cfffff835L

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, LEy;->k(JLandroid/content/Context;I)V

    sget-object v0, LIC;->a:LIC;

    iget-object v1, p0, LX4;->g:Ljava/lang/Object;

    check-cast v1, LEC;

    iget-object v2, v1, LEC;->a:Ljava/lang/String;

    sget-object v4, LCC;->d:LCC;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v4}, LIC;->f(Ljava/lang/String;LCC;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-wide v4, -0x4363fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x4373fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v5, -0x4378fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, LEC;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v5, -0x437cfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ldk;

    invoke-direct {v5, p1, v1}, Ldk;-><init>(Lhk;LEC;)V

    invoke-static {v0, v2, v4, v5, v3}, Lgf;->S(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Z)V

    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_3
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LX4;->f:Ljava/lang/Object;

    check-cast p1, Landroid/app/Activity;

    const-wide v0, -0x502cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LX4;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Exception;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    const-wide v1, -0x5033fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_4
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_4
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LX4;->f:Ljava/lang/Object;

    check-cast p1, Lqe;

    invoke-virtual {p1}, Lqe;->a()V

    iget-object p1, p0, LX4;->g:Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, -0x5e5cfffff835L

    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2}, LEy;->k(JLandroid/content/Context;I)V

    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_5
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    const/4 p1, 0x0

    sput-boolean p1, LY4;->b:Z

    iget-object p1, p0, LX4;->f:Ljava/lang/Object;

    check-cast p1, Lfj;

    if-eqz p1, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x163c3fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LX4;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Exception;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, LTC;->a:LTC;

    goto :goto_5

    :cond_5
    const/4 p1, 0x0

    :goto_5
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
