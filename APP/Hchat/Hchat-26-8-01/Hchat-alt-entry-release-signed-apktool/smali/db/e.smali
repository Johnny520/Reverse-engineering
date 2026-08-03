.class public final synthetic Ldb/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ldb/c;

.field public final synthetic i:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ldb/c;Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ldb/e;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldb/e;->h:Ldb/c;

    .line 8
    .line 9
    iput-object p2, p0, Ldb/e;->i:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Ldb/c;)V
    .locals 1

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Ldb/e;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldb/e;->i:Ljava/util/ArrayList;

    iput-object p2, p0, Ldb/e;->h:Ldb/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ldb/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lfg/q;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ldb/e;->h:Ldb/c;

    .line 12
    .line 13
    iget v1, v0, Ldb/c;->u:I

    .line 14
    .line 15
    iget-object v0, v0, Ldb/c;->f:Ljava/util/List;

    .line 16
    .line 17
    iget-object v2, p0, Ldb/e;->i:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {v1, v2, v0, p1}, La/a;->H(ILjava/util/List;Ljava/util/List;Lfg/q;)Lhb/s;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :pswitch_0
    move-object v5, p1

    .line 25
    check-cast v5, Lfg/q;

    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Ldb/e;->h:Ldb/c;

    .line 31
    .line 32
    iget-object v2, p1, Ldb/c;->f:Ljava/util/List;

    .line 33
    .line 34
    iget v3, p1, Ldb/c;->j:I

    .line 35
    .line 36
    iget v4, p1, Ldb/c;->k:I

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    iget-object v1, p0, Ldb/e;->i:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-static/range {v0 .. v5}, La/a;->G(ILjava/util/List;Ljava/util/List;IILfg/q;)Lhb/s;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
