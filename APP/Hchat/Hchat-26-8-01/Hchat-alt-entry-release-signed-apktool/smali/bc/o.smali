.class public final Lbc/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lbc/p;

.field public c:Lnf/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lbc/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbc/o;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lbc/o;->b:Lbc/p;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lbc/o;->b:Lbc/p;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "\', type="

    .line 8
    .line 9
    const-string v2, "}"

    .line 10
    .line 11
    const-string v3, "ResourceFile{name=\'"

    .line 12
    .line 13
    iget-object v4, p0, Lbc/o;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v3, v4, v1, v0, v2}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method
