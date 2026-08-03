.class public final Lsh/d1;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public synthetic h:J

.field public final synthetic i:Z

.field public final synthetic j:Lfg/l;

.field public final synthetic k:Lsh/u0;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/f1;

.field public final synthetic n:Li0/g1;

.field public final synthetic o:Li0/g1;

.field public final synthetic p:Li0/a1;


# direct methods
.method public constructor <init>(ZLfg/l;Lsh/u0;Li0/a1;Li0/f1;Li0/g1;Li0/g1;Li0/a1;Lwf/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lsh/d1;->i:Z

    .line 2
    .line 3
    iput-object p2, p0, Lsh/d1;->j:Lfg/l;

    .line 4
    .line 5
    iput-object p3, p0, Lsh/d1;->k:Lsh/u0;

    .line 6
    .line 7
    iput-object p4, p0, Lsh/d1;->l:Li0/a1;

    .line 8
    .line 9
    iput-object p5, p0, Lsh/d1;->m:Li0/f1;

    .line 10
    .line 11
    iput-object p6, p0, Lsh/d1;->n:Li0/g1;

    .line 12
    .line 13
    iput-object p7, p0, Lsh/d1;->o:Li0/g1;

    .line 14
    .line 15
    iput-object p8, p0, Lsh/d1;->p:Li0/a1;

    .line 16
    .line 17
    const/4 p1, 0x3

    .line 18
    invoke-direct {p0, p1, p9}, Lyf/i;-><init>(ILwf/c;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, Lqg/t;

    .line 2
    .line 3
    check-cast p2, Le1/b;

    .line 4
    .line 5
    iget-wide p1, p2, Le1/b;->a:J

    .line 6
    .line 7
    move-object v9, p3

    .line 8
    check-cast v9, Lwf/c;

    .line 9
    .line 10
    new-instance v0, Lsh/d1;

    .line 11
    .line 12
    iget-object v7, p0, Lsh/d1;->o:Li0/g1;

    .line 13
    .line 14
    iget-object v8, p0, Lsh/d1;->p:Li0/a1;

    .line 15
    .line 16
    iget-boolean v1, p0, Lsh/d1;->i:Z

    .line 17
    .line 18
    iget-object v2, p0, Lsh/d1;->j:Lfg/l;

    .line 19
    .line 20
    iget-object v3, p0, Lsh/d1;->k:Lsh/u0;

    .line 21
    .line 22
    iget-object v4, p0, Lsh/d1;->l:Li0/a1;

    .line 23
    .line 24
    iget-object v5, p0, Lsh/d1;->m:Li0/f1;

    .line 25
    .line 26
    iget-object v6, p0, Lsh/d1;->n:Li0/g1;

    .line 27
    .line 28
    invoke-direct/range {v0 .. v9}, Lsh/d1;-><init>(ZLfg/l;Lsh/u0;Li0/a1;Li0/f1;Li0/g1;Li0/g1;Li0/a1;Lwf/c;)V

    .line 29
    .line 30
    .line 31
    iput-wide p1, v0, Lsh/d1;->h:J

    .line 32
    .line 33
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lsh/d1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-wide v0, p0, Lsh/d1;->h:J

    .line 2
    .line 3
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lsh/f1;->a:Li/r0;

    .line 7
    .line 8
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 9
    .line 10
    iget-object v2, p0, Lsh/d1;->l:Li0/a1;

    .line 11
    .line 12
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const/16 p1, 0x20

    .line 16
    .line 17
    shr-long/2addr v0, p1

    .line 18
    long-to-int p1, v0

    .line 19
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v1, p0, Lsh/d1;->m:Li0/f1;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Li0/f1;->h(F)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iget-object v0, p0, Lsh/d1;->n:Li0/g1;

    .line 33
    .line 34
    invoke-virtual {v0}, Li0/g1;->g()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v1, p0, Lsh/d1;->o:Li0/g1;

    .line 39
    .line 40
    invoke-virtual {v1}, Li0/g1;->g()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-static {p1, v0, v1}, Lsh/f1;->c(FII)F

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iget-boolean v0, p0, Lsh/d1;->i:Z

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    const/high16 v0, 0x3f800000    # 1.0f

    .line 53
    .line 54
    sub-float p1, v0, p1

    .line 55
    .line 56
    :cond_0
    new-instance v0, Ljava/lang/Float;

    .line 57
    .line 58
    invoke-direct {v0, p1}, Ljava/lang/Float;-><init>(F)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lsh/d1;->j:Lfg/l;

    .line 62
    .line 63
    invoke-interface {p1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Ljava/lang/Number;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    iget-object v0, p0, Lsh/d1;->p:Li0/a1;

    .line 74
    .line 75
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lfg/l;

    .line 80
    .line 81
    new-instance v1, Ljava/lang/Float;

    .line 82
    .line 83
    invoke-direct {v1, p1}, Ljava/lang/Float;-><init>(F)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lsh/d1;->k:Lsh/u0;

    .line 90
    .line 91
    const/4 v1, 0x0

    .line 92
    iput-boolean v1, v0, Lsh/u0;->a:Z

    .line 93
    .line 94
    iput p1, v0, Lsh/u0;->b:F

    .line 95
    .line 96
    iput-boolean v1, v0, Lsh/u0;->c:Z

    .line 97
    .line 98
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 99
    .line 100
    return-object p1
.end method
