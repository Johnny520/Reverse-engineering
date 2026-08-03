.class public final synthetic Lh0/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ly1/l2;

.field public final synthetic h:J

.field public final synthetic i:Z

.field public final synthetic j:Ly0/o;

.field public final synthetic k:Lh0/l;


# direct methods
.method public synthetic constructor <init>(Ly1/l2;JZLy0/o;Lh0/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh0/a;->g:Ly1/l2;

    .line 5
    .line 6
    iput-wide p2, p0, Lh0/a;->h:J

    .line 7
    .line 8
    iput-boolean p4, p0, Lh0/a;->i:Z

    .line 9
    .line 10
    iput-object p5, p0, Lh0/a;->j:Ly0/o;

    .line 11
    .line 12
    iput-object p6, p0, Lh0/a;->k:Lh0/l;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Li0/h0;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    and-int/2addr p2, v2

    .line 19
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    sget-object p2, Ly1/h1;->t:Li0/m2;

    .line 26
    .line 27
    iget-object v0, p0, Lh0/a;->g:Ly1/l2;

    .line 28
    .line 29
    invoke-virtual {p2, v0}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    new-instance v0, Lh0/c;

    .line 34
    .line 35
    iget-wide v1, p0, Lh0/a;->h:J

    .line 36
    .line 37
    iget-boolean v3, p0, Lh0/a;->i:Z

    .line 38
    .line 39
    iget-object v4, p0, Lh0/a;->j:Ly0/o;

    .line 40
    .line 41
    iget-object v5, p0, Lh0/a;->k:Lh0/l;

    .line 42
    .line 43
    invoke-direct/range {v0 .. v5}, Lh0/c;-><init>(JZLy0/o;Lh0/l;)V

    .line 44
    .line 45
    .line 46
    const v1, 0x4b1ac501    # 1.0142977E7f

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v0, p1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const/16 v1, 0x38

    .line 54
    .line 55
    invoke-static {p2, v0, p1, v1}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 60
    .line 61
    .line 62
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 63
    .line 64
    return-object p1
.end method
