.class public final Lp7/e;
.super Lp7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final r:Lr7/f;

.field public final s:Lr7/f;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/16 v0, 0x205

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lp7/a;-><init>(S)V

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
    iput-object v0, p0, Lp7/e;->r:Lr7/f;

    .line 13
    .line 14
    new-instance v2, Lr7/f;

    .line 15
    .line 16
    invoke-direct {v2, v1}, Lr7/f;-><init>(Z)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Lp7/e;->s:Lr7/f;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v2}, Lo7/d;->P(Lk7/a;)V

    .line 25
    .line 26
    .line 27
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
    const/16 v1, 0x11

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
    const-class v1, Lp7/e;

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
    const-string v1, " {flags="

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lp7/e;->r:Lr7/f;

    .line 34
    .line 35
    iget v1, v1, Lr7/f;->n:I

    .line 36
    .line 37
    const/16 v2, 0x8

    .line 38
    .line 39
    invoke-static {v1, v2}, Ly7/a;->k(II)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ", entryCount="

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lp7/e;->s:Lr7/f;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const/16 v1, 0x7d

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0
.end method
