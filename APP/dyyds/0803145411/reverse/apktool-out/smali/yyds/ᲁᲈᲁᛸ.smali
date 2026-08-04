.class public final Lyyds/ᲁᲈᲁᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛵᲀᲀᛱ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛵᲀᲀᛱ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᲁᲈᲁᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲁᲈᲁᛸ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲀᲀᛱ;

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
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᲁᲈᲁᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲁᲈᲁᛸ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲀᲀᛱ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 9
    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lyyds/ᲁᛷᲇᛸ;->ᲇᲇᲇᛱ:Landroid/view/View;

    .line 14
    .line 15
    check-cast v0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lyyds/ᲁᛷᲇᛸ;->ᛲᲈᲁ(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 22
    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lyyds/ᲁᛷᲇᛸ;->ᲀᛲᛳᲀ()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
