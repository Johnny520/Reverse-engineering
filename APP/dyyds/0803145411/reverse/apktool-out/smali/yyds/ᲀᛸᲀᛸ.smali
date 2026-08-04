.class public final Lyyds/ᲀᛸᲀᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:F

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛴᛶᛳᛸ;


# direct methods
.method public constructor <init>(Lyyds/ᛴᛶᛳᛸ;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲀᛸᲀᛸ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛶᛳᛸ;

    .line 5
    .line 6
    iput p2, p0, Lyyds/ᲀᛸᲀᛸ;->ᲀᛲᛳᲀ:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲀᛸᲀᛸ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛶᛳᛸ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lyyds/ᛲᛲᛶᛶ;

    .line 6
    .line 7
    iget-object v0, v0, Lyyds/ᛲᛲᛶᛶ;->ᛲᛴᛳᛲ:Lyyds/ᲁᲁᛶᛸ;

    .line 8
    .line 9
    iget v1, v0, Lyyds/ᲁᲁᛶᛸ;->ᛲᲈᲁ:I

    .line 10
    .line 11
    iget p0, p0, Lyyds/ᲀᛸᲀᛸ;->ᲀᛲᛳᲀ:F

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lyyds/ᲁᲁᛶᛸ;->ᛵᛸᛸᛷ:Lyyds/ᲁᲀᛵᛴ;

    .line 17
    .line 18
    iput p0, v0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛳᛶᲁ:F

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_0
    iget-object v0, v0, Lyyds/ᲁᲁᛶᛸ;->ᛵᛸᛸᛷ:Lyyds/ᲁᲀᛵᛴ;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iput p0, v0, Lyyds/ᲁᲀᛵᛴ;->ᛱᲈᲁ:F

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_1
    iget-object v0, v0, Lyyds/ᲁᲁᛶᛸ;->ᛵᛸᛸᛷ:Lyyds/ᲁᲀᛵᛴ;

    .line 37
    .line 38
    iput p0, v0, Lyyds/ᲁᲀᛵᛴ;->ᛱᲈᲁ:F

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
