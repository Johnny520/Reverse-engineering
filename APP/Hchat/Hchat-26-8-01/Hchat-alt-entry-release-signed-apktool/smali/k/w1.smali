.class public final Lk/w1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lm/i2;


# static fields
.field public static final j:Lp4/t;


# instance fields
.field public final a:Li0/g1;

.field public final b:Li0/g1;

.field public final c:Li0/g1;

.field public final d:Ln/k;

.field public final e:Li0/g1;

.field public f:F

.field public final g:Lm/r;

.field public final h:Li0/x;

.field public final i:Li0/x;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Li2/y;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li2/y;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Li2/z;

    .line 9
    .line 10
    const/16 v2, 0x11

    .line 11
    .line 12
    invoke-direct {v1, v2}, Li2/z;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lp4/t;

    .line 16
    .line 17
    const/16 v3, 0xc

    .line 18
    .line 19
    invoke-direct {v2, v0, v3, v1}, Lp4/t;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lk/w1;->j:Lp4/t;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Li0/g1;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Li0/g1;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lk/w1;->a:Li0/g1;

    .line 10
    .line 11
    new-instance p1, Li0/g1;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p1, v0}, Li0/g1;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lk/w1;->b:Li0/g1;

    .line 18
    .line 19
    new-instance p1, Li0/g1;

    .line 20
    .line 21
    invoke-direct {p1, v0}, Li0/g1;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lk/w1;->c:Li0/g1;

    .line 25
    .line 26
    new-instance p1, Ln/k;

    .line 27
    .line 28
    invoke-direct {p1}, Ln/k;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lk/w1;->d:Ln/k;

    .line 32
    .line 33
    new-instance p1, Li0/g1;

    .line 34
    .line 35
    const v0, 0x7fffffff

    .line 36
    .line 37
    .line 38
    invoke-direct {p1, v0}, Li0/g1;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lk/w1;->e:Li0/g1;

    .line 42
    .line 43
    new-instance p1, Lb0/d0;

    .line 44
    .line 45
    const/16 v0, 0x18

    .line 46
    .line 47
    invoke-direct {p1, p0, v0}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Lm/r;

    .line 51
    .line 52
    invoke-direct {v0, p1}, Lm/r;-><init>(Lfg/l;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lk/w1;->g:Lm/r;

    .line 56
    .line 57
    new-instance p1, Lk/v1;

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-direct {p1, p0, v0}, Lk/v1;-><init>(Lk/w1;I)V

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Lk/w1;->h:Li0/x;

    .line 68
    .line 69
    new-instance p1, Lk/v1;

    .line 70
    .line 71
    const/4 v0, 0x1

    .line 72
    invoke-direct {p1, p0, v0}, Lk/v1;-><init>(Lk/w1;I)V

    .line 73
    .line 74
    .line 75
    invoke-static {p1}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput-object p1, p0, Lk/w1;->i:Li0/x;

    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk/w1;->g:Lm/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm/r;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final b(Lk/d1;Lfg/p;Lyf/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/w1;->g:Lm/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lm/r;->b(Lk/d1;Lfg/p;Lyf/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 8
    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 13
    .line 14
    return-object p1
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk/w1;->i:Li0/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/x;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk/w1;->h:Li0/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/x;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final e(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lk/w1;->g:Lm/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm/r;->e(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
