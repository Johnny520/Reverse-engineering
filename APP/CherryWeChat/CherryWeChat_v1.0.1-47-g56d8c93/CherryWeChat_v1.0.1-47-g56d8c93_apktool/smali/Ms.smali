.class public final LMs;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public e:Ljava/net/HttpURLConnection;

.field public f:Ljava/io/Closeable;

.field public g:Lfj;

.field public h:Ljava/io/InputStream;

.field public i:[B

.field public j:Ljava/io/ByteArrayOutputStream;

.field public k:I

.field public l:I

.field public m:I

.field public n:J

.field public o:J

.field public p:J

.field public q:I

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:J

.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Lfj;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;Lfj;LEb;)V
    .locals 0

    iput-object p1, p0, LMs;->r:Ljava/lang/String;

    iput-wide p2, p0, LMs;->s:J

    iput-object p4, p0, LMs;->t:Ljava/lang/String;

    iput-object p5, p0, LMs;->u:Lfj;

    invoke-direct {p0, p6}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfc;

    check-cast p2, LEb;

    invoke-virtual {p0, p2, p1}, LMs;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LMs;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LMs;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 7

    new-instance v0, LMs;

    iget-object v4, p0, LMs;->t:Ljava/lang/String;

    iget-object v5, p0, LMs;->u:Lfj;

    iget-object v1, p0, LMs;->r:Ljava/lang/String;

    iget-wide v2, p0, LMs;->s:J

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, LMs;-><init>(Ljava/lang/String;JLjava/lang/String;Lfj;LEb;)V

    return-object v0
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v1, p0

    iget v0, v1, LMs;->q:I

    const/4 v4, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v4, :cond_0

    iget v0, v1, LMs;->m:I

    iget-wide v6, v1, LMs;->p:J

    iget v8, v1, LMs;->l:I

    iget-wide v9, v1, LMs;->o:J

    iget-wide v11, v1, LMs;->n:J

    iget v13, v1, LMs;->k:I

    iget-object v14, v1, LMs;->j:Ljava/io/ByteArrayOutputStream;

    iget-object v15, v1, LMs;->i:[B

    const-wide/16 v16, 0x0

    iget-object v2, v1, LMs;->h:Ljava/io/InputStream;

    iget-object v3, v1, LMs;->g:Lfj;

    iget-object v5, v1, LMs;->f:Ljava/io/Closeable;

    iget-object v4, v1, LMs;->e:Ljava/net/HttpURLConnection;

    :try_start_0
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-wide/from16 v20, v6

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-wide v2, -0x16f31fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const-wide/16 v16, 0x0

    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    new-instance v0, Ljava/net/URL;

    const-wide v2, -0x16031fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    const-wide v2, -0x16085fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-object v4, v0

    check-cast v4, Ljava/net/HttpURLConnection;

    const-wide v2, -0x16f45fffff835L

    :try_start_1
    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const-wide v2, -0x16f4afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v5, -0x16f58fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, LMs;->r:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v0, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v2, -0x16f60fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v2, -0x16f6dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v0, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iget-object v2, v1, LMs;->t:Ljava/lang/String;

    const-wide v5, -0x16f7efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-wide v2, -0x16f04fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v4}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-wide v5, -0x16f12fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-wide v5, -0x16f18fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    :try_start_3
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    const/16 v2, 0xc8

    if-ne v0, v2, :cond_7

    invoke-virtual {v4}, Ljava/net/URLConnection;->getContentLengthLong()J

    move-result-wide v2

    cmp-long v5, v2, v16

    if-lez v5, :cond_2

    move-wide v5, v2

    goto :goto_0

    :cond_2
    iget-wide v5, v1, LMs;->s:J

    :goto_0
    invoke-virtual {v4}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v7

    iget-object v8, v1, LMs;->u:Lfj;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/16 v9, 0x2000

    :try_start_4
    new-array v9, v9, [B

    new-instance v10, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move v13, v0

    move-wide v11, v2

    move-object v2, v7

    move-object v3, v8

    move-object v15, v9

    move-object v14, v10

    move-wide/from16 v20, v16

    const/4 v0, 0x0

    const/4 v8, 0x0

    move-wide v9, v5

    move-object v5, v2

    :goto_1
    :try_start_5
    invoke-virtual {v2, v15}, Ljava/io/InputStream;->read([B)I

    move-result v6

    const/4 v7, -0x1

    move/from16 p1, v8

    if-eq v6, v7, :cond_6

    const/4 v7, 0x0

    invoke-virtual {v14, v15, v7, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    int-to-long v7, v6

    add-long v6, v20, v7

    cmp-long v8, v9, v16

    move/from16 v20, v8

    const/16 v8, 0x64

    if-lez v20, :cond_3

    move-wide/from16 v20, v6

    int-to-long v6, v8

    mul-long v6, v6, v20

    div-long/2addr v6, v9

    long-to-int v6, v6

    invoke-static {v6, v8}, LTB;->f(II)I

    move-result v6

    goto :goto_2

    :cond_3
    move-wide/from16 v20, v6

    const/16 v6, 0x400

    int-to-long v6, v6

    div-long v6, v20, v6

    long-to-int v6, v6

    invoke-static {v6, v8}, LTB;->f(II)I

    move-result v6

    :goto_2
    if-le v6, v0, :cond_5

    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    new-instance v7, Ll;

    const/4 v8, 0x5

    move-object/from16 v22, v0

    const/4 v0, 0x0

    invoke-direct {v7, v3, v6, v0, v8}, Ll;-><init>(Ljava/lang/Object;ILEb;I)V

    iput-object v4, v1, LMs;->e:Ljava/net/HttpURLConnection;

    iput-object v5, v1, LMs;->f:Ljava/io/Closeable;

    iput-object v3, v1, LMs;->g:Lfj;

    iput-object v2, v1, LMs;->h:Ljava/io/InputStream;

    iput-object v15, v1, LMs;->i:[B

    iput-object v14, v1, LMs;->j:Ljava/io/ByteArrayOutputStream;

    iput v13, v1, LMs;->k:I

    iput-wide v11, v1, LMs;->n:J

    iput-wide v9, v1, LMs;->o:J

    move/from16 v8, p1

    iput v8, v1, LMs;->l:I

    move-object/from16 v18, v2

    move-object/from16 p1, v3

    move-wide/from16 v2, v20

    iput-wide v2, v1, LMs;->p:J

    iput v6, v1, LMs;->m:I

    const/4 v0, 0x1

    iput v0, v1, LMs;->q:I

    move-object/from16 v0, v22

    invoke-static {v0, v7, v1}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    sget-object v7, Lgc;->a:Lgc;

    if-ne v0, v7, :cond_4

    return-object v7

    :cond_4
    move-wide/from16 v20, v2

    move v0, v6

    goto :goto_3

    :cond_5
    move/from16 v8, p1

    move-object/from16 v18, v2

    move-object/from16 p1, v3

    move-wide/from16 v2, v20

    const/16 v19, 0x1

    :goto_3
    move-object/from16 v2, v18

    move-object/from16 v3, p1

    goto :goto_1

    :cond_6
    :try_start_6
    invoke-virtual {v14}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const/4 v2, 0x0

    :try_start_7
    invoke-static {v5, v2}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    return-object v0

    :catchall_1
    move-exception v0

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object v2, v0

    move-object v5, v7

    :goto_4
    :try_start_8
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catchall_3
    move-exception v0

    :try_start_9
    invoke-static {v5, v2}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_7
    new-instance v2, Ljava/lang/Exception;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v5, -0x16f26fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :catchall_4
    move-exception v0

    move-object v3, v0

    :try_start_a
    throw v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :catchall_5
    move-exception v0

    :try_start_b
    invoke-static {v2, v3}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :goto_5
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    throw v0
.end method
