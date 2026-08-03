.class public final synthetic Lw/p;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Li2/g;

.field public final synthetic h:Ly0/o;

.field public final synthetic i:Li2/n0;

.field public final synthetic j:Z

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:Lfg/l;

.field public final synthetic n:Lfg/l;

.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(Li2/g;Ly0/o;Li2/n0;ZIILfg/l;Lfg/l;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/p;->g:Li2/g;

    .line 5
    .line 6
    iput-object p2, p0, Lw/p;->h:Ly0/o;

    .line 7
    .line 8
    iput-object p3, p0, Lw/p;->i:Li2/n0;

    .line 9
    .line 10
    iput-boolean p4, p0, Lw/p;->j:Z

    .line 11
    .line 12
    iput p5, p0, Lw/p;->k:I

    .line 13
    .line 14
    iput p6, p0, Lw/p;->l:I

    .line 15
    .line 16
    iput-object p7, p0, Lw/p;->m:Lfg/l;

    .line 17
    .line 18
    iput-object p8, p0, Lw/p;->n:Lfg/l;

    .line 19
    .line 20
    iput p9, p0, Lw/p;->o:I

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
    iget p1, p0, Lw/p;->o:I

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
    iget-object v0, p0, Lw/p;->g:Li2/g;

    .line 18
    .line 19
    iget-object v1, p0, Lw/p;->h:Ly0/o;

    .line 20
    .line 21
    iget-object v2, p0, Lw/p;->i:Li2/n0;

    .line 22
    .line 23
    iget-boolean v3, p0, Lw/p;->j:Z

    .line 24
    .line 25
    iget v4, p0, Lw/p;->k:I

    .line 26
    .line 27
    iget v5, p0, Lw/p;->l:I

    .line 28
    .line 29
    iget-object v6, p0, Lw/p;->m:Lfg/l;

    .line 30
    .line 31
    iget-object v7, p0, Lw/p;->n:Lfg/l;

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, Lw/s;->c(Li2/g;Ly0/o;Li2/n0;ZIILfg/l;Lfg/l;Li0/h0;I)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 37
    .line 38
    return-object p1
.end method
