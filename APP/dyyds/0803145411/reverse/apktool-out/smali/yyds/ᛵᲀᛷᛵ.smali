.class public final Lyyds/ᛵᲀᛷᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲈᲁᛸᲀ;


# instance fields
.field public final ᛲᛴᛳᛲ:Z

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final ᲇᲈᛵᛷ:Landroid/content/ContentResolver;


# direct methods
.method public synthetic constructor <init>(Landroid/content/ContentResolver;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᛵᲀᛷᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛵᲀᛷᛵ;->ᲇᲈᛵᛷ:Landroid/content/ContentResolver;

    .line 4
    .line 5
    iput-boolean p2, p0, Lyyds/ᛵᲀᛷᛵ;->ᛲᛴᛳᛲ:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛲᛲᲈᲈ(Lyyds/ᛳᛷᲀᛴ;)Lyyds/ᛴᛷᛷ;
    .locals 0

    .line 1
    iget p1, p0, Lyyds/ᛵᲀᛷᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lyyds/ᛵᛴᛷᲇ;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Lyyds/ᛵᛴᛷᲇ;-><init>(Lyyds/ᛵᲀᛷᛵ;)V

    .line 9
    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_0
    new-instance p1, Lyyds/ᛵᛴᛷᲇ;

    .line 13
    .line 14
    invoke-direct {p1, p0}, Lyyds/ᛵᛴᛷᲇ;-><init>(Lyyds/ᛵᲀᛷᛵ;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_1
    new-instance p1, Lyyds/ᛵᛴᛷᲇ;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lyyds/ᛵᛴᛷᲇ;-><init>(Lyyds/ᛵᲀᛷᛵ;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
