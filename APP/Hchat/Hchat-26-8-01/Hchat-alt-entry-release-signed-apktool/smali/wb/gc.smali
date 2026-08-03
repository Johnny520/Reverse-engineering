.class public final synthetic Lwb/gc;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ZLi0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lwb/gc;->g:Z

    .line 5
    .line 6
    iput-object p2, p0, Lwb/gc;->h:Li0/a1;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/gc;->i:Li0/a1;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/gc;->j:Li0/a1;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/gc;->k:Li0/a1;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/gc;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/gc;->m:Li0/a1;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/gc;->n:Li0/a1;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/gc;->o:Li0/a1;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/gc;->p:Li0/a1;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/gc;->q:Li0/a1;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lr/d;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Li0/h0;

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    check-cast v3, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v1, v3, 0x11

    .line 23
    .line 24
    const/16 v4, 0x10

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    if-eq v1, v4, :cond_0

    .line 28
    .line 29
    move v1, v5

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v1, 0x0

    .line 32
    :goto_0
    and-int/2addr v3, v5

    .line 33
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    new-instance v6, Lwb/of;

    .line 40
    .line 41
    iget-boolean v7, v0, Lwb/gc;->g:Z

    .line 42
    .line 43
    iget-object v8, v0, Lwb/gc;->h:Li0/a1;

    .line 44
    .line 45
    iget-object v9, v0, Lwb/gc;->i:Li0/a1;

    .line 46
    .line 47
    iget-object v10, v0, Lwb/gc;->j:Li0/a1;

    .line 48
    .line 49
    iget-object v11, v0, Lwb/gc;->k:Li0/a1;

    .line 50
    .line 51
    iget-object v12, v0, Lwb/gc;->l:Li0/a1;

    .line 52
    .line 53
    iget-object v13, v0, Lwb/gc;->m:Li0/a1;

    .line 54
    .line 55
    iget-object v14, v0, Lwb/gc;->n:Li0/a1;

    .line 56
    .line 57
    iget-object v15, v0, Lwb/gc;->o:Li0/a1;

    .line 58
    .line 59
    iget-object v1, v0, Lwb/gc;->p:Li0/a1;

    .line 60
    .line 61
    iget-object v3, v0, Lwb/gc;->q:Li0/a1;

    .line 62
    .line 63
    move-object/from16 v16, v1

    .line 64
    .line 65
    move-object/from16 v17, v3

    .line 66
    .line 67
    invoke-direct/range {v6 .. v17}, Lwb/of;-><init>(ZLi0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 68
    .line 69
    .line 70
    const v1, -0x23ece067

    .line 71
    .line 72
    .line 73
    invoke-static {v1, v6, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const/16 v3, 0x30

    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    invoke-static {v4, v1, v2, v3, v5}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 85
    .line 86
    .line 87
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 88
    .line 89
    return-object v1
.end method
