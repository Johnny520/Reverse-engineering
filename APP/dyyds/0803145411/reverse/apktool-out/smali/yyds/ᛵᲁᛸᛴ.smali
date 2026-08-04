.class public final Lyyds/ᛵᲁᛸᛴ;
.super Lyyds/ᛲᲀᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᛴᛳᛲ:Lyyds/ᛵᲁᛸᛴ;


# instance fields
.field public ᲇᲈᛵᛷ:Lyyds/ᛲᛷᛸᛵ;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lyyds/ᛵᲁᛸᛴ;

    .line 2
    .line 3
    sget v5, Lyyds/ᲇᲇᛲᲇ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    sget v6, Lyyds/ᲇᲇᛲᲇ;->ᲇᲈᛵᛷ:I

    .line 6
    .line 7
    sget-wide v2, Lyyds/ᲇᲇᛲᲇ;->ᛲᛴᛳᛲ:J

    .line 8
    .line 9
    sget-object v4, Lyyds/ᲇᲇᛲᲇ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0}, Lyyds/ᛴᲇᛴᛲ;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lyyds/ᛲᛷᛸᛵ;

    .line 15
    .line 16
    invoke-direct/range {v1 .. v6}, Lyyds/ᛲᛷᛸᛵ;-><init>(JLjava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Lyyds/ᛵᲁᛸᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛲᛷᛸᛵ;

    .line 20
    .line 21
    sput-object v0, Lyyds/ᛵᲁᛸᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲁᛸᛴ;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Dispatchers.Default cannot be closed"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dispatchers.Default"

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛷᲇᛲᛱ(Lyyds/ᲁᛴᛲ;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᲁᛸᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛲᛷᛸᛵ;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p2, p1}, Lyyds/ᛲᛷᛸᛵ;->ᲇᲇᲇᛱ(Ljava/lang/Runnable;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
