.class public final Lud/g;
.super Lnd/b0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lud/l;


# instance fields
.field public final k:Lud/e;

.field public final l:Lod/c;

.field public m:Lb5/k;

.field public n:Lqd/j;

.field public o:Ljava/util/List;

.field public p:Lbc/m;


# direct methods
.method public constructor <init>(Lud/e;Lod/c;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lmd/e;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    iput-object v0, p0, Lud/g;->o:Ljava/util/List;

    .line 7
    .line 8
    iput-object p1, p0, Lud/g;->k:Lud/e;

    .line 9
    .line 10
    iput-object p2, p0, Lud/g;->l:Lod/c;

    .line 11
    .line 12
    iget-object p1, p2, Lod/c;->i:Lqd/j;

    .line 13
    .line 14
    iput-object p1, p0, Lud/g;->n:Lqd/j;

    .line 15
    .line 16
    new-instance p1, Lb5/k;

    .line 17
    .line 18
    const/4 p2, 0x2

    .line 19
    const/4 v0, 0x3

    .line 20
    invoke-direct {p1, p3, p2, v0}, Lb5/k;-><init>(III)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lud/g;->m:Lb5/k;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final O()Lb5/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/g;->m:Lb5/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P()Lud/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/g;->k:Lud/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Q(Lb5/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lud/g;->m:Lb5/k;

    .line 2
    .line 3
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const-class v0, Lud/g;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, Lud/g;

    .line 17
    .line 18
    iget-object v0, p0, Lud/g;->l:Lod/c;

    .line 19
    .line 20
    iget-object p1, p1, Lud/g;->l:Lod/c;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lod/c;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public final f()Lod/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/g;->l:Lod/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lud/g;->l:Lod/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lod/c;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final j()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/g;->k:Lud/e;

    .line 2
    .line 3
    iget-object v0, v0, Lud/e;->s:Ljava/lang/String;

    .line 4
    .line 5
    return-object v0
.end method

.method public final n()Lud/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/g;->k:Lud/e;

    .line 2
    .line 3
    iget-object v0, v0, Lud/e;->k:Lud/u;

    .line 4
    .line 5
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lud/g;->l:Lod/c;

    .line 2
    .line 3
    iget-object v1, v0, Lod/c;->g:Lod/a;

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v0, v0, Lod/c;->h:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, p0, Lud/g;->n:Lqd/j;

    .line 12
    .line 13
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "."

    .line 18
    .line 19
    const-string v4, " :"

    .line 20
    .line 21
    invoke-static {v1, v3, v0, v4, v2}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public final typeName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "field"

    .line 2
    .line 3
    return-object v0
.end method
