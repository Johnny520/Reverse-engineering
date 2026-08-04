.class public final Lyyds/ᲇᲈᛱᛷ;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/InputConnection;Landroid/widget/TextView;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p2, v0}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᲇᲈᛱᛷ;->ᛲᲈᲁ:Landroid/widget/TextView;

    .line 6
    .line 7
    sget-object p0, Lyyds/ᛲᛴᛶᛸ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛴᛶᛸ;

    .line 8
    .line 9
    if-eqz p0, :cond_3

    .line 10
    .line 11
    invoke-static {}, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ()Lyyds/ᛲᛴᛶᛸ;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Lyyds/ᛲᛴᛶᛸ;->ᛵᛸᛸᛷ()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    const/4 p3, 0x1

    .line 20
    if-ne p2, p3, :cond_3

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object p2, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 26
    .line 27
    if-nez p2, :cond_1

    .line 28
    .line 29
    new-instance p2, Landroid/os/Bundle;

    .line 30
    .line 31
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p2, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 35
    .line 36
    :cond_1
    iget-object p0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲇᛸᲀᛳ;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object p2, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 42
    .line 43
    iget-object p0, p0, Lyyds/ᲇᛸᲀᛳ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Lyyds/ᛲᛲᲇᲈ;

    .line 46
    .line 47
    iget-object p0, p0, Lyyds/ᛲᛲᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Lyyds/ᲁᲀᛳᛶ;

    .line 50
    .line 51
    const/4 p3, 0x4

    .line 52
    invoke-virtual {p0, p3}, Lyyds/ᛸᲀᛷᲀ;->ᛲᲈᲁ(I)I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    if-eqz p3, :cond_2

    .line 57
    .line 58
    iget-object v1, p0, Lyyds/ᛸᲀᛷᲀ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 61
    .line 62
    iget p0, p0, Lyyds/ᛸᲀᛷᲀ;->ᲀᛲᛳᲀ:I

    .line 63
    .line 64
    add-int/2addr p3, p0

    .line 65
    invoke-virtual {v1, p3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move p0, v0

    .line 71
    :goto_0
    const-string p3, "android.support.text.emoji.emojiCompat_metadataVersion"

    .line 72
    .line 73
    invoke-virtual {p2, p3, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    iget-object p0, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 77
    .line 78
    const-string p1, "android.support.text.emoji.emojiCompat_replaceAll"

    .line 79
    .line 80
    invoke-virtual {p0, p1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    :cond_3
    return-void
.end method


# virtual methods
.method public final deleteSurroundingText(II)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲇᲈᛱᛷ;->ᛲᲈᲁ:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {p0, v0, p1, p2, v1}, Lyyds/ᲀᲈᛶᲈ;->ᛶᛳᛶᛵ(Lyyds/ᲇᲈᛱᛷ;Landroid/text/Editable;IIZ)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingText(II)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return v1

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public final deleteSurroundingTextInCodePoints(II)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲇᲈᛱᛷ;->ᛲᲈᲁ:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-static {p0, v0, p1, p2, v1}, Lyyds/ᲀᲈᛶᲈ;->ᛶᛳᛶᛵ(Lyyds/ᲇᲈᛱᛷ;Landroid/text/Editable;IIZ)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingTextInCodePoints(II)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_1
    :goto_0
    return v1
.end method
