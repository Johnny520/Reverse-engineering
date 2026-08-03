.class final Lcom/tendcloud/tenddata/am;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/am$a;
    }
.end annotation


# static fields
.field private static final a:I = 0x3a98

.field private static final b:I = 0x3a98


# instance fields
.field private c:Ljava/net/URL;

.field private d:Lcom/tendcloud/tenddata/aq;

.field private e:Lcom/tendcloud/tenddata/ap;

.field private f:Lcom/tendcloud/tenddata/an;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:I

.field private k:I


# direct methods
.method private constructor <init>(Ljava/net/URL;Lcom/tendcloud/tenddata/aq;Lcom/tendcloud/tenddata/ap;Lcom/tendcloud/tenddata/an;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    iput-object p2, p0, Lcom/tendcloud/tenddata/am;->d:Lcom/tendcloud/tenddata/aq;

    iput-object p3, p0, Lcom/tendcloud/tenddata/am;->e:Lcom/tendcloud/tenddata/ap;

    iput-object p4, p0, Lcom/tendcloud/tenddata/am;->f:Lcom/tendcloud/tenddata/an;

    iput p5, p0, Lcom/tendcloud/tenddata/am;->j:I

    iput p6, p0, Lcom/tendcloud/tenddata/am;->k:I

    iput-object p7, p0, Lcom/tendcloud/tenddata/am;->g:Ljava/lang/String;

    iput-object p8, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    iput-object p9, p0, Lcom/tendcloud/tenddata/am;->i:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/net/URL;Lcom/tendcloud/tenddata/aq;Lcom/tendcloud/tenddata/ap;Lcom/tendcloud/tenddata/an;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/am$1;)V
    .locals 0

    invoke-direct/range {p0 .. p9}, Lcom/tendcloud/tenddata/am;-><init>(Ljava/net/URL;Lcom/tendcloud/tenddata/aq;Lcom/tendcloud/tenddata/ap;Lcom/tendcloud/tenddata/an;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/tendcloud/tenddata/aq;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->d:Lcom/tendcloud/tenddata/aq;

    return-object v0
.end method

.method public a(Lcom/tendcloud/tenddata/a;)Lcom/tendcloud/tenddata/ar;
    .locals 7

    const-string v0, "TD_app_pefercen_profile"

    const-string v1, ""

    invoke-static {v1}, Lcom/tendcloud/tenddata/ar;->a(Ljava/lang/String;)Lcom/tendcloud/tenddata/ar;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0, v2}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    move-result-object v1

    iget-object v3, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    iget-object v4, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p1

    const-string v5, "SDK"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v5

    if-ne p1, v5, :cond_2

    invoke-static {v4}, Lcom/tendcloud/tenddata/ai;->a(Ljava/lang/String;)V

    move p1, v2

    :goto_0
    sget-object v5, Lcom/tendcloud/tenddata/ai;->a:Ljava/util/Queue;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    if-gt p1, v5, :cond_2

    invoke-static {}, Lcom/tendcloud/tenddata/ai;->a()Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {v3, v5}, Lcom/tendcloud/tenddata/ai;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v5

    iput-object v5, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    invoke-virtual {v3, v5}, Ljava/net/URL;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v2}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    move-result-object v1

    iget-object v5, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {v5}, Lcom/tendcloud/tenddata/ai;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result v5

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v6

    if-eq v5, v6, :cond_1

    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v2, "TD_sdk_last_send_url"

    iget-object v3, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v0, v2, v3}, Lcom/tendcloud/tenddata/s;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v2, "TD_sdk_last_send_host"

    iget-object v3, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1, v0, v2, v3}, Lcom/tendcloud/tenddata/s;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->i:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/tendcloud/tenddata/ak;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v0

    const/4 v2, 0x2

    if-eq p1, v0, :cond_3

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/ak;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v2}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;)V

    return-object v1

    :cond_3
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1, v2}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x3

    const/4 v3, 0x1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    iget-object v4, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {v4, v2}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Lcom/tendcloud/tenddata/ak;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    invoke-virtual {p0, v3}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v3

    if-ne p1, v3, :cond_8

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {p1, v3, v2}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;Ljava/lang/String;I)V

    goto/16 :goto_2

    :cond_4
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1, v3}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    iget-object v4, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {v4, v3}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Lcom/tendcloud/tenddata/ak;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    invoke-virtual {p0, v3}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v4

    if-eq p1, v4, :cond_5

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1, v3}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4, v2}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;)V

    :cond_5
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v4

    if-ne p1, v4, :cond_6

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    iget-object v4, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {v4, v0}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Lcom/tendcloud/tenddata/ak;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    invoke-virtual {p0, v3}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v4

    if-eq p1, v4, :cond_6

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4, v2}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;Ljava/lang/String;I)V

    :cond_6
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v4

    if-ne p1, v4, :cond_7

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    const/4 v4, 0x4

    invoke-static {p1, v4}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    iget-object v5, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {v5, v4}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, v5}, Lcom/tendcloud/tenddata/ak;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    invoke-virtual {p0, v3}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v5

    if-eq p1, v5, :cond_7

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1, v4}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4, v2}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;Ljava/lang/String;I)V

    :cond_7
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v2

    if-ne p1, v2, :cond_8

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/aj;->b(Ljava/lang/String;)I

    move-result p1

    if-ne p1, v0, :cond_8

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/aj;->c(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_8

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/aj;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    invoke-static {v2, p1}, Lcom/tendcloud/tenddata/ak;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v2

    iput-object v2, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {v2}, Lcom/tendcloud/tenddata/aj;->updateTimeStamp(Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result v2

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v3

    if-eq v2, v3, :cond_8

    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {v2, p1}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_8
    :goto_2
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v2

    if-ne p1, v2, :cond_9

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/aj;->b(Ljava/lang/String;)I

    move-result p1

    if-ge p1, v0, :cond_9

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/aj;->updateFailureCountWithHost(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_9
    return-object v1
.end method

.method public a(Z)Lcom/tendcloud/tenddata/ar;
    .locals 7

    const-string v0, "Host"

    const/4 v1, 0x0

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-object v4, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    check-cast v4, Ljava/net/HttpURLConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v1, 0x3a98

    :try_start_1
    invoke-virtual {v4, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {v4, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v5, "https://"

    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/tendcloud/tenddata/ah;->a:Ljava/util/HashMap;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iget-object v6, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_0

    invoke-static {v4}, Lcom/tendcloud/tenddata/ah;->setHostNameVerifyAllowAll(Ljava/net/URLConnection;)V

    :cond_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->g:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->g:Ljava/lang/String;

    invoke-static {v4, p1}, Lcom/tendcloud/tenddata/ah;->a(Ljava/net/URLConnection;Ljava/lang/String;)V

    :cond_1
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {v4, v0, p1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-virtual {v4, v0, p1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->d:Lcom/tendcloud/tenddata/aq;

    if-eqz p1, :cond_4

    invoke-virtual {p1, v4}, Lcom/tendcloud/tenddata/aq;->a(Ljava/net/HttpURLConnection;)V

    :cond_4
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->e:Lcom/tendcloud/tenddata/ap;

    if-eqz p1, :cond_5

    invoke-virtual {p1, v4}, Lcom/tendcloud/tenddata/ap;->a(Ljava/net/HttpURLConnection;)V

    :cond_5
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->f:Lcom/tendcloud/tenddata/an;

    if-eqz p1, :cond_6

    invoke-virtual {p1, v4}, Lcom/tendcloud/tenddata/an;->a(Ljava/net/HttpURLConnection;)V

    :cond_6
    invoke-virtual {v4}, Ljava/net/URLConnection;->connect()V

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->f:Lcom/tendcloud/tenddata/an;

    invoke-static {p1, v4, v2, v3, v0}, Lcom/tendcloud/tenddata/ar;->a(Ljava/lang/String;Ljava/net/HttpURLConnection;JLcom/tendcloud/tenddata/an;)Lcom/tendcloud/tenddata/ar;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_2

    :catchall_0
    move-exception p1

    move-object v1, v4

    goto :goto_1

    :catchall_1
    move-exception p1

    :goto_1
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/ar;->a(Ljava/lang/String;)Lcom/tendcloud/tenddata/ar;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_7
    :goto_2
    return-object p1

    :catchall_2
    move-exception p1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_8
    throw p1
.end method

.method public b()Lcom/tendcloud/tenddata/ar;
    .locals 3

    const-string v0, ""

    invoke-static {v0}, Lcom/tendcloud/tenddata/ar;->a(Ljava/lang/String;)Lcom/tendcloud/tenddata/ar;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, v1}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result v1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v2

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {v1}, Lcom/tendcloud/tenddata/aj;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    invoke-static {v2, v1}, Lcom/tendcloud/tenddata/ak;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v1

    iput-object v1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "\n url: "

    .line 2
    .line 3
    invoke-static {v0}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, "\n method: "

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->d:Lcom/tendcloud/tenddata/aq;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, "\n headers: "

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->e:Lcom/tendcloud/tenddata/ap;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, "\n content length: "

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->f:Lcom/tendcloud/tenddata/an;

    .line 38
    .line 39
    const-string v2, ""

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/an;->a()[B

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    array-length v1, v1

    .line 48
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move-object v1, v2

    .line 54
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, "\n content Type: "

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->f:Lcom/tendcloud/tenddata/an;

    .line 63
    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/an;->b()Lcom/tendcloud/tenddata/an$a;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, "\n host: "

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, "\n ip: "

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->i:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, "\n connectionTimeout: "

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget v1, p0, Lcom/tendcloud/tenddata/am;->j:I

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, "\n readTimeout: "

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget v1, p0, Lcom/tendcloud/tenddata/am;->k:I

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, "\n cert:  "

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->g:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v1, "\n"

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    return-object v0
.end method
