.class public final Lyyds/ᲇᛴᛷᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛴᛱᛱᛸ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛴᛱᛱᛸ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᲇᛴᛷᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲇᛴᛷᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛱᛱᛸ;

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
    iget v0, p0, Lyyds/ᲇᛴᛷᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲇᛴᛷᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛱᛱᛸ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛴᛱᛱᛸ;->ᛱᲀᲈᛲ:Lyyds/ᲇᛵᲈᛵ;

    .line 9
    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0}, Lyyds/ᲇᛵᲈᛵ;->ᛲᲈᲁ(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void

    .line 18
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛴᛱᛱᛸ;->ᛱᲀᲈᛲ:Lyyds/ᲇᛵᲈᛵ;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Lyyds/ᲇᛵᲈᛵ;->ᲀᛲᛳᲀ()V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
