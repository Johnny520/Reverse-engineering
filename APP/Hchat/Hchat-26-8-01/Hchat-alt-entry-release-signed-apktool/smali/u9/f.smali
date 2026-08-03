.class public final synthetic Lu9/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Ljava/util/ArrayList;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lu9/f;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lu9/f;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p3, p0, Lu9/f;->h:Z

    .line 10
    .line 11
    iput-object p1, p0, Lu9/f;->j:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lu9/h;Landroid/view/View;Z)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lu9/f;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu9/f;->i:Ljava/lang/Object;

    iput-object p2, p0, Lu9/f;->j:Ljava/lang/Object;

    iput-boolean p3, p0, Lu9/f;->h:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLfg/a;Lfg/a;)V
    .locals 1

    .line 15
    const/4 v0, 0x2

    iput v0, p0, Lu9/f;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lu9/f;->h:Z

    iput-object p2, p0, Lu9/f;->i:Ljava/lang/Object;

    iput-object p3, p0, Lu9/f;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lu9/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu9/f;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lfg/a;

    .line 9
    .line 10
    iget-object v1, p0, Lu9/f;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lfg/a;

    .line 13
    .line 14
    iget-boolean v2, p0, Lu9/f;->h:Z

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-interface {v1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_0
    iget-object v0, p0, Lu9/f;->i:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ljava/util/ArrayList;

    .line 31
    .line 32
    iget-object v1, p0, Lu9/f;->j:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Li0/a1;

    .line 35
    .line 36
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Leb/c0;

    .line 56
    .line 57
    iget-object v3, v3, Leb/c0;->a:Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    iget-boolean v0, p0, Lu9/f;->h:Z

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Ljava/util/Set;

    .line 72
    .line 73
    invoke-static {v0, v2}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Ljava/util/Set;

    .line 83
    .line 84
    invoke-static {v0, v2}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :goto_2
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :goto_3
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 92
    .line 93
    return-object v0

    .line 94
    :pswitch_1
    iget-object v0, p0, Lu9/f;->i:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lu9/h;

    .line 97
    .line 98
    iget-object v1, p0, Lu9/f;->j:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, Landroid/view/View;

    .line 101
    .line 102
    iget-boolean v2, p0, Lu9/f;->h:Z

    .line 103
    .line 104
    invoke-virtual {v0, v1, v2}, Lu9/h;->a(Landroid/view/View;Z)V

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
