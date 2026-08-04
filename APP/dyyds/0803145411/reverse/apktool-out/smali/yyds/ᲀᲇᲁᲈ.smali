.class public final Lyyds/ᲀᲇᲁᲈ;
.super Lyyds/ᛴᲇᛴᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲇᲈᛵᛷ:Lyyds/ᲀᲇᲁᲈ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᲀᲇᲁᲈ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛴᲇᛴᛲ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᲀᲇᲁᲈ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲇᲁᲈ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛲᛱᲁᛳ(I)Lyyds/ᛴᲇᛴᛲ;
    .locals 1

    .line 1
    invoke-static {p1}, Lyyds/ᛲᛳᲁ;->ᛲᛴᛳᛲ(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Lyyds/ᲇᲇᛲᲇ;->ᲇᲈᛵᛷ:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lyyds/ᛴᲇᛴᛲ;->ᛲᛱᲁᛳ(I)Lyyds/ᛴᲇᛴᛲ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final ᛷᲇᛲᛱ(Lyyds/ᲁᛴᛲ;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    sget-object p0, Lyyds/ᛵᲁᛸᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲁᛸᛴ;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iget-object p0, p0, Lyyds/ᛵᲁᛸᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛲᛷᛸᛵ;

    .line 5
    .line 6
    invoke-virtual {p0, p2, p1}, Lyyds/ᛲᛷᛸᛵ;->ᲇᲇᲇᛱ(Ljava/lang/Runnable;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
