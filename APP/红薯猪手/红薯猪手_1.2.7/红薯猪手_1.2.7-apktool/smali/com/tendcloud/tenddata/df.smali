.class public Lcom/tendcloud/tenddata/df;
.super Lcom/tendcloud/tenddata/cy;
.source "SourceFile"


# static fields
.field private static volatile j:Lcom/tendcloud/tenddata/df;


# instance fields
.field private final a:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private volatile f:Ljava/lang/String;

.field private volatile g:Ljava/lang/String;

.field private volatile h:Ljava/lang/String;

.field private volatile i:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/tendcloud/tenddata/cy;-><init>()V

    const-string v0, "oaid"

    iput-object v0, p0, Lcom/tendcloud/tenddata/df;->a:Ljava/lang/String;

    const-string v0, "vaid"

    iput-object v0, p0, Lcom/tendcloud/tenddata/df;->c:Ljava/lang/String;

    const-string v0, "aaid"

    iput-object v0, p0, Lcom/tendcloud/tenddata/df;->d:Ljava/lang/String;

    const-string v0, "udid"

    iput-object v0, p0, Lcom/tendcloud/tenddata/df;->e:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/tendcloud/tenddata/df;->f:Ljava/lang/String;

    iput-object v0, p0, Lcom/tendcloud/tenddata/df;->g:Ljava/lang/String;

    iput-object v0, p0, Lcom/tendcloud/tenddata/df;->h:Ljava/lang/String;

    iput-object v0, p0, Lcom/tendcloud/tenddata/df;->i:Ljava/lang/String;

    return-void
.end method

.method public static a()Lcom/tendcloud/tenddata/df;
    .locals 2

    sget-object v0, Lcom/tendcloud/tenddata/df;->j:Lcom/tendcloud/tenddata/df;

    if-nez v0, :cond_1

    const-class v0, Lcom/tendcloud/tenddata/df;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/df;->j:Lcom/tendcloud/tenddata/df;

    if-nez v1, :cond_0

    new-instance v1, Lcom/tendcloud/tenddata/df;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/df;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/df;->j:Lcom/tendcloud/tenddata/df;

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
    sget-object v0, Lcom/tendcloud/tenddata/df;->j:Lcom/tendcloud/tenddata/df;

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/df;->f:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/df;->g:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/df;->h:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/df;->i:Ljava/lang/String;

    return-object v0
.end method

.method public setAAID(Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/tendcloud/tenddata/df;->g:Ljava/lang/String;

    const-string v0, "aaid"

    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setOAID(Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/tendcloud/tenddata/df;->f:Ljava/lang/String;

    const-string v0, "oaid"

    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setUDID(Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/tendcloud/tenddata/df;->i:Ljava/lang/String;

    const-string v0, "udid"

    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setVAID(Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/tendcloud/tenddata/df;->h:Ljava/lang/String;

    const-string v0, "vaid"

    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
