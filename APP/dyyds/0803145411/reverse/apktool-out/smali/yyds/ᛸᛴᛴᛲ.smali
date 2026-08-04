.class public final Lyyds/ᛸᛴᛴᛲ;
.super Lyyds/ᛲᲀᛱᛴ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛱᲈᲁ:J

.field public ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

.field public final ᛶᛷᛲᲁ:I

.field public final ᲇᲇᲇᛱ:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;IJ)V
    .locals 1

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    invoke-direct {p0, v0, v0}, Lyyds/ᛲᲀᛱᛴ;-><init>(II)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lyyds/ᛸᛴᛴᛲ;->ᲇᲇᲇᛱ:Landroid/os/Handler;

    .line 7
    .line 8
    iput p2, p0, Lyyds/ᛸᛴᛴᛲ;->ᛶᛷᛲᲁ:I

    .line 9
    .line 10
    iput-wide p3, p0, Lyyds/ᛸᛴᛴᛲ;->ᛱᲈᲁ:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final ᛱᲈᲁ(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lyyds/ᛸᛴᛴᛲ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 3
    .line 4
    return-void
.end method

.method public final ᛲᲈᲁ(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛸᛴᛴᛲ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iget-object v0, p0, Lyyds/ᛸᛴᛴᛲ;->ᲇᲇᲇᛱ:Landroid/os/Handler;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-wide v1, p0, Lyyds/ᛸᛴᛴᛲ;->ᛱᲈᲁ:J

    .line 13
    .line 14
    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method
