.class public final Lth/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lth/m;
.implements Lu2/c;


# instance fields
.field public A:F

.field public B:F

.field public C:Lf1/m;

.field public D:I

.field public E:I

.field public F:I

.field public G:F

.field public final synthetic H:Lth/i;

.field public g:F

.field public h:F

.field public i:J

.field public j:Lu2/m;

.field public k:F

.field public l:Lf1/n0;

.field public m:I

.field public n:Lth/m;

.field public final o:[D

.field public final p:[F

.field public final q:[F

.field public final r:[[F

.field public final s:[[F

.field public t:F

.field public u:F

.field public v:F

.field public w:F

.field public x:I

.field public y:Lf1/n0;

.field public z:F


# direct methods
.method public constructor <init>(Lth/i;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lth/g;->H:Lth/i;

    .line 5
    .line 6
    const/high16 p1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    iput p1, p0, Lth/g;->g:F

    .line 9
    .line 10
    iput p1, p0, Lth/g;->h:F

    .line 11
    .line 12
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    iput-wide v0, p0, Lth/g;->i:J

    .line 18
    .line 19
    sget-object p1, Lu2/m;->g:Lu2/m;

    .line 20
    .line 21
    iput-object p1, p0, Lth/g;->j:Lu2/m;

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    iput p1, p0, Lth/g;->m:I

    .line 25
    .line 26
    new-instance p1, Lth/n;

    .line 27
    .line 28
    invoke-direct {p1}, Lth/n;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lth/g;->n:Lth/m;

    .line 32
    .line 33
    const/16 p1, 0xe

    .line 34
    .line 35
    new-array p1, p1, [D

    .line 36
    .line 37
    iput-object p1, p0, Lth/g;->o:[D

    .line 38
    .line 39
    const/4 p1, 0x7

    .line 40
    new-array v0, p1, [F

    .line 41
    .line 42
    iput-object v0, p0, Lth/g;->p:[F

    .line 43
    .line 44
    new-array p1, p1, [F

    .line 45
    .line 46
    iput-object p1, p0, Lth/g;->q:[F

    .line 47
    .line 48
    const/16 p1, 0x8

    .line 49
    .line 50
    new-array v0, p1, [[F

    .line 51
    .line 52
    iput-object v0, p0, Lth/g;->r:[[F

    .line 53
    .line 54
    new-array p1, p1, [[F

    .line 55
    .line 56
    iput-object p1, p0, Lth/g;->s:[[F

    .line 57
    .line 58
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 59
    .line 60
    iput p1, p0, Lth/g;->t:F

    .line 61
    .line 62
    iput p1, p0, Lth/g;->u:F

    .line 63
    .line 64
    iput p1, p0, Lth/g;->v:F

    .line 65
    .line 66
    iput p1, p0, Lth/g;->w:F

    .line 67
    .line 68
    const/4 v0, -0x1

    .line 69
    iput v0, p0, Lth/g;->x:I

    .line 70
    .line 71
    iput p1, p0, Lth/g;->z:F

    .line 72
    .line 73
    iput p1, p0, Lth/g;->A:F

    .line 74
    .line 75
    iput p1, p0, Lth/g;->B:F

    .line 76
    .line 77
    iput v0, p0, Lth/g;->D:I

    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final d()F
    .locals 1

    .line 1
    iget v0, p0, Lth/g;->g:F

    .line 2
    .line 3
    return v0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)Lai/b;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lth/g;->n:Lth/m;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2}, Lth/m;->e(Ljava/lang/String;Ljava/lang/String;)Lai/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final q0()F
    .locals 1

    .line 1
    iget v0, p0, Lth/g;->h:F

    .line 2
    .line 3
    return v0
.end method
