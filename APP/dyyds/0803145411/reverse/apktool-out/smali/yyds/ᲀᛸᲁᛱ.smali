.class public final synthetic Lyyds/ᲀᛸᲁᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/PixelCopy$OnPixelCopyFinishedListener;


# instance fields
.field public final synthetic ᛲᲈᲁ:Lyyds/ᲀᛱᛷᲀ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᲀᛱᛷᲀ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲀᛸᲁᛱ;->ᛲᲈᲁ:Lyyds/ᲀᛱᛷᲀ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onPixelCopyFinished(I)V
    .locals 3

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛸᲁᛱ;->ᛲᲈᲁ:Lyyds/ᲀᛱᛷᲀ;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛴᛸ:Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v1, Lyyds/ᛱᲈᛴᛵ;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lyyds/ᛱᲈᛴᛵ;-><init>(Landroid/view/KeyEvent$Callback;II)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method
