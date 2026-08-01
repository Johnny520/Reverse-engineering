.class public final Lq4;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lq4;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lq4;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 9

    .line 1
    iget p1, p0, Lq4;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lq4;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroidx/appcompat/widget/SearchView;

    .line 9
    .line 10
    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/SearchView;->n(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p1, p0, Lq4;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Ljt;

    .line 17
    .line 18
    iget-object v0, p1, Ljt;->e:Lkr;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-gez p3, :cond_1

    .line 22
    .line 23
    iget-object v2, v0, Lkr;->z:Lc4;

    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    move-object v2, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v2, v0, Lkr;->c:Lkh;

    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/widget/AdapterView;->getSelectedItem()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v2, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    :goto_0
    invoke-static {p1, v2}, Ljt;->a(Ljt;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    if-eqz v3, :cond_7

    .line 56
    .line 57
    if-eqz p2, :cond_3

    .line 58
    .line 59
    if-gez p3, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    :goto_1
    move-object v5, p2

    .line 63
    move v6, p3

    .line 64
    move-wide v7, p4

    .line 65
    goto :goto_6

    .line 66
    :cond_3
    :goto_2
    iget-object p1, v0, Lkr;->z:Lc4;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-nez p1, :cond_4

    .line 73
    .line 74
    move-object p2, v1

    .line 75
    goto :goto_3

    .line 76
    :cond_4
    iget-object p1, v0, Lkr;->c:Lkh;

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedView()Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    move-object p2, p1

    .line 83
    :goto_3
    iget-object p1, v0, Lkr;->z:Lc4;

    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-nez p1, :cond_5

    .line 90
    .line 91
    const/4 p1, -0x1

    .line 92
    :goto_4
    move p3, p1

    .line 93
    goto :goto_5

    .line 94
    :cond_5
    iget-object p1, v0, Lkr;->c:Lkh;

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    goto :goto_4

    .line 101
    :goto_5
    iget-object p1, v0, Lkr;->z:Lc4;

    .line 102
    .line 103
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez p1, :cond_6

    .line 108
    .line 109
    const-wide/high16 p4, -0x8000000000000000L

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_6
    iget-object p1, v0, Lkr;->c:Lkh;

    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemId()J

    .line 115
    .line 116
    .line 117
    move-result-wide p4

    .line 118
    goto :goto_1

    .line 119
    :goto_6
    iget-object v4, v0, Lkr;->c:Lkh;

    .line 120
    .line 121
    invoke-interface/range {v3 .. v8}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 122
    .line 123
    .line 124
    :cond_7
    invoke-virtual {v0}, Lkr;->dismiss()V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :pswitch_1
    iget-object p1, p0, Lq4;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p1, Ls4;

    .line 131
    .line 132
    iget-object p4, p1, Ls4;->G:Lv4;

    .line 133
    .line 134
    invoke-virtual {p4, p3}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p4}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    .line 138
    .line 139
    .line 140
    move-result-object p5

    .line 141
    if-eqz p5, :cond_8

    .line 142
    .line 143
    iget-object p5, p1, Ls4;->D:Lp4;

    .line 144
    .line 145
    invoke-virtual {p5, p3}, Lp4;->getItemId(I)J

    .line 146
    .line 147
    .line 148
    move-result-wide v0

    .line 149
    invoke-virtual {p4, p2, p3, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    .line 150
    .line 151
    .line 152
    :cond_8
    invoke-virtual {p1}, Lkr;->dismiss()V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
