.class public final Lp4/f;
.super Lp4/c0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final e:Z


# direct methods
.method public constructor <init>(Lu4/t;Z)V
    .locals 2

    .line 1
    sget-object v0, Lp4/k;->b:Lp4/j;

    .line 2
    .line 3
    sget-object v1, Lu4/p;->i:Lu4/p;

    .line 4
    .line 5
    invoke-direct {p0, v0, p1, v1}, Lp4/h;-><init>(Lp4/j;Lu4/t;Lu4/p;)V

    .line 6
    .line 7
    .line 8
    iput-boolean p2, p0, Lp4/f;->e:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "code-address"

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(Lu4/p;)Lp4/h;
    .locals 2

    .line 1
    new-instance p1, Lp4/f;

    .line 2
    .line 3
    iget-object v0, p0, Lp4/h;->c:Lu4/t;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p1, v0, v1}, Lp4/f;-><init>(Lu4/t;Z)V

    .line 7
    .line 8
    .line 9
    return-object p1
.end method
