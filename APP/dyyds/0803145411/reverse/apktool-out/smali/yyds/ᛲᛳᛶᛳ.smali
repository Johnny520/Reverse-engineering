.class public Lyyds/ᛲᛳᛶᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛸᛴ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Lyyds/ᛱᛴᲇᲀ;Lyyds/ᲈᲈᛸᛳ;)Lyyds/ᲈᛸᛷ;
    .locals 0

    .line 1
    iget-object p0, p2, Lyyds/ᲈᲈᛸᛳ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 2
    .line 3
    const-class p2, Ljava/sql/Timestamp;

    .line 4
    .line 5
    if-ne p0, p2, :cond_0

    .line 6
    .line 7
    const-class p0, Ljava/util/Date;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Lyyds/ᛱᛴᲇᲀ;->ᲀᛲᛳᲀ(Ljava/lang/Class;)Lyyds/ᲈᛸᛷ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, Lyyds/ᲁᛳᛱᛵ;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Lyyds/ᲁᛳᛱᛵ;-><init>(Lyyds/ᲈᛸᛷ;)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method
