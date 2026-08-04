.class public final Lyyds/ᲈᲀᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲈᲁᛸᲀ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final ᲇᲈᛵᛷ:Landroid/content/res/AssetManager;


# direct methods
.method public synthetic constructor <init>(Landroid/content/res/AssetManager;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᲈᲀᛳ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲈᲀᛳ;->ᲇᲈᛵᛷ:Landroid/content/res/AssetManager;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛲᛲᲈᲈ(Lyyds/ᛳᛷᲀᛴ;)Lyyds/ᛴᛷᛷ;
    .locals 2

    .line 1
    iget p1, p0, Lyyds/ᲈᲀᛳ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lyyds/ᲇᛷᛵᛸ;

    .line 7
    .line 8
    iget-object v0, p0, Lyyds/ᲈᲀᛳ;->ᲇᲈᛵᛷ:Landroid/content/res/AssetManager;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p1, v0, v1, p0}, Lyyds/ᲇᛷᛵᛸ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, Lyyds/ᲇᛷᛵᛸ;

    .line 16
    .line 17
    iget-object v0, p0, Lyyds/ᲈᲀᛳ;->ᲇᲈᛵᛷ:Landroid/content/res/AssetManager;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, v0, v1, p0}, Lyyds/ᲇᛷᛵᛸ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
