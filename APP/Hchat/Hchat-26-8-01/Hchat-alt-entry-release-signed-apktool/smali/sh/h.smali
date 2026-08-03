.class public final synthetic Lsh/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ly0/o;

.field public final synthetic h:Lsh/f;

.field public final synthetic i:F

.field public final synthetic j:Ls0/d;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Ly0/o;Lsh/f;FLs0/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsh/h;->g:Ly0/o;

    .line 5
    .line 6
    iput-object p2, p0, Lsh/h;->h:Lsh/f;

    .line 7
    .line 8
    iput p3, p0, Lsh/h;->i:F

    .line 9
    .line 10
    iput-object p4, p0, Lsh/h;->j:Ls0/d;

    .line 11
    .line 12
    iput p5, p0, Lsh/h;->k:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Li0/h0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lsh/h;->k:I

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
    iget-object v0, p0, Lsh/h;->g:Ly0/o;

    .line 18
    .line 19
    iget-object v1, p0, Lsh/h;->h:Lsh/f;

    .line 20
    .line 21
    iget v2, p0, Lsh/h;->i:F

    .line 22
    .line 23
    iget-object v3, p0, Lsh/h;->j:Ls0/d;

    .line 24
    .line 25
    invoke-static/range {v0 .. v5}, Lsh/s;->a(Ly0/o;Lsh/f;FLs0/d;Li0/h0;I)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    return-object p1
.end method
