.class public final synthetic Lwb/mp;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lwb/y2;

.field public final synthetic h:Leb/c0;

.field public final synthetic i:Z

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:Lwb/tp;

.field public final synthetic n:Z

.field public final synthetic o:Lfg/l;

.field public final synthetic p:Lfg/l;

.field public final synthetic q:Lfg/l;

.field public final synthetic r:Lfg/a;

.field public final synthetic s:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Lwb/y2;Leb/c0;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lwb/tp;ZLfg/l;Lfg/l;Lfg/l;Lfg/a;Lfg/a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/mp;->g:Lwb/y2;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/mp;->h:Leb/c0;

    .line 7
    .line 8
    iput-boolean p3, p0, Lwb/mp;->i:Z

    .line 9
    .line 10
    iput-object p4, p0, Lwb/mp;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/mp;->k:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/mp;->l:Ljava/util/List;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/mp;->m:Lwb/tp;

    .line 17
    .line 18
    iput-boolean p8, p0, Lwb/mp;->n:Z

    .line 19
    .line 20
    iput-object p9, p0, Lwb/mp;->o:Lfg/l;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/mp;->p:Lfg/l;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/mp;->q:Lfg/l;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/mp;->r:Lfg/a;

    .line 27
    .line 28
    iput-object p13, p0, Lwb/mp;->s:Lfg/a;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v14, p1

    .line 4
    .line 5
    check-cast v14, Li0/h0;

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
    const/16 v1, 0x9

    .line 15
    .line 16
    invoke-static {v1}, Li0/r;->C(I)I

    .line 17
    .line 18
    .line 19
    move-result v15

    .line 20
    iget-object v1, v0, Lwb/mp;->g:Lwb/y2;

    .line 21
    .line 22
    iget-object v2, v0, Lwb/mp;->h:Leb/c0;

    .line 23
    .line 24
    iget-boolean v3, v0, Lwb/mp;->i:Z

    .line 25
    .line 26
    iget-object v4, v0, Lwb/mp;->j:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v5, v0, Lwb/mp;->k:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v6, v0, Lwb/mp;->l:Ljava/util/List;

    .line 31
    .line 32
    iget-object v7, v0, Lwb/mp;->m:Lwb/tp;

    .line 33
    .line 34
    iget-boolean v8, v0, Lwb/mp;->n:Z

    .line 35
    .line 36
    iget-object v9, v0, Lwb/mp;->o:Lfg/l;

    .line 37
    .line 38
    iget-object v10, v0, Lwb/mp;->p:Lfg/l;

    .line 39
    .line 40
    iget-object v11, v0, Lwb/mp;->q:Lfg/l;

    .line 41
    .line 42
    iget-object v12, v0, Lwb/mp;->r:Lfg/a;

    .line 43
    .line 44
    iget-object v13, v0, Lwb/mp;->s:Lfg/a;

    .line 45
    .line 46
    invoke-virtual/range {v1 .. v15}, Lwb/y2;->I(Leb/c0;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lwb/tp;ZLfg/l;Lfg/l;Lfg/l;Lfg/a;Lfg/a;Li0/h0;I)V

    .line 47
    .line 48
    .line 49
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 50
    .line 51
    return-object v1
.end method
