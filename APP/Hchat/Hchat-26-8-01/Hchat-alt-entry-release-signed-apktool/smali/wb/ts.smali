.class public final synthetic Lwb/ts;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lwb/y2;

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:Lfg/l;

.field public final synthetic n:Lfg/l;

.field public final synthetic o:Lfg/l;

.field public final synthetic p:Lfg/p;

.field public final synthetic q:Lfg/a;

.field public final synthetic r:I


# direct methods
.method public synthetic constructor <init>(Lwb/y2;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/l;Lfg/l;Lfg/p;Lfg/a;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/ts;->g:Lwb/y2;

    .line 5
    .line 6
    iput-boolean p2, p0, Lwb/ts;->h:Z

    .line 7
    .line 8
    iput-object p3, p0, Lwb/ts;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/ts;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/ts;->k:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/ts;->l:Ljava/util/List;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/ts;->m:Lfg/l;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/ts;->n:Lfg/l;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/ts;->o:Lfg/l;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/ts;->p:Lfg/p;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/ts;->q:Lfg/a;

    .line 25
    .line 26
    iput p13, p0, Lwb/ts;->r:I

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v11, p1

    .line 2
    check-cast v11, Li0/h0;

    .line 3
    .line 4
    move-object/from16 p1, p2

    .line 5
    .line 6
    check-cast p1, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const p1, 0x30000001

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Li0/r;->C(I)I

    .line 15
    .line 16
    .line 17
    move-result v12

    .line 18
    iget p1, p0, Lwb/ts;->r:I

    .line 19
    .line 20
    invoke-static {p1}, Li0/r;->C(I)I

    .line 21
    .line 22
    .line 23
    move-result v13

    .line 24
    iget-object v0, p0, Lwb/ts;->g:Lwb/y2;

    .line 25
    .line 26
    iget-boolean v1, p0, Lwb/ts;->h:Z

    .line 27
    .line 28
    iget-object v2, p0, Lwb/ts;->i:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v3, p0, Lwb/ts;->j:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, Lwb/ts;->k:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v5, p0, Lwb/ts;->l:Ljava/util/List;

    .line 35
    .line 36
    iget-object v6, p0, Lwb/ts;->m:Lfg/l;

    .line 37
    .line 38
    iget-object v7, p0, Lwb/ts;->n:Lfg/l;

    .line 39
    .line 40
    iget-object v8, p0, Lwb/ts;->o:Lfg/l;

    .line 41
    .line 42
    iget-object v9, p0, Lwb/ts;->p:Lfg/p;

    .line 43
    .line 44
    iget-object v10, p0, Lwb/ts;->q:Lfg/a;

    .line 45
    .line 46
    invoke-virtual/range {v0 .. v13}, Lwb/y2;->k0(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/l;Lfg/l;Lfg/p;Lfg/a;Li0/h0;II)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 50
    .line 51
    return-object p1
.end method
