.class public final Lxd/e;
.super Lxd/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final k:Lud/p;

.field public final l:Ljava/util/ArrayList;

.field public final m:Lxd/b;


# direct methods
.method public constructor <init>(Lxd/b;Lud/p;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lxd/a;-><init>(Lud/n;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lxd/e;->l:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p2, p0, Lxd/e;->k:Lud/p;

    .line 12
    .line 13
    new-instance p1, Lxd/b;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Lxd/b;-><init>(Lud/n;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lxd/e;->m:Lxd/b;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final b(Lfd/i;Lfc/f;)V
    .locals 3

    .line 1
    const-string v0, "synchronized ("

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lfc/f;->r(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, Lxd/e;->k:Lud/p;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lud/p;->S(I)Lqd/l;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-virtual {p1, p2, v0, v2}, Lfd/e;->b(Lfc/f;Lqd/l;Z)V

    .line 15
    .line 16
    .line 17
    const-string v0, ") {"

    .line 18
    .line 19
    invoke-virtual {p2, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 20
    .line 21
    .line 22
    invoke-static {p2, v1}, Lic/a;->a(Lfc/f;Lud/p;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p1, Lfd/e;->b:Lud/r;

    .line 26
    .line 27
    invoke-static {p2, v0, v1}, Ljd/c;->a(Lfc/f;Lnd/b0;Lmd/i;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lxd/e;->m:Lxd/b;

    .line 31
    .line 32
    invoke-virtual {p1, p2, v0}, Lfd/i;->v(Lfc/f;Lud/j;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Lfc/f;->q()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lxd/e;->k:Lud/p;

    .line 2
    .line 3
    iget v0, v0, Lud/p;->n:I

    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lxd/e;->m:Lxd/b;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "Synchronized:"

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

.method public final u()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lxd/e;->m:Lxd/b;

    .line 2
    .line 3
    iget-object v0, v0, Lxd/b;->k:Ljava/util/ArrayList;

    .line 4
    .line 5
    return-object v0
.end method
