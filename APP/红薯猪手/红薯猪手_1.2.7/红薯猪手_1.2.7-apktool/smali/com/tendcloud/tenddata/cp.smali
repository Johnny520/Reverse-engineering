.class public Lcom/tendcloud/tenddata/cp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static c:Ljava/lang/String;

.field public static d:[B

.field private static volatile e:Lcom/tendcloud/tenddata/cp;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/tendcloud/tenddata/cp;->a:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/tendcloud/tenddata/cp;->b:Ljava/util/HashMap;

    const-string v0, "utf-8"

    sput-object v0, Lcom/tendcloud/tenddata/cp;->c:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Lcom/tendcloud/tenddata/cp;->e:Lcom/tendcloud/tenddata/cp;

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object v0

    invoke-static {}, Lcom/tendcloud/tenddata/cp;->a()Lcom/tendcloud/tenddata/cp;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/z;->register(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    sput-object v0, Lcom/tendcloud/tenddata/cp;->d:[B

    goto :goto_0

    :cond_0
    const-string v0, "ab"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    sput-object v0, Lcom/tendcloud/tenddata/cp;->d:[B

    :goto_0
    return-void
.end method

.method public static a()Lcom/tendcloud/tenddata/cp;
    .locals 2

    sget-object v0, Lcom/tendcloud/tenddata/cp;->e:Lcom/tendcloud/tenddata/cp;

    if-nez v0, :cond_1

    const-class v0, Lcom/tendcloud/tenddata/cp;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/cp;->e:Lcom/tendcloud/tenddata/cp;

    if-nez v1, :cond_0

    new-instance v1, Lcom/tendcloud/tenddata/cp;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/cp;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/cp;->e:Lcom/tendcloud/tenddata/cp;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lcom/tendcloud/tenddata/cp;->e:Lcom/tendcloud/tenddata/cp;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/tendcloud/tenddata/a;)Ljava/util/TreeSet;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tendcloud/tenddata/a;",
            ")",
            "Ljava/util/TreeSet<",
            "Lcom/tendcloud/tenddata/cq;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    const/4 v1, 0x0

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    move-result-object v2

    const/16 v3, 0x64

    invoke-virtual {v2, p1, v3, v1}, Lcom/tendcloud/tenddata/cr;->a(Lcom/tendcloud/tenddata/a;ILjava/lang/String;)Ljava/util/TreeSet;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/util/TreeSet;->size()I

    move-result v2

    if-lez v2, :cond_1

    invoke-virtual {v1}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :catchall_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/tendcloud/tenddata/cq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    invoke-virtual {v4}, Lcom/tendcloud/tenddata/cq;->c()[B

    move-result-object v5

    sget-object v6, Lcom/tendcloud/tenddata/cp;->d:[B

    invoke-static {v5, v6}, Lcom/tendcloud/tenddata/y;->b([B[B)[B

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/tendcloud/tenddata/cq;->writeData([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_0
    :try_start_2
    invoke-virtual {v0, v1}, Ljava/util/TreeSet;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v1}, Ljava/util/TreeSet;->clear()V

    :cond_1
    if-nez v1, :cond_2

    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/util/TreeSet;->size()I

    move-result v2

    :goto_1
    const-class v4, Landroid/util/EventLogTags;

    monitor-enter v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    if-ge v2, v3, :cond_6

    :try_start_3
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    move-result-object v5

    sub-int/2addr v3, v2

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->getRootFolder()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, p1, v3, v2}, Lcom/tendcloud/tenddata/cr;->a(Lcom/tendcloud/tenddata/a;ILjava/lang/String;)Ljava/util/TreeSet;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-eqz p1, :cond_5

    :try_start_4
    invoke-virtual {p1}, Ljava/util/TreeSet;->size()I

    move-result v1

    if-lez v1, :cond_5

    invoke-virtual {p1}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :catchall_1
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tendcloud/tenddata/cq;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-virtual {v2}, Lcom/tendcloud/tenddata/cq;->c()[B

    move-result-object v3

    invoke-static {v3}, Lcom/tendcloud/tenddata/as;->b([B)[B

    move-result-object v3

    if-eqz v3, :cond_3

    array-length v5, v3

    if-nez v5, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v2, v3}, Lcom/tendcloud/tenddata/cq;->writeData([B)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v1, p1

    goto :goto_3

    :cond_5
    move-object v1, p1

    :cond_6
    :try_start_6
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :try_start_7
    invoke-virtual {v0}, Ljava/util/TreeSet;->size()I

    move-result p1

    if-lez p1, :cond_7

    if-eqz v1, :cond_7

    invoke-virtual {v1, v0}, Ljava/util/TreeSet;->addAll(Ljava/util/Collection;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_4

    :catchall_3
    move-exception v0

    :goto_3
    :try_start_8
    monitor-exit v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :try_start_9
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :catchall_4
    :cond_7
    :goto_4
    return-object v1
.end method

.method public final declared-synchronized onTDEBEventDataStore(Lcom/tendcloud/tenddata/bv;)V
    .locals 5

    monitor-enter p0

    if-nez p1, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/a;->getMessageFormat()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UNIFIED_SDK_JSON"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p1, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance v0, Lcom/tendcloud/tenddata/cv;

    iget-object v1, p1, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    iget-object v2, p1, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/tendcloud/tenddata/cv;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p1, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/cv;->setData(Ljava/util/Map;)V

    const/4 v1, 0x0

    iget-object v2, p1, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    invoke-virtual {v2}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v2

    const-string v3, "BG"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {}, Lcom/tendcloud/tenddata/dk;->b()Lcom/tendcloud/tenddata/dk;

    move-result-object v1

    const/4 v2, 0x1

    iget-object v3, p1, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    iget-object v4, p1, Lcom/tendcloud/tenddata/bv;->e:Landroid/util/Pair;

    invoke-virtual {v1, v0, v2, v3, v4}, Lcom/tendcloud/tenddata/dk;->a(Lcom/tendcloud/tenddata/cv;ZLcom/tendcloud/tenddata/a;Landroid/util/Pair;)Lorg/json/JSONObject;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    if-nez v1, :cond_3

    monitor-exit p0

    return-void

    :cond_3
    :try_start_2
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/as;->a([B)[B

    move-result-object v0

    new-instance v1, Lcom/tendcloud/tenddata/cq;

    invoke-direct {v1, v0}, Lcom/tendcloud/tenddata/cq;-><init>([B)V

    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    move-result-object v0

    invoke-virtual {v0, v1, p1}, Lcom/tendcloud/tenddata/cr;->a(Lcom/tendcloud/tenddata/cq;Lcom/tendcloud/tenddata/bv;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    :cond_4
    monitor-exit p0

    return-void
.end method

.method public sendMessageFaild(Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/cr;->clearDataCache(Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public sendMessageSuccess(Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/cr;->confirmRead(Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
