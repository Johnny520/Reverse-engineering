.class public final synthetic Lxh/u;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Ly0/o;

.field public final synthetic i:Lsh/y;

.field public final synthetic j:Lsh/g0;

.field public final synthetic k:Z

.field public final synthetic l:Lfg/a;

.field public final synthetic m:Lfg/a;

.field public final synthetic n:F

.field public final synthetic o:Ls0/d;

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(ZLy0/o;Lsh/y;Lsh/g0;ZLfg/a;Lfg/a;FLs0/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lxh/u;->g:Z

    .line 5
    .line 6
    iput-object p2, p0, Lxh/u;->h:Ly0/o;

    .line 7
    .line 8
    iput-object p3, p0, Lxh/u;->i:Lsh/y;

    .line 9
    .line 10
    iput-object p4, p0, Lxh/u;->j:Lsh/g0;

    .line 11
    .line 12
    iput-boolean p5, p0, Lxh/u;->k:Z

    .line 13
    .line 14
    iput-object p6, p0, Lxh/u;->l:Lfg/a;

    .line 15
    .line 16
    iput-object p7, p0, Lxh/u;->m:Lfg/a;

    .line 17
    .line 18
    iput p8, p0, Lxh/u;->n:F

    .line 19
    .line 20
    iput-object p9, p0, Lxh/u;->o:Ls0/d;

    .line 21
    .line 22
    iput p10, p0, Lxh/u;->p:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, Li0/h0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lxh/u;->p:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Li0/r;->C(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    iget-boolean v0, p0, Lxh/u;->g:Z

    .line 18
    .line 19
    iget-object v1, p0, Lxh/u;->h:Ly0/o;

    .line 20
    .line 21
    iget-object v2, p0, Lxh/u;->i:Lsh/y;

    .line 22
    .line 23
    iget-object v3, p0, Lxh/u;->j:Lsh/g0;

    .line 24
    .line 25
    iget-boolean v4, p0, Lxh/u;->k:Z

    .line 26
    .line 27
    iget-object v5, p0, Lxh/u;->l:Lfg/a;

    .line 28
    .line 29
    iget-object v6, p0, Lxh/u;->m:Lfg/a;

    .line 30
    .line 31
    iget v7, p0, Lxh/u;->n:F

    .line 32
    .line 33
    iget-object v8, p0, Lxh/u;->o:Ls0/d;

    .line 34
    .line 35
    invoke-static/range {v0 .. v10}, Lxh/v;->a(ZLy0/o;Lsh/y;Lsh/g0;ZLfg/a;Lfg/a;FLs0/d;Li0/h0;I)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 39
    .line 40
    return-object p1
.end method
