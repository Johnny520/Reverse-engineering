.class public final synthetic Lwb/fd;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lna/h;

.field public final synthetic j:Z

.field public final synthetic k:Z

.field public final synthetic l:Lfg/a;

.field public final synthetic m:Lfg/l;

.field public final synthetic n:Ljava/util/List;

.field public final synthetic o:Lfg/l;

.field public final synthetic p:Lfg/a;

.field public final synthetic q:Lfg/a;

.field public final synthetic r:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Lna/h;ZZLfg/a;Lfg/l;Ljava/util/List;Lfg/l;Lfg/a;Lfg/a;Lfg/a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/fd;->g:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/fd;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/fd;->i:Lna/h;

    .line 9
    .line 10
    iput-boolean p4, p0, Lwb/fd;->j:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lwb/fd;->k:Z

    .line 13
    .line 14
    iput-object p6, p0, Lwb/fd;->l:Lfg/a;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/fd;->m:Lfg/l;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/fd;->n:Ljava/util/List;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/fd;->o:Lfg/l;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/fd;->p:Lfg/a;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/fd;->q:Lfg/a;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/fd;->r:Lfg/a;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v12, p1

    .line 2
    check-cast v12, Li0/h0;

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
    const p1, 0x6030001

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Li0/r;->C(I)I

    .line 15
    .line 16
    .line 17
    move-result v13

    .line 18
    iget-object v0, p0, Lwb/fd;->g:Landroid/content/Context;

    .line 19
    .line 20
    iget-object v1, p0, Lwb/fd;->h:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v2, p0, Lwb/fd;->i:Lna/h;

    .line 23
    .line 24
    iget-boolean v3, p0, Lwb/fd;->j:Z

    .line 25
    .line 26
    iget-boolean v4, p0, Lwb/fd;->k:Z

    .line 27
    .line 28
    iget-object v5, p0, Lwb/fd;->l:Lfg/a;

    .line 29
    .line 30
    iget-object v6, p0, Lwb/fd;->m:Lfg/l;

    .line 31
    .line 32
    iget-object v7, p0, Lwb/fd;->n:Ljava/util/List;

    .line 33
    .line 34
    iget-object v8, p0, Lwb/fd;->o:Lfg/l;

    .line 35
    .line 36
    iget-object v9, p0, Lwb/fd;->p:Lfg/a;

    .line 37
    .line 38
    iget-object v10, p0, Lwb/fd;->q:Lfg/a;

    .line 39
    .line 40
    iget-object v11, p0, Lwb/fd;->r:Lfg/a;

    .line 41
    .line 42
    invoke-static/range {v0 .. v13}, Lwb/ho;->b3(Landroid/content/Context;Ljava/lang/String;Lna/h;ZZLfg/a;Lfg/l;Ljava/util/List;Lfg/l;Lfg/a;Lfg/a;Lfg/a;Li0/h0;I)V

    .line 43
    .line 44
    .line 45
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 46
    .line 47
    return-object p1
.end method
