.class public final synthetic Lyyds/ᛱᲇᲀᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛴᛸᛵᲈ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛴᛸᛵᲈ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛱᲇᲀᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛱᲇᲀᛶ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛸᛵᲈ;

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
    iget v0, p0, Lyyds/ᛱᲇᲀᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛱᲇᲀᛶ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛸᛵᲈ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᛴᛸᛵᲈ;->ᛷᲈᲈᲁ()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-virtual {p0}, Lyyds/ᛴᛸᛵᲈ;->ᛲᲈᲁ()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    iget-object p0, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛳᛶᲁ:Lyyds/ᛳᛴᛲᲀ;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lyyds/ᛳᛴᛲᲀ;->ᛲᛴᛳᛲ()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
