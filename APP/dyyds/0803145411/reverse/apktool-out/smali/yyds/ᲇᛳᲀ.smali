.class public final synthetic Lyyds/ᲇᛳᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Landroid/widget/LinearLayout;

.field public final synthetic ᲀᛲᛳᲀ:Landroid/widget/LinearLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᲇᛳᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲇᛳᲀ;->ᛵᛸᛸᛷ:Landroid/widget/LinearLayout;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᲇᛳᲀ;->ᲀᛲᛳᲀ:Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 5

    .line 1
    iget p1, p0, Lyyds/ᲇᛳᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, p0, Lyyds/ᲇᛳᲀ;->ᲀᛲᛳᲀ:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᲇᛳᲀ;->ᛵᛸᛸᛷ:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const-wide v3, -0xd375e68a836eL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    move v0, v1

    .line 24
    :cond_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_0
    const-wide v3, -0x9a92e68a836eL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᛳᛵᛶᲀ:Lyyds/ᛳᲀᛲ;

    .line 45
    .line 46
    sget-object v3, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 47
    .line 48
    const/16 v4, 0x4a

    .line 49
    .line 50
    aget-object v3, v3, v4

    .line 51
    .line 52
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {p1, v3, v4}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    if-eqz p2, :cond_1

    .line 60
    .line 61
    move p1, v1

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    move p1, v0

    .line 64
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 65
    .line 66
    .line 67
    if-eqz p2, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move v0, v1

    .line 71
    :goto_1
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛳᛸᛴᛶ()Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_4

    .line 79
    .line 80
    if-eqz p2, :cond_3

    .line 81
    .line 82
    sget-object p0, Lyyds/ᛶᲁᛸᲇ;->ᛲᲈᲁ:Lyyds/ᛶᲁᛸᲇ;

    .line 83
    .line 84
    invoke-static {p0}, Lyyds/ᛶᲁᛸᲇ;->ᲀᛲᛳᲀ(Lyyds/ᛶᲁᛸᲇ;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    sget-object p0, Lyyds/ᛶᲁᛸᲇ;->ᛲᲈᲁ:Lyyds/ᛶᲁᛸᲇ;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-static {}, Lyyds/ᛶᲁᛸᲇ;->ᲇᲈᛵᛷ()V

    .line 94
    .line 95
    .line 96
    invoke-static {p0}, Lyyds/ᛶᲁᛸᲇ;->ᛵᛸᛸᛷ(Lyyds/ᛶᲁᛸᲇ;)V

    .line 97
    .line 98
    .line 99
    :cond_4
    :goto_2
    return-void

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
