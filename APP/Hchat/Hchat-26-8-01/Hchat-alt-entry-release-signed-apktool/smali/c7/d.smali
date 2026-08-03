.class public final Lc7/d;
.super Lc7/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final e:Lk7/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lk7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc7/e;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lc7/d;->e:Lk7/a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b()Ljava/io/InputStream;
    .locals 4

    .line 1
    new-instance v0, Lx7/a;

    .line 2
    .line 3
    iget-object v1, p0, Lc7/d;->e:Lk7/a;

    .line 4
    .line 5
    instance-of v2, v1, Lk7/e;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lk7/e;

    .line 11
    .line 12
    invoke-interface {v2}, Lk7/e;->c()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {v1}, Lk7/a;->r()[B

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    array-length v3, v1

    .line 21
    invoke-direct {v0, v1, v2, v3}, Lx7/a;-><init>([BII)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method
