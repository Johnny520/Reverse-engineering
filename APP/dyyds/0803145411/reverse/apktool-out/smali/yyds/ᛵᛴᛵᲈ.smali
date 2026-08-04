.class public final Lyyds/ᛵᛴᛵᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᲁᲇᲀᛸ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᲁᲇᲀᛸ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛵᛴᛵᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛵᛴᛵᲈ;->ᲇᲈᛵᛷ:Lyyds/ᲁᲇᲀᛸ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛵᛴᛵᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛵᛴᛵᲈ;->ᲇᲈᛵᛷ:Lyyds/ᲁᲇᲀᛸ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object v1, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getCount()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-le v0, v1, :cond_0

    .line 33
    .line 34
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛳᲁᲁᲇ:I

    .line 41
    .line 42
    if-gt v0, v1, :cond_0

    .line 43
    .line 44
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛳᛴᛸ:Lyyds/ᛴᲈᛷᛷ;

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lyyds/ᲁᲇᲀᛸ;->show()V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void

    .line 54
    :pswitch_0
    iget-object p0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 55
    .line 56
    if-eqz p0, :cond_1

    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    invoke-virtual {p0, v0}, Lyyds/ᲀᛸᛲᛸ;->setListSelectionHidden(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 63
    .line 64
    .line 65
    :cond_1
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
