.class public Lm7/f;
.super Lm7/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ll7/b;
.implements Ll7/g;


# instance fields
.field public m:La7/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lm7/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lm7/g;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lm7/q;-><init>(Lk7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final R()Ld7/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 2
    .line 3
    check-cast v0, Lm7/g;

    .line 4
    .line 5
    iget-object v0, v0, Lm7/g;->q:Ld7/b;

    .line 6
    .line 7
    return-object v0
.end method

.method public final U()La7/c;
    .locals 2

    .line 1
    iget-object v0, p0, Lm7/f;->m:La7/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-class v1, Lm7/f;

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lm7/f;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Lm7/f;->U()La7/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    return-object v0
.end method

.method public final a()Lu7/c;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final g()Lu7/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 2
    .line 3
    check-cast v0, Lm7/g;

    .line 4
    .line 5
    iget-object v0, v0, Lm7/g;->o:Lu7/a;

    .line 6
    .line 7
    return-object v0
.end method

.method public final i()Ll7/f;
    .locals 3

    .line 1
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 2
    .line 3
    check-cast v0, Lm7/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lm7/g;->U()Lm7/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lm7/f;->U()La7/c;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, v0, Lm7/g;->r:Ll7/f;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v1}, La7/c;->e()Ll7/l;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {v1}, Ll7/l;->Z()Ll7/f;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Ll7/l;->Z()Ll7/f;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    iget-object v2, v1, Ll7/l;->s:Ll7/e;

    .line 39
    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    new-instance v2, Ll7/e;

    .line 43
    .line 44
    invoke-direct {v2, v1}, Ll7/e;-><init>(Ll7/l;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v1}, Lk7/a;->J(Lk7/a;)V

    .line 48
    .line 49
    .line 50
    iput-object v2, v1, Ll7/l;->s:Ll7/e;

    .line 51
    .line 52
    :cond_1
    iput-object v2, v0, Lm7/g;->r:Ll7/f;

    .line 53
    .line 54
    :cond_2
    :goto_0
    if-nez v2, :cond_3

    .line 55
    .line 56
    const-class v0, Lm7/f;

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lm7/f;

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-virtual {v0}, Lm7/f;->i()Ll7/f;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :cond_3
    return-object v2
.end method
