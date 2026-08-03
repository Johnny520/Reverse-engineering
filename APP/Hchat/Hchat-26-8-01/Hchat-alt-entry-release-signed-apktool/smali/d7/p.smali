.class public final Ld7/p;
.super Ld7/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lq7/a;


# instance fields
.field public final n:Lr7/f;

.field public final o:Lo7/g;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-direct {p0, v0, v1}, Ld7/j;-><init>(IZ)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lr7/f;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, v1}, Lr7/f;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ld7/p;->n:Lr7/f;

    .line 13
    .line 14
    new-instance v1, Lo7/g;

    .line 15
    .line 16
    invoke-direct {v1}, Lk7/a;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Ld7/p;->o:Lo7/g;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lo7/d;->P(Lk7/a;)V

    .line 25
    .line 26
    .line 27
    iput-object p0, v0, Lk7/a;->j:Lk7/a;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final S()Ld7/o;
    .locals 4

    .line 1
    iget-object v0, p0, Ld7/p;->n:Lr7/f;

    .line 2
    .line 3
    iget v0, v0, Lr7/f;->n:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    const/4 v2, 0x7

    .line 7
    if-ge v1, v2, :cond_1

    .line 8
    .line 9
    sget-object v2, Ld7/o;->p:[Ld7/o;

    .line 10
    .line 11
    aget-object v2, v2, v1

    .line 12
    .line 13
    iget v3, v2, Ld7/o;->h:I

    .line 14
    .line 15
    if-ne v0, v3, :cond_0

    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    new-instance v1, Ld7/o;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const/16 v3, 0x63

    .line 25
    .line 26
    invoke-direct {v1, v2, v0, v3}, Ld7/o;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    return-object v1
.end method

.method public final m(Lk7/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ld7/p;->n:Lr7/f;

    .line 2
    .line 3
    if-ne p1, v0, :cond_6

    .line 4
    .line 5
    invoke-virtual {p0}, Ld7/p;->S()Ld7/o;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v0, Ld7/o;->j:Ld7/o;

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    new-instance p1, Lg7/a;

    .line 14
    .line 15
    invoke-direct {p1, v0}, Ld7/q;-><init>(Ld7/o;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Ld7/e;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v0, v2, v1}, Ld7/e;-><init>(IZ)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lo7/d;->P(Lk7/a;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object v0, Ld7/o;->k:Ld7/o;

    .line 30
    .line 31
    if-ne p1, v0, :cond_1

    .line 32
    .line 33
    new-instance p1, Lf7/a;

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ld7/r;-><init>(Ld7/o;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    sget-object v0, Ld7/o;->l:Ld7/o;

    .line 40
    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    new-instance p1, Lf7/a;

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ld7/r;-><init>(Ld7/o;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    sget-object v0, Ld7/o;->m:Ld7/o;

    .line 50
    .line 51
    if-ne p1, v0, :cond_3

    .line 52
    .line 53
    new-instance p1, Lf7/a;

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ld7/r;-><init>(Ld7/o;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    sget-object v0, Ld7/o;->n:Ld7/o;

    .line 60
    .line 61
    if-ne p1, v0, :cond_4

    .line 62
    .line 63
    new-instance p1, Lf7/a;

    .line 64
    .line 65
    invoke-direct {p1, v0}, Ld7/r;-><init>(Ld7/o;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    sget-object v0, Ld7/o;->o:Ld7/o;

    .line 70
    .line 71
    if-ne p1, v0, :cond_5

    .line 72
    .line 73
    new-instance p1, Ld7/r;

    .line 74
    .line 75
    invoke-direct {p1}, Ld7/r;-><init>()V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    new-instance v0, Ld7/r;

    .line 80
    .line 81
    invoke-direct {v0, p1}, Ld7/r;-><init>(Ld7/o;)V

    .line 82
    .line 83
    .line 84
    move-object p1, v0

    .line 85
    :goto_0
    iget-object v0, p0, Ld7/p;->o:Lo7/g;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Lo7/g;->P(Lk7/a;)V

    .line 88
    .line 89
    .line 90
    :cond_6
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ld7/p;->S()Ld7/o;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", scheme: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Ld7/p;->o:Lo7/g;

    .line 19
    .line 20
    iget-object v1, v1, Lo7/g;->k:Lk7/a;

    .line 21
    .line 22
    check-cast v1, Ld7/q;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method
