.class public final Lyyds/ᲀᲇᲇᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᛴᛳᛲ:Lyyds/ᛴᛲᛷᛸ;


# instance fields
.field public final ᛲᲈᲁ:Ljava/lang/Object;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛱᛵᲇᲈ;

.field public final ᲀᛲᛳᲀ:Ljava/lang/String;

.field public volatile ᲇᲈᛵᛷ:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛴᛲᛷᛸ;

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lyyds/ᛴᛲᛷᛸ;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lyyds/ᲀᲇᲇᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛲᛷᛸ;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛱᛵᲇᲈ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lyyds/ᲀᲇᲇᛲ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, Lyyds/ᲀᲇᲇᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p3, p0, Lyyds/ᲀᲇᲇᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛵᲇᲈ;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "Must not be null or empty"

    .line 18
    .line 19
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
.end method

.method public static ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)Lyyds/ᲀᲇᲇᛲ;
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᲀᲇᲇᛲ;

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲀᲇᲇᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛲᛷᛸ;

    .line 4
    .line 5
    invoke-direct {v0, p1, p0, v1}, Lyyds/ᲀᲇᲇᛲ;-><init>(Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛱᛵᲇᲈ;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lyyds/ᲀᲇᲇᛲ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyyds/ᲀᲇᲇᛲ;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲀᲇᲇᛲ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p1, p1, Lyyds/ᲀᲇᲇᛲ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᲇᲇᛲ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Option{key=\'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᲀᲇᲇᛲ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 9
    .line 10
    const-string v1, "\'}"

    .line 11
    .line 12
    invoke-static {v0, p0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛵᲇᲀ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
