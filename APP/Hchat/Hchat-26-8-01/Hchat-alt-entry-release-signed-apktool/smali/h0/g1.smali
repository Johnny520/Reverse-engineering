.class public final synthetic Lh0/g1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Lfg/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh0/g1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lh0/g1;->h:Lfg/a;

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
    .locals 1

    .line 1
    iget v0, p0, Lh0/g1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Le1/b;

    .line 7
    .line 8
    iget-object p1, p0, Lh0/g1;->h:Lfg/a;

    .line 9
    .line 10
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    check-cast p1, Le1/b;

    .line 17
    .line 18
    iget-object p1, p0, Lh0/g1;->h:Lfg/a;

    .line 19
    .line 20
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 24
    .line 25
    return-object p1

    .line 26
    :pswitch_1
    check-cast p1, Lf1/d0;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lh0/g1;->h:Lfg/a;

    .line 32
    .line 33
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-interface {p1, v0}, Lf1/d0;->q(F)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, v0}, Lf1/d0;->i(F)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_2
    check-cast p1, Lu2/c;

    .line 53
    .line 54
    iget-object p1, p0, Lh0/g1;->h:Lfg/a;

    .line 55
    .line 56
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Le1/b;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
