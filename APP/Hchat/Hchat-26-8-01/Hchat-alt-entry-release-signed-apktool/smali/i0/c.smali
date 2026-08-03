.class public final Li0/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 9
    const/4 v0, 0x1

    iput v0, p0, Li0/c;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Li0/c;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Li0/c;->h:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Li0/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object v0, p0, Li0/c;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return-object p1

    .line 21
    :pswitch_0
    check-cast p1, Lf1/i0;

    .line 22
    .line 23
    iget-object p1, p1, Lf1/i0;->a:[F

    .line 24
    .line 25
    iget-object v0, p0, Li0/c;->h:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lv1/t;

    .line 28
    .line 29
    invoke-interface {v0}, Lv1/t;->C()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-static {v0}, Lv1/w;->h(Lv1/t;)Lv1/t;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1, v0, p1}, Lv1/t;->g0(Lv1/t;[F)V

    .line 40
    .line 41
    .line 42
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iget-object v0, p0, Li0/c;->h:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Ls1/a0;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    iput-boolean p1, v0, Ls1/a0;->c:Z

    .line 58
    .line 59
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 60
    .line 61
    return-object p1

    .line 62
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 63
    .line 64
    iget-object p1, p0, Li0/c;->h:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Li0/f;

    .line 67
    .line 68
    invoke-interface {p1}, Li0/f;->cancel()V

    .line 69
    .line 70
    .line 71
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 72
    .line 73
    return-object p1

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
