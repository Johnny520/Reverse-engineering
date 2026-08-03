.class public final Lm7/n;
.super Ll7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final o:Ls7/f;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Lp7/l;

    .line 2
    .line 3
    invoke-direct {v0}, Lp7/l;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {p0, v0, v1}, Ll7/a;-><init>(Lp7/a;I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ls7/f;

    .line 11
    .line 12
    iget-object v0, v0, Lp7/l;->r:Lm/a;

    .line 13
    .line 14
    sget-object v2, Lr7/n;->q:Lokio/a;

    .line 15
    .line 16
    invoke-direct {v1, v2, v0}, Lo7/c;-><init>(Lk7/f;Lr7/g;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lm7/n;->o:Ls7/f;

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lo7/d;->P(Lk7/a;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final R()V
    .locals 2

    .line 1
    const-class v0, Lm7/f;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lm7/f;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lm7/q;->k:Lk7/c;

    .line 12
    .line 13
    check-cast v0, Lm7/g;

    .line 14
    .line 15
    iget-object v0, v0, Lm7/g;->o:Lu7/a;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, Lu7/c;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-virtual {v0}, Lu7/a;->c0()V

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_1
    return-void
.end method

.method public final S()V
    .locals 0

    .line 1
    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/n;->o:Ls7/f;

    .line 2
    .line 3
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
