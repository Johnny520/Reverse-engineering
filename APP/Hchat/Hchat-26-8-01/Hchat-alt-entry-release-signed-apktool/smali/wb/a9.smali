.class public final synthetic Lwb/a9;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Lfg/p;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Lfg/p;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/a9;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/a9;->h:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/a9;->i:Ljava/util/List;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/a9;->j:Lfg/p;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lwb/a9;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/h;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object v0, Lwb/p0;->w3:Ls0/d;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x3

    .line 15
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lwb/ac;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    iget-object v4, p0, Lwb/a9;->h:Ljava/util/List;

    .line 22
    .line 23
    iget-object v5, p0, Lwb/a9;->i:Ljava/util/List;

    .line 24
    .line 25
    iget-object v6, p0, Lwb/a9;->j:Lfg/p;

    .line 26
    .line 27
    invoke-direct {v0, v4, v5, v6, v3}, Lwb/ac;-><init>(Ljava/util/List;Ljava/util/List;Lfg/p;I)V

    .line 28
    .line 29
    .line 30
    new-instance v3, Ls0/d;

    .line 31
    .line 32
    const v4, 0x35932fd3

    .line 33
    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    invoke-direct {v3, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 40
    .line 41
    .line 42
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    sget-object v0, Lwb/p0;->S3:Ls0/d;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    const/4 v2, 0x3

    .line 52
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 53
    .line 54
    .line 55
    new-instance v0, Lwb/ac;

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    iget-object v4, p0, Lwb/a9;->h:Ljava/util/List;

    .line 59
    .line 60
    iget-object v5, p0, Lwb/a9;->i:Ljava/util/List;

    .line 61
    .line 62
    iget-object v6, p0, Lwb/a9;->j:Lfg/p;

    .line 63
    .line 64
    invoke-direct {v0, v4, v5, v6, v3}, Lwb/ac;-><init>(Ljava/util/List;Ljava/util/List;Lfg/p;I)V

    .line 65
    .line 66
    .line 67
    new-instance v3, Ls0/d;

    .line 68
    .line 69
    const v4, 0x957b18c

    .line 70
    .line 71
    .line 72
    const/4 v5, 0x1

    .line 73
    invoke-direct {v3, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 74
    .line 75
    .line 76
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
