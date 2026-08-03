.class public final Lp7/g;
.super Lp7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final r:Lr7/c;

.field public final s:Lr7/f;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    const/16 v0, 0x202

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lp7/a;-><init>(S)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lr7/c;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v0, v2, v1}, Lr7/c;-><init>(II)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lp7/g;->r:Lr7/c;

    .line 14
    .line 15
    new-instance v1, Lr7/c;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-direct {v1, v2, v3}, Lr7/c;-><init>(II)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lr7/a;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-direct {v2, v3, v4}, Lr7/a;-><init>(IZ)V

    .line 25
    .line 26
    .line 27
    new-instance v3, Lr7/f;

    .line 28
    .line 29
    invoke-direct {v3, v4}, Lr7/f;-><init>(Z)V

    .line 30
    .line 31
    .line 32
    iput-object v3, p0, Lp7/g;->s:Lr7/f;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Lo7/d;->P(Lk7/a;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v2}, Lo7/d;->P(Lk7/a;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v3}, Lo7/d;->P(Lk7/a;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lp7/a;->Q()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xe

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    invoke-super {p0}, Lp7/a;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-class v1, Lp7/g;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, " {id="

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lp7/g;->r:Lr7/c;

    .line 34
    .line 35
    iget-object v1, v1, Lr7/b;->k:[B

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    aget-byte v1, v1, v2

    .line 39
    .line 40
    invoke-static {v1}, Ly7/a;->n(B)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", entryCount="

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lp7/g;->s:Lr7/f;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const/16 v1, 0x7d

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    return-object v0
.end method
