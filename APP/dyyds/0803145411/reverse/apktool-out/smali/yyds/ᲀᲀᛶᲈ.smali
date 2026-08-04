.class public final Lyyds/ᲀᲀᛶᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛸᲀᛷᛴ;


# instance fields
.field public final ᛲᲈᲁ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lyyds/ᲇᛳᲈᲁ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lyyds/ᲀᲀᛶᲈ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lyyds/ᲀᲀᛶᲈ;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Lyyds/ᲀᲀᛶᲈ;

    .line 12
    .line 13
    iget-object p1, p1, Lyyds/ᲀᲀᛶᲈ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 14
    .line 15
    iget-object p0, p0, Lyyds/ᲀᲀᛶᲈ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᲀᛶᲈ;->ᛲᲈᲁ:Ljava/lang/String;

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
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᲀᛶᲈ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0}, Lyyds/ᲇᛳᲈᲁ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
