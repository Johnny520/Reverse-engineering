.class public final Lrc;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V
    .locals 0

    .line 1
    iput p4, p0, Lrc;->l:I

    .line 2
    .line 3
    iput-object p1, p0, Lrc;->m:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lrc;->n:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lrc;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object v2, p0, Lrc;->n:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Lrc;->m:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lt00;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, Lrc;

    .line 15
    .line 16
    check-cast p0, Lcom/dokar/quickjs/QuickJs;

    .line 17
    .line 18
    check-cast v2, [B

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-direct {v0, p0, v2, p1, v3}, Lrc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lrc;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    new-instance v0, Lrc;

    .line 30
    .line 31
    check-cast p0, Lsc;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-direct {v0, p0, v2, p1, v3}, Lrc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lrc;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lrc;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Lrc;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lrc;->m:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    move-object v2, p0

    .line 14
    check-cast v2, Lcom/dokar/quickjs/QuickJs;

    .line 15
    .line 16
    invoke-static {v2}, Lcom/dokar/quickjs/QuickJs;->access$getContext$p(Lcom/dokar/quickjs/QuickJs;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    invoke-static {v2}, Lcom/dokar/quickjs/QuickJs;->access$getGlobals$p(Lcom/dokar/quickjs/QuickJs;)J

    .line 21
    .line 22
    .line 23
    move-result-wide v5

    .line 24
    move-object v7, v1

    .line 25
    check-cast v7, [B

    .line 26
    .line 27
    invoke-static/range {v2 .. v7}, Lcom/dokar/quickjs/QuickJs;->access$evaluateBytecode(Lcom/dokar/quickjs/QuickJs;JJ[B)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :pswitch_0
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    check-cast p0, Lsc;

    .line 36
    .line 37
    invoke-static {p0}, Lsc;->b(Lsc;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v1}, Lsc;->a(Lsc;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object v0, p0, Lsc;->c:Lid;

    .line 45
    .line 46
    iget-object v0, v0, Lid;->i:Lnx1;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Lsc;->e:Lnx1;

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object p0, La83;->a:La83;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
