.class public final Lpd/o;
.super Lpd/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final q:Lmc/a;

.field public final r:Lod/d;


# direct methods
.method public constructor <init>(Lod/d;ILmc/a;Lod/d;)V
    .locals 1

    const/4 v0, 0x6

    .line 15
    invoke-direct {p0, p1, v0, p2}, Lpd/n;-><init>(Lod/d;II)V

    .line 16
    iput-object p3, p0, Lpd/o;->q:Lmc/a;

    .line 17
    iput-object p4, p0, Lpd/o;->r:Lod/d;

    return-void
.end method

.method public constructor <init>(Lod/d;Lgf/a;Ljf/g;Lod/d;Z)V
    .locals 6

    .line 1
    const/4 v3, 0x6

    .line 2
    const/4 v4, 0x1

    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move v5, p5

    .line 7
    invoke-direct/range {v0 .. v5}, Lpd/n;-><init>(Lod/d;Lgf/a;IZZ)V

    .line 8
    .line 9
    .line 10
    iput-object p3, v0, Lpd/o;->q:Lmc/a;

    .line 11
    .line 12
    iput-object p4, v0, Lpd/o;->r:Lod/d;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final O()Lud/p;
    .locals 5

    .line 1
    new-instance v0, Lpd/o;

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
    iget-object v2, p0, Lpd/o;->q:Lmc/a;

    .line 10
    .line 11
    iget-object v3, p0, Lpd/o;->r:Lod/d;

    .line 12
    .line 13
    iget-object v4, p0, Lpd/n;->p:Lod/d;

    .line 14
    .line 15
    invoke-direct {v0, v4, v1, v2, v3}, Lpd/o;-><init>(Lod/d;ILmc/a;Lod/d;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lud/p;->P(Lud/p;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final Y(Lud/p;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lpd/o;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-super {p0, p1}, Lpd/n;->Y(Lud/p;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, Lpd/o;

    .line 17
    .line 18
    iget-object v0, p0, Lpd/o;->q:Lmc/a;

    .line 19
    .line 20
    iget-object p1, p1, Lpd/o;->q:Lmc/a;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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

.method public final toString()Ljava/lang/String;
    .locals 3

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
    const-string v1, ": INVOKE_POLYMORPHIC "

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
    const-string v1, " base: "

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lpd/o;->r:Lod/d;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, " proto: "

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Lpd/o;->q:Lmc/a;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    return-object v0
.end method
