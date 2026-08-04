.class public final Lyyds/ᲈᛳᛷᲁ;
.super Lyyds/ᛴᲀᛴᛵ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᲁᛴᛷ;


# instance fields
.field public final ᛶᛷᛲᲁ:Lyyds/ᛴᲈᛱᛷ;


# direct methods
.method public constructor <init>(Lyyds/ᛴᲈᛱᛷ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lyyds/ᛳᲁᛱ;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᛳᛷᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛴᲈᛱᛷ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛲᛲᲈᲈ(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lyyds/ᛴᲀᛴᛵ;->ᲇᲇᲇᛱ:Lyyds/ᛴᲈᛱᛷ;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 p1, 0x0

    .line 7
    :goto_0
    iget-object p0, p0, Lyyds/ᲈᛳᛷᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛴᲈᛱᛷ;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛱᛷ;->ᛱᛳᲇ(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final ᛷᛵᲇᲀ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final ᲀᛲᛳᲀ(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᲀᛴᛵ;->ᲇᲇᲇᛱ:Lyyds/ᛴᲈᛱᛷ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛱᛷ;->ᛳᛸᛴᛶ(Ljava/lang/Throwable;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
