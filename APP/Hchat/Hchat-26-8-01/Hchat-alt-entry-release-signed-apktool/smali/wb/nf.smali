.class public final synthetic Lwb/nf;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ldb/c;

.field public final synthetic i:Lfg/l;

.field public final synthetic j:Lfg/p;

.field public final synthetic k:Lfg/l;

.field public final synthetic l:Z


# direct methods
.method public synthetic constructor <init>(Ldb/c;Lfg/l;Lfg/p;Lfg/l;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/nf;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/nf;->h:Ldb/c;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/nf;->i:Lfg/l;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/nf;->j:Lfg/p;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/nf;->k:Lfg/l;

    .line 14
    .line 15
    iput-boolean p5, p0, Lwb/nf;->l:Z

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Ldb/c;Lfg/l;Lfg/p;Lfg/l;ZI)V
    .locals 0

    .line 18
    const/4 p6, 0x1

    iput p6, p0, Lwb/nf;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/nf;->h:Ldb/c;

    iput-object p2, p0, Lwb/nf;->i:Lfg/l;

    iput-object p3, p0, Lwb/nf;->j:Lfg/p;

    iput-object p4, p0, Lwb/nf;->k:Lfg/l;

    iput-boolean p5, p0, Lwb/nf;->l:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lwb/nf;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v6, p1

    .line 7
    check-cast v6, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    invoke-static {p1}, Li0/r;->C(I)I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    iget-object v1, p0, Lwb/nf;->h:Ldb/c;

    .line 20
    .line 21
    iget-object v2, p0, Lwb/nf;->i:Lfg/l;

    .line 22
    .line 23
    iget-object v3, p0, Lwb/nf;->j:Lfg/p;

    .line 24
    .line 25
    iget-object v4, p0, Lwb/nf;->k:Lfg/l;

    .line 26
    .line 27
    iget-boolean v5, p0, Lwb/nf;->l:Z

    .line 28
    .line 29
    invoke-static/range {v1 .. v7}, Lwb/ho;->j3(Ldb/c;Lfg/l;Lfg/p;Lfg/l;ZLi0/h0;I)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_0
    move-object v5, p1

    .line 36
    check-cast v5, Li0/h0;

    .line 37
    .line 38
    check-cast p2, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    and-int/lit8 p2, p1, 0x3

    .line 45
    .line 46
    const/4 v0, 0x2

    .line 47
    const/4 v1, 0x1

    .line 48
    if-eq p2, v0, :cond_0

    .line 49
    .line 50
    move p2, v1

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 p2, 0x0

    .line 53
    :goto_0
    and-int/2addr p1, v1

    .line 54
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    const/4 v6, 0x0

    .line 61
    iget-object v0, p0, Lwb/nf;->h:Ldb/c;

    .line 62
    .line 63
    iget-object v1, p0, Lwb/nf;->i:Lfg/l;

    .line 64
    .line 65
    iget-object v2, p0, Lwb/nf;->j:Lfg/p;

    .line 66
    .line 67
    iget-object v3, p0, Lwb/nf;->k:Lfg/l;

    .line 68
    .line 69
    iget-boolean v4, p0, Lwb/nf;->l:Z

    .line 70
    .line 71
    invoke-static/range {v0 .. v6}, Lwb/ho;->j3(Ldb/c;Lfg/l;Lfg/p;Lfg/l;ZLi0/h0;I)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 76
    .line 77
    .line 78
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
