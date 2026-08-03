.class final Lp/y0;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
    }
.end annotation


# instance fields
.field public final a:Lp/x0;


# direct methods
.method public constructor <init>(Lp/x0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp/y0;->a:Lp/x0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lp/y0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lp/y0;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_1
    iget-object v0, p0, Lp/y0;->a:Lp/x0;

    .line 14
    .line 15
    iget-object p1, p1, Lp/y0;->a:Lp/x0;

    .line 16
    .line 17
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final f()Ly0/n;
    .locals 2

    .line 1
    new-instance v0, Lp/a1;

    .line 2
    .line 3
    invoke-direct {v0}, Ly0/n;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lp/y0;->a:Lp/x0;

    .line 7
    .line 8
    iput-object v1, v0, Lp/a1;->u:Lp/x0;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 1

    .line 1
    check-cast p1, Lp/a1;

    .line 2
    .line 3
    iget-object v0, p0, Lp/y0;->a:Lp/x0;

    .line 4
    .line 5
    iput-object v0, p1, Lp/a1;->u:Lp/x0;

    .line 6
    .line 7
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lp/y0;->a:Lp/x0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
