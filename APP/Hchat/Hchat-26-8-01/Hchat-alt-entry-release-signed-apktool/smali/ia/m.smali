.class public final synthetic Lia/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lp8/l;

.field public final synthetic i:Lia/q;

.field public final synthetic j:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(ILandroid/app/Activity;Lia/q;Lp8/l;)V
    .locals 0

    .line 1
    iput p1, p0, Lia/m;->g:I

    .line 2
    .line 3
    iput-object p4, p0, Lia/m;->h:Lp8/l;

    .line 4
    .line 5
    iput-object p3, p0, Lia/m;->i:Lia/q;

    .line 6
    .line 7
    iput-object p2, p0, Lia/m;->j:Landroid/app/Activity;

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
    .locals 5

    .line 1
    iget v0, p0, Lia/m;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lia/m;->i:Lia/q;

    .line 7
    .line 8
    iget-object v1, v0, Lia/q;->a:Lb5/c;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p1, p0, Lia/m;->h:Lp8/l;

    .line 20
    .line 21
    iget-object v2, p1, Lp8/l;->a:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lb5/c;->l(Ljava/lang/String;)Lia/c;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 30
    .line 31
    invoke-virtual {v1, v2, v4}, Lb5/c;->Q(Ljava/lang/String;Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, v0, Lia/q;->b:Lia/a0;

    .line 35
    .line 36
    iget-object v1, p0, Lia/m;->j:Landroid/app/Activity;

    .line 37
    .line 38
    invoke-virtual {v0, v1, p1, v3}, Lia/a0;->a(Landroid/app/Activity;Lp8/l;Lia/c;)V

    .line 39
    .line 40
    .line 41
    const-string p1, "\u5df2\u6062\u590d\u771f\u5b9e\u8bc4\u8bba"

    .line 42
    .line 43
    invoke-static {v1, p1}, Lia/q;->j(Landroid/app/Activity;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    iget-object p1, p0, Lia/m;->h:Lp8/l;

    .line 59
    .line 60
    iget-object v0, p1, Lp8/l;->a:Ljava/lang/String;

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    iget-object v1, p0, Lia/m;->i:Lia/q;

    .line 65
    .line 66
    iget-object v2, v1, Lia/q;->a:Lb5/c;

    .line 67
    .line 68
    invoke-virtual {v2, v0}, Lb5/c;->l(Ljava/lang/String;)Lia/c;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget-object v3, v1, Lia/q;->a:Lb5/c;

    .line 73
    .line 74
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 75
    .line 76
    invoke-virtual {v3, v0, v4}, Lb5/c;->T(Ljava/lang/String;Ljava/util/List;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, v1, Lia/q;->b:Lia/a0;

    .line 80
    .line 81
    iget-object v1, p0, Lia/m;->j:Landroid/app/Activity;

    .line 82
    .line 83
    invoke-virtual {v0, v1, p1, v2}, Lia/a0;->a(Landroid/app/Activity;Lp8/l;Lia/c;)V

    .line 84
    .line 85
    .line 86
    const-string p1, "\u5df2\u6062\u590d\u771f\u5b9e\u70b9\u8d5e"

    .line 87
    .line 88
    invoke-static {v1, p1}, Lia/q;->j(Landroid/app/Activity;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_3
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 92
    .line 93
    return-object p1

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
