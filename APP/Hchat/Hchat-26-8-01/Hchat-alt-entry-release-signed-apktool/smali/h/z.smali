.class public final Lh/z;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Li/k1;

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Ly0/o;

.field public final synthetic j:Lh/r0;

.field public final synthetic k:Lh/s0;

.field public final synthetic l:Ls0/d;

.field public final synthetic m:I


# direct methods
.method public constructor <init>(Li/k1;Lfg/l;Ly0/o;Lh/r0;Lh/s0;Ls0/d;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh/z;->g:Li/k1;

    .line 2
    .line 3
    iput-object p2, p0, Lh/z;->h:Lfg/l;

    .line 4
    .line 5
    iput-object p3, p0, Lh/z;->i:Ly0/o;

    .line 6
    .line 7
    iput-object p4, p0, Lh/z;->j:Lh/r0;

    .line 8
    .line 9
    iput-object p5, p0, Lh/z;->k:Lh/s0;

    .line 10
    .line 11
    iput-object p6, p0, Lh/z;->l:Ls0/d;

    .line 12
    .line 13
    iput p7, p0, Lh/z;->m:I

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, Li0/h0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lh/z;->m:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Li0/r;->C(I)I

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    iget-object v0, p0, Lh/z;->g:Li/k1;

    .line 18
    .line 19
    iget-object v1, p0, Lh/z;->h:Lfg/l;

    .line 20
    .line 21
    iget-object v2, p0, Lh/z;->i:Ly0/o;

    .line 22
    .line 23
    iget-object v3, p0, Lh/z;->j:Lh/r0;

    .line 24
    .line 25
    iget-object v4, p0, Lh/z;->k:Lh/s0;

    .line 26
    .line 27
    iget-object v5, p0, Lh/z;->l:Ls0/d;

    .line 28
    .line 29
    invoke-static/range {v0 .. v7}, Lh/a0;->c(Li/k1;Lfg/l;Ly0/o;Lh/r0;Lh/s0;Ls0/d;Li0/h0;I)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 33
    .line 34
    return-object p1
.end method
