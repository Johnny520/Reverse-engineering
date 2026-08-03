.class public final synthetic Lsh/i1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ly0/o;

.field public final synthetic h:Lf1/r0;

.field public final synthetic i:J

.field public final synthetic j:J

.field public final synthetic k:F

.field public final synthetic l:Ls0/d;

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Ly0/o;Lf1/r0;JJFLs0/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsh/i1;->g:Ly0/o;

    .line 5
    .line 6
    iput-object p2, p0, Lsh/i1;->h:Lf1/r0;

    .line 7
    .line 8
    iput-wide p3, p0, Lsh/i1;->i:J

    .line 9
    .line 10
    iput-wide p5, p0, Lsh/i1;->j:J

    .line 11
    .line 12
    iput p7, p0, Lsh/i1;->k:F

    .line 13
    .line 14
    iput-object p8, p0, Lsh/i1;->l:Ls0/d;

    .line 15
    .line 16
    iput p9, p0, Lsh/i1;->m:I

    .line 17
    .line 18
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
    iget p1, p0, Lsh/i1;->m:I

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
    iget-object v0, p0, Lsh/i1;->g:Ly0/o;

    .line 18
    .line 19
    iget-object v1, p0, Lsh/i1;->h:Lf1/r0;

    .line 20
    .line 21
    iget-wide v2, p0, Lsh/i1;->i:J

    .line 22
    .line 23
    iget-wide v4, p0, Lsh/i1;->j:J

    .line 24
    .line 25
    iget v6, p0, Lsh/i1;->k:F

    .line 26
    .line 27
    iget-object v7, p0, Lsh/i1;->l:Ls0/d;

    .line 28
    .line 29
    invoke-static/range {v0 .. v9}, Lsh/s;->l(Ly0/o;Lf1/r0;JJFLs0/d;Li0/h0;I)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 33
    .line 34
    return-object p1
.end method
