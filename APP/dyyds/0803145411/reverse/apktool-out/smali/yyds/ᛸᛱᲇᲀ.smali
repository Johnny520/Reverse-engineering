.class public final synthetic Lyyds/ᛸᛱᲇᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛸᛱᲇᲀ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛸᛱᲇᲀ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, Lyyds/ᛷᲇᛷᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛷᲇᛷᛴ;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    sput-boolean p0, Lyyds/ᛷᲇᛷᛴ;->ᛲᛳᛴᛸ:Z

    .line 13
    .line 14
    sget-object p0, Lyyds/ᛷᲇᛷᛴ;->ᛶᛷᛲᲁ:Landroid/os/Handler;

    .line 15
    .line 16
    sget-object p1, Lyyds/ᛷᲇᛷᛴ;->ᲈᛳᛵᛴ:Lyyds/ᛵᛶᲇᛳ;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lyyds/ᛷᲇᛷᛴ;->ᲁᛶᛴᛸ:Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->clear()V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    sput-object p0, Lyyds/ᛷᲇᛷᛴ;->ᛶᲀᲈᲇ:Lyyds/ᛳᛷᛳᛳ;

    .line 28
    .line 29
    sput-object p0, Lyyds/ᛷᲇᛷᛴ;->ᛲᲀᛵᛷ:Lyyds/ᲇᛲᲇᛵ;

    .line 30
    .line 31
    invoke-static {}, Lyyds/ᛷᲇᛷᛴ;->ᛶᛴᛱᛲ()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_0
    const/4 p0, 0x0

    .line 36
    sput-boolean p0, Lyyds/ᲈᲀᛷᛲ;->ᛱᲈᲁ:Z

    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
