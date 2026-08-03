.class public final Lpd/m;
.super Lpd/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final q:Lpd/n;

.field public r:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lpd/n;Lod/d;II)V
    .locals 0

    .line 14
    invoke-direct {p0, p2, p3, p4}, Lpd/n;-><init>(Lod/d;II)V

    .line 15
    iput-object p1, p0, Lpd/m;->q:Lpd/n;

    return-void
.end method

.method public constructor <init>(Lpd/n;Lod/d;Lgf/a;Z)V
    .locals 6

    .line 1
    const/16 v3, 0x8

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p2

    .line 6
    move-object v2, p3

    .line 7
    move v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lpd/n;-><init>(Lod/d;Lgf/a;IZZ)V

    .line 9
    .line 10
    .line 11
    iput-object p1, v0, Lpd/m;->q:Lpd/n;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final O()Lud/p;
    .locals 5

    .line 1
    new-instance v0, Lpd/m;

    .line 2
    .line 3
    iget-object v1, p0, Lud/p;->m:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lpd/m;->q:Lpd/n;

    .line 10
    .line 11
    iget-object v3, p0, Lpd/n;->p:Lod/d;

    .line 12
    .line 13
    iget v4, p0, Lpd/n;->o:I

    .line 14
    .line 15
    invoke-direct {v0, v2, v3, v4, v1}, Lpd/m;-><init>(Lpd/n;Lod/d;II)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lud/p;->P(Lud/p;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lpd/m;->r:Ljava/util/ArrayList;

    .line 22
    .line 23
    iput-object v1, v0, Lpd/m;->r:Ljava/util/ArrayList;

    .line 24
    .line 25
    return-object v0
.end method

.method public final Y(Lud/p;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lpd/m;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    invoke-super {p0, p1}, Lpd/n;->Y(Lud/p;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    check-cast p1, Lpd/m;

    .line 17
    .line 18
    iget-object p1, p1, Lpd/m;->q:Lpd/n;

    .line 19
    .line 20
    iget-object v1, p0, Lpd/m;->q:Lpd/n;

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Lpd/n;->Y(Lud/p;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    return v0

    .line 29
    :cond_1
    return v2
.end method

.method public final j0()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final k0()Lqd/l;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lud/p;->n:I

    .line 7
    .line 8
    invoke-static {v1}, Lxe/m;->d(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ": INVOKE_CUSTOM "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lud/p;->l:Lqd/r;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, " = "

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0, v0}, Lud/p;->J(Ljava/lang/StringBuilder;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/16 v2, 0xa

    .line 37
    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {p0, v0}, Lud/p;->K(Ljava/lang/StringBuilder;)V

    .line 44
    .line 45
    .line 46
    const-string v1, " call-site: \n  "

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lpd/m;->r:Ljava/util/ArrayList;

    .line 52
    .line 53
    const-string v3, "\n  "

    .line 54
    .line 55
    invoke-static {v1, v3}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0
.end method
