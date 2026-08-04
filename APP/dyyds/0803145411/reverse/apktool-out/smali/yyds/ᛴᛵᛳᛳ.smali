.class public final synthetic Lyyds/ᛴᛵᛳᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛶᲁᲀ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛶᛷᛵᲀ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛶᛷᛵᲀ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛴᛵᛳᛳ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛴᛵᛳᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛶᛷᛵᲀ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛴᛵᛳᛳ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛴᛵᛳᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛶᛷᛵᲀ;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lyyds/ᛶᛷᛵᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛵᲁᛴ;

    .line 11
    .line 12
    iget-object v0, v0, Lyyds/ᛶᛵᲁᛴ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛶᲁᲀ;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Lyyds/ᲁᛶᲁᲀ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :pswitch_0
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :pswitch_1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
