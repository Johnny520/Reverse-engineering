.class public final synthetic Lyyds/ᲁᲁᛷᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᲈᛸᛷᛴ;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛱᛲᛶᲀ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛱᛲᛶᲀ;Lyyds/ᲈᛸᛷᛴ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᲁᲁᛷᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲁᲁᛷᛶ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛲᛶᲀ;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᲁᲁᛷᛶ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛸᛷᛴ;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget p1, p0, Lyyds/ᲁᲁᛷᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᲁᲁᛷᛶ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛸᛷᛴ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᲁᲁᛷᛶ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛲᛶᲀ;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᛱᛲᛶᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛳᲈᛷᲁ;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lyyds/ᛳᲈᛷᲁ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛱᛲᛶᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲈᛷᲁ;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lyyds/ᛳᲈᛷᲁ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
