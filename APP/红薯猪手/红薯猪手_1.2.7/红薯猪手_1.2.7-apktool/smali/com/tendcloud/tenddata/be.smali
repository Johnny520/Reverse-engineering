.class public Lcom/tendcloud/tenddata/be;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/be$a;
    }
.end annotation


# static fields
.field private static volatile a:Lcom/tendcloud/tenddata/be;

.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;

.field private static d:Ljava/lang/String;

.field private static e:Ljava/lang/String;

.field private static f:Ljava/lang/String;

.field private static g:Ljava/lang/String;

.field private static h:Ljava/lang/String;

.field private static i:Ljava/lang/String;

.field private static j:Ljava/lang/String;

.field private static k:Ljava/lang/String;

.field private static l:Ljava/lang/String;

.field private static m:Ljava/lang/String;

.field private static n:Ljava/lang/String;

.field private static o:Ljava/lang/String;

.field private static p:Ljava/lang/String;

.field private static q:Ljava/lang/String;

.field private static r:Ljava/lang/String;

.field private static t:Ljava/lang/String;

.field private static z:Lorg/json/JSONObject;


# instance fields
.field private A:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private s:Ljava/lang/String;

.field private u:Lcom/tendcloud/tenddata/be$a;

.field private v:Ljava/lang/String;

.field private w:I

.field private x:Ljava/lang/String;

.field private y:Lorg/json/JSONObject;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object v0

    invoke-static {}, Lcom/tendcloud/tenddata/be;->a()Lcom/tendcloud/tenddata/be;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/z;->register(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    const-string v0, "account"

    sput-object v0, Lcom/tendcloud/tenddata/be;->b:Ljava/lang/String;

    const-string v0, "accountId"

    sput-object v0, Lcom/tendcloud/tenddata/be;->c:Ljava/lang/String;

    const-string v0, "name"

    sput-object v0, Lcom/tendcloud/tenddata/be;->d:Ljava/lang/String;

    const-string v0, "gender"

    sput-object v0, Lcom/tendcloud/tenddata/be;->e:Ljava/lang/String;

    const-string v0, "age"

    sput-object v0, Lcom/tendcloud/tenddata/be;->f:Ljava/lang/String;

    const-string v0, "type"

    sput-object v0, Lcom/tendcloud/tenddata/be;->g:Ljava/lang/String;

    const-string v0, "accountCus"

    sput-object v0, Lcom/tendcloud/tenddata/be;->h:Ljava/lang/String;

    const-string v0, "property1"

    sput-object v0, Lcom/tendcloud/tenddata/be;->i:Ljava/lang/String;

    const-string v0, "property2"

    sput-object v0, Lcom/tendcloud/tenddata/be;->j:Ljava/lang/String;

    const-string v0, "property3"

    sput-object v0, Lcom/tendcloud/tenddata/be;->k:Ljava/lang/String;

    const-string v0, "property4"

    sput-object v0, Lcom/tendcloud/tenddata/be;->l:Ljava/lang/String;

    const-string v0, "property5"

    sput-object v0, Lcom/tendcloud/tenddata/be;->m:Ljava/lang/String;

    const-string v0, "property6"

    sput-object v0, Lcom/tendcloud/tenddata/be;->n:Ljava/lang/String;

    const-string v0, "property7"

    sput-object v0, Lcom/tendcloud/tenddata/be;->o:Ljava/lang/String;

    const-string v0, "property8"

    sput-object v0, Lcom/tendcloud/tenddata/be;->p:Ljava/lang/String;

    const-string v0, "property9"

    sput-object v0, Lcom/tendcloud/tenddata/be;->q:Ljava/lang/String;

    const-string v0, "property10"

    sput-object v0, Lcom/tendcloud/tenddata/be;->r:Ljava/lang/String;

    const-string v0, "default"

    sput-object v0, Lcom/tendcloud/tenddata/be;->t:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/tendcloud/tenddata/be$a;->UNKNOWN:Lcom/tendcloud/tenddata/be$a;

    iput-object v0, p0, Lcom/tendcloud/tenddata/be;->u:Lcom/tendcloud/tenddata/be$a;

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    return-void
.end method

.method public static a()Lcom/tendcloud/tenddata/be;
    .locals 2

    sget-object v0, Lcom/tendcloud/tenddata/be;->a:Lcom/tendcloud/tenddata/be;

    if-nez v0, :cond_1

    const-class v0, Lcom/tendcloud/tenddata/be;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/be;->a:Lcom/tendcloud/tenddata/be;

    if-nez v1, :cond_0

    new-instance v1, Lcom/tendcloud/tenddata/be;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/be;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/be;->a:Lcom/tendcloud/tenddata/be;

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
    sget-object v0, Lcom/tendcloud/tenddata/be;->a:Lcom/tendcloud/tenddata/be;

    return-object v0
.end method

.method private a(Lcom/tendcloud/tenddata/a;)V
    .locals 2

    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/bu;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bu;-><init>()V

    sget-object v1, Lcom/tendcloud/tenddata/bu$a;->IMMEDIATELY:Lcom/tendcloud/tenddata/bu$a;

    iput-object v1, v0, Lcom/tendcloud/tenddata/bu;->b:Lcom/tendcloud/tenddata/bu$a;

    iput-object p1, v0, Lcom/tendcloud/tenddata/bu;->a:Lcom/tendcloud/tenddata/a;

    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0, p3}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    if-nez p4, :cond_0

    return-void

    :cond_0
    if-eqz p0, :cond_3

    if-eqz p1, :cond_3

    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_3

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/tendcloud/tenddata/bv;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bv;-><init>()V

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    if-eqz p2, :cond_2

    instance-of p0, p2, Ljava/util/Map;

    if-eqz p0, :cond_2

    check-cast p2, Ljava/util/Map;

    if-eqz p3, :cond_1

    const-string p0, "eventValue"

    invoke-interface {p2, p0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iput-object p2, v0, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    :cond_2
    iput-object p4, v0, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->s:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    sget-object p1, Lcom/tendcloud/tenddata/be;->d:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/tendcloud/tenddata/be;->d:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->v:Ljava/lang/String;

    :cond_0
    sget-object p1, Lcom/tendcloud/tenddata/be;->e:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/tendcloud/tenddata/be;->e:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/be$a;->valueOf(Ljava/lang/String;)Lcom/tendcloud/tenddata/be$a;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->u:Lcom/tendcloud/tenddata/be$a;

    :cond_1
    sget-object p1, Lcom/tendcloud/tenddata/be;->f:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lcom/tendcloud/tenddata/be;->f:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/tendcloud/tenddata/be;->w:I

    :cond_2
    sget-object p1, Lcom/tendcloud/tenddata/be;->g:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lcom/tendcloud/tenddata/be;->g:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->x:Ljava/lang/String;

    :cond_3
    sget-object p1, Lcom/tendcloud/tenddata/be;->h:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lcom/tendcloud/tenddata/be;->h:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_4
    return-void
.end method

.method public static declared-synchronized a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 3

    const-class v0, Lcom/tendcloud/tenddata/be;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;

    sput-object p0, Lcom/tendcloud/tenddata/be;->t:Ljava/lang/String;

    invoke-static {}, Lcom/tendcloud/tenddata/be;->g()Ljava/util/Map;

    move-result-object p0

    sget-object v1, Lcom/tendcloud/tenddata/be;->b:Ljava/lang/String;

    const-string v2, "roleCreate"

    invoke-static {v1, v2, p0, p1}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V

    invoke-static {}, Lcom/tendcloud/tenddata/ct;->a()Lcom/tendcloud/tenddata/ct;

    move-result-object p1

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1, v1}, Lcom/tendcloud/tenddata/ct;->setSubprofile(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    monitor-exit v0

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    .locals 8

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    :try_start_0
    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->c()V

    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->s:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    :cond_0
    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->s:Ljava/lang/String;

    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    sget-object v0, Lcom/tendcloud/tenddata/be;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/tendcloud/tenddata/be;->s:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p1, p2}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    if-eqz p5, :cond_1

    const-string p2, "invitationCode"

    invoke-static {p5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p1, p2, p5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object p2, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    new-instance p2, Lorg/json/JSONObject;

    iget-object p5, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    invoke-direct {p2, p5}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, Lcom/tendcloud/tenddata/i;->setUniversalProfileInfo(Ljava/lang/String;)V

    invoke-static {}, Lcom/tendcloud/tenddata/ct;->a()Lcom/tendcloud/tenddata/ct;

    move-result-object p5

    invoke-virtual {p5, p2}, Lcom/tendcloud/tenddata/ct;->setProfile(Lorg/json/JSONObject;)V

    invoke-static {p4, p3, p1, p6, p7}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private a(Ljava/lang/Object;)Z
    .locals 0

    if-eqz p1, :cond_0

    :try_start_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p1

    :catchall_0
    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private b()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->s:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    sget-object v2, Lcom/tendcloud/tenddata/be;->c:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    return-object v0
.end method

.method private static b(Lcom/tendcloud/tenddata/a;)V
    .locals 3

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/be;->g()Ljava/util/Map;

    move-result-object v0

    invoke-static {}, Lcom/tendcloud/tenddata/ct;->a()Lcom/tendcloud/tenddata/ct;

    move-result-object v1

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1, v2}, Lcom/tendcloud/tenddata/ct;->setSubprofile(Lorg/json/JSONObject;)V

    sget-object v1, Lcom/tendcloud/tenddata/be;->b:Ljava/lang/String;

    const-string v2, "roleUpdate"

    invoke-static {v1, v2, v0, p0}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    :try_start_0
    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->c()V

    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->b()Ljava/util/Map;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/i;->setUniversalProfileInfo(Ljava/lang/String;)V

    invoke-static {}, Lcom/tendcloud/tenddata/ct;->a()Lcom/tendcloud/tenddata/ct;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/ct;->setProfile(Lorg/json/JSONObject;)V

    invoke-static {p3, p2, p1, p4}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private c()V
    .locals 4

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/i;->m()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    sget-object v0, Lcom/tendcloud/tenddata/be;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/tendcloud/tenddata/be;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tendcloud/tenddata/be;->s:Ljava/lang/String;

    iget-object v2, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    sget-object v3, Lcom/tendcloud/tenddata/be;->c:Ljava/lang/String;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object v0, Lcom/tendcloud/tenddata/be;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    sget-object v2, Lcom/tendcloud/tenddata/be;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object v0, Lcom/tendcloud/tenddata/be;->g:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    sget-object v2, Lcom/tendcloud/tenddata/be;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object v0, Lcom/tendcloud/tenddata/be;->e:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    sget-object v2, Lcom/tendcloud/tenddata/be;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object v0, Lcom/tendcloud/tenddata/be;->f:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    sget-object v2, Lcom/tendcloud/tenddata/be;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    sget-object v0, Lcom/tendcloud/tenddata/be;->i:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    sget-object v2, Lcom/tendcloud/tenddata/be;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    sget-object v0, Lcom/tendcloud/tenddata/be;->j:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    sget-object v2, Lcom/tendcloud/tenddata/be;->j:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    sget-object v0, Lcom/tendcloud/tenddata/be;->k:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    sget-object v2, Lcom/tendcloud/tenddata/be;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    sget-object v0, Lcom/tendcloud/tenddata/be;->l:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    sget-object v2, Lcom/tendcloud/tenddata/be;->l:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    sget-object v0, Lcom/tendcloud/tenddata/be;->m:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    sget-object v2, Lcom/tendcloud/tenddata/be;->m:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    sget-object v0, Lcom/tendcloud/tenddata/be;->n:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    sget-object v2, Lcom/tendcloud/tenddata/be;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    sget-object v0, Lcom/tendcloud/tenddata/be;->o:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    sget-object v2, Lcom/tendcloud/tenddata/be;->o:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    sget-object v0, Lcom/tendcloud/tenddata/be;->p:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    sget-object v2, Lcom/tendcloud/tenddata/be;->p:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    sget-object v0, Lcom/tendcloud/tenddata/be;->q:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    sget-object v2, Lcom/tendcloud/tenddata/be;->q:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    sget-object v0, Lcom/tendcloud/tenddata/be;->r:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    sget-object v2, Lcom/tendcloud/tenddata/be;->r:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_e
    return-void
.end method

.method private d()V
    .locals 5

    :try_start_0
    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->f()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Lcom/tendcloud/tenddata/zz$a;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/zz$a;-><init>()V

    iget-object v2, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v3, "apiType"

    const/16 v4, 0x9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v3, "domain"

    sget-object v4, Lcom/tendcloud/tenddata/be;->b:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v3, "action"

    const-string v4, "update"

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v3, "data"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/tendcloud/tenddata/zz;->c()Landroid/os/Handler;

    move-result-object v2

    const/16 v3, 0x66

    invoke-virtual {v2, v3, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    invoke-static {}, Lcom/tendcloud/tenddata/ct;->a()Lcom/tendcloud/tenddata/ct;

    move-result-object v1

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1, v2}, Lcom/tendcloud/tenddata/ct;->setProfile(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private static e()V
    .locals 2

    sget-object v0, Lcom/tendcloud/tenddata/be;->t:Ljava/lang/String;

    invoke-static {v0}, Lcom/tendcloud/tenddata/i;->setLastRoleName(Ljava/lang/String;)V

    sget-object v0, Lcom/tendcloud/tenddata/be;->t:Ljava/lang/String;

    sget-object v1, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tendcloud/tenddata/i;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private f()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/be;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/tendcloud/tenddata/be;->s:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lcom/tendcloud/tenddata/be;->w:I

    if-eqz v1, :cond_0

    sget-object v2, Lcom/tendcloud/tenddata/be;->f:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v1, "UNKNOWN"

    iget-object v2, p0, Lcom/tendcloud/tenddata/be;->u:Lcom/tendcloud/tenddata/be$a;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/tendcloud/tenddata/be;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/tendcloud/tenddata/be;->u:Lcom/tendcloud/tenddata/be$a;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, Lcom/tendcloud/tenddata/be;->v:Ljava/lang/String;

    if-eqz v1, :cond_2

    sget-object v2, Lcom/tendcloud/tenddata/be;->d:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, Lcom/tendcloud/tenddata/be;->x:Ljava/lang/String;

    if-eqz v1, :cond_3

    sget-object v2, Lcom/tendcloud/tenddata/be;->g:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-lez v1, :cond_4

    const-string v1, "custom"

    iget-object v2, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;

    invoke-virtual {v0, v1, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_4
    return-object v0
.end method

.method private static g()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    :try_start_0
    const-string v1, "name"

    sget-object v2, Lcom/tendcloud/tenddata/be;->t:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-lez v1, :cond_0

    const-string v1, "custom"

    sget-object v2, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;

    invoke-virtual {v0, v1, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-object v0
.end method

.method private static h()V
    .locals 3

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/be;->g()Ljava/util/Map;

    move-result-object v0

    invoke-static {}, Lcom/tendcloud/tenddata/ct;->a()Lcom/tendcloud/tenddata/ct;

    move-result-object v1

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1, v2}, Lcom/tendcloud/tenddata/ct;->setSubprofile(Lorg/json/JSONObject;)V

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/tendcloud/tenddata/be;->b(Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;I)V
    .locals 1

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    sput-object v0, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    :try_start_1
    sget-object v0, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-static {}, Lcom/tendcloud/tenddata/be;->e()V

    invoke-static {}, Lcom/tendcloud/tenddata/be;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    sput-object v0, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    :try_start_1
    sget-object v0, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lcom/tendcloud/tenddata/be;->e()V

    invoke-static {}, Lcom/tendcloud/tenddata/be;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(Ljava/lang/String;I)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final onTDEBEventAccount(Lcom/tendcloud/tenddata/zz$a;)V
    .locals 9

    if-eqz p1, :cond_5

    :try_start_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    if-eqz v0, :cond_5

    const-string v1, "apiType"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v1, "account"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v1, "service"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/tendcloud/tenddata/a;

    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v1, "data"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v1, "domain"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v1, "action"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v1, "immediate"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v4, :cond_4

    const-string v1, "login"

    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "register"

    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "roleCreate"

    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v0, "parameter"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v8}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    return-void

    :cond_2
    const-string p1, "update"

    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-direct {p0, v3, v4, v5, v8}, Lcom/tendcloud/tenddata/be;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V

    return-void

    :cond_3
    :goto_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v1, "accountId"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v1, "invitationCode"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iget-object p1, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v0, "eventValue"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v1, p0

    invoke-direct/range {v1 .. v8}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V

    return-void

    :cond_4
    if-eqz v4, :cond_5

    invoke-static {v5, v4, v3, v8}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V

    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-direct {p0, v8}, Lcom/tendcloud/tenddata/be;->a(Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_5
    :goto_1
    return-void
.end method

.method public setAccountType(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->x:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->x:Ljava/lang/String;

    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method

.method public setAge(I)V
    .locals 1

    :try_start_0
    iget v0, p0, Lcom/tendcloud/tenddata/be;->w:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lcom/tendcloud/tenddata/be;->w:I

    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method public setGender(Lcom/tendcloud/tenddata/be$a;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->u:Lcom/tendcloud/tenddata/be$a;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->u:Lcom/tendcloud/tenddata/be$a;

    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->v:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->v:Ljava/lang/String;

    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method
