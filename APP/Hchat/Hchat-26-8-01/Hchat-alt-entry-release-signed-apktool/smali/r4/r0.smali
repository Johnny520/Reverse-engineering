.class public final Lr4/r0;
.super Lr4/z;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final h:Lv4/c0;

.field public i:Lr4/q0;


# direct methods
.method public constructor <init>(Lv4/c0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr4/z;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lr4/r0;->h:Lv4/c0;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lr4/r0;->i:Lr4/q0;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p1, "value == null"

    .line 13
    .line 14
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    throw p1
.end method


# virtual methods
.method public final a(Lr4/p;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr4/r0;->i:Lr4/q0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, Lr4/p;->e:Lr4/k0;

    .line 6
    .line 7
    new-instance v0, Lr4/q0;

    .line 8
    .line 9
    iget-object v1, p0, Lr4/r0;->h:Lv4/c0;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lr4/q0;-><init>(Lv4/c0;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lr4/r0;->i:Lr4/q0;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lr4/k0;->k(Lr4/l0;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->k:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()I
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    return v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lr4/r0;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/r0;->h:Lv4/c0;

    .line 4
    .line 5
    iget-object p1, p1, Lr4/r0;->h:Lv4/c0;

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

.method public final d(Lr4/p;Lz4/d;)V
    .locals 6

    .line 1
    iget-object p1, p0, Lr4/r0;->i:Lr4/q0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lr4/l0;->f()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lr4/z;->f()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lr4/r0;->h:Lv4/c0;

    .line 31
    .line 32
    invoke-virtual {v1}, Lv4/c0;->a()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/16 v3, 0x62

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    if-gt v2, v3, :cond_0

    .line 44
    .line 45
    const-string v2, ""

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/16 v2, 0x5f

    .line 49
    .line 50
    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v2, "..."

    .line 55
    .line 56
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v5, "\""

    .line 59
    .line 60
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const/16 v1, 0x22

    .line 70
    .line 71
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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
    invoke-virtual {p2, v4, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p1}, La/a;->Y0(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const-string v1, "  string_data_off: "

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const/4 v1, 0x4

    .line 99
    invoke-virtual {p2, v1, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_1
    invoke-virtual {p2, p1}, Lz4/d;->k(I)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lr4/r0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Lr4/r0;

    .line 8
    .line 9
    iget-object v0, p0, Lr4/r0;->h:Lv4/c0;

    .line 10
    .line 11
    iget-object p1, p1, Lr4/r0;->h:Lv4/c0;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lv4/c0;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/r0;->h:Lv4/c0;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/c0;->g:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method
