.class public final Lyyds/ᛵᛷᛱᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛵᛷᛱᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛵᛷᛱᛶ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final ᛲᲈᲁ(Landroid/text/Editable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final ᛵᛸᛸᛷ(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final ᲀᛲᛳᲀ(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final ᲇᲈᛵᛷ(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛵᛷᛱᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛵᛷᛱᛶ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lyyds/ᛵᛱᲀᛱ;

    .line 10
    .line 11
    iget-boolean v0, p0, Lyyds/ᛵᛱᲀᛱ;->ᛶᛵᲁᲈ:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛵᛱᲀᛱ;->ᲀᛸᲈᲁ()V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-static {p1}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanStart(Landroid/text/Spannable;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, -0x1

    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    .line 28
    invoke-static {p1}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanEnd(Landroid/text/Spannable;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eq v0, v1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    if-nez p1, :cond_2

    .line 36
    .line 37
    const-string p1, ""

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :goto_0
    iput-object p1, p0, Lyyds/ᛵᛱᲀᛱ;->ᲇᛶᲀᲇ:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p0}, Lyyds/ᛵᛱᲀᛱ;->ᲈᛳ()V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lyyds/ᛵᛱᲀᛱ;->ᲈᛳ:Lyyds/ᛶᛷᛲᛴ;

    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    invoke-virtual {p0}, Lyyds/ᛵᛱᲀᛱ;->ᛲᛳᛵᛱ()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p1, Lyyds/ᛶᛷᛲᛴ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 58
    .line 59
    :cond_3
    iget-object p1, p0, Lyyds/ᛵᛱᲀᛱ;->ᲈᛳ:Lyyds/ᛶᛷᛲᛴ;

    .line 60
    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 64
    .line 65
    .line 66
    :cond_4
    iget-object p1, p0, Lyyds/ᛵᛱᲀᛱ;->ᛵᛲᛵᲁ:Lyyds/ᛴᛵᛸᛲ;

    .line 67
    .line 68
    if-eqz p1, :cond_5

    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-virtual {p1, v0}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 72
    .line 73
    .line 74
    :cond_5
    invoke-virtual {p0}, Lyyds/ᛵᛱᲀᛱ;->ᛸᲀᛷᛲ()V

    .line 75
    .line 76
    .line 77
    :goto_1
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛵᛷᛱᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget p2, p0, Lyyds/ᛵᛷᛱᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᛵᛷᛱᛶ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroidx/appcompat/widget/SearchView;

    .line 9
    .line 10
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->ᛵᛶᛲᲀ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 11
    .line 12
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    iput-object p2, p0, Landroidx/appcompat/widget/SearchView;->ᛶᛵᛸᛲ:Ljava/lang/CharSequence;

    .line 17
    .line 18
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    xor-int/lit8 p3, p2, 0x1

    .line 23
    .line 24
    invoke-virtual {p0, p3}, Landroidx/appcompat/widget/SearchView;->ᛳᛸᛴᛶ(Z)V

    .line 25
    .line 26
    .line 27
    iget-boolean p3, p0, Landroidx/appcompat/widget/SearchView;->ᛵᲈᲇᛵ:Z

    .line 28
    .line 29
    const/16 p4, 0x8

    .line 30
    .line 31
    if-eqz p3, :cond_0

    .line 32
    .line 33
    iget-boolean p3, p0, Landroidx/appcompat/widget/SearchView;->ᛷᛴᛴᲁ:Z

    .line 34
    .line 35
    if-nez p3, :cond_0

    .line 36
    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->ᛵᲀᲈᛴ:Landroid/widget/ImageView;

    .line 40
    .line 41
    invoke-virtual {p2, p4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    const/4 p4, 0x0

    .line 45
    :cond_0
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->ᲈᲀᛲᲀ:Landroid/widget/ImageView;

    .line 46
    .line 47
    invoke-virtual {p2, p4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->ᲇᛱᛲ()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->ᲀᛲᛲᲇ()V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    :pswitch_0
    return-void

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
