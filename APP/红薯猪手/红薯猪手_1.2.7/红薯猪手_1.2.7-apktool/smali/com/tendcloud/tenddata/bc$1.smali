.class Lcom/tendcloud/tenddata/bc$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/bc;->getShortUrl(Lcom/tendcloud/tenddata/TDGenerateUrl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/tendcloud/tenddata/bc;

.field public final synthetic val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/bc;Lcom/tendcloud/tenddata/TDGenerateUrl;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    iput-object p2, p0, Lcom/tendcloud/tenddata/bc$1;->val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    iget-object v2, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    invoke-static {v2}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-static {v2}, Lcom/tendcloud/tenddata/u;->a([B)[B

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    invoke-static {v4, v1, v3}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/net/URL;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "https://api.talkingdata.com/adt/openapi/rest/socialSharing/getShortUrl/v2?sign="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&nonce="

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    new-array v3, v1, [Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Short url serve: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v3, v6

    invoke-static {v3}, Lcom/tendcloud/tenddata/h;->dForInternal([Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    check-cast v3, Ljava/net/HttpURLConnection;

    const/16 v4, 0xbb8

    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    const/16 v4, 0x3a98

    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual {v3, v1}, Ljava/net/URLConnection;->setDoInput(Z)V

    invoke-virtual {v3, v1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const-string v4, "POST"

    invoke-virtual {v3, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/net/URLConnection;->setUseCaches(Z)V

    const-string v4, "Content-Type"

    sget-object v5, Lcom/tendcloud/tenddata/an$a;->UNIVERSAL_STREAM:Lcom/tendcloud/tenddata/an$a;

    invoke-virtual {v5}, Lcom/tendcloud/tenddata/an$a;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "Content-Length"

    array-length v5, v2

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-virtual {v4, v2}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    const/16 v5, 0xc8

    if-ne v2, v5, :cond_3

    invoke-virtual {v3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/16 v7, 0x400

    :try_start_3
    new-array v7, v7, [B

    :goto_1
    invoke-virtual {v2, v7}, Ljava/io/InputStream;->read([B)I

    move-result v8

    if-lez v8, :cond_1

    invoke-virtual {v3, v7, v6, v8}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v7

    invoke-static {v7}, Lcom/tendcloud/tenddata/u;->b([B)[B

    move-result-object v7

    new-instance v8, Ljava/lang/String;

    const-string v9, "UTF-8"

    invoke-static {v9}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v9

    invoke-direct {v8, v7, v9}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const/4 v7, 0x2

    new-array v9, v7, [Ljava/lang/String;

    const-string v10, "TD getShortUrl success:"

    aput-object v10, v9, v6

    aput-object v8, v9, v1

    invoke-static {v9}, Lcom/tendcloud/tenddata/h;->dForInternal([Ljava/lang/String;)V

    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v10, "code"

    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    if-eq v10, v5, :cond_2

    new-array v5, v7, [Ljava/lang/String;

    const-string v7, "TD getShortUrl Error:"

    aput-object v7, v5, v6

    aput-object v8, v5, v1

    invoke-static {v5}, Lcom/tendcloud/tenddata/h;->eForInternal([Ljava/lang/String;)V

    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;

    invoke-interface {v1, v0}, Lcom/tendcloud/tenddata/TDGenerateUrl;->callback(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;

    const-string v5, "result"

    invoke-virtual {v9, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5}, Lcom/tendcloud/tenddata/TDGenerateUrl;->callback(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :goto_2
    move-object v0, v2

    goto :goto_3

    :catchall_0
    move-object v3, v0

    goto :goto_4

    :cond_3
    :try_start_4
    new-array v1, v1, [Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "TD getShortUrl Http Error:"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v6

    invoke-static {v1}, Lcom/tendcloud/tenddata/h;->eForInternal([Ljava/lang/String;)V

    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;

    invoke-interface {v1, v0}, Lcom/tendcloud/tenddata/TDGenerateUrl;->callback(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object v3, v0

    :goto_3
    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    invoke-static {v1, v4}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Ljava/io/Closeable;)V

    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    invoke-static {v1, v0}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Ljava/io/Closeable;)V

    goto :goto_5

    :catchall_1
    move-object v2, v0

    move-object v3, v2

    goto :goto_4

    :catchall_2
    move-object v2, v0

    move-object v3, v2

    move-object v4, v3

    :catchall_3
    :goto_4
    :try_start_5
    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;

    invoke-interface {v1, v0}, Lcom/tendcloud/tenddata/TDGenerateUrl;->callback(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    iget-object v0, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    invoke-static {v0, v4}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Ljava/io/Closeable;)V

    iget-object v0, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    invoke-static {v0, v2}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Ljava/io/Closeable;)V

    :goto_5
    iget-object v0, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    invoke-static {v0, v3}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Ljava/io/Closeable;)V

    return-void

    :catchall_4
    move-exception v0

    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    invoke-static {v1, v4}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Ljava/io/Closeable;)V

    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    invoke-static {v1, v2}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Ljava/io/Closeable;)V

    iget-object v1, p0, Lcom/tendcloud/tenddata/bc$1;->this$0:Lcom/tendcloud/tenddata/bc;

    invoke-static {v1, v3}, Lcom/tendcloud/tenddata/bc;->a(Lcom/tendcloud/tenddata/bc;Ljava/io/Closeable;)V

    throw v0
.end method
