.class public final synthetic Lwb/im;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lsf/b;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/im;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/im;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/im;->l:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/im;->m:Ljava/lang/Object;

    .line 12
    .line 13
    iput p4, p0, Lwb/im;->h:I

    .line 14
    .line 15
    iput-object p5, p0, Lwb/im;->n:Lsf/b;

    .line 16
    .line 17
    iput p6, p0, Lwb/im;->i:I

    .line 18
    .line 19
    iput p7, p0, Lwb/im;->j:I

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Lwb/y2;Lfb/a1;ILy0/o;Lfg/a;II)V
    .locals 1

    .line 22
    const/4 v0, 0x1

    iput v0, p0, Lwb/im;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/im;->k:Ljava/lang/Object;

    iput-object p2, p0, Lwb/im;->l:Ljava/lang/Object;

    iput p3, p0, Lwb/im;->h:I

    iput-object p4, p0, Lwb/im;->m:Ljava/lang/Object;

    iput-object p5, p0, Lwb/im;->n:Lsf/b;

    iput p6, p0, Lwb/im;->i:I

    iput p7, p0, Lwb/im;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/im;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/im;->k:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lwb/y2;

    .line 10
    .line 11
    iget-object v0, p0, Lwb/im;->l:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Lfb/a1;

    .line 15
    .line 16
    iget-object v0, p0, Lwb/im;->m:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v4, v0

    .line 19
    check-cast v4, Ly0/o;

    .line 20
    .line 21
    iget-object v0, p0, Lwb/im;->n:Lsf/b;

    .line 22
    .line 23
    move-object v5, v0

    .line 24
    check-cast v5, Lfg/a;

    .line 25
    .line 26
    move-object v6, p1

    .line 27
    check-cast v6, Li0/h0;

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget p1, p0, Lwb/im;->i:I

    .line 35
    .line 36
    or-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    invoke-static {p1}, Li0/r;->C(I)I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    iget v3, p0, Lwb/im;->h:I

    .line 43
    .line 44
    iget v8, p0, Lwb/im;->j:I

    .line 45
    .line 46
    invoke-virtual/range {v1 .. v8}, Lwb/y2;->m0(Lfb/a1;ILy0/o;Lfg/a;Li0/h0;II)V

    .line 47
    .line 48
    .line 49
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_0
    iget-object v0, p0, Lwb/im;->k:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v1, v0

    .line 55
    check-cast v1, Ljava/lang/String;

    .line 56
    .line 57
    iget-object v0, p0, Lwb/im;->l:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v2, v0

    .line 60
    check-cast v2, Ljava/lang/String;

    .line 61
    .line 62
    iget-object v0, p0, Lwb/im;->m:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v3, v0

    .line 65
    check-cast v3, Ljava/lang/String;

    .line 66
    .line 67
    iget-object v0, p0, Lwb/im;->n:Lsf/b;

    .line 68
    .line 69
    move-object v5, v0

    .line 70
    check-cast v5, Lfg/l;

    .line 71
    .line 72
    move-object v6, p1

    .line 73
    check-cast v6, Li0/h0;

    .line 74
    .line 75
    check-cast p2, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget p1, p0, Lwb/im;->i:I

    .line 81
    .line 82
    or-int/lit8 p1, p1, 0x1

    .line 83
    .line 84
    invoke-static {p1}, Li0/r;->C(I)I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    iget v4, p0, Lwb/im;->h:I

    .line 89
    .line 90
    iget v8, p0, Lwb/im;->j:I

    .line 91
    .line 92
    invoke-static/range {v1 .. v8}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
