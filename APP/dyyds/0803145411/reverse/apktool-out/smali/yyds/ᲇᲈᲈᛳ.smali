.class public final synthetic Lyyds/ᲇᲈᲈᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᲇᲈᲈᛳ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᲇᲈᲈᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 3

    .line 1
    iget p1, p0, Lyyds/ᲇᲈᲈᛳ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    iget-object p0, p0, Lyyds/ᲇᲈᲈᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lyyds/ᛱᛲᛴᛲ;

    .line 10
    .line 11
    iput v0, p0, Lyyds/ᛱᛲᛴᛲ;->ᛵᛸᛸᛷ:I

    .line 12
    .line 13
    iget-object p0, p0, Lyyds/ᛱᛲᛴᛲ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lyyds/ᛲᲀᛲᲈ;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lyyds/ᛲᲀᛲᲈ;->ᛱᲈᲁ(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :pswitch_0
    check-cast p0, Lyyds/ᛱᛸᛳᛱ;

    .line 24
    .line 25
    iput v0, p0, Lyyds/ᛱᛸᛳᛱ;->ᛲᛳᛴᛸ:I

    .line 26
    .line 27
    iget-object p0, p0, Lyyds/ᛱᛸᛳᛱ;->ᛱᛳᛶᛳ:Lyyds/ᲁᲇᲈᲁ;

    .line 28
    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lyyds/ᲁᲇᲈᲁ;->ᛱᲈᲁ(I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void

    .line 35
    :pswitch_1
    check-cast p0, Lyyds/ᛱᛸᛳᛱ;

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-boolean p1, p0, Lyyds/ᛱᛸᛳᛱ;->ᛶᲀᲈᲇ:Z

    .line 39
    .line 40
    iget-object v0, p0, Lyyds/ᛱᛸᛳᛱ;->ᛶᲈᛴᲈ:Landroid/widget/ImageView;

    .line 41
    .line 42
    const v1, 0x66080174

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lyyds/ᛱᛸᛳᛱ;->ᛵᲀᲈᛴ:Landroid/widget/TextView;

    .line 49
    .line 50
    const-wide v1, -0x75c1e68a836eL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lyyds/ᛱᛸᛳᛱ;->ᛶᛸᲀᲁ:Landroid/widget/SeekBar;

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lyyds/ᛱᛸᛳᛱ;->ᛲᛳᛶᲁ()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
