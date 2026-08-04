.class public final Lyyds/ᲁᛱᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Landroid/view/View;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛶᲀᲈᛷ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛶᲀᲈᛷ;Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᲁᛱᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲁᛱᛸ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲀᲈᛷ;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᲁᛱᛸ;->ᛲᛴᛳᛲ:Landroid/view/View;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final ᛲᲈᲁ(IIILjava/lang/CharSequence;)V
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
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᲁᛱᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᲁᛱᛸ;->ᛲᛴᛳᛲ:Landroid/view/View;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᲁᛱᛸ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲀᲈᛷ;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-boolean p0, p0, Lyyds/ᛶᲀᲈᛷ;->ᲀᛲᛳᲀ:Z

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    if-eqz p1, :cond_2

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {v1, p0}, Lyyds/ᛳᛷᲀᛴ;->ᛸᛸᛷᛱ(Landroid/view/View;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    :goto_0
    return-void

    .line 28
    :pswitch_0
    iget-boolean p0, p0, Lyyds/ᛶᲀᲈᛷ;->ᲀᛲᛳᲀ:Z

    .line 29
    .line 30
    if-eqz p0, :cond_3

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_3
    if-eqz p1, :cond_6

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-nez p0, :cond_4

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_4
    invoke-static {p0}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    const/16 v0, 0x8

    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    if-eq p1, v0, :cond_5

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_5
    const/16 p1, 0x10

    .line 61
    .line 62
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    .line 63
    .line 64
    .line 65
    move-result-wide p0

    .line 66
    long-to-int p0, p0

    .line 67
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    :catch_0
    :goto_1
    if-eqz v2, :cond_6

    .line 72
    .line 73
    sget-object p0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᲀᲇᛶᲈ:Lyyds/ᛳᲀᛲ;

    .line 79
    .line 80
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 81
    .line 82
    const/16 v3, 0x4d

    .line 83
    .line 84
    aget-object v0, v0, v3

    .line 85
    .line 86
    invoke-virtual {p1, v0, v2}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛶᛳᛶᛵ()I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    invoke-virtual {v1, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 97
    .line 98
    .line 99
    invoke-static {}, Lyyds/ᛳᛷᲀᛴ;->ᛷᲇᛲᛱ()V

    .line 100
    .line 101
    .line 102
    :cond_6
    :goto_2
    return-void

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲁᛱᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲁᛱᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    return-void
.end method
