.class public final Ld1/e;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ld1/g;


# instance fields
.field public u:Lfg/l;

.field public v:Ld1/z;


# virtual methods
.method public final E(Ld1/z;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld1/e;->v:Ld1/z;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Ld1/e;->v:Ld1/z;

    .line 10
    .line 11
    iget-object v0, p0, Ld1/e;->u:Lfg/l;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
