.class public final synthetic Lfj1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;I)V
    .locals 0

    .line 12
    iput p3, p0, Lfj1;->ε:I

    iput-object p1, p0, Lfj1;->ζ:Landroid/app/Activity;

    iput-object p2, p0, Lfj1;->η:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lfj1;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lfj1;->η:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Lfj1;->ζ:Landroid/app/Activity;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lfj1;->ε:I

    .line 2
    .line 3
    iget-object v1, p0, Lfj1;->η:Ljava/lang/String;

    .line 4
    .line 5
    sget-object v2, Ls62;->α:Ls62;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La80;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v0, Lpf1;->α:Ljava/lang/Object;

    .line 16
    .line 17
    new-instance v8, Lxj0;

    .line 18
    .line 19
    const/16 v0, 0x8

    .line 20
    .line 21
    invoke-direct {v8, p1, v0}, Lxj0;-><init>(La80;I)V

    .line 22
    .line 23
    .line 24
    iget-object v4, p0, Lfj1;->ζ:Landroid/app/Activity;

    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v3, Lxg0;

    .line 30
    .line 31
    iget-object v5, p0, Lfj1;->η:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    invoke-direct/range {v3 .. v8}, Lxg0;-><init>(Landroid/app/Activity;Ljava/lang/String;ZLky1;La80;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    return-object v2

    .line 42
    :pswitch_0
    check-cast p1, La80;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    sget-object v0, Lbv1;->α:Lbv1;

    .line 48
    .line 49
    invoke-static {v1}, Lbv1;->Ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    new-instance v8, Lhu;

    .line 54
    .line 55
    const/16 v0, 0x9

    .line 56
    .line 57
    iget-object v3, p0, Lfj1;->ζ:Landroid/app/Activity;

    .line 58
    .line 59
    invoke-direct {v8, p1, v3, v0}, Lhu;-><init>(La80;Landroid/app/Activity;I)V

    .line 60
    .line 61
    .line 62
    const-string v4, "\u8bbe\u7f6e\u7528\u6237 UID \u9ed1\u540d\u5355"

    .line 63
    .line 64
    const-string v5, "\u6bcf\u884c\u4e00\u4e2a\u6570\u5b57 UID"

    .line 65
    .line 66
    const v7, 0x20001

    .line 67
    .line 68
    .line 69
    invoke-static/range {v3 .. v8}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 70
    .line 71
    .line 72
    return-object v2

    .line 73
    :pswitch_1
    check-cast p1, La80;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    sget-object v0, Lbv1;->α:Lbv1;

    .line 79
    .line 80
    invoke-static {v1}, Lbv1;->Ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    new-instance v8, Lhu;

    .line 85
    .line 86
    const/16 v0, 0x18

    .line 87
    .line 88
    iget-object v3, p0, Lfj1;->ζ:Landroid/app/Activity;

    .line 89
    .line 90
    invoke-direct {v8, p1, v3, v0}, Lhu;-><init>(La80;Landroid/app/Activity;I)V

    .line 91
    .line 92
    .line 93
    const-string v4, "\u8bbe\u7f6e\u5173\u952e\u8bcd\u9ed1\u540d\u5355"

    .line 94
    .line 95
    const-string v5, "\u6bcf\u884c\u4e00\u4e2a\u5173\u952e\u8bcd"

    .line 96
    .line 97
    const v7, 0x20001

    .line 98
    .line 99
    .line 100
    invoke-static/range {v3 .. v8}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 101
    .line 102
    .line 103
    return-object v2

    .line 104
    :pswitch_2
    iget-object p0, p0, Lfj1;->ζ:Landroid/app/Activity;

    .line 105
    .line 106
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 107
    .line 108
    invoke-static {v1, p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->α(Ljava/lang/String;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Ls62;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
