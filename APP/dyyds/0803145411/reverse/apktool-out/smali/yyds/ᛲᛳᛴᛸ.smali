.class public final Lyyds/ᛲᛳᛴᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/View;Lyyds/ᛸᛶᲇᛴ;)V
    .locals 0

    const/4 p3, 0x1

    iput p3, p0, Lyyds/ᛲᛳᛴᛸ;->ᲀᛲᛳᲀ:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lyyds/ᛲᛳᛴᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᛲᛳᛴᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    return-void
.end method

.method public native constructor <init>(Landroid/view/View;Lyyds/ᛳᛱᛶᛱ;Landroid/content/Context;)V
.end method

.method public constructor <init>(Lyyds/ᛷᲀᲇᲈ;Lyyds/ᛱᛷᛸᲈ;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyyds/ᛲᛳᛴᛸ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᛲᛳᛴᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lyyds/ᛲᛳᛴᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method private final ᛲᛴᛳᛲ(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
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

.method private final ᲇᲇᲇᛱ(IIILjava/lang/CharSequence;)V
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
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛲᛳᛴᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛲᛳᛴᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛲᛳᛴᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/content/Context;

    .line 11
    .line 12
    check-cast v1, Landroid/view/View;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p0, v1, p1}, Lyyds/ᛳᛱᛶᛱ;->ᛱᲈᲁ(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    :cond_0
    const-wide v2, -0x3ba1be68a836eL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :cond_1
    check-cast v1, Landroid/view/View;

    .line 48
    .line 49
    check-cast p0, Landroid/view/View;

    .line 50
    .line 51
    invoke-static {v1, p0, p1}, Lyyds/ᛸᛶᲇᛴ;->ᛶᛷᛲᲁ(Landroid/view/View;Landroid/view/View;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const-wide v0, -0x1829e68a836eL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    sget-object p0, Lyyds/ᛷᛳᛲᛳ;->ᛵᛵᛷᲀ:Lyyds/ᛳᲀᛲ;

    .line 68
    .line 69
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 70
    .line 71
    const/16 v1, 0x44

    .line 72
    .line 73
    aget-object v0, v0, v1

    .line 74
    .line 75
    invoke-virtual {p0, v0, p1}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :pswitch_1
    return-void

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛲᛳᛴᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget p2, p0, Lyyds/ᛲᛳᛴᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    return-void

    .line 7
    :pswitch_1
    iget-object p2, p0, Lyyds/ᛲᛳᛴᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Lyyds/ᛷᲀᲇᲈ;

    .line 10
    .line 11
    iget-object p3, p2, Lyyds/ᛷᲀᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p3, Landroid/widget/TextView;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    const/16 p1, 0x8

    .line 27
    .line 28
    :goto_1
    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lyyds/ᛲᛳᛴᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Lyyds/ᛱᛷᛸᲈ;

    .line 34
    .line 35
    iget-object p0, p0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 36
    .line 37
    if-nez p0, :cond_2

    .line 38
    .line 39
    const-wide p0, -0xd636e68a836eL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    check-cast p0, Lyyds/ᛲᛳᛶᲁ;

    .line 50
    .line 51
    :goto_2
    invoke-static {p2, p0}, Lyyds/ᲀᲀᛸᛱ;->ᛲᛲᲈᲈ(Lyyds/ᛷᲀᲇᲈ;Lyyds/ᛲᛳᛶᲁ;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
