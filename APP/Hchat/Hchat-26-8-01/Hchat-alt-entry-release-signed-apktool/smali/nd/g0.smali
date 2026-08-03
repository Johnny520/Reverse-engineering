.class public final Lnd/g0;
.super Loc/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Lud/r;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/BitSet;

    .line 5
    .line 6
    iget-object p1, p1, Lud/r;->k:Lod/d;

    .line 7
    .line 8
    iget-object p1, p1, Lod/d;->i:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-direct {v0, p1}, Ljava/util/BitSet;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lnd/g0;->g:Ljava/util/BitSet;

    .line 18
    .line 19
    return-void
.end method

.method public static b(Lud/r;I)V
    .locals 2

    .line 1
    sget-object v0, Lmd/b;->q:Lmd/b;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lnd/g0;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lnd/g0;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lnd/g0;-><init>(Lud/r;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lmd/e;->y(Loc/b;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object p0, v0, Lnd/g0;->g:Ljava/util/BitSet;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/util/BitSet;->set(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Loc/a;
    .locals 1

    .line 1
    sget-object v0, Lmd/b;->q:Lmd/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lnd/g0;->g:Ljava/util/BitSet;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "SKIP_MTH_ARGS: "

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method
