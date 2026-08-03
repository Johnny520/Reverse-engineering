.class public final synthetic Lwb/k1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lwb/h2;

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Lc9/a;

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Z

.field public final synthetic l:Lfg/a;

.field public final synthetic m:Lfg/l;

.field public final synthetic n:Lfg/l;

.field public final synthetic o:Lfg/l;

.field public final synthetic p:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Lwb/h2;Landroid/content/Context;Lc9/a;Ljava/util/List;ZLfg/a;Lfg/l;Lfg/l;Lfg/l;Lfg/a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/k1;->g:Lwb/h2;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/k1;->h:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/k1;->i:Lc9/a;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/k1;->j:Ljava/util/List;

    .line 11
    .line 12
    iput-boolean p5, p0, Lwb/k1;->k:Z

    .line 13
    .line 14
    iput-object p6, p0, Lwb/k1;->l:Lfg/a;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/k1;->m:Lfg/l;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/k1;->n:Lfg/l;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/k1;->o:Lfg/l;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/k1;->p:Lfg/a;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v10, p1

    .line 2
    check-cast v10, Li0/h0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const p1, 0x30006001

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Li0/r;->C(I)I

    .line 13
    .line 14
    .line 15
    move-result v11

    .line 16
    iget-object v0, p0, Lwb/k1;->g:Lwb/h2;

    .line 17
    .line 18
    iget-object v1, p0, Lwb/k1;->h:Landroid/content/Context;

    .line 19
    .line 20
    iget-object v2, p0, Lwb/k1;->i:Lc9/a;

    .line 21
    .line 22
    iget-object v3, p0, Lwb/k1;->j:Ljava/util/List;

    .line 23
    .line 24
    iget-boolean v4, p0, Lwb/k1;->k:Z

    .line 25
    .line 26
    iget-object v5, p0, Lwb/k1;->l:Lfg/a;

    .line 27
    .line 28
    iget-object v6, p0, Lwb/k1;->m:Lfg/l;

    .line 29
    .line 30
    iget-object v7, p0, Lwb/k1;->n:Lfg/l;

    .line 31
    .line 32
    iget-object v8, p0, Lwb/k1;->o:Lfg/l;

    .line 33
    .line 34
    iget-object v9, p0, Lwb/k1;->p:Lfg/a;

    .line 35
    .line 36
    invoke-virtual/range {v0 .. v11}, Lwb/h2;->b(Landroid/content/Context;Lc9/a;Ljava/util/List;ZLfg/a;Lfg/l;Lfg/l;Lfg/l;Lfg/a;Li0/h0;I)V

    .line 37
    .line 38
    .line 39
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 40
    .line 41
    return-object p1
.end method
