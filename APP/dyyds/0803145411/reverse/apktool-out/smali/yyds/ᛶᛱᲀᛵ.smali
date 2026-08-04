.class public final Lyyds/ᛶᛱᲀᛵ;
.super Lyyds/ᛷᛸᛸᲁ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;


# direct methods
.method public synthetic constructor <init>(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛶᛱᲀᛵ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛶᛱᲀᛵ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()V
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛶᛱᲀᛵ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛶᛱᲀᛵ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lyyds/ᛲᛳᛱᛲ;

    .line 9
    .line 10
    iget-object v0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 11
    .line 12
    iget-object v0, v0, Lyyds/ᲁᛷᲇᛸ;->ᲇᲇᲇᛱ:Landroid/view/View;

    .line 13
    .line 14
    check-cast v0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iput v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᲈᛳ:F

    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    check-cast p0, Lyyds/ᛵᛱᲀᛱ;

    .line 24
    .line 25
    iget-object v0, p0, Lyyds/ᛴᛱᛱᛸ;->ᛱᲀᲈᛲ:Lyyds/ᲇᛵᲈᛵ;

    .line 26
    .line 27
    iget-object v0, v0, Lyyds/ᲇᛵᲈᛵ;->ᲀᛲᛳᲀ:Landroid/widget/RelativeLayout;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, Lyyds/ᛵᛱᲀᛱ;->ᲈᛲᛳᛶ:F

    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "#TouchDown: "

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget p0, p0, Lyyds/ᛵᛱᲀᛱ;->ᲈᛲᛳᛶ:F

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛳᛶᛳ(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
