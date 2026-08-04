.class public final synthetic Lyyds/ᛳᛴᛷᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Landroid/widget/ImageView;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/ss/android/ugc/awemes/MainActivity;Landroid/widget/ImageView;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᛳᛴᛷᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛳᛴᛷᲁ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛳᛴᛷᲁ;->ᛲᛴᛳᛲ:Landroid/widget/ImageView;

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
    iget p1, p0, Lyyds/ᛳᛴᛷᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛳᛴᛷᲁ;->ᛲᛴᛳᛲ:Landroid/widget/ImageView;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛳᛴᛷᲁ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p1, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛶᛸᲀᲁ(Landroid/widget/ImageView;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    sget-object p1, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛶᛸᲀᲁ(Landroid/widget/ImageView;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    sget-object p1, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛶᛸᲀᲁ(Landroid/widget/ImageView;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
