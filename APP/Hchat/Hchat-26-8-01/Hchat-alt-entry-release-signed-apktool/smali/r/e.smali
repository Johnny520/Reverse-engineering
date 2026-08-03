.class public final synthetic Lr/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lr/z;


# direct methods
.method public synthetic constructor <init>(Lr/z;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr/e;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lr/e;->h:Lr/z;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lr/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr/e;->h:Lr/z;

    .line 7
    .line 8
    iget-object v1, v0, Lr/z;->j:Lm/r;

    .line 9
    .line 10
    invoke-virtual {v1}, Lm/r;->a()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0}, Lr/z;->j()Lr/p;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget v2, v0, Lr/p;->n:I

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    iget-object v2, v0, Lr/p;->k:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {v2}, Ltf/m;->C1(Ljava/util/List;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lr/q;

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    iget v4, v2, Lr/q;->a:I

    .line 39
    .line 40
    iget v5, v0, Lr/p;->n:I

    .line 41
    .line 42
    sub-int/2addr v5, v3

    .line 43
    if-ge v4, v5, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget v4, v2, Lr/q;->o:I

    .line 47
    .line 48
    iget v2, v2, Lr/q;->p:I

    .line 49
    .line 50
    add-int/2addr v4, v2

    .line 51
    iget v0, v0, Lr/p;->m:I

    .line 52
    .line 53
    add-int/lit8 v0, v0, 0x78

    .line 54
    .line 55
    if-gt v4, v0, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :goto_0
    const/4 v3, 0x0

    .line 59
    :cond_3
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v2, Lsf/e;

    .line 64
    .line 65
    invoke-direct {v2, v1, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object v2

    .line 69
    :pswitch_0
    iget-object v0, p0, Lr/e;->h:Lr/z;

    .line 70
    .line 71
    invoke-virtual {v0}, Lr/z;->j()Lr/p;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget v0, v0, Lr/p;->n:I

    .line 76
    .line 77
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
