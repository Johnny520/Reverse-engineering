.class public final synthetic Lyyds/ᲈᲇᛷᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/PixelCopy$OnPixelCopyFinishedListener;


# instance fields
.field public final synthetic ᛲᲈᲁ:Lyyds/ᲀᛱᛷᲀ;

.field public final synthetic ᛵᛸᛸᛷ:Landroid/view/SurfaceView;

.field public final synthetic ᲀᛲᛳᲀ:Landroid/graphics/Bitmap;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᲀᛱᛷᲀ;Landroid/view/SurfaceView;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᲇᛷᛷ;->ᛲᲈᲁ:Lyyds/ᲀᛱᛷᲀ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲈᲇᛷᛷ;->ᛵᛸᛸᛷ:Landroid/view/SurfaceView;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᲈᲇᛷᛷ;->ᲀᛲᛳᲀ:Landroid/graphics/Bitmap;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onPixelCopyFinished(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᲈᲇᛷᛷ;->ᛲᲈᲁ:Lyyds/ᲀᛱᛷᲀ;

    .line 2
    .line 3
    iget-object v1, v0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛴᛸ:Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v2, Lyyds/ᲇᲇᛸᛵ;

    .line 6
    .line 7
    iget-object v3, p0, Lyyds/ᲈᲇᛷᛷ;->ᛵᛸᛸᛷ:Landroid/view/SurfaceView;

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᲈᲇᛷᛷ;->ᲀᛲᛳᲀ:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    invoke-direct {v2, v0, v3, p1, p0}, Lyyds/ᲇᲇᛸᛵ;-><init>(Lyyds/ᲀᛱᛷᲀ;Landroid/view/SurfaceView;ILandroid/graphics/Bitmap;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method
