.class public final Lse0;
.super Lte0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final i:Lc30;


# direct methods
.method public constructor <init>(Lc30;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lte0;-><init>(I)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lse0;->i:Lc30;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "field == null"

    .line 10
    .line 11
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    throw p0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lse0;->i:Lc30;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm30;->b()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lse0;

    .line 2
    .line 3
    iget-object p0, p0, Lse0;->i:Lc30;

    .line 4
    .line 5
    iget-object p1, p1, Lse0;->i:Lc30;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ldz;->d(Ldz;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final d(Lz70;Lyn;II)I
    .locals 3

    .line 1
    iget-object p1, p1, Lz70;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lni0;

    .line 4
    .line 5
    iget-object v0, p0, Lse0;->i:Lc30;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lni0;->l(Lc30;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    sub-int p3, p1, p3

    .line 12
    .line 13
    invoke-virtual {p2}, Lyn;->d()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget p0, p0, Lte0;->h:I

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p4

    .line 25
    invoke-virtual {v0}, Lm30;->b()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    filled-new-array {p4, v0}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p4

    .line 33
    const-string v0, "  [%x] %s"

    .line 34
    .line 35
    invoke-static {v0, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p4

    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-virtual {p2, p4, v0}, Lyn;->c(Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    invoke-static {p3}, Lpp0;->M(I)I

    .line 44
    .line 45
    .line 46
    move-result p4

    .line 47
    invoke-static {p1}, Lpp0;->K(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "    field_idx:    "

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p2, v0, p4}, Lyn;->c(Ljava/lang/String;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0}, Lpp0;->M(I)I

    .line 61
    .line 62
    .line 63
    move-result p4

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v1, "    access_flags: "

    .line 67
    .line 68
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/16 v1, 0x50df

    .line 72
    .line 73
    const/4 v2, 0x2

    .line 74
    invoke-static {p0, v1, v2}, Lup0;->x(III)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p2, v0, p4}, Lyn;->c(Ljava/lang/String;I)V

    .line 86
    .line 87
    .line 88
    :cond_0
    invoke-virtual {p2, p3}, Lyn;->m(I)I

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, p0}, Lyn;->m(I)I

    .line 92
    .line 93
    .line 94
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lse0;

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
    check-cast p1, Lse0;

    .line 8
    .line 9
    iget-object p0, p0, Lse0;->i:Lc30;

    .line 10
    .line 11
    iget-object p1, p1, Lse0;->i:Lc30;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ldz;->d(Ldz;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lse0;->i:Lc30;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm30;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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
    const-class v1, Lse0;

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
    iget v1, p0, Lte0;->h:I

    .line 23
    .line 24
    invoke-static {v1}, Lpp0;->J(I)Ljava/lang/String;

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
    iget-object p0, p0, Lse0;->i:Lc30;

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const/16 p0, 0x7d

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method
