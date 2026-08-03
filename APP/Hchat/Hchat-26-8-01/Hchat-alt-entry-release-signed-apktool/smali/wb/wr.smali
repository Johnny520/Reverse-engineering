.class public final synthetic Lwb/wr;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lwb/y2;

.field public final synthetic h:Lm1/f;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Z

.field public final synthetic k:Z

.field public final synthetic l:Lfg/a;

.field public final synthetic m:I

.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(Lwb/y2;Lm1/f;Ljava/lang/String;ZZLfg/a;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/wr;->g:Lwb/y2;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/wr;->h:Lm1/f;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/wr;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-boolean p4, p0, Lwb/wr;->j:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lwb/wr;->k:Z

    .line 13
    .line 14
    iput-object p6, p0, Lwb/wr;->l:Lfg/a;

    .line 15
    .line 16
    iput p7, p0, Lwb/wr;->m:I

    .line 17
    .line 18
    iput p8, p0, Lwb/wr;->n:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

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
    iget p1, p0, Lwb/wr;->m:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Li0/r;->C(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v0, p0, Lwb/wr;->g:Lwb/y2;

    .line 18
    .line 19
    iget v2, p0, Lwb/wr;->n:I

    .line 20
    .line 21
    iget-object v3, p0, Lwb/wr;->l:Lfg/a;

    .line 22
    .line 23
    iget-object v5, p0, Lwb/wr;->i:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v6, p0, Lwb/wr;->h:Lm1/f;

    .line 26
    .line 27
    iget-boolean v7, p0, Lwb/wr;->j:Z

    .line 28
    .line 29
    iget-boolean v8, p0, Lwb/wr;->k:Z

    .line 30
    .line 31
    invoke-virtual/range {v0 .. v8}, Lwb/y2;->W(IILfg/a;Li0/h0;Ljava/lang/String;Lm1/f;ZZ)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 35
    .line 36
    return-object p1
.end method
