.class public final Lyyds/ᛵᛶᛸᲀ;
.super Lyyds/ᛸᛴᛵᛶ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲇᲈᛵᛷ:Lyyds/ᛱᛵᲈᲁ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛱᛵᲈᲁ;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lyyds/ᛱᛵᲈᲁ;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lyyds/ᛵᛶᛸᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛵᲈᲁ;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of p0, p1, Lyyds/ᛵᛶᛸᲀ;

    .line 5
    .line 6
    if-nez p0, :cond_1

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0

    .line 10
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 11
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    const p0, 0x42793e16

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "CoroutineName(Room Invalidation Tracker Refresh)"

    .line 2
    .line 3
    return-object p0
.end method
