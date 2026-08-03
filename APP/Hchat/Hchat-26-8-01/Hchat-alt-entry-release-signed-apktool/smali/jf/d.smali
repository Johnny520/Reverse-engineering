.class public final Ljf/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lf/r;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:I

.field public g:Lnc/a;


# direct methods
.method public constructor <init>(Lf/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljf/d;->a:Lf/r;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Ljf/d;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Ljf/d;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Ljf/d;->c:Ljava/lang/String;

    .line 6
    .line 7
    const-string v3, "->"

    .line 8
    .line 9
    const-string v4, ":"

    .line 10
    .line 11
    invoke-static {v0, v3, v1, v4, v2}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method
