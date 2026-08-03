.class public final synthetic Lwb/fl;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lwb/v3;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lwb/v3;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/fl;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/fl;->h:Lwb/v3;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/fl;->i:Li0/a1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/fl;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lwb/fl;->h:Lwb/v3;

    .line 12
    .line 13
    check-cast v0, Lwb/t3;

    .line 14
    .line 15
    iget-object v1, v0, Lwb/t3;->a:Ln9/a;

    .line 16
    .line 17
    new-instance v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Lwb/s0;

    .line 41
    .line 42
    iget-object v3, v3, Lwb/s0;->a:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {v2}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/4 v2, 0x3

    .line 53
    const/4 v3, 0x0

    .line 54
    invoke-static {v1, v3, p1, v2}, Ln9/a;->a(Ln9/a;Ljava/lang/String;Ljava/util/Set;I)Ln9/a;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-boolean v0, v0, Lwb/t3;->b:Z

    .line 59
    .line 60
    new-instance v1, Lwb/s3;

    .line 61
    .line 62
    invoke-direct {v1, p1, v0}, Lwb/s3;-><init>(Ln9/a;Z)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lwb/fl;->i:Li0/a1;

    .line 66
    .line 67
    invoke-interface {p1, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 71
    .line 72
    return-object p1

    .line 73
    :pswitch_0
    check-cast p1, Ln9/a;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance v0, Lwb/t3;

    .line 79
    .line 80
    iget-object v1, p0, Lwb/fl;->h:Lwb/v3;

    .line 81
    .line 82
    check-cast v1, Lwb/s3;

    .line 83
    .line 84
    iget-boolean v1, v1, Lwb/s3;->b:Z

    .line 85
    .line 86
    invoke-direct {v0, p1, v1}, Lwb/t3;-><init>(Ln9/a;Z)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lwb/fl;->i:Li0/a1;

    .line 90
    .line 91
    invoke-interface {p1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
