.class public final Lp7/f;
.super Lp7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final r:Lr7/f;

.field public final s:Lr7/d;

.field public final t:Lr7/f;

.field public final u:Lr7/f;

.field public final v:Lr7/f;

.field public final w:Lr7/f;

.field public final x:Lo7/g;

.field public final y:Lr7/f;


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v0, 0x200

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
    iput-object v0, p0, Lp7/f;->r:Lr7/f;

    .line 13
    .line 14
    new-instance v2, Lr7/d;

    .line 15
    .line 16
    const/16 v3, 0x100

    .line 17
    .line 18
    invoke-direct {v2, v3}, Lr7/d;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object v2, p0, Lp7/f;->s:Lr7/d;

    .line 22
    .line 23
    new-instance v3, Lr7/f;

    .line 24
    .line 25
    invoke-direct {v3, v1}, Lr7/f;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    iput-object v3, p0, Lp7/f;->t:Lr7/f;

    .line 29
    .line 30
    new-instance v4, Lr7/f;

    .line 31
    .line 32
    invoke-direct {v4, v1}, Lr7/f;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    iput-object v4, p0, Lp7/f;->u:Lr7/f;

    .line 36
    .line 37
    new-instance v5, Lr7/f;

    .line 38
    .line 39
    invoke-direct {v5, v1}, Lr7/f;-><init>(Z)V

    .line 40
    .line 41
    .line 42
    iput-object v5, p0, Lp7/f;->v:Lr7/f;

    .line 43
    .line 44
    new-instance v6, Lr7/f;

    .line 45
    .line 46
    invoke-direct {v6, v1}, Lr7/f;-><init>(Z)V

    .line 47
    .line 48
    .line 49
    iput-object v6, p0, Lp7/f;->w:Lr7/f;

    .line 50
    .line 51
    new-instance v7, Lo7/g;

    .line 52
    .line 53
    invoke-direct {v7}, Lk7/a;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v7, p0, Lp7/f;->x:Lo7/g;

    .line 57
    .line 58
    new-instance v8, Lr7/f;

    .line 59
    .line 60
    invoke-direct {v8, v1}, Lr7/f;-><init>(Z)V

    .line 61
    .line 62
    .line 63
    iput-object v8, p0, Lp7/f;->y:Lr7/f;

    .line 64
    .line 65
    invoke-virtual {v7, v8}, Lo7/g;->P(Lk7/a;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v2}, Lo7/d;->P(Lk7/a;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v3}, Lo7/d;->P(Lk7/a;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v4}, Lo7/d;->P(Lk7/a;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v5}, Lo7/d;->P(Lk7/a;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v6}, Lo7/d;->P(Lk7/a;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v7}, Lo7/d;->P(Lk7/a;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method


# virtual methods
.method public final S(I)V
    .locals 1

    .line 1
    const/16 v0, 0x120

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lp7/f;->y:Lr7/f;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Lr7/f;->k(I)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lp7/f;->x:Lo7/g;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, v0}, Lo7/g;->P(Lk7/a;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
