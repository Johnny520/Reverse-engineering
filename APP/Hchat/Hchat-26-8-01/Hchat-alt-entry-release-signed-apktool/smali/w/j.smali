.class public final synthetic Lw/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ly0/o;

.field public final synthetic i:Li2/n0;

.field public final synthetic j:Lfg/l;

.field public final synthetic k:I

.field public final synthetic l:Z

.field public final synthetic m:I

.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ly0/o;Li2/n0;Lfg/l;IZIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/j;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lw/j;->h:Ly0/o;

    .line 7
    .line 8
    iput-object p3, p0, Lw/j;->i:Li2/n0;

    .line 9
    .line 10
    iput-object p4, p0, Lw/j;->j:Lfg/l;

    .line 11
    .line 12
    iput p5, p0, Lw/j;->k:I

    .line 13
    .line 14
    iput-boolean p6, p0, Lw/j;->l:Z

    .line 15
    .line 16
    iput p7, p0, Lw/j;->m:I

    .line 17
    .line 18
    iput p8, p0, Lw/j;->n:I

    .line 19
    .line 20
    iput p9, p0, Lw/j;->o:I

    .line 21
    .line 22
    iput p10, p0, Lw/j;->p:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

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
    iget p1, p0, Lw/j;->o:I

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
    iget-object v0, p0, Lw/j;->g:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lw/j;->h:Ly0/o;

    .line 20
    .line 21
    iget-object v2, p0, Lw/j;->i:Li2/n0;

    .line 22
    .line 23
    iget-object v3, p0, Lw/j;->j:Lfg/l;

    .line 24
    .line 25
    iget v4, p0, Lw/j;->k:I

    .line 26
    .line 27
    iget-boolean v5, p0, Lw/j;->l:Z

    .line 28
    .line 29
    iget v6, p0, Lw/j;->m:I

    .line 30
    .line 31
    iget v7, p0, Lw/j;->n:I

    .line 32
    .line 33
    iget v10, p0, Lw/j;->p:I

    .line 34
    .line 35
    invoke-static/range {v0 .. v10}, Lw/s;->b(Ljava/lang/String;Ly0/o;Li2/n0;Lfg/l;IZIILi0/h0;II)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 39
    .line 40
    return-object p1
.end method
