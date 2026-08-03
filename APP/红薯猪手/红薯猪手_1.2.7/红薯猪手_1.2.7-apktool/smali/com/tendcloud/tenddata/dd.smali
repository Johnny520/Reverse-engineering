.class public Lcom/tendcloud/tenddata/dd;
.super Lcom/tendcloud/tenddata/cy;
.source "SourceFile"


# static fields
.field public static a:Lcom/tendcloud/tenddata/dc; = null

.field private static final c:Ljava/lang/String; = "type"

.field private static final d:Ljava/lang/String; = "deviceId"

.field private static final e:Ljava/lang/String; = "runtimeConfig"

.field private static final f:Ljava/lang/String; = "hardwareConfig"

.field private static final g:Ljava/lang/String; = "softwareConfig"


# instance fields
.field private h:Lcom/tendcloud/tenddata/de;

.field private i:Lcom/tendcloud/tenddata/db;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/tendcloud/tenddata/cy;-><init>()V

    new-instance v0, Lcom/tendcloud/tenddata/de;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/de;-><init>()V

    iput-object v0, p0, Lcom/tendcloud/tenddata/dd;->h:Lcom/tendcloud/tenddata/de;

    new-instance v0, Lcom/tendcloud/tenddata/db;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/db;-><init>()V

    iput-object v0, p0, Lcom/tendcloud/tenddata/dd;->i:Lcom/tendcloud/tenddata/db;

    invoke-direct {p0}, Lcom/tendcloud/tenddata/dd;->d()V

    return-void
.end method

.method private d()V
    .locals 2

    const-string v0, "type"

    const-string v1, "mobile"

    invoke-virtual {p0, v0, v1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, Lcom/tendcloud/tenddata/dc;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/dc;-><init>()V

    sput-object v0, Lcom/tendcloud/tenddata/dd;->a:Lcom/tendcloud/tenddata/dc;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "deviceId"

    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, Lcom/tendcloud/tenddata/dg;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/dg;-><init>()V

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "runtimeConfig"

    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/tendcloud/tenddata/dd;->i:Lcom/tendcloud/tenddata/db;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "hardwareConfig"

    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/tendcloud/tenddata/dd;->h:Lcom/tendcloud/tenddata/de;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "softwareConfig"

    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/tendcloud/tenddata/de;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/dd;->h:Lcom/tendcloud/tenddata/de;

    return-object v0
.end method

.method public c()Lcom/tendcloud/tenddata/db;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/dd;->i:Lcom/tendcloud/tenddata/db;

    return-object v0
.end method
