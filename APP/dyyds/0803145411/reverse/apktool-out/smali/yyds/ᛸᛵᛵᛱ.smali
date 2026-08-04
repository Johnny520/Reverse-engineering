.class public final Lyyds/ᛸᛵᛵᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic ᛲᲈᲁ:Lyyds/ᲇᛴᲈᛷ;


# direct methods
.method public constructor <init>(Lyyds/ᲇᛴᲈᛷ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛸᛵᛵᛱ;->ᛲᲈᲁ:Lyyds/ᲇᛴᲈᛷ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛸᛵᛵᛱ;->ᛲᲈᲁ:Lyyds/ᲇᛴᲈᛷ;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lyyds/ᛸᛴᛴᛲ;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lyyds/ᲇᛴᲈᛷ;->ᛵᛸᛸᛷ(Lyyds/ᛸᛴᛴᛲ;)V

    .line 13
    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    const/4 v1, 0x2

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Lyyds/ᛸᛴᛴᛲ;

    .line 22
    .line 23
    iget-object p0, p0, Lyyds/ᲇᛴᲈᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛷᛲ;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lyyds/ᲁᛷᛲ;->ᛷᛵᲇᲀ(Lyyds/ᲁᛱᛶᛲ;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return p0
.end method
