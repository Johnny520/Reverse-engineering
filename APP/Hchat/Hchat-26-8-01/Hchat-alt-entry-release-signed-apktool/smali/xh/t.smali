.class public final synthetic Lxh/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ljava/util/ArrayList;

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ly0/o;

.field public final synthetic k:Lsh/a;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Lsh/a;

.field public final synthetic n:Lsh/t;

.field public final synthetic o:Lp/x0;

.field public final synthetic p:Z

.field public final synthetic q:Lfg/l;

.field public final synthetic r:I

.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;ILjava/lang/String;Ly0/o;Lsh/a;Ljava/lang/String;Lsh/a;Lsh/t;Lp/x0;ZLfg/l;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxh/t;->g:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput p2, p0, Lxh/t;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lxh/t;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lxh/t;->j:Ly0/o;

    .line 11
    .line 12
    iput-object p5, p0, Lxh/t;->k:Lsh/a;

    .line 13
    .line 14
    iput-object p6, p0, Lxh/t;->l:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lxh/t;->m:Lsh/a;

    .line 17
    .line 18
    iput-object p8, p0, Lxh/t;->n:Lsh/t;

    .line 19
    .line 20
    iput-object p9, p0, Lxh/t;->o:Lp/x0;

    .line 21
    .line 22
    iput-boolean p10, p0, Lxh/t;->p:Z

    .line 23
    .line 24
    iput-object p11, p0, Lxh/t;->q:Lfg/l;

    .line 25
    .line 26
    iput p12, p0, Lxh/t;->r:I

    .line 27
    .line 28
    iput p13, p0, Lxh/t;->s:I

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v11, p1

    .line 2
    check-cast v11, Li0/h0;

    .line 3
    .line 4
    move-object/from16 p1, p2

    .line 5
    .line 6
    check-cast p1, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget p1, p0, Lxh/t;->r:I

    .line 12
    .line 13
    or-int/lit8 p1, p1, 0x1

    .line 14
    .line 15
    invoke-static {p1}, Li0/r;->C(I)I

    .line 16
    .line 17
    .line 18
    move-result v12

    .line 19
    iget p1, p0, Lxh/t;->s:I

    .line 20
    .line 21
    invoke-static {p1}, Li0/r;->C(I)I

    .line 22
    .line 23
    .line 24
    move-result v13

    .line 25
    iget-object v0, p0, Lxh/t;->g:Ljava/util/ArrayList;

    .line 26
    .line 27
    iget v1, p0, Lxh/t;->h:I

    .line 28
    .line 29
    iget-object v2, p0, Lxh/t;->i:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v3, p0, Lxh/t;->j:Ly0/o;

    .line 32
    .line 33
    iget-object v4, p0, Lxh/t;->k:Lsh/a;

    .line 34
    .line 35
    iget-object v5, p0, Lxh/t;->l:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v6, p0, Lxh/t;->m:Lsh/a;

    .line 38
    .line 39
    iget-object v7, p0, Lxh/t;->n:Lsh/t;

    .line 40
    .line 41
    iget-object v8, p0, Lxh/t;->o:Lp/x0;

    .line 42
    .line 43
    iget-boolean v9, p0, Lxh/t;->p:Z

    .line 44
    .line 45
    iget-object v10, p0, Lxh/t;->q:Lfg/l;

    .line 46
    .line 47
    invoke-static/range {v0 .. v13}, Lr9/e0;->f(Ljava/util/ArrayList;ILjava/lang/String;Ly0/o;Lsh/a;Ljava/lang/String;Lsh/a;Lsh/t;Lp/x0;ZLfg/l;Li0/h0;II)V

    .line 48
    .line 49
    .line 50
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 51
    .line 52
    return-object p1
.end method
