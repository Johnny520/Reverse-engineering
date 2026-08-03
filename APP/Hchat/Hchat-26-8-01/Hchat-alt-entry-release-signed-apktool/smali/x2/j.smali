.class public final Lx2/j;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lfg/l;

.field public final synthetic h:Ly0/o;

.field public final synthetic i:Lfg/l;

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public constructor <init>(Lfg/l;Ly0/o;Lfg/l;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx2/j;->g:Lfg/l;

    .line 2
    .line 3
    iput-object p2, p0, Lx2/j;->h:Ly0/o;

    .line 4
    .line 5
    iput-object p3, p0, Lx2/j;->i:Lfg/l;

    .line 6
    .line 7
    iput p4, p0, Lx2/j;->j:I

    .line 8
    .line 9
    iput p5, p0, Lx2/j;->k:I

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v3, p1

    .line 2
    check-cast v3, Li0/h0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lx2/j;->j:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Li0/r;->C(I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    iget v5, p0, Lx2/j;->k:I

    .line 18
    .line 19
    iget-object v0, p0, Lx2/j;->g:Lfg/l;

    .line 20
    .line 21
    iget-object v1, p0, Lx2/j;->h:Ly0/o;

    .line 22
    .line 23
    iget-object v2, p0, Lx2/j;->i:Lfg/l;

    .line 24
    .line 25
    invoke-static/range {v0 .. v5}, Lx2/i;->b(Lfg/l;Ly0/o;Lfg/l;Li0/h0;II)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    return-object p1
.end method
