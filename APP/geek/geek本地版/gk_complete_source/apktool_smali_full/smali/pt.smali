.class public final Lpt;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lk70;)V
    .locals 3

    const/4 v0, 0x2

    iput v0, p0, Lpt;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpt;->c:Ljava/lang/Object;

    .line 3
    new-instance v0, Lc1;

    iget-object v1, p1, Lk70;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object p1, p1, Lk70;->h:Ljava/lang/CharSequence;

    .line 4
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/16 v2, 0x1000

    .line 5
    iput v2, v0, Lc1;->e:I

    .line 6
    iput v2, v0, Lc1;->g:I

    const/4 v2, 0x0

    .line 7
    iput-object v2, v0, Lc1;->l:Landroid/content/res/ColorStateList;

    .line 8
    iput-object v2, v0, Lc1;->m:Landroid/graphics/PorterDuff$Mode;

    const/4 v2, 0x0

    .line 9
    iput-boolean v2, v0, Lc1;->n:Z

    .line 10
    iput-boolean v2, v0, Lc1;->o:Z

    const/16 v2, 0x10

    .line 11
    iput v2, v0, Lc1;->p:I

    .line 12
    iput-object v1, v0, Lc1;->i:Landroid/content/Context;

    .line 13
    iput-object p1, v0, Lc1;->a:Ljava/lang/CharSequence;

    .line 14
    iput-object v0, p0, Lpt;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lut;Lcom/google/android/material/datepicker/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lpt;->a:I

    iput-object p1, p0, Lpt;->c:Ljava/lang/Object;

    iput-object p2, p0, Lpt;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, Lpt;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lpt;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lk70;

    .line 9
    .line 10
    iget-object v0, p1, Lk70;->k:Landroid/view/Window$Callback;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-boolean p1, p1, Lk70;->l:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lpt;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lc1;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :pswitch_0
    iget-object p1, p0, Lpt;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lut;

    .line 30
    .line 31
    iget-object v0, p1, Lut;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lnz;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-virtual {v0}, Lnz;->v()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v0, v1, v2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->K0(IIZ)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    const/4 v0, -0x1

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-static {v0}, Lnz;->F(Landroid/view/View;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    :goto_0
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    iget-object v1, p1, Lut;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 59
    .line 60
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lfz;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Lfz;->a()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-ge v0, v1, :cond_2

    .line 69
    .line 70
    iget-object v1, p0, Lpt;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, Lcom/google/android/material/datepicker/c;

    .line 73
    .line 74
    iget-object v1, v1, Lcom/google/android/material/datepicker/c;->c:Lc8;

    .line 75
    .line 76
    iget-object v1, v1, Lc8;->a:Lzv;

    .line 77
    .line 78
    iget-object v1, v1, Lzv;->a:Ljava/util/Calendar;

    .line 79
    .line 80
    invoke-static {v1}, Lu80;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const/4 v2, 0x2

    .line 85
    invoke-virtual {v1, v2, v0}, Ljava/util/Calendar;->add(II)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Lzv;

    .line 89
    .line 90
    invoke-direct {v0, v1}, Lzv;-><init>(Ljava/util/Calendar;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v0}, Lut;->D(Lzv;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    return-void

    .line 97
    :pswitch_1
    iget-object p1, p0, Lpt;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p1, Lut;

    .line 100
    .line 101
    iget-object v0, p1, Lut;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 102
    .line 103
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lnz;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 108
    .line 109
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    add-int/lit8 v0, v0, -0x1

    .line 114
    .line 115
    if-ltz v0, :cond_3

    .line 116
    .line 117
    iget-object v1, p0, Lpt;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, Lcom/google/android/material/datepicker/c;

    .line 120
    .line 121
    iget-object v1, v1, Lcom/google/android/material/datepicker/c;->c:Lc8;

    .line 122
    .line 123
    iget-object v1, v1, Lc8;->a:Lzv;

    .line 124
    .line 125
    iget-object v1, v1, Lzv;->a:Ljava/util/Calendar;

    .line 126
    .line 127
    invoke-static {v1}, Lu80;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    const/4 v2, 0x2

    .line 132
    invoke-virtual {v1, v2, v0}, Ljava/util/Calendar;->add(II)V

    .line 133
    .line 134
    .line 135
    new-instance v0, Lzv;

    .line 136
    .line 137
    invoke-direct {v0, v1}, Lzv;-><init>(Ljava/util/Calendar;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v0}, Lut;->D(Lzv;)V

    .line 141
    .line 142
    .line 143
    :cond_3
    return-void

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
