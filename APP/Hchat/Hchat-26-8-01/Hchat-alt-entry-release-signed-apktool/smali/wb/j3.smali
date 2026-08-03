.class public final synthetic Lwb/j3;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ly0/o;

.field public final synthetic h:Lfg/a;

.field public final synthetic i:Lfg/l;

.field public final synthetic j:Lth/a;

.field public final synthetic k:I

.field public final synthetic l:Z

.field public final synthetic m:Z

.field public final synthetic n:Ls0/d;

.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(Ly0/o;Lfg/a;Lfg/l;Lth/a;IZZLs0/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/j3;->g:Ly0/o;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/j3;->h:Lfg/a;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/j3;->i:Lfg/l;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/j3;->j:Lth/a;

    .line 11
    .line 12
    iput p5, p0, Lwb/j3;->k:I

    .line 13
    .line 14
    iput-boolean p6, p0, Lwb/j3;->l:Z

    .line 15
    .line 16
    iput-boolean p7, p0, Lwb/j3;->m:Z

    .line 17
    .line 18
    iput-object p8, p0, Lwb/j3;->n:Ls0/d;

    .line 19
    .line 20
    iput p9, p0, Lwb/j3;->o:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, Li0/h0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lwb/j3;->o:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Li0/r;->C(I)I

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    iget-object v0, p0, Lwb/j3;->g:Ly0/o;

    .line 18
    .line 19
    iget-object v1, p0, Lwb/j3;->h:Lfg/a;

    .line 20
    .line 21
    iget-object v2, p0, Lwb/j3;->i:Lfg/l;

    .line 22
    .line 23
    iget-object v3, p0, Lwb/j3;->j:Lth/a;

    .line 24
    .line 25
    iget v4, p0, Lwb/j3;->k:I

    .line 26
    .line 27
    iget-boolean v5, p0, Lwb/j3;->l:Z

    .line 28
    .line 29
    iget-boolean v6, p0, Lwb/j3;->m:Z

    .line 30
    .line 31
    iget-object v7, p0, Lwb/j3;->n:Ls0/d;

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, Lwb/o3;->a(Ly0/o;Lfg/a;Lfg/l;Lth/a;IZZLs0/d;Li0/h0;I)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 37
    .line 38
    return-object p1
.end method
