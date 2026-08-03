.class public final Lr4/r;
.super Lr4/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final h:Lv4/m;


# direct methods
.method public constructor <init>(Lv4/m;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lr4/s;-><init>(I)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lr4/r;->h:Lv4/m;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p1, "field == null"

    .line 10
    .line 11
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    throw p1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/r;->h:Lv4/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv4/w;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lr4/r;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/r;->h:Lv4/m;

    .line 4
    .line 5
    iget-object p1, p1, Lr4/r;->h:Lv4/m;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lv4/a;->d(Lv4/a;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final d(Lr4/p;Lz4/d;II)I
    .locals 4

    .line 1
    iget-object p1, p1, Lr4/p;->i:Lr4/w;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/r;->h:Lv4/m;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lr4/w;->l(Lv4/m;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    sub-int p3, p1, p3

    .line 10
    .line 11
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget v2, p0, Lr4/s;->g:I

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p4

    .line 23
    invoke-virtual {v0}, Lv4/w;->a()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    filled-new-array {p4, v0}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p4

    .line 31
    const-string v0, "  [%x] %s"

    .line 32
    .line 33
    invoke-static {v0, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p4

    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p2, v0, p4}, Lz4/d;->b(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p3}, Lig/a;->c0(I)I

    .line 42
    .line 43
    .line 44
    move-result p4

    .line 45
    invoke-static {p1}, La/a;->Y0(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v1, "    field_idx:    "

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p2, p4, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v2}, Lig/a;->c0(I)I

    .line 59
    .line 60
    .line 61
    move-result p4

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v1, "    access_flags: "

    .line 65
    .line 66
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/16 v1, 0x50df

    .line 70
    .line 71
    const/4 v3, 0x2

    .line 72
    invoke-static {v2, v1, v3}, Lbe/h;->A(III)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p2, p4, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_0
    invoke-virtual {p2, p3}, Lz4/d;->n(I)I

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2, v2}, Lz4/d;->n(I)I

    .line 90
    .line 91
    .line 92
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lr4/r;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lr4/r;

    .line 8
    .line 9
    iget-object v0, p0, Lr4/r;->h:Lv4/m;

    .line 10
    .line 11
    iget-object p1, p1, Lr4/r;->h:Lv4/m;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lv4/a;->d(Lv4/a;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/r;->h:Lv4/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv4/w;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-class v1, Lr4/r;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x7b

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget v1, p0, Lr4/s;->g:I

    .line 23
    .line 24
    invoke-static {v1}, La/a;->X0(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const/16 v1, 0x20

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lr4/r;->h:Lv4/m;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const/16 v1, 0x7d

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
.end method
