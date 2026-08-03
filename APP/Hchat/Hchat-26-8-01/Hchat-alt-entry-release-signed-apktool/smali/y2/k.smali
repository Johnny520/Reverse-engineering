.class public final Ly2/k;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ly2/b0;

.field public final synthetic h:Lfg/a;

.field public final synthetic i:Ly2/c0;

.field public final synthetic j:Ls0/d;

.field public final synthetic k:I

.field public final synthetic l:I


# direct methods
.method public constructor <init>(Ly2/b0;Lfg/a;Ly2/c0;Ls0/d;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly2/k;->g:Ly2/b0;

    .line 2
    .line 3
    iput-object p2, p0, Ly2/k;->h:Lfg/a;

    .line 4
    .line 5
    iput-object p3, p0, Ly2/k;->i:Ly2/c0;

    .line 6
    .line 7
    iput-object p4, p0, Ly2/k;->j:Ls0/d;

    .line 8
    .line 9
    iput p5, p0, Ly2/k;->k:I

    .line 10
    .line 11
    iput p6, p0, Ly2/k;->l:I

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Li0/h0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, Ly2/k;->k:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Li0/r;->C(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    iget v6, p0, Ly2/k;->l:I

    .line 18
    .line 19
    iget-object v0, p0, Ly2/k;->g:Ly2/b0;

    .line 20
    .line 21
    iget-object v1, p0, Ly2/k;->h:Lfg/a;

    .line 22
    .line 23
    iget-object v2, p0, Ly2/k;->i:Ly2/c0;

    .line 24
    .line 25
    iget-object v3, p0, Ly2/k;->j:Ls0/d;

    .line 26
    .line 27
    invoke-static/range {v0 .. v6}, Ly2/m;->a(Ly2/b0;Lfg/a;Ly2/c0;Ls0/d;Li0/h0;II)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 31
    .line 32
    return-object p1
.end method
