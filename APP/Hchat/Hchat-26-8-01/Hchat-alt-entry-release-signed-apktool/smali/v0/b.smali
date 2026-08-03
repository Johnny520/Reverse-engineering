.class public final Lv0/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/a2;


# instance fields
.field public g:Lv0/j;

.field public h:Lv0/f;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/Object;

.field public k:[Ljava/lang/Object;

.field public l:Lv0/e;

.field public final m:Lv0/a;


# direct methods
.method public constructor <init>(Lv0/j;Lv0/f;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv0/b;->g:Lv0/j;

    .line 5
    .line 6
    iput-object p2, p0, Lv0/b;->h:Lv0/f;

    .line 7
    .line 8
    iput-object p3, p0, Lv0/b;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lv0/b;->j:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, Lv0/b;->k:[Ljava/lang/Object;

    .line 13
    .line 14
    new-instance p1, Lv0/a;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p0, p2}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lv0/b;->m:Lv0/a;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lv0/b;->h:Lv0/f;

    .line 2
    .line 3
    iget-object v1, p0, Lv0/b;->l:Lv0/e;

    .line 4
    .line 5
    if-nez v1, :cond_4

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v1, p0, Lv0/b;->m:Lv0/a;

    .line 10
    .line 11
    invoke-virtual {v1}, Lv0/a;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    invoke-interface {v0, v2}, Lv0/f;->a(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_2

    .line 22
    .line 23
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    instance-of v1, v2, Lw0/n;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    check-cast v2, Lw0/n;

    .line 30
    .line 31
    invoke-interface {v2}, Lw0/n;->b()Li0/e;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sget-object v3, Li0/e;->j:Li0/e;

    .line 36
    .line 37
    if-eq v1, v3, :cond_0

    .line 38
    .line 39
    invoke-interface {v2}, Lw0/n;->b()Li0/e;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sget-object v3, Li0/e;->m:Li0/e;

    .line 44
    .line 45
    if-eq v1, v3, :cond_0

    .line 46
    .line 47
    invoke-interface {v2}, Lw0/n;->b()Li0/e;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    sget-object v3, Li0/e;->k:Li0/e;

    .line 52
    .line 53
    if-eq v1, v3, :cond_0

    .line 54
    .line 55
    const-string v1, "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver"

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v3, "MutableState containing "

    .line 61
    .line 62
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v2, " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable()."

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-static {v2}, Lv0/k;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :goto_0
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v0

    .line 90
    :cond_2
    iget-object v2, p0, Lv0/b;->i:Ljava/lang/String;

    .line 91
    .line 92
    invoke-interface {v0, v2, v1}, Lv0/f;->e(Ljava/lang/String;Lfg/a;)Lv0/e;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput-object v0, p0, Lv0/b;->l:Lv0/e;

    .line 97
    .line 98
    :cond_3
    return-void

    .line 99
    :cond_4
    iget-object v0, p0, Lv0/b;->l:Lv0/e;

    .line 100
    .line 101
    const-string v1, ") is not null"

    .line 102
    .line 103
    const-string v2, "entry("

    .line 104
    .line 105
    invoke-static {v0, v2, v1}, Lokio/a;->h(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/b;->l:Lv0/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Lb5/c;

    .line 6
    .line 7
    invoke-virtual {v0}, Lb5/c;->Z()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/b;->l:Lv0/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Lb5/c;

    .line 6
    .line 7
    invoke-virtual {v0}, Lb5/c;->Z()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final j()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lv0/b;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
