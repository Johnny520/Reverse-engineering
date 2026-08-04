.class public final Lyyds/ᛳᲈᛸᛸ;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᲈᲁ:Lyyds/ᲀᲇᛶᲇ;


# direct methods
.method public constructor <init>(Lyyds/ᲀᲇᛶᲇ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛳᲈᛸᛸ;->ᛲᲈᲁ:Lyyds/ᲀᲇᛶᲇ;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onAvailable(Landroid/net/Network;)V
    .locals 1

    .line 1
    new-instance p1, Lyyds/ᛴᛱᛸᛳ;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, Lyyds/ᛴᛱᛸᛳ;-><init>(Lyyds/ᛳᲈᛸᛸ;Z)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lyyds/ᛱᛷᲈᛲ;->ᛲᛳᛶᲁ()Landroid/os/Handler;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 1

    .line 1
    new-instance p1, Lyyds/ᛴᛱᛸᛳ;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p1, p0, v0}, Lyyds/ᛴᛱᛸᛳ;-><init>(Lyyds/ᛳᲈᛸᛸ;Z)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lyyds/ᛱᛷᲈᛲ;->ᛲᛳᛶᲁ()Landroid/os/Handler;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method
