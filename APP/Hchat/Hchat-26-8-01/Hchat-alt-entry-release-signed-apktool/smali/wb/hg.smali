.class public final synthetic Lwb/hg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(ILi0/a1;Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/hg;->g:I

    .line 2
    .line 3
    iput p1, p0, Lwb/hg;->h:I

    .line 4
    .line 5
    iput-object p2, p0, Lwb/hg;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/hg;->j:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/hg;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/hg;->i:Li0/a1;

    .line 7
    .line 8
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/util/List;

    .line 13
    .line 14
    invoke-static {v1}, La/a;->b0(Ljava/util/List;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget v2, p0, Lwb/hg;->h:I

    .line 19
    .line 20
    if-ge v2, v1, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v1}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lk9/j;

    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, Lwb/hg;->j:Landroid/content/Context;

    .line 44
    .line 45
    invoke-static {v2, v0, v1}, Lwb/ho;->V0(Landroid/content/Context;Li0/a1;Ljava/util/ArrayList;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_0
    iget v0, p0, Lwb/hg;->h:I

    .line 52
    .line 53
    if-lez v0, :cond_1

    .line 54
    .line 55
    iget-object v1, p0, Lwb/hg;->i:Li0/a1;

    .line 56
    .line 57
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Ljava/util/List;

    .line 62
    .line 63
    invoke-static {v2}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    check-cast v3, Lk9/j;

    .line 72
    .line 73
    add-int/lit8 v0, v0, -0x1

    .line 74
    .line 75
    invoke-virtual {v2, v0, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lwb/hg;->j:Landroid/content/Context;

    .line 79
    .line 80
    invoke-static {v0, v1, v2}, Lwb/ho;->V0(Landroid/content/Context;Li0/a1;Ljava/util/ArrayList;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 84
    .line 85
    return-object v0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
