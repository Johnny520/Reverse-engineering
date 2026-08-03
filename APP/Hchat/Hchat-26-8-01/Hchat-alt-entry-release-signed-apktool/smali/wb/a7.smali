.class public final synthetic Lwb/a7;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lvb/a;

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Z

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Lr/z;

.field public final synthetic o:Lfg/a;

.field public final synthetic p:Lfg/l;

.field public final synthetic q:Lfg/a;

.field public final synthetic r:Lfg/a;

.field public final synthetic s:Lfg/a;

.field public final synthetic t:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Lvb/a;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lr/z;Lfg/a;Lfg/l;Lfg/a;Lfg/a;Lfg/a;Lfg/a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/a7;->g:Lvb/a;

    .line 5
    .line 6
    iput p2, p0, Lwb/a7;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lwb/a7;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/a7;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/a7;->k:Ljava/lang/String;

    .line 13
    .line 14
    iput-boolean p6, p0, Lwb/a7;->l:Z

    .line 15
    .line 16
    iput-object p7, p0, Lwb/a7;->m:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/a7;->n:Lr/z;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/a7;->o:Lfg/a;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/a7;->p:Lfg/l;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/a7;->q:Lfg/a;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/a7;->r:Lfg/a;

    .line 27
    .line 28
    iput-object p13, p0, Lwb/a7;->s:Lfg/a;

    .line 29
    .line 30
    iput-object p14, p0, Lwb/a7;->t:Lfg/a;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    check-cast v15, Li0/h0;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-static {v1}, Li0/r;->C(I)I

    .line 16
    .line 17
    .line 18
    move-result v16

    .line 19
    iget-object v1, v0, Lwb/a7;->g:Lvb/a;

    .line 20
    .line 21
    iget v2, v0, Lwb/a7;->h:I

    .line 22
    .line 23
    iget-object v3, v0, Lwb/a7;->i:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v4, v0, Lwb/a7;->j:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v5, v0, Lwb/a7;->k:Ljava/lang/String;

    .line 28
    .line 29
    iget-boolean v6, v0, Lwb/a7;->l:Z

    .line 30
    .line 31
    iget-object v7, v0, Lwb/a7;->m:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v8, v0, Lwb/a7;->n:Lr/z;

    .line 34
    .line 35
    iget-object v9, v0, Lwb/a7;->o:Lfg/a;

    .line 36
    .line 37
    iget-object v10, v0, Lwb/a7;->p:Lfg/l;

    .line 38
    .line 39
    iget-object v11, v0, Lwb/a7;->q:Lfg/a;

    .line 40
    .line 41
    iget-object v12, v0, Lwb/a7;->r:Lfg/a;

    .line 42
    .line 43
    iget-object v13, v0, Lwb/a7;->s:Lfg/a;

    .line 44
    .line 45
    iget-object v14, v0, Lwb/a7;->t:Lfg/a;

    .line 46
    .line 47
    invoke-static/range {v1 .. v16}, Lwb/ho;->e(Lvb/a;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lr/z;Lfg/a;Lfg/l;Lfg/a;Lfg/a;Lfg/a;Lfg/a;Li0/h0;I)V

    .line 48
    .line 49
    .line 50
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 51
    .line 52
    return-object v1
.end method
