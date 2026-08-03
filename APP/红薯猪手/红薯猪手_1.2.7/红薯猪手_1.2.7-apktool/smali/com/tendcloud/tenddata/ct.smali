.class public Lcom/tendcloud/tenddata/ct;
.super Lcom/tendcloud/tenddata/cy;
.source "SourceFile"


# static fields
.field public static a:Lcom/tendcloud/tenddata/ct;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/tendcloud/tenddata/cy;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()Lcom/tendcloud/tenddata/ct;
    .locals 2

    const-class v0, Lcom/tendcloud/tenddata/ct;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/ct;->a:Lcom/tendcloud/tenddata/ct;

    if-nez v1, :cond_0

    new-instance v1, Lcom/tendcloud/tenddata/ct;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/ct;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/ct;->a:Lcom/tendcloud/tenddata/ct;

    :cond_0
    sget-object v1, Lcom/tendcloud/tenddata/ct;->a:Lcom/tendcloud/tenddata/ct;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 4

    const-string v0, "account"

    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/ct;->a:Lcom/tendcloud/tenddata/ct;

    iget-object v1, v1, Lcom/tendcloud/tenddata/cy;->b:Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lcom/tendcloud/tenddata/i;->m()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Lcom/tendcloud/tenddata/ct;->a:Lcom/tendcloud/tenddata/ct;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v3}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    invoke-super {p0}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public setCurrentPageName(Ljava/lang/String;)V
    .locals 1

    const-string v0, "page"

    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setDeepLink(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    const-string v0, "deeplink"

    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public setProfile(Lorg/json/JSONObject;)V
    .locals 1

    const-string v0, "account"

    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setSessionId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "sessionId"

    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setSessionStartTime(J)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "sessionStartTime"

    invoke-virtual {p0, p2, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setSubprofile(Lorg/json/JSONObject;)V
    .locals 1

    const-string v0, "subaccount"

    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
