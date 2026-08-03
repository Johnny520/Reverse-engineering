.class public abstract Lp/e0;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/e2;


# instance fields
.field public u:Lp/r1;

.field public v:Lp/r1;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lp/d;->c:Lp/c0;

    .line 5
    .line 6
    iput-object v0, p0, Lp/e0;->u:Lp/r1;

    .line 7
    .line 8
    iput-object v0, p0, Lp/e0;->v:Lp/r1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final F()Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 2
    .line 3
    return-object v0
.end method

.method public c1()V
    .locals 2

    .line 1
    new-instance v0, Lp/d0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lp/d0;-><init>(Lp/e0;I)V

    .line 5
    .line 6
    .line 7
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 8
    .line 9
    invoke-static {p0, v1, v0}, Lx1/k;->z(Lx1/i;Ljava/lang/Object;Lfg/l;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lp/e0;->l1()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public d1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp/e0;->u:Lp/r1;

    .line 2
    .line 3
    iput-object v0, p0, Lp/e0;->v:Lp/r1;

    .line 4
    .line 5
    new-instance v0, Lp/d0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lp/d0;-><init>(Lp/e0;I)V

    .line 9
    .line 10
    .line 11
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lx1/k;->C(Ly0/n;Ljava/lang/String;Lfg/l;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final e1()V
    .locals 1

    .line 1
    sget-object v0, Lp/d;->c:Lp/c0;

    .line 2
    .line 3
    iput-object v0, p0, Lp/e0;->u:Lp/r1;

    .line 4
    .line 5
    return-void
.end method

.method public abstract k1(Lp/r1;)Lp/r1;
.end method

.method public l1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp/e0;->u:Lp/r1;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lp/e0;->k1(Lp/r1;)Lp/r1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lp/e0;->v:Lp/r1;

    .line 8
    .line 9
    new-instance v0, Lp/d0;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, p0, v1}, Lp/d0;-><init>(Lp/e0;I)V

    .line 13
    .line 14
    .line 15
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 16
    .line 17
    invoke-static {p0, v1, v0}, Lx1/k;->C(Ly0/n;Ljava/lang/String;Lfg/l;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
