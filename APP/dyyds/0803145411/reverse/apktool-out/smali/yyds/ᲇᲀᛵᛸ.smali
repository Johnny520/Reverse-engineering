.class public final Lyyds/ᲇᲀᛵᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᛱᛵᛱᛱ;

.field public final ᛵᛸᛸᛷ:[I

.field public final ᲀᛲᛳᲀ:[Ljava/lang/String;

.field public final ᲇᲈᛵᛷ:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lyyds/ᛱᛵᛱᛱ;[I[Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲇᲀᛵᛸ;->ᛲᲈᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲇᲀᛵᛸ;->ᛵᛸᛸᛷ:[I

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᲇᲀᛵᛸ;->ᲀᛲᛳᲀ:[Ljava/lang/String;

    .line 9
    .line 10
    array-length p1, p2

    .line 11
    array-length p2, p3

    .line 12
    if-ne p1, p2, :cond_2

    .line 13
    .line 14
    array-length p1, p3

    .line 15
    const/4 p2, 0x0

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move p1, p2

    .line 21
    :goto_0
    if-nez p1, :cond_1

    .line 22
    .line 23
    aget-object p1, p3, p2

    .line 24
    .line 25
    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    sget-object p1, Lyyds/ᛶᲁᛲᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲁᛲᛶ;

    .line 31
    .line 32
    :goto_1
    iput-object p1, p0, Lyyds/ᲇᲀᛵᛸ;->ᲇᲈᛵᛷ:Ljava/util/Set;

    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    const-string p0, "Check failed."

    .line 36
    .line 37
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    throw p0
.end method
