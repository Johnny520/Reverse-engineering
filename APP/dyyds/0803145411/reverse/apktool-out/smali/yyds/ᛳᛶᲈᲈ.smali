.class public final Lyyds/ᛳᛶᲈᲈ;
.super Lyyds/ᛲᛶᲀ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:J

.field public final ᲇᲇᲇᛱ:Lyyds/ᲀᲀᛵᲈ;

.field public final ᲇᲈᛵᛷ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLyyds/ᲀᲀᛵᲈ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᛶᲈᲈ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lyyds/ᛳᛶᲈᲈ;->ᛲᛴᛳᛲ:J

    .line 7
    .line 8
    iput-object p4, p0, Lyyds/ᛳᛶᲈᲈ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲀᛵᲈ;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛳᲁᲁᲇ()Lyyds/ᛴᲇᛸ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛶᲈᲈ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲀᛵᲈ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛶᛷᛲᲁ()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lyyds/ᛳᛶᲈᲈ;->ᛲᛴᛳᛲ:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final ᛷᲈᲈᲁ()Lyyds/ᛴᛲᲁᲈ;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Lyyds/ᛳᛶᲈᲈ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    sget-object v1, Lyyds/ᛴᛲᲁᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛱᛳᲈ;

    .line 7
    .line 8
    :try_start_0
    invoke-static {p0}, Lyyds/ᲈᲈᲈᛴ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Lyyds/ᛴᛲᲁᲈ;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-object p0

    .line 13
    :catch_0
    :cond_0
    return-object v0
.end method
