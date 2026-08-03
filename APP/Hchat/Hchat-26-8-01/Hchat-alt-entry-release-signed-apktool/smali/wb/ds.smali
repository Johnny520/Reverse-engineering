.class public final synthetic Lwb/ds;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lwb/y2;

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Z

.field public final synthetic k:Lfg/l;

.field public final synthetic l:Lfg/l;

.field public final synthetic m:Lfg/l;

.field public final synthetic n:Lfg/l;

.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(Lwb/y2;Ljava/util/List;ZLfg/l;Lfg/l;Lfg/l;Lfg/l;II)V
    .locals 0

    .line 1
    iput p9, p0, Lwb/ds;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/ds;->h:Lwb/y2;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/ds;->i:Ljava/util/List;

    .line 6
    .line 7
    iput-boolean p3, p0, Lwb/ds;->j:Z

    .line 8
    .line 9
    iput-object p4, p0, Lwb/ds;->k:Lfg/l;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/ds;->l:Lfg/l;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/ds;->m:Lfg/l;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/ds;->n:Lfg/l;

    .line 16
    .line 17
    iput p8, p0, Lwb/ds;->o:I

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lwb/ds;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v8, p1

    .line 7
    check-cast v8, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lwb/ds;->o:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, Li0/r;->C(I)I

    .line 19
    .line 20
    .line 21
    move-result v9

    .line 22
    iget-object v1, p0, Lwb/ds;->h:Lwb/y2;

    .line 23
    .line 24
    iget-object v2, p0, Lwb/ds;->i:Ljava/util/List;

    .line 25
    .line 26
    iget-boolean v3, p0, Lwb/ds;->j:Z

    .line 27
    .line 28
    iget-object v4, p0, Lwb/ds;->k:Lfg/l;

    .line 29
    .line 30
    iget-object v5, p0, Lwb/ds;->l:Lfg/l;

    .line 31
    .line 32
    iget-object v6, p0, Lwb/ds;->m:Lfg/l;

    .line 33
    .line 34
    iget-object v7, p0, Lwb/ds;->n:Lfg/l;

    .line 35
    .line 36
    invoke-virtual/range {v1 .. v9}, Lwb/y2;->i0(Ljava/util/List;ZLfg/l;Lfg/l;Lfg/l;Lfg/l;Li0/h0;I)V

    .line 37
    .line 38
    .line 39
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_0
    move-object v7, p1

    .line 43
    check-cast v7, Li0/h0;

    .line 44
    .line 45
    check-cast p2, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget p1, p0, Lwb/ds;->o:I

    .line 51
    .line 52
    or-int/lit8 p1, p1, 0x1

    .line 53
    .line 54
    invoke-static {p1}, Li0/r;->C(I)I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    iget-object v0, p0, Lwb/ds;->h:Lwb/y2;

    .line 59
    .line 60
    iget-object v1, p0, Lwb/ds;->i:Ljava/util/List;

    .line 61
    .line 62
    iget-boolean v2, p0, Lwb/ds;->j:Z

    .line 63
    .line 64
    iget-object v3, p0, Lwb/ds;->k:Lfg/l;

    .line 65
    .line 66
    iget-object v4, p0, Lwb/ds;->l:Lfg/l;

    .line 67
    .line 68
    iget-object v5, p0, Lwb/ds;->m:Lfg/l;

    .line 69
    .line 70
    iget-object v6, p0, Lwb/ds;->n:Lfg/l;

    .line 71
    .line 72
    invoke-virtual/range {v0 .. v8}, Lwb/y2;->i0(Ljava/util/List;ZLfg/l;Lfg/l;Lfg/l;Lfg/l;Li0/h0;I)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
