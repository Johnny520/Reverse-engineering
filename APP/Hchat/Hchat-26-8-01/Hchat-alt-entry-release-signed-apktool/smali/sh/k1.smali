.class public final synthetic Lsh/k1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lfg/a;

.field public final synthetic h:Ly0/o;

.field public final synthetic i:Z

.field public final synthetic j:Lf1/r0;

.field public final synthetic k:J

.field public final synthetic l:J

.field public final synthetic m:F

.field public final synthetic n:Lk/y0;

.field public final synthetic o:Ls0/d;

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lfg/a;Ly0/o;ZLf1/r0;JJFLk/y0;Ls0/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsh/k1;->g:Lfg/a;

    .line 5
    .line 6
    iput-object p2, p0, Lsh/k1;->h:Ly0/o;

    .line 7
    .line 8
    iput-boolean p3, p0, Lsh/k1;->i:Z

    .line 9
    .line 10
    iput-object p4, p0, Lsh/k1;->j:Lf1/r0;

    .line 11
    .line 12
    iput-wide p5, p0, Lsh/k1;->k:J

    .line 13
    .line 14
    iput-wide p7, p0, Lsh/k1;->l:J

    .line 15
    .line 16
    iput p9, p0, Lsh/k1;->m:F

    .line 17
    .line 18
    iput-object p10, p0, Lsh/k1;->n:Lk/y0;

    .line 19
    .line 20
    iput-object p11, p0, Lsh/k1;->o:Ls0/d;

    .line 21
    .line 22
    iput p12, p0, Lsh/k1;->p:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object v11, p1

    .line 2
    check-cast v11, Li0/h0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lsh/k1;->p:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Li0/r;->C(I)I

    .line 14
    .line 15
    .line 16
    move-result v12

    .line 17
    iget-object v0, p0, Lsh/k1;->g:Lfg/a;

    .line 18
    .line 19
    iget-object v1, p0, Lsh/k1;->h:Ly0/o;

    .line 20
    .line 21
    iget-boolean v2, p0, Lsh/k1;->i:Z

    .line 22
    .line 23
    iget-object v3, p0, Lsh/k1;->j:Lf1/r0;

    .line 24
    .line 25
    iget-wide v4, p0, Lsh/k1;->k:J

    .line 26
    .line 27
    iget-wide v6, p0, Lsh/k1;->l:J

    .line 28
    .line 29
    iget v8, p0, Lsh/k1;->m:F

    .line 30
    .line 31
    iget-object v9, p0, Lsh/k1;->n:Lk/y0;

    .line 32
    .line 33
    iget-object v10, p0, Lsh/k1;->o:Ls0/d;

    .line 34
    .line 35
    invoke-static/range {v0 .. v12}, Lsh/s;->k(Lfg/a;Ly0/o;ZLf1/r0;JJFLk/y0;Ls0/d;Li0/h0;I)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 39
    .line 40
    return-object p1
.end method
