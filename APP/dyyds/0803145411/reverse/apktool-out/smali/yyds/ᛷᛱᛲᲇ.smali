.class public final Lyyds/ᛷᛱᛲᲇ;
.super Landroid/database/ContentObserver;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᲈᲁ:Lyyds/ᲀᛳᲁᲈ;


# direct methods
.method public constructor <init>(Lyyds/ᲀᛳᲁᲈ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛷᛱᛲᲇ;->ᛲᲈᲁ:Lyyds/ᲀᛳᲁᲈ;

    .line 2
    .line 3
    new-instance p1, Landroid/os/Handler;

    .line 4
    .line 5
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final deliverSelfNotifications()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final onChange(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛱᛲᲇ;->ᛲᲈᲁ:Lyyds/ᲀᛳᲁᲈ;

    .line 2
    .line 3
    iget-boolean p1, p0, Lyyds/ᛷᛷᛳᛴ;->ᲇᲈᛵᛷ:Z

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lyyds/ᛷᛷᛳᛴ;->ᛲᛴᛳᛲ:Landroid/database/Cursor;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Landroid/database/Cursor;->isClosed()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lyyds/ᛷᛷᛳᛴ;->ᛲᛴᛳᛲ:Landroid/database/Cursor;

    .line 18
    .line 19
    invoke-interface {p1}, Landroid/database/Cursor;->requery()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iput-boolean p1, p0, Lyyds/ᛷᛷᛳᛴ;->ᲀᛲᛳᲀ:Z

    .line 24
    .line 25
    :cond_0
    return-void
.end method
